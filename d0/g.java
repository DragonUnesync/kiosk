package d0;

import T3.a;
import c0.C0607e;
import e0.C0818b;
import java.util.ArrayList;

public final class g extends i {

    /* renamed from: A0  reason: collision with root package name */
    public float f9664A0;

    /* renamed from: B0  reason: collision with root package name */
    public float f9665B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f9666C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f9667D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f9668E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f9669F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f9670G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f9671H0;

    /* renamed from: I0  reason: collision with root package name */
    public int f9672I0;

    /* renamed from: J0  reason: collision with root package name */
    public ArrayList f9673J0;

    /* renamed from: K0  reason: collision with root package name */
    public d[] f9674K0;

    /* renamed from: L0  reason: collision with root package name */
    public d[] f9675L0;

    /* renamed from: M0  reason: collision with root package name */
    public int[] f9676M0;

    /* renamed from: N0  reason: collision with root package name */
    public d[] f9677N0;

    /* renamed from: O0  reason: collision with root package name */
    public int f9678O0;

    /* renamed from: f0  reason: collision with root package name */
    public int f9679f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f9680g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f9681h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f9682i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f9683j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f9684k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f9685l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f9686m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f9687n0;

    /* renamed from: o0  reason: collision with root package name */
    public C0818b f9688o0;
    public a p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f9689q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f9690r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f9691s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f9692t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f9693u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f9694v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f9695w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f9696x0;

    /* renamed from: y0  reason: collision with root package name */
    public float f9697y0;

    /* renamed from: z0  reason: collision with root package name */
    public float f9698z0;

    public final void B() {
        for (int i = 0; i < this.f9705e0; i++) {
            d dVar = this.f9704d0[i];
        }
    }

    public final int C(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f9613c0;
        if (iArr[1] == 3) {
            int i8 = dVar.f9619k;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (dVar.f9626r * ((float) i));
                if (i9 != dVar.i()) {
                    E(iArr[0], dVar.l(), 1, i9, dVar);
                }
                return i9;
            } else if (i8 == 1) {
                return dVar.i();
            } else {
                if (i8 == 3) {
                    return (int) ((((float) dVar.l()) * dVar.f9593L) + 0.5f);
                }
            }
        }
        return dVar.i();
    }

    public final int D(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f9613c0;
        if (iArr[0] == 3) {
            int i8 = dVar.f9618j;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (dVar.f9623o * ((float) i));
                if (i9 != dVar.l()) {
                    E(1, i9, iArr[1], dVar.i(), dVar);
                }
                return i9;
            } else if (i8 == 1) {
                return dVar.l();
            } else {
                if (i8 == 3) {
                    return (int) ((((float) dVar.i()) * dVar.f9593L) + 0.5f);
                }
            }
        }
        return dVar.l();
    }

    public final void E(int i, int i8, int i9, int i10, d dVar) {
        a aVar;
        boolean z;
        d dVar2;
        while (true) {
            aVar = this.p0;
            if (aVar != null || (dVar2 = this.f9590I) == null) {
                C0818b bVar = this.f9688o0;
                bVar.f11129a = i;
                bVar.f11130b = i9;
                bVar.f11131c = i8;
                bVar.f11132d = i10;
                aVar.d(dVar, bVar);
                dVar.y(bVar.e);
                dVar.v(bVar.f11133f);
                dVar.f9631w = bVar.f11135h;
                int i11 = bVar.f11134g;
                dVar.f9597P = i11;
            } else {
                this.p0 = ((e) dVar2).f9637g0;
            }
        }
        C0818b bVar2 = this.f9688o0;
        bVar2.f11129a = i;
        bVar2.f11130b = i9;
        bVar2.f11131c = i8;
        bVar2.f11132d = i10;
        aVar.d(dVar, bVar2);
        dVar.y(bVar2.e);
        dVar.v(bVar2.f11133f);
        dVar.f9631w = bVar2.f11135h;
        int i112 = bVar2.f11134g;
        dVar.f9597P = i112;
        if (i112 > 0) {
            z = true;
        } else {
            z = false;
        }
        dVar.f9631w = z;
    }

    public final void a(C0607e eVar) {
        boolean z;
        boolean z6;
        d dVar;
        int i;
        super.a(eVar);
        d dVar2 = this.f9590I;
        if (dVar2 != null) {
            z = ((e) dVar2).f9638h0;
        } else {
            z = false;
        }
        int i8 = this.f9670G0;
        ArrayList arrayList = this.f9673J0;
        if (i8 != 0) {
            if (i8 == 1) {
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    f fVar = (f) arrayList.get(i9);
                    if (i9 == size - 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    fVar.b(i9, z, z6);
                }
            } else if (!(i8 != 2 || this.f9676M0 == null || this.f9675L0 == null || this.f9674K0 == null)) {
                for (int i10 = 0; i10 < this.f9678O0; i10++) {
                    this.f9677N0[i10].t();
                }
                int[] iArr = this.f9676M0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                d dVar3 = null;
                for (int i13 = 0; i13 < i11; i13++) {
                    if (z) {
                        i = (i11 - i13) - 1;
                    } else {
                        i = i13;
                    }
                    d dVar4 = this.f9675L0[i];
                    if (!(dVar4 == null || dVar4.f9603V == 8)) {
                        C0629c cVar = dVar4.f9632x;
                        if (i13 == 0) {
                            dVar4.e(cVar, this.f9632x, this.f9683j0);
                            dVar4.f9605X = this.f9689q0;
                            dVar4.f9600S = this.f9695w0;
                        }
                        if (i13 == i11 - 1) {
                            dVar4.e(dVar4.z, this.z, this.f9684k0);
                        }
                        if (i13 > 0) {
                            dVar4.e(cVar, dVar3.z, this.f9666C0);
                            dVar3.e(dVar3.z, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    d dVar5 = this.f9674K0[i14];
                    if (!(dVar5 == null || dVar5.f9603V == 8)) {
                        C0629c cVar2 = dVar5.f9633y;
                        if (i14 == 0) {
                            dVar5.e(cVar2, this.f9633y, this.f9679f0);
                            dVar5.f9606Y = this.f9690r0;
                            dVar5.f9601T = this.f9696x0;
                        }
                        if (i14 == i12 - 1) {
                            dVar5.e(dVar5.f9582A, this.f9582A, this.f9680g0);
                        }
                        if (i14 > 0) {
                            dVar5.e(cVar2, dVar3.f9582A, this.f9667D0);
                            dVar3.e(dVar3.f9582A, cVar2, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i15 = 0; i15 < i11; i15++) {
                    for (int i16 = 0; i16 < i12; i16++) {
                        int i17 = (i16 * i11) + i15;
                        if (this.f9672I0 == 1) {
                            i17 = (i15 * i12) + i16;
                        }
                        d[] dVarArr = this.f9677N0;
                        if (!(i17 >= dVarArr.length || (dVar = dVarArr[i17]) == null || dVar.f9603V == 8)) {
                            d dVar6 = this.f9675L0[i15];
                            d dVar7 = this.f9674K0[i16];
                            if (dVar != dVar6) {
                                dVar.e(dVar.f9632x, dVar6.f9632x, 0);
                                dVar.e(dVar.z, dVar6.z, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.e(dVar.f9633y, dVar7.f9633y, 0);
                                dVar.e(dVar.f9582A, dVar7.f9582A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z, true);
        }
        this.f9685l0 = false;
    }
}
