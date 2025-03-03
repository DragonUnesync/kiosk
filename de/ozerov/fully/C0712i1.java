package de.ozerov.fully;

import com.woxthebox.draglistview.DragListView;

/* renamed from: de.ozerov.fully.i1  reason: case insensitive filesystem */
public final class C0712i1 implements DragListView.DragListListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0718j1 f10703a;

    public C0712i1(C0718j1 j1Var) {
        this.f10703a = j1Var;
    }

    public final void onItemDragEnded(int i, int i8) {
        if (i != i8) {
            C0718j1 j1Var = this.f10703a;
            C0664a1.d(j1Var.f9850f1, j1Var.f10743m1);
        }
    }

    public final void onItemDragStarted(int i) {
    }

    public final void onItemDragging(int i, float f8, float f9) {
    }
}
