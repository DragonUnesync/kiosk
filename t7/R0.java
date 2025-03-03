package T7;

/* 'enum' modifier removed */
public final class R0 extends h1 {
    public R0() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        if (e == 0) {
            q7.n(this);
            q7.f5131m.f5101Y.append(65533);
        } else if (e != '\"') {
            C0290c0 c0Var = h1.f5193U;
            if (e == '>') {
                q7.n(this);
                q7.f5131m.f5103a0 = true;
                q7.k();
                q7.p(c0Var);
            } else if (e != 65535) {
                q7.f5131m.f5101Y.append(e);
            } else {
                q7.m(this);
                q7.f5131m.f5103a0 = true;
                q7.k();
                q7.p(c0Var);
            }
        } else {
            q7.p(h1.f5206a1);
        }
    }
}
