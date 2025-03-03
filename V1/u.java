package V1;

import M0.C0129q;
import M0.I;
import P0.l;
import P0.r;
import T3.a;
import org.altbeacon.bluetooth.Pdu;
import p1.F;
import p1.G;
import p1.q;

public final class u implements i {

    /* renamed from: a  reason: collision with root package name */
    public final r f5917a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5918b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5919c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5920d;
    public G e;

    /* renamed from: f  reason: collision with root package name */
    public String f5921f;

    /* renamed from: g  reason: collision with root package name */
    public int f5922g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f5923h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5924j;

    /* renamed from: k  reason: collision with root package name */
    public long f5925k;

    /* renamed from: l  reason: collision with root package name */
    public int f5926l;

    /* renamed from: m  reason: collision with root package name */
    public long f5927m;

    /* JADX WARNING: type inference failed for: r0v1, types: [T3.a, java.lang.Object] */
    public u(String str, int i8) {
        r rVar = new r(4);
        this.f5917a = rVar;
        rVar.f3732a[0] = -1;
        this.f5918b = new Object();
        this.f5927m = -9223372036854775807L;
        this.f5919c = str;
        this.f5920d = i8;
    }

    public final void a() {
        this.f5922g = 0;
        this.f5923h = 0;
        this.f5924j = false;
        this.f5927m = -9223372036854775807L;
    }

    public final void e(r rVar) {
        boolean z;
        boolean z6;
        l.k(this.e);
        while (rVar.a() > 0) {
            int i8 = this.f5922g;
            boolean z8 = true;
            r rVar2 = this.f5917a;
            if (i8 == 0) {
                byte[] bArr = rVar.f3732a;
                int i9 = rVar.f3733b;
                int i10 = rVar.f3734c;
                while (true) {
                    if (i9 >= i10) {
                        rVar.H(i10);
                        break;
                    }
                    byte b8 = bArr[i9];
                    if ((b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE) == 255) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!this.f5924j || (b8 & 224) != 224) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    this.f5924j = z;
                    if (z6) {
                        rVar.H(i9 + 1);
                        this.f5924j = false;
                        rVar2.f3732a[1] = bArr[i9];
                        this.f5923h = 2;
                        this.f5922g = 1;
                        break;
                    }
                    i9++;
                }
            } else if (i8 == 1) {
                int min = Math.min(rVar.a(), 4 - this.f5923h);
                rVar.g(rVar2.f3732a, this.f5923h, min);
                int i11 = this.f5923h + min;
                this.f5923h = i11;
                if (i11 >= 4) {
                    rVar2.H(0);
                    int i12 = rVar2.i();
                    a aVar = this.f5918b;
                    if (!aVar.e(i12)) {
                        this.f5923h = 0;
                        this.f5922g = 1;
                    } else {
                        this.f5926l = aVar.f5000b;
                        if (!this.i) {
                            this.f5925k = (((long) aVar.f5003f) * 1000000) / ((long) aVar.f5001c);
                            C0129q qVar = new C0129q();
                            qVar.f2989a = this.f5921f;
                            qVar.f2999m = I.o((String) aVar.f5004g);
                            qVar.f3000n = 4096;
                            qVar.f2979B = aVar.f5002d;
                            qVar.f2980C = aVar.f5001c;
                            qVar.f2992d = this.f5919c;
                            qVar.f2993f = this.f5920d;
                            this.e.c(new M0.r(qVar));
                            this.i = true;
                        }
                        rVar2.H(0);
                        this.e.a(4, rVar2);
                        this.f5922g = 2;
                    }
                }
            } else if (i8 == 2) {
                int min2 = Math.min(rVar.a(), this.f5926l - this.f5923h);
                this.e.a(min2, rVar);
                int i13 = this.f5923h + min2;
                this.f5923h = i13;
                if (i13 >= this.f5926l) {
                    if (this.f5927m == -9223372036854775807L) {
                        z8 = false;
                    }
                    l.j(z8);
                    this.e.e(this.f5927m, 1, this.f5926l, 0, (F) null);
                    this.f5927m += this.f5925k;
                    this.f5923h = 0;
                    this.f5922g = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void f(boolean z) {
    }

    public final void g(int i8, long j7) {
        this.f5927m = j7;
    }

    public final void h(q qVar, G g8) {
        g8.c();
        g8.d();
        this.f5921f = (String) g8.e;
        g8.d();
        this.e = qVar.q(g8.f5716c, 1);
    }
}
