package de.ozerov.fully;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import n2.a;

public class LauncherReplacement extends Activity {

    /* renamed from: U  reason: collision with root package name */
    public static final /* synthetic */ int f10083U = 0;

    public static void a(Context context) {
        ComponentName componentName = new ComponentName(context.getApplicationContext(), LauncherReplacement.class);
        context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
        Log.i("LauncherReplacement", componentName.flattenToShortString() + " disabled");
    }

    public static void b(Context context) {
        ComponentName componentName = new ComponentName(context.getApplicationContext(), LauncherReplacement.class);
        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        Log.i("LauncherReplacement", componentName.flattenToShortString() + " enabled");
    }

    public static void c(Context context) {
        if (C0794w0.Z(context)) {
            ComponentName componentName = new ComponentName(context.getApplicationContext(), LauncherReplacement.class);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MAIN");
            intentFilter.addCategory("android.intent.category.HOME");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            ((DevicePolicyManager) context.getSystemService("device_policy")).addPersistentPreferredActivity(DeviceOwnerReceiver.a(context), intentFilter, componentName);
        }
    }

    public final void d() {
        Intent intent;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            Log.i("LauncherReplacement", a.o0(intent2));
            if (!intent2.hasCategory("android.intent.category.HOME")) {
                Log.w("LauncherReplacement", "Starting LauncherReplacement without CATEGORY_HOME, why?");
            }
        }
        if (intent2 == null) {
            intent = new Intent();
        }
        intent.setComponent(new ComponentName(this, FullyActivity.class));
        intent.setFlags(268500992);
        intent.putExtra("isLauncher", true);
        try {
            startActivity(intent);
            overridePendingTransition(0, 0);
            Log.i("LauncherReplacement", "Promote Intent to FullyActivity (launcher) " + a.o0(intent));
        } catch (Exception e) {
            a.a1(1, this, "Could not launch Fully in Kiosk mode");
            Log.e("LauncherReplacement", "Failed starting " + a.o0(intent) + " due to " + e.getMessage());
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("LauncherReplacement", "onCreate ver. 1.17.1 (101362) TaskID=" + getTaskId());
        d();
    }

    public final void onNewIntent(Intent intent) {
        Log.i("LauncherReplacement", "onNewIntent TaskID=" + getTaskId());
        setIntent(intent);
        d();
    }
}
