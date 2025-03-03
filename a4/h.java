package A4;

import B6.a;
import C4.e;
import F4.c;
import M5.b;
import m4.C1214b;
import x4.f;

public final class h implements a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f117U;

    /* renamed from: V  reason: collision with root package name */
    public final b f118V;

    /* renamed from: W  reason: collision with root package name */
    public final a f119W;

    public /* synthetic */ h(b bVar, a aVar, int i) {
        this.f117U = i;
        this.f118V = bVar;
        this.f119W = aVar;
    }

    public final Object get() {
        switch (this.f117U) {
            case 0:
                return new g((C1214b) this.f118V.f3175U, (f) this.f119W.get());
            case 1:
                return new e((C1214b) this.f118V.f3175U, (C4.a) this.f119W.get());
            default:
                return new c((C1214b) this.f118V.f3175U, (C4.a) this.f119W.get());
        }
    }
}
