package V6;

import D6.b;
import D6.i;
import D6.j;
import P6.f;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f5996U;

    /* renamed from: V  reason: collision with root package name */
    public Iterator f5997V;

    /* renamed from: W  reason: collision with root package name */
    public Object f5998W;

    public g(Iterator it) {
        this.f5996U = 1;
        f.e(it, "iterator");
        this.f5997V = it;
    }

    public final boolean hasNext() {
        Object obj;
        switch (this.f5996U) {
            case 0:
                return this.f5997V.hasNext();
            case 1:
                if (this.f5998W != null) {
                    return true;
                }
                do {
                    Iterator it = this.f5997V;
                    if (!it.hasNext()) {
                        return false;
                    }
                    obj = ((WeakReference) it.next()).get();
                } while (obj == null);
                this.f5998W = obj;
                return true;
            default:
                return this.f5997V.hasNext();
        }
    }

    public final Object next() {
        ViewGroup viewGroup;
        switch (this.f5996U) {
            case 0:
                return ((h) this.f5998W).f6000b.a(this.f5997V.next());
            case 1:
                Object obj = this.f5998W;
                this.f5998W = null;
                while (obj == null) {
                    obj = ((WeakReference) this.f5997V.next()).get();
                }
                return obj;
            default:
                Object next = this.f5997V.next();
                View view = (View) next;
                b bVar = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    bVar = new b(3, viewGroup);
                }
                ArrayList arrayList = (ArrayList) this.f5998W;
                if (bVar == null || !bVar.hasNext()) {
                    while (!this.f5997V.hasNext() && !arrayList.isEmpty()) {
                        this.f5997V = (Iterator) i.Q(arrayList);
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(j.K(arrayList));
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    }
                } else {
                    arrayList.add(this.f5997V);
                    this.f5997V = bVar;
                }
                return next;
        }
    }

    public final void remove() {
        switch (this.f5996U) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                this.f5997V.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(b bVar) {
        this.f5996U = 2;
        this.f5998W = new ArrayList();
        this.f5997V = bVar;
    }

    public g(h hVar) {
        this.f5996U = 0;
        this.f5998W = hVar;
        this.f5997V = hVar.f5999a.iterator();
    }
}
