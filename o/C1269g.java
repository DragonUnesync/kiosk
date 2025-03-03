package o;

import android.content.Context;
import android.view.View;
import k2.C1160q;
import n.C1224E;
import n.m;
import n.u;
import n.w;

/* renamed from: o.g  reason: case insensitive filesystem */
public final class C1269g extends w {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f13952l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C1277k f13953m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1269g(C1277k kVar, Context context, m mVar, View view) {
        super(2130968608, context, view, mVar, true);
        this.f13953m = kVar;
        this.f13548f = 8388613;
        C1160q qVar = kVar.f13999q0;
        this.f13550h = qVar;
        u uVar = this.i;
        if (uVar != null) {
            uVar.j(qVar);
        }
    }

    public final void c() {
        switch (this.f13952l) {
            case 0:
                C1277k kVar = this.f13953m;
                kVar.f13997n0 = null;
                kVar.getClass();
                super.c();
                return;
            default:
                C1277k kVar2 = this.f13953m;
                m mVar = kVar2.f13980W;
                if (mVar != null) {
                    mVar.c(true);
                }
                kVar2.f13996m0 = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1269g(C1277k kVar, Context context, C1224E e, View view) {
        super(2130968608, context, view, e, false);
        this.f13953m = kVar;
        if (!e.f13411u0.f()) {
            View view2 = kVar.f13986c0;
            this.e = view2 == null ? (View) kVar.f13985b0 : view2;
        }
        C1160q qVar = kVar.f13999q0;
        this.f13550h = qVar;
        u uVar = this.i;
        if (uVar != null) {
            uVar.j(qVar);
        }
    }
}
