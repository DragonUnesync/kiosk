package o;

import android.database.Cursor;
import androidx.appcompat.widget.SearchView;
import z0.C1639a;

public final class T0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13892U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ SearchView f13893V;

    public /* synthetic */ T0(SearchView searchView, int i) {
        this.f13892U = i;
        this.f13893V = searchView;
    }

    public final void run() {
        switch (this.f13892U) {
            case 0:
                this.f13893V.u();
                return;
            default:
                C1639a aVar = this.f13893V.f7482N0;
                if (aVar instanceof c1) {
                    aVar.a((Cursor) null);
                    return;
                }
                return;
        }
    }
}
