package D2;

import B2.f;
import B2.m;
import H2.p;
import H2.q;
import R2.c;
import W2.k;
import Y.e;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.d;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class E implements C0079h, d {

    /* renamed from: U  reason: collision with root package name */
    public final l f1034U;

    /* renamed from: V  reason: collision with root package name */
    public final i f1035V;

    /* renamed from: W  reason: collision with root package name */
    public int f1036W;

    /* renamed from: X  reason: collision with root package name */
    public int f1037X = -1;

    /* renamed from: Y  reason: collision with root package name */
    public f f1038Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f1039Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f1040a0;

    /* renamed from: b0  reason: collision with root package name */
    public volatile p f1041b0;

    /* renamed from: c0  reason: collision with root package name */
    public File f1042c0;

    /* renamed from: d0  reason: collision with root package name */
    public F f1043d0;

    public E(i iVar, l lVar) {
        this.f1035V = iVar;
        this.f1034U = lVar;
    }

    public final boolean b() {
        List list;
        ArrayList a8 = this.f1035V.a();
        boolean z = false;
        if (a8.isEmpty()) {
            return false;
        }
        i iVar = this.f1035V;
        i b8 = iVar.f1079c.b();
        Class<?> cls = iVar.f1080d.getClass();
        Class cls2 = iVar.f1082g;
        Class cls3 = iVar.f1085k;
        c cVar = b8.f9005h;
        k kVar = (k) ((AtomicReference) cVar.f4336V).getAndSet((Object) null);
        if (kVar == null) {
            kVar = new k(cls, cls2, cls3);
        } else {
            kVar.f6169a = cls;
            kVar.f6170b = cls2;
            kVar.f6171c = cls3;
        }
        synchronized (((e) cVar.f4337W)) {
            list = (List) ((e) cVar.f4337W).get(kVar);
        }
        ((AtomicReference) cVar.f4336V).set(kVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = b8.f8999a.a(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = b8.f9001c.f0((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!b8.f9003f.m(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            b8.f9005h.t0(cls, cls2, cls3, DesugarCollections.unmodifiableList(arrayList2));
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List list2 = this.f1039Z;
                if (list2 == null || this.f1040a0 >= list2.size()) {
                    int i = this.f1037X + 1;
                    this.f1037X = i;
                    if (i >= arrayList.size()) {
                        int i8 = this.f1036W + 1;
                        this.f1036W = i8;
                        if (i8 >= a8.size()) {
                            return false;
                        }
                        this.f1037X = 0;
                    }
                    f fVar = (f) a8.get(this.f1036W);
                    Class cls5 = (Class) arrayList.get(this.f1037X);
                    m e = this.f1035V.e(cls5);
                    i iVar2 = this.f1035V;
                    this.f1043d0 = new F(iVar2.f1079c.f8985a, fVar, iVar2.f1088n, iVar2.e, iVar2.f1081f, e, cls5, iVar2.i);
                    File b9 = iVar2.f1083h.a().b(this.f1043d0);
                    this.f1042c0 = b9;
                    if (b9 != null) {
                        this.f1038Y = fVar;
                        this.f1039Z = this.f1035V.f1079c.b().g(b9);
                        this.f1040a0 = 0;
                    }
                } else {
                    this.f1041b0 = null;
                    while (!z && this.f1040a0 < this.f1039Z.size()) {
                        List list3 = this.f1039Z;
                        int i9 = this.f1040a0;
                        this.f1040a0 = i9 + 1;
                        File file = this.f1042c0;
                        i iVar3 = this.f1035V;
                        this.f1041b0 = ((q) list3.get(i9)).a(file, iVar3.e, iVar3.f1081f, iVar3.i);
                        if (!(this.f1041b0 == null || this.f1035V.c(this.f1041b0.f1976c.a()) == null)) {
                            this.f1041b0.f1976c.f(this.f1035V.f1089o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f1035V.f1085k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f1035V.f1080d.getClass() + " to " + this.f1035V.f1085k);
        }
    }

    public final void c(Exception exc) {
        this.f1034U.a(this.f1043d0, exc, this.f1041b0.f1976c, 4);
    }

    public final void cancel() {
        p pVar = this.f1041b0;
        if (pVar != null) {
            pVar.f1976c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f1034U.c(this.f1038Y, obj, this.f1041b0.f1976c, 4, this.f1043d0);
    }
}
