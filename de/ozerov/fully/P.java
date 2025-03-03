package de.ozerov.fully;

import N.e;
import Q0.g;
import Z1.c;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.app.admin.DevicePolicyManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageStats;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.samsung.android.knox.container.KnoxContainerManager;
import d4.k;
import e2.C0831d;
import e2.C0832e;
import j2.C1122c;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;
import u.C1477r;
import x2.C1604c;

public abstract class P {

    /* renamed from: a  reason: collision with root package name */
    public static NfcAdapter f10233a;

    /* renamed from: b  reason: collision with root package name */
    public static int f10234b;

    /* renamed from: c  reason: collision with root package name */
    public static Tag f10235c;

    /* renamed from: d  reason: collision with root package name */
    public static final A2 f10236d = new Object();
    public static String e;

    /* renamed from: f  reason: collision with root package name */
    public static String f10237f;

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f10238g;

    /* renamed from: h  reason: collision with root package name */
    public static PackageStats f10239h;
    public static final /* synthetic */ int i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static volatile boolean f10240j;

    /* JADX WARNING: type inference failed for: r0v16, types: [com.scottyab.rootbeer.RootBeerNative, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6 A[SYNTHETIC, Splitter:B:28:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A(android.content.Context r17) {
        /*
            F2.e r0 = new F2.e
            r1 = 9
            r2 = 0
            r3 = r17
            r0.<init>(r3, r1, r2)
            java.lang.String r1 = "\n"
            java.lang.String r2 = "\\A"
            java.util.ArrayList r3 = new java.util.ArrayList
            java.lang.String[] r4 = J5.a.f2515a
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.<init>(r4)
            boolean r3 = r0.d(r3)
            r4 = 1
            if (r3 != 0) goto L_0x0234
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String[] r5 = J5.a.f2516b
            java.util.List r5 = java.util.Arrays.asList(r5)
            r3.addAll(r5)
            boolean r0 = r0.d(r3)
            if (r0 != 0) goto L_0x0234
            java.lang.String r3 = "su"
            boolean r0 = F2.e.b(r3)
            if (r0 != 0) goto L_0x0234
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r0 = "ro.debuggable"
            java.lang.String r6 = "1"
            r5.put(r0, r6)
            java.lang.String r0 = "ro.secure"
            java.lang.String r6 = "0"
            r5.put(r0, r6)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0075, NoSuchElementException -> 0x0073 }
            java.lang.String r7 = "getprop"
            java.lang.Process r0 = r0.exec(r7)     // Catch:{ IOException -> 0x0075, NoSuchElementException -> 0x0073 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0075, NoSuchElementException -> 0x0073 }
            if (r0 != 0) goto L_0x0061
        L_0x005f:
            r0 = 0
            goto L_0x007a
        L_0x0061:
            java.util.Scanner r7 = new java.util.Scanner     // Catch:{ IOException -> 0x0075, NoSuchElementException -> 0x0073 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0075, NoSuchElementException -> 0x0073 }
            java.util.Scanner r0 = r7.useDelimiter(r2)     // Catch:{ IOException -> 0x0075, NoSuchElementException -> 0x0073 }
            java.lang.String r0 = r0.next()     // Catch:{ IOException -> 0x0075, NoSuchElementException -> 0x0073 }
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ IOException -> 0x0075, NoSuchElementException -> 0x0073 }
            goto L_0x007a
        L_0x0073:
            r0 = move-exception
            goto L_0x0076
        L_0x0075:
            r0 = move-exception
        L_0x0076:
            r0.printStackTrace()
            goto L_0x005f
        L_0x007a:
            if (r0 != 0) goto L_0x007e
            r10 = 0
            goto L_0x00d4
        L_0x007e:
            int r8 = r0.length
            r9 = 0
            r10 = 0
        L_0x0081:
            if (r9 >= r8) goto L_0x00d4
            r11 = r0[r9]
            java.util.Set r12 = r5.keySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x008d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00d1
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = r11.contains(r13)
            if (r14 == 0) goto L_0x008d
            java.lang.Object r14 = r5.get(r13)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = "["
            java.lang.String r6 = "]"
            java.lang.String r6 = N.e.y(r15, r14, r6)
            boolean r14 = r11.contains(r6)
            if (r14 == 0) goto L_0x008d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r13)
            java.lang.String r13 = " = "
            r10.append(r13)
            r10.append(r6)
            java.lang.String r6 = " detected!"
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            N7.a.z(r6)
            r10 = 1
            goto L_0x008d
        L_0x00d1:
            int r9 = r9 + 1
            goto L_0x0081
        L_0x00d4:
            if (r10 != 0) goto L_0x0234
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x00fc, NoSuchElementException -> 0x00fa }
            java.lang.String r5 = "mount"
            java.lang.Process r0 = r0.exec(r5)     // Catch:{ IOException -> 0x00fc, NoSuchElementException -> 0x00fa }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x00fc, NoSuchElementException -> 0x00fa }
            if (r0 != 0) goto L_0x00e8
        L_0x00e6:
            r0 = 0
            goto L_0x0101
        L_0x00e8:
            java.util.Scanner r5 = new java.util.Scanner     // Catch:{ IOException -> 0x00fc, NoSuchElementException -> 0x00fa }
            r5.<init>(r0)     // Catch:{ IOException -> 0x00fc, NoSuchElementException -> 0x00fa }
            java.util.Scanner r0 = r5.useDelimiter(r2)     // Catch:{ IOException -> 0x00fc, NoSuchElementException -> 0x00fa }
            java.lang.String r0 = r0.next()     // Catch:{ IOException -> 0x00fc, NoSuchElementException -> 0x00fa }
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ IOException -> 0x00fc, NoSuchElementException -> 0x00fa }
            goto L_0x0101
        L_0x00fa:
            r0 = move-exception
            goto L_0x00fd
        L_0x00fc:
            r0 = move-exception
        L_0x00fd:
            r0.printStackTrace()
            goto L_0x00e6
        L_0x0101:
            if (r0 != 0) goto L_0x0106
            r6 = 0
            goto L_0x01a4
        L_0x0106:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = r0.length
            r5 = 0
            r6 = 0
        L_0x010b:
            if (r5 >= r2) goto L_0x01a4
            r8 = r0[r5]
            java.lang.String r9 = " "
            java.lang.String[] r9 = r8.split(r9)
            r10 = 23
            if (r1 > r10) goto L_0x011d
            int r11 = r9.length
            r12 = 4
            if (r11 < r12) goto L_0x0123
        L_0x011d:
            if (r1 <= r10) goto L_0x0130
            int r11 = r9.length
            r12 = 6
            if (r11 >= r12) goto L_0x0130
        L_0x0123:
            java.lang.String r9 = "Error formatting mount line: "
            java.lang.String r8 = r9.concat(r8)
            N7.a.d(r8)
        L_0x012c:
            r16 = r0
            goto L_0x019d
        L_0x0130:
            if (r1 <= r10) goto L_0x0139
            r11 = 2
            r11 = r9[r11]
            r12 = 5
            r9 = r9[r12]
            goto L_0x013e
        L_0x0139:
            r11 = r9[r4]
            r12 = 3
            r9 = r9[r12]
        L_0x013e:
            java.lang.String[] r12 = J5.a.f2518d
            r13 = 0
        L_0x0141:
            r14 = 7
            if (r13 >= r14) goto L_0x012c
            r14 = r12[r13]
            boolean r15 = r11.equalsIgnoreCase(r14)
            if (r15 == 0) goto L_0x0193
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 <= r10) goto L_0x015e
            java.lang.String r15 = "("
            java.lang.String r7 = ""
            java.lang.String r9 = r9.replace(r15, r7)
            java.lang.String r15 = ")"
            java.lang.String r9 = r9.replace(r15, r7)
        L_0x015e:
            java.lang.String r7 = ","
            java.lang.String[] r7 = r9.split(r7)
            int r15 = r7.length
            r10 = 0
        L_0x0166:
            if (r10 >= r15) goto L_0x0193
            r4 = r7[r10]
            r16 = r0
            java.lang.String r0 = "rw"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x018d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r4 = " path is mounted with rw permissions! "
            r0.append(r4)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            N7.a.z(r0)
            r6 = 1
            goto L_0x0195
        L_0x018d:
            int r10 = r10 + 1
            r0 = r16
            r4 = 1
            goto L_0x0166
        L_0x0193:
            r16 = r0
        L_0x0195:
            int r13 = r13 + 1
            r0 = r16
            r4 = 1
            r10 = 23
            goto L_0x0141
        L_0x019d:
            int r5 = r5 + 1
            r0 = r16
            r4 = 1
            goto L_0x010b
        L_0x01a4:
            if (r6 != 0) goto L_0x0234
            java.lang.String r0 = android.os.Build.TAGS
            if (r0 == 0) goto L_0x01b4
            java.lang.String r1 = "test-keys"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01b4
            r0 = 1
            goto L_0x01b5
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            if (r0 != 0) goto L_0x0234
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x01e2 }
            java.lang.String r1 = "which"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}     // Catch:{ all -> 0x01e2 }
            java.lang.Process r6 = r0.exec(r1)     // Catch:{ all -> 0x01e2 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x01e0 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x01e0 }
            java.io.InputStream r2 = r6.getInputStream()     // Catch:{ all -> 0x01e0 }
            r1.<init>(r2)     // Catch:{ all -> 0x01e0 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = r0.readLine()     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x01db
            r0 = 1
            goto L_0x01dc
        L_0x01db:
            r0 = 0
        L_0x01dc:
            r6.destroy()
            goto L_0x01ea
        L_0x01e0:
            goto L_0x01e4
        L_0x01e2:
            r6 = 0
        L_0x01e4:
            if (r6 == 0) goto L_0x01e9
            r6.destroy()
        L_0x01e9:
            r0 = 0
        L_0x01ea:
            if (r0 != 0) goto L_0x0234
            com.scottyab.rootbeer.RootBeerNative r0 = new com.scottyab.rootbeer.RootBeerNative
            boolean r0 = com.scottyab.rootbeer.RootBeerNative.f9557a
            if (r0 != 0) goto L_0x01fa
            java.lang.String r0 = "We could not load the native library to test for root"
            N7.a.d(r0)
            r0 = 0
            r1 = 1
            goto L_0x0227
        L_0x01fa:
            java.lang.String[] r0 = J5.a.a()
            int r1 = r0.length
            java.lang.String[] r2 = new java.lang.String[r1]
            r4 = 0
        L_0x0202:
            if (r4 >= r1) goto L_0x0214
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = r0[r4]
            java.lang.String r5 = N.e.A(r5, r6, r3)
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x0202
        L_0x0214:
            com.scottyab.rootbeer.RootBeerNative r0 = new com.scottyab.rootbeer.RootBeerNative
            r0.<init>()
            r1 = 1
            r0.setLogDebugMessages(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0225 }
            int r0 = r0.checkForRoot(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0225 }
            if (r0 <= 0) goto L_0x0226
            r0 = 1
            goto L_0x0227
        L_0x0225:
        L_0x0226:
            r0 = 0
        L_0x0227:
            if (r0 != 0) goto L_0x0235
            java.lang.String r0 = "magisk"
            boolean r0 = F2.e.b(r0)
            if (r0 == 0) goto L_0x0232
            goto L_0x0235
        L_0x0232:
            r4 = 0
            goto L_0x0236
        L_0x0234:
            r1 = 1
        L_0x0235:
            r4 = 1
        L_0x0236:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.P.A(android.content.Context):boolean");
    }

    public static boolean B() {
        if (a.q0()) {
            return true;
        }
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean C() {
        if (a.q0()) {
            return true;
        }
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                return true;
            }
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean D(Context context) {
        try {
            if (Settings.Secure.getString(context.getContentResolver(), "advertising_id") != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean E(Context context) {
        try {
            return context.getString(Resources.getSystem().getIdentifier("config_os_brand", "string", "android")).toLowerCase().contains("harmony");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean F(Context context) {
        if (!a.B0()) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(ConnectivityManager.class);
        try {
            String[] strArr = (String[]) connectivityManager.getClass().getDeclaredMethod("getTetheredIfaces", (Class[]) null).invoke(connectivityManager, (Object[]) null);
            if (strArr == null || strArr.length <= 0) {
                return false;
            }
            return true;
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Error in getTetheredIfaces: "), "P");
        }
    }

    public static boolean G(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!a.y0()) {
            return activityManager.isInLockTaskMode();
        }
        if (!a.y0()) {
            return false;
        }
        int b8 = activityManager.getLockTaskModeState();
        if (b8 == 1 || b8 == 2) {
            return true;
        }
        return false;
    }

    public static boolean H(Context context) {
        Boolean bool = f10238g;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i8 = -1;
        try {
            i8 = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (i8 == 1 || i8 == 2 || i8 == 4) {
            return true;
        }
        return false;
    }

    public static boolean I(String str) {
        if (str.equals("daydream:") || str.equals("launcher:") || str.startsWith("about:") || str.startsWith("javascript:") || str.startsWith("fully:") || str.startsWith("dim:") || str.startsWith("tasker:") || str.startsWith("intent:") || str.startsWith("assets:") || str.startsWith("mailto:")) {
            return true;
        }
        if ((str.startsWith("https:") || str.startsWith("http:")) && str.split("#").length > 2) {
            return false;
        }
        return str.matches("^(?:https?://|file:///?|rtsp://|market://|tcp://|ssl://|tls://|ws://|wss://)(?:\\S+(?::\\S*)?@)?(?:(?:0|[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-5])(?:\\.(?:0|[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-5])){3}|(?:\\[[a-fA-F0-9:.]+\\])|(?:(?:[a-zA-Z0-9\\u00a1-\\uffff][a-zA-Z0-9\\u00a1-\\uffff_-]{0,62})?[a-zA-Z0-9\\u00a1-\\uffff]\\.)+(?:[a-zA-Z0-9\\u00a1-\\uffff]{2,}\\.?)|(?:[a-zA-Z0-9\\u00a1-\\uffff_-]{2,}\\.?))(?::\\d{2,5})?(?:[/?#]\\S*)?$");
    }

    public static String J(String str) {
        String str2;
        String str3;
        int indexOf = str.indexOf(59);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
        } else {
            str2 = str;
        }
        String trim = str2.trim();
        if (!trim.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(trim);
            if (indexOf >= 0) {
                while (true) {
                    int i8 = indexOf + 1;
                    int i9 = i8;
                    boolean z = false;
                    boolean z6 = false;
                    while (i9 < str.length()) {
                        char charAt = str.charAt(i9);
                        if (charAt == ';') {
                            if (!z6) {
                                break;
                            }
                        } else if (!z && charAt == '\"') {
                            z6 = !z6;
                        }
                        if (z || charAt != '\\') {
                            z = false;
                        } else {
                            z = true;
                        }
                        i9++;
                    }
                    String trim2 = str.substring(i8, i9).trim();
                    if (!trim2.isEmpty()) {
                        arrayList.add(trim2);
                    }
                    if (i9 >= str.length()) {
                        break;
                    }
                    indexOf = i9;
                }
            }
            String str4 = null;
            int i10 = 1;
            while (i10 < arrayList.size()) {
                String str5 = (String) arrayList.get(i10);
                int indexOf2 = str5.indexOf(61);
                if (indexOf2 != -1) {
                    String substring = str5.substring(0, indexOf2);
                    int i11 = indexOf2 + 1;
                    if (!str5.startsWith("\"", i11) || !str5.endsWith("\"")) {
                        str3 = str5.substring(i11);
                    } else {
                        str3 = str5.substring(indexOf2 + 2, str5.length() - 1);
                    }
                    if (substring.equals("filename*")) {
                        int indexOf3 = str3.indexOf(39);
                        int indexOf4 = str3.indexOf(39, indexOf3 + 1);
                        if (indexOf3 == -1 || indexOf4 == -1) {
                            str4 = c(str3, StandardCharsets.US_ASCII);
                        } else {
                            Charset forName = Charset.forName(str3.substring(0, indexOf3).trim());
                            if (StandardCharsets.UTF_8.equals(forName) || StandardCharsets.ISO_8859_1.equals(forName)) {
                                str4 = c(str3.substring(indexOf4 + 1), forName);
                            } else {
                                throw new IllegalArgumentException("Charset should be UTF-8 or ISO-8859-1");
                            }
                        }
                    } else if (substring.equals("filename") && str4 == null) {
                        str4 = str3;
                    }
                    i10++;
                } else {
                    throw new IllegalArgumentException("Invalid content disposition format");
                }
            }
            return str4;
        }
        throw new IllegalArgumentException("Content-Disposition header must not be empty");
    }

    public static void K() {
        C0723k0 k0Var = new C0723k0();
        k0Var.f10766b = "reboot";
        k0Var.execute(new Void[0]);
    }

    public static String L(String str) {
        try {
            Process exec = Runtime.getRuntime().exec("su");
            DataOutputStream dataOutputStream = new DataOutputStream(exec.getOutputStream());
            dataOutputStream.writeBytes(str + "\n");
            dataOutputStream.writeBytes("exit\n");
            dataOutputStream.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append("\n");
                } else {
                    dataOutputStream.close();
                    return sb.toString();
                }
            }
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Failed to run root command due to "), "P");
            return "";
        }
    }

    public static void M(Context context, boolean z) {
        ComponentName componentName;
        if (C0794w0.Z(context)) {
            componentName = DeviceOwnerReceiver.a(context);
        } else {
            componentName = MyDeviceAdmin2.a(context);
        }
        try {
            ((DevicePolicyManager) context.getSystemService("device_policy")).setCameraDisabled(componentName, z);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static boolean N(Context context, String str) {
        ComponentName componentName;
        if (C0794w0.Z(context)) {
            componentName = DeviceOwnerReceiver.a(context);
        } else {
            componentName = MyDeviceAdmin2.a(context);
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        try {
            devicePolicyManager.setPasswordQuality(componentName, 65536);
            devicePolicyManager.setPasswordExpirationTimeout(componentName, 0);
            return devicePolicyManager.resetPassword(str, 1);
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Failed to set password due to "), "P");
            return false;
        }
    }

    public static void O() {
        C0723k0 k0Var = new C0723k0();
        k0Var.f10766b = "reboot -p";
        k0Var.execute(new Void[0]);
    }

    public static void P(Activity activity) {
        if (w(activity)) {
            Intent intent = new Intent(activity.getApplicationContext(), activity.getClass());
            intent.setFlags(536870912);
            PendingIntent activity2 = PendingIntent.getActivity(activity.getApplicationContext(), 0, intent, 33554432);
            String[][] strArr = new String[0][];
            IntentFilter[] intentFilterArr = {new IntentFilter()};
            intentFilterArr[0].addAction("android.nfc.action.NDEF_DISCOVERED");
            intentFilterArr[0].addCategory("android.intent.category.DEFAULT");
            intentFilterArr[0].addDataScheme("http");
            intentFilterArr[0].addDataScheme("https");
            intentFilterArr[0].addDataScheme("rtsp");
            intentFilterArr[0].addDataScheme(KnoxContainerManager.INTENT_BUNDLE);
            intentFilterArr[0].addDataScheme("fully");
            intentFilterArr[0].addDataScheme("javascript");
            NfcAdapter nfcAdapter = f10233a;
            if (nfcAdapter != null) {
                nfcAdapter.enableForegroundDispatch(activity, activity2, intentFilterArr, strArr);
            } else {
                Log.w("P", "Can't enable foreground dispatch as NFC adapter not available");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.Binder, android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Q(android.content.Context r8) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            android.content.Context r3 = r8.getApplicationContext()     // Catch:{ Exception -> 0x003b }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x003b }
            java.lang.Class r4 = r3.getClass()     // Catch:{ Exception -> 0x003b }
            java.lang.String r5 = "getPackageSizeInfo"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x003b }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r1] = r7     // Catch:{ Exception -> 0x003b }
            java.lang.Class<a.a> r7 = a.C0408a.class
            r6[r0] = r7     // Catch:{ Exception -> 0x003b }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ Exception -> 0x003b }
            android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x003b }
            java.lang.String r8 = r8.getPackageName()     // Catch:{ Exception -> 0x003b }
            de.ozerov.fully.e0 r5 = new de.ozerov.fully.e0     // Catch:{ Exception -> 0x003b }
            r5.<init>()     // Catch:{ Exception -> 0x003b }
            java.lang.String r6 = "android.content.pm.IPackageStatsObserver"
            r5.attachInterface(r5, r6)     // Catch:{ Exception -> 0x003b }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x003b }
            r2[r1] = r8     // Catch:{ Exception -> 0x003b }
            r2[r0] = r5     // Catch:{ Exception -> 0x003b }
            r4.invoke(r3, r2)     // Catch:{ Exception -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r8 = move-exception
            r8.getMessage()
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.P.Q(android.content.Context):void");
    }

    public static void R(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                e = new WebView(context).getSettings().getUserAgentString();
            }
            PackageInfo a8 = C1122c.a(context);
            if (a8 != null) {
                f10237f = a8.packageName;
            }
        } catch (Exception e8) {
            e = e8;
            Log.e("P", "Failed to update the Webview info due to " + e.getMessage());
        } catch (Error e9) {
            e = e9;
            Log.e("P", "Failed to update the Webview info due to " + e.getMessage());
        }
    }

    public static String a(String str) {
        String trim = str.trim();
        if (I(trim)) {
            return trim;
        }
        String replace = trim.replace(" /", "/").replace(" .", ".").replace(" ?", "?").replace(" &", "&").replace(" =", "=").replace("/ ", "/").replace(". ", ".").replace("? ", "?").replace("& ", "&").replace("= ", "=").replace(" ", "%20");
        if (!I(replace) && replace.matches("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5]).*$") && I("http://".concat(replace))) {
            replace = "http://".concat(replace);
        }
        if (I(replace)) {
            return replace;
        }
        if ((replace.contains(".") || replace.contains("/")) && I("https://".concat(replace))) {
            return "https://".concat(replace);
        }
        return replace;
    }

    public static void b(String str) {
        C0723k0 k0Var = new C0723k0();
        k0Var.f10766b = C1477r.d("pm clear ", str);
        k0Var.execute(new Void[0]);
    }

    public static String c(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("'input' String` should not be null");
        } else if (charset != null) {
            byte[] bytes = str.getBytes(charset);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i8 = 0;
            while (i8 < bytes.length) {
                byte b8 = bytes[i8];
                if ((b8 >= 48 && b8 <= 57) || ((b8 >= 97 && b8 <= 122) || ((b8 >= 65 && b8 <= 90) || b8 == 33 || b8 == 35 || b8 == 36 || b8 == 38 || b8 == 43 || b8 == 45 || b8 == 46 || b8 == 94 || b8 == 95 || b8 == 96 || b8 == 124 || b8 == 126))) {
                    byteArrayOutputStream.write((char) b8);
                    i8++;
                } else if (b8 != 37 || i8 >= bytes.length - 2) {
                    throw new IllegalArgumentException("Invalid header field parameter format (as defined in RFC 5987)");
                } else {
                    try {
                        byteArrayOutputStream.write(Integer.parseInt(String.valueOf(new char[]{(char) bytes[i8 + 1], (char) bytes[i8 + 2]}), 16));
                        i8 += 3;
                    } catch (NumberFormatException e8) {
                        throw new IllegalArgumentException("Invalid header field parameter format (as defined in RFC 5987)", e8);
                    }
                }
            }
            try {
                return byteArrayOutputStream.toString(charset.name());
            } catch (UnsupportedEncodingException e9) {
                throw new RuntimeException("Failed to copy contents of ByteArrayOutputStream into a String", e9);
            }
        } else {
            throw new IllegalArgumentException("'charset' should not be null");
        }
    }

    public static boolean d(Context context) {
        if (!a.B0()) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(ConnectivityManager.class);
        try {
            connectivityManager.getClass().getDeclaredMethod("stopTethering", new Class[]{Integer.TYPE}).invoke(connectivityManager, new Object[]{0});
            return true;
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("disableHotspot error: "), "P");
            return false;
        }
    }

    public static void e(Context context) {
        if (a.C0()) {
            try {
                if (context.checkSelfPermission("android.permission.ANSWER_PHONE_CALLS") == 0) {
                    ((TelecomManager) context.getSystemService("telecom")).endCall();
                    return;
                }
                Log.w("P", "No ANSWER_PHONE_CALLS permission granted, can't disconnect phone call");
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", (Class[]) null);
            declaredMethod.setAccessible(true);
            if (declaredMethod.invoke(telephonyManager, (Object[]) null) == null) {
                try {
                    throw null;
                } catch (Exception e9) {
                    e = e9;
                }
            } else {
                throw new ClassCastException();
            }
        } catch (Error e10) {
            e = e10;
            Log.e("P", "Failed to disconnect phone call due to " + e.getMessage());
        }
    }

    public static boolean f(Context context, C0794w0 w0Var) {
        Object obj;
        Class<?> cls;
        Class<?> cls2;
        if (!a.B0()) {
            return false;
        }
        File codeCacheDir = context.getCodeCacheDir();
        try {
            cls2 = Class.forName("android.net.ConnectivityManager$OnStartTetheringCallback");
        } catch (ClassNotFoundException e8) {
            try {
                e8.printStackTrace();
                cls2 = null;
            } catch (Exception e9) {
                g.x(e9, new StringBuilder("ProxyBuilder error: "), "P");
                obj = null;
            }
        }
        C1604c cVar = new C1604c(cls2);
        File file = new File(codeCacheDir, "v" + Integer.toString(1));
        cVar.f16263d = file;
        file.mkdir();
        cVar.f16262c = new F0(w0Var);
        obj = cVar.a();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(ConnectivityManager.class);
        try {
            Class<?> cls3 = connectivityManager.getClass();
            try {
                cls = Class.forName("android.net.ConnectivityManager$OnStartTetheringCallback");
            } catch (ClassNotFoundException e10) {
                e10.printStackTrace();
                cls = null;
            }
            cls3.getDeclaredMethod("startTethering", new Class[]{Integer.TYPE, Boolean.TYPE, cls, Handler.class}).invoke(connectivityManager, new Object[]{0, Boolean.FALSE, obj, null});
            return true;
        } catch (Exception e11) {
            g.x(e11, new StringBuilder("enableHotspot error: "), "P");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float g(android.content.Context r3) {
        /*
            r0 = -1
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ Exception -> 0x001c }
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch:{ Exception -> 0x001c }
            r2 = 0
            android.content.Intent r3 = r3.registerReceiver(r2, r1)     // Catch:{ Exception -> 0x001c }
            java.lang.String r1 = "level"
            int r1 = r3.getIntExtra(r1, r0)     // Catch:{ Exception -> 0x001c }
            java.lang.String r2 = "scale"
            int r3 = r3.getIntExtra(r2, r0)     // Catch:{ Exception -> 0x001a }
            goto L_0x0022
        L_0x001a:
            r3 = move-exception
            goto L_0x001e
        L_0x001c:
            r3 = move-exception
            r1 = -1
        L_0x001e:
            r3.printStackTrace()
            r3 = -1
        L_0x0022:
            if (r1 == r0) goto L_0x002f
            if (r3 != r0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            float r0 = (float) r1
            float r3 = (float) r3
            float r0 = r0 / r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r3
            return r0
        L_0x002f:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.P.g(android.content.Context):float");
    }

    public static float h(Context context) {
        try {
            return ((float) context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("temperature", -10)) / 10.0f;
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1.0f;
        }
    }

    public static String i(Context context) {
        String str;
        String str2;
        Context context2 = context;
        k kVar = new k(context2, 1);
        kVar.Q2();
        String G8 = C0794w0.G(context2, (String) null);
        char[] charArray = G8.toCharArray();
        for (int i8 = 0; i8 < charArray.length; i8++) {
            char c8 = charArray[i8];
            if (Character.isUpperCase(c8)) {
                charArray[i8] = Character.toLowerCase(c8);
            } else if (Character.isLowerCase(c8)) {
                charArray[i8] = Character.toUpperCase(c8);
            }
        }
        String str3 = new String(charArray);
        if (kVar.m() > 1076) {
            str = q(context);
        } else {
            str = Build.SERIAL;
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String hexString = Integer.toHexString(G8.hashCode());
        String hexString2 = Integer.toHexString(str3.hashCode());
        String hexString3 = Integer.toHexString(str.hashCode());
        if (string != null) {
            str2 = Integer.toHexString(string.hashCode());
        } else {
            str2 = "";
        }
        String f12 = kVar.f1();
        String r8 = ((c) kVar.f9767W).r("canonicalDeviceId", "");
        String[] strArr = {"0", "75b319f8", "b28f5e3a", "b5462562", "b6f1a37a", "998ce77b", "c3ae0d5d", "3aac0207", "3bbf8030", "d6a62298"};
        String[] strArr2 = {"d8967aa8", "ef05ac4a", "2c6edcf5", "3ed7cec1", "ba9c8c48", "110386a8", "e0f4bc00", "ff6d003f", "8e831700", "b906194e", "bff8be0d", "76d73921", "ce727456", "5f53fc59", "f0aa16ea", "858ff69b", "35f7400", "93678d1b", "a3f6827e", "293374", "acda8b47", "26b88429", "b906197b", "20e830f7", "64f6f0d7"};
        if (!f12.contains(hexString + "-") || Arrays.asList(strArr).contains(hexString)) {
            if (!f12.contains(hexString2 + "-") || Arrays.asList(strArr).contains(hexString2)) {
                if (!f12.contains("-" + hexString3) || Arrays.asList(strArr2).contains(hexString3)) {
                    if (!f12.contains(str2 + "-") || string == null || (!Arrays.asList(strArr).contains(hexString) && !Arrays.asList(strArr).contains(hexString2))) {
                        if (!f12.contains("-" + str2) || string == null || !Arrays.asList(strArr2).contains(hexString3)) {
                            if (!r8.contains(hexString + "-") || Arrays.asList(strArr).contains(hexString)) {
                                if (!r8.contains(hexString2 + "-") || Arrays.asList(strArr).contains(hexString2)) {
                                    if (!r8.contains("-" + hexString3) || Arrays.asList(strArr2).contains(hexString3)) {
                                        if (!r8.contains(str2 + "-") || string == null || (!Arrays.asList(strArr).contains(hexString) && !Arrays.asList(strArr).contains(hexString2))) {
                                            if (!r8.contains("-" + str2) || string == null || !Arrays.asList(strArr2).contains(hexString3)) {
                                                if (string == null) {
                                                    f12 = hexString + "-" + hexString3;
                                                } else if (!Arrays.asList(strArr).contains(hexString) && !Arrays.asList(strArr2).contains(hexString3)) {
                                                    f12 = hexString + "-" + hexString3;
                                                } else if (Arrays.asList(strArr).contains(hexString) && !Arrays.asList(strArr2).contains(hexString3)) {
                                                    f12 = str2 + "-" + hexString3;
                                                } else if (Arrays.asList(strArr).contains(hexString) || !Arrays.asList(strArr2).contains(hexString3)) {
                                                    f12 = str2 + "-" + str2;
                                                } else {
                                                    f12 = hexString + "-" + str2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f12 = r8;
                        }
                    }
                }
            }
        }
        kVar.V2("canonicalDeviceId", f12);
        return f12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0237 A[SYNTHETIC, Splitter:B:56:0x0237] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x024a A[Catch:{ Exception -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0267 A[SYNTHETIC, Splitter:B:74:0x0267] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02f4 A[Catch:{ Exception -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0318 A[Catch:{ Exception -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject j(android.content.Context r14) {
        /*
            r0 = 1
            java.lang.String r1 = "activity"
            java.lang.String r2 = "batteryLevel"
            java.lang.String r3 = "netstats"
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "deviceId"
            java.lang.String r6 = i(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "deviceName"
            java.lang.String r6 = de.ozerov.fully.C0794w0.t(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "packageName"
            java.lang.String r6 = r14.getPackageName()     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            android.location.Location r5 = de.ozerov.fully.Y.f10506b     // Catch:{ Exception -> 0x0062 }
            if (r5 == 0) goto L_0x0065
            java.lang.String r6 = "altitude"
            double r7 = r5.getAltitude()     // Catch:{ Exception -> 0x0062 }
            r4.put(r6, r7)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "longitude"
            android.location.Location r6 = de.ozerov.fully.Y.f10506b     // Catch:{ Exception -> 0x0062 }
            double r6 = r6.getLongitude()     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "latitude"
            android.location.Location r6 = de.ozerov.fully.Y.f10506b     // Catch:{ Exception -> 0x0062 }
            double r6 = r6.getLatitude()     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "locationProvider"
            android.location.Location r6 = de.ozerov.fully.Y.f10506b     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = r6.getProvider()     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "locationAccuracy"
            android.location.Location r6 = de.ozerov.fully.Y.f10506b     // Catch:{ Exception -> 0x0062 }
            float r6 = r6.getAccuracy()     // Catch:{ Exception -> 0x0062 }
            double r6 = (double) r6     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0065
        L_0x0062:
            r14 = move-exception
            goto L_0x03d5
        L_0x0065:
            float r5 = g(r14)     // Catch:{ Exception -> 0x0062 }
            int r5 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "isPlugged"
            boolean r6 = H(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "SSID"
            java.lang.String r6 = de.ozerov.fully.C0794w0.U(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "BSSID"
            java.lang.String r6 = de.ozerov.fully.C0794w0.S(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "Mac"
            r6 = 0
            java.lang.String r7 = de.ozerov.fully.C0794w0.G(r14, r6)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r7)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "ip4"
            java.lang.String r7 = de.ozerov.fully.C0794w0.C(r0, r0)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r7)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "ip6"
            r7 = 0
            java.lang.String r8 = de.ozerov.fully.C0794w0.C(r7, r0)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "hostname4"
            java.lang.String r8 = de.ozerov.fully.C0794w0.f11024j     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "hostname6"
            java.lang.String r8 = de.ozerov.fully.C0794w0.f11025k     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "wifiSignalLevel"
            int r8 = de.ozerov.fully.C0794w0.T(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "isMobileDataEnabled"
            boolean r8 = de.ozerov.fully.C0794w0.c0(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            boolean r5 = n2.a.B0()     // Catch:{ Exception -> 0x0062 }
            if (r5 == 0) goto L_0x00d7
            java.lang.String r5 = "isHotspotEnabled"
            boolean r8 = F(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
        L_0x00d7:
            java.lang.String r5 = "screenOrientation"
            int r8 = de.ozerov.fully.C0794w0.N(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "screenBrightness"
            int r8 = de.ozerov.fully.C0794w0.M(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "screenLocked"
            boolean r8 = de.ozerov.fully.C0794w0.g0(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "screenOn"
            boolean r8 = de.ozerov.fully.C0794w0.h0(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "displayState"
            java.lang.String r8 = "display"
            java.lang.Object r8 = r14.getSystemService(r8)     // Catch:{ Exception -> 0x0062 }
            android.hardware.display.DisplayManager r8 = (android.hardware.display.DisplayManager) r8     // Catch:{ Exception -> 0x0062 }
            android.view.Display[] r8 = r8.getDisplays()     // Catch:{ Exception -> 0x0062 }
            int r9 = r8.length     // Catch:{ Exception -> 0x0062 }
            r10 = 0
        L_0x010b:
            if (r10 >= r9) goto L_0x011c
            r11 = r8[r10]     // Catch:{ Exception -> 0x0062 }
            int r12 = r11.getDisplayId()     // Catch:{ Exception -> 0x0062 }
            if (r12 != 0) goto L_0x011a
            int r8 = r11.getState()     // Catch:{ Exception -> 0x0062 }
            goto L_0x011d
        L_0x011a:
            int r10 = r10 + r0
            goto L_0x010b
        L_0x011c:
            r8 = -1
        L_0x011d:
            r4.put(r5, r8)     // Catch:{ Exception -> 0x0062 }
            float r5 = g(r14)     // Catch:{ Exception -> 0x0062 }
            int r5 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "batteryTemperature"
            float r5 = h(r14)     // Catch:{ Exception -> 0x0062 }
            int r5 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "plugged"
            boolean r5 = H(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "keyguardLocked"
            boolean r5 = de.ozerov.fully.C0794w0.g0(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "locale"
            android.content.res.Resources r5 = r14.getResources()     // Catch:{ Exception -> 0x0062 }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ Exception -> 0x0062 }
            java.util.Locale r5 = r5.locale     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "serial"
            java.lang.String r5 = android.os.Build.SERIAL     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0062 }
            boolean r2 = de.ozerov.fully.C0794w0.Z(r14)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "phone"
            if (r2 == 0) goto L_0x01a2
            boolean r2 = n2.a.C0()     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x0181
            int r2 = r14.checkSelfPermission("android.permission.READ_PHONE_STATE")     // Catch:{ Exception -> 0x0062 }
            if (r2 != 0) goto L_0x0181
            java.lang.String r2 = "serialDo"
            java.lang.String r8 = q(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
        L_0x0181:
            java.lang.String r2 = "imei"
            java.lang.String r8 = k(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "simSerial"
            java.lang.Object r8 = r14.getSystemService(r5)     // Catch:{ Exception -> 0x0062 }
            android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8     // Catch:{ Exception -> 0x0062 }
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x019f
            java.lang.String r9 = r8.getSimSerialNumber()     // Catch:{ SecurityException -> 0x019b }
            goto L_0x019f
        L_0x019b:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ Exception -> 0x0062 }
        L_0x019f:
            r4.put(r2, r9)     // Catch:{ Exception -> 0x0062 }
        L_0x01a2:
            java.lang.String r2 = "version"
            java.lang.String r8 = "1.17.1"
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "versionCode"
            r8 = 101362(0x18bf2, float:1.42038E-40)
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "build"
            java.lang.String r8 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "model"
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "manufacturer"
            java.lang.String r8 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "androidVersion"
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "SDK"
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "foreground"
            java.lang.String r8 = de.ozerov.fully.C0794w0.r(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r2, r8)     // Catch:{ Exception -> 0x0062 }
            r8 = 1000(0x3e8, double:4.94E-321)
            android.content.ComponentName r2 = de.ozerov.fully.C0794w0.q(r14, r8)     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x01fc
            java.lang.String r8 = r2.getPackageName()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r9 = r14.getPackageName()     // Catch:{ Exception -> 0x0062 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0062 }
            if (r8 != 0) goto L_0x01fc
            java.lang.String r8 = "foregroundActivity"
            java.lang.String r2 = r2.flattenToShortString()     // Catch:{ Exception -> 0x0062 }
            r4.put(r8, r2)     // Catch:{ Exception -> 0x0062 }
        L_0x01fc:
            java.lang.String r2 = "isDeviceAdmin"
            boolean r8 = de.ozerov.fully.C0794w0.X(r14)     // Catch:{ Exception -> 0x0062 }
            if (r8 != 0) goto L_0x020c
            boolean r8 = de.ozerov.fully.C0794w0.Y(r14)     // Catch:{ Exception -> 0x0062 }
            if (r8 == 0) goto L_0x020b
            goto L_0x020c
        L_0x020b:
            r0 = 0
        L_0x020c:
            r4.put(r2, r0)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "isDeviceOwner"
            boolean r2 = de.ozerov.fully.C0794w0.Z(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r0, r2)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "internalStorageFreeSpace"
            java.io.File r2 = r14.getExternalFilesDir(r6)     // Catch:{ Exception -> 0x0062 }
            r7 = -1
            if (r2 == 0) goto L_0x022b
            long r9 = r2.getUsableSpace()     // Catch:{ Exception -> 0x0227 }
            goto L_0x022c
        L_0x0227:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x0062 }
        L_0x022b:
            r9 = r7
        L_0x022c:
            r4.put(r0, r9)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "internalStorageTotalSpace"
            java.io.File r2 = r14.getExternalFilesDir(r6)     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x0240
            long r9 = r2.getTotalSpace()     // Catch:{ Exception -> 0x023c }
            goto L_0x0241
        L_0x023c:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x0062 }
        L_0x0240:
            r9 = r7
        L_0x0241:
            r4.put(r0, r9)     // Catch:{ Exception -> 0x0062 }
            java.io.File r0 = n2.a.J(r14)     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x0274
            java.lang.String r0 = "externalStorageFreeSpace"
            java.io.File r2 = n2.a.J(r14)     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x025b
            long r9 = r2.getUsableSpace()     // Catch:{ Exception -> 0x0257 }
            goto L_0x025c
        L_0x0257:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x0062 }
        L_0x025b:
            r9 = r7
        L_0x025c:
            r4.put(r0, r9)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "externalStorageTotalSpace"
            java.io.File r2 = n2.a.J(r14)     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x0270
            long r9 = r2.getTotalSpace()     // Catch:{ Exception -> 0x026c }
            goto L_0x0271
        L_0x026c:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x0062 }
        L_0x0270:
            r9 = r7
        L_0x0271:
            r4.put(r0, r9)     // Catch:{ Exception -> 0x0062 }
        L_0x0274:
            java.lang.String r0 = "ramUsedMemory"
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x0062 }
            r2.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r9 = r14.getSystemService(r1)     // Catch:{ Exception -> 0x0062 }
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9     // Catch:{ Exception -> 0x0062 }
            r9.getMemoryInfo(r2)     // Catch:{ Exception -> 0x0062 }
            long r9 = r2.totalMem     // Catch:{ Exception -> 0x0062 }
            long r11 = r2.availMem     // Catch:{ Exception -> 0x0062 }
            long r9 = r9 - r11
            r4.put(r0, r9)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "ramFreeMemory"
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x0062 }
            r2.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r9 = r14.getSystemService(r1)     // Catch:{ Exception -> 0x0062 }
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9     // Catch:{ Exception -> 0x0062 }
            r9.getMemoryInfo(r2)     // Catch:{ Exception -> 0x0062 }
            long r9 = r2.availMem     // Catch:{ Exception -> 0x0062 }
            r4.put(r0, r9)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "ramTotalMemory"
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x0062 }
            r2.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r1 = r14.getSystemService(r1)     // Catch:{ Exception -> 0x0062 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ Exception -> 0x0062 }
            r1.getMemoryInfo(r2)     // Catch:{ Exception -> 0x0062 }
            long r1 = r2.totalMem     // Catch:{ Exception -> 0x0062 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "appUsedMemory"
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0062 }
            long r9 = r1.totalMemory()     // Catch:{ Exception -> 0x0062 }
            long r1 = r1.freeMemory()     // Catch:{ Exception -> 0x0062 }
            long r9 = r9 - r1
            r4.put(r0, r9)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "appFreeMemory"
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0062 }
            long r1 = r1.maxMemory()     // Catch:{ Exception -> 0x0062 }
            java.lang.Runtime r9 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0062 }
            long r10 = r9.totalMemory()     // Catch:{ Exception -> 0x0062 }
            long r12 = r9.freeMemory()     // Catch:{ Exception -> 0x0062 }
            long r10 = r10 - r12
            long r1 = r1 - r10
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "appTotalMemory"
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0062 }
            long r1 = r1.maxMemory()     // Catch:{ Exception -> 0x0062 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0062 }
            android.content.pm.PackageStats r0 = f10239h     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x0309
            java.lang.String r1 = "appCodeSize"
            long r9 = r0.codeSize     // Catch:{ Exception -> 0x0062 }
            r4.put(r1, r9)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r1 = "appDataSize"
            long r9 = r0.dataSize     // Catch:{ Exception -> 0x0062 }
            r4.put(r1, r9)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r1 = "appCacheSize"
            long r9 = r0.cacheSize     // Catch:{ Exception -> 0x0062 }
            r4.put(r1, r9)     // Catch:{ Exception -> 0x0062 }
        L_0x0309:
            java.lang.String r0 = "audioVolumes"
            org.json.JSONArray r1 = de.ozerov.fully.C0794w0.m(r14)     // Catch:{ Exception -> 0x0062 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0062 }
            boolean r0 = n2.a.y0()     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x03b6
            java.lang.String r0 = "rxBytesMobile"
            android.content.Context r1 = r14.getApplicationContext()     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0062 }
            android.app.usage.NetworkStatsManager r1 = de.ozerov.fully.C0814z2.f(r1)     // Catch:{ Exception -> 0x0062 }
            boolean r2 = n2.a.p0()     // Catch:{ Exception -> 0x0345 }
            if (r2 != 0) goto L_0x0337
            java.lang.Object r2 = r14.getSystemService(r5)     // Catch:{ Exception -> 0x0345 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x0345 }
            java.lang.String r2 = r2.getSubscriberId()     // Catch:{ Exception -> 0x0345 }
            goto L_0x0338
        L_0x0337:
            r2 = r6
        L_0x0338:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0345 }
            android.app.usage.NetworkStats$Bucket r1 = r1.querySummaryForDevice(0, r2, 0, r9)     // Catch:{ Exception -> 0x0345 }
            long r1 = r1.getRxBytes()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0346
        L_0x0345:
            r1 = r7
        L_0x0346:
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "txBytesMobile"
            android.content.Context r1 = r14.getApplicationContext()     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0062 }
            android.app.usage.NetworkStatsManager r1 = de.ozerov.fully.C0814z2.f(r1)     // Catch:{ Exception -> 0x0062 }
            boolean r2 = n2.a.p0()     // Catch:{ Exception -> 0x0376 }
            if (r2 != 0) goto L_0x0368
            java.lang.Object r2 = r14.getSystemService(r5)     // Catch:{ Exception -> 0x0376 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x0376 }
            java.lang.String r2 = r2.getSubscriberId()     // Catch:{ Exception -> 0x0376 }
            goto L_0x0369
        L_0x0368:
            r2 = r6
        L_0x0369:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0376 }
            android.app.usage.NetworkStats$Bucket r1 = r1.querySummaryForDevice(0, r2, 0, r9)     // Catch:{ Exception -> 0x0376 }
            long r1 = r1.getTxBytes()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0377
        L_0x0376:
            r1 = r7
        L_0x0377:
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "rxBytesWifi"
            android.content.Context r1 = r14.getApplicationContext()     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0062 }
            android.app.usage.NetworkStatsManager r1 = de.ozerov.fully.C0814z2.f(r1)     // Catch:{ Exception -> 0x0062 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0395 }
            android.app.usage.NetworkStats$Bucket r1 = r1.querySummaryForDevice(1, "", 0, r9)     // Catch:{ Exception -> 0x0395 }
            long r1 = r1.getRxBytes()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0396
        L_0x0395:
            r1 = r7
        L_0x0396:
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "txBytesWifi"
            android.content.Context r1 = r14.getApplicationContext()     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0062 }
            android.app.usage.NetworkStatsManager r1 = de.ozerov.fully.C0814z2.f(r1)     // Catch:{ Exception -> 0x0062 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x03b3 }
            android.app.usage.NetworkStats$Bucket r1 = r1.querySummaryForDevice(1, "", 0, r2)     // Catch:{ Exception -> 0x03b3 }
            long r7 = r1.getTxBytes()     // Catch:{ Exception -> 0x0062 }
        L_0x03b3:
            r4.put(r0, r7)     // Catch:{ Exception -> 0x0062 }
        L_0x03b6:
            android.content.pm.PackageManager r0 = r14.getPackageManager()     // Catch:{ all -> 0x03c3 }
            java.lang.String r14 = r14.getPackageName()     // Catch:{ all -> 0x03c3 }
            java.lang.String r6 = r0.getInstallerPackageName(r14)     // Catch:{ all -> 0x03c3 }
            goto L_0x03c4
        L_0x03c3:
        L_0x03c4:
            if (r6 == 0) goto L_0x03cb
            java.lang.String r14 = "installerSource"
            r4.put(r14, r6)     // Catch:{ Exception -> 0x0062 }
        L_0x03cb:
            java.lang.String r14 = "timestamp"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0062 }
            r4.put(r14, r0)     // Catch:{ Exception -> 0x0062 }
            goto L_0x03d8
        L_0x03d5:
            r14.printStackTrace()
        L_0x03d8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.P.j(android.content.Context):org.json.JSONObject");
    }

    public static String k(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getDeviceId();
            } catch (SecurityException e8) {
                e8.printStackTrace();
            }
        }
        return "";
    }

    public static String l(C0780t4 t4Var, String str) {
        k kVar = new k((Context) t4Var, 1);
        if (str.startsWith("file://")) {
            str = str.replace("file://", "http://fully-local-pdf/");
        }
        if (str.startsWith("content://")) {
            str = str.replace("content://", "http://fully-content-pdf/");
        }
        try {
            return a.L0(t4Var, "PDF.js/viewer4.html").replace("PDF_URL", e.x(str, "#pdf")).replace("PDFJS_DIST", ((c) kVar.f9767W).r("pdfJsDist", "https://unpkg.com/pdfjs-dist@4.7.76"));
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static C0832e m(Context context) {
        C0832e eVar = new C0832e(context);
        C0831d dVar = eVar.f11191U;
        dVar.i = new int[]{2131099714, 2131099715, 2131099695};
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
        dVar.f11183q = 30.0f;
        eVar.invalidateSelf();
        dVar.f11175h = 5.0f;
        dVar.f11170b.setStrokeWidth(5.0f);
        eVar.invalidateSelf();
        eVar.start();
        return eVar;
    }

    public static WebResourceResponse n(C0780t4 t4Var) {
        int i8;
        String str;
        String str2;
        String str3;
        String str4;
        C0780t4 t4Var2 = t4Var;
        int i9 = 1;
        k kVar = new k((Context) t4Var2, 1);
        StringBuilder sb = new StringBuilder("<!DOCTYPE html><html><head>\n<meta charset='UTF-8'>\n<meta name='viewport' content='width=device-width,initial-scale=1,user-scalable=no'>\n<title>Fully Universal Launcher</title>\n<style>\n* {margin:0;padding:0;}\nhtml {height:100%;}\nbody {font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; text-align:left; box-sizing:border-box; overflow-x:hidden; min-height:100%; }\n");
        c cVar = (c) kVar.f9767W;
        if (!kVar.N2(cVar.r("launcherBgUrl", "")).isEmpty()) {
            sb.append("body {background-image:url(\"" + a.m0(kVar.N2(cVar.r("launcherBgUrl", ""))) + "\");\nbackground-repeat: no-repeat;\nbackground-attachment: fixed;\nbackground-position: center;background-size:cover; }\n");
        }
        StringBuilder sb2 = new StringBuilder("body {background-color: ");
        sb2.append(String.format("#%06X", new Object[]{Integer.valueOf(cVar.q("appLauncherBackgroundColor", t4Var.getResources().getColor(2131099718)) & 16777215)}));
        sb2.append(";}\nbody {font-size: ");
        try {
            i8 = Integer.parseInt(cVar.r("appLauncherScaling", "0"));
        } catch (Exception unused) {
            i8 = 0;
        }
        sb2.append(i8);
        sb2.append("%;}\n");
        if (!kVar.c0().booleanValue() || !kVar.b0().equals(t4Var.getResources().getString(2131951776))) {
            str = "body {padding-top: 1em;}\n";
        } else {
            str = "body {padding-top: 2em;}\n";
        }
        sb2.append(str);
        sb2.append("div.app, div.bookmark {margin:0.5em 0.5em 0.5em 0.5em; float:left; width:5em;height:6em;overflow-x:hidden;overflow-y:hidden;border: 0px solid #555;}\na {text-decoration:none;}\na:focus-visible  {outline-color: #304FFE;}\ndiv.appIcon, div.bookmarkIcon {text-align:center;}\ndiv.appIcon img, div.bookmarkIcon img {width:4em;height:4em;text-align:center;}\ndiv.appName, div.bookmarkName {font-size:0.7em;line-height:1.25em;font-weight:bold;text-align:center;color: ");
        sb2.append(String.format("#%06X", new Object[]{Integer.valueOf(cVar.q("appLauncherTextColor", t4Var.getResources().getColor(2131099699)) & 16777215)}));
        sb2.append(";text-decoration:none;}\np.error {margin:2em; font-size:2em; color:red; text-align: center;}\n</style>\n<!-- Custom HTML will be injected here -->\n");
        sb2.append(cVar.r("launcherInjectCode", ""));
        sb2.append("</head>\n<body>\n");
        sb.append(sb2.toString());
        ArrayList c8 = C0664a1.c(t4Var);
        if (c8.isEmpty()) {
            sb.append("<p class='error'>No items selected to be shown on launcher. <br />Look in Settings >> Universal Launcher.</p>\n");
        } else {
            Iterator it = c8.iterator();
            while (it.hasNext()) {
                C0664a1 a1Var = (C0664a1) it.next();
                if (a1Var.f10547f == i9) {
                    if (a1Var.e != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        a.A(a1Var.e).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                        str2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    } else {
                        str2 = "";
                    }
                    String r8 = r(t4Var2, a1Var);
                    String str5 = a1Var.f10546d;
                    if (str5 == null || str5.isEmpty()) {
                        str3 = null;
                    } else {
                        str3 = a.m0(a.F(t4Var2, a1Var.f10546d));
                    }
                    if (r8 != null) {
                        if (a1Var.f10543a != null || ((str4 = a1Var.f10544b) != null && str4.startsWith("intent:"))) {
                            String str6 = a1Var.f10543a;
                            if (str6 == null || C0794w0.p(t4Var2, str6) != null) {
                                sb.append("<div class='app' id='" + a.N0(r8) + "'>\n");
                                sb.append("<a href='" + r8 + "'>\n");
                                if (str3 != null) {
                                    sb.append("<div class='appIcon'><img src='" + str3 + "' /></div>\n");
                                } else if (a1Var.e != null) {
                                    sb.append("<div class='appIcon'><img src='data:image/png;base64," + str2 + "' /></div>\n");
                                } else {
                                    sb.append("<div class='appIcon'><img src='' /></div>\n");
                                }
                                if (a1Var.f10545c != null) {
                                    sb.append("<div class='appName'>" + TextUtils.htmlEncode(a1Var.f10545c) + "</div>\n");
                                }
                                sb.append("</a>\n</div>\n");
                            }
                        } else if (a1Var.f10544b != null) {
                            sb.append("<div class='bookmark' id='" + a.N0(r8) + "'>\n");
                            sb.append("<a href='" + a.m0(r8) + "'>\n");
                            if (str3 != null) {
                                sb.append("<div class='bookmarkIcon'><img src='" + str3 + "' /></div>\n");
                            } else if (a1Var.e != null) {
                                sb.append("<div class='bookmarkIcon'><img src='data:image/png;base64," + str2 + "' /></div>\n");
                            } else {
                                sb.append("<div class='bookmarkIcon'><img src='' /></div>\n");
                            }
                            if (a1Var.f10545c != null) {
                                sb.append("<div class='bookmarkName'>" + TextUtils.htmlEncode(a1Var.f10545c) + "</div>\n");
                            }
                            sb.append("</a>\n</div>\n");
                        }
                    }
                    i9 = 1;
                }
            }
        }
        sb.append("</body></html>");
        try {
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(sb.toString().getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static WebResourceResponse o(C0780t4 t4Var, String str) {
        new k((Context) t4Var, 1);
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("fully://errorpage")) {
            String L02 = a.L0(t4Var, "parts/errorpage.html");
            if (L02 != null) {
                sb.append(L02.replace("$short_name", "Fully").replace("$slug", "fully-single-app"));
            }
        } else if (str.startsWith("fully://color")) {
            sb.append("<!DOCTYPE html>\n<html><head>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=no\">\n<title>Fully Color</title>\n<style>\n* {margin:0; padding:0; }\nbody {font-family: Arial, \"Helvetica Neue\", Helvetica, sans-serif; text-align:left; box-sizing:border-box; overflow-x:hidden; min-height:100%; }\nbody {background-color: " + str.replace("fully://color", "") + ";}\n</style>\n</head>\n<body>\n</body></html>");
        } else if (str.startsWith("fully://wallpaper")) {
            sb.append("<!DOCTYPE html>\n<html><head>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=no\">\n<title>Fully Wallpaper</title>\n<style>\n* {margin:0; padding:0; }\nbody {font-family: Arial, \"Helvetica Neue\", Helvetica, sans-serif; text-align:left; box-sizing:border-box; overflow-x:hidden; min-height:100%; }\nbody {background-color: #101010; }\ndiv#maindiv { font-size:1em; color:#303030; text-align: center; position: absolute; top: 50%; left: 50%; margin-right: -50%; transform: translate(-50%, -50%)  }\n</style>\n</head>\n<body>\n<div id=\"maindiv\">Use Your Own Wallpaper. <br />Look in Settings >> Playlist Settings <br /> >> Wallpaper URL</div>\n</body></html>");
        } else {
            sb.append("Unknown URL ".concat(str));
        }
        try {
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(sb.toString().getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static WebResourceResponse p(C0780t4 t4Var, String str) {
        try {
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(l(t4Var, str).getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static String q(Context context) {
        if (!a.C0() || !C0794w0.Z(context) || context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            return Build.SERIAL;
        }
        try {
            return Build.getSerial();
        } catch (Exception unused) {
            return Build.SERIAL;
        }
    }

    public static String r(C0780t4 t4Var, C0664a1 a1Var) {
        k kVar = new k((Context) t4Var, 1);
        if (a1Var.f10543a != null) {
            Intent intent = new Intent();
            intent.setComponent(C0794w0.p(t4Var, a1Var.f10543a));
            intent.setFlags(270532608);
            return a.o0(intent);
        }
        String str = a1Var.f10544b;
        if (str == null || !str.startsWith("file:")) {
            String str2 = a1Var.f10544b;
            if (str2 != null) {
                return str2;
            }
            return null;
        } else if (a1Var.f10544b.toLowerCase().endsWith(".pdf") && !kVar.i1().equals("0")) {
            return a1Var.f10544b;
        } else {
            if ((a1Var.f10544b.endsWith(".mp4") || a1Var.f10544b.endsWith(".webm") || a1Var.f10544b.endsWith(".mkv")) && kVar.D1().booleanValue()) {
                return a1Var.f10544b;
            }
            if (!a1Var.f10544b.toLowerCase().endsWith(".pdf") && !kVar.L1().equals("0")) {
                return a1Var.f10544b;
            }
            Intent e02 = a.e0(t4Var, a1Var.f10544b);
            e02.setFlags(268435456);
            e02.toString();
            return a.o0(e02);
        }
    }

    public static ArrayList s(C0780t4 t4Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = C0664a1.c(t4Var).iterator();
        while (it.hasNext()) {
            String r8 = r(t4Var, (C0664a1) it.next());
            if (r8 != null) {
                arrayList.add(r8);
            }
        }
        return arrayList;
    }

    public static String t(Context context) {
        String str = e;
        if (str != null) {
            return str;
        }
        R(context);
        return e;
    }

    public static void u(Tag tag, NdefMessage ndefMessage) {
        f10235c = tag;
        JSONArray jSONArray = new JSONArray();
        if (ndefMessage != null) {
            int length = ndefMessage.getRecords().length;
            try {
                for (NdefRecord ndefRecord : ndefMessage.getRecords()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", a.g(ndefRecord.getId()));
                    jSONObject.put("type", a.g(ndefRecord.getType()));
                    jSONObject.put("tnf", ndefRecord.getTnf());
                    jSONObject.put("payload", a.g(ndefRecord.getPayload()));
                    if (ndefRecord.toMimeType() != null) {
                        jSONObject.put("mimetype", ndefRecord.toMimeType());
                    }
                    if (ndefRecord.toUri() != null) {
                        jSONObject.put("uri", ndefRecord.toUri().toString());
                    }
                    jSONArray.put(jSONObject);
                }
            } catch (Exception e8) {
                g.z(e8, new StringBuilder("Failed to flatten the NDEF message to JSON due to "), "P");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("$serial", a.g(tag.getId()));
            hashMap.put("$message", jSONArray.toString().replace("\\/", "/"));
            U0.e("onNdefDiscovered", hashMap);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("$serial", a.g(tag.getId()));
        if (ndefMessage != null) {
            hashMap2.put("$type", "ndef");
            hashMap2.put("$message", jSONArray.toString().replace("\\/", "/"));
            hashMap2.put("$data", a.g(ndefMessage.toByteArray()));
        } else {
            hashMap2.put("$type", "unknown");
            hashMap2.put("$message", "");
            hashMap2.put("$data", "");
        }
        U0.e("onNfcTagDiscovered", hashMap2);
    }

    public static void v(Intent intent) {
        NdefMessage ndefMessage;
        Parcelable[] parcelableArrayExtra;
        if (intent != null) {
            if ("android.nfc.action.TECH_DISCOVERED".equals(intent.getAction()) || "android.nfc.action.TAG_DISCOVERED".equals(intent.getAction()) || "android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
                if (!"android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction()) || (parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")) == null || parcelableArrayExtra.length <= 0) {
                    ndefMessage = null;
                } else {
                    ndefMessage = (NdefMessage) parcelableArrayExtra[0];
                }
                Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
                if (tag != null) {
                    a.g(tag.getId());
                    u(tag, ndefMessage);
                }
            }
        }
    }

    public static boolean w(Activity activity) {
        if (f10233a == null) {
            f10233a = NfcAdapter.getDefaultAdapter(activity);
        }
        NfcAdapter nfcAdapter = f10233a;
        if (nfcAdapter == null) {
            Log.w("P", "No NFC adapter found");
            return false;
        } else if (nfcAdapter.isEnabled()) {
            return true;
        } else {
            Log.w("P", "NFC adapter disabled");
            return false;
        }
    }

    public static boolean x(Context context) {
        if (C0794w0.f0(context, "com.google.android.apps.searchlite") || C0794w0.f0(context, "com.google.android.apps.assistant")) {
            return true;
        }
        if (!C0794w0.f0(context, "com.google.android.gm.lite") || !C0794w0.f0(context, "com.google.android.apps.youtube.mango")) {
            return false;
        }
        return true;
    }

    public static boolean y(Context context) {
        if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static boolean z() {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        return true;
    }
}
