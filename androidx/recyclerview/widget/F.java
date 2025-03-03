package androidx.recyclerview.widget;

import android.database.Observable;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.WeakHashMap;
import q0.C1361h;
import v0.C1510H;

public abstract class F {
    private boolean mHasStableIds = false;
    private final G mObservable = new Observable();
    private E mStateRestorationPolicy = E.f8271U;

    public final void bindViewHolder(j0 j0Var, int i) {
        boolean z;
        if (j0Var.mBindingAdapter == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j0Var.mPosition = i;
            if (hasStableIds()) {
                j0Var.mItemId = getItemId(i);
            }
            j0Var.setFlags(1, 519);
            int i8 = C1361h.f14708a;
            Trace.beginSection("RV OnBindView");
        }
        j0Var.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (j0Var.itemView.getParent() == null) {
                View view = j0Var.itemView;
                WeakHashMap weakHashMap = C1510H.f15874a;
                if (view.isAttachedToWindow() != j0Var.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + j0Var.isTmpDetached() + ", attached to window: " + j0Var.itemView.isAttachedToWindow() + ", holder: " + j0Var);
                }
            }
            if (j0Var.itemView.getParent() == null) {
                View view2 = j0Var.itemView;
                WeakHashMap weakHashMap2 = C1510H.f15874a;
                if (view2.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + j0Var);
                }
            }
        }
        onBindViewHolder(j0Var, i, j0Var.getUnmodifiedPayloads());
        if (z) {
            j0Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = j0Var.itemView.getLayoutParams();
            if (layoutParams instanceof S) {
                ((S) layoutParams).f8325W = true;
            }
            int i9 = C1361h.f14708a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int ordinal = this.mStateRestorationPolicy.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return true;
            }
            return false;
        } else if (getItemCount() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public final j0 createViewHolder(ViewGroup viewGroup, int i) {
        try {
            int i8 = C1361h.f14708a;
            Trace.beginSection("RV CreateView");
            j0 onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (onCreateViewHolder.itemView.getParent() == null) {
                onCreateViewHolder.mItemViewType = i;
                Trace.endSection();
                return onCreateViewHolder;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th) {
            int i9 = C1361h.f14708a;
            Trace.endSection();
            throw th;
        }
    }

    public int findRelativeAdapterPositionIn(F f8, j0 j0Var, int i) {
        if (f8 == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final E getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.d(i, 1, (Object) null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.e(i, 1);
    }

    public final void notifyItemMoved(int i, int i8) {
        this.mObservable.c(i, i8);
    }

    public final void notifyItemRangeChanged(int i, int i8) {
        this.mObservable.d(i, i8, (Object) null);
    }

    public final void notifyItemRangeInserted(int i, int i8) {
        this.mObservable.e(i, i8);
    }

    public final void notifyItemRangeRemoved(int i, int i8) {
        this.mObservable.f(i, i8);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.f(i, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(j0 j0Var, int i);

    public void onBindViewHolder(j0 j0Var, int i, List<Object> list) {
        onBindViewHolder(j0Var, i);
    }

    public abstract j0 onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(j0 j0Var) {
        return false;
    }

    public void onViewAttachedToWindow(j0 j0Var) {
    }

    public void onViewDetachedFromWindow(j0 j0Var) {
    }

    public void onViewRecycled(j0 j0Var) {
    }

    public void registerAdapterDataObserver(H h5) {
        this.mObservable.registerObserver(h5);
    }

    public void setHasStableIds(boolean z) {
        if (!hasObservers()) {
            this.mHasStableIds = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void setStateRestorationPolicy(E e) {
        this.mStateRestorationPolicy = e;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(H h5) {
        this.mObservable.unregisterObserver(h5);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.d(i, 1, obj);
    }

    public final void notifyItemRangeChanged(int i, int i8, Object obj) {
        this.mObservable.d(i, i8, obj);
    }
}
