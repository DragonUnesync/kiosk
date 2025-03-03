package B;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: B.k  reason: case insensitive filesystem */
public final class C0010k {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f271a;

    /* renamed from: b  reason: collision with root package name */
    public final int f272b;

    /* renamed from: c  reason: collision with root package name */
    public final int f273c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f274d;
    public final Matrix e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f275f;

    public C0010k(Rect rect, int i, int i8, boolean z, Matrix matrix, boolean z6) {
        if (rect != null) {
            this.f271a = rect;
            this.f272b = i;
            this.f273c = i8;
            this.f274d = z;
            if (matrix != null) {
                this.e = matrix;
                this.f275f = z6;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0010k)) {
            return false;
        }
        C0010k kVar = (C0010k) obj;
        if (this.f271a.equals(kVar.f271a) && this.f272b == kVar.f272b && this.f273c == kVar.f273c && this.f274d == kVar.f274d && this.e.equals(kVar.e) && this.f275f == kVar.f275f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f271a.hashCode() ^ 1000003) * 1000003) ^ this.f272b) * 1000003) ^ this.f273c) * 1000003;
        int i8 = 1237;
        if (this.f274d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.e.hashCode()) * 1000003;
        if (this.f275f) {
            i8 = 1231;
        }
        return hashCode2 ^ i8;
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.f271a + ", getRotationDegrees=" + this.f272b + ", getTargetRotation=" + this.f273c + ", hasCameraTransform=" + this.f274d + ", getSensorToBufferTransform=" + this.e + ", isMirroring=" + this.f275f + "}";
    }
}
