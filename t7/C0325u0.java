package T7;

/* 'enum' modifier removed */
/* renamed from: T7.u0  reason: case insensitive filesystem */
public final class C0325u0 extends h1 {
    public C0325u0() {
        super("AfterAttributeName", 35);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        C0323t0 t0Var = h1.f5175C0;
        if (e == 0) {
            q7.n(this);
            O o2 = q7.f5129k;
            o2.w(aVar.v() - 1, aVar.v());
            o2.f5109b0.append(65533);
            q7.p(t0Var);
        } else if (e != ' ') {
            if (!(e == '\"' || e == '\'')) {
                if (e != '/') {
                    C0290c0 c0Var = h1.f5193U;
                    if (e == 65535) {
                        q7.m(this);
                        q7.p(c0Var);
                        return;
                    } else if (e != 9 && e != 10 && e != 12 && e != 13) {
                        switch (e) {
                            case '<':
                                break;
                            case '=':
                                q7.p(h1.f5177E0);
                                return;
                            case '>':
                                q7.l();
                                q7.p(c0Var);
                                return;
                            default:
                                q7.f5129k.z();
                                aVar.y();
                                q7.p(t0Var);
                                return;
                        }
                    } else {
                        return;
                    }
                } else {
                    q7.p(h1.f5182J0);
                    return;
                }
            }
            q7.n(this);
            q7.f5129k.z();
            O o8 = q7.f5129k;
            o8.w(aVar.v() - 1, aVar.v());
            o8.f5109b0.append(e);
            q7.p(t0Var);
        }
    }
}
