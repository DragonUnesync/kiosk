package P6;

import D6.j;
import N.e;
import O6.a;
import O6.c;
import O6.f;
import O6.g;
import O6.h;
import O6.i;
import O6.k;
import O6.l;
import O6.m;
import O6.n;
import O6.o;
import O6.p;
import O6.q;
import O6.r;
import O6.s;
import O6.t;
import O6.u;
import O6.v;
import U6.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class d implements b, c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f3949b;

    /* renamed from: a  reason: collision with root package name */
    public final Class f3950a;

    static {
        int i = 0;
        List L8 = j.L(a.class, l.class, p.class, e.class, q.class, r.class, s.class, t.class, u.class, v.class, O6.b.class, c.class, O6.d.class, O6.e.class, f.class, g.class, h.class, i.class, O6.j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(D6.k.M(L8));
        for (Object next : L8) {
            int i8 = i + 1;
            if (i >= 0) {
                arrayList.add(new C6.c((Class) next, Integer.valueOf(i)));
                i = i8;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f3949b = D6.u.E(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        f.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            f.b(str);
            sb.append(W6.d.q0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f3949b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(D6.u.D(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), W6.d.q0((String) entry2.getValue()));
        }
    }

    public d(Class cls) {
        this.f3950a = cls;
    }

    public final Class a() {
        return this.f3950a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || !D7.b.s(this).equals(D7.b.s((b) obj))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return D7.b.s(this).hashCode();
    }

    public final String toString() {
        return this.f3950a.toString() + " (Kotlin reflection is not available)";
    }
}
