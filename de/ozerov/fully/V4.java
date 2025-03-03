package de.ozerov.fully;

import G5.h;
import P5.E;
import Z1.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import com.samsung.android.knox.application.ApplicationPolicy;
import d4.k;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n2.a;

public final class V4 {

    /* renamed from: a  reason: collision with root package name */
    public final C0780t4 f10443a;

    /* renamed from: b  reason: collision with root package name */
    public final k f10444b;

    /* renamed from: c  reason: collision with root package name */
    public C0740n f10445c;

    /* renamed from: d  reason: collision with root package name */
    public String[] f10446d;
    public String[] e;

    /* renamed from: f  reason: collision with root package name */
    public String[] f10447f;

    /* renamed from: g  reason: collision with root package name */
    public String[] f10448g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f10449h;
    public String[] i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f10450j;

    /* renamed from: k  reason: collision with root package name */
    public long f10451k = -1;

    /* renamed from: l  reason: collision with root package name */
    public F f10452l;

    /* renamed from: m  reason: collision with root package name */
    public final E f10453m;

    /* renamed from: n  reason: collision with root package name */
    public ValueCallback f10454n;

    /* renamed from: o  reason: collision with root package name */
    public String f10455o;

    /* renamed from: p  reason: collision with root package name */
    public String f10456p;

    /* renamed from: q  reason: collision with root package name */
    public String f10457q;

    /* renamed from: r  reason: collision with root package name */
    public Uri f10458r;

    /* renamed from: s  reason: collision with root package name */
    public Uri f10459s;

    /* renamed from: t  reason: collision with root package name */
    public Uri f10460t;

    /* renamed from: u  reason: collision with root package name */
    public volatile X509Certificate[] f10461u;

    /* renamed from: v  reason: collision with root package name */
    public volatile PrivateKey f10462v;

    public V4(C0780t4 t4Var) {
        this.f10443a = t4Var;
        this.f10444b = new k((Context) t4Var, 1);
        this.f10453m = new E(3);
        this.f10450j = new ArrayList();
    }

    public static void c(String str) {
        String str2;
        try {
            CookieManager instance = CookieManager.getInstance();
            ArrayList arrayList = C0808y2.f11115a;
            String host = new URI(str).getHost();
            if (host != null) {
                String[] split = host.split("\\.");
                if (split.length > 1) {
                    str2 = split[split.length - 2] + "." + split[split.length - 1];
                } else {
                    str2 = host;
                }
                String cookie = instance.getCookie(str);
                String path = new URI(str).getPath();
                if (cookie != null && !cookie.isEmpty()) {
                    for (String str3 : cookie.split("; ")) {
                        if (str3 != null && !str3.isEmpty()) {
                            if (str3.contains("=")) {
                                String[] split2 = str3.split("=");
                                instance.setCookie(str, split2[0].trim() + "=; Max-Age=-1");
                                if (path != null) {
                                    instance.setCookie(str, split2[0].trim() + "=; Path=" + path + "; Max-Age=-1");
                                }
                                instance.setCookie(str, split2[0].trim() + "=; Domain=" + host + "; Max-Age=-1");
                                instance.setCookie(str, split2[0].trim() + "=; Domain=" + str2 + "; Max-Age=-1");
                            }
                        }
                    }
                    return;
                }
                return;
            }
            throw new URISyntaxException(str, "No host identified in URL " + str);
        } catch (URISyntaxException e8) {
            Log.e("V4", "Message", e8);
        }
    }

    public final void a() {
        k kVar = this.f10444b;
        this.f10446d = a.W(((c) kVar.f9767W).r("urlWhitelist", ""));
        c cVar = (c) kVar.f9767W;
        this.e = a.W(cVar.r("urlBlacklist", ""));
        this.f10447f = a.W(cVar.r("forceOpenByAppUrl", ""));
        this.f10449h = a.W(cVar.r("deleteCookiesBlacklist", ""));
        this.f10448g = a.W(cVar.r("clientCaUrls", ""));
        this.i = a.W(kVar.N2(cVar.r("removeXframeOptionsUrl", "")));
    }

    public final void b(boolean z, Runnable runnable) {
        try {
            CookieManager instance = CookieManager.getInstance();
            if (!((c) this.f10444b.f9767W).r("deleteCookiesBlacklist", "").isEmpty()) {
                if (!z) {
                    Iterator it = this.f10450j.iterator();
                    while (it.hasNext()) {
                        c((String) it.next());
                    }
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            instance.removeAllCookies(new C3(1, runnable));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d() {
        F f8 = this.f10452l;
        if (f8 != null && f8.isShowing() && !this.f10443a.isFinishing()) {
            this.f10452l.dismiss();
        }
        this.f10452l = null;
    }

    public final void e(MyWebView myWebView, String str, String str2) {
        String str3;
        long j7;
        k kVar = this.f10444b;
        String str4 = Environment.DIRECTORY_DOWNLOADS;
        C0780t4 t4Var = this.f10443a;
        File c02 = a.c0(t4Var, str4);
        if (!(t4Var instanceof FullyActivity)) {
            a.b1(t4Var, "Downloads disabled for other activities");
        } else if (!P.B() && a.w0(t4Var, c02)) {
            a.b1(t4Var, "External storage is not writable for Fully");
        } else if (a.h0(t4Var) || !a.w0(t4Var, c02)) {
            String str5 = "";
            String str6 = null;
            if (str.toLowerCase().startsWith("blob:") || str.toLowerCase().startsWith("data:")) {
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
                if (extensionFromMimeType != null) {
                    str5 = ".".concat(extensionFromMimeType);
                }
                String str7 = "var blobXhr = new XMLHttpRequest();var blobAhref = document.querySelector('a[href=\"" + str + "\"]');if (blobAhref!=null) blobFileName = blobAhref.getAttribute('download');else blobFileName = 'download" + str5 + "';";
                if (str.toLowerCase().startsWith("data:")) {
                    str3 = str7 + "FullyKiosk.getBase64FromBlobData('" + str + "', blobFileName, '" + str2 + "');";
                } else {
                    str3 = str7 + "blobXhr.open('GET', '" + str + "', true);blobXhr.setRequestHeader('Content-type','" + str2 + "');blobXhr.responseType = 'blob';blobXhr.onload = function(e) {    if (this.status == 200) {        var blobData = this.response;        var reader = new FileReader();        reader.readAsDataURL(blobData);        reader.onloadend = function() {            base64data = reader.result;            FullyKiosk.getBase64FromBlobData(base64data, blobFileName, '" + str2 + "');        }    }};blobXhr.send();";
                }
                if (myWebView != null) {
                    myWebView.evaluateJavascript(str3, (ValueCallback) null);
                } else {
                    Log.w("V4", "Can't call evaluateJavascript() while webview is null");
                }
            } else {
                try {
                    String h22 = kVar.h2();
                    c cVar = (c) kVar.f9767W;
                    if (Uri.parse(str).getHost().equals(Uri.parse(h22).getHost()) && !cVar.r("authUsername", str5).isEmpty() && !cVar.r("authPassword", str5).isEmpty()) {
                        str = str.replace("//", "//" + a.k1(cVar.r("authUsername", str5)) + ":" + a.k1(cVar.r("authPassword", str5)) + "@");
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                boolean n4 = ((c) kVar.f9767W).n("ignoreSSLerrors", false);
                if (myWebView != null) {
                    str6 = myWebView.getSettings().getUserAgentString();
                }
                E e9 = this.f10453m;
                e9.getClass();
                if (!c02.exists()) {
                    j7 = -1;
                } else {
                    j7 = e9.f3809V;
                    e9.f3809V = 1 + j7;
                    V1 v12 = new V1(e9);
                    v12.f10431a = j7;
                    v12.f10432b = str;
                    v12.f10433c = c02;
                    v12.f10434d = this;
                    v12.e = n4;
                    v12.f10435f = str6;
                    v12.execute(new Void[0]);
                    ((HashMap) e9.f3810W).put(Long.valueOf(j7), v12);
                }
                this.f10451k = j7;
                if (j7 != -1) {
                    F f8 = new F(t4Var, "Downloading file...");
                    this.f10452l = f8;
                    f8.show();
                    this.f10452l.setOnCancelListener(new h(9, this));
                }
            }
        } else {
            a.b1(t4Var, "Missing write to storage runtime permissions");
        }
    }

    public final String f(String str, String str2) {
        boolean M02 = a.M0(str, this.e);
        C0780t4 t4Var = this.f10443a;
        if (M02 || str.toLowerCase().startsWith("file:///android_asset/") || str.toLowerCase().startsWith("file:///android_res/")) {
            a.a1(1, t4Var, t4Var.getString(2131951968, new Object[]{str}));
            return g(str2);
        }
        String[] strArr = this.f10446d;
        if (strArr.length <= 0 || a.M0(str, strArr) || a.M0(a.S0(str), this.f10446d) || str.startsWith("https://license.fully-kiosk.com/license") || str.startsWith("https://www.paypal.com/") || str.startsWith("https://www.fully-kiosk.com/welcome") || str.startsWith("mailto:info@fully-kiosk.com") || str.equals("about:blank") || str.startsWith("fully://launcher") || str.startsWith("file:///launcher")) {
            return str;
        }
        k kVar = this.f10444b;
        if (str.startsWith(kVar.h2()) && !kVar.h2().isEmpty()) {
            return str;
        }
        if (str.startsWith(kVar.N()) && !kVar.N().isEmpty()) {
            return str;
        }
        if (str.startsWith(kVar.A2()) && !kVar.A2().isEmpty()) {
            return str;
        }
        c cVar = (c) kVar.f9767W;
        if (str.startsWith(kVar.N2(cVar.r("screensaverWallpaperURL", ""))) && !kVar.N2(cVar.r("screensaverWallpaperURL", "")).isEmpty()) {
            return str;
        }
        if (str.startsWith(kVar.q()) && !kVar.q().isEmpty()) {
            return str;
        }
        if (str2 != null && str2.startsWith("fully://launcher") && P.s(t4Var).contains(str) && P.s(t4Var).contains(a.S0(str))) {
            return str;
        }
        a.a1(1, t4Var, t4Var.getString(2131951969, new Object[]{str}));
        Log.w("V4", "URL " + str + " not on the whitelist");
        return g(str2);
    }

    public final String g(String str) {
        k kVar = this.f10444b;
        if (((c) kVar.f9767W).n("redirectBlocked", false)) {
            String[] e12 = a.e1(kVar.h2());
            if (e12.length < 1) {
                return null;
            }
            return e12[0];
        } else if (str == null) {
            return "about:blank";
        } else {
            return null;
        }
    }

    public final void h() {
        this.f10461u = null;
        this.f10462v = null;
        if (!this.f10444b.t().isEmpty()) {
            AsyncTask.execute(new M2(5, (Object) this));
        }
    }

    public final void i(C0802x2 x2Var) {
        boolean z;
        int i8 = x2Var.f11070b;
        C0780t4 t4Var = this.f10443a;
        if (i8 == 200) {
            String str = x2Var.f11072d;
            String str2 = x2Var.e;
            File file = new File(str);
            boolean z6 = true;
            if (!a.w0(t4Var, file)) {
                if (!a.p0()) {
                    z = false;
                } else {
                    z = !Environment.isExternalStorageLegacy();
                }
                if (!z) {
                    z6 = false;
                }
            }
            k kVar = this.f10444b;
            if (str2 != null && str2.equals(ApplicationPolicy.DEFAULT_TYPE_PDF) && kVar.M1().equals("1")) {
                if (t4Var instanceof FullyActivity) {
                    ((FullyActivity) t4Var).f9919H0.b();
                }
                n(Uri.fromFile(new File(str)).toString());
            } else if (((str2 == null || !str2.equals(ApplicationPolicy.DEFAULT_TYPE_PDF)) && (kVar.L1().equals("5") || (kVar.L1().equals("2") && z6))) || (str2 != null && str2.equals(ApplicationPolicy.DEFAULT_TYPE_PDF) && (kVar.M1().equals("5") || (kVar.M1().equals("3") && z6)))) {
                Uri d8 = FileProvider.d(t4Var, file);
                if (d8 != null) {
                    d8.toString();
                }
                if (!file.exists() || d8 == null) {
                    a.b1(t4Var, "Can't get content URI for file " + str);
                } else {
                    j(d8, str2);
                }
            } else if (((str2 == null || !str2.equals(ApplicationPolicy.DEFAULT_TYPE_PDF)) && kVar.L1().equals("2")) || (str2 != null && str2.equals(ApplicationPolicy.DEFAULT_TYPE_PDF) && kVar.M1().equals("3"))) {
                j(Uri.fromFile(new File(str)), str2);
            } else if (((str2 == null || !str2.equals(ApplicationPolicy.DEFAULT_TYPE_PDF)) && kVar.L1().equals("6")) || (str2 != null && str2.equals(ApplicationPolicy.DEFAULT_TYPE_PDF) && kVar.M1().equals("6"))) {
                a.b1(t4Var, "Download completed " + x2Var.f11071c);
            }
            d();
            this.f10451k = -1;
            return;
        }
        a.b1(t4Var, "File download failed (" + x2Var.f11070b + ")");
        d();
        this.f10451k = -1;
    }

    public final void j(Uri uri, String str) {
        C0780t4 t4Var = this.f10443a;
        if (!t4Var.y("preferences")) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, str);
            intent.addFlags(1);
            try {
                t4Var.startActivity(intent);
            } catch (Exception e8) {
                a.a1(1, t4Var, "No app found for handling this file");
                e8.printStackTrace();
            }
        }
    }

    public final void k(String str, String str2) {
        C0780t4 t4Var = this.f10443a;
        if (!t4Var.y("preferences")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(Uri.parse(str), str2);
                intent.addFlags(1);
                t4Var.startActivity(intent);
            } catch (Exception e8) {
                a.a1(1, t4Var, "No app found for handling " + str);
                e8.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        r1 = r12.getWebTab().f10666j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(de.ozerov.fully.MyWebView r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 1
            de.ozerov.fully.t4 r1 = r11.f10443a
            androidx.fragment.app.L r1 = r1.l()
            int r1 = r1.G()
            if (r1 <= 0) goto L_0x003a
            de.ozerov.fully.t4 r1 = r11.f10443a
            java.lang.String r2 = "welcome"
            boolean r1 = r1.x(r2)
            if (r1 != 0) goto L_0x0035
            de.ozerov.fully.t4 r1 = r11.f10443a
            java.lang.String r2 = "single_app_manager"
            boolean r1 = r1.x(r2)
            if (r1 != 0) goto L_0x0035
            de.ozerov.fully.t4 r1 = r11.f10443a
            java.lang.String r2 = "pdfRenderer"
            boolean r1 = r1.x(r2)
            if (r1 != 0) goto L_0x0035
            de.ozerov.fully.t4 r1 = r11.f10443a
            java.lang.String r2 = "exam_manager"
            boolean r1 = r1.x(r2)
            if (r1 == 0) goto L_0x003a
        L_0x0035:
            de.ozerov.fully.t4 r1 = r11.f10443a
            r1.C()
        L_0x003a:
            de.ozerov.fully.n r1 = r11.f10445c
            if (r1 == 0) goto L_0x0052
            boolean r1 = r1.l()
            if (r1 == 0) goto L_0x0052
            de.ozerov.fully.n r1 = r11.f10445c
            r1.p()
            de.ozerov.fully.n r1 = r11.f10445c
            android.widget.FrameLayout r1 = r1.f10820b
            r2 = 8
            r1.setVisibility(r2)
        L_0x0052:
            java.lang.String r1 = r12.f10125e0
            java.lang.String r13 = r11.f(r13, r1)
            if (r13 != 0) goto L_0x005b
            return
        L_0x005b:
            java.lang.String r1 = r12.f10125e0
            if (r1 != 0) goto L_0x007c
            java.lang.String r1 = "about:blank"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x007c
            de.ozerov.fully.g5 r1 = r12.getWebTab()
            boolean r1 = r1.f10668l
            if (r1 == 0) goto L_0x007c
            de.ozerov.fully.g5 r1 = r12.getWebTab()
            de.ozerov.fully.i5 r1 = r1.f10666j
            de.ozerov.fully.g5 r2 = r1.f10711d
            if (r2 == 0) goto L_0x007c
            r1.e(r2)
        L_0x007c:
            java.lang.String r1 = "rtsp:"
            boolean r1 = r13.startsWith(r1)
            if (r1 != 0) goto L_0x009c
            java.lang.String r1 = ".mp4"
            boolean r1 = r13.endsWith(r1)
            if (r1 != 0) goto L_0x009c
            java.lang.String r1 = ".webm"
            boolean r1 = r13.endsWith(r1)
            if (r1 != 0) goto L_0x009c
            java.lang.String r1 = ".mkv"
            boolean r1 = r13.endsWith(r1)
            if (r1 == 0) goto L_0x00b3
        L_0x009c:
            d4.k r1 = r11.f10444b
            java.lang.Boolean r1 = r1.D1()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00b3
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 1
            r2 = r11
            r3 = r13
            r2.m(r3, r4, r5, r6, r7)
            goto L_0x0428
        L_0x00b3:
            java.lang.String r1 = "http:"
            boolean r1 = r13.startsWith(r1)
            r2 = 0
            java.lang.String r3 = "android.intent.action.VIEW"
            java.lang.String r4 = "https://www.fully-kiosk.com/welcome"
            java.lang.String r5 = "fully://launcher"
            java.lang.String r6 = "launcher:"
            java.lang.String r7 = "fully:"
            java.lang.String r8 = "javascript:"
            java.lang.String r9 = "V4"
            if (r1 != 0) goto L_0x01e8
            java.lang.String r1 = "https:"
            boolean r1 = r13.startsWith(r1)
            if (r1 != 0) goto L_0x01e8
            java.lang.String r1 = "content:"
            boolean r1 = r13.startsWith(r1)
            if (r1 != 0) goto L_0x01e8
            java.lang.String r1 = "file:"
            boolean r1 = r13.startsWith(r1)
            if (r1 != 0) goto L_0x01e8
            java.lang.String r1 = "about:"
            boolean r1 = r13.startsWith(r1)
            if (r1 != 0) goto L_0x01e8
            boolean r1 = r13.startsWith(r7)
            if (r1 != 0) goto L_0x01e8
            boolean r1 = r13.startsWith(r8)
            if (r1 != 0) goto L_0x01e8
            boolean r1 = r13.startsWith(r6)
            if (r1 == 0) goto L_0x00fe
            goto L_0x01e8
        L_0x00fe:
            d4.k r0 = r11.f10444b
            java.lang.Object r1 = r0.f9767W
            Z1.c r1 = (Z1.c) r1
            java.lang.String r6 = "enableDownload"
            boolean r1 = r1.n(r6, r2)
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r6 = "enableUrlOtherApps"
            boolean r0 = r0.n(r6, r1)
            java.lang.String r1 = "intent:"
            java.lang.String r6 = "Can't start intent for "
            java.lang.String r7 = "browser_fallback_url"
            if (r0 != 0) goto L_0x0174
            java.lang.String r0 = r12.f10125e0
            if (r0 == 0) goto L_0x0143
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L_0x0174
            java.lang.String r0 = r12.f10125e0
            java.lang.String r5 = "file:///launcher"
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L_0x0174
            java.lang.String r0 = r12.f10125e0
            java.lang.String r5 = "https://license.fully-kiosk.com/license"
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L_0x0174
            java.lang.String r0 = r12.f10125e0
            boolean r0 = r0.startsWith(r4)
            if (r0 == 0) goto L_0x0143
            goto L_0x0174
        L_0x0143:
            boolean r0 = r13.startsWith(r1)
            if (r0 == 0) goto L_0x0173
            android.content.Intent r0 = n2.a.P0(r13)     // Catch:{ Exception -> 0x015f }
            java.lang.String r1 = r0.getStringExtra(r7)     // Catch:{ Exception -> 0x015f }
            if (r1 == 0) goto L_0x0428
            r12.b()     // Catch:{ Exception -> 0x015f }
            java.lang.String r0 = r0.getStringExtra(r7)     // Catch:{ Exception -> 0x015f }
            r12.loadUrl(r0)     // Catch:{ Exception -> 0x015f }
            goto L_0x0428
        L_0x015f:
            r12 = move-exception
            java.lang.String r13 = r6.concat(r13)
            android.util.Log.e(r9, r13)
            r12.printStackTrace()
            de.ozerov.fully.t4 r12 = r11.f10443a
            java.lang.String r13 = "Failed to parse intent URL"
            n2.a.b1(r12, r13)
            goto L_0x0428
        L_0x0173:
            return
        L_0x0174:
            r12.b()
            boolean r0 = r13.startsWith(r1)
            java.lang.String r1 = "Failed to start another app"
            if (r0 == 0) goto L_0x01c1
            android.content.Intent r0 = n2.a.P0(r13)     // Catch:{ Exception -> 0x0199 }
            de.ozerov.fully.t4 r3 = r11.f10443a     // Catch:{ Exception -> 0x0199 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x0199 }
            java.util.List r2 = r3.queryIntentActivities(r0, r2)     // Catch:{ Exception -> 0x0199 }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0199 }
            if (r2 != 0) goto L_0x019b
            de.ozerov.fully.t4 r2 = r11.f10443a     // Catch:{ Exception -> 0x0199 }
            r2.startActivity(r0)     // Catch:{ Exception -> 0x0199 }
            goto L_0x01df
        L_0x0199:
            r0 = move-exception
            goto L_0x01b2
        L_0x019b:
            java.lang.String r2 = r0.getStringExtra(r7)     // Catch:{ Exception -> 0x0199 }
            if (r2 == 0) goto L_0x01aa
            java.lang.String r0 = r0.getStringExtra(r7)     // Catch:{ Exception -> 0x0199 }
            r12.loadUrl(r0)     // Catch:{ Exception -> 0x0199 }
            goto L_0x0428
        L_0x01aa:
            de.ozerov.fully.t4 r0 = r11.f10443a     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = "App not found for intent"
            n2.a.b1(r0, r2)     // Catch:{ Exception -> 0x0199 }
            goto L_0x01df
        L_0x01b2:
            java.lang.String r2 = "due to "
            java.lang.StringBuilder r2 = Q0.g.s(r6, r13, r2)
            Q0.g.x(r0, r2, r9)
            de.ozerov.fully.t4 r0 = r11.f10443a
            n2.a.b1(r0, r1)
            goto L_0x01df
        L_0x01c1:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x01d0 }
            android.net.Uri r2 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x01d0 }
            r0.<init>(r3, r2)     // Catch:{ Exception -> 0x01d0 }
            de.ozerov.fully.t4 r2 = r11.f10443a     // Catch:{ Exception -> 0x01d0 }
            r2.startActivity(r0)     // Catch:{ Exception -> 0x01d0 }
            goto L_0x01df
        L_0x01d0:
            r0 = move-exception
            java.lang.String r2 = " due to "
            java.lang.StringBuilder r2 = Q0.g.s(r6, r13, r2)
            Q0.g.x(r0, r2, r9)
            de.ozerov.fully.t4 r0 = r11.f10443a
            n2.a.b1(r0, r1)
        L_0x01df:
            de.ozerov.fully.g5 r12 = r12.getWebTab()
            r12.i(r13)
            goto L_0x0428
        L_0x01e8:
            boolean r1 = r13.startsWith(r8)
            r10 = 2
            if (r1 != 0) goto L_0x01f1
            r12.f10117B0 = r10
        L_0x01f1:
            d4.k r1 = r11.f10444b
            java.lang.Boolean r1 = r1.C1()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0206
            boolean r1 = r13.startsWith(r8)
            if (r1 != 0) goto L_0x0206
            r12.h()
        L_0x0206:
            boolean r1 = r13.equals(r5)
            if (r1 != 0) goto L_0x03ec
            boolean r1 = r13.equals(r6)
            if (r1 == 0) goto L_0x0214
            goto L_0x03ec
        L_0x0214:
            java.lang.String r1 = "fully://tab"
            boolean r1 = r13.startsWith(r1)
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x0240
            java.lang.String r0 = "fully://tab#"
            java.lang.String r13 = r13.replace(r0, r5)     // Catch:{ Exception -> 0x0233 }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ Exception -> 0x0233 }
            de.ozerov.fully.g5 r12 = r12.getWebTab()     // Catch:{ Exception -> 0x0233 }
            de.ozerov.fully.i5 r12 = r12.f10666j     // Catch:{ Exception -> 0x0233 }
            r12.j(r13)     // Catch:{ Exception -> 0x0233 }
            goto L_0x0428
        L_0x0233:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to change the tab due to "
            r13.<init>(r0)
            Q0.g.x(r12, r13, r9)
            goto L_0x0428
        L_0x0240:
            boolean r1 = r13.startsWith(r7)
            if (r1 == 0) goto L_0x0284
            de.ozerov.fully.t4 r0 = r11.f10443a
            android.webkit.WebResourceResponse r0 = de.ozerov.fully.P.o(r0, r13)
            r12.b()     // Catch:{ Exception -> 0x0277 }
            java.io.InputStream r1 = r0.getData()     // Catch:{ Exception -> 0x0277 }
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x0277 }
            java.lang.String r4 = E7.f.b(r1, r2)     // Catch:{ Exception -> 0x0277 }
            java.lang.String r5 = r0.getMimeType()     // Catch:{ Exception -> 0x0277 }
            java.lang.String r6 = r0.getEncoding()     // Catch:{ Exception -> 0x0277 }
            r2 = r12
            r3 = r13
            r7 = r13
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0277 }
            de.ozerov.fully.g5 r0 = r12.getWebTab()     // Catch:{ Exception -> 0x0277 }
            r0.m()     // Catch:{ Exception -> 0x0277 }
            de.ozerov.fully.g5 r12 = r12.getWebTab()     // Catch:{ Exception -> 0x0277 }
            r12.o(r13)     // Catch:{ Exception -> 0x0277 }
            goto L_0x0428
        L_0x0277:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to load fully scheme page due to "
            r13.<init>(r0)
            Q0.g.x(r12, r13, r9)
            goto L_0x0428
        L_0x0284:
            boolean r1 = r13.startsWith(r8)
            if (r1 == 0) goto L_0x028f
            r12.loadUrl(r13)
            goto L_0x0428
        L_0x028f:
            java.lang.String[] r1 = r11.f10447f
            boolean r1 = n2.a.M0(r13, r1)
            if (r1 == 0) goto L_0x02d0
            r12.b()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3)
            android.net.Uri r1 = android.net.Uri.parse(r13)
            r0.setData(r1)
            de.ozerov.fully.t4 r1 = r11.f10443a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.List r1 = r1.queryIntentActivities(r0, r2)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x02bc
            de.ozerov.fully.t4 r1 = r11.f10443a
            r1.startActivity(r0)
            goto L_0x02c7
        L_0x02bc:
            de.ozerov.fully.t4 r0 = r11.f10443a
            java.lang.String r1 = "App not found for handling URL "
            java.lang.String r1 = r1.concat(r13)
            n2.a.b1(r0, r1)
        L_0x02c7:
            de.ozerov.fully.g5 r12 = r12.getWebTab()
            r12.i(r13)
            goto L_0x0428
        L_0x02d0:
            java.lang.String r1 = r12.f10127g0
            if (r1 == 0) goto L_0x02e7
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x02e7
            java.lang.String r1 = "#"
            boolean r1 = r13.contains(r1)
            if (r1 == 0) goto L_0x02e7
            r12.reload()
            goto L_0x0428
        L_0x02e7:
            r12.b()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            d4.k r3 = r11.f10444b
            java.lang.String r6 = "addXffHeader"
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            boolean r3 = r3.n(r6, r2)
            if (r3 == 0) goto L_0x0306
            java.lang.String r3 = "X-Forwarded-For"
            java.lang.String r6 = de.ozerov.fully.C0794w0.B()
            r1.put(r3, r6)
        L_0x0306:
            d4.k r3 = r11.f10444b
            java.lang.String r6 = "addDntHeader"
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            boolean r3 = r3.n(r6, r2)
            java.lang.String r6 = "1"
            if (r3 == 0) goto L_0x031b
            java.lang.String r3 = "DNT"
            r1.put(r3, r6)
        L_0x031b:
            java.lang.String r3 = r12.getUrl()
            if (r3 == 0) goto L_0x0338
            d4.k r3 = r11.f10444b
            java.lang.String r7 = "addRefererHeader"
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            boolean r3 = r3.n(r7, r0)
            if (r3 == 0) goto L_0x0338
            java.lang.String r3 = "Referer"
            java.lang.String r7 = r12.getUrl()
            r1.put(r3, r7)
        L_0x0338:
            boolean r3 = r13.startsWith(r4)
            if (r3 == 0) goto L_0x0388
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "X-Fully-Android-SDK"
            r1.put(r4, r3)
            de.ozerov.fully.t4 r3 = r11.f10443a
            boolean r3 = de.ozerov.fully.P.y(r3)
            if (r3 == 0) goto L_0x0356
            java.lang.String r3 = "X-Fully-Android-TV"
            r1.put(r3, r6)
        L_0x0356:
            de.ozerov.fully.t4 r3 = r11.f10443a
            boolean r3 = de.ozerov.fully.P.D(r3)
            if (r3 == 0) goto L_0x0363
            java.lang.String r3 = "X-Fully-Fire-OS"
            r1.put(r3, r6)
        L_0x0363:
            boolean r3 = de.ozerov.fully.P.z()
            if (r3 == 0) goto L_0x036e
            java.lang.String r3 = "X-Fully-Chrome-OS"
            r1.put(r3, r6)
        L_0x036e:
            de.ozerov.fully.t4 r3 = r11.f10443a
            boolean r3 = de.ozerov.fully.P.x(r3)
            if (r3 == 0) goto L_0x037b
            java.lang.String r3 = "X-Fully-Android-Go"
            r1.put(r3, r6)
        L_0x037b:
            de.ozerov.fully.t4 r3 = r11.f10443a
            boolean r3 = de.ozerov.fully.P.E(r3)
            if (r3 == 0) goto L_0x0388
            java.lang.String r3 = "X-Fully-Harmony-OS"
            r1.put(r3, r6)
        L_0x0388:
            d4.k r3 = r11.f10444b
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            java.lang.String r4 = "addWebRequestHeaders"
            java.lang.String r3 = r3.r(r4, r5)
            java.lang.String r3 = r3.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x03da
            d4.k r3 = r11.f10444b
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            java.lang.String r3 = r3.r(r4, r5)
            java.lang.String r3 = r3.trim()
            java.lang.String[] r3 = n2.a.e1(r3)
            int r4 = r3.length
            r5 = 0
        L_0x03b2:
            if (r5 >= r4) goto L_0x03da
            r6 = r3[r5]
            java.lang.String r7 = ":"
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            if (r7 != r10) goto L_0x03d8
            r7 = r6[r2]
            java.lang.String r7 = r7.trim()
            r8 = r6[r0]
            java.lang.String r8 = r8.trim()
            r1.put(r7, r8)
            r7 = r6[r2]
            r7.getClass()
            r6 = r6[r0]
            r6.getClass()
        L_0x03d8:
            int r5 = r5 + r0
            goto L_0x03b2
        L_0x03da:
            r12.loadUrl(r13, r1)
            de.ozerov.fully.g5 r0 = r12.getWebTab()
            r0.m()
            de.ozerov.fully.g5 r12 = r12.getWebTab()
            r12.o(r13)
            goto L_0x0428
        L_0x03ec:
            de.ozerov.fully.t4 r0 = r11.f10443a
            android.webkit.WebResourceResponse r0 = de.ozerov.fully.P.n(r0)
            if (r0 == 0) goto L_0x0428
            r12.b()     // Catch:{ Exception -> 0x041f }
            java.lang.String r3 = "file:///launcher"
            java.io.InputStream r1 = r0.getData()     // Catch:{ Exception -> 0x041f }
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x041f }
            java.lang.String r4 = E7.f.b(r1, r2)     // Catch:{ Exception -> 0x041f }
            java.lang.String r5 = r0.getMimeType()     // Catch:{ Exception -> 0x041f }
            java.lang.String r6 = r0.getEncoding()     // Catch:{ Exception -> 0x041f }
            r2 = r12
            r7 = r13
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x041f }
            de.ozerov.fully.g5 r0 = r12.getWebTab()     // Catch:{ Exception -> 0x041f }
            r0.m()     // Catch:{ Exception -> 0x041f }
            de.ozerov.fully.g5 r12 = r12.getWebTab()     // Catch:{ Exception -> 0x041f }
            r12.o(r13)     // Catch:{ Exception -> 0x041f }
            goto L_0x0428
        L_0x041f:
            r12 = move-exception
            java.lang.String r13 = "Failed to load launcher page"
            android.util.Log.e(r9, r13)
            r12.printStackTrace()
        L_0x0428:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.V4.l(de.ozerov.fully.MyWebView, java.lang.String):void");
    }

    public final void m(String str, boolean z, boolean z6, boolean z8, boolean z9) {
        C0740n nVar = this.f10445c;
        C0780t4 t4Var = this.f10443a;
        k kVar = this.f10444b;
        if (nVar == null) {
            this.f10445c = new C0740n(t4Var, 2131362252, kVar.x2());
        }
        C0740n nVar2 = this.f10445c;
        nVar2.f10830n = str;
        nVar2.f10833q = z;
        nVar2.f10834r = z6;
        nVar2.f10836t = true;
        nVar2.f10835s = z8;
        nVar2.f10837u = z9;
        nVar2.f10811A = -16777216;
        nVar2.f10840x = kVar.P();
        this.f10445c.f10841y = kVar.P();
        C0740n nVar3 = this.f10445c;
        nVar3.z = 30;
        nVar3.f10820b.setVisibility(0);
        this.f10445c.n();
        if (t4Var instanceof FullyActivity) {
            ((FullyActivity) t4Var).f9960y1.e(false, false);
        }
    }

    public final void n(String str) {
        H2 h22 = new H2();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        h22.N(bundle);
        this.f10443a.A(2131362365, h22, "pdfRenderer");
    }
}
