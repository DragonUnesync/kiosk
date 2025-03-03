package de.ozerov.fully;

import B3.q;
import Q0.g;
import U.p;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.lifecycle.c;
import java.io.File;
import java.net.URI;
import n2.a;

public final class T0 extends Thread {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10355U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ String f10356V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ U0 f10357W;

    public /* synthetic */ T0(U0 u02, String str, int i) {
        this.f10355U = i;
        this.f10357W = u02;
        this.f10356V = str;
    }

    public final void run() {
        switch (this.f10355U) {
            case 0:
                String str = this.f10356V;
                boolean I8 = P.I(str);
                U0 u02 = this.f10357W;
                if (!I8) {
                    FullyActivity fullyActivity = u02.f10414a;
                    a.b1(fullyActivity, "Invalid APK URL " + str);
                    return;
                } else if (!C0808y2.f(str).equals("application/vnd.android.package-archive") && !C0808y2.e(u02.f10414a, Uri.parse(str)).equals("apk") && !C0808y2.e(u02.f10414a, Uri.parse(str)).equals("apkm-DISABLED")) {
                    FullyActivity fullyActivity2 = u02.f10414a;
                    a.b1(fullyActivity2, "URL not found or not APK file " + TextUtils.htmlEncode(str));
                    return;
                } else if (!a.h0(u02.f10414a) && a.u0()) {
                    Log.e("JsInterface", "Missing runtime permissions to write files");
                    a.b1(u02.f10414a, "Missing runtime permissions to store APK file");
                    return;
                } else if (P.B() || !a.u0()) {
                    C0752p.b(u02.f10414a, str, false, false);
                    return;
                } else {
                    Log.e("JsInterface", "External storage is not writable");
                    a.b1(u02.f10414a, "External storage is not writable");
                    return;
                }
            default:
                String str2 = this.f10356V;
                boolean I9 = P.I(str2);
                U0 u03 = this.f10357W;
                if (!I9) {
                    a.b1(u03.f10414a, "Invalid JSON file URL ".concat(str2));
                    return;
                } else if (str2.startsWith("file://")) {
                    try {
                        boolean O8 = u03.f10414a.f9931T0.O(new File(new URI(str2)), 4);
                        FullyActivity fullyActivity3 = u03.f10414a;
                        if (!O8) {
                            a.b1(fullyActivity3, "Failed to import settings file from ".concat(str2));
                            return;
                        } else {
                            fullyActivity3.runOnUiThread(new p(21, (Object) this));
                            return;
                        }
                    } catch (Exception e) {
                        g.z(e, g.s("Failed to parse/import URL ", str2, " due to "), "JsInterface");
                        return;
                    }
                } else if (C0808y2.f(str2).equals("application/json") || C0808y2.e(u03.f10414a, Uri.parse(str2)).equals("json")) {
                    q qVar = u03.f10414a.f9931T0;
                    c cVar = new c(5, this);
                    qVar.getClass();
                    new C0782u0(qVar, 4, cVar).execute(new String[]{str2});
                    return;
                } else {
                    a.b1(u03.f10414a, "URL not found or not JSON file " + TextUtils.htmlEncode(str2));
                    return;
                }
        }
    }
}
