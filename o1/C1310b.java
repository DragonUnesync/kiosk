package o1;

import P0.r;
import P0.z;
import Q0.g;
import R2.c;
import S0.f;
import T0.C0213e;
import java.nio.ByteBuffer;

/* renamed from: o1.b  reason: case insensitive filesystem */
public final class C1310b extends C0213e {

    /* renamed from: l0  reason: collision with root package name */
    public final f f14138l0 = new f(1);

    /* renamed from: m0  reason: collision with root package name */
    public final r f14139m0 = new r();

    /* renamed from: n0  reason: collision with root package name */
    public C1309a f14140n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f14141o0;

    public C1310b() {
        super(6);
    }

    public final void b(int i, Object obj) {
        if (i == 8) {
            this.f14140n0 = (C1309a) obj;
        }
    }

    public final String i() {
        return "CameraMotionRenderer";
    }

    public final boolean k() {
        return j();
    }

    public final boolean l() {
        return true;
    }

    public final void m() {
        C1309a aVar = this.f14140n0;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void o(long j7, boolean z) {
        this.f14141o0 = Long.MIN_VALUE;
        C1309a aVar = this.f14140n0;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void v(long j7, long j8) {
        boolean z;
        float[] fArr;
        while (!j() && this.f14141o0 < 100000 + j7) {
            f fVar = this.f14138l0;
            fVar.r();
            c cVar = this.f4800W;
            cVar.I();
            if (u(cVar, fVar, 0) == -4 && !fVar.d(4)) {
                long j9 = fVar.f4388a0;
                this.f14141o0 = j9;
                if (j9 < this.f4809f0) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f14140n0 != null && !z) {
                    fVar.v();
                    ByteBuffer byteBuffer = fVar.f4386Y;
                    int i = z.f3748a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        r rVar = this.f14139m0;
                        rVar.F(limit, array);
                        rVar.H(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i8 = 0; i8 < 3; i8++) {
                            fArr2[i8] = Float.intBitsToFloat(rVar.k());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f14140n0.a(this.f14141o0 - this.f4808e0, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final int z(M0.r rVar) {
        if ("application/x-camera-motion".equals(rVar.f3036n)) {
            return g.e(4, 0, 0, 0);
        }
        return g.e(0, 0, 0, 0);
    }
}
