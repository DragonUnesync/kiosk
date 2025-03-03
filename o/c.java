package O;

import N.e;
import android.opengl.EGLSurface;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final EGLSurface f3473a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3474b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3475c;

    public c(EGLSurface eGLSurface, int i, int i8) {
        if (eGLSurface != null) {
            this.f3473a = eGLSurface;
            this.f3474b = i;
            this.f3475c = i8;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3473a.equals(cVar.f3473a) && this.f3474b == cVar.f3474b && this.f3475c == cVar.f3475c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3473a.hashCode() ^ 1000003) * 1000003) ^ this.f3474b) * 1000003) ^ this.f3475c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.f3473a);
        sb.append(", width=");
        sb.append(this.f3474b);
        sb.append(", height=");
        return e.z(sb, this.f3475c, "}");
    }
}
