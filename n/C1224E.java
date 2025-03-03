package n;

import Q0.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: n.E  reason: case insensitive filesystem */
public final class C1224E extends m implements SubMenu {

    /* renamed from: t0  reason: collision with root package name */
    public final m f13410t0;

    /* renamed from: u0  reason: collision with root package name */
    public final o f13411u0;

    public C1224E(Context context, m mVar, o oVar) {
        super(context);
        this.f13410t0 = mVar;
        this.f13411u0 = oVar;
    }

    public final boolean d(o oVar) {
        return this.f13410t0.d(oVar);
    }

    public final boolean e(m mVar, MenuItem menuItem) {
        if (super.e(mVar, menuItem) || this.f13410t0.e(mVar, menuItem)) {
            return true;
        }
        return false;
    }

    public final boolean f(o oVar) {
        return this.f13410t0.f(oVar);
    }

    public final MenuItem getItem() {
        return this.f13411u0;
    }

    public final String j() {
        int i;
        o oVar = this.f13411u0;
        if (oVar != null) {
            i = oVar.f13504U;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return g.m(i, "android:menu:actionviewstates:");
    }

    public final m k() {
        return this.f13410t0.k();
    }

    public final boolean m() {
        return this.f13410t0.m();
    }

    public final boolean n() {
        return this.f13410t0.n();
    }

    public final boolean o() {
        return this.f13410t0.o();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.f13410t0.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f13411u0.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.f13410t0.setQwertyMode(z);
    }

    public final SubMenu setHeaderIcon(int i) {
        u(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        u(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f13411u0.setIcon(i);
        return this;
    }
}
