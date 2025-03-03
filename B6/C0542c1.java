package b6;

import g6.B;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: b6.c1  reason: case insensitive filesystem */
public final class C0542c1 {
    private static final Map.Entry[] EMPTY_ENTRIES = new Map.Entry[0];
    private C0558i cipherFilter = C0576q.INSTANCE;
    private Iterable<String> ciphers;
    private C0561j clientAuth = C0561j.NONE;
    private boolean enableOcsp;
    private final boolean forServer;
    private PrivateKey key;
    private X509Certificate[] keyCertChain;
    private KeyManagerFactory keyManagerFactory;
    private String keyPassword;
    private String keyStoreType = KeyStore.getDefaultType();
    private final Map<C0548e1, Object> options = new HashMap();
    private String[] protocols;
    private G1 provider;
    private long sessionCacheSize;
    private long sessionTimeout;
    private Provider sslContextProvider;
    private boolean startTls;
    private X509Certificate[] trustCertCollection;
    private TrustManagerFactory trustManagerFactory;

    private C0542c1(boolean z) {
        this.forServer = z;
    }

    public static C0542c1 forClient() {
        return new C0542c1(false);
    }

    private static <T> T[] toArray(Iterable<? extends T> iterable, T[] tArr) {
        if (iterable == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList.toArray(tArr);
    }

    public C0539b1 build() {
        if (this.forServer) {
            return C0539b1.newServerContextInternal(this.provider, this.sslContextProvider, this.trustCertCollection, this.trustManagerFactory, this.keyCertChain, this.key, this.keyPassword, this.keyManagerFactory, this.ciphers, this.cipherFilter, (C0543d) null, this.sessionCacheSize, this.sessionTimeout, this.clientAuth, this.protocols, this.startTls, this.enableOcsp, this.keyStoreType, (Map.Entry[]) toArray(this.options.entrySet(), EMPTY_ENTRIES));
        }
        return C0539b1.newClientContextInternal(this.provider, this.sslContextProvider, this.trustCertCollection, this.trustManagerFactory, this.keyCertChain, this.key, this.keyPassword, this.keyManagerFactory, this.ciphers, this.cipherFilter, (C0543d) null, this.protocols, this.sessionCacheSize, this.sessionTimeout, this.enableOcsp, this.keyStoreType, (Map.Entry[]) toArray(this.options.entrySet(), EMPTY_ENTRIES));
    }

    public C0542c1 ciphers(Iterable<String> iterable, C0558i iVar) {
        this.cipherFilter = (C0558i) B.checkNotNull(iVar, "cipherFilter");
        this.ciphers = iterable;
        return this;
    }

    public C0542c1 keyManager(KeyManagerFactory keyManagerFactory2) {
        if (this.forServer) {
            B.checkNotNull(keyManagerFactory2, "keyManagerFactory required for servers");
        }
        this.keyCertChain = null;
        this.key = null;
        this.keyPassword = null;
        this.keyManagerFactory = keyManagerFactory2;
        return this;
    }

    public C0542c1 protocols(String... strArr) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) strArr.clone();
        }
        this.protocols = strArr2;
        return this;
    }

    public C0542c1 trustManager(TrustManagerFactory trustManagerFactory2) {
        this.trustCertCollection = null;
        this.trustManagerFactory = trustManagerFactory2;
        return this;
    }
}
