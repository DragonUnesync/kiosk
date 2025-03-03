package c0;

import N.e;

public final class g implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public i f8736U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ h f8737V;

    public g(h hVar) {
        this.f8737V = hVar;
    }

    public final int compareTo(Object obj) {
        return this.f8736U.f8742b - ((i) obj).f8742b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f8736U != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder r8 = Q0.g.r(str);
                r8.append(this.f8736U.f8747h[i]);
                r8.append(" ");
                str = r8.toString();
            }
        }
        StringBuilder B8 = e.B(str, "] ");
        B8.append(this.f8736U);
        return B8.toString();
    }
}
