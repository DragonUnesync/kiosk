package C3;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import o.G0;
import o.L;
import o.P;

public final class x implements AdapterView.OnItemClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f674U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f675V;

    public /* synthetic */ x(int i, Object obj) {
        this.f674U = i;
        this.f675V = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        Object obj;
        switch (this.f674U) {
            case 0:
                View view2 = null;
                z zVar = (z) this.f675V;
                if (i < 0) {
                    G0 g02 = zVar.f679b0;
                    if (!g02.f13841t0.isShowing()) {
                        obj = null;
                    } else {
                        obj = g02.f13819W.getSelectedItem();
                    }
                } else {
                    obj = zVar.getAdapter().getItem(i);
                }
                z.a(zVar, obj);
                AdapterView.OnItemClickListener onItemClickListener = zVar.getOnItemClickListener();
                G0 g03 = zVar.f679b0;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (g03.f13841t0.isShowing()) {
                            view2 = g03.f13819W.getSelectedView();
                        }
                        view = view2;
                        if (!g03.f13841t0.isShowing()) {
                            i = -1;
                        } else {
                            i = g03.f13819W.getSelectedItemPosition();
                        }
                        if (!g03.f13841t0.isShowing()) {
                            j7 = Long.MIN_VALUE;
                        } else {
                            j7 = g03.f13819W.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(g03.f13819W, view, i, j7);
                }
                g03.dismiss();
                return;
            case 1:
                L l8 = (L) this.f675V;
                l8.f13855B0.setSelection(i);
                P p3 = l8.f13855B0;
                if (p3.getOnItemClickListener() != null) {
                    p3.performItemClick(view, i, l8.f13857y0.getItemId(i));
                }
                l8.dismiss();
                return;
            default:
                ((SearchView) this.f675V).p(i);
                return;
        }
    }
}
