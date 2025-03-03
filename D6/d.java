package D6;

import G5.s;
import P6.f;
import java.util.RandomAccess;

public final class d extends e implements RandomAccess {

    /* renamed from: U  reason: collision with root package name */
    public final e f1257U;

    /* renamed from: V  reason: collision with root package name */
    public final int f1258V;

    /* renamed from: W  reason: collision with root package name */
    public final int f1259W;

    public d(e eVar, int i, int i8) {
        f.e(eVar, "list");
        this.f1257U = eVar;
        this.f1258V = i;
        s.c(i, i8, eVar.b());
        this.f1259W = i8 - i;
    }

    public final int b() {
        return this.f1259W;
    }

    public final Object get(int i) {
        int i8 = this.f1259W;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i8);
        }
        return this.f1257U.get(this.f1258V + i);
    }
}
