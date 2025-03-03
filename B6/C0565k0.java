package b6;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.net.ssl.KeyManagerFactory;

/* renamed from: b6.k0  reason: case insensitive filesystem */
public final class C0565k0 extends KeyManagerFactory {
    private final C0562j0 spi;

    public C0565k0() {
        this(newOpenSslKeyManagerFactorySpi((Provider) null));
    }

    private static C0562j0 newOpenSslKeyManagerFactorySpi(Provider provider) {
        try {
            return newOpenSslKeyManagerFactorySpi((String) null, provider);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public V newProvider() {
        return this.spi.newProvider();
    }

    private C0565k0(C0562j0 j0Var) {
        super(j0Var, j0Var.kmf.getProvider(), j0Var.kmf.getAlgorithm());
        this.spi = j0Var;
    }

    private static C0562j0 newOpenSslKeyManagerFactorySpi(String str, Provider provider) {
        KeyManagerFactory keyManagerFactory;
        if (str == null) {
            str = KeyManagerFactory.getDefaultAlgorithm();
        }
        if (provider == null) {
            keyManagerFactory = KeyManagerFactory.getInstance(str);
        } else {
            keyManagerFactory = KeyManagerFactory.getInstance(str, provider);
        }
        return new C0562j0(keyManagerFactory);
    }
}
