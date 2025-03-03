package u;

import a0.j;
import a0.k;
import n2.a;

/* renamed from: u.G  reason: case insensitive filesystem */
public final /* synthetic */ class C1447G implements k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1449I f15495U;

    public /* synthetic */ C1447G(C1449I i) {
        this.f15495U = i;
    }

    public void a() {
        C1449I i = this.f15495U;
        synchronized (i.f15498a) {
            try {
                if (i.i == 5) {
                    i.j(i.f15502f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object h(j jVar) {
        boolean z;
        String str;
        C1449I i = this.f15495U;
        synchronized (i.f15498a) {
            if (i.f15506k == null) {
                z = true;
            } else {
                z = false;
            }
            a.m("Release completer expected to be null", z);
            i.f15506k = jVar;
            str = "Release[session=" + i + "]";
        }
        return str;
    }
}
