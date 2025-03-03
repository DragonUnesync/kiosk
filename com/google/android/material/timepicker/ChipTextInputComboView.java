package com.google.android.material.timepicker;

import Y2.f;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import v0.C1510H;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: U  reason: collision with root package name */
    public final Chip f9470U;

    /* renamed from: V  reason: collision with root package name */
    public final EditText f9471V;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(2131558516, this, false);
        this.f9470U = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(2131558517, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f9471V = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        WeakHashMap weakHashMap = C1510H.f15874a;
        editText.setId(View.generateViewId());
        ((TextView) findViewById(2131362240)).setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final boolean isChecked() {
        return this.f9470U.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f9471V.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public final void setChecked(boolean z) {
        int i;
        Chip chip = this.f9470U;
        chip.setChecked(z);
        int i8 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        EditText editText = this.f9471V;
        editText.setVisibility(i);
        if (z) {
            i8 = 8;
        }
        chip.setVisibility(i8);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new f(editText, 1));
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9470U.setOnClickListener(onClickListener);
    }

    public final void setTag(int i, Object obj) {
        this.f9470U.setTag(i, obj);
    }

    public final void toggle() {
        this.f9470U.toggle();
    }
}
