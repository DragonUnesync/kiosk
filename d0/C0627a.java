package d0;

import N.e;
import Q0.g;
import c0.C0605c;
import c0.C0607e;
import c0.i;

/* renamed from: d0.a  reason: case insensitive filesystem */
public final class C0627a extends i {

    /* renamed from: f0  reason: collision with root package name */
    public int f9558f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f9559g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f9560h0;

    public final void a(C0607e eVar) {
        boolean z;
        boolean z6;
        boolean z8;
        int i;
        int i8;
        int i9;
        int i10;
        C0607e eVar2 = eVar;
        C0629c[] cVarArr = this.f9587F;
        C0629c cVar = this.f9632x;
        cVarArr[0] = cVar;
        C0629c cVar2 = this.f9633y;
        int i11 = 2;
        cVarArr[2] = cVar2;
        C0629c cVar3 = this.z;
        cVarArr[1] = cVar3;
        C0629c cVar4 = this.f9582A;
        cVarArr[3] = cVar4;
        for (C0629c cVar5 : cVarArr) {
            cVar5.f9581g = eVar2.j(cVar5);
        }
        int i12 = this.f9558f0;
        if (i12 >= 0 && i12 < 4) {
            C0629c cVar6 = cVarArr[i12];
            int i13 = 0;
            while (true) {
                if (i13 >= this.f9705e0) {
                    z = false;
                    break;
                }
                d dVar = this.f9704d0[i13];
                if ((this.f9559g0 || dVar.b()) && ((((i10 = this.f9558f0) == 0 || i10 == 1) && dVar.f9613c0[0] == 3 && dVar.f9632x.f9579d != null && dVar.z.f9579d != null) || ((i10 == 2 || i10 == 3) && dVar.f9613c0[1] == 3 && dVar.f9633y.f9579d != null && dVar.f9582A.f9579d != null))) {
                    z = true;
                } else {
                    i13++;
                }
            }
            if (cVar.e() || cVar3.e()) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (cVar2.e() || cVar4.e()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z || (((i9 = this.f9558f0) != 0 || !z6) && ((i9 != 2 || !z8) && ((i9 != 1 || !z6) && (i9 != 3 || !z8))))) {
                i = 4;
            } else {
                i = 5;
            }
            int i14 = 0;
            while (i14 < this.f9705e0) {
                d dVar2 = this.f9704d0[i14];
                if (this.f9559g0 || dVar2.b()) {
                    i j7 = eVar2.j(dVar2.f9587F[this.f9558f0]);
                    int i15 = this.f9558f0;
                    C0629c cVar7 = dVar2.f9587F[i15];
                    cVar7.f9581g = j7;
                    C0629c cVar8 = cVar7.f9579d;
                    if (cVar8 == null || cVar8.f9577b != this) {
                        i8 = 0;
                    } else {
                        i8 = cVar7.e;
                    }
                    if (i15 == 0 || i15 == i11) {
                        C0605c k8 = eVar.k();
                        i l8 = eVar.l();
                        l8.f8744d = 0;
                        k8.c(cVar6.f9581g, j7, l8, this.f9560h0 - i8);
                        eVar2.c(k8);
                    } else {
                        C0605c k9 = eVar.k();
                        i l9 = eVar.l();
                        l9.f8744d = 0;
                        k9.b(cVar6.f9581g, j7, l9, this.f9560h0 + i8);
                        eVar2.c(k9);
                    }
                    eVar2.e(cVar6.f9581g, j7, this.f9560h0 + i8, i);
                }
                i14++;
                i11 = 2;
            }
            int i16 = this.f9558f0;
            if (i16 == 0) {
                eVar2.e(cVar3.f9581g, cVar.f9581g, 0, 8);
                eVar2.e(cVar.f9581g, this.f9590I.z.f9581g, 0, 4);
                eVar2.e(cVar.f9581g, this.f9590I.f9632x.f9581g, 0, 0);
            } else if (i16 == 1) {
                eVar2.e(cVar.f9581g, cVar3.f9581g, 0, 8);
                eVar2.e(cVar.f9581g, this.f9590I.f9632x.f9581g, 0, 4);
                eVar2.e(cVar.f9581g, this.f9590I.z.f9581g, 0, 0);
            } else if (i16 == 2) {
                eVar2.e(cVar4.f9581g, cVar2.f9581g, 0, 8);
                eVar2.e(cVar2.f9581g, this.f9590I.f9582A.f9581g, 0, 4);
                eVar2.e(cVar2.f9581g, this.f9590I.f9633y.f9581g, 0, 0);
            } else if (i16 == 3) {
                eVar2.e(cVar2.f9581g, cVar4.f9581g, 0, 8);
                eVar2.e(cVar2.f9581g, this.f9590I.f9633y.f9581g, 0, 4);
                eVar2.e(cVar2.f9581g, this.f9590I.f9582A.f9581g, 0, 0);
            }
        }
    }

    public final boolean b() {
        return true;
    }

    public final String toString() {
        String A8 = e.A(new StringBuilder("[Barrier] "), this.f9604W, " {");
        for (int i = 0; i < this.f9705e0; i++) {
            d dVar = this.f9704d0[i];
            if (i > 0) {
                A8 = e.x(A8, ", ");
            }
            StringBuilder r8 = g.r(A8);
            r8.append(dVar.f9604W);
            A8 = r8.toString();
        }
        return e.x(A8, "}");
    }
}
