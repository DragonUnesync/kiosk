package T7;

/* 'enum' modifier removed */
public final class H0 extends h1 {
    public H0() {
        super("CommentEndDash", 47);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        G0 g02 = h1.f5187O0;
        if (e == 0) {
            q7.n(this);
            J j7 = q7.f5132n;
            j7.r('-');
            j7.r(65533);
            q7.p(g02);
        } else if (e == '-') {
            q7.p(h1.f5189Q0);
        } else if (e != 65535) {
            J j8 = q7.f5132n;
            j8.r('-');
            j8.r(e);
            q7.p(g02);
        } else {
            q7.m(this);
            q7.j();
            q7.p(h1.f5193U);
        }
    }
}
