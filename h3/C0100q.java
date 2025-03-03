package H3;

import N7.a;
import V6.g;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: H3.q  reason: case insensitive filesystem */
public final class C0100q extends AbstractCollection {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2111U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f2112V;

    public /* synthetic */ C0100q(int i, Serializable serializable) {
        this.f2111U = i;
        this.f2112V = serializable;
    }

    public boolean add(Object obj) {
        switch (this.f2111U) {
            case 3:
                return ((ArrayList) this.f2112V).add(new WeakReference(obj));
            default:
                return super.add(obj);
        }
    }

    public final void clear() {
        switch (this.f2111U) {
            case 0:
                ((C0098o) this.f2112V).c();
                return;
            case 1:
                ((C0107y) this.f2112V).clear();
                return;
            case 2:
                ((C0087d) this.f2112V).clear();
                return;
            default:
                ((ArrayList) this.f2112V).clear();
                return;
        }
    }

    public boolean contains(Object obj) {
        switch (this.f2111U) {
            case 0:
                return ((C0098o) this.f2112V).b(obj);
            case 2:
                return ((C0087d) this.f2112V).containsValue(obj);
            case 3:
                if (obj == null) {
                    return false;
                }
                Iterator it = ((ArrayList) this.f2112V).iterator();
                while (it.hasNext()) {
                    if (obj.equals(((WeakReference) it.next()).get())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    public boolean isEmpty() {
        switch (this.f2111U) {
            case 2:
                return ((C0087d) this.f2112V).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    public final Iterator iterator() {
        switch (this.f2111U) {
            case 0:
                return new C0084a((C0098o) this.f2112V);
            case 1:
                C0107y yVar = (C0107y) this.f2112V;
                Map c8 = yVar.c();
                if (c8 != null) {
                    return c8.values().iterator();
                }
                return new C0104v(yVar, 2);
            case 2:
                return new w0(((C0087d) this.f2112V).entrySet().iterator());
            default:
                return new g(((ArrayList) this.f2112V).iterator());
        }
    }

    public boolean remove(Object obj) {
        switch (this.f2111U) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0087d dVar = (C0087d) this.f2112V;
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (a.e(obj, entry.getValue())) {
                            dVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
                if (obj == null) {
                    return false;
                }
                ArrayList arrayList = (ArrayList) this.f2112V;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (obj.equals(((WeakReference) arrayList.get(i)).get())) {
                        arrayList.remove(i);
                        return true;
                    }
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    public boolean removeAll(Collection collection) {
        switch (this.f2111U) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0087d dVar = (C0087d) this.f2112V;
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    public boolean retainAll(Collection collection) {
        switch (this.f2111U) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0087d dVar = (C0087d) this.f2112V;
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    public final int size() {
        switch (this.f2111U) {
            case 0:
                return ((C0098o) this.f2112V).f2102Y;
            case 1:
                return ((C0107y) this.f2112V).size();
            case 2:
                return ((C0087d) this.f2112V).f2061W.size();
            default:
                ArrayList arrayList = (ArrayList) this.f2112V;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference.get() == null) {
                        arrayList.remove(weakReference);
                    }
                }
                return arrayList.size();
        }
    }

    public C0100q() {
        this.f2111U = 3;
        this.f2112V = new ArrayList();
    }

    public C0100q(C0087d dVar) {
        this.f2111U = 2;
        this.f2112V = dVar;
    }
}
