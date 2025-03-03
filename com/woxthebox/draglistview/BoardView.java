package com.woxthebox.draglistview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.recyclerview.widget.C0499j;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import com.woxthebox.draglistview.AutoScroller;
import com.woxthebox.draglistview.ColumnProperties;
import com.woxthebox.draglistview.DragItemAdapter;
import com.woxthebox.draglistview.DragItemRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import v0.C1510H;

public class BoardView extends HorizontalScrollView implements AutoScroller.AutoScrollListener {
    private static final int SCROLL_ANIMATION_DURATION = 325;
    private AutoScroller mAutoScroller;
    /* access modifiers changed from: private */
    public BoardCallback mBoardCallback;
    private int mBoardEdge = 0;
    /* access modifiers changed from: private */
    public BoardListener mBoardListener;
    /* access modifiers changed from: private */
    public LinearLayout mColumnLayout;
    private int mColumnSpacing = 0;
    private int mColumnWidth;
    /* access modifiers changed from: private */
    public int mCurrentColumn;
    /* access modifiers changed from: private */
    public DragItemRecyclerView mCurrentRecyclerView;
    /* access modifiers changed from: private */
    public DragItem mDragColumn;
    /* access modifiers changed from: private */
    public int mDragColumnStartPosition;
    private float mDragColumnStartScrollX;
    private boolean mDragEnabled = true;
    /* access modifiers changed from: private */
    public DragItem mDragItem;
    /* access modifiers changed from: private */
    public int mDragStartColumn;
    /* access modifiers changed from: private */
    public int mDragStartRow;
    private ArrayList<View> mFooters = new ArrayList<>();
    private GestureDetector mGestureDetector;
    private boolean mHasLaidOut;
    private ArrayList<View> mHeaders = new ArrayList<>();
    /* access modifiers changed from: private */
    public int mLastDragColumn = -1;
    /* access modifiers changed from: private */
    public int mLastDragRow = -1;
    /* access modifiers changed from: private */
    public ArrayList<DragItemRecyclerView> mLists = new ArrayList<>();
    /* access modifiers changed from: private */
    public FrameLayout mRootLayout;
    private SavedState mSavedState;
    private Scroller mScroller;
    private ColumnSnapPosition mSnapPosition = ColumnSnapPosition.CENTER;
    private boolean mSnapToColumnInLandscape = false;
    private boolean mSnapToColumnWhenDragging = true;
    private boolean mSnapToColumnWhenScrolling = true;
    /* access modifiers changed from: private */
    public float mTouchX;
    /* access modifiers changed from: private */
    public float mTouchY;

    /* renamed from: com.woxthebox.draglistview.BoardView$8  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$com$woxthebox$draglistview$BoardView$ColumnSnapPosition;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.woxthebox.draglistview.BoardView$ColumnSnapPosition[] r0 = com.woxthebox.draglistview.BoardView.ColumnSnapPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$woxthebox$draglistview$BoardView$ColumnSnapPosition = r0
                com.woxthebox.draglistview.BoardView$ColumnSnapPosition r1 = com.woxthebox.draglistview.BoardView.ColumnSnapPosition.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$woxthebox$draglistview$BoardView$ColumnSnapPosition     // Catch:{ NoSuchFieldError -> 0x001d }
                com.woxthebox.draglistview.BoardView$ColumnSnapPosition r1 = com.woxthebox.draglistview.BoardView.ColumnSnapPosition.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$woxthebox$draglistview$BoardView$ColumnSnapPosition     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.woxthebox.draglistview.BoardView$ColumnSnapPosition r1 = com.woxthebox.draglistview.BoardView.ColumnSnapPosition.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.woxthebox.draglistview.BoardView.AnonymousClass8.<clinit>():void");
        }
    }

    public interface BoardCallback {
        boolean canDragColumnAtPosition(int i);

        boolean canDragItemAtPosition(int i, int i8);

        boolean canDropColumnAtPosition(int i, int i8);

        boolean canDropItemAtPosition(int i, int i8, int i9, int i10);
    }

    public interface BoardListener {
        void onColumnDragChangedPosition(int i, int i8);

        void onColumnDragEnded(int i, int i8);

        void onColumnDragStarted(int i);

        void onFocusedColumnChanged(int i, int i8);

        void onItemChangedColumn(int i, int i8);

        void onItemChangedPosition(int i, int i8, int i9, int i10);

        void onItemDragEnded(int i, int i8, int i9, int i10);

        void onItemDragStarted(int i, int i8);
    }

    public static abstract class BoardListenerAdapter implements BoardListener {
        public void onColumnDragChangedPosition(int i, int i8) {
        }

        public void onColumnDragEnded(int i, int i8) {
        }

        public void onColumnDragStarted(int i) {
        }

        public void onFocusedColumnChanged(int i, int i8) {
        }

        public void onItemChangedColumn(int i, int i8) {
        }

        public void onItemChangedPosition(int i, int i8, int i9, int i10) {
        }

        public void onItemDragEnded(int i, int i8, int i9, int i10) {
        }

        public void onItemDragStarted(int i, int i8) {
        }
    }

    public enum ColumnSnapPosition {
        LEFT,
        CENTER,
        RIGHT
    }

    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private int mStartColumn;
        private float mStartScrollX;

        private GestureListener() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            this.mStartScrollX = (float) BoardView.this.getScrollX();
            this.mStartColumn = BoardView.this.mCurrentColumn;
            return super.onDown(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
            boolean z;
            int access$2100 = BoardView.this.getClosestSnapColumn();
            int i = this.mStartColumn;
            int i8 = 0;
            if ((access$2100 <= i || f8 <= 0.0f) && (access$2100 >= i || f8 >= 0.0f)) {
                z = false;
            } else {
                z = true;
            }
            if (this.mStartScrollX == ((float) BoardView.this.getScrollX())) {
                access$2100 = this.mStartColumn;
            } else if (this.mStartColumn == access$2100 || z) {
                if (f8 < 0.0f) {
                    access$2100++;
                } else {
                    access$2100--;
                }
            }
            if (access$2100 < 0 || access$2100 > BoardView.this.mLists.size() - 1) {
                if (access$2100 >= 0) {
                    i8 = BoardView.this.mLists.size() - 1;
                }
                access$2100 = i8;
            }
            BoardView.this.scrollToColumn(access$2100, true);
            return true;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int currentColumn;

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentColumn);
        }

        private SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.currentColumn = i;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.currentColumn = parcel.readInt();
        }
    }

    public BoardView(Context context) {
        super(context);
    }

    private DragItemRecyclerView addColumnTo(int i, ColumnProperties columnProperties) {
        int i8;
        if (i <= getColumnCount()) {
            final DragItemRecyclerView dragItemRecyclerView = (DragItemRecyclerView) LayoutInflater.from(getContext()).inflate(R.layout.drag_item_recycler_view, this, false);
            dragItemRecyclerView.setId(getColumnCount());
            dragItemRecyclerView.setHorizontalScrollBarEnabled(false);
            dragItemRecyclerView.setVerticalScrollBarEnabled(false);
            dragItemRecyclerView.setMotionEventSplittingEnabled(false);
            dragItemRecyclerView.setDragItem(this.mDragItem);
            dragItemRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            Q layoutManager = columnProperties.getLayoutManager();
            if (layoutManager == null) {
                getContext();
                layoutManager = new LinearLayoutManager(1);
            }
            dragItemRecyclerView.setLayoutManager(layoutManager);
            dragItemRecyclerView.setBackgroundColor(columnProperties.getItemsSectionBackgroundColor());
            dragItemRecyclerView.setHasFixedSize(columnProperties.hasFixedItemSize());
            List<N> itemDecorations = columnProperties.getItemDecorations();
            for (int i9 = 0; i9 < itemDecorations.size(); i9++) {
                dragItemRecyclerView.addItemDecoration(itemDecorations.get(i9));
            }
            dragItemRecyclerView.setItemAnimator(new C0499j());
            dragItemRecyclerView.setDragItemListener(new DragItemRecyclerView.DragItemListener() {
                public void onDragEnded(int i) {
                    int unused = BoardView.this.mLastDragColumn = -1;
                    int unused2 = BoardView.this.mLastDragRow = -1;
                    if (BoardView.this.mBoardListener != null) {
                        BoardView.this.mBoardListener.onItemDragEnded(BoardView.this.mDragStartColumn, BoardView.this.mDragStartRow, BoardView.this.getColumnOfList(dragItemRecyclerView), i);
                    }
                }

                public void onDragStarted(int i, float f8, float f9) {
                    BoardView boardView = BoardView.this;
                    int unused = boardView.mDragStartColumn = boardView.getColumnOfList(dragItemRecyclerView);
                    int unused2 = BoardView.this.mDragStartRow = i;
                    DragItemRecyclerView unused3 = BoardView.this.mCurrentRecyclerView = dragItemRecyclerView;
                    BoardView.this.mDragItem.setOffset(((View) BoardView.this.mCurrentRecyclerView.getParent()).getX(), BoardView.this.mCurrentRecyclerView.getY());
                    if (BoardView.this.mBoardListener != null) {
                        BoardView.this.mBoardListener.onItemDragStarted(BoardView.this.mDragStartColumn, BoardView.this.mDragStartRow);
                    }
                    BoardView.this.invalidate();
                }

                public void onDragging(int i, float f8, float f9) {
                    boolean z;
                    int access$800 = BoardView.this.getColumnOfList(dragItemRecyclerView);
                    if (access$800 == BoardView.this.mLastDragColumn && i == BoardView.this.mLastDragRow) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (BoardView.this.mBoardListener != null && z) {
                        int unused = BoardView.this.mLastDragColumn = access$800;
                        int unused2 = BoardView.this.mLastDragRow = i;
                        BoardView.this.mBoardListener.onItemChangedPosition(BoardView.this.mDragStartColumn, BoardView.this.mDragStartRow, access$800, i);
                    }
                }
            });
            dragItemRecyclerView.setDragItemCallback(new DragItemRecyclerView.DragItemCallback() {
                public boolean canDragItemAtPosition(int i) {
                    int access$800 = BoardView.this.getColumnOfList(dragItemRecyclerView);
                    if (BoardView.this.mBoardCallback == null || BoardView.this.mBoardCallback.canDragItemAtPosition(access$800, i)) {
                        return true;
                    }
                    return false;
                }

                public boolean canDropItemAtPosition(int i) {
                    int access$800 = BoardView.this.getColumnOfList(dragItemRecyclerView);
                    if (BoardView.this.mBoardCallback == null || BoardView.this.mBoardCallback.canDropItemAtPosition(BoardView.this.mDragStartColumn, BoardView.this.mDragStartRow, access$800, i)) {
                        return true;
                    }
                    return false;
                }
            });
            DragItemAdapter dragItemAdapter = columnProperties.getDragItemAdapter();
            dragItemAdapter.setDragStartedListener(new DragItemAdapter.DragStartCallback() {
                public boolean isDragging() {
                    return dragItemRecyclerView.isDragging();
                }

                public boolean startDrag(View view, long j7) {
                    DragItemRecyclerView dragItemRecyclerView = dragItemRecyclerView;
                    return dragItemRecyclerView.startDrag(view, j7, BoardView.this.getRelativeViewTouchX((View) dragItemRecyclerView.getParent()), BoardView.this.getRelativeViewTouchY(dragItemRecyclerView));
                }
            });
            dragItemRecyclerView.setAdapter(dragItemAdapter);
            dragItemRecyclerView.setDragEnabled(this.mDragEnabled);
            dragItemRecyclerView.setBackgroundDrawable(columnProperties.getColumnBackgroundDrawable());
            Integer columnWidth = columnProperties.getColumnWidth();
            if (columnWidth != null) {
                i8 = columnWidth.intValue();
            } else {
                i8 = this.mColumnWidth;
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setBackgroundColor(columnProperties.getColumnBackgroundColor());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(i8, -1));
            View header = columnProperties.getHeader();
            if (header == null) {
                header = new View(getContext());
                header.setVisibility(8);
            }
            linearLayout.addView(header);
            this.mHeaders.add(header);
            linearLayout.addView(dragItemRecyclerView);
            this.mLists.add(i, dragItemRecyclerView);
            View footer = columnProperties.getFooter();
            if (footer == null) {
                footer = new View(getContext());
                footer.setVisibility(8);
            }
            linearLayout.addView(footer);
            this.mFooters.add(footer);
            this.mColumnLayout.addView(linearLayout, i);
            updateBoardSpaces();
            setupColumnDragListener(columnProperties.getColumnDragView(), dragItemRecyclerView);
            return dragItemRecyclerView;
        }
        throw new IllegalArgumentException("Index is out of bounds");
    }

    private void endDragColumn() {
        DragItem dragItem = this.mDragColumn;
        dragItem.endDrag(dragItem.getRealDragView(), new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                BoardView.this.mDragColumn.getRealDragView().setAlpha(1.0f);
                BoardView.this.mDragColumn.hide();
                BoardView.this.mRootLayout.removeView(BoardView.this.mDragColumn.getDragItemView());
                if (BoardView.this.mBoardListener != null) {
                    BoardListener access$500 = BoardView.this.mBoardListener;
                    int access$600 = BoardView.this.mDragColumnStartPosition;
                    BoardView boardView = BoardView.this;
                    access$500.onColumnDragEnded(access$600, boardView.getColumnOfList(boardView.mCurrentRecyclerView));
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public int getClosestSnapColumn() {
        int i;
        int i8 = Integer.MAX_VALUE;
        int i9 = 0;
        for (int i10 = 0; i10 < this.mLists.size(); i10++) {
            View view = (View) this.mLists.get(i10).getParent();
            int i11 = AnonymousClass8.$SwitchMap$com$woxthebox$draglistview$BoardView$ColumnSnapPosition[this.mSnapPosition.ordinal()];
            if (i11 == 1) {
                i = Math.abs(view.getLeft() - getScrollX());
            } else if (i11 == 2) {
                i = Math.abs(((this.mColumnWidth / 2) + view.getLeft()) - ((getMeasuredWidth() / 2) + getScrollX()));
            } else if (i11 != 3) {
                i = 0;
            } else {
                int scrollX = getScrollX();
                i = Math.abs(view.getRight() - (getMeasuredWidth() + scrollX));
            }
            if (i < i8) {
                i9 = i10;
                i8 = i;
            }
        }
        return i9;
    }

    /* access modifiers changed from: private */
    public int getColumnOfList(DragItemRecyclerView dragItemRecyclerView) {
        int i = 0;
        for (int i8 = 0; i8 < this.mLists.size(); i8++) {
            if (this.mLists.get(i8) == dragItemRecyclerView) {
                i = i8;
            }
        }
        return i;
    }

    private int getCurrentColumn(float f8) {
        for (int i = 0; i < this.mLists.size(); i++) {
            View view = (View) this.mLists.get(i).getParent();
            if (((float) view.getLeft()) <= f8 && ((float) view.getRight()) > f8) {
                return i;
            }
        }
        return 0;
    }

    private DragItemRecyclerView getCurrentRecyclerView(float f8) {
        Iterator<DragItemRecyclerView> it = this.mLists.iterator();
        while (it.hasNext()) {
            DragItemRecyclerView next = it.next();
            View view = (View) next.getParent();
            if (((float) view.getLeft()) <= f8 && ((float) view.getRight()) > f8) {
                return next;
            }
        }
        return this.mCurrentRecyclerView;
    }

    /* access modifiers changed from: private */
    public float getRelativeViewTouchX(View view) {
        return (this.mTouchX + ((float) getScrollX())) - ((float) view.getLeft());
    }

    /* access modifiers changed from: private */
    public float getRelativeViewTouchY(View view) {
        return this.mTouchY - ((float) view.getTop());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r5 != 3) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean handleTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.util.ArrayList<com.woxthebox.draglistview.DragItemRecyclerView> r0 = r4.mLists
            int r0 = r0.size()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            float r0 = r5.getX()
            r4.mTouchX = r0
            float r0 = r5.getY()
            r4.mTouchY = r0
            boolean r0 = r4.isDragging()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L_0x005d
            int r5 = r5.getAction()
            if (r5 == r3) goto L_0x0036
            r0 = 2
            if (r5 == r0) goto L_0x002a
            if (r5 == r2) goto L_0x0036
            goto L_0x005c
        L_0x002a:
            com.woxthebox.draglistview.AutoScroller r5 = r4.mAutoScroller
            boolean r5 = r5.isAutoScrolling()
            if (r5 != 0) goto L_0x005c
            r4.updateScrollPosition()
            goto L_0x005c
        L_0x0036:
            com.woxthebox.draglistview.AutoScroller r5 = r4.mAutoScroller
            r5.stopAutoScroll()
            boolean r5 = r4.isDraggingColumn()
            if (r5 == 0) goto L_0x0045
            r4.endDragColumn()
            goto L_0x004a
        L_0x0045:
            com.woxthebox.draglistview.DragItemRecyclerView r5 = r4.mCurrentRecyclerView
            r5.onDragEnded()
        L_0x004a:
            boolean r5 = r4.snapToColumnWhenScrolling()
            if (r5 == 0) goto L_0x0059
            com.woxthebox.draglistview.DragItemRecyclerView r5 = r4.mCurrentRecyclerView
            int r5 = r4.getColumnOfList(r5)
            r4.scrollToColumn(r5, r3)
        L_0x0059:
            r4.invalidate()
        L_0x005c:
            return r3
        L_0x005d:
            boolean r0 = r4.snapToColumnWhenScrolling()
            if (r0 == 0) goto L_0x006c
            android.view.GestureDetector r0 = r4.mGestureDetector
            boolean r0 = r0.onTouchEvent(r5)
            if (r0 == 0) goto L_0x006c
            return r3
        L_0x006c:
            int r5 = r5.getAction()
            if (r5 == 0) goto L_0x0085
            if (r5 == r3) goto L_0x0077
            if (r5 == r2) goto L_0x0077
            goto L_0x0092
        L_0x0077:
            boolean r5 = r4.snapToColumnWhenScrolling()
            if (r5 == 0) goto L_0x0092
            int r5 = r4.getClosestSnapColumn()
            r4.scrollToColumn(r5, r3)
            goto L_0x0092
        L_0x0085:
            android.widget.Scroller r5 = r4.mScroller
            boolean r5 = r5.isFinished()
            if (r5 != 0) goto L_0x0092
            android.widget.Scroller r5 = r4.mScroller
            r5.forceFinished(r3)
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woxthebox.draglistview.BoardView.handleTouchEvent(android.view.MotionEvent):boolean");
    }

    private void init(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.BoardView);
        this.mColumnSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.BoardView_columnSpacing, 0);
        this.mBoardEdge = obtainStyledAttributes.getDimensionPixelSize(R.styleable.BoardView_boardEdges, 0);
        obtainStyledAttributes.recycle();
    }

    private boolean isDragging() {
        DragItemRecyclerView dragItemRecyclerView = this.mCurrentRecyclerView;
        if (dragItemRecyclerView == null || (!dragItemRecyclerView.isDragging() && !isDraggingColumn())) {
            return false;
        }
        return true;
    }

    private boolean isDraggingColumn() {
        if (this.mCurrentRecyclerView == null || !this.mDragColumn.isDragging()) {
            return false;
        }
        return true;
    }

    private void moveColumn(int i, int i8) {
        this.mLists.add(i8, this.mLists.remove(i));
        this.mHeaders.add(i8, this.mHeaders.remove(i));
        this.mFooters.add(i8, this.mFooters.remove(i));
        final View childAt = this.mColumnLayout.getChildAt(i);
        final View childAt2 = this.mColumnLayout.getChildAt(i8);
        this.mColumnLayout.removeViewAt(i);
        this.mColumnLayout.addView(childAt, i8);
        updateBoardSpaces();
        this.mColumnLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                BoardView.this.mColumnLayout.removeOnLayoutChangeListener(this);
                View view2 = childAt2;
                view2.setTranslationX((view2.getTranslationX() + ((float) childAt.getLeft())) - ((float) childAt2.getLeft()));
                childAt2.animate().translationX(0.0f).setDuration(350).start();
            }
        });
        BoardListener boardListener = this.mBoardListener;
        if (boardListener != null) {
            boardListener.onColumnDragChangedPosition(i, i8);
        }
    }

    private void setupColumnDragListener(View view, final DragItemRecyclerView dragItemRecyclerView) {
        if (view != null) {
            view.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    if (BoardView.this.mBoardCallback != null && !BoardView.this.mBoardCallback.canDragColumnAtPosition(BoardView.this.getColumnOfList(dragItemRecyclerView))) {
                        return false;
                    }
                    BoardView boardView = BoardView.this;
                    boardView.startDragColumn(dragItemRecyclerView, boardView.mTouchX, BoardView.this.mTouchY);
                    return true;
                }
            });
        }
    }

    private boolean snapToColumnWhenDragging() {
        boolean z;
        if (getResources().getConfiguration().orientation == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.mSnapToColumnWhenDragging) {
            return false;
        }
        if (z || this.mSnapToColumnInLandscape) {
            return true;
        }
        return false;
    }

    private boolean snapToColumnWhenScrolling() {
        boolean z;
        if (getResources().getConfiguration().orientation == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.mSnapToColumnWhenScrolling) {
            return false;
        }
        if (z || this.mSnapToColumnInLandscape) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void startDragColumn(DragItemRecyclerView dragItemRecyclerView, float f8, float f9) {
        this.mDragColumnStartScrollX = (float) getScrollX();
        this.mCurrentRecyclerView = dragItemRecyclerView;
        View childAt = this.mColumnLayout.getChildAt(getColumnOfList(dragItemRecyclerView));
        this.mDragColumn.startDrag(childAt, f8, f9);
        this.mRootLayout.addView(this.mDragColumn.getDragItemView());
        childAt.setAlpha(0.0f);
        if (this.mBoardListener != null) {
            int columnOfList = getColumnOfList(this.mCurrentRecyclerView);
            this.mDragColumnStartPosition = columnOfList;
            this.mBoardListener.onColumnDragStarted(columnOfList);
        }
    }

    private void updateBoardSpaces() {
        int columnCount = getColumnCount();
        int i = this.mColumnSpacing / 2;
        for (int i8 = 0; i8 < columnCount; i8++) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mColumnLayout.getChildAt(i8).getLayoutParams();
            if (i8 == 0) {
                layoutParams.leftMargin = this.mBoardEdge;
                layoutParams.rightMargin = i;
            } else if (i8 == columnCount - 1) {
                layoutParams.leftMargin = i;
                layoutParams.rightMargin = this.mBoardEdge;
            } else {
                layoutParams.leftMargin = i;
                layoutParams.rightMargin = i;
            }
        }
    }

    private void updateScrollPosition() {
        float f8;
        Object removeDragItemAndEnd;
        if (isDraggingColumn()) {
            DragItemRecyclerView currentRecyclerView = getCurrentRecyclerView(this.mTouchX + ((float) getScrollX()));
            DragItemRecyclerView dragItemRecyclerView = this.mCurrentRecyclerView;
            if (dragItemRecyclerView != currentRecyclerView) {
                int columnOfList = getColumnOfList(dragItemRecyclerView);
                int columnOfList2 = getColumnOfList(currentRecyclerView);
                BoardCallback boardCallback = this.mBoardCallback;
                if (boardCallback == null || boardCallback.canDropColumnAtPosition(columnOfList, columnOfList2)) {
                    moveColumn(columnOfList, columnOfList2);
                }
            }
            this.mDragColumn.setPosition((this.mTouchX + ((float) getScrollX())) - this.mDragColumnStartScrollX, this.mTouchY);
        } else {
            DragItemRecyclerView currentRecyclerView2 = getCurrentRecyclerView(this.mTouchX + ((float) getScrollX()));
            DragItemRecyclerView dragItemRecyclerView2 = this.mCurrentRecyclerView;
            if (dragItemRecyclerView2 != currentRecyclerView2) {
                int columnOfList3 = getColumnOfList(dragItemRecyclerView2);
                int columnOfList4 = getColumnOfList(currentRecyclerView2);
                long dragItemId = this.mCurrentRecyclerView.getDragItemId();
                int dragPositionForY = currentRecyclerView2.getDragPositionForY(getRelativeViewTouchY(currentRecyclerView2));
                BoardCallback boardCallback2 = this.mBoardCallback;
                if ((boardCallback2 == null || boardCallback2.canDropItemAtPosition(this.mDragStartColumn, this.mDragStartRow, columnOfList4, dragPositionForY)) && (removeDragItemAndEnd = this.mCurrentRecyclerView.removeDragItemAndEnd()) != null) {
                    this.mCurrentRecyclerView = currentRecyclerView2;
                    currentRecyclerView2.addDragItemAndStart(getRelativeViewTouchY(currentRecyclerView2), removeDragItemAndEnd, dragItemId);
                    this.mDragItem.setOffset((float) ((View) this.mCurrentRecyclerView.getParent()).getLeft(), (float) this.mCurrentRecyclerView.getTop());
                    BoardListener boardListener = this.mBoardListener;
                    if (boardListener != null) {
                        boardListener.onItemChangedColumn(columnOfList3, columnOfList4);
                    }
                }
            }
            DragItemRecyclerView dragItemRecyclerView3 = this.mCurrentRecyclerView;
            dragItemRecyclerView3.onDragging(getRelativeViewTouchX((View) dragItemRecyclerView3.getParent()), getRelativeViewTouchY(this.mCurrentRecyclerView));
        }
        boolean z = true;
        if (getResources().getConfiguration().orientation != 1) {
            z = false;
        }
        float f9 = (float) getResources().getDisplayMetrics().widthPixels;
        if (z) {
            f8 = 0.06f;
        } else {
            f8 = 0.14f;
        }
        float f10 = f9 * f8;
        if (this.mTouchX > ((float) getWidth()) - f10 && getScrollX() < this.mColumnLayout.getWidth()) {
            this.mAutoScroller.startAutoScroll(AutoScroller.ScrollDirection.LEFT);
        } else if (this.mTouchX >= f10 || getScrollX() <= 0) {
            this.mAutoScroller.stopAutoScroll();
        } else {
            this.mAutoScroller.startAutoScroll(AutoScroller.ScrollDirection.RIGHT);
        }
        invalidate();
    }

    public DragItemRecyclerView addColumn(DragItemAdapter dragItemAdapter, View view, View view2, boolean z) {
        getContext();
        return addColumn(dragItemAdapter, view, view2, z, new LinearLayoutManager(1));
    }

    public void addItem(int i, int i8, Object obj, boolean z) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() >= i8) {
            ((DragItemAdapter) this.mLists.get(i).getAdapter()).addItem(i8, obj);
            if (z) {
                scrollToItem(i, i8, false);
            }
        }
    }

    public void clearBoard() {
        for (int size = this.mLists.size() - 1; size >= 0; size--) {
            this.mColumnLayout.removeViewAt(size);
            this.mHeaders.remove(size);
            this.mFooters.remove(size);
            this.mLists.remove(size);
        }
    }

    public void computeScroll() {
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(getScrollX() == currX && getScrollY() == currY)) {
                scrollTo(currX, currY);
            }
            if (this.mAutoScroller.isAutoScrolling() && isDragging()) {
                if (isDraggingColumn()) {
                    this.mDragColumn.setPosition((this.mTouchX + ((float) getScrollX())) - this.mDragColumnStartScrollX, this.mTouchY);
                } else {
                    this.mDragItem.setPosition(getRelativeViewTouchX((View) this.mCurrentRecyclerView.getParent()), getRelativeViewTouchY(this.mCurrentRecyclerView));
                }
            }
            WeakHashMap weakHashMap = C1510H.f15874a;
            postInvalidateOnAnimation();
        } else if (!snapToColumnWhenScrolling()) {
            super.computeScroll();
        }
    }

    public DragItemAdapter getAdapter(int i) {
        if (i < 0 || i >= this.mLists.size()) {
            return null;
        }
        return (DragItemAdapter) this.mLists.get(i).getAdapter();
    }

    public int getColumnCount() {
        return this.mLists.size();
    }

    public int getColumnOfFooter(View view) {
        for (int i = 0; i < this.mFooters.size(); i++) {
            if (this.mFooters.get(i) == view) {
                return i;
            }
        }
        return -1;
    }

    public int getColumnOfHeader(View view) {
        for (int i = 0; i < this.mHeaders.size(); i++) {
            if (this.mHeaders.get(i) == view) {
                return i;
            }
        }
        return -1;
    }

    public int getFocusedColumn() {
        if (!snapToColumnWhenScrolling()) {
            return 0;
        }
        return this.mCurrentColumn;
    }

    public View getFooterView(int i) {
        return this.mFooters.get(i);
    }

    public View getHeaderView(int i) {
        return this.mHeaders.get(i);
    }

    public int getItemCount() {
        Iterator<DragItemRecyclerView> it = this.mLists.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getAdapter().getItemCount();
        }
        return i;
    }

    public RecyclerView getRecyclerView(int i) {
        if (i < 0 || i >= this.mLists.size()) {
            return null;
        }
        return this.mLists.get(i);
    }

    public DragItemRecyclerView insertColumn(DragItemAdapter dragItemAdapter, int i, View view, View view2, boolean z) {
        getContext();
        return insertColumn(dragItemAdapter, i, view, view2, z, new LinearLayoutManager(1));
    }

    public boolean isDragEnabled() {
        return this.mDragEnabled;
    }

    public void moveItem(int i, int i8, int i9, int i10, boolean z) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() > i8 && this.mLists.size() > i9 && this.mLists.get(i9).getAdapter().getItemCount() >= i10) {
            ((DragItemAdapter) this.mLists.get(i9).getAdapter()).addItem(i10, ((DragItemAdapter) this.mLists.get(i).getAdapter()).removeItem(i8));
            if (z) {
                scrollToItem(i9, i10, false);
            }
        }
    }

    public void onAutoScrollColumnBy(int i) {
        if (isDragging()) {
            int i8 = this.mCurrentColumn + i;
            if (i != 0 && i8 >= 0 && i8 < this.mLists.size()) {
                scrollToColumn(i8, true);
            }
            updateScrollPosition();
            return;
        }
        this.mAutoScroller.stopAutoScroll();
    }

    public void onAutoScrollPositionBy(int i, int i8) {
        if (isDragging()) {
            scrollBy(i, i8);
            updateScrollPosition();
            return;
        }
        this.mAutoScroller.stopAutoScroll();
    }

    public void onFinishInflate() {
        AutoScroller.AutoScrollMode autoScrollMode;
        super.onFinishInflate();
        Resources resources = getResources();
        if (resources.getConfiguration().orientation == 1) {
            this.mColumnWidth = (int) (((double) resources.getDisplayMetrics().widthPixels) * 0.87d);
        } else {
            this.mColumnWidth = (int) (resources.getDisplayMetrics().density * 320.0f);
        }
        this.mGestureDetector = new GestureDetector(getContext(), new GestureListener());
        this.mScroller = new Scroller(getContext(), new DecelerateInterpolator(1.1f));
        AutoScroller autoScroller = new AutoScroller(getContext(), this);
        this.mAutoScroller = autoScroller;
        if (snapToColumnWhenDragging()) {
            autoScrollMode = AutoScroller.AutoScrollMode.COLUMN;
        } else {
            autoScrollMode = AutoScroller.AutoScrollMode.POSITION;
        }
        autoScroller.setAutoScrollMode(autoScrollMode);
        this.mDragItem = new DragItem(getContext());
        DragItem dragItem = new DragItem(getContext());
        this.mDragColumn = dragItem;
        dragItem.setSnapToTouch(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.mRootLayout = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.mColumnLayout = linearLayout;
        linearLayout.setOrientation(0);
        this.mColumnLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.mColumnLayout.setMotionEventSplittingEnabled(false);
        this.mRootLayout.addView(this.mColumnLayout);
        this.mRootLayout.addView(this.mDragItem.getDragItemView());
        addView(this.mRootLayout);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (handleTouchEvent(motionEvent) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i8, int i9, int i10) {
        SavedState savedState;
        super.onLayout(z, i, i8, i9, i10);
        updateBoardSpaces();
        if (!this.mHasLaidOut && (savedState = this.mSavedState) != null) {
            this.mCurrentColumn = savedState.currentColumn;
            this.mSavedState = null;
            post(new Runnable() {
                public void run() {
                    BoardView boardView = BoardView.this;
                    boardView.scrollToColumn(boardView.mCurrentColumn, false);
                }
            });
        }
        this.mHasLaidOut = true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mSavedState = savedState;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        int i;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (snapToColumnWhenScrolling()) {
            i = this.mCurrentColumn;
        } else {
            i = getClosestSnapColumn();
        }
        return new SavedState(onSaveInstanceState, i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (handleTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void removeColumn(int i) {
        if (i >= 0 && this.mLists.size() > i) {
            this.mColumnLayout.removeViewAt(i);
            this.mHeaders.remove(i);
            this.mFooters.remove(i);
            this.mLists.remove(i);
            updateBoardSpaces();
        }
    }

    public void removeItem(int i, int i8) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() > i8) {
            ((DragItemAdapter) this.mLists.get(i).getAdapter()).removeItem(i8);
        }
    }

    public void replaceItem(int i, int i8, Object obj, boolean z) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() > i8) {
            DragItemAdapter dragItemAdapter = (DragItemAdapter) this.mLists.get(i).getAdapter();
            dragItemAdapter.removeItem(i8);
            dragItemAdapter.addItem(i8, obj);
            if (z) {
                scrollToItem(i, i8, false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void scrollToColumn(int r11, boolean r12) {
        /*
            r10 = this;
            java.util.ArrayList<com.woxthebox.draglistview.DragItemRecyclerView> r0 = r10.mLists
            int r0 = r0.size()
            if (r0 > r11) goto L_0x0009
            return
        L_0x0009:
            java.util.ArrayList<com.woxthebox.draglistview.DragItemRecyclerView> r0 = r10.mLists
            java.lang.Object r0 = r0.get(r11)
            com.woxthebox.draglistview.DragItemRecyclerView r0 = (com.woxthebox.draglistview.DragItemRecyclerView) r0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int[] r2 = com.woxthebox.draglistview.BoardView.AnonymousClass8.$SwitchMap$com$woxthebox$draglistview$BoardView$ColumnSnapPosition
            com.woxthebox.draglistview.BoardView$ColumnSnapPosition r3 = r10.mSnapPosition
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L_0x0059
            r5 = 2
            if (r2 == r5) goto L_0x0040
            r5 = 3
            if (r2 == r5) goto L_0x0033
            r0 = 0
            goto L_0x0060
        L_0x0033:
            int r0 = r0.getRight()
            int r1 = r1.rightMargin
            int r0 = r0 + r1
            int r1 = r10.getMeasuredWidth()
        L_0x003e:
            int r0 = r0 - r1
            goto L_0x0060
        L_0x0040:
            int r2 = r10.getMeasuredWidth()
            int r6 = r0.getMeasuredWidth()
            int r2 = r2 - r6
            int r6 = r1.leftMargin
            int r2 = r2 - r6
            int r6 = r1.rightMargin
            int r2 = r2 - r6
            int r2 = r2 / r5
            int r0 = r0.getLeft()
            int r1 = r1.leftMargin
            int r0 = r0 - r1
            int r0 = r0 - r2
            goto L_0x0060
        L_0x0059:
            int r0 = r0.getLeft()
            int r1 = r1.leftMargin
            goto L_0x003e
        L_0x0060:
            android.widget.FrameLayout r1 = r10.mRootLayout
            int r1 = r1.getMeasuredWidth()
            int r2 = r10.getMeasuredWidth()
            int r1 = r1 - r2
            if (r0 >= 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = r0
        L_0x006f:
            if (r4 <= r1) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r1 = r4
        L_0x0073:
            int r0 = r10.getScrollX()
            if (r0 == r1) goto L_0x00a3
            android.widget.Scroller r0 = r10.mScroller
            r0.forceFinished(r3)
            if (r12 == 0) goto L_0x009c
            android.widget.Scroller r4 = r10.mScroller
            int r5 = r10.getScrollX()
            int r6 = r10.getScrollY()
            int r12 = r10.getScrollX()
            int r7 = r1 - r12
            r8 = 0
            r9 = 325(0x145, float:4.55E-43)
            r4.startScroll(r5, r6, r7, r8, r9)
            java.util.WeakHashMap r12 = v0.C1510H.f15874a
            r10.postInvalidateOnAnimation()
            goto L_0x00a3
        L_0x009c:
            int r12 = r10.getScrollY()
            r10.scrollTo(r1, r12)
        L_0x00a3:
            int r12 = r10.mCurrentColumn
            r10.mCurrentColumn = r11
            com.woxthebox.draglistview.BoardView$BoardListener r0 = r10.mBoardListener
            if (r0 == 0) goto L_0x00b0
            if (r12 == r11) goto L_0x00b0
            r0.onFocusedColumnChanged(r12, r11)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woxthebox.draglistview.BoardView.scrollToColumn(int, boolean):void");
    }

    public void scrollToItem(int i, int i8, boolean z) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() > i8) {
            this.mScroller.forceFinished(true);
            scrollToColumn(i, z);
            if (z) {
                this.mLists.get(i).smoothScrollToPosition(i8);
            } else {
                this.mLists.get(i).scrollToPosition(i8);
            }
        }
    }

    public void setBoardCallback(BoardCallback boardCallback) {
        this.mBoardCallback = boardCallback;
    }

    public void setBoardEdge(int i) {
        this.mBoardEdge = i;
        updateBoardSpaces();
    }

    public void setBoardListener(BoardListener boardListener) {
        this.mBoardListener = boardListener;
    }

    public void setColumnSnapPosition(ColumnSnapPosition columnSnapPosition) {
        this.mSnapPosition = columnSnapPosition;
    }

    public void setColumnSpacing(int i) {
        this.mColumnSpacing = i;
        updateBoardSpaces();
    }

    public void setColumnWidth(int i) {
        this.mColumnWidth = i;
    }

    public void setCustomColumnDragItem(DragItem dragItem) {
        DragItem dragItem2;
        if (dragItem != null) {
            dragItem2 = dragItem;
        } else {
            dragItem2 = new DragItem(getContext());
        }
        if (dragItem == null) {
            dragItem2.setSnapToTouch(false);
        }
        this.mDragColumn = dragItem2;
    }

    public void setCustomDragItem(DragItem dragItem) {
        DragItem dragItem2;
        if (dragItem != null) {
            dragItem2 = dragItem;
        } else {
            dragItem2 = new DragItem(getContext());
        }
        if (dragItem == null) {
            dragItem2.setSnapToTouch(true);
        }
        this.mDragItem = dragItem2;
        this.mRootLayout.removeViewAt(1);
        this.mRootLayout.addView(this.mDragItem.getDragItemView());
    }

    public void setDragEnabled(boolean z) {
        this.mDragEnabled = z;
        if (this.mLists.size() > 0) {
            Iterator<DragItemRecyclerView> it = this.mLists.iterator();
            while (it.hasNext()) {
                it.next().setDragEnabled(this.mDragEnabled);
            }
        }
    }

    public void setSnapDragItemToTouch(boolean z) {
        this.mDragItem.setSnapToTouch(z);
    }

    public void setSnapToColumnInLandscape(boolean z) {
        AutoScroller.AutoScrollMode autoScrollMode;
        this.mSnapToColumnInLandscape = z;
        AutoScroller autoScroller = this.mAutoScroller;
        if (snapToColumnWhenDragging()) {
            autoScrollMode = AutoScroller.AutoScrollMode.COLUMN;
        } else {
            autoScrollMode = AutoScroller.AutoScrollMode.POSITION;
        }
        autoScroller.setAutoScrollMode(autoScrollMode);
    }

    public void setSnapToColumnWhenDragging(boolean z) {
        AutoScroller.AutoScrollMode autoScrollMode;
        this.mSnapToColumnWhenDragging = z;
        AutoScroller autoScroller = this.mAutoScroller;
        if (snapToColumnWhenDragging()) {
            autoScrollMode = AutoScroller.AutoScrollMode.COLUMN;
        } else {
            autoScrollMode = AutoScroller.AutoScrollMode.POSITION;
        }
        autoScroller.setAutoScrollMode(autoScrollMode);
    }

    public void setSnapToColumnsWhenScrolling(boolean z) {
        this.mSnapToColumnWhenScrolling = z;
    }

    public int getItemCount(int i) {
        if (this.mLists.size() > i) {
            return this.mLists.get(i).getAdapter().getItemCount();
        }
        return 0;
    }

    public DragItemRecyclerView addColumn(DragItemAdapter dragItemAdapter, View view, View view2, boolean z, Q q7) {
        return addColumnTo(getColumnCount(), ColumnProperties.Builder.newBuilder(dragItemAdapter).setHeader(view).setColumnDragView(view2).setHasFixedItemSize(z).setLayoutManager(q7).build());
    }

    public DragItemRecyclerView insertColumn(DragItemAdapter dragItemAdapter, int i, View view, View view2, boolean z, Q q7) {
        return addColumnTo(i, ColumnProperties.Builder.newBuilder(dragItemAdapter).setHeader(view).setColumnDragView(view2).setHasFixedItemSize(z).setLayoutManager(q7).build());
    }

    public void moveItem(long j7, int i, int i8, boolean z) {
        for (int i9 = 0; i9 < this.mLists.size(); i9++) {
            F adapter = this.mLists.get(i9).getAdapter();
            int itemCount = adapter.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                if (adapter.getItemId(i10) == j7) {
                    moveItem(i9, i10, i, i8, z);
                    return;
                }
            }
        }
    }

    public void addColumn(ColumnProperties columnProperties) {
        addColumnTo(getColumnCount(), columnProperties);
    }

    public void insertColumn(int i, ColumnProperties columnProperties) {
        addColumnTo(i, columnProperties);
    }

    public BoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public BoardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
