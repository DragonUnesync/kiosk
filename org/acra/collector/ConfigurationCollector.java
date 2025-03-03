package org.acra.collector;

import I6.a;
import P6.f;
import android.content.Context;
import android.content.res.Configuration;
import android.util.SparseArray;
import g7.C0996d;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.ReportField;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class ConfigurationCollector extends BaseReportFieldCollector implements ApplicationStartupCollector {
    public static final d Companion = new Object();
    private static final String FIELD_MCC = "mcc";
    private static final String FIELD_MNC = "mnc";
    private static final String FIELD_SCREENLAYOUT = "screenLayout";
    private static final String FIELD_UIMODE = "uiMode";
    private static final String SUFFIX_MASK = "_MASK";
    private JSONObject initialConfiguration;

    public enum Prefix {
        UI_MODE("UI_MODE_"),
        TOUCHSCREEN("TOUCHSCREEN_"),
        SCREENLAYOUT("SCREENLAYOUT_"),
        ORIENTATION("ORIENTATION_"),
        NAVIGATIONHIDDEN("NAVIGATIONHIDDEN_"),
        NAVIGATION("NAVIGATION_"),
        KEYBOARDHIDDEN("KEYBOARDHIDDEN_"),
        KEYBOARD("KEYBOARD_"),
        HARDKEYBOARDHIDDEN("HARDKEYBOARDHIDDEN_");
        
        private final String text;

        static {
            Prefix[] $values;
            $ENTRIES = C0996d.g($values);
        }

        private Prefix(String str) {
            this.text = str;
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public final String getText() {
            return this.text;
        }
    }

    public ConfigurationCollector() {
        super(ReportField.INITIAL_CONFIGURATION, ReportField.CRASH_CONFIGURATION);
    }

    private String activeFlags(SparseArray<String> sparseArray, int i) {
        int i8;
        StringBuilder sb = new StringBuilder();
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            int keyAt = sparseArray.keyAt(i9);
            String str = sparseArray.get(keyAt);
            f.d(str, "get(...)");
            if (str.endsWith(SUFFIX_MASK) && (i8 = keyAt & i) > 0) {
                if (sb.length() > 0) {
                    sb.append('+');
                }
                sb.append(sparseArray.get(i8));
            }
        }
        String sb2 = sb.toString();
        f.d(sb2, "toString(...)");
        return sb2;
    }

    private JSONObject collectConfiguration(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            f.d(configuration, "getConfiguration(...)");
            return configToJson(configuration);
        } catch (RuntimeException e) {
            ErrorReporter errorReporter = C1247a.f13789a;
            String packageName = context.getPackageName();
            n2.a.n1("Couldn't retrieve CrashConfiguration for : " + packageName, e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [org.acra.ErrorReporter] */
    /* JADX WARNING: type inference failed for: r5v5, types: [org.acra.ErrorReporter] */
    /* JADX WARNING: type inference failed for: r5v7, types: [boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject configToJson(android.content.res.Configuration r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Error while inspecting device configuration: "
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.util.Map r2 = r8.getValueArrays()
            java.lang.Class r3 = r9.getClass()
            java.lang.reflect.Field[] r3 = r3.getFields()
            D6.b r3 = P6.f.g(r3)
        L_0x0017:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            int r5 = r4.getModifiers()     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            if (r5 != 0) goto L_0x0017
            java.lang.String r5 = r4.getName()     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            java.lang.Class r6 = r4.getType()     // Catch:{ JSONException -> 0x0049 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ JSONException -> 0x0049 }
            boolean r6 = P6.f.a(r6, r7)     // Catch:{ JSONException -> 0x0049 }
            if (r6 == 0) goto L_0x004b
            java.lang.Object r4 = r8.getFieldValueName(r2, r9, r4)     // Catch:{ JSONException -> 0x0049 }
            r1.put(r5, r4)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x0017
        L_0x0045:
            r4 = move-exception
            goto L_0x0070
        L_0x0047:
            r4 = move-exception
            goto L_0x0076
        L_0x0049:
            r4 = move-exception
            goto L_0x0059
        L_0x004b:
            java.lang.Object r6 = r4.get(r9)     // Catch:{ JSONException -> 0x0049 }
            if (r6 == 0) goto L_0x0017
            java.lang.Object r4 = r4.get(r9)     // Catch:{ JSONException -> 0x0049 }
            r1.put(r5, r4)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x0017
        L_0x0059:
            org.acra.ErrorReporter r6 = n7.C1247a.f13789a     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            java.lang.String r7 = "Could not collect configuration field "
            r6.append(r7)     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            r6.append(r5)     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            java.lang.String r5 = r6.toString()     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            n2.a.n1(r5, r4)     // Catch:{ IllegalArgumentException -> 0x0047, IllegalAccessException -> 0x0045 }
            goto L_0x0017
        L_0x0070:
            org.acra.ErrorReporter r5 = n7.C1247a.f13789a
            n2.a.B(r0, r4)
            goto L_0x0017
        L_0x0076:
            org.acra.ErrorReporter r5 = n7.C1247a.f13789a
            n2.a.B(r0, r4)
            goto L_0x0017
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.acra.collector.ConfigurationCollector.configToJson(android.content.res.Configuration):org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return java.lang.Integer.valueOf(r11.getInt(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.equals(FIELD_MNC) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0.equals(FIELD_MCC) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object getFieldValueName(java.util.Map<org.acra.collector.ConfigurationCollector.Prefix, ? extends android.util.SparseArray<java.lang.String>> r9, android.content.res.Configuration r10, java.lang.reflect.Field r11) {
        /*
            r8 = this;
            java.lang.String r0 = r11.getName()
            if (r0 == 0) goto L_0x005d
            int r1 = r0.hashCode()
            switch(r1) {
                case -1896438090: goto L_0x0043;
                case -845983145: goto L_0x0029;
                case 107917: goto L_0x0017;
                case 108258: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x005d
        L_0x000e:
            java.lang.String r1 = "mnc"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x001f
            goto L_0x005d
        L_0x0017:
            java.lang.String r1 = "mcc"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x005d
        L_0x001f:
            int r9 = r11.getInt(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00a9
        L_0x0029:
            java.lang.String r1 = "uiMode"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0032
            goto L_0x005d
        L_0x0032:
            org.acra.collector.ConfigurationCollector$Prefix r0 = org.acra.collector.ConfigurationCollector.Prefix.UI_MODE
            java.lang.Object r9 = D6.u.C(r9, r0)
            android.util.SparseArray r9 = (android.util.SparseArray) r9
            int r10 = r11.getInt(r10)
            java.lang.String r9 = r8.activeFlags(r9, r10)
            goto L_0x00a9
        L_0x0043:
            java.lang.String r1 = "screenLayout"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x004c
            goto L_0x005d
        L_0x004c:
            org.acra.collector.ConfigurationCollector$Prefix r0 = org.acra.collector.ConfigurationCollector.Prefix.SCREENLAYOUT
            java.lang.Object r9 = D6.u.C(r9, r0)
            android.util.SparseArray r9 = (android.util.SparseArray) r9
            int r10 = r11.getInt(r10)
            java.lang.String r9 = r8.activeFlags(r9, r10)
            goto L_0x00a9
        L_0x005d:
            org.acra.collector.ConfigurationCollector$Prefix[] r1 = org.acra.collector.ConfigurationCollector.Prefix.values()
            int r2 = r1.length
            r3 = 0
        L_0x0063:
            if (r3 >= r2) goto L_0x0089
            r4 = r1[r3]
            java.lang.String r5 = r4.getText()
            P6.f.b(r0)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r6 = r0.toUpperCase(r6)
            java.lang.String r7 = "toUpperCase(...)"
            P6.f.d(r6, r7)
            java.lang.String r7 = "_"
            java.lang.String r6 = r6.concat(r7)
            boolean r5 = P6.f.a(r5, r6)
            if (r5 == 0) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0089:
            r4 = 0
        L_0x008a:
            if (r4 == 0) goto L_0x00aa
            java.lang.Object r9 = D6.u.C(r9, r4)
            android.util.SparseArray r9 = (android.util.SparseArray) r9
            if (r9 != 0) goto L_0x0095
            goto L_0x00aa
        L_0x0095:
            int r0 = r11.getInt(r10)
            java.lang.Object r9 = r9.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x00a9
            int r9 = r11.getInt(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L_0x00a9:
            return r9
        L_0x00aa:
            int r9 = r11.getInt(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.acra.collector.ConfigurationCollector.getFieldValueName(java.util.Map, android.content.res.Configuration, java.lang.reflect.Field):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<org.acra.collector.ConfigurationCollector.Prefix, android.util.SparseArray<java.lang.String>> getValueArrays() {
        /*
            r14 = this;
            r0 = 1
            java.lang.String r1 = "Error while inspecting device configuration: "
            java.lang.Class<android.content.res.Configuration> r2 = android.content.res.Configuration.class
            java.lang.reflect.Field[] r2 = r2.getFields()
            java.lang.String r3 = "getFields(...)"
            P6.f.d(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = 0
            r6 = 0
        L_0x0016:
            if (r6 >= r4) goto L_0x0033
            r7 = r2[r6]
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 == 0) goto L_0x0031
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isFinal(r8)
            if (r8 == 0) goto L_0x0031
            r3.add(r7)
        L_0x0031:
            int r6 = r6 + r0
            goto L_0x0016
        L_0x0033:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r4 = r3.hasNext()
            r6 = 0
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r3.next()
            r7 = r4
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            org.acra.collector.ConfigurationCollector$Prefix[] r8 = org.acra.collector.ConfigurationCollector.Prefix.values()
            int r9 = r8.length
            r10 = 0
        L_0x0050:
            if (r10 >= r9) goto L_0x006b
            r11 = r8[r10]
            java.lang.String r12 = r7.getName()
            java.lang.String r13 = "getName(...)"
            P6.f.d(r12, r13)
            java.lang.String r13 = r11.getText()
            boolean r12 = W6.l.a0(r12, r13, r5)
            if (r12 == 0) goto L_0x0069
            r6 = r11
            goto L_0x006b
        L_0x0069:
            int r10 = r10 + r0
            goto L_0x0050
        L_0x006b:
            java.lang.Object r7 = r2.get(r6)
            if (r7 != 0) goto L_0x0079
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2.put(r6, r7)
        L_0x0079:
            java.util.List r7 = (java.util.List) r7
            r7.add(r4)
            goto L_0x003c
        L_0x007f:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x008c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            org.acra.collector.ConfigurationCollector$Prefix r5 = (org.acra.collector.ConfigurationCollector.Prefix) r5
            if (r5 == 0) goto L_0x008c
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r3.put(r5, r4)
            goto L_0x008c
        L_0x00ac:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r3.size()
            r2.<init>(r4)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00bd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0128
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            org.acra.collector.ConfigurationCollector$Prefix r5 = (org.acra.collector.ConfigurationCollector.Prefix) r5
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            P6.f.b(r5)
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00e1:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x011f
            java.lang.Object r8 = r4.next()
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            int r9 = r8.getInt(r6)     // Catch:{ IllegalArgumentException -> 0x0101, IllegalAccessException -> 0x00ff }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0101, IllegalAccessException -> 0x00ff }
            java.lang.String r8 = r8.getName()     // Catch:{ IllegalArgumentException -> 0x0101, IllegalAccessException -> 0x00ff }
            C6.c r10 = new C6.c     // Catch:{ IllegalArgumentException -> 0x0101, IllegalAccessException -> 0x00ff }
            r10.<init>(r9, r8)     // Catch:{ IllegalArgumentException -> 0x0101, IllegalAccessException -> 0x00ff }
            goto L_0x010f
        L_0x00ff:
            r8 = move-exception
            goto L_0x0103
        L_0x0101:
            r8 = move-exception
            goto L_0x0109
        L_0x0103:
            org.acra.ErrorReporter r9 = n7.C1247a.f13789a
            n2.a.n1(r1, r8)
            goto L_0x010e
        L_0x0109:
            org.acra.ErrorReporter r9 = n7.C1247a.f13789a
            n2.a.n1(r1, r8)
        L_0x010e:
            r10 = r6
        L_0x010f:
            if (r10 == 0) goto L_0x00e1
            java.lang.Object r8 = r10.f711U
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r10.f712V
            r7.put(r8, r9)
            goto L_0x00e1
        L_0x011f:
            C6.c r4 = new C6.c
            r4.<init>(r5, r7)
            r2.add(r4)
            goto L_0x00bd
        L_0x0128:
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<org.acra.collector.ConfigurationCollector$Prefix> r3 = org.acra.collector.ConfigurationCollector.Prefix.class
            r1.<init>(r3)
            D6.u.F(r2, r1)
            l1.j r2 = new l1.j
            r2.<init>(r0)
            java.util.Map r0 = N7.a.A(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.acra.collector.ConfigurationCollector.getValueArrays():java.util.Map");
    }

    /* access modifiers changed from: private */
    public static final SparseArray getValueArrays$lambda$11(Prefix prefix) {
        return new SparseArray();
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        int i = e.f14287a[reportField.ordinal()];
        if (i == 1) {
            aVar.i(ReportField.INITIAL_CONFIGURATION, this.initialConfiguration);
        } else if (i == 2) {
            aVar.i(ReportField.CRASH_CONFIGURATION, collectConfiguration(context));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void collectApplicationStartUp(Context context, C1395d dVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        if (dVar.f14958Z.contains(ReportField.INITIAL_CONFIGURATION)) {
            this.initialConfiguration = collectConfiguration(context);
        }
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }
}
