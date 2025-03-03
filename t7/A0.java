package T7;

/* 'enum' modifier removed */
public final class A0 extends h1 {
    public A0() {
        super("AfterAttributeValue_quoted", 40);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        C0321s0 s0Var = h1.f5174B0;
        if (e == 9 || e == 10 || e == 12 || e == 13 || e == ' ') {
            q7.p(s0Var);
        } else if (e != '/') {
            C0290c0 c0Var = h1.f5193U;
            if (e == '>') {
                q7.l();
                q7.p(c0Var);
            } else if (e != 65535) {
                aVar.y();
                q7.n(this);
                q7.p(s0Var);
            } else {
                q7.m(this);
                q7.p(c0Var);
            }
        } else {
            q7.p(h1.f5182J0);
        }
    }
}
