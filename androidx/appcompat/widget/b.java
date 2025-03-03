package androidx.appcompat.widget;

import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

public final class b implements View.OnKeyListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ SearchView f7609U;

    public b(SearchView searchView) {
        this.f7609U = searchView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i8;
        SearchView searchView = this.f7609U;
        if (searchView.f7493Y0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f7498m0;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.l("android.intent.action.SEARCH", (Uri) null, (String) null, searchAutoComplete.getText().toString()));
            return true;
        } else if (searchView.f7493Y0 == null || searchView.f7482N0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        } else {
            if (i == 66 || i == 84 || i == 61) {
                return searchView.p(searchAutoComplete.getListSelection());
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i8 = 0;
                } else {
                    i8 = searchAutoComplete.length();
                }
                searchAutoComplete.setSelection(i8);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
                return true;
            } else if (i != 19) {
                return false;
            } else {
                searchAutoComplete.getListSelection();
                return false;
            }
        }
    }
}
