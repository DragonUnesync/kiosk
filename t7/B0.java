package T7;

/* 'enum' modifier removed */
public final class B0 extends h1 {
    public B0() {
        super("SelfClosingStartTag", 41);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        C0290c0 c0Var = h1.f5193U;
        if (e == '>') {
            q7.f5129k.f5106Y = true;
            q7.l();
            q7.p(c0Var);
        } else if (e != 65535) {
            aVar.y();
            q7.n(this);
            q7.p(h1.f5174B0);
        } else {
            q7.m(this);
            q7.p(c0Var);
        }
    }
}
