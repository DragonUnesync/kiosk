package D6;

import C6.c;
import N7.a;
import P6.f;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.acra.collector.ConfigurationCollector;

public abstract class u extends a {
    public static Object C(Map map, ConfigurationCollector.Prefix prefix) {
        f.e(map, "<this>");
        if (map instanceof v) {
            EnumMap enumMap = ((v) map).f1272U;
            Object obj = enumMap.get(prefix);
            if (obj != null || enumMap.containsKey(prefix)) {
                return obj;
            }
            return ConfigurationCollector.getValueArrays$lambda$11(prefix);
        }
        Object obj2 = map.get(prefix);
        if (obj2 != null || map.containsKey(prefix)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + prefix + " is missing in the map.");
    }

    public static int D(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map E(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return s.f1270U;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(D(arrayList.size()));
            F(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        c cVar = (c) arrayList.get(0);
        f.e(cVar, "pair");
        Map singletonMap = Collections.singletonMap(cVar.f711U, cVar.f712V);
        f.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static void F(ArrayList arrayList, AbstractMap abstractMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            abstractMap.put(cVar.f711U, cVar.f712V);
        }
    }

    public static final Map G(LinkedHashMap linkedHashMap) {
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        f.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
