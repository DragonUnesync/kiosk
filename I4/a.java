package I4;

import M5.b;
import m4.C1214b;
import p4.C1342a;
import s4.C1405a;
import u.C1477r;
import y4.C1634a;

public final class a implements B6.a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2274U;

    /* renamed from: V  reason: collision with root package name */
    public final b f2275V;

    /* renamed from: W  reason: collision with root package name */
    public final B6.a f2276W;

    /* renamed from: X  reason: collision with root package name */
    public final B6.a f2277X;

    public /* synthetic */ a(b bVar, B6.a aVar, B6.a aVar2, int i) {
        this.f2274U = i;
        this.f2275V = bVar;
        this.f2276W = aVar;
        this.f2277X = aVar2;
    }

    public final Object get() {
        C1342a aVar;
        C1405a aVar2;
        switch (this.f2274U) {
            case 0:
                M5.a.a(this.f2276W);
                L5.a a8 = M5.a.a(this.f2277X);
                ((O4.a) this.f2275V.f3175U).getClass();
                C1634a aVar3 = (C1634a) a8.get();
                if (aVar3 != null) {
                    return aVar3;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 1:
                L5.a a9 = M5.a.a(this.f2276W);
                L5.a a10 = M5.a.a(this.f2277X);
                ((C1214b) this.f2275V.f3175U).getClass();
                int h5 = C1477r.h(1);
                if (h5 == 0) {
                    aVar = (C1342a) a10.get();
                } else if (h5 == 1) {
                    aVar = (C1342a) a9.get();
                } else {
                    throw new IllegalStateException();
                }
                if (aVar != null) {
                    return aVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                L5.a a11 = M5.a.a(this.f2276W);
                L5.a a12 = M5.a.a(this.f2277X);
                ((C1214b) this.f2275V.f3175U).getClass();
                int h8 = C1477r.h(1);
                if (h8 == 0) {
                    aVar2 = (C1405a) a12.get();
                } else if (h8 == 1) {
                    aVar2 = (C1405a) a11.get();
                } else {
                    throw new IllegalStateException();
                }
                if (aVar2 != null) {
                    return aVar2;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
