package E7;

import java.util.IdentityHashMap;
import java.util.function.Supplier;

public final /* synthetic */ class e extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1383a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Supplier f1384b;

    public /* synthetic */ e(Supplier supplier, int i) {
        this.f1383a = i;
        this.f1384b = supplier;
    }

    public final Object initialValue() {
        switch (this.f1383a) {
            case 0:
                ((d) this.f1384b).getClass();
                return new byte[8192];
            case 1:
                ((d) this.f1384b).getClass();
                return new char[8192];
            case 2:
                return ((d) this.f1384b).get();
            case 3:
                ((d) this.f1384b).getClass();
                return new char[2];
            default:
                ((d) this.f1384b).getClass();
                return new IdentityHashMap();
        }
    }
}
