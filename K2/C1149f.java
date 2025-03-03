package k2;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import de.ozerov.fully.C0669b0;
import j2.C1120a;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* renamed from: k2.f  reason: case insensitive filesystem */
public abstract class C1149f {
    public static TracingController a() {
        return TracingController.getInstance();
    }

    public static ClassLoader b() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper c(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean d(TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void e(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(TracingController tracingController, C1120a aVar) {
        C0669b0.w();
        throw null;
    }

    public static boolean g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
