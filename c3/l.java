package C3;

import android.widget.AutoCompleteTextView;

public final /* synthetic */ class l implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f596a;

    public /* synthetic */ l(n nVar) {
        this.f596a = nVar;
    }

    public final void onDismiss() {
        n nVar = this.f596a;
        nVar.f605m = true;
        nVar.f607o = System.currentTimeMillis();
        nVar.t(false);
    }
}
