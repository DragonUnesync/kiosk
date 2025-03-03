package b6;

import g6.B;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Collections;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;

/* renamed from: b6.j0  reason: case insensitive filesystem */
public final class C0562j0 extends KeyManagerFactorySpi {
    final KeyManagerFactory kmf;
    private volatile C0559i0 providerFactory;

    public C0562j0(KeyManagerFactory keyManagerFactory) {
        this.kmf = (KeyManagerFactory) B.checkNotNull(keyManagerFactory, "kmf");
    }

    private static String password(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        return new String(cArr);
    }

    public KeyManager[] engineGetKeyManagers() {
        C0559i0 i0Var = this.providerFactory;
        if (i0Var != null) {
            return new KeyManager[]{i0Var.keyManager};
        }
        throw new IllegalStateException("engineInit(...) not called yet");
    }

    public synchronized void engineInit(KeyStore keyStore, char[] cArr) {
        if (this.providerFactory != null) {
            throw new KeyStoreException("Already initialized");
        } else if (keyStore.aliases().hasMoreElements()) {
            this.kmf.init(keyStore, cArr);
            this.providerFactory = new C0559i0(F0.chooseX509KeyManager(this.kmf.getKeyManagers()), password(cArr), Collections.list(keyStore.aliases()));
        } else {
            throw new KeyStoreException("No aliases found");
        }
    }

    public V newProvider() {
        C0559i0 i0Var = this.providerFactory;
        if (i0Var != null) {
            return i0Var.newProvider();
        }
        throw new IllegalStateException("engineInit(...) not called yet");
    }

    public void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        throw new InvalidAlgorithmParameterException("Not supported");
    }
}
