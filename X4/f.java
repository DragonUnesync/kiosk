package x4;

import C4.e;
import D4.a;
import D4.d;
import D4.g;
import F4.c;
import de.ozerov.fully.K2;
import f6.Z;
import i5.C1103c;
import l5.b;
import m4.C1214b;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f16293a;

    /* renamed from: b  reason: collision with root package name */
    public final e f16294b;

    /* renamed from: c  reason: collision with root package name */
    public final D4.c f16295c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16296d;
    public Z e;

    public f(c cVar, e eVar, D4.c cVar2) {
        this.f16293a = cVar;
        this.f16294b = eVar;
        this.f16295c = cVar2;
    }

    public final void a(b bVar) {
        int i;
        if (this.f16296d) {
            int i8 = 0;
            this.f16296d = false;
            D4.c cVar = this.f16295c;
            cVar.f16297V = false;
            cVar.f1216c0.b();
            cVar.f1217d0 = null;
            cVar.f1210W.getClass();
            K2 k22 = cVar.f1214a0;
            Object obj = k22.f10050V;
            while (true) {
                d dVar = (d) ((I2.b) obj);
                if (dVar == null) {
                    break;
                }
                cVar.f1215b0.x(dVar.f1224X);
                if (dVar instanceof g) {
                    dVar.f1223W.b(new V4.e(((g) dVar).f1230Y, bVar));
                } else {
                    D4.e eVar = (D4.e) dVar;
                    if (eVar.getAsBoolean()) {
                        a aVar = eVar.f1223W;
                        V4.e eVar2 = aVar.f1205Z;
                        aVar.f1205Z = null;
                        aVar.a(eVar2);
                    }
                }
                obj = dVar.f2258V;
            }
            k22.f10050V = null;
            k22.f10051W = null;
            cVar.d(bVar);
            e eVar3 = this.f16294b;
            eVar3.f16297V = false;
            eVar3.f701Y.b();
            c cVar2 = this.f16293a;
            cVar2.f16297V = false;
            cVar2.f1543a0.b();
            cVar2.f1544b0 = null;
            K2 k23 = cVar2.f1541Y;
            Object obj2 = k23.f10050V;
            while (true) {
                F4.a aVar2 = (F4.a) ((I2.b) obj2);
                if (aVar2 == null || (i = aVar2.f1532W) == 0) {
                    C1214b bVar2 = cVar2.f1539W;
                } else {
                    cVar2.f1542Z.x(i);
                    aVar2.f1532W = 0;
                    obj2 = aVar2.f2258V;
                }
            }
            C1214b bVar22 = cVar2.f1539W;
            if (!bVar22.f13367n || bVar22.b() == j5.b.f12890U) {
                C4.a aVar3 = cVar2.f1540X;
                z3.e eVar4 = aVar3.f687a;
                while (true) {
                    C4.f[] fVarArr = aVar3.f688b;
                    if (i8 < fVarArr.length) {
                        C4.f fVar = fVarArr[i8];
                        if (fVar == null || ((C1103c) ((I2.b) fVar.f10050V)) == null) {
                            fVarArr[i8] = null;
                            i8++;
                        } else {
                            throw null;
                        }
                    } else {
                        Object obj3 = k23.f10050V;
                        while (true) {
                            F4.a aVar4 = (F4.a) ((I2.b) obj3);
                            if (aVar4 != null) {
                                obj3 = aVar4.f2258V;
                            } else {
                                k23.f10050V = null;
                                k23.f10051W = null;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
