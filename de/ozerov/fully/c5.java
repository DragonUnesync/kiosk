package de.ozerov.fully;

import Z1.c;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final /* synthetic */ class c5 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10586a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10587b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f10588c;

    public /* synthetic */ c5(Object obj, KeyEvent.Callback callback, int i) {
        this.f10586a = i;
        this.f10587b = obj;
        this.f10588c = callback;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.f10586a) {
            case 0:
                g5 g5Var = (g5) this.f10587b;
                if (z) {
                    MyWebView myWebView = g5Var.f10664g;
                } else {
                    g5Var.getClass();
                }
                if (!z) {
                    ((InputMethodManager) ((C0780t4) this.f10588c).getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return;
                }
                return;
            case 1:
                g5 g5Var2 = (g5) this.f10587b;
                C0780t4 t4Var = (C0780t4) this.f10588c;
                g5Var2.getClass();
                if (z && (t4Var instanceof FullyActivity)) {
                    FullyActivity fullyActivity = (FullyActivity) t4Var;
                    if (fullyActivity.f9916E0.b()) {
                        fullyActivity.f9916E0.a();
                    }
                }
                if (t4Var.f10981v0 || !z || !((c) g5Var2.f10677u.f9767W).n("forceHideKeyboard", false)) {
                    C0794w0.N0(t4Var);
                    return;
                } else {
                    C0794w0.p0(t4Var);
                    return;
                }
            default:
                i5 i5Var = (i5) this.f10587b;
                i5Var.getClass();
                View view2 = (View) this.f10588c;
                if (z) {
                    ((GradientDrawable) view2.getBackground()).setColor(i5Var.f10709b.getResources().getColor(2131099697));
                    return;
                } else {
                    ((GradientDrawable) view2.getBackground()).setColor(i5Var.f10723r);
                    return;
                }
        }
    }
}
