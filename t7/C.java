package T7;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5076a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5077b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5078c;

    public /* synthetic */ C(int i, String str, String str2) {
        this.f5076a = i;
        this.f5077b = str;
        this.f5078c = str2;
    }

    public String toString() {
        switch (this.f5076a) {
            case 0:
                return "<" + this.f5077b + ">: " + this.f5078c;
            case 1:
                return this.f5077b + ", " + this.f5078c;
            default:
                return super.toString();
        }
    }

    public C(C0285a aVar, String str) {
        this.f5076a = 0;
        aVar.getClass();
        this.f5077b = aVar.w();
        this.f5078c = str;
    }

    public C(C0285a aVar, String str, Object[] objArr) {
        this.f5076a = 0;
        aVar.getClass();
        this.f5077b = aVar.w();
        this.f5078c = String.format(str, objArr);
    }
}
