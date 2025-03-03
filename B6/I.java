package b6;

import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;

public final class I extends KeyManagerFactorySpi {
    final /* synthetic */ KeyManagerFactory val$factory;

    public I(KeyManagerFactory keyManagerFactory) {
        this.val$factory = keyManagerFactory;
    }

    public KeyManager[] engineGetKeyManagers() {
        return this.val$factory.getKeyManagers();
    }

    public void engineInit(KeyStore keyStore, char[] cArr) {
        this.val$factory.init(keyStore, cArr);
    }

    public void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        this.val$factory.init(managerFactoryParameters);
    }
}
