package t2;

import u2.C1490a;

/* renamed from: t2.c  reason: case insensitive filesystem */
public abstract class C1421c extends C1424f {

    /* renamed from: Y  reason: collision with root package name */
    public final C1490a f15188Y;

    public C1421c(n nVar, p pVar, k kVar, l lVar, C1490a aVar) {
        super(nVar, pVar, kVar, lVar);
        if (aVar != null) {
            this.f15188Y = aVar;
            return;
        }
        throw new NullPointerException("cst == null");
    }

    public String e() {
        return this.f15188Y.a();
    }
}
