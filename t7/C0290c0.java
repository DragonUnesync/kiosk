package T7;

/* 'enum' modifier removed */
/* renamed from: T7.c0  reason: case insensitive filesystem */
public final class C0290c0 extends h1 {
    public C0290c0() {
        super("Data", 0);
    }

    public final void d(Q q7, C0285a aVar) {
        char l8 = aVar.l();
        if (l8 == 0) {
            q7.n(this);
            q7.f(aVar.e());
        } else if (l8 == '&') {
            q7.a(h1.f5195V);
        } else if (l8 == '<') {
            q7.a(h1.f5207b0);
        } else if (l8 != 65535) {
            q7.h(aVar.g());
        } else {
            q7.g(new L());
        }
    }
}
