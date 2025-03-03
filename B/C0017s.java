package B;

import D.C0033a0;
import D.C0071z;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: B.s  reason: case insensitive filesystem */
public final class C0017s {

    /* renamed from: b  reason: collision with root package name */
    public static final C0017s f303b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0017s f304c;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f305a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C0033a0(0));
        f303b = new C0017s(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C0033a0(1));
        f304c = new C0017s(linkedHashSet2);
    }

    public C0017s(LinkedHashSet linkedHashSet) {
        this.f305a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f305a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((C0016q) it.next()).b(DesugarCollections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.f305a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            C0016q qVar = (C0016q) it.next();
            if (qVar instanceof C0033a0) {
                Integer valueOf = Integer.valueOf(((C0033a0) qVar).f882b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final C0071z c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0071z) it.next()).a());
        }
        List a8 = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            C0071z zVar = (C0071z) it2.next();
            if (a8.contains(zVar.a())) {
                linkedHashSet2.add(zVar);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (C0071z) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
