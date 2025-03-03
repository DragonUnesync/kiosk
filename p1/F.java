package p1;

import java.util.Arrays;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final int f14327a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14328b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14329c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14330d;

    public F(int i, int i8, int i9, byte[] bArr) {
        this.f14327a = i;
        this.f14328b = bArr;
        this.f14329c = i8;
        this.f14330d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f8 = (F) obj;
        if (this.f14327a == f8.f14327a && this.f14329c == f8.f14329c && this.f14330d == f8.f14330d && Arrays.equals(this.f14328b, f8.f14328b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f14328b) + (this.f14327a * 31)) * 31) + this.f14329c) * 31) + this.f14330d;
    }
}
