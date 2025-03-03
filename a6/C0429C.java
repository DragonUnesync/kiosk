package a6;

import Q0.g;
import g6.B;

/* renamed from: a6.C  reason: case insensitive filesystem */
public final class C0429C implements Comparable {
    public static final C0429C ABNORMAL_CLOSURE = new C0429C(1006, "Abnormal closure", false);
    public static final C0429C BAD_GATEWAY = new C0429C(1014, "Bad Gateway");
    public static final C0429C EMPTY = new C0429C(1005, "Empty", false);
    public static final C0429C ENDPOINT_UNAVAILABLE = new C0429C(1001, "Endpoint unavailable");
    public static final C0429C INTERNAL_SERVER_ERROR = new C0429C(1011, "Internal server error");
    public static final C0429C INVALID_MESSAGE_TYPE = new C0429C(1003, "Invalid message type");
    public static final C0429C INVALID_PAYLOAD_DATA = new C0429C(1007, "Invalid payload data");
    public static final C0429C MANDATORY_EXTENSION = new C0429C(1010, "Mandatory extension");
    public static final C0429C MESSAGE_TOO_BIG = new C0429C(1009, "Message too big");
    public static final C0429C NORMAL_CLOSURE = new C0429C(1000, "Bye");
    public static final C0429C POLICY_VIOLATION = new C0429C(1008, "Policy violation");
    public static final C0429C PROTOCOL_ERROR = new C0429C(1002, "Protocol error");
    public static final C0429C SERVICE_RESTART = new C0429C(1012, "Service Restart");
    public static final C0429C TLS_HANDSHAKE_FAILED = new C0429C(1015, "TLS handshake failed", false);
    public static final C0429C TRY_AGAIN_LATER = new C0429C(1013, "Try Again Later");
    private final String reasonText;
    private final int statusCode;
    private String text;

    public C0429C(int i, String str) {
        this(i, str, true);
    }

    public static boolean isValidStatusCode(int i) {
        if (i < 0 || ((1000 <= i && i <= 1003) || ((1007 <= i && i <= 1014) || 3000 <= i))) {
            return true;
        }
        return false;
    }

    public int code() {
        return this.statusCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0429C.class == obj.getClass() && this.statusCode == ((C0429C) obj).statusCode) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.statusCode;
    }

    public String reasonText() {
        return this.reasonText;
    }

    public String toString() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        String str2 = code() + " " + reasonText();
        this.text = str2;
        return str2;
    }

    public C0429C(int i, String str, boolean z) {
        if (!z || isValidStatusCode(i)) {
            this.statusCode = i;
            this.reasonText = (String) B.checkNotNull(str, "reasonText");
            return;
        }
        throw new IllegalArgumentException(g.m(i, "WebSocket close status code does NOT comply with RFC-6455: "));
    }

    public int compareTo(C0429C c8) {
        return code() - c8.code();
    }
}
