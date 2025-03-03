package androidx.recyclerview.widget;

import java.util.WeakHashMap;
import v0.C1510H;

public final class b0 extends H {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f8371a;

    public b0(RecyclerView recyclerView) {
        this.f8371a = recyclerView;
    }

    public final void a() {
        boolean z = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.f8371a;
        if (!z || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
            return;
        }
        Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
        WeakHashMap weakHashMap = C1510H.f15874a;
        recyclerView.postOnAnimation(runnable);
    }
}
