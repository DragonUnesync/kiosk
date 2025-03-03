package V1;

import P0.l;
import p1.F;
import p1.G;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final G f5813a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5814b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5815c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5816d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f5817f;

    /* renamed from: g  reason: collision with root package name */
    public long f5818g;

    /* renamed from: h  reason: collision with root package name */
    public long f5819h;

    public m(G g8) {
        this.f5813a = g8;
    }

    public final void a(byte[] bArr, int i, int i8) {
        boolean z;
        if (this.f5815c) {
            int i9 = this.f5817f;
            int i10 = (i + 1) - i9;
            if (i10 < i8) {
                if (((bArr[i10] & 192) >> 6) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f5816d = z;
                this.f5815c = false;
                return;
            }
            this.f5817f = (i8 - i) + i9;
        }
    }

    public final void b(long j7, int i, boolean z) {
        boolean z6;
        if (this.f5819h != -9223372036854775807L) {
            z6 = true;
        } else {
            z6 = false;
        }
        l.j(z6);
        if (this.e == 182 && z && this.f5814b) {
            boolean z8 = this.f5816d;
            long j8 = this.f5819h;
            this.f5813a.e(j8, z8 ? 1 : 0, (int) (j7 - this.f5818g), i, (F) null);
        }
        if (this.e != 179) {
            this.f5818g = j7;
        }
    }
}
