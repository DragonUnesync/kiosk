package K1;

import H3.M;
import H3.O;
import H3.i0;
import M0.J;
import P0.r;
import P0.z;
import java.util.List;
import p1.C1332b;
import p1.l;
import p1.o;
import p1.p;
import p1.q;

public final class d implements o {

    /* renamed from: a  reason: collision with root package name */
    public q f2552a;

    /* renamed from: b  reason: collision with root package name */
    public j f2553b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2554c;

    public final void a(long j7, long j8) {
        j jVar = this.f2553b;
        if (jVar != null) {
            e eVar = jVar.f2569a;
            f fVar = (f) eVar.f2558d;
            fVar.f2559a = 0;
            fVar.f2560b = 0;
            fVar.f2561c = 0;
            fVar.f2562d = 0;
            fVar.e = 0;
            ((r) eVar.e).E(0);
            eVar.f2556b = -1;
            eVar.f2555a = false;
            if (j7 == 0) {
                jVar.d(!jVar.f2578l);
            } else if (jVar.f2575h != 0) {
                long j9 = (((long) jVar.i) * j8) / 1000000;
                jVar.e = j9;
                g gVar = jVar.f2572d;
                int i = z.f3748a;
                gVar.p(j9);
                jVar.f2575h = 2;
            }
        }
    }

    public final boolean b(l lVar) {
        boolean z;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f2559a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            r rVar = new r(min);
            lVar.r(rVar.f3732a, 0, min, false);
            rVar.H(0);
            if (rVar.a() >= 5 && rVar.v() == 127 && rVar.x() == 1179402563) {
                this.f2553b = new j();
            } else {
                rVar.H(0);
                try {
                    z = C1332b.y(1, rVar, true);
                } catch (J unused) {
                    z = false;
                }
                if (z) {
                    this.f2553b = new j();
                } else {
                    rVar.H(0);
                    if (h.e(rVar, h.f2565o)) {
                        this.f2553b = new j();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final o c() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r21, M0.C0132u r22) {
        /*
            r20 = this;
            r0 = r20
            p1.q r1 = r0.f2552a
            P0.l.k(r1)
            K1.j r1 = r0.f2553b
            r2 = 0
            if (r1 != 0) goto L_0x0021
            r1 = r21
            p1.l r1 = (p1.l) r1
            boolean r3 = r0.b(r1)
            if (r3 == 0) goto L_0x0019
            r1.f14410Z = r2
            goto L_0x0021
        L_0x0019:
            java.lang.String r1 = "Failed to determine bitstream type"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0021:
            boolean r1 = r0.f2554c
            r3 = 1
            if (r1 != 0) goto L_0x003e
            p1.q r1 = r0.f2552a
            p1.G r1 = r1.q(r2, r3)
            p1.q r4 = r0.f2552a
            r4.g()
            K1.j r4 = r0.f2553b
            p1.q r5 = r0.f2552a
            r4.f2571c = r5
            r4.f2570b = r1
            r4.d(r3)
            r0.f2554c = r3
        L_0x003e:
            K1.j r1 = r0.f2553b
            p1.G r4 = r1.f2570b
            P0.l.k(r4)
            int r4 = P0.z.f3748a
            int r4 = r1.f2575h
            K1.e r5 = r1.f2569a
            r6 = -1
            r8 = -1
            r9 = 3
            r14 = 2
            if (r4 == 0) goto L_0x00f5
            if (r4 == r3) goto L_0x00e7
            if (r4 == r14) goto L_0x0061
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2 = -1
            goto L_0x0198
        L_0x005b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0061:
            K1.g r4 = r1.f2572d
            r10 = r21
            p1.l r10 = (p1.l) r10
            long r11 = r4.h(r10)
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x0078
            r4 = r22
            r4.f3050a = r11
            r2 = 1
            goto L_0x0198
        L_0x0078:
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0083
            r15 = 2
            long r11 = r11 + r15
            long r11 = -r11
            r1.a(r11)
        L_0x0083:
            boolean r4 = r1.f2578l
            if (r4 != 0) goto L_0x0097
            K1.g r4 = r1.f2572d
            p1.z r4 = r4.g()
            P0.l.k(r4)
            p1.q r11 = r1.f2571c
            r11.l(r4)
            r1.f2578l = r3
        L_0x0097:
            long r3 = r1.f2577k
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 > 0) goto L_0x00a7
            boolean r3 = r5.b(r10)
            if (r3 == 0) goto L_0x00a4
            goto L_0x00a7
        L_0x00a4:
            r1.f2575h = r9
            goto L_0x0058
        L_0x00a7:
            r1.f2577k = r13
            java.lang.Object r3 = r5.e
            P0.r r3 = (P0.r) r3
            long r4 = r1.b(r3)
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 < 0) goto L_0x00e0
            long r8 = r1.f2574g
            long r10 = r8 + r4
            long r12 = r1.e
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00e0
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r10
            int r10 = r1.i
            long r10 = (long) r10
            long r13 = r8 / r10
            p1.G r8 = r1.f2570b
            int r9 = r3.f3734c
            r8.a(r9, r3)
            p1.G r12 = r1.f2570b
            int r3 = r3.f3734c
            r17 = 0
            r18 = 0
            r15 = 1
            r16 = r3
            r12.e(r13, r15, r16, r17, r18)
            r1.e = r6
        L_0x00e0:
            long r6 = r1.f2574g
            long r6 = r6 + r4
            r1.f2574g = r6
            goto L_0x0198
        L_0x00e7:
            long r3 = r1.f2573f
            int r4 = (int) r3
            r3 = r21
            p1.l r3 = (p1.l) r3
            r3.m(r4)
            r1.f2575h = r14
            goto L_0x0198
        L_0x00f5:
            r4 = r21
            p1.l r4 = (p1.l) r4
            boolean r10 = r5.b(r4)
            if (r10 != 0) goto L_0x0103
            r1.f2575h = r9
            goto L_0x0058
        L_0x0103:
            long r10 = r4.f14408X
            long r12 = r1.f2573f
            long r10 = r10 - r12
            r1.f2577k = r10
            A1.d r4 = r1.f2576j
            java.lang.Object r10 = r5.e
            r15 = r10
            P0.r r15 = (P0.r) r15
            boolean r4 = r1.c(r15, r12, r4)
            if (r4 == 0) goto L_0x0120
            r4 = r21
            p1.l r4 = (p1.l) r4
            long r10 = r4.f14408X
            r1.f2573f = r10
            goto L_0x00f5
        L_0x0120:
            A1.d r4 = r1.f2576j
            java.lang.Object r4 = r4.f35V
            M0.r r4 = (M0.r) r4
            int r8 = r4.f3015D
            r1.i = r8
            boolean r8 = r1.f2579m
            if (r8 != 0) goto L_0x0135
            p1.G r8 = r1.f2570b
            r8.c(r4)
            r1.f2579m = r3
        L_0x0135:
            A1.d r4 = r1.f2576j
            java.lang.Object r4 = r4.f36W
            J1.b r4 = (J1.b) r4
            if (r4 == 0) goto L_0x0143
            r1.f2572d = r4
        L_0x013f:
            r19 = r15
            r2 = 2
            goto L_0x017b
        L_0x0143:
            r4 = r21
            p1.l r4 = (p1.l) r4
            long r10 = r4.f14407W
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0155
            K1.i r3 = new K1.i
            r3.<init>(r2)
            r1.f2572d = r3
            goto L_0x013f
        L_0x0155:
            java.lang.Object r4 = r5.f2558d
            K1.f r4 = (K1.f) r4
            int r5 = r4.f2559a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0162
            r16 = 1
            goto L_0x0164
        L_0x0162:
            r16 = 0
        L_0x0164:
            K1.b r3 = new K1.b
            long r8 = r1.f2573f
            int r5 = r4.f2562d
            int r6 = r4.e
            int r5 = r5 + r6
            long r12 = (long) r5
            long r4 = r4.f2560b
            r6 = r3
            r7 = r1
            r19 = r15
            r2 = 2
            r14 = r4
            r6.<init>(r7, r8, r10, r12, r14, r16)
            r1.f2572d = r3
        L_0x017b:
            r1.f2575h = r2
            r10 = r19
            byte[] r1 = r10.f3732a
            int r2 = r1.length
            r3 = 65025(0xfe01, float:9.112E-41)
            if (r2 != r3) goto L_0x0188
            goto L_0x0197
        L_0x0188:
            int r2 = r10.f3734c
            int r2 = java.lang.Math.max(r3, r2)
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            int r2 = r10.f3734c
            r10.F(r2, r1)
        L_0x0197:
            r2 = 0
        L_0x0198:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.d.e(p1.p, M0.u):int");
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        try {
            return b((l) pVar);
        } catch (J unused) {
            return false;
        }
    }

    public final void l(q qVar) {
        this.f2552a = qVar;
    }

    public final void release() {
    }
}
