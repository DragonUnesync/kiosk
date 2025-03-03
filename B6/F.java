package b6;

import S5.C0185n;
import e6.C0852k;
import e6.I;
import e6.J;
import g6.C0978k;
import g6.C0987u;
import g6.Y;
import g6.p0;
import h6.C1082c;
import io.netty.internal.tcnative.Buffer;
import io.netty.internal.tcnative.Library;
import io.netty.internal.tcnative.SSL;
import io.netty.internal.tcnative.SSLContext;
import java.io.ByteArrayInputStream;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class F {
    static final Set<String> AVAILABLE_CIPHER_SUITES;
    private static final Set<String> AVAILABLE_JAVA_CIPHER_SUITES;
    private static final Set<String> AVAILABLE_OPENSSL_CIPHER_SUITES;
    private static final Set<String> CLIENT_DEFAULT_PROTOCOLS = protocols("jdk.tls.client.protocols");
    static final List<String> DEFAULT_CIPHERS;
    private static final String[] DEFAULT_NAMED_GROUPS = {"x25519", "secp256r1", "secp384r1", "secp521r1"};
    static final String[] EXTRA_SUPPORTED_TLS_1_3_CIPHERS;
    static final String EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING;
    private static final boolean IS_BORINGSSL;
    static final boolean JAVAX_CERTIFICATE_CREATION_SUPPORTED;
    static final String[] NAMED_GROUPS;
    private static final Set<String> SERVER_DEFAULT_PROTOCOLS = protocols("jdk.tls.server.protocols");
    static final Set<String> SUPPORTED_PROTOCOLS_SET;
    private static final boolean SUPPORTS_KEYMANAGER_FACTORY;
    private static final boolean SUPPORTS_OCSP;
    private static final boolean TLSV13_SUPPORTED;
    private static final Throwable UNAVAILABILITY_CAUSE;
    private static final boolean USE_KEYMANAGER_FACTORY;
    private static final C1082c logger;

    /* JADX WARNING: type inference failed for: r22v0, types: [e6.J, b6.r0, b6.s0] */
    /* JADX WARNING: type inference failed for: r0v47, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0240 A[Catch:{ all -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02d1 A[SYNTHETIC, Splitter:B:162:0x02d1] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02dc A[Catch:{ all -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02e3 A[Catch:{ all -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02ea A[Catch:{ all -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02f5 A[Catch:{ all -> 0x033a, all -> 0x032b }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03b3 A[Catch:{ all -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03ba A[Catch:{ all -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03c1 A[Catch:{ all -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03c8 A[Catch:{ all -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01bf A[Catch:{ all -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ee A[Catch:{ all -> 0x01d8 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            r1 = 0
            r2 = 1
            java.lang.String r3 = "io.netty.handler.ssl.openssl.useKeyManagerFactory"
            java.lang.Class<b6.F> r0 = b6.F.class
            h6.c r4 = h6.d.getInstance((java.lang.Class<?>) r0)
            logger = r4
            java.lang.String r5 = "secp384r1"
            java.lang.String r6 = "secp521r1"
            java.lang.String r7 = "x25519"
            java.lang.String r8 = "secp256r1"
            java.lang.String[] r5 = new java.lang.String[]{r7, r8, r5, r6}
            DEFAULT_NAMED_GROUPS = r5
            java.lang.String r5 = "io.netty.handler.ssl.noOpenSsl"
            boolean r5 = g6.p0.getBoolean(r5, r1)
            java.lang.String r6 = " will be unavailable."
            java.lang.Class<b6.Q> r7 = b6.Q.class
            r8 = 0
            if (r5 == 0) goto L_0x0048
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "OpenSSL was explicit disabled with -Dio.netty.handler.ssl.noOpenSsl=true"
            r0.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "netty-tcnative explicit disabled; "
            r5.<init>(r9)
            java.lang.String r7 = r7.getSimpleName()
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.debug((java.lang.String) r5, (java.lang.Throwable) r0)
            goto L_0x00d1
        L_0x0048:
            java.lang.String r4 = "io.netty.internal.tcnative.SSLContext"
            java.lang.ClassLoader r0 = g6.Y.getClassLoader(r0)     // Catch:{ ClassNotFoundException -> 0x0053 }
            java.lang.Class.forName(r4, r1, r0)     // Catch:{ ClassNotFoundException -> 0x0053 }
            r0 = r8
            goto L_0x006e
        L_0x0053:
            r0 = move-exception
            h6.c r4 = logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "netty-tcnative not in the classpath; "
            r5.<init>(r9)
            java.lang.String r9 = r7.getSimpleName()
            r5.append(r9)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.debug(r5)
        L_0x006e:
            if (r0 != 0) goto L_0x00d1
            loadTcNative()     // Catch:{ all -> 0x0075 }
            r4 = r0
            goto L_0x0093
        L_0x0075:
            r0 = move-exception
            r4 = r0
            h6.c r0 = logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to load netty-tcnative; "
            r5.<init>(r6)
            java.lang.String r6 = r7.getSimpleName()
            r5.append(r6)
            java.lang.String r6 = " will be unavailable, unless the application has already loaded the symbols by some other means. See https://netty.io/wiki/forked-tomcat-native.html for more information."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.debug((java.lang.String) r5, (java.lang.Throwable) r4)
        L_0x0093:
            java.lang.String r0 = "io.netty.handler.ssl.openssl.engine"
            java.lang.String r0 = g6.p0.get(r0, r8)     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x00a5
            h6.c r5 = logger     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "Initialize netty-tcnative using engine: 'default'"
            r5.debug(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x00ac
        L_0x00a3:
            r0 = move-exception
            goto L_0x00b1
        L_0x00a5:
            h6.c r5 = logger     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "Initialize netty-tcnative using engine: '{}'"
            r5.debug((java.lang.String) r6, (java.lang.Object) r0)     // Catch:{ all -> 0x00a3 }
        L_0x00ac:
            initializeTcNative(r0)     // Catch:{ all -> 0x00a3 }
            r0 = r8
            goto L_0x00d1
        L_0x00b1:
            if (r4 != 0) goto L_0x00b4
            r4 = r0
        L_0x00b4:
            h6.c r5 = logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to initialize netty-tcnative; "
            r6.<init>(r9)
            java.lang.String r7 = r7.getSimpleName()
            r6.append(r7)
            java.lang.String r7 = " will be unavailable. See https://netty.io/wiki/forked-tomcat-native.html for more information."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.debug((java.lang.String) r6, (java.lang.Throwable) r0)
            r0 = r4
        L_0x00d1:
            UNAVAILABILITY_CAUSE = r0
            java.lang.String r4 = "jdk.tls.client.protocols"
            java.util.Set r4 = protocols(r4)
            CLIENT_DEFAULT_PROTOCOLS = r4
            java.lang.String r4 = "jdk.tls.server.protocols"
            java.util.Set r4 = protocols(r4)
            SERVER_DEFAULT_PROTOCOLS = r4
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x04f6
            h6.c r0 = logger
            java.lang.String r5 = "netty-tcnative using native library: {}"
            java.lang.String r6 = io.netty.internal.tcnative.SSL.versionString()
            r0.debug((java.lang.String) r5, (java.lang.Object) r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r0 = 128(0x80, float:1.794E-43)
            r6.<init>(r0)
            java.lang.String[] r7 = DEFAULT_NAMED_GROUPS
            int r9 = r7.length
            java.lang.String[] r9 = new java.lang.String[r9]
            r10 = 0
        L_0x0104:
            int r11 = r7.length
            if (r10 >= r11) goto L_0x0111
            r11 = r7[r10]
            java.lang.String r11 = b6.C0574p.toOpenSsl(r11)
            r9[r10] = r11
            int r10 = r10 + r2
            goto L_0x0104
        L_0x0111:
            java.lang.String r10 = "BoringSSL"
            java.lang.String r11 = versionString()
            boolean r10 = r10.equals(r11)
            IS_BORINGSSL = r10
            if (r10 == 0) goto L_0x014f
            java.lang.String r4 = "TLS_AES_256_GCM_SHA384"
            java.lang.String r10 = "TLS_CHACHA20_POLY1305_SHA256"
            java.lang.String r11 = "TLS_AES_128_GCM_SHA256"
            java.lang.String[] r4 = new java.lang.String[]{r11, r4, r10}
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS = r4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            int r0 = r4.length
            r11 = 0
        L_0x0132:
            if (r11 >= r0) goto L_0x0140
            r12 = r4[r11]
            r10.append(r12)
            java.lang.String r12 = ":"
            r10.append(r12)
            int r11 = r11 + r2
            goto L_0x0132
        L_0x0140:
            int r0 = r10.length()
            int r0 = r0 - r2
            r10.setLength(r0)
            java.lang.String r0 = r10.toString()
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING = r0
            goto L_0x0155
        L_0x014f:
            java.lang.String[] r0 = g6.C0978k.EMPTY_STRINGS
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS = r0
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING = r4
        L_0x0155:
            r0 = 63
            long r10 = io.netty.internal.tcnative.SSLContext.make(r0, r2)     // Catch:{ Exception -> 0x03d6 }
            b6.G1 r0 = b6.G1.JDK     // Catch:{ all -> 0x018b }
            boolean r0 = b6.G1.isTlsv13Supported(r0)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x01ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r0.<init>()     // Catch:{ Exception -> 0x01ab }
            java.util.Set<java.lang.String> r4 = b6.H1.TLSV13_CIPHERS     // Catch:{ Exception -> 0x01ab }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x01ab }
        L_0x016e:
            boolean r12 = r4.hasNext()     // Catch:{ Exception -> 0x01ab }
            if (r12 == 0) goto L_0x0191
            java.lang.Object r12 = r4.next()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01ab }
            boolean r13 = IS_BORINGSSL     // Catch:{ Exception -> 0x01ab }
            java.lang.String r12 = b6.C0555h.toOpenSsl(r12, r13)     // Catch:{ Exception -> 0x01ab }
            if (r12 == 0) goto L_0x016e
            r0.append(r12)     // Catch:{ Exception -> 0x01ab }
            r12 = 58
            r0.append(r12)     // Catch:{ Exception -> 0x01ab }
            goto L_0x016e
        L_0x018b:
            r0 = move-exception
            r3 = 0
            r4 = 0
        L_0x018e:
            r12 = 0
            goto L_0x03d0
        L_0x0191:
            int r4 = r0.length()     // Catch:{ Exception -> 0x01ab }
            if (r4 != 0) goto L_0x0199
            r0 = 0
            goto L_0x01a9
        L_0x0199:
            int r4 = r0.length()     // Catch:{ Exception -> 0x01ab }
            int r4 = r4 - r2
            r0.setLength(r4)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01ab }
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r10, r0, r2)     // Catch:{ Exception -> 0x01ab }
            r0 = 1
        L_0x01a9:
            r4 = r0
            goto L_0x01ac
        L_0x01ab:
            r4 = 0
        L_0x01ac:
            java.lang.String r0 = "ALL"
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r10, r0, r1)     // Catch:{ all -> 0x03cc }
            long r18 = io.netty.internal.tcnative.SSL.newSSL(r10, r2)     // Catch:{ all -> 0x03cc }
            r20 = 0
            java.lang.String[] r0 = io.netty.internal.tcnative.SSL.getCiphers(r18)     // Catch:{ all -> 0x01d8 }
            int r12 = r0.length     // Catch:{ all -> 0x01d8 }
            r13 = 0
        L_0x01bd:
            if (r13 >= r12) goto L_0x01ea
            r14 = r0[r13]     // Catch:{ all -> 0x01d8 }
            if (r14 == 0) goto L_0x01e8
            boolean r15 = r14.isEmpty()     // Catch:{ all -> 0x01d8 }
            if (r15 != 0) goto L_0x01e8
            boolean r15 = r6.contains(r14)     // Catch:{ all -> 0x01d8 }
            if (r15 != 0) goto L_0x01e8
            if (r4 != 0) goto L_0x01e5
            boolean r15 = b6.H1.isTLSv13Cipher(r14)     // Catch:{ all -> 0x01d8 }
            if (r15 == 0) goto L_0x01e5
            goto L_0x01e8
        L_0x01d8:
            r0 = move-exception
            r14 = r20
            r23 = r14
            r25 = r23
            r27 = r25
            r3 = 0
            r12 = 0
            goto L_0x03ac
        L_0x01e5:
            r6.add(r14)     // Catch:{ all -> 0x01d8 }
        L_0x01e8:
            int r13 = r13 + r2
            goto L_0x01bd
        L_0x01ea:
            boolean r0 = IS_BORINGSSL     // Catch:{ all -> 0x01d8 }
            if (r0 == 0) goto L_0x0200
            java.lang.String[] r12 = EXTRA_SUPPORTED_TLS_1_3_CIPHERS     // Catch:{ all -> 0x01d8 }
            java.util.Collections.addAll(r6, r12)     // Catch:{ all -> 0x01d8 }
            java.lang.String r12 = "AEAD-AES128-GCM-SHA256"
            java.lang.String r13 = "AEAD-AES256-GCM-SHA384"
            java.lang.String r14 = "AEAD-CHACHA20-POLY1305-SHA256"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13, r14}     // Catch:{ all -> 0x01d8 }
            java.util.Collections.addAll(r6, r12)     // Catch:{ all -> 0x01d8 }
        L_0x0200:
            java.lang.String r12 = "-----BEGIN PRIVATE KEY-----\nMIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCCBtayYNDrM3NFnkBbwTd6gaWp\na84ENvkWzWgFGtVAe5iZUChqrAPNdgnQs7Brb3cCBYRDWOlxtnaGmhhDOoRkFMucWEyuFEWUfops\nk0PxjfeRn+JJUEEO4Zt1JslKGUz7hbBD0gCyjgxni9bdLWK/l8YakuBu1dGYF/9FTyiY3QaKOW9a\nUtYdaKMs3zFC3JIW4FDuyxbxFwoBqvLelSbpRRAH4KjqWd+2LRPNqDw+COEAmrZnfBuwZGc/ZhK9\nihorqrOYddFiWn8/GuMEBkCaQsmzhhOb9cUX5+R5jHiL3OodvKid7nJ6tGJuwdpdlYudQv6sWh4x\n0q+vRVLewaaFAgMBAAECggEAP8tPJvFtTxhNJAkCloHz0D0vpDHqQBMgntlkgayqmBqLwhyb18pR\ni0qwgh7HHc7wWqOOQuSqlEnrWRrdcI6TSe8R/sErzfTQNoznKWIPYcI/hskk4sdnQ//Yn9/Jvnsv\nU/BBjOTJxtD+sQbhAl80JcA3R+5sArURQkfzzHOL/YMqzAsn5hTzp7HZCxUqBk3KaHRxV7NefeOE\nxlZuWSmxYWfbFIs4kx19/1t7h8CHQWezw+G60G2VBtSBBxDnhBWvqG6R/wpzJ3nEhPLLY9T+XIHe\nipzdMOOOUZorfIg7M+pyYPji+ZIZxIpY5OjrOzXHciAjRtr5Y7l99K1CG1LguQKBgQDrQfIMxxtZ\nvxU/1cRmUV9l7pt5bjV5R6byXq178LxPKVYNjdZ840Q0/OpZEVqaT1xKVi35ohP1QfNjxPLlHD+K\niDAR9z6zkwjIrbwPCnb5kuXy4lpwPcmmmkva25fI7qlpHtbcuQdoBdCfr/KkKaUCMPyY89LCXgEw\n5KTDj64UywKBgQCNfbO+eZLGzhiHhtNJurresCsIGWlInv322gL8CSfBMYl6eNfUTZvUDdFhPISL\nUljKWzXDrjw0ujFSPR0XhUGtiq89H+HUTuPPYv25gVXO+HTgBFZEPl4PpA+BUsSVZy0NddneyqLk\n42Wey9omY9Q8WsdNQS5cbUvy0uG6WFoX7wKBgQDZ1jpW8pa0x2bZsQsm4vo+3G5CRnZlUp+XlWt2\ndDcp5dC0xD1zbs1dc0NcLeGDOTDv9FSl7hok42iHXXq8AygjEm/QcuwwQ1nC2HxmQP5holAiUs4D\nWHM8PWs3wFYPzE459EBoKTxeaeP/uWAn+he8q7d5uWvSZlEcANs/6e77eQKBgD21Ar0hfFfj7mK8\n9E0FeRZBsqK3omkfnhcYgZC11Xa2SgT1yvs2Va2n0RcdM5kncr3eBZav2GYOhhAdwyBM55XuE/sO\neokDVutNeuZ6d5fqV96TRaRBpvgfTvvRwxZ9hvKF4Vz+9wfn/JvCwANaKmegF6ejs7pvmF3whq2k\ndrZVAoGAX5YxQ5XMTD0QbMAl7/6qp6S58xNoVdfCkmkj1ZLKaHKIjS/benkKGlySVQVPexPfnkZx\np/Vv9yyphBoudiTBS9Uog66ueLYZqpgxlM/6OhYg86Gm3U2ycvMxYjBM1NFiyze21AqAhI+HX+Ot\nmraV2/guSgDgZAhukRZzeQ2RucI=\n-----END PRIVATE KEY-----"
            java.nio.charset.Charset r13 = e6.C0852k.US_ASCII     // Catch:{ all -> 0x01d8 }
            byte[] r12 = r12.getBytes(r13)     // Catch:{ all -> 0x01d8 }
            b6.s0 r22 = b6.C0580s0.valueOf((byte[]) r12)     // Catch:{ all -> 0x01d8 }
            io.netty.internal.tcnative.SSLContext.setCertificateCallback(r10, r8)     // Catch:{ Error -> 0x02b9, all -> 0x02b1 }
            java.security.cert.X509Certificate r12 = selfSignedCertificate()     // Catch:{ Error -> 0x02b9, all -> 0x02b1 }
            S5.o r13 = S5.C0187o.DEFAULT     // Catch:{ Error -> 0x02b9, all -> 0x02b1 }
            java.security.cert.X509Certificate[] r14 = new java.security.cert.X509Certificate[r2]     // Catch:{ Error -> 0x02b9, all -> 0x02b1 }
            r14[r1] = r12     // Catch:{ Error -> 0x02b9, all -> 0x02b1 }
            long r23 = b6.F0.toBIO((S5.C0187o) r13, (java.security.cert.X509Certificate[]) r14)     // Catch:{ Error -> 0x02b9, all -> 0x02b1 }
            long r25 = io.netty.internal.tcnative.SSL.parseX509Chain(r23)     // Catch:{ Error -> 0x02aa, all -> 0x02a2 }
            S5.L0 r12 = S5.L0.DEFAULT     // Catch:{ Error -> 0x029d, all -> 0x0297 }
            b6.r0 r13 = r22.retain()     // Catch:{ Error -> 0x029d, all -> 0x0297 }
            long r14 = b6.F0.toBIO((S5.C0187o) r12, (b6.C0578r0) r13)     // Catch:{ Error -> 0x029d, all -> 0x0297 }
            long r27 = io.netty.internal.tcnative.SSL.parsePrivateKey(r14, r8)     // Catch:{ Error -> 0x0292, all -> 0x028c }
            r12 = r18
            r29 = r14
            r14 = r25
            r16 = r27
            io.netty.internal.tcnative.SSL.setKeyMaterial(r12, r14, r16)     // Catch:{ Error -> 0x0287, all -> 0x0280 }
            boolean r12 = g6.p0.contains(r3)     // Catch:{ all -> 0x0250 }
            if (r0 != 0) goto L_0x0252
            boolean r0 = g6.p0.getBoolean(r3, r2)     // Catch:{ all -> 0x0250 }
            if (r12 == 0) goto L_0x025f
            h6.c r3 = logger     // Catch:{ all -> 0x024e }
            java.lang.String r12 = "System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and so will be ignored in the future"
            r3.info(r12)     // Catch:{ all -> 0x024e }
            goto L_0x025f
        L_0x024e:
            r3 = r0
            goto L_0x0261
        L_0x0250:
            r3 = 0
            goto L_0x0261
        L_0x0252:
            if (r12 == 0) goto L_0x025e
            h6.c r0 = logger     // Catch:{ all -> 0x025c }
            java.lang.String r3 = "System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and will be ignored when using BoringSSL"
            r0.info(r3)     // Catch:{ all -> 0x025c }
            goto L_0x025e
        L_0x025c:
            r3 = 1
            goto L_0x0261
        L_0x025e:
            r0 = 1
        L_0x025f:
            r3 = r0
            goto L_0x0268
        L_0x0261:
            h6.c r0 = logger     // Catch:{ Error -> 0x027c, all -> 0x0276 }
            java.lang.String r12 = "Failed to get useKeyManagerFactory system property."
            r0.debug(r12)     // Catch:{ Error -> 0x027c, all -> 0x0276 }
        L_0x0268:
            r22.release()     // Catch:{ all -> 0x0270 }
            r14 = r29
            r12 = 1
            goto L_0x02ca
        L_0x0270:
            r0 = move-exception
            r14 = r29
            r12 = 1
            goto L_0x03ac
        L_0x0276:
            r0 = move-exception
            r14 = r29
            r12 = 1
            goto L_0x03a8
        L_0x027c:
            r14 = r29
            r12 = 1
            goto L_0x02c0
        L_0x0280:
            r0 = move-exception
            r14 = r29
        L_0x0283:
            r3 = 0
            r12 = 0
            goto L_0x03a8
        L_0x0287:
            r14 = r29
        L_0x0289:
            r3 = 0
            r12 = 0
            goto L_0x02c0
        L_0x028c:
            r0 = move-exception
            r29 = r14
            r27 = r20
            goto L_0x0283
        L_0x0292:
            r29 = r14
            r27 = r20
            goto L_0x0289
        L_0x0297:
            r0 = move-exception
            r14 = r20
            r27 = r14
            goto L_0x0283
        L_0x029d:
            r14 = r20
            r27 = r14
            goto L_0x0289
        L_0x02a2:
            r0 = move-exception
            r14 = r20
            r25 = r14
        L_0x02a7:
            r27 = r25
            goto L_0x0283
        L_0x02aa:
            r14 = r20
            r25 = r14
        L_0x02ae:
            r27 = r25
            goto L_0x0289
        L_0x02b1:
            r0 = move-exception
            r14 = r20
            r23 = r14
            r25 = r23
            goto L_0x02a7
        L_0x02b9:
            r14 = r20
            r23 = r14
            r25 = r23
            goto L_0x02ae
        L_0x02c0:
            h6.c r0 = logger     // Catch:{ all -> 0x03a7 }
            java.lang.String r13 = "KeyManagerFactory not supported."
            r0.debug(r13)     // Catch:{ all -> 0x03a7 }
            r22.release()     // Catch:{ all -> 0x03a5 }
        L_0x02ca:
            io.netty.internal.tcnative.SSL.freeSSL(r18)     // Catch:{ all -> 0x033a }
            int r0 = (r23 > r20 ? 1 : (r23 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x02d8
            io.netty.internal.tcnative.SSL.freeBIO(r23)     // Catch:{ all -> 0x02d5 }
            goto L_0x02d8
        L_0x02d5:
            r0 = move-exception
            goto L_0x03d0
        L_0x02d8:
            int r0 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x02df
            io.netty.internal.tcnative.SSL.freeBIO(r14)     // Catch:{ all -> 0x02d5 }
        L_0x02df:
            int r0 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x02e6
            io.netty.internal.tcnative.SSL.freeX509Chain(r25)     // Catch:{ all -> 0x02d5 }
        L_0x02e6:
            int r0 = (r27 > r20 ? 1 : (r27 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x02ed
            io.netty.internal.tcnative.SSL.freePrivateKey(r27)     // Catch:{ all -> 0x02d5 }
        L_0x02ed:
            java.lang.String r0 = "jdk.tls.namedGroups"
            java.lang.String r0 = g6.p0.get(r0, r8)     // Catch:{ all -> 0x033a }
            if (r0 == 0) goto L_0x0398
            java.lang.String r8 = ","
            java.lang.String[] r0 = r0.split(r8)     // Catch:{ all -> 0x033a }
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch:{ all -> 0x033a }
            int r13 = r0.length     // Catch:{ all -> 0x033a }
            r8.<init>(r13)     // Catch:{ all -> 0x033a }
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet     // Catch:{ all -> 0x033a }
            int r14 = r0.length     // Catch:{ all -> 0x033a }
            r13.<init>(r14)     // Catch:{ all -> 0x033a }
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet     // Catch:{ all -> 0x033a }
            r14.<init>()     // Catch:{ all -> 0x033a }
            int r15 = r0.length     // Catch:{ all -> 0x033a }
        L_0x030d:
            if (r1 >= r15) goto L_0x033f
            r2 = r0[r1]     // Catch:{ all -> 0x033a }
            r18 = r0
            java.lang.String r0 = b6.C0574p.toOpenSsl(r2)     // Catch:{ all -> 0x033a }
            r22 = r3
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ all -> 0x032b }
            boolean r3 = io.netty.internal.tcnative.SSLContext.setCurvesList(r10, r3)     // Catch:{ all -> 0x032b }
            if (r3 == 0) goto L_0x0330
            r13.add(r0)     // Catch:{ all -> 0x032b }
            r8.add(r2)     // Catch:{ all -> 0x032b }
        L_0x0329:
            r2 = 1
            goto L_0x0334
        L_0x032b:
            r0 = move-exception
        L_0x032c:
            r3 = r22
            goto L_0x03d0
        L_0x0330:
            r14.add(r2)     // Catch:{ all -> 0x032b }
            goto L_0x0329
        L_0x0334:
            int r1 = r1 + r2
            r0 = r18
            r3 = r22
            goto L_0x030d
        L_0x033a:
            r0 = move-exception
            r22 = r3
            goto L_0x03d0
        L_0x033f:
            r22 = r3
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x032b }
            if (r0 == 0) goto L_0x0362
            h6.c r0 = logger     // Catch:{ all -> 0x035f }
            java.lang.String r1 = "All configured namedGroups are not supported: {}. Use default: {}."
            java.lang.String[] r2 = g6.C0978k.EMPTY_STRINGS     // Catch:{ all -> 0x035f }
            java.lang.Object[] r2 = r14.toArray(r2)     // Catch:{ all -> 0x035f }
            java.lang.String r2 = java.util.Arrays.toString(r2)     // Catch:{ all -> 0x035f }
            java.lang.String[] r3 = DEFAULT_NAMED_GROUPS     // Catch:{ all -> 0x035f }
            java.lang.String r3 = java.util.Arrays.toString(r3)     // Catch:{ all -> 0x035f }
            r0.info(r1, r2, r3)     // Catch:{ all -> 0x035f }
            goto L_0x0396
        L_0x035f:
            r0 = move-exception
            r7 = r9
            goto L_0x032c
        L_0x0362:
            java.lang.String[] r0 = g6.C0978k.EMPTY_STRINGS     // Catch:{ all -> 0x032b }
            java.lang.Object[] r1 = r8.toArray(r0)     // Catch:{ all -> 0x032b }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x032b }
            boolean r2 = r14.isEmpty()     // Catch:{ all -> 0x032b }
            if (r2 == 0) goto L_0x037c
            h6.c r2 = logger     // Catch:{ all -> 0x032b }
            java.lang.String r3 = "Using configured namedGroups -D 'jdk.tls.namedGroup': {} "
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch:{ all -> 0x032b }
            r2.info(r3, r1)     // Catch:{ all -> 0x032b }
            goto L_0x038f
        L_0x037c:
            h6.c r2 = logger     // Catch:{ all -> 0x032b }
            java.lang.String r3 = "Using supported configured namedGroups: {}. Unsupported namedGroups: {}. "
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch:{ all -> 0x032b }
            java.lang.Object[] r8 = r14.toArray(r0)     // Catch:{ all -> 0x032b }
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch:{ all -> 0x032b }
            r2.info(r3, r1, r8)     // Catch:{ all -> 0x032b }
        L_0x038f:
            java.lang.Object[] r0 = r13.toArray(r0)     // Catch:{ all -> 0x032b }
            r9 = r0
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ all -> 0x032b }
        L_0x0396:
            r7 = r9
            goto L_0x039b
        L_0x0398:
            r22 = r3
            goto L_0x0396
        L_0x039b:
            io.netty.internal.tcnative.SSLContext.free(r10)     // Catch:{ Exception -> 0x03a1 }
            r3 = r22
            goto L_0x03e1
        L_0x03a1:
            r0 = move-exception
            r3 = r22
            goto L_0x03da
        L_0x03a5:
            r0 = move-exception
            goto L_0x03ac
        L_0x03a7:
            r0 = move-exception
        L_0x03a8:
            r22.release()     // Catch:{ all -> 0x03a5 }
            throw r0     // Catch:{ all -> 0x03a5 }
        L_0x03ac:
            io.netty.internal.tcnative.SSL.freeSSL(r18)     // Catch:{ all -> 0x02d5 }
            int r1 = (r23 > r20 ? 1 : (r23 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x03b6
            io.netty.internal.tcnative.SSL.freeBIO(r23)     // Catch:{ all -> 0x02d5 }
        L_0x03b6:
            int r1 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x03bd
            io.netty.internal.tcnative.SSL.freeBIO(r14)     // Catch:{ all -> 0x02d5 }
        L_0x03bd:
            int r1 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x03c4
            io.netty.internal.tcnative.SSL.freeX509Chain(r25)     // Catch:{ all -> 0x02d5 }
        L_0x03c4:
            int r1 = (r27 > r20 ? 1 : (r27 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x03cb
            io.netty.internal.tcnative.SSL.freePrivateKey(r27)     // Catch:{ all -> 0x02d5 }
        L_0x03cb:
            throw r0     // Catch:{ all -> 0x02d5 }
        L_0x03cc:
            r0 = move-exception
            r3 = 0
            goto L_0x018e
        L_0x03d0:
            io.netty.internal.tcnative.SSLContext.free(r10)     // Catch:{ Exception -> 0x03d4 }
            throw r0     // Catch:{ Exception -> 0x03d4 }
        L_0x03d4:
            r0 = move-exception
            goto L_0x03da
        L_0x03d6:
            r0 = move-exception
            r3 = 0
            r4 = 0
            r12 = 0
        L_0x03da:
            h6.c r1 = logger
            java.lang.String r2 = "Failed to get the list of available OpenSSL cipher suites."
            r1.warn((java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x03e1:
            NAMED_GROUPS = r7
            java.util.Set r0 = j$.util.DesugarCollections.unmodifiableSet(r6)
            AVAILABLE_OPENSSL_CIPHER_SUITES = r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            int r2 = r0.size()
            r6 = 2
            int r2 = r2 * 2
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x03f9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0422
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r7 = b6.H1.isTLSv13Cipher(r2)
            if (r7 != 0) goto L_0x041e
            java.lang.String r7 = "TLS"
            java.lang.String r7 = b6.C0555h.toJava(r2, r7)
            r1.add(r7)
            java.lang.String r7 = "SSL"
            java.lang.String r2 = b6.C0555h.toJava(r2, r7)
            r1.add(r2)
            goto L_0x03f9
        L_0x041e:
            r1.add(r2)
            goto L_0x03f9
        L_0x0422:
            java.lang.String[] r0 = b6.H1.DEFAULT_CIPHER_SUITES
            b6.H1.addIfSupported(r1, r5, r0)
            java.lang.String[] r0 = b6.H1.TLSV13_CIPHER_SUITES
            b6.H1.addIfSupported(r1, r5, r0)
            java.lang.String[] r0 = EXTRA_SUPPORTED_TLS_1_3_CIPHERS
            b6.H1.addIfSupported(r1, r5, r0)
            b6.H1.useFallbackCiphersIfDefaultIsEmpty((java.util.List<java.lang.String>) r5, (java.lang.Iterable<java.lang.String>) r1)
            java.util.List r0 = j$.util.DesugarCollections.unmodifiableList(r5)
            DEFAULT_CIPHERS = r0
            java.util.Set r1 = j$.util.DesugarCollections.unmodifiableSet(r1)
            AVAILABLE_JAVA_CIPHER_SUITES = r1
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            java.util.Set<java.lang.String> r5 = AVAILABLE_OPENSSL_CIPHER_SUITES
            int r7 = r5.size()
            int r8 = r1.size()
            int r8 = r8 + r7
            r2.<init>(r8)
            r2.addAll(r5)
            r2.addAll(r1)
            AVAILABLE_CIPHER_SUITES = r2
            SUPPORTS_KEYMANAGER_FACTORY = r12
            USE_KEYMANAGER_FACTORY = r3
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r2 = 6
            r1.<init>(r2)
            java.lang.String r2 = "SSLv2Hello"
            r1.add(r2)
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2
            r3 = 1
            boolean r2 = doesSupportProtocol(r3, r2)
            if (r2 == 0) goto L_0x0475
            java.lang.String r2 = "SSLv2"
            r1.add(r2)
        L_0x0475:
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3
            boolean r2 = doesSupportProtocol(r6, r2)
            if (r2 == 0) goto L_0x0482
            java.lang.String r2 = "SSLv3"
            r1.add(r2)
        L_0x0482:
            r2 = 4
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1
            boolean r2 = doesSupportProtocol(r2, r3)
            if (r2 == 0) goto L_0x0490
            java.lang.String r2 = "TLSv1"
            r1.add(r2)
        L_0x0490:
            r2 = 8
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1
            boolean r2 = doesSupportProtocol(r2, r3)
            if (r2 == 0) goto L_0x049f
            java.lang.String r2 = "TLSv1.1"
            r1.add(r2)
        L_0x049f:
            r2 = 16
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_2
            boolean r2 = doesSupportProtocol(r2, r3)
            if (r2 == 0) goto L_0x04ae
            java.lang.String r2 = "TLSv1.2"
            r1.add(r2)
        L_0x04ae:
            if (r4 == 0) goto L_0x04c3
            r2 = 32
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3
            boolean r2 = doesSupportProtocol(r2, r3)
            if (r2 == 0) goto L_0x04c3
            java.lang.String r2 = "TLSv1.3"
            r1.add(r2)
            r2 = 1
            TLSV13_SUPPORTED = r2
            goto L_0x04c7
        L_0x04c3:
            r2 = 1
            r3 = 0
            TLSV13_SUPPORTED = r3
        L_0x04c7:
            java.util.Set r1 = j$.util.DesugarCollections.unmodifiableSet(r1)
            SUPPORTED_PROTOCOLS_SET = r1
            boolean r3 = doesSupportOcsp()
            SUPPORTS_OCSP = r3
            h6.c r3 = logger
            boolean r4 = r3.isDebugEnabled()
            if (r4 == 0) goto L_0x04e5
            java.lang.String r4 = "Supported protocols (OpenSSL): {} "
            r3.debug((java.lang.String) r4, (java.lang.Object) r1)
            java.lang.String r1 = "Default cipher suites (OpenSSL): {}"
            r3.debug((java.lang.String) r1, (java.lang.Object) r0)
        L_0x04e5:
            java.lang.String r0 = "-----BEGIN CERTIFICATE-----\nMIICrjCCAZagAwIBAgIIdSvQPv1QAZQwDQYJKoZIhvcNAQELBQAwFjEUMBIGA1UEAxMLZXhhbXBs\nZS5jb20wIBcNMTgwNDA2MjIwNjU5WhgPOTk5OTEyMzEyMzU5NTlaMBYxFDASBgNVBAMTC2V4YW1w\nbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAggbWsmDQ6zNzRZ5AW8E3eoGl\nqWvOBDb5Fs1oBRrVQHuYmVAoaqwDzXYJ0LOwa293AgWEQ1jpcbZ2hpoYQzqEZBTLnFhMrhRFlH6K\nbJND8Y33kZ/iSVBBDuGbdSbJShlM+4WwQ9IAso4MZ4vW3S1iv5fGGpLgbtXRmBf/RU8omN0Gijlv\nWlLWHWijLN8xQtySFuBQ7ssW8RcKAary3pUm6UUQB+Co6lnfti0Tzag8PgjhAJq2Z3wbsGRnP2YS\nvYoaK6qzmHXRYlp/PxrjBAZAmkLJs4YTm/XFF+fkeYx4i9zqHbyone5yerRibsHaXZWLnUL+rFoe\nMdKvr0VS3sGmhQIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQADQi441pKmXf9FvUV5EHU4v8nJT9Iq\nyqwsKwXnr7AsUlDGHBD7jGrjAXnG5rGxuNKBQ35wRxJATKrUtyaquFUL6H8O6aGQehiFTk6zmPbe\n12Gu44vqqTgIUxnv3JQJiox8S2hMxsSddpeCmSdvmalvD6WG4NthH6B9ZaBEiep1+0s0RUaBYn73\nI7CCUaAtbjfR6pcJjrFk5ei7uwdQZFSJtkP2z8r7zfeANJddAKFlkaMWn7u+OIVuB4XPooWicObk\nNAHFtP65bocUYnDpTVdiyvn8DdqyZ/EO8n1bBKBzuSLplk2msW4pdgaFgY7Vw/0wzcFXfUXmL1uy\nG8sQD/wx\n-----END CERTIFICATE-----"
            java.nio.charset.Charset r1 = e6.C0852k.US_ASCII     // Catch:{ CertificateException -> 0x04f2 }
            byte[] r0 = r0.getBytes(r1)     // Catch:{ CertificateException -> 0x04f2 }
            javax.security.cert.X509Certificate.getInstance(r0)     // Catch:{ CertificateException -> 0x04f2 }
            r1 = 1
            goto L_0x04f3
        L_0x04f2:
            r1 = 0
        L_0x04f3:
            JAVAX_CERTIFICATE_CREATION_SUPPORTED = r1
            goto L_0x052b
        L_0x04f6:
            java.util.List r0 = java.util.Collections.emptyList()
            DEFAULT_CIPHERS = r0
            java.util.Set r0 = java.util.Collections.emptySet()
            AVAILABLE_OPENSSL_CIPHER_SUITES = r0
            java.util.Set r0 = java.util.Collections.emptySet()
            AVAILABLE_JAVA_CIPHER_SUITES = r0
            java.util.Set r0 = java.util.Collections.emptySet()
            AVAILABLE_CIPHER_SUITES = r0
            r1 = 0
            SUPPORTS_KEYMANAGER_FACTORY = r1
            USE_KEYMANAGER_FACTORY = r1
            java.util.Set r0 = java.util.Collections.emptySet()
            SUPPORTED_PROTOCOLS_SET = r0
            SUPPORTS_OCSP = r1
            TLSV13_SUPPORTED = r1
            IS_BORINGSSL = r1
            java.lang.String[] r0 = g6.C0978k.EMPTY_STRINGS
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS = r0
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING = r4
            java.lang.String[] r0 = DEFAULT_NAMED_GROUPS
            NAMED_GROUPS = r0
            JAVAX_CERTIFICATE_CREATION_SUPPORTED = r1
        L_0x052b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.F.<clinit>():void");
    }

    public static Set<String> availableJavaCipherSuites() {
        return AVAILABLE_JAVA_CIPHER_SUITES;
    }

    public static String checkTls13Ciphers(C1082c cVar, String str) {
        boolean z;
        if (IS_BORINGSSL && !str.isEmpty()) {
            String[] strArr = EXTRA_SUPPORTED_TLS_1_3_CIPHERS;
            HashSet hashSet = new HashSet(strArr.length);
            Collections.addAll(hashSet, strArr);
            String[] split = str.split(":");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                String str2 = split[i];
                if (!hashSet.isEmpty() && (hashSet.remove(str2) || hashSet.remove(C0555h.toJava(str2, "TLS")))) {
                    i++;
                }
            }
            z = true;
            if ((!hashSet.isEmpty()) || z) {
                if (cVar.isInfoEnabled()) {
                    StringBuilder sb = new StringBuilder(128);
                    for (String java : str.split(":")) {
                        sb.append(C0555h.toJava(java, "TLS"));
                        sb.append(":");
                    }
                    sb.setLength(sb.length() - 1);
                    cVar.info("BoringSSL doesn't allow to enable or disable TLSv1.3 ciphers explicitly. Provided TLSv1.3 ciphers: '{}', default TLSv1.3 ciphers that will be used: '{}'.", sb, EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING);
                }
                return EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING;
            }
        }
        return str;
    }

    public static String[] defaultProtocols(boolean z) {
        Set<String> set;
        if (z) {
            set = CLIENT_DEFAULT_PROTOCOLS;
        } else {
            set = SERVER_DEFAULT_PROTOCOLS;
        }
        if (set == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(set.size());
        for (String next : set) {
            if (SUPPORTED_PROTOCOLS_SET.contains(next)) {
                arrayList.add(next);
            }
        }
        return (String[]) arrayList.toArray(C0978k.EMPTY_STRINGS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean doesSupportOcsp() {
        /*
            int r0 = version()
            long r0 = (long) r0
            r2 = 268443648(0x10002000, double:1.326287843E-315)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0039
            r0 = 16
            r1 = 1
            r2 = -1
            long r5 = io.netty.internal.tcnative.SSLContext.make(r0, r1)     // Catch:{ Exception -> 0x0030, all -> 0x0026 }
            io.netty.internal.tcnative.SSLContext.enableOcsp(r5, r4)     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            io.netty.internal.tcnative.SSLContext.free(r5)
        L_0x0020:
            r4 = 1
            goto L_0x0039
        L_0x0022:
            r0 = move-exception
            goto L_0x0028
        L_0x0024:
            goto L_0x0032
        L_0x0026:
            r0 = move-exception
            r5 = r2
        L_0x0028:
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x002f
            io.netty.internal.tcnative.SSLContext.free(r5)
        L_0x002f:
            throw r0
        L_0x0030:
            r5 = r2
        L_0x0032:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
            io.netty.internal.tcnative.SSLContext.free(r5)
        L_0x0039:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.F.doesSupportOcsp():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean doesSupportProtocol(int r3, int r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r4 = 2
            long r3 = io.netty.internal.tcnative.SSLContext.make(r3, r4)     // Catch:{ Exception -> 0x0016, all -> 0x0014 }
            r0 = -1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0012
            io.netty.internal.tcnative.SSLContext.free(r3)
        L_0x0012:
            r3 = 1
            return r3
        L_0x0014:
            r3 = move-exception
            throw r3
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.F.doesSupportProtocol(int, int):boolean");
    }

    public static void ensureAvailability() {
        Throwable th = UNAVAILABILITY_CAUSE;
        if (th != null) {
            throw ((Error) new UnsatisfiedLinkError("failed to load the required native library").initCause(th));
        }
    }

    private static boolean initializeTcNative(String str) {
        return Library.initialize("provided", str);
    }

    public static boolean isAvailable() {
        if (UNAVAILABILITY_CAUSE == null) {
            return true;
        }
        return false;
    }

    public static boolean isBoringSSL() {
        return IS_BORINGSSL;
    }

    public static boolean isCipherSuiteAvailable(String str) {
        String openSsl = C0555h.toOpenSsl(str, IS_BORINGSSL);
        if (openSsl != null) {
            str = openSsl;
        }
        return AVAILABLE_OPENSSL_CIPHER_SUITES.contains(str);
    }

    public static boolean isOcspSupported() {
        return SUPPORTS_OCSP;
    }

    public static boolean isTlsv13Supported() {
        return TLSV13_SUPPORTED;
    }

    private static void loadTcNative() {
        String normalizedOs = Y.normalizedOs();
        String normalizedArch = Y.normalizedArch();
        LinkedHashSet linkedHashSet = new LinkedHashSet(5);
        if ("linux".equals(normalizedOs)) {
            for (String str : Y.normalizedLinuxClassifiers()) {
                linkedHashSet.add("netty_tcnative_" + normalizedOs + '_' + normalizedArch + "_" + str);
            }
            linkedHashSet.add("netty_tcnative_" + normalizedOs + '_' + normalizedArch);
            linkedHashSet.add("netty_tcnative_" + normalizedOs + '_' + normalizedArch + "_fedora");
        } else {
            linkedHashSet.add("netty_tcnative_" + normalizedOs + '_' + normalizedArch);
        }
        linkedHashSet.add("netty_tcnative_" + normalizedArch);
        linkedHashSet.add("netty_tcnative");
        C0987u.loadFirstAvailable(Y.getClassLoader(SSLContext.class), (String[]) linkedHashSet.toArray(C0978k.EMPTY_STRINGS));
    }

    public static long memoryAddress(C0185n nVar) {
        if (nVar.hasMemoryAddress()) {
            return nVar.memoryAddress();
        }
        return Buffer.address(nVar.internalNioBuffer(0, nVar.readableBytes()));
    }

    private static Set<String> protocols(String str) {
        HashSet hashSet = null;
        String str2 = p0.get(str, (String) null);
        if (str2 != null) {
            hashSet = new HashSet();
            for (String trim : str2.split(",")) {
                hashSet.add(trim.trim());
            }
        }
        return hashSet;
    }

    public static void releaseIfNeeded(J j7) {
        if (j7.refCnt() > 0) {
            I.safeRelease(j7);
        }
    }

    public static X509Certificate selfSignedCertificate() {
        return (X509Certificate) C0539b1.X509_CERT_FACTORY.generateCertificate(new ByteArrayInputStream("-----BEGIN CERTIFICATE-----\nMIICrjCCAZagAwIBAgIIdSvQPv1QAZQwDQYJKoZIhvcNAQELBQAwFjEUMBIGA1UEAxMLZXhhbXBs\nZS5jb20wIBcNMTgwNDA2MjIwNjU5WhgPOTk5OTEyMzEyMzU5NTlaMBYxFDASBgNVBAMTC2V4YW1w\nbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAggbWsmDQ6zNzRZ5AW8E3eoGl\nqWvOBDb5Fs1oBRrVQHuYmVAoaqwDzXYJ0LOwa293AgWEQ1jpcbZ2hpoYQzqEZBTLnFhMrhRFlH6K\nbJND8Y33kZ/iSVBBDuGbdSbJShlM+4WwQ9IAso4MZ4vW3S1iv5fGGpLgbtXRmBf/RU8omN0Gijlv\nWlLWHWijLN8xQtySFuBQ7ssW8RcKAary3pUm6UUQB+Co6lnfti0Tzag8PgjhAJq2Z3wbsGRnP2YS\nvYoaK6qzmHXRYlp/PxrjBAZAmkLJs4YTm/XFF+fkeYx4i9zqHbyone5yerRibsHaXZWLnUL+rFoe\nMdKvr0VS3sGmhQIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQADQi441pKmXf9FvUV5EHU4v8nJT9Iq\nyqwsKwXnr7AsUlDGHBD7jGrjAXnG5rGxuNKBQ35wRxJATKrUtyaquFUL6H8O6aGQehiFTk6zmPbe\n12Gu44vqqTgIUxnv3JQJiox8S2hMxsSddpeCmSdvmalvD6WG4NthH6B9ZaBEiep1+0s0RUaBYn73\nI7CCUaAtbjfR6pcJjrFk5ei7uwdQZFSJtkP2z8r7zfeANJddAKFlkaMWn7u+OIVuB4XPooWicObk\nNAHFtP65bocUYnDpTVdiyvn8DdqyZ/EO8n1bBKBzuSLplk2msW4pdgaFgY7Vw/0wzcFXfUXmL1uy\nG8sQD/wx\n-----END CERTIFICATE-----".getBytes(C0852k.US_ASCII)));
    }

    public static boolean useKeyManagerFactory() {
        return USE_KEYMANAGER_FACTORY;
    }

    public static int version() {
        if (isAvailable()) {
            return SSL.version();
        }
        return -1;
    }

    public static String versionString() {
        if (isAvailable()) {
            return SSL.versionString();
        }
        return null;
    }
}
