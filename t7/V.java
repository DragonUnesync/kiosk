package T7;

/* 'enum' modifier removed */
public final class V extends h1 {
    public V() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(Q q7, C0285a aVar) {
        q7.h("</");
        q7.i(q7.f5127h);
        aVar.y();
        q7.p(h1.f5197W);
    }

    public final void d(Q q7, C0285a aVar) {
        if (aVar.s()) {
            String h5 = aVar.h();
            q7.f5129k.v(h5);
            q7.f5127h.append(h5);
            return;
        }
        char e = aVar.e();
        if (e == 9 || e == 10 || e == 12 || e == 13 || e == ' ') {
            if (q7.o()) {
                q7.p(h1.f5174B0);
            } else {
                e(q7, aVar);
            }
        } else if (e != '/') {
            if (e != '>') {
                e(q7, aVar);
            } else if (q7.o()) {
                q7.l();
                q7.p(h1.f5193U);
            } else {
                e(q7, aVar);
            }
        } else if (q7.o()) {
            q7.p(h1.f5182J0);
        } else {
            e(q7, aVar);
        }
    }
}
