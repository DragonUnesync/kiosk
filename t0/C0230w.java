package T0;

import M0.r;
import android.media.MediaFormat;
import n1.p;
import o1.C1309a;
import o1.k;

/* renamed from: T0.w  reason: case insensitive filesystem */
public final class C0230w implements p, C1309a, Z {

    /* renamed from: U  reason: collision with root package name */
    public p f4906U;

    /* renamed from: V  reason: collision with root package name */
    public C1309a f4907V;

    /* renamed from: W  reason: collision with root package name */
    public p f4908W;

    /* renamed from: X  reason: collision with root package name */
    public C1309a f4909X;

    public final void a(long j7, float[] fArr) {
        C1309a aVar = this.f4909X;
        if (aVar != null) {
            aVar.a(j7, fArr);
        }
        C1309a aVar2 = this.f4907V;
        if (aVar2 != null) {
            aVar2.a(j7, fArr);
        }
    }

    public final void b(int i, Object obj) {
        if (i == 7) {
            this.f4906U = (p) obj;
        } else if (i == 8) {
            this.f4907V = (C1309a) obj;
        } else if (i == 10000) {
            k kVar = (k) obj;
            if (kVar == null) {
                this.f4908W = null;
                this.f4909X = null;
                return;
            }
            this.f4908W = kVar.getVideoFrameMetadataListener();
            this.f4909X = kVar.getCameraMotionListener();
        }
    }

    public final void c(long j7, long j8, r rVar, MediaFormat mediaFormat) {
        p pVar = this.f4908W;
        if (pVar != null) {
            pVar.c(j7, j8, rVar, mediaFormat);
        }
        p pVar2 = this.f4906U;
        if (pVar2 != null) {
            pVar2.c(j7, j8, rVar, mediaFormat);
        }
    }

    public final void d() {
        C1309a aVar = this.f4909X;
        if (aVar != null) {
            aVar.d();
        }
        C1309a aVar2 = this.f4907V;
        if (aVar2 != null) {
            aVar2.d();
        }
    }
}
