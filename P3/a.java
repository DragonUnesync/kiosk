package P3;

import H3.P;
import K1.e;
import M0.C0123k;
import M3.h;
import M3.n;
import S3.b;
import S3.f;
import com.bumptech.glide.d;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f3774g = {3808, 476, 2107, 1799};

    /* renamed from: a  reason: collision with root package name */
    public final b f3775a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3776b;

    /* renamed from: c  reason: collision with root package name */
    public int f3777c;

    /* renamed from: d  reason: collision with root package name */
    public int f3778d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f3779f;

    public a(b bVar) {
        this.f3775a = bVar;
    }

    public static n[] b(n[] nVarArr, int i, int i8) {
        float f8 = ((float) i8) / (((float) i) * 2.0f);
        n nVar = nVarArr[0];
        float f9 = nVar.f3164a;
        n nVar2 = nVarArr[2];
        float f10 = nVar2.f3164a;
        float f11 = f9 - f10;
        float f12 = nVar.f3165b;
        float f13 = nVar2.f3165b;
        float f14 = f12 - f13;
        float f15 = (f9 + f10) / 2.0f;
        float f16 = (f12 + f13) / 2.0f;
        float f17 = f11 * f8;
        float f18 = f14 * f8;
        n nVar3 = new n(f15 + f17, f16 + f18);
        n nVar4 = new n(f15 - f17, f16 - f18);
        n nVar5 = nVarArr[1];
        float f19 = nVar5.f3164a;
        n nVar6 = nVarArr[3];
        float f20 = nVar6.f3164a;
        float f21 = f19 - f20;
        float f22 = nVar5.f3165b;
        float f23 = nVar6.f3165b;
        float f24 = f22 - f23;
        float f25 = (f19 + f20) / 2.0f;
        float f26 = (f22 + f23) / 2.0f;
        float f27 = f21 * f8;
        float f28 = f8 * f24;
        return new n[]{nVar3, new n(f25 + f27, f26 + f28), nVar4, new n(f25 - f27, f26 - f28)};
    }

    public final e a(boolean z) {
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
        int i9;
        int i10;
        b bVar;
        C0123k kVar;
        boolean z6;
        int i11;
        int i12;
        int i13;
        long j7;
        int i14;
        C0123k kVar2;
        C0123k kVar3;
        C0123k kVar4;
        int i15 = -1;
        int i16 = 1;
        int i17 = 2;
        b bVar2 = this.f3775a;
        try {
            n[] b8 = new T3.a(bVar2).b();
            nVar3 = b8[0];
            nVar2 = b8[1];
            nVar = b8[2];
            nVar4 = b8[3];
        } catch (h unused) {
            int i18 = bVar2.f4505U / 2;
            int i19 = bVar2.f4506V / 2;
            int i20 = i18 + 7;
            int i21 = i19 - 7;
            n b9 = e(new C0123k(i20, i21, 2), false, 1, -1).b();
            int i22 = i19 + 7;
            n b10 = e(new C0123k(i20, i22, 2), false, 1, 1).b();
            int i23 = i18 - 7;
            n b11 = e(new C0123k(i23, i22, 2), false, -1, 1).b();
            nVar4 = e(new C0123k(i23, i21, 2), false, -1, -1).b();
            n nVar9 = b10;
            nVar = b11;
            nVar3 = b9;
            nVar2 = nVar9;
        }
        int V02 = n2.a.V0((((nVar3.f3164a + nVar4.f3164a) + nVar2.f3164a) + nVar.f3164a) / 4.0f);
        int V03 = n2.a.V0((((nVar3.f3165b + nVar4.f3165b) + nVar2.f3165b) + nVar.f3165b) / 4.0f);
        try {
            n[] b12 = new T3.a(bVar2, 15, V02, V03).b();
            nVar6 = b12[0];
            nVar5 = b12[1];
            n nVar10 = b12[2];
            nVar8 = b12[3];
            nVar7 = nVar10;
        } catch (h unused2) {
            int i24 = V02 + 7;
            int i25 = V03 - 7;
            n b13 = e(new C0123k(i24, i25, 2), false, 1, -1).b();
            int i26 = V03 + 7;
            int i27 = V02 - 7;
            nVar5 = e(new C0123k(i24, i26, 2), false, 1, 1).b();
            nVar7 = e(new C0123k(i27, i26, 2), false, -1, 1).b();
            nVar8 = e(new C0123k(i27, i25, 2), false, -1, -1).b();
            nVar6 = b13;
        }
        C0123k kVar5 = new C0123k(n2.a.V0((((nVar6.f3164a + nVar8.f3164a) + nVar5.f3164a) + nVar7.f3164a) / 4.0f), n2.a.V0((((nVar6.f3165b + nVar8.f3165b) + nVar5.f3165b) + nVar7.f3165b) / 4.0f), 2);
        this.e = 1;
        C0123k kVar6 = kVar5;
        C0123k kVar7 = kVar6;
        C0123k kVar8 = kVar7;
        boolean z8 = true;
        while (true) {
            int i28 = this.e;
            i = kVar8.f2964b;
            int i29 = kVar8.f2965c;
            i8 = kVar5.f2964b;
            i9 = kVar5.f2965c;
            if (i28 >= 9) {
                i10 = i29;
                bVar = bVar2;
                kVar = kVar7;
                break;
            }
            C0123k e8 = e(kVar5, z8, i16, i15);
            C0123k e9 = e(kVar6, z8, i16, i16);
            C0123k e10 = e(kVar7, z8, i15, i16);
            C0123k e11 = e(kVar8, z8, i15, i15);
            if (this.e > i17) {
                int i30 = e11.f2964b;
                int i31 = e11.f2965c;
                int i32 = e8.f2964b;
                kVar3 = e11;
                int i33 = e8.f2965c;
                kVar2 = e8;
                bVar = bVar2;
                kVar = kVar7;
                double z9 = (double) ((n2.a.z(i30, i31, i32, i33) * ((float) this.e)) / (n2.a.z(i, i29, i8, i9) * ((float) (this.e + 2))));
                if (z9 >= 0.75d && z9 <= 1.25d) {
                    C0123k kVar9 = new C0123k(i32 - 3, i33 + 3, 2);
                    i10 = i29;
                    C0123k kVar10 = new C0123k(e9.f2964b - 3, e9.f2965c - 3, 2);
                    kVar4 = e9;
                    C0123k kVar11 = new C0123k(e10.f2964b + 3, e10.f2965c - 3, 2);
                    C0123k kVar12 = new C0123k(i30 + 3, i31 + 3, 2);
                    int c8 = c(kVar12, kVar9);
                    if (c8 != 0) {
                        if (c(kVar9, kVar10) == c8) {
                            if (c(kVar10, kVar11) == c8) {
                                if (c(kVar11, kVar12) != c8) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    i10 = i29;
                }
            } else {
                bVar = bVar2;
                kVar2 = e8;
                kVar3 = e11;
                kVar4 = e9;
            }
            z8 = !z8;
            this.e++;
            kVar7 = e10;
            kVar8 = kVar3;
            kVar5 = kVar2;
            bVar2 = bVar;
            kVar6 = kVar4;
            i15 = -1;
            i16 = 1;
            i17 = 2;
        }
        int i34 = this.e;
        if (i34 == 5 || i34 == 7) {
            if (i34 == 5) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.f3776b = z6;
            C0123k kVar13 = kVar;
            int i35 = i34 * 2;
            n[] b14 = b(new n[]{new n(((float) i8) + 0.5f, ((float) i9) - 0.5f), new n(((float) kVar6.f2964b) + 0.5f, ((float) kVar6.f2965c) + 0.5f), new n(((float) kVar13.f2964b) - 0.5f, ((float) kVar13.f2965c) + 0.5f), new n(((float) i) - 0.5f, ((float) i10) - 0.5f)}, i35 - 3, i35);
            if (z) {
                n nVar11 = b14[0];
                b14[0] = b14[2];
                b14[2] = nVar11;
            }
            if (!g(b14[0]) || !g(b14[1]) || !g(b14[2]) || !g(b14[3])) {
                throw h.f3144W;
            }
            int i36 = this.e * 2;
            int[] iArr = {h(b14[0], b14[1], i36), h(b14[1], b14[2], i36), h(b14[2], b14[3], i36), h(b14[3], b14[0], i36)};
            int i37 = 0;
            for (int i38 = 0; i38 < 4; i38++) {
                int i39 = iArr[i38];
                i37 = (i37 << 3) + ((i39 >> (i36 - 2)) << 1) + (i39 & 1);
            }
            int i40 = ((i37 & 1) << 11) + (i37 >> 1);
            int i41 = 0;
            int i42 = 4;
            while (i41 < 4) {
                if (Integer.bitCount(f3774g[i41] ^ i40) <= 2) {
                    this.f3779f = i41;
                    long j8 = 0;
                    int i43 = 0;
                    while (true) {
                        i11 = 10;
                        if (i43 >= i42) {
                            break;
                        }
                        int i44 = iArr[(this.f3779f + i43) % i42];
                        if (this.f3776b) {
                            j7 = j8 << 7;
                            i13 = 1;
                            i14 = (i44 >> 1) & 127;
                        } else {
                            i13 = 1;
                            j7 = j8 << 10;
                            i14 = ((i44 >> 2) & 992) + ((i44 >> 1) & 31);
                        }
                        j8 = j7 + ((long) i14);
                        i43 += i13;
                        i42 = 4;
                    }
                    if (this.f3776b) {
                        i12 = 2;
                        i11 = 7;
                    } else {
                        i12 = 4;
                    }
                    int i45 = i11 - i12;
                    int[] iArr2 = new int[i11];
                    for (int i46 = i11 - 1; i46 >= 0; i46--) {
                        iArr2[i46] = ((int) j8) & 15;
                        j8 >>= 4;
                    }
                    try {
                        new P((Object) U3.a.f5423k).w0(iArr2, i45);
                        int i47 = 0;
                        for (int i48 = 0; i48 < i12; i48++) {
                            i47 = (i47 << 4) + iArr2[i48];
                        }
                        if (this.f3776b) {
                            this.f3777c = (i47 >> 6) + 1;
                            this.f3778d = (i47 & 63) + 1;
                        } else {
                            this.f3777c = (i47 >> 11) + 1;
                            this.f3778d = (i47 & 2047) + 1;
                        }
                        int i49 = this.f3779f;
                        n nVar12 = b14[i49 % 4];
                        n nVar13 = b14[(i49 + 1) % 4];
                        n nVar14 = b14[(i49 + 2) % 4];
                        n nVar15 = b14[(i49 + 3) % 4];
                        int d8 = d();
                        float f8 = ((float) d8) / 2.0f;
                        float f9 = (float) this.e;
                        float f10 = f8 - f9;
                        float f11 = f8 + f9;
                        return new e(d.r(bVar, d8, d8, f.a(f10, f10, f11, f10, f11, f11, f10, f11, nVar12.f3164a, nVar12.f3165b, nVar13.f3164a, nVar13.f3165b, nVar14.f3164a, nVar14.f3165b, nVar15.f3164a, nVar15.f3165b)), b(b14, this.e * 2, d()), this.f3776b, this.f3778d, this.f3777c);
                    } catch (U3.b unused3) {
                        throw h.f3144W;
                    }
                } else {
                    b bVar3 = bVar;
                    i41++;
                }
            }
            throw h.f3144W;
        }
        throw h.f3144W;
    }

    public final int c(C0123k kVar, C0123k kVar2) {
        int i = kVar.f2964b;
        int i8 = kVar.f2965c;
        int i9 = kVar2.f2964b;
        int i10 = kVar2.f2965c;
        float z = n2.a.z(i, i8, i9, i10);
        float f8 = ((float) (i9 - i)) / z;
        float f9 = ((float) (i10 - i8)) / z;
        float f10 = (float) i;
        float f11 = (float) i8;
        b bVar = this.f3775a;
        boolean b8 = bVar.b(i, i8);
        int ceil = (int) Math.ceil((double) z);
        boolean z6 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < ceil; i12++) {
            f10 += f8;
            f11 += f9;
            if (bVar.b(n2.a.V0(f10), n2.a.V0(f11)) != b8) {
                i11++;
            }
        }
        float f12 = ((float) i11) / z;
        if (f12 > 0.1f && f12 < 0.9f) {
            return 0;
        }
        if (f12 <= 0.1f) {
            z6 = true;
        }
        if (z6 == b8) {
            return 1;
        }
        return -1;
    }

    public final int d() {
        if (this.f3776b) {
            return (this.f3777c * 4) + 11;
        }
        int i = this.f3777c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return ((((i - 4) / 8) + 1) * 2) + (i * 4) + 15;
    }

    public final C0123k e(C0123k kVar, boolean z, int i, int i8) {
        int i9 = kVar.f2964b + i;
        int i10 = kVar.f2965c;
        while (true) {
            i10 += i8;
            boolean f8 = f(i9, i10);
            b bVar = this.f3775a;
            if (!f8 || bVar.b(i9, i10) != z) {
                int i11 = i9 - i;
                int i12 = i10 - i8;
            } else {
                i9 += i;
            }
        }
        int i112 = i9 - i;
        int i122 = i10 - i8;
        while (f(i112, i122) && bVar.b(i112, i122) == z) {
            i112 += i;
        }
        int i13 = i112 - i;
        while (f(i13, i122) && bVar.b(i13, i122) == z) {
            i122 += i8;
        }
        return new C0123k(i13, i122 - i8, 2);
    }

    public final boolean f(int i, int i8) {
        if (i < 0) {
            return false;
        }
        b bVar = this.f3775a;
        if (i >= bVar.f4505U || i8 <= 0 || i8 >= bVar.f4506V) {
            return false;
        }
        return true;
    }

    public final boolean g(n nVar) {
        return f(n2.a.V0(nVar.f3164a), n2.a.V0(nVar.f3165b));
    }

    public final int h(n nVar, n nVar2, int i) {
        float f8 = nVar.f3164a;
        float f9 = nVar2.f3164a;
        float f10 = nVar.f3165b;
        float f11 = nVar2.f3165b;
        float y8 = n2.a.y(f8, f10, f9, f11);
        float f12 = y8 / ((float) i);
        float f13 = nVar2.f3164a;
        float f14 = nVar.f3164a;
        float f15 = ((f13 - f14) * f12) / y8;
        float f16 = ((f11 - f10) * f12) / y8;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            float f17 = (float) i9;
            if (this.f3775a.b(n2.a.V0((f17 * f15) + f14), n2.a.V0((f17 * f16) + f10))) {
                i8 |= 1 << ((i - i9) - 1);
            }
        }
        return i8;
    }
}
