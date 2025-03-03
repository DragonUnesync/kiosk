package X0;

import H3.O;
import M0.r;
import P0.l;
import P0.z;
import W0.h;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class m {

    /* renamed from: U  reason: collision with root package name */
    public final r f6258U;

    /* renamed from: V  reason: collision with root package name */
    public final O f6259V;

    /* renamed from: W  reason: collision with root package name */
    public final long f6260W;

    /* renamed from: X  reason: collision with root package name */
    public final List f6261X;

    /* renamed from: Y  reason: collision with root package name */
    public final j f6262Y;

    public m(r rVar, O o2, s sVar, ArrayList arrayList) {
        List list;
        l.d(!o2.isEmpty());
        this.f6258U = rVar;
        this.f6259V = O.m(o2);
        if (arrayList == null) {
            list = Collections.emptyList();
        } else {
            list = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f6261X = list;
        this.f6262Y = sVar.a(this);
        int i = z.f3748a;
        this.f6260W = z.W(sVar.f6276c, 1000000, sVar.f6275b, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract h c();

    public abstract j d();
}
