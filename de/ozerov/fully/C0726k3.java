package de.ozerov.fully;

import Z1.c;
import android.content.Context;
import android.util.Log;
import d4.k;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.k3  reason: case insensitive filesystem */
public final class C0726k3 {

    /* renamed from: a  reason: collision with root package name */
    public String f10772a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f10773b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f10774c = 8;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10775d = false;

    public static ArrayList a(Context context) {
        ArrayList arrayList = new ArrayList();
        String r8 = ((c) new k(context, 1).f9767W).r("sleepSchedule", "");
        if (!r8.trim().isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(r8);
                for (int i = 0; i < jSONArray.length(); i++) {
                    C0726k3 k3Var = new C0726k3();
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        k3Var.f10772a = a.S(jSONObject, "sleepTime", (String) null);
                        k3Var.f10773b = a.S(jSONObject, "wakeupTime", (String) null);
                        k3Var.f10774c = a.R(jSONObject, "dayOfWeek", 0);
                        k3Var.f10775d = true;
                        arrayList.add(k3Var);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e8) {
                Log.e("k3", "JSON parser failed");
                e8.printStackTrace();
            }
        }
        return arrayList;
    }

    public static void b(Context context, ArrayList arrayList) {
        String str;
        k kVar = new k(context, 1);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0726k3 k3Var = (C0726k3) it.next();
            String str2 = k3Var.f10772a;
            if ((str2 != null && !str2.trim().isEmpty()) || ((str = k3Var.f10773b) != null && !str.trim().isEmpty())) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sleepTime", k3Var.f10772a);
                    jSONObject.put("wakeupTime", k3Var.f10773b);
                    jSONObject.put("dayOfWeek", k3Var.f10774c);
                    jSONArray.put(jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        String str3 = "";
        try {
            if (jSONArray.length() > 0) {
                str3 = jSONArray.toString(2).replace("\\/", "/");
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        kVar.V2("sleepSchedule", str3);
    }
}
