package V6;

import C6.g;
import F6.a;
import F6.b;
import F6.c;
import P6.f;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator, a {

    /* renamed from: U  reason: collision with root package name */
    public int f5992U;

    /* renamed from: V  reason: collision with root package name */
    public Object f5993V;

    /* renamed from: W  reason: collision with root package name */
    public Iterator f5994W;

    /* renamed from: X  reason: collision with root package name */
    public a f5995X;

    public final b a() {
        return c.f1592U;
    }

    public final void b(Object obj) {
        n2.a.h1(obj);
        this.f5992U = 4;
    }

    public final RuntimeException c() {
        int i = this.f5992U;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f5992U);
    }

    public final boolean hasNext() {
        while (true) {
            int i = this.f5992U;
            if (i != 0) {
                if (i == 1) {
                    Iterator it = this.f5994W;
                    f.b(it);
                    if (it.hasNext()) {
                        this.f5992U = 2;
                        return true;
                    }
                    this.f5994W = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
            }
            this.f5992U = 5;
            a aVar = this.f5995X;
            f.b(aVar);
            this.f5995X = null;
            aVar.b(g.f721c);
        }
    }

    public final Object next() {
        int i = this.f5992U;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.f5992U = 1;
            Iterator it = this.f5994W;
            f.b(it);
            return it.next();
        } else if (i == 3) {
            this.f5992U = 0;
            Object obj = this.f5993V;
            this.f5993V = null;
            return obj;
        } else {
            throw c();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
