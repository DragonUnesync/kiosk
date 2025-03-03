package E2;

public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final f f1334a;

    /* renamed from: b  reason: collision with root package name */
    public int f1335b;

    /* renamed from: c  reason: collision with root package name */
    public Class f1336c;

    public e(f fVar) {
        this.f1334a = fVar;
    }

    public final void a() {
        this.f1334a.j(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f1335b == eVar.f1335b && this.f1336c == eVar.f1336c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8 = this.f1335b * 31;
        Class cls = this.f1336c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return i8 + i;
    }

    public final String toString() {
        return "Key{size=" + this.f1335b + "array=" + this.f1336c + '}';
    }
}
