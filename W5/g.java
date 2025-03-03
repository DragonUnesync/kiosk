package W5;

import V5.f;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;

public abstract class g {
    public static ProtocolFamily convert(f fVar) {
        int i = f.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily[fVar.ordinal()];
        if (i == 1) {
            return StandardProtocolFamily.INET;
        }
        if (i == 2) {
            return StandardProtocolFamily.INET6;
        }
        throw new IllegalArgumentException();
    }
}
