package D6;

import P6.f;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class b implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1253U;

    /* renamed from: V  reason: collision with root package name */
    public int f1254V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f1255W;

    public /* synthetic */ b(int i, Object obj) {
        this.f1253U = i;
        this.f1255W = obj;
    }

    public final boolean hasNext() {
        Iterator it;
        switch (this.f1253U) {
            case 0:
                if (this.f1254V < ((e) this.f1255W).b()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f1254V < ((Object[]) this.f1255W).length) {
                    return true;
                }
                return false;
            case 2:
                break;
            default:
                if (this.f1254V < ((ViewGroup) this.f1255W).getChildCount()) {
                    return true;
                }
                return false;
        }
        while (true) {
            int i = this.f1254V;
            it = (Iterator) this.f1255W;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f1254V--;
            }
        }
        return it.hasNext();
    }

    public final Object next() {
        Iterator it;
        switch (this.f1253U) {
            case 0:
                if (hasNext()) {
                    int i = this.f1254V;
                    this.f1254V = i + 1;
                    return ((e) this.f1255W).get(i);
                }
                throw new NoSuchElementException();
            case 1:
                try {
                    int i8 = this.f1254V;
                    this.f1254V = i8 + 1;
                    return ((Object[]) this.f1255W)[i8];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f1254V--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                break;
            default:
                int i9 = this.f1254V;
                this.f1254V = i9 + 1;
                View childAt = ((ViewGroup) this.f1255W).getChildAt(i9);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
        while (true) {
            int i10 = this.f1254V;
            it = (Iterator) this.f1255W;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f1254V--;
            }
        }
        return it.next();
    }

    public final void remove() {
        switch (this.f1253U) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.f1254V - 1;
                this.f1254V = i;
                ((ViewGroup) this.f1255W).removeViewAt(i);
                return;
        }
    }

    public b(Object[] objArr) {
        this.f1253U = 1;
        f.e(objArr, "array");
        this.f1255W = objArr;
    }

    public b(V6.b bVar) {
        this.f1253U = 2;
        this.f1255W = bVar.f5990a.iterator();
        this.f1254V = bVar.f5991b;
    }
}
