package de.ozerov.fully;

import android.app.admin.DevicePolicyManager;
import android.util.Log;
import java.util.ArrayList;

public final class H1 extends DevicePolicyManager.InstallSystemUpdateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9990a;

    public H1(String str) {
        this.f9990a = str;
    }

    public final void onInstallUpdateError(int i, String str) {
        super.onInstallUpdateError(i, str);
        String str2 = "System update failed for " + this.f9990a + " with code " + i + " due to " + str;
        ArrayList arrayList = I1.f10008a;
        Log.w("I1", str2);
        C0794w0.q0(1, "I1", str2);
    }
}
