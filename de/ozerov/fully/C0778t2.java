package de.ozerov.fully;

import H3.P;
import N.e;
import P6.f;
import Q.h;
import Q0.g;
import U.p;
import Y6.m;
import Y6.q;
import Y6.r;
import Y6.u;
import Z1.c;
import Z6.b;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.MimeTypeMap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.samsung.android.knox.application.ApplicationPolicy;
import d4.k;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import n2.a;
import o.s1;
import u.C1477r;

/* renamed from: de.ozerov.fully.t2  reason: case insensitive filesystem */
public final class C0778t2 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10965a = false;

    /* renamed from: b  reason: collision with root package name */
    public final C0780t4 f10966b;

    /* renamed from: c  reason: collision with root package name */
    public final k f10967c;

    /* renamed from: d  reason: collision with root package name */
    public final g5 f10968d;
    public final V4 e;

    public C0778t2(C0780t4 t4Var, g5 g5Var) {
        this.f10966b = t4Var;
        this.f10967c = new k((Context) t4Var, 1);
        this.f10968d = g5Var;
        this.e = g5Var.f10666j.f10708a;
    }

    public static String b(String str, String str2, String str3) {
        String str4;
        if (str.toLowerCase().startsWith("javascript:")) {
            String replace = str.replace("$error", str2);
            if (str3 != null) {
                return replace.replace("$url", str3);
            }
            return replace;
        }
        if (str.contains("?")) {
            str4 = str.concat("&");
        } else {
            str4 = str.concat("?");
        }
        String str5 = str4 + "error=" + str2;
        if (str3 == null) {
            return str5;
        }
        StringBuilder B8 = e.B(str5, "&url=");
        B8.append(Uri.encode(str3));
        return B8.toString();
    }

    public final void a(MyWebView myWebView, String str, String str2, String str3) {
        if (str.equals(myWebView.f10126f0) || str.equals(myWebView.f10125e0)) {
            if (C0794w0.f11017a && C0794w0.f11018b != null) {
                C0794w0.a();
                C0794w0.f11018b.f11056d++;
            }
            myWebView.getWebTab().n();
            k kVar = this.f10967c;
            if (kVar.N().isEmpty() || str.startsWith(kVar.N())) {
                a.a1(1, myWebView.getContext(), str3);
            } else {
                myWebView.getWebTab().g(b(kVar.N(), str2, str));
            }
            if (kVar.I1() > 0 && (this.f10966b instanceof FullyActivity)) {
                new Handler().postDelayed(new p(27, (Object) this), ((long) kVar.I1()) * 1000);
            }
        }
    }

    public final void c(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f10965a) {
            webView.evaluateJavascript(a.L0(webView.getContext(), "parts/pi.js"), (ValueCallback) null);
        }
    }

    public final boolean d(WebView webView, String str, boolean z) {
        if (!(webView instanceof MyWebView)) {
            return false;
        }
        MyWebView myWebView = (MyWebView) webView;
        boolean z6 = this.f10966b instanceof FullyActivity;
        if ((!z && !str.startsWith("intent:")) || ((str.startsWith("file:") || str.startsWith("blob:")) && ((!str.endsWith(".mp4") && !str.endsWith(".webm") && !str.endsWith(".mkv")) || !this.f10967c.D1().booleanValue()))) {
            return a.M0(str, this.e.e);
        }
        myWebView.getWebTab().g(str);
        return true;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        if (webView instanceof MyWebView) {
            MyWebView myWebView = (MyWebView) webView;
            webView.hashCode();
            int i = myWebView.f10117B0;
            this.f10968d.p(str);
            if (myWebView.f10117B0 == 1 && !((c) this.f10967c.f9767W).r("mainWebAutomation", "").isEmpty()) {
                myWebView.evaluateJavascript(C0794w0.J(this.f10966b, str), (ValueCallback) null);
            }
        }
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (((c) this.f10967c.f9767W).n("resendFormData", false)) {
            message2.sendToTarget();
        } else {
            message.sendToTarget();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (((c) this.f10967c.f9767W).n("desktopMode", false)) {
            webView.evaluateJavascript("if (document.querySelector('meta[name=\"viewport\"]')) document.querySelector('meta[name=\"viewport\"]').setAttribute('content', 'width=1024, initial-scale=' + (window.screen.width / 1024));", (ValueCallback) null);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        c(webView, str);
        if (webView instanceof MyWebView) {
            MyWebView myWebView = (MyWebView) webView;
            myWebView.getUrl();
            myWebView.hashCode();
            myWebView.getProgress();
            if (myWebView.getProgress() == 100) {
                myWebView.f10117B0 = 1;
                if (myWebView.f10123c0) {
                    myWebView.f10123c0 = false;
                    webView.clearHistory();
                }
                if (C0794w0.f11017a && C0794w0.f11018b != null) {
                    C0794w0.a();
                    C0794w0.f11018b.f11055c++;
                }
                C0780t4 t4Var = this.f10966b;
                if (t4Var instanceof FullyActivity) {
                    ((FullyActivity) t4Var).f9960y1.e(false, false);
                }
                if (this.f10967c.C1().booleanValue()) {
                    myWebView.f();
                }
                myWebView.setVisibility(0);
                myWebView.getWebTab().j();
                C0780t4 t4Var2 = this.f10966b;
                if (t4Var2 instanceof FullyActivity) {
                    t4Var2.findViewById(2131362211).setVisibility(8);
                }
                if (this.f10967c.K().booleanValue()) {
                    a.b1(webView.getContext(), "Page finished");
                }
                if (((c) this.f10967c.f9767W).n("autoplayVideos", true)) {
                    myWebView.loadUrl("javascript:(function() { if (document.getElementsByTagName('video').length) document.getElementsByTagName('video')[0].play(); })();void(0);");
                }
                if (((c) this.f10967c.f9767W).n("autoplayAudio", false)) {
                    myWebView.loadUrl("javascript:(function() { if (document.getElementsByTagName('audio').length) document.getElementsByTagName('audio')[0].play(); })();void(0);");
                }
                if (!((c) this.f10967c.f9767W).r("injectJsCode", "").isEmpty()) {
                    myWebView.evaluateJavascript(((c) this.f10967c.f9767W).r("injectJsCode", ""), (ValueCallback) null);
                }
                if (!((c) this.f10967c.f9767W).r("mainWebAutomation", "").isEmpty()) {
                    myWebView.evaluateJavascript(C0794w0.J(this.f10966b, str), (ValueCallback) null);
                }
                if (((c) this.f10967c.f9767W).n("overrideWindowPrint", true)) {
                    myWebView.evaluateJavascript("window.print = function() { FullyKiosk.print(); }", (ValueCallback) null);
                }
                if (((c) this.f10967c.f9767W).n("clearCacheEach", false)) {
                    myWebView.clearCache(true);
                }
                if (((c) this.f10967c.f9767W).n("resetZoomEach", false)) {
                    int Y7 = this.f10967c.Y();
                    boolean n4 = ((c) this.f10967c.f9767W).n("loadOverview", false) | ((c) this.f10967c.f9767W).n("desktopMode", false);
                    try {
                        myWebView.getSettings().setLoadWithOverviewMode(!n4);
                        myWebView.getSettings().setLoadWithOverviewMode(n4);
                        myWebView.setInitialScale(Y7);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                Runnable runnable = myWebView.f10135o0;
                if (runnable != null) {
                    runnable.run();
                    myWebView.f10135o0 = null;
                }
                P.Q(this.f10966b);
                myWebView.getWebTab().n();
            }
            C0780t4 t4Var3 = this.f10966b;
            if (t4Var3 instanceof FullyActivity) {
                ((FullyActivity) t4Var3).f9922K0.g();
                h hVar = ((FullyActivity) this.f10966b).f9924M0;
                hVar.getClass();
                if (str.startsWith("https://license.fully-kiosk.com/license") && str.contains("success")) {
                    new Handler().postDelayed(new p(22, (Object) hVar), 7000);
                }
            }
            myWebView.f10129i0 = myWebView.getTitle();
            this.f10968d.f10666j.p();
            if (myWebView.getUrl() != null && str.startsWith("file:///launcher")) {
                str = myWebView.getUrl();
            }
            this.f10968d.p(str);
            myWebView.f10127g0 = myWebView.getUrl();
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.hashCode();
        if (webView instanceof MyWebView) {
            MyWebView myWebView = (MyWebView) webView;
            myWebView.f10117B0 = 3;
            if (this.f10967c.K().booleanValue()) {
                a.b1(webView.getContext(), "Loading page...");
            }
            if (!str.startsWith("data:")) {
                myWebView.f10125e0 = str;
                myWebView.getWebTab().o(str);
            }
            this.f10968d.m();
            super.onPageStarted(webView, str, bitmap);
        }
    }

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        clientCertRequest.getHost();
        webView.getUrl();
        X509Certificate[] x509CertificateArr = this.e.f10461u;
        PrivateKey privateKey = this.e.f10462v;
        if (this.e.f10448g.length > 0 && webView.getUrl() != null && !a.M0(webView.getUrl(), this.e.f10448g)) {
            Log.w("MyWebViewClient", "Client CA request ignored for " + webView.getUrl() + " as not on the Client CA URL List");
            clientCertRequest.ignore();
        } else if (privateKey == null || x509CertificateArr == null || x509CertificateArr.length <= 0) {
            Log.w("MyWebViewClient", "No client CA loaded for " + clientCertRequest.getHost() + " as no CA available");
            clientCertRequest.ignore();
        } else {
            clientCertRequest.getHost();
            clientCertRequest.proceed(privateKey, x509CertificateArr);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (webView instanceof MyWebView) {
            MyWebView myWebView = (MyWebView) webView;
            if (str2 != null && !str2.equals(myWebView.f10128h0)) {
                a(myWebView, str2, str, C1477r.d("Error: ", str));
            }
        }
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        String str3;
        String str4;
        String[] httpAuthUsernamePassword;
        if (webView instanceof MyWebView) {
            MyWebView myWebView = (MyWebView) webView;
            k kVar = this.f10967c;
            if (kVar.h2().contains(str)) {
                c cVar = (c) kVar.f9767W;
                if (!cVar.r("authUsername", "").isEmpty() && !cVar.r("authPassword", "").isEmpty()) {
                    httpAuthHandler.proceed(cVar.r("authUsername", ""), cVar.r("authPassword", ""));
                    return;
                }
            }
            if (!httpAuthHandler.useHttpAuthUsernamePassword() || (httpAuthUsernamePassword = webView.getHttpAuthUsernamePassword(str, str2)) == null || httpAuthUsernamePassword.length != 2) {
                str4 = null;
                str3 = null;
            } else {
                str4 = httpAuthUsernamePassword[0];
                str3 = httpAuthUsernamePassword[1];
            }
            if (str4 == null || str3 == null) {
                myWebView.a();
                C0780t4 t4Var = this.f10966b;
                s1 s1Var = new s1(t4Var, str, str2);
                s1Var.e = new C0772s2(httpAuthHandler);
                s1Var.f14074f = new C0772s2(httpAuthHandler);
                ((AlertDialog) s1Var.f14071b).getWindow().setSoftInputMode(4);
                a.q(t4Var.getWindow(), ((AlertDialog) s1Var.f14071b).getWindow());
                ((AlertDialog) s1Var.f14071b).show();
                ((AlertDialog) s1Var.f14071b).setOnKeyListener((I0) s1Var.f14075g);
                View rootView = ((AlertDialog) s1Var.f14071b).getWindow().getDecorView().getRootView();
                if (rootView != null) {
                    rootView.getViewTreeObserver().addOnWindowFocusChangeListener(new C0(1, s1Var));
                }
                ((TextView) s1Var.f14072c).requestFocus();
                myWebView.f10116A0 = (AlertDialog) s1Var.f14071b;
                return;
            }
            httpAuthHandler.proceed(str4, str3);
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webView instanceof MyWebView) {
            MyWebView myWebView = (MyWebView) webView;
            if (webResourceResponse.getStatusCode() == 400 || webResourceResponse.getStatusCode() > 401) {
                a(myWebView, webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode() + "", "HTTP error: " + webResourceResponse.getStatusCode());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceivedSslError(android.webkit.WebView r9, android.webkit.SslErrorHandler r10, android.net.http.SslError r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof de.ozerov.fully.MyWebView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = r9
            de.ozerov.fully.MyWebView r0 = (de.ozerov.fully.MyWebView) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onReceivedSslError "
            r1.<init>(r2)
            int r2 = r11.getPrimaryError()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r3 = r11.getUrl()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MyWebViewClient"
            android.util.Log.w(r3, r1)
            int r1 = r11.getPrimaryError()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0084
            if (r1 == r4) goto L_0x0081
            r5 = 2
            if (r1 == r5) goto L_0x007e
            r5 = 3
            if (r1 == r5) goto L_0x0046
            r2 = 4
            if (r1 == r2) goto L_0x0043
            java.lang.String r1 = "SSL error"
        L_0x0040:
            r5 = r1
        L_0x0041:
            r1 = 0
            goto L_0x0087
        L_0x0043:
            java.lang.String r1 = "The certificate date invalid"
            goto L_0x0040
        L_0x0046:
            boolean r1 = n2.a.z0()
            java.lang.String r5 = "The certificate authority is not trusted"
            if (r1 != 0) goto L_0x0041
            android.content.Context r1 = r9.getContext()
            android.net.http.SslCertificate r6 = r11.getCertificate()
            de.ozerov.fully.C0730l1.a(r1, r6)     // Catch:{ Exception -> 0x005b }
            r1 = 1
            goto L_0x0087
        L_0x005b:
            r1 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CA validation failed due to "
            r6.<init>(r7)
            java.lang.Class r7 = r1.getClass()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r1 = r1.getMessage()
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r2 = "l1"
            android.util.Log.w(r2, r1)
            goto L_0x0041
        L_0x007e:
            java.lang.String r1 = "The certificate hostname mismatch"
            goto L_0x0040
        L_0x0081:
            java.lang.String r1 = "The certificate has expired"
            goto L_0x0040
        L_0x0084:
            java.lang.String r1 = "The certificate is not yet valid"
            goto L_0x0040
        L_0x0087:
            java.lang.String r2 = "ignoreSSLerrors"
            d4.k r6 = r8.f10967c
            java.lang.Object r6 = r6.f9767W
            Z1.c r6 = (Z1.c) r6
            boolean r2 = r6.n(r2, r3)
            if (r2 != 0) goto L_0x00cf
            if (r1 == 0) goto L_0x0098
            goto L_0x00cf
        L_0x0098:
            android.content.Context r9 = r9.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SSL error when loading "
            r1.<init>(r2)
            java.lang.String r2 = r11.getUrl()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            n2.a.a1(r4, r9, r1)
            r10.cancel()
            java.lang.String r9 = r11.getUrl()
            java.lang.String r10 = " when loading "
            java.lang.StringBuilder r10 = N.e.B(r5, r10)
            java.lang.String r11 = r11.getUrl()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "SSL Failure"
            r8.a(r0, r9, r11, r10)
            goto L_0x00d2
        L_0x00cf:
            r10.proceed()
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0778t2.onReceivedSslError(android.webkit.WebView, android.webkit.SslErrorHandler, android.net.http.SslError):void");
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("MyWebViewClient", "onRenderProcessGone");
        if (!(webView instanceof MyWebView)) {
            return false;
        }
        MyWebView myWebView = (MyWebView) webView;
        boolean B8 = renderProcessGoneDetail.didCrash();
        C0780t4 t4Var = this.f10966b;
        if (!B8) {
            Log.e("MyWebViewClient", "Unresponsive WebView rendering process was killed! Restarting app...");
            a.b1(t4Var, "Unresponsive WebView rendering process was killed! Restarting app...");
            C0794w0.q0(2, "MyWebViewClient", "Unresponsive WebView rendering process was killed! Restarting app...");
        } else {
            Log.e("MyWebViewClient", "The WebView rendering process crashed! Restarting app...");
            a.b1(t4Var, "The WebView rendering process crashed! Restarting app...");
            C0794w0.q0(2, "MyWebViewClient", "The WebView rendering process crashed! Restarting app...");
        }
        myWebView.getWebTab().f10666j.d();
        if (!(t4Var instanceof FullyActivity)) {
            return true;
        }
        ((FullyActivity) t4Var).f9919H0.g();
        return true;
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (((c) this.f10967c.f9767W).n("safeBrowsing", false)) {
            safeBrowsingResponse.backToSafety(false);
            Context context = webView.getContext();
            a.a1(1, context, "Unsafe web page blocked " + webResourceRequest.getUrl());
            return;
        }
        safeBrowsingResponse.proceed(false);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        boolean z6;
        String str5;
        String str6;
        WebResourceResponse webResourceResponse;
        boolean z8;
        WebView webView2 = webView;
        String uri = webResourceRequest.getUrl().toString();
        String method = webResourceRequest.getMethod();
        if (W4.f10488b) {
            try {
                z8 = W4.b(new URL(uri).getHost());
            } catch (Exception e8) {
                Log.w("W4", e8.getMessage());
                z8 = false;
            }
            if (z8) {
                Log.w("MyWebViewClient", "URL Blocked by web filter " + uri);
                try {
                    return new WebResourceResponse("text/plain", "UTF-8", 403, "Host blocked", (Map) null, new ByteArrayInputStream("Host blocked by fully-single-app-blackhosts.txt".getBytes(StandardCharsets.UTF_8)));
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return null;
                }
            }
        }
        boolean equalsIgnoreCase = uri.equalsIgnoreCase("fully://launcher");
        C0780t4 t4Var = this.f10966b;
        if (equalsIgnoreCase || uri.equalsIgnoreCase("launcher:")) {
            return P.n(t4Var);
        }
        if (uri.toLowerCase().startsWith("fully:")) {
            return P.o(t4Var, uri);
        }
        if (uri.startsWith("https://youtube/video") || uri.startsWith("https://youtube/playlist")) {
            StringBuilder sb = new StringBuilder();
            if (uri.startsWith("https://youtube/video") || uri.startsWith("https://youtube/playlist")) {
                StringBuilder sb2 = new StringBuilder("<!DOCTYPE html>\n<html><head>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n<title>Fully YouTube Player</title>\n<style>\n* {margin:0; padding:0; background-color: black; }\niframe { pointer-events: none; } \nhtml, body { height: 100% }\n</style>\n</head>\n<body>\n<div id=\"player\"></div>\n<script>\n  var tag = document.createElement('script');\n  tag.src = \"https://www.youtube.com/iframe_api\";\n  var firstScriptTag = document.getElementsByTagName('script')[0];\n  firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);\n  var player;\n  function onYouTubeIframeAPIReady() {\n    player = new YT.Player('player', {\n      height: '99%',\n      width: '100%',\n      playerVars: { \n      'autoplay': 1,\n      'loop': 1,\n      'controls': 0,\n      'rel': 0,\n      'showinfo': 0,\n      'disablekb': 1,\n      'enablejsapi': 1},\n      events: {\n        'onReady': onPlayerReady,\n        'onError': onPlayerError,\n        'onStateChange': onPlayerStateChange,\n        'onAutoplayBlocked': onAutoplayBlocked\n      }\n    });\n  }\n  function onPlayerStateChange(event) {     if (typeof fullyYtInterface != \"undefined\") fullyYtInterface.onPlayerStateChange(event.data); if (event.data == YT.PlayerState.PLAYING) {\n        currentIndex = event.target.getPlaylistIndex();\n    }\n\n    if (event.data == YT.PlayerState.ENDED) {\n        if (currentIndex == (event.target.getPlaylist().length-1)) {\n            if (typeof fullyYtInterface != \"undefined\") fullyYtInterface.onPlayerStateChange(22); \n        }\n    }  }\n  function onPlayerError(event) { ");
                if (uri.startsWith("https://youtube/playlist")) {
                    str = " if (event.data >= 100) setTimeout(nextVideo, 3000); ";
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append("    if (typeof fullyYtInterface != \"undefined\") fullyYtInterface.onPlayerError(event.data);\n  }\n  function onAutoplayBlocked(event) {     if (typeof fullyYtInterface != \"undefined\") fullyYtInterface.onAutoplayBlocked(event.data);\n    console.log(\"Autoplay blocked\");\n  }\n  function nextVideo() { player.nextVideo(); }\n  function onPlayerReady(event) {\n");
                if (uri.startsWith("https://youtube/video")) {
                    str2 = "    player.loadVideoById({videoId:\"" + uri.replace("https://youtube/video/", "").replace("\\", "\\\\") + "\"});\n";
                } else {
                    str2 = "    player.loadPlaylist({list:\"" + uri.replace("https://youtube/playlist/", "").replace("\\", "\\\\") + "\"});\n";
                }
                sb2.append(str2);
                sb2.append("    if (typeof fullyYtInterface != \"undefined\") fullyYtInterface.onPlayerReady(event.data);\n  }\n</script>\n</body></html>");
                sb.append(sb2.toString());
            } else {
                sb.append("Unknown URL ".concat(uri));
            }
            try {
                return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(sb.toString().getBytes(StandardCharsets.UTF_8)));
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        } else {
            boolean startsWith = uri.toLowerCase().startsWith("file:");
            k kVar = this.f10967c;
            if (!startsWith && uri.toLowerCase().endsWith(".pdf") && kVar.M1().equals("4")) {
                return P.p(t4Var, uri);
            }
            if (uri.toLowerCase().startsWith("file:") && uri.toLowerCase().endsWith(".pdf") && kVar.i1().equals("4")) {
                return P.p(t4Var, uri);
            }
            if (!uri.toLowerCase().startsWith("http://fully-local-pdf/") || !uri.toLowerCase().endsWith("#pdf") || !kVar.i1().equals("4")) {
                String str7 = "charset=";
                String str8 = "content-encoding";
                String str9 = "*";
                if (uri.toLowerCase().startsWith("http://fully-content-pdf/") && uri.toLowerCase().endsWith("#pdf") && (kVar.M1().equals("4") || kVar.i1().equals("4"))) {
                    try {
                        WebResourceResponse webResourceResponse2 = new WebResourceResponse(ApplicationPolicy.DEFAULT_TYPE_PDF, "UTF-8", t4Var.getContentResolver().openInputStream(Uri.parse(uri.replace("http://fully-content-pdf/", "content://").replace("#pdf", ""))));
                        HashMap hashMap = new HashMap();
                        hashMap.put("Access-Control-Allow-Origin", str9);
                        webResourceResponse2.setResponseHeaders(hashMap);
                        return webResourceResponse2;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return null;
                    }
                } else if ((uri.toLowerCase().startsWith("http://localhost") || uri.toLowerCase().startsWith("https://localhost")) && kVar.L().booleanValue()) {
                    File x8 = C0794w0.x(t4Var, uri);
                    try {
                        if (!x8.canRead()) {
                            webResourceResponse = new WebResourceResponse("text/html", "utf-8", 404, "Not Found", (Map) null, new ByteArrayInputStream(("File " + x8.getAbsolutePath() + " not found").getBytes()));
                        } else {
                            String K4 = a.K(Uri.fromFile(x8).toString());
                            if (K4 == null) {
                                str6 = null;
                            } else if (K4.equals("3ga")) {
                                str6 = "audio/3gpp";
                            } else if (K4.equals("js")) {
                                str6 = "text/javascript";
                            } else if (K4.equals("woff")) {
                                str6 = "application/x-font-woff";
                            } else {
                                str6 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(K4);
                            }
                            if (str6 == null) {
                                str6 = "application/octet-stream";
                            }
                            x8.getAbsolutePath();
                            webResourceResponse = new WebResourceResponse(str6, (String) null, new FileInputStream(x8));
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("Access-Control-Allow-Origin", str9);
                            webResourceResponse.setResponseHeaders(hashMap2);
                        }
                        return webResourceResponse;
                    } catch (Exception e12) {
                        StringBuilder s8 = g.s("Failed to load url ", uri, " due to ");
                        s8.append(e12.getMessage());
                        Log.w("w0", s8.toString());
                        if (!uri.toLowerCase().endsWith("favicon.ico")) {
                            a.b1(t4Var, "Not found " + x8.getAbsolutePath());
                        }
                        return null;
                    }
                } else {
                    V4 v4 = this.e;
                    String[] strArr = v4.f10449h;
                    if (strArr.length > 0 && a.M0(uri, strArr)) {
                        try {
                            String k8 = C0808y2.k(uri);
                            if (!v4.f10450j.contains(k8)) {
                                v4.f10450j.add(k8);
                            }
                        } catch (Exception e13) {
                            Log.e("MyWebViewClient", e13.getMessage());
                        }
                    }
                    if (method.equalsIgnoreCase("post") || method.equalsIgnoreCase("put") || method.equalsIgnoreCase("patch") || !a.M0(uri, v4.i)) {
                        return shouldInterceptRequest(webView2, uri);
                    }
                    try {
                        q qVar = new q();
                        qVar.f6683j = new P((Object) new j5());
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        f.e(timeUnit, "unit");
                        qVar.f6691r = b.b(8, timeUnit);
                        qVar.f6693t = b.b(4, timeUnit);
                        qVar.f6692s = b.b(8, timeUnit);
                        qVar.f6680f = true;
                        qVar.f6682h = true;
                        qVar.i = true;
                        r rVar = new r(qVar);
                        B3.q qVar2 = new B3.q(9);
                        qVar2.r0(uri);
                        qVar2.U(method, (Q7.g) null);
                        qVar2.f451W = m.e(webResourceRequest.getRequestHeaders()).d();
                        u c8 = new c7.h(rVar, qVar2.n()).c();
                        int i = c8.f6742X;
                        if (200 > i || i >= 300) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            c8.close();
                            return null;
                        }
                        m mVar = c8.f6744Z;
                        HashMap hashMap3 = new HashMap();
                        for (int i8 = 0; i8 < mVar.size(); i8++) {
                            hashMap3.put(mVar.c(i8).toLowerCase(), mVar.f(i8));
                        }
                        try {
                            if (webView2 instanceof MyWebView) {
                                str9 = C0808y2.g(((MyWebView) webView2).f10125e0);
                            }
                        } catch (Exception unused) {
                        }
                        hashMap3.remove("x-frame-options");
                        hashMap3.remove("frame-options");
                        hashMap3.remove("content-security-policy");
                        if (method.equalsIgnoreCase("options")) {
                            hashMap3.put("access-control-allow-origin", str9);
                            hashMap3.put("access-control-allow-methods", "GET,HEAD,PUT,PATCH,POST,DELETE,OPTIONS");
                            hashMap3.put("access-control-allow-credentials", "true");
                            hashMap3.put("access-control-allow-headers", "accept, authorization, content-type");
                            hashMap3.put("vary", "access-control-request-headers");
                        } else {
                            hashMap3.put("access-control-allow-origin", str9);
                            hashMap3.put("access-control-allow-credentials", "true");
                        }
                        for (Map.Entry entry : hashMap3.entrySet()) {
                            String str10 = (String) entry.getKey();
                            String str11 = (String) entry.getValue();
                        }
                        String str12 = str8;
                        if (hashMap3.get(str12) != null) {
                            str3 = (String) hashMap3.get(str12);
                        } else {
                            if (hashMap3.get("content-type") != null) {
                                String str13 = str7;
                                if (((String) hashMap3.get("content-type")).split(str13).length > 1) {
                                    str3 = ((String) hashMap3.get("content-type")).split(str13)[1];
                                }
                            }
                            str3 = "utf-8";
                        }
                        String str14 = "text/plain";
                        String b8 = mVar.b("content-type");
                        if (b8 != null) {
                            str14 = b8;
                        }
                        String trim = str14.split(";")[0].trim();
                        String b9 = mVar.b(str12);
                        if (b9 == null) {
                            str4 = str3;
                        } else {
                            str4 = b9;
                        }
                        int i9 = c8.f6742X;
                        if (200 > i9 || i9 >= 300) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        String str15 = c8.f6741W;
                        if (z6) {
                            if (str15.trim().isEmpty()) {
                                str5 = "OK";
                                return new WebResourceResponse(trim, str4, i9, str5, hashMap3, c8.f6745a0.l().j());
                            }
                        }
                        str5 = str15;
                        return new WebResourceResponse(trim, str4, i9, str5, hashMap3, c8.f6745a0.l().j());
                    } catch (Exception e14) {
                        g.z(e14, g.s("Exception when trying to get content from url ", uri, " due to "), "MyWebViewClient");
                        return null;
                    }
                }
            } else {
                try {
                    return new WebResourceResponse(ApplicationPolicy.DEFAULT_TYPE_PDF, "UTF-8", new FileInputStream(a.j1(uri).replace("http://fully-local-pdf/", "").replace("#pdf", "")));
                } catch (Exception e15) {
                    e15.printStackTrace();
                    return null;
                }
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return d(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return d(webView, str, true);
    }
}
