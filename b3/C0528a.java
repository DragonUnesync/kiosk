package b3;

import C3.C0025a;
import G5.h;
import Q0.g;
import Q5.d;
import Z1.c;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import d4.k;
import de.ozerov.fully.C0758q;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.DeviceOwnerReceiver;
import de.ozerov.fully.FakeLauncher;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.I1;
import de.ozerov.fully.LauncherReplacement;
import de.ozerov.fully.MyAccessibilityService;
import de.ozerov.fully.N1;
import de.ozerov.fully.NotificationService;
import de.ozerov.fully.P;
import de.ozerov.fully.PinInputActivity;
import de.ozerov.fully.X0;
import de.ozerov.fully.Y0;
import de.ozerov.fully.Z0;
import n2.a;

/* renamed from: b3.a  reason: case insensitive filesystem */
public final class C0528a {

    /* renamed from: a  reason: collision with root package name */
    public int f8653a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8654b = true;

    /* renamed from: c  reason: collision with root package name */
    public int f8655c = 0;

    /* renamed from: d  reason: collision with root package name */
    public Object f8656d = Environment.getExternalStorageDirectory();
    public Object e = Environment.getExternalStorageDirectory();

    /* renamed from: f  reason: collision with root package name */
    public Object f8657f = Environment.getExternalStorageDirectory();

    /* renamed from: g  reason: collision with root package name */
    public Object f8658g = null;

    public static ComponentName h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                componentName.flattenToShortString();
                return componentName;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void k(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.google.android.permissioncontroller", "com.android.packageinstaller.role.ui.HomeSettingsActivity"));
            intent.addFlags(268468224);
            if (!Build.BRAND.equalsIgnoreCase("huawei") || context.getPackageManager().resolveActivity(intent, 0) == null) {
                Intent intent2 = new Intent("android.settings.HOME_SETTINGS");
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                return;
            }
            context.startActivity(intent);
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Failed to open home app settings due to "), "KioskManager");
            a.a1(1, context, "Failed to open settings. Please go manually to Home App settings in Android");
        }
    }

    public static void m(Context context) {
        k kVar = new k(context, 1);
        ComponentName h5 = h(context);
        if (h5 != null) {
            String packageName = h5.getPackageName();
            String className = h5.getClassName();
            if (!packageName.equals(context.getApplicationContext().getPackageName()) && !packageName.isEmpty() && !packageName.contains("ResolverActivity") && !packageName.contains("ContentResolver") && !className.contains("ResolverActivity") && !className.contains("ContentResolver") && !packageName.contains("setupwizard") && !className.contains("setupwizard")) {
                kVar.V2("defaultLauncher", h5.flattenToString());
                return;
            }
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo next : packageManager.queryIntentActivities(intent, 65536)) {
            if (!next.activityInfo.packageName.equals(context.getPackageName()) && !next.activityInfo.packageName.contains("setupwizard")) {
                ActivityInfo activityInfo = next.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                kVar.V2("defaultLauncher", componentName.flattenToString());
                componentName.flattenToString();
                return;
            }
        }
        kVar.V2("defaultLauncher", "");
    }

    public static void p(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        Intent c8 = a.c(intent);
        if (str != null) {
            c8.putExtra("reason", str);
        }
        try {
            PendingIntent.getActivity(context, 0, c8, 335544320).send();
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Failed to send pending home intent due to "), "KioskManager");
        }
    }

    public void a() {
        if (!((FullyActivity) this.f8656d).f10980u0) {
            ((FullyActivity) this.f8656d).f9919H0.b();
        }
        n(1);
        FullyActivity fullyActivity = (FullyActivity) this.f8656d;
        fullyActivity.f9913C0.c();
        fullyActivity.f9916E0.f10159c.setTouchModeAbove(0);
    }

    public void b() {
        if (this.f8654b) {
            if (!((k) this.e).d0().isEmpty()) {
                N1 n12 = ((FullyActivity) this.f8656d).f9916E0;
                n12.b();
                n12.f10159c.a(false);
                if (((k) this.e).s1().booleanValue() && ((k) this.e).Y1().booleanValue()) {
                    ((FullyActivity) this.f8656d).f9958x1.c();
                }
                Intent intent = new Intent((FullyActivity) this.f8656d, PinInputActivity.class);
                intent.putExtra("pinDialogHead", (String) null);
                if (!((FullyActivity) this.f8656d).f10981v0) {
                    intent.setFlags(65536);
                    ((FullyActivity) this.f8656d).startActivity(intent);
                    ((FullyActivity) this.f8656d).overridePendingTransition(0, 0);
                    return;
                }
                ((FullyActivity) this.f8656d).f9919H0.k(a.o0(intent));
                return;
            }
            C0794w0.q0(0, "KioskManager", "Kiosk unlocked as PIN empty");
            a();
        }
    }

    public void c() {
        n(3);
        ((FullyActivity) this.f8656d).f9916E0.a();
        j();
    }

    public void d() {
        FullyActivity fullyActivity = (FullyActivity) this.f8656d;
        fullyActivity.f9916E0.a();
        fullyActivity.f9916E0.f10159c.setTouchModeAbove(0);
        n(0);
    }

    public void e(boolean z) {
        k kVar = (k) this.e;
        FullyActivity fullyActivity = (FullyActivity) this.f8656d;
        try {
            LauncherReplacement.a(fullyActivity);
            if (C0794w0.Z(fullyActivity)) {
                if (C0794w0.Z(fullyActivity)) {
                    ((DevicePolicyManager) fullyActivity.getSystemService("device_policy")).clearPackagePersistentPreferredActivities(DeviceOwnerReceiver.a(fullyActivity), fullyActivity.getPackageName());
                }
                fullyActivity.f9954q1 = false;
                this.f8654b = kVar.c0().booleanValue();
                if (!kVar.c0().booleanValue()) {
                    d();
                }
            }
            if (!C0794w0.Z(fullyActivity) || z) {
                l(true);
                fullyActivity.f9919H0.d(true);
            }
        } catch (Exception e8) {
            a.b1(fullyActivity, "Error when switching off kiosk mode");
            g.z(e8, new StringBuilder("Failed to switch off the kiosk mode due to "), "KioskManager");
        }
    }

    public void f() {
        FullyActivity fullyActivity = (FullyActivity) this.f8656d;
        try {
            LauncherReplacement.b(fullyActivity);
            if (C0794w0.Z(fullyActivity)) {
                LauncherReplacement.c(fullyActivity);
                fullyActivity.f9919H0.d(true);
                l(a.z0());
                return;
            }
            if (!P.E(fullyActivity)) {
                if (Build.VERSION.SDK_INT < 35) {
                    fullyActivity.f9919H0.d(true);
                    l(a.z0());
                    return;
                }
            }
            fullyActivity.f9919H0.d(true);
            k(fullyActivity);
        } catch (Exception e8) {
            Log.e("KioskManager", "Failed to switch on the kiosk mode due to " + e8.getMessage());
            a.b1(fullyActivity, "Error when switching to kiosk mode due to " + e8.getMessage());
        }
    }

    public void g() {
        FullyActivity fullyActivity = (FullyActivity) this.f8656d;
        if (((c) fullyActivity.f9961z0.f9767W).n("confirmExit", true) && !this.f8654b && !P.y(fullyActivity)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(fullyActivity);
            builder.setTitle("Close the app and exit?");
            builder.setCancelable(false);
            builder.setPositiveButton("Yes", new X0(this, 4));
            builder.setNegativeButton("No", new X0(this, 5));
            builder.setNeutralButton("Never ask again", new X0(this, 6));
            o(builder);
            c();
        } else if (this.f8654b) {
            String r8 = ((c) fullyActivity.f9961z0.f9767W).r("defaultLauncher", "");
            AlertDialog.Builder builder2 = new AlertDialog.Builder(fullyActivity);
            if (!r8.isEmpty() || !fullyActivity.f9961z0.C().booleanValue()) {
                P.D(fullyActivity);
            }
            builder2.setTitle(2131951719);
            builder2.setMessage("If you disable the Kiosk Mode you can then start Fully as a normal app.");
            builder2.setNegativeButton("Disable Kiosk Mode", new X0(this, 7));
            builder2.setCancelable(true);
            builder2.setOnCancelListener(new h(4, this));
            o(builder2);
            n(0);
            fullyActivity.f9916E0.a();
        } else {
            fullyActivity.f9919H0.d(true);
            c();
        }
    }

    public boolean i() {
        int i;
        if (!this.f8654b || ((i = this.f8653a) != 3 && i != 2)) {
            return false;
        }
        return true;
    }

    public void j() {
        boolean i = i();
        FullyActivity fullyActivity = (FullyActivity) this.f8656d;
        if (!i || fullyActivity.f9961z0.b0().equals(fullyActivity.getResources().getString(2131951775))) {
            fullyActivity.f9916E0.f10159c.setTouchModeAbove(0);
        } else {
            fullyActivity.f9916E0.f10159c.setTouchModeAbove(2);
        }
    }

    public void l(boolean z) {
        Class<FakeLauncher> cls = FakeLauncher.class;
        FullyActivity fullyActivity = (FullyActivity) this.f8656d;
        if (z) {
            int i = FakeLauncher.f9896U;
            ComponentName componentName = new ComponentName(fullyActivity.getApplicationContext(), cls);
            fullyActivity.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            Log.i("FakeLauncher", componentName.flattenToShortString() + " enabled");
        }
        p(fullyActivity, (String) null);
        if (z) {
            int i8 = FakeLauncher.f9896U;
            ComponentName componentName2 = new ComponentName(fullyActivity.getApplicationContext(), cls);
            fullyActivity.getPackageManager().setComponentEnabledSetting(componentName2, 2, 1);
            Log.i("FakeLauncher", componentName2.flattenToShortString() + " disabled");
        }
    }

    public void n(int i) {
        if (i != 2 || this.f8653a != 0) {
            if (i != 2 || this.f8653a != 3) {
                if (i != 1 || this.f8653a != 0) {
                    boolean i8 = i();
                    this.f8653a = i;
                    ((FullyActivity) this.f8656d).f9922K0.k();
                    if (C0794w0.Z((FullyActivity) this.f8656d)) {
                        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) ((FullyActivity) this.f8656d).getSystemService("device_policy");
                        ComponentName a8 = DeviceOwnerReceiver.a((FullyActivity) this.f8656d);
                        if (i()) {
                            if (a.y0() && ((FullyActivity) this.f8656d).f9961z0.F().booleanValue()) {
                                devicePolicyManager.setStatusBarDisabled(a8, ((k) this.e).m1().booleanValue());
                            }
                            I1.e((FullyActivity) this.f8656d);
                            if (((k) this.e).n1().booleanValue() && ((FullyActivity) this.f8656d).f10980u0) {
                                ((FullyActivity) this.f8656d).startLockTask();
                            }
                        } else {
                            if (a.y0()) {
                                devicePolicyManager.setStatusBarDisabled(a8, false);
                            }
                            if (((FullyActivity) this.f8656d).f10983x0) {
                                ((FullyActivity) this.f8656d).stopLockTask();
                            }
                            I1.e((FullyActivity) this.f8656d);
                        }
                    }
                    if (!i() || !N5.k.e((FullyActivity) this.f8656d)) {
                        ((FullyActivity) this.f8656d).f9962z1.c();
                    } else {
                        ((FullyActivity) this.f8656d).f9962z1.b();
                    }
                    if (i() && ((c) ((k) this.e).f9767W).n("disableNotifications", false)) {
                        FullyActivity fullyActivity = (FullyActivity) ((FullyActivity) this.f8656d).f9919H0.f5257V;
                        try {
                            fullyActivity.startService(new Intent(fullyActivity, NotificationService.class));
                        } catch (Exception e8) {
                            g.x(e8, new StringBuilder("Failed to start the notification service due to "), "ActivityHelper");
                        }
                    }
                    if (i8 != i()) {
                        Z0.b((FullyActivity) this.f8656d);
                    }
                    if (((c) ((k) this.e).f9767W).n("forceDndInKioskMode", false) && a.y0()) {
                        NotificationManager notificationManager = (NotificationManager) ((FullyActivity) this.f8656d).getSystemService("notification");
                        if (!notificationManager.isNotificationPolicyAccessGranted()) {
                            return;
                        }
                        if (i()) {
                            if (this.f8655c == -1) {
                                this.f8655c = notificationManager.getCurrentInterruptionFilter();
                            }
                            notificationManager.setInterruptionFilter(3);
                            return;
                        }
                        int i9 = this.f8655c;
                        if (i9 != -1) {
                            notificationManager.setInterruptionFilter(i9);
                            this.f8655c = -1;
                        }
                    }
                }
            }
        }
    }

    public void o(AlertDialog.Builder builder) {
        AlertDialog alertDialog = (AlertDialog) this.f8658g;
        if (alertDialog != null && alertDialog.isShowing()) {
            ((AlertDialog) this.f8658g).dismiss();
        }
        AlertDialog create = builder.create();
        this.f8658g = create;
        a.Z0(create);
    }

    public void q(Runnable runnable) {
        boolean z;
        String str;
        boolean z6;
        boolean z8;
        k kVar = (k) this.e;
        boolean booleanValue = kVar.c0().booleanValue();
        c cVar = (c) kVar.f9767W;
        FullyActivity fullyActivity = (FullyActivity) this.f8656d;
        if (booleanValue && kVar.C().booleanValue() && fullyActivity.f9954q1) {
            ComponentName h5 = h(fullyActivity);
            if (h5 != null) {
                z8 = h5.getPackageName().equals(fullyActivity.getPackageName());
            } else {
                z8 = false;
            }
            if (!z8 && !cVar.n("ignoreJustOnceLauncher", false) && !P.D(fullyActivity)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(fullyActivity);
                builder.setTitle("Hmmm... One more try!");
                builder.setMessage("There was a glitch or you've really selected Fully to run JUST ONCE as your Home App. Please select ALWAYS again, otherwise strange things will happen. Fully will be unset as your default Home App automatically once you disable the Kiosk mode.");
                builder.setCancelable(false);
                builder.setPositiveButton("Retry", new X0(this, 1));
                builder.setNegativeButton("Ignore", new Y0(this, runnable, 1));
                o(builder);
                return;
            }
        }
        if (kVar.c0().booleanValue() && kVar.C().booleanValue() && !fullyActivity.f9954q1) {
            m(fullyActivity);
            int i = LauncherReplacement.f10083U;
            Class<LauncherReplacement> cls = LauncherReplacement.class;
            if (fullyActivity.getPackageManager().getComponentEnabledSetting(new ComponentName(fullyActivity.getApplicationContext(), cls)) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ComponentName h8 = h(fullyActivity);
                if (h8 != null) {
                    z6 = h8.getPackageName().equals(fullyActivity.getPackageName());
                } else {
                    z6 = false;
                }
                if (z6 || P.D(fullyActivity)) {
                    Log.i("KioskManager", "Auto start LauncherReplacement which is enabled and set as default");
                    Intent intent = new Intent(fullyActivity, cls);
                    intent.addFlags(268435456);
                    intent.addCategory("android.intent.category.HOME");
                    try {
                        fullyActivity.startActivity(intent);
                        fullyActivity.f9919H0.d(false);
                    } catch (Exception e8) {
                        a.a1(1, fullyActivity, "Could not launch Fully in Kiosk mode");
                        Log.e("KioskManager", "Could not launch in kiosk mode due to " + e8.getMessage());
                        runnable.run();
                    }
                } else {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(fullyActivity);
                    builder2.setTitle("Hmmm... Difficult case");
                    builder2.setMessage("You seem to have set another app to be your default home app. Fully can't change this. Please open the home app settings in Android and select Fully as default home app in order to enable the kiosk mode.");
                    builder2.setCancelable(false);
                    builder2.setPositiveButton("Ok, open settings", new X0(this, 2));
                    builder2.setNegativeButton("Disable kiosk mode", new X0(this, 3));
                    o(builder2);
                }
            } else if (kVar.g2().booleanValue() && kVar.e2().isEmpty()) {
                AlertDialog.Builder builder3 = new AlertDialog.Builder(fullyActivity);
                builder3.setTitle("Oops");
                builder3.setMessage("The single app mode is enabled, but the single app is not selected. We won't start the kiosk mode.");
                builder3.setPositiveButton("Got it", new X0(this, 8));
                o(builder3);
            } else if (C0794w0.Z(fullyActivity)) {
                f();
                kVar.R2("ignoreJustOnceLauncher", false);
            } else {
                AlertDialog.Builder builder4 = new AlertDialog.Builder(fullyActivity);
                builder4.setTitle("Switch Kiosk Mode on?");
                if (P.D(fullyActivity)) {
                    if (!MyAccessibilityService.f10103W) {
                        str = "On some older Fire OS devices you have to enable the <b>" + a.G(fullyActivity) + "</b> service at the bottom of Android Accessibility Settings in order to get a more reliable Kiosk Mode. Click <b>Open Settings</b> button and enable before clicking Yes to proceed.<br><br>";
                    } else {
                        str = "";
                    }
                    builder4.setMessage(Html.fromHtml(str + "Note: In many cases your Fire OS device will be blocked for 5 seconds after pressing the Home Button. Check the FAQs on our website for workarounds."));
                    if (!MyAccessibilityService.f10103W) {
                        builder4.setNeutralButton("Open Settings", (DialogInterface.OnClickListener) null);
                    }
                } else {
                    P.D(fullyActivity);
                    View inflate = ((LayoutInflater) fullyActivity.getSystemService("layout_inflater")).inflate(2131558593, (ViewGroup) null);
                    SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(2131362556);
                    switchCompat.setChecked(cVar.n("kioskTestMode", false));
                    switchCompat.setOnCheckedChangeListener(new C0758q(1, this));
                    TextView textView = (TextView) inflate.findViewById(2131362163);
                    textView.setText(textView.getText().toString().replace("$short_name", "Fully"));
                    TextView textView2 = (TextView) inflate.findViewById(2131362348);
                    textView2.setText(textView2.getText().toString().replace("$short_name", "Fully"));
                    TextView textView3 = (TextView) inflate.findViewById(2131362473);
                    textView3.setText(textView3.getText().toString().replace("$tap_count", String.valueOf(kVar.m2())));
                    builder4.setView(inflate);
                }
                builder4.setCancelable(false);
                builder4.setPositiveButton("Yes", new X0(this, 9));
                builder4.setNegativeButton("No", new Y0(this, runnable, 2));
                o(builder4);
                if (P.D(fullyActivity)) {
                    ((AlertDialog) this.f8658g).getButton(-3).setOnClickListener(new C0025a(11, this));
                }
                if (a.p0()) {
                    LauncherReplacement.b(fullyActivity);
                    AlertDialog alertDialog = (AlertDialog) this.f8658g;
                    Button button = alertDialog.getButton(-1);
                    Handler handler = new Handler();
                    CharSequence text = button.getText();
                    button.setEnabled(false);
                    handler.post(new d(5, alertDialog, button, text, handler));
                }
            }
        } else if ((kVar.c0().booleanValue() && kVar.C().booleanValue()) || !fullyActivity.f9954q1) {
            this.f8654b = kVar.c0().booleanValue();
            if (!kVar.c0().booleanValue()) {
                d();
            }
            runnable.run();
        } else if (C0794w0.Z(fullyActivity)) {
            e(false);
        } else {
            AlertDialog.Builder builder5 = new AlertDialog.Builder(fullyActivity);
            if (!kVar.c0().booleanValue()) {
                builder5.setTitle("Switch Kiosk Mode off?");
                builder5.setTitle("Switch Kiosk Mode off?");
            } else {
                builder5.setTitle("Switch Home Button Lock off?");
            }
            builder5.setMessage("Fully will close now and restore the default home app. You can start Fully as a normal app then.");
            builder5.setCancelable(false);
            builder5.setPositiveButton("Yes", new X0(this, 0));
            builder5.setNegativeButton("No", new Y0(this, runnable, 0));
            o(builder5);
        }
    }
}
