package p2;

import java.util.Arrays;

/* renamed from: p2.c  reason: case insensitive filesystem */
public final class C1341c implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public final int f14455U;

    /* renamed from: V  reason: collision with root package name */
    public final int f14456V;

    /* renamed from: W  reason: collision with root package name */
    public final C1340b f14457W;

    public C1341c(int i, int i8, C1340b bVar) {
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        } else if (i8 <= i) {
            throw new IllegalArgumentException("end <= start");
        } else if (!bVar.f16382U) {
            this.f14455U = i;
            this.f14456V = i8;
            this.f14457W = bVar;
        } else {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
    }

    /* renamed from: a */
    public final int compareTo(C1341c cVar) {
        int i = cVar.f14455U;
        int i8 = this.f14455U;
        if (i8 < i) {
            return -1;
        }
        if (i8 > i) {
            return 1;
        }
        int i9 = this.f14456V;
        int i10 = cVar.f14456V;
        if (i9 < i10) {
            return -1;
        }
        if (i9 > i10) {
            return 1;
        }
        return this.f14457W.compareTo(cVar.f14457W);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1341c) || compareTo((C1341c) obj) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14457W.f16371V) + (((this.f14455U * 31) + this.f14456V) * 31);
    }
}
