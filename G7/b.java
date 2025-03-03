package G7;

import j$.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f1744a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1745b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1746c;

    /* JADX WARNING: type inference failed for: r0v0, types: [G7.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [G7.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [G7.a, java.lang.Object] */
    public b() {
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        this.f1744a = obj;
        this.f1745b = obj2;
        this.f1746c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(this.f1744a, bVar.f1744a) || !Objects.equals(this.f1745b, bVar.f1745b) || !Objects.equals(this.f1746c, bVar.f1746c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f1744a, this.f1745b, this.f1746c});
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", new Object[]{Long.valueOf(this.f1746c.f1743a), Long.valueOf(this.f1745b.f1743a), Long.valueOf(this.f1744a.f1743a)});
    }
}
