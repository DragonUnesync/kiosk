package w5;

import u5.C1496c;

/* renamed from: w5.a  reason: case insensitive filesystem */
public enum C1591a implements C1496c {
    SUCCESS(0),
    UNSUPPORTED_PROTOCOL_VERSION(132),
    CLIENT_IDENTIFIER_NOT_VALID(133),
    BAD_USER_NAME_OR_PASSWORD(134),
    NOT_AUTHORIZED(135),
    SERVER_UNAVAILABLE(136);
    

    /* renamed from: b0  reason: collision with root package name */
    public static final C1591a[] f16219b0 = null;

    /* renamed from: U  reason: collision with root package name */
    public final int f16221U;

    static {
        f16219b0 = new C1591a[32];
        for (C1591a aVar : values()) {
            if (aVar != SUCCESS) {
                f16219b0[aVar.f16221U - 128] = aVar;
            }
        }
    }

    /* access modifiers changed from: public */
    C1591a(int i) {
        this.f16221U = i;
    }

    public final int b() {
        return this.f16221U;
    }
}
