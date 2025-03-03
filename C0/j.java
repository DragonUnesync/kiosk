package c0;

import B3.q;
import N.e;
import Q0.g;
import java.util.Arrays;

public final class j implements C0604b {

    /* renamed from: a  reason: collision with root package name */
    public int f8751a = 16;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f8752b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f8753c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f8754d = new int[16];
    public float[] e = new float[16];

    /* renamed from: f  reason: collision with root package name */
    public int[] f8755f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public int[] f8756g = new int[16];

    /* renamed from: h  reason: collision with root package name */
    public int f8757h = 0;
    public int i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final C0606d f8758j;

    /* renamed from: k  reason: collision with root package name */
    public final q f8759k;

    public j(C0606d dVar, q qVar) {
        this.f8758j = dVar;
        this.f8759k = qVar;
        clear();
    }

    public final float a(int i8) {
        int i9 = this.f8757h;
        int i10 = this.i;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8) {
                return this.e[i10];
            }
            i10 = this.f8756g[i10];
            if (i10 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public final float b(i iVar, boolean z) {
        int[] iArr;
        int i8;
        int n4 = n(iVar);
        if (n4 == -1) {
            return 0.0f;
        }
        int i9 = iVar.f8742b;
        int i10 = i9 % 16;
        int[] iArr2 = this.f8752b;
        int i11 = iArr2[i10];
        if (i11 != -1) {
            if (this.f8754d[i11] == i9) {
                int[] iArr3 = this.f8753c;
                iArr2[i10] = iArr3[i11];
                iArr3[i11] = -1;
            } else {
                while (true) {
                    iArr = this.f8753c;
                    i8 = iArr[i11];
                    if (i8 != -1 && this.f8754d[i8] != i9) {
                        i11 = i8;
                    } else if (i8 != -1 && this.f8754d[i8] == i9) {
                        iArr[i11] = iArr[i8];
                        iArr[i8] = -1;
                    }
                }
                iArr[i11] = iArr[i8];
                iArr[i8] = -1;
            }
        }
        float f8 = this.e[n4];
        if (this.i == n4) {
            this.i = this.f8756g[n4];
        }
        this.f8754d[n4] = -1;
        int[] iArr4 = this.f8755f;
        int i12 = iArr4[n4];
        if (i12 != -1) {
            int[] iArr5 = this.f8756g;
            iArr5[i12] = iArr5[n4];
        }
        int i13 = this.f8756g[n4];
        if (i13 != -1) {
            iArr4[i13] = iArr4[n4];
        }
        this.f8757h--;
        iVar.f8749k--;
        if (z) {
            iVar.b(this.f8758j);
        }
        return f8;
    }

    public final float c(C0605c cVar, boolean z) {
        float j7 = j(cVar.f8715a);
        b(cVar.f8715a, z);
        j jVar = (j) cVar.f8718d;
        int i8 = jVar.f8757h;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = jVar.f8754d[i10];
            if (i11 != -1) {
                e(((i[]) this.f8759k.f452X)[i11], jVar.e[i10] * j7, z);
                i9++;
            }
            i10++;
        }
        return j7;
    }

    public final void clear() {
        int i8 = this.f8757h;
        for (int i9 = 0; i9 < i8; i9++) {
            i g8 = g(i9);
            if (g8 != null) {
                g8.b(this.f8758j);
            }
        }
        for (int i10 = 0; i10 < this.f8751a; i10++) {
            this.f8754d[i10] = -1;
            this.f8753c[i10] = -1;
        }
        for (int i11 = 0; i11 < 16; i11++) {
            this.f8752b[i11] = -1;
        }
        this.f8757h = 0;
        this.i = -1;
    }

    public final int d() {
        return this.f8757h;
    }

    public final void e(i iVar, float f8, boolean z) {
        if (f8 <= -0.001f || f8 >= 0.001f) {
            int n4 = n(iVar);
            if (n4 == -1) {
                i(iVar, f8);
                return;
            }
            float[] fArr = this.e;
            float f9 = fArr[n4] + f8;
            fArr[n4] = f9;
            if (f9 > -0.001f && f9 < 0.001f) {
                fArr[n4] = 0.0f;
                b(iVar, z);
            }
        }
    }

    public final boolean f(i iVar) {
        if (n(iVar) != -1) {
            return true;
        }
        return false;
    }

    public final i g(int i8) {
        int i9 = this.f8757h;
        if (i9 == 0) {
            return null;
        }
        int i10 = this.i;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8 && i10 != -1) {
                return ((i[]) this.f8759k.f452X)[this.f8754d[i10]];
            }
            i10 = this.f8756g[i10];
            if (i10 == -1) {
                break;
            }
        }
        return null;
    }

    public final void h(float f8) {
        int i8 = this.f8757h;
        int i9 = this.i;
        int i10 = 0;
        while (i10 < i8) {
            float[] fArr = this.e;
            fArr[i9] = fArr[i9] / f8;
            i9 = this.f8756g[i9];
            if (i9 != -1) {
                i10++;
            } else {
                return;
            }
        }
    }

    public final void i(i iVar, float f8) {
        if (f8 <= -0.001f || f8 >= 0.001f) {
            int i8 = 0;
            if (this.f8757h == 0) {
                m(0, iVar, f8);
                l(iVar, 0);
                this.i = 0;
                return;
            }
            int n4 = n(iVar);
            if (n4 != -1) {
                this.e[n4] = f8;
                return;
            }
            int i9 = this.f8757h + 1;
            int i10 = this.f8751a;
            if (i9 >= i10) {
                int i11 = i10 * 2;
                this.f8754d = Arrays.copyOf(this.f8754d, i11);
                this.e = Arrays.copyOf(this.e, i11);
                this.f8755f = Arrays.copyOf(this.f8755f, i11);
                this.f8756g = Arrays.copyOf(this.f8756g, i11);
                this.f8753c = Arrays.copyOf(this.f8753c, i11);
                for (int i12 = this.f8751a; i12 < i11; i12++) {
                    this.f8754d[i12] = -1;
                    this.f8753c[i12] = -1;
                }
                this.f8751a = i11;
            }
            int i13 = this.f8757h;
            int i14 = this.i;
            int i15 = -1;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = this.f8754d[i14];
                int i18 = iVar.f8742b;
                if (i17 == i18) {
                    this.e[i14] = f8;
                    return;
                }
                if (i17 < i18) {
                    i15 = i14;
                }
                i14 = this.f8756g[i14];
                if (i14 == -1) {
                    break;
                }
            }
            while (true) {
                if (i8 >= this.f8751a) {
                    i8 = -1;
                    break;
                } else if (this.f8754d[i8] == -1) {
                    break;
                } else {
                    i8++;
                }
            }
            m(i8, iVar, f8);
            if (i15 != -1) {
                this.f8755f[i8] = i15;
                int[] iArr = this.f8756g;
                iArr[i8] = iArr[i15];
                iArr[i15] = i8;
            } else {
                this.f8755f[i8] = -1;
                if (this.f8757h > 0) {
                    this.f8756g[i8] = this.i;
                    this.i = i8;
                } else {
                    this.f8756g[i8] = -1;
                }
            }
            int i19 = this.f8756g[i8];
            if (i19 != -1) {
                this.f8755f[i19] = i8;
            }
            l(iVar, i8);
            return;
        }
        b(iVar, true);
    }

    public final float j(i iVar) {
        int n4 = n(iVar);
        if (n4 != -1) {
            return this.e[n4];
        }
        return 0.0f;
    }

    public final void k() {
        int i8 = this.f8757h;
        int i9 = this.i;
        int i10 = 0;
        while (i10 < i8) {
            float[] fArr = this.e;
            fArr[i9] = fArr[i9] * -1.0f;
            i9 = this.f8756g[i9];
            if (i9 != -1) {
                i10++;
            } else {
                return;
            }
        }
    }

    public final void l(i iVar, int i8) {
        int[] iArr;
        int i9 = iVar.f8742b % 16;
        int[] iArr2 = this.f8752b;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            iArr2[i9] = i8;
        } else {
            while (true) {
                iArr = this.f8753c;
                int i11 = iArr[i10];
                if (i11 == -1) {
                    break;
                }
                i10 = i11;
            }
            iArr[i10] = i8;
        }
        this.f8753c[i8] = -1;
    }

    public final void m(int i8, i iVar, float f8) {
        this.f8754d[i8] = iVar.f8742b;
        this.e[i8] = f8;
        this.f8755f[i8] = -1;
        this.f8756g[i8] = -1;
        iVar.a(this.f8758j);
        iVar.f8749k++;
        this.f8757h++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n(c0.i r4) {
        /*
            r3 = this;
            int r0 = r3.f8757h
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r4 = r4.f8742b
            int r0 = r4 % 16
            int[] r2 = r3.f8752b
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0011
            return r1
        L_0x0011:
            int[] r2 = r3.f8754d
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0018
            return r0
        L_0x0018:
            int[] r2 = r3.f8753c
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0025
            int[] r2 = r3.f8754d
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0025
            goto L_0x0018
        L_0x0025:
            if (r0 != r1) goto L_0x0028
            return r1
        L_0x0028:
            int[] r2 = r3.f8754d
            r2 = r2[r0]
            if (r2 != r4) goto L_0x002f
            return r0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.j.n(c0.i):int");
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i8 = this.f8757h;
        for (int i9 = 0; i9 < i8; i9++) {
            i g8 = g(i9);
            if (g8 != null) {
                String str4 = str3 + g8 + " = " + a(i9) + " ";
                int n4 = n(g8);
                String x8 = e.x(str4, "[p: ");
                int i10 = this.f8755f[n4];
                q qVar = this.f8759k;
                if (i10 != -1) {
                    StringBuilder r8 = g.r(x8);
                    r8.append(((i[]) qVar.f452X)[this.f8754d[this.f8755f[n4]]]);
                    str = r8.toString();
                } else {
                    str = e.x(x8, "none");
                }
                String x9 = e.x(str, ", n: ");
                if (this.f8756g[n4] != -1) {
                    StringBuilder r9 = g.r(x9);
                    r9.append(((i[]) qVar.f452X)[this.f8754d[this.f8756g[n4]]]);
                    str2 = r9.toString();
                } else {
                    str2 = e.x(x9, "none");
                }
                str3 = e.x(str2, "]");
            }
        }
        return e.x(str3, " }");
    }
}
