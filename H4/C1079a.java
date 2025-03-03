package h4;

import M3.n;
import S3.b;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: h4.a  reason: case insensitive filesystem */
public abstract class C1079a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f12614a = {0, 4, 1, 5};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12615b = {6, 2, 7, 3};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f12616c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f12617d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static ArrayList a(b bVar) {
        int i;
        int i8;
        ArrayList arrayList = new ArrayList();
        int i9 = bVar.f4506V;
        if (i9 > 0) {
            n[] nVarArr = new n[8];
            int[] iArr = f12616c;
            int i10 = bVar.f4505U;
            n[] c8 = c(bVar, i9, i10, 0, 0, iArr);
            int[] iArr2 = f12614a;
            for (int i11 = 0; i11 < 4; i11++) {
                nVarArr[iArr2[i11]] = c8[i11];
            }
            n nVar = nVarArr[4];
            if (nVar != null) {
                i8 = (int) nVar.f3165b;
                i = (int) nVar.f3164a;
            } else {
                i8 = 0;
                i = 0;
            }
            n[] c9 = c(bVar, i9, i10, i8, i, f12617d);
            int[] iArr3 = f12615b;
            for (int i12 = 0; i12 < 4; i12++) {
                nVarArr[iArr3[i12]] = c9[i12];
            }
            if (!(nVarArr[0] == null && nVarArr[3] == null)) {
                arrayList.add(nVarArr);
            }
        }
        return arrayList;
    }

    public static int[] b(b bVar, int i, int i8, int i9, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i10 = 0;
        while (bVar.b(i, i8) && i > 0) {
            int i11 = i10 + 1;
            if (i10 >= 3) {
                break;
            }
            i--;
            i10 = i11;
        }
        int length = iArr.length;
        int i12 = i;
        int i13 = 0;
        boolean z = false;
        while (i < i9) {
            if (bVar.b(i, i8) != z) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else if (d(iArr2, iArr) < 0.42f) {
                    return new int[]{i12, i};
                } else {
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z = !z;
            }
            i++;
        }
        if (i13 != length - 1 || d(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i12, i - 1};
    }

    public static n[] c(b bVar, int i, int i8, int i9, int i10, int[] iArr) {
        boolean z;
        int i11 = i;
        n[] nVarArr = new n[4];
        int[] iArr2 = new int[iArr.length];
        int i12 = i9;
        while (true) {
            if (i12 >= i11) {
                z = false;
                break;
            }
            int[] b8 = b(bVar, i10, i12, i8, iArr, iArr2);
            if (b8 != null) {
                int i13 = i12;
                int[] iArr3 = b8;
                while (i13 > 0) {
                    int i14 = i13 - 1;
                    int[] b9 = b(bVar, i10, i14, i8, iArr, iArr2);
                    if (b9 == null) {
                        break;
                    }
                    iArr3 = b9;
                    i13 = i14;
                }
                float f8 = (float) i13;
                nVarArr[0] = new n((float) iArr3[0], f8);
                nVarArr[1] = new n((float) iArr3[1], f8);
                i12 = i13;
                z = true;
            } else {
                i12 += 5;
            }
        }
        int i15 = i12 + 1;
        if (z) {
            int[] iArr4 = {(int) nVarArr[0].f3164a, (int) nVarArr[1].f3164a};
            int i16 = i15;
            int i17 = 0;
            while (i16 < i11) {
                int[] b10 = b(bVar, iArr4[0], i16, i8, iArr, iArr2);
                if (b10 == null || Math.abs(iArr4[0] - b10[0]) >= 5 || Math.abs(iArr4[1] - b10[1]) >= 5) {
                    if (i17 > 25) {
                        break;
                    }
                    i17++;
                } else {
                    iArr4 = b10;
                    i17 = 0;
                }
                i16++;
            }
            i15 = i16 - (i17 + 1);
            float f9 = (float) i15;
            nVarArr[2] = new n((float) iArr4[0], f9);
            nVarArr[3] = new n((float) iArr4[1], f9);
        }
        if (i15 - i12 < 10) {
            Arrays.fill(nVarArr, (Object) null);
        }
        return nVarArr;
    }

    public static float d(int[] iArr, int[] iArr2) {
        float f8;
        int length = iArr.length;
        int i = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i += iArr[i9];
            i8 += iArr2[i9];
        }
        if (i < i8) {
            return Float.POSITIVE_INFINITY;
        }
        float f9 = (float) i;
        float f10 = f9 / ((float) i8);
        float f11 = 0.8f * f10;
        float f12 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            float f13 = ((float) iArr2[i10]) * f10;
            float f14 = (float) i11;
            if (f14 > f13) {
                f8 = f14 - f13;
            } else {
                f8 = f13 - f14;
            }
            if (f8 > f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f8;
        }
        return f12 / f9;
    }
}
