package n;

import android.view.MenuItem;

public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f13536a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f13537b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13537b = tVar;
        this.f13536a = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13536a.onMenuItemActionCollapse(this.f13537b.f(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13536a.onMenuItemActionExpand(this.f13537b.f(menuItem));
    }
}
