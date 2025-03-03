package de.ozerov.fully;

import Z1.c;
import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import d4.k;
import n2.a;

/* renamed from: de.ozerov.fully.u2  reason: case insensitive filesystem */
public final class C0784u2 extends WebViewRenderProcessClient {

    /* renamed from: d  reason: collision with root package name */
    public static final String f10993d = C0784u2.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final C0780t4 f10994a;

    /* renamed from: b  reason: collision with root package name */
    public final k f10995b;

    /* renamed from: c  reason: collision with root package name */
    public long f10996c = -1;

    public C0784u2(C0780t4 t4Var) {
        this.f10994a = t4Var;
        this.f10995b = new k((Context) t4Var, 1);
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f10996c = -1;
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        int i;
        int i8 = 0;
        if (!((c) this.f10995b.f9767W).n("ignoreUnresponsiveWebview", false)) {
            a.b1(webView.getContext(), "Android Webview render process unresponsive...");
            String str = f10993d;
            Log.w(str, "Android Webview render process unresponsive " + webViewRenderProcess);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f10996c == -1) {
                this.f10996c = currentTimeMillis;
                return;
            }
            k kVar = this.f10995b;
            kVar.getClass();
            try {
                i = Integer.parseInt(((c) kVar.f9767W).r("timeToRestartUnresponsiveWebview", "0"));
            } catch (Exception unused) {
                i = 0;
            }
            if (i != 0) {
                long j7 = currentTimeMillis - this.f10996c;
                k kVar2 = this.f10995b;
                kVar2.getClass();
                try {
                    i8 = Integer.parseInt(((c) kVar2.f9767W).r("timeToRestartUnresponsiveWebview", "0"));
                } catch (Exception unused2) {
                }
                if (j7 <= ((long) i8) * 1000) {
                    return;
                }
                if (webViewRenderProcess != null) {
                    Log.w(str, "Terminating unresponsive Webview renderer after " + (currentTimeMillis - this.f10996c) + " ms");
                    webViewRenderProcess.terminate();
                    return;
                }
                Log.w(str, "Restarting the app after " + (currentTimeMillis - this.f10996c) + " ms");
                if (webView instanceof MyWebView) {
                    ((MyWebView) webView).getWebTab().f10666j.d();
                    C0780t4 t4Var = this.f10994a;
                    if (t4Var instanceof FullyActivity) {
                        ((FullyActivity) t4Var).f9919H0.g();
                    }
                }
            }
        }
    }
}
