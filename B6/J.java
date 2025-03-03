package b6;

import g6.B;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.X509KeyManager;

public final class J extends KeyManagerFactory {
    private final int maxCachedEntries;

    public J(KeyManagerFactory keyManagerFactory) {
        this(keyManagerFactory, 1024);
    }

    public V newProvider(String str) {
        X509KeyManager chooseX509KeyManager = F0.chooseX509KeyManager(getKeyManagers());
        if ("sun.security.ssl.X509KeyManagerImpl".equals(chooseX509KeyManager.getClass().getName())) {
            return new V(chooseX509KeyManager, str);
        }
        return new H(F0.chooseX509KeyManager(getKeyManagers()), str, this.maxCachedEntries);
    }

    public J(KeyManagerFactory keyManagerFactory, int i) {
        super(new I(keyManagerFactory), keyManagerFactory.getProvider(), keyManagerFactory.getAlgorithm());
        this.maxCachedEntries = B.checkPositive(i, "maxCachedEntries");
    }
}
