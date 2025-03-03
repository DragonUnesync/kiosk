package k1;

import M0.Y;
import Q0.g;

/* renamed from: k1.g  reason: case insensitive filesystem */
public final class C1138g extends n implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f12949Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f12950Z = this.f12983X.b();

    public C1138g(int i, Y y8, int i8, C1141j jVar, int i9) {
        super(i, y8, i8);
        this.f12949Y = g.i(i9, jVar.f12968x) ? 1 : 0;
    }

    public final int a() {
        return this.f12949Y;
    }

    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        C1138g gVar = (C1138g) nVar;
        return false;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.f12950Z, ((C1138g) obj).f12950Z);
    }
}
