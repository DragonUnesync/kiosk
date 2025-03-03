package T0;

import java.util.Arrays;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final long f4675a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4676b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4677c;

    public I(H h5) {
        this.f4675a = h5.f4672a;
        this.f4676b = h5.f4673b;
        this.f4677c = h5.f4674c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i = (I) obj;
        if (this.f4675a == i.f4675a && this.f4676b == i.f4676b && this.f4677c == i.f4677c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4675a), Float.valueOf(this.f4676b), Long.valueOf(this.f4677c)});
    }
}
