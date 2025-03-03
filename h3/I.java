package H3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f2014a;

    /* renamed from: b  reason: collision with root package name */
    public int f2015b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2016c;

    public I(int i) {
        C0103u.e(i, "initialCapacity");
        this.f2014a = new Object[i];
    }

    public static int f(int i, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        } else if (i8 <= i) {
            return i;
        } else {
            int i9 = i + (i >> 1) + 1;
            if (i9 < i8) {
                i9 = Integer.highestOneBit(i8 - 1) << 1;
            }
            if (i9 < 0) {
                return Integer.MAX_VALUE;
            }
            return i9;
        }
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f2014a;
        int i = this.f2015b;
        this.f2015b = i + 1;
        objArr[i] = obj;
    }

    public abstract I b(Object obj);

    public void c(Object obj) {
        a(obj);
    }

    public final void d(List list) {
        if (list instanceof Collection) {
            e(list.size());
            if (list instanceof J) {
                this.f2015b = ((J) list).c(this.f2015b, this.f2014a);
                return;
            }
        }
        for (Object b8 : list) {
            b(b8);
        }
    }

    public final void e(int i) {
        Object[] objArr = this.f2014a;
        int f8 = f(objArr.length, this.f2015b + i);
        if (f8 > objArr.length || this.f2016c) {
            this.f2014a = Arrays.copyOf(this.f2014a, f8);
            this.f2016c = false;
        }
    }
}
