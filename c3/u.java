package C3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import o.C1260b0;

public final class u extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f644a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f645b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f646c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f647d;
    public final /* synthetic */ w e;

    public u(w wVar, int i, TextView textView, int i8, TextView textView2) {
        this.e = wVar;
        this.f644a = i;
        this.f645b = textView;
        this.f646c = i8;
        this.f647d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        C1260b0 b0Var;
        int i = this.f644a;
        w wVar = this.e;
        wVar.f662n = i;
        wVar.f660l = null;
        TextView textView = this.f645b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f646c == 1 && (b0Var = wVar.f666r) != null) {
                b0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f647d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f647d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
