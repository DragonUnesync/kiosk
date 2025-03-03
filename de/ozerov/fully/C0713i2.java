package de.ozerov.fully;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: de.ozerov.fully.i2  reason: case insensitive filesystem */
public final /* synthetic */ class C0713i2 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10704U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ JsResult f10705V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ MyWebView f10706W;

    public /* synthetic */ C0713i2(JsResult jsResult, MyWebView myWebView, int i) {
        this.f10704U = i;
        this.f10705V = jsResult;
        this.f10706W = myWebView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10704U) {
            case 0:
                this.f10705V.cancel();
                this.f10706W.f10145z0 = null;
                return;
            case 1:
                this.f10705V.confirm();
                this.f10706W.f10145z0 = null;
                return;
            case 2:
                this.f10705V.cancel();
                this.f10706W.f10145z0 = null;
                return;
            case 3:
                this.f10705V.confirm();
                this.f10706W.f10145z0 = null;
                return;
            default:
                this.f10705V.cancel();
                this.f10706W.f10145z0 = null;
                return;
        }
    }
}
