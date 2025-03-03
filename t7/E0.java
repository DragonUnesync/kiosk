package T7;

/* 'enum' modifier removed */
public final class E0 extends h1 {
    public E0() {
        super("CommentStart", 44);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        G0 g02 = h1.f5187O0;
        if (e == 0) {
            q7.n(this);
            q7.f5132n.r(65533);
            q7.p(g02);
        } else if (e != '-') {
            C0290c0 c0Var = h1.f5193U;
            if (e == '>') {
                q7.n(this);
                q7.j();
                q7.p(c0Var);
            } else if (e != 65535) {
                aVar.y();
                q7.p(g02);
            } else {
                q7.m(this);
                q7.j();
                q7.p(c0Var);
            }
        } else {
            q7.p(h1.f5186N0);
        }
    }
}
