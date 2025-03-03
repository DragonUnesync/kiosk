package s7;

import P6.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.acra.ReportField;
import org.acra.data.StringFormat;
import org.json.JSONStringer;

/* renamed from: s7.c  reason: case insensitive filesystem */
public final class C1410c extends StringFormat {
    public final String toFormattedString(C1408a aVar, List list, String str, String str2, boolean z) {
        f.e(aVar, "data");
        f.e(list, "order");
        f.e(str, "mainJoiner");
        f.e(str2, "subJoiner");
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVar.j());
        JSONStringer object = new JSONStringer().object();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReportField reportField = (ReportField) it.next();
            object.key(reportField.toString()).value(linkedHashMap.remove(reportField.toString()));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            object.key((String) entry.getKey()).value(entry.getValue());
        }
        String jSONStringer = object.endObject().toString();
        f.d(jSONStringer, "toString(...)");
        return jSONStringer;
    }
}
