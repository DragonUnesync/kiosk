package D0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import v0.C1510H;
import v0.C1528a;
import v0.C1529b;
import z3.e;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public int f977a;

    /* renamed from: b  reason: collision with root package name */
    public int f978b;

    /* renamed from: c  reason: collision with root package name */
    public int f979c;

    /* renamed from: d  reason: collision with root package name */
    public Object f980d;

    public c() {
        if (e.f16452V == null) {
            e.f16452V = new e(16);
        }
    }

    public int a(int i) {
        if (i < this.f979c) {
            return ((ByteBuffer) this.f980d).getShort(this.f978b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object obj2;
        C1529b bVar;
        if (Build.VERSION.SDK_INT >= this.f978b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f978b) {
            obj2 = b(view);
        } else {
            obj2 = view.getTag(this.f977a);
            if (!((Class) this.f980d).isInstance(obj2)) {
                obj2 = null;
            }
        }
        if (e(obj2, obj)) {
            View.AccessibilityDelegate c8 = C1510H.c(view);
            if (c8 == null) {
                bVar = null;
            } else if (c8 instanceof C1528a) {
                bVar = ((C1528a) c8).f15915a;
            } else {
                bVar = new C1529b(c8);
            }
            if (bVar == null) {
                bVar = new C1529b();
            }
            C1510H.p(view, bVar);
            view.setTag(this.f977a, obj);
            C1510H.i(view, this.f979c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
