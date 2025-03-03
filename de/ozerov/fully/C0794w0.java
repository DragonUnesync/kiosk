package de.ozerov.fully;

import B3.q;
import C3.C0025a;
import D.C0051j0;
import D2.n;
import N.e;
import Q0.g;
import Q7.d;
import S7.h;
import W2.f;
import Z1.c;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.bumptech.glide.b;
import d4.k;
import h.C1022j;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.CookieManager;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.w0  reason: case insensitive filesystem */
public abstract class C0794w0 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11017a = false;

    /* renamed from: b  reason: collision with root package name */
    public static C0800x0 f11018b = null;

    /* renamed from: c  reason: collision with root package name */
    public static SQLiteDatabase f11019c = null;

    /* renamed from: d  reason: collision with root package name */
    public static C0764r0 f11020d = null;
    public static ComponentName e = null;

    /* renamed from: f  reason: collision with root package name */
    public static long f11021f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f11022g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static AlertDialog f11023h = null;
    public static String i = null;

    /* renamed from: j  reason: collision with root package name */
    public static String f11024j = "unknown";

    /* renamed from: k  reason: collision with root package name */
    public static String f11025k = "unknown";

    /* renamed from: l  reason: collision with root package name */
    public static Bitmap f11026l = null;

    /* renamed from: m  reason: collision with root package name */
    public static int f11027m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f11028n = true;

    /* renamed from: o  reason: collision with root package name */
    public static int f11029o = -1;

    /* renamed from: p  reason: collision with root package name */
    public static int f11030p = -1;

    /* renamed from: q  reason: collision with root package name */
    public static int f11031q = -1;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f11032r;

    /* renamed from: s  reason: collision with root package name */
    public static SQLiteDatabase f11033s;

    /* renamed from: t  reason: collision with root package name */
    public static C0764r0 f11034t;

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f11035u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f11036v = 0;

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f11037w = 0;

    public static ArrayList A(boolean z, boolean z6) {
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList<T> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            Collections.sort(list, new C0051j0(13));
            loop0:
            for (T t8 : list) {
                t8.getName();
                if (!t8.getName().startsWith("dummy")) {
                    for (T t9 : Collections.list(t8.getInetAddresses())) {
                        t9.getHostAddress();
                        t9.isLoopbackAddress();
                        if (!t9.isLoopbackAddress()) {
                            if (z && (t9 instanceof Inet4Address)) {
                                arrayList.add(t9);
                            }
                            if (!z && (t9 instanceof Inet6Address)) {
                                arrayList.add(t9);
                            }
                            if (!z6 && !arrayList.isEmpty()) {
                                break loop0;
                            }
                        }
                    }
                    continue;
                }
            }
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Failed getting the IP addresses due to "), "w0");
        }
        return arrayList;
    }

    public static void A0(Activity activity, boolean z, boolean z6) {
        int i8;
        try {
            View decorView = activity.getWindow().getDecorView();
            if (!z) {
                i8 = 770;
            } else {
                i8 = 256;
            }
            if (!z6) {
                i8 |= 1028;
            }
            int i9 = i8 | 2048;
            if (a.B0()) {
                i9 = i8 | 6144;
            }
            decorView.setSystemUiVisibility(i9);
            if (a.C0() && !z) {
                if (((c) new k((Context) activity, 1).f9767W).n("renderInCutoutArea", true)) {
                    activity.getWindow().getAttributes().layoutInDisplayCutoutMode = 3;
                } else {
                    activity.getWindow().getAttributes().layoutInDisplayCutoutMode = 0;
                }
            }
            View childAt = ((FrameLayout) activity.findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (!z6 || z) {
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.topMargin = Q(activity);
                }
                childAt.requestLayout();
            }
        } catch (Exception e8) {
            Log.e("w0", "Failed setting fullscreen mode due to " + e8.getMessage());
            a.b1(activity, "Failed setting fullscreen mode");
        }
    }

    public static String B() {
        String C8 = C(true, false);
        if (!C8.isEmpty()) {
            return C8;
        }
        return C(false, false);
    }

    public static void B0(int i8, int i9, int i10, int i11) {
        try {
            Class cls = Class.forName("android.view.IWindowManager").getClasses()[0];
            Object invoke = cls.getMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{(IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", new Class[]{String.class}).invoke((Object) null, new Object[]{"window"})});
            Class cls2 = Integer.TYPE;
            cls.getMethod("setOverscan", new Class[]{cls2, cls2, cls2, cls2, cls2}).invoke(invoke, new Object[]{0, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)});
        } catch (Exception e8) {
            Log.w("w0", "Failed to setOverscan due to " + e8.getClass().getName() + " " + e8.getMessage());
        }
    }

    public static String C(boolean z, boolean z6) {
        ArrayList A8 = A(z, z6);
        ArrayList arrayList = new ArrayList();
        Iterator it = A8.iterator();
        while (it.hasNext()) {
            String hostAddress = ((InetAddress) it.next()).getHostAddress();
            if (hostAddress != null) {
                arrayList.add(hostAddress.split("%")[0].toUpperCase());
            }
        }
        return a.H0(arrayList);
    }

    public static void C0(Context context, int i8) {
        int i9 = -1;
        if (i8 == -1) {
            v0(context);
        } else if (i8 >= 0 && i8 <= I(context)) {
            if (f11030p == -1) {
                f11030p = M(context);
            }
            if (f11031q == -1) {
                try {
                    i9 = Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode");
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                f11031q = i9;
            }
            try {
                Settings.System.putInt(context.getContentResolver(), "screen_brightness_mode", 0);
                Settings.System.putInt(context.getContentResolver(), "screen_brightness", i8);
                if (context instanceof Activity) {
                    WindowManager.LayoutParams attributes = ((Activity) context).getWindow().getAttributes();
                    attributes.screenBrightness = -1.0f;
                    ((Activity) context).getWindow().setAttributes(attributes);
                }
            } catch (Exception e9) {
                g.z(e9, new StringBuilder("Failed to set screen brightness due to "), "w0");
            }
        }
    }

    public static ComponentName D(Context context, String str, long j7) {
        ComponentName componentName;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            UsageEvents queryEvents = ((UsageStatsManager) context.getSystemService("usagestats")).queryEvents(currentTimeMillis - j7, currentTimeMillis);
            if (queryEvents == null || !queryEvents.hasNextEvent()) {
                componentName = null;
            } else {
                UsageEvents.Event event = new UsageEvents.Event();
                componentName = null;
                while (queryEvents.getNextEvent(event)) {
                    if (str != null) {
                        if (event.getPackageName().equals(str)) {
                        }
                    }
                    if ((event.getEventType() == 1 || event.getEventType() == 2) && event.getClassName() != null) {
                        componentName = new ComponentName(event.getPackageName(), event.getClassName());
                    }
                }
            }
            if (queryEvents != null && componentName == null && j7 < 10000000) {
                return D(context, str, j7 * 10);
            }
            if (componentName != null) {
                componentName.flattenToShortString();
            }
            return componentName;
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to get usage events due to "), "w0");
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void D0(android.app.Activity r4, java.lang.String r5) {
        /*
            r0 = 1
            r1 = 0
            r2 = -1
            r5.getClass()     // Catch:{ Exception -> 0x004a }
            int r3 = r5.hashCode()
            switch(r3) {
                case 49: goto L_0x0030;
                case 50: goto L_0x0025;
                case 51: goto L_0x001a;
                case 52: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            r5 = -1
            goto L_0x003a
        L_0x000f:
            java.lang.String r3 = "4"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0018
            goto L_0x000d
        L_0x0018:
            r5 = 3
            goto L_0x003a
        L_0x001a:
            java.lang.String r3 = "3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0023
            goto L_0x000d
        L_0x0023:
            r5 = 2
            goto L_0x003a
        L_0x0025:
            java.lang.String r3 = "2"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x002e
            goto L_0x000d
        L_0x002e:
            r5 = 1
            goto L_0x003a
        L_0x0030:
            java.lang.String r3 = "1"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0039
            goto L_0x000d
        L_0x0039:
            r5 = 0
        L_0x003a:
            switch(r5) {
                case 0: goto L_0x0046;
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                case 3: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r0 = -1
            goto L_0x0046
        L_0x003f:
            r0 = 8
            goto L_0x0046
        L_0x0042:
            r0 = 9
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            r4.setRequestedOrientation(r0)     // Catch:{ Exception -> 0x004a }
            goto L_0x0057
        L_0x004a:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to set screen orientation due to "
            r5.<init>(r0)
            java.lang.String r0 = "w0"
            Q0.g.z(r4, r5, r0)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0794w0.D0(android.app.Activity, java.lang.String):void");
    }

    public static ArrayList E(int i8) {
        if (!f11017a) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = f11019c;
        Cursor rawQuery = sQLiteDatabase.rawQuery("select * from (select * from daily_stats order by date DESC limit " + i8 + ") order by date ASC;", (String[]) null);
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(new C0800x0(rawQuery));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return arrayList;
    }

    public static void E0(Context context, String str) {
        for (Map.Entry entry : a.d1(str, ",", ":").entrySet()) {
            try {
                int parseInt = Integer.parseInt(((String) entry.getKey()).trim());
                int parseInt2 = Integer.parseInt(((String) entry.getValue()).trim());
                if (parseInt2 >= 0) {
                    if (parseInt2 <= 100) {
                        x0(context, parseInt2, parseInt);
                    }
                }
            } catch (Exception unused) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
            }
        }
    }

    public static Intent F(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                return launchIntentForPackage;
            }
            return context.getPackageManager().getLeanbackLaunchIntentForPackage(str);
        } catch (Exception e8) {
            g.x(e8, g.s("Failed to get a launcher intent for ", str, " due to "), "w0");
            return null;
        }
    }

    public static void F0(int i8, Context context, Runnable runnable, String str) {
        f.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        C0812z0 H8 = ((C0812z0) ((A0) b.a(context).f8974Z.b(context)).t().G(str)).L(true).H(n.f1132b);
        H8.C(new C0681d0(i8, context, runnable, str), H8);
    }

    public static String G(Context context, String str) {
        byte[] hardwareAddress;
        if (str == null) {
            str = "wlan0";
        }
        if (a.z0() && Z(context) && str.equals("wlan0")) {
            try {
                String f8 = ((DevicePolicyManager) context.getSystemService("device_policy")).getWifiMacAddress(DeviceOwnerReceiver.a(context));
                if (f8 != null && !f8.isEmpty()) {
                    return f8;
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        if (str.equals("wlan0")) {
            try {
                String macAddress = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
                if (macAddress != null && !macAddress.equals("02:00:00:00:00:00")) {
                    return macAddress;
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        try {
            NetworkInterface byName = NetworkInterface.getByName(str);
            if (!(byName == null || (hardwareAddress = byName.getHardwareAddress()) == null)) {
                String r02 = r0(hardwareAddress);
                if (!r02.equals("02:00:00:00:00:00")) {
                    return r02;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            String trim = a.a0("/sys/class/net/" + str + "/address").toUpperCase().trim();
            if (trim.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})")) {
                return trim;
            }
        } catch (Exception unused) {
        }
        try {
            InetAddress byName2 = InetAddress.getByName(C(false, false));
            if (!(byName2 instanceof Inet6Address)) {
                return "";
            }
            String r03 = r0(H((Inet6Address) byName2));
            if (!r03.isEmpty()) {
                return r03;
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static void G0(FullyActivity fullyActivity) {
        i = "checking";
        String s8 = s(fullyActivity);
        AlertDialog.Builder builder = new AlertDialog.Builder(fullyActivity);
        builder.setTitle("Device Info");
        builder.setMessage(s8);
        builder.setCancelable(false);
        builder.setPositiveButton("Close", new V(0));
        builder.setNeutralButton("Copy To Clipboard", (DialogInterface.OnClickListener) null);
        h();
        AlertDialog create = builder.create();
        f11023h = create;
        a.Z0(create);
        f11023h.getButton(-3).setOnClickListener(new C0025a(9, fullyActivity));
        new C0686e(3, fullyActivity).execute(new Void[0]);
    }

    public static byte[] H(Inet6Address inet6Address) {
        byte[] address;
        if (inet6Address == null || (address = inet6Address.getAddress()) == null || address.length != 16 || address[0] != -2 || address[1] != Byte.MIN_VALUE || address[11] != -1 || address[12] != -2) {
            return null;
        }
        return new byte[]{(byte) (address[8] ^ 2), address[9], address[10], address[13], address[14], address[15]};
    }

    public static ArrayList H0(Signature[] signatureArr) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            if (signature != null) {
                try {
                    str = a.g(MessageDigest.getInstance("SHA-256").digest(signature.toByteArray()));
                } catch (NoSuchAlgorithmException unused) {
                    str = null;
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static int I(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            Field[] declaredFields = powerManager.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i8 = 0;
            while (i8 < length) {
                Field field = declaredFields[i8];
                if (field.getName().equals("BRIGHTNESS_ON")) {
                    field.setAccessible(true);
                    try {
                        return ((Integer) field.get(powerManager)).intValue();
                    } catch (IllegalAccessException unused) {
                        Log.e("w0", "Failed to get max screen brightness value, use default");
                        return 255;
                    }
                } else {
                    i8++;
                }
            }
        }
        return 255;
    }

    public static void I0(Context context) {
        Log.i("w0", "Start Wifi Scan");
        try {
            ((WifiManager) context.getApplicationContext().getSystemService("wifi")).startScan();
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Failed to start Wifi scan due to "), "w0");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        r15 = "*";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f8, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014a, code lost:
        r11 = "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String J(android.content.Context r19, java.lang.String r20) {
        /*
            java.lang.String r0 = "FILL_FIELD"
            java.lang.String r1 = "TOGGLE_CHECKBOX"
            java.lang.String r2 = "CLICK_BUTTON_LINK"
            r6 = 1
            java.lang.String r7 = "mainWebAutomation"
            r8 = r19
            java.util.ArrayList r7 = de.ozerov.fully.O4.a(r8, r7)
            java.util.Iterator r7 = r7.iterator()
            java.lang.String r8 = ""
            r9 = r8
        L_0x0016:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0248
            java.lang.Object r10 = r7.next()
            de.ozerov.fully.O4 r10 = (de.ozerov.fully.O4) r10
            int r11 = r10.f10228a
            if (r11 == r6) goto L_0x0029
            r12 = r20
            goto L_0x0016
        L_0x0029:
            java.lang.String r11 = r10.f10229b
            java.lang.String[] r11 = n2.a.W(r11)
            r12 = r20
            boolean r11 = n2.a.M0(r12, r11)
            if (r11 != 0) goto L_0x0038
            goto L_0x0016
        L_0x0038:
            java.lang.String r11 = r10.f10230c
            java.lang.String r13 = "LOAD_URL"
            boolean r11 = r11.equals(r13)
            java.lang.String r13 = "\\'"
            java.lang.String r14 = "'"
            if (r11 == 0) goto L_0x005f
            java.lang.String r11 = "location.href='"
            java.lang.StringBuilder r9 = N.e.B(r9, r11)
            java.lang.String r10 = r10.e
            java.lang.String r10 = r10.replace(r14, r13)
            r9.append(r10)
            java.lang.String r10 = "';"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            goto L_0x0016
        L_0x005f:
            java.lang.String r11 = r10.f10231d
            r11.getClass()
            java.lang.String r15 = "input[type=submit], input[type=button], button"
            java.lang.String r16 = "input[type=checkbox]"
            java.lang.String r17 = "*"
            int r18 = r11.hashCode()
            switch(r18) {
                case -1749470121: goto L_0x00e8;
                case -1274967595: goto L_0x00dd;
                case -1178030907: goto L_0x00d2;
                case -1177847961: goto L_0x00c7;
                case -237735655: goto L_0x00bc;
                case 239614913: goto L_0x00b1;
                case 353607753: goto L_0x00a6;
                case 515127237: goto L_0x009b;
                case 986596498: goto L_0x008e;
                case 2125905502: goto L_0x0081;
                case 2131508664: goto L_0x0074;
                default: goto L_0x0071;
            }
        L_0x0071:
            r3 = -1
            goto L_0x00f2
        L_0x0074:
            java.lang.String r3 = "TARGET_BY_INDEX"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x007d
            goto L_0x0071
        L_0x007d:
            r3 = 10
            goto L_0x00f2
        L_0x0081:
            java.lang.String r3 = "TARGET_BY_CLASS"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x008a
            goto L_0x0071
        L_0x008a:
            r3 = 9
            goto L_0x00f2
        L_0x008e:
            java.lang.String r3 = "FIRST_CHECKBOX"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x0097
            goto L_0x0071
        L_0x0097:
            r3 = 8
            goto L_0x00f2
        L_0x009b:
            java.lang.String r3 = "FIRST_PASSWORD_FIELD"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x00a4
            goto L_0x0071
        L_0x00a4:
            r3 = 7
            goto L_0x00f2
        L_0x00a6:
            java.lang.String r3 = "FIRST_LINK"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x00af
            goto L_0x0071
        L_0x00af:
            r3 = 6
            goto L_0x00f2
        L_0x00b1:
            java.lang.String r3 = "FIRST_BUTTON"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x00ba
            goto L_0x0071
        L_0x00ba:
            r3 = 5
            goto L_0x00f2
        L_0x00bc:
            java.lang.String r3 = "TARGET_BY_SELECTOR"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x00c5
            goto L_0x0071
        L_0x00c5:
            r3 = 4
            goto L_0x00f2
        L_0x00c7:
            java.lang.String r3 = "TARGET_BY_TEXT"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x00d0
            goto L_0x0071
        L_0x00d0:
            r3 = 3
            goto L_0x00f2
        L_0x00d2:
            java.lang.String r3 = "TARGET_BY_NAME"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x00db
            goto L_0x0071
        L_0x00db:
            r3 = 2
            goto L_0x00f2
        L_0x00dd:
            java.lang.String r3 = "TARGET_BY_ID"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x00e6
            goto L_0x0071
        L_0x00e6:
            r3 = 1
            goto L_0x00f2
        L_0x00e8:
            java.lang.String r3 = "FIRST_TEXT_FIELD"
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x00f1
            goto L_0x0071
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            switch(r3) {
                case 0: goto L_0x017e;
                case 1: goto L_0x016d;
                case 2: goto L_0x015d;
                case 3: goto L_0x0159;
                case 4: goto L_0x0156;
                case 5: goto L_0x0137;
                case 6: goto L_0x0153;
                case 7: goto L_0x0150;
                case 8: goto L_0x014c;
                case 9: goto L_0x013a;
                case 10: goto L_0x00fb;
                default: goto L_0x00f5;
            }
        L_0x00f5:
            r11 = r8
        L_0x00f6:
            r15 = r17
        L_0x00f8:
            r3 = -1
            goto L_0x0181
        L_0x00fb:
            java.lang.String r3 = r10.f10230c
            r3.getClass()
            int r11 = r3.hashCode()
            switch(r11) {
                case -1528576880: goto L_0x011b;
                case 325225550: goto L_0x0112;
                case 1155828510: goto L_0x0109;
                default: goto L_0x0107;
            }
        L_0x0107:
            r3 = -1
            goto L_0x0123
        L_0x0109:
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0110
            goto L_0x0107
        L_0x0110:
            r3 = 2
            goto L_0x0123
        L_0x0112:
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0119
            goto L_0x0107
        L_0x0119:
            r3 = 1
            goto L_0x0123
        L_0x011b:
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0122
            goto L_0x0107
        L_0x0122:
            r3 = 0
        L_0x0123:
            switch(r3) {
                case 0: goto L_0x012e;
                case 1: goto L_0x012c;
                case 2: goto L_0x0129;
                default: goto L_0x0126;
            }
        L_0x0126:
            r15 = r17
            goto L_0x012e
        L_0x0129:
            java.lang.String r15 = "input[type=text], input[type=password], input[type=email], input[type=url], input[type=search], textarea"
            goto L_0x012e
        L_0x012c:
            r15 = r16
        L_0x012e:
            java.lang.String r3 = r10.e     // Catch:{ Exception -> 0x0136 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0136 }
            r11 = r8
            goto L_0x0181
        L_0x0136:
        L_0x0137:
            r11 = r8
        L_0x0138:
            r3 = 0
            goto L_0x0181
        L_0x013a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r11 = "."
            r3.<init>(r11)
            java.lang.String r11 = r10.e
            r3.append(r11)
            java.lang.String r15 = r3.toString()
        L_0x014a:
            r11 = r8
            goto L_0x00f8
        L_0x014c:
            r11 = r8
            r15 = r16
            goto L_0x0138
        L_0x0150:
            java.lang.String r15 = "input[type=password]"
            goto L_0x0137
        L_0x0153:
            java.lang.String r15 = "a"
            goto L_0x0137
        L_0x0156:
            java.lang.String r15 = r10.e
            goto L_0x014a
        L_0x0159:
            java.lang.String r3 = r10.e
            r11 = r3
            goto L_0x00f6
        L_0x015d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r11 = "[name="
            r3.<init>(r11)
            java.lang.String r11 = r10.e
            java.lang.String r15 = "]"
            java.lang.String r15 = N.e.A(r3, r11, r15)
            goto L_0x014a
        L_0x016d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r11 = "#"
            r3.<init>(r11)
            java.lang.String r11 = r10.e
            r3.append(r11)
            java.lang.String r15 = r3.toString()
            goto L_0x014a
        L_0x017e:
            java.lang.String r15 = "input[type=text], input[type=email], input[type=url], input[type=search], textarea"
            goto L_0x0137
        L_0x0181:
            java.lang.String r4 = r10.f10230c
            r4.getClass()
            int r17 = r4.hashCode()
            switch(r17) {
                case -1528576880: goto L_0x01a1;
                case 325225550: goto L_0x0198;
                case 1155828510: goto L_0x018f;
                default: goto L_0x018d;
            }
        L_0x018d:
            r4 = -1
            goto L_0x01a9
        L_0x018f:
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0196
            goto L_0x018d
        L_0x0196:
            r4 = 2
            goto L_0x01a9
        L_0x0198:
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x019f
            goto L_0x018d
        L_0x019f:
            r4 = 1
            goto L_0x01a9
        L_0x01a1:
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x01a8
            goto L_0x018d
        L_0x01a8:
            r4 = 0
        L_0x01a9:
            switch(r4) {
                case 0: goto L_0x01e4;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01af;
                default: goto L_0x01ac;
            }
        L_0x01ac:
            java.lang.String r4 = "?"
            goto L_0x01e6
        L_0x01af:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "value='"
            r4.<init>(r5)
            java.lang.String r5 = r10.f10232f
            java.lang.String r5 = r5.replace(r14, r13)
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            goto L_0x01e6
        L_0x01c7:
            java.lang.String r4 = r10.f10232f
            java.lang.String r5 = "true"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x01d4
            java.lang.String r4 = "checked=true"
            goto L_0x01e6
        L_0x01d4:
            java.lang.String r4 = r10.f10232f
            java.lang.String r5 = "toggle"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x01e1
            java.lang.String r4 = "checked^=true"
            goto L_0x01e6
        L_0x01e1:
            java.lang.String r4 = "checked=false"
            goto L_0x01e6
        L_0x01e4:
            java.lang.String r4 = "click()"
        L_0x01e6:
            java.lang.StringBuilder r5 = Q0.g.r(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "elms=document.querySelectorAll('"
            r9.<init>(r10)
            java.lang.String r10 = r15.replace(r14, r13)
            r9.append(r10)
            java.lang.String r10 = "');for(i=0;i<elms.length;++i) {  if ((i=="
            r9.append(r10)
            r9.append(r3)
            java.lang.String r10 = " || "
            r9.append(r10)
            r9.append(r3)
            java.lang.String r3 = "==-1)   && (elms[i].value=='"
            r9.append(r3)
            java.lang.String r3 = r11.replace(r14, r13)
            r9.append(r3)
            java.lang.String r3 = "' || elms[i].innerText.indexOf('"
            r9.append(r3)
            java.lang.String r3 = r11.replace(r14, r13)
            r9.append(r3)
            java.lang.String r3 = "')!==-1)) { elms[i]."
            r9.append(r3)
            java.lang.String r3 = ";   elms[i].dispatchEvent(new Event('input')); }}"
            java.lang.String r3 = N.e.A(r9, r4, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "(function(){"
            r4.<init>(r9)
            r4.append(r3)
            java.lang.String r3 = "})(); "
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r9 = r3
            goto L_0x0016
        L_0x0248:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0794w0.J(android.content.Context, java.lang.String):java.lang.String");
    }

    public static void J0(FullyActivity fullyActivity, boolean z) {
        if (h0(fullyActivity)) {
            q qVar = fullyActivity.f10979t0;
            qVar.c0();
            if (X(fullyActivity) || Y(fullyActivity) || Z(fullyActivity)) {
                ((DevicePolicyManager) fullyActivity.getSystemService("device_policy")).lockNow();
                f11028n = false;
                if (z) {
                    qVar.e(((c) fullyActivity.f9961z0.f9767W).n("useFullWakelockForKeepalive", false));
                    return;
                }
                return;
            }
            Log.e("w0", "Can't switch off device due to missing admin rights");
        }
    }

    public static String K(Context context, Intent intent) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity != null) {
            return resolveActivity.activityInfo.packageName;
        }
        return null;
    }

    public static void K0(FullyActivity fullyActivity, boolean z) {
        if (!h0(fullyActivity)) {
            f11028n = true;
            q.s0(fullyActivity, false, true);
            if (a.p0() && Settings.canDrawOverlays(fullyActivity)) {
                c cVar = new c(fullyActivity, 13);
                synchronized (cVar) {
                    ((C0767r3) cVar.f6955V).h(new FrameLayout(fullyActivity));
                    C0767r3 r3Var = (C0767r3) cVar.f6955V;
                    r3Var.f10920j = 8388691;
                    r3Var.f10916d = false;
                    r3Var.e = true;
                    r3Var.f10922l = true;
                    r3Var.f10921k = true;
                    r3Var.f10918g = 1;
                    r3Var.f10919h = 1;
                    r3Var.f10926p = "screenOn";
                    r3Var.j();
                }
                new Handler().postDelayed(new M2(1, (Object) cVar), 1000);
            }
            if (z) {
                fullyActivity.f10979t0.c();
            }
        }
    }

    public static String L(String str) {
        return str.split("/")[0];
    }

    public static void L0(C0780t4 t4Var) {
        t4Var.getWindow().clearFlags(128);
        t4Var.f10979t0.c0();
        w0(t4Var);
    }

    public static int M(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    public static void M0(Activity activity) {
        try {
            activity.getWindow().clearFlags(4194304);
            activity.getWindow().clearFlags(524288);
        } catch (Exception unused) {
            a.b1(activity, "Error when un-unlocking screen");
        }
    }

    public static int N(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        if (rotation != 3) {
            return 0;
        }
        return 270;
    }

    public static void N0(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.hashCode();
            try {
                window.clearFlags(131072);
            } catch (Exception e8) {
                g.x(e8, new StringBuilder("Failed to unlock keyboard due to "), "w0");
            }
        }
    }

    public static void O(FullyActivity fullyActivity) {
        MyWebView myWebView;
        g5 g5Var;
        i5 i5Var = fullyActivity.f9917F0;
        if (i5Var == null || (g5Var = i5Var.f10711d) == null || (myWebView = g5Var.f10664g) == null) {
            myWebView = null;
        }
        if (myWebView != null) {
            try {
                myWebView.setLayerType(0, (Paint) null);
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        }
        View rootView = fullyActivity.getWindow().getDecorView().getRootView();
        rootView.buildDrawingCache();
        f11026l = rootView.getDrawingCache().copy(Bitmap.Config.RGB_565, false);
        rootView.destroyDrawingCache();
        if (myWebView != null) {
            try {
                int parseInt = Integer.parseInt(fullyActivity.f9961z0.T());
                if (!(parseInt == 0 || parseInt == 1)) {
                    if (parseInt != 2) {
                        throw new IllegalArgumentException();
                    }
                }
                myWebView.setLayerType(parseInt, (Paint) null);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            myWebView.invalidate();
        }
    }

    public static void O0(Activity activity) {
        try {
            ((KeyguardManager) activity.getSystemService("keyguard")).newKeyguardLock("MyKeyguardLock").disableKeyguard();
        } catch (Exception unused) {
            if (!P.D(activity)) {
                a.b1(activity, "Error when unlocking screen (1)");
            }
            Log.e("w0", "Error when unlocking screen (1)");
        }
        try {
            activity.getWindow().addFlags(4194304);
            activity.getWindow().addFlags(524288);
        } catch (Exception unused2) {
            if (!P.D(activity)) {
                a.b1(activity, "Error when unlocking screen (2)");
            }
            Log.e("w0", "Error when unlocking screen (2)");
        }
    }

    public static ArrayList P(Context context, String str) {
        Signature[] signatureArr;
        PackageManager packageManager = context.getPackageManager();
        try {
            if (a.C0()) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                if (packageInfo != null) {
                    if (packageInfo.signingInfo != null) {
                        if (packageInfo.signingInfo.hasMultipleSigners()) {
                            return H0(packageInfo.signingInfo.getApkContentsSigners());
                        }
                        return H0(packageInfo.signingInfo.getSigningCertificateHistory());
                    }
                }
                return null;
            }
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
            if (!(packageInfo2 == null || (signatureArr = packageInfo2.signatures) == null || signatureArr.length == 0)) {
                if (signatureArr[0] != null) {
                    return H0(signatureArr);
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void P0(C0800x0 x0Var) {
        if (f11017a) {
            try {
                SQLiteDatabase sQLiteDatabase = f11019c;
                ContentValues a8 = x0Var.a();
                if (sQLiteDatabase.update("daily_stats", a8, "_id = " + x0Var.f11053a, (String[]) null) == 0) {
                    d(x0Var);
                }
            } catch (Exception e8) {
                g.z(e8, new StringBuilder("Failed to update stats due to "), "w0");
            }
        }
    }

    public static int Q(Context context) {
        int i8;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        if (a.y0()) {
            i8 = 24;
        } else {
            i8 = 25;
        }
        return (int) Math.ceil((double) (((float) i8) * resources.getDisplayMetrics().density));
    }

    public static A0 Q0(C1022j jVar) {
        f.c(jVar, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return (A0) b.a(jVar).f8974Z.c(jVar);
    }

    public static C0800x0 R() {
        if (!f11017a) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase = f11019c;
        String[] strArr = C0800x0.f11052q;
        Cursor query = sQLiteDatabase.query("daily_stats", strArr, "date = '" + a.H() + "'", (String[]) null, (String) null, (String) null, (String) null);
        if (query.getCount() > 0) {
            query.moveToFirst();
            C0800x0 x0Var = new C0800x0(query);
            query.close();
            return x0Var;
        }
        query.close();
        return d(new C0800x0());
    }

    public static String S(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                return connectionInfo.getBSSID();
            }
            return "";
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static int T(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            return -1;
        }
        return WifiManager.calculateSignalLevel(wifiManager.getConnectionInfo().getRssi(), 10);
    }

    public static String U(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                return connectionInfo.getSSID();
            }
            return "";
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static void V(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static synchronized void W(Context context) {
        synchronized (C0794w0.class) {
            if (!f11017a) {
                C0764r0 r0Var = new C0764r0(context, "stats.db", (SQLiteDatabase.CursorFactory) null, 4, 1);
                f11020d = r0Var;
                f11019c = r0Var.getWritableDatabase();
                f11017a = true;
                f11018b = R();
            }
        }
    }

    public static boolean X(Context context) {
        int i8 = MyDeviceAdmin.f10113a;
        return ((DevicePolicyManager) context.getSystemService("device_policy")).isAdminActive(new ComponentName(context.getApplicationContext(), MyDeviceAdmin.class));
    }

    public static boolean Y(Context context) {
        return ((DevicePolicyManager) context.getSystemService("device_policy")).isAdminActive(MyDeviceAdmin2.a(context));
    }

    public static boolean Z(Context context) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (!devicePolicyManager.isDeviceOwnerApp(context.getApplicationContext().getPackageName()) || !devicePolicyManager.isAdminActive(DeviceOwnerReceiver.a(context))) {
            return false;
        }
        return true;
    }

    public static synchronized void a() {
        synchronized (C0794w0.class) {
            if (!f11018b.f11054b.equals(a.H())) {
                P0(f11018b);
                f11018b = d(new C0800x0());
            }
        }
    }

    public static boolean a0(String str) {
        int i8 = 22;
        try {
            Runtime runtime = Runtime.getRuntime();
            Process exec = runtime.exec("ping -c1 -W3 " + str);
            exec.waitFor();
            i8 = exec.exitValue();
            exec.destroy();
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Exception in exec ping "), "w0");
        } catch (Error e9) {
            Log.e("w0", "Error in exec ping " + e9.getMessage());
        }
        if (i8 == 0) {
            return true;
        }
        return false;
    }

    public static void b(Context context) {
        if (!a.r0()) {
            try {
                Object systemService = context.getSystemService("statusbar");
                Method method = Class.forName("android.app.StatusBarManager").getMethod("collapsePanels", (Class[]) null);
                method.setAccessible(true);
                method.invoke(systemService, (Object[]) null);
            } catch (Error | Exception e8) {
                Log.e("w0", "Failed collapsing status bar due to " + e8.getMessage());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b0(de.ozerov.fully.MainActivity r4) {
        /*
            java.lang.String r0 = "device_policy"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.admin.DevicePolicyManager r4 = (android.app.admin.DevicePolicyManager) r4
            java.util.List r0 = r4.getActiveAdmins()
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            java.lang.String r2 = r2.getPackageName()
            boolean r3 = r4.isDeviceOwnerApp(r2)
            if (r3 != 0) goto L_0x0030
            boolean r2 = r4.isProfileOwnerApp(r2)
            if (r2 == 0) goto L_0x0014
        L_0x0030:
            r4 = 1
            return r4
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0794w0.b0(de.ozerov.fully.MainActivity):boolean");
    }

    public static boolean c(Context context, String str, String str2, String str3, String str4, String str5) {
        if (!a.p0() || Z(context)) {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            WifiConfiguration wifiConfiguration = new WifiConfiguration();
            wifiConfiguration.SSID = e.y("\"", str, "\"");
            if (str3.equals("WPA_EAP")) {
                wifiConfiguration.allowedKeyManagement.set(2);
                wifiConfiguration.allowedKeyManagement.set(3);
                wifiConfiguration.enterpriseConfig.setEapMethod(0);
                wifiConfiguration.enterpriseConfig.setPhase2Method(0);
                wifiConfiguration.enterpriseConfig.setCaCertificate((X509Certificate) null);
                wifiConfiguration.enterpriseConfig.setAnonymousIdentity((String) null);
                if (a.y0()) {
                    wifiConfiguration.enterpriseConfig.setDomainSuffixMatch((String) null);
                }
                wifiConfiguration.enterpriseConfig.setIdentity(str4);
                wifiConfiguration.enterpriseConfig.setPassword(str5);
            } else if (str3.equals("open") || str2.isEmpty()) {
                wifiConfiguration.allowedKeyManagement.set(0);
            } else {
                wifiConfiguration.preSharedKey = e.y("\"", str2, "\"");
                wifiConfiguration.allowedKeyManagement.set(1);
                wifiConfiguration.allowedAuthAlgorithms.set(0);
                wifiConfiguration.status = 2;
            }
            int addNetwork = wifiManager.addNetwork(wifiConfiguration);
            if (addNetwork > -1) {
                boolean enableNetwork = wifiManager.enableNetwork(addNetwork, true);
                Log.i("w0", "connectToWifi networkID: " + addNetwork + " status: " + enableNetwork);
                return enableNetwork;
            }
            Log.e("w0", "Failed to add Wifi configuration");
            return false;
        } else if (!StandardCharsets.US_ASCII.newEncoder().canEncode(str2)) {
            Log.e("w0", "Failed to add Wifi as the key is not ASCII encodable");
            return false;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Z.f().setSsid(str).setWpa2Passphrase(str2).build());
            if (((WifiManager) context.getApplicationContext().getSystemService("wifi")).addNetworkSuggestions(arrayList) == 0) {
                return true;
            }
            return false;
        }
    }

    public static boolean c0(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        try {
            Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", (Class[]) null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, (Object[]) null)).booleanValue();
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("isMobileDataEnabled failed due to "), "w0");
            return true;
        }
    }

    public static C0800x0 d(C0800x0 x0Var) {
        if (!f11017a) {
            return null;
        }
        try {
            long insert = f11019c.insert("daily_stats", (String) null, x0Var.a());
            SQLiteDatabase sQLiteDatabase = f11019c;
            String[] strArr = C0800x0.f11052q;
            Cursor query = sQLiteDatabase.query("daily_stats", strArr, "_id = " + insert, (String[]) null, (String) null, (String) null, (String) null);
            query.moveToFirst();
            C0800x0 x0Var2 = new C0800x0(query);
            query.close();
            return x0Var2;
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to creat stats record due to "), "w0");
            return null;
        }
    }

    public static boolean d0(Context context) {
        return ((AudioManager) context.getSystemService("audio")).isMusicActive();
    }

    public static synchronized void e() {
        synchronized (C0794w0.class) {
            if (f11017a) {
                P0(f11018b);
                f11020d.close();
                f11020d = null;
                f11017a = false;
            }
        }
    }

    public static boolean e0(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void f() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                defaultAdapter.disable();
            }
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Can't disable bluetooth due to "), "w0");
        }
    }

    public static boolean f0(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 1);
            if (packageInfo == null || (packageInfo.applicationInfo.flags & 129) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void g(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                wifiManager.setWifiEnabled(false);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static boolean g0(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        if (keyguardManager == null || powerManager == null) {
            return false;
        }
        boolean z = true;
        if (!keyguardManager.inKeyguardRestrictedInputMode() && !keyguardManager.isKeyguardLocked()) {
            z = true ^ powerManager.isInteractive();
        }
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                keyguardManager.isKeyguardLocked();
                keyguardManager.isDeviceLocked();
                h0(context);
            }
        } catch (Exception unused) {
        }
        return z;
    }

    public static void h() {
        AlertDialog alertDialog = f11023h;
        if (alertDialog != null && alertDialog.isShowing()) {
            f11023h.dismiss();
        }
        f11023h = null;
    }

    public static boolean h0(Context context) {
        return ((PowerManager) context.getSystemService("power")).isInteractive();
    }

    public static void i() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                defaultAdapter.enable();
            }
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Can't enable bluetooth due to "), "w0");
        }
    }

    public static boolean i0(Context context, Class cls) {
        for (ActivityManager.RunningServiceInfo next : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            next.service.getClassName();
            if (cls.getName().equals(next.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static void j(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                wifiManager.setWifiEnabled(true);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static boolean j0(Context context, String str) {
        Signature[] signatureArr;
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            PackageInfo packageInfo2 = packageManager.getPackageInfo("android", 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || !packageInfo2.signatures[0].equals(signatureArr[0])) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("w0", "Failed to get system signature due to " + e8.getMessage());
            return false;
        }
    }

    public static String k(Context context, ComponentName componentName) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.getActivityInfo(componentName, 128).loadLabel(packageManager).toString();
    }

    public static boolean k0(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.WRITE_SECURE_SETTINGS") == 0) {
            return true;
        }
        return false;
    }

    public static void l(Activity activity, ComponentName componentName, String str, int i8) {
        try {
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", componentName);
            intent.putExtra("android.app.extra.ADD_EXPLANATION", str);
            try {
                activity.startActivityForResult(intent, i8);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        } catch (Exception unused) {
            Log.e("w0", "Error when requesting admin permissions");
            a.b1(activity, "Error when requesting admin permissions");
        }
    }

    public static void l0(C0780t4 t4Var, boolean z) {
        t4Var.getWindow().addFlags(128);
        t4Var.f10979t0.c();
        if (z) {
            try {
                if (f11029o == -1) {
                    f11029o = Settings.System.getInt(t4Var.getContentResolver(), "screen_off_timeout");
                }
                Settings.System.putInt(t4Var.getContentResolver(), "screen_off_timeout", 864000000);
            } catch (Exception e8) {
                g.z(e8, new StringBuilder("Failed to keep screen on by advanced method due to "), "w0");
            }
        } else {
            w0(t4Var);
        }
    }

    public static JSONArray m(Context context) {
        int[] iArr = {4, 8, 5, 3, 1, 0, 2};
        JSONArray jSONArray = new JSONArray();
        for (int i8 = 0; i8 < 7; i8++) {
            int i9 = iArr[i8];
            int n4 = n(context, i9);
            if (n4 != -1) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("" + i9, n4);
                    jSONArray.put(jSONObject);
                } catch (Exception e8) {
                    g.x(e8, new StringBuilder("Failed to add to volume array due to "), "w0");
                }
            }
        }
        return jSONArray;
    }

    public static void m0(Context context, int i8, int i9) {
        int n4 = n(context, i9);
        if (n4 != -1 && n4 > i8 && !((AudioManager) context.getSystemService("audio")).isVolumeFixed()) {
            x0(context, i8, i9);
        }
    }

    public static int n(Context context, int i8) {
        int i9;
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int streamMaxVolume = audioManager.getStreamMaxVolume(i8);
            if (a.C0()) {
                i9 = audioManager.getStreamMinVolume(i8);
            } else {
                i9 = 0;
            }
            int streamVolume = audioManager.getStreamVolume(i8);
            if (streamMaxVolume == i9) {
                return 100;
            }
            return ((streamVolume - i9) * 100) / (streamMaxVolume - i9);
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [de.ozerov.fully.T, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [de.ozerov.fully.T, java.lang.Object] */
    public static ArrayList n0(Context context, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        if (!z) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            ArrayList arrayList2 = new ArrayList(packageManager.queryIntentActivities(intent, 0));
            if (P.y(context)) {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LEANBACK_LAUNCHER");
                arrayList2.addAll(new ArrayList(packageManager.queryIntentActivities(intent2, 0)));
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                ? obj = new Object();
                obj.f10348a = resolveInfo.loadLabel(packageManager).toString();
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                obj.f10349b = new ComponentName(activityInfo.packageName, activityInfo.name).flattenToShortString();
                obj.f10350c = "";
                obj.f10351d = 0;
                obj.e = resolveInfo.activityInfo.loadIcon(packageManager);
                arrayList.add(obj);
            }
        } else {
            for (PackageInfo next : packageManager.getInstalledPackages(512)) {
                ? obj2 = new Object();
                obj2.f10348a = next.applicationInfo.loadLabel(packageManager).toString();
                obj2.f10349b = e.A(new StringBuilder(), next.packageName, "/*");
                obj2.e = next.applicationInfo.loadIcon(packageManager);
                obj2.f10350c = next.versionName;
                obj2.f10351d = next.versionCode;
                obj2.f10354h = next.applicationInfo.flags;
                arrayList.add(obj2);
            }
        }
        TreeSet treeSet = new TreeSet(new C0051j0(11));
        treeSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(treeSet);
        Collections.sort(arrayList, new C0051j0(12));
        return arrayList;
    }

    public static R2.c o(Context context, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        R2.c cVar = null;
        int i8 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                C0802x2 a8 = C0808y2.a(str, context.getFilesDir(), 0, (CookieManager) null, false, (String) null);
                if (a8.f11070b != 200) {
                    Log.e("w0", "iconUrl failed to load from URL " + str);
                    if (a8.f11071c != null) {
                        File file = new File(context.getFilesDir(), a8.f11071c);
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                } else {
                    File file2 = new File(context.getFilesDir(), a8.f11071c);
                    Bitmap decodeStream = BitmapFactory.decodeStream(new FileInputStream(file2));
                    if (decodeStream != null) {
                        int width = decodeStream.getWidth();
                        if (width == decodeStream.getHeight() && width > i8) {
                            if (cVar == null) {
                                cVar = new R2.c(0, 28);
                            }
                            cVar.f4336V = str;
                            cVar.f4337W = decodeStream;
                            i8 = width;
                        }
                    } else {
                        Log.e("w0", "iconUrl failed to decode bitmap: " + str);
                    }
                    if (file2.exists()) {
                        file2.delete();
                    }
                }
            } catch (Exception e8) {
                g.x(e8, g.s("iconUrl failed to load bitmap: ", str, " due to "), "w0");
            }
        }
        return cVar;
    }

    public static h o0(String str) {
        try {
            Q7.f e8 = E.e.e(str);
            d dVar = e8.f4220a;
            dVar.getClass();
            dVar.f4202f = 10000;
            return e8.a();
        } catch (Exception e9) {
            Log.e("w0", "Failed to load URL from " + str);
            e9.printStackTrace();
            return null;
        }
    }

    public static ComponentName p(Context context, String str) {
        String[] split = str.split("/");
        String str2 = split[0];
        if (split.length > 1 && !split[1].isEmpty()) {
            return ComponentName.unflattenFromString(str);
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str2);
        if (launchIntentForPackage != null) {
            return launchIntentForPackage.getComponent();
        }
        return null;
    }

    public static void p0(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.hashCode();
            try {
                window.setFlags(131072, 131072);
            } catch (Exception e8) {
                g.x(e8, new StringBuilder("Failed to lock keyboard due to "), "w0");
            }
        }
    }

    public static ComponentName q(Context context, long j7) {
        long j8;
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
        long currentTimeMillis = System.currentTimeMillis();
        long j9 = f11021f;
        if (j9 > 0) {
            j8 = j9 - 1000;
        } else {
            j8 = currentTimeMillis - j7;
        }
        try {
            UsageEvents queryEvents = usageStatsManager.queryEvents(j8, currentTimeMillis);
            if (queryEvents != null && queryEvents.hasNextEvent()) {
                UsageEvents.Event event = new UsageEvents.Event();
                while (queryEvents.getNextEvent(event)) {
                    if (!(event.getEventType() != 1 || event.getPackageName() == null || event.getClassName() == null)) {
                        e = new ComponentName(event.getPackageName(), event.getClassName());
                    }
                    f11021f = event.getTimeStamp();
                }
            }
            if (queryEvents != null && e == null && j7 < 10000000) {
                return q(context, j7 * 10);
            }
            ComponentName componentName = e;
            if (componentName != null) {
                componentName.flattenToShortString();
            }
            return e;
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to get usage events due to "), "w0");
            return e;
        }
    }

    public static void q0(int i8, String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date());
        long j7 = (long) i8;
        if (f11034t != null && f11033s != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("time", format);
                contentValues.put("type", Long.valueOf(j7));
                contentValues.put("tag", str);
                contentValues.put("message", str2);
                contentValues.put("version", 2L);
                f11033s.insert("fully_log", (String) null, contentValues);
            } catch (Exception e8) {
                g.z(e8, new StringBuilder("Failed to save log entry due to "), "w0");
            }
        }
    }

    public static String r(Context context) {
        ComponentName q7 = q(context, 1000);
        if (q7 != null) {
            return q7.getPackageName();
        }
        return null;
    }

    public static String r0(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            sb.append(String.format("%02X:", new Object[]{Byte.valueOf(bArr[i8])}));
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0405  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String s(de.ozerov.fully.FullyActivity r20) {
        /*
            r0 = r20
            d4.k r1 = new d4.k
            r2 = 1
            r1.<init>((android.content.Context) r0, (int) r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "App Package: com.fullykiosk.singleapp\n"
            r3.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "App Version: 1.17.1 (101362/"
            r4.<init>(r5)
            java.lang.String r5 = "firstAppInstallVersionCode"
            java.lang.Object r6 = r1.f9767W
            Z1.c r6 = (Z1.c) r6
            r7 = 0
            int r5 = r6.q(r5, r7)
            r4.append(r5)
            java.lang.String r5 = ")\n"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r4 = de.ozerov.fully.P.f10237f
            if (r4 == 0) goto L_0x0035
            goto L_0x003a
        L_0x0035:
            de.ozerov.fully.P.R(r20)
            java.lang.String r4 = de.ozerov.fully.P.f10237f
        L_0x003a:
            java.lang.String r6 = "\n"
            if (r4 == 0) goto L_0x005c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "Webview Provider: "
            r4.<init>(r8)
            java.lang.String r8 = de.ozerov.fully.P.f10237f
            if (r8 == 0) goto L_0x004a
            goto L_0x004f
        L_0x004a:
            de.ozerov.fully.P.R(r20)
            java.lang.String r8 = de.ozerov.fully.P.f10237f
        L_0x004f:
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
        L_0x005c:
            java.lang.String r4 = de.ozerov.fully.P.t(r20)
            java.lang.String r8 = ""
            if (r4 == 0) goto L_0x0094
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "Webview Version: "
            r4.<init>(r9)
            java.lang.String r9 = de.ozerov.fully.P.t(r20)
            if (r9 != 0) goto L_0x0073
        L_0x0071:
            r2 = r8
            goto L_0x0087
        L_0x0073:
            java.lang.String r10 = "Chrome/([0-9.]*)"
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)
            java.util.regex.Matcher r9 = r10.matcher(r9)
            boolean r10 = r9.find()
            if (r10 == 0) goto L_0x0071
            java.lang.String r2 = r9.group(r2)
        L_0x0087:
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r3.append(r2)
        L_0x0094:
            boolean r2 = de.ozerov.fully.P.y(r20)
            if (r2 == 0) goto L_0x009d
            java.lang.String r2 = " (TV)"
            goto L_0x009e
        L_0x009d:
            r2 = r8
        L_0x009e:
            boolean r4 = de.ozerov.fully.P.D(r20)
            if (r4 == 0) goto L_0x00aa
            java.lang.String r4 = " (Fire OS)"
            java.lang.String r2 = r2.concat(r4)
        L_0x00aa:
            boolean r4 = de.ozerov.fully.P.x(r20)
            if (r4 == 0) goto L_0x00b6
            java.lang.String r4 = " (Go)"
            java.lang.String r2 = N.e.x(r2, r4)
        L_0x00b6:
            boolean r4 = de.ozerov.fully.P.z()
            if (r4 == 0) goto L_0x00c2
            java.lang.String r4 = " (ChromeOS)"
            java.lang.String r2 = N.e.x(r2, r4)
        L_0x00c2:
            boolean r4 = de.ozerov.fully.P.E(r20)
            if (r4 == 0) goto L_0x00ce
            java.lang.String r4 = " (HarmonyOS)"
            java.lang.String r2 = N.e.x(r2, r4)
        L_0x00ce:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "Android Version: "
            r4.<init>(r9)
            java.lang.String r9 = android.os.Build.VERSION.RELEASE
            r4.append(r9)
            r4.append(r2)
            java.lang.String r2 = " (SDK "
            r4.append(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4.append(r2)
            java.lang.String r2 = "/"
            r4.append(r2)
            android.content.Context r9 = r20.getApplicationContext()
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()
            int r9 = r9.targetSdkVersion
            r4.append(r9)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "Device Model: "
            r4.<init>(r9)
            java.lang.String r9 = android.os.Build.MODEL
            r4.append(r9)
            java.lang.String r9 = " ("
            r4.append(r9)
            java.lang.String r10 = android.os.Build.MANUFACTURER
            r4.append(r10)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Screen: "
            r4.<init>(r5)
            int r5 = v(r20)
            r4.append(r5)
            java.lang.String r5 = "x"
            r4.append(r5)
            int r5 = u(r20)
            r4.append(r5)
            java.lang.String r5 = " px\n"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Mac: "
            r4.<init>(r5)
            r5 = 0
            java.lang.String r5 = G(r0, r5)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Serial: "
            r4.<init>(r5)
            java.lang.String r5 = de.ozerov.fully.P.q(r20)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Android ID: "
            r4.<init>(r5)
            android.content.ContentResolver r5 = r20.getContentResolver()
            java.lang.String r10 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r10)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Device ID: "
            r4.<init>(r5)
            java.lang.String r5 = de.ozerov.fully.P.i(r20)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "PLUS License: "
            r4.<init>(r5)
            boolean r5 = Q.h.f4003X
            java.lang.String r10 = "yes"
            java.lang.String r11 = "no"
            if (r5 == 0) goto L_0x01c1
            r5 = r10
            goto L_0x01c2
        L_0x01c1:
            r5 = r11
        L_0x01c2:
            r4.append(r5)
            java.lang.String r5 = " (56) "
            r4.append(r5)
            java.lang.String r5 = "volumeLicenseStatus"
            java.lang.Object r12 = r1.f9767W
            Z1.c r12 = (Z1.c) r12
            java.lang.String r5 = r12.r(r5, r8)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Device Owner/Admin: "
            r4.<init>(r5)
            boolean r5 = Z(r20)
            if (r5 == 0) goto L_0x01f0
            r5 = r10
            goto L_0x01f1
        L_0x01f0:
            r5 = r11
        L_0x01f1:
            r4.append(r5)
            r4.append(r2)
            boolean r5 = X(r20)
            if (r5 == 0) goto L_0x01ff
            r5 = r10
            goto L_0x0200
        L_0x01ff:
            r5 = r11
        L_0x0200:
            r4.append(r5)
            r4.append(r2)
            boolean r5 = Y(r20)
            if (r5 == 0) goto L_0x020e
            r5 = r10
            goto L_0x020f
        L_0x020e:
            r5 = r11
        L_0x020f:
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Root Available/Enabled: "
            r4.<init>(r5)
            boolean r5 = de.ozerov.fully.P.A(r20)
            if (r5 == 0) goto L_0x022b
            r5 = r10
            goto L_0x022c
        L_0x022b:
            r5 = r11
        L_0x022c:
            r4.append(r5)
            r4.append(r2)
            boolean r5 = de.ozerov.fully.P.f10240j
            if (r5 == 0) goto L_0x0237
            goto L_0x0238
        L_0x0237:
            r10 = r11
        L_0x0238:
            r4.append(r10)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            boolean r4 = Z(r20)
            if (r4 == 0) goto L_0x026b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Encryption Status: "
            r4.<init>(r5)
            java.lang.String r5 = "device_policy"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.app.admin.DevicePolicyManager r5 = (android.app.admin.DevicePolicyManager) r5
            int r5 = r5.getStorageEncryptionStatus()
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
        L_0x026b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "App RAM (used/free): "
            r4.<init>(r5)
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            long r12 = r5.totalMemory()
            long r14 = r5.freeMemory()
            long r12 = r12 - r14
            r14 = 1024(0x400, double:5.06E-321)
            long r12 = r12 / r14
            r4.append(r12)
            r4.append(r2)
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            long r12 = r5.maxMemory()
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            long r16 = r5.totalMemory()
            long r18 = r5.freeMemory()
            long r16 = r16 - r18
            long r12 = r12 - r16
            long r12 = r12 / r14
            r4.append(r12)
            java.lang.String r5 = " KB\n"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            boolean r4 = n2.a.q0()
            if (r4 == 0) goto L_0x02c2
            boolean r4 = android.os.Environment.isExternalStorageManager()
            if (r4 == 0) goto L_0x02c2
            java.lang.String r4 = "Storage Mode: managed\n"
            r3.append(r4)
            goto L_0x02d3
        L_0x02c2:
            boolean r4 = n2.a.u0()
            if (r4 == 0) goto L_0x02ce
            java.lang.String r4 = "Storage Mode: legacy\n"
            r3.append(r4)
            goto L_0x02d3
        L_0x02ce:
            java.lang.String r4 = "Storage Mode: scoped\n"
            r3.append(r4)
        L_0x02d3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "KNOX Version/Licensed: "
            r4.<init>(r5)
            boolean r5 = de.ozerov.fully.Z0.f()
            if (r5 == 0) goto L_0x0300
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = de.ozerov.fully.Z0.e()
            r5.append(r10)
            r5.append(r9)
            int r9 = de.ozerov.fully.Z0.d()
            r5.append(r9)
            java.lang.String r9 = ")"
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            goto L_0x0301
        L_0x0300:
            r5 = r11
        L_0x0301:
            r4.append(r5)
            r4.append(r2)
            boolean r5 = de.ozerov.fully.Z0.g()
            if (r5 == 0) goto L_0x0310
            java.lang.String r11 = "premium"
            goto L_0x0316
        L_0x0310:
            boolean r5 = de.ozerov.fully.Z0.f10525a
            if (r5 == 0) goto L_0x0316
            java.lang.String r11 = "basic"
        L_0x0316:
            r4.append(r11)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r4 = r1.y()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x034b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Denied: "
            r4.<init>(r5)
            java.lang.String r5 = r1.y()
            java.lang.String r9 = "android.permission."
            java.lang.String r5 = r5.replace(r9, r8)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
        L_0x034b:
            java.lang.String r4 = r20.getPackageName()
            java.util.ArrayList r4 = P(r0, r4)
            if (r4 == 0) goto L_0x0380
            java.util.Iterator r4 = r4.iterator()
        L_0x0359:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0380
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Signature: "
            r8.<init>(r9)
            r9 = 16
            java.lang.String r5 = n2.a.a(r9, r5)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
            r3.append(r5)
            goto L_0x0359
        L_0x0380:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Fully Cloud: "
            r4.<init>(r5)
            java.lang.String r5 = i
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.Boolean r2 = r1.J1()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x03af
            java.lang.Boolean r1 = r1.u()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x03af
            java.lang.String r1 = de.ozerov.fully.CloudService.f9835j0
            goto L_0x03b1
        L_0x03af:
            java.lang.String r1 = "disabled"
        L_0x03b1:
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = r20.getPackageName()
            boolean r1 = j0(r0, r1)
            if (r1 == 0) goto L_0x040d
            java.lang.String r1 = "Signature: System"
            r3.append(r1)
            java.lang.String r1 = r20.getPackageName()
            android.content.pm.PackageManager r0 = r20.getPackageManager()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r7)     // Catch:{ NameNotFoundException -> 0x03e2 }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x03e2 }
            r0 = r0 & 129(0x81, float:1.81E-43)
            if (r0 == 0) goto L_0x03f5
            java.lang.String r0 = " (System flagged)"
            goto L_0x03f7
        L_0x03e2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find app for "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "w0"
            android.util.Log.w(r1, r0)
        L_0x03f5:
            java.lang.String r0 = " (Not system flagged)"
        L_0x03f7:
            r3.append(r0)
            int r0 = android.os.Process.myUid()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 != r1) goto L_0x0405
            java.lang.String r0 = " (System UID)"
            goto L_0x0407
        L_0x0405:
            java.lang.String r0 = " (Not system UID)"
        L_0x0407:
            r3.append(r0)
            r3.append(r6)
        L_0x040d:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0794w0.s(de.ozerov.fully.FullyActivity):java.lang.String");
    }

    public static String t(Context context) {
        String str = null;
        try {
            if (a.r0()) {
                if (context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
                }
                return (String) Objects.requireNonNullElse(str, "unknown");
            }
            str = BluetoothAdapter.getDefaultAdapter().getName();
        } catch (Exception e8) {
            e8.getMessage();
        }
        return (String) Objects.requireNonNullElse(str, "unknown");
    }

    public static int u(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static void u0(Context context, boolean z, boolean z6) {
        Point point;
        if (k0(context) && !a.q0()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
            if (displayMetrics.widthPixels < displayMetrics2.widthPixels) {
                point = new Point(displayMetrics2.widthPixels - displayMetrics.widthPixels, 0);
            } else if (displayMetrics.heightPixels < displayMetrics2.heightPixels) {
                point = new Point(0, displayMetrics2.heightPixels - displayMetrics.heightPixels);
            } else {
                point = new Point(0, 0);
            }
            int Q2 = Q(context);
            int N2 = N(context);
            if (!z) {
                point = new Point(0, 0);
            }
            if (!z6) {
                Q2 = 0;
            }
            if (N2 == 90) {
                B0(-point.y, 0, -Q2, -point.x);
            } else if (N2 == 180) {
                B0(-point.x, -point.y, 0, -Q2);
            } else if (N2 == 270) {
                B0(-Q2, 0, -point.y, -point.x);
            } else {
                B0(0, -Q2, -point.x, -point.y);
            }
        }
    }

    public static int v(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static void v0(Context context) {
        try {
            if (f11031q != -1) {
                Settings.System.putInt(context.getContentResolver(), "screen_brightness_mode", f11031q);
                f11031q = -1;
            }
            if (f11030p != -1) {
                Settings.System.putInt(context.getContentResolver(), "screen_brightness", f11030p);
                f11030p = -1;
            }
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to restore screen brightness due to "), "w0");
        }
    }

    public static ArrayList w(h hVar) {
        U7.d M6 = hVar.M("link[rel='apple-touch-icon']");
        U7.d M8 = hVar.M("link[rel='apple-touch-icon-precomposed']");
        U7.d M9 = hVar.M("link[rel='icon']");
        U7.d M10 = hVar.M("link[rel='shortcut icon']");
        U7.d M11 = hVar.M("meta[name='msapplication-TileImage']");
        U7.d M12 = hVar.M("meta[property='og:image']");
        U7.d M13 = hVar.M("meta[itemprop='image']");
        ArrayList arrayList = new ArrayList();
        Iterator it = M6.iterator();
        while (it.hasNext()) {
            arrayList.add(((S7.k) it.next()).a("href"));
        }
        Iterator it2 = M8.iterator();
        while (it2.hasNext()) {
            arrayList.add(((S7.k) it2.next()).a("href"));
        }
        Iterator it3 = M9.iterator();
        while (it3.hasNext()) {
            arrayList.add(((S7.k) it3.next()).a("href"));
        }
        Iterator it4 = M10.iterator();
        while (it4.hasNext()) {
            arrayList.add(((S7.k) it4.next()).a("href"));
        }
        Iterator it5 = M11.iterator();
        while (it5.hasNext()) {
            arrayList.add(((S7.k) it5.next()).a("content"));
        }
        Iterator it6 = M12.iterator();
        while (it6.hasNext()) {
            arrayList.add(((S7.k) it6.next()).a("content"));
        }
        Iterator it7 = M13.iterator();
        while (it7.hasNext()) {
            arrayList.add(((S7.k) it7.next()).a("content"));
        }
        if (arrayList.isEmpty()) {
            S7.k kVar = new S7.k("a");
            kVar.G(hVar.f());
            kVar.d("href", "/favicon.ico");
            arrayList.add(kVar.a("href"));
        }
        return arrayList;
    }

    public static void w0(C0780t4 t4Var) {
        if (f11029o != -1) {
            try {
                Settings.System.putInt(t4Var.getContentResolver(), "screen_off_timeout", f11029o);
                f11029o = -1;
            } catch (Exception e8) {
                g.z(e8, new StringBuilder("Failed to un-keep screen on by advanced method due to "), "w0");
            }
        }
    }

    public static File x(Context context, String str) {
        if (str.contains("#")) {
            str = str.substring(0, str.indexOf("#"));
        }
        if (str.contains("?")) {
            str = str.substring(0, str.indexOf("?"));
        }
        return new File(a.F(context, a.j1(str).replace("http://localhost", "").replace("https://localhost", "")));
    }

    public static void x0(Context context, int i8, int i9) {
        int i10;
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int streamMaxVolume = audioManager.getStreamMaxVolume(i9);
            if (a.C0()) {
                i10 = audioManager.getStreamMinVolume(i9);
            } else {
                i10 = 0;
            }
            int i11 = (((streamMaxVolume - i10) * i8) / 100) + i10;
            O5.g.b(i9, i11);
            audioManager.setStreamVolume(i9, i11, 8);
            if (i9 != 2) {
                return;
            }
            if (i8 == 0) {
                audioManager.setRingerMode(0);
            } else {
                audioManager.setRingerMode(2);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, de.ozerov.fully.q0] */
    public static ArrayList y(long j7, int i8, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        ArrayList arrayList = new ArrayList();
        if (!(f11034t == null || (sQLiteDatabase = f11033s) == null)) {
            if (z) {
                str = "ASC";
            } else {
                str = "DESC";
            }
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM (SELECT * FROM fully_log WHERE _id>=" + j7 + " ORDER BY version " + str + ", time " + str + " limit " + i8 + ") ORDER BY version ASC, time ASC;", (String[]) null);
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                ? obj = new Object();
                obj.f10891a = rawQuery.getLong(0);
                obj.f10892b = rawQuery.getString(1);
                obj.f10893c = rawQuery.getLong(2);
                obj.f10894d = rawQuery.getString(3);
                obj.e = rawQuery.getString(4);
                obj.f10895f = rawQuery.getLong(5);
                arrayList.add(obj);
                rawQuery.moveToNext();
            }
            rawQuery.close();
        }
        return arrayList;
    }

    public static void y0(Context context, Integer num) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        for (Object g8 : audioManager.getAvailableCommunicationDevices()) {
            AudioDeviceInfo g9 = B3.a.g(g8);
            g9.getType();
            g9.getAddress();
            if (g9.getType() == num.intValue()) {
                audioManager.setCommunicationDevice(g9);
            }
        }
    }

    public static String z(boolean z) {
        ArrayList A8 = A(z, false);
        ArrayList arrayList = new ArrayList();
        Iterator it = A8.iterator();
        while (it.hasNext()) {
            arrayList.add(((InetAddress) it.next()).getCanonicalHostName());
        }
        return a.H0(arrayList);
    }

    public static void z0(Context context, String str) {
        try {
            if (a.r0()) {
                if (context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") != 0) {
                    return;
                }
            }
            BluetoothAdapter.getDefaultAdapter().setName(str);
        } catch (Exception e8) {
            e8.getMessage();
        }
    }

    public abstract void s0();

    public abstract void t0();
}
