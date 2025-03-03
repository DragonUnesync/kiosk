package D;

import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f929a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f930b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f931c;

    public p0(boolean z, HashSet hashSet, HashSet hashSet2) {
        Set set;
        Set set2;
        this.f929a = z;
        if (hashSet == null) {
            set = Collections.emptySet();
        } else {
            set = new HashSet(hashSet);
        }
        this.f930b = set;
        if (hashSet2 == null) {
            set2 = Collections.emptySet();
        } else {
            set2 = new HashSet(hashSet2);
        }
        this.f931c = set2;
    }

    public final boolean a(Class cls, boolean z) {
        if (this.f930b.contains(cls)) {
            return true;
        }
        if (!this.f931c.contains(cls) && this.f929a && z) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        p0 p0Var = (p0) obj;
        if (this.f929a != p0Var.f929a || !Objects.equals(this.f930b, p0Var.f930b) || !Objects.equals(this.f931c, p0Var.f931c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f929a), this.f930b, this.f931c});
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f929a + ", forceEnabledQuirks=" + this.f930b + ", forceDisabledQuirks=" + this.f931c + '}';
    }
}
