package P0;

import D2.G;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3707a;

    /* renamed from: b  reason: collision with root package name */
    public G f3708b = new G(1);

    /* renamed from: c  reason: collision with root package name */
    public boolean f3709c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3710d;

    public j(Object obj) {
        this.f3707a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f3707a.equals(((j) obj).f3707a);
    }

    public final int hashCode() {
        return this.f3707a.hashCode();
    }
}
