package Z5;

import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.restriction.PhoneRestrictionPolicy;
import e6.C0847f;
import e6.C0852k;
import g6.B;

public final class m0 implements Comparable {
    public static final m0 ACCEPTED = newStatus(202, "Accepted");
    public static final m0 BAD_GATEWAY = newStatus(502, "Bad Gateway");
    public static final m0 BAD_REQUEST = newStatus(400, "Bad Request");
    public static final m0 CONFLICT = newStatus(409, "Conflict");
    public static final m0 CONTINUE = newStatus(100, "Continue");
    public static final m0 CREATED = newStatus(201, "Created");
    public static final m0 EARLY_HINTS = newStatus(103, "Early Hints");
    public static final m0 EXPECTATION_FAILED = newStatus(417, "Expectation Failed");
    public static final m0 FAILED_DEPENDENCY = newStatus(424, "Failed Dependency");
    public static final m0 FORBIDDEN = newStatus(403, "Forbidden");
    public static final m0 FOUND = newStatus(302, "Found");
    public static final m0 GATEWAY_TIMEOUT = newStatus(504, "Gateway Timeout");
    public static final m0 GONE = newStatus(410, "Gone");
    public static final m0 HTTP_VERSION_NOT_SUPPORTED = newStatus(505, "HTTP Version Not Supported");
    public static final m0 INSUFFICIENT_STORAGE = newStatus(507, "Insufficient Storage");
    public static final m0 INTERNAL_SERVER_ERROR = newStatus(500, "Internal Server Error");
    public static final m0 LENGTH_REQUIRED = newStatus(411, "Length Required");
    public static final m0 LOCKED = newStatus(423, "Locked");
    public static final m0 METHOD_NOT_ALLOWED = newStatus(405, "Method Not Allowed");
    public static final m0 MISDIRECTED_REQUEST = newStatus(421, "Misdirected Request");
    public static final m0 MOVED_PERMANENTLY = newStatus(301, "Moved Permanently");
    public static final m0 MULTIPLE_CHOICES = newStatus(300, "Multiple Choices");
    public static final m0 MULTI_STATUS = newStatus(207, "Multi-Status");
    public static final m0 NETWORK_AUTHENTICATION_REQUIRED = newStatus(511, "Network Authentication Required");
    public static final m0 NON_AUTHORITATIVE_INFORMATION = newStatus(203, "Non-Authoritative Information");
    public static final m0 NOT_ACCEPTABLE = newStatus(406, "Not Acceptable");
    public static final m0 NOT_EXTENDED = newStatus(510, "Not Extended");
    public static final m0 NOT_FOUND = newStatus(404, "Not Found");
    public static final m0 NOT_IMPLEMENTED = newStatus(501, "Not Implemented");
    public static final m0 NOT_MODIFIED = newStatus(304, "Not Modified");
    public static final m0 NO_CONTENT = newStatus(204, "No Content");
    public static final m0 OK = newStatus(200, "OK");
    public static final m0 PARTIAL_CONTENT = newStatus(206, "Partial Content");
    public static final m0 PAYMENT_REQUIRED = newStatus(402, "Payment Required");
    public static final m0 PERMANENT_REDIRECT = newStatus(308, "Permanent Redirect");
    public static final m0 PRECONDITION_FAILED = newStatus(412, "Precondition Failed");
    public static final m0 PRECONDITION_REQUIRED = newStatus(428, "Precondition Required");
    public static final m0 PROCESSING = newStatus(102, "Processing");
    public static final m0 PROXY_AUTHENTICATION_REQUIRED = newStatus(407, "Proxy Authentication Required");
    public static final m0 REQUESTED_RANGE_NOT_SATISFIABLE = newStatus(416, "Requested Range Not Satisfiable");
    public static final m0 REQUEST_ENTITY_TOO_LARGE = newStatus(413, "Request Entity Too Large");
    public static final m0 REQUEST_HEADER_FIELDS_TOO_LARGE = newStatus(431, "Request Header Fields Too Large");
    public static final m0 REQUEST_TIMEOUT = newStatus(408, "Request Timeout");
    public static final m0 REQUEST_URI_TOO_LONG = newStatus(414, "Request-URI Too Long");
    public static final m0 RESET_CONTENT = newStatus(205, "Reset Content");
    public static final m0 SEE_OTHER = newStatus(303, "See Other");
    public static final m0 SERVICE_UNAVAILABLE = newStatus(503, "Service Unavailable");
    public static final m0 SWITCHING_PROTOCOLS = newStatus(101, "Switching Protocols");
    public static final m0 TEMPORARY_REDIRECT = newStatus(307, "Temporary Redirect");
    public static final m0 TOO_MANY_REQUESTS = newStatus(429, "Too Many Requests");
    public static final m0 UNAUTHORIZED = newStatus(401, "Unauthorized");
    public static final m0 UNORDERED_COLLECTION = newStatus(425, "Unordered Collection");
    public static final m0 UNPROCESSABLE_ENTITY = newStatus(422, "Unprocessable Entity");
    public static final m0 UNSUPPORTED_MEDIA_TYPE = newStatus(415, "Unsupported Media Type");
    public static final m0 UPGRADE_REQUIRED = newStatus(426, "Upgrade Required");
    public static final m0 USE_PROXY = newStatus(305, "Use Proxy");
    public static final m0 VARIANT_ALSO_NEGOTIATES = newStatus(506, "Variant Also Negotiates");
    private final byte[] bytes;
    private final int code;
    private final C0847f codeAsText;
    private final p0 codeClass;
    private final String reasonPhrase;

    public m0(int i, String str) {
        this(i, str, false);
    }

    private static m0 newStatus(int i, String str) {
        return new m0(i, str, true);
    }

    public static m0 valueOf(int i, String str) {
        m0 valueOf0 = valueOf0(i);
        if (valueOf0 == null || !valueOf0.reasonPhrase().contentEquals(str)) {
            return new m0(i, str);
        }
        return valueOf0;
    }

    private static m0 valueOf0(int i) {
        if (i == 307) {
            return TEMPORARY_REDIRECT;
        }
        if (i == 308) {
            return PERMANENT_REDIRECT;
        }
        if (i == 428) {
            return PRECONDITION_REQUIRED;
        }
        if (i == 429) {
            return TOO_MANY_REQUESTS;
        }
        if (i == 431) {
            return REQUEST_HEADER_FIELDS_TOO_LARGE;
        }
        if (i == 510) {
            return NOT_EXTENDED;
        }
        if (i == 511) {
            return NETWORK_AUTHENTICATION_REQUIRED;
        }
        switch (i) {
            case PhoneRestrictionPolicy.ERROR_SIM_PIN_UNKNOWN /*100*/:
                return CONTINUE;
            case 101:
                return SWITCHING_PROTOCOLS;
            case 102:
                return PROCESSING;
            case 103:
                return EARLY_HINTS;
            default:
                switch (i) {
                    case 200:
                        return OK;
                    case 201:
                        return CREATED;
                    case 202:
                        return ACCEPTED;
                    case 203:
                        return NON_AUTHORITATIVE_INFORMATION;
                    case 204:
                        return NO_CONTENT;
                    case 205:
                        return RESET_CONTENT;
                    case 206:
                        return PARTIAL_CONTENT;
                    case 207:
                        return MULTI_STATUS;
                    default:
                        switch (i) {
                            case 300:
                                return MULTIPLE_CHOICES;
                            case 301:
                                return MOVED_PERMANENTLY;
                            case 302:
                                return FOUND;
                            case 303:
                                return SEE_OTHER;
                            case 304:
                                return NOT_MODIFIED;
                            case 305:
                                return USE_PROXY;
                            default:
                                switch (i) {
                                    case 400:
                                        return BAD_REQUEST;
                                    case 401:
                                        return UNAUTHORIZED;
                                    case 402:
                                        return PAYMENT_REQUIRED;
                                    case 403:
                                        return FORBIDDEN;
                                    case 404:
                                        return NOT_FOUND;
                                    case 405:
                                        return METHOD_NOT_ALLOWED;
                                    case 406:
                                        return NOT_ACCEPTABLE;
                                    case 407:
                                        return PROXY_AUTHENTICATION_REQUIRED;
                                    case 408:
                                        return REQUEST_TIMEOUT;
                                    case 409:
                                        return CONFLICT;
                                    case 410:
                                        return GONE;
                                    case 411:
                                        return LENGTH_REQUIRED;
                                    case 412:
                                        return PRECONDITION_FAILED;
                                    case 413:
                                        return REQUEST_ENTITY_TOO_LARGE;
                                    case 414:
                                        return REQUEST_URI_TOO_LONG;
                                    case 415:
                                        return UNSUPPORTED_MEDIA_TYPE;
                                    case 416:
                                        return REQUESTED_RANGE_NOT_SATISFIABLE;
                                    case 417:
                                        return EXPECTATION_FAILED;
                                    default:
                                        switch (i) {
                                            case 421:
                                                return MISDIRECTED_REQUEST;
                                            case 422:
                                                return UNPROCESSABLE_ENTITY;
                                            case 423:
                                                return LOCKED;
                                            case 424:
                                                return FAILED_DEPENDENCY;
                                            case 425:
                                                return UNORDERED_COLLECTION;
                                            case 426:
                                                return UPGRADE_REQUIRED;
                                            default:
                                                switch (i) {
                                                    case 500:
                                                        return INTERNAL_SERVER_ERROR;
                                                    case 501:
                                                        return NOT_IMPLEMENTED;
                                                    case 502:
                                                        return BAD_GATEWAY;
                                                    case 503:
                                                        return SERVICE_UNAVAILABLE;
                                                    case 504:
                                                        return GATEWAY_TIMEOUT;
                                                    case 505:
                                                        return HTTP_VERSION_NOT_SUPPORTED;
                                                    case 506:
                                                        return VARIANT_ALSO_NEGOTIATES;
                                                    case 507:
                                                        return INSUFFICIENT_STORAGE;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public int code() {
        return this.code;
    }

    public p0 codeClass() {
        return this.codeClass;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof m0) && code() == ((m0) obj).code()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return code();
    }

    public String reasonPhrase() {
        return this.reasonPhrase;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.reasonPhrase.length() + 4);
        sb.append(this.codeAsText);
        sb.append(' ');
        sb.append(this.reasonPhrase);
        return sb.toString();
    }

    private m0(int i, String str, boolean z) {
        B.checkPositiveOrZero(i, KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE);
        B.checkNotNull(str, "reasonPhrase");
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt == 10 || charAt == 13) {
                throw new IllegalArgumentException("reasonPhrase contains one of the following prohibited characters: \\r\\n: ".concat(str));
            }
        }
        this.code = i;
        this.codeClass = p0.valueOf(i);
        String num = Integer.toString(i);
        this.codeAsText = new C0847f(num);
        this.reasonPhrase = str;
        if (z) {
            this.bytes = (num + ' ' + str).getBytes(C0852k.US_ASCII);
            return;
        }
        this.bytes = null;
    }

    public int compareTo(m0 m0Var) {
        return code() - m0Var.code();
    }
}
