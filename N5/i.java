package N5;

import A3.c;
import android.app.Service;
import android.content.Intent;
import android.media.FaceDetector;
import android.util.Log;
import android.widget.TextView;
import de.ozerov.fully.C0767r3;
import java.util.Iterator;

public final class i extends Thread {

    /* renamed from: U  reason: collision with root package name */
    public final byte[] f3382U;

    /* renamed from: V  reason: collision with root package name */
    public final int f3383V;

    /* renamed from: W  reason: collision with root package name */
    public final int f3384W;

    /* renamed from: X  reason: collision with root package name */
    public final int f3385X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f3386Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Service f3387Z;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f3388a0;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ j f3389b0;

    public i(j jVar, Service service, byte[] bArr, int i, int i8, int i9, int i10, boolean z) {
        this.f3389b0 = jVar;
        this.f3382U = bArr;
        this.f3383V = i;
        this.f3384W = i8;
        this.f3385X = i9;
        this.f3386Y = i10;
        this.f3387Z = service;
        this.f3388a0 = z;
    }

    public final void run() {
        j jVar;
        System.currentTimeMillis();
        if (this.f3382U != null && this.f3389b0.f3410n.compareAndSet(false, true)) {
            try {
                this.f3389b0.f3392B.n(this.f3382U, this.f3383V, this.f3384W);
                if (this.f3389b0.f3407k) {
                    j jVar2 = this.f3389b0;
                    if (System.currentTimeMillis() - this.f3389b0.f3415s > ((long) jVar2.f3403f) || jVar2.f3415s == 0) {
                        this.f3389b0.f3415s = System.currentTimeMillis();
                        j jVar3 = this.f3389b0;
                        Iterator it = j.b(this.f3382U, this.f3383V, this.f3384W, jVar3.z, jVar3.f3391A).iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            FaceDetector.Face face = (FaceDetector.Face) it.next();
                            face.confidence();
                            if (face.confidence() >= ((float) this.f3389b0.f3404g) / 100.0f) {
                                i++;
                            }
                        }
                        if (i != this.f3389b0.f3394D) {
                            this.f3389b0.f3394D = i;
                            j jVar4 = this.f3389b0;
                            if (jVar4.f3405h) {
                                TextView textView = (TextView) ((C0767r3) jVar4.f3393C.f4337W).f10915c.findViewById(2131362081);
                                textView.post(new c(i, 7, (Object) textView));
                            }
                            try {
                                Intent intent = new Intent();
                                intent.setAction("com.fullykiosk.singleapp.action.faces_detected");
                                intent.putExtra("number", i);
                                L0.c.a(this.f3387Z).c(intent);
                            } catch (Exception unused) {
                                Log.e("j", "Failed broadcasting faces intent");
                            }
                        }
                        j jVar5 = this.f3389b0;
                        if (jVar5.f3408l && i > 0) {
                            jVar5.f3411o.set(0);
                            j.a(this.f3389b0, "faces");
                        }
                    }
                }
                int i8 = this.f3386Y;
                if (i8 <= 0 || !this.f3389b0.f3392B.c(i8) || this.f3388a0) {
                    j jVar6 = this.f3389b0;
                    if (!jVar6.f3407k || !jVar6.f3408l) {
                        jVar6.f3411o.set(0);
                        if (this.f3389b0.f3392B.d(this.f3385X) && !this.f3388a0) {
                            j.a(this.f3389b0, "visual");
                        }
                    }
                } else if (this.f3389b0.f3411o.incrementAndGet() == 10) {
                    try {
                        Intent intent2 = new Intent();
                        intent2.setAction("com.fullykiosk.singleapp.action.darkness_detected");
                        L0.c.a(this.f3387Z).c(intent2);
                    } catch (Exception unused2) {
                        Log.e("j", "Failed broadcasting darkness intent");
                    }
                }
                System.currentTimeMillis();
                jVar = this.f3389b0;
            } catch (Exception e) {
                e.printStackTrace();
                jVar = this.f3389b0;
            } catch (Throwable th) {
                this.f3389b0.f3410n.set(false);
                throw th;
            }
            jVar.f3410n.set(false);
            this.f3389b0.f3410n.set(false);
        }
    }
}
