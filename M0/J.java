package M0;

import N.e;
import java.io.IOException;

public class J extends IOException {

    /* renamed from: U  reason: collision with root package name */
    public final boolean f2841U;

    /* renamed from: V  reason: collision with root package name */
    public final int f2842V;

    public J(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.f2841U = z;
        this.f2842V = i;
    }

    public static J a(RuntimeException runtimeException, String str) {
        return new J(str, runtimeException, true, 1);
    }

    public static J b(Exception exc, String str) {
        return new J(str, exc, true, 4);
    }

    public static J c(String str) {
        return new J(str, (Exception) null, false, 1);
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append(" {contentIsMalformed=");
        sb.append(this.f2841U);
        sb.append(", dataType=");
        return e.z(sb, this.f2842V, "}");
    }
}
