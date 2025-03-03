package T7;

/* 'enum' modifier removed */
public final class I0 extends h1 {
    public I0() {
        super("CommentEnd", 48);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        G0 g02 = h1.f5187O0;
        if (e == 0) {
            q7.n(this);
            J j7 = q7.f5132n;
            j7.t("--");
            j7.r(65533);
            q7.p(g02);
        } else if (e == '!') {
            q7.p(h1.f5190R0);
        } else if (e != '-') {
            C0290c0 c0Var = h1.f5193U;
            if (e == '>') {
                q7.j();
                q7.p(c0Var);
            } else if (e != 65535) {
                J j8 = q7.f5132n;
                j8.t("--");
                j8.r(e);
                q7.p(g02);
            } else {
                q7.m(this);
                q7.j();
                q7.p(c0Var);
            }
        } else {
            q7.f5132n.r('-');
        }
    }
}
