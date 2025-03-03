package o4;

import x5.C1607b;

/* renamed from: o4.c  reason: case insensitive filesystem */
public final class C1320c extends Exception {

    /* renamed from: U  reason: collision with root package name */
    public final C1607b f14272U;

    public C1320c(C1607b bVar, String str) {
        super(str, (Throwable) null, false, false);
        this.f14272U = bVar;
    }

    public C1320c(String str) {
        this(C1607b.MALFORMED_PACKET, str);
    }
}
