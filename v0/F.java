package V0;

import N0.b;
import N0.c;
import N0.e;
import P0.z;
import java.nio.ByteBuffer;

public final class F extends e {
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f5502j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5503k;

    /* renamed from: l  reason: collision with root package name */
    public int f5504l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f5505m;

    /* renamed from: n  reason: collision with root package name */
    public int f5506n;

    /* renamed from: o  reason: collision with root package name */
    public long f5507o;

    public final ByteBuffer b() {
        int i8;
        if (super.d() && (i8 = this.f5506n) > 0) {
            k(i8).put(this.f5505m, 0, this.f5506n).flip();
            this.f5506n = 0;
        }
        return super.b();
    }

    public final boolean d() {
        if (!super.d() || this.f5506n != 0) {
            return false;
        }
        return true;
    }

    public final void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        if (i8 != 0) {
            int min = Math.min(i8, this.f5504l);
            this.f5507o += (long) (min / this.f3238b.f3236d);
            this.f5504l -= min;
            byteBuffer.position(position + min);
            if (this.f5504l <= 0) {
                int i9 = i8 - min;
                int length = (this.f5506n + i9) - this.f5505m.length;
                ByteBuffer k8 = k(length);
                int i10 = z.i(length, 0, this.f5506n);
                k8.put(this.f5505m, 0, i10);
                int i11 = z.i(length - i10, 0, i9);
                byteBuffer.limit(byteBuffer.position() + i11);
                k8.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i9 - i11;
                int i13 = this.f5506n - i10;
                this.f5506n = i13;
                byte[] bArr = this.f5505m;
                System.arraycopy(bArr, i10, bArr, 0, i13);
                byteBuffer.get(this.f5505m, this.f5506n, i12);
                this.f5506n += i12;
                k8.flip();
            }
        }
    }

    public final b g(b bVar) {
        if (bVar.f3235c == 2) {
            this.f5503k = true;
            if (this.i == 0 && this.f5502j == 0) {
                return b.e;
            }
            return bVar;
        }
        throw new c(bVar);
    }

    public final void h() {
        if (this.f5503k) {
            this.f5503k = false;
            int i8 = this.f5502j;
            int i9 = this.f3238b.f3236d;
            this.f5505m = new byte[(i8 * i9)];
            this.f5504l = this.i * i9;
        }
        this.f5506n = 0;
    }

    public final void i() {
        if (this.f5503k) {
            int i8 = this.f5506n;
            if (i8 > 0) {
                this.f5507o += (long) (i8 / this.f3238b.f3236d);
            }
            this.f5506n = 0;
        }
    }

    public final void j() {
        this.f5505m = z.f3752f;
    }
}
