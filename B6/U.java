package b6;

import java.util.HashMap;
import java.util.Map;

public final class U {
    private static final Map<String, String> KEY_TYPES;
    private final V provider;

    static {
        HashMap hashMap = new HashMap();
        KEY_TYPES = hashMap;
        hashMap.put("RSA", "RSA");
        hashMap.put("DHE_RSA", "RSA");
        hashMap.put("ECDHE_RSA", "RSA");
        hashMap.put("ECDHE_ECDSA", "EC");
        hashMap.put("ECDH_RSA", "EC_RSA");
        hashMap.put("ECDH_ECDSA", "EC_EC");
        hashMap.put("DH_RSA", "DH_RSA");
    }

    public U(V v4) {
        this.provider = v4;
    }
}
