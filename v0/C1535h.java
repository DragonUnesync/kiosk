package v0;

import android.view.DisplayCutout;
import j$.util.Objects;

/* renamed from: v0.h  reason: case insensitive filesystem */
public final class C1535h {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f15950a;

    public C1535h(DisplayCutout displayCutout) {
        this.f15950a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1535h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f15950a, ((C1535h) obj).f15950a);
    }

    public final int hashCode() {
        return this.f15950a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f15950a + "}";
    }
}
