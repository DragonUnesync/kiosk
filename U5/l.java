package U5;

import g6.Y;
import java.security.PrivilegedAction;

public final class l implements PrivilegedAction {
    final /* synthetic */ p this$0;

    public l(p pVar) {
        this.this$0 = pVar;
    }

    public Object run() {
        try {
            return Class.forName("sun.nio.ch.SelectorImpl", false, Y.getSystemClassLoader());
        } catch (Throwable th) {
            return th;
        }
    }
}
