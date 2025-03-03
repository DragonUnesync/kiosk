package h1;

import A1.d;
import G3.i;
import p1.m;

/* renamed from: h1.o  reason: case insensitive filesystem */
public final /* synthetic */ class C1049o implements i {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12497U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f12498V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ d f12499W;

    public /* synthetic */ C1049o(Object obj, d dVar, int i) {
        this.f12497U = i;
        this.f12498V = obj;
        this.f12499W = dVar;
    }

    public final Object get() {
        switch (this.f12497U) {
            case 0:
                return C1050p.d((Class) this.f12498V, this.f12499W);
            case 1:
                return C1050p.d((Class) this.f12498V, this.f12499W);
            case 2:
                return C1050p.d((Class) this.f12498V, this.f12499W);
            default:
                return new S(this.f12499W, (m) ((U.d) this.f12498V).f5257V);
        }
    }
}
