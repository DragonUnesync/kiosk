package B;

import C.f;
import D.A0;
import D.B0;
import D.C0;
import D.C0048i;
import D.C0059n0;
import D.N0;
import D.T;
import D.U;
import D.y0;
import D.z0;
import N.g;
import com.bumptech.glide.d;
import g7.l;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import u.C1454N;
import u.C1455O;
import u.C1469j;
import u.C1479t;

public final /* synthetic */ class C implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f142a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f143b;

    public /* synthetic */ C(int i, Object obj) {
        this.f142a = i;
        this.f143b = obj;
    }

    public final void a(C0 c02) {
        Object obj = this.f143b;
        switch (this.f142a) {
            case 0:
                H h5 = (H) obj;
                if (h5.b() != null) {
                    l.a();
                    z0 z0Var = h5.f153t;
                    if (z0Var != null) {
                        z0Var.b();
                        h5.f153t = null;
                    }
                    p0 p0Var = h5.f152s;
                    if (p0Var != null) {
                        p0Var.a();
                        h5.f152s = null;
                    }
                    h5.f148o.c();
                    h5.d();
                    C0048i iVar = h5.f341g;
                    iVar.getClass();
                    y0 C8 = h5.C((T) h5.f340f, iVar);
                    h5.f151r = C8;
                    Object[] objArr = {C8.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    h5.B(DesugarCollections.unmodifiableList(arrayList));
                    h5.n();
                    return;
                }
                return;
            case 1:
                T t8 = (T) obj;
                if (t8.b() != null) {
                    f fVar = t8.f202u;
                    fVar.getClass();
                    l.a();
                    fVar.f490X = true;
                    t8.C(true);
                    C0048i iVar2 = t8.f341g;
                    iVar2.getClass();
                    y0 D8 = t8.D(t8.d(), (U) t8.f340f, iVar2);
                    t8.f200s = D8;
                    Object[] objArr2 = {D8.c()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList2.add(obj3);
                    t8.B(DesugarCollections.unmodifiableList(arrayList2));
                    t8.n();
                    f fVar2 = t8.f202u;
                    fVar2.getClass();
                    l.a();
                    fVar2.f490X = false;
                    fVar2.c();
                    return;
                }
                return;
            case 2:
                f0 f0Var = (f0) obj;
                if (f0Var.b() != null) {
                    f0Var.F((C0059n0) f0Var.f340f, f0Var.f341g);
                    f0Var.n();
                    return;
                }
                return;
            case 3:
                Iterator it = ((B0) obj).f744l.iterator();
                while (it.hasNext()) {
                    ((A0) it.next()).a(c02);
                }
                return;
            default:
                C1455O o2 = (C1455O) obj;
                o2.f15530b = o2.d();
                C1469j jVar = (C1469j) o2.e;
                if (jVar != null) {
                    C1479t tVar = jVar.f15655V;
                    tVar.getClass();
                    try {
                        if (((Boolean) d.i(new C1469j(tVar, 0)).f7017V.get()).booleanValue()) {
                            C1455O o8 = tVar.f15707q0;
                            C1479t tVar2 = tVar;
                            tVar.f15688W.execute(new g(tVar2, C1479t.x(o8), (C0) o8.f15530b, (C1454N) o8.f15531c, (Object) null, Collections.singletonList(N0.f835Z), 1));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                } else {
                    return;
                }
        }
    }
}
