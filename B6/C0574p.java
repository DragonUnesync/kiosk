package b6;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b6.p  reason: case insensitive filesystem */
public abstract class C0574p {
    private static final Map<String, String> mappings;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("secp224r1", "P-224");
        hashMap.put("prime256v1", "P-256");
        hashMap.put("secp256r1", "P-256");
        hashMap.put("secp384r1", "P-384");
        hashMap.put("secp521r1", "P-521");
        hashMap.put("x25519", "X25519");
        mappings = DesugarCollections.unmodifiableMap(hashMap);
    }

    public static String toOpenSsl(String str) {
        String str2 = mappings.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }
}
