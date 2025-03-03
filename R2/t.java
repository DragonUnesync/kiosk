package r2;

import java.util.Formatter;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import m2.C1208a;

public abstract class t extends F {
    public final void k() {
        String str;
        String str2;
        int i = 0;
        if (c().size() > 65536) {
            TreeMap treeMap = new TreeMap();
            for (s sVar : c()) {
                String str3 = sVar.f14903V.f().f15766U;
                int lastIndexOf = str3.lastIndexOf(47);
                int lastIndexOf2 = str3.lastIndexOf(91);
                if (lastIndexOf == -1) {
                    str2 = "default";
                } else {
                    str2 = str3.substring(lastIndexOf2 + 2, lastIndexOf).replace('/', '.');
                }
                AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(str2);
                if (atomicInteger == null) {
                    atomicInteger = new AtomicInteger();
                    treeMap.put(str2, atomicInteger);
                }
                atomicInteger.incrementAndGet();
            }
            Formatter formatter = new Formatter();
            try {
                if (this instanceof v) {
                    str = "method";
                } else {
                    str = "field";
                }
                formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", new Object[]{str, Integer.valueOf(c().size()), 65536});
                for (Map.Entry entry : treeMap.entrySet()) {
                    formatter.format("%n%6d %s", new Object[]{Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey()});
                }
                String formatter2 = formatter.toString();
                formatter.close();
                throw new C1208a((Exception) null, formatter2);
            } catch (Throwable th) {
                formatter.close();
                throw th;
            }
        } else {
            for (s g8 : c()) {
                g8.g(i);
                i++;
            }
        }
    }
}
