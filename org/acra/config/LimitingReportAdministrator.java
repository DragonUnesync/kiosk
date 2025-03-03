package org.acra.config;

import D6.j;
import D7.e;
import P6.f;
import a1.C0412c;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.lifecycle.c;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.plugins.HasConfigPlugin;
import org.json.JSONException;
import p7.C1346a;
import p7.C1347b;
import r7.C1395d;
import r7.k;
import r7.n;
import r7.o;
import r7.p;
import r7.q;
import s7.C1408a;

public class LimitingReportAdministrator extends HasConfigPlugin implements ReportingAdministrator {
    public LimitingReportAdministrator() {
        super(k.class);
    }

    private o loadLimiterData(Context context, k kVar) {
        o oVar;
        int K4;
        f.e(context, "context");
        try {
            FileInputStream openFileInput = context.openFileInput("ACRA-limiter.json");
            f.d(openFileInput, "openFileInput(...)");
            oVar = new o(new e((InputStream) openFileInput).a());
        } catch (FileNotFoundException unused) {
            oVar = new o();
        } catch (IOException e) {
            ErrorReporter errorReporter = C1247a.f13789a;
            a.n1("Failed to load LimiterData", e);
            oVar = new o();
        } catch (JSONException e8) {
            ErrorReporter errorReporter2 = C1247a.f13789a;
            a.n1("Failed to load LimiterData", e8);
            oVar = new o();
        }
        Calendar instance = Calendar.getInstance();
        instance.add(12, (int) (-kVar.f15043V.toMinutes(kVar.f15044W)));
        ErrorReporter errorReporter3 = C1247a.f13789a;
        ArrayList arrayList = oVar.f15064a;
        c cVar = new c(16, instance);
        f.e(arrayList, "<this>");
        int K5 = j.K(arrayList);
        int i = 0;
        if (K5 >= 0) {
            int i8 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) cVar.a(obj)).booleanValue()) {
                    if (i8 != i) {
                        arrayList.set(i8, obj);
                    }
                    i8++;
                }
                if (i == K5) {
                    break;
                }
                i++;
            }
            i = i8;
        }
        if (i < arrayList.size() && i <= (K4 = j.K(arrayList))) {
            while (true) {
                arrayList.remove(K4);
                if (K4 == i) {
                    break;
                }
                K4--;
            }
        }
        oVar.a(context);
        return oVar;
    }

    /* access modifiers changed from: private */
    public static final void notifyReportDropped$lambda$8(Context context, k kVar) {
        Looper.prepare();
        R.e.s(1, context, kVar.f15049b0);
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            new Handler(myLooper).postDelayed(new p(myLooper, 0), 4000);
            Looper.loop();
        }
    }

    /* access modifiers changed from: private */
    public static final void notifyReportDropped$lambda$8$lambda$7(Looper looper) {
        looper.quitSafely();
    }

    public void notifyReportDropped(Context context, C1395d dVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        k kVar = (k) N7.a.k(dVar, k.class);
        String str = kVar.f15049b0;
        if (str != null && str.length() > 0) {
            Future<?> submit = Executors.newSingleThreadExecutor().submit(new C0412c((Object) context, 16, (Object) kVar));
            while (!submit.isDone()) {
                try {
                    submit.get();
                } catch (InterruptedException unused) {
                } catch (ExecutionException unused2) {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ boolean shouldFinishActivity(Context context, C1395d dVar, C1346a aVar) {
        return q.c(this, context, dVar, aVar);
    }

    public final /* synthetic */ boolean shouldKillApplication(Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        return q.d(this, context, dVar, bVar, aVar);
    }

    public boolean shouldSendReport(Context context, C1395d dVar, C1408a aVar) {
        Context context2 = context;
        C1395d dVar2 = dVar;
        C1408a aVar2 = aVar;
        f.e(context2, "context");
        f.e(dVar2, "config");
        f.e(aVar2, "crashReportData");
        try {
            k kVar = (k) N7.a.k(dVar2, k.class);
            try {
                o loadLimiterData = loadLimiterData(context2, kVar);
                n nVar = new n(aVar2);
                Iterator it = loadLimiterData.f15064a.iterator();
                int i = 0;
                int i8 = 0;
                while (it.hasNext()) {
                    n nVar2 = (n) it.next();
                    String optString = nVar.optString("stacktrace");
                    f.d(optString, "optString(...)");
                    String optString2 = nVar2.optString("stacktrace");
                    f.d(optString2, "optString(...)");
                    if (optString.equals(optString2)) {
                        i++;
                    }
                    String optString3 = nVar.optString("class");
                    f.d(optString3, "optString(...)");
                    String optString4 = nVar2.optString("class");
                    f.d(optString4, "optString(...)");
                    if (optString3.equals(optString4)) {
                        i8++;
                    }
                }
                if (i >= kVar.f15046Y) {
                    ErrorReporter errorReporter = C1247a.f13789a;
                    return false;
                } else if (i8 >= kVar.f15047Z) {
                    ErrorReporter errorReporter2 = C1247a.f13789a;
                    return false;
                } else {
                    loadLimiterData.f15064a.add(nVar);
                    loadLimiterData.a(context2);
                    return true;
                }
            } catch (IOException e) {
                e = e;
                ErrorReporter errorReporter3 = C1247a.f13789a;
                a.n1("Failed to load LimiterData", e);
                return true;
            } catch (JSONException e8) {
                e = e8;
                ErrorReporter errorReporter4 = C1247a.f13789a;
                a.n1("Failed to load LimiterData", e);
                return true;
            }
        } catch (IOException e9) {
            e = e9;
            ErrorReporter errorReporter32 = C1247a.f13789a;
            a.n1("Failed to load LimiterData", e);
            return true;
        } catch (JSONException e10) {
            e = e10;
            ErrorReporter errorReporter42 = C1247a.f13789a;
            a.n1("Failed to load LimiterData", e);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r1 == null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldStartCollecting(android.content.Context r6, r7.C1395d r7, p7.C1347b r8) {
        /*
            r5 = this;
            java.lang.String r0 = "getDir(...)"
            java.lang.String r1 = "context"
            P6.f.e(r6, r1)
            java.lang.String r1 = "config"
            P6.f.e(r7, r1)
            java.lang.String r1 = "reportBuilder"
            P6.f.e(r8, r1)
            r8 = 1
            java.lang.Class<r7.k> r1 = r7.k.class
            r7.a r7 = N7.a.k(r7, r1)     // Catch:{ IOException -> 0x0080 }
            r7.k r7 = (r7.k) r7     // Catch:{ IOException -> 0x0080 }
            java.lang.String r1 = "ACRA-approved"
            r2 = 0
            java.io.File r1 = r6.getDir(r1, r2)     // Catch:{ IOException -> 0x0080 }
            P6.f.d(r1, r0)     // Catch:{ IOException -> 0x0080 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ IOException -> 0x0080 }
            if (r1 == 0) goto L_0x0052
            C7.e r3 = new C7.e     // Catch:{ IOException -> 0x0080 }
            r4 = 6
            r3.<init>(r4)     // Catch:{ IOException -> 0x0080 }
            int r4 = r1.length     // Catch:{ IOException -> 0x0080 }
            if (r4 != 0) goto L_0x0034
            goto L_0x0044
        L_0x0034:
            int r4 = r1.length     // Catch:{ IOException -> 0x0080 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch:{ IOException -> 0x0080 }
            java.lang.String r4 = "copyOf(...)"
            P6.f.d(r1, r4)     // Catch:{ IOException -> 0x0080 }
            int r4 = r1.length     // Catch:{ IOException -> 0x0080 }
            if (r4 <= r8) goto L_0x0044
            java.util.Arrays.sort(r1, r3)     // Catch:{ IOException -> 0x0080 }
        L_0x0044:
            java.util.List r1 = D6.h.A(r1)     // Catch:{ IOException -> 0x0080 }
            java.io.File[] r3 = new java.io.File[r2]     // Catch:{ IOException -> 0x0080 }
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch:{ IOException -> 0x0080 }
            java.io.File[] r1 = (java.io.File[]) r1     // Catch:{ IOException -> 0x0080 }
            if (r1 != 0) goto L_0x0054
        L_0x0052:
            java.io.File[] r1 = new java.io.File[r2]     // Catch:{ IOException -> 0x0080 }
        L_0x0054:
            int r1 = r1.length     // Catch:{ IOException -> 0x0080 }
            java.lang.String r3 = "ACRA-unapproved"
            java.io.File r3 = r6.getDir(r3, r2)     // Catch:{ IOException -> 0x0080 }
            P6.f.d(r3, r0)     // Catch:{ IOException -> 0x0080 }
            java.io.File[] r0 = r3.listFiles()     // Catch:{ IOException -> 0x0080 }
            if (r0 != 0) goto L_0x0066
            java.io.File[] r0 = new java.io.File[r2]     // Catch:{ IOException -> 0x0080 }
        L_0x0066:
            int r0 = r0.length     // Catch:{ IOException -> 0x0080 }
            int r1 = r1 + r0
            int r0 = r7.f15048a0     // Catch:{ IOException -> 0x0080 }
            if (r1 < r0) goto L_0x006f
            org.acra.ErrorReporter r6 = n7.C1247a.f13789a     // Catch:{ IOException -> 0x0080 }
            return r2
        L_0x006f:
            r7.o r6 = r5.loadLimiterData(r6, r7)     // Catch:{ IOException -> 0x0080 }
            java.util.ArrayList r6 = r6.f15064a     // Catch:{ IOException -> 0x0080 }
            int r6 = r6.size()     // Catch:{ IOException -> 0x0080 }
            int r7 = r7.f15045X     // Catch:{ IOException -> 0x0080 }
            if (r6 < r7) goto L_0x0088
            org.acra.ErrorReporter r6 = n7.C1247a.f13789a     // Catch:{ IOException -> 0x0080 }
            return r2
        L_0x0080:
            r6 = move-exception
            org.acra.ErrorReporter r7 = n7.C1247a.f13789a
            java.lang.String r7 = "Failed to load LimiterData"
            n2.a.n1(r7, r6)
        L_0x0088:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.acra.config.LimitingReportAdministrator.shouldStartCollecting(android.content.Context, r7.d, p7.b):boolean");
    }
}
