package c0;

import C7.e;
import java.util.Arrays;

public final class h extends C0605c {

    /* renamed from: f  reason: collision with root package name */
    public i[] f8738f;

    /* renamed from: g  reason: collision with root package name */
    public i[] f8739g;

    /* renamed from: h  reason: collision with root package name */
    public int f8740h;
    public g i;

    public final i d(boolean[] zArr) {
        int i8 = -1;
        for (int i9 = 0; i9 < this.f8740h; i9++) {
            i[] iVarArr = this.f8738f;
            i iVar = iVarArr[i9];
            if (!zArr[iVar.f8742b]) {
                g gVar = this.i;
                gVar.f8736U = iVar;
                int i10 = 8;
                if (i8 != -1) {
                    i iVar2 = iVarArr[i8];
                    while (true) {
                        if (i10 < 0) {
                            break;
                        }
                        float f8 = iVar2.f8747h[i10];
                        float f9 = gVar.f8736U.f8747h[i10];
                        if (f9 == f8) {
                            i10--;
                        } else if (f9 >= f8) {
                        }
                    }
                } else {
                    while (true) {
                        if (i10 < 0) {
                            break;
                        }
                        float f10 = gVar.f8736U.f8747h[i10];
                        if (f10 > 0.0f) {
                            break;
                        } else if (f10 < 0.0f) {
                            break;
                        } else {
                            i10--;
                        }
                    }
                }
                i8 = i9;
            }
        }
        if (i8 == -1) {
            return null;
        }
        return this.f8738f[i8];
    }

    public final void h(C0605c cVar, boolean z) {
        C0605c cVar2 = cVar;
        i iVar = cVar2.f8715a;
        if (iVar != null) {
            C0604b bVar = cVar2.f8718d;
            int d8 = bVar.d();
            for (int i8 = 0; i8 < d8; i8++) {
                i g8 = bVar.g(i8);
                float a8 = bVar.a(i8);
                g gVar = this.i;
                gVar.f8736U = g8;
                boolean z6 = g8.f8741a;
                float[] fArr = iVar.f8747h;
                if (z6) {
                    boolean z8 = true;
                    for (int i9 = 0; i9 < 9; i9++) {
                        float[] fArr2 = gVar.f8736U.f8747h;
                        float f8 = (fArr[i9] * a8) + fArr2[i9];
                        fArr2[i9] = f8;
                        if (Math.abs(f8) < 1.0E-4f) {
                            gVar.f8736U.f8747h[i9] = 0.0f;
                        } else {
                            z8 = false;
                        }
                    }
                    if (z8) {
                        gVar.f8737V.j(gVar.f8736U);
                    }
                } else {
                    for (int i10 = 0; i10 < 9; i10++) {
                        float f9 = fArr[i10];
                        if (f9 != 0.0f) {
                            float f10 = f9 * a8;
                            if (Math.abs(f10) < 1.0E-4f) {
                                f10 = 0.0f;
                            }
                            gVar.f8736U.f8747h[i10] = f10;
                        } else {
                            gVar.f8736U.f8747h[i10] = 0.0f;
                        }
                    }
                    i(g8);
                }
                this.f8716b = (cVar2.f8716b * a8) + this.f8716b;
            }
            j(iVar);
        }
    }

    public final void i(i iVar) {
        int i8;
        int i9 = this.f8740h + 1;
        i[] iVarArr = this.f8738f;
        if (i9 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f8738f = iVarArr2;
            this.f8739g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f8738f;
        int i10 = this.f8740h;
        iVarArr3[i10] = iVar;
        int i11 = i10 + 1;
        this.f8740h = i11;
        if (i11 > 1 && iVarArr3[i10].f8742b > iVar.f8742b) {
            int i12 = 0;
            while (true) {
                i8 = this.f8740h;
                if (i12 >= i8) {
                    break;
                }
                this.f8739g[i12] = this.f8738f[i12];
                i12++;
            }
            Arrays.sort(this.f8739g, 0, i8, new e(2));
            for (int i13 = 0; i13 < this.f8740h; i13++) {
                this.f8738f[i13] = this.f8739g[i13];
            }
        }
        iVar.f8741a = true;
        iVar.a(this);
    }

    public final void j(i iVar) {
        int i8 = 0;
        while (i8 < this.f8740h) {
            if (this.f8738f[i8] == iVar) {
                while (true) {
                    int i9 = this.f8740h;
                    if (i8 < i9 - 1) {
                        i[] iVarArr = this.f8738f;
                        int i10 = i8 + 1;
                        iVarArr[i8] = iVarArr[i10];
                        i8 = i10;
                    } else {
                        this.f8740h = i9 - 1;
                        iVar.f8741a = false;
                        return;
                    }
                }
            } else {
                i8++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.f8716b + ") : ";
        for (int i8 = 0; i8 < this.f8740h; i8++) {
            i iVar = this.f8738f[i8];
            g gVar = this.i;
            gVar.f8736U = iVar;
            str = str + gVar + " ";
        }
        return str;
    }
}
