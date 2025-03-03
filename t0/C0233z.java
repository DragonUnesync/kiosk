package T0;

import G3.i;
import h1.C1030A;

/* renamed from: T0.z  reason: case insensitive filesystem */
public final /* synthetic */ class C0233z implements i {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4971U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f4972V;

    public /* synthetic */ C0233z(int i, Object obj) {
        this.f4971U = i;
        this.f4972V = obj;
    }

    public final Object get() {
        switch (this.f4971U) {
            case 0:
                return Boolean.valueOf(((F) this.f4972V).f4665w0);
            default:
                try {
                    return (C1030A) ((Class) this.f4972V).getConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
