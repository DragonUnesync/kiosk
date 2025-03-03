package p;

import android.os.Looper;
import g7.l;

/* renamed from: p.a  reason: case insensitive filesystem */
public final class C1328a extends l {

    /* renamed from: b  reason: collision with root package name */
    public static volatile C1328a f14313b;

    /* renamed from: a  reason: collision with root package name */
    public final C1329b f14314a = new C1329b();

    public static C1328a s() {
        if (f14313b != null) {
            return f14313b;
        }
        synchronized (C1328a.class) {
            try {
                if (f14313b == null) {
                    f14313b = new C1328a();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f14313b;
    }

    public final void t(Runnable runnable) {
        C1329b bVar = this.f14314a;
        if (bVar.f14317c == null) {
            synchronized (bVar.f14315a) {
                try {
                    if (bVar.f14317c == null) {
                        bVar.f14317c = C1329b.s(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bVar.f14317c.post(runnable);
    }
}
