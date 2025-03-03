package k2;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import j2.d;
import java.util.concurrent.Executor;

/* renamed from: k2.g  reason: case insensitive filesystem */
public abstract class C1150g {
    @Deprecated
    public static int a(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    public static WebViewRenderProcess b(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    public static WebViewRenderProcessClient c(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    public static void d(WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    public static void e(WebView webView, d dVar) {
        webView.setWebViewRenderProcessClient((WebViewRenderProcessClient) null);
    }

    public static void f(WebView webView, Executor executor, d dVar) {
        webView.setWebViewRenderProcessClient(executor, (WebViewRenderProcessClient) null);
    }

    public static boolean g(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
