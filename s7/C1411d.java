package s7;

import D6.i;
import D6.k;
import D6.o;
import D6.p;
import D6.s;
import D6.u;
import F.h;
import O6.l;
import P6.f;
import V6.a;
import V6.e;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.acra.ReportField;
import org.acra.data.StringFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: s7.d  reason: case insensitive filesystem */
public final class C1411d extends StringFormat {
    public static void a(StringBuilder sb, String str, String str2, String str3, boolean z) {
        if (sb.length() > 0) {
            sb.append(str3);
        }
        if (z) {
            if (str != null) {
                str = URLEncoder.encode(str, "UTF-8");
            } else {
                str = null;
            }
            if (str2 != null) {
                str2 = URLEncoder.encode(str2, "UTF-8");
            } else {
                str2 = null;
            }
        }
        sb.append(str);
        sb.append('=');
        sb.append(str2);
    }

    public static ArrayList b(JSONObject jSONObject) {
        Object obj;
        ArrayList arrayList;
        Iterator<String> keys = jSONObject.keys();
        f.d(keys, "keys(...)");
        List<String> K4 = e.K(new a(new p(1, keys)));
        ArrayList arrayList2 = new ArrayList();
        for (String str : K4) {
            try {
                obj = jSONObject.get(str);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                ArrayList b8 = b((JSONObject) obj);
                ArrayList arrayList3 = new ArrayList(k.M(b8));
                Iterator it = b8.iterator();
                while (it.hasNext()) {
                    arrayList3.add(str + "." + ((String) it.next()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = h.w(str + "=" + obj);
            }
            o.N(arrayList2, arrayList);
        }
        return arrayList2;
    }

    public final String toFormattedString(C1408a aVar, List list, String str, String str2, boolean z) {
        Map map;
        String str3;
        f.e(aVar, "data");
        f.e(list, "order");
        f.e(str, "mainJoiner");
        f.e(str2, "subJoiner");
        Map j7 = aVar.j();
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.D(j7.size()));
        for (Map.Entry entry : j7.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                str3 = i.P(b((JSONObject) value), str2, (String) null, (String) null, (l) null, 62);
            } else {
                str3 = String.valueOf(value);
            }
            linkedHashMap.put(key, str3);
        }
        int size = linkedHashMap.size();
        if (size == 0) {
            map = s.f1270U;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap);
        } else {
            map = u.G(linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReportField reportField = (ReportField) it.next();
            a(sb, reportField.toString(), (String) linkedHashMap2.remove(reportField.toString()), str, z);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            a(sb, (String) entry2.getKey(), (String) entry2.getValue(), str, z);
        }
        String sb2 = sb.toString();
        f.d(sb2, "toString(...)");
        return sb2;
    }
}
