package a4;

import M3.b;
import M3.h;
import M3.l;
import M3.n;
import S3.a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: a4.c  reason: case insensitive filesystem */
public final class C0420c extends C0425h {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f7186d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7187a;

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f7188b = new StringBuilder(20);

    /* renamed from: c  reason: collision with root package name */
    public final int[] f7189c = new int[9];

    public C0420c(boolean z) {
        this.f7187a = z;
    }

    public static int h(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i8 = Integer.MAX_VALUE;
            for (int i9 : iArr) {
                if (i9 < i8 && i9 > i) {
                    i8 = i9;
                }
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = iArr[i13];
                if (i14 > i8) {
                    i11 |= 1 << ((length - 1) - i13);
                    i10++;
                    i12 += i14;
                }
            }
            if (i10 == 3) {
                for (int i15 = 0; i15 < length && i10 > 0; i15++) {
                    int i16 = iArr[i15];
                    if (i16 > i8) {
                        i10--;
                        if ((i16 << 1) >= i12) {
                            return -1;
                        }
                    }
                }
                return i11;
            } else if (i10 <= 3) {
                return -1;
            } else {
                i = i8;
            }
        }
    }

    public final l c(int i, a aVar, Map map) {
        char c8;
        a aVar2 = aVar;
        int[] iArr = this.f7189c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f7188b;
        sb.setLength(0);
        int i8 = aVar2.f4504V;
        int b8 = aVar2.b(0);
        int length = iArr.length;
        int i9 = b8;
        boolean z = false;
        int i10 = 0;
        while (b8 < i8) {
            if (aVar2.a(b8) != z) {
                iArr[i10] = iArr[i10] + 1;
                int i11 = i;
            } else {
                if (i10 == length - 1) {
                    int i12 = 148;
                    if (h(iArr) != 148 || !aVar2.d(Math.max(0, i9 - ((b8 - i9) / 2)), i9)) {
                        int i13 = i;
                        i9 += iArr[0] + iArr[1];
                        int i14 = i10 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i14);
                        iArr[i14] = 0;
                        iArr[i10] = 0;
                        i10--;
                    } else {
                        int[] iArr2 = {i9, b8};
                        int b9 = aVar2.b(iArr2[1]);
                        while (true) {
                            C0425h.f(b9, aVar2, iArr);
                            int h5 = h(iArr);
                            if (h5 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    if (i15 < 43) {
                                        if (f7186d[i15] == h5) {
                                            c8 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i15);
                                            break;
                                        }
                                        i15++;
                                    } else if (h5 == i12) {
                                        c8 = '*';
                                    } else {
                                        throw h.f3144W;
                                    }
                                }
                                sb.append(c8);
                                int i16 = b9;
                                for (int i17 : iArr) {
                                    i16 += i17;
                                }
                                int b10 = aVar2.b(i16);
                                if (c8 == '*') {
                                    sb.setLength(sb.length() - 1);
                                    int i18 = 0;
                                    for (int i19 : iArr) {
                                        i18 += i19;
                                    }
                                    int i20 = (b10 - b9) - i18;
                                    if (b10 == aVar2.f4504V || (i20 << 1) >= i18) {
                                        if (this.f7187a) {
                                            int length2 = sb.length() - 1;
                                            int i21 = 0;
                                            for (int i22 = 0; i22 < length2; i22++) {
                                                i21 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb.charAt(i22));
                                            }
                                            if (sb.charAt(length2) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i21 % 43)) {
                                                sb.setLength(length2);
                                            } else {
                                                throw b.a();
                                            }
                                        }
                                        if (sb.length() != 0) {
                                            float f8 = (float) i;
                                            return new l(sb.toString(), (byte[]) null, new n[]{new n(((float) (iArr2[1] + iArr2[0])) / 2.0f, f8), new n((((float) i18) / 2.0f) + ((float) b9), f8)}, M3.a.f3108W);
                                        }
                                        throw h.f3144W;
                                    }
                                    throw h.f3144W;
                                }
                                int i23 = i;
                                b9 = b10;
                                i12 = 148;
                            } else {
                                throw h.f3144W;
                            }
                        }
                    }
                } else {
                    int i24 = i;
                    i10++;
                }
                iArr[i10] = 1;
                z = !z;
            }
            b8++;
        }
        throw h.f3144W;
    }
}
