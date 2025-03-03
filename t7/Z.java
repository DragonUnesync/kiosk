package T7;

/* 'enum' modifier removed */
public final class Z extends h1 {
    public Z() {
        super("ScriptDataLessthanSign", 16);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        if (e == '!') {
            q7.h("<!");
            q7.p(h1.f5231n0);
        } else if (e == '/') {
            q7.e();
            q7.p(h1.f5227l0);
        } else if (e != 65535) {
            q7.h("<");
            aVar.y();
            q7.p(h1.f5203Z);
        } else {
            q7.h("<");
            q7.m(this);
            q7.p(h1.f5193U);
        }
    }
}
