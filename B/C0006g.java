package B;

import D.H0;
import android.graphics.Matrix;

/* renamed from: B.g  reason: case insensitive filesystem */
public final class C0006g implements U {

    /* renamed from: a  reason: collision with root package name */
    public final H0 f246a;

    /* renamed from: b  reason: collision with root package name */
    public final long f247b;

    /* renamed from: c  reason: collision with root package name */
    public final int f248c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f249d;

    public C0006g(H0 h02, long j7, int i, Matrix matrix) {
        if (h02 != null) {
            this.f246a = h02;
            this.f247b = j7;
            this.f248c = i;
            this.f249d = matrix;
            return;
        }
        throw new NullPointerException("Null tagBundle");
    }

    public final H0 a() {
        return this.f246a;
    }

    public final long b() {
        return this.f247b;
    }

    public final int c() {
        return this.f248c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0006g)) {
            return false;
        }
        C0006g gVar = (C0006g) obj;
        if (!this.f246a.equals(gVar.f246a) || this.f247b != gVar.f247b || this.f248c != gVar.f248c || !this.f249d.equals(gVar.f249d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j7 = this.f247b;
        return ((((((this.f246a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f248c) * 1000003) ^ this.f249d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f246a + ", timestamp=" + this.f247b + ", rotationDegrees=" + this.f248c + ", sensorToBufferTransformMatrix=" + this.f249d + "}";
    }
}
