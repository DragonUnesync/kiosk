package de.ozerov.fully;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.preference.ListPreference;
import android.util.AttributeSet;

class ListPref extends ListPreference {

    /* renamed from: U  reason: collision with root package name */
    public final int f10084U;

    public ListPref(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0702g3.f10645b);
        this.f10084U = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        Dialog dialog = getDialog();
        dialog.getWindow().addFlags(4194304);
        dialog.getWindow().addFlags(524288);
        dialog.getWindow().addFlags(2097152);
        dialog.getWindow().addFlags(1024);
    }
}
