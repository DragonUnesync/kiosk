package g2;

public final class u extends q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11997a;

    /* renamed from: b  reason: collision with root package name */
    public p f11998b;

    public /* synthetic */ u() {
        this.f11997a = 1;
    }

    public void a(p pVar) {
        switch (this.f11997a) {
            case 1:
                C0948a aVar = (C0948a) this.f11998b;
                if (!aVar.f11929z0) {
                    aVar.J();
                    aVar.f11929z0 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void b(p pVar) {
        switch (this.f11997a) {
            case 1:
                C0948a aVar = (C0948a) this.f11998b;
                int i = aVar.f11928y0 - 1;
                aVar.f11928y0 = i;
                if (i == 0) {
                    aVar.f11929z0 = false;
                    aVar.m();
                }
                pVar.z(this);
                return;
            case 2:
                this.f11998b.B();
                pVar.z(this);
                return;
            default:
                return;
        }
    }

    public void e(p pVar) {
        switch (this.f11997a) {
            case 0:
                C0948a aVar = (C0948a) this.f11998b;
                aVar.f11926w0.remove(pVar);
                if (!aVar.s()) {
                    aVar.w(aVar, o.f11960N, false);
                    aVar.f11984l0 = true;
                    aVar.w(aVar, o.f11959M, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ u(p pVar, int i) {
        this.f11997a = i;
        this.f11998b = pVar;
    }
}
