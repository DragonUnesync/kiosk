package T5;

import g6.x0;
import java.nio.channels.ClosedChannelException;

public final class s1 extends ClosedChannelException {
    private s1() {
    }

    public static s1 newInstance(Class<?> cls, String str) {
        return (s1) x0.unknownStackTrace(new s1(), cls, str);
    }

    public Throwable fillInStackTrace() {
        return this;
    }
}
