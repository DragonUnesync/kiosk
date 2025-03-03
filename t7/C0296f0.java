package T7;

/* 'enum' modifier removed */
/* renamed from: T7.f0  reason: case insensitive filesystem */
public final class C0296f0 extends h1 {
    public C0296f0() {
        super("ScriptDataEscaped", 21);
    }

    public final void d(Q q7, C0285a aVar) {
        if (aVar.m()) {
            q7.m(this);
            q7.p(h1.f5193U);
            return;
        }
        char l8 = aVar.l();
        if (l8 == 0) {
            q7.n(this);
            aVar.a();
            q7.f(65533);
        } else if (l8 == '-') {
            q7.f('-');
            q7.a(h1.f5233q0);
        } else if (l8 != '<') {
            q7.h(aVar.j('-', '<', 0));
        } else {
            q7.a(h1.f5235s0);
        }
    }
}
