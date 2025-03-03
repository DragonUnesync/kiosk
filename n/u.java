package n;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class u implements C1222C, y, AdapterView.OnItemClickListener {

    /* renamed from: U  reason: collision with root package name */
    public Rect f13542U;

    public static int m(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = listAdapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i10, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    public static boolean u(m mVar) {
        int size = mVar.f13483Z.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(o oVar) {
        return false;
    }

    public final void g(Context context, m mVar) {
    }

    public final boolean k(o oVar) {
        return false;
    }

    public abstract void l(m mVar);

    public abstract void n(View view);

    public abstract void o(boolean z);

    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        j jVar;
        int i8;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            jVar = (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            jVar = (j) listAdapter;
        }
        m mVar = jVar.f13471U;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof C1231g)) {
            i8 = 0;
        } else {
            i8 = 4;
        }
        mVar.q(menuItem, this, i8);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);
}
