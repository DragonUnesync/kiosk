package w;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f16158a;

    /* renamed from: b  reason: collision with root package name */
    public String f16159b;

    /* renamed from: c  reason: collision with root package name */
    public long f16160c = 1;

    public l(OutputConfiguration outputConfiguration) {
        this.f16158a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!Objects.equals(this.f16158a, lVar.f16158a) || this.f16160c != lVar.f16160c || !Objects.equals(this.f16159b, lVar.f16159b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f16158a.hashCode() ^ 31;
        int i8 = (hashCode << 5) - hashCode;
        String str = this.f16159b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = i ^ i8;
        int i10 = (i9 << 5) - i9;
        long j7 = this.f16160c;
        return ((int) (j7 ^ (j7 >>> 32))) ^ i10;
    }
}
