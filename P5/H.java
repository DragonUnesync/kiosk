package P5;

import java.util.HashMap;

public final class H extends HashMap {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ K f3826U;

    public H(K k8) {
        this.f3826U = k8;
    }

    public final Object put(Object obj, Object obj2) {
        String str;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        HashMap hashMap = this.f3826U.f3841Z;
        if (str2 == null) {
            str = str2;
        } else {
            str = str2.toLowerCase();
        }
        hashMap.put(str, str3);
        return (String) super.put(str2, str3);
    }
}
