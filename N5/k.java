package N5;

import B.C0004e;
import Z1.c;
import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.util.Log;
import androidx.camera.lifecycle.LifecycleCamera;
import de.ozerov.fully.C0664a1;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.I;
import de.ozerov.fully.L;
import de.ozerov.fully.SoundMeterService;
import de.ozerov.fully.TaskProtectorService;
import de.ozerov.fully.Z3;
import de.ozerov.fully.motiondetector.MotionDetectorService;
import de.ozerov.fully.motiondetector.MotionDetectorServiceX;
import de.ozerov.fully.remoteadmin.RemoteAdminService;
import java.lang.ref.WeakReference;
import java.util.Timer;
import n2.a;

public final class k extends L {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3422f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(FullyActivity fullyActivity, Class cls, int i) {
        super(fullyActivity, cls);
        this.f3422f = i;
    }

    public static boolean e(Context context) {
        d4.k kVar = new d4.k(context, 1);
        if (!kVar.c0().booleanValue() || !kVar.D().booleanValue()) {
            return false;
        }
        c cVar = (c) kVar.f9767W;
        if (cVar.n("advancedKioskProtection", true) || kVar.s2() > 0 || cVar.n("screensaverDaydream", false) || !cVar.r("kioskAppBlacklist", "").trim().isEmpty() || !cVar.r("kioskAppWhitelist", "").trim().isEmpty() || C0664a1.a(context) || (kVar.g2().booleanValue() && !kVar.e2().isEmpty())) {
            return true;
        }
        return false;
    }

    public void a() {
        long j7;
        Z3 z32;
        switch (this.f3422f) {
            case 1:
                ((RemoteAdminService) this.f10069d).f10934V.f3865g = this.f10068c;
                return;
            case 2:
                ((SoundMeterService) this.f10069d).a(this.f10068c.f9961z0.w1());
                return;
            case 3:
                TaskProtectorService taskProtectorService = (TaskProtectorService) this.f10069d;
                FullyActivity fullyActivity = this.f10068c;
                if (taskProtectorService.f10364V == null || (z32 = taskProtectorService.f10365W) == null) {
                    synchronized (taskProtectorService) {
                        try {
                            if (taskProtectorService.f10364V != null) {
                                taskProtectorService.a();
                            }
                            taskProtectorService.f10364V = new Timer();
                            Z3 z33 = new Z3(taskProtectorService);
                            taskProtectorService.f10365W = z33;
                            Timer timer = taskProtectorService.f10364V;
                            if (a.y0()) {
                                j7 = 500;
                            } else {
                                j7 = 1000;
                            }
                            timer.schedule(z33, 0, j7);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                } else {
                    z32.f10538Z = z32.f10535W.E().booleanValue();
                }
                Z3 z34 = taskProtectorService.f10365W;
                z34.getClass();
                z34.f10536X = new WeakReference(fullyActivity);
                return;
            default:
                return;
        }
    }

    public void b() {
        switch (this.f3422f) {
            case 0:
                if (!this.f10066a) {
                    super.b();
                    return;
                }
                I i = this.f10069d;
                if (i instanceof MotionDetectorServiceX) {
                    MotionDetectorServiceX motionDetectorServiceX = (MotionDetectorServiceX) i;
                    p pVar = motionDetectorServiceX.f10809V;
                    if (pVar != null) {
                        pVar.e();
                    } else {
                        motionDetectorServiceX.a();
                    }
                }
                I i8 = this.f10069d;
                if (i8 instanceof MotionDetectorService) {
                    MotionDetectorService motionDetectorService = (MotionDetectorService) i8;
                    j jVar = motionDetectorService.f10807V;
                    if (jVar == null) {
                        j jVar2 = new j(motionDetectorService, motionDetectorService.f10808W);
                        motionDetectorService.f10807V = jVar2;
                        jVar2.c();
                        motionDetectorService.f10807V.e();
                        motionDetectorService.f10807V.f3396F = true;
                        return;
                    } else if (jVar.f3409m == 0) {
                        motionDetectorService.f10807V.c();
                        motionDetectorService.f10807V.e();
                        motionDetectorService.f10807V.f3396F = true;
                        return;
                    } else {
                        motionDetectorService.f10807V.c();
                        try {
                            motionDetectorService.f10807V.d();
                            return;
                        } catch (Exception unused) {
                            Log.e("MotionDetectorService", "setCamPreview failed");
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 2:
                if (!this.f10066a) {
                    super.b();
                    return;
                } else {
                    ((SoundMeterService) this.f10069d).a(this.f10068c.f9961z0.w1());
                    return;
                }
            default:
                super.b();
                return;
        }
    }

    public Bitmap d() {
        j jVar;
        Camera.Size size;
        byte[] bArr;
        if (!this.f10066a) {
            return null;
        }
        I i = this.f10069d;
        if (i instanceof MotionDetectorServiceX) {
            p pVar = ((MotionDetectorServiceX) i).f10809V;
            if (pVar == null) {
                return null;
            }
            return a.Y(pVar.f3433D, pVar.f3434E);
        } else if (!(i instanceof MotionDetectorService) || (jVar = ((MotionDetectorService) i).f10807V) == null || jVar.z != 17 || (size = jVar.f3420x) == null || (bArr = jVar.f3421y) == null) {
            return null;
        } else {
            Service service = jVar.f3399a;
            int i8 = size.width;
            int i9 = size.height;
            int i10 = jVar.f3391A;
            RenderScript create = RenderScript.create(service);
            ScriptIntrinsicYuvToRGB create2 = ScriptIntrinsicYuvToRGB.create(create, Element.U8_4(create));
            Allocation createSized = Allocation.createSized(create, Element.U8(create), bArr.length);
            Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap);
            create2.setInput(createSized);
            createSized.copyFrom(bArr);
            create2.forEach(createFromBitmap);
            createFromBitmap.copyTo(createBitmap);
            return a.Y(createBitmap, i10);
        }
    }

    public boolean f() {
        j jVar;
        if (!this.f10066a) {
            return false;
        }
        I i = this.f10069d;
        if (i instanceof MotionDetectorServiceX) {
            p pVar = ((MotionDetectorServiceX) i).f10809V;
            if (pVar == null) {
                return false;
            }
            try {
                LifecycleCamera lifecycleCamera = pVar.f3432C;
                if (lifecycleCamera == null || ((C0004e) lifecycleCamera.f7658W.f1786j0.f846a.b().d()).f233a != 3) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else if (!(i instanceof MotionDetectorService) || (jVar = ((MotionDetectorService) i).f10807V) == null || jVar.f3409m != 2) {
            return false;
        } else {
            return true;
        }
    }
}
