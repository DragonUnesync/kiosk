package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

public final class d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f7610U;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f7610U = searchAutoComplete;
    }

    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f7610U;
        if (searchAutoComplete.f7513d0) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f7513d0 = false;
        }
    }
}
