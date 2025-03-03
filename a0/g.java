package a0;

import com.bumptech.glide.c;

public final class g extends c {
    public final boolean d(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f7009V != dVar) {
                    return false;
                }
                iVar.f7009V = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f7008U != obj) {
                    return false;
                }
                iVar.f7008U = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f7010W != hVar) {
                    return false;
                }
                iVar.f7010W = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(h hVar, h hVar2) {
        hVar.f7003b = hVar2;
    }

    public final void u(h hVar, Thread thread) {
        hVar.f7002a = thread;
    }
}
