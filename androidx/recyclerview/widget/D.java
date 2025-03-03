package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;

public final class D implements s0, K {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f8270a;

    public /* synthetic */ D(RecyclerView recyclerView) {
        this.f8270a = recyclerView;
    }

    public void a(C0490a aVar) {
        int i = aVar.f8362a;
        RecyclerView recyclerView = this.f8270a;
        if (i == 1) {
            recyclerView.mLayout.j0(aVar.f8363b, aVar.f8365d);
        } else if (i == 2) {
            recyclerView.mLayout.m0(aVar.f8363b, aVar.f8365d);
        } else if (i == 4) {
            recyclerView.mLayout.o0(recyclerView, aVar.f8363b, aVar.f8365d);
        } else if (i == 8) {
            recyclerView.mLayout.l0(aVar.f8363b, aVar.f8365d);
        }
    }

    public j0 b(int i) {
        RecyclerView recyclerView = this.f8270a;
        j0 findViewHolderForPosition = recyclerView.findViewHolderForPosition(i, true);
        if (findViewHolderForPosition == null) {
            return null;
        }
        C0492c cVar = recyclerView.mChildHelper;
        if (!cVar.f8374c.contains(findViewHolderForPosition.itemView)) {
            return findViewHolderForPosition;
        }
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public void c(int i) {
        RecyclerView recyclerView = this.f8270a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
