package b6;

import S5.C0185n;
import S5.C0187o;
import S5.C0206y;
import T5.Y;
import Y5.a;
import Y5.b;
import e6.C0862v;
import g6.C0978k;
import h6.C1082c;
import h6.d;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.altbeacon.bluetooth.Pdu;

public abstract class H1 {
    static final String[] DEFAULT_CIPHER_SUITES;
    static final String[] DEFAULT_TLSV13_CIPHER_SUITES;
    static final Set<String> TLSV13_CIPHERS = DesugarCollections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_128_CCM_8_SHA256", "TLS_AES_128_CCM_SHA256"})));
    static final String[] TLSV13_CIPHER_SUITES;
    private static final boolean TLSV1_3_JDK_DEFAULT_ENABLED = isTLSv13EnabledByJDK0((Provider) null);
    private static final boolean TLSV1_3_JDK_SUPPORTED;
    private static final C1082c logger = d.getInstance((Class<?>) H1.class);

    static {
        String[] strArr = {"TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384"};
        TLSV13_CIPHER_SUITES = strArr;
        boolean isTLSv13SupportedByJDK0 = isTLSv13SupportedByJDK0((Provider) null);
        TLSV1_3_JDK_SUPPORTED = isTLSv13SupportedByJDK0;
        if (isTLSv13SupportedByJDK0) {
            DEFAULT_TLSV13_CIPHER_SUITES = strArr;
        } else {
            DEFAULT_TLSV13_CIPHER_SUITES = C0978k.EMPTY_STRINGS;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        linkedHashSet.add("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        linkedHashSet.add("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        linkedHashSet.add("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        linkedHashSet.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        linkedHashSet.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        linkedHashSet.add("TLS_RSA_WITH_AES_128_GCM_SHA256");
        linkedHashSet.add("TLS_RSA_WITH_AES_128_CBC_SHA");
        linkedHashSet.add("TLS_RSA_WITH_AES_256_CBC_SHA");
        Collections.addAll(linkedHashSet, DEFAULT_TLSV13_CIPHER_SUITES);
        DEFAULT_CIPHER_SUITES = (String[]) linkedHashSet.toArray(C0978k.EMPTY_STRINGS);
    }

    public static void addIfSupported(Set<String> set, List<String> list, String... strArr) {
        for (String str : strArr) {
            if (set.contains(str)) {
                list.add(str);
            }
        }
    }

    public static boolean arrayContains(String[] strArr, String str) {
        for (String equals : strArr) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getEncryptedPacketLength(S5.C0185n r6, int r7) {
        /*
            short r0 = r6.getUnsignedByte(r7)
            r1 = 1
            r2 = 0
            switch(r0) {
                case 20: goto L_0x000b;
                case 21: goto L_0x000b;
                case 22: goto L_0x000b;
                case 23: goto L_0x000b;
                case 24: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r3 = 3
            if (r0 == 0) goto L_0x002f
            int r4 = r7 + 1
            short r5 = r6.getUnsignedByte(r4)
            if (r5 == r3) goto L_0x0022
            short r4 = r6.getShort(r4)
            r5 = 257(0x101, float:3.6E-43)
            if (r4 != r5) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r4 = 0
            goto L_0x0031
        L_0x0022:
            int r4 = r7 + 3
            int r4 = unsignedShortBE((S5.C0185n) r6, (int) r4)
            r5 = 5
            int r4 = r4 + r5
            if (r4 > r5) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            r2 = r0
            goto L_0x0031
        L_0x002f:
            r2 = r0
            goto L_0x0020
        L_0x0031:
            if (r2 != 0) goto L_0x0064
            short r0 = r6.getUnsignedByte(r7)
            r0 = r0 & 128(0x80, float:1.794E-43)
            r2 = 2
            if (r0 == 0) goto L_0x003e
            r0 = 2
            goto L_0x003f
        L_0x003e:
            r0 = 3
        L_0x003f:
            int r4 = r7 + r0
            int r4 = r4 + r1
            short r1 = r6.getUnsignedByte(r4)
            if (r1 == r2) goto L_0x004d
            if (r1 != r3) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r6 = -2
            return r6
        L_0x004d:
            if (r0 != r2) goto L_0x0058
            short r6 = shortBE((S5.C0185n) r6, (int) r7)
            r6 = r6 & 32767(0x7fff, float:4.5916E-41)
            int r6 = r6 + r2
        L_0x0056:
            r4 = r6
            goto L_0x0060
        L_0x0058:
            short r6 = shortBE((S5.C0185n) r6, (int) r7)
            r6 = r6 & 16383(0x3fff, float:2.2957E-41)
            int r6 = r6 + r3
            goto L_0x0056
        L_0x0060:
            if (r4 > r0) goto L_0x0064
            r6 = -1
            return r6
        L_0x0064:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.H1.getEncryptedPacketLength(S5.n, int):int");
    }

    public static void handleHandshakeFailure(Y y8, Throwable th, boolean z) {
        y8.flush();
        if (z) {
            y8.fireUserEventTriggered(new D1(th));
        }
        y8.close();
    }

    public static boolean isTLSv13Cipher(String str) {
        return TLSV13_CIPHERS.contains(str);
    }

    private static boolean isTLSv13EnabledByJDK0(Provider provider) {
        try {
            return arrayContains(newInitContext(provider).getDefaultSSLParameters().getProtocols(), "TLSv1.3");
        } catch (Throwable th) {
            logger.debug("Unable to detect if JDK SSLEngine with provider {} enables TLSv1.3 by default, assuming no", provider, th);
            return false;
        }
    }

    public static boolean isTLSv13SupportedByJDK(Provider provider) {
        if (provider == null) {
            return TLSV1_3_JDK_SUPPORTED;
        }
        return isTLSv13SupportedByJDK0(provider);
    }

    private static boolean isTLSv13SupportedByJDK0(Provider provider) {
        try {
            return arrayContains(newInitContext(provider).getSupportedSSLParameters().getProtocols(), "TLSv1.3");
        } catch (Throwable th) {
            logger.debug("Unable to detect if JDK SSLEngine with provider {} supports TLSv1.3, assuming no", provider, th);
            return false;
        }
    }

    public static boolean isValidHostNameForSNI(String str) {
        if (str == null || str.indexOf(46) <= 0 || str.endsWith(".") || str.startsWith("/") || C0862v.isValidIpV4Address(str) || C0862v.isValidIpV6Address(str)) {
            return false;
        }
        return true;
    }

    private static SSLContext newInitContext(Provider provider) {
        SSLContext sSLContext;
        if (provider == null) {
            sSLContext = SSLContext.getInstance("TLS");
        } else {
            sSLContext = SSLContext.getInstance("TLS", provider);
        }
        sSLContext.init((KeyManager[]) null, new TrustManager[0], (SecureRandom) null);
        return sSLContext;
    }

    private static short shortBE(C0185n nVar, int i) {
        short s8 = nVar.getShort(i);
        return nVar.order() == ByteOrder.LITTLE_ENDIAN ? Short.reverseBytes(s8) : s8;
    }

    public static C0185n toBase64(C0187o oVar, C0185n nVar) {
        C0185n encode = a.encode(nVar, nVar.readerIndex(), nVar.readableBytes(), true, b.STANDARD, oVar);
        nVar.readerIndex(nVar.writerIndex());
        return encode;
    }

    private static short unsignedByte(byte b8) {
        return (short) (b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE);
    }

    private static int unsignedShortBE(C0185n nVar, int i) {
        int unsignedShort = nVar.getUnsignedShort(i);
        return nVar.order() == ByteOrder.LITTLE_ENDIAN ? Integer.reverseBytes(unsignedShort) >>> 16 : unsignedShort;
    }

    public static void useFallbackCiphersIfDefaultIsEmpty(List<String> list, Iterable<String> iterable) {
        if (list.isEmpty()) {
            for (String next : iterable) {
                if (!next.startsWith("SSL_") && !next.contains("_RC4_")) {
                    list.add(next);
                }
            }
        }
    }

    public static void zeroout(C0185n nVar) {
        if (!nVar.isReadOnly()) {
            nVar.setZero(0, nVar.capacity());
        }
    }

    public static void zerooutAndRelease(C0185n nVar) {
        zeroout(nVar);
        nVar.release();
    }

    private static short shortBE(ByteBuffer byteBuffer, int i) {
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? byteBuffer.getShort(i) : C0206y.swapShort(byteBuffer.getShort(i));
    }

    private static int unsignedShortBE(ByteBuffer byteBuffer, int i) {
        return shortBE(byteBuffer, i) & 65535;
    }

    public static void useFallbackCiphersIfDefaultIsEmpty(List<String> list, String... strArr) {
        useFallbackCiphersIfDefaultIsEmpty(list, (Iterable<String>) Arrays.asList(strArr));
    }

    public static int getEncryptedPacketLength(ByteBuffer[] byteBufferArr, int i) {
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer.remaining() >= 5) {
            return getEncryptedPacketLength(byteBuffer);
        }
        ByteBuffer allocate = ByteBuffer.allocate(5);
        while (true) {
            int i8 = i + 1;
            ByteBuffer duplicate = byteBufferArr[i].duplicate();
            if (duplicate.remaining() > allocate.remaining()) {
                duplicate.limit(allocate.remaining() + duplicate.position());
            }
            allocate.put(duplicate);
            if (!allocate.hasRemaining()) {
                allocate.flip();
                return getEncryptedPacketLength(allocate);
            }
            i = i8;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getEncryptedPacketLength(java.nio.ByteBuffer r7) {
        /*
            int r0 = r7.position()
            byte r1 = r7.get(r0)
            short r1 = unsignedByte(r1)
            r2 = 1
            r3 = 0
            switch(r1) {
                case 20: goto L_0x0013;
                case 21: goto L_0x0013;
                case 22: goto L_0x0013;
                case 23: goto L_0x0013;
                case 24: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            r4 = 3
            if (r1 == 0) goto L_0x003b
            int r5 = r0 + 1
            byte r6 = r7.get(r5)
            short r6 = unsignedByte(r6)
            if (r6 == r4) goto L_0x002e
            short r5 = r7.getShort(r5)
            r6 = 257(0x101, float:3.6E-43)
            if (r5 != r6) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r5 = 0
            goto L_0x003d
        L_0x002e:
            int r5 = r0 + 3
            int r5 = unsignedShortBE((java.nio.ByteBuffer) r7, (int) r5)
            r6 = 5
            int r5 = r5 + r6
            if (r5 > r6) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            r3 = r1
            goto L_0x003d
        L_0x003b:
            r3 = r1
            goto L_0x002c
        L_0x003d:
            if (r3 != 0) goto L_0x0078
            byte r1 = r7.get(r0)
            short r1 = unsignedByte(r1)
            r1 = r1 & 128(0x80, float:1.794E-43)
            r3 = 2
            if (r1 == 0) goto L_0x004e
            r1 = 2
            goto L_0x004f
        L_0x004e:
            r1 = 3
        L_0x004f:
            int r5 = r0 + r1
            int r5 = r5 + r2
            byte r2 = r7.get(r5)
            short r2 = unsignedByte(r2)
            if (r2 == r3) goto L_0x0061
            if (r2 != r4) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r7 = -2
            return r7
        L_0x0061:
            if (r1 != r3) goto L_0x006c
            short r7 = shortBE((java.nio.ByteBuffer) r7, (int) r0)
            r7 = r7 & 32767(0x7fff, float:4.5916E-41)
            int r7 = r7 + r3
        L_0x006a:
            r5 = r7
            goto L_0x0074
        L_0x006c:
            short r7 = shortBE((java.nio.ByteBuffer) r7, (int) r0)
            r7 = r7 & 16383(0x3fff, float:2.2957E-41)
            int r7 = r7 + r4
            goto L_0x006a
        L_0x0074:
            if (r5 > r1) goto L_0x0078
            r7 = -1
            return r7
        L_0x0078:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.H1.getEncryptedPacketLength(java.nio.ByteBuffer):int");
    }
}
