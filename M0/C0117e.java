package M0;

import H3.P;
import N.e;
import P0.z;
import android.media.AudioAttributes;

/* renamed from: M0.e  reason: case insensitive filesystem */
public final class C0117e {

    /* renamed from: b  reason: collision with root package name */
    public static final C0117e f2938b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public P f2939a;

    /* JADX WARNING: type inference failed for: r0v0, types: [M0.e, java.lang.Object] */
    static {
        e.D(0, 1, 2, 3, 4);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, H3.P] */
    public final P a() {
        if (this.f2939a == null) {
            ? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = z.f3748a;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
            }
            obj.f2027U = usage.build();
            this.f2939a = obj;
        }
        return this.f2939a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0117e.class != obj.getClass()) {
            return false;
        }
        C0117e eVar = (C0117e) obj;
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
