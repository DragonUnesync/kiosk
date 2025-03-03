package F2;

import W2.m;
import java.util.ArrayDeque;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f1514a;

    public c(int i) {
        switch (i) {
            case 1:
                char[] cArr = m.f6173a;
                this.f1514a = new ArrayDeque(0);
                return;
            default:
                this.f1514a = new ArrayDeque();
                return;
        }
    }

    public b a() {
        b bVar;
        synchronized (this.f1514a) {
            bVar = (b) this.f1514a.poll();
        }
        if (bVar == null) {
            return new b();
        }
        return bVar;
    }

    public void b(b bVar) {
        synchronized (this.f1514a) {
            try {
                if (this.f1514a.size() < 10) {
                    this.f1514a.offer(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void c(A2.c cVar) {
        cVar.f56b = null;
        cVar.f57c = null;
        this.f1514a.offer(cVar);
    }
}
