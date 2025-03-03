package T7;

/* 'enum' modifier removed */
public final class L0 extends h1 {
    public L0() {
        super("Doctype", 50);
    }

    public final void d(Q q7, C0285a aVar) {
        char e = aVar.e();
        M0 m02 = h1.f5192T0;
        if (e == 9 || e == 10 || e == 12 || e == 13 || e == ' ') {
            q7.p(m02);
            return;
        }
        if (e != '>') {
            if (e != 65535) {
                q7.n(this);
                q7.p(m02);
                return;
            }
            q7.m(this);
        }
        q7.n(this);
        K k8 = q7.f5131m;
        k8.p();
        k8.f5103a0 = true;
        q7.k();
        q7.p(h1.f5193U);
    }
}
