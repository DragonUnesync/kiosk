package v5;

import u5.C1496c;

/* renamed from: v5.a  reason: case insensitive filesystem */
public enum C1561a implements C1496c {
    SUCCESS(0),
    CONTINUE_AUTHENTICATION(24),
    REAUTHENTICATE(25);
    

    /* renamed from: U  reason: collision with root package name */
    public final int f16087U;

    /* access modifiers changed from: public */
    C1561a(int i) {
        this.f16087U = i;
    }

    public final int b() {
        return this.f16087U;
    }
}
