package androidx.recyclerview.widget;

import android.view.View;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    public int f8281a;

    /* renamed from: b  reason: collision with root package name */
    public int f8282b;

    public final void a(j0 j0Var) {
        View view = j0Var.itemView;
        this.f8281a = view.getLeft();
        this.f8282b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
