package de.ozerov.fully;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j5 extends CookieManager {

    /* renamed from: a  reason: collision with root package name */
    public final android.webkit.CookieManager f10761a = android.webkit.CookieManager.getInstance();

    public j5() {
        super((CookieStore) null, (CookiePolicy) null);
    }

    public final Map get(URI uri, Map map) {
        if (uri == null || map == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        String uri2 = uri.toString();
        HashMap hashMap = new HashMap();
        String cookie = this.f10761a.getCookie(uri2);
        if (cookie != null) {
            hashMap.put("Cookie", Arrays.asList(new String[]{cookie}));
        }
        return hashMap;
    }

    public final CookieStore getCookieStore() {
        throw new UnsupportedOperationException();
    }

    public final void put(URI uri, Map map) {
        if (uri != null && map != null) {
            String uri2 = uri.toString();
            for (String str : map.keySet()) {
                if (str != null && (str.equalsIgnoreCase("Set-Cookie2") || str.equalsIgnoreCase("Set-Cookie"))) {
                    for (String cookie : (List) map.get(str)) {
                        this.f10761a.setCookie(uri2, cookie);
                    }
                }
            }
        }
    }
}
