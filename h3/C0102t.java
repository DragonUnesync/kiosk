package H3;

import G3.d;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: H3.t  reason: case insensitive filesystem */
public final class C0102t extends h0 implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final d f2121U;

    /* renamed from: V  reason: collision with root package name */
    public final h0 f2122V;

    public C0102t(d dVar, h0 h0Var) {
        this.f2121U = dVar;
        h0Var.getClass();
        this.f2122V = h0Var;
    }

    public final int compare(Object obj, Object obj2) {
        d dVar = this.f2121U;
        return this.f2122V.compare(dVar.apply(obj), dVar.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0102t)) {
            return false;
        }
        C0102t tVar = (C0102t) obj;
        if (!this.f2121U.equals(tVar.f2121U) || !this.f2122V.equals(tVar.f2122V)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2121U, this.f2122V});
    }

    public final String toString() {
        return this.f2122V + ".onResultOf(" + this.f2121U + ")";
    }
}
