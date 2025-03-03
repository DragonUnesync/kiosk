package M0;

import P0.l;
import P0.z;
import java.util.Locale;

public final class L {

    /* renamed from: d  reason: collision with root package name */
    public static final L f2845d = new L(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f2846a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2847b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2848c;

    static {
        z.J(0);
        z.J(1);
    }

    public L(float f8, float f9) {
        boolean z;
        boolean z6 = false;
        if (f8 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        l.d(f9 > 0.0f ? true : z6);
        this.f2846a = f8;
        this.f2847b = f9;
        this.f2848c = Math.round(f8 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l8 = (L) obj;
        if (this.f2846a == l8.f2846a && this.f2847b == l8.f2847b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2847b) + ((Float.floatToRawIntBits(this.f2846a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f2846a), Float.valueOf(this.f2847b)};
        int i = z.f3748a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
