package de.ozerov.fully;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: de.ozerov.fully.j2  reason: case insensitive filesystem */
public final class C0719j2 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f10746U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ MyWebView f10747V;

    public C0719j2(JsPromptResult jsPromptResult, MyWebView myWebView) {
        this.f10746U = jsPromptResult;
        this.f10747V = myWebView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10746U.cancel();
        this.f10747V.f10145z0 = null;
    }
}
