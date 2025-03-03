package T5;

import e6.C0842a;
import e6.C0854m;
import g6.B;

/* renamed from: T5.i0  reason: case insensitive filesystem */
public class C0251i0 extends C0842a {
    public static final C0251i0 ALLOCATOR = valueOf("ALLOCATOR");
    public static final C0251i0 ALLOW_HALF_CLOSURE = valueOf("ALLOW_HALF_CLOSURE");
    public static final C0251i0 AUTO_CLOSE = valueOf("AUTO_CLOSE");
    public static final C0251i0 AUTO_READ = valueOf("AUTO_READ");
    public static final C0251i0 CONNECT_TIMEOUT_MILLIS = valueOf("CONNECT_TIMEOUT_MILLIS");
    @Deprecated
    public static final C0251i0 DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION = valueOf("DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION");
    public static final C0251i0 IP_MULTICAST_ADDR = valueOf("IP_MULTICAST_ADDR");
    public static final C0251i0 IP_MULTICAST_IF = valueOf("IP_MULTICAST_IF");
    public static final C0251i0 IP_MULTICAST_LOOP_DISABLED = valueOf("IP_MULTICAST_LOOP_DISABLED");
    public static final C0251i0 IP_MULTICAST_TTL = valueOf("IP_MULTICAST_TTL");
    public static final C0251i0 IP_TOS = valueOf("IP_TOS");
    @Deprecated
    public static final C0251i0 MAX_MESSAGES_PER_READ = valueOf("MAX_MESSAGES_PER_READ");
    public static final C0251i0 MAX_MESSAGES_PER_WRITE = valueOf("MAX_MESSAGES_PER_WRITE");
    public static final C0251i0 MESSAGE_SIZE_ESTIMATOR = valueOf("MESSAGE_SIZE_ESTIMATOR");
    public static final C0251i0 RCVBUF_ALLOCATOR = valueOf("RCVBUF_ALLOCATOR");
    public static final C0251i0 SINGLE_EVENTEXECUTOR_PER_GROUP = valueOf("SINGLE_EVENTEXECUTOR_PER_GROUP");
    public static final C0251i0 SO_BACKLOG = valueOf("SO_BACKLOG");
    public static final C0251i0 SO_BROADCAST = valueOf("SO_BROADCAST");
    public static final C0251i0 SO_KEEPALIVE = valueOf("SO_KEEPALIVE");
    public static final C0251i0 SO_LINGER = valueOf("SO_LINGER");
    public static final C0251i0 SO_RCVBUF = valueOf("SO_RCVBUF");
    public static final C0251i0 SO_REUSEADDR = valueOf("SO_REUSEADDR");
    public static final C0251i0 SO_SNDBUF = valueOf("SO_SNDBUF");
    public static final C0251i0 SO_TIMEOUT = valueOf("SO_TIMEOUT");
    public static final C0251i0 TCP_FASTOPEN = valueOf(C0251i0.class, "TCP_FASTOPEN");
    public static final C0251i0 TCP_FASTOPEN_CONNECT = valueOf("TCP_FASTOPEN_CONNECT");
    public static final C0251i0 TCP_NODELAY = valueOf("TCP_NODELAY");
    @Deprecated
    public static final C0251i0 WRITE_BUFFER_HIGH_WATER_MARK = valueOf("WRITE_BUFFER_HIGH_WATER_MARK");
    @Deprecated
    public static final C0251i0 WRITE_BUFFER_LOW_WATER_MARK = valueOf("WRITE_BUFFER_LOW_WATER_MARK");
    public static final C0251i0 WRITE_BUFFER_WATER_MARK = valueOf("WRITE_BUFFER_WATER_MARK");
    public static final C0251i0 WRITE_SPIN_COUNT = valueOf("WRITE_SPIN_COUNT");
    private static final C0854m pool = new C0249h0();

    public /* synthetic */ C0251i0(int i, String str, C0249h0 h0Var) {
        this(i, str);
    }

    public static <T> C0251i0 valueOf(String str) {
        return (C0251i0) pool.valueOf(str);
    }

    public void validate(Object obj) {
        B.checkNotNull(obj, "value");
    }

    private C0251i0(int i, String str) {
        super(i, str);
    }

    public static <T> C0251i0 valueOf(Class<?> cls, String str) {
        return (C0251i0) pool.valueOf(cls, str);
    }
}
