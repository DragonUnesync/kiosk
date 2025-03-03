package f4;

import M0.C0120h;
import M3.n;
import S3.b;
import Z1.c;
import e4.C0839a;
import java.util.Arrays;
import n2.a;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final c f11685a = new c(24);

    public static C0901b a(d dVar) {
        int[] iArr;
        n nVar;
        n nVar2;
        n nVar3;
        n nVar4;
        n nVar5;
        n nVar6;
        n nVar7;
        n nVar8;
        int i;
        int i8;
        d dVar2 = dVar;
        if (dVar2 == null) {
            return null;
        }
        C0120h Z7 = dVar.Z();
        int i9 = 0;
        C0120h[] hVarArr = (C0120h[]) dVar2.f10051W;
        boolean z = dVar2.f11683Z;
        C0901b bVar = (C0901b) dVar2.f10050V;
        if (Z7 == null) {
            iArr = null;
        } else {
            if (z) {
                nVar7 = bVar.f11674b;
            } else {
                nVar7 = bVar.f11676d;
            }
            if (z) {
                nVar8 = bVar.f11675c;
            } else {
                nVar8 = bVar.e;
            }
            int D8 = dVar2.D((int) nVar7.f3165b);
            int D9 = dVar2.D((int) nVar8.f3165b);
            int i10 = -1;
            int i11 = 0;
            int i12 = 1;
            while (true) {
                i = Z7.f2951f;
                if (D8 >= D9) {
                    break;
                }
                C0120h hVar = hVarArr[D8];
                if (hVar != null) {
                    hVar.j();
                    int i13 = hVar.f2951f;
                    int i14 = i13 - i10;
                    if (i14 == 0) {
                        i11++;
                    } else {
                        if (i14 == 1) {
                            i12 = Math.max(i12, i11);
                            i10 = hVar.f2951f;
                        } else if (i13 >= i) {
                            hVarArr[D8] = null;
                        } else {
                            i10 = i13;
                        }
                        i11 = 1;
                    }
                }
                D8++;
            }
            iArr = new int[i];
            for (C0120h hVar2 : hVarArr) {
                if (hVar2 != null && (i8 = hVar2.f2951f) < i) {
                    iArr[i8] = iArr[i8] + 1;
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        int i15 = -1;
        for (int max : iArr) {
            i15 = Math.max(i15, max);
        }
        int i16 = 0;
        for (int i17 : iArr) {
            i16 += i15 - i17;
            if (i17 > 0) {
                break;
            }
        }
        int i18 = 0;
        while (i16 > 0 && hVarArr[i18] == null) {
            i16--;
            i18++;
        }
        int i19 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i20 = iArr[length];
            i19 += i15 - i20;
            if (i20 > 0) {
                break;
            }
        }
        int length2 = hVarArr.length - 1;
        while (i19 > 0 && hVarArr[length2] == null) {
            i19--;
            length2--;
        }
        n nVar9 = bVar.f11674b;
        n nVar10 = bVar.f11676d;
        if (i16 > 0) {
            if (z) {
                nVar6 = nVar9;
            } else {
                nVar6 = nVar10;
            }
            int i21 = ((int) nVar6.f3165b) - i16;
            if (i21 >= 0) {
                i9 = i21;
            }
            n nVar11 = new n(nVar6.f3164a, (float) i9);
            if (z) {
                nVar = nVar10;
                nVar2 = nVar11;
            } else {
                nVar2 = nVar9;
                nVar = nVar11;
            }
        } else {
            nVar2 = nVar9;
            nVar = nVar10;
        }
        n nVar12 = bVar.f11675c;
        n nVar13 = bVar.e;
        if (i19 > 0) {
            if (z) {
                nVar5 = nVar12;
            } else {
                nVar5 = nVar13;
            }
            int i22 = ((int) nVar5.f3165b) + i19;
            int i23 = bVar.f11673a.f4506V;
            if (i22 >= i23) {
                i22 = i23 - 1;
            }
            n nVar14 = new n(nVar5.f3164a, (float) i22);
            if (z) {
                nVar3 = nVar13;
                nVar4 = nVar14;
            } else {
                nVar4 = nVar12;
                nVar3 = nVar14;
            }
        } else {
            nVar4 = nVar12;
            nVar3 = nVar13;
        }
        return new C0901b(bVar.f11673a, nVar2, nVar4, nVar, nVar3);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, e4.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0413, code lost:
        r9 = new java.io.ByteArrayOutputStream();
        r12 = 928;
        r13 = 900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0421, code lost:
        if (r5 == 901) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0425, code lost:
        if (r5 == 924) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x042a, code lost:
        r21 = 0;
        r5 = false;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0432, code lost:
        if (r11 >= r0[0]) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0434, code lost:
        if (r5 != false) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0436, code lost:
        r16 = r11 + 1;
        r8 = r0[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x043b, code lost:
        if (r8 >= 900) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x043d, code lost:
        r10 = r10 + 1;
        r21 = (r21 * r13) + ((long) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0443, code lost:
        r11 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0446, code lost:
        if (r8 == r12) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0448, code lost:
        switch(r8) {
            case 900: goto L_0x044f;
            case 901: goto L_0x044f;
            case 902: goto L_0x044f;
            default: goto L_0x044b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x044b, code lost:
        switch(r8) {
            case 922: goto L_0x044f;
            case 923: goto L_0x044f;
            case 924: goto L_0x044f;
            default: goto L_0x044e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x044f, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0452, code lost:
        if ((r10 % 5) != 0) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0454, code lost:
        if (r10 <= 0) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0456, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0457, code lost:
        if (r7 >= 6) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0459, code lost:
        r9.write((byte) ((int) (r21 >> ((5 - r7) * 8))));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x046b, code lost:
        r21 = 0;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0471, code lost:
        r12 = 928;
        r13 = 900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0479, code lost:
        r5 = new int[6];
        r12 = r11 + 1;
        r11 = r0[r11];
        r13 = 0;
        r7 = 0;
        r10 = 0;
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0488, code lost:
        r6 = r0[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x048a, code lost:
        if (r12 >= r6) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x048c, code lost:
        if (r17 != false) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x048e, code lost:
        r6 = r7 + 1;
        r5[r7] = r11;
        r13 = (r13 * 900) + ((long) r11);
        r7 = r12 + 1;
        r11 = r0[r12];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x049e, code lost:
        if (r11 == 928) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04a0, code lost:
        switch(r11) {
            case 900: goto L_0x04cf;
            case 901: goto L_0x04cf;
            case 902: goto L_0x04cf;
            default: goto L_0x04a3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04a3, code lost:
        switch(r11) {
            case 922: goto L_0x04cf;
            case 923: goto L_0x04cf;
            case 924: goto L_0x04cf;
            default: goto L_0x04a6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04a8, code lost:
        if ((r6 % 5) != 0) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04aa, code lost:
        if (r6 <= 0) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04ac, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04ad, code lost:
        if (r6 >= 6) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04af, code lost:
        r9 = r9;
        r9.write((byte) ((int) (r13 >> ((5 - r6) * 8))));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04c3, code lost:
        r12 = r7;
        r13 = 0;
        r7 = 0;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04ca, code lost:
        r12 = r7;
        r10 = 0;
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04cf, code lost:
        r7 = r6;
        r10 = 0;
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04d5, code lost:
        if (r12 != r6) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04d9, code lost:
        if (r11 >= 900) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04db, code lost:
        r6 = 1;
        r5[r7] = r11;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04e2, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04e3, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04e4, code lost:
        if (r8 >= r7) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04e6, code lost:
        r9.write((byte) r5[r8]);
        r8 = r8 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04ee, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04ef, code lost:
        r2.append(new java.lang.String(r9.toByteArray(), r3));
        r5 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static S3.d b(int[] r25, int r26, int[] r27) {
        /*
            r0 = r25
            r1 = r27
            r2 = 0
            r3 = -1
            r4 = 2
            r5 = 1
            int r6 = r0.length
            if (r6 == 0) goto L_0x055e
            int r6 = r26 + 1
            int r6 = r5 << r6
            int r7 = r1.length
            int r8 = r6 / 2
            int r8 = r8 + 3
            if (r7 > r8) goto L_0x0559
            if (r6 < 0) goto L_0x0559
            r7 = 512(0x200, float:7.175E-43)
            if (r6 > r7) goto L_0x0559
            Z1.c r7 = f11685a
            r7.getClass()
            int r8 = r0.length
            if (r8 == 0) goto L_0x0553
            int r8 = r0.length
            if (r8 <= r5) goto L_0x0043
            r9 = r0[r2]
            if (r9 != 0) goto L_0x0043
            r9 = 1
        L_0x002c:
            if (r9 >= r8) goto L_0x0034
            r10 = r0[r9]
            if (r10 != 0) goto L_0x0034
            int r9 = r9 + r5
            goto L_0x002c
        L_0x0034:
            if (r9 != r8) goto L_0x003b
            int[] r8 = new int[]{r2}
            goto L_0x0044
        L_0x003b:
            int r8 = r8 - r9
            int[] r10 = new int[r8]
            java.lang.System.arraycopy(r0, r9, r10, r2, r8)
            r8 = r10
            goto L_0x0044
        L_0x0043:
            r8 = r0
        L_0x0044:
            int[] r9 = new int[r6]
            r10 = r6
            r11 = 0
        L_0x0048:
            java.lang.Object r12 = r7.f6955V
            g4.a r12 = (g4.C0961a) r12
            if (r10 <= 0) goto L_0x008a
            int[] r13 = r12.f12015a
            r13 = r13[r10]
            if (r13 != 0) goto L_0x0059
            int r12 = r8.length
            int r12 = r12 - r5
            r12 = r8[r12]
            goto L_0x007f
        L_0x0059:
            if (r13 != r5) goto L_0x006b
            int r13 = r8.length
            r14 = 0
            r15 = 0
        L_0x005e:
            if (r15 >= r13) goto L_0x0069
            r4 = r8[r15]
            int r14 = r12.a(r14, r4)
            int r15 = r15 + r5
            r4 = 2
            goto L_0x005e
        L_0x0069:
            r12 = r14
            goto L_0x007f
        L_0x006b:
            r4 = r8[r2]
            int r14 = r8.length
            r15 = 1
        L_0x006f:
            if (r15 >= r14) goto L_0x007e
            int r4 = r12.c(r13, r4)
            r2 = r8[r15]
            int r4 = r12.a(r4, r2)
            int r15 = r15 + r5
            r2 = 0
            goto L_0x006f
        L_0x007e:
            r12 = r4
        L_0x007f:
            int r2 = r6 - r10
            r9[r2] = r12
            if (r12 == 0) goto L_0x0086
            r11 = 1
        L_0x0086:
            int r10 = r10 + r3
            r2 = 0
            r4 = 2
            goto L_0x0048
        L_0x008a:
            if (r11 != 0) goto L_0x008e
            goto L_0x02ad
        L_0x008e:
            de.ozerov.fully.K2 r2 = r12.f12018d
            int r4 = r1.length
            r7 = 0
        L_0x0092:
            r8 = 929(0x3a1, float:1.302E-42)
            if (r7 >= r4) goto L_0x00b1
            r10 = r1[r7]
            int r11 = r0.length
            int r11 = r11 - r5
            int r11 = r11 - r10
            int[] r10 = r12.f12015a
            r10 = r10[r11]
            de.ozerov.fully.K2 r11 = new de.ozerov.fully.K2
            int r10 = 929 - r10
            int r10 = r10 % r8
            int[] r8 = new int[]{r10, r5}
            r11.<init>((g4.C0961a) r12, (int[]) r8)
            de.ozerov.fully.K2 r2 = r2.H(r11)
            int r7 = r7 + r5
            goto L_0x0092
        L_0x00b1:
            de.ozerov.fully.K2 r1 = new de.ozerov.fully.K2
            r1.<init>((g4.C0961a) r12, (int[]) r9)
            if (r6 < 0) goto L_0x054d
            int r2 = r6 + 1
            int[] r2 = new int[r2]
            r4 = 0
            r2[r4] = r5
            de.ozerov.fully.K2 r4 = new de.ozerov.fully.K2
            r4.<init>((g4.C0961a) r12, (int[]) r2)
            int r2 = r4.A()
            int r7 = r1.A()
            if (r2 >= r7) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            r24 = r4
            r4 = r1
            r1 = r24
        L_0x00d4:
            de.ozerov.fully.K2 r2 = r12.f12017c
            de.ozerov.fully.K2 r7 = r12.f12018d
            r9 = r2
        L_0x00d9:
            r24 = r4
            r4 = r1
            r1 = r24
            int r10 = r1.A()
            r11 = 2
            int r13 = r6 / 2
            if (r10 < r13) goto L_0x01b7
            boolean r10 = r1.F()
            if (r10 != 0) goto L_0x01b2
            int r10 = r1.A()
            int r10 = r1.y(r10)
            int r10 = r12.b(r10)
            r11 = r2
        L_0x00fa:
            int r13 = r4.A()
            int r14 = r1.A()
            if (r13 < r14) goto L_0x017c
            boolean r13 = r4.F()
            if (r13 != 0) goto L_0x017c
            int r13 = r4.A()
            int r14 = r1.A()
            int r13 = r13 - r14
            int r14 = r4.A()
            int r14 = r4.y(r14)
            int r14 = r12.c(r14, r10)
            if (r13 < 0) goto L_0x0176
            if (r14 != 0) goto L_0x0125
            r3 = r2
            goto L_0x0132
        L_0x0125:
            int r15 = r13 + 1
            int[] r15 = new int[r15]
            r17 = 0
            r15[r17] = r14
            de.ozerov.fully.K2 r3 = new de.ozerov.fully.K2
            r3.<init>((g4.C0961a) r12, (int[]) r15)
        L_0x0132:
            de.ozerov.fully.K2 r11 = r11.j(r3)
            if (r13 < 0) goto L_0x0170
            java.lang.Object r3 = r1.f10050V
            g4.a r3 = (g4.C0961a) r3
            if (r14 != 0) goto L_0x0143
            de.ozerov.fully.K2 r3 = r3.f12017c
            r27 = r2
            goto L_0x0165
        L_0x0143:
            java.lang.Object r15 = r1.f10051W
            int[] r15 = (int[]) r15
            int r8 = r15.length
            int r13 = r13 + r8
            int[] r13 = new int[r13]
            r5 = 0
        L_0x014c:
            if (r5 >= r8) goto L_0x015d
            r27 = r2
            r2 = r15[r5]
            int r2 = r3.c(r2, r14)
            r13[r5] = r2
            r2 = 1
            int r5 = r5 + r2
            r2 = r27
            goto L_0x014c
        L_0x015d:
            r27 = r2
            de.ozerov.fully.K2 r2 = new de.ozerov.fully.K2
            r2.<init>((g4.C0961a) r3, (int[]) r13)
            r3 = r2
        L_0x0165:
            de.ozerov.fully.K2 r4 = r4.V(r3)
            r2 = r27
            r3 = -1
            r5 = 1
            r8 = 929(0x3a1, float:1.302E-42)
            goto L_0x00fa
        L_0x0170:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0176:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x017c:
            r27 = r2
            de.ozerov.fully.K2 r2 = r11.H(r7)
            de.ozerov.fully.K2 r2 = r2.V(r9)
            java.lang.Object r3 = r2.f10051W
            int[] r3 = (int[]) r3
            int r5 = r3.length
            int[] r8 = new int[r5]
            r9 = 0
        L_0x018e:
            java.lang.Object r10 = r2.f10050V
            g4.a r10 = (g4.C0961a) r10
            if (r9 >= r5) goto L_0x01a3
            r11 = r3[r9]
            r10.getClass()
            r10 = 929(0x3a1, float:1.302E-42)
            int r11 = 929 - r11
            int r11 = r11 % r10
            r8[r9] = r11
            r10 = 1
            int r9 = r9 + r10
            goto L_0x018e
        L_0x01a3:
            de.ozerov.fully.K2 r2 = new de.ozerov.fully.K2
            r2.<init>((g4.C0961a) r10, (int[]) r8)
            r9 = r7
            r3 = -1
            r5 = 1
            r8 = 929(0x3a1, float:1.302E-42)
            r7 = r2
            r2 = r27
            goto L_0x00d9
        L_0x01b2:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x01b7:
            r2 = 0
            int r3 = r7.y(r2)
            if (r3 == 0) goto L_0x0548
            int r3 = r12.b(r3)
            de.ozerov.fully.K2 r4 = r7.G(r3)
            de.ozerov.fully.K2 r1 = r1.G(r3)
            r3 = 2
            de.ozerov.fully.K2[] r5 = new de.ozerov.fully.K2[r3]
            r5[r2] = r4
            r20 = 1
            r5[r20] = r1
            r1 = r5[r2]
            r2 = r5[r20]
            int r3 = r1.A()
            int[] r4 = new int[r3]
            r5 = 0
            r7 = 1
            r8 = 929(0x3a1, float:1.302E-42)
        L_0x01e1:
            if (r7 >= r8) goto L_0x01fa
            if (r5 >= r3) goto L_0x01fa
            int r8 = r1.t(r7)
            if (r8 != 0) goto L_0x01f3
            int r8 = r12.b(r7)
            r4[r5] = r8
            int r5 = r5 + 1
        L_0x01f3:
            int r7 = r7 + 1
            r8 = 929(0x3a1, float:1.302E-42)
            r20 = 1
            goto L_0x01e1
        L_0x01fa:
            if (r5 != r3) goto L_0x0543
            int r5 = r1.A()
            int[] r7 = new int[r5]
            r8 = 1
        L_0x0203:
            if (r8 > r5) goto L_0x0214
            int r9 = r5 - r8
            int r10 = r1.y(r8)
            int r10 = r12.c(r8, r10)
            r7[r9] = r10
            r9 = 1
            int r8 = r8 + r9
            goto L_0x0203
        L_0x0214:
            r9 = 1
            if (r5 == 0) goto L_0x053d
            if (r5 <= r9) goto L_0x0235
            r1 = 0
            r8 = r7[r1]
            if (r8 != 0) goto L_0x0235
            r8 = 1
        L_0x021f:
            if (r8 >= r5) goto L_0x0227
            r10 = r7[r8]
            if (r10 != 0) goto L_0x0227
            int r8 = r8 + r9
            goto L_0x021f
        L_0x0227:
            if (r8 != r5) goto L_0x022e
            int[] r7 = new int[]{r1}
            goto L_0x0235
        L_0x022e:
            int r5 = r5 - r8
            int[] r9 = new int[r5]
            java.lang.System.arraycopy(r7, r8, r9, r1, r5)
            r7 = r9
        L_0x0235:
            int[] r1 = new int[r3]
            r5 = 0
        L_0x0238:
            if (r5 >= r3) goto L_0x0282
            r8 = r4[r5]
            int r8 = r12.b(r8)
            int r9 = r2.t(r8)
            r10 = 929(0x3a1, float:1.302E-42)
            int r9 = 929 - r9
            int r9 = r9 % r10
            if (r8 != 0) goto L_0x0251
            int r8 = r7.length
            r10 = 1
            int r8 = r8 - r10
            r8 = r7[r8]
            goto L_0x0276
        L_0x0251:
            r10 = 1
            if (r8 != r10) goto L_0x0263
            int r8 = r7.length
            r11 = 0
            r13 = 0
        L_0x0257:
            if (r11 >= r8) goto L_0x0261
            r14 = r7[r11]
            int r13 = r12.a(r13, r14)
            int r11 = r11 + r10
            goto L_0x0257
        L_0x0261:
            r8 = r13
            goto L_0x0276
        L_0x0263:
            r11 = 0
            r13 = r7[r11]
            int r11 = r7.length
            r14 = 1
        L_0x0268:
            if (r14 >= r11) goto L_0x0261
            int r13 = r12.c(r8, r13)
            r15 = r7[r14]
            int r13 = r12.a(r13, r15)
            int r14 = r14 + r10
            goto L_0x0268
        L_0x0276:
            int r8 = r12.b(r8)
            int r8 = r12.c(r9, r8)
            r1[r5] = r8
            int r5 = r5 + r10
            goto L_0x0238
        L_0x0282:
            r10 = 1
            r2 = 0
        L_0x0284:
            if (r2 >= r3) goto L_0x02ad
            int r5 = r0.length
            int r5 = r5 - r10
            r7 = r4[r2]
            if (r7 == 0) goto L_0x02a7
            int[] r8 = r12.f12016b
            r7 = r8[r7]
            int r5 = r5 - r7
            if (r5 < 0) goto L_0x02a2
            r7 = r0[r5]
            r8 = r1[r2]
            r9 = 929(0x3a1, float:1.302E-42)
            int r7 = r7 + r9
            int r7 = r7 - r8
            int r7 = r7 % r9
            r0[r5] = r7
            r5 = 1
            int r2 = r2 + r5
            r10 = 1
            goto L_0x0284
        L_0x02a2:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x02a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x02ad:
            int r1 = r0.length
            r2 = 4
            if (r1 < r2) goto L_0x0538
            r1 = 0
            r2 = r0[r1]
            int r3 = r0.length
            if (r2 > r3) goto L_0x0533
            if (r2 != 0) goto L_0x02c6
            int r2 = r0.length
            if (r6 >= r2) goto L_0x02c1
            int r2 = r0.length
            int r2 = r2 - r6
            r0[r1] = r2
            goto L_0x02c6
        L_0x02c1:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x02c6:
            java.lang.String r1 = java.lang.String.valueOf(r26)
            char[] r2 = f4.C0902c.f11680a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length
            r4 = 1
            int r3 = r3 << r4
            r2.<init>(r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.ISO_8859_1
            r5 = r0[r4]
            e4.c r4 = new e4.c
            r4.<init>()
            r6 = 0
            r11 = 2
        L_0x02df:
            r7 = r0[r6]
            if (r11 >= r7) goto L_0x051b
            r6 = 913(0x391, float:1.28E-42)
            if (r5 == r6) goto L_0x0503
            r6 = 900(0x384, float:1.261E-42)
            switch(r5) {
                case 900: goto L_0x04fd;
                case 901: goto L_0x0403;
                case 902: goto L_0x040b;
                default: goto L_0x02ec;
            }
        L_0x02ec:
            switch(r5) {
                case 922: goto L_0x0406;
                case 923: goto L_0x0406;
                case 924: goto L_0x0403;
                case 925: goto L_0x03fb;
                case 926: goto L_0x03f5;
                case 927: goto L_0x03ce;
                case 928: goto L_0x02f8;
                default: goto L_0x02ef;
            }
        L_0x02ef:
            r8 = -1
            int r11 = r11 + r8
            int r5 = f4.C0902c.c(r0, r11, r2)
        L_0x02f5:
            r6 = 1
            goto L_0x050c
        L_0x02f8:
            r5 = 2
            int r6 = r11 + 2
            if (r6 > r7) goto L_0x03c9
            int[] r6 = new int[r5]
            r7 = 0
        L_0x0300:
            if (r7 >= r5) goto L_0x030a
            r8 = r0[r11]
            r6[r7] = r8
            r8 = 1
            int r7 = r7 + r8
            int r11 = r11 + r8
            goto L_0x0300
        L_0x030a:
            r8 = 1
            java.lang.String r6 = f4.C0902c.a(r6, r5)
            java.lang.Integer.parseInt(r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r5 = f4.C0902c.c(r0, r11, r5)
            r6 = r0[r5]
            r7 = 923(0x39b, float:1.293E-42)
            if (r6 != r7) goto L_0x0325
            int r6 = r5 + 1
        L_0x0323:
            r9 = 0
            goto L_0x0327
        L_0x0325:
            r6 = -1
            goto L_0x0323
        L_0x0327:
            r10 = r0[r9]
            if (r5 >= r10) goto L_0x03b9
            r9 = r0[r5]
            r10 = 922(0x39a, float:1.292E-42)
            if (r9 == r10) goto L_0x03b5
            if (r9 != r7) goto L_0x03b0
            int r9 = r5 + 1
            r8 = r0[r9]
            switch(r8) {
                case 0: goto L_0x03a4;
                case 1: goto L_0x0391;
                case 2: goto L_0x037e;
                case 3: goto L_0x0372;
                case 4: goto L_0x0366;
                case 5: goto L_0x0353;
                case 6: goto L_0x033f;
                default: goto L_0x033a;
            }
        L_0x033a:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x033f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 2
            int r5 = r5 + r9
            int r5 = f4.C0902c.b(r0, r5, r8)
            java.lang.String r8 = r8.toString()
            java.lang.Integer.parseInt(r8)
        L_0x0351:
            r8 = 1
            goto L_0x0323
        L_0x0353:
            r9 = 2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r5 = r5 + r9
            int r5 = f4.C0902c.b(r0, r5, r8)
            java.lang.String r8 = r8.toString()
            java.lang.Long.parseLong(r8)
            goto L_0x0351
        L_0x0366:
            r9 = 2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r5 = r5 + r9
            int r5 = f4.C0902c.c(r0, r5, r8)
            goto L_0x0351
        L_0x0372:
            r9 = 2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r5 = r5 + r9
            int r5 = f4.C0902c.c(r0, r5, r8)
            goto L_0x0351
        L_0x037e:
            r9 = 2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r5 = r5 + r9
            int r5 = f4.C0902c.b(r0, r5, r8)
            java.lang.String r8 = r8.toString()
            java.lang.Long.parseLong(r8)
            goto L_0x0351
        L_0x0391:
            r9 = 2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r5 = r5 + r9
            int r5 = f4.C0902c.b(r0, r5, r8)
            java.lang.String r8 = r8.toString()
            java.lang.Integer.parseInt(r8)
            goto L_0x0351
        L_0x03a4:
            r9 = 2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r5 = r5 + r9
            int r5 = f4.C0902c.c(r0, r5, r8)
            goto L_0x0351
        L_0x03b0:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x03b5:
            int r5 = r5 + r8
            r4.f11261a = r8
            goto L_0x0351
        L_0x03b9:
            r8 = -1
            if (r6 == r8) goto L_0x02f5
            int r7 = r5 - r6
            boolean r9 = r4.f11261a
            if (r9 == 0) goto L_0x03c3
            int r7 = r7 + r8
        L_0x03c3:
            int r7 = r7 + r6
            java.util.Arrays.copyOfRange(r0, r6, r7)
            goto L_0x02f5
        L_0x03c9:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x03ce:
            r3 = 1
            r8 = -1
            int r5 = r11 + 1
            r3 = r0[r11]
            java.util.HashMap r7 = S3.c.f4509W
            if (r3 < 0) goto L_0x03f0
            if (r3 >= r6) goto L_0x03f0
            java.util.HashMap r6 = S3.c.f4509W
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r6.get(r3)
            S3.c r3 = (S3.c) r3
            java.lang.String r3 = r3.name()
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            goto L_0x02f5
        L_0x03f0:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x03f5:
            r7 = 2
            r8 = -1
            int r5 = r11 + 2
            goto L_0x02f5
        L_0x03fb:
            r5 = 1
            r7 = 2
            r8 = -1
            int r6 = r11 + 1
            r5 = r6
            goto L_0x02f5
        L_0x0403:
            r7 = 2
            r8 = -1
            goto L_0x0413
        L_0x0406:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x040b:
            r7 = 2
            r8 = -1
            int r5 = f4.C0902c.b(r0, r11, r2)
            goto L_0x02f5
        L_0x0413:
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            r10 = 901(0x385, float:1.263E-42)
            r12 = 928(0x3a0, float:1.3E-42)
            r13 = 900(0x384, double:4.447E-321)
            r15 = 6
            r18 = 0
            if (r5 == r10) goto L_0x0479
            r10 = 924(0x39c, float:1.295E-42)
            if (r5 == r10) goto L_0x042a
        L_0x0427:
            r6 = 1
            goto L_0x04ef
        L_0x042a:
            r21 = r18
            r5 = 0
            r10 = 0
        L_0x042e:
            r16 = 0
            r7 = r0[r16]
            if (r11 >= r7) goto L_0x0477
            if (r5 != 0) goto L_0x0477
            r7 = 1
            int r16 = r11 + 1
            r8 = r0[r11]
            if (r8 >= r6) goto L_0x0446
            int r10 = r10 + r7
            long r21 = r21 * r13
            long r7 = (long) r8
            long r21 = r21 + r7
        L_0x0443:
            r11 = r16
            goto L_0x0450
        L_0x0446:
            if (r8 == r12) goto L_0x044f
            switch(r8) {
                case 900: goto L_0x044f;
                case 901: goto L_0x044f;
                case 902: goto L_0x044f;
                default: goto L_0x044b;
            }
        L_0x044b:
            switch(r8) {
                case 922: goto L_0x044f;
                case 923: goto L_0x044f;
                case 924: goto L_0x044f;
                default: goto L_0x044e;
            }
        L_0x044e:
            goto L_0x0443
        L_0x044f:
            r5 = 1
        L_0x0450:
            int r7 = r10 % 5
            if (r7 != 0) goto L_0x0470
            if (r10 <= 0) goto L_0x0470
            r7 = 0
        L_0x0457:
            if (r7 >= r15) goto L_0x046b
            int r8 = 5 - r7
            int r8 = r8 * 8
            long r12 = r21 >> r8
            int r8 = (int) r12
            byte r8 = (byte) r8
            r9.write(r8)
            r8 = 1
            int r7 = r7 + r8
            r12 = 928(0x3a0, float:1.3E-42)
            r13 = 900(0x384, double:4.447E-321)
            goto L_0x0457
        L_0x046b:
            r8 = 1
            r21 = r18
            r10 = 0
            goto L_0x0471
        L_0x0470:
            r8 = 1
        L_0x0471:
            r8 = -1
            r12 = 928(0x3a0, float:1.3E-42)
            r13 = 900(0x384, double:4.447E-321)
            goto L_0x042e
        L_0x0477:
            r8 = 1
            goto L_0x0427
        L_0x0479:
            r8 = 1
            int[] r5 = new int[r15]
            int r7 = r11 + 1
            r10 = r0[r11]
            r12 = r7
            r11 = r10
            r13 = r18
            r7 = 0
            r10 = 0
            r17 = 0
        L_0x0488:
            r6 = r0[r10]
            if (r12 >= r6) goto L_0x04d5
            if (r17 != 0) goto L_0x04d5
            int r6 = r7 + 1
            r5[r7] = r11
            r22 = 900(0x384, double:4.447E-321)
            long r13 = r13 * r22
            long r10 = (long) r11
            long r13 = r13 + r10
            int r7 = r12 + 1
            r11 = r0[r12]
            r8 = 928(0x3a0, float:1.3E-42)
            if (r11 == r8) goto L_0x04cf
            switch(r11) {
                case 900: goto L_0x04cf;
                case 901: goto L_0x04cf;
                case 902: goto L_0x04cf;
                default: goto L_0x04a3;
            }
        L_0x04a3:
            switch(r11) {
                case 922: goto L_0x04cf;
                case 923: goto L_0x04cf;
                case 924: goto L_0x04cf;
                default: goto L_0x04a6;
            }
        L_0x04a6:
            int r10 = r6 % 5
            if (r10 != 0) goto L_0x04ca
            if (r6 <= 0) goto L_0x04ca
            r6 = 0
        L_0x04ad:
            if (r6 >= r15) goto L_0x04c3
            int r10 = 5 - r6
            int r10 = r10 * 8
            r16 = r9
            long r8 = r13 >> r10
            int r9 = (int) r8
            byte r8 = (byte) r9
            r9 = r16
            r9.write(r8)
            r8 = 1
            int r6 = r6 + r8
            r8 = 928(0x3a0, float:1.3E-42)
            goto L_0x04ad
        L_0x04c3:
            r12 = r7
            r13 = r18
            r7 = 0
            r8 = 1
            r10 = 0
            goto L_0x0488
        L_0x04ca:
            r12 = r7
            r8 = 1
            r10 = 0
            r7 = r6
            goto L_0x0488
        L_0x04cf:
            r7 = r6
            r8 = 1
            r10 = 0
            r17 = 1
            goto L_0x0488
        L_0x04d5:
            if (r12 != r6) goto L_0x04e2
            r6 = 900(0x384, float:1.261E-42)
            if (r11 >= r6) goto L_0x04e2
            r6 = 1
            int r8 = r7 + 1
            r5[r7] = r11
            r7 = r8
            goto L_0x04e3
        L_0x04e2:
            r6 = 1
        L_0x04e3:
            r8 = 0
        L_0x04e4:
            if (r8 >= r7) goto L_0x04ee
            r10 = r5[r8]
            byte r10 = (byte) r10
            r9.write(r10)
            int r8 = r8 + r6
            goto L_0x04e4
        L_0x04ee:
            r11 = r12
        L_0x04ef:
            java.lang.String r5 = new java.lang.String
            byte[] r7 = r9.toByteArray()
            r5.<init>(r7, r3)
            r2.append(r5)
            r5 = r11
            goto L_0x050c
        L_0x04fd:
            r6 = 1
            int r5 = f4.C0902c.c(r0, r11, r2)
            goto L_0x050c
        L_0x0503:
            r6 = 1
            int r5 = r11 + 1
            r7 = r0[r11]
            char r7 = (char) r7
            r2.append(r7)
        L_0x050c:
            int r7 = r0.length
            if (r5 >= r7) goto L_0x0516
            int r11 = r5 + 1
            r5 = r0[r5]
            r6 = 0
            goto L_0x02df
        L_0x0516:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x051b:
            int r0 = r2.length()
            if (r0 == 0) goto L_0x052e
            S3.d r0 = new S3.d
            java.lang.String r2 = r2.toString()
            r3 = 0
            r0.<init>(r3, r2, r3, r1)
            r0.e = r4
            return r0
        L_0x052e:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x0533:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x0538:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x053d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0543:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x0548:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x054d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0553:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0559:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x055e:
            M3.d r0 = M3.d.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f.b(int[], int, int[]):S3.d");
    }

    public static C0120h c(b bVar, int i, int i8, boolean z, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        b bVar2 = bVar;
        int i19 = i;
        int i20 = i8;
        int i21 = i10;
        if (z) {
            i13 = -1;
        } else {
            i13 = 1;
        }
        boolean z6 = z;
        int i22 = i9;
        int i23 = 0;
        loop0:
        while (true) {
            if (i23 >= 2) {
                break;
            }
            while (true) {
                if (!z6) {
                    if (i22 >= i20) {
                        continue;
                        break;
                    }
                } else if (i22 < i19) {
                    continue;
                    break;
                }
                if (z6 != bVar2.b(i22, i21)) {
                    continue;
                    break;
                } else if (Math.abs(i9 - i22) > 2) {
                    i22 = i9;
                    break loop0;
                } else {
                    i22 += i13;
                }
            }
            i13 = -i13;
            z6 = !z6;
            i23++;
        }
        int[] iArr = new int[8];
        if (z) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        boolean z8 = z;
        int i24 = i22;
        int i25 = 0;
        while (true) {
            if (!z) {
                if (i24 < i19) {
                    break;
                }
            } else if (i24 >= i20) {
                break;
            }
            if (i25 >= 8) {
                break;
            } else if (bVar2.b(i24, i21) == z8) {
                iArr[i25] = iArr[i25] + 1;
                i24 += i14;
            } else {
                i25++;
                z8 = !z8;
            }
        }
        if (i25 != 8) {
            if (z) {
                i19 = i20;
            }
            if (!(i24 == i19 && i25 == 7)) {
                iArr = null;
            }
        }
        if (iArr == null) {
            return null;
        }
        int g12 = a.g1(iArr);
        if (z) {
            i15 = i22 + g12;
        } else {
            for (int i26 = 0; i26 < iArr.length / 2; i26++) {
                int i27 = iArr[i26];
                iArr[i26] = iArr[(iArr.length - 1) - i26];
                iArr[(iArr.length - 1) - i26] = i27;
            }
            int i28 = i22;
            i22 -= g12;
            i15 = i28;
        }
        if (i11 - 2 > g12 || g12 > i12 + 2) {
            return null;
        }
        float[][] fArr = e.f11684a;
        float g13 = (float) a.g1(iArr);
        int[] iArr2 = new int[8];
        int i29 = 0;
        int i30 = 0;
        for (int i31 = 0; i31 < 17; i31++) {
            float f8 = ((((float) i31) * g13) / 17.0f) + (g13 / 34.0f);
            int i32 = iArr[i30] + i29;
            if (((float) i32) <= f8) {
                i30++;
                i29 = i32;
            }
            iArr2[i30] = iArr2[i30] + 1;
        }
        long j7 = 0;
        for (int i33 = 0; i33 < 8; i33++) {
            for (int i34 = 0; i34 < iArr2[i33]; i34++) {
                long j8 = j7 << 1;
                if (i33 % 2 == 0) {
                    i18 = 1;
                } else {
                    i18 = 0;
                }
                j7 = j8 | ((long) i18);
            }
        }
        int i35 = (int) j7;
        int[] iArr3 = C0839a.f11258b;
        int binarySearch = Arrays.binarySearch(iArr3, i35 & 262143);
        int[] iArr4 = C0839a.f11259c;
        if (binarySearch < 0) {
            i16 = -1;
        } else {
            i16 = (iArr4[binarySearch] - 1) % 929;
        }
        if (i16 == -1) {
            i35 = -1;
        }
        if (i35 == -1) {
            int g14 = a.g1(iArr);
            float[] fArr2 = new float[8];
            if (g14 > 1) {
                for (int i36 = 0; i36 < 8; i36++) {
                    fArr2[i36] = ((float) iArr[i36]) / ((float) g14);
                }
            }
            i35 = -1;
            float f9 = Float.MAX_VALUE;
            int i37 = 0;
            while (true) {
                float[][] fArr3 = e.f11684a;
                if (i37 >= fArr3.length) {
                    break;
                }
                float[] fArr4 = fArr3[i37];
                float f10 = 0.0f;
                for (int i38 = 0; i38 < 8; i38++) {
                    float f11 = fArr4[i38] - fArr2[i38];
                    f10 = (f11 * f11) + f10;
                    if (f10 >= f9) {
                        break;
                    }
                }
                if (f10 < f9) {
                    i35 = iArr3[i37];
                    f9 = f10;
                }
                i37++;
            }
        }
        int binarySearch2 = Arrays.binarySearch(iArr3, i35 & 262143);
        if (binarySearch2 < 0) {
            i17 = -1;
        } else {
            i17 = (iArr4[binarySearch2] - 1) % 929;
        }
        if (i17 == -1) {
            return null;
        }
        int[] iArr5 = new int[8];
        int i39 = i35;
        int i40 = 7;
        int i41 = 0;
        while (true) {
            int i42 = i39 & 1;
            if (i42 != i41) {
                i40--;
                if (i40 < 0) {
                    return new C0120h(i22, i15, ((((iArr5[0] - iArr5[2]) + iArr5[4]) - iArr5[6]) + 9) % 9, i17, 4, (byte) 0);
                }
                i41 = i42;
            }
            iArr5[i40] = iArr5[i40] + 1;
            i39 >>= 1;
        }
    }

    public static d d(b bVar, C0901b bVar2, n nVar, boolean z, int i, int i8) {
        int i9;
        int i10;
        C0901b bVar3 = bVar2;
        n nVar2 = nVar;
        boolean z6 = z;
        d dVar = new d(bVar3, z6);
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            int i12 = (int) nVar2.f3164a;
            int i13 = (int) nVar2.f3165b;
            while (i13 <= bVar3.i && i13 >= bVar3.f11679h) {
                C0120h c8 = c(bVar, 0, bVar.f4505U, z, i12, i13, i, i8);
                if (c8 != null) {
                    ((C0120h[]) dVar.f10051W)[dVar.D(i13)] = c8;
                    if (z6) {
                        i10 = c8.f2948b;
                    } else {
                        i10 = c8.f2949c;
                    }
                    i12 = i10;
                }
                i13 += i9;
            }
        }
        return dVar;
    }
}
