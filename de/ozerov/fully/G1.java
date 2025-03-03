package de.ozerov.fully;

import android.app.admin.DevicePolicyManager;
import android.util.Log;

public final /* synthetic */ class G1 implements DevicePolicyManager.OnClearApplicationUserDataListener {
    public final void onApplicationUserDataCleared(String str, boolean z) {
        String str2 = "Data cleared for " + str + ", success: " + z;
        Log.i("I1", str2);
        C0794w0.q0(0, "I1", str2);
    }
}
