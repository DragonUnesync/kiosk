package c4;

import I2.b;
import M3.h;
import M3.l;
import M3.n;
import Q0.g;
import S3.a;
import a4.C0425h;
import b4.C0531a;
import b4.c;
import d4.C0634a;
import d4.C0635b;
import d4.C0636c;
import d4.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c4.c  reason: case insensitive filesystem */
public final class C0617c extends C0531a {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f8887k = {7, 5, 4, 3, 1};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f8888l = {4, 20, 52, 104, 204};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f8889m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n  reason: collision with root package name */
    public static final int[][] f8890n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o  reason: collision with root package name */
    public static final int[][] f8891o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p  reason: collision with root package name */
    public static final int[][] f8892p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f8893g = new ArrayList(11);

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f8894h = new ArrayList();
    public final int[] i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    public boolean f8895j;

    public static l n(List list) {
        b bVar;
        int size = list.size() << 1;
        int i8 = size - 1;
        if (((C0615a) list.get(list.size() - 1)).f8883b == null) {
            i8 = size - 2;
        }
        a aVar = new a(i8 * 12);
        int i9 = ((C0615a) list.get(0)).f8883b.f8669a;
        int i10 = 0;
        for (int i11 = 11; i11 >= 0; i11--) {
            if (((1 << i11) & i9) != 0) {
                aVar.f(i10);
            }
            i10++;
        }
        for (int i12 = 1; i12 < list.size(); i12++) {
            C0615a aVar2 = (C0615a) list.get(i12);
            b4.b bVar2 = aVar2.f8882a;
            for (int i13 = 11; i13 >= 0; i13--) {
                if (((1 << i13) & bVar2.f8669a) != 0) {
                    aVar.f(i10);
                }
                i10++;
            }
            b4.b bVar3 = aVar2.f8883b;
            if (bVar3 != null) {
                for (int i14 = 11; i14 >= 0; i14--) {
                    if (((1 << i14) & bVar3.f8669a) != 0) {
                        aVar.f(i10);
                    }
                    i10++;
                }
            }
        }
        if (aVar.a(1)) {
            bVar = new C0635b(aVar, 2);
        } else if (!aVar.a(2)) {
            bVar = new b(aVar);
        } else {
            int h5 = k.h(1, 4, aVar);
            if (h5 == 4) {
                bVar = new C0634a(aVar, 0);
            } else if (h5 != 5) {
                int h8 = k.h(1, 5, aVar);
                if (h8 == 12) {
                    bVar = new C0635b(aVar, 0);
                } else if (h8 != 13) {
                    switch (k.h(1, 7, aVar)) {
                        case 56:
                            bVar = new C0636c(aVar, "310", "11");
                            break;
                        case 57:
                            bVar = new C0636c(aVar, "320", "11");
                            break;
                        case 58:
                            bVar = new C0636c(aVar, "310", "13");
                            break;
                        case 59:
                            bVar = new C0636c(aVar, "320", "13");
                            break;
                        case 60:
                            bVar = new C0636c(aVar, "310", "15");
                            break;
                        case 61:
                            bVar = new C0636c(aVar, "320", "15");
                            break;
                        case 62:
                            bVar = new C0636c(aVar, "310", "17");
                            break;
                        case 63:
                            bVar = new C0636c(aVar, "320", "17");
                            break;
                        default:
                            throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
                    }
                } else {
                    bVar = new C0635b(aVar, 1);
                }
            } else {
                bVar = new C0634a(aVar, 1);
            }
        }
        String h9 = bVar.h();
        n[] nVarArr = ((C0615a) list.get(0)).f8884c.f8673c;
        n[] nVarArr2 = ((C0615a) list.get(list.size() - 1)).f8884c.f8673c;
        return new l(h9, (byte[]) null, new n[]{nVarArr[0], nVarArr[1], nVarArr2[0], nVarArr2[1]}, M3.a.f3119h0);
    }

    public final void a() {
        this.f8893g.clear();
        this.f8894h.clear();
    }

    public final l c(int i8, a aVar, Map map) {
        ArrayList arrayList = this.f8893g;
        arrayList.clear();
        this.f8895j = false;
        try {
            return n(p(aVar, i8));
        } catch (h unused) {
            arrayList.clear();
            this.f8895j = true;
            return n(p(aVar, i8));
        }
    }

    public final boolean k() {
        ArrayList arrayList = this.f8893g;
        C0615a aVar = (C0615a) arrayList.get(0);
        b4.b bVar = aVar.f8882a;
        b4.b bVar2 = aVar.f8883b;
        if (bVar2 == null) {
            return false;
        }
        int i8 = 2;
        int i9 = bVar2.f8670b;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            C0615a aVar2 = (C0615a) arrayList.get(i10);
            i9 += aVar2.f8882a.f8670b;
            int i11 = i8 + 1;
            b4.b bVar3 = aVar2.f8883b;
            if (bVar3 != null) {
                i9 += bVar3.f8670b;
                i8 += 2;
            } else {
                i8 = i11;
            }
        }
        if (((i8 - 4) * 211) + (i9 % 211) == bVar.f8669a) {
            return true;
        }
        return false;
    }

    public final List l(int i8, ArrayList arrayList) {
        while (true) {
            ArrayList arrayList2 = this.f8894h;
            if (i8 < arrayList2.size()) {
                C0616b bVar = (C0616b) arrayList2.get(i8);
                ArrayList arrayList3 = this.f8893g;
                arrayList3.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.addAll(((C0616b) it.next()).f8885a);
                }
                arrayList3.addAll(bVar.f8885a);
                int[][] iArr = f8892p;
                for (int i9 = 0; i9 < 10; i9++) {
                    int[] iArr2 = iArr[i9];
                    if (arrayList3.size() <= iArr2.length) {
                        int i10 = 0;
                        while (i10 < arrayList3.size()) {
                            c cVar = ((C0615a) arrayList3.get(i10)).f8884c;
                            if (cVar.f8671a == iArr2[i10]) {
                                i10++;
                            }
                        }
                        if (k()) {
                            return arrayList3;
                        }
                        ArrayList arrayList4 = new ArrayList(arrayList);
                        arrayList4.add(bVar);
                        try {
                            return l(i8 + 1, arrayList4);
                        } catch (h unused) {
                        }
                    }
                }
                i8++;
            } else {
                throw h.f3144W;
            }
        }
    }

    public final List m(boolean z) {
        ArrayList arrayList = this.f8894h;
        List list = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.f8893g.clear();
        if (z) {
            Collections.reverse(arrayList);
        }
        try {
            list = l(0, new ArrayList());
        } catch (h unused) {
        }
        if (z) {
            Collections.reverse(arrayList);
        }
        return list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x015a A[EDGE_INSN: B:136:0x015a->B:109:0x015a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b4.b o(S3.a r18, b4.c r19, boolean r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int[] r3 = r0.f8665b
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            r5 = 1
            if (r21 == 0) goto L_0x0017
            int[] r6 = r2.f8672b
            r6 = r6[r4]
            a4.C0425h.g(r6, r1, r3)
            goto L_0x0030
        L_0x0017:
            int[] r6 = r2.f8672b
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
            int r1 = n2.a.g1(r3)
            float r1 = (float) r1
            r6 = 1099431936(0x41880000, float:17.0)
            float r1 = r1 / r6
            int[] r6 = r2.f8672b
            r7 = r6[r5]
            r6 = r6[r4]
            int r7 = r7 - r6
            float r6 = (float) r7
            r7 = 1097859072(0x41700000, float:15.0)
            float r6 = r6 / r7
            float r7 = r1 - r6
            float r7 = java.lang.Math.abs(r7)
            float r7 = r7 / r6
            r6 = 1050253722(0x3e99999a, float:0.3)
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 > 0) goto L_0x01a9
            r7 = 0
        L_0x0052:
            int r8 = r3.length
            float[] r9 = r0.f8667d
            float[] r10 = r0.f8666c
            int[] r11 = r0.f8668f
            int[] r12 = r0.e
            if (r7 >= r8) goto L_0x009b
            r8 = r3[r7]
            float r8 = (float) r8
            r13 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r13
            float r8 = r8 / r1
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r8
            int r13 = (int) r13
            if (r13 > 0) goto L_0x0074
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x0071
            r13 = 1
            goto L_0x0085
        L_0x0071:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0074:
            r14 = 8
            if (r13 <= r14) goto L_0x0085
            r13 = 1091253043(0x410b3333, float:8.7)
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x0082
            r13 = 8
            goto L_0x0085
        L_0x0082:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0085:
            int r14 = r7 / 2
            r15 = r7 & 1
            if (r15 != 0) goto L_0x0092
            r12[r14] = r13
            float r9 = (float) r13
            float r8 = r8 - r9
            r10[r14] = r8
            goto L_0x0098
        L_0x0092:
            r11[r14] = r13
            float r10 = (float) r13
            float r8 = r8 - r10
            r9[r14] = r8
        L_0x0098:
            int r7 = r7 + 1
            goto L_0x0052
        L_0x009b:
            int r1 = n2.a.g1(r12)
            int r3 = n2.a.g1(r11)
            r6 = 13
            r7 = 4
            if (r1 <= r6) goto L_0x00ab
            r8 = 0
            r13 = 1
            goto L_0x00b2
        L_0x00ab:
            if (r1 >= r7) goto L_0x00b0
            r8 = 1
        L_0x00ae:
            r13 = 0
            goto L_0x00b2
        L_0x00b0:
            r8 = 0
            goto L_0x00ae
        L_0x00b2:
            if (r3 <= r6) goto L_0x00b7
            r14 = 0
            r15 = 1
            goto L_0x00be
        L_0x00b7:
            if (r3 >= r7) goto L_0x00bc
            r14 = 1
        L_0x00ba:
            r15 = 0
            goto L_0x00be
        L_0x00bc:
            r14 = 0
            goto L_0x00ba
        L_0x00be:
            int r16 = r1 + r3
            int r4 = r16 + -17
            r7 = r1 & 1
            if (r7 != r5) goto L_0x00c8
            r7 = 1
            goto L_0x00c9
        L_0x00c8:
            r7 = 0
        L_0x00c9:
            r16 = r3 & 1
            if (r16 != 0) goto L_0x00d0
            r16 = 1
            goto L_0x00d2
        L_0x00d0:
            r16 = 0
        L_0x00d2:
            r6 = -1
            if (r4 == r6) goto L_0x0100
            if (r4 == 0) goto L_0x00ec
            if (r4 != r5) goto L_0x00e9
            if (r7 == 0) goto L_0x00e2
            if (r16 != 0) goto L_0x00df
            r13 = 1
            goto L_0x010c
        L_0x00df:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00e2:
            if (r16 == 0) goto L_0x00e6
        L_0x00e4:
            r15 = 1
            goto L_0x010c
        L_0x00e6:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00e9:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00ec:
            if (r7 == 0) goto L_0x00fa
            if (r16 == 0) goto L_0x00f7
            if (r1 >= r3) goto L_0x00f4
            r8 = 1
            goto L_0x00e4
        L_0x00f4:
            r13 = 1
        L_0x00f5:
            r14 = 1
            goto L_0x010c
        L_0x00f7:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x00fa:
            if (r16 != 0) goto L_0x00fd
            goto L_0x010c
        L_0x00fd:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0100:
            if (r7 == 0) goto L_0x0109
            if (r16 != 0) goto L_0x0106
            r8 = 1
            goto L_0x010c
        L_0x0106:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0109:
            if (r16 == 0) goto L_0x01a6
            goto L_0x00f5
        L_0x010c:
            if (r8 == 0) goto L_0x0117
            if (r13 != 0) goto L_0x0114
            b4.C0531a.i(r12, r10)
            goto L_0x0117
        L_0x0114:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0117:
            if (r13 == 0) goto L_0x011c
            b4.C0531a.h(r12, r10)
        L_0x011c:
            if (r14 == 0) goto L_0x0127
            if (r15 != 0) goto L_0x0124
            b4.C0531a.i(r11, r10)
            goto L_0x0127
        L_0x0124:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0127:
            if (r15 == 0) goto L_0x012c
            b4.C0531a.h(r11, r9)
        L_0x012c:
            int r1 = r2.f8671a
            int r2 = r1 * 4
            r3 = 2
            if (r20 == 0) goto L_0x0135
            r4 = 0
            goto L_0x0136
        L_0x0135:
            r4 = 2
        L_0x0136:
            int r2 = r2 + r4
            r4 = r21 ^ 1
            int r2 = r2 + r4
            int r2 = r2 - r5
            int r4 = r12.length
            int r4 = r4 - r5
            r6 = 0
            r7 = 0
        L_0x013f:
            int[][] r8 = f8891o
            if (r4 < 0) goto L_0x015a
            if (r1 != 0) goto L_0x0149
            if (r20 == 0) goto L_0x0149
            if (r21 != 0) goto L_0x0154
        L_0x0149:
            r8 = r8[r2]
            int r9 = r4 * 2
            r8 = r8[r9]
            r9 = r12[r4]
            int r9 = r9 * r8
            int r6 = r6 + r9
        L_0x0154:
            r8 = r12[r4]
            int r7 = r7 + r8
            int r4 = r4 + -1
            goto L_0x013f
        L_0x015a:
            int r4 = r11.length
            int r4 = r4 - r5
            r9 = 0
        L_0x015d:
            if (r4 < 0) goto L_0x0174
            if (r1 != 0) goto L_0x0165
            if (r20 == 0) goto L_0x0165
            if (r21 != 0) goto L_0x0171
        L_0x0165:
            r10 = r8[r2]
            int r13 = r4 * 2
            int r13 = r13 + r5
            r10 = r10[r13]
            r13 = r11[r4]
            int r13 = r13 * r10
            int r9 = r9 + r13
        L_0x0171:
            int r4 = r4 + -1
            goto L_0x015d
        L_0x0174:
            int r6 = r6 + r9
            r1 = r7 & 1
            if (r1 != 0) goto L_0x01a3
            r1 = 13
            if (r7 > r1) goto L_0x01a3
            r2 = 4
            if (r7 < r2) goto L_0x01a3
            int r1 = r1 - r7
            int r1 = r1 / r3
            int[] r2 = f8887k
            r2 = r2[r1]
            int r3 = 9 - r2
            int r2 = android.support.v4.media.session.b.o(r12, r2, r5)
            r4 = 0
            int r3 = android.support.v4.media.session.b.o(r11, r3, r4)
            int[] r4 = f8888l
            r4 = r4[r1]
            int[] r5 = f8889m
            r1 = r5[r1]
            int r2 = r2 * r4
            int r2 = r2 + r3
            int r2 = r2 + r1
            b4.b r1 = new b4.b
            r1.<init>(r2, r6)
            return r1
        L_0x01a3:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x01a6:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x01a9:
            M3.h r1 = M3.h.f3144W
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C0617c.o(S3.a, b4.c, boolean, boolean):b4.b");
    }

    public final List p(a aVar, int i8) {
        boolean z;
        boolean z6;
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f8893g;
            if (!z8) {
                try {
                    arrayList.add(q(aVar, arrayList, i8));
                } catch (h e) {
                    if (!arrayList.isEmpty()) {
                        z8 = true;
                    } else {
                        throw e;
                    }
                }
            } else if (k()) {
                return arrayList;
            } else {
                ArrayList arrayList2 = this.f8894h;
                boolean isEmpty = arrayList2.isEmpty();
                int i9 = 0;
                boolean z9 = false;
                while (true) {
                    if (i9 >= arrayList2.size()) {
                        z = false;
                        break;
                    }
                    C0616b bVar = (C0616b) arrayList2.get(i9);
                    int i10 = bVar.f8886b;
                    ArrayList arrayList3 = bVar.f8885a;
                    if (i10 > i8) {
                        z = arrayList3.equals(arrayList);
                        break;
                    }
                    z9 = arrayList3.equals(arrayList);
                    i9++;
                }
                if (!z && !z9) {
                    Iterator it = arrayList2.iterator();
                    loop2:
                    while (true) {
                        if (!it.hasNext()) {
                            z6 = false;
                            break;
                        }
                        C0616b bVar2 = (C0616b) it.next();
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z6 = true;
                                break loop2;
                            }
                            C0615a aVar2 = (C0615a) it2.next();
                            Iterator it3 = bVar2.f8885a.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (aVar2.equals((C0615a) it3.next())) {
                                    }
                                }
                            }
                        }
                    }
                    if (!z6) {
                        arrayList2.add(i9, new C0616b(i8, arrayList));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            C0616b bVar3 = (C0616b) it4.next();
                            if (bVar3.f8885a.size() != arrayList.size()) {
                                Iterator it5 = bVar3.f8885a.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        if (!arrayList.contains((C0615a) it5.next())) {
                                            break;
                                        }
                                    } else {
                                        it4.remove();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!isEmpty) {
                    List m8 = m(false);
                    if (m8 != null) {
                        return m8;
                    }
                    List m9 = m(true);
                    if (m9 != null) {
                        return m9;
                    }
                }
                throw h.f3144W;
            }
        }
    }

    public final C0615a q(a aVar, ArrayList arrayList, int i8) {
        boolean z;
        int i9;
        boolean z6;
        int i10;
        int i11;
        int c8;
        int i12;
        c cVar;
        int i13;
        a aVar2 = aVar;
        ArrayList arrayList2 = arrayList;
        int i14 = 2;
        int i15 = 0;
        int i16 = 1;
        if (arrayList.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f8895j) {
            z = !z;
        }
        int i17 = -1;
        boolean z8 = true;
        while (true) {
            int[] iArr = this.f8664a;
            iArr[i15] = i15;
            iArr[i16] = i15;
            iArr[i14] = i15;
            int i18 = 3;
            iArr[3] = i15;
            int i19 = aVar2.f4504V;
            if (i17 >= 0) {
                i9 = i17;
            } else if (arrayList.isEmpty()) {
                i9 = 0;
            } else {
                i9 = ((C0615a) g.l(i16, arrayList2)).f8884c.f8672b[i16];
            }
            if (arrayList.size() % i14 != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (this.f8895j) {
                z6 = !z6;
            }
            boolean z9 = false;
            while (true) {
                if (i9 >= i19) {
                    break;
                }
                boolean a8 = aVar2.a(i9);
                boolean z10 = !a8;
                if (a8) {
                    z9 = z10;
                    break;
                }
                i9++;
                z9 = z10;
            }
            boolean z11 = z9;
            int i20 = 0;
            int i21 = i9;
            while (i9 < i19) {
                if (aVar2.a(i9) != z11) {
                    iArr[i20] = iArr[i20] + i16;
                } else {
                    if (i20 == i18) {
                        if (z6) {
                            int length = iArr.length;
                            for (int i22 = 0; i22 < length / 2; i22++) {
                                int i23 = iArr[i22];
                                int i24 = (length - i22) - 1;
                                iArr[i22] = iArr[i24];
                                iArr[i24] = i23;
                            }
                        }
                        if (C0531a.j(iArr)) {
                            int[] iArr2 = this.i;
                            iArr2[0] = i21;
                            iArr2[1] = i9;
                            if (z) {
                                int i25 = i21 - 1;
                                while (i25 >= 0 && !aVar2.a(i25)) {
                                    i25--;
                                }
                                i21 = i25 + 1;
                                i12 = iArr2[0] - i21;
                                i11 = 1;
                                c8 = iArr2[1];
                            } else {
                                i11 = 1;
                                c8 = aVar2.c(i9 + 1);
                                i12 = c8 - iArr2[1];
                            }
                            int i26 = c8;
                            int i27 = i21;
                            System.arraycopy(iArr, 0, iArr, i11, iArr.length - i11);
                            iArr[0] = i12;
                            b4.b bVar = null;
                            try {
                                int[][] iArr3 = f8890n;
                                int i28 = 0;
                                while (i28 < 6) {
                                    if (C0425h.e(iArr, iArr3[i28], 0.45f) < 0.2f) {
                                        cVar = new c(i28, i27, i26, i8, new int[]{i27, i26});
                                        if (cVar == null) {
                                            int i29 = iArr2[0];
                                            if (aVar2.a(i29)) {
                                                i13 = aVar2.b(aVar2.c(i29));
                                            } else {
                                                i13 = aVar2.c(aVar2.b(i29));
                                            }
                                            i17 = i13;
                                        } else {
                                            z8 = false;
                                        }
                                        if (!z8) {
                                            b4.b o2 = o(aVar2, cVar, z, true);
                                            if (arrayList.isEmpty() || ((C0615a) g.l(1, arrayList2)).f8883b != null) {
                                                try {
                                                    bVar = o(aVar2, cVar, z, false);
                                                } catch (h unused) {
                                                }
                                                return new C0615a(o2, bVar, cVar);
                                            }
                                            throw h.f3144W;
                                        }
                                        i14 = 2;
                                        i15 = 0;
                                        i16 = 1;
                                    } else {
                                        i28++;
                                    }
                                }
                                throw h.f3144W;
                            } catch (h unused2) {
                                cVar = null;
                            }
                        } else {
                            if (z6) {
                                int length2 = iArr.length;
                                for (int i30 = 0; i30 < length2 / 2; i30++) {
                                    int i31 = iArr[i30];
                                    int i32 = (length2 - i30) - 1;
                                    iArr[i30] = iArr[i32];
                                    iArr[i32] = i31;
                                }
                            }
                            i10 = 1;
                            i21 += iArr[0] + iArr[1];
                            iArr[0] = iArr[2];
                            i18 = 3;
                            iArr[1] = iArr[3];
                            iArr[2] = 0;
                            iArr[3] = 0;
                            i20--;
                        }
                    } else {
                        i10 = 1;
                        i20++;
                    }
                    iArr[i20] = i10;
                    z11 = !z11;
                }
                i9++;
                i16 = 1;
            }
            throw h.f3144W;
        }
    }
}
