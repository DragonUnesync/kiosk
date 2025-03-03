package de.ozerov.fully;

import Q0.g;
import Z1.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.Settings;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import d4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.a;

public class G3 {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f9979a;

    public /* synthetic */ G3(Activity activity) {
        this.f9979a = activity;
    }

    public ArrayList a() {
        Activity activity = this.f9979a;
        k kVar = new k((Context) activity, 1);
        ArrayList arrayList = new ArrayList();
        if (kVar.h2().contains("file://") || kVar.V1().startsWith("file://") || kVar.N().startsWith("file://") || kVar.A2().startsWith("file://") || kVar.k().startsWith("file://") || kVar.t().startsWith("file://") || kVar.L().booleanValue() || !kVar.i1().equals("0")) {
            if (!a.u0()) {
                g.y((String) null, "Scoped storage mode active. Only allowed media files are visible in shared storage. Use app-specific storage. <a href='https://www.fully-kiosk.com/en/#faq-scoped'>Check FAQ!</a>", arrayList);
            } else if (a.p0() && !a.q0() && a.x0(activity)) {
                g.y((String) null, "Access to local files on the shared storage will be restricted if your device upgrades to Android 11. <a href='https://www.fully-kiosk.com/en/#faq-scoped'>Check FAQ!</a>", arrayList);
            }
        }
        if ((kVar.s1().booleanValue() || kVar.t1().booleanValue()) && a.F0() && activity.getApplicationContext().getApplicationInfo().targetSdkVersion >= 34 && a.x0(activity)) {
            g.y((String) null, "Motion detection can fail with Android 14+ when other apps in foreground or screen is off. <a href='https://www.fully-kiosk.com/en/#faq-motion14'>Check FAQ!</a>", arrayList);
        }
        kVar.c0();
        if (a.r0() && !MyAccessibilityService.f10103W && ((!kVar.c1().booleanValue() || !kVar.R0().booleanValue()) && (!C0794w0.Z(activity) || (!kVar.m1().booleanValue() && !kVar.n1().booleanValue())))) {
            g.y((String) null, "Kiosk Mode protection can have some gaps in Android 12+. <a href='https://www.fully-kiosk.com/en/#faq-android12'>Check FAQ!</a>", arrayList);
        }
        kVar.c0();
        if (a.q0() && !a.r0() && !MyAccessibilityService.f10103W && ((!kVar.c1().booleanValue() || !kVar.R0().booleanValue()) && (!C0794w0.Z(activity) || (!kVar.m1().booleanValue() && !kVar.n1().booleanValue())))) {
            g.y((String) null, "Kiosk Mode protection will get some gaps if your device upgrades to Android 12+. <a href='https://www.fully-kiosk.com/en/#faq-android12'>Check FAQ!</a>", arrayList);
        }
        kVar.c0();
        if (kVar.F().booleanValue() && a.B0()) {
            if (Z0.f()) {
                if (!kVar.c1().booleanValue() || !kVar.R0().booleanValue()) {
                    g.y("knoxDisableStatusBar", "For a better status bar and power button protection please use the <b>KNOX Settings</b>", arrayList);
                }
            } else if (C0794w0.Z(activity)) {
                if (!kVar.m1().booleanValue() && !kVar.n1().booleanValue()) {
                    g.y("mdmDisableStatusBar", "For a better status bar and power button protection please use the <b>Device Owner Settings</b>", arrayList);
                }
            } else if (!activity.getPackageManager().queryIntentServices(new Intent(activity, MyAccessibilityService.class), 65536).isEmpty()) {
                if (!MyAccessibilityService.f10103W) {
                    arrayList.add(new F3(new Intent("android.settings.ACCESSIBILITY_SETTINGS")));
                }
            } else if (!C0794w0.Z(activity)) {
                g.y((String) null, "For a better status bar and power button protection we recommend device provisioning. <a href='https://www.fully-kiosk.com/#provisioning'>Check our website!</a>", arrayList);
            }
        }
        kVar.c0();
        if (kVar.g2().booleanValue() && kVar.e2().isEmpty()) {
            g.y("singleAppIntent", "Please select the single app to run in order to use the single app mode", arrayList);
        }
        c cVar = (c) kVar.f9767W;
        if (((cVar.n("screensaverEnabled", true) && kVar.s2() > 0) || kVar.r2() > 0) && !kVar.Z().booleanValue()) {
            g.y("keepScreenOn", "Consider enabling the <b>Keep Screen On</b> option when using <b>Screen Off</b> or <b>Screensaver Timer</b> otherwise Android screen off will be messing things up", arrayList);
        }
        if (((cVar.n("screensaverEnabled", true) && kVar.s2() > 0) || kVar.r2() > 0) && !cVar.n("touchesOtherAppsBreakIdle", false) && ((kVar.c0().booleanValue() && kVar.g2().booleanValue()) || C0664a1.a(activity) || kVar.T1().booleanValue())) {
            g.y("touchesOtherAppsBreakIdle", "Consider enabling the <b>Touching Other Apps Restarts Idle Timer</b> option when using <b>Screen Off</b> or <b>Screensaver Timer</b> with other apps", arrayList);
        }
        if (kVar.Z().booleanValue() && !kVar.a0().booleanValue() && a.p0()) {
            if (kVar.c0().booleanValue()) {
                kVar.g2();
            }
            g.y("keepScreenOnAdvanced", "Consider enabling the <b>Keep Screen On (Advanced)</b> option if the screen still turns off when using other apps", arrayList);
        }
        if (!kVar.Z().booleanValue() && !kVar.E1().booleanValue() && (kVar.J1().booleanValue() || kVar.s1().booleanValue() || kVar.t1().booleanValue() || kVar.y1().booleanValue())) {
            g.y("preventSleepWhileScreenOff", "Consider enabling the <b>Prevent from Sleep while Screen Off</b> option if the screen may turn off when using Remote Admin, Cloud service or Motion detection", arrayList);
        }
        if (!kVar.T().equals("2")) {
            g.y("graphicsAccelerationMode", "Hardware acceleration disabled, this can lead to low Webview performance", arrayList);
        }
        if (P.z()) {
            g.y((String) null, "<b>Kiosk Mode</b> and some other settings are not available on ChromeOS devices", arrayList);
        }
        if (a.p0() && P.x(activity) && !Settings.canDrawOverlays(activity)) {
            g.y((String) null, "<b>Kiosk Mode</b> is not available on Android Go devices with Android 10+. <a href='https://www.fully-kiosk.com/en/#faq-go'>Check FAQ!</a>", arrayList);
        }
        if (!activity.getApplicationInfo().sourceDir.startsWith("/data/")) {
            arrayList.add(new F3((String) null, "Device Admin permission and some features will fail as you installed the app on SD card. Please move " + a.G(activity) + " to internal storage"));
        }
        if (a.q0() && activity.getApplicationContext().getApplicationInfo().targetSdkVersion >= 30 && ((activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 || activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) && !C0794w0.Z(activity) && !C0794w0.X(activity) && !C0794w0.Y(activity) && !activity.getPackageManager().isAutoRevokeWhitelisted() && !P.y(activity))) {
            g.y("forceDeviceAdmin", "Runtime permissions can be reset by Android if you don't use this app for few month. To prevent this enable <b>Get Device Admin</b> option and grant Device Admin Permission", arrayList);
        }
        if (C0813z1.f11119p1) {
            g.y("localFilesMigrationCheck", "Some settings are using local files on shared storage. Due to evolving Google Play policies Fully won't be able to access shared storage after the next app upgrade. Click here for solutions.", arrayList);
        }
        if (kVar.O() > 0 && !cVar.n("reloadOnInternet", false)) {
            g.y("reloadOnInternet", "Consider enabling <b>Auto Reload on Internet Reconnect</b> if using the Error URL on Internet Disconnect.", arrayList);
        }
        if (P.y(activity)) {
            if (!cVar.n("unlockAndroidTvPrefs", false)) {
                g.y((String) null, "It's impossible to enable some Kiosk Mode restrictions and use some other features on Android TV devices. <a href='https://www.fully-kiosk.com/en/#faq-tv'>Check FAQ!</a>", arrayList);
            } else {
                g.y((String) null, "Android TV incompatible settings are unlocked but may work faulty", arrayList);
            }
        }
        P.D(activity);
        return arrayList;
    }

    public List b(LinearLayout linearLayout) {
        ArrayList a8 = a();
        Activity activity = this.f9979a;
        LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
        Iterator it = a8.iterator();
        while (it.hasNext()) {
            F3 f32 = (F3) it.next();
            LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(2131558588, linearLayout, false);
            linearLayout2.setFocusable(false);
            TextView textView = (TextView) linearLayout2.findViewById(2131362143);
            textView.setText(Html.fromHtml(f32.f9891a));
            if (f32.f9892b == null && f32.f9894d == null && !P.y(activity)) {
                textView.setLinksClickable(true);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                SpannableString spannableString = new SpannableString(textView.getText());
                for (URLSpan removeSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                    spannableString.removeSpan(removeSpan);
                }
                textView.setText(spannableString);
            }
            f32.f9893c = linearLayout2;
        }
        return a8;
    }

    public void c() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.f9979a.getTheme();
        theme.resolveAttribute(2130969861, typedValue, true);
        if (theme.resolveAttribute(2130969859, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(2130969608, typedValue, true);
        d(theme, typedValue);
    }

    public void d(Resources.Theme theme, TypedValue typedValue) {
        int i;
        if (theme.resolveAttribute(2130969485, typedValue, true) && (i = typedValue.resourceId) != 0) {
            this.f9979a.setTheme(i);
        }
    }
}
