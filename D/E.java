package D;

import B.C0011l;
import F.h;
import K1.k;
import N.e;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import u.C1479t;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f758a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public final Object f759b;

    /* renamed from: c  reason: collision with root package name */
    public int f760c;

    /* renamed from: d  reason: collision with root package name */
    public final k f761d;
    public final HashMap e;

    /* renamed from: f  reason: collision with root package name */
    public int f762f;

    public E(k kVar) {
        Object obj = new Object();
        this.f759b = obj;
        this.e = new HashMap();
        this.f760c = 1;
        synchronized (obj) {
            this.f761d = kVar;
            this.f762f = this.f760c;
        }
    }

    public static void c(C1479t tVar, C0070y yVar) {
        if (h.t()) {
            h.B(yVar.ordinal(), "CX:State[" + tVar + "]");
        }
    }

    public final D a(String str) {
        HashMap hashMap = this.e;
        for (C0011l lVar : hashMap.keySet()) {
            if (str.equals(lVar.a().e())) {
                return (D) hashMap.get(lVar);
            }
        }
        return null;
    }

    public final void b() {
        String str;
        boolean s8 = h.s("CameraStateRegistry");
        StringBuilder sb = this.f758a;
        if (s8) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{"Camera", "State"}));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            if (h.s("CameraStateRegistry")) {
                if (((D) entry.getValue()).f754a != null) {
                    str = ((D) entry.getValue()).f754a.toString();
                } else {
                    str = "UNKNOWN";
                }
                sb.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{((C0011l) entry.getKey()).toString(), str}));
            }
            C0070y yVar = ((D) entry.getValue()).f754a;
            if (yVar != null && yVar.f974U) {
                i++;
            }
        }
        if (h.s("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(e.v("Open count: ", i, " (Max allowed: ", this.f760c, ")"));
            h.j("CameraStateRegistry", sb.toString());
        }
        this.f762f = Math.max(this.f760c - i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7 A[Catch:{ all -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(u.C1479t r12) {
        /*
            r11 = this;
            java.lang.String r0 = "tryOpenCamera("
            java.lang.String r1 = " --> "
            java.lang.Object r2 = r11.f759b
            monitor-enter(r2)
            java.util.HashMap r3 = r11.e     // Catch:{ all -> 0x0063 }
            java.lang.Object r3 = r3.get(r12)     // Catch:{ all -> 0x0063 }
            D.D r3 = (D.D) r3     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = "Camera must first be registered with registerCamera()"
            n2.a.l(r3, r4)     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = "CameraStateRegistry"
            boolean r4 = F.h.s(r4)     // Catch:{ all -> 0x0063 }
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0065
            java.lang.StringBuilder r4 = r11.f758a     // Catch:{ all -> 0x0063 }
            r4.setLength(r6)     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r4 = r11.f758a     // Catch:{ all -> 0x0063 }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x0063 }
            int r7 = r11.f762f     // Catch:{ all -> 0x0063 }
            D.y r8 = r3.f754a     // Catch:{ all -> 0x0063 }
            if (r8 == 0) goto L_0x0033
            boolean r8 = r8.f974U     // Catch:{ all -> 0x0063 }
            if (r8 == 0) goto L_0x0033
            r8 = 1
            goto L_0x0034
        L_0x0033:
            r8 = 0
        L_0x0034:
            D.y r9 = r3.f754a     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r10.<init>(r0)     // Catch:{ all -> 0x0063 }
            r10.append(r12)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = ") [Available Cameras: "
            r10.append(r0)     // Catch:{ all -> 0x0063 }
            r10.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = ", Already Open: "
            r10.append(r0)     // Catch:{ all -> 0x0063 }
            r10.append(r8)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = " (Previous state: "
            r10.append(r0)     // Catch:{ all -> 0x0063 }
            r10.append(r9)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = ")]"
            r10.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0063 }
            r4.append(r0)     // Catch:{ all -> 0x0063 }
            goto L_0x0065
        L_0x0063:
            r12 = move-exception
            goto L_0x00ac
        L_0x0065:
            int r0 = r11.f762f     // Catch:{ all -> 0x0063 }
            if (r0 > 0) goto L_0x0079
            D.y r0 = r3.f754a     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.f974U     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0073
            r0 = 1
            goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r0 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r5 = 0
            goto L_0x0080
        L_0x0079:
            D.y r0 = D.C0070y.f970a0     // Catch:{ all -> 0x0063 }
            r3.f754a = r0     // Catch:{ all -> 0x0063 }
            c(r12, r0)     // Catch:{ all -> 0x0063 }
        L_0x0080:
            java.lang.String r12 = "CameraStateRegistry"
            boolean r12 = F.h.s(r12)     // Catch:{ all -> 0x0063 }
            if (r12 == 0) goto L_0x00a5
            java.lang.StringBuilder r12 = r11.f758a     // Catch:{ all -> 0x0063 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x0091
            java.lang.String r0 = "SUCCESS"
            goto L_0x0093
        L_0x0091:
            java.lang.String r0 = "FAIL"
        L_0x0093:
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x0063 }
            r12.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r12 = "CameraStateRegistry"
            java.lang.StringBuilder r0 = r11.f758a     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0063 }
            F.h.j(r12, r0)     // Catch:{ all -> 0x0063 }
        L_0x00a5:
            if (r5 == 0) goto L_0x00aa
            r11.b()     // Catch:{ all -> 0x0063 }
        L_0x00aa:
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            return r5
        L_0x00ac:
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: D.E.d(u.t):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[Catch:{ all -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004f A[ADDED_TO_REGION, Catch:{ all -> 0x000d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f759b
            monitor-enter(r0)
            K1.k r1 = r5.f761d     // Catch:{ all -> 0x000d }
            int r1 = r1.f2580U     // Catch:{ all -> 0x000d }
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return r3
        L_0x000d:
            r6 = move-exception
            goto L_0x0055
        L_0x000f:
            D.D r6 = r5.a(r6)     // Catch:{ all -> 0x000d }
            r1 = 0
            if (r6 == 0) goto L_0x0019
            D.y r6 = r6.f754a     // Catch:{ all -> 0x000d }
            goto L_0x001a
        L_0x0019:
            r6 = r1
        L_0x001a:
            if (r7 == 0) goto L_0x0021
            D.D r7 = r5.a(r7)     // Catch:{ all -> 0x000d }
            goto L_0x0022
        L_0x0021:
            r7 = r1
        L_0x0022:
            if (r7 == 0) goto L_0x0026
            D.y r1 = r7.f754a     // Catch:{ all -> 0x000d }
        L_0x0026:
            D.y r7 = D.C0070y.f971b0     // Catch:{ all -> 0x000d }
            boolean r2 = r7.equals(r6)     // Catch:{ all -> 0x000d }
            r4 = 0
            if (r2 != 0) goto L_0x003a
            D.y r2 = D.C0070y.f972c0     // Catch:{ all -> 0x000d }
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x000d }
            if (r6 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r6 = 0
            goto L_0x003b
        L_0x003a:
            r6 = 1
        L_0x003b:
            boolean r7 = r7.equals(r1)     // Catch:{ all -> 0x000d }
            if (r7 != 0) goto L_0x004c
            D.y r7 = D.C0070y.f972c0     // Catch:{ all -> 0x000d }
            boolean r7 = r7.equals(r1)     // Catch:{ all -> 0x000d }
            if (r7 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r7 = 0
            goto L_0x004d
        L_0x004c:
            r7 = 1
        L_0x004d:
            if (r6 == 0) goto L_0x0052
            if (r7 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return r3
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D.E.e(java.lang.String, java.lang.String):boolean");
    }
}
