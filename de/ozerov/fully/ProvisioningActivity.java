package de.ozerov.fully;

import B.j0;
import B3.m;
import B3.q;
import Q0.g;
import Z1.c;
import a1.C0410a;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import b3.C0528a;
import d4.k;
import j0.l;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashSet;
import k2.C1160q;
import n2.a;
import org.altbeacon.beacon.service.RangedBeacon;

@TargetApi(21)
public class ProvisioningActivity extends Activity {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f10263k0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public k f10264U;

    /* renamed from: V  reason: collision with root package name */
    public C0410a f10265V;

    /* renamed from: W  reason: collision with root package name */
    public DevicePolicyManager f10266W;

    /* renamed from: X  reason: collision with root package name */
    public ComponentName f10267X;

    /* renamed from: Y  reason: collision with root package name */
    public String f10268Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f10269Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f10270a0;

    /* renamed from: b0  reason: collision with root package name */
    public ScrollView f10271b0;

    /* renamed from: c0  reason: collision with root package name */
    public q f10272c0;

    /* renamed from: d0  reason: collision with root package name */
    public j0 f10273d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f10274e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f10275f0;

    /* renamed from: g0  reason: collision with root package name */
    public String f10276g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f10277h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f10278i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public final Handler f10279j0 = new Handler();

    public static void f(Context context, ComponentName componentName) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Class<?> cls = notificationManager.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("setNotificationListenerAccessGranted", new Class[]{ComponentName.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(notificationManager, new Object[]{componentName, Boolean.TRUE});
        } catch (Throwable th) {
            C0794w0.q0(2, "ProvisioningActivity", "Failed to requestNotificationAccessPermission() due to ".concat(th.getClass().getSimpleName()));
            th.printStackTrace();
        }
    }

    public final void a(int i, String str) {
        b(i, str, (String) null, true);
    }

    public final void b(int i, String str, String str2, boolean z) {
        String str3;
        TextView textView = (TextView) findViewById(2131362408);
        StringBuilder sb = new StringBuilder();
        if (z) {
            str3 = "\n";
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(str);
        textView.append(sb.toString());
        Log.i("ProvisioningActivity", str);
        if (str2 != null) {
            str = str2;
        }
        C0794w0.q0(i, "ProvisioningActivity", str);
    }

    public final void c() {
        if (!a.r0() && !C0794w0.j0(this, getPackageName())) {
            try {
                this.f10266W.setLockTaskPackages(this.f10267X, new String[]{getPackageName()});
                if (!"android.app.action.ADMIN_POLICY_COMPLIANCE".equals(getIntent().getAction())) {
                    startLockTask();
                }
            } catch (Exception e) {
                g.x(e, new StringBuilder("Failed to enable lock task for provisioning due to "), "ProvisioningActivity");
            }
        }
        q.s0(this, false, true);
        getWindow().addFlags(128);
    }

    public final void d() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((EditText) findViewById(2131362406)).getWindowToken(), 0);
        findViewById(2131362407).setVisibility(8);
    }

    public final void e() {
        if (a.r0()) {
            a(0, "Continue device setup... ");
        } else {
            a(0, "Launching Fully... ");
        }
        findViewById(2131362099).setVisibility(8);
        k kVar = this.f10264U;
        kVar.getClass();
        kVar.R2("isProvisioningCompleted", true);
        if (P.G(this)) {
            stopLockTask();
        }
        getWindow().clearFlags(128);
        if (this.f10264U.c0().booleanValue() && this.f10264U.C().booleanValue()) {
            C0528a.m(this);
            LauncherReplacement.b(this);
            LauncherReplacement.c(this);
            if (!a.r0()) {
                C0528a.p(this, (String) null);
            }
        } else if (!a.r0()) {
            try {
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(268435456);
                startActivity(intent);
            } catch (Exception e) {
                g.x(e, new StringBuilder("Failed to start MainActivity due to "), "ProvisioningActivity");
                a(2, "Failed to start MainActivity");
            }
        } else {
            a.b1(this, "Please start the kiosk app when setup completed");
        }
        setResult(-1);
        finish();
    }

    public final void g() {
        k kVar = this.f10264U;
        kVar.getClass();
        SharedPreferences.Editor edit = ((SharedPreferences) ((c) kVar.f9767W).f6955V).edit();
        edit.putBoolean("isProvisioningSettingsDone", true);
        k.e(edit, true);
        PowerManager powerManager = (PowerManager) getApplicationContext().getSystemService("power");
        Class<String> cls = String.class;
        if (a.B0() && C0794w0.j0(this, getPackageName()) && !getPackageManager().canRequestPackageInstalls()) {
            ((AlarmManager) getSystemService("alarm")).set(0, System.currentTimeMillis() + 500, PendingIntent.getActivity(this, 123456, new Intent(this, MainActivity.class), 335544320));
            AppOpsManager appOpsManager = (AppOpsManager) getSystemService("appops");
            Class<?> cls2 = appOpsManager.getClass();
            try {
                Class cls3 = Integer.TYPE;
                Method declaredMethod = cls2.getDeclaredMethod("setMode", new Class[]{cls3, cls3, cls, cls3});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(appOpsManager, new Object[]{66, Integer.valueOf(Process.myUid()), getPackageName(), 0});
            } catch (Throwable th) {
                C0794w0.q0(2, "ProvisioningActivity", "Failed to requestInstallPermission() due to " + th.getMessage());
            }
        }
        if (a.q0() && C0794w0.j0(this, getPackageName()) && !powerManager.isIgnoringBatteryOptimizations(getPackageName())) {
            try {
                Class<?> cls4 = Class.forName("android.os.PowerWhitelistManager");
                Constructor<?> declaredConstructor = cls4.getDeclaredConstructor(new Class[]{Context.class});
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(new Object[]{this});
                Method declaredMethod2 = cls4.getDeclaredMethod("addToWhitelist", new Class[]{cls});
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(newInstance, new Object[]{getPackageName()});
            } catch (Throwable th2) {
                C0794w0.q0(2, "ProvisioningActivity", "Failed to requestRunInBackgroundPermission() due to ".concat(th2.getClass().getSimpleName()));
                th2.printStackTrace();
            }
        }
        if (a.q0() && C0794w0.j0(this, getPackageName())) {
            if (!((HashSet) l.a(this)).contains(getPackageName())) {
                int i = NotificationService.f10166V;
                f(this, new ComponentName(getApplicationContext(), NotificationService.class));
            }
        }
        if (this.f10273d0.m()) {
            findViewById(2131362373).setVisibility(0);
            findViewById(2131362374).setOnClickListener(new C0666a3(this, 3));
            ScrollView scrollView = this.f10271b0;
            scrollView.post(new A3.c(2131362373, 6, (Object) scrollView));
            return;
        }
        a(0, "Gathering permissions... ");
        b(0, "Done", "Permissions gathered successfully", false);
        j();
    }

    public final void h() {
        a(0, "Importing settings... ");
        if (getIntent().getBooleanExtra("test_mode", false)) {
            a(0, "Doing nothing 5 seconds...");
            new Handler().postDelayed(new C0678c3(this, 0), RangedBeacon.DEFAULT_MAX_TRACKING_AGE);
            return;
        }
        this.f10266W.setProfileName(this.f10267X, getString(2131951646));
        try {
            PackageManager packageManager = getPackageManager();
            int i = MyDeviceAdmin.f10113a;
            packageManager.setComponentEnabledSetting(new ComponentName(getApplicationContext(), MyDeviceAdmin.class), 2, 1);
            packageManager.setComponentEnabledSetting(MyDeviceAdmin2.a(this), 2, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String packageName = getPackageName();
        if (a.r0() && getApplicationContext().getApplicationInfo().targetSdkVersion >= 34) {
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.SCHEDULE_EXACT_ALARM", 1);
        }
        if (a.E0() && getApplicationContext().getApplicationInfo().targetSdkVersion >= 33) {
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.READ_MEDIA_IMAGES", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.READ_MEDIA_VIDEO", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.READ_MEDIA_AUDIO", 1);
        }
        if (a.r0()) {
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.BLUETOOTH_SCAN", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.BLUETOOTH_CONNECT", 1);
        }
        if (a.y0()) {
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.READ_EXTERNAL_STORAGE", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.WRITE_EXTERNAL_STORAGE", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.CAMERA", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.ACCESS_COARSE_LOCATION", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.ACCESS_FINE_LOCATION", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.RECORD_AUDIO", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.READ_PHONE_STATE", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.SYSTEM_ALERT_WINDOW", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.PACKAGE_USAGE_STATS", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.ACCESS_NOTIFICATION_POLICY", 1);
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.WRITE_SETTINGS", 1);
        }
        if (a.B0()) {
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.REQUEST_INSTALL_PACKAGES", 1);
        }
        if (a.C0()) {
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.ANSWER_PHONE_CALLS", 1);
        }
        if (a.r0()) {
            this.f10266W.setPermissionGrantState(this.f10267X, packageName, "android.permission.BLUETOOTH_CONNECT", 1);
        }
        this.f10266W.setSecureSetting(this.f10267X, "skip_first_use_hints", "1");
        String str = this.f10268Y;
        if (str != null) {
            q qVar = this.f10272c0;
            qVar.getClass();
            if (qVar.P(new ByteArrayInputStream(str.getBytes()), "fully-single-app-settings.json", 4)) {
                b(0, "Done", "Settings imported successfully from Cloud Configuration", false);
                k kVar = this.f10264U;
                kVar.getClass();
                kVar.R2("isSettingImportedFromAssets", true);
            } else {
                a(2, "Settings import from Cloud Configuration failed");
            }
            g();
            return;
        }
        String str2 = this.f10274e0;
        if (str2 != null) {
            q qVar2 = this.f10272c0;
            C0684d3 d3Var = new C0684d3(this, 0);
            qVar2.getClass();
            new C0782u0(qVar2, 4, d3Var).execute(new String[]{str2});
            return;
        }
        String str3 = this.f10269Z;
        if (str3 != null) {
            q qVar3 = this.f10272c0;
            C0684d3 d3Var2 = new C0684d3(this, 1);
            qVar3.getClass();
            new C0782u0(qVar3, 4, d3Var2).execute(new String[]{str3});
            return;
        }
        g();
    }

    public final void i() {
        if (!((c) this.f10264U.f9767W).n("skipLaunchButtonInProvisioning", false)) {
            findViewById(2131362099).setVisibility(0);
            findViewById(2131362100).setOnClickListener(new C0666a3(this, 4));
            if (a.r0()) {
                ((TextView) findViewById(2131362100)).setText("Continue");
            }
            ScrollView scrollView = this.f10271b0;
            scrollView.post(new A3.c(2131362099, 6, (Object) scrollView));
            return;
        }
        e();
    }

    public final void j() {
        int i;
        int i8;
        boolean z = true;
        try {
            i = Integer.parseInt(((c) this.f10264U.f9767W).r("mdmPasswordQuality", "0"));
            if (i > 0) {
                this.f10266W.setPasswordQuality(this.f10267X, i);
                DevicePolicyManager devicePolicyManager = this.f10266W;
                ComponentName componentName = this.f10267X;
                k kVar = this.f10264U;
                kVar.getClass();
                try {
                    i8 = Integer.parseInt(((c) kVar.f9767W).r("mdmMinimumPasswordLength", "1"));
                } catch (Exception unused) {
                    i8 = 0;
                }
                devicePolicyManager.setPasswordMinimumLength(componentName, i8);
            }
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i <= 0 || this.f10266W.isActivePasswordSufficient()) {
            if (!this.f10264U.h1().isEmpty()) {
                C0678c3 c3Var = new C0678c3(this, 2);
                if (!C0765r1.f10910c) {
                    C0760q1 q1Var = new C0760q1(c3Var);
                    q1Var.f10911a = new WeakReference(this);
                    q1Var.f10912b = true;
                    q1Var.execute(new Void[0]);
                } else {
                    z = false;
                }
                if (z) {
                    a(0, "Loading/unpacking ZIP file from " + this.f10264U.h1() + "... ");
                    return;
                }
            }
            i();
            return;
        }
        findViewById(2131362215).setVisibility(0);
        findViewById(2131362216).setOnClickListener(new C0666a3(this, 1));
        ScrollView scrollView = this.f10271b0;
        scrollView.post(new A3.c(2131362215, 6, (Object) scrollView));
    }

    public final void k() {
        findViewById(2131362407).setVisibility(0);
        EditText editText = (EditText) findViewById(2131362406);
        editText.requestFocus();
        editText.setOnEditorActionListener(new C0690e3(this, editText, 0));
        findViewById(2131361955).setOnClickListener(new m(this, 8, editText));
        findViewById(2131362486).setOnClickListener(new C0666a3(this, 2));
        ScrollView scrollView = this.f10271b0;
        scrollView.post(new A3.c(2131362407, 6, (Object) scrollView));
    }

    public final void onActivityResult(int i, int i8, Intent intent) {
        super.onActivityResult(i, i8, intent);
        this.f10265V.getClass();
        if (i == 1014) {
            Log.i("a", "Device owner provisioning onActivityResult resultCode: " + i8);
            if (i8 == -1) {
                Log.i("a", "Provisioning started ok");
            } else {
                Log.e("a", "Provisioning failed");
            }
        }
    }

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C0794w0.q0(0, "ProvisioningActivity", "Started with Intent " + a.o0(getIntent()));
        Log.i("ProvisioningActivity", "onCreate TaskID=" + getTaskId() + " action=" + getIntent().getAction());
        C1160q.J(this);
        setContentView(2131558430);
        this.f10264U = new k((Context) this, 1);
        this.f10272c0 = new q((Activity) this);
        this.f10273d0 = new j0((Activity) this);
        this.f10265V = new C0410a(this);
        this.f10266W = (DevicePolicyManager) getSystemService("device_policy");
        this.f10267X = DeviceOwnerReceiver.a(this);
        this.f10271b0 = (ScrollView) findViewById(2131362409);
        this.f10264U.Q2();
        this.f10274e0 = getIntent().getStringExtra("FULLY_SETTINGS_DOWNLOAD_LOCATION");
        this.f10275f0 = getIntent().getStringExtra("FULLY_PROVISIONING_CODE");
        this.f10276g0 = getIntent().getStringExtra("FULLY_PROVISIONING_SERVER");
        PersistableBundle persistableBundle = (PersistableBundle) getIntent().getParcelableExtra("android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE");
        if (persistableBundle != null) {
            this.f10274e0 = persistableBundle.getString("FULLY_SETTINGS_DOWNLOAD_LOCATION");
            this.f10275f0 = persistableBundle.getString("FULLY_PROVISIONING_CODE");
            this.f10276g0 = persistableBundle.getString("FULLY_PROVISIONING_SERVER");
        }
        if (a.C0() && C0794w0.Z(this)) {
            this.f10266W.setPermissionGrantState(this.f10267X, getPackageName(), "android.permission.READ_PHONE_STATE", 1);
        }
        a(0, getString(2131951646) + " 1.17.1");
        StringBuilder sb = new StringBuilder("Device SN: ");
        sb.append(P.q(this));
        a(0, sb.toString());
        a(0, "Device Mac: ".concat(C0794w0.G(this, (String) null)));
        a(0, "Device ID: " + P.i(this));
        if (this.f10276g0 != null) {
            a(0, "Server: " + this.f10276g0);
        }
        if (!C0794w0.Z(this) && !getIntent().getBooleanExtra("test_mode", false)) {
            a(2, "Can't make device provisioning as device is not in device owner mode");
            findViewById(2131362025).setVisibility(0);
            findViewById(2131362026).setOnClickListener(new C0666a3(this, 0));
        } else if (((c) this.f10264U.f9767W).n("isProvisioningCompleted", false)) {
            if (getIntent() != null) {
                str = "Provisioning activity restarted when provisioning was already finished " + a.o0(getIntent());
            } else {
                str = "Provisioning activity restarted when provisioning was already finished";
            }
            a(0, str);
            setResult(-1);
            finish();
        } else if (((c) this.f10264U.f9767W).n("isProvisioningSettingsDone", false)) {
            a(0, "Provisioning activity restarted, continue...");
            c();
            g();
        } else {
            a(0, "Starting provisioning activity");
            c();
            String str2 = this.f10275f0;
            if (str2 == null) {
                k();
            } else if (!str2.isEmpty()) {
                new C0723k0(this, this.f10275f0).execute(new Void[0]);
            } else {
                h();
            }
        }
    }

    public final void onNewIntent(Intent intent) {
        setIntent(intent);
        Log.i("ProvisioningActivity", "onNewIntent TaskID=" + getTaskId());
        if (intent != null) {
            b(1, "Got unexpected intent " + intent.getAction(), "Got unexpected intent " + a.o0(intent), true);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (a.y0() && iArr.length > 0) {
            for (int i8 = 0; i8 < strArr.length; i8++) {
                if (iArr[i8] == -1 && !shouldShowRequestPermissionRationale(strArr[i8])) {
                    C0794w0.q0(1, "ProvisioningActivity", "Permission denied permanently " + strArr[i8]);
                    this.f10273d0.g(strArr[i8]);
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f10277h0) {
            this.f10277h0 = false;
            g();
        }
        if (this.f10278i0) {
            this.f10278i0 = false;
            j();
        }
        getWindow().addFlags(128);
        C0794w0.A0(this, false, false);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new C0672b3(0, this));
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C0794w0.A0(this, false, false);
        }
    }
}
