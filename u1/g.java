package U1;

public final class g implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public final int f5404U;

    /* renamed from: V  reason: collision with root package name */
    public final c f5405V;

    public g(int i, c cVar) {
        this.f5404U = i;
        this.f5405V = cVar;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.f5404U, ((g) obj).f5404U);
    }
}
