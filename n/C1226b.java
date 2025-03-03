package n;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import o.C1269g;
import o.C1271h;
import o.C1275j;
import o.C1277k;
import o.C1303x0;

/* renamed from: n.b  reason: case insensitive filesystem */
public final class C1226b extends C1303x0 {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f13428d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ View f13429e0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1226b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f13429e0 = actionMenuItemView;
    }

    public final C1222C b() {
        C1269g gVar;
        switch (this.f13428d0) {
            case 0:
                C1227c cVar = ((ActionMenuItemView) this.f13429e0).f7362j0;
                if (cVar == null || (gVar = ((C1271h) cVar).f13967a.f13997n0) == null) {
                    return null;
                }
                return gVar.a();
            default:
                C1269g gVar2 = ((C1275j) this.f13429e0).f13974a0.f13996m0;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    public final boolean c() {
        C1222C b8;
        switch (this.f13428d0) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f13429e0;
                l lVar = actionMenuItemView.f7360h0;
                if (lVar == null || !lVar.d(actionMenuItemView.f7357e0) || (b8 = b()) == null || !b8.b()) {
                    return false;
                }
                return true;
            default:
                ((C1275j) this.f13429e0).f13974a0.l();
                return true;
        }
    }

    public boolean d() {
        switch (this.f13428d0) {
            case 1:
                C1277k kVar = ((C1275j) this.f13429e0).f13974a0;
                if (kVar.f13998o0 != null) {
                    return false;
                }
                kVar.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1226b(C1275j jVar, C1275j jVar2) {
        super(jVar2);
        this.f13429e0 = jVar;
    }
}
