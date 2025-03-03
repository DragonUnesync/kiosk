package T7;

/* 'enum' modifier removed */
public final class M0 extends h1 {
    public M0() {
        super("BeforeDoctypeName", 51);
    }

    public final void d(Q q7, C0285a aVar) {
        boolean s8 = aVar.s();
        N0 n02 = h1.f5194U0;
        if (s8) {
            q7.f5131m.p();
            q7.p(n02);
            return;
        }
        char e = aVar.e();
        if (e == 0) {
            q7.n(this);
            K k8 = q7.f5131m;
            k8.p();
            k8.f5099W.append(65533);
            q7.p(n02);
        } else if (e == ' ') {
        } else {
            if (e == 65535) {
                q7.m(this);
                K k9 = q7.f5131m;
                k9.p();
                k9.f5103a0 = true;
                q7.k();
                q7.p(h1.f5193U);
            } else if (e != 9 && e != 10 && e != 12 && e != 13) {
                q7.f5131m.p();
                q7.f5131m.f5099W.append(e);
                q7.p(n02);
            }
        }
    }
}
