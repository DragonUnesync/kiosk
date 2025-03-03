package g6;

import O7.b;
import i6.C;
import i6.C1105A;
import j6.t;
import j6.v;
import java.security.AccessController;
import java.util.Queue;

public abstract class J {
    private static final boolean USE_MPSC_CHUNKED_ARRAY_QUEUE;

    static {
        Object obj;
        if (Y.hasUnsafe()) {
            obj = AccessController.doPrivileged(new I());
        } else {
            obj = null;
        }
        if (obj == null) {
            Y.logger.debug("org.jctools-core.MpscChunkedArrayQueue: unavailable");
            USE_MPSC_CHUNKED_ARRAY_QUEUE = false;
            return;
        }
        Y.logger.debug("org.jctools-core.MpscChunkedArrayQueue: available");
        USE_MPSC_CHUNKED_ARRAY_QUEUE = true;
    }

    public static <T> Queue<T> newChunkedMpscQueue(int i, int i8) {
        if (USE_MPSC_CHUNKED_ARRAY_QUEUE) {
            return new C1105A(i, i8);
        }
        return new t(i, i8);
    }

    public static <T> Queue<T> newMpscQueue(int i) {
        return newChunkedMpscQueue(1024, Math.max(Math.min(i, b.MAX_POW2), 2048));
    }

    public static <T> Queue<T> newMpscQueue() {
        return USE_MPSC_CHUNKED_ARRAY_QUEUE ? new C(1024) : new v(1024);
    }
}
