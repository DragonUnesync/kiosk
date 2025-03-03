package de.ozerov.fully;

import Q0.g;
import Z1.c;
import a1.C0410a;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import d4.k;
import java.util.LinkedList;
import n2.a;

/* renamed from: de.ozerov.fully.m2  reason: case insensitive filesystem */
public class C0737m2 extends WebChromeClient {
    public static final LinkedList e = new LinkedList();

    /* renamed from: a  reason: collision with root package name */
    public final C0780t4 f10797a;

    /* renamed from: b  reason: collision with root package name */
    public final k f10798b;

    /* renamed from: c  reason: collision with root package name */
    public final g5 f10799c;

    /* renamed from: d  reason: collision with root package name */
    public final I0 f10800d = new I0(1, this);

    public C0737m2(C0780t4 t4Var, g5 g5Var) {
        this.f10797a = t4Var;
        this.f10798b = new k((Context) t4Var, 1);
        this.f10799c = g5Var;
    }

    public boolean a() {
        return false;
    }

    public final Bitmap getDefaultVideoPoster() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        new Canvas(createBitmap).drawARGB(0, 0, 0, 0);
        return createBitmap;
    }

    public final void onCloseWindow(WebView webView) {
        i5 i5Var = this.f10799c.f10666j;
        g5 g5Var = i5Var.f10711d;
        if (g5Var != null) {
            i5Var.e(g5Var);
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.message();
        consoleMessage.lineNumber();
        consoleMessage.sourceId();
        LinkedList linkedList = e;
        System.currentTimeMillis();
        linkedList.add(new C0410a(22));
        if (linkedList.size() > 100) {
            linkedList.removeFirst();
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z6, Message message) {
        if (((c) this.f10798b.f9767W).n("enablePopups", false) || webView.getUrl().startsWith("https://license.fully-kiosk.com/license")) {
            g5 g5Var = this.f10799c;
            if (g5Var.f10666j.f10710c.size() < 10) {
                g5 f8 = g5Var.f10666j.f(true, true, z);
                if (f8 != null) {
                    ((WebView.WebViewTransport) message.obj).setWebView(f8.f10664g);
                    message.sendToTarget();
                }
                return true;
            }
            a.b1(webView.getContext(), "Maximum of 10 open tabs reached");
            return false;
        }
        a.b1(webView.getContext(), "Popups and new tabs disabled");
        return false;
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (((c) this.f10798b.f9767W).n("geoLocationAccess", false)) {
            callback.invoke(str, true, false);
        } else {
            callback.invoke(str, false, false);
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!(webView instanceof MyWebView)) {
            return true;
        }
        MyWebView myWebView = (MyWebView) webView;
        if (((c) this.f10798b.f9767W).n("jsAlerts", true)) {
            myWebView.a();
            C0780t4 t4Var = this.f10797a;
            AlertDialog create = new AlertDialog.Builder(t4Var).setMessage(str2).setOnCancelListener(new C0731l2(jsResult, myWebView)).setPositiveButton(17039370, new C0713i2(jsResult, myWebView, 0)).create();
            create.getWindow().addFlags(8);
            create.show();
            a.r(t4Var.getWindow(), create.getWindow());
            create.getWindow().clearFlags(8);
            create.setOnKeyListener(this.f10800d);
            View rootView = create.getWindow().getDecorView().getRootView();
            if (rootView != null) {
                rootView.getViewTreeObserver().addOnWindowFocusChangeListener(new C0701g2(this));
            }
            myWebView.f10145z0 = jsResult;
            myWebView.f10116A0 = create;
            return true;
        }
        a.b1(webView.getContext(), str2);
        jsResult.cancel();
        return true;
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!(webView instanceof MyWebView)) {
            return true;
        }
        MyWebView myWebView = (MyWebView) webView;
        if (((c) this.f10798b.f9767W).n("jsAlerts", true)) {
            myWebView.a();
            C0780t4 t4Var = this.f10797a;
            AlertDialog.Builder builder = new AlertDialog.Builder(t4Var);
            StringBuilder r8 = g.r(str2);
            r8.append(t4Var.getString(2131951962));
            AlertDialog create = builder.setMessage(r8.toString()).setTitle(2131951672).setOnCancelListener(new C0731l2(jsResult, myWebView)).setPositiveButton(2131951789, new C0713i2(jsResult, myWebView, 3)).setNegativeButton(2131951961, new C0713i2(jsResult, myWebView, 4)).create();
            create.getWindow().addFlags(8);
            create.show();
            a.r(t4Var.getWindow(), create.getWindow());
            create.getWindow().clearFlags(8);
            create.setOnKeyListener(this.f10800d);
            View rootView = create.getWindow().getDecorView().getRootView();
            if (rootView != null) {
                rootView.getViewTreeObserver().addOnWindowFocusChangeListener(new C0701g2(this));
            }
            myWebView.f10145z0 = jsResult;
            myWebView.f10116A0 = create;
            return true;
        }
        jsResult.confirm();
        return true;
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!(webView instanceof MyWebView)) {
            return true;
        }
        MyWebView myWebView = (MyWebView) webView;
        if (((c) this.f10798b.f9767W).n("jsAlerts", true)) {
            myWebView.a();
            C0780t4 t4Var = this.f10797a;
            AlertDialog create = new AlertDialog.Builder(t4Var).setMessage(str2).setOnCancelListener(new C0731l2(jsResult, myWebView)).setPositiveButton(17039370, new C0713i2(jsResult, myWebView, 1)).setNegativeButton(17039360, new C0713i2(jsResult, myWebView, 2)).create();
            create.getWindow().addFlags(8);
            create.show();
            a.r(t4Var.getWindow(), create.getWindow());
            create.getWindow().clearFlags(8);
            create.setOnKeyListener(this.f10800d);
            View rootView = create.getWindow().getDecorView().getRootView();
            if (rootView != null) {
                rootView.getViewTreeObserver().addOnWindowFocusChangeListener(new C0701g2(this));
            }
            myWebView.f10145z0 = jsResult;
            myWebView.f10116A0 = create;
            return true;
        }
        jsResult.cancel();
        return true;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (!(webView instanceof MyWebView)) {
            return true;
        }
        MyWebView myWebView = (MyWebView) webView;
        if (((c) this.f10798b.f9767W).n("jsAlerts", true)) {
            myWebView.a();
            EditText editText = new EditText(webView.getContext());
            AlertDialog create = new AlertDialog.Builder(webView.getContext()).setView(editText).setMessage(str2).setOnCancelListener(new C0731l2(jsPromptResult, myWebView)).setPositiveButton(17039370, new C0725k2(jsPromptResult, editText, myWebView)).setNegativeButton(17039360, new C0719j2(jsPromptResult, myWebView)).create();
            editText.setText(str3);
            editText.setImeOptions(editText.getImeOptions() | 268435456);
            editText.setSelectAllOnFocus(true);
            create.getWindow().setSoftInputMode(4);
            C0780t4 t4Var = this.f10797a;
            a.q(t4Var.getWindow(), create.getWindow());
            create.show();
            create.setOnKeyListener(this.f10800d);
            View rootView = create.getWindow().getDecorView().getRootView();
            if (rootView != null) {
                rootView.getViewTreeObserver().addOnWindowFocusChangeListener(new C0701g2(this));
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editText.getLayoutParams();
            int p3 = a.p(20.0f, t4Var);
            marginLayoutParams.leftMargin = p3;
            marginLayoutParams.rightMargin = p3;
            myWebView.f10145z0 = jsPromptResult;
            myWebView.f10116A0 = create;
            return true;
        }
        jsPromptResult.cancel();
        return true;
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        boolean z = true;
        for (String str : permissionRequest.getResources()) {
            boolean equals = str.equals("android.webkit.resource.VIDEO_CAPTURE");
            k kVar = this.f10798b;
            if ((!equals || !((c) kVar.f9767W).n("webcamAccess", false)) && ((!str.equals("android.webkit.resource.AUDIO_CAPTURE") || !((c) kVar.f9767W).n("microphoneAccess", false)) && (!str.equals("android.webkit.resource.PROTECTED_MEDIA_ID") || !((c) kVar.f9767W).n("protectedContent", false)))) {
                z = false;
            }
        }
        C0780t4 t4Var = this.f10797a;
        if (z) {
            t4Var.runOnUiThread(new C0707h2(permissionRequest, 0));
        } else {
            t4Var.runOnUiThread(new C0707h2(permissionRequest, 1));
        }
    }

    public final void onProgressChanged(WebView webView, int i) {
        g5 g5Var = this.f10799c;
        if (!g5Var.f10666j.i) {
            return;
        }
        if (i == 100) {
            MyWebView myWebView = g5Var.f10664g;
            if (myWebView != null && myWebView.f10117B0 == 3) {
                g5Var.n();
                g5Var.f10664g.f10117B0 = 1;
            }
        } else if (a.z0()) {
            g5Var.f10660b.setProgress(i, true);
        } else {
            g5Var.f10660b.setProgress(i);
        }
    }

    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        if (webView instanceof MyWebView) {
            ((MyWebView) webView).getClass();
            if (this.f10798b.K().booleanValue()) {
                a.b1(webView.getContext(), "Icon received");
            }
        }
    }

    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if (webView instanceof MyWebView) {
            ((MyWebView) webView).f10129i0 = str;
            this.f10799c.f10666j.p();
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onShowFileChooser(android.webkit.WebView r20, android.webkit.ValueCallback r21, android.webkit.WebChromeClient.FileChooserParams r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = 1
            d4.k r3 = r1.f10798b
            java.lang.Boolean r0 = r3.Q()
            boolean r0 = r0.booleanValue()
            r4 = 0
            if (r0 != 0) goto L_0x002f
            java.lang.Boolean r0 = r3.s()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002f
            java.lang.Boolean r0 = r3.w2()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002f
            java.lang.Boolean r0 = r3.p()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002f
            return r4
        L_0x002f:
            de.ozerov.fully.t4 r5 = r1.f10797a
            boolean r0 = r5 instanceof de.ozerov.fully.FullyActivity
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "Uploads disabled in other activities"
            n2.a.a1(r2, r5, r0)
            return r4
        L_0x003b:
            de.ozerov.fully.g5 r6 = r1.f10799c
            de.ozerov.fully.V4 r0 = r6.f10667k
            android.webkit.ValueCallback r0 = r0.f10454n
            r7 = 0
            if (r0 == 0) goto L_0x0047
            r0.onReceiveValue(r7)
        L_0x0047:
            de.ozerov.fully.V4 r0 = r6.f10667k
            r8 = r21
            r0.f10454n = r8
            java.lang.String[] r8 = r22.getAcceptTypes()
            int r0 = r8.length
            r9 = 0
        L_0x0053:
            if (r9 >= r0) goto L_0x0059
            r10 = r8[r9]
            int r9 = r9 + r2
            goto L_0x0053
        L_0x0059:
            r22.isCaptureEnabled()
            java.lang.Boolean r0 = r3.s()
            boolean r0 = r0.booleanValue()
            java.lang.String r9 = "useFrontCamForUploads"
            java.lang.Object r10 = r3.f9767W
            Z1.c r10 = (Z1.c) r10
            java.lang.String r11 = "android.intent.extra.USE_FRONT_CAMERA"
            java.lang.String r12 = "android.intent.extras.LENS_FACING_FRONT"
            java.lang.String r13 = "android.intent.extras.CAMERA_FACING"
            java.lang.String r15 = "output"
            java.lang.String r7 = "m2"
            java.lang.String r4 = "*/"
            if (r0 == 0) goto L_0x0123
            int r0 = r8.length
            java.lang.String r14 = "jpg"
            if (r0 != 0) goto L_0x007e
            goto L_0x00c8
        L_0x007e:
            int r0 = r8.length
            r2 = 0
        L_0x0080:
            if (r2 >= r0) goto L_0x0123
            r16 = r0
            r0 = r8[r2]
            boolean r17 = r0.isEmpty()
            if (r17 != 0) goto L_0x00c8
            boolean r17 = r0.contains(r4)
            if (r17 != 0) goto L_0x00c8
            java.lang.String r1 = "image/"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00c8
            boolean r1 = r0.contains(r14)
            if (r1 != 0) goto L_0x00c8
            java.lang.String r1 = "png"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00c8
            java.lang.String r1 = "jpeg"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00c8
            java.lang.String r1 = "tiff"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00c8
            java.lang.String r1 = "tif"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00c1
            goto L_0x00c8
        L_0x00c1:
            r1 = 1
            int r2 = r2 + r1
            r1 = r19
            r0 = r16
            goto L_0x0080
        L_0x00c8:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
            r1.<init>(r0)
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            android.content.ComponentName r0 = r1.resolveActivity(r0)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "img"
            java.io.File r2 = n2.a.u(r5, r0, r14)     // Catch:{ IOException -> 0x00e5 }
            r2.deleteOnExit()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00ec
        L_0x00e3:
            r0 = move-exception
            goto L_0x00e7
        L_0x00e5:
            r0 = move-exception
            r2 = 0
        L_0x00e7:
            java.lang.String r14 = "Temp image file creation failed"
            android.util.Log.e(r7, r14, r0)
        L_0x00ec:
            if (r2 == 0) goto L_0x011f
            android.net.Uri r0 = androidx.core.content.FileProvider.d(r5, r2)
            r1.putExtra(r15, r0)
            r14 = 1
            r1.addFlags(r14)
            r14 = 2
            r1.addFlags(r14)
            r14 = 0
            boolean r16 = r10.n(r9, r14)
            if (r16 == 0) goto L_0x010e
            r14 = 1
            r1.putExtra(r13, r14)
            r1.putExtra(r12, r14)
            r1.putExtra(r11, r14)
        L_0x010e:
            de.ozerov.fully.V4 r14 = r6.f10667k
            java.lang.String r2 = r2.getAbsolutePath()
            r14.f10455o = r2
            de.ozerov.fully.V4 r2 = r6.f10667k
            r2.f10458r = r0
            r0.toString()
            r0 = 1
            goto L_0x0121
        L_0x011f:
            r0 = 0
            r1 = 0
        L_0x0121:
            r2 = r0
            goto L_0x0125
        L_0x0123:
            r1 = 0
            r2 = 0
        L_0x0125:
            java.lang.Boolean r0 = r3.w2()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01ca
            int r0 = r8.length
            java.lang.String r14 = "mp4"
            if (r0 != 0) goto L_0x0139
            r16 = r1
        L_0x0136:
            r18 = r4
            goto L_0x016f
        L_0x0139:
            int r0 = r8.length
            r16 = r1
            r1 = 0
        L_0x013d:
            if (r1 >= r0) goto L_0x01c7
            r17 = r0
            r0 = r8[r1]
            boolean r18 = r0.isEmpty()
            if (r18 != 0) goto L_0x0136
            boolean r18 = r0.contains(r4)
            if (r18 != 0) goto L_0x0136
            r18 = r4
            java.lang.String r4 = "video/"
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L_0x016f
            boolean r4 = r0.contains(r14)
            if (r4 != 0) goto L_0x016f
            java.lang.String r4 = "mkv"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0168
            goto L_0x016f
        L_0x0168:
            r4 = 1
            int r1 = r1 + r4
            r0 = r17
            r4 = r18
            goto L_0x013d
        L_0x016f:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
            r1.<init>(r0)
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            android.content.ComponentName r0 = r1.resolveActivity(r0)
            if (r0 == 0) goto L_0x01c5
            java.lang.String r0 = "vid"
            java.io.File r4 = n2.a.u(r5, r0, r14)     // Catch:{ IOException -> 0x018c }
            r4.deleteOnExit()     // Catch:{ IOException -> 0x018a }
            goto L_0x0193
        L_0x018a:
            r0 = move-exception
            goto L_0x018e
        L_0x018c:
            r0 = move-exception
            r4 = 0
        L_0x018e:
            java.lang.String r14 = "Video file creation failed"
            android.util.Log.e(r7, r14, r0)
        L_0x0193:
            if (r4 == 0) goto L_0x01c5
            android.net.Uri r0 = androidx.core.content.FileProvider.d(r5, r4)
            r1.putExtra(r15, r0)
            r14 = 1
            r1.addFlags(r14)
            r14 = 2
            r1.addFlags(r14)
            r14 = 0
            boolean r9 = r10.n(r9, r14)
            if (r9 == 0) goto L_0x01b6
            r9 = 1
            r1.putExtra(r13, r9)
            r1.putExtra(r12, r9)
            r1.putExtra(r11, r9)
            goto L_0x01b7
        L_0x01b6:
            r9 = 1
        L_0x01b7:
            de.ozerov.fully.V4 r10 = r6.f10667k
            java.lang.String r4 = r4.getAbsolutePath()
            r10.f10456p = r4
            de.ozerov.fully.V4 r4 = r6.f10667k
            r4.f10459s = r0
            int r2 = r2 + r9
            goto L_0x01cd
        L_0x01c5:
            r1 = 0
            goto L_0x01cd
        L_0x01c7:
            r18 = r4
            goto L_0x01c5
        L_0x01ca:
            r16 = r1
            goto L_0x01c7
        L_0x01cd:
            java.lang.Boolean r0 = r3.p()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0258
            int r0 = r8.length
            java.lang.String r4 = "mp3"
            if (r0 != 0) goto L_0x01dd
            goto L_0x0215
        L_0x01dd:
            int r0 = r8.length
            r9 = 0
        L_0x01df:
            if (r9 >= r0) goto L_0x0258
            r10 = r8[r9]
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x0215
            r11 = r18
            boolean r12 = r10.contains(r11)
            if (r12 != 0) goto L_0x0215
            java.lang.String r12 = "audio/"
            boolean r12 = r10.contains(r12)
            if (r12 != 0) goto L_0x0215
            boolean r12 = r10.contains(r4)
            if (r12 != 0) goto L_0x0215
            java.lang.String r12 = "wav"
            boolean r12 = r10.contains(r12)
            if (r12 != 0) goto L_0x0215
            java.lang.String r12 = "ogg"
            boolean r10 = r10.contains(r12)
            if (r10 == 0) goto L_0x0210
            goto L_0x0215
        L_0x0210:
            r10 = 1
            int r9 = r9 + r10
            r18 = r11
            goto L_0x01df
        L_0x0215:
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r0 = "android.provider.MediaStore.RECORD_SOUND"
            r8.<init>(r0)
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            android.content.ComponentName r0 = r8.resolveActivity(r0)
            if (r0 == 0) goto L_0x0258
            java.lang.String r0 = "rec"
            java.io.File r4 = n2.a.u(r5, r0, r4)     // Catch:{ IOException -> 0x0232 }
            r4.deleteOnExit()     // Catch:{ IOException -> 0x0230 }
            goto L_0x0239
        L_0x0230:
            r0 = move-exception
            goto L_0x0234
        L_0x0232:
            r0 = move-exception
            r4 = 0
        L_0x0234:
            java.lang.String r9 = "Audio file creation failed"
            android.util.Log.e(r7, r9, r0)
        L_0x0239:
            if (r4 == 0) goto L_0x0258
            android.net.Uri r0 = androidx.core.content.FileProvider.d(r5, r4)
            r8.putExtra(r15, r0)
            r7 = 1
            r8.addFlags(r7)
            r9 = 2
            r8.addFlags(r9)
            de.ozerov.fully.V4 r9 = r6.f10667k
            java.lang.String r4 = r4.getAbsolutePath()
            r9.f10457q = r4
            de.ozerov.fully.V4 r4 = r6.f10667k
            r4.f10460t = r0
            int r2 = r2 + r7
            goto L_0x0259
        L_0x0258:
            r8 = 0
        L_0x0259:
            java.lang.Boolean r0 = r3.Q()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0299
            boolean r0 = r22.isCaptureEnabled()
            if (r0 != 0) goto L_0x0299
            r3 = 1
            int r2 = r2 + r3
            android.content.Intent r0 = r22.createIntent()
            java.lang.String r3 = r0.getType()
            if (r3 == 0) goto L_0x0292
            java.lang.String r3 = r0.getType()
            java.lang.String r4 = "."
            boolean r3 = r3.startsWith(r4)
            if (r3 != 0) goto L_0x028d
            java.lang.String r3 = r0.getType()
            java.lang.String r4 = ",."
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0292
        L_0x028d:
            java.lang.String r3 = "*/*"
            r0.setType(r3)
        L_0x0292:
            java.lang.String r3 = "android.intent.extra.ALLOW_MULTIPLE"
            r4 = 1
            r0.putExtra(r3, r4)
            goto L_0x029b
        L_0x0299:
            r4 = 1
            r0 = 0
        L_0x029b:
            r3 = 1011(0x3f3, float:1.417E-42)
            if (r2 <= r4) goto L_0x02eb
            int r2 = r2 - r4
            android.content.Intent[] r2 = new android.content.Intent[r2]
            if (r0 == 0) goto L_0x02a5
            goto L_0x02a6
        L_0x02a5:
            r0 = 0
        L_0x02a6:
            if (r16 == 0) goto L_0x02ac
            if (r0 != 0) goto L_0x02ae
            r0 = r16
        L_0x02ac:
            r4 = 0
            goto L_0x02b2
        L_0x02ae:
            r4 = 0
            r2[r4] = r16
            r4 = 1
        L_0x02b2:
            if (r1 == 0) goto L_0x02bf
            if (r0 != 0) goto L_0x02b7
            goto L_0x02c0
        L_0x02b7:
            r7 = 1
            int r9 = r4 + 1
            r2[r4] = r1
            r1 = r0
            r4 = r9
            goto L_0x02c0
        L_0x02bf:
            r1 = r0
        L_0x02c0:
            if (r8 == 0) goto L_0x02c7
            if (r1 != 0) goto L_0x02c5
            goto L_0x02c8
        L_0x02c5:
            r2[r4] = r8
        L_0x02c7:
            r8 = r1
        L_0x02c8:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x02de }
            java.lang.String r1 = "android.intent.action.CHOOSER"
            r0.<init>(r1)     // Catch:{ Exception -> 0x02de }
            java.lang.String r1 = "android.intent.extra.INTENT"
            r0.putExtra(r1, r8)     // Catch:{ Exception -> 0x02de }
            java.lang.String r1 = "android.intent.extra.INITIAL_INTENTS"
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x02de }
            r5.startActivityForResult(r0, r3)     // Catch:{ Exception -> 0x02de }
            r1 = 1
            return r1
        L_0x02de:
            de.ozerov.fully.V4 r0 = r6.f10667k
            r2 = 0
            r0.f10454n = r2
            java.lang.String r0 = "Cannot Open Action Chooser"
            r4 = 1
            n2.a.a1(r4, r5, r0)
            r7 = 0
            return r7
        L_0x02eb:
            r2 = 0
            r7 = 0
            if (r0 == 0) goto L_0x02fd
            r5.startActivityForResult(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x02f3 }
            goto L_0x031f
        L_0x02f3:
            de.ozerov.fully.V4 r0 = r6.f10667k
            r0.f10454n = r2
            java.lang.String r0 = "Cannot Open File Chooser"
            n2.a.a1(r4, r5, r0)
            return r7
        L_0x02fd:
            if (r16 == 0) goto L_0x030f
            r8 = r16
            r5.startActivityForResult(r8, r3)     // Catch:{ ActivityNotFoundException -> 0x0305 }
            goto L_0x031f
        L_0x0305:
            de.ozerov.fully.V4 r0 = r6.f10667k
            r0.f10454n = r2
            java.lang.String r0 = "Cannot open camera app for picture"
            n2.a.a1(r4, r5, r0)
            return r7
        L_0x030f:
            if (r1 == 0) goto L_0x031f
            r5.startActivityForResult(r1, r3)     // Catch:{ ActivityNotFoundException -> 0x0315 }
            goto L_0x031f
        L_0x0315:
            de.ozerov.fully.V4 r0 = r6.f10667k
            r0.f10454n = r2
            java.lang.String r0 = "Cannot open camera app for video"
            n2.a.a1(r4, r5, r0)
            return r7
        L_0x031f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0737m2.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }
}
