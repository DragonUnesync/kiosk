package Q7;

import R7.b;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class c {
    public static final URL e;

    /* renamed from: a  reason: collision with root package name */
    public URL f4197a = e;

    /* renamed from: b  reason: collision with root package name */
    public int f4198b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f4199c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f4200d = new LinkedHashMap();

    static {
        try {
            e = new URL("http://undefined/");
        } catch (MalformedURLException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public final void a(String str, String str2) {
        g.C(str, "name");
        if (str2 == null) {
            str2 = "";
        }
        g.C(str, "name");
        List b8 = b(str);
        if (b8.isEmpty()) {
            b8 = new ArrayList();
            this.f4199c.put(str, b8);
        }
        b8.add(str2);
    }

    public final List b(String str) {
        for (Map.Entry entry : this.f4199c.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (List) entry.getValue();
            }
        }
        return Collections.emptyList();
    }

    public final boolean c(String str) {
        g.A("Content-Encoding");
        g.A(str);
        g.C("Content-Encoding", "name");
        for (String equalsIgnoreCase : b("Content-Encoding")) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        Map.Entry entry;
        g.C("Content-Type", "name");
        String a8 = b.a("Content-Type");
        LinkedHashMap linkedHashMap = this.f4199c;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
            if (b.a((String) entry.getKey()).equals(a8)) {
                break;
            }
        }
        if (entry != null) {
            linkedHashMap.remove(entry.getKey());
        }
    }

    public final URL e() {
        URL url = this.f4197a;
        if (url != e) {
            return url;
        }
        throw new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
    }
}
