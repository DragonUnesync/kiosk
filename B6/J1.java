package b6;

import g6.B;
import g6.C0978k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class J1 implements C0558i {
    public static final J1 INSTANCE = new J1();

    private J1() {
    }

    public String[] filterCipherSuites(Iterable<String> iterable, List<String> list, Set<String> set) {
        ArrayList arrayList;
        String next;
        B.checkNotNull(list, "defaultCiphers");
        B.checkNotNull(set, "supportedCiphers");
        if (iterable == null) {
            List<String> list2 = list;
            arrayList = new ArrayList(list.size());
            iterable = list2;
        } else {
            arrayList = new ArrayList(set.size());
        }
        Iterator<String> it = iterable.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (set.contains(next)) {
                arrayList.add(next);
            }
        }
        return (String[]) arrayList.toArray(C0978k.EMPTY_STRINGS);
    }
}
