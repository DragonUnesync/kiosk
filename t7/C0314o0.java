package T7;

/* 'enum' modifier removed */
/* renamed from: T7.o0  reason: case insensitive filesystem */
public final class C0314o0 extends h1 {
    public C0314o0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        C0310m0 m0Var = h1.f5239w0;
        if (e == 0) {
            q7.n(this);
            q7.f(65533);
            q7.p(m0Var);
        } else if (e == '-') {
            q7.f(e);
            q7.p(h1.f5241y0);
        } else if (e == '<') {
            q7.f(e);
            q7.p(h1.f5242z0);
        } else if (e != 65535) {
            q7.f(e);
            q7.p(m0Var);
        } else {
            q7.m(this);
            q7.p(h1.f5193U);
        }
    }
}
