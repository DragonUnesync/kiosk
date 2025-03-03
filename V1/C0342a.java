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

/* renamed from: V1.a  reason: case insensitive filesystem */
public final class C0342a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final C0343b f5718a = new C0343b();

    /* renamed from: b  reason: collision with root package name */
    public final r f5719b = new r(2786);

    /* renamed from: c  reason: collision with root package name */
    public boolean f5720c;

    public final void a(long j7, long j8) {
        this.f5720c = false;
        this.f5718a.a();
    }

    public final o c() {
        return this;
    }

    public final int e(p pVar, C0132u uVar) {
        r rVar = this.f5719b;
        int x8 = ((l) pVar).x(rVar.f3732a, 0, 2786);
        if (x8 == -1) {
            return -1;
        }
        rVar.H(0);
        rVar.G(x8);
        boolean z = this.f5720c;
        C0343b bVar = this.f5718a;
        if (!z) {
            bVar.f5732n = 0;
            this.f5720c = true;
        }
        bVar.e(rVar);
        return 0;
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        r5.f14410Z = 0;
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if ((r4 - r3) < 8192) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(p1.p r14) {
        /*
            r13 = this;
            P0.r r0 = new P0.r
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f3732a
            r5 = r14
            p1.l r5 = (p1.l) r5
            r5.r(r4, r2, r1, r2)
            r0.H(r2)
            int r4 = r0.y()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x0080
            r5.f14410Z = r2
            r5.b(r3, r2)
            r4 = r3
        L_0x0024:
            r14 = 0
        L_0x0025:
            byte[] r6 = r0.f3732a
            r8 = 6
            r5.r(r6, r2, r8, r2)
            r0.H(r2)
            int r6 = r0.B()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r6 == r9) goto L_0x0045
            r5.f14410Z = r2
            int r4 = r4 + 1
            int r14 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r14 < r6) goto L_0x0041
            return r2
        L_0x0041:
            r5.b(r4, r2)
            goto L_0x0024
        L_0x0045:
            r6 = 1
            int r14 = r14 + r6
            r9 = 4
            if (r14 < r9) goto L_0x004b
            return r6
        L_0x004b:
            byte[] r10 = r0.f3732a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L_0x0053
            r9 = -1
            goto L_0x0077
        L_0x0053:
            r11 = 5
            byte r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r7
            if (r11 <= r1) goto L_0x006b
            r8 = 2
            byte r9 = r10[r8]
            r9 = r9 & 7
            int r9 = r9 << 8
            byte r10 = r10[r7]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r9 = r9 + r6
            int r9 = r9 * 2
            goto L_0x0077
        L_0x006b:
            byte r6 = r10[r9]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            int r8 = r9 >> 6
            r6 = r6 & 63
            int r9 = p1.C1332b.g(r8, r6)
        L_0x0077:
            if (r9 != r12) goto L_0x007a
            return r2
        L_0x007a:
            int r9 = r9 + -6
            r5.b(r9, r2)
            goto L_0x0025
        L_0x0080:
            r0.I(r7)
            int r4 = r0.u()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.b(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.C0342a.h(p1.p):boolean");
    }

    public final void l(q qVar) {
        this.f5718a.h(qVar, new G(0, 1));
        qVar.g();
        qVar.l(new s(-9223372036854775807L));
    }

    public final void release() {
    }
}
