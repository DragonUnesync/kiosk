package b6;

import java.util.LinkedHashMap;
import java.util.Map;

public final class Z extends LinkedHashMap {
    final /* synthetic */ C0538b0 this$0;

    public Z(C0538b0 b0Var) {
        this.this$0 = b0Var;
    }

    public boolean removeEldestEntry(Map.Entry<C0547e0, C0535a0> entry) {
        int i = this.this$0.maximumCacheSize.get();
        if (i < 0 || size() <= i) {
            return false;
        }
        this.this$0.removeSessionWithId(entry.getKey());
        return false;
    }
}
