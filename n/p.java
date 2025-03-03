package n;

import android.view.ActionProvider;
import k2.C1160q;

public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a  reason: collision with root package name */
    public C1160q f13532a;

    /* renamed from: b  reason: collision with root package name */
    public final ActionProvider f13533b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f13534c;

    public p(t tVar, ActionProvider actionProvider) {
        this.f13534c = tVar;
        this.f13533b = actionProvider;
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        C1160q qVar = this.f13532a;
        if (qVar != null) {
            m mVar = ((o) qVar.f13026V).f13517h0;
            mVar.f13485b0 = true;
            mVar.p(true);
        }
    }
}
