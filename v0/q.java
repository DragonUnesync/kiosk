package V0;

import N0.b;
import N0.c;
import N0.e;
import java.nio.ByteBuffer;

public final class q extends e {
    public int[] i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f5583j;

    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = this.f5583j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k8 = k(((limit - position) / this.f3238b.f3236d) * this.f3239c.f3236d);
        while (position < limit) {
            for (int i8 : iArr) {
                k8.putShort(byteBuffer.getShort((i8 * 2) + position));
            }
            position += this.f3238b.f3236d;
        }
        byteBuffer.position(limit);
        k8.flip();
    }

    public final b g(b bVar) {
        boolean z;
        boolean z6;
        int[] iArr = this.i;
        if (iArr == null) {
            return b.e;
        }
        if (bVar.f3235c == 2) {
            int length = iArr.length;
            int i8 = bVar.f3234b;
            if (i8 != length) {
                z = true;
            } else {
                z = false;
            }
            int i9 = 0;
            while (i9 < iArr.length) {
                int i10 = iArr[i9];
                if (i10 < i8) {
                    if (i10 != i9) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z |= z6;
                    i9++;
                } else {
                    throw new c(bVar);
                }
            }
            if (z) {
                return new b(bVar.f3233a, iArr.length, 2);
            }
            return b.e;
        }
        throw new c(bVar);
    }

    public final void h() {
        this.f5583j = this.i;
    }

    public final void j() {
        this.f5583j = null;
        this.i = null;
    }
}
