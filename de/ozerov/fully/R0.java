package de.ozerov.fully;

import android.util.Log;
import java.io.File;
import java.util.HashMap;
import n2.a;

public final /* synthetic */ class R0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10310U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ U0 f10311V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ String f10312W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ String f10313X;

    public /* synthetic */ R0(U0 u02, String str, String str2, int i) {
        this.f10310U = i;
        this.f10311V = u02;
        this.f10312W = str;
        this.f10313X = str2;
    }

    public final void run() {
        switch (this.f10310U) {
            case 0:
                U0 u02 = this.f10311V;
                FullyActivity fullyActivity = u02.f10414a;
                String F8 = a.F(fullyActivity, this.f10313X);
                String str = this.f10312W;
                try {
                    a.i1(new File(str), new File(F8));
                    a.b1(fullyActivity, "File download and unzipping completed");
                    HashMap hashMap = new HashMap();
                    hashMap.put("$file", str);
                    hashMap.put("$dir", F8);
                    u02.d("onUnzipSuccess", hashMap);
                    return;
                } catch (Exception e) {
                    Log.e("JsInterface", "File unzipping failed");
                    e.printStackTrace();
                    a.b1(fullyActivity, "File unzipping failed with message " + e.getMessage());
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("$file", str);
                    hashMap2.put("$dir", F8);
                    hashMap2.put("$message", e.getMessage());
                    u02.d("onUnzipFailure", hashMap2);
                    return;
                }
            default:
                this.f10311V.f10414a.f9941d1.b(this.f10312W, this.f10313X, -1, -1, true, false, false, false);
                return;
        }
    }
}
