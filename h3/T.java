package H3;

import j$.util.Objects;

public final class T extends I {
    public final I b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final U g() {
        int i = this.f2015b;
        if (i == 0) {
            int i8 = U.f2032W;
            return o0.f2104d0;
        } else if (i != 1) {
            U j7 = U.j(i, this.f2014a);
            this.f2015b = j7.size();
            this.f2016c = true;
            return j7;
        } else {
            Object obj = this.f2014a[0];
            Objects.requireNonNull(obj);
            int i9 = U.f2032W;
            return new v0(obj);
        }
    }
}
