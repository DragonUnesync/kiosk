package androidx.camera.lifecycle;

import H.g;
import K1.k;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.r;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import n2.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7664a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7665b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7666c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f7667d = new ArrayDeque();
    public k e;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.camera.lifecycle.LifecycleCamera r6, java.util.List r7, K1.k r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7664a
            monitor-enter(r0)
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x001a }
            r2 = 1
            r1 = r1 ^ r2
            n2.a.i(r1)     // Catch:{ all -> 0x001a }
            r5.e = r8     // Catch:{ all -> 0x001a }
            androidx.lifecycle.r r8 = r6.i()     // Catch:{ all -> 0x001a }
            androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver r1 = r5.c(r8)     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r6 = move-exception
            goto L_0x008c
        L_0x001c:
            java.util.HashMap r3 = r5.f7666c     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x001a }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x001a }
            K1.k r3 = r5.e     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x002d
            int r3 = r3.f2580U     // Catch:{ all -> 0x001a }
            r4 = 2
            if (r3 == r4) goto L_0x0061
        L_0x002d:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x001a }
        L_0x0031:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x001a }
            androidx.camera.lifecycle.a r3 = (androidx.camera.lifecycle.a) r3     // Catch:{ all -> 0x001a }
            java.util.HashMap r4 = r5.f7665b     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x001a }
            androidx.camera.lifecycle.LifecycleCamera r3 = (androidx.camera.lifecycle.LifecycleCamera) r3     // Catch:{ all -> 0x001a }
            r3.getClass()     // Catch:{ all -> 0x001a }
            boolean r4 = r3.equals(r6)     // Catch:{ all -> 0x001a }
            if (r4 != 0) goto L_0x0031
            java.util.List r3 = r3.p()     // Catch:{ all -> 0x001a }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x0059
            goto L_0x0031
        L_0x0059:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            java.lang.String r7 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."
            r6.<init>(r7)     // Catch:{ all -> 0x001a }
            throw r6     // Catch:{ all -> 0x001a }
        L_0x0061:
            H.g r1 = r6.f7658W     // Catch:{ e -> 0x0085 }
            r1.I()     // Catch:{ e -> 0x0085 }
            H.g r1 = r6.f7658W     // Catch:{ e -> 0x0085 }
            r1.G()     // Catch:{ e -> 0x0085 }
            r6.e(r7)     // Catch:{ e -> 0x0085 }
            androidx.lifecycle.t r6 = r8.e()     // Catch:{ all -> 0x001a }
            androidx.lifecycle.m r6 = r6.f8156c     // Catch:{ all -> 0x001a }
            androidx.lifecycle.m r7 = androidx.lifecycle.C0486m.f8148X     // Catch:{ all -> 0x001a }
            int r6 = r6.compareTo(r7)     // Catch:{ all -> 0x001a }
            if (r6 < 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r2 = 0
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r5.g(r8)     // Catch:{ all -> 0x001a }
        L_0x0083:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x0085:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            r7.<init>(r6)     // Catch:{ all -> 0x001a }
            throw r7     // Catch:{ all -> 0x001a }
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.b.a(androidx.camera.lifecycle.LifecycleCamera, java.util.List, K1.k):void");
    }

    public final LifecycleCamera b(r rVar, g gVar) {
        boolean z;
        synchronized (this.f7664a) {
            try {
                if (this.f7665b.get(new a(rVar, gVar.f1775Y)) == null) {
                    z = true;
                } else {
                    z = false;
                }
                a.h("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", z);
                LifecycleCamera lifecycleCamera = new LifecycleCamera(rVar, gVar);
                if (((ArrayList) gVar.A()).isEmpty()) {
                    lifecycleCamera.r();
                }
                if (rVar.e().f8156c == C0486m.f8145U) {
                    return lifecycleCamera;
                }
                f(lifecycleCamera);
                return lifecycleCamera;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final LifecycleCameraRepository$LifecycleCameraRepositoryObserver c(r rVar) {
        synchronized (this.f7664a) {
            try {
                for (LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver : this.f7666c.keySet()) {
                    if (rVar.equals(lifecycleCameraRepository$LifecycleCameraRepositoryObserver.f7661V)) {
                        return lifecycleCameraRepository$LifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Collection d() {
        Collection unmodifiableCollection;
        synchronized (this.f7664a) {
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(this.f7665b.values());
        }
        return unmodifiableCollection;
    }

    public final boolean e(r rVar) {
        synchronized (this.f7664a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver c8 = c(rVar);
                if (c8 == null) {
                    return false;
                }
                for (a aVar : (Set) this.f7666c.get(c8)) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f7665b.get(aVar);
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.p().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(LifecycleCamera lifecycleCamera) {
        Set set;
        synchronized (this.f7664a) {
            try {
                r i = lifecycleCamera.i();
                g gVar = lifecycleCamera.f7658W;
                a aVar = new a(i, g.w(gVar.f1786j0, gVar.f1787k0));
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver c8 = c(i);
                if (c8 != null) {
                    set = (Set) this.f7666c.get(c8);
                } else {
                    set = new HashSet();
                }
                set.add(aVar);
                this.f7665b.put(aVar, lifecycleCamera);
                if (c8 == null) {
                    LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver = new LifecycleCameraRepository$LifecycleCameraRepositoryObserver(i, this);
                    this.f7666c.put(lifecycleCameraRepository$LifecycleCameraRepositoryObserver, set);
                    i.e().a(lifecycleCameraRepository$LifecycleCameraRepositoryObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(r rVar) {
        synchronized (this.f7664a) {
            try {
                if (e(rVar)) {
                    if (this.f7667d.isEmpty()) {
                        this.f7667d.push(rVar);
                    } else {
                        k kVar = this.e;
                        if (kVar == null || kVar.f2580U != 2) {
                            r rVar2 = (r) this.f7667d.peek();
                            if (!rVar.equals(rVar2)) {
                                i(rVar2);
                                this.f7667d.remove(rVar);
                                this.f7667d.push(rVar);
                            }
                        }
                    }
                    k(rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(r rVar) {
        synchronized (this.f7664a) {
            try {
                this.f7667d.remove(rVar);
                i(rVar);
                if (!this.f7667d.isEmpty()) {
                    k((r) this.f7667d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(r rVar) {
        synchronized (this.f7664a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver c8 = c(rVar);
                if (c8 != null) {
                    for (a aVar : (Set) this.f7666c.get(c8)) {
                        LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f7665b.get(aVar);
                        lifecycleCamera.getClass();
                        lifecycleCamera.r();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.f7664a) {
            try {
                for (a aVar : this.f7665b.keySet()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f7665b.get(aVar);
                    lifecycleCamera.s();
                    h(lifecycleCamera.i());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(r rVar) {
        synchronized (this.f7664a) {
            try {
                for (a aVar : (Set) this.f7666c.get(c(rVar))) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f7665b.get(aVar);
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.p().isEmpty()) {
                        lifecycleCamera.t();
                    }
                }
            } finally {
            }
        }
    }
}
