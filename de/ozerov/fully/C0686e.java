package de.ozerov.fully;

import N.e;
import P6.f;
import Q7.g;
import V0.r;
import W2.m;
import Y6.q;
import Y6.u;
import Z1.c;
import Z6.b;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.AsyncTask;
import android.os.Looper;
import android.util.Log;
import android.widget.ListAdapter;
import c7.h;
import com.samsung.android.knox.accounts.Account;
import com.samsung.android.knox.license.EnterpriseLicenseManager;
import d4.k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import n2.a;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.e  reason: case insensitive filesystem */
public class C0686e extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10604a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10605b;

    public /* synthetic */ C0686e(int i, Object obj) {
        this.f10604a = i;
        this.f10605b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    public final Object doInBackground(Object[] objArr) {
        ArrayList arrayList;
        boolean z = false;
        switch (this.f10604a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                HashMap hashMap = new HashMap();
                hashMap.put("appid", "56");
                r rVar = (r) this.f10605b;
                hashMap.put("devid", P.i((FullyActivity) rVar.f5586b));
                String str = (String) rVar.f5588d;
                if (str != null) {
                    hashMap.put("devalias", str);
                }
                hashMap.put("cloudemail", (String) rVar.e);
                String str2 = (String) rVar.f5589f;
                if (str2 != null) {
                    hashMap.put("cloudpass", str2);
                } else {
                    String str3 = (String) rVar.f5590g;
                    if (str3 != null) {
                        hashMap.put("masterpass", str3);
                    }
                }
                k kVar = (k) rVar.f5587c;
                hashMap.put("devpass", kVar.K1());
                return C0808y2.l(((c) kVar.f9767W).r("remotingServerHost", "https://remoting2.fully-kiosk.com") + "/api/add_device.php", hashMap, 8000, 8000, 2);
            case 1:
                Void[] voidArr2 = (Void[]) objArr;
                return C0808y2.f(((C0740n) this.f10605b).f10830n);
            case 2:
                Void[] voidArr3 = (Void[]) objArr;
                C0805y yVar = (C0805y) this.f10605b;
                ArrayList n02 = C0794w0.n0(yVar.f9850f1, yVar.t1);
                yVar.f11108v1 = n02;
                Iterator it = n02.iterator();
                while (it.hasNext()) {
                    T t8 = (T) it.next();
                    t8.f10352f = yVar.f11107u1.contains(C0794w0.L(t8.f10349b));
                }
                return null;
            case 3:
                Void[] voidArr4 = (Void[]) objArr;
                q qVar = new q();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f.e(timeUnit, "unit");
                qVar.f6691r = b.b(8, timeUnit);
                qVar.f6693t = b.b(4, timeUnit);
                qVar.f6692s = b.b(4, timeUnit);
                qVar.f6680f = true;
                qVar.f6682h = true;
                qVar.i = true;
                Y6.r rVar2 = new Y6.r(qVar);
                B3.q qVar2 = new B3.q(9);
                qVar2.r0(((c) ((FullyActivity) this.f10605b).f9961z0.f9767W).r("remotingServerHost", "https://remoting2.fully-kiosk.com"));
                qVar2.U("GET", (g) null);
                try {
                    u c8 = new h(rVar2, qVar2.n()).c();
                    c8.close();
                    return c8.f6742X + " " + c8.f6741W;
                } catch (IOException e) {
                    return e.getMessage();
                }
            case 4:
                Void[] voidArr5 = (Void[]) objArr;
                String str4 = Z0.f10526b;
                if (str4 == null || str4.isEmpty()) {
                    return Z0.a((C0780t4) this.f10605b, "elm");
                }
                return Z0.f10526b;
            case 5:
                return C0808y2.j(((String[]) objArr)[0]);
            default:
                Void[] voidArr6 = (Void[]) objArr;
                com.bumptech.glide.b a8 = com.bumptech.glide.b.a(((C0803x3) this.f10605b).f11077b);
                a8.getClass();
                char[] cArr = m.f6173a;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z = true;
                }
                if (!z) {
                    a8.f8969U.f1146f.a().clear();
                    C0803x3 x3Var = (C0803x3) this.f10605b;
                    O2 o2 = x3Var.f11082h;
                    if (o2 == null || o2.f10215a == null) {
                        arrayList = null;
                    } else {
                        x3Var.e.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(Arrays.asList(new String[]{"3gp", "mp4", "ts", "webm", "mkv"}));
                        arrayList2.addAll(C0740n.g());
                        arrayList2.addAll(Arrays.asList(new String[]{"mpa", "aac", "flac", "mid", "xmf", "mxmf", "rtttl", "rtx", "ota", "imy", "mp3", "wav", "ogg"}));
                        HashSet hashSet = new HashSet(arrayList2);
                        arrayList2.clear();
                        arrayList2.addAll(hashSet);
                        arrayList = a.K0(new File(a.F(x3Var.f11077b, o2.f10215a)), new P5.u(1, arrayList2));
                        if (arrayList.size() > 1) {
                            int i = o2.e;
                            if (i == 8) {
                                Collections.shuffle(arrayList);
                            } else if (i != 9) {
                                Collections.sort(arrayList, new K.a(2, o2));
                            }
                        }
                    }
                    x3Var.f11081g = arrayList;
                    return null;
                }
                throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, android.widget.AdapterView$OnItemClickListener] */
    public final void onPostExecute(Object obj) {
        String str;
        String str2;
        switch (this.f10604a) {
            case 0:
                String str3 = (String) obj;
                r rVar = (r) this.f10605b;
                k kVar = (k) rVar.f5587c;
                if (((FullyActivity) rVar.f5586b).w()) {
                    FullyActivity fullyActivity = (FullyActivity) rVar.f5586b;
                    if (str3 == null) {
                        a.b1(fullyActivity, "Adding device failed due to some network issue");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        if (jSONObject.getString("status").equals("Error")) {
                            a.b1(fullyActivity, jSONObject.getString("statustext"));
                            return;
                        } else if (jSONObject.getString("status").equals("OK")) {
                            a.b1(fullyActivity, jSONObject.getString("statustext"));
                            rVar.f5590g = jSONObject.getString("masterpass");
                            kVar.V2("cloudAccountEmailAdded", (String) rVar.e);
                            if (rVar.f5585a) {
                                kVar.V2("cloudAccountEmail", (String) rVar.e);
                                kVar.V2("cloudAccountMasterPass", (String) rVar.f5590g);
                            }
                            String str4 = (String) rVar.f5588d;
                            if (str4 != null && !str4.isEmpty()) {
                                kVar.V2("cloudAccountDeviceAlias", (String) rVar.f5588d);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        a.b1(fullyActivity, "Adding device failed due to server communication problem");
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                String str5 = (String) obj;
                C0740n nVar = (C0740n) this.f10605b;
                if (str5 == null || (!str5.startsWith("image") && !nVar.f10830n.toLowerCase().endsWith(".png") && !nVar.f10830n.toLowerCase().endsWith(".jpg"))) {
                    nVar.f10818H = 1;
                } else {
                    nVar.f10818H = 0;
                }
                nVar.o();
                return;
            case 2:
                Void voidR = (Void) obj;
                C0805y yVar = (C0805y) this.f10605b;
                if (yVar.f9850f1.w()) {
                    C0793w wVar = new C0793w(this, yVar.f9850f1, yVar.f11108v1);
                    yVar.w1 = wVar;
                    yVar.f11102n1.setAdapter(wVar);
                    yVar.f11102n1.setOnItemClickListener(new Object());
                    yVar.f11100l1.setVisibility(8);
                    if (!P.y(yVar.f9850f1)) {
                        yVar.f11103o1.setVisibility(0);
                    }
                    yVar.f11102n1.setVisibility(0);
                    yVar.f11104p1.setEnabled(true);
                    yVar.f11109x1 = true;
                    Dialog dialog = yVar.f8029a1;
                    if ((dialog instanceof AlertDialog) && dialog.isShowing()) {
                        ((AlertDialog) dialog).getButton(-1).setEnabled(true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                C0794w0.i = (String) obj;
                AlertDialog alertDialog = C0794w0.f11023h;
                if (alertDialog != null) {
                    alertDialog.setMessage(C0794w0.s((FullyActivity) this.f10605b));
                    return;
                }
                return;
            case 4:
                String str6 = (String) obj;
                boolean z = Z0.f10525a;
                Log.i("Z0", "Received ELM Key: " + str6);
                C0780t4 t4Var = (C0780t4) this.f10605b;
                if (t4Var.w()) {
                    if (str6 == null || str6.isEmpty()) {
                        a.b1(t4Var, "Knox licensing failed (ELM)");
                        return;
                    }
                    Z0.f10526b = str6;
                    try {
                        EnterpriseLicenseManager.getInstance(t4Var.getApplicationContext()).activateLicense(Z0.f10526b);
                        return;
                    } catch (Error | Exception e8) {
                        e8.printStackTrace();
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                String str7 = (String) obj;
                if (((FullyActivity) ((Q.h) this.f10605b).f4005V).w()) {
                    String i = P.i((FullyActivity) ((Q.h) this.f10605b).f4005V);
                    if (str7 == null) {
                        if (this instanceof C0748o1) {
                            a.b1((FullyActivity) ((Q.h) this.f10605b).f4005V, "Licensing server unavailable, check Internet connection");
                        }
                        ((Q.h) this.f10605b).g();
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(str7);
                        String S8 = a.S(jSONObject2, "status", "");
                        String S9 = a.S(jSONObject2, "statustext", "");
                        if (S8.equals("Not found")) {
                            a.R(jSONObject2, "variant", 0);
                            if (Q.h.f4003X) {
                                a.a1(1, (FullyActivity) ((Q.h) this.f10605b).f4005V, "The license of this device was revoked");
                            }
                            ((Q.h) this.f10605b).j(false);
                            ((k) ((Q.h) this.f10605b).f4006W).V2("licenseSignature", "");
                            if (!i.equals(((k) ((Q.h) this.f10605b).f4006W).f1()) && !((k) ((Q.h) this.f10605b).f4006W).f1().isEmpty()) {
                                String str8 = "Device ID changed from " + ((k) ((Q.h) this.f10605b).f4006W).f1() + " to " + i + " ?";
                                Log.w("LicenseManager", str8);
                                C0794w0.q0(1, "LicenseManager", str8);
                                String str9 = "You had a valid license for the device ID " + ((k) ((Q.h) this.f10605b).f4006W).f1() + ". However your current device ID is " + i + ". ";
                                AlertDialog.Builder builder = new AlertDialog.Builder((FullyActivity) ((Q.h) this.f10605b).f4005V);
                                if (((k) ((Q.h) this.f10605b).f4006W).g1().isEmpty()) {
                                    str2 = e.x(str9, "Please move the license to the new ID.");
                                    builder.setPositiveButton("Move license", new C0736m1(this, 0, i));
                                    builder.setNegativeButton("Forget it", new C0736m1(this, 1, jSONObject2));
                                } else {
                                    str2 = e.x(str9, "Please unregister the volume license from the old ID. If you press Forget the license slot likely will be lost.");
                                    builder.setPositiveButton("Unregister", new C0742n1(this, 0));
                                    builder.setNegativeButton("Forget it", new C0742n1(this, 1));
                                }
                                builder.setTitle("Device ID changed?");
                                builder.setMessage(str2);
                                builder.setCancelable(true);
                                a.Z0(builder.create());
                                return;
                            } else if (this instanceof C0748o1) {
                                Q.h.f((Q.h) this.f10605b, jSONObject2);
                                return;
                            } else {
                                return;
                            }
                        } else if (S8.equals("Found")) {
                            String S10 = a.S(jSONObject2, Account.SIGNATURE, "");
                            if (a.l1(i, S10)) {
                                ((k) ((Q.h) this.f10605b).f4006W).T2(i);
                                ((k) ((Q.h) this.f10605b).f4006W).V2("licenseSignature", S10);
                                if (!Q.h.f4003X || (this instanceof C0748o1)) {
                                    a.a1(1, (FullyActivity) ((Q.h) this.f10605b).f4005V, "This device has a valid PLUS license. Thank you!");
                                }
                                ((Q.h) this.f10605b).j(true);
                                return;
                            }
                            a.a1(1, (FullyActivity) ((Q.h) this.f10605b).f4005V, "License server error");
                            ((Q.h) this.f10605b).g();
                            return;
                        } else if (S8.equals("Processing")) {
                            if (S9.isEmpty()) {
                                str = S8;
                            } else {
                                str = S9;
                            }
                            Log.w("LicenseManager", str);
                            FullyActivity fullyActivity2 = (FullyActivity) ((Q.h) this.f10605b).f4005V;
                            if (!S9.isEmpty()) {
                                S8 = S9;
                            }
                            a.a1(1, fullyActivity2, S8);
                            ((Q.h) this.f10605b).g();
                            return;
                        } else {
                            Log.w("LicenseManager", "Unknown status - Server error? Status: " + S8 + " Statustext: " + S9);
                            FullyActivity fullyActivity3 = (FullyActivity) ((Q.h) this.f10605b).f4005V;
                            if (!S9.isEmpty()) {
                                S8 = S9;
                            }
                            a.a1(1, fullyActivity3, S8);
                            ((Q.h) this.f10605b).g();
                            return;
                        }
                    } catch (Exception unused) {
                        Log.e("LicenseManager", "JSON parser failed");
                        return;
                    }
                } else {
                    return;
                }
            default:
                Void voidR2 = (Void) obj;
                if (((C0803x3) this.f10605b).f11077b.w()) {
                    try {
                        com.bumptech.glide.b a8 = com.bumptech.glide.b.a(((C0803x3) this.f10605b).f11077b);
                        a8.getClass();
                        m.a();
                        a8.f8971W.h(0);
                        a8.f8970V.l();
                        a8.f8973Y.a();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    if (((C0803x3) this.f10605b).f11081g == null || ((C0803x3) this.f10605b).f11081g.isEmpty()) {
                        ((C0803x3) this.f10605b).getClass();
                        a.b1(((C0803x3) this.f10605b).f11077b, "Can't get anything from " + ((C0803x3) this.f10605b).f11082h.f10215a);
                        ((C0803x3) this.f10605b).g();
                        return;
                    }
                    ((C0803x3) this.f10605b).i();
                    ((C0803x3) this.f10605b).f11083j = 0;
                    ((C0803x3) this.f10605b).e();
                    return;
                }
                return;
        }
    }

    public void onPreExecute() {
        switch (this.f10604a) {
            case 0:
                return;
            case 2:
                C0805y yVar = (C0805y) this.f10605b;
                yVar.f11100l1.setVisibility(0);
                yVar.f11103o1.setVisibility(8);
                yVar.f11102n1.setVisibility(8);
                yVar.f11102n1.setAdapter((ListAdapter) null);
                yVar.f11104p1.setEnabled(false);
                yVar.f11109x1 = false;
                return;
            case 4:
            case 6:
                return;
            default:
                super.onPreExecute();
                return;
        }
    }
}
