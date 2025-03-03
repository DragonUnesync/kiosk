package P5;

public enum J {
    OK("OK", 200),
    REDIRECT("Moved Permanently", 301),
    BAD_REQUEST("Bad Request", 400),
    FORBIDDEN("Forbidden", 403),
    NOT_FOUND("Not Found", 404),
    INTERNAL_ERROR("Internal Server Error", 500);
    

    /* renamed from: U  reason: collision with root package name */
    public final int f3834U;

    /* renamed from: V  reason: collision with root package name */
    public final String f3835V;

    /* access modifiers changed from: public */
    J(String str, int i) {
        this.f3834U = i;
        this.f3835V = str;
    }
}
