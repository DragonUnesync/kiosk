package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import n.j;
import n.m;
import n.o;

public final class K0 extends C1297u0 {

    /* renamed from: j0  reason: collision with root package name */
    public final int f13850j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f13851k0;

    /* renamed from: l0  reason: collision with root package name */
    public H0 f13852l0;

    /* renamed from: m0  reason: collision with root package name */
    public o f13853m0;

    public K0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f13850j0 = 21;
            this.f13851k0 = 22;
            return;
        }
        this.f13850j0 = 22;
        this.f13851k0 = 21;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        j jVar;
        o oVar;
        int pointToPosition;
        int i8;
        if (this.f13852l0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                jVar = (j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (j) adapter;
                i = 0;
            }
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = pointToPosition - i) < 0 || i8 >= jVar.getCount()) {
                oVar = null;
            } else {
                oVar = jVar.getItem(i8);
            }
            o oVar2 = this.f13853m0;
            if (oVar2 != oVar) {
                m mVar = jVar.f13471U;
                if (oVar2 != null) {
                    this.f13852l0.l(mVar, oVar2);
                }
                this.f13853m0 = oVar;
                if (oVar != null) {
                    this.f13852l0.u(mVar, oVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        j jVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f13850j0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f13851k0) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                jVar = (j) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                jVar = (j) adapter;
            }
            jVar.f13471U.c(false);
            return true;
        }
    }

    public void setHoverListener(H0 h02) {
        this.f13852l0 = h02;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
