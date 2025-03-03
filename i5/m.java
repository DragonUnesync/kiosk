package i5;

import N.e;
import g7.C0996d;

public final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    public final int f12751a;

    public m(int i) {
        this.f12751a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nVar.size() == 1 && this.f12751a == nVar.get(0)) {
            return true;
        }
        return false;
    }

    public final int get(int i) {
        C0996d.j(i, 1);
        return this.f12751a;
    }

    public final int hashCode() {
        return this.f12751a + 31;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return e.z(new StringBuilder("["), this.f12751a, "]");
    }
}
