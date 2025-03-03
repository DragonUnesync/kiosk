package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

public final class a implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ SearchView f7608U;

    public a(SearchView searchView) {
        this.f7608U = searchView;
    }

    public final void onClick(View view) {
        String str;
        SearchView searchView = this.f7608U;
        ImageView imageView = searchView.f7501q0;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f7498m0;
        if (view == imageView) {
            searchView.y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f7479K0;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        } else if (view == searchView.f7503s0) {
            searchView.o();
        } else if (view == searchView.f7502r0) {
            searchView.s();
        } else if (view == searchView.f7504t0) {
            SearchableInfo searchableInfo = searchView.f7493Y0;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.f7473E0);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        if (searchActivity == null) {
                            str = null;
                        } else {
                            str = searchActivity.flattenToShortString();
                        }
                        intent.putExtra("calling_package", str);
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m(searchView.f7474F0, searchableInfo));
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        } else if (view == searchAutoComplete) {
            searchView.n();
        }
    }
}
