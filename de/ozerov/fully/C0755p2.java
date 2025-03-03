package de.ozerov.fully;

import U.p;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import n2.a;

/* renamed from: de.ozerov.fully.p2  reason: case insensitive filesystem */
public final class C0755p2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MyWebView f10883a;

    public C0755p2(MyWebView myWebView) {
        this.f10883a = myWebView;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, de.ozerov.fully.x2] */
    @JavascriptInterface
    public void getBase64FromBlobData(String str, String str2, String str3) {
        byte[] bArr;
        V4 v4 = this.f10883a.f10124d0.f10666j.f10708a;
        v4.getClass();
        try {
            bArr = Base64.decode(str.replaceFirst("^data:.*;base64,", ""), 0);
        } catch (Throwable th) {
            String str4 = "Failed to decode/save blob data (size: " + str.length() + " bytes) due to " + th.getMessage();
            Log.e("V4", str4);
            bArr = str4.getBytes(StandardCharsets.UTF_8);
        }
        File c02 = a.c0(v4.f10443a, Environment.DIRECTORY_DOWNLOADS);
        if (str2 == null) {
            str2 = "download.dat";
        }
        File file = new File(c02, str2);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            ? obj = new Object();
            obj.f11070b = 200;
            obj.f11071c = str2;
            obj.f11075h = (long) bArr.length;
            obj.f11072d = file.getAbsolutePath();
            obj.e = str3;
            v4.i(obj);
        } catch (Throwable th2) {
            Log.e("V4", "Failed to save blob data to " + file.getAbsolutePath() + " due to " + th2.getMessage());
        }
    }

    @JavascriptInterface
    public String getFullyVersion() {
        return "1.17.1";
    }

    @JavascriptInterface
    public int getFullyVersionCode() {
        return 101362;
    }

    @JavascriptInterface
    public void grab(String str) {
        this.f10883a.f10130j0 = str;
    }

    @JavascriptInterface
    public void print() {
        MyWebView myWebView = this.f10883a;
        myWebView.f10122b0.runOnUiThread(new p(25, (Object) myWebView));
    }
}
