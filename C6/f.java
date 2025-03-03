package C6;

import android.util.Size;
import android.view.Surface;
import java.io.Serializable;

public final class f implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final Surface f717U;

    /* renamed from: V  reason: collision with root package name */
    public final Size f718V;

    /* renamed from: W  reason: collision with root package name */
    public final float[] f719W;

    public f(Surface surface, Size size, Object obj) {
        this.f717U = surface;
        this.f718V = size;
        this.f719W = (float[]) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (P6.f.a(this.f717U, fVar.f717U) && P6.f.a(this.f718V, fVar.f718V) && this.f719W.equals(fVar.f719W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8 = 0;
        Surface surface = this.f717U;
        if (surface == null) {
            i = 0;
        } else {
            i = surface.hashCode();
        }
        int i9 = i * 31;
        Size size = this.f718V;
        if (size != null) {
            i8 = size.hashCode();
        }
        return this.f719W.hashCode() + ((i9 + i8) * 31);
    }

    public final String toString() {
        return "(" + this.f717U + ", " + this.f718V + ", " + this.f719W + ')';
    }
}
