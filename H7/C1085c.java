package h7;

import D6.s;
import D6.u;
import Y6.r;
import b7.C0598d;
import f7.f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: h7.c  reason: case insensitive filesystem */
public abstract class C1085c {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet f12620a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f12621b;

    static {
        String str;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<r> cls = r.class;
        Package packageR = cls.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(cls.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C0598d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = s.f1270U;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap);
        } else {
            map = u.G(linkedHashMap);
        }
        f12621b = map;
    }
}
