package T7;

/* 'enum' modifier removed */
public final class P0 extends h1 {
    public P0() {
        super("AfterDoctypePublicKeyword", 54);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        if (e == 9 || e == 10 || e == 12 || e == 13 || e == ' ') {
            q7.p(h1.f5200X0);
        } else if (e == '\"') {
            q7.n(this);
            q7.p(h1.f5202Y0);
        } else if (e != '\'') {
            C0290c0 c0Var = h1.f5193U;
            if (e == '>') {
                q7.n(this);
                q7.f5131m.f5103a0 = true;
                q7.k();
                q7.p(c0Var);
            } else if (e != 65535) {
                q7.n(this);
                q7.f5131m.f5103a0 = true;
                q7.p(h1.f5220h1);
            } else {
                q7.m(this);
                q7.f5131m.f5103a0 = true;
                q7.k();
                q7.p(c0Var);
            }
        } else {
            q7.n(this);
            q7.p(h1.f5204Z0);
        }
    }
}
