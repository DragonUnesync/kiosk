package l7;

import G2.a;
import P6.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class d extends y {

    /* renamed from: h  reason: collision with root package name */
    public static final ReentrantLock f13208h;
    public static final Condition i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f13209j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f13210k;

    /* renamed from: l  reason: collision with root package name */
    public static d f13211l;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public d f13212f;

    /* renamed from: g  reason: collision with root package name */
    public long f13213g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f13208h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        f.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60);
        f13209j = millis;
        f13210k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [l7.d, java.lang.Object] */
    public final void h() {
        d dVar;
        long j7 = this.f13254c;
        boolean z = this.f13252a;
        int i8 = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
        if (i8 != 0 || z) {
            ReentrantLock reentrantLock = f13208h;
            reentrantLock.lock();
            try {
                if (!this.e) {
                    this.e = true;
                    if (f13211l == null) {
                        f13211l = new Object();
                        a aVar = new a("Okio Watchdog");
                        aVar.setDaemon(true);
                        aVar.start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i8 != 0 && z) {
                        this.f13213g = Math.min(j7, c() - nanoTime) + nanoTime;
                    } else if (i8 != 0) {
                        this.f13213g = j7 + nanoTime;
                    } else if (z) {
                        this.f13213g = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j8 = this.f13213g - nanoTime;
                    d dVar2 = f13211l;
                    f.b(dVar2);
                    while (true) {
                        dVar = dVar2.f13212f;
                        if (dVar == null) {
                            break;
                        } else if (j8 < dVar.f13213g - nanoTime) {
                            break;
                        } else {
                            dVar2 = dVar;
                        }
                    }
                    this.f13212f = dVar;
                    dVar2.f13212f = this;
                    if (dVar2 == f13211l) {
                        i.signal();
                    }
                    reentrantLock.unlock();
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f13208h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            d dVar = f13211l;
            while (dVar != null) {
                d dVar2 = dVar.f13212f;
                if (dVar2 == this) {
                    dVar.f13212f = this.f13212f;
                    this.f13212f = null;
                    reentrantLock.unlock();
                    return false;
                }
                dVar = dVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
