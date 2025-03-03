package U7;

import D4.h;
import Q7.g;
import S7.k;
import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.List;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public final class d extends ArrayList implements List {
    public final void clear() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((k) it.next()).y();
        }
        super.clear();
    }

    public final Object clone() {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((k) it.next()).h());
        }
        return arrayList;
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable.-CC.$default$forEach(this, consumer);
    }

    public final Object remove(int i) {
        k kVar = (k) super.remove(i);
        kVar.y();
        return kVar;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean removeIf(Predicate predicate) {
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test((k) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        for (int i = 0; i < size(); i++) {
            k kVar = (k) unaryOperator.apply((k) get(i));
            g.D(kVar);
            ((k) super.set(i, kVar)).A(kVar);
        }
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains((k) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final Object set(int i, Object obj) {
        k kVar = (k) obj;
        g.D(kVar);
        k kVar2 = (k) super.set(i, kVar);
        kVar2.A(kVar);
        return kVar2;
    }

    public final /* synthetic */ void sort(Comparator comparator) {
        List.-CC.$default$sort(this, comparator);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.-CC.$default$toArray(this, intFunction);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.function.BiConsumer, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, java.util.function.BinaryOperator] */
    public final String toString() {
        Stream map = Collection.-EL.stream(this).map(new h(10));
        String[] strArr = R7.h.f4371a;
        return (String) map.collect(Collector.-CC.of(new R7.d("\n"), new Object(), new Object(), new h(6), new Collector.Characteristics[0]));
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        ((k) super.remove(indexOf)).y();
        return true;
    }
}
