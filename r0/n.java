package R0;

import G3.f;
import java.util.Map;

public final /* synthetic */ class n implements f {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4295U;

    public /* synthetic */ n(int i) {
        this.f4295U = i;
    }

    public final boolean apply(Object obj) {
        switch (this.f4295U) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            default:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
        }
    }
}
