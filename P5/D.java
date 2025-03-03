package P5;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

public final class D implements Iterable {

    /* renamed from: U  reason: collision with root package name */
    public final HashMap f3806U = new HashMap();

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f3807V = new ArrayList();

    public D(HashMap hashMap) {
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String trim : str.split(";")) {
                String[] split = trim.trim().split("=");
                if (split.length == 2) {
                    this.f3806U.put(split[0], split[1]);
                }
            }
        }
    }

    public final void b(int i, String str) {
        ArrayList arrayList = this.f3807V;
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        instance.add(5, i);
        arrayList.add(new C(str, simpleDateFormat.format(instance.getTime())));
    }

    public final void c(K k8) {
        Iterator it = this.f3807V.iterator();
        while (it.hasNext()) {
            C c8 = (C) it.next();
            StringBuilder sb = new StringBuilder("FullyRemoteSession=");
            c8.getClass();
            sb.append(c8.f3804a);
            sb.append("; expires=");
            sb.append(c8.f3805b);
            k8.k("Set-Cookie", sb.toString());
        }
    }

    public final Iterator iterator() {
        return this.f3806U.keySet().iterator();
    }
}
