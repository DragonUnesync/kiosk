package t2;

import j$.util.concurrent.ConcurrentHashMap;
import v2.d;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f15200a;

    /* renamed from: b  reason: collision with root package name */
    public d f15201b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        int i = this.f15200a;
        d dVar = this.f15201b;
        ConcurrentHashMap concurrentHashMap = k.f15202W;
        return ((k) obj).b(i, dVar);
    }

    public final int hashCode() {
        int i = this.f15200a;
        d dVar = this.f15201b;
        ConcurrentHashMap concurrentHashMap = k.f15202W;
        return (dVar.hashCode() * 31) + i;
    }
}
