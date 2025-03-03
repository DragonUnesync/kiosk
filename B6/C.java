package b6;

import S5.C0187o;
import e6.I;
import g6.B;
import g6.C0978k;
import h6.C1082c;
import h6.d;
import j$.util.DesugarCollections;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSessionContext;

public abstract class C extends C0539b1 {
    private static final List<String> DEFAULT_CIPHERS;
    private static final List<String> DEFAULT_CIPHERS_NON_TLSV13;
    private static final String[] DEFAULT_PROTOCOLS;
    private static final Provider DEFAULT_PROVIDER;
    private static final Set<String> SUPPORTED_CIPHERS;
    private static final Set<String> SUPPORTED_CIPHERS_NON_TLSV13;
    private static final C1082c logger;
    private final C0587w apn;
    private final String[] cipherSuites;
    private final C0561j clientAuth;
    private final boolean isClient;
    private final String[] protocols;
    private final SSLContext sslContext;
    private final List<String> unmodifiableCipherSuites;

    static {
        C1082c instance = d.getInstance((Class<?>) C.class);
        logger = instance;
        B b8 = new B((C0533A) null);
        b8.init();
        DEFAULT_PROVIDER = b8.defaultProvider;
        String[] strArr = b8.defaultProtocols;
        DEFAULT_PROTOCOLS = strArr;
        SUPPORTED_CIPHERS = b8.supportedCiphers;
        List<String> list = b8.defaultCiphers;
        DEFAULT_CIPHERS = list;
        DEFAULT_CIPHERS_NON_TLSV13 = b8.defaultCiphersNonTLSv13;
        SUPPORTED_CIPHERS_NON_TLSV13 = b8.supportedCiphersNonTLSv13;
        if (instance.isDebugEnabled()) {
            instance.debug("Default protocols (JDK): {} ", (Object) Arrays.asList(strArr));
            instance.debug("Default cipher suites (JDK): {}", (Object) list);
        }
    }

    public C(SSLContext sSLContext, boolean z, Iterable<String> iterable, C0558i iVar, C0587w wVar, C0561j jVar, String[] strArr, boolean z6) {
        super(z6);
        List<String> list;
        Set<String> set;
        this.apn = (C0587w) B.checkNotNull(wVar, "apn");
        this.clientAuth = (C0561j) B.checkNotNull(jVar, "clientAuth");
        this.sslContext = (SSLContext) B.checkNotNull(sSLContext, "sslContext");
        if (DEFAULT_PROVIDER.equals(sSLContext.getProvider())) {
            strArr = strArr == null ? DEFAULT_PROTOCOLS : strArr;
            this.protocols = strArr;
            if (isTlsV13Supported(strArr)) {
                set = SUPPORTED_CIPHERS;
                list = DEFAULT_CIPHERS;
            } else {
                set = SUPPORTED_CIPHERS_NON_TLSV13;
                list = DEFAULT_CIPHERS_NON_TLSV13;
            }
        } else {
            SSLEngine createSSLEngine = sSLContext.createSSLEngine();
            if (strArr == null) {
                try {
                    this.protocols = defaultProtocols(sSLContext, createSSLEngine);
                } catch (Throwable th) {
                    I.release(createSSLEngine);
                    throw th;
                }
            } else {
                this.protocols = strArr;
            }
            set = supportedCiphers(createSSLEngine);
            List<String> defaultCiphers = defaultCiphers(createSSLEngine, set);
            if (!isTlsV13Supported(this.protocols)) {
                for (String str : H1.DEFAULT_TLSV13_CIPHER_SUITES) {
                    set.remove(str);
                    defaultCiphers.remove(str);
                }
            }
            I.release(createSSLEngine);
            list = defaultCiphers;
        }
        String[] filterCipherSuites = ((C0558i) B.checkNotNull(iVar, "cipherFilter")).filterCipherSuites(iterable, list, set);
        this.cipherSuites = filterCipherSuites;
        this.unmodifiableCipherSuites = DesugarCollections.unmodifiableList(Arrays.asList(filterCipherSuites));
        this.isClient = z;
    }

    private SSLEngine configureAndWrapEngine(SSLEngine sSLEngine, C0187o oVar) {
        sSLEngine.setEnabledCipherSuites(this.cipherSuites);
        sSLEngine.setEnabledProtocols(this.protocols);
        sSLEngine.setUseClientMode(isClient());
        if (isServer()) {
            int i = C0533A.$SwitchMap$io$netty$handler$ssl$ClientAuth[this.clientAuth.ordinal()];
            if (i == 1) {
                sSLEngine.setWantClientAuth(true);
            } else if (i == 2) {
                sSLEngine.setNeedClientAuth(true);
            } else if (i != 3) {
                throw new Error("Unknown auth " + this.clientAuth);
            }
        }
        C0585v wrapperFactory = this.apn.wrapperFactory();
        if (wrapperFactory instanceof C0583u) {
            return ((C0583u) wrapperFactory).a(sSLEngine, oVar, this.apn, isServer());
        }
        return wrapperFactory.wrapSslEngine(sSLEngine, this.apn, isServer());
    }

    /* access modifiers changed from: private */
    public static List<String> defaultCiphers(SSLEngine sSLEngine, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        H1.addIfSupported(set, arrayList, H1.DEFAULT_CIPHER_SUITES);
        H1.useFallbackCiphersIfDefaultIsEmpty((List<String>) arrayList, sSLEngine.getEnabledCipherSuites());
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static String[] defaultProtocols(SSLContext sSLContext, SSLEngine sSLEngine) {
        String[] protocols2 = sSLContext.getDefaultSSLParameters().getProtocols();
        HashSet hashSet = new HashSet(protocols2.length);
        Collections.addAll(hashSet, protocols2);
        ArrayList arrayList = new ArrayList();
        H1.addIfSupported(hashSet, arrayList, "TLSv1.3", "TLSv1.2", "TLSv1.1", "TLSv1");
        if (!arrayList.isEmpty()) {
            return (String[]) arrayList.toArray(C0978k.EMPTY_STRINGS);
        }
        return sSLEngine.getEnabledProtocols();
    }

    private static boolean isTlsV13Supported(String[] strArr) {
        for (String equals : strArr) {
            if ("TLSv1.3".equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static Set<String> supportedCiphers(SSLEngine sSLEngine) {
        String[] supportedCipherSuites = sSLEngine.getSupportedCipherSuites();
        LinkedHashSet linkedHashSet = new LinkedHashSet(supportedCipherSuites.length);
        for (String str : supportedCipherSuites) {
            linkedHashSet.add(str);
            if (str.startsWith("SSL_")) {
                String str2 = "TLS_" + str.substring(4);
                try {
                    sSLEngine.setEnabledCipherSuites(new String[]{str2});
                    linkedHashSet.add(str2);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return linkedHashSet;
    }

    public static C0587w toNegotiator(C0543d dVar, boolean z) {
        return C0591y.INSTANCE;
    }

    public final SSLContext context() {
        return this.sslContext;
    }

    public final boolean isClient() {
        return this.isClient;
    }

    public final SSLEngine newEngine(C0187o oVar, String str, int i) {
        return configureAndWrapEngine(context().createSSLEngine(str, i), oVar);
    }

    public final SSLSessionContext sessionContext() {
        if (isServer()) {
            return context().getServerSessionContext();
        }
        return context().getClientSessionContext();
    }
}
