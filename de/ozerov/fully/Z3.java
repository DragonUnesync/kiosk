package de.ozerov.fully;

import N.e;
import Z1.c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import d4.k;
import java.lang.ref.WeakReference;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import n2.a;

public final class Z3 extends TimerTask {

    /* renamed from: a0  reason: collision with root package name */
    public static final AtomicBoolean f10532a0 = new AtomicBoolean(false);

    /* renamed from: U  reason: collision with root package name */
    public String f10533U;

    /* renamed from: V  reason: collision with root package name */
    public final Context f10534V;

    /* renamed from: W  reason: collision with root package name */
    public final k f10535W;

    /* renamed from: X  reason: collision with root package name */
    public WeakReference f10536X;

    /* renamed from: Y  reason: collision with root package name */
    public C0767r3 f10537Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile boolean f10538Z;

    public Z3(Context context) {
        this.f10534V = context;
        k kVar = new k(context, 1);
        this.f10535W = kVar;
        this.f10538Z = kVar.E().booleanValue();
    }

    public final void a(FullyActivity fullyActivity, String str, ComponentName componentName) {
        ComponentName componentName2;
        Class cls;
        String concat = "Blocking app: ".concat(str);
        if (componentName != null) {
            StringBuilder B8 = e.B(concat, " component: ");
            B8.append(componentName.flattenToShortString());
            concat = B8.toString();
        }
        Log.w("TaskProtector", concat);
        k kVar = this.f10535W;
        if (((c) kVar.f9767W).n("taskProtectorLogging", false)) {
            C0794w0.q0(1, "TaskProtector", concat);
        }
        String str2 = this.f10533U;
        Context context = this.f10534V;
        Intent intent = null;
        if (str2 != null) {
            componentName2 = C0794w0.D(context, str2, 1000);
        } else {
            componentName2 = null;
        }
        c cVar = (c) kVar.f9767W;
        if (!cVar.r("appBlockReturnIntent", "").isEmpty()) {
            try {
                intent = a.P0(cVar.r("appBlockReturnIntent", ""));
                intent.setFlags(268435456);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (!kVar.e2().contains("component=org.chromium.webapk") || !kVar.g2().booleanValue()) {
            Activity activity = ((MyApplication) context.getApplicationContext()).f10110Y;
            Class cls2 = FullyActivity.class;
            if (activity != null) {
                cls = activity.getClass();
            } else {
                cls = cls2;
            }
            if (cls == PinInputActivity.class) {
                cls = cls2;
            }
            Intent intent2 = new Intent(context, cls);
            intent2.setAction("com.fullykiosk.singleapp.action.bring_to_foreground");
            intent2.setFlags(268435456);
            String str3 = this.f10533U;
            if (str3 != null) {
                intent2.putExtra("lastGoodAppPackage", str3);
            }
            if (componentName2 != null) {
                intent2.putExtra("lastGoodAppComponent", componentName2.flattenToShortString());
            }
            intent2.putExtra("currentApp", str);
            if (cls != cls2 || !fullyActivity.f9954q1) {
                intent = intent2;
            } else {
                intent2.putExtra("isLauncher", true);
                intent2.putExtra("action", "com.fullykiosk.singleapp.action.bring_to_foreground");
                intent2.setAction("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.HOME");
                intent = a.c(intent2);
            }
        } else {
            try {
                intent = a.P0(kVar.e2());
                intent.setFlags(268435456);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        if (intent != null) {
            try {
                PendingIntent.getActivity(context, 0, intent, 335544320).send();
            } catch (Exception e9) {
                Log.w("TaskProtector", "Failed to send intent " + a.o0(intent) + " due to " + e9.getMessage());
            }
        }
    }

    public final synchronized void b() {
        C0767r3 r3Var = this.f10537Y;
        if (r3Var != null) {
            r3Var.b();
            this.f10537Y = null;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f10537Y == null) {
                C0767r3 r3Var = new C0767r3(this.f10534V);
                this.f10537Y = r3Var;
                r3Var.g(2131558597);
                C0767r3 r3Var2 = this.f10537Y;
                r3Var2.f10916d = false;
                r3Var2.e = true;
                r3Var2.f10921k = true;
                r3Var2.f10926p = "taskProtector";
            }
            this.f10537Y.j();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: de.ozerov.fully.FullyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r11.f10535W.e2().contains("component=" + r5.flattenToShortString()) == false) goto L_0x0091;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            android.content.Context r0 = r11.f10534V
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.concurrent.atomic.AtomicBoolean r0 = f10532a0
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 != 0) goto L_0x0017
            java.lang.String r0 = "TaskProtector"
            java.lang.String r1 = "TaskProtector already running"
            android.util.Log.e(r0, r1)
            return
        L_0x0017:
            java.lang.ref.WeakReference r3 = r11.f10536X
            r4 = 0
            if (r3 == 0) goto L_0x002e
            java.lang.Object r3 = r3.get()
            de.ozerov.fully.FullyActivity r3 = (de.ozerov.fully.FullyActivity) r3
            if (r3 == 0) goto L_0x002a
            C7.d r4 = r3.f9948k1
            java.lang.Object r4 = r4.f734X
            java.lang.String r4 = (java.lang.String) r4
        L_0x002a:
            r10 = r4
            r4 = r3
            r3 = r10
            goto L_0x002f
        L_0x002e:
            r3 = r4
        L_0x002f:
            android.content.Context r5 = r11.f10534V
            r6 = 1000(0x3e8, double:4.94E-321)
            android.content.ComponentName r5 = de.ozerov.fully.C0794w0.q(r5, r6)
            if (r5 == 0) goto L_0x003e
            java.lang.String r6 = r5.getPackageName()
            goto L_0x0044
        L_0x003e:
            android.content.Context r6 = r11.f10534V
            java.lang.String r6 = de.ozerov.fully.C0794w0.r(r6)
        L_0x0044:
            boolean r7 = r11.f10538Z
            if (r7 == 0) goto L_0x004d
            android.content.Context r7 = r11.f10534V
            de.ozerov.fully.W3.a(r7)
        L_0x004d:
            if (r4 == 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00cf
            C7.d r7 = r4.f9948k1
            boolean r7 = r7.t(r5)
            if (r7 != 0) goto L_0x0065
            C7.d r7 = r4.f9948k1
            java.lang.Object r7 = r7.f736Z
            java.lang.String[] r7 = (java.lang.String[]) r7
            boolean r7 = n2.a.M0(r6, r7)
            if (r7 == 0) goto L_0x00cf
        L_0x0065:
            if (r5 == 0) goto L_0x0091
            d4.k r7 = r11.f10535W
            java.lang.Boolean r7 = r7.g2()
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0091
            d4.k r7 = r11.f10535W
            java.lang.String r7 = r7.e2()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "component="
            r8.<init>(r9)
            java.lang.String r9 = r5.flattenToShortString()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x00cf
        L_0x0091:
            d4.k r3 = r11.f10535W
            java.lang.String r7 = "showTaskProtectorToasts"
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            boolean r2 = r3.n(r7, r2)
            if (r2 == 0) goto L_0x00c7
            if (r5 == 0) goto L_0x00bc
            android.content.Context r2 = r11.f10534V
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = r5.flattenToShortString()
            r3.append(r7)
            java.lang.String r7 = " is blacklisted"
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            n2.a.b1(r2, r3)
            goto L_0x00c7
        L_0x00bc:
            android.content.Context r2 = r11.f10534V
            java.lang.String r3 = " is blacklisted"
            java.lang.String r3 = r6.concat(r3)
            n2.a.b1(r2, r3)
        L_0x00c7:
            r11.a(r4, r6, r5)
            r11.c()
            goto L_0x0187
        L_0x00cf:
            if (r4 == 0) goto L_0x0173
            if (r6 == 0) goto L_0x0173
            java.lang.String r7 = r11.f10533U
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0173
            C7.d r7 = r4.f9948k1
            boolean r7 = r7.v(r6)
            if (r7 != 0) goto L_0x0173
            C7.d r7 = r4.f9948k1
            boolean r7 = r7.u(r5)
            if (r7 != 0) goto L_0x0173
            java.lang.String r7 = "android"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0101
            if (r3 == 0) goto L_0x0101
            java.lang.String r7 = r3.toLowerCase()
            java.lang.String r8 = "launcher"
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x0173
        L_0x0101:
            java.lang.String r7 = "system:ui"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0117
            if (r3 == 0) goto L_0x0117
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r7 = "launcher"
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x0173
        L_0x0117:
            d4.k r3 = r11.f10535W
            java.lang.Boolean r3 = r3.c0()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0173
            d4.k r3 = r11.f10535W
            java.lang.Boolean r3 = r3.D()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0173
            d4.k r3 = r11.f10535W
            java.lang.String r7 = "showTaskProtectorToasts"
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            boolean r2 = r3.n(r7, r2)
            if (r2 == 0) goto L_0x016c
            java.lang.String r2 = r6.toLowerCase()
            java.lang.String r3 = "systemui"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x016c
            java.lang.String r2 = r6.toLowerCase()
            java.lang.String r3 = "system:ui"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x016c
            java.lang.String r2 = r6.toLowerCase()
            java.lang.String r3 = "launcher"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x016c
            android.content.Context r2 = r11.f10534V
            java.lang.String r3 = " blocked by advanced kiosk protection"
            java.lang.String r3 = r6.concat(r3)
            n2.a.b1(r2, r3)
        L_0x016c:
            r11.a(r4, r6, r5)
            r11.c()
            goto L_0x0187
        L_0x0173:
            r11.f10533U = r6
            monitor-enter(r11)
            de.ozerov.fully.r3 r2 = r11.f10537Y     // Catch:{ all -> 0x0184 }
            if (r2 == 0) goto L_0x0186
            boolean r2 = r2.f10924n     // Catch:{ all -> 0x0184 }
            if (r2 == 0) goto L_0x0186
            de.ozerov.fully.r3 r2 = r11.f10537Y     // Catch:{ all -> 0x0184 }
            r2.e()     // Catch:{ all -> 0x0184 }
            goto L_0x0186
        L_0x0184:
            r0 = move-exception
            goto L_0x018b
        L_0x0186:
            monitor-exit(r11)
        L_0x0187:
            r0.set(r1)
            return
        L_0x018b:
            monitor-exit(r11)     // Catch:{ all -> 0x0184 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.Z3.run():void");
    }
}
