package de.ozerov.fully;

import Q.h;
import U.p;
import android.webkit.JavascriptInterface;
import d4.k;

/* renamed from: de.ozerov.fully.q2  reason: case insensitive filesystem */
public final class C0761q2 {

    /* renamed from: a  reason: collision with root package name */
    public FullyActivity f10897a;

    @JavascriptInterface
    public String getAppId() {
        return "56";
    }

    @JavascriptInterface
    public String getDeviceId() {
        return P.i(this.f10897a);
    }

    @JavascriptInterface
    public boolean isLicensed() {
        return h.f4003X;
    }

    @JavascriptInterface
    public boolean isPlusFeatureActive() {
        return this.f10897a.f9926O0.i();
    }

    @JavascriptInterface
    public void reapplyVolumeKey() {
        FullyActivity fullyActivity = this.f10897a;
        if (!fullyActivity.f9961z0.y2().isEmpty()) {
            k kVar = fullyActivity.f9961z0;
            kVar.V2("licenseVolumeKey", kVar.y2());
            fullyActivity.f9961z0.V2("volumeLicenseStatus", "Reapplied exising volume key");
        }
    }

    @JavascriptInterface
    public void setVolumeLicenseKey(String str) {
        FullyActivity fullyActivity = this.f10897a;
        if (fullyActivity.f9932U0.n("volumeLicenseKey", str)) {
            fullyActivity.runOnUiThread(new p(26, (Object) this));
        }
    }
}
