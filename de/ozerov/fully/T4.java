package de.ozerov.fully;

import com.woxthebox.draglistview.DragListView;

public final class T4 implements DragListView.DragListListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U4 f10363a;

    public T4(U4 u42) {
        this.f10363a = u42;
    }

    public final void onItemDragEnded(int i, int i8) {
        if (i != i8) {
            U4 u42 = this.f10363a;
            O4.b(u42.f9850f1, u42.f10427p1, u42.f10424m1);
        }
    }

    public final void onItemDragStarted(int i) {
    }

    public final void onItemDragging(int i, float f8, float f9) {
    }
}
