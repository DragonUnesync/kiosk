package X5;

import java.util.AbstractList;
import java.util.List;

public final class D extends AbstractList {
    final /* synthetic */ List val$allNames;

    public D(List list) {
        this.val$allNames = list;
    }

    public int size() {
        return this.val$allNames.size();
    }

    public String get(int i) {
        Object obj = this.val$allNames.get(i);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
