package T7;

/* 'enum' modifier removed */
/* renamed from: T7.t0  reason: case insensitive filesystem */
public final class C0323t0 extends h1 {
    public C0323t0() {
        super("AttributeName", 34);
    }

    public final void d(Q q7, C0285a aVar) {
        int v4 = aVar.v();
        String k8 = aVar.k(h1.f5224j1);
        O o2 = q7.f5129k;
        int v8 = aVar.v();
        o2.getClass();
        String replace = k8.replace(0, 65533);
        o2.w(v4, v8);
        StringBuilder sb = o2.f5109b0;
        if (sb.length() == 0) {
            o2.f5108a0 = replace;
        } else {
            sb.append(replace);
        }
        int v9 = aVar.v();
        char e = aVar.e();
        if (e == 9 || e == 10 || e == 12 || e == 13 || e == ' ') {
            q7.p(h1.f5176D0);
            return;
        }
        if (!(e == '\"' || e == '\'')) {
            if (e != '/') {
                C0290c0 c0Var = h1.f5193U;
                if (e != 65535) {
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
                            O o8 = q7.f5129k;
                            o8.w(v9, aVar.v());
                            o8.f5109b0.append(e);
                            return;
                    }
                } else {
                    q7.m(this);
                    q7.p(c0Var);
                    return;
                }
            } else {
                q7.p(h1.f5182J0);
                return;
            }
        }
        q7.n(this);
        O o9 = q7.f5129k;
        o9.w(v9, aVar.v());
        o9.f5109b0.append(e);
    }
}
