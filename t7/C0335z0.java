package T7;

/* 'enum' modifier removed */
/* renamed from: T7.z0  reason: case insensitive filesystem */
public final class C0335z0 extends h1 {
    public C0335z0() {
        super("AttributeValue_unquoted", 39);
    }

    public final void d(Q q7, C0285a aVar) {
        int v4 = aVar.v();
        String k8 = aVar.k(h1.f5226k1);
        if (k8.length() > 0) {
            q7.f5129k.t(v4, aVar.v(), k8);
        }
        int v8 = aVar.v();
        char e = aVar.e();
        if (e != 0) {
            if (e != ' ') {
                if (!(e == '\"' || e == '`')) {
                    C0290c0 c0Var = h1.f5193U;
                    if (e == 65535) {
                        q7.m(this);
                        q7.p(c0Var);
                        return;
                    } else if (!(e == 9 || e == 10 || e == 12 || e == 13)) {
                        if (e == '&') {
                            int[] c8 = q7.c('>', true);
                            if (c8 != null) {
                                q7.f5129k.u(v8, aVar.v(), c8);
                                return;
                            } else {
                                q7.f5129k.r('&', v8, aVar.v());
                                return;
                            }
                        } else if (e != '\'') {
                            switch (e) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    q7.l();
                                    q7.p(c0Var);
                                    return;
                                default:
                                    q7.f5129k.r(e, v8, aVar.v());
                                    return;
                            }
                        }
                    }
                }
                q7.n(this);
                q7.f5129k.r(e, v8, aVar.v());
                return;
            }
            q7.p(h1.f5174B0);
            return;
        }
        q7.n(this);
        q7.f5129k.r(65533, v8, aVar.v());
    }
}
