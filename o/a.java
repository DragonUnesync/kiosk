package O;

import N.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3463a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3464b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3465c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3466d;

    public a(String str, String str2, String str3, String str4) {
        this.f3463a = str;
        this.f3464b = str2;
        this.f3465c = str3;
        this.f3466d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3463a.equals(aVar.f3463a) || !this.f3464b.equals(aVar.f3464b) || !this.f3465c.equals(aVar.f3465c) || !this.f3466d.equals(aVar.f3466d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.f3463a.hashCode() ^ 1000003) * 1000003) ^ this.f3464b.hashCode()) * 1000003) ^ this.f3465c.hashCode()) * 1000003) ^ this.f3466d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.f3463a);
        sb.append(", eglVersion=");
        sb.append(this.f3464b);
        sb.append(", glExtensions=");
        sb.append(this.f3465c);
        sb.append(", eglExtensions=");
        return e.A(sb, this.f3466d, "}");
    }
}
