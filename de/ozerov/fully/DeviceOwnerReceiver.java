package de.ozerov.fully;

import android.app.admin.DeviceAdminReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.util.Log;
import n2.a;

public class DeviceOwnerReceiver extends DeviceAdminReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9861a = 0;

    public static ComponentName a(Context context) {
        return new ComponentName(context.getApplicationContext(), DeviceOwnerReceiver.class);
    }

    public final void onBugreportFailed(Context context, Intent intent, int i) {
        String str = "Bug report failed with code " + i;
        Log.i("DeviceOwnerReceiver", str);
        C0794w0.q0(0, "DeviceOwnerReceiver", str);
    }

    public final void onBugreportShared(Context context, Intent intent, String str) {
        String str2 = "Bug report shared #" + str;
        Log.i("DeviceOwnerReceiver", str2);
        C0794w0.q0(0, "DeviceOwnerReceiver", str2);
    }

    public final void onBugreportSharingDeclined(Context context, Intent intent) {
        Log.i("DeviceOwnerReceiver", "Bug report sharing declined");
        C0794w0.q0(0, "DeviceOwnerReceiver", "Bug report sharing declined");
    }

    public final CharSequence onDisableRequested(Context context, Intent intent) {
        return "Deactivating Fully device administrator permission is required for uninstall. Press OK and uninstall again.";
    }

    public final void onDisabled(Context context, Intent intent) {
    }

    public final void onEnabled(Context context, Intent intent) {
    }

    public final void onProfileProvisioningComplete(Context context, Intent intent) {
        Log.i("DeviceOwnerReceiver", "onProfileProvisioningComplete");
        C0794w0.q0(0, "DeviceOwnerReceiver", "Device owner provisioning completed");
        if (intent != null) {
            C0794w0.q0(0, "DeviceOwnerReceiver", "onProfileProvisioningComplete: " + a.o0(intent));
        }
        Intent intent2 = new Intent(context, ProvisioningActivity.class);
        intent2.setFlags(268435456);
        if (!(intent == null || intent.getExtras() == null)) {
            intent2.putExtra("android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE", (PersistableBundle) intent.getParcelableExtra("android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE"));
        }
        context.startActivity(intent2);
    }

    public final void onReceive(Context context, Intent intent) {
        Log.i("DeviceOwnerReceiver", "Got broadcast " + intent.getAction());
        super.onReceive(context, intent);
    }
}
