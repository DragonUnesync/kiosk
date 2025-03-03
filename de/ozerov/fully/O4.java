package de.ozerov.fully;

import Z1.c;
import android.content.Context;
import android.util.Log;
import d4.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class O4 {

    /* renamed from: g  reason: collision with root package name */
    public static final List f10225g = Arrays.asList(new String[]{"Select action", "Fill in Text Form Field", "Toggle Checkbox", "Click Button or Link", "Load URL", "Remove before load", "Remove after load"});

    /* renamed from: h  reason: collision with root package name */
    public static final List f10226h = Arrays.asList(new String[]{"UNKNOWN", "FILL_FIELD", "TOGGLE_CHECKBOX", "CLICK_BUTTON_LINK", "LOAD_URL", "REMOVE_ITEMS_BEFORE", "REMOVE_ITEMS_AFTER"});
    public static final List i = Arrays.asList(new List[]{null, Arrays.asList(new String[]{"Select target", "First text field", "First password field", "Field by Index", "Field by ID", "Field by Class", "Field by Name", "Field by text", "Field by selector"}), Arrays.asList(new String[]{"Select target", "First checkbox", "Field by Index", "Field by ID", "Field by Class", "Field by Name", "Field by selector"}), Arrays.asList(new String[]{"Select target", "First form button", "First link", "Link/button by Index", "Link/button by ID", "Link/button by Class", "Link/button by Name", "Link/button by text", "Link/button by selector"}), Arrays.asList(new String[]{"URL"}), Arrays.asList(new String[]{"Select target", "All cookies", "All webstorage", "All cache"}), Arrays.asList(new String[]{"Select target", "All history"})});

    /* renamed from: j  reason: collision with root package name */
    public static final List f10227j = Arrays.asList(new List[]{null, Arrays.asList(new String[]{"UNKNOWN", "FIRST_TEXT_FIELD", "FIRST_PASSWORD_FIELD", "TARGET_BY_INDEX", "TARGET_BY_ID", "TARGET_BY_CLASS", "TARGET_BY_NAME", "TARGET_BY_TEXT", "TARGET_BY_SELECTOR"}), Arrays.asList(new String[]{"UNKNOWN", "FIRST_CHECKBOX", "TARGET_BY_INDEX", "TARGET_BY_ID", "TARGET_BY_CLASS", "TARGET_BY_NAME", "TARGET_BY_SELECTOR"}), Arrays.asList(new String[]{"UNKNOWN", "FIRST_BUTTON", "FIRST_LINK", "TARGET_BY_INDEX", "TARGET_BY_ID", "TARGET_BY_CLASS", "TARGET_BY_NAME", "TARGET_BY_TEXT", "TARGET_BY_SELECTOR"}), Arrays.asList(new String[]{"TARGET_URL"}), Arrays.asList(new String[]{"UNKNOWN", "ALL_COOKIES", "ALL_WEBSTORAGE", "ALL_CACHE"}), Arrays.asList(new String[]{"UNKNOWN", "ALL_HISTORY"})});

    /* renamed from: a  reason: collision with root package name */
    public int f10228a = 1;

    /* renamed from: b  reason: collision with root package name */
    public String f10229b = "https://*";

    /* renamed from: c  reason: collision with root package name */
    public String f10230c;

    /* renamed from: d  reason: collision with root package name */
    public String f10231d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public String f10232f;

    public static ArrayList a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        String r8 = ((c) new k(context, 1).f9767W).r(str, "");
        if (r8.trim().isEmpty()) {
            arrayList.clear();
        } else {
            try {
                JSONArray jSONArray = new JSONArray(r8);
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    O4 o42 = new O4();
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        o42.f10228a = a.R(jSONObject, "status", 1);
                        o42.f10229b = a.S(jSONObject, "url", (String) null);
                        o42.f10230c = a.S(jSONObject, "action", "UNKNOWN");
                        o42.f10231d = a.S(jSONObject, "target", "UNKNOWN");
                        o42.e = a.S(jSONObject, "id", (String) null);
                        o42.f10232f = a.S(jSONObject, "value", (String) null);
                        o42.c();
                        arrayList.add(o42);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            } catch (Exception e9) {
                Log.e("O4", "JSON parser failed");
                e9.printStackTrace();
                return arrayList;
            }
        }
        return arrayList;
    }

    public static void b(Context context, String str, List list) {
        k kVar = new k(context, 1);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O4 o42 = (O4) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", o42.f10228a);
                jSONObject.put("url", o42.f10229b);
                jSONObject.put("action", o42.f10230c);
                jSONObject.put("target", o42.f10231d);
                jSONObject.put("id", o42.e);
                jSONObject.put("value", o42.f10232f);
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

    public final boolean c() {
        String str;
        if (this.f10229b == null || (str = this.f10230c) == null || this.f10231d == null) {
            this.f10228a = 0;
            return false;
        } else if (str.equals("UNKNOWN") || this.f10231d.equals("UNKNOWN")) {
            this.f10228a = 0;
            return false;
        } else if (!this.f10231d.equals("TARGET_BY_ID") && !this.f10231d.equals("TARGET_BY_NAME") && !this.f10231d.equals("TARGET_BY_CLASS") && !this.f10231d.equals("TARGET_BY_INDEX") && !this.f10231d.equals("TARGET_BY_TEXT") && !this.f10231d.equals("TARGET_BY_SELECTOR") && !this.f10231d.equals("TARGET_URL")) {
            return true;
        } else {
            String str2 = this.e;
            if (str2 != null && !str2.isEmpty()) {
                return true;
            }
            this.f10228a = 0;
            return false;
        }
    }
}
