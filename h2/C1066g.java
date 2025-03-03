package h2;

import B.C0003d;
import android.animation.TypeEvaluator;
import m0.C1199e;

/* renamed from: h2.g  reason: case insensitive filesystem */
public final class C1066g implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public C1199e[] f12555a;

    public final Object evaluate(float f8, Object obj, Object obj2) {
        C1199e[] eVarArr = (C1199e[]) obj;
        C1199e[] eVarArr2 = (C1199e[]) obj2;
        if (C0003d.e(eVarArr, eVarArr2)) {
            if (!C0003d.e(this.f12555a, eVarArr)) {
                this.f12555a = C0003d.n(eVarArr);
            }
            for (int i = 0; i < eVarArr.length; i++) {
                C1199e eVar = this.f12555a[i];
                C1199e eVar2 = eVarArr[i];
                C1199e eVar3 = eVarArr2[i];
                eVar.getClass();
                eVar.f13321a = eVar2.f13321a;
                int i8 = 0;
                while (true) {
                    float[] fArr = eVar2.f13322b;
                    if (i8 >= fArr.length) {
                        break;
                    }
                    eVar.f13322b[i8] = (eVar3.f13322b[i8] * f8) + ((1.0f - f8) * fArr[i8]);
                    i8++;
                }
            }
            return this.f12555a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
