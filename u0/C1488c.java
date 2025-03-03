package u0;

import P6.f;
import c0.C0608f;

/* renamed from: u0.c  reason: case insensitive filesystem */
public final class C1488c extends C0608f {

    /* renamed from: d  reason: collision with root package name */
    public final Object f15733d = new Object();

    public C1488c(int i) {
        super(i);
    }

    public final Object a() {
        Object a8;
        synchronized (this.f15733d) {
            a8 = super.a();
        }
        return a8;
    }

    public final boolean c(Object obj) {
        boolean c8;
        f.e(obj, "instance");
        synchronized (this.f15733d) {
            c8 = super.c(obj);
        }
        return c8;
    }
}
