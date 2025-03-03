package T7;

/* 'enum' modifier removed */
public final class g1 extends h1 {
    public g1() {
        super("EndTagOpen", 8);
    }

    public final void d(Q q7, C0285a aVar) {
        boolean m8 = aVar.m();
        C0290c0 c0Var = h1.f5193U;
        if (m8) {
            q7.m(this);
            q7.h("</");
            q7.p(c0Var);
        } else if (aVar.s()) {
            q7.d(false);
            q7.p(h1.f5211d0);
        } else if (aVar.q('>')) {
            q7.n(this);
            q7.a(c0Var);
        } else {
            q7.n(this);
            J j7 = q7.f5132n;
            j7.p();
            j7.f5098Y = true;
            j7.r('/');
            q7.p(h1.f5183K0);
        }
    }
}
