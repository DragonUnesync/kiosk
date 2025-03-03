package m0;

import android.graphics.Insets;

/* renamed from: m0.c  reason: case insensitive filesystem */
public final class C1197c {
    public static final C1197c e = new C1197c(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f13316a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13317b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13318c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13319d;

    public C1197c(int i, int i8, int i9, int i10) {
        this.f13316a = i;
        this.f13317b = i8;
        this.f13318c = i9;
        this.f13319d = i10;
    }

    public static C1197c a(C1197c cVar, C1197c cVar2) {
        return b(Math.max(cVar.f13316a, cVar2.f13316a), Math.max(cVar.f13317b, cVar2.f13317b), Math.max(cVar.f13318c, cVar2.f13318c), Math.max(cVar.f13319d, cVar2.f13319d));
    }

    public static C1197c b(int i, int i8, int i9, int i10) {
        if (i == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return e;
        }
        return new C1197c(i, i8, i9, i10);
    }

    public static C1197c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return C1196b.a(this.f13316a, this.f13317b, this.f13318c, this.f13319d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1197c.class != obj.getClass()) {
            return false;
        }
        C1197c cVar = (C1197c) obj;
        if (this.f13319d == cVar.f13319d && this.f13316a == cVar.f13316a && this.f13318c == cVar.f13318c && this.f13317b == cVar.f13317b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f13316a * 31) + this.f13317b) * 31) + this.f13318c) * 31) + this.f13319d;
    }

    public final String toString() {
        return "Insets{left=" + this.f13316a + ", top=" + this.f13317b + ", right=" + this.f13318c + ", bottom=" + this.f13319d + '}';
    }
}
