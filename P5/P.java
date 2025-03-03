package P5;

import K1.i;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.samsung.android.knox.keystore.CertificateProvisioning;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.remoteadmin.RemoteAdminService;
import j$.net.URLDecoder;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import n2.a;

public final class P {

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f3853m = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f3854n = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f3855o = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* renamed from: p  reason: collision with root package name */
    public static final Logger f3856p = Logger.getLogger(P.class.getName());

    /* renamed from: q  reason: collision with root package name */
    public static HashMap f3857q = null;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f3858r = false;

    /* renamed from: s  reason: collision with root package name */
    public static volatile int f3859s = 2323;

    /* renamed from: a  reason: collision with root package name */
    public int f3860a;

    /* renamed from: b  reason: collision with root package name */
    public volatile ServerSocket f3861b;

    /* renamed from: c  reason: collision with root package name */
    public N f3862c = new i(15);

    /* renamed from: d  reason: collision with root package name */
    public Thread f3863d;
    public E e;

    /* renamed from: f  reason: collision with root package name */
    public i f3864f;

    /* renamed from: g  reason: collision with root package name */
    public FullyActivity f3865g;

    /* renamed from: h  reason: collision with root package name */
    public final RemoteAdminService f3866h;
    public String i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3867j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f3868k;

    /* renamed from: l  reason: collision with root package name */
    public Timer f3869l;

    /* JADX WARNING: type inference failed for: r0v2, types: [P5.N, java.lang.Object, H3.P] */
    public P(RemoteAdminService remoteAdminService) {
        int i8 = f3859s;
        this.f3860a = i8;
        this.f3864f = new i(16);
        this.e = new E(0);
        this.f3867j = false;
        f3858r = false;
        this.f3866h = remoteAdminService;
        f();
        Log.i("P", "Init Remote Admin");
        try {
            SSLContext d8 = d(remoteAdminService);
            if (d8 != null) {
                SSLServerSocketFactory serverSocketFactory = d8.getServerSocketFactory();
                ? obj = new Object();
                obj.f2027U = serverSocketFactory;
                this.f3862c = obj;
                f3858r = true;
                Log.i("P", "SSL Init OK");
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e8) {
            f3856p.log(Level.WARNING, "Encoding not supported, ignored", e8);
            return null;
        }
    }

    public static String c(String str) {
        String str2;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            str2 = (String) ((HashMap) f()).get(str.substring(lastIndexOf + 1).toLowerCase());
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "application/octet-stream";
        }
        return str2;
    }

    public static SSLContext d(Context context) {
        char[] charArray = "fully".toCharArray();
        File file = new File(a.c0(context, (String) null), "fully-remote-admin-ca.p12");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            KeyStore instance = KeyStore.getInstance(CertificateProvisioning.TYPE_PKCS12);
            instance.load(fileInputStream, charArray);
            KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            instance2.init(instance, charArray);
            TrustManagerFactory instance3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance3.init(instance);
            SSLContext instance4 = SSLContext.getInstance("TLS");
            instance4.init(instance2.getKeyManagers(), instance3.getTrustManagers(), (SecureRandom) null);
            Log.i("P", "SSL certificate loaded successfully from " + file.getAbsolutePath());
            return instance4;
        } catch (FileNotFoundException unused) {
            Log.w("P", "No SSL certificate found in " + file.getAbsolutePath());
            return null;
        } catch (Exception e8) {
            Log.e("P", "Failed to load SSL certificate from file " + file.getAbsolutePath() + " due to " + e8.getMessage());
            return null;
        }
    }

    public static void e(String str, HashMap hashMap) {
        InputStream inputStream;
        Logger logger = f3856p;
        try {
            Enumeration<URL> resources = P.class.getClassLoader().getResources(str);
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                Properties properties = new Properties();
                inputStream = null;
                try {
                    inputStream = nextElement.openStream();
                    properties.load(inputStream);
                } catch (IOException e8) {
                    Level level = Level.SEVERE;
                    logger.log(level, "could not load mimetypes from " + nextElement, e8);
                }
                i(inputStream);
                hashMap.putAll(properties);
            }
        } catch (IOException unused) {
            logger.log(Level.INFO, "no mime types available at ".concat(str));
        } catch (Throwable th) {
            i(inputStream);
            throw th;
        }
    }

    public static Map f() {
        if (f3857q == null) {
            HashMap hashMap = new HashMap();
            f3857q = hashMap;
            e("META-INF/nanohttpd/default-mimetypes.properties", hashMap);
            e("META-INF/nanohttpd/mimetypes.properties", f3857q);
            if (f3857q.isEmpty()) {
                f3856p.log(Level.WARNING, "no mime types found in the classpath! please provide mimetypes.properties");
            }
        }
        return f3857q;
    }

    public static K g(J j7, String str, InputStream inputStream) {
        return new K(j7, str, inputStream, -1);
    }

    public static K h(J j7, String str, String str2) {
        byte[] bArr;
        B b8 = new B(str);
        if (str2 == null) {
            return new K(j7, str, new ByteArrayInputStream(new byte[0]), 0);
        }
        try {
            if (!Charset.forName(b8.a()).newEncoder().canEncode(str2) && b8.f3802c == null) {
                b8 = new B(str.concat("; charset=UTF-8"));
            }
            bArr = str2.getBytes(b8.a());
        } catch (UnsupportedEncodingException e8) {
            f3856p.log(Level.SEVERE, "encoding problem, responding nothing", e8);
            bArr = new byte[0];
        }
        return new K(j7, b8.f3800a, new ByteArrayInputStream(bArr), (long) bArr.length);
    }

    public static final void i(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e8) {
                f3856p.log(Level.SEVERE, "Could not close", e8);
            }
        }
    }

    public static boolean r(K k8) {
        String str = k8.f3837V;
        if (str == null || (!str.toLowerCase().contains("text/") && !k8.f3837V.toLowerCase().contains("/json"))) {
            return false;
        }
        return true;
    }

    public final void j() {
        while (!this.f3867j && f3859s < 3000) {
            try {
                m();
                this.f3867j = true;
            } catch (BindException unused) {
                Log.e("P", "Port " + f3859s + " is still in use, trying " + (f3859s + 1));
                RemoteAdminService remoteAdminService = this.f3866h;
                a.b1(remoteAdminService, "Port " + f3859s + " is still in use, trying " + (f3859s + 1));
                f3859s = f3859s + 1;
                this.f3860a = f3859s;
            } catch (Exception e8) {
                Log.e("P", "The remote administration server could not start.");
                e8.printStackTrace();
                return;
            }
        }
    }

    public final void k() {
        try {
            o();
            this.f3867j = false;
        } catch (Exception e8) {
            Log.e("P", "The remote administration server failed to stop.");
            e8.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x075e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0768  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x07ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final P5.K l(P5.G r26) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = 12
            r5 = 3
            r13 = 2
            r7 = 1
            de.ozerov.fully.FullyActivity r8 = r1.f3865g
            P5.J r9 = P5.J.INTERNAL_ERROR
            java.lang.String r10 = "P"
            java.lang.String r11 = "text/plain"
            if (r8 != 0) goto L_0x001f
            java.lang.String r0 = "Getting HTTP request while FullyActivity isn't yet set"
            android.util.Log.e(r10, r0)
            java.lang.String r0 = "Remote admin server starting..."
            P5.K r0 = h(r9, r11, r0)
            return r0
        L_0x001f:
            boolean r8 = r8.w()
            if (r8 != 0) goto L_0x0031
            java.lang.String r0 = "Getting HTTP request while FullyActivity is dead"
            android.util.Log.e(r10, r0)
            java.lang.String r0 = "Remote admin server can't find a running Fully activity..."
            P5.K r0 = h(r9, r11, r0)
            return r0
        L_0x0031:
            d4.k r8 = new d4.k
            de.ozerov.fully.FullyActivity r10 = r1.f3865g
            r8.<init>((android.content.Context) r10, (int) r7)
            java.util.HashMap r10 = r0.i
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            P5.D r12 = new P5.D
            r12.<init>(r10)
            int r10 = r0.f3818g
            boolean r17 = u.C1477r.a(r5, r10)
            java.lang.String r5 = "text/html"
            P5.J r15 = P5.J.OK
            if (r17 != 0) goto L_0x0056
            boolean r10 = u.C1477r.a(r13, r10)
            if (r10 == 0) goto L_0x0059
        L_0x0056:
            r0.h(r3)     // Catch:{ IOException -> 0x0aa7, L -> 0x0a9a }
        L_0x0059:
            B.B r10 = new B.B
            r10.<init>(r2, r1)
            java.lang.String r2 = r1.i
            de.ozerov.fully.FullyActivity r14 = r1.f3865g
            d4.k r4 = new d4.k
            r4.<init>((android.content.Context) r14, (int) r7)
            java.util.HashMap r6 = r26.g()
            java.lang.String r7 = r0.f3817f
            java.lang.String r13 = "/"
            java.lang.String[] r7 = r7.split(r13)
            java.lang.String r1 = "cmd"
            boolean r18 = r6.containsKey(r1)
            r19 = r8
            java.lang.String r8 = "."
            r20 = r9
            java.lang.String r9 = "home"
            if (r18 == 0) goto L_0x008c
            java.lang.Object r6 = r6.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            r18 = r5
            goto L_0x00a7
        L_0x008c:
            int r6 = r7.length
            r18 = r5
            r5 = 2
            if (r6 != r5) goto L_0x00a6
            r5 = 1
            r6 = r7[r5]
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x00a6
            r6 = r7[r5]
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x00a6
            r6 = r7[r5]
            goto L_0x00a7
        L_0x00a6:
            r6 = r9
        L_0x00a7:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            P5.c r7 = new P5.c
            r21 = r15
            r15 = 0
            r7.<init>(r15)
            java.lang.String r15 = "clearCache"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 2
            r7.<init>(r15)
            java.lang.String r15 = "clearWebstorage"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 1
            r7.<init>(r15)
            java.lang.String r15 = "clearCookies"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 29
            r7.<init>(r15)
            java.lang.String r15 = "resetWebview"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 4
            r7.<init>(r15)
            java.lang.String r15 = "crashMe"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 5
            r7.<init>(r15)
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r7.<init>(r15)
            java.lang.String r15 = "deviceInfo"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 5
            r7.<init>(r15)
            java.lang.String r15 = "getDeviceInfo"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 5
            r7.<init>(r15)
            java.lang.String r15 = "login"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r22 = r9
            r9 = 5
            r7.<init>(r9)
            java.lang.String r9 = "logout"
            r5.put(r9, r7)
            P5.l r7 = new P5.l
            r23 = r9
            r9 = 1
            r7.<init>(r9)
            java.lang.String r9 = "logcat"
            r5.put(r9, r7)
            P5.l r7 = new P5.l
            r9 = 0
            r7.<init>(r9)
            java.lang.String r9 = "getLogcat"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 7
            r7.<init>(r9)
            java.lang.String r9 = "disableLockedMode"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 9
            r7.<init>(r9)
            java.lang.String r9 = "enableLockedMode"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 6
            r7.<init>(r9)
            java.lang.String r9 = "disableHotspot"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 8
            r7.<init>(r9)
            java.lang.String r9 = "enableHotspot"
            r5.put(r9, r7)
            P5.y r7 = new P5.y
            r9 = 4
            r7.<init>(r9)
            java.lang.String r9 = "setOverlayMessage"
            r5.put(r9, r7)
            P5.y r7 = new P5.y
            r9 = 5
            r7.<init>(r9)
            java.lang.String r9 = "showToast"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 10
            r7.<init>(r9)
            java.lang.String r9 = "exitApp"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 14
            r7.<init>(r9)
            java.lang.String r9 = "getPermissions"
            r5.put(r9, r7)
            P5.j r7 = new P5.j
            r7.<init>()
            java.lang.String r9 = "exportSettingsJson"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 12
            r7.<init>(r9)
            java.lang.String r9 = "forceSleep"
            r5.put(r9, r7)
            P5.k r7 = new P5.k
            r9 = 1
            r7.<init>(r9)
            java.lang.String r9 = "getHtmlSource"
            r5.put(r9, r7)
            P5.g r7 = new P5.g
            r9 = 1
            r7.<init>(r9)
            java.lang.String r9 = "downloadSettingsFile"
            r5.put(r9, r7)
            P5.g r7 = new P5.g
            r9 = 0
            r7.<init>(r9)
            java.lang.String r9 = "deleteSettingsFile"
            r5.put(r9, r7)
            java.lang.String r7 = "remoteAdminCamshot"
            java.lang.Object r9 = r4.f9767W
            Z1.c r9 = (Z1.c) r9
            r24 = r15
            r15 = 1
            boolean r7 = r9.n(r7, r15)
            if (r7 == 0) goto L_0x01e1
            P5.k r7 = new P5.k
            r9 = 0
            r7.<init>(r9)
            java.lang.String r9 = "getCamshot"
            r5.put(r9, r7)
        L_0x01e1:
            java.lang.String r7 = "remoteAdminScreenshot"
            java.lang.Object r9 = r4.f9767W
            Z1.c r9 = (Z1.c) r9
            r15 = 1
            boolean r7 = r9.n(r7, r15)
            if (r7 == 0) goto L_0x01f8
            P5.m r7 = new P5.m
            r7.<init>()
            java.lang.String r9 = "getScreenshot"
            r5.put(r9, r7)
        L_0x01f8:
            P5.g r7 = new P5.g
            r9 = 2
            r7.<init>(r9)
            java.lang.String r9 = "importSettingsFile"
            r5.put(r9, r7)
            P5.g r7 = new P5.g
            r9 = 3
            r7.<init>(r9)
            java.lang.String r9 = "pushConfig"
            r5.put(r9, r7)
            P5.y r7 = new P5.y
            r9 = 23
            r7.<init>(r9)
            java.lang.String r9 = "uploadAndImportSettingsFile"
            r5.put(r9, r7)
            P5.o r7 = new P5.o
            r9 = 0
            r7.<init>(r9)
            java.lang.String r9 = "listSettings"
            r5.put(r9, r7)
            P5.k r7 = new P5.k
            r9 = 2
            r7.<init>(r9)
            java.lang.String r9 = "listSettingsCsv"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 13
            r7.<init>(r9)
            java.lang.String r9 = "getInstallApkState"
            r5.put(r9, r7)
            P5.y r7 = new P5.y
            r9 = 9
            r7.<init>(r9)
            java.lang.String r9 = "startInstallApk"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 18
            r7.<init>(r9)
            java.lang.String r9 = "loadApkFile"
            r5.put(r9, r7)
            P5.b r7 = new P5.b
            r9 = 5
            r7.<init>(r9)
            java.lang.String r9 = "uninstallApp"
            r5.put(r9, r7)
            P5.b r7 = new P5.b
            r9 = 0
            r7.<init>(r9)
            java.lang.String r9 = "clearAppData"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 19
            r7.<init>(r9)
            java.lang.String r15 = "loadStartURL"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r7.<init>(r9)
            java.lang.String r9 = "loadStartUrl"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 28
            r7.<init>(r9)
            java.lang.String r9 = "refreshTab"
            r5.put(r9, r7)
            P5.q r7 = new P5.q
            r9 = 6
            r7.<init>(r9)
            java.lang.String r9 = "loadStatsCSV"
            r5.put(r9, r7)
            P5.p r7 = new P5.p
            r9 = 0
            r7.<init>(r9)
            java.lang.String r9 = "loadLogCSV"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 20
            r7.<init>(r9)
            java.lang.String r15 = "loadURL"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r7.<init>(r9)
            java.lang.String r9 = "loadUrl"
            r5.put(r9, r7)
            P5.e r7 = new P5.e
            r9 = 6
            r7.<init>(r9)
            java.lang.String r9 = "loadZipFile"
            r5.put(r9, r7)
            P5.k r7 = new P5.k
            r9 = 3
            r7.<init>(r9)
            java.lang.String r9 = "manageSettings"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r9 = 26
            r7.<init>(r9)
            java.lang.String r9 = "popFragment"
            r5.put(r9, r7)
            P5.y r7 = new P5.y
            r9 = 0
            r7.<init>(r9)
            java.lang.String r9 = "restartApp"
            r5.put(r9, r7)
            P5.c r7 = new P5.c
            r15 = 17
            r7.<init>(r15)
            java.lang.String r15 = "killMyProcess"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 1
            r7.<init>(r15)
            java.lang.String r15 = "screenOff"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 2
            r7.<init>(r15)
            java.lang.String r15 = "screenOn"
            r5.put(r15, r7)
            P5.o r7 = new P5.o
            r15 = 1
            r7.<init>(r15)
            java.lang.String r15 = "setBooleanSetting"
            r5.put(r15, r7)
            P5.o r7 = new P5.o
            r15 = 2
            r7.<init>(r15)
            java.lang.String r15 = "setStringSetting"
            r5.put(r15, r7)
            P5.k r7 = new P5.k
            r15 = 4
            r7.<init>(r15)
            java.lang.String r15 = "showCamshot"
            r5.put(r15, r7)
            P5.k r7 = new P5.k
            r15 = 5
            r7.<init>(r15)
            java.lang.String r15 = "showScreenshot"
            r5.put(r15, r7)
            P5.k r7 = new P5.k
            r15 = 6
            r7.<init>(r15)
            java.lang.String r15 = "showStats"
            r5.put(r15, r7)
            P5.p r7 = new P5.p
            r15 = 1
            r7.<init>(r15)
            java.lang.String r15 = "showLog"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 7
            r7.<init>(r15)
            java.lang.String r15 = "startApplication"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 10
            r7.<init>(r15)
            java.lang.String r15 = "startIntent"
            r5.put(r15, r7)
            P5.b r7 = new P5.b
            r15 = 1
            r7.<init>(r15)
            java.lang.String r15 = "killBackgroundProcesses"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 11
            r7.<init>(r15)
            java.lang.String r15 = "startScreensaver"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 14
            r7.<init>(r15)
            java.lang.String r15 = "stopScreensaver"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 8
            r7.<init>(r15)
            java.lang.String r15 = "startDaydream"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 13
            r7.<init>(r15)
            java.lang.String r15 = "stopDaydream"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 18
            r7.<init>(r15)
            java.lang.String r15 = "textToSpeech"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 16
            r7.<init>(r15)
            java.lang.String r15 = "stopTextToSpeech"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 20
            r7.<init>(r15)
            java.lang.String r15 = "toForeground"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 19
            r7.<init>(r15)
            java.lang.String r15 = "toBackground"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 21
            r7.<init>(r15)
            java.lang.String r15 = "lockKiosk"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 22
            r7.<init>(r15)
            java.lang.String r15 = "unlockKiosk"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 21
            r7.<init>(r15)
            java.lang.String r15 = "triggerMotion"
            r5.put(r15, r7)
            P5.g r7 = new P5.g
            r15 = 4
            r7.<init>(r15)
            java.lang.String r15 = "uploadSettingsFile"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 3
            r7.<init>(r15)
            java.lang.String r15 = "setAudioVolume"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 24
            r7.<init>(r15)
            java.lang.String r15 = "playSound"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 15
            r7.<init>(r15)
            java.lang.String r15 = "stopSound"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 22
            r7.<init>(r15)
            java.lang.String r15 = "lockNow"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 24
            r7.<init>(r15)
            java.lang.String r15 = "wipeDevice"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 27
            r7.<init>(r15)
            java.lang.String r15 = "rebootDevice"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 6
            r7.<init>(r15)
            java.lang.String r15 = "shutdownDevice"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 25
            r7.<init>(r15)
            java.lang.String r15 = "playVideo"
            r5.put(r15, r7)
            P5.y r7 = new P5.y
            r15 = 17
            r7.<init>(r15)
            java.lang.String r15 = "stopVideo"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 11
            r7.<init>(r15)
            java.lang.String r15 = "focusTab"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 3
            r7.<init>(r15)
            java.lang.String r15 = "closeTab"
            r5.put(r15, r7)
            P5.b r7 = new P5.b
            r15 = 2
            r7.<init>(r15)
            java.lang.String r15 = "manageApps"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 23
            r7.<init>(r15)
            java.lang.String r15 = "performClick"
            r5.put(r15, r7)
            P5.b r7 = new P5.b
            r15 = 3
            r7.<init>(r15)
            java.lang.String r15 = "runRootCommand"
            r5.put(r15, r7)
            P5.b r7 = new P5.b
            r15 = 4
            r7.<init>(r15)
            java.lang.String r15 = "runSuCommand"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 15
            r7.<init>(r15)
            java.lang.String r15 = "installSystemUpdate"
            r5.put(r15, r7)
            P5.c r7 = new P5.c
            r15 = 16
            r7.<init>(r15)
            java.lang.String r15 = "installUserCa"
            r5.put(r15, r7)
            java.lang.Object r4 = r4.f9767W
            Z1.c r4 = (Z1.c) r4
            java.lang.String r7 = "remoteAdminFileManagement"
            r15 = 1
            boolean r4 = r4.n(r7, r15)
            if (r4 == 0) goto L_0x0525
            P5.e r4 = new P5.e
            r15 = 5
            r4.<init>(r15)
            java.lang.String r15 = "listFiles"
            r5.put(r15, r4)
            P5.e r4 = new P5.e
            r15 = 2
            r4.<init>(r15)
            java.lang.String r15 = "deleteFile"
            r5.put(r15, r4)
            P5.e r4 = new P5.e
            r15 = 3
            r4.<init>(r15)
            java.lang.String r15 = "deleteFolder"
            r5.put(r15, r4)
            P5.e r4 = new P5.e
            r15 = 0
            r4.<init>(r15)
            java.lang.String r15 = "copyFolder"
            r5.put(r15, r4)
            P5.e r4 = new P5.e
            r15 = 0
            r4.<init>(r15)
            java.lang.String r15 = "copyFile"
            r5.put(r15, r4)
            P5.e r4 = new P5.e
            r15 = 4
            r4.<init>(r15)
            java.lang.String r15 = "downloadFile"
            r5.put(r15, r4)
            P5.e r4 = new P5.e
            r15 = 7
            r4.<init>(r15)
            java.lang.String r15 = "uploadFile"
            r5.put(r15, r4)
            P5.e r4 = new P5.e
            r15 = 1
            r4.<init>(r15)
            java.lang.String r15 = "createFolder"
            r5.put(r15, r4)
        L_0x0525:
            P5.y r4 = new P5.y
            r15 = 12
            r4.<init>(r15)
            java.lang.String r15 = "startSingleApp"
            r5.put(r15, r4)
            P5.s r4 = new P5.s
            r4.<init>()
            java.lang.String r15 = "localFilesAlertCheck"
            r5.put(r15, r4)
            P5.s r4 = new P5.s
            r4.<init>()
            java.lang.String r15 = "localFilesAlertMigrate"
            r5.put(r15, r4)
            boolean r4 = r5.containsKey(r6)
            P5.J r15 = P5.J.NOT_FOUND
            r16 = r9
            java.lang.String r9 = ""
            if (r4 == 0) goto L_0x0a3e
            java.lang.Object r4 = r5.get(r6)
            P5.a r4 = (P5.C0138a) r4
            r4.f3879b = r14
            d4.k r5 = new d4.k
            r6 = 1
            r5.<init>((android.content.Context) r14, (int) r6)
            r4.f3880c = r5
            r4.f3881d = r0
            java.lang.String r5 = r0.f3817f
            r4.f3886k = r5
            int r5 = r0.f3818g
            r4.f3885j = r5
            java.util.HashMap r5 = r0.i
            r4.f3883g = r5
            java.lang.String r5 = r0.f3821k
            r4.f3887l = r5
            java.util.HashMap r0 = r26.g()
            r4.f3884h = r0
            r4.i = r12
            r4.f3882f = r3
            r4.e = r2
            r4.f3896u = r10
            r2 = 1
            r4.f3893r = r2
            java.lang.String r0 = r4.f3886k
            java.lang.String[] r0 = r0.split(r13)
            java.util.HashMap r2 = r4.f3884h
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x059d
            java.util.HashMap r0 = r4.f3884h
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r4.f3888m = r0
            goto L_0x05b9
        L_0x059d:
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L_0x05b7
            r1 = 1
            r2 = r0[r1]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05b7
            r2 = r0[r1]
            boolean r2 = r2.contains(r8)
            if (r2 != 0) goto L_0x05b7
            r0 = r0[r1]
            r4.f3888m = r0
            goto L_0x05b9
        L_0x05b7:
            r4.f3888m = r9
        L_0x05b9:
            java.util.HashMap r0 = r4.f3884h
            java.lang.String r1 = "type"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x05cc
            java.util.HashMap r0 = r4.f3884h
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x05ce
        L_0x05cc:
            java.lang.String r0 = "html"
        L_0x05ce:
            r4.f3889n = r0
            java.util.HashMap r0 = r4.f3884h
            java.lang.String r1 = "password"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x05e3
            java.util.HashMap r0 = r4.f3884h
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x05e4
        L_0x05e3:
            r0 = r9
        L_0x05e4:
            r4.f3890o = r0
            de.ozerov.fully.FullyActivity r0 = r4.f3879b
            d4.k r0 = r0.f9961z0
            java.lang.String r1 = "remoteAdminLan"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            r2 = 1
            boolean r0 = r0.n(r1, r2)
            java.lang.String r1 = r4.f3878a
            if (r0 != 0) goto L_0x0614
            P5.G r0 = r4.f3881d
            java.lang.String r0 = r0.f3823m
            java.lang.String r2 = "localhost"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0614
            java.lang.String r0 = "Only access via localhost is enabled by settings"
            android.util.Log.e(r1, r0)
            P5.J r0 = P5.J.FORBIDDEN
            java.lang.String r1 = "Access Forbidden"
            P5.K r0 = h(r0, r11, r1)
            goto L_0x0a31
        L_0x0614:
            java.util.HashMap r0 = r4.f3883g
            java.lang.String r2 = "fully-remote-password"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList r2 = r4.f3895t
            java.lang.String r5 = "-delete-"
            java.lang.String r10 = "return"
            if (r0 == 0) goto L_0x066b
            de.ozerov.fully.FullyActivity r12 = r4.f3879b
            d4.k r12 = r12.f9961z0
            java.lang.String r12 = r12.K1()
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x066b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            de.ozerov.fully.FullyActivity r14 = r4.f3879b
            d4.k r14 = r14.f9961z0
            java.lang.String r14 = r14.K1()
            r12.append(r14)
            de.ozerov.fully.FullyActivity r14 = r4.f3879b
            java.lang.String r14 = de.ozerov.fully.P.i(r14)
            r12.append(r14)
            java.lang.String r14 = de.ozerov.fully.CloudService.f9835j0
            java.lang.String r14 = "Fully Pull Salt"
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = n2.a.j0(r12)
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x066b
            r12 = 1
            r4.f3891p = r12
            r4.f3892q = r12
            r12 = r24
            goto L_0x0749
        L_0x066b:
            java.lang.String r0 = r4.f3888m
            r12 = r24
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0720
            java.lang.String r0 = r4.f3890o
            de.ozerov.fully.FullyActivity r14 = r4.f3879b
            d4.k r14 = r14.f9961z0
            java.lang.String r14 = r14.K1()
            boolean r0 = r0.equals(r14)
            java.lang.String r14 = "RemoteAdminModule"
            if (r0 == 0) goto L_0x06f9
            java.lang.String r0 = r4.f3890o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06f9
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.e = r0
            B.B r3 = r4.f3896u
            if (r3 == 0) goto L_0x06a3
            java.lang.Object r3 = r3.f141V
            P5.P r3 = (P5.P) r3
            r3.i = r0
        L_0x06a3:
            P5.D r3 = r4.i
            r6 = 1
            if (r3 == 0) goto L_0x06ab
            r3.b(r6, r0)
        L_0x06ab:
            r4.f3891p = r6
            r3 = 0
            r4.f3892q = r3
            java.lang.String r0 = "Remote Admin login successful"
            de.ozerov.fully.C0794w0.q0(r3, r14, r0)
            java.util.HashMap r0 = r4.f3884h
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L_0x0749
            java.util.HashMap r0 = r4.f3884h
            java.lang.Object r0 = r0.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.startsWith(r13)
            if (r0 == 0) goto L_0x0749
            java.util.HashMap r0 = r4.f3884h
            java.lang.Object r0 = r0.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "//"
            boolean r0 = r0.startsWith(r3)
            if (r0 != 0) goto L_0x0749
            P5.J r0 = P5.J.REDIRECT
            java.lang.String r1 = "Redirected..."
            P5.K r0 = h(r0, r11, r1)
            java.util.HashMap r1 = r4.f3884h
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "Location"
            r0.k(r2, r1)
            P5.D r1 = r4.i
            if (r1 == 0) goto L_0x0a31
            r1.c(r0)
            goto L_0x0a31
        L_0x06f9:
            r3 = 0
            r4.e = r3
            B.B r0 = r4.f3896u
            if (r0 == 0) goto L_0x0706
            java.lang.Object r0 = r0.f141V
            P5.P r0 = (P5.P) r0
            r0.i = r3
        L_0x0706:
            P5.D r0 = r4.i
            if (r0 == 0) goto L_0x070f
            r3 = -30
            r0.b(r3, r5)
        L_0x070f:
            r3 = 0
            r4.f3891p = r3
            r4.f3892q = r3
            java.lang.String r0 = "Wrong password"
            r2.add(r0)
            java.lang.String r0 = "Remote Admin login failed"
            r3 = 1
            de.ozerov.fully.C0794w0.q0(r3, r14, r0)
            goto L_0x0749
        L_0x0720:
            java.lang.String r0 = r4.f3890o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x073f
            java.lang.String r0 = r4.f3890o
            de.ozerov.fully.FullyActivity r3 = r4.f3879b
            d4.k r3 = r3.f9961z0
            java.lang.String r3 = r3.K1()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0749
            r3 = 1
            r4.f3891p = r3
            r6 = 0
            r4.f3892q = r6
            goto L_0x0749
        L_0x073f:
            r3 = 1
            r6 = 0
            boolean r0 = r4.f3893r
            if (r0 != 0) goto L_0x0749
            r4.f3891p = r3
            r4.f3892q = r6
        L_0x0749:
            java.lang.String r0 = r4.f3888m
            r3 = r23
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0779
            java.lang.String r0 = r4.e
            if (r0 == 0) goto L_0x0779
            r6 = 0
            r4.e = r6
            B.B r0 = r4.f3896u
            if (r0 == 0) goto L_0x0764
            java.lang.Object r0 = r0.f141V
            P5.P r0 = (P5.P) r0
            r0.i = r6
        L_0x0764:
            P5.D r0 = r4.i
            if (r0 == 0) goto L_0x076d
            r6 = -30
            r0.b(r6, r5)
        L_0x076d:
            r5 = 0
            r4.f3891p = r5
            r4.f3892q = r5
            java.util.ArrayList r0 = r4.f3894s
            java.lang.String r5 = "Logged out successfully"
            r0.add(r5)
        L_0x0779:
            P5.D r0 = r4.i
            if (r0 == 0) goto L_0x07a5
            java.util.HashMap r0 = r0.f3806U
            java.lang.String r5 = "FullyRemoteSession"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x07a5
            P5.D r0 = r4.i
            java.util.HashMap r0 = r0.f3806U
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = r4.e
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x07a5
            P5.D r0 = r4.i
            java.lang.String r5 = r4.e
            r6 = 1
            r0.b(r6, r5)
            r4.f3891p = r6
        L_0x07a5:
            P5.K r0 = r4.a()
            if (r0 == 0) goto L_0x07ad
            goto L_0x0a31
        L_0x07ad:
            java.lang.String r0 = r4.f3886k
            boolean r0 = r0.endsWith(r13)
            if (r0 != 0) goto L_0x0823
            java.lang.String r0 = r4.f3886k
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0823
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "RemoteAdmin"
            r0.<init>(r2)
            java.lang.String r2 = r4.f3886k
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            de.ozerov.fully.FullyActivity r2 = r4.f3879b     // Catch:{ FileNotFoundException -> 0x0802, Exception -> 0x07e9 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ FileNotFoundException -> 0x0802, Exception -> 0x07e9 }
            java.io.InputStream r2 = r2.open(r0)     // Catch:{ FileNotFoundException -> 0x0802, Exception -> 0x07e9 }
            java.lang.String r3 = c(r0)     // Catch:{ FileNotFoundException -> 0x0802, Exception -> 0x07e9 }
            r5 = r21
            P5.K r2 = g(r5, r3, r2)     // Catch:{ FileNotFoundException -> 0x0802, Exception -> 0x07e9 }
            P5.D r3 = r4.i     // Catch:{ FileNotFoundException -> 0x0802, Exception -> 0x07e9 }
            if (r3 == 0) goto L_0x07eb
            r3.c(r2)     // Catch:{ FileNotFoundException -> 0x0802, Exception -> 0x07e9 }
            goto L_0x07eb
        L_0x07e9:
            r0 = move-exception
            goto L_0x07f5
        L_0x07eb:
            java.lang.String r3 = "Cache-Control"
            java.lang.String r5 = "public, max-age=3600, s-maxage=3600"
            r2.k(r3, r5)     // Catch:{ FileNotFoundException -> 0x0802, Exception -> 0x07e9 }
            r0 = r2
            goto L_0x0a31
        L_0x07f5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error reading assets files due to "
            r2.<init>(r3)
            Q0.g.x(r0, r2, r1)
            r0 = 0
            goto L_0x0a31
        L_0x0802:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "File not found "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r1, r0)
            r1 = r18
            r2 = 0
            P5.K r0 = g(r15, r1, r2)
            P5.D r1 = r4.i
            if (r1 == 0) goto L_0x0a31
            r1.c(r0)
            goto L_0x0a31
        L_0x0823:
            r1 = r18
            r5 = r21
            java.lang.String r0 = r4.f3889n
            java.lang.String r6 = "json"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0844
            java.lang.String r0 = r4.d()
            java.lang.String r1 = "application/json"
            P5.K r0 = h(r5, r1, r0)
            P5.D r1 = r4.i
            if (r1 == 0) goto L_0x0a31
            r1.c(r0)
            goto L_0x0a31
        L_0x0844:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.HashMap r6 = r4.f3883g
            java.lang.String r8 = "fully-device-alias"
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x0857
            r6 = r9
            goto L_0x085d
        L_0x0857:
            java.lang.String r8 = "for "
            java.lang.String r6 = r8.concat(r6)
        L_0x085d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x087e }
            r8.<init>()     // Catch:{ Exception -> 0x087e }
            de.ozerov.fully.FullyActivity r13 = r4.f3879b     // Catch:{ Exception -> 0x087e }
            r14 = 0
            java.io.File r13 = n2.a.c0(r13, r14)     // Catch:{ Exception -> 0x087e }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x087e }
            r8.append(r13)     // Catch:{ Exception -> 0x087e }
            java.lang.String r13 = "/fully-header.html"
            r8.append(r13)     // Catch:{ Exception -> 0x087e }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x087e }
            java.lang.String r8 = n2.a.a0(r8)     // Catch:{ Exception -> 0x087e }
            goto L_0x0886
        L_0x087e:
            de.ozerov.fully.FullyActivity r8 = r4.f3879b
            java.lang.String r13 = "RemoteAdmin/fully-header.html"
            java.lang.String r8 = n2.a.L0(r8, r13)
        L_0x0886:
            java.lang.String r13 = "$short_name"
            java.lang.String r14 = "Fully"
            java.lang.String r8 = r8.replace(r13, r14)
            java.lang.String r13 = "$slug"
            java.lang.String r14 = "fully-single-app"
            java.lang.String r8 = r8.replace(r13, r14)
            java.lang.String r13 = "$add_to_head"
            java.lang.String r8 = r8.replace(r13, r9)
            java.lang.String r13 = "$remote_admin_css_file"
            java.lang.String r14 = "styles6.css"
            java.lang.String r8 = r8.replace(r13, r14)
            r0.append(r8)
            java.lang.String r8 = "<nav class='main-menu'>"
            r0.append(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r13 = "<header><a href='home'>Fully Remote Admin "
            r8.<init>(r13)
            r8.append(r6)
            java.lang.String r6 = "</a></header>"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r0.append(r6)
            java.lang.String r6 = "</nav><nav class='off-canvas-menu'><ul>\n"
            r0.append(r6)
            boolean r6 = r4.f3891p
            if (r6 == 0) goto L_0x092b
            java.lang.String r6 = "<li><a href='deviceInfo' title=''>Home</a></li>\n<li><a href='listSettings' title=''>Settings</a></li>\n<li><a href='manageSettings' title=''>Export/Import</a></li>\n<li><a href='manageApps' title=''>Manage Apps</a></li>\n"
            r0.append(r6)
            de.ozerov.fully.FullyActivity r6 = r4.f3879b
            d4.k r6 = r6.f9961z0
            java.lang.Object r6 = r6.f9767W
            Z1.c r6 = (Z1.c) r6
            r8 = 1
            boolean r6 = r6.n(r7, r8)
            if (r6 == 0) goto L_0x08e4
            java.lang.String r6 = "<li><a href='listFiles' title=''>Manage Files</a></li>\n"
            r0.append(r6)
        L_0x08e4:
            de.ozerov.fully.FullyActivity r6 = r4.f3879b
            d4.k r6 = r6.f9961z0
            java.lang.Boolean r6 = r6.u2()
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x08f7
            java.lang.String r6 = "<li><a href='showStats' title=''>Usage Statistics</a></li>\n"
            r0.append(r6)
        L_0x08f7:
            java.lang.String r6 = "<li><a href='showLog' title=''>Fully Log</a></li>\n"
            r0.append(r6)
            boolean r6 = r4.f3892q
            if (r6 == 0) goto L_0x0925
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "<li><a href='' onclick='closeWindow();return false;' title='Back to "
            r6.<init>(r7)
            d4.k r7 = r4.f3880c
            java.lang.String r8 = "Fully Cloud"
            java.lang.Object r7 = r7.f9767W
            Z1.c r7 = (Z1.c) r7
            java.lang.String r13 = "cloudName"
            java.lang.String r7 = r7.r(r13, r8)
            r6.append(r7)
            java.lang.String r7 = "'>Close device</a></li>\n"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.append(r6)
            goto L_0x0930
        L_0x0925:
            java.lang.String r6 = "<li><a href='logout' title='Logout'>Logout</a></li>\n"
            r0.append(r6)
            goto L_0x0930
        L_0x092b:
            java.lang.String r6 = "<li><a href='home' title='Login'>Login</a></li>\n"
            r0.append(r6)
        L_0x0930:
            java.lang.String r6 = "</ul></nav>\n<div class='content'>\n"
            r0.append(r6)
            boolean r6 = r4.f3891p
            if (r6 != 0) goto L_0x0a16
            java.lang.String r6 = "<h1>Please login</h1>\n"
            r0.append(r6)
            java.lang.String r6 = r4.f3888m
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0965
            java.lang.String r6 = r4.f3888m
            r7 = r22
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0965
            java.lang.String r6 = r4.f3888m
            boolean r6 = r6.equals(r12)
            if (r6 != 0) goto L_0x0965
            java.lang.String r6 = r4.f3888m
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0965
            java.lang.String r6 = "Please login first"
            r2.add(r6)
        L_0x0965:
            java.lang.String r2 = r4.b()
            r0.append(r2)
            de.ozerov.fully.FullyActivity r2 = r4.f3879b
            d4.k r2 = r2.f9961z0
            java.lang.String r2 = r2.K1()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0a11
            java.lang.String r2 = "<form action='home' method='post'>\n<p class='formline scale110'>Password: <input type='password' name='password' class='width10'>\n<input type='submit' name='submit' value='OK' class='button'>\n"
            r0.append(r2)
            int r2 = r4.f3885j
            r6 = 1
            if (r2 != r6) goto L_0x09d2
            java.lang.String r2 = r4.f3888m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x09d2
            java.lang.String r2 = r4.f3888m
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x09d2
            java.lang.String r2 = r4.f3888m
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x09d2
            java.lang.String r2 = r4.f3888m
            r3 = r16
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x09d2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.f3886k
            r2.append(r3)
            java.lang.String r3 = r4.f3887l
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x09ba
            r3 = r9
            goto L_0x09ca
        L_0x09ba:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "?"
            r3.<init>(r6)
            java.lang.String r6 = r4.f3887l
            r3.append(r6)
            java.lang.String r3 = r3.toString()
        L_0x09ca:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x09d3
        L_0x09d2:
            r2 = r9
        L_0x09d3:
            java.lang.String r3 = r4.f3888m
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x09eb
            java.util.HashMap r3 = r4.f3884h
            java.lang.Object r3 = r3.get(r10)
            if (r3 == 0) goto L_0x09eb
            java.util.HashMap r2 = r4.f3884h
            java.lang.Object r2 = r2.get(r10)
            java.lang.String r2 = (java.lang.String) r2
        L_0x09eb:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0a0b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "<input type='hidden' name='return' value='"
            r3.<init>(r6)
            java.lang.String r2 = android.text.TextUtils.htmlEncode(r2)
            r3.append(r2)
            java.lang.String r2 = "'>"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
        L_0x0a0b:
            java.lang.String r2 = "<input type='hidden' name='cmd' value='login'></p></form>\n"
            r0.append(r2)
            goto L_0x0a16
        L_0x0a11:
            java.lang.String r2 = "<p class='error'>Please set the Remote Admin Password in App Settings first.</p>"
            r0.append(r2)
        L_0x0a16:
            java.lang.String r2 = r4.c()
            r0.append(r2)
            java.lang.String r2 = "</div></body></html>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            P5.K r0 = h(r5, r1, r0)
            P5.D r1 = r4.i
            if (r1 == 0) goto L_0x0a31
            r1.c(r0)
        L_0x0a31:
            if (r0 != 0) goto L_0x0a3b
            java.lang.String r0 = "Internal Error -  Empty Response"
            r1 = r20
            P5.K r0 = h(r1, r11, r0)
        L_0x0a3b:
            r1 = r19
            goto L_0x0a45
        L_0x0a3e:
            java.lang.String r0 = "Not Found -  Unknown Command"
            P5.K r0 = h(r15, r11, r0)
            goto L_0x0a3b
        L_0x0a45:
            java.lang.Object r2 = r1.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r3 = "remoteAdminResponseHeaders"
            java.lang.String r2 = r2.r(r3, r9)
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0a99
            java.lang.Object r1 = r1.f9767W
            Z1.c r1 = (Z1.c) r1
            java.lang.String r1 = r1.r(r3, r9)
            java.lang.String r1 = r1.trim()
            java.lang.String[] r1 = n2.a.e1(r1)
            int r2 = r1.length
            r15 = 0
        L_0x0a6b:
            if (r15 >= r2) goto L_0x0a99
            r3 = r1[r15]
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            r5 = 2
            if (r4 != r5) goto L_0x0a95
            r4 = 0
            r6 = r3[r4]
            java.lang.String r6 = r6.trim()
            r7 = 1
            r8 = r3[r7]
            java.lang.String r8 = r8.trim()
            r0.k(r6, r8)
            r6 = r3[r4]
            r6.getClass()
            r3 = r3[r7]
            r3.getClass()
            goto L_0x0a97
        L_0x0a95:
            r4 = 0
            r7 = 1
        L_0x0a97:
            int r15 = r15 + r7
            goto L_0x0a6b
        L_0x0a99:
            return r0
        L_0x0a9a:
            r0 = move-exception
            r1 = r0
            P5.J r0 = r1.f3846U
            java.lang.String r1 = r1.getMessage()
            P5.K r0 = h(r0, r11, r1)
            return r0
        L_0x0aa7:
            r0 = move-exception
            r1 = r5
            r5 = r15
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Internal Error IO Exception: "
            r0.<init>(r3)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            P5.K r0 = h(r5, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.P.l(P5.G):P5.K");
    }

    /* renamed from: n */
    public final void m() {
        this.f3861b = this.f3862c.d();
        this.f3861b.setReuseAddress(true);
        M m8 = new M(this);
        Thread thread = new Thread(m8);
        this.f3863d = thread;
        thread.setDaemon(true);
        this.f3863d.setName("NanoHttpd Main Listener");
        this.f3863d.start();
        while (!m8.f3848V && ((IOException) m8.f3849W) == null) {
            try {
                Thread.sleep(10);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) m8.f3849W;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* renamed from: p */
    public final void o() {
        try {
            i(this.f3861b);
            E e8 = this.e;
            e8.getClass();
            Iterator it = new ArrayList((List) e8.f3810W).iterator();
            while (it.hasNext()) {
                A a8 = (A) it.next();
                i(a8.f3794U);
                i(a8.f3795V);
                Thread thread = a8.f3796W;
                if (thread != null) {
                    thread.interrupt();
                }
            }
            Thread thread2 = this.f3863d;
            if (thread2 != null) {
                thread2.join();
            }
        } catch (Exception e9) {
            f3856p.log(Level.SEVERE, "Could not stop all connections", e9);
        }
    }

    public final synchronized void q() {
        try {
            Timer timer = this.f3869l;
            if (timer != null) {
                timer.cancel();
                this.f3869l.purge();
                this.f3869l = null;
            }
            Handler handler = this.f3868k;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                this.f3868k = null;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
