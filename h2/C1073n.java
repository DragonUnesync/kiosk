package h2;

import B.C0003d;
import m0.C1199e;

/* renamed from: h2.n  reason: case insensitive filesystem */
public abstract class C1073n extends C1072m {

    /* renamed from: a  reason: collision with root package name */
    public C1199e[] f12576a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f12577b;

    /* renamed from: c  reason: collision with root package name */
    public int f12578c = 0;

    public C1073n() {
    }

    public C1199e[] getPathData() {
        return this.f12576a;
    }

    public String getPathName() {
        return this.f12577b;
    }

    public void setPathData(C1199e[] eVarArr) {
        if (!C0003d.e(this.f12576a, eVarArr)) {
            this.f12576a = C0003d.n(eVarArr);
            return;
        }
        C1199e[] eVarArr2 = this.f12576a;
        for (int i = 0; i < eVarArr.length; i++) {
            eVarArr2[i].f13321a = eVarArr[i].f13321a;
            int i8 = 0;
            while (true) {
                float[] fArr = eVarArr[i].f13322b;
                if (i8 >= fArr.length) {
                    break;
                }
                eVarArr2[i].f13322b[i8] = fArr[i8];
                i8++;
            }
        }
    }

    public C1073n(C1073n nVar) {
        this.f12577b = nVar.f12577b;
        this.f12576a = C0003d.n(nVar.f12576a);
    }
}
