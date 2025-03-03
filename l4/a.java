package L4;

import u5.C1496c;

public enum a implements C1496c {
    SUCCESS(0),
    NO_MATCHING_SUBSCRIBERS(16),
    UNSPECIFIED_ERROR(128),
    IMPLEMENTATION_SPECIFIC_ERROR(131),
    NOT_AUTHORIZED(135),
    TOPIC_NAME_INVALID(144),
    PACKET_IDENTIFIER_IN_USE(145),
    PACKET_IDENTIFIER_NOT_FOUND(146),
    QUOTA_EXCEEDED(151),
    PAYLOAD_FORMAT_INVALID(153);
    

    /* renamed from: U  reason: collision with root package name */
    public final int f2706U;

    /* access modifiers changed from: public */
    a(int i) {
        this.f2706U = i;
    }

    public final int b() {
        return this.f2706U;
    }
}
