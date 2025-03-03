package g1;

import M0.J;
import N7.a;
import P0.l;
import P0.r;
import P0.z;
import f1.C0894g;
import f1.C0896i;
import p1.F;
import p1.G;
import p1.q;

public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0896i f11878a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11879b;

    /* renamed from: c  reason: collision with root package name */
    public G f11880c;

    /* renamed from: d  reason: collision with root package name */
    public long f11881d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f11882f;

    /* renamed from: g  reason: collision with root package name */
    public long f11883g;

    /* renamed from: h  reason: collision with root package name */
    public long f11884h;

    public f(C0896i iVar) {
        this.f11878a = iVar;
        try {
            this.f11879b = e(iVar.f11549d);
            this.f11881d = -9223372036854775807L;
            this.e = -1;
            this.f11882f = 0;
            this.f11883g = 0;
            this.f11884h = -9223372036854775807L;
        } catch (J e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(H3.n0 r5) {
        /*
            java.lang.String r0 = "config"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0062
            int r2 = r5.length()
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x0062
            byte[] r5 = P0.z.s(r5)
            N1.f r2 = new N1.f
            int r3 = r5.length
            r2.<init>((int) r3, (byte[]) r5)
            int r5 = r2.i(r0)
            if (r5 != 0) goto L_0x0055
            int r5 = r2.i(r0)
            if (r5 != r0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            java.lang.String r3 = "Only supports allStreamsSameTimeFraming."
            P0.l.c(r3, r5)
            r5 = 6
            int r5 = r2.i(r5)
            r3 = 4
            int r3 = r2.i(r3)
            if (r3 != 0) goto L_0x0040
            r3 = 1
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            java.lang.String r4 = "Only suppors one program."
            P0.l.c(r4, r3)
            r3 = 3
            int r2 = r2.i(r3)
            if (r2 != 0) goto L_0x004e
            r1 = 1
        L_0x004e:
            java.lang.String r2 = "Only suppors one layer."
            P0.l.c(r2, r1)
            r1 = r5
            goto L_0x0062
        L_0x0055:
            java.lang.String r2 = "unsupported audio mux version: "
            java.lang.String r5 = Q0.g.m(r5, r2)
            M0.J r2 = new M0.J
            r3 = 0
            r2.<init>(r5, r3, r0, r1)
            throw r2
        L_0x0062:
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f.e(H3.n0):int");
    }

    public final void a(long j7, long j8) {
        this.f11881d = j7;
        this.f11882f = 0;
        this.f11883g = j8;
    }

    public final void b(r rVar, long j7, int i, boolean z) {
        r rVar2 = rVar;
        int i8 = i;
        l.k(this.f11880c);
        int a8 = C0894g.a(this.e);
        if (this.f11882f > 0 && a8 < i8) {
            G g8 = this.f11880c;
            g8.getClass();
            g8.e(this.f11884h, 1, this.f11882f, 0, (F) null);
            this.f11882f = 0;
            this.f11884h = -9223372036854775807L;
        }
        for (int i9 = 0; i9 < this.f11879b; i9++) {
            int i10 = 0;
            while (rVar2.f3733b < rVar2.f3734c) {
                int v4 = rVar.v();
                i10 += v4;
                if (v4 != 255) {
                    break;
                }
            }
            this.f11880c.a(i10, rVar2);
            this.f11882f += i10;
        }
        this.f11884h = a.x(this.f11883g, j7, this.f11881d, this.f11878a.f11547b);
        if (z) {
            G g9 = this.f11880c;
            g9.getClass();
            g9.e(this.f11884h, 1, this.f11882f, 0, (F) null);
            this.f11882f = 0;
            this.f11884h = -9223372036854775807L;
        }
        this.e = i8;
    }

    public final void c(long j7) {
        boolean z;
        if (this.f11881d == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        this.f11881d = j7;
    }

    public final void d(q qVar, int i) {
        G q7 = qVar.q(i, 2);
        this.f11880c = q7;
        int i8 = z.f3748a;
        q7.c(this.f11878a.f11548c);
    }
}
