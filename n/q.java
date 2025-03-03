package n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import m.C1183b;

public final class q extends FrameLayout implements C1183b {

    /* renamed from: U  reason: collision with root package name */
    public final CollapsibleActionView f13535U;

    public q(View view) {
        super(view.getContext());
        this.f13535U = (CollapsibleActionView) view;
        addView(view);
    }

    public final void b() {
        this.f13535U.onActionViewExpanded();
    }

    public final void e() {
        this.f13535U.onActionViewCollapsed();
    }
}
