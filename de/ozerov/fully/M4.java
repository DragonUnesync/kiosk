package de.ozerov.fully;

import android.util.Log;
import d4.k;
import n2.a;
import org.json.JSONObject;

public final class M4 extends N4 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10099b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0674c f10100c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M4(C0674c cVar, int i) {
        super(cVar);
        this.f10099b = i;
        this.f10100c = cVar;
    }

    public final void onPostExecute(Object obj) {
        switch (this.f10099b) {
            case 0:
                String str = (String) obj;
                super.a(str);
                if (str != null) {
                    C0674c cVar = this.f10100c;
                    FullyActivity fullyActivity = cVar.f10573a;
                    if (fullyActivity.w()) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            String S8 = a.S(jSONObject, "status", "");
                            String S9 = a.S(jSONObject, "statustext", "");
                            String S10 = a.S(jSONObject, "vhash", "");
                            String S11 = a.S(jSONObject, "devid", "");
                            Log.i("VolumeLicenseManager", S9 + " Device ID: " + S11);
                            boolean equals = S8.equals("OK");
                            k kVar = cVar.f10574b;
                            if (equals && !S10.isEmpty()) {
                                kVar.V2("licenseVolumeKey", S10);
                                kVar.V2("volumeLicenseKey", S10);
                                C0794w0.q0(0, "VolumeLicenseManager", S9 + " Device ID: " + S11);
                            }
                            kVar.V2("volumeLicenseStatus", S9);
                            a.a1(1, fullyActivity, S9);
                            fullyActivity.f9924M0.i(true, false);
                            return;
                        } catch (Exception unused) {
                            a.a1(1, fullyActivity, "Error parsing license server answer");
                            Log.e("VolumeLicenseManager", "JSON parser failed for ".concat(str));
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                String str2 = (String) obj;
                super.a(str2);
                if (str2 != null) {
                    C0674c cVar2 = this.f10100c;
                    FullyActivity fullyActivity2 = cVar2.f10573a;
                    if (fullyActivity2.w()) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str2);
                            String S12 = a.S(jSONObject2, "status", "");
                            String S13 = a.S(jSONObject2, "statustext", "");
                            a.S(jSONObject2, "vhash", "");
                            String S14 = a.S(jSONObject2, "devid", "");
                            boolean equals2 = S12.equals("OK");
                            k kVar2 = cVar2.f10574b;
                            if (equals2) {
                                kVar2.V2("volumeLicenseKey", "");
                                kVar2.V2("licenseVolumeKey", "");
                                kVar2.T2("");
                                kVar2.V2("licenseSignature", "");
                            }
                            kVar2.V2("volumeLicenseStatus", S13);
                            Log.i("VolumeLicenseManager", S13 + " Device ID: " + S14);
                            C0794w0.q0(0, "VolumeLicenseManager", S13 + " Device ID: " + S14);
                            a.a1(1, fullyActivity2, S13);
                            fullyActivity2.f9924M0.i(true, false);
                            return;
                        } catch (Exception unused2) {
                            a.a1(1, fullyActivity2, "Error parsing license server answer");
                            Log.e("VolumeLicenseManager", "JSON parser failed for ".concat(str2));
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
