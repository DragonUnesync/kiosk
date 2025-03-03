package com.bumptech.glide;

import B.q0;
import B2.k;
import B2.l;
import D.s0;
import D2.m;
import H2.q;
import H2.r;
import H2.s;
import H2.t;
import R2.a;
import R2.b;
import R2.c;
import R2.d;
import R2.e;
import W2.f;
import com.bumptech.glide.load.data.g;
import com.bumptech.glide.load.data.h;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import u0.C1488c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final t f8999a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f9000b;

    /* renamed from: c  reason: collision with root package name */
    public final c f9001c;

    /* renamed from: d  reason: collision with root package name */
    public final s0 f9002d;
    public final h e;

    /* renamed from: f  reason: collision with root package name */
    public final s0 f9003f;

    /* renamed from: g  reason: collision with root package name */
    public final s0 f9004g;

    /* renamed from: h  reason: collision with root package name */
    public final c f9005h = new c(0, (byte) 0);
    public final b i = new b();

    /* renamed from: j  reason: collision with root package name */
    public final q0 f9006j;

    public i() {
        q0 q0Var = new q0(new C1488c(20), new K1.i(21), new K1.i(22), 26, false);
        this.f9006j = q0Var;
        this.f8999a = new t(q0Var);
        this.f9000b = new s0(2);
        this.f9001c = new c(1, (byte) 0);
        this.f9002d = new s0(4);
        this.e = new h();
        this.f9003f = new s0(1);
        this.f9004g = new s0(3);
        List<String> asList = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        c cVar = this.f9001c;
        synchronized (cVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) cVar.f4336V);
                ((ArrayList) cVar.f4336V).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ArrayList) cVar.f4336V).add((String) it.next());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) cVar.f4336V).add(str);
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void a(Class cls, B2.b bVar) {
        s0 s0Var = this.f9000b;
        synchronized (s0Var) {
            s0Var.f949a.add(new a(cls, bVar));
        }
    }

    public final void b(Class cls, l lVar) {
        s0 s0Var = this.f9002d;
        synchronized (s0Var) {
            s0Var.f949a.add(new e(cls, lVar));
        }
    }

    public final void c(Class cls, Class cls2, r rVar) {
        t tVar = this.f8999a;
        synchronized (tVar) {
            tVar.f1978a.a(cls, cls2, rVar);
            tVar.f1979b.f1025a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, k kVar) {
        c cVar = this.f9001c;
        synchronized (cVar) {
            cVar.e0(str).add(new d(cls, cls2, kVar));
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f9001c.f0(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.f9003f.m(cls4, cls3).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    c cVar = this.f9001c;
                    synchronized (cVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = ((ArrayList) cVar.f4336V).iterator();
                        while (it3.hasNext()) {
                            List<d> list = (List) ((HashMap) cVar.f4337W).get((String) it3.next());
                            if (list != null) {
                                for (d dVar : list) {
                                    if (!dVar.f4338a.isAssignableFrom(cls) || !cls4.isAssignableFrom(dVar.f4339b)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        arrayList.add(dVar.f4340c);
                                    }
                                }
                            }
                        }
                    }
                    arrayList2.add(new m(cls, cls4, cls5, arrayList, this.f9003f.k(cls4, cls5), this.f9006j));
                }
            }
            while (true) {
            }
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        s0 s0Var = this.f9004g;
        synchronized (s0Var) {
            arrayList = s0Var.f949a;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new g("Failed to find image header parser.");
    }

    public final List g(Object obj) {
        List list;
        t tVar = this.f8999a;
        tVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (tVar) {
            s sVar = (s) tVar.f1979b.f1025a.get(cls);
            if (sVar == null) {
                list = null;
            } else {
                list = sVar.f1977a;
            }
            if (list == null) {
                list = DesugarCollections.unmodifiableList(tVar.f1978a.c(cls));
                if (((s) tVar.f1979b.f1025a.put(cls, new s(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i8 = 0; i8 < size; i8++) {
                q qVar = (q) list.get(i8);
                if (qVar.b(obj)) {
                    if (z) {
                        emptyList = new ArrayList(size - i8);
                        z = false;
                    }
                    emptyList.add(qVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new g("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }
        throw new g("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public final g h(Object obj) {
        g b8;
        h hVar = this.e;
        synchronized (hVar) {
            try {
                f.b(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) hVar.f9037V).get(obj.getClass());
                if (fVar == null) {
                    Iterator it = ((HashMap) hVar.f9037V).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it.next();
                        if (fVar2.a().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = h.f9035W;
                }
                b8 = fVar.b(obj);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return b8;
    }

    public final void i(B2.e eVar) {
        s0 s0Var = this.f9004g;
        synchronized (s0Var) {
            s0Var.f949a.add(eVar);
        }
    }

    public final void j(com.bumptech.glide.load.data.f fVar) {
        h hVar = this.e;
        synchronized (hVar) {
            ((HashMap) hVar.f9037V).put(fVar.a(), fVar);
        }
    }

    public final void k(Class cls, Class cls2, P2.a aVar) {
        s0 s0Var = this.f9003f;
        synchronized (s0Var) {
            s0Var.f949a.add(new P2.b(cls, cls2, aVar));
        }
    }
}
