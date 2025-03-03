package Y;

import P6.f;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class c implements Iterator, Map.Entry {

    /* renamed from: U  reason: collision with root package name */
    public int f6289U;

    /* renamed from: V  reason: collision with root package name */
    public int f6290V = -1;

    /* renamed from: W  reason: collision with root package name */
    public boolean f6291W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ e f6292X;

    public c(e eVar) {
        this.f6292X = eVar;
        this.f6289U = eVar.f6308W - 1;
    }

    public final boolean equals(Object obj) {
        if (!this.f6291W) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f6290V;
            e eVar = this.f6292X;
            if (!f.a(key, eVar.f(i)) || !f.a(entry.getValue(), eVar.j(this.f6290V))) {
                return false;
            }
            return true;
        }
    }

    public final Object getKey() {
        if (this.f6291W) {
            return this.f6292X.f(this.f6290V);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f6291W) {
            return this.f6292X.j(this.f6290V);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        if (this.f6290V < this.f6289U) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.f6291W) {
            int i8 = this.f6290V;
            e eVar = this.f6292X;
            Object f8 = eVar.f(i8);
            Object j7 = eVar.j(this.f6290V);
            int i9 = 0;
            if (f8 == null) {
                i = 0;
            } else {
                i = f8.hashCode();
            }
            if (j7 != null) {
                i9 = j7.hashCode();
            }
            return i ^ i9;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object next() {
        if (hasNext()) {
            this.f6290V++;
            this.f6291W = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f6291W) {
            this.f6292X.h(this.f6290V);
            this.f6290V--;
            this.f6289U--;
            this.f6291W = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f6291W) {
            return this.f6292X.i(this.f6290V, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
