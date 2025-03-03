package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
public final class C0474a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8136a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8137b;

    public C0474a(HashMap hashMap) {
        this.f8137b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            C0485l lVar = (C0485l) entry.getValue();
            List list = (List) this.f8136a.get(lVar);
            if (list == null) {
                list = new ArrayList();
                this.f8136a.put(lVar, list);
            }
            list.add((C0475b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, C0485l lVar, q qVar) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0475b bVar = (C0475b) list.get(size);
                bVar.getClass();
                try {
                    int i = bVar.f8138a;
                    Method method = bVar.f8139b;
                    if (i == 0) {
                        method.invoke(qVar, (Object[]) null);
                    } else if (i == 1) {
                        method.invoke(qVar, new Object[]{rVar});
                    } else if (i == 2) {
                        method.invoke(qVar, new Object[]{rVar, lVar});
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
    }
}
