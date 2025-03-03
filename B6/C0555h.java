package b6;

import N.e;
import g6.Y;
import h6.C1082c;
import h6.d;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: b6.h  reason: case insensitive filesystem */
public abstract class C0555h {
    private static final Pattern JAVA_AES_CBC_PATTERN = Pattern.compile("^(AES)_([0-9]+)_CBC$");
    private static final Pattern JAVA_AES_PATTERN = Pattern.compile("^(AES)_([0-9]+)_(.*)$");
    private static final Pattern JAVA_CIPHERSUITE_PATTERN = Pattern.compile("^(?:TLS|SSL)_((?:(?!_WITH_).)+)_WITH_(.*)_(.*)$");
    private static final Pattern OPENSSL_AES_CBC_PATTERN = Pattern.compile("^(AES)([0-9]+)$");
    private static final Pattern OPENSSL_AES_PATTERN = Pattern.compile("^(AES)([0-9]+)-(.*)$");
    private static final Pattern OPENSSL_CIPHERSUITE_PATTERN = Pattern.compile("^(?:((?:(?:EXP-)?(?:(?:DHE|EDH|ECDH|ECDHE|SRP|RSA)-(?:DSS|RSA|ECDSA|PSK)|(?:ADH|AECDH|KRB5|PSK|SRP)))|EXP)-)?(.*)-(.*)$");
    private static final ConcurrentMap<String, C0552g> j2o = Y.newConcurrentHashMap();
    private static final Map<String, String> j2oTls13;
    private static final C1082c logger = d.getInstance((Class<?>) C0555h.class);
    private static final ConcurrentMap<String, Map<String, String>> o2j = Y.newConcurrentHashMap();
    private static final Map<String, Map<String, String>> o2jTls13;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("TLS_AES_128_GCM_SHA256", "AEAD-AES128-GCM-SHA256");
        hashMap.put("TLS_AES_256_GCM_SHA384", "AEAD-AES256-GCM-SHA384");
        hashMap.put("TLS_CHACHA20_POLY1305_SHA256", "AEAD-CHACHA20-POLY1305-SHA256");
        j2oTls13 = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("TLS_AES_128_GCM_SHA256", Collections.singletonMap("TLS", "TLS_AES_128_GCM_SHA256"));
        hashMap2.put("TLS_AES_256_GCM_SHA384", Collections.singletonMap("TLS", "TLS_AES_256_GCM_SHA384"));
        hashMap2.put("TLS_CHACHA20_POLY1305_SHA256", Collections.singletonMap("TLS", "TLS_CHACHA20_POLY1305_SHA256"));
        hashMap2.put("AEAD-AES128-GCM-SHA256", Collections.singletonMap("TLS", "TLS_AES_128_GCM_SHA256"));
        hashMap2.put("AEAD-AES256-GCM-SHA384", Collections.singletonMap("TLS", "TLS_AES_256_GCM_SHA384"));
        hashMap2.put("AEAD-CHACHA20-POLY1305-SHA256", Collections.singletonMap("TLS", "TLS_CHACHA20_POLY1305_SHA256"));
        o2jTls13 = DesugarCollections.unmodifiableMap(hashMap2);
    }

    private static String cacheFromJava(String str, boolean z) {
        String str2 = j2oTls13.get(str);
        if (str2 == null) {
            String openSslUncached = toOpenSslUncached(str, z);
            j2o.putIfAbsent(str, C0552g.of(openSslUncached));
            if (openSslUncached == null) {
                return null;
            }
            String substring = str.substring(4);
            HashMap hashMap = new HashMap(4);
            hashMap.put("", substring);
            hashMap.put("SSL", "SSL_" + substring);
            hashMap.put("TLS", "TLS_" + substring);
            o2j.put(openSslUncached, hashMap);
            logger.debug("Cipher suite mapping: {} => {}", str, openSslUncached);
            return openSslUncached;
        } else if (z) {
            return str2;
        } else {
            return str;
        }
    }

    private static Map<String, String> cacheFromOpenSsl(String str) {
        Map<String, String> map = o2jTls13.get(str);
        if (map != null) {
            return map;
        }
        String javaUncached0 = toJavaUncached0(str, false);
        if (javaUncached0 == null) {
            return null;
        }
        String concat = "SSL_".concat(javaUncached0);
        String concat2 = "TLS_".concat(javaUncached0);
        HashMap hashMap = new HashMap(4);
        hashMap.put("", javaUncached0);
        hashMap.put("SSL", concat);
        hashMap.put("TLS", concat2);
        o2j.putIfAbsent(str, hashMap);
        C0552g of = C0552g.of(str);
        ConcurrentMap<String, C0552g> concurrentMap = j2o;
        concurrentMap.putIfAbsent(concat2, of);
        concurrentMap.putIfAbsent(concat, of);
        C1082c cVar = logger;
        cVar.debug("Cipher suite mapping: {} => {}", concat2, str);
        cVar.debug("Cipher suite mapping: {} => {}", concat, str);
        return hashMap;
    }

    public static void convertToCipherStrings(Iterable<String> iterable, StringBuilder sb, StringBuilder sb2, boolean z) {
        String next;
        Iterator<String> it = iterable.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            String openSsl = toOpenSsl(next, z);
            if (openSsl == null) {
                openSsl = next;
            }
            if (!F.isCipherSuiteAvailable(openSsl)) {
                throw new IllegalArgumentException("unsupported cipher suite: " + next + '(' + openSsl + ')');
            } else if (H1.isTLSv13Cipher(openSsl) || H1.isTLSv13Cipher(next)) {
                sb2.append(openSsl);
                sb2.append(':');
            } else {
                sb.append(openSsl);
                sb.append(':');
            }
        }
        if (sb.length() == 0 && sb2.length() == 0) {
            throw new IllegalArgumentException("empty cipher suites");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
    }

    public static String toJava(String str, String str2) {
        Map<String, String> map = o2j.get(str);
        if (map == null && (map = cacheFromOpenSsl(str)) == null) {
            return null;
        }
        String str3 = map.get(str2);
        if (str3 != null) {
            return str3;
        }
        String str4 = map.get("");
        if (str4 == null) {
            return null;
        }
        return str2 + '_' + str4;
    }

    private static String toJavaBulkCipher(String str, boolean z) {
        if (str.startsWith("AES")) {
            Matcher matcher = OPENSSL_AES_CBC_PATTERN.matcher(str);
            if (matcher.matches()) {
                return matcher.replaceFirst("$1_$2_CBC");
            }
            Matcher matcher2 = OPENSSL_AES_PATTERN.matcher(str);
            if (matcher2.matches()) {
                return matcher2.replaceFirst("$1_$2_$3");
            }
        }
        if ("DES-CBC3".equals(str)) {
            return "3DES_EDE_CBC";
        }
        if ("RC4".equals(str)) {
            if (z) {
                return "RC4_40";
            }
            return "RC4_128";
        } else if ("DES-CBC".equals(str)) {
            if (z) {
                return "DES_CBC_40";
            }
            return "DES_CBC";
        } else if (!"RC2-CBC".equals(str)) {
            return str.replace('-', '_');
        } else {
            if (z) {
                return "RC2_CBC_40";
            }
            return "RC2_CBC";
        }
    }

    private static String toJavaHandshakeAlgo(String str, boolean z) {
        if (str.isEmpty()) {
            str = "RSA";
        } else if ("ADH".equals(str)) {
            str = "DH_anon";
        } else if ("AECDH".equals(str)) {
            str = "ECDH_anon";
        }
        String replace = str.replace('-', '_');
        if (z) {
            return e.x(replace, "_EXPORT");
        }
        return replace;
    }

    private static String toJavaHmacAlgo(String str) {
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String toJavaUncached0(java.lang.String r4, boolean r5) {
        /*
            if (r5 == 0) goto L_0x0015
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r5 = o2jTls13
            java.lang.Object r5 = r5.get(r4)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x0015
            java.lang.String r4 = "TLS"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            java.util.regex.Pattern r5 = OPENSSL_CIPHERSUITE_PATTERN
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.matches()
            if (r5 != 0) goto L_0x0023
            r4 = 0
            return r4
        L_0x0023:
            r5 = 1
            java.lang.String r0 = r4.group(r5)
            r1 = 0
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0030
            r0 = r2
        L_0x002e:
            r5 = 0
            goto L_0x0047
        L_0x0030:
            java.lang.String r3 = "EXP-"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x003e
            r1 = 4
            java.lang.String r0 = r0.substring(r1)
            goto L_0x0047
        L_0x003e:
            java.lang.String r3 = "EXP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x002e
            r0 = r2
        L_0x0047:
            java.lang.String r0 = toJavaHandshakeAlgo(r0, r5)
            r1 = 2
            java.lang.String r1 = r4.group(r1)
            java.lang.String r5 = toJavaBulkCipher(r1, r5)
            r1 = 3
            java.lang.String r4 = r4.group(r1)
            java.lang.String r4 = toJavaHmacAlgo(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_WITH_"
            r1.append(r0)
            r1.append(r5)
            r0 = 95
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "CHACHA20"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L_0x0087
            java.lang.String r5 = "_SHA256"
            java.lang.String r4 = N.e.x(r4, r5)
        L_0x0087:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0555h.toJavaUncached0(java.lang.String, boolean):java.lang.String");
    }

    public static String toOpenSsl(String str, boolean z) {
        C0552g gVar = j2o.get(str);
        if (gVar != null) {
            return gVar.value;
        }
        return cacheFromJava(str, z);
    }

    private static String toOpenSslBulkCipher(String str) {
        if (str.startsWith("AES_")) {
            Matcher matcher = JAVA_AES_CBC_PATTERN.matcher(str);
            if (matcher.matches()) {
                return matcher.replaceFirst("$1$2");
            }
            Matcher matcher2 = JAVA_AES_PATTERN.matcher(str);
            if (matcher2.matches()) {
                return matcher2.replaceFirst("$1$2-$3");
            }
        }
        if ("3DES_EDE_CBC".equals(str)) {
            return "DES-CBC3";
        }
        if ("RC4_128".equals(str) || "RC4_40".equals(str)) {
            return "RC4";
        }
        if ("DES40_CBC".equals(str) || "DES_CBC_40".equals(str)) {
            return "DES-CBC";
        }
        if ("RC2_CBC_40".equals(str)) {
            return "RC2-CBC";
        }
        return str.replace('_', '-');
    }

    private static String toOpenSslHandshakeAlgo(String str) {
        boolean endsWith = str.endsWith("_EXPORT");
        if (endsWith) {
            str = str.substring(0, str.length() - 7);
        }
        if ("RSA".equals(str)) {
            str = "";
        } else if (str.endsWith("_anon")) {
            str = "A" + str.substring(0, str.length() - 5);
        }
        if (endsWith) {
            if (str.isEmpty()) {
                str = "EXP";
            } else {
                str = "EXP-".concat(str);
            }
        }
        return str.replace('_', '-');
    }

    private static String toOpenSslHmacAlgo(String str) {
        return str;
    }

    public static String toOpenSslUncached(String str, boolean z) {
        String str2 = j2oTls13.get(str);
        if (str2 == null) {
            Matcher matcher = JAVA_CIPHERSUITE_PATTERN.matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String openSslHandshakeAlgo = toOpenSslHandshakeAlgo(matcher.group(1));
            String openSslBulkCipher = toOpenSslBulkCipher(matcher.group(2));
            String openSslHmacAlgo = toOpenSslHmacAlgo(matcher.group(3));
            if (openSslHandshakeAlgo.isEmpty()) {
                return openSslBulkCipher + '-' + openSslHmacAlgo;
            } else if (openSslBulkCipher.contains("CHACHA20")) {
                return openSslHandshakeAlgo + '-' + openSslBulkCipher;
            } else {
                return openSslHandshakeAlgo + '-' + openSslBulkCipher + '-' + openSslHmacAlgo;
            }
        } else if (z) {
            return str2;
        } else {
            return str;
        }
    }
}
