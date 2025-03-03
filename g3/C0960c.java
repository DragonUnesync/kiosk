package g3;

import N.e;
import android.animation.TimeInterpolator;

/* renamed from: g3.c  reason: case insensitive filesystem */
public final class C0960c {

    /* renamed from: a  reason: collision with root package name */
    public long f12011a;

    /* renamed from: b  reason: collision with root package name */
    public long f12012b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f12013c;

    /* renamed from: d  reason: collision with root package name */
    public int f12014d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f12013c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return C0958a.f12006b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0960c)) {
            return false;
        }
        C0960c cVar = (C0960c) obj;
        if (this.f12011a == cVar.f12011a && this.f12012b == cVar.f12012b && this.f12014d == cVar.f12014d && this.e == cVar.e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f12011a;
        long j8 = this.f12012b;
        return ((((a().getClass().hashCode() + (((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31) + this.f12014d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C0960c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f12011a);
        sb.append(" duration: ");
        sb.append(this.f12012b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f12014d);
        sb.append(" repeatMode: ");
        return e.z(sb, this.e, "}\n");
    }
}
