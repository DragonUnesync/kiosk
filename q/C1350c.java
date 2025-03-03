package q;

import java.util.Map;

/* renamed from: q.c  reason: case insensitive filesystem */
public final class C1350c implements Map.Entry {

    /* renamed from: U  reason: collision with root package name */
    public final Object f14690U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f14691V;

    /* renamed from: W  reason: collision with root package name */
    public C1350c f14692W;

    /* renamed from: X  reason: collision with root package name */
    public C1350c f14693X;

    public C1350c(Object obj, Object obj2) {
        this.f14690U = obj;
        this.f14691V = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1350c)) {
            return false;
        }
        C1350c cVar = (C1350c) obj;
        if (!this.f14690U.equals(cVar.f14690U) || !this.f14691V.equals(cVar.f14691V)) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.f14690U;
    }

    public final Object getValue() {
        return this.f14691V;
    }

    public final int hashCode() {
        return this.f14690U.hashCode() ^ this.f14691V.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f14690U + "=" + this.f14691V;
    }
}
