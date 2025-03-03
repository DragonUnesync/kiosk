package androidx.camera.lifecycle;

import androidx.lifecycle.r;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final r f7662a;

    /* renamed from: b  reason: collision with root package name */
    public final H.a f7663b;

    public a(r rVar, H.a aVar) {
        if (rVar != null) {
            this.f7662a = rVar;
            if (aVar != null) {
                this.f7663b = aVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f7662a.equals(aVar.f7662a) || !this.f7663b.equals(aVar.f7663b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f7662a.hashCode() ^ 1000003) * 1000003) ^ this.f7663b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f7662a + ", cameraId=" + this.f7663b + "}";
    }
}
