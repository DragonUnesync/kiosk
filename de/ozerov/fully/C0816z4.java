package de.ozerov.fully;

import Z1.c;
import android.view.View;

/* renamed from: de.ozerov.fully.z4  reason: case insensitive filesystem */
public final class C0816z4 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f11127U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C4 f11128V;

    public /* synthetic */ C0816z4(C4 c42, int i) {
        this.f11127U = i;
        this.f11128V = c42;
    }

    public final void onClick(View view) {
        switch (this.f11127U) {
            case 0:
                C4 c42 = this.f11128V;
                A4 a42 = c42.f9812U;
                if (a42 != null) {
                    ((K4) ((c) c42.f9812U).f6955V).f10053a.seekTo(((K4) ((c) a42).f6955V).f10053a.getCurrentPosition() - 5000);
                    c42.e();
                    c42.f(3000);
                    return;
                }
                return;
            default:
                C4 c43 = this.f11128V;
                A4 a43 = c43.f9812U;
                if (a43 != null) {
                    ((K4) ((c) c43.f9812U).f6955V).f10053a.seekTo(((K4) ((c) a43).f6955V).f10053a.getCurrentPosition() + 15000);
                    c43.e();
                    c43.f(3000);
                    return;
                }
                return;
        }
    }
}
