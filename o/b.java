package O;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f3467a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3468b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3469c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3470d;
    public final Size e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3471f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3472g;

    public b(UUID uuid, int i, int i8, Rect rect, Size size, int i9, boolean z) {
        if (uuid != null) {
            this.f3467a = uuid;
            this.f3468b = i;
            this.f3469c = i8;
            if (rect != null) {
                this.f3470d = rect;
                if (size != null) {
                    this.e = size;
                    this.f3471f = i9;
                    this.f3472g = z;
                    return;
                }
                throw new NullPointerException("Null getSize");
            }
            throw new NullPointerException("Null getCropRect");
        }
        throw new NullPointerException("Null getUuid");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3467a.equals(bVar.f3467a) && this.f3468b == bVar.f3468b && this.f3469c == bVar.f3469c && this.f3470d.equals(bVar.f3470d) && this.e.equals(bVar.e) && this.f3471f == bVar.f3471f && this.f3472g == bVar.f3472g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((this.f3467a.hashCode() ^ 1000003) * 1000003) ^ this.f3468b) * 1000003) ^ this.f3469c) * 1000003) ^ this.f3470d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f3471f) * 1000003;
        if (this.f3472g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "OutConfig{getUuid=" + this.f3467a + ", getTargets=" + this.f3468b + ", getFormat=" + this.f3469c + ", getCropRect=" + this.f3470d + ", getSize=" + this.e + ", getRotationDegrees=" + this.f3471f + ", isMirroring=" + this.f3472g + ", shouldRespectInputCropRect=false}";
    }
}
