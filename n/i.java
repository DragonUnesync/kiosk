package n;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h.C1016d;
import h.C1019g;
import h.C1020h;

public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: U  reason: collision with root package name */
    public Context f13465U;

    /* renamed from: V  reason: collision with root package name */
    public LayoutInflater f13466V;

    /* renamed from: W  reason: collision with root package name */
    public m f13467W;

    /* renamed from: X  reason: collision with root package name */
    public ExpandedMenuView f13468X;

    /* renamed from: Y  reason: collision with root package name */
    public x f13469Y;

    /* renamed from: Z  reason: collision with root package name */
    public h f13470Z;

    public i(Context context) {
        this.f13465U = context;
        this.f13466V = LayoutInflater.from(context);
    }

    public final void a(m mVar, boolean z) {
        x xVar = this.f13469Y;
        if (xVar != null) {
            xVar.a(mVar, z);
        }
    }

    public final void d() {
        h hVar = this.f13470Z;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    public final boolean f(o oVar) {
        return false;
    }

    public final void g(Context context, m mVar) {
        if (this.f13465U != null) {
            this.f13465U = context;
            if (this.f13466V == null) {
                this.f13466V = LayoutInflater.from(context);
            }
        }
        this.f13467W = mVar;
        h hVar = this.f13470Z;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, n.x, java.lang.Object, android.content.DialogInterface$OnDismissListener, n.n] */
    public final boolean h(C1224E e) {
        if (!e.hasVisibleItems()) {
            return false;
        }
        ? obj = new Object();
        obj.f13501U = e;
        Context context = e.f13478U;
        C1019g gVar = new C1019g(context);
        i iVar = new i(gVar.getContext());
        obj.f13503W = iVar;
        iVar.f13469Y = obj;
        e.b(iVar, context);
        i iVar2 = obj.f13503W;
        if (iVar2.f13470Z == null) {
            iVar2.f13470Z = new h(iVar2);
        }
        h hVar = iVar2.f13470Z;
        C1016d dVar = gVar.f12206a;
        dVar.f12173k = hVar;
        dVar.f12174l = obj;
        View view = e.f13492i0;
        if (view != null) {
            dVar.e = view;
        } else {
            dVar.f12167c = e.f13491h0;
            gVar.setTitle(e.f13490g0);
        }
        dVar.f12172j = obj;
        C1020h create = gVar.create();
        obj.f13502V = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13502V.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13502V.show();
        x xVar = this.f13469Y;
        if (xVar == null) {
            return true;
        }
        xVar.n(e);
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final void j(x xVar) {
        throw null;
    }

    public final boolean k(o oVar) {
        return false;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        this.f13467W.q(this.f13470Z.getItem(i), this, 0);
    }
}
