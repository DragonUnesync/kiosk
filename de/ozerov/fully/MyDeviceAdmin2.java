package de.ozerov.fully;

import android.app.admin.DeviceAdminReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class MyDeviceAdmin2 extends DeviceAdminReceiver {
    public static ComponentName a(Context context) {
        return new ComponentName(context.getApplicationContext(), MyDeviceAdmin2.class);
    }

    public final CharSequence onDisableRequested(Context context, Intent intent) {
        return "Deactivating Fully device administrator permission is required for uninstall. Press OK and uninstall again.";
    }

    public final void onDisabled(Context context, Intent intent) {
    }

    public final void onEnabled(Context context, Intent intent) {
    }
}
