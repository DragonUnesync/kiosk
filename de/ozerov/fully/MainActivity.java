package de.ozerov.fully;

import Q0.g;
import Z1.c;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import b3.C0528a;
import d4.k;
import de.ozerov.fully.receiver.BootReceiver;
import n2.a;

public class MainActivity extends Activity {

    /* renamed from: U  reason: collision with root package name */
    public static final /* synthetic */ int f10101U = 0;

    public final void onActivityResult(int i, int i8, Intent intent) {
        if (i != 1014) {
            return;
        }
        if (i8 == -1) {
            Log.i("MainActivity", "Device owner provisioning started ok");
            return;
        }
        Log.e("MainActivity", "Device owner provisioning start failed with code " + i8);
        C0794w0.q0(2, "MainActivity", "Device owner provisioning start failed with code " + i8);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z6;
        boolean z8;
        Intent intent;
        boolean z9;
        String action;
        Log.i("MainActivity", "onCreate ver. 1.17.1 (101362) TaskID=" + getTaskId());
        BootReceiver.b(this);
        Intent intent2 = getIntent();
        k kVar = new k((Context) this, 1);
        if (intent2 != null) {
            Log.i("MainActivity", a.o0(intent2));
        }
        super.onCreate(bundle);
        try {
            getDrawable(2131231007);
            if (intent2 == null || (action = intent2.getAction()) == null || ((!action.equals("android.nfc.action.NDEF_DISCOVERED") && !action.equals("android.nfc.action.TECH_DISCOVERED") && !action.equals("android.nfc.action.TAG_DISCOVERED")) || kVar.F1().booleanValue())) {
                if (a.z0()) {
                    try {
                        z = ((DevicePolicyManager) getSystemService("device_policy")).isProvisioningAllowed("android.app.action.PROVISION_MANAGED_DEVICE");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    if (Settings.Global.getInt(getContentResolver(), "device_provisioned", 0) == 0 && !C0794w0.b0(this)) {
                        z = true;
                    }
                    z = false;
                }
                if (Settings.Global.getInt(getContentResolver(), "device_provisioned", 0) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (intent2 == null || !intent2.getBooleanExtra("is_setup_wizard", false)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                boolean Z7 = C0794w0.Z(this);
                Log.i("MainActivity", "isManaged=" + C0794w0.b0(this));
                Log.i("MainActivity", "isDeviceProvisioningAllowed=" + z);
                Log.i("MainActivity", "isDeviceProvisioned=" + z6);
                Log.i("MainActivity", "isDeviceOwner=" + Z7);
                Log.i("MainActivity", "is_setup_wizard=" + z8);
                if (z) {
                    if (!a.r0()) {
                        Log.i("MainActivity", "Starting device owner provisioning from MainActivity as device is in provisioning mode");
                        C0794w0.q0(0, "MainActivity", "Start device owner provisioning");
                        try {
                            Intent intent3 = new Intent("android.app.action.PROVISION_MANAGED_DEVICE");
                            intent3.putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME", DeviceOwnerReceiver.a(this));
                            intent3.putExtra("android.app.extra.PROVISIONING_SKIP_ENCRYPTION", true);
                            if (a.p0()) {
                                intent3.putExtra("android.app.extra.PROVISIONING_SKIP_EDUCATION_SCREENS", true);
                            }
                            startActivityForResult(intent3, 1014);
                            Log.i("a", "Started device owner provisioning");
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    } else {
                        Log.i("MainActivity", "Don't start device owner provisioning from MainActivity despite device is in provisioning mode due to Android 12+");
                        C0794w0.q0(0, "MainActivity", "Don't start device owner provisioning from MainActivity despite device is in provisioning mode due to Android 12+");
                    }
                } else if (z || !z8) {
                    if (C0794w0.Z(this)) {
                        c cVar = (c) kVar.f9767W;
                        if (!cVar.n("isProvisioningCompleted", false) && !cVar.n("isDeviceOwner", false)) {
                            Log.i("MainActivity", "Restarting incomplete provisioning");
                            C0794w0.q0(0, "MainActivity", "Restarting incomplete provisioning");
                            try {
                                Intent intent4 = new Intent(this, ProvisioningActivity.class);
                                intent4.setFlags(268435456);
                                startActivity(intent4);
                            } catch (Exception e9) {
                                g.x(e9, new StringBuilder("Failed to start provisioning activity due to "), "MainActivity");
                            }
                        }
                    }
                    intent = intent2 != null ? new Intent(intent2) : new Intent();
                    if (kVar.c0().booleanValue() && kVar.C().booleanValue()) {
                        Class<LauncherReplacement> cls = LauncherReplacement.class;
                        if (getPackageManager().getComponentEnabledSetting(new ComponentName(getApplicationContext(), cls)) == 1) {
                            ComponentName h5 = C0528a.h(this);
                            if (h5 != null) {
                                z9 = h5.getPackageName().equals(getPackageName());
                            } else {
                                z9 = false;
                            }
                            if (z9 || P.D(this)) {
                                intent.setComponent(new ComponentName(this, cls));
                                intent.addCategory("android.intent.category.HOME");
                                intent.removeCategory("android.intent.category.LAUNCHER");
                                intent.removeCategory("android.intent.category.LEANBACK_LAUNCHER");
                                intent.removeCategory("android.intent.category.BROWSABLE");
                                intent = a.c(intent);
                                if (intent.getAction() != null) {
                                    intent.putExtra("action", intent.getAction());
                                }
                                intent.setAction("android.intent.action.MAIN");
                                intent.putExtra("isLauncher", true);
                                try {
                                    PendingIntent.getActivity(this, 0, intent, 335544320).send();
                                    Log.i("MainActivity", "Promote Intent to LauncherReplacement");
                                } catch (Exception e10) {
                                    Log.w("MainActivity", "Failed to send intent " + a.o0(intent) + " due to " + e10.getMessage());
                                }
                                intent.setFlags(268500992);
                                startActivity(intent);
                                overridePendingTransition(0, 0);
                            } else {
                                Log.w("MainActivity", "Fully is not the default launcher, default: " + C0528a.h(this));
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setTitle("Hmmm... Difficult case");
                                builder.setMessage("You seem to have set another app to be your default home app. Fully can't change this. Please open the home app settings in Android and select " + a.G(this) + " as default home app in order to enable the kiosk mode.");
                                builder.setCancelable(false);
                                builder.setPositiveButton("Ok, open settings", new E1(this, kVar, 0));
                                builder.setNegativeButton("Disable kiosk mode", new E1(this, kVar, 1));
                                AlertDialog create = builder.create();
                                if (!isFinishing()) {
                                    a.Z0(create);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    intent.setComponent(new ComponentName(this, FullyActivity.class));
                    Log.i("MainActivity", "Promote Intent to FullyActivity (standalone)");
                    try {
                        intent.setFlags(268500992);
                        startActivity(intent);
                        overridePendingTransition(0, 0);
                    } catch (Exception e11) {
                        a.a1(1, this, "Could not launch Fully");
                        Log.e("MainActivity", "Failed starting " + a.o0(intent) + " due to " + e11.getMessage());
                    }
                } else {
                    Log.i("MainActivity", "Starting activity from setup wizard ignored");
                    C0794w0.q0(0, "MainActivity", "Starting activity from setup wizard ignored");
                }
                finish();
                return;
            }
            Log.w("MainActivity", "NFC action ignored as disabled by configuration");
            finish();
        } catch (Resources.NotFoundException unused) {
            finish();
            startActivity(new Intent(this, ValidatorActivity.class));
            Log.w("MainActivity", "isInstallationValid failed");
        }
    }

    public final void onNewIntent(Intent intent) {
        Log.e("MainActivity", "Unexpected onNewIntent TaskID=" + getTaskId());
        if (intent != null) {
            Log.e("MainActivity", "Unexpected onNewIntent " + a.o0(intent));
        }
    }
}
