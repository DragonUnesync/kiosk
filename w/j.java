package w;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f16154a;

    /* renamed from: b  reason: collision with root package name */
    public String f16155b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16156c;

    /* renamed from: d  reason: collision with root package name */
    public long f16157d = 1;

    public j(OutputConfiguration outputConfiguration) {
        this.f16154a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!Objects.equals(this.f16154a, jVar.f16154a) || this.f16156c != jVar.f16156c || this.f16157d != jVar.f16157d || !Objects.equals(this.f16155b, jVar.f16155b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f16154a.hashCode() ^ 31;
        boolean z = this.f16156c ^ ((hashCode << 5) - hashCode);
        int i8 = ((z ? 1 : 0) << true) - z;
        String str = this.f16155b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = i ^ i8;
        int i10 = (i9 << 5) - i9;
        long j7 = this.f16157d;
        return ((int) (j7 ^ (j7 >>> 32))) ^ i10;
    }
}
