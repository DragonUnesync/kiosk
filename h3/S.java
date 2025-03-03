package H3;

public final class S {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2029a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2030b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2031c;

    public S(Object obj, Object obj2, Object obj3) {
        this.f2029a = obj;
        this.f2030b = obj2;
        this.f2031c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f2029a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f2030b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f2031c);
        return new IllegalArgumentException(sb.toString());
    }
}
