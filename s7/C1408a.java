package s7;

import C6.c;
import D6.p;
import D6.s;
import D6.u;
import P6.f;
import V6.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.acra.ReportField;
import org.json.JSONObject;

/* renamed from: s7.a  reason: case insensitive filesystem */
public final class C1408a {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f15155a;

    public C1408a() {
        this.f15155a = new JSONObject();
    }

    public final String a(ReportField reportField) {
        f.e(reportField, "key");
        return this.f15155a.optString(reportField.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|3|4|5|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "key"
            P6.f.e(r3, r0)     // Catch:{ all -> 0x000d }
            org.json.JSONObject r0 = r2.f15155a     // Catch:{ JSONException -> 0x000f }
            r1 = 0
            r0.put(r3, r1)     // Catch:{ JSONException -> 0x000f }
            goto L_0x0016
        L_0x000d:
            r3 = move-exception
            goto L_0x0018
        L_0x000f:
            org.acra.ErrorReporter r3 = n7.C1247a.f13789a     // Catch:{ all -> 0x000d }
            java.lang.String r3 = "Failed to put value into CrashReportData: false"
            n2.a.m1(r3)     // Catch:{ all -> 0x000d }
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x000d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C1408a.b(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|4|5|6|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(java.lang.String r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "Failed to put value into CrashReportData: "
            monitor-enter(r2)
            java.lang.String r1 = "key"
            P6.f.e(r3, r1)     // Catch:{ all -> 0x000e }
            org.json.JSONObject r1 = r2.f15155a     // Catch:{ JSONException -> 0x0010 }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x0010 }
            goto L_0x0021
        L_0x000e:
            r3 = move-exception
            goto L_0x0023
        L_0x0010:
            org.acra.ErrorReporter r3 = n7.C1247a.f13789a     // Catch:{ all -> 0x000e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x000e }
            r3.<init>(r0)     // Catch:{ all -> 0x000e }
            r3.append(r4)     // Catch:{ all -> 0x000e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x000e }
            n2.a.m1(r3)     // Catch:{ all -> 0x000e }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x000e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C1408a.c(java.lang.String, long):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "Failed to put value into CrashReportData: "
            monitor-enter(r2)
            java.lang.String r1 = "key"
            P6.f.e(r3, r1)     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0013
            org.json.JSONObject r4 = r2.f15155a     // Catch:{ JSONException -> 0x0011 }
            java.lang.String r0 = "N/A"
            r4.put(r3, r0)     // Catch:{ JSONException -> 0x0011 }
        L_0x0011:
            monitor-exit(r2)
            return
        L_0x0013:
            org.json.JSONObject r1 = r2.f15155a     // Catch:{ JSONException -> 0x001b }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x001b }
            goto L_0x0024
        L_0x0019:
            r3 = move-exception
            goto L_0x0026
        L_0x001b:
            org.acra.ErrorReporter r3 = n7.C1247a.f13789a     // Catch:{ all -> 0x0019 }
            java.lang.String r3 = r0.concat(r4)     // Catch:{ all -> 0x0019 }
            n2.a.m1(r3)     // Catch:{ all -> 0x0019 }
        L_0x0024:
            monitor-exit(r2)
            return
        L_0x0026:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C1408a.d(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(java.lang.String r3, org.json.JSONObject r4) {
        /*
            r2 = this;
            java.lang.String r0 = "Failed to put value into CrashReportData: "
            monitor-enter(r2)
            java.lang.String r1 = "key"
            P6.f.e(r3, r1)     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0013
            org.json.JSONObject r4 = r2.f15155a     // Catch:{ JSONException -> 0x0011 }
            java.lang.String r0 = "N/A"
            r4.put(r3, r0)     // Catch:{ JSONException -> 0x0011 }
        L_0x0011:
            monitor-exit(r2)
            return
        L_0x0013:
            org.json.JSONObject r1 = r2.f15155a     // Catch:{ JSONException -> 0x001b }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x001b }
            goto L_0x002c
        L_0x0019:
            r3 = move-exception
            goto L_0x002e
        L_0x001b:
            org.acra.ErrorReporter r3 = n7.C1247a.f13789a     // Catch:{ all -> 0x0019 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0019 }
            r3.<init>(r0)     // Catch:{ all -> 0x0019 }
            r3.append(r4)     // Catch:{ all -> 0x0019 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0019 }
            n2.a.m1(r3)     // Catch:{ all -> 0x0019 }
        L_0x002c:
            monitor-exit(r2)
            return
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C1408a.e(java.lang.String, org.json.JSONObject):void");
    }

    public final synchronized void f(ReportField reportField) {
        f.e(reportField, "key");
        b(reportField.toString());
    }

    public final synchronized void g(ReportField reportField, long j7) {
        f.e(reportField, "key");
        c(reportField.toString(), j7);
    }

    public final synchronized void h(ReportField reportField, String str) {
        f.e(reportField, "key");
        d(reportField.toString(), str);
    }

    public final synchronized void i(ReportField reportField, JSONObject jSONObject) {
        f.e(reportField, "key");
        e(reportField.toString(), jSONObject);
    }

    public final Map j() {
        JSONObject jSONObject = this.f15155a;
        Iterator<String> keys = jSONObject.keys();
        f.d(keys, "keys(...)");
        a<String> aVar = new a(new p(1, keys));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : aVar) {
            f.b(str);
            c cVar = new c(str, jSONObject.opt(str));
            linkedHashMap.put(cVar.f711U, cVar.f712V);
        }
        int size = linkedHashMap.size();
        if (size == 0) {
            return s.f1270U;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        return u.G(linkedHashMap);
    }

    public C1408a(String str) {
        this.f15155a = new JSONObject(str);
    }
}
