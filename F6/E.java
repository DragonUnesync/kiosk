package f6;

import java.security.PrivilegedAction;

public final class E implements PrivilegedAction {
    final /* synthetic */ G this$0;
    final /* synthetic */ Thread val$t;

    public E(G g8, Thread thread) {
        this.this$0 = g8;
        this.val$t = thread;
    }

    public Void run() {
        this.val$t.setContextClassLoader((ClassLoader) null);
        return null;
    }
}
