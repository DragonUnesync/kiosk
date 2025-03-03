package M;

import B.B;
import B.C0002c;
import B.C0007h;
import D.C0071z;
import E.f;
import F.e;
import F.h;
import a0.j;
import a0.m;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.bumptech.glide.d;
import g7.C0996d;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import n2.a;
import u0.C1486a;

public final class l implements Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final Object f2772U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public final Surface f2773V;

    /* renamed from: W  reason: collision with root package name */
    public final int f2774W;

    /* renamed from: X  reason: collision with root package name */
    public final Size f2775X;

    /* renamed from: Y  reason: collision with root package name */
    public final float[] f2776Y;

    /* renamed from: Z  reason: collision with root package name */
    public C1486a f2777Z;

    /* renamed from: a0  reason: collision with root package name */
    public e f2778a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2779b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2780c0;

    /* renamed from: d0  reason: collision with root package name */
    public final m f2781d0;

    /* renamed from: e0  reason: collision with root package name */
    public j f2782e0;

    public l(Surface surface, int i, Size size, C0007h hVar, C0007h hVar2) {
        float[] fArr = new float[16];
        this.f2776Y = fArr;
        this.f2779b0 = false;
        this.f2780c0 = false;
        this.f2773V = surface;
        this.f2774W = i;
        this.f2775X = size;
        k(fArr, new float[16], hVar);
        k(new float[16], new float[16], hVar2);
        this.f2781d0 = d.i(new B(8, this));
    }

    public static void k(float[] fArr, float[] fArr2, C0007h hVar) {
        Matrix.setIdentityM(fArr, 0);
        if (hVar != null) {
            C0996d.v(fArr);
            int i = hVar.f254d;
            C0996d.u(fArr, (float) i);
            boolean z = hVar.e;
            if (z) {
                Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
            Size size = hVar.f251a;
            Size e = f.e(size, i);
            float f8 = (float) 0;
            android.graphics.Matrix a8 = f.a(new RectF(f8, f8, (float) size.getWidth(), (float) size.getHeight()), new RectF(f8, f8, (float) e.getWidth(), (float) e.getHeight()), i, z);
            RectF rectF = new RectF(hVar.f252b);
            a8.mapRect(rectF);
            Matrix.translateM(fArr, 0, rectF.left / ((float) e.getWidth()), ((((float) e.getHeight()) - rectF.height()) - rectF.top) / ((float) e.getHeight()), 0.0f);
            Matrix.scaleM(fArr, 0, rectF.width() / ((float) e.getWidth()), rectF.height() / ((float) e.getHeight()), 1.0f);
            Matrix.setIdentityM(fArr2, 0);
            C0996d.v(fArr2);
            C0071z zVar = hVar.f253c;
            if (zVar != null) {
                a.m("Camera has no transform.", zVar.j());
                C0996d.u(fArr2, (float) zVar.a().c());
                if (zVar.f()) {
                    Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                    Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
                }
            }
            Matrix.invertM(fArr2, 0, fArr2, 0);
            Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    public final void close() {
        synchronized (this.f2772U) {
            try {
                if (!this.f2780c0) {
                    this.f2780c0 = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f2782e0.a((Object) null);
    }

    public final Surface l(e eVar, C1486a aVar) {
        boolean z;
        synchronized (this.f2772U) {
            this.f2778a0 = eVar;
            this.f2777Z = aVar;
            z = this.f2779b0;
        }
        if (z) {
            m();
        }
        return this.f2773V;
    }

    public final void m() {
        e eVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f2772U) {
            try {
                if (this.f2778a0 != null) {
                    C1486a aVar = this.f2777Z;
                    if (aVar != null) {
                        if (!this.f2780c0) {
                            atomicReference.set(aVar);
                            eVar = this.f2778a0;
                            this.f2779b0 = false;
                        }
                        eVar = null;
                    }
                }
                this.f2779b0 = true;
                eVar = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (eVar != null) {
            try {
                eVar.execute(new C0002c((Object) this, 12, (Object) atomicReference));
            } catch (RejectedExecutionException e) {
                String G8 = h.G("SurfaceOutputImpl");
                if (h.u(3, G8)) {
                    Log.d(G8, "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }
}
