package x5;

import java.util.EnumSet;
import u5.C1496c;

/* renamed from: x5.b  reason: case insensitive filesystem */
public enum C1607b implements C1496c {
    NORMAL_DISCONNECTION(0),
    DISCONNECT_WITH_WILL_MESSAGE(4),
    UNSPECIFIED_ERROR(128),
    MALFORMED_PACKET(129),
    PROTOCOL_ERROR(130),
    IMPLEMENTATION_SPECIFIC_ERROR(131),
    NOT_AUTHORIZED(135),
    BAD_AUTHENTICATION_METHOD(140),
    TOPIC_NAME_INVALID(144),
    RECEIVE_MAXIMUM_EXCEEDED(147),
    TOPIC_ALIAS_INVALID(148),
    PACKET_TOO_LARGE(149),
    MESSAGE_RATE_TOO_HIGH(150),
    QUOTA_EXCEEDED(151),
    ADMINISTRATIVE_ACTION(152),
    PAYLOAD_FORMAT_INVALID(153);
    

    /* renamed from: l0  reason: collision with root package name */
    public static final int f16315l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C1607b[] f16316m0 = null;

    /* renamed from: U  reason: collision with root package name */
    public final int f16318U;

    static {
        f16315l0 = 128;
        f16316m0 = new C1607b[(163 - 128)];
        for (C1607b bVar : values()) {
            if (!(bVar == NORMAL_DISCONNECTION || bVar == DISCONNECT_WITH_WILL_MESSAGE)) {
                f16316m0[bVar.f16318U - f16315l0] = bVar;
            }
        }
        C1607b bVar2 = NORMAL_DISCONNECTION;
        C1607b bVar3 = MALFORMED_PACKET;
        C1607b bVar4 = PROTOCOL_ERROR;
        C1607b bVar5 = BAD_AUTHENTICATION_METHOD;
        C1607b bVar6 = RECEIVE_MAXIMUM_EXCEEDED;
        C1607b bVar7 = TOPIC_ALIAS_INVALID;
        C1607b bVar8 = PACKET_TOO_LARGE;
        EnumSet.copyOf(EnumSet.of(bVar2, new C1607b[]{DISCONNECT_WITH_WILL_MESSAGE, UNSPECIFIED_ERROR, bVar3, bVar4, IMPLEMENTATION_SPECIFIC_ERROR, bVar5, TOPIC_NAME_INVALID, bVar6, bVar7, bVar8, MESSAGE_RATE_TOO_HIGH, QUOTA_EXCEEDED, ADMINISTRATIVE_ACTION, PAYLOAD_FORMAT_INVALID})).removeAll(EnumSet.of(bVar3, new C1607b[]{bVar4, bVar5, bVar6, bVar7, bVar8}));
    }

    /* access modifiers changed from: public */
    C1607b(int i) {
        this.f16318U = i;
    }

    public final int b() {
        return this.f16318U;
    }
}
