package de.ozerov.fully;

import Y2.g;
import Z1.c;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import d4.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;
import u.C1477r;

public final class B1 {

    /* renamed from: a  reason: collision with root package name */
    public A1 f9794a;

    /* renamed from: b  reason: collision with root package name */
    public String f9795b;

    /* renamed from: c  reason: collision with root package name */
    public File f9796c;

    /* renamed from: d  reason: collision with root package name */
    public File f9797d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9798f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9799g;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, de.ozerov.fully.B1] */
    public static void a(FullyActivity fullyActivity, ArrayList arrayList, A1 a12, String str) {
        File file;
        boolean z;
        File file2;
        g gVar;
        File parentFile;
        FullyActivity fullyActivity2 = fullyActivity;
        String str2 = str;
        ArrayList Z7 = a.Z(fullyActivity2, true);
        k kVar = new k((Context) fullyActivity2, 1);
        String F8 = a.F(fullyActivity2, str2);
        try {
            if (F8.startsWith("file:")) {
                file = new File(Uri.parse(F8).getPath());
            } else if (kVar.L().booleanValue() && (F8.toLowerCase().startsWith("http://localhost") || F8.toLowerCase().startsWith("https://localhost"))) {
                file = C0794w0.x(fullyActivity2, F8);
            } else if (!str2.startsWith("https:") && !str2.startsWith("http:") && !str2.startsWith("fully:")) {
                file = new File(F8);
            } else {
                return;
            }
            try {
                File canonicalFile = file.getCanonicalFile();
                Iterator it = Z7.iterator();
                while (it.hasNext()) {
                    g gVar2 = (g) it.next();
                    if (!gVar2.f6585c) {
                        File file3 = gVar2.f6584b;
                        if (canonicalFile.equals(file3) || a.s0(canonicalFile, file3)) {
                            return;
                        }
                    }
                }
                Iterator it2 = Z7.iterator();
                while (it2.hasNext()) {
                    g gVar3 = (g) it2.next();
                    if (gVar3.f6585c) {
                        File file4 = gVar3.f6584b;
                        if (canonicalFile.equals(file4) || a.s0(canonicalFile, file4)) {
                            boolean isDirectory = canonicalFile.isDirectory();
                            int i = 0;
                            if (!canonicalFile.exists() || !canonicalFile.canRead()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!canonicalFile.isDirectory() && (parentFile = canonicalFile.getParentFile()) != null && !parentFile.getAbsolutePath().equals(file4.getAbsolutePath()) && parentFile.canRead()) {
                                String[] strArr = {"Alarms", "Android", "Android/data", "DCIM", "Documents", "Download", "Movies", "Music", "Notifications", "Pictures", "Podcasts", "Recodrings", "Ringtones", "Sounds", "Subtitles", "System Volume Information", "DCIM/Camera", "DCIM/Collage", "DCIM/Facebook", "DCIM/Screenshots", "DCIM/Videocaptures", "Pictures/Facebook", "Pictures/Screenshots", "Download/Quick Share"};
                                while (true) {
                                    if (i < 24) {
                                        String str3 = strArr[i];
                                        if (parentFile.getAbsolutePath().equals(file4 + File.separator + str3)) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        File[] listFiles = parentFile.listFiles();
                                        if (listFiles != null && listFiles.length != 0) {
                                            canonicalFile.getAbsolutePath();
                                            parentFile.getAbsolutePath();
                                            canonicalFile = parentFile;
                                        }
                                    }
                                }
                            }
                            Iterator it3 = Z7.iterator();
                            while (true) {
                                file2 = null;
                                if (!it3.hasNext()) {
                                    gVar = null;
                                    break;
                                }
                                gVar = (g) it3.next();
                                if (!gVar.f6585c && gVar.f6586d == gVar3.f6586d) {
                                    break;
                                }
                            }
                            if (gVar == null) {
                                Iterator it4 = Z7.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    g gVar4 = (g) it4.next();
                                    if (!gVar4.f6585c) {
                                        gVar = gVar4;
                                        break;
                                    }
                                }
                            }
                            if (gVar == null) {
                                Log.w("B1", "Could not find a good storage for " + file4.getAbsolutePath());
                            } else {
                                file2 = new File(canonicalFile.getAbsolutePath().replace(file4.getAbsolutePath(), gVar.f6584b.getAbsolutePath()));
                            }
                            ? obj = new Object();
                            obj.f9794a = a12;
                            obj.f9795b = str2;
                            obj.f9796c = canonicalFile;
                            obj.f9797d = file2;
                            obj.e = isDirectory;
                            obj.f9798f = true;
                            obj.f9799g = z;
                            arrayList.add(obj);
                            canonicalFile.getAbsolutePath();
                            return;
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    A1 a13 = a12;
                }
            } catch (Exception unused) {
                Log.w("B1", "Failed to resolve the canonical path of " + file.getAbsolutePath());
            }
        } catch (Exception unused2) {
            Log.w("B1", "Skipped bogus URL for migration: ".concat(str2));
        }
    }

    public static ArrayList b(FullyActivity fullyActivity) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A1("startURL", 2));
        arrayList.add(new A1("forceOpenByAppUrl", 2));
        arrayList.add(new A1("webOverlayUrl", 1));
        arrayList.add(new A1("errorURL", 1));
        arrayList.add(new A1("searchProviderUrl", 1));
        arrayList.add(new A1("removeXframeOptionsUrl", 2));
        arrayList.add(new A1("clientCaUrl", 1));
        arrayList.add(new A1("launcherBgUrl", 1));
        arrayList.add(new A1("actionBarIconUrl", 1));
        arrayList.add(new A1("actionBarBgUrl", 1));
        arrayList.add(new A1("actionBarCustomButtonUrl", 1));
        arrayList.add(new A1("newTabUrl", 1));
        arrayList.add(new A1("screensaverWallpaperURL", 1));
        arrayList.add(new A1("systemWallpaperUrl", 1));
        arrayList.add(new A1("lockscreenWallpaperUrl", 1));
        arrayList.add(new A1("loadContentZipFileUrl", 1));
        arrayList.add(new A1("alarmSoundFileUrl", 1));
        arrayList.add(new A1("wssServiceUrl", 1));
        arrayList.add(new A1("mdmProxyConfig", 1));
        arrayList.add(new A1("barcodeScanTargetUrl", 1));
        arrayList.add(new A1("mqttBrokerUrl", 1));
        arrayList.add(new A1("mainPlaylist", 3));
        arrayList.add(new A1("screensaverPlaylist", 3));
        arrayList.add(new A1("launcherApps", 4));
        arrayList.add(new A1("addLocalFilesMigrationLocations", 2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A1 a12 = (A1) it.next();
            if (a12.f9785c != 5) {
                String d8 = fullyActivity.f9932U0.d(a12.f9783a);
                if (d8 != null) {
                    a12.f9784b = d8.replace(" (JSON)", "");
                } else {
                    a12.f9784b = null;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        k kVar = new k((Context) fullyActivity, 1);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            A1 a13 = (A1) it2.next();
            String r8 = ((c) kVar.f9767W).r(a13.f9783a, (String) null);
            if (r8 != null && !r8.isEmpty()) {
                int h5 = C1477r.h(a13.f9785c);
                if (h5 == 0) {
                    a(fullyActivity, arrayList2, a13, r8);
                } else if (h5 == 1) {
                    for (String str : a.e1(r8)) {
                        if (!str.trim().isEmpty()) {
                            a(fullyActivity, arrayList2, a13, str);
                        }
                    }
                } else if (h5 == 2) {
                    Iterator it3 = O2.b(fullyActivity, a13.f9783a).iterator();
                    while (it3.hasNext()) {
                        String str2 = ((O2) it3.next()).f10215a;
                        if (str2 != null) {
                            a(fullyActivity, arrayList2, a13, str2);
                        }
                    }
                } else if (h5 == 3) {
                    ArrayList c8 = C0664a1.c(fullyActivity);
                    Iterator it4 = c8.iterator();
                    while (it4.hasNext()) {
                        String str3 = ((C0664a1) it4.next()).f10544b;
                        if (str3 != null) {
                            a(fullyActivity, arrayList2, a13, str3);
                        }
                    }
                    Iterator it5 = c8.iterator();
                    while (it5.hasNext()) {
                        String str4 = ((C0664a1) it5.next()).f10546d;
                        if (str4 != null) {
                            a(fullyActivity, arrayList2, a13, str4);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }
}
