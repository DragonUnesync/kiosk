package androidx.camera.lifecycle;

import A.f;
import B.C0016q;
import B.C0017s;
import B.C0020v;
import B.r;
import B.v0;
import D.C0038d;
import D.C0066u;
import D.C0067v;
import D.C0069x;
import D.C0071z;
import D.E;
import D.Q;
import D.w0;
import D6.j;
import F.h;
import H.a;
import H.g;
import K1.k;
import a0.m;
import android.content.Context;
import android.os.Trace;
import de.ozerov.fully.K2;
import g7.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import u.C1441A;
import u.C1468i;

public final class d implements r {

    /* renamed from: g  reason: collision with root package name */
    public static final d f7670g = new d();

    /* renamed from: a  reason: collision with root package name */
    public final Object f7671a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public m f7672b;

    /* renamed from: c  reason: collision with root package name */
    public final b f7673c = new b();

    /* renamed from: d  reason: collision with root package name */
    public C0020v f7674d;
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f7675f = new HashMap();

    public static final f a(d dVar, C0017s sVar) {
        dVar.getClass();
        Iterator it = sVar.f305a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            P6.f.d(next, "cameraSelector.cameraFilterSet");
            C0016q qVar = (C0016q) next;
            if (!P6.f.a(qVar.a(), C0016q.f298a)) {
                C0038d a8 = qVar.a();
                synchronized (Q.f844a) {
                    C0066u uVar = (C0066u) Q.f845b.get(a8);
                }
                P6.f.b(dVar.e);
            }
        }
        return C0067v.f954a;
    }

    public static final void b(d dVar, int i) {
        int i8;
        boolean z;
        C0020v vVar = dVar.f7674d;
        if (vVar != null) {
            C1468i iVar = vVar.f331f;
            if (iVar != null) {
                k kVar = iVar.f15648b;
                if (i != kVar.f2580U) {
                    Iterator it = ((ArrayList) kVar.f2581V).iterator();
                    while (it.hasNext()) {
                        E e8 = (E) it.next();
                        int i9 = kVar.f2580U;
                        synchronized (e8.f759b) {
                            boolean z6 = true;
                            if (i == 2) {
                                i8 = 2;
                            } else {
                                i8 = 1;
                            }
                            e8.f760c = i8;
                            if (i9 == 2 || i != 2) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (i9 != 2 || i == 2) {
                                z6 = false;
                            }
                            if (z || z6) {
                                e8.b();
                            }
                        }
                    }
                }
                if (kVar.f2580U == 2 && i != 2) {
                    ((ArrayList) kVar.f2583X).clear();
                }
                kVar.f2580U = i;
                return;
            }
            throw new IllegalStateException("CameraX not initialized yet.");
        }
    }

    public final LifecycleCamera c(androidx.lifecycle.r rVar, C0017s sVar, v0... v0VarArr) {
        int i;
        P6.f.e(rVar, "lifecycleOwner");
        Trace.beginSection(h.H("CX:bindToLifecycle"));
        try {
            C0020v vVar = this.f7674d;
            if (vVar == null) {
                i = 0;
            } else {
                C1468i iVar = vVar.f331f;
                if (iVar != null) {
                    i = iVar.f15648b.f2580U;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i != 2) {
                b(this, 1);
                return d(rVar, sVar, (v0[]) Arrays.copyOf(v0VarArr, v0VarArr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        } finally {
            Trace.endSection();
        }
    }

    public final LifecycleCamera d(androidx.lifecycle.r rVar, C0017s sVar, v0... v0VarArr) {
        LifecycleCamera lifecycleCamera;
        P6.f.e(rVar, "lifecycleOwner");
        P6.f.e(v0VarArr, "useCases");
        Trace.beginSection(h.H("CX:bindToLifecycle-internal"));
        try {
            l.a();
            C0020v vVar = this.f7674d;
            P6.f.b(vVar);
            C0071z c8 = sVar.c(vVar.f327a.A());
            P6.f.d(c8, "primaryCameraSelector.se…cameraRepository.cameras)");
            c8.k(true);
            w0 e8 = e(sVar);
            b bVar = this.f7673c;
            a w2 = g.w(e8, (w0) null);
            synchronized (bVar.f7664a) {
                lifecycleCamera = (LifecycleCamera) bVar.f7665b.get(new a(rVar, w2));
            }
            Collection d8 = this.f7673c.d();
            Iterator it = D6.h.G(v0VarArr).iterator();
            while (it.hasNext()) {
                v0 v0Var = (v0) it.next();
                Iterator it2 = d8.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        P6.f.d(next, "lifecycleCameras");
                        LifecycleCamera lifecycleCamera2 = (LifecycleCamera) next;
                        if (lifecycleCamera2.q(v0Var)) {
                            if (!lifecycleCamera2.equals(lifecycleCamera)) {
                                throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{v0Var}, 1)));
                            }
                        }
                    }
                }
            }
            if (lifecycleCamera == null) {
                b bVar2 = this.f7673c;
                C0020v vVar2 = this.f7674d;
                P6.f.b(vVar2);
                C1468i iVar = vVar2.f331f;
                if (iVar != null) {
                    k kVar = iVar.f15648b;
                    C0020v vVar3 = this.f7674d;
                    P6.f.b(vVar3);
                    K2 k22 = vVar3.f332g;
                    if (k22 != null) {
                        C0020v vVar4 = this.f7674d;
                        P6.f.b(vVar4);
                        C1441A a8 = vVar4.f333h;
                        if (a8 != null) {
                            lifecycleCamera = bVar2.b(rVar, new g(c8, (C0071z) null, e8, (w0) null, kVar, k22, a8));
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (v0VarArr.length != 0) {
                b bVar3 = this.f7673c;
                List L8 = j.L(Arrays.copyOf(v0VarArr, v0VarArr.length));
                C0020v vVar5 = this.f7674d;
                P6.f.b(vVar5);
                C1468i iVar2 = vVar5.f331f;
                if (iVar2 != null) {
                    bVar3.a(lifecycleCamera, L8, iVar2.f15648b);
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            Trace.endSection();
            return lifecycleCamera;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final w0 e(C0017s sVar) {
        Object obj;
        P6.f.e(sVar, "cameraSelector");
        Trace.beginSection(h.H("CX:getCameraInfo"));
        try {
            C0020v vVar = this.f7674d;
            P6.f.b(vVar);
            C0069x l8 = sVar.c(vVar.f327a.A()).l();
            P6.f.d(l8, "cameraSelector.select(mC…meras).cameraInfoInternal");
            f a8 = a(this, sVar);
            a aVar = new a(l8.e(), (C0038d) a8.f17V);
            synchronized (this.f7671a) {
                obj = this.f7675f.get(aVar);
                if (obj == null) {
                    obj = new w0(l8, a8);
                    this.f7675f.put(aVar, obj);
                }
            }
            w0 w0Var = (w0) obj;
            Trace.endSection();
            return w0Var;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void f() {
        Trace.beginSection(h.H("CX:unbindAll"));
        try {
            l.a();
            b(this, 0);
            this.f7673c.j();
        } finally {
            Trace.endSection();
        }
    }
}
