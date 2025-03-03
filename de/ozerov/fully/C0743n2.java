package de.ozerov.fully;

import Z1.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;

/* renamed from: de.ozerov.fully.n2  reason: case insensitive filesystem */
public final class C0743n2 extends C0737m2 {

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f10846f;

    /* renamed from: g  reason: collision with root package name */
    public View f10847g;

    /* renamed from: h  reason: collision with root package name */
    public View f10848h;
    public WebChromeClient.CustomViewCallback i;

    public C0743n2(C0780t4 t4Var, g5 g5Var) {
        super(t4Var, g5Var);
        this.f10846f = (FrameLayout) t4Var.findViewById(2131362123);
    }

    public final boolean a() {
        if (this.f10847g != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        View view = this.f10847g;
        if (view != null) {
            view.setVisibility(8);
            FrameLayout frameLayout = this.f10846f;
            frameLayout.setVisibility(8);
            frameLayout.removeView(this.f10847g);
            this.f10847g = null;
            this.i.onCustomViewHidden();
            this.i = null;
            boolean booleanValue = this.f10798b.Z().booleanValue();
            C0780t4 t4Var = this.f10797a;
            if (booleanValue) {
                t4Var.getWindow().addFlags(128);
            } else {
                t4Var.getWindow().clearFlags(128);
            }
        }
    }

    public final View getVideoLoadingProgressView() {
        if (this.f10848h == null) {
            this.f10848h = LayoutInflater.from(this.f10797a).inflate(2131558595, (ViewGroup) null);
        }
        return this.f10848h;
    }

    public final void onHideCustomView() {
        super.onHideCustomView();
        b();
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        if (a()) {
            b();
        }
        FrameLayout frameLayout = this.f10846f;
        frameLayout.setVisibility(0);
        frameLayout.addView(view);
        if (frameLayout.isFocusable()) {
            frameLayout.requestFocus();
        }
        this.f10847g = view;
        this.i = customViewCallback;
        if (((c) this.f10798b.f9767W).n("keepOnWhileFullscreen", true)) {
            this.f10797a.getWindow().addFlags(128);
        }
    }
}
