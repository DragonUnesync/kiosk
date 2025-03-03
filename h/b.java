package H;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f1761a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1762b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1763c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1764d;

    public b(float f8, float f9, float f10, float f11) {
        this.f1761a = f8;
        this.f1762b = f9;
        this.f1763c = f10;
        this.f1764d = f11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Float.floatToIntBits(this.f1761a) == Float.floatToIntBits(bVar.f1761a) && Float.floatToIntBits(this.f1762b) == Float.floatToIntBits(bVar.f1762b) && Float.floatToIntBits(this.f1763c) == Float.floatToIntBits(bVar.f1763c) && Float.floatToIntBits(this.f1764d) == Float.floatToIntBits(bVar.f1764d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f1761a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f1762b)) * 1000003) ^ Float.floatToIntBits(this.f1763c)) * 1000003) ^ Float.floatToIntBits(this.f1764d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f1761a + ", maxZoomRatio=" + this.f1762b + ", minZoomRatio=" + this.f1763c + ", linearZoom=" + this.f1764d + "}";
    }
}
