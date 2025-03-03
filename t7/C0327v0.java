package T7;

/* 'enum' modifier removed */
/* renamed from: T7.v0  reason: case insensitive filesystem */
public final class C0327v0 extends h1 {
    public C0327v0() {
        super("BeforeAttributeValue", 36);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        C0335z0 z0Var = h1.f5180H0;
        if (e == 0) {
            q7.n(this);
            q7.f5129k.r(65533, aVar.v() - 1, aVar.v());
            q7.p(z0Var);
        } else if (e == ' ') {
        } else {
            if (e != '\"') {
                if (e != '`') {
                    C0290c0 c0Var = h1.f5193U;
                    if (e == 65535) {
                        q7.m(this);
                        q7.l();
                        q7.p(c0Var);
                        return;
                    } else if (e != 9 && e != 10 && e != 12 && e != 13) {
                        if (e == '&') {
                            aVar.y();
                            q7.p(z0Var);
                            return;
                        } else if (e != '\'') {
                            switch (e) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    q7.n(this);
                                    q7.l();
                                    q7.p(c0Var);
                                    return;
                                default:
                                    aVar.y();
                                    q7.p(z0Var);
                                    return;
                            }
                        } else {
                            q7.p(h1.f5179G0);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                q7.n(this);
                q7.f5129k.r(e, aVar.v() - 1, aVar.v());
                q7.p(z0Var);
                return;
            }
            q7.p(h1.f5178F0);
        }
    }
}
