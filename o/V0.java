package o;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

public final class V0 implements TextView.OnEditorActionListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ SearchView f13895U;

    public V0(SearchView searchView) {
        this.f13895U = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f13895U.s();
        return true;
    }
}
