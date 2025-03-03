package T7;

/* 'enum' modifier removed */
public final class D0 extends h1 {
    public D0() {
        super("MarkupDeclarationOpen", 43);
    }

    public final void d(Q q7, C0285a aVar) {
        if (aVar.o("--")) {
            q7.f5132n.p();
            q7.p(h1.f5185M0);
        } else if (aVar.p("DOCTYPE")) {
            q7.p(h1.f5191S0);
        } else if (aVar.o("[CDATA[")) {
            q7.e();
            q7.p(h1.f5222i1);
        } else {
            q7.n(this);
            J j7 = q7.f5132n;
            j7.p();
            j7.f5098Y = true;
            q7.p(h1.f5183K0);
        }
    }
}
