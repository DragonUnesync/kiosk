package P5;

import java.io.IOException;

public final class L extends Exception {

    /* renamed from: U  reason: collision with root package name */
    public final J f3846U;

    public L(J j7, String str) {
        super(str);
        this.f3846U = j7;
    }

    public final J a() {
        return this.f3846U;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public L(String str, IOException iOException) {
        super(str, iOException);
        J j7 = J.INTERNAL_ERROR;
        this.f3846U = j7;
    }
}
