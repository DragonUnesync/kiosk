package E7;

import S7.k;
import S7.q;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Stack;
import java.util.function.Supplier;

public final /* synthetic */ class d implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1382a;

    public /* synthetic */ d(int i) {
        this.f1382a = i;
    }

    public final Object get() {
        switch (this.f1382a) {
            case 0:
                return new byte[8192];
            case 1:
                return new char[8192];
            case 2:
                return new byte[8192];
            case 3:
                return new SoftReference(new Stack());
            case 4:
                return new StringBuilder(1024);
            case 5:
                return new char[2];
            case 6:
                return new String[512];
            case 7:
                return new char[2048];
            case 8:
                return new ArrayList();
            case 9:
                return new IdentityHashMap();
            default:
                return new q(new k("html"), k.class);
        }
    }
}
