package a4;

import M3.a;
import M3.d;
import M3.h;
import M3.l;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: a4.e  reason: case insensitive filesystem */
public final class C0422e extends k {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f7194j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f7195k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l  reason: collision with root package name */
    public static final int[][] f7196l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f7197h;
    public final Object i;

    public C0422e(int i8) {
        this.f7197h = i8;
        switch (i8) {
            case 1:
                this.i = new int[4];
                return;
            case 2:
                this.i = new int[4];
                return;
            case 3:
                this.i = new C0422e(0);
                return;
            default:
                this.i = new int[4];
                return;
        }
    }

    public static l p(l lVar) {
        String str = lVar.f3149a;
        if (str.charAt(0) == '0') {
            l lVar2 = new l(str.substring(1), (byte[]) null, lVar.f3151c, a.f3120i0);
            EnumMap enumMap = lVar.e;
            if (enumMap != null) {
                lVar2.a(enumMap);
            }
            return lVar2;
        }
        throw d.a();
    }

    public l b(A1.d dVar, EnumMap enumMap) {
        switch (this.f7197h) {
            case 3:
                return p(((C0422e) this.i).b(dVar, enumMap));
            default:
                return super.b(dVar, enumMap);
        }
    }

    public l c(int i8, S3.a aVar, Map map) {
        switch (this.f7197h) {
            case 3:
                return p(((C0422e) this.i).c(i8, aVar, map));
            default:
                return super.c(i8, aVar, map);
        }
    }

    public boolean h(String str) {
        switch (this.f7197h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb = new StringBuilder(12);
                sb.append(str.charAt(0));
                char c8 = cArr[5];
                switch (c8) {
                    case '0':
                    case '1':
                    case '2':
                        sb.append(cArr, 0, 2);
                        sb.append(c8);
                        sb.append("0000");
                        sb.append(cArr, 2, 3);
                        break;
                    case '3':
                        sb.append(cArr, 0, 3);
                        sb.append("00000");
                        sb.append(cArr, 3, 2);
                        break;
                    case '4':
                        sb.append(cArr, 0, 4);
                        sb.append("00000");
                        sb.append(cArr[4]);
                        break;
                    default:
                        sb.append(cArr, 0, 5);
                        sb.append("0000");
                        sb.append(c8);
                        break;
                }
                if (str.length() >= 8) {
                    sb.append(str.charAt(7));
                }
                return super.h(sb.toString());
            default:
                return super.h(str);
        }
    }

    public int[] j(S3.a aVar, int i8) {
        switch (this.f7197h) {
            case 1:
                return k.m(aVar, i8, true, f7195k, new int[6]);
            default:
                return super.j(aVar, i8);
        }
    }

    public final int k(S3.a aVar, int[] iArr, StringBuilder sb) {
        int[][] iArr2;
        switch (this.f7197h) {
            case 0:
                int[] iArr3 = (int[]) this.i;
                iArr3[0] = 0;
                iArr3[1] = 0;
                iArr3[2] = 0;
                iArr3[3] = 0;
                int i8 = aVar.f4504V;
                int i9 = iArr[1];
                int i10 = 0;
                for (int i11 = 0; i11 < 6 && i9 < i8; i11++) {
                    int i12 = k.i(aVar, iArr3, i9, k.f7214g);
                    sb.append((char) ((i12 % 10) + 48));
                    for (int i13 : iArr3) {
                        i9 += i13;
                    }
                    if (i12 >= 10) {
                        i10 |= 1 << (5 - i11);
                    }
                }
                for (int i14 = 0; i14 < 10; i14++) {
                    if (i10 == f7194j[i14]) {
                        sb.insert(0, (char) (i14 + 48));
                        int i15 = k.m(aVar, i9, true, k.e, new int[5])[1];
                        for (int i16 = 0; i16 < 6 && i15 < i8; i16++) {
                            sb.append((char) (k.i(aVar, iArr3, i15, k.f7213f) + 48));
                            for (int i17 : iArr3) {
                                i15 += i17;
                            }
                        }
                        return i15;
                    }
                }
                throw h.f3144W;
            case 1:
                int[] iArr4 = (int[]) this.i;
                iArr4[0] = 0;
                iArr4[1] = 0;
                iArr4[2] = 0;
                iArr4[3] = 0;
                int i18 = aVar.f4504V;
                int i19 = iArr[1];
                int i20 = 0;
                for (int i21 = 0; i21 < 6 && i19 < i18; i21++) {
                    int i22 = k.i(aVar, iArr4, i19, k.f7214g);
                    sb.append((char) ((i22 % 10) + 48));
                    for (int i23 : iArr4) {
                        i19 += i23;
                    }
                    if (i22 >= 10) {
                        i20 |= 1 << (5 - i21);
                    }
                }
                for (int i24 = 0; i24 <= 1; i24++) {
                    for (int i25 = 0; i25 < 10; i25++) {
                        if (i20 == f7196l[i24][i25]) {
                            sb.insert(0, (char) (i24 + 48));
                            sb.append((char) (i25 + 48));
                            return i19;
                        }
                    }
                }
                throw h.f3144W;
            case 2:
                int[] iArr5 = (int[]) this.i;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i26 = aVar.f4504V;
                int i27 = iArr[1];
                int i28 = 0;
                while (true) {
                    iArr2 = k.f7213f;
                    if (i28 >= 4 || i27 >= i26) {
                        int i29 = k.m(aVar, i27, true, k.e, new int[5])[1];
                    } else {
                        sb.append((char) (k.i(aVar, iArr5, i27, iArr2) + 48));
                        for (int i30 : iArr5) {
                            i27 += i30;
                        }
                        i28++;
                    }
                }
                int i292 = k.m(aVar, i27, true, k.e, new int[5])[1];
                for (int i31 = 0; i31 < 4 && i292 < i26; i31++) {
                    sb.append((char) (k.i(aVar, iArr5, i292, iArr2) + 48));
                    for (int i32 : iArr5) {
                        i292 += i32;
                    }
                }
                return i292;
            default:
                return ((C0422e) this.i).k(aVar, iArr, sb);
        }
    }

    public l l(int i8, S3.a aVar, int[] iArr, Map map) {
        switch (this.f7197h) {
            case 3:
                return p(((C0422e) this.i).l(i8, aVar, iArr, map));
            default:
                return super.l(i8, aVar, iArr, map);
        }
    }

    public final a o() {
        switch (this.f7197h) {
            case 0:
                return a.f3113b0;
            case 1:
                return a.f3121j0;
            case 2:
                return a.f3112a0;
            default:
                return a.f3120i0;
        }
    }
}
