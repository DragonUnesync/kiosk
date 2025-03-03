package m;

import o.o1;
import v0.C1516N;

/* renamed from: m.i  reason: case insensitive filesystem */
public final class C1190i extends C1516N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13306a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13307b;

    /* renamed from: c  reason: collision with root package name */
    public int f13308c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13309d;

    public C1190i(C1191j jVar) {
        this.f13309d = jVar;
        this.f13307b = false;
        this.f13308c = 0;
    }

    public final void a() {
        switch (this.f13306a) {
            case 0:
                int i = this.f13308c + 1;
                this.f13308c = i;
                C1191j jVar = (C1191j) this.f13309d;
                if (i == jVar.f13310a.size()) {
                    C1516N n4 = jVar.f13313d;
                    if (n4 != null) {
                        n4.a();
                    }
                    this.f13308c = 0;
                    this.f13307b = false;
                    jVar.e = false;
                    return;
                }
                return;
            default:
                if (!this.f13307b) {
                    ((o1) this.f13309d).f14023a.setVisibility(this.f13308c);
                    return;
                }
                return;
        }
    }

    public void b() {
        switch (this.f13306a) {
            case 1:
                this.f13307b = true;
                return;
            default:
                return;
        }
    }

    public final void c() {
        switch (this.f13306a) {
            case 0:
                if (!this.f13307b) {
                    this.f13307b = true;
                    C1516N n4 = ((C1191j) this.f13309d).f13313d;
                    if (n4 != null) {
                        n4.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((o1) this.f13309d).f14023a.setVisibility(0);
                return;
        }
    }

    public C1190i(o1 o1Var, int i) {
        this.f13309d = o1Var;
        this.f13308c = i;
        this.f13307b = false;
    }
}
