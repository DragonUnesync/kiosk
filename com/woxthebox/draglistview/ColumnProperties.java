package com.woxthebox.draglistview;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.Q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColumnProperties {
    private int mColumnBackgroundColor;
    private Drawable mColumnBackgroundDrawable;
    private View mColumnDragView;
    private Integer mColumnWidth;
    private DragItemAdapter mDragItemAdapter;
    private View mFooter;
    private boolean mHasFixedItemSize;
    private View mHeader;
    private List<N> mItemDecorations;
    private int mItemsSectionBackgroundColor;
    private Q mLayoutManager;

    public static class Builder {
        private int mColumnBackgroundColor = 0;
        private Drawable mColumnBackgroundDrawable = null;
        private View mColumnDragView = null;
        private Integer mColumnWidth = null;
        private DragItemAdapter mDragItemAdapter;
        private View mFooter = null;
        private boolean mHasFixedItemSize = false;
        private View mHeader = null;
        private ArrayList<N> mItemDecoration = new ArrayList<>();
        private int mItemsSectionBackgroundColor = 0;
        private Q mLayoutManager = null;

        private Builder(DragItemAdapter dragItemAdapter) {
            this.mDragItemAdapter = dragItemAdapter;
        }

        public static Builder newBuilder(DragItemAdapter dragItemAdapter) {
            return new Builder(dragItemAdapter);
        }

        public Builder addItemDecorations(N... nArr) {
            Collections.addAll(this.mItemDecoration, nArr);
            return this;
        }

        public ColumnProperties build() {
            return new ColumnProperties(this.mDragItemAdapter, this.mLayoutManager, this.mItemDecoration, this.mHasFixedItemSize, this.mColumnBackgroundColor, this.mItemsSectionBackgroundColor, this.mColumnDragView, this.mHeader, this.mFooter, this.mColumnWidth, this.mColumnBackgroundDrawable);
        }

        public Builder setColumnBackgroundColor(int i) {
            this.mColumnBackgroundColor = i;
            return this;
        }

        public Builder setColumnBackgroundDrawable(Drawable drawable) {
            this.mColumnBackgroundDrawable = drawable;
            return this;
        }

        public Builder setColumnDragView(View view) {
            this.mColumnDragView = view;
            return this;
        }

        public Builder setColumnWidth(Integer num) {
            this.mColumnWidth = num;
            return this;
        }

        public Builder setFooter(View view) {
            this.mFooter = view;
            return this;
        }

        public Builder setHasFixedItemSize(boolean z) {
            this.mHasFixedItemSize = z;
            return this;
        }

        public Builder setHeader(View view) {
            this.mHeader = view;
            return this;
        }

        public Builder setItemsSectionBackgroundColor(int i) {
            this.mItemsSectionBackgroundColor = i;
            return this;
        }

        public Builder setLayoutManager(Q q7) {
            this.mLayoutManager = q7;
            return this;
        }
    }

    public int getColumnBackgroundColor() {
        return this.mColumnBackgroundColor;
    }

    public Drawable getColumnBackgroundDrawable() {
        return this.mColumnBackgroundDrawable;
    }

    public View getColumnDragView() {
        return this.mColumnDragView;
    }

    public Integer getColumnWidth() {
        return this.mColumnWidth;
    }

    public DragItemAdapter getDragItemAdapter() {
        return this.mDragItemAdapter;
    }

    public View getFooter() {
        return this.mFooter;
    }

    public View getHeader() {
        return this.mHeader;
    }

    public List<N> getItemDecorations() {
        return this.mItemDecorations;
    }

    public int getItemsSectionBackgroundColor() {
        return this.mItemsSectionBackgroundColor;
    }

    public Q getLayoutManager() {
        return this.mLayoutManager;
    }

    public boolean hasFixedItemSize() {
        return this.mHasFixedItemSize;
    }

    private ColumnProperties(DragItemAdapter dragItemAdapter, Q q7, List<N> list, boolean z, int i, int i8, View view, View view2, View view3, Integer num, Drawable drawable) {
        this.mDragItemAdapter = dragItemAdapter;
        this.mLayoutManager = q7;
        this.mItemDecorations = list;
        this.mHasFixedItemSize = z;
        this.mColumnBackgroundColor = i;
        this.mItemsSectionBackgroundColor = i8;
        this.mHeader = view2;
        this.mFooter = view3;
        this.mColumnDragView = view;
        this.mColumnWidth = num;
        this.mColumnBackgroundDrawable = drawable;
    }
}
