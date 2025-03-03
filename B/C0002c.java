package B;

import A.f;
import A.g;
import D.C0035b0;
import D.C0037c0;
import D.N;
import D.O;
import D.Y;
import F.h;
import G5.a;
import G5.w;
import H3.P;
import M.c;
import M0.V;
import M0.X;
import M3.m;
import N5.p;
import P0.l;
import P0.z;
import P5.C0139b;
import P5.C0144g;
import P5.y;
import R.e;
import T0.C;
import T0.C0214f;
import T0.C0220l;
import T0.C0229v;
import T0.C0231x;
import T0.C0232y;
import T0.F;
import T0.a0;
import T0.c0;
import U.t;
import U0.b;
import U0.d;
import V0.B;
import V0.i;
import V0.j;
import a1.C0413d;
import a6.J;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.view.PreviewView;
import androidx.media3.ui.PlayerView;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.bumptech.glide.manager.q;
import com.samsung.android.knox.EnterpriseDeviceManager;
import d4.k;
import de.ozerov.fully.C0723k0;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.ForegroundService;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.receiver.CrashTestReceiver;
import h1.C1031B;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import u0.C1486a;

/* renamed from: B.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0002c implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f229U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f230V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f231W;

    public /* synthetic */ C0002c(CrashTestReceiver crashTestReceiver, Context context, Context context2) {
        this.f229U = 16;
        this.f230V = crashTestReceiver;
        this.f231W = context;
    }

    private final void a() {
        a0 a0Var = (a0) this.f231W;
        ((F) this.f230V).getClass();
        try {
            synchronized (a0Var) {
            }
            a0Var.f4770a.b(a0Var.f4773d, a0Var.e);
            a0Var.b(true);
        } catch (C0220l e) {
            l.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            a0Var.b(true);
            throw th;
        }
    }

    private final void b() {
        i iVar = (i) this.f230V;
        C0214f fVar = (C0214f) this.f231W;
        iVar.getClass();
        synchronized (fVar) {
        }
        C0229v vVar = iVar.f5528c;
        int i = z.f3748a;
        d dVar = vVar.f4905U.f4958m0;
        dVar.L(dVar.I((C1031B) dVar.f5327X.e), 1013, new b(10));
    }

    public final void run() {
        int i;
        long j7;
        boolean z;
        long j8;
        boolean z6;
        Handler handler;
        String str = null;
        int i8 = 0;
        boolean z8 = true;
        switch (this.f229U) {
            case 0:
                q qVar = (q) this.f230V;
                qVar.getClass();
                ((Y) this.f231W).e(qVar);
                return;
            case 1:
                ((j0) this.f230V).r();
                j0 j0Var = (j0) this.f231W;
                if (j0Var != null) {
                    j0Var.r();
                    return;
                }
                return;
            case 2:
                b0 b0Var = (b0) this.f230V;
                b0Var.getClass();
                ((Y) this.f231W).e(b0Var);
                return;
            case 3:
                ((e0) this.f230V).C((t0) this.f231W);
                return;
            case 4:
                e.s(1, (Context) ((q0) this.f230V).f300V, (String) this.f231W);
                return;
            case 5:
                N n4 = (N) this.f230V;
                String str2 = (String) this.f231W;
                n4.getClass();
                try {
                    n4.e.get();
                    n4.e(N.f821n.decrementAndGet(), N.f820m.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    h.l("DeferrableSurface", "Unexpected surface termination for " + n4 + "\nStack Trace:\n" + str2);
                    synchronized (n4.f822a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{n4, Boolean.valueOf(n4.f824c), Integer.valueOf(n4.f823b)}), e);
                    }
                }
            case 6:
                ((androidx.lifecycle.z) ((A1.d) this.f230V).f35V).i((C0035b0) this.f231W);
                return;
            case 7:
                C0035b0 b0Var2 = (C0035b0) this.f230V;
                if (b0Var2.f885a.get()) {
                    C0037c0 c0Var = (C0037c0) this.f231W;
                    c0Var.getClass();
                    b0Var2.f886b.H(c0Var.f891a);
                    return;
                }
                return;
            case 8:
                G5.i iVar = (G5.i) ((f) this.f230V).f17V;
                boolean z9 = iVar.f1700d;
                a aVar = (a) this.f231W;
                Activity activity = iVar.f1697a;
                if (z9) {
                    w wVar = aVar.f1659b;
                    G5.q qVar2 = wVar.f1737a;
                    Rect rect = new Rect(0, 0, qVar2.f1721b, qVar2.f1722c);
                    YuvImage yuvImage = new YuvImage(qVar2.f1720a, wVar.f1738b, qVar2.f1721b, qVar2.f1722c, (int[]) null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    int i9 = wVar.f1739c;
                    if (i9 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate((float) i9);
                        decodeByteArray = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                    }
                    try {
                        File createTempFile = File.createTempFile("barcodeimage", ".jpg", activity.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        str = createTempFile.getAbsolutePath();
                    } catch (IOException e8) {
                        Log.w("i", "Unable to create temporary file and store bitmap! " + e8);
                    }
                }
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.addFlags(524288);
                intent.putExtra("SCAN_RESULT", aVar.f1658a.f3149a);
                M3.l lVar = aVar.f1658a;
                intent.putExtra("SCAN_RESULT_FORMAT", lVar.f3152d.toString());
                byte[] bArr = lVar.f3150b;
                if (bArr != null && bArr.length > 0) {
                    intent.putExtra("SCAN_RESULT_BYTES", bArr);
                }
                EnumMap enumMap = lVar.e;
                if (enumMap != null) {
                    m mVar = m.f3159a0;
                    if (enumMap.containsKey(mVar)) {
                        intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", enumMap.get(mVar).toString());
                    }
                    Number number = (Number) enumMap.get(m.f3153U);
                    if (number != null) {
                        intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                    }
                    String str3 = (String) enumMap.get(m.f3155W);
                    if (str3 != null) {
                        intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str3);
                    }
                    Iterable<byte[]> iterable = (Iterable) enumMap.get(m.f3154V);
                    if (iterable != null) {
                        for (byte[] putExtra : iterable) {
                            intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i8, putExtra);
                            i8++;
                        }
                    }
                }
                if (str != null) {
                    intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
                }
                activity.setResult(-1, intent);
                iVar.a();
                return;
            case 9:
                H4.f fVar = (H4.f) this.f230V;
                T5.Y y8 = (T5.Y) this.f231W;
                if (fVar.c(y8)) {
                    fVar.f2158X.accept(y8.channel(), new J(N.e.z(new StringBuilder("handshake timed out after "), fVar.f2156V, "ms")));
                    return;
                }
                return;
            case 10:
                c cVar = (c) this.f230V;
                F.e eVar = cVar.f2721W;
                M.l lVar2 = (M.l) this.f231W;
                Surface l8 = lVar2.l(eVar, new H.d(cVar, 1, lVar2));
                cVar.f2719U.g(l8);
                cVar.f2726b0.put(lVar2, l8);
                return;
            case 11:
                c cVar2 = (c) this.f230V;
                cVar2.f2727c0++;
                M.e eVar2 = cVar2.f2719U;
                O.i.d(eVar2.f2732a, true);
                O.i.c(eVar2.f2734c);
                SurfaceTexture surfaceTexture = new SurfaceTexture(eVar2.f2742m);
                t0 t0Var = (t0) this.f231W;
                Size size = t0Var.f307b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                g gVar = new g(cVar2, 5, t0Var);
                F.e eVar3 = cVar2.f2721W;
                t0Var.b(eVar3, gVar);
                t0Var.a(surface, eVar3, new M.b(cVar2, t0Var, surfaceTexture, surface));
                surfaceTexture.setOnFrameAvailableListener(cVar2, cVar2.f2722X);
                return;
            case 12:
                M.l lVar3 = (M.l) this.f230V;
                lVar3.getClass();
                ((C1486a) ((AtomicReference) this.f231W).get()).accept(new C0008i(lVar3));
                return;
            case 13:
                N.f fVar2 = (N.f) this.f230V;
                fVar2.f3216Y++;
                t0 t0Var2 = (t0) this.f231W;
                N.c cVar3 = fVar2.f3212U;
                O.i.d(cVar3.f2732a, true);
                O.i.c(cVar3.f2734c);
                boolean z10 = t0Var2.e;
                if (z10) {
                    i = cVar3.f3205n;
                } else {
                    i = cVar3.f3206o;
                }
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(i);
                Size size2 = t0Var2.f307b;
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                Surface surface2 = new Surface(surfaceTexture2);
                t0Var2.a(surface2, fVar2.f3214W, new N.d(fVar2, surfaceTexture2, surface2));
                if (z10) {
                    fVar2.f3220c0 = surfaceTexture2;
                    return;
                }
                fVar2.f3221d0 = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(fVar2, fVar2.f3215X);
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                N.f fVar3 = (N.f) this.f230V;
                F.e eVar4 = fVar3.f3214W;
                M.l lVar4 = (M.l) this.f231W;
                Surface l9 = lVar4.l(eVar4, new H.d(fVar3, 2, lVar4));
                fVar3.f3212U.g(l9);
                fVar3.f3219b0.put(lVar4, l9);
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                p pVar = (p) this.f230V;
                pVar.getClass();
                Log.i("p", "Restart the camera after 10 seconds in " + N.e.L(((C0004e) this.f231W).f233a) + " state");
                pVar.a();
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                Context context = (Context) this.f231W;
                boolean z11 = CrashTestReceiver.f10932a;
                ((CrashTestReceiver) this.f230V).getClass();
                k kVar = new k(context, 1);
                if (kVar.P1().booleanValue() && ((Z1.c) kVar.f9767W).n("isRunning", false) && !CrashTestReceiver.f10932a) {
                    Class<ForegroundService> cls = ForegroundService.class;
                    if (!C0794w0.i0(context, cls) || CrashTestReceiver.f10933b >= 6) {
                        Log.i("CrashTestReceiver", "Restarting app after termination, foreground service running: " + C0794w0.i0(context, cls));
                        U.d.h(context, "Uncaught Crash", 0);
                    } else {
                        Log.i("CrashTestReceiver", "Not going to restart the app as ForegroundService alive (" + CrashTestReceiver.f10933b + ")");
                        CrashTestReceiver.f10933b = CrashTestReceiver.f10933b + 1;
                    }
                }
                CrashTestReceiver.a(context);
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                ((l1.f) this.f231W).a(((P0.q) this.f230V).k());
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                C0144g gVar2 = (C0144g) this.f230V;
                B3.q qVar3 = gVar2.f3879b.f9931T0;
                qVar3.getClass();
                qVar3.P(new ByteArrayInputStream(((String) this.f231W).getBytes()), "config.json", 4);
                gVar2.f3879b.f9952o1.b();
                gVar2.f3879b.f9951n1.getClass();
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                FullyActivity fullyActivity = ((C0139b) this.f230V).f3879b;
                C0723k0 k0Var = new C0723k0();
                k0Var.f10766b = (String) this.f231W;
                k0Var.execute(new Void[0]);
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                y yVar = (y) this.f230V;
                B3.q qVar4 = yVar.f3879b.f9931T0;
                File file = (File) this.f231W;
                qVar4.O(file, 36);
                yVar.f3879b.f9952o1.b();
                yVar.f3879b.f9951n1.getClass();
                file.delete();
                return;
            case 21:
                C0232y yVar2 = (C0232y) this.f230V;
                C c8 = (C) this.f231W;
                int i10 = yVar2.f4914C0 - c8.f4609b;
                yVar2.f4914C0 = i10;
                if (c8.f4611d) {
                    yVar2.f4915D0 = c8.e;
                    yVar2.f4916E0 = true;
                }
                if (i10 == 0) {
                    X x8 = ((T0.X) c8.f4612f).f4749a;
                    if (!yVar2.f4945b1.f4749a.p() && x8.p()) {
                        yVar2.f4947c1 = -1;
                        yVar2.f4949d1 = 0;
                    }
                    if (!x8.p()) {
                        List asList = Arrays.asList(((c0) x8).f4789h);
                        if (asList.size() == yVar2.f4955j0.size()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        l.j(z6);
                        for (int i11 = 0; i11 < asList.size(); i11++) {
                            ((C0231x) yVar2.f4955j0.get(i11)).f4911b = (X) asList.get(i11);
                        }
                    }
                    if (yVar2.f4916E0) {
                        if (((T0.X) c8.f4612f).f4750b.equals(yVar2.f4945b1.f4750b) && ((T0.X) c8.f4612f).f4752d == yVar2.f4945b1.f4765s) {
                            z8 = false;
                        }
                        if (z8) {
                            if (x8.p() || ((T0.X) c8.f4612f).f4750b.b()) {
                                j8 = ((T0.X) c8.f4612f).f4752d;
                            } else {
                                T0.X x9 = (T0.X) c8.f4612f;
                                C1031B b8 = x9.f4750b;
                                long j9 = x9.f4752d;
                                Object obj = b8.f12277a;
                                V v4 = yVar2.f4954i0;
                                x8.g(obj, v4);
                                j8 = j9 + v4.e;
                            }
                            z = z8;
                            j7 = j8;
                        } else {
                            j7 = -9223372036854775807L;
                            z = z8;
                        }
                    } else {
                        j7 = -9223372036854775807L;
                        z = false;
                    }
                    yVar2.f4916E0 = false;
                    yVar2.W((T0.X) c8.f4612f, 1, z, yVar2.f4915D0, j7, -1, false);
                    return;
                }
                return;
            case 22:
                a();
                return;
            case 23:
                ((PreviewView) ((P) this.f230V).f2027U).f7688i0.C((t0) this.f231W);
                return;
            case 24:
                t tVar = (t) this.f230V;
                t0 t0Var3 = tVar.f5310h;
                if (t0Var3 != null && t0Var3 == ((t0) this.f231W)) {
                    tVar.f5310h = null;
                    tVar.f5309g = null;
                }
                O o2 = tVar.f5313l;
                if (o2 != null) {
                    o2.a();
                    tVar.f5313l = null;
                    return;
                }
                return;
            case 25:
                b();
                return;
            case 26:
                j jVar = (j) this.f231W;
                i iVar2 = ((B) ((P) this.f230V).f2027U).f5482x1;
                Handler handler2 = iVar2.f5527b;
                if (handler2 != null) {
                    handler2.post(new V0.h(iVar2, (Object) jVar, 2));
                    return;
                }
                return;
            case 27:
                PlayerView.a((PlayerView) this.f230V, (Bitmap) this.f231W);
                return;
            case 28:
                ((C0413d) ((Z0.k) ((Z0.q) this.f230V).f6900W.f2027U).f6834V.f7046X.get(((Z0.j) this.f231W).f6814g0)).c(true);
                return;
            default:
                ((ProfileInstallerInitializer) this.f230V).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Z1.i.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new Z1.f((Context) this.f231W, 0), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
        }
    }

    public /* synthetic */ C0002c(Object obj, int i, Object obj2) {
        this.f229U = i;
        this.f230V = obj;
        this.f231W = obj2;
    }
}
