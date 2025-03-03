package b6;

import java.security.Provider;

public enum G1 {
    JDK,
    OPENSSL,
    OPENSSL_REFCNT;

    public static boolean isTlsv13Supported(G1 g12) {
        return isTlsv13Supported(g12, (Provider) null);
    }

    public static boolean isTlsv13Supported(G1 g12, Provider provider) {
        int i = F1.$SwitchMap$io$netty$handler$ssl$SslProvider[g12.ordinal()];
        if (i == 1) {
            return H1.isTLSv13SupportedByJDK(provider);
        }
        if (i == 2 || i == 3) {
            return F.isTlsv13Supported();
        }
        throw new Error("Unknown SslProvider: " + g12);
    }
}
