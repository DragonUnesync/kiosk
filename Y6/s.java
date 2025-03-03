package Y6;

public enum s {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: U  reason: collision with root package name */
    public final String f6727U;

    /* access modifiers changed from: public */
    s(String str) {
        this.f6727U = str;
    }

    public final String toString() {
        return this.f6727U;
    }
}
