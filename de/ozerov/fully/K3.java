package de.ozerov.fully;

import Q0.g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import d4.k;
import java.util.ArrayList;
import n2.a;

public final class K3 extends G3 {
    public final ArrayList a() {
        Activity activity = this.f9979a;
        k kVar = new k((Context) activity, 1);
        ArrayList arrayList = new ArrayList();
        if (C0813z1.f11119p1) {
            g.y((String) null, "Some settings are using local files on shared storage. Due to evolving Google Play policies Fully won't be able to access shared storage after the next app upgrade.  <a href='https://www.fully-kiosk.com/en/#faq-localfilesalert'>Check FAQ!</a>", arrayList);
        }
        if (a.r0() && !MyAccessibilityService.f10103W && ((!kVar.c1().booleanValue() || !kVar.R0().booleanValue()) && (!C0794w0.Z(activity) || (!kVar.m1().booleanValue() && !kVar.n1().booleanValue())))) {
            g.y((String) null, "Kiosk Mode protection can have some gaps in Android 12+. Fully can't prevent pulling the status bar and opening system dialogs. <a href='https://www.fully-kiosk.com/en/#faq-android12'>Check FAQ!</a>", arrayList);
        }
        if (a.q0() && !a.r0() && !MyAccessibilityService.f10103W && ((!kVar.c1().booleanValue() || !kVar.R0().booleanValue()) && (!C0794w0.Z(activity) || !kVar.m1().booleanValue()))) {
            g.y((String) null, "Kiosk Mode protection will get some gaps if your device upgrades to Android 12+. <a href='https://www.fully-kiosk.com/en/#faq-android12'>Check FAQ!</a>", arrayList);
        }
        if (a.B0()) {
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
        if (P.z()) {
            g.y((String) null, "<b>Kiosk Mode</b> and some other settings are not available on ChromeOS devices", arrayList);
        }
        if (a.p0() && P.x(activity) && !Settings.canDrawOverlays(activity)) {
            g.y((String) null, "<b>Kiosk Mode</b> is not available on Android Go devices with Android 10+. <a href='https://www.fully-kiosk.com/en/#faq-go'>Check FAQ!</a>", arrayList);
        }
        if (P.y(activity)) {
            g.y((String) null, "It's impossible to enable the single app mode and use some other features on many Android TV devices. <a href='https://www.fully-kiosk.com/en/#faq-tv'>Check FAQ!</a>", arrayList);
        }
        if (!activity.getApplicationInfo().sourceDir.startsWith("/data/")) {
            arrayList.add(new F3((String) null, "Device Admin permission and some features will fail as you installed the app on SD card. Please move " + a.G(activity) + " to internal storage"));
        }
        P.D(activity);
        return arrayList;
    }
}
