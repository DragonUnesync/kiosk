package b6;

import g6.C0978k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: b6.q  reason: case insensitive filesystem */
public final class C0576q implements C0558i {
    public static final C0576q INSTANCE = new C0576q(true);
    public static final C0576q INSTANCE_DEFAULTING_TO_SUPPORTED_CIPHERS = new C0576q(false);
    private final boolean defaultToDefaultCiphers;

    private C0576q(boolean z) {
        this.defaultToDefaultCiphers = z;
    }

    public String[] filterCipherSuites(Iterable<String> iterable, List<String> list, Set<String> set) {
        String next;
        if (iterable != null) {
            ArrayList arrayList = new ArrayList(set.size());
            Iterator<String> it = iterable.iterator();
            while (it.hasNext() && (next = it.next()) != null) {
                arrayList.add(next);
            }
            return (String[]) arrayList.toArray(C0978k.EMPTY_STRINGS);
        } else if (this.defaultToDefaultCiphers) {
            return (String[]) list.toArray(C0978k.EMPTY_STRINGS);
        } else {
            return (String[]) set.toArray(C0978k.EMPTY_STRINGS);
        }
    }
}
