package de.ozerov.fully;

import A.d;
import N.e;
import Q5.f;
import Q5.h;
import Q5.i;
import Q5.j;
import Z1.c;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;
import d4.k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import n2.a;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.k0  reason: case insensitive filesystem */
public final class C0723k0 extends AsyncTask {

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f10764d;
    public static long e;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10765a;

    /* renamed from: b  reason: collision with root package name */
    public Object f10766b;

    /* renamed from: c  reason: collision with root package name */
    public Object f10767c;

    public C0723k0(d dVar) {
        this.f10765a = 0;
        this.f10767c = dVar;
    }

    private final void a() {
    }

    public static void b(Context context, d dVar) {
        if (!f10764d) {
            C0723k0 k0Var = new C0723k0(dVar);
            k0Var.f10766b = new WeakReference(context);
            k0Var.execute(new Void[0]);
        }
    }

    public final Object doInBackground(Object[] objArr) {
        String str;
        i b8;
        switch (this.f10765a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                try {
                    Context context = (Context) ((WeakReference) this.f10766b).get();
                    if (context != null) {
                        for (String F8 : a.e1(((c) new k(context, 1).f9767W).r("folderCleanupList", ""))) {
                            String F9 = a.F(context, F8);
                            File file = new File(F9);
                            if (file.exists()) {
                                Log.i("k0", "Cleanup " + F9 + " ...");
                                a.C(file);
                            } else {
                                Context context2 = (Context) ((WeakReference) this.f10766b).get();
                                if (context2 != null) {
                                    Log.w("k0", "Folder " + F9 + " not found for cleanup");
                                    a.b1(context2, "Folder " + F9 + " not found for cleanup");
                                }
                            }
                        }
                        return null;
                    }
                    throw new IllegalStateException("FolderCleanupTask lost context");
                } catch (Exception e8) {
                    e8.printStackTrace();
                    Log.e("k0", "LoadContentZipFileTask failed: " + e8.getMessage());
                    return e8.getMessage();
                }
            case 1:
                Void[] voidArr2 = (Void[]) objArr;
                String str2 = Z0.f10527c;
                if (str2 != null && !str2.isEmpty()) {
                    return Z0.f10527c;
                }
                return Z0.a((C0780t4) this.f10767c, ((c) ((k) this.f10766b).f9767W).r("knoxLicenseTag", "skl"));
            case 2:
                Void[] voidArr3 = (Void[]) objArr;
                HashMap hashMap = new HashMap();
                hashMap.put("appid", "56");
                ProvisioningActivity provisioningActivity = (ProvisioningActivity) this.f10767c;
                hashMap.put("devid", P.i(provisioningActivity));
                hashMap.put("pcode", (String) this.f10766b);
                hashMap.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
                int i = ProvisioningActivity.f10263k0;
                StringBuilder sb = new StringBuilder();
                String str3 = provisioningActivity.f10276g0;
                if (str3 == null) {
                    str3 = ((c) provisioningActivity.f10264U.f9767W).r("provisioningServerHost", "https://remoting2.fully-kiosk.com");
                }
                return C0808y2.l(e.A(sb, str3, "/api/add_emm_device2.php"), hashMap, 8000, 8000, 2);
            default:
                Void[] voidArr4 = (Void[]) objArr;
                try {
                    if (!j.a() || (str = (String) this.f10766b) == null) {
                        Log.e("P", "Device not rooted, no root access or null command");
                        return null;
                    }
                    b8 = f.f4141d.b();
                    int[] iArr = new int[1];
                    b8.n(str, new A1.d(26, b8, iArr, false));
                    b8.A();
                    if (iArr[0] >= 0) {
                        b8.close();
                        return null;
                    }
                    throw new h();
                } catch (Exception e9) {
                    Log.e("P", "RootCommand run failed: " + ((String) this.f10766b), e9);
                } catch (Throwable th) {
                    b8.close();
                    throw th;
                }
                break;
        }
    }

    public final void onPostExecute(Object obj) {
        switch (this.f10765a) {
            case 0:
                String str = (String) obj;
                Context context = (Context) ((WeakReference) this.f10766b).get();
                if (!(str == null || context == null)) {
                    a.b1(context, str);
                }
                f10764d = false;
                d dVar = (d) this.f10767c;
                if (dVar != null) {
                    dVar.run();
                    return;
                }
                return;
            case 1:
                String str2 = (String) obj;
                boolean z = Z0.f10525a;
                Log.i("Z0", "Received SKL Key: " + str2);
                C0780t4 t4Var = (C0780t4) this.f10767c;
                if (t4Var.w()) {
                    if (str2 == null || str2.isEmpty()) {
                        a.b1(t4Var, "Knox licensing failed (SKL)");
                        return;
                    }
                    Z0.f10527c = str2;
                    try {
                        KnoxEnterpriseLicenseManager.getInstance(t4Var.getApplicationContext()).activateLicense(Z0.f10527c);
                        return;
                    } catch (Error | Exception e8) {
                        e8.printStackTrace();
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                int i = ProvisioningActivity.f10263k0;
                ProvisioningActivity provisioningActivity = (ProvisioningActivity) this.f10767c;
                if (str3 == null) {
                    provisioningActivity.a(2, "Getting provisioning profile failed due to some network issue");
                    provisioningActivity.k();
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    if (jSONObject.getString("status").equals("Error")) {
                        provisioningActivity.a(2, jSONObject.getString("statustext"));
                        provisioningActivity.k();
                        return;
                    } else if (jSONObject.getString("status").equals("OK")) {
                        provisioningActivity.a(0, jSONObject.getString("statustext"));
                        provisioningActivity.f10270a0 = a.S(jSONObject, "token", (String) null);
                        provisioningActivity.f10268Y = a.S(jSONObject, "settings", (String) null);
                        provisioningActivity.f10269Z = a.S(jSONObject, "settingsUrl", (String) null);
                        String str4 = provisioningActivity.f10270a0;
                        if (str4 == null || str4.isEmpty() || !a.y0()) {
                            provisioningActivity.h();
                            return;
                        }
                        provisioningActivity.a(1, "This APK has no EMM support, can't add to Enterprise");
                        provisioningActivity.h();
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                    provisioningActivity.a(2, "Getting EMM token failed due to server communication problem");
                    provisioningActivity.k();
                    return;
                }
            default:
                Void voidR = (Void) obj;
                C0747o0 o0Var = (C0747o0) this.f10767c;
                if (o0Var != null) {
                    o0Var.run();
                    return;
                }
                return;
        }
    }

    public void onPreExecute() {
        switch (this.f10765a) {
            case 0:
                f10764d = true;
                e = System.currentTimeMillis();
                return;
            case 1:
                return;
            case 2:
                int i = ProvisioningActivity.f10263k0;
                ((ProvisioningActivity) this.f10767c).a(0, "Getting provisioning profile for " + ((String) this.f10766b));
                return;
            default:
                super.onPreExecute();
                return;
        }
    }

    public C0723k0() {
        this.f10765a = 3;
        this.f10766b = null;
        this.f10767c = null;
    }

    public C0723k0(k kVar, C0780t4 t4Var) {
        this.f10765a = 1;
        this.f10766b = kVar;
        this.f10767c = t4Var;
    }

    public C0723k0(ProvisioningActivity provisioningActivity, String str) {
        this.f10765a = 2;
        this.f10767c = provisioningActivity;
        this.f10766b = str;
    }
}
