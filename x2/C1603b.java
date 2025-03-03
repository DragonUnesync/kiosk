package x2;

import java.util.ArrayList;

/* renamed from: x2.b  reason: case insensitive filesystem */
public final class C1603b {

    /* renamed from: a  reason: collision with root package name */
    public final Class f16254a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16255b;

    /* renamed from: c  reason: collision with root package name */
    public final ClassLoader f16256c;

    public C1603b(Class cls, ArrayList arrayList, ClassLoader classLoader) {
        this.f16254a = cls;
        this.f16255b = new ArrayList(arrayList);
        this.f16256c = classLoader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1603b.class != obj.getClass()) {
            return false;
        }
        C1603b bVar = (C1603b) obj;
        if (this.f16254a == bVar.f16254a && this.f16255b.equals(bVar.f16255b) && this.f16256c == bVar.f16256c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16256c.hashCode() + this.f16255b.hashCode() + this.f16254a.hashCode();
    }
}
