package com.woxthebox.draglistview;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.j0;
import com.woxthebox.draglistview.DragItemAdapter.ViewHolder;
import java.util.Collections;
import java.util.List;

public abstract class DragItemAdapter<T, VH extends ViewHolder> extends F {
    private long mDragItemId = -1;
    private DragStartCallback mDragStartCallback;
    private long mDropTargetId = -1;
    /* access modifiers changed from: protected */
    public List<T> mItemList;

    public interface DragStartCallback {
        boolean isDragging();

        boolean startDrag(View view, long j7);
    }

    public static abstract class ViewHolder extends j0 {
        /* access modifiers changed from: private */
        public DragStartCallback mDragStartCallback;
        public View mGrabView;
        public long mItemId;

        public ViewHolder(final View view, int i, boolean z) {
            super(view);
            View findViewById = view.findViewById(i);
            this.mGrabView = findViewById;
            if (z) {
                findViewById.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        if (ViewHolder.this.mDragStartCallback == null) {
                            return false;
                        }
                        if (ViewHolder.this.mDragStartCallback.startDrag(view, ViewHolder.this.mItemId)) {
                            return true;
                        }
                        View view2 = view;
                        ViewHolder viewHolder = ViewHolder.this;
                        if (view2 == viewHolder.mGrabView) {
                            return viewHolder.onItemLongClicked(view);
                        }
                        return false;
                    }
                });
            } else {
                findViewById.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (ViewHolder.this.mDragStartCallback == null) {
                            return false;
                        }
                        if (motionEvent.getAction() == 0 && ViewHolder.this.mDragStartCallback.startDrag(view, ViewHolder.this.mItemId)) {
                            return true;
                        }
                        if (!ViewHolder.this.mDragStartCallback.isDragging()) {
                            View view2 = view;
                            ViewHolder viewHolder = ViewHolder.this;
                            if (view2 == viewHolder.mGrabView) {
                                return viewHolder.onItemTouch(view, motionEvent);
                            }
                        }
                        return false;
                    }
                });
            }
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ViewHolder.this.onItemClicked(view);
                }
            });
            if (view != this.mGrabView) {
                view.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        return ViewHolder.this.onItemLongClicked(view);
                    }
                });
                view.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        return ViewHolder.this.onItemTouch(view, motionEvent);
                    }
                });
            }
        }

        public void onItemClicked(View view) {
        }

        public boolean onItemLongClicked(View view) {
            return false;
        }

        public boolean onItemTouch(View view, MotionEvent motionEvent) {
            return false;
        }

        public void setDragStartCallback(DragStartCallback dragStartCallback) {
            this.mDragStartCallback = dragStartCallback;
        }
    }

    public DragItemAdapter() {
        setHasStableIds(true);
    }

    public void addItem(int i, T t8) {
        List<T> list = this.mItemList;
        if (list != null && list.size() >= i) {
            this.mItemList.add(i, t8);
            notifyItemInserted(i);
        }
    }

    public void changeItemPosition(int i, int i8) {
        List<T> list = this.mItemList;
        if (list != null && list.size() > i && this.mItemList.size() > i8) {
            this.mItemList.add(i8, this.mItemList.remove(i));
            notifyItemMoved(i, i8);
        }
    }

    public long getDropTargetId() {
        return this.mDropTargetId;
    }

    public int getItemCount() {
        List<T> list = this.mItemList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long getItemId(int i) {
        return getUniqueItemId(i);
    }

    public List<T> getItemList() {
        return this.mItemList;
    }

    public int getPositionForItem(T t8) {
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (this.mItemList.get(i) == t8) {
                return i;
            }
        }
        return -1;
    }

    public int getPositionForItemId(long j7) {
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (j7 == getItemId(i)) {
                return i;
            }
        }
        return -1;
    }

    public abstract long getUniqueItemId(int i);

    public Object removeItem(int i) {
        List<T> list = this.mItemList;
        if (list == null || list.size() <= i || i < 0) {
            return null;
        }
        T remove = this.mItemList.remove(i);
        notifyItemRemoved(i);
        return remove;
    }

    public void setDragItemId(long j7) {
        this.mDragItemId = j7;
    }

    public void setDragStartedListener(DragStartCallback dragStartCallback) {
        this.mDragStartCallback = dragStartCallback;
    }

    public void setDropTargetId(long j7) {
        this.mDropTargetId = j7;
    }

    public void setItemList(List<T> list) {
        this.mItemList = list;
        notifyDataSetChanged();
    }

    public void swapItems(int i, int i8) {
        List<T> list = this.mItemList;
        if (list != null && list.size() > i && this.mItemList.size() > i8) {
            Collections.swap(this.mItemList, i, i8);
            notifyDataSetChanged();
        }
    }

    public void onBindViewHolder(VH vh, int i) {
        long itemId = getItemId(i);
        vh.mItemId = itemId;
        vh.itemView.setVisibility(this.mDragItemId == itemId ? 4 : 0);
        vh.setDragStartCallback(this.mDragStartCallback);
    }

    public void onViewRecycled(VH vh) {
        vh.setDragStartCallback((DragStartCallback) null);
    }
}
