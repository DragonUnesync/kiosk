package w;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f16161a;

    /* renamed from: b  reason: collision with root package name */
    public long f16162b = 1;

    public n(OutputConfiguration outputConfiguration) {
        this.f16161a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!Objects.equals(this.f16161a, nVar.f16161a) || this.f16162b != nVar.f16162b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f16161a.hashCode() ^ 31;
        int i = (hashCode << 5) - hashCode;
        long j7 = this.f16162b;
        return ((int) (j7 ^ (j7 >>> 32))) ^ i;
    }
}
