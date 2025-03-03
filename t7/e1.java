package T7;

/* 'enum' modifier removed */
public final class e1 extends h1 {
    public e1() {
        super("PLAINTEXT", 6);
    }

    public final void d(Q q7, C0285a aVar) {
        char l8 = aVar.l();
        if (l8 == 0) {
            q7.n(this);
            aVar.a();
            q7.f(65533);
        } else if (l8 != 65535) {
            q7.h(aVar.i(0));
        } else {
            q7.g(new L());
        }
    }
}
