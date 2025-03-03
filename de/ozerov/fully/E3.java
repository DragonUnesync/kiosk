package de.ozerov.fully;

import B3.q;
import Z1.c;
import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import d4.k;
import n2.a;

public final class E3 {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f9880d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f9881a;

    /* renamed from: b  reason: collision with root package name */
    public final k f9882b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9883c;

    public E3(FullyActivity fullyActivity, int i) {
        switch (i) {
            case 1:
                this.f9883c = false;
                this.f9881a = fullyActivity;
                this.f9882b = new k((Context) fullyActivity, 1);
                return;
            default:
                this.f9881a = fullyActivity;
                this.f9882b = new k((Context) fullyActivity, 1);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r13v10, types: [de.ozerov.fully.w0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04d1, code lost:
        if (de.ozerov.fully.C0794w0.U(r1.f9881a).equals("\"" + r1.f9882b.F2() + "\"") != false) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04dd, code lost:
        if (r1.f9882b.e0().equals("1") == false) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04e3, code lost:
        if (n2.a.y0() == false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04eb, code lost:
        if (de.ozerov.fully.C0714i3.b(r1.f9881a) != 0) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04ed, code lost:
        de.ozerov.fully.C0794w0.I0(r1.f9881a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04fe, code lost:
        if (((Z1.c) r1.f9882b.f9767W).n("reloadOnInternet", false) != false) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x050c, code lost:
        if (((Z1.c) r1.f9882b.f9767W).n("rewindOnInternet", false) != false) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0518, code lost:
        if (r1.f9882b.B2().booleanValue() != false) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0520, code lost:
        if (r1.f9882b.O() > 0) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x052e, code lost:
        if (((Z1.c) r1.f9882b.f9767W).n("resetWifiOnDisconnection", false) == false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0531, code lost:
        r0 = r1.f9881a.f9950m1;
        r2 = r0.f10017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0537, code lost:
        if (r2 == null) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0539, code lost:
        r2.cancel();
        r0.f10017b.purge();
        r0.f10017b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0544, code lost:
        r0 = r1.f9881a.f9950m1;
        r0.f10019d = new de.ozerov.fully.B3(r1, 6);
        r0.e = new de.ozerov.fully.B3(r1, 7);
        r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0565, code lost:
        if (r1.f9882b.J1().booleanValue() == false) goto L_0x056f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0567, code lost:
        r1.f9881a.f9910A1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x056f, code lost:
        r1.f9881a.f9910A1.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0580, code lost:
        if (r1.f9882b.y1().booleanValue() == false) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0582, code lost:
        r1.f9881a.f9927P0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x058a, code lost:
        r1.f9881a.f9927P0.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x059b, code lost:
        if (r1.f9882b.t1().booleanValue() == false) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x059d, code lost:
        r1.f9881a.f9914C1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x05a5, code lost:
        r1.f9881a.f9914C1.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05ac, code lost:
        r1.f9881a.f9934W0.n();
        r0 = r1.f9882b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05cd, code lost:
        if (((Z1.c) r0.f9767W).r("startURL", (java.lang.String) r0.f9766V).trim().contains("$hostname") != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05df, code lost:
        if (((Z1.c) r1.f9882b.f9767W).r("errorURL", "").contains("$hostname") != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x05f1, code lost:
        if (((Z1.c) r1.f9882b.f9767W).r("loadContentZipFileUrl", "").contains("$hostname") != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0603, code lost:
        if (((Z1.c) r1.f9882b.f9767W).r("clientCaUrl", "").contains("$hostname") != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0615, code lost:
        if (((Z1.c) r1.f9882b.f9767W).r("searchProviderUrl", "").contains("$hostname") != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0627, code lost:
        if (((Z1.c) r1.f9882b.f9767W).r("actionBarBgUrl", "").contains("$hostname") != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0639, code lost:
        if (((Z1.c) r1.f9882b.f9767W).r("actionBarIconUrl", "").contains("$hostname") != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x064b, code lost:
        if (((Z1.c) r1.f9882b.f9767W).r("screensaverWallpaperURL", "").contains("$hostname") != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0657, code lost:
        if (r1.f9882b.q().contains("$hostname") != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0669, code lost:
        if (((Z1.c) r1.f9882b.f9767W).r("alarmSoundFileUrl", "").contains("$hostname") == false) goto L_0x0673;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x066b, code lost:
        android.os.AsyncTask.execute(new de.ozerov.fully.C0663a0(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x067d, code lost:
        if (r1.f9882b.h1().isEmpty() != false) goto L_0x069e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x067f, code lost:
        de.ozerov.fully.LoadContentZipFileJobService.a(r1.f9881a);
        r0 = r1.f9881a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0688, code lost:
        if (de.ozerov.fully.C0765r1.f10910c != false) goto L_0x06af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x068a, code lost:
        r2 = new de.ozerov.fully.C0760q1((de.ozerov.fully.C0678c3) null);
        r2.f10911a = new java.lang.ref.WeakReference(r0);
        r2.f10912b = true;
        r2.execute(new java.lang.Void[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x069e, code lost:
        r0 = r1.f9881a;
        r2 = de.ozerov.fully.LoadContentZipFileJobService.f10085V;
        ((android.app.job.JobScheduler) r0.getSystemService("jobscheduler")).cancel(8653);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x06af, code lost:
        r1.f9881a.f9918G0.setEnableTapSound(((Z1.c) r1.f9882b.f9767W).n("enableTapSound", false));
        r0 = r1.f9881a;
        r0.f9911B0.w0("sleep", de.ozerov.fully.C0726k3.a(r0));
        r0 = r1.f9881a;
        r0.f9911B0.w0("wakeup", de.ozerov.fully.C0726k3.a(r0));
        r0 = r1.f9881a.f9911B0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x06ea, code lost:
        if (r1.f9882b.Q1().booleanValue() == false) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x06ec, code lost:
        r2 = ((Z1.c) r1.f9882b.f9767W).r("rebootTime", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x06f9, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x06fa, code lost:
        r0.v0("reboot", r2);
        r1.f9881a.f9911B0.v0("folderCleanup", ((Z1.c) r1.f9882b.f9767W).r("folderCleanupTime", ""));
        de.ozerov.fully.C0794w0.A0(r1.f9881a, r1.f9882b.Z1().booleanValue(), r1.f9882b.c2().booleanValue());
        r0 = r1.f9882b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x074c, code lost:
        if (((Z1.c) r0.f9767W).q("navigationBarColor", ((android.content.Context) r0.f9768X).getResources().getColor(2131099717)) == 0) goto L_0x076e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x074e, code lost:
        r0 = r1.f9881a.getWindow();
        r14 = r1.f9882b;
        r0.setNavigationBarColor(((Z1.c) r14.f9767W).q("navigationBarColor", ((android.content.Context) r14.f9768X).getResources().getColor(2131099717)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0778, code lost:
        if (r1.f9882b.Z1().booleanValue() != false) goto L_0x0784;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x077a, code lost:
        r1.f9881a.getWindow().setNavigationBarColor(1879048192);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0784, code lost:
        r1.f9881a.getWindow().setNavigationBarColor(-16777216);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x078d, code lost:
        r0 = r1.f9882b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x07a5, code lost:
        if (((Z1.c) r0.f9767W).q("statusBarColor", ((android.content.Context) r0.f9768X).getResources().getColor(2131099717)) == 0) goto L_0x07c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x07a7, code lost:
        r0 = r1.f9881a.getWindow();
        r2 = r1.f9882b;
        r0.setStatusBarColor(((Z1.c) r2.f9767W).q("statusBarColor", ((android.content.Context) r2.f9768X).getResources().getColor(2131099717)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x07d1, code lost:
        if (r1.f9882b.c2().booleanValue() != false) goto L_0x07dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x07d3, code lost:
        r1.f9881a.getWindow().setStatusBarColor(1879048192);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x07dd, code lost:
        r1.f9881a.getWindow().setStatusBarColor(-16777216);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x07f0, code lost:
        if (r1.f9882b.N1().booleanValue() == false) goto L_0x080c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x07f2, code lost:
        de.ozerov.fully.C0794w0.u0(r1.f9881a, r1.f9882b.N1().booleanValue(), r1.f9882b.O1().booleanValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0812, code lost:
        if (de.ozerov.fully.C0794w0.k0(r1.f9881a) == false) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0818, code lost:
        if (n2.a.q0() != false) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x081a, code lost:
        de.ozerov.fully.C0794w0.B0(0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x081d, code lost:
        r1.f9881a.f9923L0.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x082e, code lost:
        if (r1.f9882b.Z().booleanValue() != false) goto L_0x083b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0830, code lost:
        r0 = r1.f9881a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0834, code lost:
        if (r0.f9955r1 == false) goto L_0x0837;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0837, code lost:
        de.ozerov.fully.C0794w0.L0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x083b, code lost:
        de.ozerov.fully.C0794w0.l0(r1.f9881a, r1.f9882b.a0().booleanValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0856, code lost:
        if (((Z1.c) r1.f9882b.f9767W).n("setCpuWakelock", false) != false) goto L_0x086d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0862, code lost:
        if (r1.f9882b.E1().booleanValue() == false) goto L_0x0865;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0865, code lost:
        r1.f9881a.f10979t0.d0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x086d, code lost:
        r1.f9881a.f10979t0.e(((Z1.c) r1.f9882b.f9767W).n("useFullWakelockForKeepalive", false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x088c, code lost:
        if (((Z1.c) r1.f9882b.f9767W).n("setWifiWakelock", false) == false) goto L_0x0896;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x088e, code lost:
        r1.f9881a.f10979t0.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0896, code lost:
        r1.f9881a.f10979t0.f0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x089d, code lost:
        de.ozerov.fully.C0794w0.C0(r1.f9881a, r1.f9882b.R1());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x08b2, code lost:
        if (r1.f9882b.c0().booleanValue() == false) goto L_0x08d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x08be, code lost:
        if (r1.f9882b.g2().booleanValue() == false) goto L_0x08d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x08ca, code lost:
        if (r1.f9882b.e2().isEmpty() != false) goto L_0x08d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x08cc, code lost:
        de.ozerov.fully.C0794w0.M0(r1.f9881a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x08dc, code lost:
        if (r1.f9882b.S().booleanValue() == false) goto L_0x08e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x08de, code lost:
        de.ozerov.fully.C0794w0.O0(r1.f9881a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x08e4, code lost:
        de.ozerov.fully.C0794w0.M0(r1.f9881a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x08e9, code lost:
        de.ozerov.fully.C0794w0.D0(r1.f9881a, ((Z1.c) r1.f9882b.f9767W).r("forceScreenOrientation", "0"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0906, code lost:
        if (((Z1.c) r1.f9882b.f9767W).n("forceScreenOrientationGlobal", false) == false) goto L_0x091a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0908, code lost:
        r1.f9881a.f9930S0.s(((Z1.c) r1.f9882b.f9767W).r("forceScreenOrientation", "0"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x091a, code lost:
        r1.f9881a.f9930S0.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0930, code lost:
        if (((Z1.c) r1.f9882b.f9767W).n("enableFullscreenVideos", true) == false) goto L_0x093c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0932, code lost:
        r1.f9881a.findViewById(2131362394).setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x093c, code lost:
        r1.f9881a.findViewById(2131362394).setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0947, code lost:
        r1.f9881a.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new de.ozerov.fully.C0672b3(2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x095e, code lost:
        if (n2.a.y0() == false) goto L_0x099e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        r0 = java.lang.Integer.parseInt(r1.f9882b.H());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x096a, code lost:
        if (r0 == 0) goto L_0x099e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x096c, code lost:
        r2 = r1.f9881a.getWindow().getAttributes();
        de.ozerov.fully.C0714i3.l(r2, r0);
        r1.f9881a.getWindow().setAttributes(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0983, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0984, code lost:
        r0 = "Failed to set display mode due to " + r0.getMessage();
        android.util.Log.e("E3", r0);
        n2.a.b1(r1.f9881a, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0a48 A[Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0a59 A[Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0a64 A[Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0abb  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0ac3  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0ad6  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0ade  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0b0e  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0b16  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0b53  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0b59  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0c81  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0c89  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0c9a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0c9b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r17 = this;
            r1 = r17
            r2 = 2
            r3 = 8
            r4 = 7
            r5 = 1
            r0 = 4
            r6 = 5
            r7 = 0
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = r8.w()
            if (r8 != 0) goto L_0x0013
            return
        L_0x0013:
            d4.k r8 = r1.f9882b
            java.lang.Boolean r8 = r8.K()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0026
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            java.lang.String r9 = "Apply settings"
            n2.a.b1(r8, r9)
        L_0x0026:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            B3.q r8 = r8.f9931T0
            r8.V()
            android.os.Handler r8 = new android.os.Handler
            r8.<init>()
            de.ozerov.fully.B3 r9 = new de.ozerov.fully.B3
            r9.<init>(r1, r6)
            r8.post(r9)
            d4.k r8 = r1.f9882b
            java.lang.Boolean r8 = r8.Q1()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x005a
            boolean r8 = de.ozerov.fully.P.f10240j
            if (r8 != 0) goto L_0x005a
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = de.ozerov.fully.P.A(r8)
            if (r8 == 0) goto L_0x005a
            de.ozerov.fully.a0 r8 = new de.ozerov.fully.a0
            r8.<init>(r0)
            android.os.AsyncTask.execute(r8)
        L_0x005a:
            d4.k r8 = r1.f9882b
            java.lang.Boolean r8 = r8.Q1()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x009f
            boolean r8 = de.ozerov.fully.P.f10240j
            if (r8 == 0) goto L_0x009f
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = de.ozerov.fully.P.A(r8)
            if (r8 == 0) goto L_0x009f
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = de.ozerov.fully.C0794w0.k0(r8)
            if (r8 != 0) goto L_0x009f
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.k0 r9 = new de.ozerov.fully.k0
            r9.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "pm grant "
            r10.<init>(r11)
            java.lang.String r8 = r8.getPackageName()
            r10.append(r8)
            java.lang.String r8 = " android.permission.WRITE_SECURE_SETTINGS"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.f10766b = r8
            java.lang.Void[] r8 = new java.lang.Void[r7]
            r9.execute(r8)
        L_0x009f:
            d4.k r8 = r1.f9882b
            java.lang.Boolean r8 = r8.c0()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00eb
            d4.k r8 = r1.f9882b
            java.lang.String r9 = "lockSafeMode"
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            boolean r8 = r8.n(r9, r7)
            if (r8 == 0) goto L_0x00eb
            d4.k r8 = r1.f9882b
            java.lang.String r8 = r8.d0()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x00eb
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = de.ozerov.fully.C0794w0.Y(r8)
            if (r8 != 0) goto L_0x00d5
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = de.ozerov.fully.C0794w0.Z(r8)
            if (r8 == 0) goto L_0x00eb
        L_0x00d5:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            d4.k r9 = r1.f9882b
            java.lang.String r9 = r9.d0()
            boolean r8 = de.ozerov.fully.P.N(r8, r9)
            if (r8 == 0) goto L_0x00e4
            goto L_0x00eb
        L_0x00e4:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            java.lang.String r9 = "Failed to set the Kiosk PIN for the Safe Mode lock"
            n2.a.b1(r8, r9)
        L_0x00eb:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.Y3 r8 = r8.f9953p1
            r8.b()
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.c r8 = r8.f9946i1
            r8.getClass()
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.I1.b(r8)
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.Z0.b(r8)
            d4.k r8 = r1.f9882b
            java.lang.Boolean r8 = r8.c0()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0139
            d4.k r8 = r1.f9882b
            java.lang.String r9 = "disableCamera"
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            boolean r8 = r8.n(r9, r7)
            if (r8 == 0) goto L_0x0139
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = de.ozerov.fully.C0794w0.Y(r8)
            if (r8 == 0) goto L_0x012b
            boolean r8 = n2.a.p0()
            if (r8 == 0) goto L_0x0133
        L_0x012b:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = de.ozerov.fully.C0794w0.Z(r8)
            if (r8 == 0) goto L_0x0139
        L_0x0133:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.P.M(r8, r5)
            goto L_0x0154
        L_0x0139:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = de.ozerov.fully.C0794w0.Y(r8)
            if (r8 == 0) goto L_0x0147
            boolean r8 = n2.a.p0()
            if (r8 == 0) goto L_0x014f
        L_0x0147:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            boolean r8 = de.ozerov.fully.C0794w0.Z(r8)
            if (r8 == 0) goto L_0x0154
        L_0x014f:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.P.M(r8, r7)
        L_0x0154:
            d4.k r8 = r1.f9882b
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            java.lang.String r9 = "wifiMode"
            java.lang.String r10 = "0"
            java.lang.String r8 = r8.r(r9, r10)
            java.lang.String r11 = "1"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x016f
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.C0794w0.j(r8)
        L_0x016f:
            d4.k r8 = r1.f9882b
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            java.lang.String r8 = r8.r(r9, r10)
            java.lang.String r9 = "2"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0186
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.C0794w0.g(r8)
        L_0x0186:
            d4.k r8 = r1.f9882b
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            java.lang.String r12 = "hotspotMode"
            java.lang.String r8 = r8.r(r12, r10)
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x01a2
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.D3 r13 = new de.ozerov.fully.D3
            r13.<init>()
            de.ozerov.fully.P.f(r8, r13)
        L_0x01a2:
            d4.k r8 = r1.f9882b
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            java.lang.String r8 = r8.r(r12, r10)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01b7
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.P.d(r8)
        L_0x01b7:
            d4.k r8 = r1.f9882b
            java.lang.String r8 = r8.B()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x01ce
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            d4.k r12 = r1.f9882b
            java.lang.String r12 = r12.B()
            de.ozerov.fully.C0794w0.z0(r8, r12)
        L_0x01ce:
            d4.k r8 = r1.f9882b
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            java.lang.String r12 = "bluetoothMode"
            java.lang.String r8 = r8.r(r12, r10)
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x01e3
            de.ozerov.fully.C0794w0.i()
        L_0x01e3:
            d4.k r8 = r1.f9882b
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            java.lang.String r8 = r8.r(r12, r10)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01f6
            de.ozerov.fully.C0794w0.f()
        L_0x01f6:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            o.s1 r8 = r8.f9941d1
            java.lang.Object r9 = r8.f14075g
            N5.f r9 = (N5.f) r9
            r12 = 0
            if (r9 == 0) goto L_0x020a
            java.lang.Object r13 = r8.f14070a
            de.ozerov.fully.FullyActivity r13 = (de.ozerov.fully.FullyActivity) r13
            r13.unregisterReceiver(r9)
            r8.f14075g = r12
        L_0x020a:
            java.lang.Object r9 = r8.f14071b
            d4.k r9 = (d4.k) r9
            java.lang.Object r13 = r9.f9767W
            Z1.c r13 = (Z1.c) r13
            java.lang.String r14 = "barcodeScanBroadcastAction"
            java.lang.String r15 = ""
            java.lang.String r13 = r13.r(r14, r15)
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x0252
            N5.f r13 = new N5.f
            r13.<init>(r4, r8)
            r8.f14075g = r13
            android.content.IntentFilter r13 = new android.content.IntentFilter
            java.lang.Object r9 = r9.f9767W
            Z1.c r9 = (Z1.c) r9
            java.lang.String r9 = r9.r(r14, r15)
            r13.<init>(r9)
            java.lang.String r9 = "android.intent.category.DEFAULT"
            r13.addCategory(r9)
            boolean r9 = n2.a.B0()
            java.lang.Object r14 = r8.f14070a
            de.ozerov.fully.FullyActivity r14 = (de.ozerov.fully.FullyActivity) r14
            if (r9 == 0) goto L_0x024b
            java.lang.Object r8 = r8.f14075g
            N5.f r8 = (N5.f) r8
            r14.registerReceiver(r8, r13, 2)
            goto L_0x0252
        L_0x024b:
            java.lang.Object r8 = r8.f14075g
            N5.f r8 = (N5.f) r8
            r14.registerReceiver(r8, r13)
        L_0x0252:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            Z1.c r8 = r8.f9940c1
            r8.getClass()
            java.lang.Object r8 = r8.f6955V
            d4.k r8 = (d4.k) r8
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            java.lang.String r9 = "wssServiceDiscovery"
            boolean r8 = r8.n(r9, r5)
            if (r8 == 0) goto L_0x026b
            java.lang.String[] r8 = de.ozerov.fully.A.f9779a
        L_0x026b:
            d4.k r8 = r1.f9882b
            java.lang.Boolean r8 = r8.c0()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x029b
            d4.k r8 = r1.f9882b
            java.lang.String r9 = "killScreenshots"
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            boolean r8 = r8.n(r9, r7)
            if (r8 == 0) goto L_0x029b
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.K2 r8 = r8.f9909A0
            java.lang.Object r9 = r8.f10050V
            de.ozerov.fully.FullyActivity r9 = (de.ozerov.fully.FullyActivity) r9
            android.content.ContentResolver r9 = r9.getContentResolver()
            android.net.Uri r13 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.Object r8 = r8.f10051W
            de.ozerov.fully.y3 r8 = (de.ozerov.fully.C0809y3) r8
            r9.registerContentObserver(r13, r5, r8)
            goto L_0x02ae
        L_0x029b:
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            de.ozerov.fully.K2 r8 = r8.f9909A0
            java.lang.Object r9 = r8.f10050V
            de.ozerov.fully.FullyActivity r9 = (de.ozerov.fully.FullyActivity) r9
            android.content.ContentResolver r9 = r9.getContentResolver()
            java.lang.Object r8 = r8.f10051W
            de.ozerov.fully.y3 r8 = (de.ozerov.fully.C0809y3) r8
            r9.unregisterContentObserver(r8)
        L_0x02ae:
            d4.k r8 = r1.f9882b
            java.lang.String r8 = r8.z2()
            boolean r8 = r8.isEmpty()
            java.lang.String r9 = " due to "
            java.lang.String r13 = "E3"
            if (r8 != 0) goto L_0x0324
            d4.k r8 = r1.f9882b
            java.lang.Boolean r8 = r8.c0()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0324
            de.ozerov.fully.FullyActivity r8 = r1.f9881a
            b3.a r8 = r8.f9921J0
            boolean r8 = r8.i()
            if (r8 == 0) goto L_0x0324
            d4.k r8 = r1.f9882b     // Catch:{ Exception -> 0x0302 }
            java.lang.String r8 = r8.z2()     // Catch:{ Exception -> 0x0302 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0302 }
            de.ozerov.fully.FullyActivity r14 = r1.f9881a     // Catch:{ Exception -> 0x0302 }
            boolean r16 = n2.a.B0()     // Catch:{ Exception -> 0x0302 }
            if (r16 == 0) goto L_0x02eb
            r4 = 10
            de.ozerov.fully.C0794w0.m0(r14, r8, r4)     // Catch:{ Exception -> 0x0302 }
        L_0x02eb:
            de.ozerov.fully.C0794w0.m0(r14, r8, r0)     // Catch:{ Exception -> 0x0302 }
            de.ozerov.fully.C0794w0.m0(r14, r8, r3)     // Catch:{ Exception -> 0x0302 }
            de.ozerov.fully.C0794w0.m0(r14, r8, r6)     // Catch:{ Exception -> 0x0302 }
            r0 = 3
            de.ozerov.fully.C0794w0.m0(r14, r8, r0)     // Catch:{ Exception -> 0x0302 }
            de.ozerov.fully.C0794w0.m0(r14, r8, r5)     // Catch:{ Exception -> 0x0302 }
            de.ozerov.fully.C0794w0.m0(r14, r8, r7)     // Catch:{ Exception -> 0x0302 }
            de.ozerov.fully.C0794w0.m0(r14, r8, r2)     // Catch:{ Exception -> 0x0302 }
            goto L_0x0324
        L_0x0302:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to set volume limit "
            r4.<init>(r6)
            d4.k r6 = r1.f9882b
            java.lang.String r6 = r6.z2()
            r4.append(r6)
            r4.append(r9)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r13, r0)
        L_0x0324:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            d4.k r4 = r1.f9882b
            java.lang.String r6 = "volumeLevels"
            java.lang.Object r4 = r4.f9767W
            Z1.c r4 = (Z1.c) r4
            java.lang.String r4 = r4.r(r6, r15)
            de.ozerov.fully.C0794w0.E0(r0, r4)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.V4 r0 = r0.f9928Q0
            r0.a()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            C7.d r0 = r0.f9948k1
            d4.k r4 = r1.f9882b
            java.lang.String r6 = "kioskAppWhitelist"
            java.lang.Object r4 = r4.f9767W
            Z1.c r4 = (Z1.c) r4
            java.lang.String r4 = r4.r(r6, r15)
            java.lang.String[] r4 = n2.a.W(r4)
            r0.f735Y = r4
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            C7.d r0 = r0.f9948k1
            d4.k r4 = r1.f9882b
            java.lang.String r6 = "kioskAppBlacklist"
            java.lang.Object r4 = r4.f9767W
            Z1.c r4 = (Z1.c) r4
            java.lang.String r4 = r4.r(r6, r15)
            java.lang.String[] r4 = n2.a.W(r4)
            r0.f736Z = r4
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            u.O r0 = r0.f9934W0
            d4.k r4 = r1.f9882b
            java.lang.String r6 = "movementBeaconList"
            java.lang.Object r4 = r4.f9767W
            Z1.c r4 = (Z1.c) r4
            java.lang.String r4 = r4.r(r6, r15)
            java.lang.String[] r4 = n2.a.W(r4)
            r0.e = r4
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.g4 r0 = r0.f9945h1
            r0.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r0.f10653f = r2
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.g4 r0 = r0.f9945h1
            r0.d()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.g4 r0 = r0.f9945h1
            android.os.Handler r2 = r0.f10652d
            r2.removeCallbacksAndMessages(r12)
            d4.k r0 = r0.f10650b
            r0.getClass()
            java.lang.Object r0 = r0.f9767W     // Catch:{ Exception -> 0x03ae }
            Z1.c r0 = (Z1.c) r0     // Catch:{ Exception -> 0x03ae }
            java.lang.String r2 = "rewindEachSeconds"
            java.lang.String r0 = r0.r(r2, r10)     // Catch:{ Exception -> 0x03ae }
            java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x03ae }
            goto L_0x03af
        L_0x03ae:
        L_0x03af:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.g4 r0 = r0.f9945h1
            r0.c()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.g4 r0 = r0.f9945h1
            r0.a()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.g4 r0 = r0.f9945h1
            r0.b()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.w3 r0 = r0.f9943f1
            r0.b()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.w3 r0 = r0.f9943f1
            r0.c()
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.J1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x03ef
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.B2()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03eb
            goto L_0x03ef
        L_0x03eb:
            de.ozerov.fully.Y.b()
            goto L_0x040e
        L_0x03ef:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            d4.k r2 = r1.f9882b
            r2.getClass()
            java.lang.Object r2 = r2.f9767W     // Catch:{ Exception -> 0x0407 }
            Z1.c r2 = (Z1.c) r2     // Catch:{ Exception -> 0x0407 }
            java.lang.String r3 = "locationUpdateInterval"
            java.lang.String r8 = "300"
            java.lang.String r2 = r2.r(r3, r8)     // Catch:{ Exception -> 0x0407 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0407 }
            goto L_0x0409
        L_0x0407:
            r2 = 300(0x12c, float:4.2E-43)
        L_0x0409:
            int r2 = r2 * 1000
            de.ozerov.fully.Y.a(r0, r2)
        L_0x040e:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.z1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0438
            d4.k r0 = r1.f9882b
            java.lang.Object r2 = r0.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r3 = "mqttBrokerUrl"
            java.lang.String r2 = r2.r(r3, r15)
            java.lang.String r0 = r0.N2(r2)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0438
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            B3.q r0 = r0.f9935X0
            r0.p0()
            goto L_0x043f
        L_0x0438:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            B3.q r0 = r0.f9935X0
            r0.q0()
        L_0x043f:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            a1.a r0 = r0.f9936Y0
            r0.getClass()
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "environmentSensorsEnabled"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 == 0) goto L_0x045c
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.A3 r0 = r0.f9937Z0
            r0.c()
            goto L_0x0463
        L_0x045c:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.A3 r0 = r0.f9937Z0
            r0.d()
        L_0x0463:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            A.e r0 = r0.f9938a1
            r0.b()
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "proximityScreenOff"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 == 0) goto L_0x0480
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.K2 r0 = r0.f9939b1
            r0.U()
            goto L_0x048f
        L_0x0480:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.K2 r0 = r0.f9939b1
            java.lang.Object r2 = r0.f10051W
            android.os.PowerManager$WakeLock r2 = (android.os.PowerManager.WakeLock) r2
            if (r2 == 0) goto L_0x048f
            r2.release()
            r0.f10051W = r12
        L_0x048f:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.u2()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04a1
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.C0794w0.W(r0)
            goto L_0x04a4
        L_0x04a1:
            de.ozerov.fully.C0794w0.e()
        L_0x04a4:
            d4.k r0 = r1.f9882b
            java.lang.String r0 = r0.F2()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04d3
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            java.lang.String r0 = de.ozerov.fully.C0794w0.U(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "\""
            r2.<init>(r3)
            d4.k r8 = r1.f9882b
            java.lang.String r8 = r8.F2()
            r2.append(r8)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x04df
        L_0x04d3:
            d4.k r0 = r1.f9882b
            java.lang.String r0 = r0.e0()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x04f2
        L_0x04df:
            boolean r0 = n2.a.y0()
            if (r0 == 0) goto L_0x04ed
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            int r0 = r0.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION")
            if (r0 != 0) goto L_0x04f2
        L_0x04ed:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.C0794w0.I0(r0)
        L_0x04f2:
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "reloadOnInternet"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 != 0) goto L_0x0544
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "rewindOnInternet"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 != 0) goto L_0x0544
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.B2()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0544
            d4.k r0 = r1.f9882b
            int r0 = r0.O()
            if (r0 > 0) goto L_0x0544
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "resetWifiOnDisconnection"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 == 0) goto L_0x0531
            goto L_0x0544
        L_0x0531:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.J0 r0 = r0.f9950m1
            java.util.Timer r2 = r0.f10017b
            if (r2 == 0) goto L_0x055b
            r2.cancel()
            java.util.Timer r2 = r0.f10017b
            r2.purge()
            r0.f10017b = r12
            goto L_0x055b
        L_0x0544:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.J0 r0 = r0.f9950m1
            de.ozerov.fully.B3 r2 = new de.ozerov.fully.B3
            r3 = 6
            r2.<init>(r1, r3)
            r0.f10019d = r2
            de.ozerov.fully.B3 r2 = new de.ozerov.fully.B3
            r3 = 7
            r2.<init>(r1, r3)
            r0.e = r2
            r0.a()
        L_0x055b:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.J1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x056f
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            N5.k r0 = r0.f9910A1
            r0.b()
            goto L_0x0576
        L_0x056f:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            N5.k r0 = r0.f9910A1
            r0.c()
        L_0x0576:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.y1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x058a
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.O1 r0 = r0.f9927P0
            r0.b()
            goto L_0x0591
        L_0x058a:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.O1 r0 = r0.f9927P0
            r0.c()
        L_0x0591:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.t1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x05a5
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            N5.k r0 = r0.f9914C1
            r0.b()
            goto L_0x05ac
        L_0x05a5:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            N5.k r0 = r0.f9914C1
            r0.c()
        L_0x05ac:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            u.O r0 = r0.f9934W0
            r0.n()
            d4.k r0 = r1.f9882b
            java.lang.Object r2 = r0.f9766V
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r3 = "startURL"
            java.lang.String r0 = r0.r(r3, r2)
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = "$hostname"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x066b
            d4.k r0 = r1.f9882b
            java.lang.String r3 = "errorURL"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r3, r15)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x066b
            d4.k r0 = r1.f9882b
            java.lang.String r3 = "loadContentZipFileUrl"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r3, r15)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x066b
            d4.k r0 = r1.f9882b
            java.lang.String r3 = "clientCaUrl"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r3, r15)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x066b
            d4.k r0 = r1.f9882b
            java.lang.String r3 = "searchProviderUrl"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r3, r15)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x066b
            d4.k r0 = r1.f9882b
            java.lang.String r3 = "actionBarBgUrl"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r3, r15)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x066b
            d4.k r0 = r1.f9882b
            java.lang.String r3 = "actionBarIconUrl"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r3, r15)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x066b
            d4.k r0 = r1.f9882b
            java.lang.String r3 = "screensaverWallpaperURL"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r3, r15)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x066b
            d4.k r0 = r1.f9882b
            java.lang.String r0 = r0.q()
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x066b
            d4.k r0 = r1.f9882b
            java.lang.String r3 = "alarmSoundFileUrl"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r3, r15)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0673
        L_0x066b:
            de.ozerov.fully.a0 r0 = new de.ozerov.fully.a0
            r0.<init>(r7)
            android.os.AsyncTask.execute(r0)
        L_0x0673:
            d4.k r0 = r1.f9882b
            java.lang.String r0 = r0.h1()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x069e
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.LoadContentZipFileJobService.a(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            boolean r2 = de.ozerov.fully.C0765r1.f10910c
            if (r2 != 0) goto L_0x06af
            de.ozerov.fully.q1 r2 = new de.ozerov.fully.q1
            r2.<init>(r12)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r2.f10911a = r3
            r2.f10912b = r5
            java.lang.Void[] r0 = new java.lang.Void[r7]
            r2.execute(r0)
            goto L_0x06af
        L_0x069e:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            int r2 = de.ozerov.fully.LoadContentZipFileJobService.f10085V
            java.lang.String r2 = "jobscheduler"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            r2 = 8653(0x21cd, float:1.2125E-41)
            r0.cancel(r2)
        L_0x06af:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.TouchableFrameLayout r0 = r0.f9918G0
            d4.k r2 = r1.f9882b
            java.lang.String r3 = "enableTapSound"
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            boolean r2 = r2.n(r3, r7)
            r0.setEnableTapSound(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            R2.c r2 = r0.f9911B0
            java.util.ArrayList r0 = de.ozerov.fully.C0726k3.a(r0)
            java.lang.String r3 = "sleep"
            r2.w0(r3, r0)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            R2.c r2 = r0.f9911B0
            java.util.ArrayList r0 = de.ozerov.fully.C0726k3.a(r0)
            java.lang.String r3 = "wakeup"
            r2.w0(r3, r0)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            R2.c r0 = r0.f9911B0
            d4.k r2 = r1.f9882b
            java.lang.Boolean r2 = r2.Q1()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x06f9
            d4.k r2 = r1.f9882b
            java.lang.String r3 = "rebootTime"
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r2 = r2.r(r3, r15)
            goto L_0x06fa
        L_0x06f9:
            r2 = r15
        L_0x06fa:
            java.lang.String r3 = "reboot"
            r0.v0(r3, r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            R2.c r0 = r0.f9911B0
            d4.k r2 = r1.f9882b
            java.lang.String r3 = "folderCleanupTime"
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r2 = r2.r(r3, r15)
            java.lang.String r3 = "folderCleanup"
            r0.v0(r3, r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            d4.k r2 = r1.f9882b
            java.lang.Boolean r2 = r2.Z1()
            boolean r2 = r2.booleanValue()
            d4.k r3 = r1.f9882b
            java.lang.Boolean r3 = r3.c2()
            boolean r3 = r3.booleanValue()
            de.ozerov.fully.C0794w0.A0(r0, r2, r3)
            d4.k r0 = r1.f9882b
            java.lang.Object r2 = r0.f9768X
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099717(0x7f060045, float:1.7811795E38)
            int r2 = r2.getColor(r3)
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r8 = "navigationBarColor"
            int r0 = r0.q(r8, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11 = 1879048192(0x70000000, float:1.58456325E29)
            if (r0 == 0) goto L_0x076e
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.view.Window r0 = r0.getWindow()
            d4.k r14 = r1.f9882b
            java.lang.Object r4 = r14.f9768X
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r3)
            java.lang.Object r14 = r14.f9767W
            Z1.c r14 = (Z1.c) r14
            int r4 = r14.q(r8, r4)
            r0.setNavigationBarColor(r4)
            goto L_0x078d
        L_0x076e:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.Z1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0784
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.view.Window r0 = r0.getWindow()
            r0.setNavigationBarColor(r11)
            goto L_0x078d
        L_0x0784:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.view.Window r0 = r0.getWindow()
            r0.setNavigationBarColor(r2)
        L_0x078d:
            d4.k r0 = r1.f9882b
            java.lang.Object r4 = r0.f9768X
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r3)
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r8 = "statusBarColor"
            int r0 = r0.q(r8, r4)
            if (r0 == 0) goto L_0x07c7
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.view.Window r0 = r0.getWindow()
            d4.k r2 = r1.f9882b
            java.lang.Object r4 = r2.f9768X
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            int r3 = r4.getColor(r3)
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            int r2 = r2.q(r8, r3)
            r0.setStatusBarColor(r2)
            goto L_0x07e6
        L_0x07c7:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.c2()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x07dd
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.view.Window r0 = r0.getWindow()
            r0.setStatusBarColor(r11)
            goto L_0x07e6
        L_0x07dd:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.view.Window r0 = r0.getWindow()
            r0.setStatusBarColor(r2)
        L_0x07e6:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.N1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x080c
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            d4.k r2 = r1.f9882b
            java.lang.Boolean r2 = r2.N1()
            boolean r2 = r2.booleanValue()
            d4.k r3 = r1.f9882b
            java.lang.Boolean r3 = r3.O1()
            boolean r3 = r3.booleanValue()
            de.ozerov.fully.C0794w0.u0(r0, r2, r3)
            goto L_0x081d
        L_0x080c:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            boolean r0 = de.ozerov.fully.C0794w0.k0(r0)
            if (r0 == 0) goto L_0x081d
            boolean r0 = n2.a.q0()
            if (r0 != 0) goto L_0x081d
            de.ozerov.fully.C0794w0.B0(r7, r7, r7, r7)
        L_0x081d:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.c r0 = r0.f9923L0
            r0.d()
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.Z()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x083b
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            boolean r2 = r0.f9955r1
            if (r2 == 0) goto L_0x0837
            goto L_0x083b
        L_0x0837:
            de.ozerov.fully.C0794w0.L0(r0)
            goto L_0x084a
        L_0x083b:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            d4.k r2 = r1.f9882b
            java.lang.Boolean r2 = r2.a0()
            boolean r2 = r2.booleanValue()
            de.ozerov.fully.C0794w0.l0(r0, r2)
        L_0x084a:
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "setCpuWakelock"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 != 0) goto L_0x086d
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.E1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0865
            goto L_0x086d
        L_0x0865:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            B3.q r0 = r0.f10979t0
            r0.d0()
            goto L_0x0880
        L_0x086d:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            B3.q r0 = r0.f10979t0
            d4.k r2 = r1.f9882b
            java.lang.String r3 = "useFullWakelockForKeepalive"
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            boolean r2 = r2.n(r3, r7)
            r0.e(r2)
        L_0x0880:
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "setWifiWakelock"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 == 0) goto L_0x0896
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            B3.q r0 = r0.f10979t0
            r0.g()
            goto L_0x089d
        L_0x0896:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            B3.q r0 = r0.f10979t0
            r0.f0()
        L_0x089d:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            d4.k r2 = r1.f9882b
            int r2 = r2.R1()
            de.ozerov.fully.C0794w0.C0(r0, r2)
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.c0()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x08d2
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.g2()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x08d2
            d4.k r0 = r1.f9882b
            java.lang.String r0 = r0.e2()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x08d2
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.C0794w0.M0(r0)
            goto L_0x08e9
        L_0x08d2:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.S()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x08e4
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.C0794w0.O0(r0)
            goto L_0x08e9
        L_0x08e4:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.C0794w0.M0(r0)
        L_0x08e9:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            d4.k r2 = r1.f9882b
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r3 = "forceScreenOrientation"
            java.lang.String r2 = r2.r(r3, r10)
            de.ozerov.fully.C0794w0.D0(r0, r2)
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "forceScreenOrientationGlobal"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 == 0) goto L_0x091a
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            D2.o r0 = r0.f9930S0
            d4.k r2 = r1.f9882b
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r2 = r2.r(r3, r10)
            r0.s(r2)
            goto L_0x0921
        L_0x091a:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            D2.o r0 = r0.f9930S0
            r0.t()
        L_0x0921:
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "enableFullscreenVideos"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r5)
            r2 = 2131362394(0x7f0a025a, float:1.8344567E38)
            if (r0 == 0) goto L_0x093c
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r7)
            goto L_0x0947
        L_0x093c:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.view.View r0 = r0.findViewById(r2)
            r2 = 8
            r0.setVisibility(r2)
        L_0x0947:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            de.ozerov.fully.b3 r2 = new de.ozerov.fully.b3
            r3 = 2
            r2.<init>(r3, r1)
            r0.setOnSystemUiVisibilityChangeListener(r2)
            boolean r0 = n2.a.y0()
            if (r0 == 0) goto L_0x099e
            d4.k r0 = r1.f9882b     // Catch:{ Exception -> 0x0983 }
            java.lang.String r0 = r0.H()     // Catch:{ Exception -> 0x0983 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0983 }
            if (r0 == 0) goto L_0x099e
            de.ozerov.fully.FullyActivity r2 = r1.f9881a     // Catch:{ Exception -> 0x0983 }
            android.view.Window r2 = r2.getWindow()     // Catch:{ Exception -> 0x0983 }
            android.view.WindowManager$LayoutParams r2 = r2.getAttributes()     // Catch:{ Exception -> 0x0983 }
            r2.preferredDisplayModeId = r0     // Catch:{ Exception -> 0x0983 }
            de.ozerov.fully.FullyActivity r0 = r1.f9881a     // Catch:{ Exception -> 0x0983 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x0983 }
            r0.setAttributes(r2)     // Catch:{ Exception -> 0x0983 }
            goto L_0x099e
        L_0x0983:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to set display mode due to "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r13, r0)
            de.ozerov.fully.FullyActivity r2 = r1.f9881a
            n2.a.b1(r2, r0)
        L_0x099e:
            d4.k r0 = r1.f9882b
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r2 = "appLocale"
            java.lang.String r0 = r0.r(r2, r15)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x09fc
            d4.k r0 = r1.f9882b     // Catch:{ Exception -> 0x09e0 }
            java.lang.Object r0 = r0.f9767W     // Catch:{ Exception -> 0x09e0 }
            Z1.c r0 = (Z1.c) r0     // Catch:{ Exception -> 0x09e0 }
            java.lang.String r0 = r0.r(r2, r15)     // Catch:{ Exception -> 0x09e0 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x09e0 }
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)     // Catch:{ Exception -> 0x09e0 }
            de.ozerov.fully.FullyActivity r3 = r1.f9881a     // Catch:{ Exception -> 0x09e0 }
            java.util.Locale.setDefault(r0)     // Catch:{ Exception -> 0x09e0 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x09e0 }
            android.util.DisplayMetrics r8 = r3.getDisplayMetrics()     // Catch:{ Exception -> 0x09e0 }
            android.content.res.Configuration r10 = r3.getConfiguration()     // Catch:{ Exception -> 0x09e0 }
            r10.setLocale(r0)     // Catch:{ Exception -> 0x09e0 }
            r10.setLayoutDirection(r0)     // Catch:{ Exception -> 0x09e0 }
            r3.updateConfiguration(r10, r8)     // Catch:{ Exception -> 0x09e0 }
            r0.toLanguageTag()     // Catch:{ Exception -> 0x09e0 }
            goto L_0x0a40
        L_0x09e0:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to change locale to "
            r3.<init>(r8)
            d4.k r8 = r1.f9882b
            java.lang.Object r8 = r8.f9767W
            Z1.c r8 = (Z1.c) r8
            java.lang.String r2 = r8.r(r2, r15)
            r3.append(r2)
            r3.append(r9)
            Q0.g.x(r0, r3, r13)
            goto L_0x0a40
        L_0x09fc:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()     // Catch:{ Exception -> 0x0a2a }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x0a2a }
            q0.d r0 = G5.s.q(r0)     // Catch:{ Exception -> 0x0a2a }
            java.util.Locale r0 = r0.c()     // Catch:{ Exception -> 0x0a2a }
            de.ozerov.fully.FullyActivity r2 = r1.f9881a     // Catch:{ Exception -> 0x0a2a }
            java.util.Locale.setDefault(r0)     // Catch:{ Exception -> 0x0a2a }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x0a2a }
            android.util.DisplayMetrics r3 = r2.getDisplayMetrics()     // Catch:{ Exception -> 0x0a2a }
            android.content.res.Configuration r8 = r2.getConfiguration()     // Catch:{ Exception -> 0x0a2a }
            r8.setLocale(r0)     // Catch:{ Exception -> 0x0a2a }
            r8.setLayoutDirection(r0)     // Catch:{ Exception -> 0x0a2a }
            r2.updateConfiguration(r8, r3)     // Catch:{ Exception -> 0x0a2a }
            r0.toLanguageTag()     // Catch:{ Exception -> 0x0a2a }
            goto L_0x0a40
        L_0x0a2a:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to change locale to system default due to "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            g7.l.d(r13, r0)
        L_0x0a40:
            d4.k r0 = r1.f9882b     // Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }
            int r0 = r0.n()     // Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }
            if (r0 != 0) goto L_0x0a50
            h.o.k(r5)     // Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }
            goto L_0x0a50
        L_0x0a4c:
            r0 = move-exception
            goto L_0x0a69
        L_0x0a4e:
            r0 = move-exception
            goto L_0x0a69
        L_0x0a50:
            d4.k r0 = r1.f9882b     // Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }
            int r0 = r0.n()     // Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }
            r2 = 2
            if (r0 != r2) goto L_0x0a5c
            h.o.k(r2)     // Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }
        L_0x0a5c:
            d4.k r0 = r1.f9882b     // Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }
            int r0 = r0.n()     // Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }
            if (r0 != r5) goto L_0x0a7e
            r0 = -1
            h.o.k(r0)     // Catch:{ Exception -> 0x0a4e, Error -> 0x0a4c }
            goto L_0x0a7e
        L_0x0a69:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to set the dark mode due to "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            g7.l.r(r13, r0)
        L_0x0a7e:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            R2.c r0 = r0.f9929R0
            r0.H()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            Z1.a r0 = r0.f9942e1
            d4.k r2 = r1.f9882b
            java.lang.String r2 = r2.A2()
            r0.f(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            Q.h r0 = r0.f9924M0
            r0.i(r7, r7)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.c r0 = r0.f9925N0
            r0.e()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.W3 r0 = r0.f9922K0
            r0.k()
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "forceImmersive"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 == 0) goto L_0x0ac3
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            boolean r0 = r0.f10980u0
            if (r0 != 0) goto L_0x0ac3
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.W3 r0 = r0.f9922K0
            r0.c()
            goto L_0x0aca
        L_0x0ac3:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.W3 r0 = r0.f9922K0
            r0.b()
        L_0x0aca:
            d4.k r0 = r1.f9882b
            java.lang.String r0 = r0.j2()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0ade
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "systemWallpaperLastUrl"
            r0.V2(r2, r15)
            goto L_0x0b02
        L_0x0ade:
            d4.k r0 = r1.f9882b
            java.lang.String r0 = r0.j2()
            d4.k r2 = r1.f9882b
            java.lang.String r2 = r2.i2()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0b02
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            d4.k r2 = r1.f9882b
            java.lang.String r2 = r2.j2()
            de.ozerov.fully.B3 r3 = new de.ozerov.fully.B3
            r6 = 8
            r3.<init>(r1, r6)
            de.ozerov.fully.C0794w0.F0(r5, r0, r3, r2)
        L_0x0b02:
            d4.k r0 = r1.f9882b
            java.lang.String r0 = r0.k1()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0b16
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "lockscreenWallpaperLastUrl"
            r0.V2(r2, r15)
            goto L_0x0b3b
        L_0x0b16:
            d4.k r0 = r1.f9882b
            java.lang.String r0 = r0.k1()
            d4.k r2 = r1.f9882b
            java.lang.String r2 = r2.j1()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0b3b
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            d4.k r2 = r1.f9882b
            java.lang.String r2 = r2.k1()
            de.ozerov.fully.B3 r3 = new de.ozerov.fully.B3
            r6 = 9
            r3.<init>(r1, r6)
            r4 = 2
            de.ozerov.fully.C0794w0.F0(r4, r0, r3, r2)
        L_0x0b3b:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.F1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0b59
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            boolean r0 = r0.f10980u0
            if (r0 == 0) goto L_0x0b59
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            boolean r0 = r0.f10981v0
            if (r0 != 0) goto L_0x0b59
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.P.P(r0)
            goto L_0x0b7c
        L_0x0b59:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.F1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0b7c
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            boolean r0 = r0.f10980u0
            if (r0 == 0) goto L_0x0b7c
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            boolean r0 = r0.f10981v0
            if (r0 != 0) goto L_0x0b7c
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            android.nfc.NfcAdapter r2 = de.ozerov.fully.P.f10233a
            if (r2 == 0) goto L_0x0b7c
            r2.disableForegroundDispatch(r0)
            de.ozerov.fully.P.f10233a = r12
        L_0x0b7c:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            java.lang.Boolean r2 = r2.b2()
            boolean r2 = r2.booleanValue()
            r0.w(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            java.lang.Boolean r2 = r2.X1()
            boolean r2 = r2.booleanValue()
            r0.u(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            r2.G1()
            r0.getClass()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            java.lang.String r3 = "showTabs"
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            boolean r2 = r2.n(r3, r7)
            r0.y(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            java.lang.Boolean r2 = r2.d2()
            boolean r2 = r2.booleanValue()
            r0.x(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            java.lang.Boolean r2 = r2.a2()
            boolean r2 = r2.booleanValue()
            r0.v(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            java.lang.Object r3 = r2.f9767W
            Z1.c r3 = (Z1.c) r3
            java.lang.String r4 = "newTabUrl"
            java.lang.String r3 = r3.r(r4, r15)
            java.lang.String r2 = r2.N2(r3)
            r0.t(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            int r2 = r2.k2()
            r0.z(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            int r2 = r2.X()
            r0.r(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            int r2 = r2.l2()
            r0.A(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            d4.k r2 = r1.f9882b
            java.lang.Boolean r2 = r2.D2()
            boolean r2 = r2.booleanValue()
            r0.B(r2)
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.i5 r0 = r0.f9917F0
            r0.b()
            d4.k r0 = r1.f9882b     // Catch:{ Exception -> 0x0c48, Error -> 0x0c46 }
            java.lang.Boolean r0 = r0.C2()     // Catch:{ Exception -> 0x0c48, Error -> 0x0c46 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0c48, Error -> 0x0c46 }
            android.webkit.WebView.setWebContentsDebuggingEnabled(r0)     // Catch:{ Exception -> 0x0c48, Error -> 0x0c46 }
            android.webkit.WebView.clearClientCertPreferences(r12)     // Catch:{ Exception -> 0x0c48, Error -> 0x0c46 }
            goto L_0x0c4c
        L_0x0c46:
            r0 = move-exception
            goto L_0x0c49
        L_0x0c48:
            r0 = move-exception
        L_0x0c49:
            r0.printStackTrace()
        L_0x0c4c:
            boolean r0 = n2.a.A0()
            if (r0 == 0) goto L_0x0c73
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "safeBrowsing"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 == 0) goto L_0x0c73
            boolean r0 = r1.f9883c
            if (r0 != 0) goto L_0x0c73
            de.ozerov.fully.FullyActivity r0 = r1.f9881a     // Catch:{ Exception -> 0x0c6f }
            de.ozerov.fully.C3 r2 = new de.ozerov.fully.C3     // Catch:{ Exception -> 0x0c6f }
            r2.<init>(r7, r1)     // Catch:{ Exception -> 0x0c6f }
            android.webkit.WebView.startSafeBrowsing(r0, r2)     // Catch:{ Exception -> 0x0c6f }
            goto L_0x0c73
        L_0x0c6f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0c73:
            d4.k r0 = r1.f9882b
            java.lang.String r2 = "webHostFilter"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r2, r7)
            if (r0 == 0) goto L_0x0c89
            de.ozerov.fully.W4.f10488b = r5
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.W4.a(r0)
            goto L_0x0c8b
        L_0x0c89:
            de.ozerov.fully.W4.f10488b = r7
        L_0x0c8b:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.V4 r0 = r0.f9928Q0
            r0.h()
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            boolean r0 = r0.w()
            if (r0 != 0) goto L_0x0c9b
            return
        L_0x0c9b:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            U.d r0 = r0.f9919H0
            r0.j()
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.s1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0cb6
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            N5.k r0 = r0.f9958x1
            r0.b()
            goto L_0x0cbd
        L_0x0cb6:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            N5.k r0 = r0.f9958x1
            r0.c()
        L_0x0cbd:
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.u()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0cdd
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.J1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0cdd
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.S r0 = r0.f9960y1
            r0.b()
            goto L_0x0ce4
        L_0x0cdd:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.S r0 = r0.f9960y1
            r0.c()
        L_0x0ce4:
            V0.r r0 = new V0.r
            de.ozerov.fully.FullyActivity r2 = r1.f9881a
            r0.<init>(r2, r5)
            r0.a()
            d4.k r0 = r1.f9882b
            java.lang.Boolean r0 = r0.A1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0d02
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            a1.a r0 = r0.f9912B1
            r0.getClass()
            goto L_0x0d09
        L_0x0d02:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            a1.a r0 = r0.f9912B1
            r0.getClass()
        L_0x0d09:
            de.ozerov.fully.FullyActivity r0 = r1.f9881a
            de.ozerov.fully.C0813z1.V(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.E3.a():void");
    }

    public void b() {
        boolean booleanValue = this.f9882b.K().booleanValue();
        FullyActivity fullyActivity = this.f9881a;
        if (booleanValue) {
            a.b1(fullyActivity, "Apply new settings...");
        }
        fullyActivity.f9921J0.q(new B3(this, 4));
    }

    public void c() {
        boolean booleanValue = this.f9882b.K().booleanValue();
        FullyActivity fullyActivity = this.f9881a;
        if (booleanValue) {
            a.b1(fullyActivity, "Apply new settings...");
        }
        if (fullyActivity.y("welcome")) {
            fullyActivity.C();
        }
        if (fullyActivity.y("single_app_manager")) {
            fullyActivity.C();
            fullyActivity.B(new J3());
        }
        if (fullyActivity.f9933V0.m()) {
            fullyActivity.f9933V0.n(true, false, (Runnable) null);
            a();
            if (!fullyActivity.f9933V0.m()) {
                fullyActivity.f9949l1.b();
                return;
            }
            return;
        }
        fullyActivity.f9921J0.q(new B3(this, 2));
    }

    public void d(long j7) {
        this.f9883c = true;
        FullyActivity fullyActivity = this.f9881a;
        fullyActivity.f9960y1.e(false, true);
        k kVar = this.f9882b;
        if (kVar.u2().booleanValue()) {
            C0794w0.P0(C0794w0.f11018b);
        }
        if (fullyActivity.f9943f1.f11046f) {
            q.s0(fullyActivity, true, true);
        }
        if (kVar.s1().booleanValue()) {
            fullyActivity.f9958x1.c();
        }
        if (kVar.y1().booleanValue()) {
            fullyActivity.f9927P0.c();
        }
        if (kVar.t1().booleanValue()) {
            fullyActivity.f9914C1.c();
        }
        c cVar = (c) kVar.f9767W;
        if (cVar.n("setCpuWakelock", false)) {
            fullyActivity.f10979t0.d0();
        }
        if (kVar.Z().booleanValue()) {
            fullyActivity.f10979t0.c0();
        }
        if (cVar.n("setWifiWakelock", false)) {
            fullyActivity.f10979t0.f0();
        }
        Log.i("SleepManager", "Device sleep forced");
        new Handler().postDelayed(new M2(3, (Object) this), j7);
    }

    public void e() {
        this.f9883c = false;
        this.f9881a.f9960y1.e(false, true);
        if (this.f9882b.s1().booleanValue() && (!((c) this.f9882b.f9767W).n("pauseMotionInBackground", false) || this.f9881a.f10980u0)) {
            this.f9881a.f9958x1.b();
        }
        if (this.f9882b.t1().booleanValue()) {
            this.f9881a.f9914C1.b();
        }
        if (this.f9882b.y1().booleanValue()) {
            this.f9881a.f9927P0.b();
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f9881a.f10979t0.f449U;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f9881a.f10979t0.d0();
        }
        if (((c) this.f9882b.f9767W).n("setCpuWakelock", false) || this.f9882b.E1().booleanValue()) {
            this.f9881a.f10979t0.e(((c) this.f9882b.f9767W).n("useFullWakelockForKeepalive", false));
        }
        if (((c) this.f9882b.f9767W).n("setWifiWakelock", false)) {
            this.f9881a.f10979t0.g();
        }
        if (this.f9882b.Z().booleanValue()) {
            this.f9881a.f10979t0.c();
        }
    }
}
