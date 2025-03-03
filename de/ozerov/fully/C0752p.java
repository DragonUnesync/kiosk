package de.ozerov.fully;

import A4.d;
import N.e;
import Q0.g;
import Z1.c;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import d4.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.CookieManager;
import java.util.HashMap;
import n2.a;

/* renamed from: de.ozerov.fully.p  reason: case insensitive filesystem */
public abstract class C0752p {

    /* renamed from: a  reason: collision with root package name */
    public static Thread f10876a = null;

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f10877b = null;

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f10878c = "idle";

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f10879d = new HashMap();

    public static boolean a(Context context, File file, String str, boolean z, long j7) {
        int i;
        k kVar = new k(context, 1);
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
        if (packageArchiveInfo != null) {
            StringBuilder B8 = e.B(str.split("#")[0], "#packageName=");
            B8.append(packageArchiveInfo.packageName);
            B8.append(";versionCode=");
            B8.append(packageArchiveInfo.versionCode);
            String sb = B8.toString();
            if (j7 > 0) {
                sb = sb + ";lastModified=" + j7;
            }
            String[] e12 = a.e1(((c) kVar.f9767W).r("mdmApkToInstall", ""));
            for (int i8 = 0; i8 < e12.length; i8++) {
                if (e12[i8].startsWith(str)) {
                    e12[i8] = sb;
                }
            }
            kVar.V2("mdmApkToInstall", TextUtils.join("\n", e12));
            try {
                i = context.getPackageManager().getPackageInfo(packageArchiveInfo.packageName, 128).versionCode;
            } catch (Exception unused) {
                i = -1;
            }
            if (i != -1 && i >= packageArchiveInfo.versionCode && !z) {
                StringBuilder s8 = g.s("For URL ", str, " package ");
                s8.append(packageArchiveInfo.packageName);
                s8.append(" already installed, version ");
                s8.append(i);
                String sb2 = s8.toString();
                Log.i("AiManager", sb2);
                C0794w0.q0(0, "AiManager", sb2);
                if (!kVar.c0().booleanValue()) {
                    a.b1(context, sb2);
                }
                return false;
            } else if (P.f10240j) {
                f10878c = "installing";
                C0723k0 k0Var = new C0723k0();
                k0Var.f10766b = "pm install -r " + file.getAbsolutePath();
                k0Var.execute(new Void[0]);
                a.b1(context, "Installing " + packageArchiveInfo.packageName + " ...");
            } else {
                try {
                    f10878c = "installing";
                    c(context, file, packageArchiveInfo.packageName);
                    a.b1(context, "Installing " + packageArchiveInfo.packageName + " ...");
                    return true;
                } catch (Exception e) {
                    f10878c = "idle";
                    String str2 = "Package install failed for " + packageArchiveInfo.packageName + " from file " + file.getAbsolutePath() + " due to " + e.getMessage();
                    Log.e("AiManager", str2);
                    C0794w0.q0(2, "AiManager", str2);
                    if (!kVar.c0().booleanValue()) {
                        a.b1(context, str2);
                    }
                }
            }
        } else {
            String str3 = "APK file parsing failed for " + str;
            Log.e("AiManager", str3);
            C0794w0.q0(2, "AiManager", str3);
            if (!kVar.c0().booleanValue()) {
                a.b1(context, str3);
            }
        }
        return false;
    }

    public static boolean b(Context context, String str, boolean z, boolean z6) {
        int i;
        long j7;
        int i8;
        long j8;
        Context context2 = context;
        String str2 = str;
        f10877b = str2;
        k kVar = new k(context2, 1);
        File c02 = a.c0(context2, (String) null);
        if ((str2.startsWith("https://") || str2.startsWith("http://")) && !C0794w0.e0(context)) {
            String str3 = "Can't install APK from URL " + str2 + " while no network connection available";
            Log.w("AiManager", str3);
            C0794w0.q0(1, "AiManager", str3);
            return false;
        } else if (!C0794w0.Z(context) || !((c) kVar.f9767W).n("mdmDisableAppsFromUnknownSources", true)) {
            if (str2.startsWith("file://") || !z6) {
                i = 2;
                j7 = -1;
            } else {
                i = 2;
                C0802x2 a8 = C0808y2.a(str, (File) null, 0, (CookieManager) null, false, (String) null);
                if (a8.f11070b != 200) {
                    j8 = -1;
                } else {
                    j8 = a8.i;
                }
                if (j8 == -1) {
                    String concat = "Failed getting Last-Modified time for APK ".concat(str2);
                    Log.e("AiManager", concat);
                    C0794w0.q0(2, "AiManager", concat);
                    if (kVar.c0().booleanValue()) {
                        return false;
                    }
                    a.a1(1, context2, concat);
                    return false;
                }
                j7 = j8;
            }
            String[] split = str2.split("#");
            if (split.length == i) {
                HashMap d12 = a.d1(split[1], ";", "=");
                if (d12.containsKey("packageName") && d12.containsKey("versionCode")) {
                    String str4 = (String) d12.get("packageName");
                    try {
                        i8 = context.getPackageManager().getPackageInfo(str4, 128).versionCode;
                    } catch (Exception unused) {
                        i8 = -1;
                    }
                    try {
                        int parseInt = Integer.parseInt((String) d12.get("versionCode"));
                        if (i8 != -1 && i8 >= parseInt && !z) {
                            int i9 = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
                            if (i9 > 0) {
                                if (d12.containsKey("lastModified") && String.valueOf(j7).equals(d12.get("lastModified"))) {
                                    Log.i("AiManager", "Package " + str4 + " already installed in version " + i8 + " and Last-Modified time not changed for APK " + str2);
                                    return false;
                                }
                            }
                            if (i9 <= 0) {
                                Log.i("AiManager", "Package " + str4 + " already installed, version " + i8);
                                return false;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if (str2.startsWith("file://")) {
                File file = new File(Uri.parse(str).getPath());
                if (file.exists()) {
                    return a(context, file, str, z, -1);
                }
                String concat2 = "File not found for ".concat(str2);
                Log.e("AiManager", concat2);
                if (kVar.c0().booleanValue()) {
                    return false;
                }
                a.b1(context2, concat2);
                return false;
            }
            String concat3 = "Starting APK download for ".concat(str2);
            Log.i("AiManager", concat3);
            C0794w0.q0(0, "AiManager", concat3);
            f10878c = "downloading";
            C0802x2 b8 = C0808y2.b(context2, c02, str2);
            if (b8.f11070b != 200) {
                StringBuilder s8 = g.s("File download failed for ", str2, " as ");
                s8.append(b8.f11070b);
                s8.append(" ");
                s8.append(b8.f11074g);
                String sb = s8.toString();
                Log.e("AiManager", sb);
                C0794w0.q0(2, "AiManager", sb);
                if (kVar.c0().booleanValue()) {
                    return false;
                }
                a.a1(1, context2, sb);
                return false;
            } else if (b8.e.equals("application/vnd.android.package-archive") || b8.e.equals("application/octet-stream") || b8.e.equals("application/binary") || b8.f11071c.toLowerCase().endsWith(".apk") || C0808y2.e(context2, Uri.parse(str)).equals("apk")) {
                return a(context, new File(c02, b8.f11071c), str, z, j7);
            } else {
                String concat4 = "File is not APK for ".concat(str2);
                Log.e("AiManager", concat4);
                C0794w0.q0(2, "AiManager", concat4);
                if (kVar.c0().booleanValue()) {
                    return false;
                }
                a.a1(1, context2, concat4);
                return false;
            }
        } else {
            a.b1(context2, "Installing APK files is disabled by device owner settings");
            Log.w("AiManager", "Installing APK files is disabled by device owner settings");
            return false;
        }
    }

    public static void c(Context context, File file, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (!a.B0() || packageManager.canRequestPackageInstalls()) {
            PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
            FileInputStream fileInputStream = new FileInputStream(file);
            PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
            sessionParams.setAppPackageName(str);
            int createSession = packageInstaller.createSession(sessionParams);
            PackageInstaller.Session openSession = packageInstaller.openSession(createSession);
            Intent intent = new Intent("com.fullykiosk.singleapp.action.install_complete");
            intent.setPackage(context.getPackageName());
            IntentSender intentSender = PendingIntent.getBroadcast(context, createSession, intent, 33554432).getIntentSender();
            OutputStream openWrite = openSession.openWrite("Fully Kiosk", 0, -1);
            byte[] bArr = new byte[65536];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    openWrite.write(bArr, 0, read);
                } else {
                    openSession.fsync(openWrite);
                    fileInputStream.close();
                    openWrite.close();
                    openSession.commit(intentSender);
                    f10879d.put(Integer.valueOf(createSession), file);
                    return;
                }
            }
        } else {
            throw new IllegalStateException("APK installs are not allowed for Fully");
        }
    }

    public static synchronized boolean d() {
        boolean z;
        synchronized (C0752p.class) {
            Thread thread = f10876a;
            if (thread == null || !thread.isAlive()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public static synchronized void e(Context context) {
        synchronized (C0752p.class) {
            try {
                k kVar = new k(context, 1);
                String r8 = ((c) kVar.f9767W).r("mdmApkToInstall", "");
                Thread thread = f10876a;
                if (thread != null) {
                    if (thread.isAlive()) {
                        Log.w("AiManager", "There is another installer thread active");
                    }
                }
                Thread thread2 = new Thread(new d(r8, context, kVar, 11));
                f10876a = thread2;
                thread2.start();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static synchronized void f() {
        synchronized (C0752p.class) {
            try {
                if (d()) {
                    f10876a.interrupt();
                }
                f10878c = "idle";
                f10877b = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
