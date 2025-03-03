package w;

import android.hardware.camera2.params.InputConfiguration;
import j$.util.Objects;

public class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public final InputConfiguration f16151a;

    public e(Object obj) {
        this.f16151a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return Objects.equals(this.f16151a, ((e) ((g) obj)).f16151a);
    }

    public final int hashCode() {
        return this.f16151a.hashCode();
    }

    public final String toString() {
        return this.f16151a.toString();
    }
}
