package o;

import android.os.Handler;
import android.widget.AbsListView;

public final class E0 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ G0 f13806a;

    public E0(G0 g02) {
        this.f13806a = g02;
    }

    public final void onScroll(AbsListView absListView, int i, int i8, int i9) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            G0 g02 = this.f13806a;
            if (g02.f13841t0.getInputMethodMode() != 2 && g02.f13841t0.getContentView() != null) {
                Handler handler = g02.p0;
                C0 c02 = g02.f13834l0;
                handler.removeCallbacks(c02);
                c02.run();
            }
        }
    }
}
