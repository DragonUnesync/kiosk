package o;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

public final class S0 implements TextWatcher {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ SearchView f13891U;

    public S0(SearchView searchView) {
        this.f13891U = searchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        SearchView searchView = this.f13891U;
        Editable text = searchView.f7498m0.getText();
        searchView.f7490V0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.x(!isEmpty);
        int i10 = 8;
        if (searchView.f7488T0 && !searchView.f7481M0 && isEmpty) {
            searchView.f7502r0.setVisibility(8);
            i10 = 0;
        }
        searchView.f7504t0.setVisibility(i10);
        searchView.t();
        searchView.w();
        if (searchView.f7476H0 != null && !TextUtils.equals(charSequence, searchView.f7489U0)) {
            searchView.f7476H0.a(charSequence.toString());
        }
        searchView.f7489U0 = charSequence.toString();
    }
}
