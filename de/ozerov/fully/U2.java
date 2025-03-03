package de.ozerov.fully;

import com.woxthebox.draglistview.DragListView;

public final class U2 implements DragListView.DragListListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V2 f10423a;

    public U2(V2 v22) {
        this.f10423a = v22;
    }

    public final void onItemDragEnded(int i, int i8) {
        if (i != i8) {
            V2 v22 = this.f10423a;
            O2.c(v22.f9850f1, v22.f10441p1, v22.f10438m1);
        }
    }

    public final void onItemDragStarted(int i) {
    }

    public final void onItemDragging(int i, float f8, float f9) {
    }
}
