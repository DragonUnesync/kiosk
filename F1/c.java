package F1;

import N1.f;
import P0.r;
import P0.w;
import Q7.g;

public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    public final r f1479a = new r();

    /* renamed from: b  reason: collision with root package name */
    public final f f1480b = new f();

    /* renamed from: c  reason: collision with root package name */
    public w f1481c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: F1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: F1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: F1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: F1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: F1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: F1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: F1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: F1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: F1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: F1.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M0.H q(y1.C1625a r57, java.nio.ByteBuffer r58) {
        /*
            r56 = this;
            r0 = r56
            r1 = r57
            r3 = 32
            r4 = 1
            P0.w r5 = r0.f1481c
            if (r5 == 0) goto L_0x0015
            long r6 = r1.f16364d0
            long r8 = r5.e()
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0026
        L_0x0015:
            P0.w r5 = new P0.w
            long r6 = r1.f4388a0
            r5.<init>(r6)
            r0.f1481c = r5
            long r6 = r1.f4388a0
            long r8 = r1.f16364d0
            long r6 = r6 - r8
            r5.a(r6)
        L_0x0026:
            byte[] r1 = r58.array()
            int r5 = r58.limit()
            P0.r r6 = r0.f1479a
            r6.F(r5, r1)
            N1.f r7 = r0.f1480b
            r7.p(r5, r1)
            r1 = 39
            r7.u(r1)
            int r1 = r7.i(r4)
            long r8 = (long) r1
            long r8 = r8 << r3
            int r1 = r7.i(r3)
            long r10 = (long) r1
            long r8 = r8 | r10
            r1 = 20
            r7.u(r1)
            r1 = 12
            int r1 = r7.i(r1)
            r5 = 8
            int r5 = r7.i(r5)
            r7 = 14
            r6.I(r7)
            if (r5 == 0) goto L_0x0277
            r7 = 255(0xff, float:3.57E-43)
            r10 = 4
            if (r5 == r7) goto L_0x0263
            r15 = 1
            r17 = 0
            r19 = 128(0x80, double:6.32E-322)
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r10) goto L_0x016b
            r1 = 5
            if (r5 == r1) goto L_0x008d
            r1 = 6
            if (r5 == r1) goto L_0x007c
            r1 = 0
            goto L_0x027c
        L_0x007c:
            P0.w r1 = r0.f1481c
            long r5 = F1.j.k(r8, r6)
            long r7 = r1.b(r5)
            F1.j r1 = new F1.j
            r1.<init>(r5, r7)
            goto L_0x027c
        L_0x008d:
            P0.w r1 = r0.f1481c
            long r24 = r6.x()
            int r5 = r6.v()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x009e
            r26 = 1
            goto L_0x00a0
        L_0x009e:
            r26 = 0
        L_0x00a0:
            java.util.List r5 = java.util.Collections.emptyList()
            if (r26 != 0) goto L_0x0147
            int r7 = r6.v()
            r10 = r7 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00b0
            r10 = 1
            goto L_0x00b1
        L_0x00b0:
            r10 = 0
        L_0x00b1:
            r23 = r7 & 64
            if (r23 == 0) goto L_0x00b8
            r23 = 1
            goto L_0x00ba
        L_0x00b8:
            r23 = 0
        L_0x00ba:
            r27 = r7 & 32
            if (r27 == 0) goto L_0x00c1
            r27 = 1
            goto L_0x00c3
        L_0x00c1:
            r27 = 0
        L_0x00c3:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x00c9
            r7 = 1
            goto L_0x00ca
        L_0x00c9:
            r7 = 0
        L_0x00ca:
            if (r23 == 0) goto L_0x00d3
            if (r7 != 0) goto L_0x00d3
            long r28 = F1.j.k(r8, r6)
            goto L_0x00d5
        L_0x00d3:
            r28 = r21
        L_0x00d5:
            if (r23 != 0) goto L_0x0105
            int r5 = r6.v()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            r11 = 0
        L_0x00e1:
            if (r11 >= r5) goto L_0x0104
            int r31 = r6.v()
            if (r7 != 0) goto L_0x00f0
            long r32 = F1.j.k(r8, r6)
            r13 = r32
            goto L_0x00f2
        L_0x00f0:
            r13 = r21
        L_0x00f2:
            F1.d r12 = new F1.d
            long r34 = r1.b(r13)
            r30 = r12
            r32 = r13
            r30.<init>(r31, r32, r34)
            r2.add(r12)
            int r11 = r11 + r4
            goto L_0x00e1
        L_0x0104:
            r5 = r2
        L_0x0105:
            if (r27 == 0) goto L_0x0125
            int r2 = r6.v()
            long r8 = (long) r2
            long r11 = r8 & r19
            int r2 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0114
            r2 = 1
            goto L_0x0115
        L_0x0114:
            r2 = 0
        L_0x0115:
            long r8 = r8 & r15
            long r8 = r8 << r3
            long r11 = r6.x()
            long r8 = r8 | r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r11
            r11 = 90
            long r21 = r8 / r11
            goto L_0x0126
        L_0x0125:
            r2 = 0
        L_0x0126:
            int r3 = r6.B()
            int r8 = r6.v()
            int r6 = r6.v()
            r35 = r2
            r38 = r3
            r34 = r5
            r40 = r6
            r39 = r8
            r27 = r10
            r36 = r21
            r2 = r28
            r29 = r7
            r28 = r23
            goto L_0x015b
        L_0x0147:
            r34 = r5
            r2 = r21
            r36 = r2
            r27 = 0
            r28 = 0
            r29 = 0
            r35 = 0
            r38 = 0
            r39 = 0
            r40 = 0
        L_0x015b:
            F1.e r5 = new F1.e
            r23 = r5
            long r32 = r1.b(r2)
            r30 = r2
            r23.<init>(r24, r26, r27, r28, r29, r30, r32, r34, r35, r36, r38, r39, r40)
            r1 = r5
            goto L_0x027c
        L_0x016b:
            int r1 = r6.v()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r5 = 0
        L_0x0175:
            if (r5 >= r1) goto L_0x025d
            long r42 = r6.x()
            int r7 = r6.v()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0186
            r44 = 1
            goto L_0x0188
        L_0x0186:
            r44 = 0
        L_0x0188:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r44 != 0) goto L_0x022f
            int r8 = r6.v()
            r9 = r8 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0199
            r9 = 1
            goto L_0x019a
        L_0x0199:
            r9 = 0
        L_0x019a:
            r10 = r8 & 64
            if (r10 == 0) goto L_0x01a0
            r10 = 1
            goto L_0x01a1
        L_0x01a0:
            r10 = 0
        L_0x01a1:
            r8 = r8 & r3
            if (r8 == 0) goto L_0x01a6
            r8 = 1
            goto L_0x01a7
        L_0x01a6:
            r8 = 0
        L_0x01a7:
            if (r10 == 0) goto L_0x01ae
            long r11 = r6.x()
            goto L_0x01b0
        L_0x01ae:
            r11 = r21
        L_0x01b0:
            if (r10 != 0) goto L_0x01de
            int r7 = r6.v()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r7)
            r14 = 0
        L_0x01bc:
            if (r14 >= r7) goto L_0x01da
            int r3 = r6.v()
            r25 = r5
            long r4 = r6.x()
            F1.g r15 = new F1.g
            r15.<init>(r3, r4)
            r13.add(r15)
            r3 = 1
            int r14 = r14 + r3
            r5 = r25
            r3 = 32
            r4 = 1
            r15 = 1
            goto L_0x01bc
        L_0x01da:
            r25 = r5
            r7 = r13
            goto L_0x01e0
        L_0x01de:
            r25 = r5
        L_0x01e0:
            if (r8 == 0) goto L_0x0205
            int r3 = r6.v()
            long r3 = (long) r3
            long r13 = r3 & r19
            int r5 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x01f1
            r5 = 1
        L_0x01ee:
            r13 = 1
            goto L_0x01f3
        L_0x01f1:
            r5 = 0
            goto L_0x01ee
        L_0x01f3:
            long r3 = r3 & r13
            r8 = 32
            long r3 = r3 << r8
            long r15 = r6.x()
            long r3 = r3 | r15
            r15 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r15
            r26 = 90
            long r3 = r3 / r26
            goto L_0x0210
        L_0x0205:
            r8 = 32
            r13 = 1
            r15 = 1000(0x3e8, double:4.94E-321)
            r26 = 90
            r3 = r21
            r5 = 0
        L_0x0210:
            int r23 = r6.B()
            int r28 = r6.v()
            int r29 = r6.v()
            r51 = r3
            r50 = r5
            r47 = r7
            r45 = r9
            r46 = r10
            r48 = r11
            r53 = r23
            r54 = r28
            r55 = r29
            goto L_0x024a
        L_0x022f:
            r25 = r5
            r13 = r15
            r8 = 32
            r15 = 1000(0x3e8, double:4.94E-321)
            r26 = 90
            r47 = r7
            r48 = r21
            r51 = r48
            r45 = 0
            r46 = 0
            r50 = 0
            r53 = 0
            r54 = 0
            r55 = 0
        L_0x024a:
            F1.h r3 = new F1.h
            r41 = r3
            r41.<init>(r42, r44, r45, r46, r47, r48, r50, r51, r53, r54, r55)
            r2.add(r3)
            r3 = 1
            int r5 = r25 + 1
            r15 = r13
            r3 = 32
            r4 = 1
            goto L_0x0175
        L_0x025d:
            F1.i r1 = new F1.i
            r1.<init>((java.util.ArrayList) r2)
            goto L_0x027c
        L_0x0263:
            long r13 = r6.x()
            int r1 = r1 - r10
            byte[] r15 = new byte[r1]
            r2 = 0
            r6.g(r15, r2, r1)
            F1.a r1 = new F1.a
            r12 = r1
            r16 = r8
            r12.<init>(r13, r15, r16)
            goto L_0x027c
        L_0x0277:
            F1.f r1 = new F1.f
            r1.<init>()
        L_0x027c:
            if (r1 != 0) goto L_0x0287
            M0.H r1 = new M0.H
            r2 = 0
            M0.G[] r2 = new M0.G[r2]
            r1.<init>((M0.G[]) r2)
            goto L_0x0293
        L_0x0287:
            r2 = 0
            M0.H r3 = new M0.H
            r4 = 1
            M0.G[] r4 = new M0.G[r4]
            r4[r2] = r1
            r3.<init>((M0.G[]) r4)
            r1 = r3
        L_0x0293:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.c.q(y1.a, java.nio.ByteBuffer):M0.H");
    }
}
