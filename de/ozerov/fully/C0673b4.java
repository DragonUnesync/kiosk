package de.ozerov.fully;

import android.app.Dialog;
import android.view.View;

/* renamed from: de.ozerov.fully.b4  reason: case insensitive filesystem */
public final /* synthetic */ class C0673b4 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10566U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ TextPref f10567V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Dialog f10568W;

    public /* synthetic */ C0673b4(TextPref textPref, Dialog dialog, int i) {
        this.f10566U = i;
        this.f10567V = textPref;
        this.f10568W = dialog;
    }

    public final void onClick(View view) {
        Dialog dialog = this.f10568W;
        TextPref textPref = this.f10567V;
        switch (this.f10566U) {
            case 0:
                int i = TextPref.f10366Z;
                textPref.getClass();
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
                FullyActivity fullyActivity = textPref.f10371Y;
                fullyActivity.f9961z0.V2("volumeLicenseKey", "");
                fullyActivity.C();
                return;
            default:
                int i8 = TextPref.f10366Z;
                textPref.getClass();
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
                FullyActivity fullyActivity2 = textPref.f10371Y;
                fullyActivity2.C();
                fullyActivity2.f9917F0.n("https://license.fully-kiosk.com/license/volume", false);
                return;
        }
    }
}
