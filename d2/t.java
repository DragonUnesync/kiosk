package D2;

import W6.b;
import W6.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class t implements Iterable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1154U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f1155V;

    public /* synthetic */ t(int i, Object obj) {
        this.f1154U = i;
        this.f1155V = obj;
    }

    public final Iterator iterator() {
        switch (this.f1154U) {
            case 0:
                return ((ArrayList) this.f1155V).iterator();
            default:
                return new b((c) this.f1155V);
        }
    }
}
