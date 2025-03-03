package com.woxthebox.draglistview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.j0;
import com.woxthebox.draglistview.AutoScroller;

public class DragItemRecyclerView extends RecyclerView implements AutoScroller.AutoScrollListener {
    /* access modifiers changed from: private */
    public DragItemAdapter mAdapter;
    private AutoScroller mAutoScroller;
    private boolean mCanNotDragAboveTop;
    private boolean mCanNotDragBelowBottom;
    private boolean mClipToPadding;
    private boolean mDisableReorderWhenDragging;
    private DragItemCallback mDragCallback;
    private boolean mDragEnabled = true;
    /* access modifiers changed from: private */
    public DragItem mDragItem;
    private long mDragItemId = -1;
    /* access modifiers changed from: private */
    public int mDragItemPosition;
    private DragState mDragState = DragState.DRAG_ENDED;
    /* access modifiers changed from: private */
    public Drawable mDropTargetBackgroundDrawable;
    /* access modifiers changed from: private */
    public Drawable mDropTargetForegroundDrawable;
    /* access modifiers changed from: private */
    public boolean mHoldChangePosition;
    private DragItemListener mListener;
    private boolean mScrollingEnabled = true;
    private float mStartY;
    private int mTouchSlop;

    public interface DragItemCallback {
        boolean canDragItemAtPosition(int i);

        boolean canDropItemAtPosition(int i);
    }

    public interface DragItemListener {
        void onDragEnded(int i);

        void onDragStarted(int i, float f8, float f9);

        void onDragging(int i, float f8, float f9);
    }

    public enum DragState {
        DRAG_STARTED,
        DRAGGING,
        DRAG_ENDED
    }

    public DragItemRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        init();
    }

    private void init() {
        this.mAutoScroller = new AutoScroller(getContext(), this);
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        addItemDecoration(new N() {
            private void drawDecoration(Canvas canvas, RecyclerView recyclerView, Drawable drawable) {
                if (DragItemRecyclerView.this.mAdapter != null && DragItemRecyclerView.this.mAdapter.getDropTargetId() != -1 && drawable != null) {
                    for (int i = 0; i < recyclerView.getChildCount(); i++) {
                        View childAt = recyclerView.getChildAt(i);
                        int childAdapterPosition = DragItemRecyclerView.this.getChildAdapterPosition(childAt);
                        if (childAdapterPosition != -1 && DragItemRecyclerView.this.mAdapter.getItemId(childAdapterPosition) == DragItemRecyclerView.this.mAdapter.getDropTargetId()) {
                            drawable.setBounds(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            drawable.draw(canvas);
                        }
                    }
                }
            }

            public void onDraw(Canvas canvas, RecyclerView recyclerView, f0 f0Var) {
                onDraw(canvas, recyclerView);
                drawDecoration(canvas, recyclerView, DragItemRecyclerView.this.mDropTargetBackgroundDrawable);
            }

            public void onDrawOver(Canvas canvas, RecyclerView recyclerView, f0 f0Var) {
                onDrawOver(canvas, recyclerView);
                drawDecoration(canvas, recyclerView, DragItemRecyclerView.this.mDropTargetForegroundDrawable);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onDragItemAnimationEnd() {
        this.mAdapter.setDragItemId(-1);
        this.mAdapter.setDropTargetId(-1);
        this.mAdapter.notifyDataSetChanged();
        this.mDragState = DragState.DRAG_ENDED;
        DragItemListener dragItemListener = this.mListener;
        if (dragItemListener != null) {
            dragItemListener.onDragEnded(this.mDragItemPosition);
        }
        this.mDragItemId = -1;
        this.mDragItem.hide();
        setEnabled(true);
        invalidate();
    }

    private boolean shouldChangeItemPosition(int i) {
        int i8;
        if (this.mHoldChangePosition || (i8 = this.mDragItemPosition) == -1 || i8 == i) {
            return false;
        }
        if ((this.mCanNotDragAboveTop && i == 0) || (this.mCanNotDragBelowBottom && i == this.mAdapter.getItemCount() - 1)) {
            return false;
        }
        DragItemCallback dragItemCallback = this.mDragCallback;
        if (dragItemCallback == null || dragItemCallback.canDropItemAtPosition(i)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0143, code lost:
        if (r9.itemView.getTop() >= r1) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015c, code lost:
        if (r9.itemView.getLeft() >= r6) goto L_0x0145;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateDragPositionAndScroll() {
        /*
            r11 = this;
            com.woxthebox.draglistview.DragItem r0 = r11.mDragItem
            float r0 = r0.getX()
            com.woxthebox.draglistview.DragItem r1 = r11.mDragItem
            float r1 = r1.getY()
            android.view.View r0 = r11.findChildView(r0, r1)
            int r1 = r11.getChildLayoutPosition(r0)
            r2 = -1
            if (r1 == r2) goto L_0x01e4
            if (r0 != 0) goto L_0x001b
            goto L_0x01e4
        L_0x001b:
            androidx.recyclerview.widget.Q r3 = r11.getLayoutManager()
            boolean r3 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x007a
            androidx.recyclerview.widget.Q r3 = r11.getLayoutManager()
            boolean r3 = r3 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r3 != 0) goto L_0x007a
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r6 = r0.getMeasuredHeight()
            int r7 = r3.topMargin
            int r6 = r6 + r7
            int r7 = r3.bottomMargin
            int r6 = r6 + r7
            int r7 = r0.getTop()
            int r3 = r3.topMargin
            int r7 = r7 - r3
            int r3 = r6 / 2
            int r3 = r3 + r7
            int r7 = r11.mDragItemPosition
            int r8 = r11.getChildLayoutPosition(r0)
            if (r7 >= r8) goto L_0x005e
            com.woxthebox.draglistview.DragItem r7 = r11.mDragItem
            float r7 = r7.getY()
            float r3 = (float) r3
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x005c
        L_0x005a:
            r3 = 1
            goto L_0x006a
        L_0x005c:
            r3 = 0
            goto L_0x006a
        L_0x005e:
            com.woxthebox.draglistview.DragItem r7 = r11.mDragItem
            float r7 = r7.getY()
            float r3 = (float) r3
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x005c
            goto L_0x005a
        L_0x006a:
            com.woxthebox.draglistview.DragItem r7 = r11.mDragItem
            android.view.View r7 = r7.getDragItemView()
            int r7 = r7.getMeasuredHeight()
            if (r6 <= r7) goto L_0x007a
            if (r3 != 0) goto L_0x007a
            int r1 = r11.mDragItemPosition
        L_0x007a:
            androidx.recyclerview.widget.Q r3 = r11.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            boolean r6 = r11.shouldChangeItemPosition(r1)
            if (r6 == 0) goto L_0x00e3
            boolean r6 = r11.mDisableReorderWhenDragging
            if (r6 == 0) goto L_0x0099
            com.woxthebox.draglistview.DragItemAdapter r2 = r11.mAdapter
            long r6 = r2.getItemId(r1)
            r2.setDropTargetId(r6)
            com.woxthebox.draglistview.DragItemAdapter r1 = r11.mAdapter
            r1.notifyDataSetChanged()
            goto L_0x00e3
        L_0x0099:
            int r6 = r3.Y0()
            android.view.View r7 = r3.B(r6)
            com.woxthebox.draglistview.DragItemAdapter r8 = r11.mAdapter
            int r9 = r11.mDragItemPosition
            r8.changeItemPosition(r9, r1)
            r11.mDragItemPosition = r1
            int r1 = r3.f8283j0
            if (r1 != r5) goto L_0x00c9
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.topMargin
            int r7 = r7.getTop()
            int r7 = r7 - r1
            r3.f8290r0 = r6
            r3.f8291s0 = r7
            androidx.recyclerview.widget.x r1 = r3.f8292t0
            if (r1 == 0) goto L_0x00c5
            r1.f8544U = r2
        L_0x00c5:
            r3.z0()
            goto L_0x00e3
        L_0x00c9:
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.leftMargin
            int r7 = r7.getLeft()
            int r7 = r7 - r1
            r3.f8290r0 = r6
            r3.f8291s0 = r7
            androidx.recyclerview.widget.x r1 = r3.f8292t0
            if (r1 == 0) goto L_0x00e0
            r1.f8544U = r2
        L_0x00e0:
            r3.z0()
        L_0x00e3:
            boolean r1 = r11.mClipToPadding
            if (r1 == 0) goto L_0x00ec
            int r1 = r11.getPaddingTop()
            goto L_0x00ed
        L_0x00ec:
            r1 = 0
        L_0x00ed:
            boolean r2 = r11.mClipToPadding
            if (r2 == 0) goto L_0x00fb
            int r2 = r11.getHeight()
            int r6 = r11.getPaddingBottom()
            int r2 = r2 - r6
            goto L_0x00ff
        L_0x00fb:
            int r2 = r11.getHeight()
        L_0x00ff:
            boolean r6 = r11.mClipToPadding
            if (r6 == 0) goto L_0x0108
            int r6 = r11.getPaddingLeft()
            goto L_0x0109
        L_0x0108:
            r6 = 0
        L_0x0109:
            boolean r7 = r11.mClipToPadding
            if (r7 == 0) goto L_0x0117
            int r7 = r11.getWidth()
            int r8 = r11.getPaddingRight()
            int r7 = r7 - r8
            goto L_0x011b
        L_0x0117:
            int r7 = r11.getWidth()
        L_0x011b:
            com.woxthebox.draglistview.DragItemAdapter r8 = r11.mAdapter
            int r8 = r8.getItemCount()
            int r8 = r8 - r5
            androidx.recyclerview.widget.j0 r8 = r11.findViewHolderForLayoutPosition(r8)
            androidx.recyclerview.widget.j0 r9 = r11.findViewHolderForLayoutPosition(r4)
            int r10 = r3.f8283j0
            if (r10 != r5) goto L_0x0147
            if (r8 == 0) goto L_0x013a
            android.view.View r6 = r8.itemView
            int r6 = r6.getBottom()
            if (r6 > r2) goto L_0x013a
            r2 = 1
            goto L_0x013b
        L_0x013a:
            r2 = 0
        L_0x013b:
            if (r9 == 0) goto L_0x015f
            android.view.View r6 = r9.itemView
            int r6 = r6.getTop()
            if (r6 < r1) goto L_0x015f
        L_0x0145:
            r4 = 1
            goto L_0x015f
        L_0x0147:
            if (r8 == 0) goto L_0x0153
            android.view.View r1 = r8.itemView
            int r1 = r1.getRight()
            if (r1 > r7) goto L_0x0153
            r2 = 1
            goto L_0x0154
        L_0x0153:
            r2 = 0
        L_0x0154:
            if (r9 == 0) goto L_0x015f
            android.view.View r1 = r9.itemView
            int r1 = r1.getLeft()
            if (r1 < r6) goto L_0x015f
            goto L_0x0145
        L_0x015f:
            int r1 = r3.f8283j0
            if (r1 != r5) goto L_0x01a4
            com.woxthebox.draglistview.DragItem r1 = r11.mDragItem
            float r1 = r1.getY()
            int r3 = r11.getHeight()
            int r5 = r0.getHeight()
            int r5 = r5 / 2
            int r3 = r3 - r5
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0183
            if (r2 != 0) goto L_0x0183
            com.woxthebox.draglistview.AutoScroller r0 = r11.mAutoScroller
            com.woxthebox.draglistview.AutoScroller$ScrollDirection r1 = com.woxthebox.draglistview.AutoScroller.ScrollDirection.UP
            r0.startAutoScroll(r1)
            goto L_0x01e4
        L_0x0183:
            com.woxthebox.draglistview.DragItem r1 = r11.mDragItem
            float r1 = r1.getY()
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x019e
            if (r4 != 0) goto L_0x019e
            com.woxthebox.draglistview.AutoScroller r0 = r11.mAutoScroller
            com.woxthebox.draglistview.AutoScroller$ScrollDirection r1 = com.woxthebox.draglistview.AutoScroller.ScrollDirection.DOWN
            r0.startAutoScroll(r1)
            goto L_0x01e4
        L_0x019e:
            com.woxthebox.draglistview.AutoScroller r0 = r11.mAutoScroller
            r0.stopAutoScroll()
            goto L_0x01e4
        L_0x01a4:
            com.woxthebox.draglistview.DragItem r1 = r11.mDragItem
            float r1 = r1.getX()
            int r3 = r11.getWidth()
            int r5 = r0.getWidth()
            int r5 = r5 / 2
            int r3 = r3 - r5
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x01c4
            if (r2 != 0) goto L_0x01c4
            com.woxthebox.draglistview.AutoScroller r0 = r11.mAutoScroller
            com.woxthebox.draglistview.AutoScroller$ScrollDirection r1 = com.woxthebox.draglistview.AutoScroller.ScrollDirection.LEFT
            r0.startAutoScroll(r1)
            goto L_0x01e4
        L_0x01c4:
            com.woxthebox.draglistview.DragItem r1 = r11.mDragItem
            float r1 = r1.getX()
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01df
            if (r4 != 0) goto L_0x01df
            com.woxthebox.draglistview.AutoScroller r0 = r11.mAutoScroller
            com.woxthebox.draglistview.AutoScroller$ScrollDirection r1 = com.woxthebox.draglistview.AutoScroller.ScrollDirection.RIGHT
            r0.startAutoScroll(r1)
            goto L_0x01e4
        L_0x01df:
            com.woxthebox.draglistview.AutoScroller r0 = r11.mAutoScroller
            r0.stopAutoScroll()
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woxthebox.draglistview.DragItemRecyclerView.updateDragPositionAndScroll():void");
    }

    public void addDragItemAndStart(float f8, Object obj, long j7) {
        int dragPositionForY = getDragPositionForY(f8);
        this.mDragState = DragState.DRAG_STARTED;
        this.mDragItemId = j7;
        this.mAdapter.setDragItemId(j7);
        this.mAdapter.addItem(dragPositionForY, obj);
        this.mDragItemPosition = dragPositionForY;
        this.mHoldChangePosition = true;
        postDelayed(new Runnable() {
            public void run() {
                boolean unused = DragItemRecyclerView.this.mHoldChangePosition = false;
            }
        }, getItemAnimator().e);
        invalidate();
    }

    public View findChildView(float f8, float f9) {
        int childCount = getChildCount();
        if (f9 <= 0.0f && childCount > 0) {
            return getChildAt(0);
        }
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (f8 >= ((float) (childAt.getLeft() - marginLayoutParams.leftMargin)) && f8 <= ((float) (childAt.getRight() + marginLayoutParams.rightMargin)) && f9 >= ((float) (childAt.getTop() - marginLayoutParams.topMargin)) && f9 <= ((float) (childAt.getBottom() + marginLayoutParams.bottomMargin))) {
                return childAt;
            }
        }
        return null;
    }

    public long getDragItemId() {
        return this.mDragItemId;
    }

    public int getDragPositionForY(float f8) {
        int i;
        View findChildView = findChildView(0.0f, f8);
        if (findChildView != null || getChildCount() <= 0) {
            i = getChildLayoutPosition(findChildView);
        } else {
            i = getChildLayoutPosition(getChildAt(getChildCount() - 1)) + 1;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public boolean isDragEnabled() {
        return this.mDragEnabled;
    }

    public boolean isDragging() {
        if (this.mDragState != DragState.DRAG_ENDED) {
            return true;
        }
        return false;
    }

    public void onAutoScrollColumnBy(int i) {
    }

    public void onAutoScrollPositionBy(int i, int i8) {
        if (isDragging()) {
            scrollBy(i, i8);
            updateDragPositionAndScroll();
            return;
        }
        this.mAutoScroller.stopAutoScroll();
    }

    public void onDragEnded() {
        if (this.mDragState != DragState.DRAG_ENDED) {
            this.mAutoScroller.stopAutoScroll();
            setEnabled(false);
            if (this.mDisableReorderWhenDragging) {
                DragItemAdapter dragItemAdapter = this.mAdapter;
                int positionForItemId = dragItemAdapter.getPositionForItemId(dragItemAdapter.getDropTargetId());
                if (positionForItemId != -1) {
                    this.mAdapter.swapItems(this.mDragItemPosition, positionForItemId);
                    this.mDragItemPosition = positionForItemId;
                }
                this.mAdapter.setDropTargetId(-1);
            }
            post(new Runnable() {
                public void run() {
                    DragItemRecyclerView dragItemRecyclerView = DragItemRecyclerView.this;
                    final j0 findViewHolderForAdapterPosition = dragItemRecyclerView.findViewHolderForAdapterPosition(dragItemRecyclerView.mDragItemPosition);
                    if (findViewHolderForAdapterPosition != null) {
                        if (DragItemRecyclerView.this.getItemAnimator() != null) {
                            DragItemRecyclerView.this.getItemAnimator().d(findViewHolderForAdapterPosition);
                        }
                        DragItemRecyclerView.this.mDragItem.endDrag(findViewHolderForAdapterPosition.itemView, new AnimatorListenerAdapter() {
                            public void onAnimationEnd(Animator animator) {
                                findViewHolderForAdapterPosition.itemView.setAlpha(1.0f);
                                DragItemRecyclerView.this.onDragItemAnimationEnd();
                            }
                        });
                        return;
                    }
                    DragItemRecyclerView.this.onDragItemAnimationEnd();
                }
            });
        }
    }

    public void onDragging(float f8, float f9) {
        if (this.mDragState != DragState.DRAG_ENDED) {
            this.mDragState = DragState.DRAGGING;
            this.mDragItemPosition = this.mAdapter.getPositionForItemId(this.mDragItemId);
            this.mDragItem.setPosition(f8, f9);
            if (!this.mAutoScroller.isAutoScrolling()) {
                updateDragPositionAndScroll();
            }
            DragItemListener dragItemListener = this.mListener;
            if (dragItemListener != null) {
                dragItemListener.onDragging(this.mDragItemPosition, f8, f9);
            }
            invalidate();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollingEnabled) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mStartY = motionEvent.getY();
        } else if (action == 2 && ((double) Math.abs(motionEvent.getY() - this.mStartY)) > ((double) this.mTouchSlop) * 0.5d) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public Object removeDragItemAndEnd() {
        if (this.mDragItemPosition == -1) {
            return null;
        }
        this.mAutoScroller.stopAutoScroll();
        Object removeItem = this.mAdapter.removeItem(this.mDragItemPosition);
        this.mAdapter.setDragItemId(-1);
        this.mDragState = DragState.DRAG_ENDED;
        this.mDragItemId = -1;
        invalidate();
        return removeItem;
    }

    public void setAdapter(F f8) {
        if (!isInEditMode()) {
            if (!(f8 instanceof DragItemAdapter)) {
                throw new RuntimeException("Adapter must extend DragItemAdapter");
            } else if (!f8.hasStableIds()) {
                throw new RuntimeException("Adapter must have stable ids");
            }
        }
        super.setAdapter(f8);
        this.mAdapter = (DragItemAdapter) f8;
    }

    public void setCanNotDragAboveTopItem(boolean z) {
        this.mCanNotDragAboveTop = z;
    }

    public void setCanNotDragBelowBottomItem(boolean z) {
        this.mCanNotDragBelowBottom = z;
    }

    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.mClipToPadding = z;
    }

    public void setDisableReorderWhenDragging(boolean z) {
        this.mDisableReorderWhenDragging = z;
    }

    public void setDragEnabled(boolean z) {
        this.mDragEnabled = z;
    }

    public void setDragItem(DragItem dragItem) {
        this.mDragItem = dragItem;
    }

    public void setDragItemCallback(DragItemCallback dragItemCallback) {
        this.mDragCallback = dragItemCallback;
    }

    public void setDragItemListener(DragItemListener dragItemListener) {
        this.mListener = dragItemListener;
    }

    public void setDropTargetDrawables(Drawable drawable, Drawable drawable2) {
        this.mDropTargetBackgroundDrawable = drawable;
        this.mDropTargetForegroundDrawable = drawable2;
    }

    public void setLayoutManager(Q q7) {
        super.setLayoutManager(q7);
        if (!(q7 instanceof LinearLayoutManager)) {
            throw new RuntimeException("Layout must be an instance of LinearLayoutManager");
        }
    }

    public void setScrollingEnabled(boolean z) {
        this.mScrollingEnabled = z;
    }

    public boolean startDrag(View view, long j7, float f8, float f9) {
        int positionForItemId = this.mAdapter.getPositionForItemId(j7);
        if (!this.mDragEnabled || ((this.mCanNotDragAboveTop && positionForItemId == 0) || (this.mCanNotDragBelowBottom && positionForItemId == this.mAdapter.getItemCount() - 1))) {
            return false;
        }
        DragItemCallback dragItemCallback = this.mDragCallback;
        if (dragItemCallback != null && !dragItemCallback.canDragItemAtPosition(positionForItemId)) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        this.mDragState = DragState.DRAG_STARTED;
        this.mDragItemId = j7;
        this.mDragItem.startDrag(view, f8, f9);
        this.mDragItemPosition = positionForItemId;
        updateDragPositionAndScroll();
        this.mAdapter.setDragItemId(this.mDragItemId);
        this.mAdapter.notifyDataSetChanged();
        DragItemListener dragItemListener = this.mListener;
        if (dragItemListener != null) {
            dragItemListener.onDragStarted(this.mDragItemPosition, this.mDragItem.getX(), this.mDragItem.getY());
        }
        invalidate();
        return true;
    }

    public void swapAdapter(F f8, boolean z) {
        if (!isInEditMode()) {
            if (!(f8 instanceof DragItemAdapter)) {
                throw new RuntimeException("Adapter must extend DragItemAdapter");
            } else if (!f8.hasStableIds()) {
                throw new RuntimeException("Adapter must have stable ids");
            }
        }
        setLayoutFrozen(false);
        o(f8, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
        this.mAdapter = (DragItemAdapter) f8;
    }

    public DragItemRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public DragItemRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        init();
    }
}
