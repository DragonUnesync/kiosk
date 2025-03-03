package androidx.recyclerview.widget;

import N.e;
import android.util.Log;
import android.view.View;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import v0.C1510H;

public abstract class j0 {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final View itemView;
    F mBindingAdapter;
    int mFlags;
    boolean mInChangeScrap = false;
    private int mIsRecyclableCount = 0;
    long mItemId = -1;
    int mItemViewType = -1;
    WeakReference<RecyclerView> mNestedRecyclerView;
    int mOldPosition = -1;
    RecyclerView mOwnerRecyclerView;
    List<Object> mPayloads = null;
    int mPendingAccessibilityState = -1;
    int mPosition = -1;
    int mPreLayoutPosition = -1;
    Z mScrapContainer = null;
    j0 mShadowedHolder = null;
    j0 mShadowingHolder = null;
    List<Object> mUnmodifiedPayloads = null;
    private int mWasImportantForAccessibilityBeforeHidden = 0;

    public j0(View view) {
        if (view != null) {
            this.itemView = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(FLAG_ADAPTER_FULLUPDATE);
        } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = DesugarCollections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i) {
        this.mFlags = i | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        List<Object> list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & 16) == 0) {
            View view = this.itemView;
            WeakHashMap weakHashMap = C1510H.f15874a;
            if (view.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public void flagRemovedAndOffsetPosition(int i, int i8, boolean z) {
        addFlags(8);
        offsetPosition(i8, z);
        this.mPosition = i;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.getAdapterPositionInRecyclerView(this);
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public final F getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        F adapter;
        int adapterPositionInRecyclerView;
        if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
            return -1;
        }
        return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i = this.mPreLayoutPosition;
        if (i == -1) {
            return this.mPosition;
        }
        return i;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int i = this.mPreLayoutPosition;
        if (i == -1) {
            return this.mPosition;
        }
        return i;
    }

    public List<Object> getUnmodifiedPayloads() {
        if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
            return FULLUPDATE_PAYLOADS;
        }
        List<Object> list = this.mPayloads;
        if (list == null || list.size() == 0) {
            return FULLUPDATE_PAYLOADS;
        }
        return this.mUnmodifiedPayloads;
    }

    public boolean hasAnyOfTheFlags(int i) {
        if ((i & this.mFlags) != 0) {
            return true;
        }
        return false;
    }

    public boolean isAdapterPositionUnknown() {
        if ((this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid()) {
            return true;
        }
        return false;
    }

    public boolean isAttachedToTransitionOverlay() {
        if (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) {
            return false;
        }
        return true;
    }

    public boolean isBound() {
        if ((this.mFlags & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isInvalid() {
        if ((this.mFlags & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) == 0) {
            View view = this.itemView;
            WeakHashMap weakHashMap = C1510H.f15874a;
            if (!view.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public boolean isRemoved() {
        if ((this.mFlags & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean isScrap() {
        if (this.mScrapContainer != null) {
            return true;
        }
        return false;
    }

    public boolean isTmpDetached() {
        if ((this.mFlags & FLAG_TMP_DETACHED) != 0) {
            return true;
        }
        return false;
    }

    public boolean isUpdated() {
        if ((this.mFlags & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean needsUpdate() {
        if ((this.mFlags & 2) != 0) {
            return true;
        }
        return false;
    }

    public void offsetPosition(int i, boolean z) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.mPosition;
        }
        if (z) {
            this.mPreLayoutPosition += i;
        }
        this.mPosition += i;
        if (this.itemView.getLayoutParams() != null) {
            ((S) this.itemView.getLayoutParams()).f8325W = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int i = this.mPendingAccessibilityState;
        if (i != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i;
        } else {
            View view = this.itemView;
            WeakHashMap weakHashMap = C1510H.f15874a;
            this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
        }
        recyclerView.setChildImportantForAccessibilityInternal(this, 4);
    }

    public void onLeftHiddenState(RecyclerView recyclerView) {
        recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        if (!RecyclerView.sDebugAssertionsEnabled || !isTmpDetached()) {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
            return;
        }
        throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int i, int i8) {
        this.mFlags = (i & i8) | (this.mFlags & (~i8));
    }

    public final void setIsRecyclable(boolean z) {
        int i;
        int i8 = this.mIsRecyclableCount;
        if (z) {
            i = i8 - 1;
        } else {
            i = i8 + 1;
        }
        this.mIsRecyclableCount = i;
        if (i < 0) {
            this.mIsRecyclableCount = 0;
            if (!RecyclerView.sDebugAssertionsEnabled) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i == 1) {
            this.mFlags |= 16;
        } else if (z && i == 0) {
            this.mFlags &= -17;
        }
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public void setScrapContainer(Z z, boolean z6) {
        this.mScrapContainer = z;
        this.mInChangeScrap = z6;
    }

    public boolean shouldBeKeptAsChild() {
        if ((this.mFlags & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean shouldIgnore() {
        if ((this.mFlags & FLAG_IGNORE) != 0) {
            return true;
        }
        return false;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public String toString() {
        String str;
        String str2;
        if (getClass().isAnonymousClass()) {
            str = "ViewHolder";
        } else {
            str = getClass().getSimpleName();
        }
        StringBuilder B8 = e.B(str, "{");
        B8.append(Integer.toHexString(hashCode()));
        B8.append(" position=");
        B8.append(this.mPosition);
        B8.append(" id=");
        B8.append(this.mItemId);
        B8.append(", oldPos=");
        B8.append(this.mOldPosition);
        B8.append(", pLpos:");
        B8.append(this.mPreLayoutPosition);
        StringBuilder sb = new StringBuilder(B8.toString());
        if (isScrap()) {
            sb.append(" scrap ");
            if (this.mInChangeScrap) {
                str2 = "[changeScrap]";
            } else {
                str2 = "[attachedScrap]";
            }
            sb.append(str2);
        }
        if (isInvalid()) {
            sb.append(" invalid");
        }
        if (!isBound()) {
            sb.append(" unbound");
        }
        if (needsUpdate()) {
            sb.append(" update");
        }
        if (isRemoved()) {
            sb.append(" removed");
        }
        if (shouldIgnore()) {
            sb.append(" ignored");
        }
        if (isTmpDetached()) {
            sb.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public void unScrap() {
        this.mScrapContainer.m(this);
    }

    public boolean wasReturnedFromScrap() {
        if ((this.mFlags & FLAG_RETURNED_FROM_SCRAP) != 0) {
            return true;
        }
        return false;
    }
}
