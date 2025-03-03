package androidx.lifecycle;

import p.C1328a;

public class z extends x {
    public final void j(Object obj) {
        x.a("setValue");
        this.f8173g++;
        this.e = obj;
        c((w) null);
    }

    public final void k(Object obj) {
        boolean z;
        synchronized (this.f8168a) {
            if (this.f8172f == x.f8167k) {
                z = true;
            } else {
                z = false;
            }
            this.f8172f = obj;
        }
        if (z) {
            C1328a.s().t(this.f8175j);
        }
    }
}
