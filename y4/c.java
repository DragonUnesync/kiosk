package y4;

import G5.s;
import M4.a;
import T5.C0245f0;
import T5.Y;
import t5.C1429a;
import x5.C1607b;

public final class c extends C0245f0 implements C1634a {
    public final void channelRead(Y y8, Object obj) {
        if (obj instanceof a) {
            s.k(y8.channel(), C1607b.PROTOCOL_ERROR, new C1429a((a) obj, "Server must not send AUTH", 0));
        } else if (obj instanceof P4.a) {
            P4.a aVar = (P4.a) obj;
            if (aVar.f3783j != null) {
                s.k(y8.channel(), C1607b.PROTOCOL_ERROR, new C1429a(aVar, "Server must not include auth in CONNACK", 1));
            } else {
                y8.fireChannelRead(aVar);
            }
        } else {
            y8.fireChannelRead(obj);
        }
    }

    public final boolean isSharable() {
        return true;
    }
}
