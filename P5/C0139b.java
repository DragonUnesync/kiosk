package P5;

import B.C0002c;
import Q0.g;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Log;
import d4.k;
import de.ozerov.fully.C0723k0;
import de.ozerov.fully.C0752p;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.I1;
import de.ozerov.fully.P;
import de.ozerov.fully.T;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;
import u.C1477r;

/* renamed from: P5.b  reason: case insensitive filesystem */
public final class C0139b extends C0145h {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3897w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0139b(int i) {
        super(4);
        this.f3897w = i;
    }

    public K a() {
        switch (this.f3897w) {
            case 0:
                if (this.f3891p && this.f3888m.equals("clearAppData") && this.f3884h.get("package") != null) {
                    String str = (String) this.f3884h.get("package");
                    if (str == null || str.isEmpty()) {
                        this.f3895t.add("Missing parameter package");
                    } else if (C0794w0.Z(this.f3879b) && a.C0()) {
                        I1.c(this.f3879b, str);
                        ArrayList arrayList = this.f3894s;
                        arrayList.add("Started clearing app data for " + str + ". Watch log for results ...");
                    } else if (P.f10240j) {
                        P.b(str);
                        this.f3894s.add("Started clearing app data for ".concat(str));
                    } else {
                        this.f3895t.add("This feature is only available on provisioned devices with Android 9+ or rooted devices");
                    }
                }
                return null;
            case 1:
                if (this.f3891p && this.f3888m.equals("killBackgroundProcesses") && this.f3884h.get("package") != null) {
                    String str2 = (String) this.f3884h.get("package");
                    ArrayList arrayList2 = this.f3895t;
                    if (str2 == null || str2.isEmpty()) {
                        arrayList2.add("Missing parameters");
                    } else if (str2.equals(C0794w0.r(this.f3879b))) {
                        arrayList2.add("The app " + str2 + " is in foreground, we can't kill it");
                    } else {
                        try {
                            ((ActivityManager) this.f3879b.getSystemService("activity")).killBackgroundProcesses(str2);
                            this.f3894s.add("Trying to kill background app ".concat(str2));
                        } catch (Exception unused) {
                            arrayList2.add("Can't kill background app ".concat(str2));
                        }
                    }
                }
                return null;
            case 3:
                if (this.f3891p && this.f3888m.equals("runRootCommand") && this.f3884h.get("command") != null) {
                    String str3 = (String) this.f3884h.get("command");
                    if (str3 == null || str3.isEmpty()) {
                        this.f3895t.add("Missing parameters");
                    } else {
                        this.f3879b.runOnUiThread(new C0002c((Object) this, 19, (Object) str3));
                        this.f3894s.add("Executing command");
                    }
                }
                return null;
            case 4:
                if (this.f3891p && this.f3888m.equals("runSuCommand") && this.f3884h.get("command") != null) {
                    String str4 = (String) this.f3884h.get("command");
                    if (str4 == null || str4.isEmpty()) {
                        this.f3895t.add("Missing parameters");
                    } else {
                        P.L(str4);
                        this.f3894s.add("Executing command");
                    }
                }
                return null;
            case 5:
                if (this.f3891p && this.f3888m.equals("uninstallApp") && this.f3884h.get("package") != null) {
                    String str5 = (String) this.f3884h.get("package");
                    try {
                        this.f3879b.getPackageManager().getApplicationInfo(str5, 0);
                        if (this.f3895t.isEmpty()) {
                            FullyActivity fullyActivity = this.f3879b;
                            Thread thread = C0752p.f10876a;
                            if (P.f10240j) {
                                C0723k0 k0Var = new C0723k0();
                                k0Var.f10766b = C1477r.d("pm uninstall ", str5);
                                k0Var.execute(new Void[0]);
                                a.b1(fullyActivity, "Uninstalling " + str5 + " ...");
                            } else {
                                try {
                                    PackageInstaller packageInstaller = fullyActivity.getPackageManager().getPackageInstaller();
                                    PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
                                    sessionParams.setAppPackageName(str5);
                                    int createSession = packageInstaller.createSession(sessionParams);
                                    Intent intent = new Intent("com.fullykiosk.singleapp.action.uninstall_complete");
                                    intent.setPackage(fullyActivity.getPackageName());
                                    packageInstaller.uninstall(str5, PendingIntent.getBroadcast(fullyActivity, createSession, intent, 33554432).getIntentSender());
                                } catch (Exception e) {
                                    StringBuilder s8 = g.s("Package un-install failed for ", str5, " due to ");
                                    s8.append(e.getMessage());
                                    String sb = s8.toString();
                                    Log.e("AiManager", sb);
                                    C0794w0.q0(2, "AiManager", sb);
                                    if (!new k((Context) fullyActivity, 1).c0().booleanValue()) {
                                        a.b1(fullyActivity, sb);
                                    }
                                }
                            }
                            ArrayList arrayList3 = this.f3894s;
                            arrayList3.add("Starting uninstall for " + str5 + ". Watch log for results ...");
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        ArrayList arrayList4 = this.f3895t;
                        arrayList4.add("App " + str5 + " not installed, can't uninstall");
                    }
                }
                return null;
            default:
                return super.a();
        }
    }

    public String d() {
        boolean z;
        switch (this.f3897w) {
            case 2:
                if (!this.f3891p) {
                    return C0138a.e("Please login");
                }
                String str = (String) this.f3884h.get("showAllApps");
                if (str == null || (!str.equals("true") && !str.equals("1"))) {
                    z = false;
                } else {
                    z = true;
                }
                ArrayList n02 = C0794w0.n0(this.f3879b, z);
                JSONArray jSONArray = new JSONArray();
                Iterator it = n02.iterator();
                while (true) {
                    String str2 = "";
                    if (it.hasNext()) {
                        T t8 = (T) it.next();
                        if (z || (t8.f10354h & 129) <= 0) {
                            JSONObject jSONObject = new JSONObject();
                            if (t8.e != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                a.A(t8.e).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                                str2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            }
                            try {
                                jSONObject.put("label", t8.f10348a);
                                jSONObject.put("package", C0794w0.L(t8.f10349b));
                                jSONObject.put("version", t8.f10350c);
                                jSONObject.put("versionCode", t8.f10351d);
                                jSONObject.put("icon", str2);
                                jSONArray.put(jSONObject);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        try {
                            return jSONArray.toString(2).replace("\\/", "/");
                        } catch (Exception unused) {
                            return str2;
                        }
                    }
                }
                break;
            default:
                return super.d();
        }
    }
}
