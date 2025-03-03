package c0;

import B3.q;
import N.e;
import Q0.g;
import java.util.Arrays;

/* renamed from: c0.a  reason: case insensitive filesystem */
public final class C0603a implements C0604b {

    /* renamed from: a  reason: collision with root package name */
    public int f8707a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0605c f8708b;

    /* renamed from: c  reason: collision with root package name */
    public final q f8709c;

    /* renamed from: d  reason: collision with root package name */
    public int f8710d = 8;
    public int[] e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f8711f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f8712g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f8713h = -1;
    public int i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8714j = false;

    public C0603a(C0605c cVar, q qVar) {
        this.f8708b = cVar;
        this.f8709c = qVar;
    }

    public final float a(int i8) {
        int i9 = this.f8713h;
        int i10 = 0;
        while (i9 != -1 && i10 < this.f8707a) {
            if (i10 == i8) {
                return this.f8712g[i9];
            }
            i9 = this.f8711f[i9];
            i10++;
        }
        return 0.0f;
    }

    public final float b(i iVar, boolean z) {
        int i8 = this.f8713h;
        if (i8 == -1) {
            return 0.0f;
        }
        int i9 = 0;
        int i10 = -1;
        while (i8 != -1 && i9 < this.f8707a) {
            if (this.e[i8] == iVar.f8742b) {
                if (i8 == this.f8713h) {
                    this.f8713h = this.f8711f[i8];
                } else {
                    int[] iArr = this.f8711f;
                    iArr[i10] = iArr[i8];
                }
                if (z) {
                    iVar.b(this.f8708b);
                }
                iVar.f8749k--;
                this.f8707a--;
                this.e[i8] = -1;
                if (this.f8714j) {
                    this.i = i8;
                }
                return this.f8712g[i8];
            }
            i9++;
            i10 = i8;
            i8 = this.f8711f[i8];
        }
        return 0.0f;
    }

    public final float c(C0605c cVar, boolean z) {
        float j7 = j(cVar.f8715a);
        b(cVar.f8715a, z);
        C0604b bVar = cVar.f8718d;
        int d8 = bVar.d();
        for (int i8 = 0; i8 < d8; i8++) {
            i g8 = bVar.g(i8);
            e(g8, bVar.j(g8) * j7, z);
        }
        return j7;
    }

    public final void clear() {
        int i8 = this.f8713h;
        int i9 = 0;
        while (i8 != -1 && i9 < this.f8707a) {
            i iVar = ((i[]) this.f8709c.f452X)[this.e[i8]];
            if (iVar != null) {
                iVar.b(this.f8708b);
            }
            i8 = this.f8711f[i8];
            i9++;
        }
        this.f8713h = -1;
        this.i = -1;
        this.f8714j = false;
        this.f8707a = 0;
    }

    public final int d() {
        return this.f8707a;
    }

    public final void e(i iVar, float f8, boolean z) {
        if (f8 <= -0.001f || f8 >= 0.001f) {
            int i8 = this.f8713h;
            C0605c cVar = this.f8708b;
            if (i8 == -1) {
                this.f8713h = 0;
                this.f8712g[0] = f8;
                this.e[0] = iVar.f8742b;
                this.f8711f[0] = -1;
                iVar.f8749k++;
                iVar.a(cVar);
                this.f8707a++;
                if (!this.f8714j) {
                    int i9 = this.i + 1;
                    this.i = i9;
                    int[] iArr = this.e;
                    if (i9 >= iArr.length) {
                        this.f8714j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i10 = 0;
            int i11 = -1;
            while (i8 != -1 && i10 < this.f8707a) {
                int i12 = this.e[i8];
                int i13 = iVar.f8742b;
                if (i12 == i13) {
                    float[] fArr = this.f8712g;
                    float f9 = fArr[i8] + f8;
                    if (f9 > -0.001f && f9 < 0.001f) {
                        f9 = 0.0f;
                    }
                    fArr[i8] = f9;
                    if (f9 == 0.0f) {
                        if (i8 == this.f8713h) {
                            this.f8713h = this.f8711f[i8];
                        } else {
                            int[] iArr2 = this.f8711f;
                            iArr2[i11] = iArr2[i8];
                        }
                        if (z) {
                            iVar.b(cVar);
                        }
                        if (this.f8714j) {
                            this.i = i8;
                        }
                        iVar.f8749k--;
                        this.f8707a--;
                        return;
                    }
                    return;
                }
                if (i12 < i13) {
                    i11 = i8;
                }
                i8 = this.f8711f[i8];
                i10++;
            }
            int i14 = this.i;
            int i15 = i14 + 1;
            if (this.f8714j) {
                int[] iArr3 = this.e;
                if (iArr3[i14] != -1) {
                    i14 = iArr3.length;
                }
            } else {
                i14 = i15;
            }
            int[] iArr4 = this.e;
            if (i14 >= iArr4.length && this.f8707a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i16 >= iArr5.length) {
                        break;
                    } else if (iArr5[i16] == -1) {
                        i14 = i16;
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            int[] iArr6 = this.e;
            if (i14 >= iArr6.length) {
                i14 = iArr6.length;
                int i17 = this.f8710d * 2;
                this.f8710d = i17;
                this.f8714j = false;
                this.i = i14 - 1;
                this.f8712g = Arrays.copyOf(this.f8712g, i17);
                this.e = Arrays.copyOf(this.e, this.f8710d);
                this.f8711f = Arrays.copyOf(this.f8711f, this.f8710d);
            }
            this.e[i14] = iVar.f8742b;
            this.f8712g[i14] = f8;
            if (i11 != -1) {
                int[] iArr7 = this.f8711f;
                iArr7[i14] = iArr7[i11];
                iArr7[i11] = i14;
            } else {
                this.f8711f[i14] = this.f8713h;
                this.f8713h = i14;
            }
            iVar.f8749k++;
            iVar.a(cVar);
            this.f8707a++;
            if (!this.f8714j) {
                this.i++;
            }
            int i18 = this.i;
            int[] iArr8 = this.e;
            if (i18 >= iArr8.length) {
                this.f8714j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final boolean f(i iVar) {
        int i8 = this.f8713h;
        if (i8 == -1) {
            return false;
        }
        int i9 = 0;
        while (i8 != -1 && i9 < this.f8707a) {
            if (this.e[i8] == iVar.f8742b) {
                return true;
            }
            i8 = this.f8711f[i8];
            i9++;
        }
        return false;
    }

    public final i g(int i8) {
        int i9 = this.f8713h;
        int i10 = 0;
        while (i9 != -1 && i10 < this.f8707a) {
            if (i10 == i8) {
                return ((i[]) this.f8709c.f452X)[this.e[i9]];
            }
            i9 = this.f8711f[i9];
            i10++;
        }
        return null;
    }

    public final void h(float f8) {
        int i8 = this.f8713h;
        int i9 = 0;
        while (i8 != -1 && i9 < this.f8707a) {
            float[] fArr = this.f8712g;
            fArr[i8] = fArr[i8] / f8;
            i8 = this.f8711f[i8];
            i9++;
        }
    }

    public final void i(i iVar, float f8) {
        if (f8 == 0.0f) {
            b(iVar, true);
            return;
        }
        int i8 = this.f8713h;
        C0605c cVar = this.f8708b;
        if (i8 == -1) {
            this.f8713h = 0;
            this.f8712g[0] = f8;
            this.e[0] = iVar.f8742b;
            this.f8711f[0] = -1;
            iVar.f8749k++;
            iVar.a(cVar);
            this.f8707a++;
            if (!this.f8714j) {
                int i9 = this.i + 1;
                this.i = i9;
                int[] iArr = this.e;
                if (i9 >= iArr.length) {
                    this.f8714j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i10 = 0;
        int i11 = -1;
        while (i8 != -1 && i10 < this.f8707a) {
            int i12 = this.e[i8];
            int i13 = iVar.f8742b;
            if (i12 == i13) {
                this.f8712g[i8] = f8;
                return;
            }
            if (i12 < i13) {
                i11 = i8;
            }
            i8 = this.f8711f[i8];
            i10++;
        }
        int i14 = this.i;
        int i15 = i14 + 1;
        if (this.f8714j) {
            int[] iArr2 = this.e;
            if (iArr2[i14] != -1) {
                i14 = iArr2.length;
            }
        } else {
            i14 = i15;
        }
        int[] iArr3 = this.e;
        if (i14 >= iArr3.length && this.f8707a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i16 >= iArr4.length) {
                    break;
                } else if (iArr4[i16] == -1) {
                    i14 = i16;
                    break;
                } else {
                    i16++;
                }
            }
        }
        int[] iArr5 = this.e;
        if (i14 >= iArr5.length) {
            i14 = iArr5.length;
            int i17 = this.f8710d * 2;
            this.f8710d = i17;
            this.f8714j = false;
            this.i = i14 - 1;
            this.f8712g = Arrays.copyOf(this.f8712g, i17);
            this.e = Arrays.copyOf(this.e, this.f8710d);
            this.f8711f = Arrays.copyOf(this.f8711f, this.f8710d);
        }
        this.e[i14] = iVar.f8742b;
        this.f8712g[i14] = f8;
        if (i11 != -1) {
            int[] iArr6 = this.f8711f;
            iArr6[i14] = iArr6[i11];
            iArr6[i11] = i14;
        } else {
            this.f8711f[i14] = this.f8713h;
            this.f8713h = i14;
        }
        iVar.f8749k++;
        iVar.a(cVar);
        int i18 = this.f8707a + 1;
        this.f8707a = i18;
        if (!this.f8714j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i18 >= iArr7.length) {
            this.f8714j = true;
        }
        if (this.i >= iArr7.length) {
            this.f8714j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float j(i iVar) {
        int i8 = this.f8713h;
        int i9 = 0;
        while (i8 != -1 && i9 < this.f8707a) {
            if (this.e[i8] == iVar.f8742b) {
                return this.f8712g[i8];
            }
            i8 = this.f8711f[i8];
            i9++;
        }
        return 0.0f;
    }

    public final void k() {
        int i8 = this.f8713h;
        int i9 = 0;
        while (i8 != -1 && i9 < this.f8707a) {
            float[] fArr = this.f8712g;
            fArr[i8] = fArr[i8] * -1.0f;
            i8 = this.f8711f[i8];
            i9++;
        }
    }

    public final String toString() {
        int i8 = this.f8713h;
        String str = "";
        int i9 = 0;
        while (i8 != -1 && i9 < this.f8707a) {
            StringBuilder r8 = g.r(e.x(str, " -> "));
            r8.append(this.f8712g[i8]);
            r8.append(" : ");
            StringBuilder r9 = g.r(r8.toString());
            r9.append(((i[]) this.f8709c.f452X)[this.e[i8]]);
            str = r9.toString();
            i8 = this.f8711f[i8];
            i9++;
        }
        return str;
    }
}
