package H;

import D.C0038d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1759a;

    /* renamed from: b  reason: collision with root package name */
    public final C0038d f1760b;

    public a(String str, C0038d dVar) {
        if (str != null) {
            this.f1759a = str;
            if (dVar != null) {
                this.f1760b = dVar;
                return;
            }
            throw new NullPointerException("Null cameraConfigId");
        }
        throw new NullPointerException("Null cameraIdString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f1759a.equals(aVar.f1759a) || !this.f1760b.equals(aVar.f1760b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f1759a.hashCode() ^ 1000003) * 1000003) ^ this.f1760b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f1759a + ", cameraConfigId=" + this.f1760b + "}";
    }
}
