package de.ozerov.fully;

import C0.e;
import M7.b;
import N5.j;
import N5.p;
import P5.w;
import Q0.g;
import U.d;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.app.usage.NetworkStatsManager;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.location.Location;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import androidx.camera.lifecycle.c;
import d4.k;
import de.ozerov.fully.motiondetector.MotionDetectorService;
import de.ozerov.fully.motiondetector.MotionDetectorServiceX;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class U0 {
    public static final ArrayList i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public static int f10412j = 2378;

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap f10413k = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f10414a;

    /* renamed from: b  reason: collision with root package name */
    public final k f10415b;

    /* renamed from: c  reason: collision with root package name */
    public final MyWebView f10416c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap f10417d = new HashMap();
    public HashMap e;

    /* renamed from: f  reason: collision with root package name */
    public final H f10418f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f10419g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final e f10420h = new e(18, this);

    public U0(FullyActivity fullyActivity, MyWebView myWebView) {
        this.f10414a = fullyActivity;
        this.f10416c = myWebView;
        this.f10415b = fullyActivity.f9961z0;
        this.f10418f = new H(fullyActivity);
    }

    public static void a(U0 u02) {
        ArrayList arrayList = i;
        if (arrayList.contains(u02)) {
            arrayList.remove(u02);
        }
        u02.c();
        H h5 = u02.f10418f;
        if (!(h5.f9983c == null || h5.f9982b == null)) {
            h5.b();
        }
        HashMap hashMap = u02.f10419g;
        for (Map.Entry value : hashMap.entrySet()) {
            u02.f10414a.unregisterReceiver((BroadcastReceiver) value.getValue());
        }
        hashMap.clear();
    }

    public static void e(String str, HashMap hashMap) {
        ArrayList arrayList = i;
        if (arrayList.size() == 0) {
            f10413k.put(str, hashMap);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).d(str, hashMap);
        }
    }

    @JavascriptInterface
    public void addToHomeScreen() {
        this.f10414a.runOnUiThread(new S0(this, 1));
    }

    public final void b(String str, String str2, c cVar, boolean z) {
        FullyActivity fullyActivity = this.f10414a;
        String F8 = a.F(fullyActivity, str2);
        File file = new File(F8);
        if (!file.canWrite()) {
            a.b1(fullyActivity, "Folder " + F8 + " is not writable");
            return;
        }
        C0802x2 a8 = C0808y2.a(str, file, 0, new j5(), ((Z1.c) this.f10415b.f9767W).n("ignoreSSLerrors", false), this.f10416c.f10134n0);
        if (a8.f11070b != 200) {
            if (z) {
                a.b1(fullyActivity, "File download failed with code " + a8.f11070b + " " + a8.f11074g);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("$url", str);
            hashMap.put("$dir", F8);
            hashMap.put("$code", String.valueOf(a8.f11070b));
            d("onDownloadFailure", hashMap);
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("$url", str);
        hashMap2.put("$dir", F8);
        hashMap2.put("$code", String.valueOf(a8.f11070b));
        hashMap2.put("$lastModified", String.valueOf(a8.i));
        hashMap2.put("$fileLength", String.valueOf(a8.f11075h));
        hashMap2.put("$mimetype", String.valueOf(a8.e));
        d("onDownloadSuccess", hashMap2);
        if (cVar != null) {
            String str3 = a8.f11071c;
            U0 u02 = (U0) cVar.f7669V;
            u02.getClass();
            if (str3 != null && str != null) {
                FullyActivity fullyActivity2 = u02.f10414a;
                String F9 = a.F(fullyActivity2, str2);
                File file2 = new File(F9, str3);
                try {
                    a.i1(file2, new File(F9));
                    a.b1(fullyActivity2, "File download and unzipping completed");
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("$url", str);
                    hashMap3.put("$file", str3);
                    hashMap3.put("$dir", F9);
                    u02.d("onUnzipSuccess", hashMap3);
                    file2.delete();
                } catch (Exception e8) {
                    Log.e("JsInterface", "File unzipping failed");
                    e8.printStackTrace();
                    a.b1(fullyActivity2, "File unzipping failed with message " + e8.getMessage());
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("$url", str);
                    hashMap4.put("$file", str3);
                    hashMap4.put("$dir", F9);
                    hashMap4.put("$message", e8.getMessage());
                    u02.d("onUnzipFailure", hashMap4);
                }
            }
        } else if (z) {
            a.b1(fullyActivity, "File download completed");
        }
    }

    @JavascriptInterface
    public void bind(String str, String str2) {
        this.f10417d.put(str, str2);
    }

    @JavascriptInterface
    public void bringToBackground() {
        this.f10414a.runOnUiThread(new K0(this, 10));
    }

    @JavascriptInterface
    public void bringToForeground() {
        this.f10414a.runOnUiThread(new K0(this, 0));
    }

    @JavascriptInterface
    public void broadcastIntent(String str) {
        try {
            this.f10414a.sendBroadcast(a.P0(str));
        } catch (Exception e8) {
            g.z(e8, g.s("Can't send broadcast intent for ", str, " due to "), "JsInterface");
        }
    }

    @JavascriptInterface
    public void btClose() {
        this.f10418f.b();
    }

    @JavascriptInterface
    public String btGetDeviceInfoJson() {
        return this.f10418f.d();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:25|(1:27)|28|(4:30|(1:32)|42|33)|34|35|36|37|38|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00cf */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027 A[SYNTHETIC, Splitter:B:11:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String btGetDeviceListJson() {
        /*
            r10 = this;
            java.lang.String r0 = "H"
            de.ozerov.fully.H r1 = r10.f10418f
            r1.getClass()
            android.bluetooth.BluetoothAdapter r2 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x003c }
            r3 = 0
            if (r2 != 0) goto L_0x0015
            java.lang.String r2 = "No bluetooth adapter available"
            android.util.Log.w(r0, r2)     // Catch:{ Exception -> 0x003c }
        L_0x0013:
            r2 = r3
            goto L_0x0021
        L_0x0015:
            boolean r4 = r2.isEnabled()     // Catch:{ Exception -> 0x003c }
            if (r4 != 0) goto L_0x0021
            java.lang.String r2 = "Bluetooth adapter not enabled"
            android.util.Log.w(r0, r2)     // Catch:{ Exception -> 0x003c }
            goto L_0x0013
        L_0x0021:
            java.lang.String r3 = "[]"
            if (r2 != 0) goto L_0x0027
            goto L_0x00e4
        L_0x0027:
            boolean r4 = n2.a.r0()     // Catch:{ Exception -> 0x003c }
            if (r4 == 0) goto L_0x003f
            de.ozerov.fully.FullyActivity r1 = r1.f9981a     // Catch:{ Exception -> 0x003c }
            int r1 = r1.checkSelfPermission("android.permission.BLUETOOTH_CONNECT")     // Catch:{ Exception -> 0x003c }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = "Missing Bluetooth Connect permission for this operation"
            android.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x003c }
            goto L_0x00e4
        L_0x003c:
            r1 = move-exception
            goto L_0x00d8
        L_0x003f:
            java.util.Set r1 = r2.getBondedDevices()     // Catch:{ Exception -> 0x003c }
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "Failed to get the bluetooth devices list"
            android.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x003c }
            goto L_0x00e4
        L_0x004c:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x003c }
            r2.<init>()     // Catch:{ Exception -> 0x003c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x003c }
        L_0x0055:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x003c }
            if (r3 == 0) goto L_0x00d3
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x003c }
            android.bluetooth.BluetoothDevice r3 = (android.bluetooth.BluetoothDevice) r3     // Catch:{ Exception -> 0x003c }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x003c }
            r4.<init>()     // Catch:{ Exception -> 0x003c }
            java.lang.String r5 = "name"
            java.lang.String r6 = r3.getName()     // Catch:{ Exception -> 0x003c }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x003c }
            java.lang.String r5 = "address"
            java.lang.String r6 = r3.getAddress()     // Catch:{ Exception -> 0x003c }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x003c }
            java.lang.String r5 = "type"
            int r6 = r3.getType()     // Catch:{ Exception -> 0x003c }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x003c }
            boolean r5 = n2.a.q0()     // Catch:{ Exception -> 0x003c }
            if (r5 == 0) goto L_0x0090
            java.lang.String r5 = "alias"
            java.lang.String r6 = r3.getAlias()     // Catch:{ Exception -> 0x003c }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x003c }
        L_0x0090:
            java.lang.String r5 = "bondState"
            int r6 = r3.getBondState()     // Catch:{ Exception -> 0x003c }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x003c }
            android.os.ParcelUuid[] r5 = r3.getUuids()     // Catch:{ Exception -> 0x003c }
            if (r5 == 0) goto L_0x00bd
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x003c }
            r6.<init>()     // Catch:{ Exception -> 0x003c }
            int r7 = r5.length     // Catch:{ Exception -> 0x003c }
            r8 = 0
        L_0x00a6:
            if (r8 >= r7) goto L_0x00b8
            r9 = r5[r8]     // Catch:{ Exception -> 0x003c }
            java.util.UUID r9 = r9.getUuid()     // Catch:{ Exception -> 0x003c }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x003c }
            r6.put(r9)     // Catch:{ Exception -> 0x003c }
            int r8 = r8 + 1
            goto L_0x00a6
        L_0x00b8:
            java.lang.String r5 = "uuids"
            r4.put(r5, r6)     // Catch:{ Exception -> 0x003c }
        L_0x00bd:
            java.lang.String r5 = "batteryLevel"
            int r6 = de.ozerov.fully.H.c(r3)     // Catch:{ Exception -> 0x003c }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x003c }
            boolean r3 = de.ozerov.fully.H.e(r3)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r5 = "isConnected"
            r4.put(r5, r3)     // Catch:{ Exception -> 0x00cf }
        L_0x00cf:
            r2.put(r4)     // Catch:{ Exception -> 0x003c }
            goto L_0x0055
        L_0x00d3:
            java.lang.String r3 = r2.toString()     // Catch:{ Exception -> 0x003c }
            goto L_0x00e4
        L_0x00d8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to make a paired devices list due to "
            r2.<init>(r3)
            Q0.g.x(r1, r2, r0)
            java.lang.String r3 = ""
        L_0x00e4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.U0.btGetDeviceListJson():java.lang.String");
    }

    @JavascriptInterface
    public boolean btIsConnected() {
        H h5 = this.f10418f;
        if (h5.f9983c == null || h5.f9982b == null || !h5.f9982b.isConnected()) {
            return false;
        }
        return true;
    }

    @JavascriptInterface
    public void btOpenByMac(String str) {
        this.f10418f.f(str, (String) null, (String) null);
    }

    @JavascriptInterface
    public void btOpenByMacAndUuid(String str, String str2) {
        this.f10418f.f(str, str2, (String) null);
    }

    @JavascriptInterface
    public void btOpenByName(String str) {
        this.f10418f.f((String) null, (String) null, str);
    }

    @JavascriptInterface
    public void btOpenByNameAndUuid(String str, String str2) {
        this.f10418f.f((String) null, str2, str);
    }

    @JavascriptInterface
    public void btOpenByUuid(String str) {
        this.f10418f.f((String) null, str, (String) null);
    }

    @JavascriptInterface
    public boolean btSendByteData(byte[] bArr) {
        return this.f10418f.g(bArr);
    }

    @JavascriptInterface
    public boolean btSendHexData(String str) {
        H h5 = this.f10418f;
        h5.getClass();
        return h5.g(a.k0(str));
    }

    @JavascriptInterface
    public boolean btSendStringData(String str) {
        H h5 = this.f10418f;
        h5.getClass();
        return h5.g(str.getBytes());
    }

    public final void c() {
        try {
            this.e = new HashMap(this.f10417d);
        } catch (Exception e8) {
            e8.printStackTrace();
            this.e = null;
        }
        this.f10417d.clear();
    }

    @JavascriptInterface
    public boolean canResolveIntent(String str) {
        try {
            if (this.f10414a.getPackageManager().queryIntentActivities(a.P0(str), 0).size() > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            Log.w("JsInterface", "Can't resolve intent for " + str);
            return false;
        }
    }

    @JavascriptInterface
    public void checkKioskPin() {
        this.f10414a.runOnUiThread(new K0(this, 7));
    }

    @JavascriptInterface
    public void clearCache() {
        this.f10414a.runOnUiThread(new S0(this, 2));
    }

    @JavascriptInterface
    public void clearCookies() {
        this.f10414a.runOnUiThread(new K0(this, 16));
    }

    @JavascriptInterface
    public void clearCookiesForUrl(String str) {
        this.f10414a.runOnUiThread(new L0(this, str, 8));
    }

    @JavascriptInterface
    public void clearFormData() {
        this.f10414a.runOnUiThread(new S0(this, 7));
    }

    @JavascriptInterface
    public void clearHistory() {
        this.f10414a.runOnUiThread(new S0(this, 6));
    }

    @JavascriptInterface
    public void clearWebstorage() {
        this.f10414a.runOnUiThread(new C0663a0(1));
    }

    @JavascriptInterface
    public void closeTabByIndex(int i8) {
        this.f10414a.runOnUiThread(new O0(this, i8, 2));
    }

    @JavascriptInterface
    public void closeThisTab() {
        this.f10414a.runOnUiThread(new K0(this, 26));
    }

    @JavascriptInterface
    public void copyTextToClipboard(String str) {
        ((ClipboardManager) this.f10414a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("fully-single-app", str));
    }

    @JavascriptInterface
    public void crashMain() {
        this.f10414a.runOnUiThread(new C0663a0(3));
    }

    @JavascriptInterface
    public void crashMe() {
        int i8 = 1 / 0;
    }

    @JavascriptInterface
    public void crashThread() {
        new Thread(new C0663a0(2)).start();
    }

    @JavascriptInterface
    public void createFolder(String str) {
        new Thread(new L0(this, str, 1)).start();
    }

    public final void d(String str, HashMap hashMap) {
        String str2 = (String) this.f10417d.get(str);
        if (str2 != null) {
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    if (str4 == null) {
                        str2 = str2.replace(str3, "null");
                    } else {
                        b bVar = L7.a.f2714a;
                        bVar.getClass();
                        try {
                            StringWriter stringWriter = new StringWriter(str4.length() * 2);
                            int length = str4.length();
                            int i8 = 0;
                            while (i8 < length) {
                                int a8 = bVar.a(i8, stringWriter, str4);
                                if (a8 == 0) {
                                    char charAt = str4.charAt(i8);
                                    stringWriter.write(charAt);
                                    int i9 = i8 + 1;
                                    if (Character.isHighSurrogate(charAt) && i9 < length) {
                                        char charAt2 = str4.charAt(i9);
                                        if (Character.isLowSurrogate(charAt2)) {
                                            stringWriter.write(charAt2);
                                            i8 += 2;
                                        }
                                    }
                                    i8 = i9;
                                } else {
                                    for (int i10 = 0; i10 < a8; i10++) {
                                        i8 += Character.charCount(Character.codePointAt(str4, i8));
                                    }
                                }
                            }
                            str2 = str2.replace(str3, stringWriter.toString());
                        } catch (IOException e8) {
                            throw new UncheckedIOException(e8);
                        }
                    }
                }
            }
            FullyActivity fullyActivity = this.f10414a;
            if (fullyActivity.w()) {
                fullyActivity.runOnUiThread(new L0(this, str2, 10));
            }
        }
    }

    @JavascriptInterface
    public void deleteFile(String str) {
        if (str != null) {
            a.w(a.F(this.f10414a, str));
        }
    }

    @JavascriptInterface
    public void deleteFolder(String str) {
        if (str != null) {
            new Thread(new L0(this, str, 6)).start();
        }
    }

    @JavascriptInterface
    public void disableBluetooth() {
        C0794w0.f();
    }

    @JavascriptInterface
    public void disableMaintenanceMode() {
        this.f10414a.runOnUiThread(new K0(this, 25));
    }

    @JavascriptInterface
    public void disableWifi() {
        C0794w0.g(this.f10414a);
    }

    @JavascriptInterface
    public void downloadAndUnzipFile(String str, String str2) {
        if (str != null && str2 != null) {
            downloadAndUnzipFile(str, str2, true);
        }
    }

    @JavascriptInterface
    public void downloadFile(String str, String str2) {
        if (str != null && str2 != null) {
            downloadFile(str, str2, true);
        }
    }

    @JavascriptInterface
    public void emptyFolder(String str) {
        if (str != null) {
            new Thread(new L0(this, str, 2)).start();
        }
    }

    @JavascriptInterface
    public void enableBluetooth() {
        C0794w0.i();
    }

    @JavascriptInterface
    public void enableMaintenanceMode() {
        this.f10414a.runOnUiThread(new S0(this, 3));
    }

    @JavascriptInterface
    public void enableWifi() {
        C0794w0.j(this.f10414a);
    }

    @JavascriptInterface
    public void exit() {
        this.f10414a.runOnUiThread(new K0(this, 13));
    }

    @JavascriptInterface
    public void focusNextTab() {
        this.f10414a.runOnUiThread(new K0(this, 6));
    }

    @JavascriptInterface
    public void focusPrevTab() {
        this.f10414a.runOnUiThread(new K0(this, 2));
    }

    @JavascriptInterface
    public void focusTabByIndex(int i8) {
        this.f10414a.runOnUiThread(new O0(this, i8, 1));
    }

    @JavascriptInterface
    public void focusThisTab() {
        this.f10414a.runOnUiThread(new K0(this, 29));
    }

    @JavascriptInterface
    public void forceSleep() {
        this.f10414a.runOnUiThread(new K0(this, 12));
    }

    @JavascriptInterface
    public long getAllRxBytesMobile() {
        String str;
        FullyActivity fullyActivity = this.f10414a;
        NetworkStatsManager f8 = C0814z2.f(fullyActivity.getApplicationContext().getSystemService("netstats"));
        try {
            if (!a.p0()) {
                str = ((TelephonyManager) fullyActivity.getSystemService("phone")).getSubscriberId();
            } else {
                str = null;
            }
            return f8.querySummaryForDevice(0, str, 0, System.currentTimeMillis()).getRxBytes();
        } catch (Exception unused) {
            return -1;
        }
    }

    @JavascriptInterface
    public long getAllRxBytesWifi() {
        try {
            return C0814z2.f(this.f10414a.getApplicationContext().getSystemService("netstats")).querySummaryForDevice(1, "", 0, System.currentTimeMillis()).getRxBytes();
        } catch (Exception unused) {
            return -1;
        }
    }

    @JavascriptInterface
    public long getAllTxBytesMobile() {
        String str;
        FullyActivity fullyActivity = this.f10414a;
        NetworkStatsManager f8 = C0814z2.f(fullyActivity.getApplicationContext().getSystemService("netstats"));
        try {
            if (!a.p0()) {
                str = ((TelephonyManager) fullyActivity.getSystemService("phone")).getSubscriberId();
            } else {
                str = null;
            }
            return f8.querySummaryForDevice(0, str, 0, System.currentTimeMillis()).getTxBytes();
        } catch (Exception unused) {
            return -1;
        }
    }

    @JavascriptInterface
    public long getAllTxBytesWifi() {
        try {
            return C0814z2.f(this.f10414a.getApplicationContext().getSystemService("netstats")).querySummaryForDevice(1, "", 0, System.currentTimeMillis()).getTxBytes();
        } catch (Exception unused) {
            return -1;
        }
    }

    @JavascriptInterface
    public String getAndroidId() {
        return Settings.Secure.getString(this.f10414a.getContentResolver(), "android_id");
    }

    @JavascriptInterface
    public int getAndroidSdk() {
        return Build.VERSION.SDK_INT;
    }

    @JavascriptInterface
    public String getAndroidVersion() {
        return Build.VERSION.RELEASE;
    }

    @JavascriptInterface
    public int getAudioVolume(int i8) {
        return C0794w0.n(this.f10414a, i8);
    }

    @JavascriptInterface
    public float getBatteryLevel() {
        return P.g(this.f10414a);
    }

    @JavascriptInterface
    public float getBatteryTemperature() {
        return P.h(this.f10414a);
    }

    @JavascriptInterface
    public boolean getBooleanRawSetting(String str) {
        Boolean bool;
        Z1.c cVar = (Z1.c) this.f10415b.f9767W;
        if (((SharedPreferences) cVar.f6955V).contains(str)) {
            bool = Boolean.valueOf(cVar.n(str, false));
        } else {
            bool = null;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f A[RETURN] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getBooleanSetting(java.lang.String r4) {
        /*
            r3 = this;
            de.ozerov.fully.FullyActivity r0 = r3.f10414a
            de.ozerov.fully.s0 r0 = r0.f9932U0
            java.util.ArrayList r1 = r0.e
            boolean r1 = r1.contains(r4)
            r2 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000d:
            r4 = r2
            goto L_0x0028
        L_0x000f:
            d4.k r0 = r0.f10941d
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.Object r1 = r0.f6955V
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x000d
            r1 = 0
            boolean r4 = r0.n(r4, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x0028:
            if (r4 == 0) goto L_0x002f
            java.lang.String r4 = r4.toString()
            return r4
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.U0.getBooleanSetting(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public String getCamshotJpgBase64() {
        Bitmap d8;
        FullyActivity fullyActivity = this.f10414a;
        if (!fullyActivity.f9958x1.f() || (d8 = fullyActivity.f9958x1.d()) == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d8.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        d8.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    @JavascriptInterface
    public String getClipboardHtmlText() {
        try {
            return ((ClipboardManager) this.f10414a.getSystemService("clipboard")).getPrimaryClip().getItemAt(0).getHtmlText();
        } catch (Exception unused) {
            return null;
        }
    }

    @JavascriptInterface
    public String getClipboardText() {
        try {
            return ((ClipboardManager) this.f10414a.getSystemService("clipboard")).getPrimaryClip().getItemAt(0).getText().toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @JavascriptInterface
    public String getCurrentLocale() {
        return this.f10414a.getResources().getConfiguration().locale.toString();
    }

    @JavascriptInterface
    public int getCurrentTabIndex() {
        i5 i5Var = this.f10414a.f9917F0;
        g5 g5Var = i5Var.f10711d;
        if (g5Var != null) {
            ArrayList arrayList = i5Var.f10710c;
            if (arrayList.contains(g5Var)) {
                return arrayList.indexOf(i5Var.f10711d);
            }
        }
        return -1;
    }

    @JavascriptInterface
    public String getDeviceId() {
        return P.i(this.f10414a);
    }

    @JavascriptInterface
    public String getDeviceModel() {
        return Build.MODEL;
    }

    @JavascriptInterface
    public String getDeviceName() {
        return C0794w0.t(this.f10414a);
    }

    @JavascriptInterface
    public int getDisplayHeight() {
        return C0794w0.u(this.f10414a);
    }

    @JavascriptInterface
    public int getDisplayWidth() {
        return C0794w0.v(this.f10414a);
    }

    @JavascriptInterface
    public long getExternalStorageFreeSpace() {
        File J8 = a.J(this.f10414a);
        if (J8 == null) {
            return -1;
        }
        try {
            return J8.getUsableSpace();
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    @JavascriptInterface
    public long getExternalStorageTotalSpace() {
        File J8 = a.J(this.f10414a);
        if (J8 == null) {
            return -1;
        }
        try {
            return J8.getTotalSpace();
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    @JavascriptInterface
    public int getFaceNumber() {
        j jVar;
        int i8;
        Camera.Size size;
        byte[] bArr;
        Bitmap bitmap;
        N5.k kVar = this.f10414a.f9958x1;
        if (!kVar.f10066a) {
            return -1;
        }
        I i9 = kVar.f10069d;
        if (i9 instanceof MotionDetectorServiceX) {
            p pVar = ((MotionDetectorServiceX) i9).f10809V;
            if (pVar == null || (bitmap = pVar.f3433D) == null) {
                return -1;
            }
            return p.c(bitmap, pVar.f3434E).size();
        } else if (!(i9 instanceof MotionDetectorService) || (jVar = ((MotionDetectorService) i9).f10807V) == null || (i8 = jVar.z) != 17 || (size = jVar.f3420x) == null || (bArr = jVar.f3421y) == null) {
            return -1;
        } else {
            return j.b(bArr, size.width, size.height, i8, jVar.f3391A).size();
        }
    }

    @JavascriptInterface
    public String getFileList(String str) {
        File file = new File(a.F(this.f10414a, str));
        JSONArray jSONArray = new JSONArray();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (file2.isFile()) {
                        jSONObject.put("type", "file");
                    } else if (file2.isDirectory()) {
                        jSONObject.put("type", "folder");
                    } else {
                        jSONObject.put("type", "other");
                    }
                    jSONObject.put("name", file2.getName());
                    jSONObject.put("size", file2.length());
                    jSONObject.put("lastModified", file2.lastModified());
                    jSONObject.put("canRead", file2.canRead());
                    jSONObject.put("canWrite", file2.canWrite());
                    jSONObject.put("isHidden", file2.isHidden());
                    jSONArray.put(jSONObject);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
        return jSONArray.toString();
    }

    @JavascriptInterface
    public String getFullyVersion() {
        return "1.17.1";
    }

    @JavascriptInterface
    public int getFullyVersionCode() {
        return 101362;
    }

    @JavascriptInterface
    public String getHostname() {
        String z = C0794w0.z(true);
        if (!z.isEmpty()) {
            return z;
        }
        return C0794w0.z(false);
    }

    @JavascriptInterface
    public String getHostname4() {
        return C0794w0.z(true);
    }

    @JavascriptInterface
    public String getHostname6() {
        return C0794w0.z(false);
    }

    @JavascriptInterface
    public long getIdleTime() {
        FullyActivity fullyActivity = this.f10414a;
        if (fullyActivity.f9945h1.f10653f == -1) {
            return -1;
        }
        return System.currentTimeMillis() - fullyActivity.f9945h1.f10653f;
    }

    @JavascriptInterface
    public String getImei() {
        return P.k(this.f10414a);
    }

    @JavascriptInterface
    public long getInternalStorageFreeSpace() {
        File externalFilesDir = this.f10414a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return -1;
        }
        try {
            return externalFilesDir.getUsableSpace();
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    @JavascriptInterface
    public long getInternalStorageTotalSpace() {
        File externalFilesDir = this.f10414a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return -1;
        }
        try {
            return externalFilesDir.getTotalSpace();
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    @JavascriptInterface
    public String getIp4Address() {
        return C0794w0.C(true, false);
    }

    @JavascriptInterface
    public String getIp4Addresses() {
        return C0794w0.C(true, true);
    }

    @JavascriptInterface
    public String getIp6Address() {
        return C0794w0.C(false, false);
    }

    @JavascriptInterface
    public String getIp6Addresses() {
        return C0794w0.C(false, true);
    }

    @JavascriptInterface
    public String getIpAddress() {
        return C0794w0.B();
    }

    @JavascriptInterface
    public long getLastUserInteractionTime() {
        return this.f10414a.f9945h1.f10653f;
    }

    @JavascriptInterface
    public String getLocation() {
        JSONObject jSONObject = new JSONObject();
        try {
            Location location = Y.f10506b;
            if (location != null) {
                jSONObject.put("altitude", location.getAltitude());
                jSONObject.put("longitude", location.getLongitude());
                jSONObject.put("latitude", location.getLatitude());
                jSONObject.put("provider", location.getProvider());
                jSONObject.put("accuracy", (double) location.getAccuracy());
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject.toString().replace("\\/", "/");
    }

    @JavascriptInterface
    public String getMacAddress() {
        return C0794w0.G(this.f10414a, (String) null);
    }

    @JavascriptInterface
    public String getMacAddressForInterface(String str) {
        return C0794w0.G(this.f10414a, str);
    }

    @JavascriptInterface
    public String getRawSettingKeys(String str) {
        Map<String, ?> all = ((SharedPreferences) ((Z1.c) this.f10415b.f9767W).f6955V).getAll();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : all.entrySet()) {
            if (((String) next.getKey()).startsWith(str)) {
                arrayList.add((String) next.getKey());
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray.toString();
    }

    @JavascriptInterface
    public int getScreenBrightness() {
        return C0794w0.M(this.f10414a);
    }

    @JavascriptInterface
    public boolean getScreenOn() {
        return C0794w0.h0(this.f10414a);
    }

    @JavascriptInterface
    public int getScreenOrientation() {
        return C0794w0.N(this.f10414a);
    }

    @JavascriptInterface
    public String getScreenshotPngBase64() {
        try {
            synchronized (this.f10420h) {
                this.f10414a.runOnUiThread(this.f10420h);
                this.f10420h.wait();
            }
            Bitmap bitmap = C0794w0.f11026l;
            if (bitmap == null) {
                return "";
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    @JavascriptInterface
    public String getSensorInfo() {
        return this.f10414a.f9937Z0.a().toString();
    }

    @JavascriptInterface
    public float getSensorValue(int i8) {
        float[] b8 = this.f10414a.f9937Z0.b(i8);
        if (b8 == null || b8.length < 1) {
            return Float.NaN;
        }
        return b8[0];
    }

    @JavascriptInterface
    public String getSensorValues(int i8) {
        float[] b8 = this.f10414a.f9937Z0.b(i8);
        if (b8 != null && b8.length >= 1) {
            try {
                return new JSONArray(b8).toString();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return "[]";
    }

    @JavascriptInterface
    public String getSerialNumber() {
        return Build.SERIAL;
    }

    @JavascriptInterface
    public String getSerialNumberDeviceOwner() {
        return P.q(this.f10414a);
    }

    @JavascriptInterface
    public int getSettingsGlobalInt(String str, int i8) {
        return Settings.Global.getInt(this.f10414a.getContentResolver(), str, i8);
    }

    @JavascriptInterface
    public long getSettingsGlobalLong(String str, long j7) {
        return Settings.Global.getLong(this.f10414a.getContentResolver(), str, j7);
    }

    @JavascriptInterface
    public String getSettingsGlobalString(String str) {
        return Settings.Global.getString(this.f10414a.getContentResolver(), str);
    }

    @JavascriptInterface
    public int getSettingsSecureInt(String str, int i8) {
        return Settings.Secure.getInt(this.f10414a.getContentResolver(), str, i8);
    }

    @JavascriptInterface
    public long getSettingsSecureLong(String str, long j7) {
        return Settings.Secure.getLong(this.f10414a.getContentResolver(), str, j7);
    }

    @JavascriptInterface
    public String getSettingsSecureString(String str) {
        return Settings.Secure.getString(this.f10414a.getContentResolver(), str);
    }

    @JavascriptInterface
    public int getSettingsSystemInt(String str, int i8) {
        return Settings.System.getInt(this.f10414a.getContentResolver(), str, i8);
    }

    @JavascriptInterface
    public long getSettingsSystemLong(String str, long j7) {
        return Settings.System.getLong(this.f10414a.getContentResolver(), str, j7);
    }

    @JavascriptInterface
    public String getSettingsSystemString(String str) {
        return Settings.System.getString(this.f10414a.getContentResolver(), str);
    }

    @JavascriptInterface
    public String getSimSerialNumber() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10414a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getSimSerialNumber();
        } catch (SecurityException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    @JavascriptInterface
    public String getStartUrl() {
        return this.f10415b.h2();
    }

    @JavascriptInterface
    public String getStringRawSetting(String str) {
        return ((Z1.c) this.f10415b.f9767W).r(str, (String) null);
    }

    @JavascriptInterface
    public String getStringSetting(String str) {
        C0770s0 s0Var = this.f10414a.f9932U0;
        if (s0Var.e.contains(str)) {
            return null;
        }
        return ((Z1.c) s0Var.f10941d.f9767W).r(str, (String) null);
    }

    @JavascriptInterface
    public String getTabList() {
        i5 i5Var = this.f10414a.f9917F0;
        i5Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = i5Var.f10710c.iterator();
        while (it.hasNext()) {
            arrayList.add(((g5) it.next()).e());
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = arrayList.iterator();
        int i8 = 0;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            JSONObject jSONObject = new JSONObject();
            int i9 = i8 + 1;
            try {
                jSONObject.put("index", i8);
                jSONObject.put("currentUrl", str);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            i8 = i9;
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString().replace("\\/", "/");
    }

    @JavascriptInterface
    public int getThisTabIndex() {
        i5 i5Var = this.f10414a.f9917F0;
        g5 webTab = this.f10416c.getWebTab();
        if (webTab != null) {
            ArrayList arrayList = i5Var.f10710c;
            if (arrayList.contains(webTab)) {
                return arrayList.indexOf(webTab);
            }
        } else {
            i5Var.getClass();
        }
        return -1;
    }

    @JavascriptInterface
    public String getWebviewProvider() {
        String str = P.f10237f;
        if (str != null) {
            return str;
        }
        P.R(this.f10414a);
        return P.f10237f;
    }

    @JavascriptInterface
    public String getWebviewUa() {
        return P.t(this.f10414a);
    }

    @JavascriptInterface
    public String getWebviewVersion() {
        String t8 = P.t(this.f10414a);
        if (t8 == null) {
            return "";
        }
        Matcher matcher = Pattern.compile("Chrome/([0-9.]*)").matcher(t8);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    @JavascriptInterface
    public String getWifiBssid() {
        return C0794w0.S(this.f10414a);
    }

    @JavascriptInterface
    public int getWifiSignalLevel() {
        return C0794w0.T(this.f10414a);
    }

    @JavascriptInterface
    public String getWifiSsid() {
        return C0794w0.U(this.f10414a);
    }

    @JavascriptInterface
    public void hideKeyboard() {
        C0794w0.V(this.f10414a);
    }

    @JavascriptInterface
    public void importSettingsFile(String str) {
        if (str != null) {
            new T0(this, str, 1).run();
        }
    }

    @JavascriptInterface
    public void initTts() {
        this.f10414a.f9915D0.b((Runnable) null, (String) null);
    }

    @JavascriptInterface
    public void installApkFile(String str) {
        new T0(this, str, 0).start();
    }

    @JavascriptInterface
    public boolean isBluetoothEnabled() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }

    @JavascriptInterface
    public boolean isInDaydream() {
        return this.f10414a.f9943f1.f11046f;
    }

    @JavascriptInterface
    public boolean isInForeground() {
        return this.f10414a.f10980u0;
    }

    @JavascriptInterface
    public boolean isInScreensaver() {
        return this.f10414a.f9943f1.f11044c;
    }

    @JavascriptInterface
    public boolean isKeyboardVisible() {
        return C0794w0.f11032r;
    }

    @JavascriptInterface
    public boolean isKioskLocked() {
        return this.f10414a.f9921J0.i();
    }

    @JavascriptInterface
    public boolean isMobileDataEnabled(Context context) {
        return C0794w0.c0(context);
    }

    @JavascriptInterface
    public boolean isMotionDetectionRunning() {
        return this.f10414a.f9958x1.f();
    }

    @JavascriptInterface
    public boolean isMusicActive() {
        return C0794w0.d0(this.f10414a);
    }

    @JavascriptInterface
    public boolean isNetworkConnected() {
        return C0794w0.e0(this.f10414a);
    }

    @JavascriptInterface
    public boolean isPlugged() {
        return P.H(this.f10414a);
    }

    @JavascriptInterface
    public boolean isScreenRotationLocked() {
        int i8;
        try {
            i8 = Settings.System.getInt(this.f10414a.getContentResolver(), "accelerometer_rotation");
        } catch (Settings.SettingNotFoundException unused) {
            i8 = 1;
        }
        if (i8 == 0) {
            return true;
        }
        return false;
    }

    @JavascriptInterface
    public boolean isWifiConnected() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f10414a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    @JavascriptInterface
    public boolean isWifiEnabled() {
        WifiManager wifiManager = (WifiManager) this.f10414a.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.isWifiEnabled();
        }
        return false;
    }

    @JavascriptInterface
    public boolean isWiredHeadsetOn() {
        return ((AudioManager) this.f10414a.getSystemService("audio")).isWiredHeadsetOn();
    }

    @JavascriptInterface
    public boolean isWssConnected() {
        this.f10414a.f9936Y0.getClass();
        return false;
    }

    @JavascriptInterface
    public void killBackgroundProcesses(String str) {
        try {
            ((ActivityManager) this.f10414a.getApplicationContext().getSystemService("activity")).killBackgroundProcesses(str);
        } catch (Exception unused) {
            Log.w("JsInterface", "Can't kill background processes for " + str);
        }
    }

    @JavascriptInterface
    public void killMyProcess() {
        d dVar = this.f10414a.f9919H0;
        dVar.getClass();
        FullyActivity fullyActivity = (FullyActivity) dVar.f5257V;
        Intent intent = new Intent(fullyActivity, ForegroundService.class);
        intent.setAction("com.fullykiosk.singleapp.action.kill_main_process");
        intent.putExtra("processId", Process.myPid());
        fullyActivity.startService(intent);
    }

    @JavascriptInterface
    public void loadStartUrl() {
        this.f10414a.runOnUiThread(new K0(this, 18));
    }

    @JavascriptInterface
    public String loadStatsCSV() {
        StringBuilder sb = new StringBuilder();
        C0794w0.P0(C0794w0.f11018b);
        ArrayList E8 = C0794w0.E(65000);
        if (E8 != null) {
            sb.append(C0800x0.b());
            Iterator it = E8.iterator();
            while (it.hasNext()) {
                sb.append(((C0800x0) it.next()).c());
            }
        }
        return sb.toString();
    }

    @JavascriptInterface
    public void loadUrlInNewTab(String str, boolean z) {
        this.f10414a.runOnUiThread(new C7.c(this, z, str));
    }

    @JavascriptInterface
    public void loadUrlInTabByIndex(int i8, String str) {
        this.f10414a.runOnUiThread(new P0.g((Object) this, i8, (Object) str, 2));
    }

    @JavascriptInterface
    public void lockKiosk() {
        this.f10414a.runOnUiThread(new K0(this, 15));
    }

    @JavascriptInterface
    public void log(int i8, String str, String str2) {
        C0794w0.q0(i8, str, str2);
    }

    @JavascriptInterface
    public boolean nfcScanStart() {
        FullyActivity fullyActivity = this.f10414a;
        if (!P.w(fullyActivity)) {
            return false;
        }
        P.f10233a.enableReaderMode(fullyActivity, P.f10236d, 31, (Bundle) null);
        P.f10234b = 1000;
        P.f10235c = null;
        return true;
    }

    @JavascriptInterface
    public boolean nfcScanStop() {
        NfcAdapter nfcAdapter = P.f10233a;
        if (nfcAdapter == null) {
            return false;
        }
        nfcAdapter.disableReaderMode(this.f10414a);
        P.f10233a = null;
        P.f10235c = null;
        return true;
    }

    @JavascriptInterface
    public void openBluetoothSettings() {
        try {
            this.f10414a.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
        } catch (Exception unused) {
            Log.w("JsInterface", "Can't open Bluetooth settings");
        }
    }

    @JavascriptInterface
    public void openWifiSettings() {
        try {
            this.f10414a.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        } catch (Exception unused) {
            Log.w("JsInterface", "Can't open Wifi settings");
        }
    }

    @JavascriptInterface
    public void playSound(String str, boolean z) {
        FullyActivity fullyActivity = this.f10414a;
        fullyActivity.f9913C0.c();
        fullyActivity.f9913C0.a(str, z, false, 3);
    }

    @JavascriptInterface
    public void playTtsSilence(long j7) {
        FullyActivity fullyActivity = this.f10414a;
        if (!fullyActivity.f9915D0.c(j7)) {
            a.b1(fullyActivity, "TTS failed");
        }
    }

    @JavascriptInterface
    public void playVideo(String str, boolean z, boolean z6, boolean z8, boolean z9) {
        this.f10414a.runOnUiThread(new w(this, str, z, z6, z8, z9, 1));
    }

    @JavascriptInterface
    public void playerNext() {
    }

    @JavascriptInterface
    public void playerPause() {
    }

    @JavascriptInterface
    public void playerResume() {
    }

    @JavascriptInterface
    public void playerStart() {
    }

    @JavascriptInterface
    public void playerStop() {
    }

    @JavascriptInterface
    public void print() {
        this.f10414a.runOnUiThread(new K0(this, 17));
    }

    @JavascriptInterface
    public void print2Pdf(String str) {
        this.f10414a.runOnUiThread(new L0(this, str, 9));
    }

    @JavascriptInterface
    public boolean putSettingsGlobalInt(String str, int i8) {
        try {
            return Settings.Global.putInt(this.f10414a.getContentResolver(), str, i8);
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to write Settings.Global due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public boolean putSettingsGlobalLong(String str, long j7) {
        try {
            return Settings.Global.putLong(this.f10414a.getContentResolver(), str, j7);
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to write Settings.Global due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public boolean putSettingsGlobalString(String str, String str2) {
        FullyActivity fullyActivity = this.f10414a;
        try {
            if (Settings.Global.putString(fullyActivity.getContentResolver(), str, str2)) {
                return true;
            }
            if (!C0794w0.Z(fullyActivity)) {
                return false;
            }
            ((DevicePolicyManager) fullyActivity.getSystemService("device_policy")).setGlobalSetting(DeviceOwnerReceiver.a(fullyActivity), str, str2);
            return true;
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to write Settings.Global due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public boolean putSettingsSecureInt(String str, int i8) {
        try {
            return Settings.Secure.putInt(this.f10414a.getContentResolver(), str, i8);
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to write Settings.Secure due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public boolean putSettingsSecureLong(String str, long j7) {
        try {
            return Settings.Secure.putLong(this.f10414a.getContentResolver(), str, j7);
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to write Settings.Secure due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public boolean putSettingsSecureString(String str, String str2) {
        FullyActivity fullyActivity = this.f10414a;
        try {
            if (Settings.Secure.putString(fullyActivity.getContentResolver(), str, str2)) {
                return true;
            }
            if (!C0794w0.Z(fullyActivity) || !a.C0()) {
                return false;
            }
            ((DevicePolicyManager) fullyActivity.getSystemService("device_policy")).setSecureSetting(DeviceOwnerReceiver.a(fullyActivity), str, str2);
            return true;
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to write Settings.Secure due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public boolean putSettingsSystemInt(String str, int i8) {
        try {
            return Settings.System.putInt(this.f10414a.getContentResolver(), str, i8);
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to write Settings.System due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public boolean putSettingsSystemLong(String str, long j7) {
        try {
            return Settings.System.putLong(this.f10414a.getContentResolver(), str, j7);
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to write Settings.System due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public boolean putSettingsSystemString(String str, String str2) {
        FullyActivity fullyActivity = this.f10414a;
        try {
            if (Settings.System.putString(fullyActivity.getContentResolver(), str, str2)) {
                return true;
            }
            if (!C0794w0.Z(fullyActivity) || !a.C0()) {
                return false;
            }
            ((DevicePolicyManager) fullyActivity.getSystemService("device_policy")).setSystemSetting(DeviceOwnerReceiver.a(fullyActivity), str, str2);
            return true;
        } catch (Exception e8) {
            g.z(e8, new StringBuilder("Failed to write Settings.System due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public String readFile(String str) {
        if (str == null) {
            return "";
        }
        try {
            return a.a0(str);
        } catch (Exception e8) {
            g.z(e8, g.s("Failed to read file ", str, " due to "), "JsInterface");
            return "";
        }
    }

    @JavascriptInterface
    public void reboot() {
        this.f10414a.runOnUiThread(new K0(this, 27));
    }

    @JavascriptInterface
    public void rebootRecovery() {
        this.f10414a.runOnUiThread(new S0(this, 0));
    }

    @JavascriptInterface
    public void registerBroadcastReceiver(String str) {
        unregisterBroadcastReceiver(str);
        M m8 = new M(1);
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addCategory("android.intent.category.DEFAULT");
        boolean B02 = a.B0();
        FullyActivity fullyActivity = this.f10414a;
        if (B02) {
            fullyActivity.registerReceiver(m8, intentFilter, 2);
        } else {
            fullyActivity.registerReceiver(m8, intentFilter);
        }
        this.f10419g.put(str, m8);
    }

    @JavascriptInterface
    public void removeRawSetting(String str) {
        Z1.c cVar = (Z1.c) this.f10415b.f9767W;
        if (((SharedPreferences) cVar.f6955V).contains(str)) {
            SharedPreferences.Editor edit = ((SharedPreferences) cVar.f6955V).edit();
            edit.remove(str);
            k.e(edit, false);
        }
    }

    @JavascriptInterface
    public void requestFocus() {
        this.f10414a.runOnUiThread(new K0(this, 24));
    }

    @JavascriptInterface
    public void resetWebview() {
        this.f10414a.runOnUiThread(new K0(this, 9));
    }

    @JavascriptInterface
    public void restartApp() {
        this.f10414a.runOnUiThread(new K0(this, 21));
    }

    @JavascriptInterface
    public void restoreScreenBrightness() {
        this.f10414a.runOnUiThread(new K0(this, 8));
    }

    @JavascriptInterface
    public void resume() {
        this.f10414a.runOnUiThread(new K0(this, 1));
    }

    @JavascriptInterface
    public String runAdbCommand(String str) {
        return P.L(str);
    }

    @JavascriptInterface
    public void runCommand(String str) {
        this.f10414a.runOnUiThread(new L0(this, str, 4));
    }

    @JavascriptInterface
    public String runSuCommand(String str) {
        return P.L(str);
    }

    @JavascriptInterface
    public void scanQrCode(String str, String str2) {
        if (this.f10415b.M().booleanValue()) {
            this.f10414a.runOnUiThread(new R0(this, str, str2, 1));
        }
    }

    @JavascriptInterface
    public void sendHexDataToTcpPort(String str, String str2, int i8) {
        new Thread(new C0747o0(this, str2, i8, str, 1)).start();
    }

    @JavascriptInterface
    public void sendWssMessage(String str) {
        this.f10414a.f9936Y0.getClass();
    }

    @JavascriptInterface
    public void setActionBarTitle(String str) {
        this.f10414a.runOnUiThread(new L0(this, str, 5));
    }

    @JavascriptInterface
    public void setAudioVolume(int i8, int i9) {
        C0794w0.x0(this.f10414a, i8, i9);
    }

    @JavascriptInterface
    public void setBooleanRawSetting(String str, boolean z) {
        this.f10415b.R2(str, z);
    }

    @JavascriptInterface
    public void setBooleanSetting(String str, boolean z) {
        FullyActivity fullyActivity = this.f10414a;
        if (fullyActivity.f9932U0.m(str, Boolean.valueOf(z))) {
            fullyActivity.runOnUiThread(new S0(this, 5));
        }
    }

    @JavascriptInterface
    public void setIntRawSetting(String str, int i8) {
        this.f10415b.S2(i8, str);
    }

    @JavascriptInterface
    public void setMessageOverlay(String str) {
        this.f10414a.runOnUiThread(new L0(this, str, 3));
    }

    @JavascriptInterface
    public void setOverlayMessage(String str) {
        this.f10414a.runOnUiThread(new L0(this, str, 0));
    }

    @JavascriptInterface
    public void setScreenBrightness(int i8) {
        this.f10414a.runOnUiThread(new O0(this, i8, 0));
    }

    @JavascriptInterface
    public void setStartUrl(String str) {
        this.f10414a.f9932U0.n("startURL", str);
    }

    @JavascriptInterface
    public void setStringRawSetting(String str, String str2) {
        this.f10415b.V2(str, str2);
    }

    @JavascriptInterface
    public void setStringSetting(String str, String str2) {
        FullyActivity fullyActivity = this.f10414a;
        if (fullyActivity.f9932U0.n(str, str2)) {
            fullyActivity.runOnUiThread(new S0(this, 4));
        }
    }

    @JavascriptInterface
    public void shareUrl() {
        this.f10414a.runOnUiThread(new K0(this, 19));
    }

    @JavascriptInterface
    public void showKeyboard() {
        FullyActivity fullyActivity = this.f10414a;
        View currentFocus = fullyActivity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) fullyActivity.getSystemService("input_method")).toggleSoftInputFromWindow(currentFocus.getWindowToken(), 2, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c0  */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showNotification(java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = "com.fullykiosk.singleapp.action.notification_click"
            java.lang.Class<de.ozerov.fully.MainActivity> r2 = de.ozerov.fully.MainActivity.class
            java.lang.String r3 = "JsInterface"
            de.ozerov.fully.FullyActivity r4 = r6.f10414a
            if (r9 == 0) goto L_0x0038
            boolean r5 = r9.isEmpty()
            if (r5 != 0) goto L_0x0038
            java.lang.String r5 = "intent:"
            boolean r5 = r9.startsWith(r5)
            if (r5 == 0) goto L_0x0027
            android.content.Intent r9 = n2.a.P0(r9)     // Catch:{ Exception -> 0x001e }
            goto L_0x0039
        L_0x001e:
            java.lang.String r9 = "Failed to parse intentUrl for notification"
            android.util.Log.e(r3, r9)
            n2.a.b1(r4, r9)
            goto L_0x0038
        L_0x0027:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r4, r2)
            r5.setAction(r1)
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r5.setData(r9)
            r9 = r5
            goto L_0x0039
        L_0x0038:
            r9 = 0
        L_0x0039:
            if (r9 != 0) goto L_0x0043
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r4, r2)
            r9.setAction(r1)
        L_0x0043:
            r1 = 0
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r9 = android.app.PendingIntent.getActivity(r4, r1, r9, r2)
            android.app.Notification$Builder r1 = new android.app.Notification$Builder
            r1.<init>(r4)
            android.app.Notification$Builder r2 = r1.setContentTitle(r7)
            android.app.Notification$Builder r7 = r2.setTicker(r7)
            android.app.Notification$Builder r7 = r7.setContentText(r8)
            r8 = 2131230974(0x7f0800fe, float:1.8078016E38)
            android.app.Notification$Builder r7 = r7.setSmallIcon(r8)
            android.app.Notification$Builder r7 = r7.setContentIntent(r9)
            android.app.Notification$Builder r7 = r7.setPriority(r10)
            r7.setAutoCancel(r0)
            if (r10 == 0) goto L_0x0073
            r7 = -1
            r1.setDefaults(r7)
        L_0x0073:
            android.content.res.Resources r7 = r4.getResources()
            r8 = 2131099714(0x7f060042, float:1.781179E38)
            int r7 = r7.getColor(r8)
            r1.setColor(r7)
            boolean r7 = n2.a.B0()
            java.lang.String r8 = "notification"
            if (r7 == 0) goto L_0x00a7
            java.lang.Object r7 = r4.getSystemService(r8)
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7
            android.app.NotificationChannel r9 = de.ozerov.fully.C0735m0.d()
            r7.createNotificationChannel(r9)
            android.app.NotificationChannel r9 = de.ozerov.fully.C0735m0.D()
            r7.createNotificationChannel(r9)
            if (r10 == 0) goto L_0x00a2
            java.lang.String r7 = "4567"
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r7 = "4566"
        L_0x00a4:
            r1.setChannelId(r7)
        L_0x00a7:
            java.lang.Object r7 = r4.getSystemService(r8)
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7
            boolean r8 = n2.a.z0()
            if (r8 == 0) goto L_0x00c0
            boolean r8 = r7.areNotificationsEnabled()
            if (r8 == 0) goto L_0x00ba
            goto L_0x00c0
        L_0x00ba:
            java.lang.String r7 = "Notifications are disabled"
            android.util.Log.w(r3, r7)
            goto L_0x00cc
        L_0x00c0:
            int r8 = f10412j
            int r0 = r0 + r8
            f10412j = r0
            android.app.Notification r9 = r1.build()
            r7.notify(r8, r9)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.U0.showNotification(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    @JavascriptInterface
    public void showPdf(String str) {
        this.f10414a.runOnUiThread(new L0(this, str, 7));
    }

    @JavascriptInterface
    public void showToast(String str) {
        a.b1(this.f10414a, str);
    }

    @JavascriptInterface
    public void shutdown() {
        this.f10414a.runOnUiThread(new K0(this, 4));
    }

    @JavascriptInterface
    public void startActivityForResult(String str, String str2, String str3, String str4, int i8) {
        Intent intent = new Intent();
        if (str != null) {
            try {
                intent.setAction(str);
            } catch (Exception e8) {
                Log.w("JsInterface", "Can't start app for " + a.o0(intent) + " due to " + e8.getMessage());
                return;
            }
        }
        if (str2 != null) {
            intent.setData(Uri.parse(str2));
        }
        if (str3 != null) {
            intent.setType(str3);
        }
        if (str4 != null) {
            intent.addCategory(str4);
        }
        intent.setFlags(i8);
        this.f10414a.startActivityForResult(intent, 1026);
        a.o0(intent);
    }

    @JavascriptInterface
    public void startApplication(String str) {
        FullyActivity fullyActivity = this.f10414a;
        try {
            fullyActivity.startActivity(C0794w0.F(fullyActivity, str));
        } catch (Exception e8) {
            g.z(e8, g.s("Can't start app ", str, " due to "), "JsInterface");
        }
    }

    @JavascriptInterface
    public void startDaydream() {
        this.f10414a.runOnUiThread(new K0(this, 3));
    }

    @JavascriptInterface
    public void startIntent(String str) {
        try {
            this.f10414a.startActivity(a.P0(str));
        } catch (Exception e8) {
            g.z(e8, g.s("Can't start intent for ", str, " due to "), "JsInterface");
        }
    }

    @JavascriptInterface
    public void startIntentBySending(String str) {
        try {
            PendingIntent.getActivity(this.f10414a, 0, a.P0(str), 335544320).send();
        } catch (Exception e8) {
            g.z(e8, g.s("Can't start intent for ", str, " due to "), "JsInterface");
        }
    }

    @JavascriptInterface
    public void startIntentByService(String str) {
        this.f10414a.f9919H0.k(str);
    }

    @JavascriptInterface
    public void startIntentForResult(String str) {
        try {
            this.f10414a.startActivityForResult(a.P0(str), 1026);
        } catch (Exception e8) {
            g.z(e8, g.s("Can't start intent for ", str, " due to "), "JsInterface");
        }
    }

    @JavascriptInterface
    public void startMotionDetection() {
        this.f10414a.f9958x1.b();
    }

    @JavascriptInterface
    public void startScreensaver() {
        this.f10414a.runOnUiThread(new S0(this, 8));
    }

    @JavascriptInterface
    public void stopDaydream() {
        this.f10414a.runOnUiThread(new K0(this, 28));
    }

    @JavascriptInterface
    public void stopMotionDetection() {
        this.f10414a.f9958x1.c();
    }

    @JavascriptInterface
    public void stopScreensaver() {
        this.f10414a.runOnUiThread(new K0(this, 14));
    }

    @JavascriptInterface
    public void stopSound() {
        this.f10414a.f9913C0.c();
    }

    @JavascriptInterface
    public void stopTextToSpeech() {
        TextToSpeech textToSpeech = (TextToSpeech) this.f10414a.f9915D0.f5586b;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    @JavascriptInterface
    public void stopVideo() {
        this.f10414a.runOnUiThread(new K0(this, 20));
    }

    @JavascriptInterface
    public void textToSpeech(String str, String str2, String str3, int i8) {
        FullyActivity fullyActivity = this.f10414a;
        if (!fullyActivity.f9915D0.f(str, i8, str2, str3)) {
            a.b1(fullyActivity, "TTS failed or locale not available");
        }
    }

    @JavascriptInterface
    public void triggerMotion() {
        this.f10414a.runOnUiThread(new K0(this, 11));
    }

    @JavascriptInterface
    public void triggerPendingEvents() {
        HashMap hashMap = f10413k;
        for (Map.Entry entry : hashMap.entrySet()) {
            e((String) entry.getKey(), (HashMap) entry.getValue());
        }
        hashMap.clear();
    }

    @JavascriptInterface
    public void turnScreenOff() {
        C0794w0.J0(this.f10414a, false);
    }

    @JavascriptInterface
    public void turnScreenOn() {
        this.f10414a.runOnUiThread(new K0(this, 22));
    }

    @JavascriptInterface
    public void unlockKiosk() {
        this.f10414a.runOnUiThread(new K0(this, 23));
    }

    @JavascriptInterface
    public void unregisterBroadcastReceiver(String str) {
        HashMap hashMap = this.f10419g;
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) hashMap.get(str);
        if (broadcastReceiver != null) {
            this.f10414a.unregisterReceiver(broadcastReceiver);
            hashMap.remove(str);
        }
    }

    @JavascriptInterface
    public void unzipFile(String str, String str2) {
        if (str != null && str2 != null) {
            new Thread(new R0(this, str, str2, 0)).start();
        }
    }

    @JavascriptInterface
    public void vibrate(int i8) {
        Vibrator vibrator = (Vibrator) this.f10414a.getSystemService("vibrator");
        if (!vibrator.hasVibrator()) {
            return;
        }
        if (!a.p0()) {
            vibrator.vibrate((long) i8);
            return;
        }
        vibrator.vibrate(VibrationEffect.createOneShot((long) i8, -1), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
    }

    @JavascriptInterface
    public boolean writeFile(String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Exception e8) {
            g.z(e8, g.s("Failed to write to file ", str, " due to "), "JsInterface");
            return false;
        }
    }

    @JavascriptInterface
    public void bringToForeground(long j7) {
        new Handler(this.f10414a.getMainLooper()).postDelayed(new K0(this, 5), j7);
    }

    @JavascriptInterface
    public void downloadAndUnzipFile(String str, String str2, boolean z) {
        if (str != null && str2 != null) {
            new Thread(new M0(this, str, str2, z, 0)).start();
        }
    }

    @JavascriptInterface
    public void downloadFile(String str, String str2, boolean z) {
        if (str != null && str2 != null) {
            new Thread(new M0(this, str, str2, z, 1)).start();
        }
    }

    @JavascriptInterface
    public void initTts(String str) {
        this.f10414a.f9915D0.b((Runnable) null, str);
    }

    @JavascriptInterface
    public void turnScreenOff(boolean z) {
        C0794w0.J0(this.f10414a, z);
    }

    @JavascriptInterface
    public void playSound(String str, boolean z, int i8) {
        FullyActivity fullyActivity = this.f10414a;
        fullyActivity.f9913C0.c();
        fullyActivity.f9913C0.a(str, z, false, i8);
    }

    @JavascriptInterface
    public void scanQrCode(String str, String str2, int i8, long j7, boolean z, boolean z6) {
        if (this.f10415b.M().booleanValue()) {
            this.f10414a.runOnUiThread(new P0(this, str, str2, i8, j7, z, z6));
        }
    }

    @JavascriptInterface
    public void textToSpeech(String str, String str2, String str3) {
        FullyActivity fullyActivity = this.f10414a;
        if (!fullyActivity.f9915D0.f(str, 1, str2, str3)) {
            a.b1(fullyActivity, "TTS failed or locale not available");
        }
    }

    @JavascriptInterface
    public boolean nfcScanStart(int i8, int i9) {
        FullyActivity fullyActivity = this.f10414a;
        if (!P.w(fullyActivity)) {
            return false;
        }
        P.f10233a.enableReaderMode(fullyActivity, P.f10236d, i8, (Bundle) null);
        P.f10234b = i9;
        P.f10235c = null;
        return true;
    }

    @JavascriptInterface
    public void scanQrCode(String str, String str2, int i8, long j7, boolean z, boolean z6, boolean z8) {
        if (this.f10415b.M().booleanValue()) {
            this.f10414a.runOnUiThread(new Q0(this, str, str2, i8, j7, z, z6, z8));
        }
    }

    @JavascriptInterface
    public void textToSpeech(String str, String str2) {
        FullyActivity fullyActivity = this.f10414a;
        if (!fullyActivity.f9915D0.f(str, 1, str2, (String) null)) {
            a.b1(fullyActivity, "TTS failed or locale not available");
        }
    }

    @JavascriptInterface
    public void scanQrCode(String str, String str2, int i8, long j7, boolean z, boolean z6, boolean z8, boolean z9) {
        if (this.f10415b.M().booleanValue()) {
            this.f10414a.runOnUiThread(new N0(this, str, str2, i8, j7, z, z6, z8, z9));
        }
    }

    @JavascriptInterface
    public void textToSpeech(String str) {
        FullyActivity fullyActivity = this.f10414a;
        if (!fullyActivity.f9915D0.f(str, 1, (String) null, (String) null)) {
            a.b1(fullyActivity, "TTS failed or locale not available");
        }
    }

    @JavascriptInterface
    public void startApplication(String str, String str2, String str3) {
        try {
            Intent intent = new Intent();
            if (str2 != null) {
                intent.setAction(str2);
            }
            if (str3 != null) {
                intent.setData(Uri.parse(str3));
            }
            if (str != null) {
                intent.setPackage(str);
            }
            this.f10414a.startActivity(intent);
        } catch (Exception e8) {
            g.z(e8, g.s("Can't start app ", str, " due to "), "JsInterface");
        }
    }
}
