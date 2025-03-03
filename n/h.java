package n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class h extends BaseAdapter {

    /* renamed from: U  reason: collision with root package name */
    public int f13463U = -1;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ i f13464V;

    public h(i iVar) {
        this.f13464V = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f13464V.f13467W;
        o oVar = mVar.p0;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f13487d0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f13463U = i;
                    return;
                }
            }
        }
        this.f13463U = -1;
    }

    /* renamed from: b */
    public final o getItem(int i) {
        i iVar = this.f13464V;
        m mVar = iVar.f13467W;
        mVar.i();
        ArrayList arrayList = mVar.f13487d0;
        iVar.getClass();
        int i8 = this.f13463U;
        if (i8 >= 0 && i >= i8) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    public final int getCount() {
        i iVar = this.f13464V;
        m mVar = iVar.f13467W;
        mVar.i();
        int size = mVar.f13487d0.size();
        iVar.getClass();
        if (this.f13463U < 0) {
            return size;
        }
        return size - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13464V.f13466V.inflate(2131558416, viewGroup, false);
        }
        ((z) view).a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
