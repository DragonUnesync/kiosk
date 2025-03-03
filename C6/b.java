package C6;

public final class b extends RuntimeException {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f710U;

    public /* synthetic */ b(int i) {
        this.f710U = i;
    }

    public String getMessage() {
        switch (this.f710U) {
            case 7:
                return "Chain of Causes for CompositeException In Order Received =>";
            default:
                return super.getMessage();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.f710U = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Throwable th) {
        super(str, th);
        this.f710U = 5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Throwable th, int i) {
        super(th);
        this.f710U = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str.toString());
        this.f710U = 8;
    }
}
