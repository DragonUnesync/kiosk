package T7;

/* 'enum' modifier removed */
/* renamed from: T7.y0  reason: case insensitive filesystem */
public final class C0333y0 extends h1 {
    public C0333y0() {
        super("Rcdata", 2);
    }

    public final void d(Q q7, C0285a aVar) {
        char l8 = aVar.l();
        if (l8 == 0) {
            q7.n(this);
            aVar.a();
            q7.f(65533);
        } else if (l8 == '&') {
            q7.a(h1.f5199X);
        } else if (l8 == '<') {
            q7.a(h1.f5213e0);
        } else if (l8 != 65535) {
            q7.h(aVar.g());
        } else {
            q7.g(new L());
        }
    }
}
