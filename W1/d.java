package W1;

import H3.M;
import H3.O;
import H3.i0;
import Q7.g;
import java.util.List;
import p1.G;
import p1.l;
import p1.o;
import p1.p;
import p1.q;

public final class d implements o {

    /* renamed from: a  reason: collision with root package name */
    public q f6141a;

    /* renamed from: b  reason: collision with root package name */
    public G f6142b;

    /* renamed from: c  reason: collision with root package name */
    public int f6143c;

    /* renamed from: d  reason: collision with root package name */
    public long f6144d;
    public b e;

    /* renamed from: f  reason: collision with root package name */
    public int f6145f;

    /* renamed from: g  reason: collision with root package name */
    public long f6146g;

    public final void a(long j7, long j8) {
        int i;
        if (j7 == 0) {
            i = 0;
        } else {
            i = 4;
        }
        this.f6143c = i;
        b bVar = this.e;
        if (bVar != null) {
            bVar.c(j8);
        }
    }

    public final o c() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r27, M0.C0132u r28) {
        /*
            r26 = this;
            r0 = r26
            p1.G r1 = r0.f6142b
            P0.l.k(r1)
            int r1 = P0.z.f3748a
            int r1 = r0.f6143c
            r2 = 0
            r3 = -1
            r4 = 4
            r5 = 1
            if (r1 == 0) goto L_0x0202
            r6 = 8
            r7 = 2
            r8 = -1
            if (r1 == r5) goto L_0x01cc
            r10 = 3
            if (r1 == r7) goto L_0x00d3
            if (r1 == r10) goto L_0x004a
            if (r1 != r4) goto L_0x0044
            long r6 = r0.f6146g
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            P0.l.j(r5)
            long r4 = r0.f6146g
            r1 = r27
            p1.l r1 = (p1.l) r1
            long r6 = r1.f14408X
            long r4 = r4 - r6
            W1.b r1 = r0.e
            r1.getClass()
            r6 = r27
            p1.l r6 = (p1.l) r6
            boolean r1 = r1.a(r6, r4)
            if (r1 == 0) goto L_0x0043
            r2 = -1
        L_0x0043:
            return r2
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x004a:
            r1 = r27
            p1.l r1 = (p1.l) r1
            r1.f14410Z = r2
            P0.r r1 = new P0.r
            r1.<init>((int) r6)
            r3 = r27
            p1.l r3 = (p1.l) r3
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            W1.e r1 = Q7.g.G(r5, r3, r1)
            r3.m(r6)
            long r5 = r3.f14408X
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r6 = r1.f6148b
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            java.lang.Object r5 = r1.first
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r0.f6145f = r5
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            long r10 = r0.f6144d
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0095
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0095
            r5 = r10
        L_0x0095:
            int r1 = r0.f6145f
            long r10 = (long) r1
            long r10 = r10 + r5
            r0.f6146g = r10
            long r5 = r3.f14407W
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x00c4
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Data exceeds input length: "
            r1.<init>(r3)
            long r7 = r0.f6146g
            r1.append(r7)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "WavExtractor"
            P0.l.B(r3, r1)
            r0.f6146g = r5
        L_0x00c4:
            W1.b r1 = r0.e
            r1.getClass()
            int r3 = r0.f6145f
            long r5 = r0.f6146g
            r1.b(r3, r5)
            r0.f6143c = r4
            return r2
        L_0x00d3:
            P0.r r1 = new P0.r
            r3 = 16
            r1.<init>((int) r3)
            r6 = r27
            p1.l r6 = (p1.l) r6
            r7 = 1718449184(0x666d7420, float:2.8033575E23)
            W1.e r7 = Q7.g.G(r7, r6, r1)
            r8 = 16
            long r11 = r7.f6148b
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x00ef
            r7 = 1
            goto L_0x00f0
        L_0x00ef:
            r7 = 0
        L_0x00f0:
            P0.l.j(r7)
            byte[] r7 = r1.f3732a
            r6.r(r7, r2, r3, r2)
            r1.H(r2)
            int r6 = r1.o()
            int r15 = r1.o()
            int r16 = r1.n()
            r1.n()
            int r17 = r1.o()
            int r1 = r1.o()
            int r7 = (int) r11
            int r7 = r7 - r3
            if (r7 <= 0) goto L_0x0122
            byte[] r3 = new byte[r7]
            r8 = r27
            p1.l r8 = (p1.l) r8
            r8.r(r3, r2, r7, r2)
        L_0x011f:
            r19 = r3
            goto L_0x0125
        L_0x0122:
            byte[] r3 = P0.z.f3752f
            goto L_0x011f
        L_0x0125:
            r3 = r27
            p1.l r3 = (p1.l) r3
            long r7 = r3.s()
            long r11 = r3.f14408X
            long r7 = r7 - r11
            int r8 = (int) r7
            r3.m(r8)
            J1.e r3 = new J1.e
            r13 = r3
            r14 = r6
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7 = 17
            if (r6 != r7) goto L_0x014e
            W1.a r1 = new W1.a
            p1.q r4 = r0.f6141a
            p1.G r5 = r0.f6142b
            r1.<init>(r4, r5, r3)
            r0.e = r1
            goto L_0x01b6
        L_0x014e:
            r7 = 6
            if (r6 != r7) goto L_0x0169
            W1.c r1 = new W1.c
            p1.q r4 = r0.f6141a
            p1.G r5 = r0.f6142b
            java.lang.String r24 = "audio/g711-alaw"
            r25 = -1
            r20 = r1
            r21 = r4
            r22 = r5
            r23 = r3
            r20.<init>(r21, r22, r23, r24, r25)
            r0.e = r1
            goto L_0x01b6
        L_0x0169:
            r7 = 7
            if (r6 != r7) goto L_0x0184
            W1.c r1 = new W1.c
            p1.q r4 = r0.f6141a
            p1.G r5 = r0.f6142b
            java.lang.String r24 = "audio/g711-mlaw"
            r25 = -1
            r20 = r1
            r21 = r4
            r22 = r5
            r23 = r3
            r20.<init>(r21, r22, r23, r24, r25)
            r0.e = r1
            goto L_0x01b6
        L_0x0184:
            if (r6 == r5) goto L_0x0199
            if (r6 == r10) goto L_0x0190
            r4 = 65534(0xfffe, float:9.1833E-41)
            if (r6 == r4) goto L_0x0199
            r25 = 0
            goto L_0x019f
        L_0x0190:
            r5 = 32
            if (r1 != r5) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r4 = 0
        L_0x0196:
            r25 = r4
            goto L_0x019f
        L_0x0199:
            int r1 = P0.z.z(r1)
            r25 = r1
        L_0x019f:
            if (r25 == 0) goto L_0x01b9
            W1.c r1 = new W1.c
            p1.q r4 = r0.f6141a
            p1.G r5 = r0.f6142b
            java.lang.String r24 = "audio/raw"
            r20 = r1
            r21 = r4
            r22 = r5
            r23 = r3
            r20.<init>(r21, r22, r23, r24, r25)
            r0.e = r1
        L_0x01b6:
            r0.f6143c = r10
            return r2
        L_0x01b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported WAV format type: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x01cc:
            P0.r r1 = new P0.r
            r1.<init>((int) r6)
            r3 = r27
            p1.l r3 = (p1.l) r3
            W1.e r4 = W1.e.b(r3, r1)
            int r5 = r4.f6147a
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L_0x01e3
            r3.f14410Z = r2
            goto L_0x01fd
        L_0x01e3:
            r3.b(r6, r2)
            r1.H(r2)
            byte[] r3 = r1.f3732a
            r5 = r27
            p1.l r5 = (p1.l) r5
            r5.r(r3, r2, r6, r2)
            long r8 = r1.l()
            long r3 = r4.f6148b
            int r1 = (int) r3
            int r1 = r1 + r6
            r5.m(r1)
        L_0x01fd:
            r0.f6144d = r8
            r0.f6143c = r7
            return r2
        L_0x0202:
            r1 = r27
            p1.l r1 = (p1.l) r1
            long r6 = r1.f14408X
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0210
            r1 = 1
            goto L_0x0211
        L_0x0210:
            r1 = 0
        L_0x0211:
            P0.l.j(r1)
            int r1 = r0.f6145f
            if (r1 == r3) goto L_0x0222
            r3 = r27
            p1.l r3 = (p1.l) r3
            r3.m(r1)
            r0.f6143c = r4
            goto L_0x0239
        L_0x0222:
            r1 = r27
            p1.l r1 = (p1.l) r1
            boolean r3 = Q7.g.g(r1)
            if (r3 == 0) goto L_0x023a
            long r3 = r1.s()
            long r6 = r1.f14408X
            long r3 = r3 - r6
            int r4 = (int) r3
            r1.m(r4)
            r0.f6143c = r5
        L_0x0239:
            return r2
        L_0x023a:
            java.lang.String r1 = "Unsupported or unrecognized wav file type."
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.d.e(p1.p, M0.u):int");
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        return g.g((l) pVar);
    }

    public final void l(q qVar) {
        this.f6141a = qVar;
        this.f6142b = qVar.q(0, 1);
        qVar.g();
    }

    public final void release() {
    }
}
