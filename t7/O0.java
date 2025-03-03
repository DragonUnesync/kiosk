package T7;

/* 'enum' modifier removed */
public final class O0 extends h1 {
    public O0() {
        super("AfterDoctypeName", 53);
    }

    public final void d(Q q7, C0285a aVar) {
        boolean m8 = aVar.m();
        C0290c0 c0Var = h1.f5193U;
        if (m8) {
            q7.m(this);
            q7.f5131m.f5103a0 = true;
            q7.k();
            q7.p(c0Var);
        } else if (aVar.r(9, 10, 13, 12, ' ')) {
            aVar.a();
        } else if (aVar.q('>')) {
            q7.k();
            q7.a(c0Var);
        } else if (aVar.p("PUBLIC")) {
            q7.f5131m.f5100X = "PUBLIC";
            q7.p(h1.f5198W0);
        } else if (aVar.p("SYSTEM")) {
            q7.f5131m.f5100X = "SYSTEM";
            q7.p(h1.f5210c1);
        } else {
            q7.n(this);
            q7.f5131m.f5103a0 = true;
            q7.a(h1.f5220h1);
        }
    }
}
