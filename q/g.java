package Q;

import B.T;
import B.a0;
import B.f0;
import B.u0;
import B.v0;
import D.A0;
import D.C0;
import D.C0048i;
import D.C0071z;
import D.L0;
import D.M;
import D.N;
import D.X;
import E.f;
import M.j;
import M.k;
import O.b;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import g7.l;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n2.a;
import u.C1441A;

public final class g implements u0 {

    /* renamed from: U  reason: collision with root package name */
    public final HashSet f3991U;

    /* renamed from: V  reason: collision with root package name */
    public final HashMap f3992V = new HashMap();

    /* renamed from: W  reason: collision with root package name */
    public final HashMap f3993W = new HashMap();

    /* renamed from: X  reason: collision with root package name */
    public final HashMap f3994X = new HashMap();

    /* renamed from: Y  reason: collision with root package name */
    public final C1441A f3995Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C0071z f3996Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C0071z f3997a0;

    /* renamed from: b0  reason: collision with root package name */
    public final a0 f3998b0 = new a0(2, this);

    /* renamed from: c0  reason: collision with root package name */
    public final HashSet f3999c0;

    /* renamed from: d0  reason: collision with root package name */
    public final HashMap f4000d0;

    /* renamed from: e0  reason: collision with root package name */
    public final b f4001e0;

    /* renamed from: f0  reason: collision with root package name */
    public final b f4002f0;

    public g(C0071z zVar, C0071z zVar2, HashSet hashSet, C1441A a8, B7.g gVar) {
        this.f3996Z = zVar;
        this.f3997a0 = zVar2;
        this.f3995Y = a8;
        this.f3991U = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            hashMap.put(v0Var, v0Var.l(zVar.l(), (L0) null, v0Var.e(true, a8)));
        }
        this.f4000d0 = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.f3999c0 = hashSet2;
        this.f4001e0 = new b(zVar, hashSet2);
        if (this.f3997a0 != null) {
            this.f4002f0 = new b(this.f3997a0, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            v0 v0Var2 = (v0) it2.next();
            this.f3994X.put(v0Var2, Boolean.FALSE);
            this.f3993W.put(v0Var2, new f(zVar, this, gVar));
        }
    }

    public static void r(k kVar, N n4, C0 c02) {
        kVar.d();
        try {
            l.a();
            kVar.a();
            j jVar = kVar.f2768l;
            Objects.requireNonNull(jVar);
            jVar.g(n4, new M.g(jVar, 0));
        } catch (M unused) {
            A0 a02 = c02.f751f;
            if (a02 != null) {
                a02.a(c02);
            }
        }
    }

    public static N s(v0 v0Var) {
        List list;
        boolean z;
        if (v0Var instanceof T) {
            list = v0Var.f346m.b();
        } else {
            list = DesugarCollections.unmodifiableList(v0Var.f346m.f752g.f788a);
        }
        if (list.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        a.m((String) null, z);
        if (list.size() == 1) {
            return (N) list.get(0);
        }
        return null;
    }

    public final void c(v0 v0Var) {
        l.a();
        if (!t(v0Var)) {
            this.f3994X.put(v0Var, Boolean.TRUE);
            N s8 = s(v0Var);
            if (s8 != null) {
                k kVar = (k) this.f3992V.get(v0Var);
                Objects.requireNonNull(kVar);
                r(kVar, s8, v0Var.f346m);
            }
        }
    }

    public final void e(v0 v0Var) {
        l.a();
        if (t(v0Var)) {
            this.f3994X.put(v0Var, Boolean.FALSE);
            k kVar = (k) this.f3992V.get(v0Var);
            Objects.requireNonNull(kVar);
            l.a();
            kVar.a();
            kVar.f2768l.a();
        }
    }

    public final void i(v0 v0Var) {
        l.a();
        if (t(v0Var)) {
            k kVar = (k) this.f3992V.get(v0Var);
            Objects.requireNonNull(kVar);
            N s8 = s(v0Var);
            if (s8 != null) {
                r(kVar, s8, v0Var.f346m);
                return;
            }
            l.a();
            kVar.a();
            kVar.f2768l.a();
        }
    }

    public final void p(v0 v0Var) {
        N s8;
        l.a();
        k kVar = (k) this.f3992V.get(v0Var);
        Objects.requireNonNull(kVar);
        if (t(v0Var) && (s8 = s(v0Var)) != null) {
            r(kVar, s8, v0Var.f346m);
        }
    }

    public final b q(v0 v0Var, b bVar, C0071z zVar, k kVar, int i, boolean z) {
        boolean z6;
        boolean z8;
        Size size;
        int i8;
        int i9;
        v0 v0Var2 = v0Var;
        b bVar2 = bVar;
        k kVar2 = kVar;
        int g8 = zVar.a().g(i);
        Matrix matrix = kVar2.f2760b;
        RectF rectF = f.f1294a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = (f9 * f11) + (f8 * f10);
        double sqrt = Math.sqrt((double) ((f9 * f9) + (f8 * f8))) * Math.sqrt((double) ((f11 * f11) + (f10 * f10)));
        if (((float) Math.toDegrees(Math.atan2(((double) ((f8 * f11) - (f9 * f10))) / sqrt, ((double) f12) / sqrt))) > 0.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        L0 l02 = (L0) this.f4000d0.get(v0Var2);
        Objects.requireNonNull(l02);
        float[] fArr2 = new float[9];
        kVar2.f2760b.getValues(fArr2);
        int f13 = f.f((int) Math.round(Math.atan2((double) fArr2[3], (double) fArr2[0]) * 57.29577951308232d));
        bVar.getClass();
        boolean b8 = f.b(f13);
        Rect rect = kVar2.f2762d;
        if (b8) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            z8 = true;
        } else {
            z8 = false;
        }
        if (z) {
            size = f.d(rect);
            Iterator it = bVar2.b(l02).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size d8 = f.d(b.a((Size) it.next(), size));
                if (!b.c(d8, size)) {
                    size = d8;
                    break;
                }
            }
        } else {
            Size d9 = f.d(rect);
            List b9 = bVar2.b(l02);
            Iterator it2 = b9.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = b9.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = d9;
                            break;
                        }
                        Size size2 = (Size) it3.next();
                        if (!b.c(size2, d9)) {
                            size = size2;
                            break;
                        }
                    }
                } else {
                    Size size3 = (Size) it2.next();
                    Rational rational = E.b.f1282a;
                    if (!E.b.a(rational, d9)) {
                        rational = E.b.f1284c;
                        if (!E.b.a(rational, d9)) {
                            rational = b.g(d9);
                        }
                    }
                    if (!bVar2.d(rational, size3) && !b.c(size3, d9)) {
                        size = size3;
                        break;
                    }
                }
            }
            rect = b.a(d9, size);
        }
        Pair pair = new Pair(rect, size);
        Rect rect2 = (Rect) pair.first;
        Size size4 = (Size) pair.second;
        if (z8) {
            Size size5 = new Size(size4.getHeight(), size4.getWidth());
            rect2 = new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right);
            size4 = size5;
        }
        Pair pair2 = new Pair(rect2, size4);
        Rect rect3 = (Rect) pair2.first;
        Size size6 = (Size) pair2.second;
        int g9 = this.f3996Z.a().g(((X) v0Var2.f340f).h0(0));
        f fVar = (f) this.f3993W.get(v0Var2);
        Objects.requireNonNull(fVar);
        fVar.f3989W.f4008c = g9;
        int f14 = f.f((kVar2.i + g9) - g8);
        if (v0Var2 instanceof f0) {
            i8 = 1;
        } else if (v0Var2 instanceof T) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (v0Var2 instanceof T) {
            i9 = 256;
        } else {
            i9 = 34;
        }
        return new b(UUID.randomUUID(), i8, i9, rect3, f.e(size6, f14), f14, v0Var2.k(zVar) ^ z6);
    }

    public final boolean t(v0 v0Var) {
        Boolean bool = (Boolean) this.f3994X.get(v0Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void u(HashMap hashMap) {
        HashMap hashMap2 = this.f3992V;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        for (Map.Entry entry : hashMap2.entrySet()) {
            v0 v0Var = (v0) entry.getKey();
            k kVar = (k) entry.getValue();
            v0Var.z(kVar.f2762d);
            v0Var.x(kVar.f2760b);
            v0Var.f341g = v0Var.v(kVar.f2764g, (C0048i) null);
            v0Var.o();
        }
    }
}
