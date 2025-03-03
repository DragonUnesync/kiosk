package h;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: h.a  reason: case insensitive filesystem */
public final class C1013a implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f12157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f12158b;

    public C1013a(View view, View view2) {
        this.f12157a = view;
        this.f12158b = view2;
    }

    public final void onScroll(AbsListView absListView, int i, int i8, int i9) {
        C1018f.b(absListView, this.f12157a, this.f12158b);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
