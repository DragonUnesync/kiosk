package O3;

import H3.P;
import K1.e;
import M3.k;
import S3.b;
import S3.d;
import java.util.ArrayList;
import java.util.Arrays;
import u.C1477r;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f3644b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3645c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3646d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    public static final String[] e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f3647f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a  reason: collision with root package name */
    public e f3648a;

    public static int b(boolean[] zArr, int i, int i8) {
        int i9 = 0;
        for (int i10 = i; i10 < i + i8; i10++) {
            i9 <<= 1;
            if (zArr[i10]) {
                i9 |= 1;
            }
        }
        return i9;
    }

    public final d a(e eVar) {
        int i;
        int i8;
        int i9;
        U3.a aVar;
        Throwable th;
        int i10;
        String str;
        byte b8;
        int i11;
        boolean z;
        boolean z6;
        e eVar2 = eVar;
        int i12 = 2;
        this.f3648a = eVar2;
        b bVar = (b) eVar2.f2558d;
        boolean z8 = eVar2.f2555a;
        if (z8) {
            i = 11;
        } else {
            i = 14;
        }
        int i13 = eVar2.f2557c;
        int i14 = i + (i13 << 2);
        int[] iArr = new int[i14];
        if (z8) {
            i8 = 88;
        } else {
            i8 = 112;
        }
        int i15 = (i8 + (i13 << 4)) * i13;
        boolean[] zArr = new boolean[i15];
        if (z8) {
            for (int i16 = 0; i16 < i14; i16++) {
                iArr[i16] = i16;
            }
        } else {
            int i17 = i14 / 2;
            int i18 = ((((i17 - 1) / 15) * 2) + (i14 + 1)) / 2;
            for (int i19 = 0; i19 < i17; i19++) {
                int i20 = (i19 / 15) + i19;
                iArr[(i17 - i19) - 1] = (i18 - i20) - 1;
                iArr[i17 + i19] = i18 + i20 + 1;
            }
        }
        int i21 = 0;
        int i22 = 0;
        while (true) {
            int i23 = 12;
            if (i21 >= i13) {
                break;
            }
            int i24 = (i13 - i21) << 2;
            if (z8) {
                i23 = 9;
            }
            int i25 = i24 + i23;
            int i26 = i21 << 1;
            int i27 = (i14 - 1) - i26;
            int i28 = 0;
            while (i28 < i25) {
                int i29 = i28 << 1;
                int i30 = 0;
                while (i30 < i12) {
                    int i31 = i26 + i30;
                    int i32 = i26 + i28;
                    zArr[i22 + i29 + i30] = bVar.b(iArr[i31], iArr[i32]);
                    int i33 = i27 - i30;
                    zArr[(i25 * 2) + i22 + i29 + i30] = bVar.b(iArr[i32], iArr[i33]);
                    int i34 = i27 - i28;
                    zArr[(i25 * 4) + i22 + i29 + i30] = bVar.b(iArr[i33], iArr[i34]);
                    zArr[(i25 * 6) + i22 + i29 + i30] = bVar.b(iArr[i34], iArr[i31]);
                    i30++;
                    i13 = i13;
                    i12 = 2;
                }
                i28++;
                i13 = i13;
                i12 = 2;
            }
            i22 += i25 << 3;
            i21++;
            i13 = i13;
            i12 = 2;
        }
        e eVar3 = this.f3648a;
        int i35 = eVar3.f2557c;
        if (i35 <= 2) {
            aVar = U3.a.f5422j;
            i9 = 6;
        } else if (i35 <= 8) {
            aVar = U3.a.f5426n;
            i9 = 8;
        } else if (i35 <= 22) {
            aVar = U3.a.i;
            i9 = 10;
        } else {
            aVar = U3.a.f5421h;
            i9 = 12;
        }
        int i36 = i15 / i9;
        int i37 = eVar3.f2556b;
        if (i36 >= i37) {
            int i38 = i15 % i9;
            int[] iArr2 = new int[i36];
            int i39 = 0;
            while (i39 < i36) {
                iArr2[i39] = b(zArr, i38, i9);
                i39++;
                i38 += i9;
            }
            try {
                new P((Object) aVar).w0(iArr2, i36 - i37);
                int i40 = 1 << i9;
                int i41 = i40 - 1;
                int i42 = 0;
                for (int i43 = 0; i43 < i37; i43++) {
                    int i44 = iArr2[i43];
                    if (i44 == 0 || i44 == i41) {
                        throw M3.d.a();
                    }
                    if (i44 == 1 || i44 == i40 - 2) {
                        i42++;
                    }
                }
                int i45 = (i37 * i9) - i42;
                boolean[] zArr2 = new boolean[i45];
                int i46 = 0;
                int i47 = 0;
                while (i46 < i37) {
                    int i48 = iArr2[i46];
                    int i49 = 1;
                    if (i48 == 1 || i48 == i40 - 2) {
                        i11 = 1;
                        int i50 = (i47 + i9) - 1;
                        if (i48 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i47, i50, z);
                        i47 = (i9 - 1) + i47;
                    } else {
                        int i51 = i9 - 1;
                        while (i51 >= 0) {
                            int i52 = i47 + 1;
                            if ((i48 & (i49 << i51)) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            zArr2[i47] = z6;
                            i51--;
                            i47 = i52;
                            i49 = 1;
                        }
                        i11 = 1;
                    }
                    i46 += i11;
                }
                int i53 = 8;
                int i54 = (i45 + 7) / 8;
                byte[] bArr = new byte[i54];
                int i55 = 0;
                while (i55 < i54) {
                    int i56 = i55 << 3;
                    int i57 = i45 - i56;
                    if (i57 >= i53) {
                        b8 = (byte) b(zArr2, i56, i53);
                    } else {
                        b8 = (byte) (b(zArr2, i56, i57) << (8 - i57));
                    }
                    bArr[i55] = b8;
                    i55++;
                    i53 = 8;
                }
                StringBuilder sb = new StringBuilder(20);
                int i58 = 1;
                int i59 = 1;
                int i60 = 0;
                while (i60 < i45) {
                    if (i58 == 6) {
                        if (i45 - i60 < 5) {
                            break;
                        }
                        int b9 = b(zArr2, i60, 5);
                        int i61 = i60 + 5;
                        if (b9 == 0) {
                            if (i45 - i61 < 11) {
                                break;
                            }
                            b9 = b(zArr2, i61, 11) + 31;
                            i61 = i60 + 16;
                        }
                        int i62 = 0;
                        while (true) {
                            if (i62 >= b9) {
                                i60 = i61;
                                break;
                            } else if (i45 - i61 < 8) {
                                i60 = i45;
                                break;
                            } else {
                                sb.append((char) b(zArr2, i61, 8));
                                i61 += 8;
                                i62++;
                            }
                        }
                    } else {
                        if (i58 == 4) {
                            i10 = 4;
                        } else {
                            i10 = 5;
                        }
                        if (i45 - i60 < i10) {
                            break;
                        }
                        int b10 = b(zArr2, i60, i10);
                        i60 += i10;
                        int h5 = C1477r.h(i58);
                        if (h5 == 0) {
                            str = f3644b[b10];
                        } else if (h5 == 1) {
                            str = f3645c[b10];
                        } else if (h5 == 2) {
                            str = f3646d[b10];
                        } else if (h5 == 3) {
                            str = f3647f[b10];
                        } else if (h5 == 4) {
                            str = e[b10];
                        } else {
                            throw new IllegalStateException("Bad table");
                        }
                        if (str.startsWith("CTRL_")) {
                            char charAt = str.charAt(5);
                            if (charAt == 'B') {
                                i59 = 6;
                            } else if (charAt == 'D') {
                                i59 = 4;
                            } else if (charAt == 'P') {
                                i59 = 5;
                            } else if (charAt == 'L') {
                                i59 = 2;
                            } else if (charAt != 'M') {
                                i59 = 1;
                            } else {
                                i59 = 3;
                            }
                            if (str.charAt(6) != 'L') {
                                int i63 = i59;
                                i59 = i58;
                                i58 = i63;
                            }
                        } else {
                            sb.append(str);
                        }
                    }
                    i58 = i59;
                }
                return new d(bArr, sb.toString(), (ArrayList) null, (String) null);
            } catch (U3.b e8) {
                M3.d dVar = M3.d.f3137W;
                if (k.f3147U) {
                    th = new Exception(e8);
                } else {
                    th = M3.d.f3137W;
                }
                throw th;
            }
        } else {
            throw M3.d.a();
        }
    }
}
