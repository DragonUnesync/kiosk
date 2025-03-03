package androidx.lifecycle;

import N.e;
import P6.f;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p.C1328a;
import q.C1348a;
import q.C1349b;
import q.C1350c;
import q.C1351d;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8154a = true;

    /* renamed from: b  reason: collision with root package name */
    public C1348a f8155b = new C1348a();

    /* renamed from: c  reason: collision with root package name */
    public C0486m f8156c = C0486m.f8146V;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f8157d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8158f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8159g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f8160h = new ArrayList();

    public t(r rVar) {
        new AtomicReference();
        this.f8157d = new WeakReference(rVar);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [androidx.lifecycle.s, java.lang.Object] */
    public final void a(q qVar) {
        C0489p pVar;
        r rVar;
        ArrayList arrayList = this.f8160h;
        Object obj = null;
        c("addObserver");
        C0486m mVar = this.f8156c;
        C0486m mVar2 = C0486m.f8145U;
        if (mVar != mVar2) {
            mVar2 = C0486m.f8146V;
        }
        ? obj2 = new Object();
        HashMap hashMap = u.f8161a;
        boolean z = qVar instanceof C0489p;
        boolean z6 = qVar instanceof C0477d;
        boolean z8 = false;
        if (z && z6) {
            pVar = new DefaultLifecycleObserverAdapter((C0477d) qVar, (C0489p) qVar);
        } else if (z6) {
            pVar = new DefaultLifecycleObserverAdapter((C0477d) qVar, (C0489p) null);
        } else if (z) {
            pVar = (C0489p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj3 = u.f8162b.get(cls);
                f.b(obj3);
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    C0480g[] gVarArr = new C0480g[size];
                    if (size <= 0) {
                        pVar = new CompositeGeneratedAdaptersObserver(gVarArr);
                    } else {
                        u.a((Constructor) list.get(0), qVar);
                        throw null;
                    }
                } else {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
            } else {
                pVar = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        obj2.f8153b = pVar;
        obj2.f8152a = mVar2;
        C1348a aVar = this.f8155b;
        C1350c b8 = aVar.b(qVar);
        if (b8 != null) {
            obj = b8.f14691V;
        } else {
            HashMap hashMap2 = aVar.f14686Y;
            C1350c cVar = new C1350c(qVar, obj2);
            aVar.f14700X++;
            C1350c cVar2 = aVar.f14698V;
            if (cVar2 == null) {
                aVar.f14697U = cVar;
                aVar.f14698V = cVar;
            } else {
                cVar2.f14692W = cVar;
                cVar.f14693X = cVar2;
                aVar.f14698V = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.f8157d.get()) != null) {
            if (this.e != 0 || this.f8158f) {
                z8 = true;
            }
            C0486m b9 = b(qVar);
            this.e++;
            while (obj2.f8152a.compareTo(b9) < 0 && this.f8155b.f14686Y.containsKey(qVar)) {
                arrayList.add(obj2.f8152a);
                C0483j jVar = C0485l.Companion;
                C0486m mVar3 = obj2.f8152a;
                jVar.getClass();
                C0485l a8 = C0483j.a(mVar3);
                if (a8 != null) {
                    obj2.a(rVar, a8);
                    arrayList.remove(arrayList.size() - 1);
                    b9 = b(qVar);
                } else {
                    throw new IllegalStateException("no event up from " + obj2.f8152a);
                }
            }
            if (!z8) {
                g();
            }
            this.e--;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.lifecycle.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.C0486m b(androidx.lifecycle.q r4) {
        /*
            r3 = this;
            q.a r0 = r3.f8155b
            java.util.HashMap r0 = r0.f14686Y
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r4 = r0.get(r4)
            q.c r4 = (q.C1350c) r4
            q.c r4 = r4.f14693X
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = r4.f14691V
            androidx.lifecycle.s r4 = (androidx.lifecycle.s) r4
            androidx.lifecycle.m r4 = r4.f8152a
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            java.util.ArrayList r0 = r3.f8160h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x002f
            r1 = 1
            java.lang.Object r0 = Q0.g.l(r1, r0)
            r2 = r0
            androidx.lifecycle.m r2 = (androidx.lifecycle.C0486m) r2
        L_0x002f:
            androidx.lifecycle.m r0 = r3.f8156c
            java.lang.String r1 = "state1"
            P6.f.e(r0, r1)
            if (r4 == 0) goto L_0x003f
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r4 = r0
        L_0x0040:
            if (r2 == 0) goto L_0x0049
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r2 = r4
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.b(androidx.lifecycle.q):androidx.lifecycle.m");
    }

    public final void c(String str) {
        if (this.f8154a) {
            C1328a.s().f14314a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(e.y("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(C0485l lVar) {
        f.e(lVar, "event");
        c("handleLifecycleEvent");
        e(lVar.a());
    }

    public final void e(C0486m mVar) {
        C0486m mVar2 = this.f8156c;
        if (mVar2 != mVar) {
            C0486m mVar3 = C0486m.f8146V;
            C0486m mVar4 = C0486m.f8145U;
            if (mVar2 == mVar3 && mVar == mVar4) {
                throw new IllegalStateException(("no event down from " + this.f8156c + " in component " + this.f8157d.get()).toString());
            }
            this.f8156c = mVar;
            if (this.f8158f || this.e != 0) {
                this.f8159g = true;
                return;
            }
            this.f8158f = true;
            g();
            this.f8158f = false;
            if (this.f8156c == mVar4) {
                this.f8155b = new C1348a();
            }
        }
    }

    public final void f(q qVar) {
        f.e(qVar, "observer");
        c("removeObserver");
        this.f8155b.c(qVar);
    }

    public final void g() {
        C0485l lVar;
        r rVar = (r) this.f8157d.get();
        if (rVar != null) {
            while (true) {
                C1348a aVar = this.f8155b;
                if (aVar.f14700X != 0) {
                    C1350c cVar = aVar.f14697U;
                    f.b(cVar);
                    C0486m mVar = ((s) cVar.f14691V).f8152a;
                    C1350c cVar2 = this.f8155b.f14698V;
                    f.b(cVar2);
                    C0486m mVar2 = ((s) cVar2.f14691V).f8152a;
                    if (mVar == mVar2 && this.f8156c == mVar2) {
                        break;
                    }
                    this.f8159g = false;
                    C0486m mVar3 = this.f8156c;
                    C1350c cVar3 = this.f8155b.f14697U;
                    f.b(cVar3);
                    if (mVar3.compareTo(((s) cVar3.f14691V).f8152a) < 0) {
                        C1348a aVar2 = this.f8155b;
                        C1349b bVar = new C1349b(aVar2.f14698V, aVar2.f14697U, 1);
                        aVar2.f14699W.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f8159g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            f.d(entry, "next()");
                            q qVar = (q) entry.getKey();
                            s sVar = (s) entry.getValue();
                            while (sVar.f8152a.compareTo(this.f8156c) > 0 && !this.f8159g && this.f8155b.f14686Y.containsKey(qVar)) {
                                C0483j jVar = C0485l.Companion;
                                C0486m mVar4 = sVar.f8152a;
                                jVar.getClass();
                                f.e(mVar4, "state");
                                int ordinal = mVar4.ordinal();
                                if (ordinal == 2) {
                                    lVar = C0485l.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    lVar = C0485l.ON_STOP;
                                } else if (ordinal != 4) {
                                    lVar = null;
                                } else {
                                    lVar = C0485l.ON_PAUSE;
                                }
                                if (lVar != null) {
                                    this.f8160h.add(lVar.a());
                                    sVar.a(rVar, lVar);
                                    ArrayList arrayList = this.f8160h;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + sVar.f8152a);
                                }
                            }
                        }
                    }
                    C1350c cVar4 = this.f8155b.f14698V;
                    if (!this.f8159g && cVar4 != null && this.f8156c.compareTo(((s) cVar4.f14691V).f8152a) > 0) {
                        C1348a aVar3 = this.f8155b;
                        aVar3.getClass();
                        C1351d dVar = new C1351d(aVar3);
                        aVar3.f14699W.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.f8159g) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            q qVar2 = (q) entry2.getKey();
                            s sVar2 = (s) entry2.getValue();
                            while (sVar2.f8152a.compareTo(this.f8156c) < 0 && !this.f8159g && this.f8155b.f14686Y.containsKey(qVar2)) {
                                this.f8160h.add(sVar2.f8152a);
                                C0483j jVar2 = C0485l.Companion;
                                C0486m mVar5 = sVar2.f8152a;
                                jVar2.getClass();
                                C0485l a8 = C0483j.a(mVar5);
                                if (a8 != null) {
                                    sVar2.a(rVar, a8);
                                    ArrayList arrayList2 = this.f8160h;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + sVar2.f8152a);
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            this.f8159g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
