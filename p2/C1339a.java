package p2;

import u2.u;

/* renamed from: p2.a  reason: case insensitive filesystem */
public final class C1339a implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public final u f14452U;

    /* renamed from: V  reason: collision with root package name */
    public final int f14453V;

    public C1339a(u uVar, int i) {
        if (i >= 0) {
            this.f14453V = i;
            this.f14452U = uVar;
            return;
        }
        throw new IllegalArgumentException("handler < 0");
    }

    /* renamed from: a */
    public final int compareTo(C1339a aVar) {
        int i = aVar.f14453V;
        int i8 = this.f14453V;
        if (i8 < i) {
            return -1;
        }
        if (i8 > i) {
            return 1;
        }
        return this.f14452U.compareTo(aVar.f14452U);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1339a) || compareTo((C1339a) obj) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14452U.hashCode() + (this.f14453V * 31);
    }
}
