package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class n<S> extends t {

    /* renamed from: Q0  reason: collision with root package name */
    public int f9327Q0;

    /* renamed from: R0  reason: collision with root package name */
    public b f9328R0;

    public final void E(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f9327Q0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9328R0);
    }

    public final void x(Bundle bundle) {
        super.x(bundle);
        if (bundle == null) {
            bundle = this.f8064Z;
        }
        this.f9327Q0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f9328R0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            return;
        }
        throw new ClassCastException();
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(j(), this.f9327Q0));
        throw null;
    }
}
