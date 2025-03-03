package n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class j extends BaseAdapter {

    /* renamed from: U  reason: collision with root package name */
    public final m f13471U;

    /* renamed from: V  reason: collision with root package name */
    public int f13472V = -1;

    /* renamed from: W  reason: collision with root package name */
    public boolean f13473W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f13474X;

    /* renamed from: Y  reason: collision with root package name */
    public final LayoutInflater f13475Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f13476Z;

    public j(m mVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f13474X = z;
        this.f13475Y = layoutInflater;
        this.f13471U = mVar;
        this.f13476Z = i;
        a();
    }

    public final void a() {
        m mVar = this.f13471U;
        o oVar = mVar.p0;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f13487d0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f13472V = i;
                    return;
                }
            }
        }
        this.f13472V = -1;
    }

    /* renamed from: b */
    public final o getItem(int i) {
        ArrayList arrayList;
        m mVar = this.f13471U;
        if (this.f13474X) {
            mVar.i();
            arrayList = mVar.f13487d0;
        } else {
            arrayList = mVar.l();
        }
        int i8 = this.f13472V;
        if (i8 >= 0 && i >= i8) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    public final int getCount() {
        ArrayList arrayList;
        m mVar = this.f13471U;
        if (this.f13474X) {
            mVar.i();
            arrayList = mVar.f13487d0;
        } else {
            arrayList = mVar.l();
        }
        if (this.f13472V < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i8;
        boolean z = false;
        if (view == null) {
            view = this.f13475Y.inflate(this.f13476Z, viewGroup, false);
        }
        int i9 = getItem(i).f13505V;
        int i10 = i - 1;
        if (i10 >= 0) {
            i8 = getItem(i10).f13505V;
        } else {
            i8 = i9;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f13471U.m() && i9 != i8) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        z zVar = (z) view;
        if (this.f13473W) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
