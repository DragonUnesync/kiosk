package de.ozerov.fully;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: de.ozerov.fully.k2  reason: case insensitive filesystem */
public final class C0725k2 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f10769U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ EditText f10770V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ MyWebView f10771W;

    public C0725k2(JsPromptResult jsPromptResult, EditText editText, MyWebView myWebView) {
        this.f10769U = jsPromptResult;
        this.f10770V = editText;
        this.f10771W = myWebView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10769U.confirm(this.f10770V.getText().toString());
        this.f10771W.f10145z0 = null;
    }
}
