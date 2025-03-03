package de.ozerov.fully;

import Q0.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import n2.a;

public class HideKeyboardLinearLayout extends LinearLayout {

    /* renamed from: U  reason: collision with root package name */
    public final Context f10004U;

    public HideKeyboardLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10004U = context;
    }

    public static boolean a(View view, float f8, float f9) {
        if ((view instanceof EditText) && a.D0(view, f8, f9)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                } else if (a(viewGroup.getChildAt(i), f8, f9)) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View findFocus = findFocus();
            if ((findFocus instanceof EditText) && !a.D0(findFocus, motionEvent.getRawX(), motionEvent.getRawY()) && !a(this, motionEvent.getRawX(), motionEvent.getRawY())) {
                findFocus.clearFocus();
                ((InputMethodManager) this.f10004U.getSystemService("input_method")).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            g.z(e, new StringBuilder("Failed to call through to ViewGroup.dispatchTouchEvent due to "), "HideKeyboardLinearLayout");
            return false;
        }
    }
}
