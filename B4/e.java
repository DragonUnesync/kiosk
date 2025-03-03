package b4;

import M3.c;
import M3.h;
import M3.l;
import M3.n;
import M3.o;
import S3.a;
import a4.C0425h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class e extends C0531a {
    public static final int[] i = {1, 10, 34, 70, 126};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f8676j = {4, 20, 48, 81};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f8677k = {0, 161, 961, 2015, 2715};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f8678l = {0, 336, 1036, 1516};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f8679m = {8, 6, 4, 3, 1};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f8680n = {2, 4, 6, 8};

    /* renamed from: o  reason: collision with root package name */
    public static final int[][] f8681o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f8682g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f8683h = new ArrayList();

    public static void k(ArrayList arrayList, d dVar) {
        if (dVar != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                if (dVar2.f8669a == dVar.f8669a) {
                    dVar2.f8675d++;
                    return;
                }
            }
            arrayList.add(dVar);
        }
    }

    public final void a() {
        this.f8682g.clear();
        this.f8683h.clear();
    }

    public final l c(int i8, a aVar, Map map) {
        d m8 = m(aVar, false, i8, map);
        ArrayList arrayList = this.f8682g;
        k(arrayList, m8);
        aVar.e();
        d m9 = m(aVar, true, i8, map);
        ArrayList arrayList2 = this.f8683h;
        k(arrayList2, m9);
        aVar.e();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f8675d > 1) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2.f8675d > 1) {
                        int i9 = ((dVar2.f8670b * 16) + dVar.f8670b) % 79;
                        c cVar = dVar.f8674c;
                        c cVar2 = dVar2.f8674c;
                        int i10 = (cVar.f8671a * 9) + cVar2.f8671a;
                        if (i10 > 72) {
                            i10--;
                        }
                        if (i10 > 8) {
                            i10--;
                        }
                        if (i9 == i10) {
                            String valueOf = String.valueOf((((long) dVar.f8669a) * 4537077) + ((long) dVar2.f8669a));
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(valueOf);
                            int i11 = 0;
                            for (int i12 = 0; i12 < 13; i12++) {
                                int charAt = sb.charAt(i12) - '0';
                                if ((i12 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i11 += charAt;
                            }
                            int i13 = 10 - (i11 % 10);
                            if (i13 == 10) {
                                i13 = 0;
                            }
                            sb.append(i13);
                            n[] nVarArr = cVar.f8673c;
                            n[] nVarArr2 = cVar2.f8673c;
                            return new l(sb.toString(), (byte[]) null, new n[]{nVarArr[0], nVarArr[1], nVarArr2[0], nVarArr2[1]}, M3.a.f3118g0);
                        }
                    }
                }
                continue;
            }
        }
        throw h.f3144W;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r6 < 4) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r6 < 4) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0127 A[LOOP:2: B:102:0x0125->B:103:0x0127, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0136 A[LOOP:3: B:105:0x0134->B:106:0x0136, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b4.b l(S3.a r20, b4.c r21, boolean r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            int[] r3 = r0.f8665b
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            r5 = 1
            r6 = r21
            int[] r6 = r6.f8672b
            if (r2 == 0) goto L_0x0019
            r6 = r6[r4]
            a4.C0425h.g(r6, r1, r3)
            goto L_0x0030
        L_0x0019:
            r6 = r6[r5]
            a4.C0425h.f(r6, r1, r3)
            int r1 = r3.length
            int r1 = r1 - r5
            r6 = 0
        L_0x0021:
            if (r6 >= r1) goto L_0x0030
            r7 = r3[r6]
            r8 = r3[r1]
            r3[r6] = r8
            r3[r1] = r7
            int r6 = r6 + 1
            int r1 = r1 + -1
            goto L_0x0021
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r1 = 16
            goto L_0x0037
        L_0x0035:
            r1 = 15
        L_0x0037:
            int r6 = n2.a.g1(r3)
            float r6 = (float) r6
            float r7 = (float) r1
            float r6 = r6 / r7
            r7 = 0
        L_0x003f:
            int r8 = r3.length
            float[] r9 = r0.f8667d
            float[] r10 = r0.f8666c
            int[] r11 = r0.f8668f
            int[] r12 = r0.e
            if (r7 >= r8) goto L_0x0072
            r8 = r3[r7]
            float r8 = (float) r8
            float r8 = r8 / r6
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r8
            int r13 = (int) r13
            if (r13 > 0) goto L_0x0056
            r13 = 1
            goto L_0x005c
        L_0x0056:
            r14 = 8
            if (r13 <= r14) goto L_0x005c
            r13 = 8
        L_0x005c:
            int r14 = r7 / 2
            r15 = r7 & 1
            if (r15 != 0) goto L_0x0069
            r12[r14] = r13
            float r9 = (float) r13
            float r8 = r8 - r9
            r10[r14] = r8
            goto L_0x006f
        L_0x0069:
            r11[r14] = r13
            float r10 = (float) r13
            float r8 = r8 - r10
            r9[r14] = r8
        L_0x006f:
            int r7 = r7 + 1
            goto L_0x003f
        L_0x0072:
            int r3 = n2.a.g1(r12)
            int r6 = n2.a.g1(r11)
            r7 = 10
            r8 = 12
            r13 = 4
            if (r2 == 0) goto L_0x009e
            if (r3 <= r8) goto L_0x0086
            r14 = 0
            r15 = 1
            goto L_0x008d
        L_0x0086:
            if (r3 >= r13) goto L_0x008b
            r14 = 1
        L_0x0089:
            r15 = 0
            goto L_0x008d
        L_0x008b:
            r14 = 0
            goto L_0x0089
        L_0x008d:
            if (r6 <= r8) goto L_0x0094
        L_0x008f:
            r16 = 0
            r17 = 1
            goto L_0x00b3
        L_0x0094:
            if (r6 >= r13) goto L_0x009b
        L_0x0096:
            r16 = 1
        L_0x0098:
            r17 = 0
            goto L_0x00b3
        L_0x009b:
            r16 = 0
            goto L_0x0098
        L_0x009e:
            r14 = 11
            if (r3 <= r14) goto L_0x00a5
            r14 = 0
            r15 = 1
            goto L_0x00ad
        L_0x00a5:
            r14 = 5
            if (r3 >= r14) goto L_0x00ab
            r14 = 1
        L_0x00a9:
            r15 = 0
            goto L_0x00ad
        L_0x00ab:
            r14 = 0
            goto L_0x00a9
        L_0x00ad:
            if (r6 <= r7) goto L_0x00b0
            goto L_0x008f
        L_0x00b0:
            if (r6 >= r13) goto L_0x009b
            goto L_0x0096
        L_0x00b3:
            int r18 = r3 + r6
            int r1 = r18 - r1
            r7 = r3 & 1
            if (r7 != r2) goto L_0x00bd
            r7 = 1
            goto L_0x00be
        L_0x00bd:
            r7 = 0
        L_0x00be:
            r4 = r6 & 1
            if (r4 != r5) goto L_0x00c4
            r4 = 1
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            r13 = -1
            if (r1 == r13) goto L_0x00f5
            if (r1 == 0) goto L_0x00e0
            if (r1 != r5) goto L_0x00dd
            if (r7 == 0) goto L_0x00d5
            if (r4 != 0) goto L_0x00d2
            r15 = 1
            goto L_0x0101
        L_0x00d2:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00d5:
            if (r4 == 0) goto L_0x00da
        L_0x00d7:
            r17 = 1
            goto L_0x0101
        L_0x00da:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00dd:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00e0:
            if (r7 == 0) goto L_0x00ef
            if (r4 == 0) goto L_0x00ec
            if (r3 >= r6) goto L_0x00e8
            r14 = 1
            goto L_0x00d7
        L_0x00e8:
            r15 = 1
        L_0x00e9:
            r16 = 1
            goto L_0x0101
        L_0x00ec:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00ef:
            if (r4 != 0) goto L_0x00f2
            goto L_0x0101
        L_0x00f2:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00f5:
            if (r7 == 0) goto L_0x00fe
            if (r4 != 0) goto L_0x00fb
            r14 = 1
            goto L_0x0101
        L_0x00fb:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00fe:
            if (r4 == 0) goto L_0x01a7
            goto L_0x00e9
        L_0x0101:
            if (r14 == 0) goto L_0x010c
            if (r15 != 0) goto L_0x0109
            b4.C0531a.i(r12, r10)
            goto L_0x010c
        L_0x0109:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x010c:
            if (r15 == 0) goto L_0x0111
            b4.C0531a.h(r12, r10)
        L_0x0111:
            if (r16 == 0) goto L_0x011c
            if (r17 != 0) goto L_0x0119
            b4.C0531a.i(r11, r10)
            goto L_0x011c
        L_0x0119:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x011c:
            if (r17 == 0) goto L_0x0121
            b4.C0531a.h(r11, r9)
        L_0x0121:
            int r1 = r12.length
            int r1 = r1 - r5
            r3 = 0
            r4 = 0
        L_0x0125:
            if (r1 < 0) goto L_0x0130
            int r3 = r3 * 9
            r6 = r12[r1]
            int r3 = r3 + r6
            int r4 = r4 + r6
            int r1 = r1 + -1
            goto L_0x0125
        L_0x0130:
            int r1 = r11.length
            int r1 = r1 - r5
            r6 = 0
            r7 = 0
        L_0x0134:
            if (r1 < 0) goto L_0x013f
            int r6 = r6 * 9
            r9 = r11[r1]
            int r6 = r6 + r9
            int r7 = r7 + r9
            int r1 = r1 + -1
            goto L_0x0134
        L_0x013f:
            int r6 = r6 * 3
            int r6 = r6 + r3
            if (r2 == 0) goto L_0x0174
            r1 = r4 & 1
            if (r1 != 0) goto L_0x0171
            if (r4 > r8) goto L_0x0171
            r1 = 4
            if (r4 < r1) goto L_0x0171
            int r8 = r8 - r4
            int r8 = r8 / 2
            int[] r1 = f8679m
            r1 = r1[r8]
            int r2 = 9 - r1
            r3 = 0
            int r1 = android.support.v4.media.session.b.o(r12, r1, r3)
            int r2 = android.support.v4.media.session.b.o(r11, r2, r5)
            int[] r3 = i
            r3 = r3[r8]
            int[] r4 = f8677k
            r4 = r4[r8]
            b4.b r5 = new b4.b
            int r1 = r1 * r3
            int r1 = r1 + r2
            int r1 = r1 + r4
            r5.<init>(r1, r6)
            return r5
        L_0x0171:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0174:
            r1 = r7 & 1
            if (r1 != 0) goto L_0x01a4
            r1 = 10
            if (r7 > r1) goto L_0x01a4
            r2 = 4
            if (r7 < r2) goto L_0x01a4
            int r7 = 10 - r7
            int r7 = r7 / 2
            int[] r1 = f8680n
            r1 = r1[r7]
            int r2 = 9 - r1
            int r1 = android.support.v4.media.session.b.o(r12, r1, r5)
            r3 = 0
            int r2 = android.support.v4.media.session.b.o(r11, r2, r3)
            int[] r3 = f8676j
            r3 = r3[r7]
            int[] r4 = f8678l
            r4 = r4[r7]
            b4.b r5 = new b4.b
            int r2 = r2 * r3
            int r2 = r2 + r1
            int r2 = r2 + r4
            r5.<init>(r2, r6)
            return r5
        L_0x01a4:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x01a7:
            M3.h r1 = M3.h.f3144W
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.l(S3.a, b4.c, boolean):b4.b");
    }

    public final d m(a aVar, boolean z, int i8, Map map) {
        o oVar;
        try {
            c o2 = o(aVar, i8, z, n(aVar, z));
            if (map == null) {
                oVar = null;
            } else {
                oVar = (o) map.get(c.f3133d0);
            }
            if (oVar != null) {
                int[] iArr = o2.f8672b;
                float f8 = ((float) ((iArr[0] + iArr[1]) - 1)) / 2.0f;
                if (z) {
                    f8 = ((float) (aVar.f4504V - 1)) - f8;
                }
                oVar.a(new n(f8, (float) i8));
            }
            b l8 = l(aVar, o2, true);
            b l9 = l(aVar, o2, false);
            return new d((l8.f8669a * 1597) + l9.f8669a, (l9.f8670b * 4) + l8.f8670b, o2);
        } catch (h unused) {
            return null;
        }
    }

    public final int[] n(a aVar, boolean z) {
        int[] iArr = this.f8664a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i8 = aVar.f4504V;
        int i9 = 0;
        boolean z6 = false;
        while (i9 < i8) {
            z6 = !aVar.a(i9);
            if (z == z6) {
                break;
            }
            i9++;
        }
        int i10 = i9;
        int i11 = 0;
        while (i9 < i8) {
            if (aVar.a(i9) != z6) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else if (C0531a.j(iArr)) {
                    return new int[]{i10, i9};
                } else {
                    i10 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z6 = !z6;
            }
            i9++;
        }
        throw h.f3144W;
    }

    public final c o(a aVar, int i8, boolean z, int[] iArr) {
        int i9;
        int i10;
        boolean a8 = aVar.a(iArr[0]);
        int i11 = iArr[0] - 1;
        while (i11 >= 0 && a8 != aVar.a(i11)) {
            i11--;
        }
        int i12 = i11 + 1;
        int[] iArr2 = this.f8664a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = iArr[0] - i12;
        int[][] iArr3 = f8681o;
        for (int i13 = 0; i13 < 9; i13++) {
            if (C0425h.e(iArr2, iArr3[i13], 0.45f) < 0.2f) {
                int i14 = iArr[1];
                if (z) {
                    int i15 = aVar.f4504V - 1;
                    i9 = i15 - i14;
                    i10 = i15 - i12;
                } else {
                    i9 = i14;
                    i10 = i12;
                }
                return new c(i13, i10, i9, i8, new int[]{i12, i14});
            }
        }
        throw h.f3144W;
    }
}
