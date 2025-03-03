package h1;

import M0.W;
import M0.X;
import P0.l;
import java.util.ArrayList;
import l1.e;

/* renamed from: h1.g  reason: case insensitive filesystem */
public final class C1041g extends h0 {

    /* renamed from: l  reason: collision with root package name */
    public final long f12472l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f12473m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f12474n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public final W f12475o = new W();

    /* renamed from: p  reason: collision with root package name */
    public C1039e f12476p;

    /* renamed from: q  reason: collision with root package name */
    public C1040f f12477q;

    /* renamed from: r  reason: collision with root package name */
    public long f12478r;

    /* renamed from: s  reason: collision with root package name */
    public long f12479s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1041g(C1035a aVar, long j7, boolean z) {
        super(aVar);
        aVar.getClass();
        this.f12472l = j7;
        this.f12473m = z;
    }

    public final void C(X x8) {
        long j7;
        W w2 = this.f12475o;
        x8.n(0, w2);
        long j8 = w2.f2883p;
        C1039e eVar = this.f12476p;
        ArrayList arrayList = this.f12474n;
        long j9 = this.f12472l;
        long j10 = Long.MIN_VALUE;
        if (eVar == null || arrayList.isEmpty()) {
            this.f12478r = j8;
            if (j9 != Long.MIN_VALUE) {
                j10 = j8 + j9;
            }
            this.f12479s = j10;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1038d dVar = (C1038d) arrayList.get(i);
                long j11 = this.f12478r;
                long j12 = this.f12479s;
                dVar.f12457Y = j11;
                dVar.f12458Z = j12;
            }
            j7 = 0;
        } else {
            long j13 = this.f12478r - j8;
            if (j9 != Long.MIN_VALUE) {
                j10 = this.f12479s - j8;
            }
            j9 = j10;
            j7 = j13;
        }
        try {
            C1039e eVar2 = new C1039e(x8, j7, j9);
            this.f12476p = eVar2;
            m(eVar2);
        } catch (C1040f e) {
            this.f12477q = e;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C1038d) arrayList.get(i8)).f12459a0 = this.f12477q;
            }
        }
    }

    public final C1059z b(C1031B b8, e eVar, long j7) {
        C1038d dVar = new C1038d(this.f12482k.b(b8, eVar, j7), this.f12473m, this.f12478r, this.f12479s);
        this.f12474n.add(dVar);
        return dVar;
    }

    public final void j() {
        C1040f fVar = this.f12477q;
        if (fVar == null) {
            super.j();
            return;
        }
        throw fVar;
    }

    public final void n(C1059z zVar) {
        ArrayList arrayList = this.f12474n;
        l.j(arrayList.remove(zVar));
        this.f12482k.n(((C1038d) zVar).f12453U);
        if (arrayList.isEmpty()) {
            C1039e eVar = this.f12476p;
            eVar.getClass();
            C(eVar.f12507b);
        }
    }

    public final void p() {
        super.p();
        this.f12477q = null;
        this.f12476p = null;
    }

    public final void z(X x8) {
        if (this.f12477q == null) {
            C(x8);
        }
    }
}
