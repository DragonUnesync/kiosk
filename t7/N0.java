package T7;

/* 'enum' modifier removed */
public final class N0 extends h1 {
    public N0() {
        super("DoctypeName", 52);
    }

    public final void d(Q q7, C0285a aVar) {
        if (aVar.t()) {
            q7.f5131m.f5099W.append(aVar.h());
            return;
        }
        char e = aVar.e();
        if (e != 0) {
            if (e != ' ') {
                C0290c0 c0Var = h1.f5193U;
                if (e == '>') {
                    q7.k();
                    q7.p(c0Var);
                    return;
                } else if (e == 65535) {
                    q7.m(this);
                    q7.f5131m.f5103a0 = true;
                    q7.k();
                    q7.p(c0Var);
                    return;
                } else if (!(e == 9 || e == 10 || e == 12 || e == 13)) {
                    q7.f5131m.f5099W.append(e);
                    return;
                }
            }
            q7.p(h1.f5196V0);
            return;
        }
        q7.n(this);
        q7.f5131m.f5099W.append(65533);
    }
}
