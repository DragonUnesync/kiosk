package n;

import android.view.MenuItem;

public final class s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f13538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f13539b;

    public s(t tVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13539b = tVar;
        this.f13538a = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f13538a.onMenuItemClick(this.f13539b.f(menuItem));
    }
}
