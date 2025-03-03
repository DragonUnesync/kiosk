package M3;

import A1.d;
import V3.a;
import a4.C0424g;
import i4.C1100a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

public final class g implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final j[] f3141c = new j[0];

    /* renamed from: a  reason: collision with root package name */
    public EnumMap f3142a;

    /* renamed from: b  reason: collision with root package name */
    public j[] f3143b;

    public final void a() {
        j[] jVarArr = this.f3143b;
        if (jVarArr != null) {
            for (j a8 : jVarArr) {
                a8.a();
            }
        }
    }

    public final l b(d dVar, EnumMap enumMap) {
        d(enumMap);
        return c(dVar);
    }

    public final l c(d dVar) {
        j[] jVarArr = this.f3143b;
        if (jVarArr != null) {
            int length = jVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return jVarArr[i].b(dVar, this.f3142a);
                } catch (k unused) {
                    i++;
                }
            }
        }
        throw h.f3144W;
    }

    public final void d(EnumMap enumMap) {
        boolean z;
        Collection collection;
        this.f3142a = enumMap;
        boolean z6 = false;
        if (enumMap == null || !enumMap.containsKey(c.f3127X)) {
            z = false;
        } else {
            z = true;
        }
        if (enumMap == null) {
            collection = null;
        } else {
            collection = (Collection) enumMap.get(c.f3126W);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.f3120i0) || collection.contains(a.f3121j0) || collection.contains(a.f3113b0) || collection.contains(a.f3112a0) || collection.contains(a.f3107V) || collection.contains(a.f3108W) || collection.contains(a.f3109X) || collection.contains(a.f3110Y) || collection.contains(a.f3114c0) || collection.contains(a.f3118g0) || collection.contains(a.f3119h0)) {
                z6 = true;
            }
            if (z6 && !z) {
                arrayList.add(new C0424g(enumMap, 0));
            }
            if (collection.contains(a.f3117f0)) {
                arrayList.add(new C1100a());
            }
            if (collection.contains(a.f3111Z)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.f3106U)) {
                arrayList.add(new Object());
            }
            if (collection.contains(a.f3116e0)) {
                arrayList.add(new Object());
            }
            if (collection.contains(a.f3115d0)) {
                arrayList.add(new Y3.a());
            }
            if (z6 && z) {
                arrayList.add(new C0424g(enumMap, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new C0424g(enumMap, 0));
            }
            arrayList.add(new C1100a());
            arrayList.add(new a());
            arrayList.add(new Object());
            arrayList.add(new Object());
            arrayList.add(new Y3.a());
            if (z) {
                arrayList.add(new C0424g(enumMap, 0));
            }
        }
        this.f3143b = (j[]) arrayList.toArray(f3141c);
    }
}
