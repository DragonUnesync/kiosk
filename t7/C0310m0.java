package T7;

/* 'enum' modifier removed */
/* renamed from: T7.m0  reason: case insensitive filesystem */
public final class C0310m0 extends h1 {
    public C0310m0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    public final void d(Q q7, C0285a aVar) {
        char l8 = aVar.l();
        if (l8 == 0) {
            q7.n(this);
            aVar.a();
            q7.f(65533);
        } else if (l8 == '-') {
            q7.f(l8);
            q7.a(h1.f5240x0);
        } else if (l8 == '<') {
            q7.f(l8);
            q7.a(h1.f5242z0);
        } else if (l8 != 65535) {
            q7.h(aVar.j('-', '<', 0));
        } else {
            q7.m(this);
            q7.p(h1.f5193U);
        }
    }
}
