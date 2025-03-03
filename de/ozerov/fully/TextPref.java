package de.ozerov.fully;

import Z1.c;
import a3.C0415a;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import n2.a;

public class TextPref extends EditTextPreference {

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ int f10366Z = 0;

    /* renamed from: U  reason: collision with root package name */
    public final int f10367U;

    /* renamed from: V  reason: collision with root package name */
    public final int f10368V;

    /* renamed from: W  reason: collision with root package name */
    public final String f10369W;

    /* renamed from: X  reason: collision with root package name */
    public final String f10370X;

    /* renamed from: Y  reason: collision with root package name */
    public final FullyActivity f10371Y;

    public TextPref(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context instanceof FullyActivity) {
            this.f10371Y = (FullyActivity) context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0702g3.e);
        this.f10367U = obtainStyledAttributes.getInt(2, 0);
        this.f10368V = obtainStyledAttributes.getInt(1, 0);
        this.f10369W = obtainStyledAttributes.getString(0);
        this.f10370X = obtainStyledAttributes.getString(3);
        obtainStyledAttributes.recycle();
    }

    public static ArrayList a(String str, boolean z, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : a.e1(str)) {
            if (z6 && !str2.contains("*")) {
                arrayList.add(str2.trim());
            }
            if (z && str2.contains("*")) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }

    public final void showDialog(Bundle bundle) {
        Button button;
        Button button2;
        Button button3;
        Button button4;
        FrameLayout frameLayout;
        super.showDialog(bundle);
        Dialog dialog = getDialog();
        dialog.getWindow().addFlags(4194304);
        dialog.getWindow().addFlags(524288);
        dialog.getWindow().addFlags(2097152);
        dialog.getWindow().addFlags(1024);
        EditText editText = getEditText();
        editText.requestFocus();
        int i = Build.VERSION.SDK_INT;
        FullyActivity fullyActivity = this.f10371Y;
        if (i == 21) {
            try {
                LinearLayout linearLayout = (LinearLayout) editText.getParent();
                linearLayout.setPadding(linearLayout.getPaddingLeft() + a.p(16.0f, fullyActivity), linearLayout.getPaddingTop(), linearLayout.getPaddingRight() + a.p(16.0f, fullyActivity), linearLayout.getPaddingBottom());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String str = this.f10370X;
        if (!(str == null || (frameLayout = (FrameLayout) dialog.findViewById(16908331)) == null)) {
            TextView textView = new TextView(fullyActivity);
            textView.setText(str);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            try {
                layoutParams.setMarginEnd(((LinearLayout) editText.getParent()).getPaddingEnd() + editText.getPaddingEnd());
            } catch (Exception e8) {
                e8.printStackTrace();
                layoutParams.rightMargin = a.p(24.0f, fullyActivity);
            }
            textView.setGravity(8388629);
            frameLayout.addView(textView, layoutParams);
        }
        int i8 = this.f10368V;
        if (!(i8 != 1 || (button4 = (Button) dialog.findViewById(16908315)) == null || fullyActivity == null)) {
            button4.setVisibility(0);
            button4.setText("Pick a file");
            button4.setOnClickListener(new C0415a(this, editText, dialog, 2));
        }
        if (!(i8 != 2 || (button3 = (Button) dialog.findViewById(16908315)) == null || fullyActivity == null)) {
            button3.setVisibility(0);
            button3.setText("Pick an app");
            button3.setOnClickListener(new C0667a4(this, editText, 0));
        }
        if (!((i8 != 3 && i8 != 6) || (button2 = (Button) dialog.findViewById(16908315)) == null || fullyActivity == null)) {
            button2.setVisibility(0);
            button2.setText("Pick apps");
            button2.setOnClickListener(new C0667a4(this, editText, 1));
        }
        if (!(i8 != 4 || (button = (Button) dialog.findViewById(16908315)) == null || fullyActivity == null)) {
            button.setVisibility(0);
            int inputType = editText.getInputType();
            if (((inputType & 1) == 0 || (inputType & 4080) != 128) && ((inputType & 2) == 0 || (inputType & 16) == 0)) {
                button.setText(2131951656);
            } else {
                button.setText(2131951657);
            }
            button.setOnClickListener(new C0415a(this, editText, button, 3));
        }
        if (i8 == 5) {
            editText.setImeOptions(6);
            editText.setOnEditorActionListener(new G0(2, this));
            Button button5 = (Button) dialog.findViewById(16908313);
            Button button6 = (Button) dialog.findViewById(16908315);
            if (button5 != null && button6 != null && fullyActivity != null) {
                if (!fullyActivity.f9961z0.g1().isEmpty()) {
                    editText.setText(((c) fullyActivity.f9961z0.f9767W).r("volumeLicenseStatus", ""));
                    editText.setEnabled(false);
                    editText.setSingleLine(false);
                    button5.setVisibility(0);
                    button5.setText("Unregister");
                    button5.setOnClickListener(new C0673b4(this, dialog, 0));
                }
                if (fullyActivity.f9961z0.g1().isEmpty()) {
                    button6.setVisibility(0);
                    button6.setText("Get Volume License");
                    button6.setOnClickListener(new C0673b4(this, dialog, 1));
                }
            }
        }
    }
}
