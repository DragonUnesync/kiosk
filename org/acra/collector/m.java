package org.acra.collector;

import D6.b;
import D6.j;
import P6.f;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m {
    public static void a(Class cls, JSONObject jSONObject, Collection collection) {
        b g8 = f.g(cls.getFields());
        while (g8.hasNext()) {
            Field field = (Field) g8.next();
            if (!collection.contains(field.getName())) {
                try {
                    Object obj = field.get((Object) null);
                    if (obj != null) {
                        if (field.getType().isArray()) {
                            Object[] objArr = (Object[]) obj;
                            jSONObject.put(field.getName(), new JSONArray(j.L(Arrays.copyOf(objArr, objArr.length))));
                        } else {
                            jSONObject.put(field.getName(), obj);
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                }
            }
        }
    }
}
