package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import t3.j;

public final class a extends j {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f9501U;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f9501U = chipTextInputComboView;
    }

    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f9501U;
        if (isEmpty) {
            chipTextInputComboView.f9470U.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a8 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f9470U;
        if (TextUtils.isEmpty(a8)) {
            a8 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a8);
    }
}
