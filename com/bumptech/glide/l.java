package com.bumptech.glide;

import D2.n;
import H3.C0105w;
import S2.a;
import S2.b;
import S2.c;
import S2.d;
import S2.e;
import S2.f;
import T2.g;
import W2.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.manager.q;
import de.ozerov.fully.C0734m;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class l extends a {

    /* renamed from: l0  reason: collision with root package name */
    public final Context f9013l0;

    /* renamed from: m0  reason: collision with root package name */
    public final o f9014m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Class f9015n0;

    /* renamed from: o0  reason: collision with root package name */
    public final e f9016o0;
    public a p0;

    /* renamed from: q0  reason: collision with root package name */
    public Object f9017q0;

    /* renamed from: r0  reason: collision with root package name */
    public ArrayList f9018r0;

    /* renamed from: s0  reason: collision with root package name */
    public l f9019s0;

    /* renamed from: t0  reason: collision with root package name */
    public l f9020t0;

    /* renamed from: u0  reason: collision with root package name */
    public final boolean f9021u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f9022v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f9023w0;

    static {
        e eVar = (e) ((e) ((e) new a().e(n.f1133c)).q()).u(true);
    }

    public l(b bVar, o oVar, Class cls, Context context) {
        e eVar;
        this.f9014m0 = oVar;
        this.f9015n0 = cls;
        this.f9013l0 = context;
        Y.e eVar2 = oVar.f9087U.f8972X.f8989f;
        a aVar = (a) eVar2.get(cls);
        if (aVar == null) {
            Iterator it = ((C0105w) eVar2.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.p0 = aVar == null ? e.f8984k : aVar;
        this.f9016o0 = bVar.f8972X;
        Iterator it2 = oVar.f9095c0.iterator();
        while (it2.hasNext()) {
            y((C0734m) it2.next());
        }
        synchronized (oVar) {
            eVar = oVar.f9096d0;
        }
        a(eVar);
    }

    public final c A(Object obj, g gVar, d dVar, a aVar, f fVar, int i, int i8, a aVar2) {
        b bVar;
        b bVar2;
        b bVar3;
        S2.g fVar2;
        int i9;
        int i10;
        a aVar3;
        f fVar3;
        int i11;
        int i12;
        Object obj2 = obj;
        a aVar4 = aVar;
        a aVar5 = aVar2;
        if (this.f9020t0 != null) {
            bVar2 = new b(obj2, dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        l lVar = this.f9019s0;
        if (lVar == null) {
            bVar3 = bVar;
            Object obj3 = this.f9017q0;
            ArrayList arrayList = this.f9018r0;
            e eVar = this.f9016o0;
            fVar2 = new f(this.f9013l0, eVar, obj, obj3, this.f9015n0, aVar2, i, i8, fVar, gVar, arrayList, bVar2, eVar.f8990g, aVar4.f8966U);
        } else if (!this.f9023w0) {
            a aVar6 = lVar.p0;
            if (lVar.f9021u0) {
                aVar3 = aVar4;
            } else {
                aVar3 = aVar6;
            }
            if (a.i(lVar.f4449U, 8)) {
                fVar3 = this.f9019s0.f4451W;
            } else {
                int ordinal = fVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    fVar3 = f.f8993U;
                } else if (ordinal == 2) {
                    fVar3 = f.f8994V;
                } else if (ordinal == 3) {
                    fVar3 = f.f8995W;
                } else {
                    throw new IllegalArgumentException("unknown priority: " + this.f4451W);
                }
            }
            f fVar4 = fVar3;
            l lVar2 = this.f9019s0;
            int i13 = lVar2.f4456b0;
            int i14 = lVar2.f4455a0;
            if (m.i(i, i8)) {
                l lVar3 = this.f9019s0;
                if (!m.i(lVar3.f4456b0, lVar3.f4455a0)) {
                    i12 = aVar5.f4456b0;
                    i11 = aVar5.f4455a0;
                    S2.g gVar2 = new S2.g(obj2, bVar2);
                    Object obj4 = this.f9017q0;
                    ArrayList arrayList2 = this.f9018r0;
                    e eVar2 = this.f9016o0;
                    f fVar5 = r1;
                    S2.g gVar3 = gVar2;
                    bVar3 = bVar;
                    f fVar6 = new f(this.f9013l0, eVar2, obj, obj4, this.f9015n0, aVar2, i, i8, fVar, gVar, arrayList2, gVar3, eVar2.f8990g, aVar4.f8966U);
                    this.f9023w0 = true;
                    l lVar4 = this.f9019s0;
                    c A8 = lVar4.A(obj, gVar, gVar3, aVar3, fVar4, i12, i11, lVar4);
                    this.f9023w0 = false;
                    S2.g gVar4 = gVar3;
                    gVar4.f4499c = fVar5;
                    gVar4.f4500d = A8;
                    fVar2 = gVar4;
                }
            }
            i11 = i14;
            i12 = i13;
            S2.g gVar22 = new S2.g(obj2, bVar2);
            Object obj42 = this.f9017q0;
            ArrayList arrayList22 = this.f9018r0;
            e eVar22 = this.f9016o0;
            f fVar52 = fVar6;
            S2.g gVar32 = gVar22;
            bVar3 = bVar;
            f fVar62 = new f(this.f9013l0, eVar22, obj, obj42, this.f9015n0, aVar2, i, i8, fVar, gVar, arrayList22, gVar32, eVar22.f8990g, aVar4.f8966U);
            this.f9023w0 = true;
            l lVar42 = this.f9019s0;
            c A82 = lVar42.A(obj, gVar, gVar32, aVar3, fVar4, i12, i11, lVar42);
            this.f9023w0 = false;
            S2.g gVar42 = gVar32;
            gVar42.f4499c = fVar52;
            gVar42.f4500d = A82;
            fVar2 = gVar42;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        b bVar4 = bVar3;
        if (bVar4 == null) {
            return fVar2;
        }
        l lVar5 = this.f9020t0;
        int i15 = lVar5.f4456b0;
        int i16 = lVar5.f4455a0;
        if (m.i(i, i8)) {
            l lVar6 = this.f9020t0;
            if (!m.i(lVar6.f4456b0, lVar6.f4455a0)) {
                a aVar7 = aVar2;
                i10 = aVar7.f4456b0;
                i9 = aVar7.f4455a0;
                l lVar7 = this.f9020t0;
                c A9 = lVar7.A(obj, gVar, bVar4, lVar7.p0, lVar7.f4451W, i10, i9, lVar7);
                bVar4.f4468c = fVar2;
                bVar4.f4469d = A9;
                return bVar4;
            }
        }
        i9 = i16;
        i10 = i15;
        l lVar72 = this.f9020t0;
        c A92 = lVar72.A(obj, gVar, bVar4, lVar72.p0, lVar72.f4451W, i10, i9, lVar72);
        bVar4.f4468c = fVar2;
        bVar4.f4469d = A92;
        return bVar4;
    }

    /* renamed from: B */
    public l clone() {
        l lVar = (l) super.clone();
        lVar.p0 = lVar.p0.clone();
        if (lVar.f9018r0 != null) {
            lVar.f9018r0 = new ArrayList(lVar.f9018r0);
        }
        l lVar2 = lVar.f9019s0;
        if (lVar2 != null) {
            lVar.f9019s0 = lVar2.clone();
        }
        l lVar3 = lVar.f9020t0;
        if (lVar3 != null) {
            lVar.f9020t0 = lVar3.clone();
        }
        return lVar;
    }

    public final g C(g gVar, a aVar) {
        W2.f.b(gVar);
        if (this.f9022v0) {
            c A8 = A(new Object(), gVar, (d) null, this.p0, aVar.f4451W, aVar.f4456b0, aVar.f4455a0, aVar);
            c f8 = gVar.f();
            if (!A8.l(f8) || (!aVar.f4454Z && f8.k())) {
                this.f9014m0.n(gVar);
                gVar.a(A8);
                o oVar = this.f9014m0;
                synchronized (oVar) {
                    oVar.f9092Z.f9083U.add(gVar);
                    q qVar = oVar.f9090X;
                    ((Set) qVar.f9081W).add(A8);
                    if (!qVar.f9080V) {
                        A8.i();
                    } else {
                        A8.clear();
                        if (Log.isLoggable("RequestTracker", 2)) {
                            Log.v("RequestTracker", "Paused, delaying request");
                        }
                        ((HashSet) qVar.f9082X).add(A8);
                    }
                }
                return gVar;
            }
            W2.f.c(f8, "Argument must not be null");
            if (!f8.isRunning()) {
                f8.i();
            }
            return gVar;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final void D(ImageView imageView) {
        a aVar;
        T2.a aVar2;
        m.a();
        W2.f.b(imageView);
        if (!a.i(this.f4449U, 2048) && imageView.getScaleType() != null) {
            switch (k.f9011a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = c().k();
                    break;
                case 2:
                    aVar = c().l();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = c().m();
                    break;
                case 6:
                    aVar = c().l();
                    break;
            }
        }
        aVar = this;
        this.f9016o0.f8987c.getClass();
        Class cls = this.f9015n0;
        if (Bitmap.class.equals(cls)) {
            aVar2 = new T2.a(imageView, 0);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            aVar2 = new T2.a(imageView, 1);
        } else {
            throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
        }
        C(aVar2, aVar);
    }

    public l E(C0734m mVar) {
        if (this.f4463i0) {
            return clone().E(mVar);
        }
        this.f9018r0 = null;
        return y(mVar);
    }

    public l F(A2.d dVar) {
        return G(dVar);
    }

    public final l G(Object obj) {
        if (this.f4463i0) {
            return clone().G(obj);
        }
        this.f9017q0 = obj;
        this.f9022v0 = true;
        r();
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!super.equals(lVar)) {
            return false;
        }
        if (!Objects.equals(this.f9015n0, lVar.f9015n0) || !this.p0.equals(lVar.p0) || !Objects.equals(this.f9017q0, lVar.f9017q0) || !Objects.equals(this.f9018r0, lVar.f9018r0) || !Objects.equals(this.f9019s0, lVar.f9019s0) || !Objects.equals(this.f9020t0, lVar.f9020t0) || this.f9021u0 != lVar.f9021u0 || this.f9022v0 != lVar.f9022v0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return m.g(this.f9022v0 ? 1 : 0, m.g(this.f9021u0 ? 1 : 0, m.h(m.h(m.h(m.h(m.h(m.h(m.h(super.hashCode(), this.f9015n0), this.p0), this.f9017q0), this.f9018r0), this.f9019s0), this.f9020t0), (Object) null)));
    }

    public l y(C0734m mVar) {
        if (this.f4463i0) {
            return clone().y(mVar);
        }
        if (mVar != null) {
            if (this.f9018r0 == null) {
                this.f9018r0 = new ArrayList();
            }
            this.f9018r0.add(mVar);
        }
        r();
        return this;
    }

    /* renamed from: z */
    public l a(a aVar) {
        W2.f.b(aVar);
        return (l) super.a(aVar);
    }
}
