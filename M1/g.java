package M1;

public final class g implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public final long f3075U;

    /* renamed from: V  reason: collision with root package name */
    public final byte[] f3076V;

    public g(long j7, byte[] bArr) {
        this.f3075U = j7;
        this.f3076V = bArr;
    }

    public final int compareTo(Object obj) {
        return Long.compare(this.f3075U, ((g) obj).f3075U);
    }
}
