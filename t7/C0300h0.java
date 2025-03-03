package T7;

/* 'enum' modifier removed */
/* renamed from: T7.h0  reason: case insensitive filesystem */
public final class C0300h0 extends h1 {
    public C0300h0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    public final void d(Q q7, C0285a aVar) {
        if (aVar.m()) {
            q7.m(this);
            q7.p(h1.f5193U);
            return;
        }
        char e = aVar.e();
        C0296f0 f0Var = h1.p0;
        if (e == 0) {
            q7.n(this);
            q7.f(65533);
            q7.p(f0Var);
        } else if (e == '-') {
            q7.f(e);
        } else if (e == '<') {
            q7.p(h1.f5235s0);
        } else if (e != '>') {
            q7.f(e);
            q7.p(f0Var);
        } else {
            q7.f(e);
            q7.p(h1.f5203Z);
        }
    }
}
