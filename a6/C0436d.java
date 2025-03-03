package a6;

import X5.C0361l;

/* renamed from: a6.d  reason: case insensitive filesystem */
public final class C0436d extends C0361l {
    private final C0429C closeStatus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0436d(C0429C c8, String str, Throwable th) {
        super(str == null ? c8.reasonText() : str, th);
        this.closeStatus = c8;
    }

    public C0429C closeStatus() {
        return this.closeStatus;
    }

    public C0436d(C0429C c8, String str) {
        this(c8, str, (Throwable) null);
    }
}
