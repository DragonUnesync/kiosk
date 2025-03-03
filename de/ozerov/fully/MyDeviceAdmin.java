package de.ozerov.fully;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

public class MyDeviceAdmin extends DeviceAdminReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f10113a = 0;

    public final CharSequence onDisableRequested(Context context, Intent intent) {
        return "Deactivating Fully device administrator permission is required for uninstall. Press OK and uninstall again.";
    }

    public final void onDisabled(Context context, Intent intent) {
    }

    public final void onEnabled(Context context, Intent intent) {
    }
}
