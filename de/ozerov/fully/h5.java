package de.ozerov.fully;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;

public final /* synthetic */ class h5 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i5 f10696a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f10697b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g5 f10698c;

    public /* synthetic */ h5(i5 i5Var, LinearLayout linearLayout, g5 g5Var) {
        this.f10696a = i5Var;
        this.f10697b = linearLayout;
        this.f10698c = g5Var;
    }

    public final void onFocusChange(View view, boolean z) {
        LinearLayout linearLayout = this.f10697b;
        i5 i5Var = this.f10696a;
        if (z) {
            i5Var.getClass();
            ((GradientDrawable) linearLayout.getBackground()).setColor(i5Var.f10709b.getResources().getColor(2131099697));
        } else if (i5Var.f10711d == this.f10698c) {
            ((GradientDrawable) linearLayout.getBackground()).setColor(i5Var.f10722q);
        } else {
            ((GradientDrawable) linearLayout.getBackground()).setColor(i5Var.f10723r);
        }
    }
}
