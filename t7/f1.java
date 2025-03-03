package T7;

/* 'enum' modifier removed */
public final class f1 extends h1 {
    public f1() {
        super("TagOpen", 7);
    }

    public final void d(Q q7, C0285a aVar) {
        char l8 = aVar.l();
        if (l8 == '!') {
            q7.a(h1.f5184L0);
        } else if (l8 == '/') {
            q7.a(h1.f5209c0);
        } else if (l8 == '?') {
            J j7 = q7.f5132n;
            j7.p();
            j7.f5098Y = true;
            q7.p(h1.f5183K0);
        } else if (aVar.s()) {
            q7.d(true);
            q7.p(h1.f5211d0);
        } else {
            q7.n(this);
            q7.f('<');
            q7.p(h1.f5193U);
        }
    }
}
