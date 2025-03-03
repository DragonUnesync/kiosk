package o;

import android.view.View;
import androidx.appcompat.widget.SearchView;

public final class U0 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f13894a;

    public U0(SearchView searchView) {
        this.f13894a = searchView;
    }

    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f13894a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f7477I0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
