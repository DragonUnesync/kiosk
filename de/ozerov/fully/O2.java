package de.ozerov.fully;

import Q0.g;
import Z1.c;
import android.content.Context;
import d4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class O2 {

    /* renamed from: a  reason: collision with root package name */
    public String f10215a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f10216b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10217c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10218d = false;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10219f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10220g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f10221h = 0;
    public int i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f10222j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f10223k = 0;

    public static ArrayList b(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        String r8 = ((c) new k(context, 1).f9767W).r(str, "");
        if (!r8.trim().isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(r8);
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    O2 o2 = new O2();
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        o2.f10216b = a.R(jSONObject, "type", -1);
                        o2.f10215a = a.S(jSONObject, "url", (String) null);
                        o2.f10217c = a.Q(jSONObject, "loopItem", false);
                        o2.f10218d = a.Q(jSONObject, "loopFile", false);
                        o2.e = a.R(jSONObject, "fileOrder", 0);
                        o2.f10219f = a.Q(jSONObject, "nextItemOnTouch", false);
                        o2.f10220g = a.Q(jSONObject, "nextFileOnTouch", false);
                        o2.f10221h = a.R(jSONObject, "nextItemTimer", 0);
                        if (jSONObject.has("nextFileTimer")) {
                            o2.i = a.R(jSONObject, "nextFileTimer", 0);
                            o2.f10222j = a.R(jSONObject, "nextFileTimer", 0);
                        } else {
                            o2.i = a.R(jSONObject, "nextImageFileTimer", 0);
                            o2.f10222j = a.R(jSONObject, "nextVideoFileTimer", 0);
                        }
                        o2.f10223k = 1;
                        arrayList.add(o2);
                    } catch (Exception e8) {
                        g.x(e8, new StringBuilder("JSON get object failed due to "), "O2");
                    }
                }
            } catch (Exception e9) {
                g.x(e9, new StringBuilder("JSON parser failed due to "), "O2");
            }
        }
        return arrayList;
    }

    public static void c(Context context, String str, List list) {
        k kVar = new k(context, 1);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O2 o2 = (O2) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", o2.f10216b);
                jSONObject.put("url", o2.f10215a);
                jSONObject.put("loopItem", o2.f10217c);
                jSONObject.put("loopFile", o2.f10218d);
                jSONObject.put("fileOrder", o2.e);
                jSONObject.put("nextItemOnTouch", o2.f10219f);
                jSONObject.put("nextFileOnTouch", o2.f10220g);
                jSONObject.put("nextItemTimer", o2.f10221h);
                jSONObject.put("nextImageFileTimer", o2.i);
                jSONObject.put("nextVideoFileTimer", o2.f10222j);
                jSONArray.put(jSONObject);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        String str2 = "";
        try {
            if (!list.isEmpty()) {
                str2 = jSONArray.toString(2).replace("\\/", "/");
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        kVar.V2(str, str2);
    }

    public final boolean a() {
        int i8 = this.f10216b;
        if (i8 == 0 || i8 == 4 || i8 == 5 || i8 == -1) {
            return true;
        }
        return false;
    }
}
