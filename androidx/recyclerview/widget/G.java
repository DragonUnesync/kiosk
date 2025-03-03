package androidx.recyclerview.widget;

import android.database.Observable;
import java.util.ArrayList;

public final class G extends Observable {
    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((b0) ((H) this.mObservers.get(size))).f8371a;
            recyclerView.assertNotInLayoutOrScroll((String) null);
            recyclerView.mState.f8399f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!recyclerView.mAdapterHelper.g()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i, int i8) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((H) this.mObservers.get(size));
            RecyclerView recyclerView = b0Var.f8371a;
            recyclerView.assertNotInLayoutOrScroll((String) null);
            C0491b bVar = recyclerView.mAdapterHelper;
            bVar.getClass();
            if (i != i8) {
                ArrayList arrayList = bVar.f8367b;
                arrayList.add(bVar.h((Object) null, 8, i, i8));
                bVar.f8370f |= 8;
                if (arrayList.size() == 1) {
                    b0Var.a();
                }
            }
        }
    }

    public final void d(int i, int i8, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((H) this.mObservers.get(size));
            RecyclerView recyclerView = b0Var.f8371a;
            recyclerView.assertNotInLayoutOrScroll((String) null);
            C0491b bVar = recyclerView.mAdapterHelper;
            if (i8 < 1) {
                bVar.getClass();
            } else {
                ArrayList arrayList = bVar.f8367b;
                arrayList.add(bVar.h(obj, 4, i, i8));
                bVar.f8370f = 4 | bVar.f8370f;
                if (arrayList.size() == 1) {
                    b0Var.a();
                }
            }
        }
    }

    public final void e(int i, int i8) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((H) this.mObservers.get(size));
            RecyclerView recyclerView = b0Var.f8371a;
            recyclerView.assertNotInLayoutOrScroll((String) null);
            C0491b bVar = recyclerView.mAdapterHelper;
            if (i8 < 1) {
                bVar.getClass();
            } else {
                ArrayList arrayList = bVar.f8367b;
                arrayList.add(bVar.h((Object) null, 1, i, i8));
                bVar.f8370f |= 1;
                if (arrayList.size() == 1) {
                    b0Var.a();
                }
            }
        }
    }

    public final void f(int i, int i8) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((H) this.mObservers.get(size));
            RecyclerView recyclerView = b0Var.f8371a;
            recyclerView.assertNotInLayoutOrScroll((String) null);
            C0491b bVar = recyclerView.mAdapterHelper;
            if (i8 < 1) {
                bVar.getClass();
            } else {
                ArrayList arrayList = bVar.f8367b;
                arrayList.add(bVar.h((Object) null, 2, i, i8));
                bVar.f8370f |= 2;
                if (arrayList.size() == 1) {
                    b0Var.a();
                }
            }
        }
    }

    public final void g() {
        F f8;
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((b0) ((H) this.mObservers.get(size))).f8371a;
            if (!(recyclerView.mPendingSavedState == null || (f8 = recyclerView.mAdapter) == null || !f8.canRestoreState())) {
                recyclerView.requestLayout();
            }
        }
    }
}
