package a4;

import M3.c;
import M3.h;
import M3.l;
import M3.n;
import S3.a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: a4.a  reason: case insensitive filesystem */
public final class C0418a extends C0425h {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f7180d = "0123456789-$:/.+ABCD".toCharArray();
    public static final int[] e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f  reason: collision with root package name */
    public static final char[] f7181f = {'A', 'B', 'C', 'D'};

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f7182a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public int[] f7183b = new int[80];

    /* renamed from: c  reason: collision with root package name */
    public int f7184c = 0;

    public static boolean h(char[] cArr, char c8) {
        if (cArr != null) {
            for (char c9 : cArr) {
                if (c9 == c8) {
                    return true;
                }
            }
        }
        return false;
    }

    public final l c(int i, a aVar, Map map) {
        int i8;
        int i9;
        int[] iArr;
        int i10;
        a aVar2 = aVar;
        Map map2 = map;
        int i11 = -1;
        int i12 = 2;
        int i13 = 0;
        Arrays.fill(this.f7183b, 0);
        this.f7184c = 0;
        int c8 = aVar2.c(0);
        int i14 = aVar2.f4504V;
        if (c8 < i14) {
            int i15 = 0;
            boolean z = true;
            while (c8 < i14) {
                if (aVar2.a(c8) != z) {
                    i15++;
                } else {
                    int[] iArr2 = this.f7183b;
                    int i16 = this.f7184c;
                    iArr2[i16] = i15;
                    int i17 = i16 + 1;
                    this.f7184c = i17;
                    if (i17 >= iArr2.length) {
                        int[] iArr3 = new int[(i17 << 1)];
                        System.arraycopy(iArr2, 0, iArr3, 0, i17);
                        this.f7183b = iArr3;
                    }
                    z = !z;
                    i15 = 1;
                }
                c8++;
            }
            int[] iArr4 = this.f7183b;
            int i18 = this.f7184c;
            iArr4[i18] = i15;
            int i19 = i18 + 1;
            this.f7184c = i19;
            if (i19 >= iArr4.length) {
                int[] iArr5 = new int[(i19 << 1)];
                System.arraycopy(iArr4, 0, iArr5, 0, i19);
                this.f7183b = iArr5;
            }
            int i20 = 1;
            while (i20 < this.f7184c) {
                int i21 = i(i20);
                if (i21 != i11) {
                    char[] cArr = f7180d;
                    char c9 = cArr[i21];
                    char[] cArr2 = f7181f;
                    if (h(cArr2, c9)) {
                        int i22 = 0;
                        for (int i23 = i20; i23 < i20 + 7; i23++) {
                            i22 += this.f7183b[i23];
                        }
                        if (i20 == 1 || this.f7183b[i20 - 1] >= i22 / i12) {
                            StringBuilder sb = this.f7182a;
                            sb.setLength(i13);
                            int i24 = i20;
                            while (true) {
                                int i25 = i(i24);
                                if (i25 != i11) {
                                    sb.append((char) i25);
                                    i9 = i24 + 8;
                                    if ((sb.length() <= 1 || !h(cArr2, cArr[i25])) && i9 < this.f7184c) {
                                        int i26 = i;
                                        i24 = i9;
                                        i13 = 0;
                                    }
                                } else {
                                    throw h.f3144W;
                                }
                            }
                            int i27 = i24 + 7;
                            int i28 = this.f7183b[i27];
                            int i29 = 0;
                            for (int i30 = -8; i30 < i11; i30++) {
                                i29 += this.f7183b[i9 + i30];
                            }
                            if (i9 >= this.f7184c || i28 >= i29 / i12) {
                                int[] iArr6 = new int[4];
                                iArr6[i13] = i13;
                                iArr6[1] = i13;
                                iArr6[i12] = i13;
                                iArr6[3] = i13;
                                int[] iArr7 = new int[4];
                                iArr7[i13] = i13;
                                iArr7[1] = i13;
                                iArr7[i12] = i13;
                                iArr7[3] = i13;
                                int length = sb.length() - 1;
                                int i31 = i20;
                                int i32 = 0;
                                while (true) {
                                    char charAt = sb.charAt(i32);
                                    iArr = e;
                                    int i33 = iArr[charAt];
                                    for (int i34 = 6; i34 >= 0; i34--) {
                                        int i35 = (i34 & 1) + ((i33 & 1) << 1);
                                        iArr6[i35] = iArr6[i35] + this.f7183b[i31 + i34];
                                        iArr7[i35] = iArr7[i35] + 1;
                                        i33 >>= 1;
                                    }
                                    if (i32 >= length) {
                                        break;
                                    }
                                    i31 += 8;
                                    i32++;
                                }
                                float[] fArr = new float[4];
                                float[] fArr2 = new float[4];
                                int i36 = 0;
                                while (i36 < i12) {
                                    fArr2[i36] = 0.0f;
                                    int i37 = i36 + 2;
                                    float f8 = ((float) iArr6[i36]) / ((float) iArr7[i36]);
                                    float f9 = (float) iArr6[i37];
                                    float f10 = (float) iArr7[i37];
                                    float f11 = ((f9 / f10) + f8) / 2.0f;
                                    fArr2[i37] = f11;
                                    fArr[i36] = f11;
                                    fArr[i37] = ((f9 * 2.0f) + 1.5f) / f10;
                                    i36++;
                                    i12 = 2;
                                }
                                int i38 = 1;
                                int i39 = i20;
                                int i40 = 0;
                                loop8:
                                while (true) {
                                    int i41 = iArr[sb.charAt(i40)];
                                    int i42 = 6;
                                    while (i42 >= 0) {
                                        int i43 = (i42 & 1) + ((i41 & 1) << 1);
                                        float f12 = (float) this.f7183b[i39 + i42];
                                        if (f12 >= fArr2[i43] && f12 <= fArr[i43]) {
                                            i38 = 1;
                                            i41 >>= 1;
                                            i42--;
                                        }
                                    }
                                    if (i40 < length) {
                                        i39 += 8;
                                        i40 += i38;
                                    } else {
                                        for (int i44 = 0; i44 < sb.length(); i44 += i38) {
                                            sb.setCharAt(i44, cArr[sb.charAt(i44)]);
                                        }
                                        if (!h(cArr2, sb.charAt(0))) {
                                            throw h.f3144W;
                                        } else if (!h(cArr2, sb.charAt(sb.length() - i38))) {
                                            throw h.f3144W;
                                        } else if (sb.length() > 3) {
                                            if (map2 == null || !map2.containsKey(c.f3132c0)) {
                                                i10 = 1;
                                                sb.deleteCharAt(sb.length() - 1);
                                                sb.deleteCharAt(0);
                                            } else {
                                                i10 = 1;
                                            }
                                            int i45 = 0;
                                            for (int i46 = 0; i46 < i20; i46 += i10) {
                                                i45 += this.f7183b[i46];
                                            }
                                            float f13 = (float) i45;
                                            while (i20 < i27) {
                                                i45 += this.f7183b[i20];
                                                i20 += i10;
                                            }
                                            String sb2 = sb.toString();
                                            float f14 = (float) i;
                                            return new l(sb2, (byte[]) null, new n[]{new n(f13, f14), new n((float) i45, f14)}, M3.a.f3107V);
                                        } else {
                                            throw h.f3144W;
                                        }
                                    }
                                }
                                throw h.f3144W;
                            }
                            throw h.f3144W;
                        }
                        int i47 = i;
                        i8 = 2;
                        i20 += i8;
                        i11 = -1;
                        i12 = 2;
                        i13 = 0;
                    }
                }
                int i48 = i;
                i8 = 2;
                i20 += i8;
                i11 = -1;
                i12 = 2;
                i13 = 0;
            }
            throw h.f3144W;
        }
        throw h.f3144W;
    }

    public final int i(int i) {
        int i8;
        int i9 = i + 7;
        if (i9 >= this.f7184c) {
            return -1;
        }
        int[] iArr = this.f7183b;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int i14 = i; i14 < i9; i14 += 2) {
            int i15 = iArr[i14];
            if (i15 < i12) {
                i12 = i15;
            }
            if (i15 > i13) {
                i13 = i15;
            }
        }
        int i16 = (i12 + i13) / 2;
        int i17 = 0;
        for (int i18 = i + 1; i18 < i9; i18 += 2) {
            int i19 = iArr[i18];
            if (i19 < i10) {
                i10 = i19;
            }
            if (i19 > i17) {
                i17 = i19;
            }
        }
        int i20 = (i10 + i17) / 2;
        int i21 = 128;
        int i22 = 0;
        for (int i23 = 0; i23 < 7; i23++) {
            if ((i23 & 1) == 0) {
                i8 = i16;
            } else {
                i8 = i20;
            }
            i21 >>= 1;
            if (iArr[i + i23] > i8) {
                i22 |= i21;
            }
        }
        while (true) {
            int[] iArr2 = e;
            if (i11 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i11] == i22) {
                return i11;
            }
            i11++;
        }
    }
}
