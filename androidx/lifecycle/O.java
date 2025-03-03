package androidx.lifecycle;

import java.util.LinkedHashMap;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f8131a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f8131a;
        for (M clear : linkedHashMap.values()) {
            clear.clear();
        }
        linkedHashMap.clear();
    }
}
