package com.woxthebox.draglistview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C0499j;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import com.woxthebox.draglistview.DragItemAdapter;
import com.woxthebox.draglistview.DragItemRecyclerView;
import com.woxthebox.draglistview.swipe.ListSwipeHelper;

public class DragListView extends FrameLayout {
    private DragItem mDragItem;
    /* access modifiers changed from: private */
    public DragListCallback mDragListCallback;
    /* access modifiers changed from: private */
    public DragListListener mDragListListener;
    /* access modifiers changed from: private */
    public DragItemRecyclerView mRecyclerView;
    private ListSwipeHelper mSwipeHelper;
    /* access modifiers changed from: private */
    public float mTouchX;
    /* access modifiers changed from: private */
    public float mTouchY;

    public interface DragListCallback {
        boolean canDragItemAtPosition(int i);

        boolean canDropItemAtPosition(int i);
    }

    public static abstract class DragListCallbackAdapter implements DragListCallback {
        public boolean canDragItemAtPosition(int i) {
            return true;
        }

        public boolean canDropItemAtPosition(int i) {
            return true;
        }
    }

    public interface DragListListener {
        void onItemDragEnded(int i, int i8);

        void onItemDragStarted(int i);

        void onItemDragging(int i, float f8, float f9);
    }

    public static abstract class DragListListenerAdapter implements DragListListener {
        public void onItemDragEnded(int i, int i8) {
        }

        public void onItemDragStarted(int i) {
        }

        public void onItemDragging(int i, float f8, float f9) {
        }
    }

    public DragListView(Context context) {
        super(context);
    }

    private DragItemRecyclerView createRecyclerView() {
        DragItemRecyclerView dragItemRecyclerView = (DragItemRecyclerView) LayoutInflater.from(getContext()).inflate(R.layout.drag_item_recycler_view, this, false);
        dragItemRecyclerView.setMotionEventSplittingEnabled(false);
        dragItemRecyclerView.setItemAnimator(new C0499j());
        dragItemRecyclerView.setVerticalScrollBarEnabled(false);
        dragItemRecyclerView.setHorizontalScrollBarEnabled(false);
        dragItemRecyclerView.setDragItemListener(new DragItemRecyclerView.DragItemListener() {
            private int mDragStartPosition;

            public void onDragEnded(int i) {
                if (DragListView.this.mDragListListener != null) {
                    DragListView.this.mDragListListener.onItemDragEnded(this.mDragStartPosition, i);
                }
            }

            public void onDragStarted(int i, float f8, float f9) {
                DragListView.this.getParent().requestDisallowInterceptTouchEvent(true);
                this.mDragStartPosition = i;
                if (DragListView.this.mDragListListener != null) {
                    DragListView.this.mDragListListener.onItemDragStarted(i);
                }
            }

            public void onDragging(int i, float f8, float f9) {
                if (DragListView.this.mDragListListener != null) {
                    DragListView.this.mDragListListener.onItemDragging(i, f8, f9);
                }
            }
        });
        dragItemRecyclerView.setDragItemCallback(new DragItemRecyclerView.DragItemCallback() {
            public boolean canDragItemAtPosition(int i) {
                if (DragListView.this.mDragListCallback == null || DragListView.this.mDragListCallback.canDragItemAtPosition(i)) {
                    return true;
                }
                return false;
            }

            public boolean canDropItemAtPosition(int i) {
                if (DragListView.this.mDragListCallback == null || DragListView.this.mDragListCallback.canDropItemAtPosition(i)) {
                    return true;
                }
                return false;
            }
        });
        return dragItemRecyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0 != 3) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean handleTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            float r0 = r4.getX()
            r3.mTouchX = r0
            float r0 = r4.getY()
            r3.mTouchY = r0
            boolean r0 = r3.isDragging()
            if (r0 == 0) goto L_0x0034
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L_0x002e
            r2 = 2
            if (r0 == r2) goto L_0x0020
            r4 = 3
            if (r0 == r4) goto L_0x002e
            goto L_0x0033
        L_0x0020:
            com.woxthebox.draglistview.DragItemRecyclerView r0 = r3.mRecyclerView
            float r2 = r4.getX()
            float r4 = r4.getY()
            r0.onDragging(r2, r4)
            goto L_0x0033
        L_0x002e:
            com.woxthebox.draglistview.DragItemRecyclerView r4 = r3.mRecyclerView
            r4.onDragEnded()
        L_0x0033:
            return r1
        L_0x0034:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woxthebox.draglistview.DragListView.handleTouchEvent(android.view.MotionEvent):boolean");
    }

    public DragItemAdapter getAdapter() {
        DragItemRecyclerView dragItemRecyclerView = this.mRecyclerView;
        if (dragItemRecyclerView != null) {
            return (DragItemAdapter) dragItemRecyclerView.getAdapter();
        }
        return null;
    }

    public RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    public boolean isDragEnabled() {
        return this.mRecyclerView.isDragEnabled();
    }

    public boolean isDragging() {
        return this.mRecyclerView.isDragging();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mDragItem = new DragItem(getContext());
        DragItemRecyclerView createRecyclerView = createRecyclerView();
        this.mRecyclerView = createRecyclerView;
        createRecyclerView.setDragItem(this.mDragItem);
        addView(this.mRecyclerView);
        addView(this.mDragItem.getDragItemView());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (handleTouchEvent(motionEvent) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (handleTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void resetSwipedViews(View view) {
        ListSwipeHelper listSwipeHelper = this.mSwipeHelper;
        if (listSwipeHelper != null) {
            listSwipeHelper.resetSwipedViews(view);
        }
    }

    public void setAdapter(DragItemAdapter dragItemAdapter, boolean z) {
        this.mRecyclerView.setHasFixedSize(z);
        this.mRecyclerView.setAdapter(dragItemAdapter);
        dragItemAdapter.setDragStartedListener(new DragItemAdapter.DragStartCallback() {
            public boolean isDragging() {
                return DragListView.this.mRecyclerView.isDragging();
            }

            public boolean startDrag(View view, long j7) {
                return DragListView.this.mRecyclerView.startDrag(view, j7, DragListView.this.mTouchX, DragListView.this.mTouchY);
            }
        });
    }

    public void setCanDragHorizontally(boolean z) {
        this.mDragItem.setCanDragHorizontally(z);
    }

    public void setCanDragVertically(boolean z) {
        this.mDragItem.setCanDragVertically(z);
    }

    public void setCanNotDragAboveTopItem(boolean z) {
        this.mRecyclerView.setCanNotDragAboveTopItem(z);
    }

    public void setCanNotDragBelowBottomItem(boolean z) {
        this.mRecyclerView.setCanNotDragBelowBottomItem(z);
    }

    public void setCustomDragItem(DragItem dragItem) {
        removeViewAt(1);
        if (dragItem == null) {
            dragItem = new DragItem(getContext());
        }
        dragItem.setCanDragHorizontally(this.mDragItem.canDragHorizontally());
        dragItem.setCanDragVertically(this.mDragItem.canDragVertically());
        dragItem.setSnapToTouch(this.mDragItem.isSnapToTouch());
        this.mDragItem = dragItem;
        this.mRecyclerView.setDragItem(dragItem);
        addView(this.mDragItem.getDragItemView());
    }

    public void setDisableReorderWhenDragging(boolean z) {
        this.mRecyclerView.setDisableReorderWhenDragging(z);
    }

    public void setDragEnabled(boolean z) {
        this.mRecyclerView.setDragEnabled(z);
    }

    public void setDragListCallback(DragListCallback dragListCallback) {
        this.mDragListCallback = dragListCallback;
    }

    public void setDragListListener(DragListListener dragListListener) {
        this.mDragListListener = dragListListener;
    }

    public void setDropTargetDrawables(Drawable drawable, Drawable drawable2) {
        this.mRecyclerView.setDropTargetDrawables(drawable, drawable2);
    }

    public void setLayoutManager(Q q7) {
        this.mRecyclerView.setLayoutManager(q7);
    }

    public void setScrollingEnabled(boolean z) {
        this.mRecyclerView.setScrollingEnabled(z);
    }

    public void setSnapDragItemToTouch(boolean z) {
        this.mDragItem.setSnapToTouch(z);
    }

    public void setSwipeListener(ListSwipeHelper.OnSwipeListener onSwipeListener) {
        ListSwipeHelper listSwipeHelper = this.mSwipeHelper;
        if (listSwipeHelper == null) {
            this.mSwipeHelper = new ListSwipeHelper(getContext().getApplicationContext(), onSwipeListener);
        } else {
            listSwipeHelper.setSwipeListener(onSwipeListener);
        }
        this.mSwipeHelper.detachFromRecyclerView();
        if (onSwipeListener != null) {
            this.mSwipeHelper.attachToRecyclerView(this.mRecyclerView);
        }
    }

    public void swapAdapter(DragItemAdapter dragItemAdapter, boolean z) {
        this.mRecyclerView.swapAdapter(dragItemAdapter, z);
        dragItemAdapter.setDragStartedListener(new DragItemAdapter.DragStartCallback() {
            public boolean isDragging() {
                return DragListView.this.mRecyclerView.isDragging();
            }

            public boolean startDrag(View view, long j7) {
                return DragListView.this.mRecyclerView.startDrag(view, j7, DragListView.this.mTouchX, DragListView.this.mTouchY);
            }
        });
    }

    public DragListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DragListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
