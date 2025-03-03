package R0;

import F.h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class t extends i {

    /* renamed from: W  reason: collision with root package name */
    public final int f4312W;

    public t() {
        super(2008);
        this.f4312W = 1;
    }

    public static int a(int i, int i8) {
        if (i == 2000 && i8 == 1) {
            return 2001;
        }
        return i;
    }

    public static t b(int i, IOException iOException) {
        int i8;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i8 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i8 = 1004;
        } else if (message == null || !h.E(message).matches("cleartext.*not permitted.*")) {
            i8 = 2001;
        } else {
            i8 = 2007;
        }
        if (i8 == 2007) {
            return new t(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted");
        }
        return new t(i8, i, iOException);
    }

    public t(int i, int i8, IOException iOException) {
        super(iOException, a(i, i8));
        this.f4312W = i8;
    }

    public t(int i, IOException iOException, String str) {
        super(str, iOException, a(i, 1));
        this.f4312W = 1;
    }
}
