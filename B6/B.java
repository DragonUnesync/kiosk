package b6;

import j$.util.DesugarCollections;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;

public final class B {
    List<String> defaultCiphers;
    List<String> defaultCiphersNonTLSv13;
    String[] defaultProtocols;
    Provider defaultProvider;
    Set<String> supportedCiphers;
    Set<String> supportedCiphersNonTLSv13;

    private B() {
    }

    public void init() {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
            this.defaultProvider = instance.getProvider();
            SSLEngine createSSLEngine = instance.createSSLEngine();
            this.defaultProtocols = C.defaultProtocols(instance, createSSLEngine);
            Set<String> unmodifiableSet = DesugarCollections.unmodifiableSet(C.supportedCiphers(createSSLEngine));
            this.supportedCiphers = unmodifiableSet;
            this.defaultCiphers = DesugarCollections.unmodifiableList(C.defaultCiphers(createSSLEngine, unmodifiableSet));
            ArrayList arrayList = new ArrayList(this.defaultCiphers);
            String[] strArr = H1.DEFAULT_TLSV13_CIPHER_SUITES;
            arrayList.removeAll(Arrays.asList(strArr));
            this.defaultCiphersNonTLSv13 = DesugarCollections.unmodifiableList(arrayList);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.supportedCiphers);
            linkedHashSet.removeAll(Arrays.asList(strArr));
            this.supportedCiphersNonTLSv13 = DesugarCollections.unmodifiableSet(linkedHashSet);
        } catch (Exception e) {
            throw new Error("failed to initialize the default SSL context", e);
        }
    }

    public /* synthetic */ B(C0533A a8) {
        this();
    }
}
