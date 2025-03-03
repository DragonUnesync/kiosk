package androidx.lifecycle;

import C0.e;
import N5.m;
import android.os.Looper;
import java.util.Map;
import p.C1328a;
import q.C1350c;
import q.C1351d;
import q.C1353f;

public abstract class x {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f8167k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f8168a;

    /* renamed from: b  reason: collision with root package name */
    public final C1353f f8169b;

    /* renamed from: c  reason: collision with root package name */
    public int f8170c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8171d;
    public volatile Object e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f8172f;

    /* renamed from: g  reason: collision with root package name */
    public int f8173g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8174h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final e f8175j;

    public x(Object obj) {
        this.f8168a = new Object();
        this.f8169b = new C1353f();
        this.f8170c = 0;
        this.f8172f = f8167k;
        this.f8175j = new e(15, this);
        this.e = obj;
        this.f8173g = 0;
    }

    public static void a(String str) {
        C1328a.s().f14314a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(N.e.y("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(w wVar) {
        if (wVar.f8164V) {
            if (!wVar.e()) {
                wVar.a(false);
                return;
            }
            int i8 = wVar.f8165W;
            int i9 = this.f8173g;
            if (i8 < i9) {
                wVar.f8165W = i9;
                wVar.f8163U.a(this.e);
            }
        }
    }

    public final void c(w wVar) {
        if (this.f8174h) {
            this.i = true;
            return;
        }
        this.f8174h = true;
        do {
            this.i = false;
            if (wVar == null) {
                C1353f fVar = this.f8169b;
                fVar.getClass();
                C1351d dVar = new C1351d(fVar);
                fVar.f14699W.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(wVar);
                wVar = null;
            }
        } while (this.i);
        this.f8174h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != f8167k) {
            return obj;
        }
        return null;
    }

    public final void e(r rVar, m mVar) {
        Object obj;
        a("observe");
        if (rVar.e().f8156c != C0486m.f8145U) {
            LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, rVar, mVar);
            C1353f fVar = this.f8169b;
            C1350c b8 = fVar.b(mVar);
            if (b8 != null) {
                obj = b8.f14691V;
            } else {
                C1350c cVar = new C1350c(mVar, liveData$LifecycleBoundObserver);
                fVar.f14700X++;
                C1350c cVar2 = fVar.f14698V;
                if (cVar2 == null) {
                    fVar.f14697U = cVar;
                    fVar.f14698V = cVar;
                } else {
                    cVar2.f14692W = cVar;
                    cVar.f14693X = cVar2;
                    fVar.f14698V = cVar;
                }
                obj = null;
            }
            w wVar = (w) obj;
            if (wVar != null && !wVar.d(rVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (wVar == null) {
                rVar.e().a(liveData$LifecycleBoundObserver);
            }
        }
    }

    public final void f(A a8) {
        Object obj;
        a("observeForever");
        w wVar = new w(this, a8);
        C1353f fVar = this.f8169b;
        C1350c b8 = fVar.b(a8);
        if (b8 != null) {
            obj = b8.f14691V;
        } else {
            C1350c cVar = new C1350c(a8, wVar);
            fVar.f14700X++;
            C1350c cVar2 = fVar.f14698V;
            if (cVar2 == null) {
                fVar.f14697U = cVar;
                fVar.f14698V = cVar;
            } else {
                cVar2.f14692W = cVar;
                cVar.f14693X = cVar2;
                fVar.f14698V = cVar;
            }
            obj = null;
        }
        w wVar2 = (w) obj;
        if (wVar2 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (wVar2 == null) {
            wVar.a(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public final void i(A a8) {
        a("removeObserver");
        w wVar = (w) this.f8169b.c(a8);
        if (wVar != null) {
            wVar.b();
            wVar.a(false);
        }
    }

    public abstract void j(Object obj);

    public x() {
        this.f8168a = new Object();
        this.f8169b = new C1353f();
        this.f8170c = 0;
        Object obj = f8167k;
        this.f8172f = obj;
        this.f8175j = new e(15, this);
        this.e = obj;
        this.f8173g = -1;
    }
}
