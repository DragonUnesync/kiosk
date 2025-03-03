package U7;

import C4.d;
import j$.util.Comparator;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class c extends p {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5436a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5437b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f5438c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f5439d = 0;

    public final int a() {
        return this.f5439d;
    }

    public final void c() {
        Iterator it = this.f5436a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).c();
        }
    }

    public final void d() {
        ArrayList arrayList = this.f5436a;
        this.f5438c = arrayList.size();
        this.f5439d = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f5439d = ((p) it.next()).a() + this.f5439d;
        }
        ArrayList arrayList2 = this.f5437b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        List.-EL.sort(arrayList2, Comparator.-CC.comparingInt(new d(3)));
    }
}
