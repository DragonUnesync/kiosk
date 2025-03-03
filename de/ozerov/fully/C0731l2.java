package de.ozerov.fully;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: de.ozerov.fully.l2  reason: case insensitive filesystem */
public final class C0731l2 implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final MyWebView f10785U;

    /* renamed from: V  reason: collision with root package name */
    public final JsResult f10786V;

    public C0731l2(JsResult jsResult, MyWebView myWebView) {
        this.f10786V = jsResult;
        this.f10785U = myWebView;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f10786V.cancel();
        this.f10785U.f10145z0 = null;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10786V.cancel();
        this.f10785U.f10145z0 = null;
    }
}
