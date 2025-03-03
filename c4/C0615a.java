package c4;

import b4.b;
import b4.c;
import j$.util.Objects;

/* renamed from: c4.a  reason: case insensitive filesystem */
public final class C0615a {

    /* renamed from: a  reason: collision with root package name */
    public final b f8882a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8883b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8884c;

    public C0615a(b bVar, b bVar2, c cVar) {
        this.f8882a = bVar;
        this.f8883b = bVar2;
        this.f8884c = cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0615a)) {
            return false;
        }
        C0615a aVar = (C0615a) obj;
        if (!Objects.equals(this.f8882a, aVar.f8882a) || !Objects.equals(this.f8883b, aVar.f8883b) || !Objects.equals(this.f8884c, aVar.f8884c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f8882a) ^ Objects.hashCode(this.f8883b)) ^ Objects.hashCode(this.f8884c);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f8882a);
        sb.append(" , ");
        sb.append(this.f8883b);
        sb.append(" : ");
        c cVar = this.f8884c;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.f8671a);
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }
}
