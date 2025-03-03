package V1;

import H3.M;
import H3.O;
import H3.i0;
import M0.C0132u;
import P0.r;
import java.util.List;
import p1.l;
import p1.o;
import p1.p;
import p1.q;
import p1.s;

/* renamed from: V1.c  reason: case insensitive filesystem */
public final class C0344c implements o {

    /* renamed from: a  reason: collision with root package name */
    public final C0343b f5733a = new C0343b((String) null, 0, 1);

    /* renamed from: b  reason: collision with root package name */
    public final r f5734b = new r(16384);

    /* renamed from: c  reason: collision with root package name */
    public boolean f5735c;

    public final void a(long j7, long j8) {
        this.f5735c = false;
        this.f5733a.a();
    }

    public final o c() {
        return this;
    }

    public final int e(p pVar, C0132u uVar) {
        r rVar = this.f5734b;
        int x8 = ((l) pVar).x(rVar.f3732a, 0, 16384);
        if (x8 == -1) {
            return -1;
        }
        rVar.H(0);
        rVar.G(x8);
        boolean z = this.f5735c;
        C0343b bVar = this.f5733a;
        if (!z) {
            bVar.f5732n = 0;
            this.f5735c = true;
        }
        bVar.e(rVar);
        return 0;
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r5.f14410Z = 0;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if ((r1 - r3) < 8192) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(p1.p r15) {
        /*
            r14 = this;
            P0.r r0 = new P0.r
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f3732a
            r5 = r15
            p1.l r5 = (p1.l) r5
            r5.r(r4, r2, r1, r2)
            r0.H(r2)
            int r4 = r0.y()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x008f
            r5.f14410Z = r2
            r5.b(r3, r2)
            r1 = r3
        L_0x0024:
            r15 = 0
        L_0x0025:
            byte[] r4 = r0.f3732a
            r6 = 7
            r5.r(r4, r2, r6, r2)
            r0.H(r2)
            int r4 = r0.B()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L_0x004b
            if (r4 == r9) goto L_0x004b
            r5.f14410Z = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r15 < r4) goto L_0x0047
            return r2
        L_0x0047:
            r5.b(r1, r2)
            goto L_0x0024
        L_0x004b:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L_0x0051
            return r8
        L_0x0051:
            byte[] r8 = r0.f3732a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L_0x0059
            r11 = -1
            goto L_0x0086
        L_0x0059:
            r11 = 2
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            byte r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L_0x0080
            byte r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            byte r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L_0x0081
        L_0x0080:
            r6 = 4
        L_0x0081:
            if (r4 != r9) goto L_0x0085
            int r6 = r6 + 2
        L_0x0085:
            int r11 = r11 + r6
        L_0x0086:
            if (r11 != r12) goto L_0x0089
            return r2
        L_0x0089:
            int r11 = r11 + -7
            r5.b(r11, r2)
            goto L_0x0025
        L_0x008f:
            r0.I(r7)
            int r4 = r0.u()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.b(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.C0344c.h(p1.p):boolean");
    }

    public final void l(q qVar) {
        this.f5733a.h(qVar, new G(0, 1));
        qVar.g();
        qVar.l(new s(-9223372036854775807L));
    }

    public final void release() {
    }
}
