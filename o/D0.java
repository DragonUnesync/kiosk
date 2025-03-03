package o;

import android.database.DataSetObserver;
import z0.C1639a;

public final class D0 extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13803a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13804b;

    public /* synthetic */ D0(int i, Object obj) {
        this.f13803a = i;
        this.f13804b = obj;
    }

    public final void onChanged() {
        switch (this.f13803a) {
            case 0:
                G0 g02 = (G0) this.f13804b;
                if (g02.f13841t0.isShowing()) {
                    g02.c();
                    return;
                }
                return;
            default:
                C1639a aVar = (C1639a) this.f13804b;
                aVar.f16404U = true;
                aVar.notifyDataSetChanged();
                return;
        }
    }

    public final void onInvalidated() {
        switch (this.f13803a) {
            case 0:
                ((G0) this.f13804b).dismiss();
                return;
            default:
                C1639a aVar = (C1639a) this.f13804b;
                aVar.f16404U = false;
                aVar.notifyDataSetInvalidated();
                return;
        }
    }
}
