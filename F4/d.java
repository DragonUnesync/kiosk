package f4;

import M0.C0120h;
import de.ozerov.fully.K2;

public final class d extends K2 {

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f11683Z;

    public d(C0901b bVar, boolean z) {
        super(bVar);
        this.f11683Z = z;
    }

    public final C0120h Z() {
        C0900a aVar = new C0900a();
        C0900a aVar2 = new C0900a();
        C0900a aVar3 = new C0900a();
        C0900a aVar4 = new C0900a();
        C0120h[] hVarArr = (C0120h[]) this.f10051W;
        for (C0120h hVar : hVarArr) {
            if (hVar != null) {
                hVar.j();
                int i = hVar.e % 30;
                int i8 = hVar.f2951f;
                if (!this.f11683Z) {
                    i8 += 2;
                }
                int i9 = i8 % 3;
                if (i9 == 0) {
                    aVar2.b((i * 3) + 1);
                } else if (i9 == 1) {
                    aVar4.b(i / 3);
                    aVar3.b(i % 3);
                } else if (i9 == 2) {
                    aVar.b(i + 1);
                }
            }
        }
        if (aVar.a().length == 0 || aVar2.a().length == 0 || aVar3.a().length == 0 || aVar4.a().length == 0 || aVar.a()[0] <= 0 || aVar2.a()[0] + aVar3.a()[0] < 3 || aVar2.a()[0] + aVar3.a()[0] > 90) {
            return null;
        }
        C0120h hVar2 = new C0120h(aVar.a()[0], aVar2.a()[0], aVar3.a()[0], aVar4.a()[0], 3, (byte) 0);
        a0(hVarArr, hVar2);
        return hVar2;
    }

    public final void a0(C0120h[] hVarArr, C0120h hVar) {
        for (int i = 0; i < hVarArr.length; i++) {
            C0120h hVar2 = hVarArr[i];
            if (hVar2 != null) {
                int i8 = hVar2.e % 30;
                int i9 = hVar2.f2951f;
                if (i9 > hVar.f2951f) {
                    hVarArr[i] = null;
                } else {
                    if (!this.f11683Z) {
                        i9 += 2;
                    }
                    int i10 = i9 % 3;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2 && i8 + 1 != hVar.f2948b) {
                                hVarArr[i] = null;
                            }
                        } else if (i8 / 3 != hVar.f2949c || i8 % 3 != hVar.e) {
                            hVarArr[i] = null;
                        }
                    } else if ((i8 * 3) + 1 != hVar.f2950d) {
                        hVarArr[i] = null;
                    }
                }
            }
        }
    }

    public final String toString() {
        return "IsLeft: " + this.f11683Z + 10 + super.toString();
    }
}
