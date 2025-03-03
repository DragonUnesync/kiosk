package f4;

import e4.C0839a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f4.a  reason: case insensitive filesystem */
public final class C0900a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11672a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry entry : this.f11672a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i) {
                i = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return C0839a.a(arrayList);
    }

    public final void b(int i) {
        HashMap hashMap = this.f11672a;
        Integer num = (Integer) hashMap.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        hashMap.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
