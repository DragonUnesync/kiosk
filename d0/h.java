package d0;

import Q0.g;
import c0.C0605c;
import c0.C0607e;
import c0.i;
import java.util.ArrayList;
import u.C1477r;

public final class h extends d {

    /* renamed from: d0  reason: collision with root package name */
    public float f9699d0 = -1.0f;

    /* renamed from: e0  reason: collision with root package name */
    public int f9700e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public int f9701f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public C0629c f9702g0 = this.f9633y;

    /* renamed from: h0  reason: collision with root package name */
    public int f9703h0;

    public h() {
        this.f9703h0 = 0;
        this.f9588G.clear();
        this.f9588G.add(this.f9702g0);
        int length = this.f9587F.length;
        for (int i = 0; i < length; i++) {
            this.f9587F[i] = this.f9702g0;
        }
    }

    public final void A(C0607e eVar) {
        if (this.f9590I != null) {
            C0629c cVar = this.f9702g0;
            eVar.getClass();
            int m8 = C0607e.m(cVar);
            if (this.f9703h0 == 1) {
                this.f9595N = m8;
                this.f9596O = 0;
                v(this.f9590I.i());
                y(0);
                return;
            }
            this.f9595N = 0;
            this.f9596O = m8;
            y(this.f9590I.l());
            v(0);
        }
    }

    public final void B(int i) {
        if (this.f9703h0 != i) {
            this.f9703h0 = i;
            ArrayList arrayList = this.f9588G;
            arrayList.clear();
            if (this.f9703h0 == 1) {
                this.f9702g0 = this.f9632x;
            } else {
                this.f9702g0 = this.f9633y;
            }
            arrayList.add(this.f9702g0);
            C0629c[] cVarArr = this.f9587F;
            int length = cVarArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                cVarArr[i8] = this.f9702g0;
            }
        }
    }

    public final void a(C0607e eVar) {
        boolean z;
        e eVar2 = (e) this.f9590I;
        if (eVar2 != null) {
            C0629c g8 = eVar2.g(2);
            C0629c g9 = eVar2.g(4);
            d dVar = this.f9590I;
            boolean z6 = true;
            if (dVar == null || dVar.f9613c0[0] != 2) {
                z = false;
            } else {
                z = true;
            }
            if (this.f9703h0 == 0) {
                g8 = eVar2.g(3);
                g9 = eVar2.g(5);
                d dVar2 = this.f9590I;
                if (dVar2 == null || dVar2.f9613c0[1] != 2) {
                    z6 = false;
                }
                z = z6;
            }
            if (this.f9700e0 != -1) {
                i j7 = eVar.j(this.f9702g0);
                eVar.e(j7, eVar.j(g8), this.f9700e0, 8);
                if (z) {
                    eVar.f(eVar.j(g9), j7, 0, 5);
                }
            } else if (this.f9701f0 != -1) {
                i j8 = eVar.j(this.f9702g0);
                i j9 = eVar.j(g9);
                eVar.e(j8, j9, -this.f9701f0, 8);
                if (z) {
                    eVar.f(j8, eVar.j(g8), 0, 5);
                    eVar.f(j9, j8, 0, 5);
                }
            } else if (this.f9699d0 != -1.0f) {
                i j10 = eVar.j(this.f9702g0);
                i j11 = eVar.j(g9);
                float f8 = this.f9699d0;
                C0605c k8 = eVar.k();
                k8.f8718d.i(j10, -1.0f);
                k8.f8718d.i(j11, f8);
                eVar.c(k8);
            }
        }
    }

    public final boolean b() {
        return true;
    }

    public final C0629c g(int i) {
        switch (C1477r.h(i)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f9703h0 == 1) {
                    return this.f9702g0;
                }
                break;
            case 2:
            case 4:
                if (this.f9703h0 == 0) {
                    return this.f9702g0;
                }
                break;
        }
        throw new AssertionError(g.A(i));
    }
}
