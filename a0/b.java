package a0;

public final class b extends Throwable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6990U;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.f6990U = i;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    public final synchronized Throwable fillInStackTrace() {
        switch (this.f6990U) {
            case 0:
                a();
                return this;
            default:
                b();
                return this;
        }
    }
}
