package c1;

import O7.b;
import P0.l;
import S0.f;
import java.nio.ByteBuffer;

public final class g extends f {

    /* renamed from: d0  reason: collision with root package name */
    public long f8790d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f8791e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f8792f0;

    public final void r() {
        super.r();
        this.f8791e0 = 0;
    }

    public final boolean w(f fVar) {
        ByteBuffer byteBuffer;
        l.d(!fVar.d(b.MAX_POW2));
        l.d(!fVar.d(268435456));
        l.d(!fVar.d(4));
        if (x()) {
            if (this.f8791e0 >= this.f8792f0) {
                return false;
            }
            ByteBuffer byteBuffer2 = fVar.f4386Y;
            if (!(byteBuffer2 == null || (byteBuffer = this.f4386Y) == null)) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f8791e0;
        this.f8791e0 = i + 1;
        if (i == 0) {
            this.f4388a0 = fVar.f4388a0;
            if (fVar.d(1)) {
                this.f4018V = 1;
            }
        }
        ByteBuffer byteBuffer3 = fVar.f4386Y;
        if (byteBuffer3 != null) {
            u(byteBuffer3.remaining());
            this.f4386Y.put(byteBuffer3);
        }
        this.f8790d0 = fVar.f4388a0;
        return true;
    }

    public final boolean x() {
        if (this.f8791e0 > 0) {
            return true;
        }
        return false;
    }
}
