package d0;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f9706a = new boolean[3];

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0262, code lost:
        if (r2.f9577b == r7) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0105, code lost:
        if (r4.f9577b == r12) goto L_0x0109;
     */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x06d0  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x010f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(d0.e r37, c0.C0607e r38, int r39) {
        /*
            r0 = r37
            r10 = r38
            r11 = 2
            if (r39 != 0) goto L_0x000f
            int r1 = r0.f9642l0
            d0.b[] r2 = r0.f9645o0
            r13 = r1
            r14 = r2
            r15 = 0
            goto L_0x0016
        L_0x000f:
            int r1 = r0.f9643m0
            d0.b[] r2 = r0.f9644n0
            r13 = r1
            r14 = r2
            r15 = 2
        L_0x0016:
            r9 = 0
        L_0x0017:
            if (r9 >= r13) goto L_0x0719
            r1 = r14[r9]
            boolean r2 = r1.f9575q
            d0.d r8 = r1.f9561a
            r3 = 3
            r4 = 1
            r7 = 8
            r16 = 0
            if (r2 != 0) goto L_0x0151
            int r2 = r1.f9570l
            int r6 = r2 * 2
            r12 = r8
            r19 = r12
            r17 = 0
        L_0x0030:
            if (r17 != 0) goto L_0x011b
            int r5 = r1.i
            int r5 = r5 + r4
            r1.i = r5
            d0.d[] r5 = r12.f9611b0
            r5[r2] = r16
            d0.d[] r5 = r12.f9609a0
            r5[r2] = r16
            int r5 = r12.f9603V
            d0.c[] r4 = r12.f9587F
            if (r5 == r7) goto L_0x00e8
            r12.h(r2)
            r5 = r4[r6]
            r5.c()
            int r5 = r6 + 1
            r22 = r4[r5]
            r22.c()
            r22 = r4[r6]
            r22.c()
            r5 = r4[r5]
            r5.c()
            d0.d r5 = r1.f9562b
            if (r5 != 0) goto L_0x0064
            r1.f9562b = r12
        L_0x0064:
            r1.f9564d = r12
            int[] r5 = r12.f9613c0
            r5 = r5[r2]
            if (r5 != r3) goto L_0x00e8
            int[] r7 = r12.f9620l
            r7 = r7[r2]
            if (r7 == 0) goto L_0x007a
            if (r7 == r3) goto L_0x007a
            if (r7 != r11) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            r24 = r9
            goto L_0x00cc
        L_0x007a:
            int r11 = r1.f9568j
            r21 = 1
            int r11 = r11 + 1
            r1.f9568j = r11
            float[] r11 = r12.f9607Z
            r11 = r11[r2]
            r20 = 0
            int r23 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x0091
            float r3 = r1.f9569k
            float r3 = r3 + r11
            r1.f9569k = r3
        L_0x0091:
            int r3 = r12.f9603V
            r24 = r9
            r9 = 8
            if (r3 == r9) goto L_0x00bc
            r3 = 3
            if (r5 != r3) goto L_0x00bc
            if (r7 == 0) goto L_0x00a0
            if (r7 != r3) goto L_0x00bc
        L_0x00a0:
            r3 = 0
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00a9
            r3 = 1
            r1.f9572n = r3
            goto L_0x00ac
        L_0x00a9:
            r3 = 1
            r1.f9573o = r3
        L_0x00ac:
            java.util.ArrayList r3 = r1.f9567h
            if (r3 != 0) goto L_0x00b7
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f9567h = r3
        L_0x00b7:
            java.util.ArrayList r3 = r1.f9567h
            r3.add(r12)
        L_0x00bc:
            d0.d r3 = r1.f9565f
            if (r3 != 0) goto L_0x00c2
            r1.f9565f = r12
        L_0x00c2:
            d0.d r3 = r1.f9566g
            if (r3 == 0) goto L_0x00ca
            d0.d[] r3 = r3.f9609a0
            r3[r2] = r12
        L_0x00ca:
            r1.f9566g = r12
        L_0x00cc:
            if (r2 != 0) goto L_0x00da
            int r3 = r12.f9618j
            if (r3 == 0) goto L_0x00d3
            goto L_0x00e5
        L_0x00d3:
            int r3 = r12.f9621m
            if (r3 != 0) goto L_0x00e5
            int r3 = r12.f9622n
            goto L_0x00e5
        L_0x00da:
            int r3 = r12.f9619k
            if (r3 == 0) goto L_0x00df
            goto L_0x00e5
        L_0x00df:
            int r3 = r12.f9624p
            if (r3 != 0) goto L_0x00e5
            int r3 = r12.f9625q
        L_0x00e5:
            r3 = r19
            goto L_0x00eb
        L_0x00e8:
            r24 = r9
            goto L_0x00e5
        L_0x00eb:
            if (r3 == r12) goto L_0x00f1
            d0.d[] r3 = r3.f9611b0
            r3[r2] = r12
        L_0x00f1:
            int r3 = r6 + 1
            r3 = r4[r3]
            d0.c r3 = r3.f9579d
            if (r3 == 0) goto L_0x0107
            d0.d r3 = r3.f9577b
            d0.c[] r4 = r3.f9587F
            r4 = r4[r6]
            d0.c r4 = r4.f9579d
            if (r4 == 0) goto L_0x0107
            d0.d r4 = r4.f9577b
            if (r4 == r12) goto L_0x0109
        L_0x0107:
            r3 = r16
        L_0x0109:
            if (r3 == 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r3 = r12
            r17 = 1
        L_0x010f:
            r19 = r12
            r9 = r24
            r4 = 1
            r7 = 8
            r11 = 2
            r12 = r3
            r3 = 3
            goto L_0x0030
        L_0x011b:
            r24 = r9
            d0.d r3 = r1.f9562b
            if (r3 == 0) goto L_0x0128
            d0.c[] r3 = r3.f9587F
            r3 = r3[r6]
            r3.c()
        L_0x0128:
            d0.d r3 = r1.f9564d
            if (r3 == 0) goto L_0x0135
            int r6 = r6 + 1
            d0.c[] r3 = r3.f9587F
            r3 = r3[r6]
            r3.c()
        L_0x0135:
            r1.f9563c = r12
            if (r2 != 0) goto L_0x0140
            boolean r2 = r1.f9571m
            if (r2 == 0) goto L_0x0140
            r1.e = r12
            goto L_0x0142
        L_0x0140:
            r1.e = r8
        L_0x0142:
            boolean r2 = r1.f9573o
            if (r2 == 0) goto L_0x014c
            boolean r2 = r1.f9572n
            if (r2 == 0) goto L_0x014c
            r2 = 1
            goto L_0x014d
        L_0x014c:
            r2 = 0
        L_0x014d:
            r1.f9574p = r2
        L_0x014f:
            r2 = 1
            goto L_0x0154
        L_0x0151:
            r24 = r9
            goto L_0x014f
        L_0x0154:
            r1.f9575q = r2
            d0.d r11 = r1.f9563c
            d0.d r12 = r1.f9562b
            d0.d r9 = r1.f9564d
            d0.d r2 = r1.e
            float r3 = r1.f9569k
            int[] r4 = r0.f9613c0
            r4 = r4[r39]
            r7 = 2
            if (r4 != r7) goto L_0x0169
            r4 = 1
            goto L_0x016a
        L_0x0169:
            r4 = 0
        L_0x016a:
            if (r39 != 0) goto L_0x0189
            int r5 = r2.f9605X
            r6 = 1
            if (r5 != 0) goto L_0x0174
            r21 = 1
            goto L_0x0176
        L_0x0174:
            r21 = 0
        L_0x0176:
            if (r5 != r6) goto L_0x017b
            r17 = 1
            goto L_0x017d
        L_0x017b:
            r17 = 0
        L_0x017d:
            if (r5 != r7) goto L_0x0181
            r5 = 1
            goto L_0x0182
        L_0x0181:
            r5 = 0
        L_0x0182:
            r25 = r3
            r7 = r8
            r19 = r21
        L_0x0187:
            r6 = 0
            goto L_0x01a5
        L_0x0189:
            r6 = 1
            int r5 = r2.f9606Y
            if (r5 != 0) goto L_0x0191
            r17 = 1
            goto L_0x0193
        L_0x0191:
            r17 = 0
        L_0x0193:
            if (r5 != r6) goto L_0x0197
            r6 = 1
            goto L_0x0198
        L_0x0197:
            r6 = 0
        L_0x0198:
            if (r5 != r7) goto L_0x019c
            r5 = 1
            goto L_0x019d
        L_0x019c:
            r5 = 0
        L_0x019d:
            r25 = r3
            r7 = r8
            r19 = r17
            r17 = r6
            goto L_0x0187
        L_0x01a5:
            d0.c[] r3 = r0.f9587F
            r26 = r13
            if (r6 != 0) goto L_0x027b
            d0.c[] r13 = r7.f9587F
            r13 = r13[r15]
            if (r5 == 0) goto L_0x01b4
            r27 = 1
            goto L_0x01b6
        L_0x01b4:
            r27 = 4
        L_0x01b6:
            int r28 = r13.c()
            r29 = r6
            int[] r6 = r7.f9613c0
            r30 = r14
            r14 = r6[r39]
            r31 = r2
            r2 = 3
            if (r14 != r2) goto L_0x01cf
            int[] r2 = r7.f9620l
            r2 = r2[r39]
            if (r2 != 0) goto L_0x01cf
            r2 = 1
            goto L_0x01d0
        L_0x01cf:
            r2 = 0
        L_0x01d0:
            d0.c r14 = r13.f9579d
            if (r14 == 0) goto L_0x01dc
            if (r7 == r8) goto L_0x01dc
            int r14 = r14.c()
            int r28 = r14 + r28
        L_0x01dc:
            r14 = r28
            if (r5 == 0) goto L_0x01e9
            if (r7 == r8) goto L_0x01e9
            if (r7 == r12) goto L_0x01e9
            r28 = r8
            r27 = 5
            goto L_0x01eb
        L_0x01e9:
            r28 = r8
        L_0x01eb:
            d0.c r8 = r13.f9579d
            if (r8 == 0) goto L_0x021d
            if (r7 != r12) goto L_0x01fe
            r32 = r12
            c0.i r12 = r13.f9581g
            c0.i r8 = r8.f9581g
            r33 = r1
            r1 = 6
            r10.f(r12, r8, r14, r1)
            goto L_0x020b
        L_0x01fe:
            r33 = r1
            r32 = r12
            c0.i r1 = r13.f9581g
            c0.i r8 = r8.f9581g
            r12 = 8
            r10.f(r1, r8, r14, r12)
        L_0x020b:
            if (r2 == 0) goto L_0x0211
            if (r5 != 0) goto L_0x0211
            r1 = 5
            goto L_0x0213
        L_0x0211:
            r1 = r27
        L_0x0213:
            c0.i r2 = r13.f9581g
            d0.c r8 = r13.f9579d
            c0.i r8 = r8.f9581g
            r10.e(r2, r8, r14, r1)
            goto L_0x0221
        L_0x021d:
            r33 = r1
            r32 = r12
        L_0x0221:
            d0.c[] r1 = r7.f9587F
            if (r4 == 0) goto L_0x024e
            int r2 = r7.f9603V
            r8 = 8
            if (r2 == r8) goto L_0x0240
            r2 = r6[r39]
            r6 = 3
            if (r2 != r6) goto L_0x0240
            int r2 = r15 + 1
            r2 = r1[r2]
            c0.i r2 = r2.f9581g
            r6 = r1[r15]
            c0.i r6 = r6.f9581g
            r8 = 0
            r12 = 5
            r10.f(r2, r6, r8, r12)
            goto L_0x0241
        L_0x0240:
            r8 = 0
        L_0x0241:
            r2 = r1[r15]
            c0.i r2 = r2.f9581g
            r3 = r3[r15]
            c0.i r3 = r3.f9581g
            r6 = 8
            r10.f(r2, r3, r8, r6)
        L_0x024e:
            int r2 = r15 + 1
            r1 = r1[r2]
            d0.c r1 = r1.f9579d
            if (r1 == 0) goto L_0x0264
            d0.d r1 = r1.f9577b
            d0.c[] r2 = r1.f9587F
            r2 = r2[r15]
            d0.c r2 = r2.f9579d
            if (r2 == 0) goto L_0x0264
            d0.d r2 = r2.f9577b
            if (r2 == r7) goto L_0x0266
        L_0x0264:
            r1 = r16
        L_0x0266:
            if (r1 == 0) goto L_0x026c
            r7 = r1
            r6 = r29
            goto L_0x026d
        L_0x026c:
            r6 = 1
        L_0x026d:
            r13 = r26
            r8 = r28
            r14 = r30
            r2 = r31
            r12 = r32
            r1 = r33
            goto L_0x01a5
        L_0x027b:
            r33 = r1
            r31 = r2
            r28 = r8
            r32 = r12
            r30 = r14
            if (r9 == 0) goto L_0x02e2
            d0.c[] r1 = r11.f9587F
            int r2 = r15 + 1
            r1 = r1[r2]
            d0.c r1 = r1.f9579d
            if (r1 == 0) goto L_0x02e2
            d0.c[] r1 = r9.f9587F
            r1 = r1[r2]
            int[] r6 = r9.f9613c0
            r6 = r6[r39]
            r7 = 3
            if (r6 != r7) goto L_0x02b8
            int[] r6 = r9.f9620l
            r6 = r6[r39]
            if (r6 != 0) goto L_0x02b8
            if (r5 != 0) goto L_0x02b8
            d0.c r6 = r1.f9579d
            d0.d r7 = r6.f9577b
            if (r7 != r0) goto L_0x02b8
            c0.i r7 = r1.f9581g
            c0.i r6 = r6.f9581g
            int r8 = r1.c()
            int r8 = -r8
            r12 = 5
            r10.e(r7, r6, r8, r12)
            goto L_0x02ce
        L_0x02b8:
            r12 = 5
            if (r5 == 0) goto L_0x02ce
            d0.c r6 = r1.f9579d
            d0.d r7 = r6.f9577b
            if (r7 != r0) goto L_0x02ce
            c0.i r7 = r1.f9581g
            c0.i r6 = r6.f9581g
            int r8 = r1.c()
            int r8 = -r8
            r13 = 4
            r10.e(r7, r6, r8, r13)
        L_0x02ce:
            c0.i r6 = r1.f9581g
            d0.c[] r7 = r11.f9587F
            r2 = r7[r2]
            d0.c r2 = r2.f9579d
            c0.i r2 = r2.f9581g
            int r1 = r1.c()
            int r1 = -r1
            r7 = 6
            r10.g(r6, r2, r1, r7)
            goto L_0x02e3
        L_0x02e2:
            r12 = 5
        L_0x02e3:
            if (r4 == 0) goto L_0x02fa
            int r1 = r15 + 1
            r2 = r3[r1]
            c0.i r2 = r2.f9581g
            d0.c[] r3 = r11.f9587F
            r1 = r3[r1]
            c0.i r3 = r1.f9581g
            int r1 = r1.c()
            r4 = 8
            r10.f(r2, r3, r1, r4)
        L_0x02fa:
            r1 = r33
            java.util.ArrayList r2 = r1.f9567h
            if (r2 == 0) goto L_0x040d
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x040d
            boolean r6 = r1.f9572n
            if (r6 == 0) goto L_0x0313
            boolean r6 = r1.f9574p
            if (r6 != 0) goto L_0x0313
            int r6 = r1.f9568j
            float r6 = (float) r6
            goto L_0x0315
        L_0x0313:
            r6 = r25
        L_0x0315:
            r13 = r16
            r7 = 0
            r8 = 0
        L_0x0319:
            if (r8 >= r3) goto L_0x040d
            java.lang.Object r14 = r2.get(r8)
            d0.d r14 = (d0.d) r14
            float[] r4 = r14.f9607Z
            r4 = r4[r39]
            d0.c[] r12 = r14.f9587F
            r20 = 0
            int r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r23 >= 0) goto L_0x034a
            boolean r4 = r1.f9574p
            if (r4 == 0) goto L_0x0343
            int r0 = r15 + 1
            r0 = r12[r0]
            c0.i r0 = r0.f9581g
            r4 = r12[r15]
            c0.i r4 = r4.f9581g
            r12 = 0
            r14 = 4
            r10.e(r0, r4, r12, r14)
            r23 = 4
            goto L_0x0361
        L_0x0343:
            r23 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0347:
            r20 = 0
            goto L_0x034d
        L_0x034a:
            r23 = 4
            goto L_0x0347
        L_0x034d:
            int r25 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r25 != 0) goto L_0x036b
            int r0 = r15 + 1
            r0 = r12[r0]
            c0.i r0 = r0.f9581g
            r4 = r12[r15]
            c0.i r4 = r4.f9581g
            r12 = 0
            r14 = 8
            r10.e(r0, r4, r12, r14)
        L_0x0361:
            r20 = r1
            r29 = r2
            r27 = r3
            r18 = 0
            goto L_0x03ff
        L_0x036b:
            r18 = 0
            if (r13 == 0) goto L_0x03f4
            d0.c[] r13 = r13.f9587F
            r0 = r13[r15]
            c0.i r0 = r0.f9581g
            int r27 = r15 + 1
            r13 = r13[r27]
            c0.i r13 = r13.f9581g
            r29 = r2
            r2 = r12[r15]
            c0.i r2 = r2.f9581g
            r12 = r12[r27]
            c0.i r12 = r12.f9581g
            r27 = r3
            c0.c r3 = r38.k()
            r33 = r14
            r14 = 0
            r3.f8716b = r14
            r20 = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r34 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r34 == 0) goto L_0x039c
            int r34 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r34 != 0) goto L_0x039f
        L_0x039c:
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03dc
        L_0x039f:
            int r34 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r34 != 0) goto L_0x03b0
            c0.b r2 = r3.f8718d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.i(r0, r7)
            c0.b r0 = r3.f8718d
            r0.i(r13, r1)
            goto L_0x03f0
        L_0x03b0:
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r25 != 0) goto L_0x03bf
            c0.b r0 = r3.f8718d
            r0.i(r2, r14)
            c0.b r0 = r3.f8718d
            r0.i(r12, r1)
            goto L_0x03f0
        L_0x03bf:
            float r7 = r7 / r6
            float r25 = r4 / r6
            float r7 = r7 / r25
            c0.b r1 = r3.f8718d
            r1.i(r0, r14)
            c0.b r0 = r3.f8718d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.i(r13, r1)
            c0.b r0 = r3.f8718d
            r0.i(r12, r7)
            c0.b r0 = r3.f8718d
            float r1 = -r7
            r0.i(r2, r1)
            goto L_0x03f0
        L_0x03dc:
            c0.b r7 = r3.f8718d
            r7.i(r0, r14)
            c0.b r0 = r3.f8718d
            r0.i(r13, r1)
            c0.b r0 = r3.f8718d
            r0.i(r12, r14)
            c0.b r0 = r3.f8718d
            r0.i(r2, r1)
        L_0x03f0:
            r10.c(r3)
            goto L_0x03fc
        L_0x03f4:
            r20 = r1
            r29 = r2
            r27 = r3
            r33 = r14
        L_0x03fc:
            r7 = r4
            r13 = r33
        L_0x03ff:
            int r8 = r8 + 1
            r4 = 1
            r12 = 5
            r0 = r37
            r1 = r20
            r3 = r27
            r2 = r29
            goto L_0x0319
        L_0x040d:
            r20 = r1
            r18 = 0
            r23 = 4
            if (r32 == 0) goto L_0x047f
            r0 = r32
            if (r0 == r9) goto L_0x041b
            if (r5 == 0) goto L_0x041e
        L_0x041b:
            r8 = r28
            goto L_0x0425
        L_0x041e:
            r14 = r9
            r12 = r24
            r8 = r28
            goto L_0x0486
        L_0x0425:
            d0.c[] r1 = r8.f9587F
            r1 = r1[r15]
            d0.c[] r2 = r11.f9587F
            int r3 = r15 + 1
            r2 = r2[r3]
            d0.c r1 = r1.f9579d
            if (r1 == 0) goto L_0x0437
            c0.i r1 = r1.f9581g
            r4 = r1
            goto L_0x0439
        L_0x0437:
            r4 = r16
        L_0x0439:
            d0.c r1 = r2.f9579d
            if (r1 == 0) goto L_0x0441
            c0.i r1 = r1.f9581g
            r6 = r1
            goto L_0x0443
        L_0x0441:
            r6 = r16
        L_0x0443:
            d0.c[] r1 = r0.f9587F
            r1 = r1[r15]
            d0.c[] r2 = r9.f9587F
            r2 = r2[r3]
            if (r4 == 0) goto L_0x0478
            if (r6 == 0) goto L_0x0478
            if (r39 != 0) goto L_0x0457
            r3 = r31
            float r3 = r3.f9600S
        L_0x0455:
            r5 = r3
            goto L_0x045c
        L_0x0457:
            r3 = r31
            float r3 = r3.f9601T
            goto L_0x0455
        L_0x045c:
            int r7 = r1.c()
            int r8 = r2.c()
            c0.i r3 = r1.f9581g
            c0.i r12 = r2.f9581g
            r13 = 7
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r7
            r14 = 2
            r7 = r12
            r14 = r9
            r12 = r24
            r9 = r13
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x047b
        L_0x0478:
            r14 = r9
            r12 = r24
        L_0x047b:
            r22 = r12
            goto L_0x06b7
        L_0x047f:
            r14 = r9
            r12 = r24
            r8 = r28
            r0 = r32
        L_0x0486:
            if (r19 == 0) goto L_0x0585
            if (r0 == 0) goto L_0x0585
            r1 = r20
            int r2 = r1.f9568j
            if (r2 <= 0) goto L_0x0497
            int r1 = r1.i
            if (r1 != r2) goto L_0x0497
            r21 = 1
            goto L_0x0499
        L_0x0497:
            r21 = 0
        L_0x0499:
            r9 = r0
            r13 = r9
        L_0x049b:
            if (r13 == 0) goto L_0x047b
            d0.d[] r1 = r13.f9611b0
            r1 = r1[r39]
            r7 = r1
        L_0x04a2:
            if (r7 == 0) goto L_0x04af
            int r1 = r7.f9603V
            r6 = 8
            if (r1 != r6) goto L_0x04b1
            d0.d[] r1 = r7.f9611b0
            r7 = r1[r39]
            goto L_0x04a2
        L_0x04af:
            r6 = 8
        L_0x04b1:
            if (r7 != 0) goto L_0x04be
            if (r13 != r14) goto L_0x04b6
            goto L_0x04be
        L_0x04b6:
            r22 = r7
            r35 = r8
            r20 = r9
            goto L_0x0575
        L_0x04be:
            d0.c[] r1 = r13.f9587F
            r2 = r1[r15]
            c0.i r3 = r2.f9581g
            d0.c r4 = r2.f9579d
            if (r4 == 0) goto L_0x04cb
            c0.i r4 = r4.f9581g
            goto L_0x04cd
        L_0x04cb:
            r4 = r16
        L_0x04cd:
            if (r9 == r13) goto L_0x04d8
            d0.c[] r4 = r9.f9587F
            int r5 = r15 + 1
            r4 = r4[r5]
            c0.i r4 = r4.f9581g
            goto L_0x04e9
        L_0x04d8:
            if (r13 != r0) goto L_0x04e9
            if (r9 != r13) goto L_0x04e9
            d0.c[] r4 = r8.f9587F
            r4 = r4[r15]
            d0.c r4 = r4.f9579d
            if (r4 == 0) goto L_0x04e7
            c0.i r4 = r4.f9581g
            goto L_0x04e9
        L_0x04e7:
            r4 = r16
        L_0x04e9:
            int r2 = r2.c()
            int r5 = r15 + 1
            r20 = r1[r5]
            int r20 = r20.c()
            if (r7 == 0) goto L_0x0506
            d0.c[] r6 = r7.f9587F
            r6 = r6[r15]
            r23 = r7
            c0.i r7 = r6.f9581g
            r1 = r1[r5]
            c0.i r1 = r1.f9581g
        L_0x0503:
            r24 = r1
            goto L_0x051a
        L_0x0506:
            r23 = r7
            d0.c[] r6 = r11.f9587F
            r6 = r6[r5]
            d0.c r6 = r6.f9579d
            if (r6 == 0) goto L_0x0513
            c0.i r7 = r6.f9581g
            goto L_0x0515
        L_0x0513:
            r7 = r16
        L_0x0515:
            r1 = r1[r5]
            c0.i r1 = r1.f9581g
            goto L_0x0503
        L_0x051a:
            if (r6 == 0) goto L_0x0522
            int r1 = r6.c()
            int r20 = r1 + r20
        L_0x0522:
            if (r9 == 0) goto L_0x052d
            d0.c[] r1 = r9.f9587F
            r1 = r1[r5]
            int r1 = r1.c()
            int r2 = r2 + r1
        L_0x052d:
            if (r3 == 0) goto L_0x056f
            if (r4 == 0) goto L_0x056f
            if (r7 == 0) goto L_0x056f
            if (r24 == 0) goto L_0x056f
            if (r13 != r0) goto L_0x0541
            d0.c[] r1 = r0.f9587F
            r1 = r1[r15]
            int r1 = r1.c()
            r6 = r1
            goto L_0x0542
        L_0x0541:
            r6 = r2
        L_0x0542:
            if (r13 != r14) goto L_0x054e
            d0.c[] r1 = r14.f9587F
            r1 = r1[r5]
            int r1 = r1.c()
            r20 = r1
        L_0x054e:
            if (r21 == 0) goto L_0x0553
            r25 = 8
            goto L_0x0555
        L_0x0553:
            r25 = 5
        L_0x0555:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r6
            r22 = 8
            r6 = r7
            r22 = r23
            r7 = r24
            r35 = r8
            r8 = r20
            r20 = r9
            r9 = r25
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0575
        L_0x056f:
            r35 = r8
            r20 = r9
            r22 = r23
        L_0x0575:
            int r1 = r13.f9603V
            r9 = 8
            if (r1 == r9) goto L_0x057c
            goto L_0x057e
        L_0x057c:
            r13 = r20
        L_0x057e:
            r9 = r13
            r13 = r22
            r8 = r35
            goto L_0x049b
        L_0x0585:
            r35 = r8
            r1 = r20
            r9 = 8
            if (r17 == 0) goto L_0x047b
            if (r0 == 0) goto L_0x047b
            int r2 = r1.f9568j
            if (r2 <= 0) goto L_0x059a
            int r1 = r1.i
            if (r1 != r2) goto L_0x059a
            r21 = 1
            goto L_0x059c
        L_0x059a:
            r21 = 0
        L_0x059c:
            r8 = r0
            r13 = r8
        L_0x059e:
            if (r13 == 0) goto L_0x0657
            d0.d[] r1 = r13.f9611b0
            r1 = r1[r39]
        L_0x05a4:
            if (r1 == 0) goto L_0x05af
            int r2 = r1.f9603V
            if (r2 != r9) goto L_0x05af
            d0.d[] r1 = r1.f9611b0
            r1 = r1[r39]
            goto L_0x05a4
        L_0x05af:
            if (r13 == r0) goto L_0x0642
            if (r13 == r14) goto L_0x0642
            if (r1 == 0) goto L_0x0642
            if (r1 != r14) goto L_0x05ba
            r7 = r16
            goto L_0x05bb
        L_0x05ba:
            r7 = r1
        L_0x05bb:
            d0.c[] r1 = r13.f9587F
            r2 = r1[r15]
            c0.i r3 = r2.f9581g
            d0.c[] r4 = r8.f9587F
            int r5 = r15 + 1
            r4 = r4[r5]
            c0.i r4 = r4.f9581g
            int r2 = r2.c()
            r6 = r1[r5]
            int r6 = r6.c()
            if (r7 == 0) goto L_0x05e7
            d0.c[] r1 = r7.f9587F
            r1 = r1[r15]
            c0.i r9 = r1.f9581g
            r20 = r7
            d0.c r7 = r1.f9579d
            if (r7 == 0) goto L_0x05e4
            c0.i r7 = r7.f9581g
            goto L_0x05fd
        L_0x05e4:
            r7 = r16
            goto L_0x05fd
        L_0x05e7:
            r20 = r7
            d0.c[] r7 = r14.f9587F
            r7 = r7[r15]
            if (r7 == 0) goto L_0x05f2
            c0.i r9 = r7.f9581g
            goto L_0x05f4
        L_0x05f2:
            r9 = r16
        L_0x05f4:
            r1 = r1[r5]
            c0.i r1 = r1.f9581g
            r36 = r7
            r7 = r1
            r1 = r36
        L_0x05fd:
            if (r1 == 0) goto L_0x0607
            int r1 = r1.c()
            int r1 = r1 + r6
            r22 = r1
            goto L_0x0609
        L_0x0607:
            r22 = r6
        L_0x0609:
            d0.c[] r1 = r8.f9587F
            r1 = r1[r5]
            int r1 = r1.c()
            int r5 = r1 + r2
            if (r21 == 0) goto L_0x0618
            r24 = 8
            goto L_0x061a
        L_0x0618:
            r24 = 4
        L_0x061a:
            if (r3 == 0) goto L_0x0639
            if (r4 == 0) goto L_0x0639
            if (r9 == 0) goto L_0x0639
            if (r7 == 0) goto L_0x0639
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r25 = r8
            r8 = r22
            r22 = r12
            r12 = 8
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x063f
        L_0x0639:
            r25 = r8
            r22 = r12
            r12 = 8
        L_0x063f:
            r1 = r20
            goto L_0x0648
        L_0x0642:
            r25 = r8
            r22 = r12
            r12 = 8
        L_0x0648:
            int r2 = r13.f9603V
            if (r2 == r12) goto L_0x064e
            r8 = r13
            goto L_0x0650
        L_0x064e:
            r8 = r25
        L_0x0650:
            r13 = r1
            r12 = r22
            r9 = 8
            goto L_0x059e
        L_0x0657:
            r22 = r12
            d0.c[] r1 = r0.f9587F
            r1 = r1[r15]
            r2 = r35
            d0.c[] r2 = r2.f9587F
            r2 = r2[r15]
            d0.c r2 = r2.f9579d
            d0.c[] r3 = r14.f9587F
            int r4 = r15 + 1
            r12 = r3[r4]
            d0.c[] r3 = r11.f9587F
            r3 = r3[r4]
            d0.c r13 = r3.f9579d
            r9 = 5
            if (r2 == 0) goto L_0x0681
            if (r0 == r14) goto L_0x0684
            c0.i r3 = r1.f9581g
            c0.i r2 = r2.f9581g
            int r1 = r1.c()
            r10.e(r3, r2, r1, r9)
        L_0x0681:
            r20 = 5
            goto L_0x06a6
        L_0x0684:
            if (r13 == 0) goto L_0x0681
            c0.i r3 = r1.f9581g
            c0.i r4 = r2.f9581g
            int r5 = r1.c()
            c0.i r6 = r12.f9581g
            c0.i r7 = r13.f9581g
            int r8 = r12.c()
            r20 = 1056964608(0x3f000000, float:0.5)
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r20
            r20 = 5
            r9 = r20
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x06a6:
            if (r13 == 0) goto L_0x06b7
            if (r0 == r14) goto L_0x06b7
            c0.i r1 = r12.f9581g
            c0.i r2 = r13.f9581g
            int r3 = r12.c()
            int r3 = -r3
            r4 = 5
            r10.e(r1, r2, r3, r4)
        L_0x06b7:
            if (r19 != 0) goto L_0x06bb
            if (r17 == 0) goto L_0x070e
        L_0x06bb:
            if (r0 == 0) goto L_0x070e
            if (r0 == r14) goto L_0x070e
            d0.c[] r1 = r0.f9587F
            r2 = r1[r15]
            d0.c[] r3 = r14.f9587F
            int r4 = r15 + 1
            r3 = r3[r4]
            d0.c r5 = r2.f9579d
            if (r5 == 0) goto L_0x06d0
            c0.i r5 = r5.f9581g
            goto L_0x06d2
        L_0x06d0:
            r5 = r16
        L_0x06d2:
            d0.c r6 = r3.f9579d
            if (r6 == 0) goto L_0x06d9
            c0.i r6 = r6.f9581g
            goto L_0x06db
        L_0x06d9:
            r6 = r16
        L_0x06db:
            if (r11 == r14) goto L_0x06eb
            d0.c[] r6 = r11.f9587F
            r6 = r6[r4]
            d0.c r6 = r6.f9579d
            if (r6 == 0) goto L_0x06e9
            c0.i r6 = r6.f9581g
            r16 = r6
        L_0x06e9:
            r6 = r16
        L_0x06eb:
            if (r0 != r14) goto L_0x06ef
            r3 = r1[r4]
        L_0x06ef:
            if (r5 == 0) goto L_0x070e
            if (r6 == 0) goto L_0x070e
            int r0 = r2.c()
            d0.c[] r1 = r14.f9587F
            r1 = r1[r4]
            int r8 = r1.c()
            c0.i r2 = r2.f9581g
            c0.i r7 = r3.f9581g
            r9 = 5
            r11 = 1056964608(0x3f000000, float:0.5)
            r1 = r38
            r3 = r5
            r4 = r0
            r5 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x070e:
            int r9 = r22 + 1
            r11 = 2
            r0 = r37
            r13 = r26
            r14 = r30
            goto L_0x0017
        L_0x0719:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.j.a(d0.e, c0.e, int):void");
    }
}
