package b4;

import M3.n;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f8671a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f8672b;

    /* renamed from: c  reason: collision with root package name */
    public final n[] f8673c;

    public c(int i, int i8, int i9, int i10, int[] iArr) {
        this.f8671a = i;
        this.f8672b = iArr;
        float f8 = (float) i10;
        this.f8673c = new n[]{new n((float) i8, f8), new n((float) i9, f8)};
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && this.f8671a == ((c) obj).f8671a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8671a;
    }
}
