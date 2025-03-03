package u2;

import y2.C1632g;

/* renamed from: u2.a  reason: case insensitive filesystem */
public abstract class C1490a implements C1632g, Comparable {
    /* renamed from: b */
    public final int compareTo(C1490a aVar) {
        Class<?> cls = getClass();
        Class<?> cls2 = aVar.getClass();
        if (cls != cls2) {
            return cls.getName().compareTo(cls2.getName());
        }
        return d(aVar);
    }

    public abstract int d(C1490a aVar);

    public abstract String e();
}
