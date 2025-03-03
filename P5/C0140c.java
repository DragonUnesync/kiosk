package P5;

import Z1.c;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.C0752p;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.MyWebView;
import de.ozerov.fully.P;
import de.ozerov.fully.Z0;
import j$.net.URLDecoder;
import java.util.ArrayList;
import n2.a;
import org.json.JSONObject;

/* renamed from: P5.c  reason: case insensitive filesystem */
public final class C0140c extends C0145h {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3898w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0140c(int i) {
        super(0);
        this.f3898w = i;
    }

    private final K q() {
        if (!this.f3891p || !this.f3888m.equals("playVideo") || this.f3884h.get("url") == null) {
            return null;
        }
        try {
            String a8 = P.a((String) this.f3884h.get("url"));
            if (P.I(a8)) {
                this.f3879b.runOnUiThread(new w(this, URLDecoder.decode(a8, "UTF-8"), u("loop"), u("showControls"), u("exitOnTouch"), u("exitOnCompletion"), 0));
                ArrayList arrayList = this.f3894s;
                arrayList.add("Play Video from URL " + a8 + " ...");
                try {
                    Thread.sleep(500);
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                this.f3895t.add("Invalid URL ".concat(a8));
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final K r() {
        if (this.f3891p && this.f3888m.equals("rebootDevice")) {
            if (!this.f3880c.Q1().booleanValue() || !P.f10240j) {
                FullyActivity fullyActivity = this.f3879b;
                if (C0794w0.j0(fullyActivity, fullyActivity.getPackageName())) {
                    a.b1(this.f3879b, "Rebooting...");
                    ((PowerManager) this.f3879b.getApplicationContext().getSystemService("power")).reboot((String) null);
                    this.f3894s.add("Rebooting the device");
                } else if (C0794w0.Z(this.f3879b) && a.z0()) {
                    this.f3879b.f9958x1.c();
                    new Handler(Looper.getMainLooper()).postDelayed(new x(this, 1), 3000);
                    this.f3894s.add("Rebooting the device");
                } else if (!Z0.f() || !Z0.g()) {
                    this.f3895t.add("Missing device owner, system or root rights to reboot the device");
                } else {
                    try {
                        EnterpriseDeviceManager.getInstance(this.f3879b).getPasswordPolicy().reboot("admin");
                    } catch (SecurityException e) {
                        String str = this.f3878a;
                        Log.w(str, "Failed to reboot due to " + e.getMessage());
                    }
                }
            } else {
                this.f3879b.f9958x1.c();
                new Handler(Looper.getMainLooper()).postDelayed(new x(this, 0), 3000);
                this.f3894s.add("Rebooting the device");
            }
        }
        return null;
    }

    private final K s() {
        if (!this.f3891p || !this.f3888m.equals("refreshTab")) {
            return null;
        }
        this.f3879b.runOnUiThread(new C0143f(12, this));
        this.f3894s.add("Refreshing current tab...");
        try {
            Thread.sleep(500);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final K t() {
        if (!this.f3891p || !this.f3888m.equals("resetWebview")) {
            return null;
        }
        try {
            MyWebView.e(this.f3879b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f3894s.add("Resetting Webview...");
        try {
            Thread.sleep(500);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v53, types: [java.lang.Thread, P5.Q] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:278|(2:282|283)|284|285) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:270|271|272|273|(1:288)(1:289)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:272:0x05b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:284:0x05cc */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A[Catch:{ Exception -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x026d A[Catch:{ Exception -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0276 A[Catch:{ Exception -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278 A[Catch:{ Exception -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05c9 A[SYNTHETIC, Splitter:B:282:0x05c9] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05e2  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:272:0x05b4=Splitter:B:272:0x05b4, B:284:0x05cc=Splitter:B:284:0x05cc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public P5.K a() {
        /*
            r24 = this;
            r7 = r24
            java.lang.String r0 = "Missing or wrong url parameter"
            java.lang.String r1 = "I1"
            java.lang.String r2 = "Failed to find file "
            java.lang.String r3 = "file://"
            java.lang.String r4 = "Download already in progress for this URL"
            java.lang.String r6 = " "
            java.lang.String r11 = "1"
            java.lang.String r12 = "Invalid URL "
            java.lang.String r13 = "tab"
            java.lang.String r14 = "device_policy"
            java.lang.String r15 = "true"
            java.lang.String r10 = " ..."
            java.lang.String r8 = "url"
            r16 = 500(0x1f4, double:2.47E-321)
            r5 = 0
            int r9 = r7.f3898w
            switch(r9) {
                case 0: goto L_0x0949;
                case 1: goto L_0x091e;
                case 2: goto L_0x08f3;
                case 3: goto L_0x0882;
                case 4: goto L_0x0860;
                case 5: goto L_0x0024;
                case 6: goto L_0x0839;
                case 7: goto L_0x0814;
                case 8: goto L_0x07e8;
                case 9: goto L_0x07c3;
                case 10: goto L_0x07a1;
                case 11: goto L_0x0730;
                case 12: goto L_0x070b;
                case 13: goto L_0x0024;
                case 14: goto L_0x06bb;
                case 15: goto L_0x05ec;
                case 16: goto L_0x04d1;
                case 17: goto L_0x04a5;
                case 18: goto L_0x030d;
                case 19: goto L_0x02c0;
                case 20: goto L_0x01d7;
                case 21: goto L_0x01b2;
                case 22: goto L_0x016e;
                case 23: goto L_0x00e9;
                case 24: goto L_0x0070;
                case 25: goto L_0x006b;
                case 26: goto L_0x0038;
                case 27: goto L_0x0033;
                case 28: goto L_0x002e;
                case 29: goto L_0x0029;
                default: goto L_0x0024;
            }
        L_0x0024:
            P5.K r0 = super.a()
            return r0
        L_0x0029:
            P5.K r0 = r24.t()
            return r0
        L_0x002e:
            P5.K r0 = r24.s()
            return r0
        L_0x0033:
            P5.K r0 = r24.r()
            return r0
        L_0x0038:
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "popFragment"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006a
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            P5.f r1 = new P5.f
            r2 = 11
            r1.<init>(r2, r7)
            r0.runOnUiThread(r1)
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            boolean r0 = r0.f10980u0
            if (r0 == 0) goto L_0x0060
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r1 = "Closing all open fragments..."
            r0.add(r1)
            goto L_0x0067
        L_0x0060:
            java.util.ArrayList r0 = r7.f3895t
            java.lang.String r1 = "Can't manage fragments while app is not in foreground or screen off"
            r0.add(r1)
        L_0x0067:
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x006a }
        L_0x006a:
            return r5
        L_0x006b:
            P5.K r0 = r24.q()
            return r0
        L_0x0070:
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "playSound"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e8
            java.util.HashMap r0 = r7.f3884h
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L_0x00e8
            java.util.HashMap r0 = r7.f3884h
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = de.ozerov.fully.P.a(r0)
            java.util.HashMap r1 = r7.f3884h
            java.lang.String r2 = "loop"
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x00ac
            java.util.HashMap r1 = r7.f3884h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00ac
            r8 = 1
            goto L_0x00ad
        L_0x00ac:
            r8 = 0
        L_0x00ad:
            java.util.HashMap r1 = r7.f3884h
            java.lang.String r2 = "stream"
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x00d1
            java.util.HashMap r1 = r7.f3884h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            int r15 = java.lang.Integer.parseInt(r1)
            if (r15 < 0) goto L_0x00c9
            r1 = 10
            if (r15 <= r1) goto L_0x00d2
        L_0x00c9:
            java.util.ArrayList r0 = r7.f3895t
            java.lang.String r1 = "Stream ID 0-10 accepted"
            r0.add(r1)
            goto L_0x00e8
        L_0x00d1:
            r15 = 3
        L_0x00d2:
            de.ozerov.fully.FullyActivity r1 = r7.f3879b
            de.ozerov.fully.Q3 r1 = r1.f9913C0
            r1.c()
            de.ozerov.fully.FullyActivity r1 = r7.f3879b
            de.ozerov.fully.Q3 r1 = r1.f9913C0
            r2 = 0
            r1.a(r0, r8, r2, r15)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r1 = "Playing sound from URL..."
            r0.add(r1)
        L_0x00e8:
            return r5
        L_0x00e9:
            java.lang.String r0 = "Performing click at "
            boolean r1 = r7.f3891p
            if (r1 == 0) goto L_0x016d
            java.lang.String r1 = r7.f3888m
            java.lang.String r2 = "performClick"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x016d
            java.util.HashMap r1 = r7.f3884h
            java.lang.String r2 = "x"
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x016d
            java.util.HashMap r1 = r7.f3884h
            java.lang.String r3 = "y"
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L_0x016d
            boolean r1 = n2.a.z0()
            java.util.ArrayList r4 = r7.f3895t
            if (r1 != 0) goto L_0x011b
            java.lang.String r0 = "Android 7+ is required for this feature"
            r4.add(r0)
            goto L_0x016d
        L_0x011b:
            boolean r1 = de.ozerov.fully.MyAccessibilityService.f10103W
            if (r1 != 0) goto L_0x0125
            java.lang.String r0 = "Accessibility service is not enabled or not connected"
            r4.add(r0)
            goto L_0x016d
        L_0x0125:
            java.util.HashMap r1 = r7.f3884h     // Catch:{ Exception -> 0x0164 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0164 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0164 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ Exception -> 0x0164 }
            java.util.HashMap r2 = r7.f3884h     // Catch:{ Exception -> 0x0164 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0164 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0164 }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ Exception -> 0x0164 }
            de.ozerov.fully.FullyActivity r3 = r7.f3879b     // Catch:{ Exception -> 0x0164 }
            P5.v r6 = new P5.v     // Catch:{ Exception -> 0x0164 }
            r6.<init>(r1, r2)     // Catch:{ Exception -> 0x0164 }
            r3.runOnUiThread(r6)     // Catch:{ Exception -> 0x0164 }
            java.util.ArrayList r3 = r7.f3894s     // Catch:{ Exception -> 0x0164 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0164 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0164 }
            r6.append(r1)     // Catch:{ Exception -> 0x0164 }
            java.lang.String r0 = ","
            r6.append(r0)     // Catch:{ Exception -> 0x0164 }
            r6.append(r2)     // Catch:{ Exception -> 0x0164 }
            r6.append(r10)     // Catch:{ Exception -> 0x0164 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0164 }
            r3.add(r0)     // Catch:{ Exception -> 0x0164 }
            goto L_0x016d
        L_0x0164:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = "Invalid x,y coordinates provided"
            r4.add(r0)
        L_0x016d:
            return r5
        L_0x016e:
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "lockNow"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01b1
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.X(r0)
            if (r0 != 0) goto L_0x019c
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.Y(r0)
            if (r0 != 0) goto L_0x019c
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.Z(r0)
            if (r0 != 0) goto L_0x019c
            java.util.ArrayList r0 = r7.f3895t
            java.lang.String r1 = "Missing admin rights to lock the device"
            r0.add(r1)
            goto L_0x01b1
        L_0x019c:
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            java.lang.Object r0 = r0.getSystemService(r14)
            android.app.admin.DevicePolicyManager r0 = (android.app.admin.DevicePolicyManager) r0
            r0.lockNow()
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r1 = "Locking the device"
            r0.add(r1)
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x01b1 }
        L_0x01b1:
            return r5
        L_0x01b2:
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x01d6
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "lockKiosk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d6
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            P5.f r1 = new P5.f
            r2 = 10
            r1.<init>(r2, r7)
            r0.runOnUiThread(r1)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r1 = "Kiosk Locked"
            r0.add(r1)
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x01d6 }
        L_0x01d6:
            return r5
        L_0x01d7:
            java.util.ArrayList r9 = r7.f3895t
            java.lang.String r0 = "focus"
            java.lang.String r1 = "newtab"
            java.lang.String r14 = "Loading URL "
            boolean r2 = r7.f3891p
            if (r2 == 0) goto L_0x01f8
            java.lang.String r2 = r7.f3888m
            java.lang.String r3 = "loadURL"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01fb
            java.lang.String r2 = r7.f3888m
            java.lang.String r3 = "loadUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01f8
            goto L_0x01fb
        L_0x01f8:
            r13 = r5
            goto L_0x02bf
        L_0x01fb:
            java.util.HashMap r2 = r7.f3884h
            java.lang.Object r2 = r2.get(r8)
            if (r2 == 0) goto L_0x01f8
            java.util.HashMap r2 = r7.f3884h     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r2 = r2.get(r8)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0240 }
            java.lang.String r8 = de.ozerov.fully.P.a(r2)     // Catch:{ Exception -> 0x0240 }
            boolean r2 = de.ozerov.fully.P.I(r8)     // Catch:{ Exception -> 0x0240 }
            if (r2 == 0) goto L_0x02ae
            java.lang.String r2 = "UTF-8"
            java.lang.String r6 = j$.net.URLDecoder.decode(r8, r2)     // Catch:{ Exception -> 0x0240 }
            java.util.HashMap r2 = r7.f3884h     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x0240 }
            if (r2 == 0) goto L_0x0246
            java.util.HashMap r2 = r7.f3884h     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0240 }
            boolean r2 = r2.equals(r11)     // Catch:{ Exception -> 0x0240 }
            if (r2 != 0) goto L_0x0244
            java.util.HashMap r2 = r7.f3884h     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0240 }
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x0240 }
            if (r1 == 0) goto L_0x0246
            goto L_0x0244
        L_0x0240:
            r0 = move-exception
            r13 = r5
            goto L_0x02b7
        L_0x0244:
            r3 = 1
            goto L_0x0247
        L_0x0246:
            r3 = 0
        L_0x0247:
            java.util.HashMap r1 = r7.f3884h     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0240 }
            if (r1 == 0) goto L_0x026d
            java.util.HashMap r1 = r7.f3884h     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0240 }
            boolean r1 = r1.equals(r11)     // Catch:{ Exception -> 0x0240 }
            if (r1 != 0) goto L_0x026b
            java.util.HashMap r1 = r7.f3884h     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0240 }
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x026d
        L_0x026b:
            r4 = 1
            goto L_0x026e
        L_0x026d:
            r4 = 0
        L_0x026e:
            java.util.HashMap r0 = r7.f3884h     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x0240 }
            if (r0 != 0) goto L_0x0278
            r0 = -1
            goto L_0x0284
        L_0x0278:
            java.util.HashMap r0 = r7.f3884h     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0240 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0240 }
        L_0x0284:
            de.ozerov.fully.FullyActivity r11 = r7.f3879b     // Catch:{ Exception -> 0x0240 }
            P5.r r12 = new P5.r     // Catch:{ Exception -> 0x0240 }
            r1 = r12
            r2 = r24
            r13 = r5
            r5 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02ac }
            r11.runOnUiThread(r12)     // Catch:{ Exception -> 0x02ac }
            java.util.ArrayList r0 = r7.f3894s     // Catch:{ Exception -> 0x02ac }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ac }
            r1.<init>(r14)     // Catch:{ Exception -> 0x02ac }
            r1.append(r8)     // Catch:{ Exception -> 0x02ac }
            r1.append(r10)     // Catch:{ Exception -> 0x02ac }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02ac }
            r0.add(r1)     // Catch:{ Exception -> 0x02ac }
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x02bf }
            goto L_0x02bf
        L_0x02ac:
            r0 = move-exception
            goto L_0x02b7
        L_0x02ae:
            r13 = r5
            java.lang.String r0 = r12.concat(r8)     // Catch:{ Exception -> 0x02ac }
            r9.add(r0)     // Catch:{ Exception -> 0x02ac }
            goto L_0x02bf
        L_0x02b7:
            r0.printStackTrace()
            java.lang.String r0 = "Invalid params"
            r9.add(r0)
        L_0x02bf:
            return r13
        L_0x02c0:
            r13 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x030c
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "loadStartURL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02d9
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "loadStartUrl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x030c
        L_0x02d9:
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            P5.f r1 = new P5.f
            r2 = 9
            r1.<init>(r2, r7)
            r0.runOnUiThread(r1)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Loading Start URL "
            r1.<init>(r2)
            de.ozerov.fully.FullyActivity r2 = r7.f3879b
            d4.k r2 = r2.f9961z0
            java.lang.String r2 = r2.h2()
            java.lang.String r3 = "\n"
            java.lang.String r2 = r2.replace(r3, r6)
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x030c }
        L_0x030c:
            return r13
        L_0x030d:
            r13 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x04a4
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "loadApkFile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04a4
            java.util.HashMap r0 = r7.f3884h
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L_0x04a4
            java.util.HashMap r0 = r7.f3884h
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r1 = r7.f3884h
            java.lang.String r2 = "timeFrame"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "c"
            if (r1 == 0) goto L_0x0344
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x033f }
            goto L_0x0345
        L_0x033f:
            java.lang.String r1 = "Failed to parse timeFrame"
            android.util.Log.e(r2, r1)
        L_0x0344:
            r1 = 0
        L_0x0345:
            java.util.HashMap r3 = r7.f3884h
            java.lang.String r5 = "forceInstall"
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x035f
            boolean r5 = r3.equals(r15)
            if (r5 != 0) goto L_0x035d
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x035f
        L_0x035d:
            r3 = 1
            goto L_0x0360
        L_0x035f:
            r3 = 0
        L_0x0360:
            double r5 = java.lang.Math.random()
            double r8 = (double) r1
            double r5 = r5 * r8
            int r1 = (int) r5
            boolean r5 = de.ozerov.fully.P.I(r0)
            java.util.ArrayList r6 = r7.f3895t
            if (r5 != 0) goto L_0x037b
            java.lang.String r1 = "Invalid APK URL "
            java.lang.String r0 = r1.concat(r0)
            r6.add(r0)
            goto L_0x04a4
        L_0x037b:
            java.lang.String r5 = "file:"
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L_0x038a
            java.lang.String r0 = "file: URL not supported here"
            r6.add(r0)
            goto L_0x04a4
        L_0x038a:
            if (r1 != 0) goto L_0x03e5
            r20 = 0
            r21 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r18 = r0
            de.ozerov.fully.x2 r5 = de.ozerov.fully.C0808y2.a(r18, r19, r20, r21, r22, r23)
            int r8 = r5.f11070b
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 == r9) goto L_0x03ac
            java.lang.String r5 = "URL not found or not APK file "
            java.lang.String r5 = r5.concat(r0)
            r6.add(r5)
            goto L_0x03e5
        L_0x03ac:
            java.lang.String r8 = r5.e
            java.lang.String r9 = "application/vnd.android.package-archive"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x03e5
            java.lang.String r8 = r5.e
            java.lang.String r9 = "application/binary"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x03e5
            java.lang.String r5 = r5.e
            java.lang.String r8 = "application/octet-stream"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x03e5
            de.ozerov.fully.FullyActivity r5 = r7.f3879b
            android.net.Uri r8 = android.net.Uri.parse(r0)
            java.lang.String r5 = de.ozerov.fully.C0808y2.e(r5, r8)
            java.lang.String r8 = "apk"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x03e5
            java.lang.String r5 = "URL is not APK file "
            java.lang.String r5 = r5.concat(r0)
            r6.add(r5)
        L_0x03e5:
            de.ozerov.fully.FullyActivity r5 = r7.f3879b
            boolean r5 = n2.a.h0(r5)
            if (r5 != 0) goto L_0x03fe
            boolean r5 = n2.a.u0()
            if (r5 == 0) goto L_0x03fe
            java.lang.String r4 = "Missing runtime permissions to write files"
            android.util.Log.e(r2, r4)
            java.lang.String r2 = "Missing runtime permissions to store APK file"
            r6.add(r2)
            goto L_0x0444
        L_0x03fe:
            boolean r5 = de.ozerov.fully.P.B()
            if (r5 != 0) goto L_0x0413
            boolean r5 = n2.a.u0()
            if (r5 == 0) goto L_0x0413
            java.lang.String r4 = "External storage is not writable"
            android.util.Log.e(r2, r4)
            r6.add(r4)
            goto L_0x0444
        L_0x0413:
            de.ozerov.fully.FullyActivity r5 = r7.f3879b
            boolean r5 = de.ozerov.fully.C0794w0.Z(r5)
            if (r5 == 0) goto L_0x0433
            d4.k r5 = r7.f3880c
            java.lang.String r8 = "mdmDisableAppsFromUnknownSources"
            java.lang.Object r5 = r5.f9767W
            Z1.c r5 = (Z1.c) r5
            r9 = 1
            boolean r5 = r5.n(r8, r9)
            if (r5 == 0) goto L_0x0433
            java.lang.String r4 = "Installing APK files is disabled by Device Owner"
            android.util.Log.e(r2, r4)
            r6.add(r4)
            goto L_0x0444
        L_0x0433:
            java.util.ArrayList r5 = de.ozerov.fully.C0808y2.f11115a     // Catch:{ Exception -> 0x043a }
            boolean r5 = r5.contains(r0)     // Catch:{ Exception -> 0x043a }
            goto L_0x043c
        L_0x043a:
            r5 = 0
        L_0x043c:
            if (r5 == 0) goto L_0x0444
            android.util.Log.e(r2, r4)
            r6.add(r4)
        L_0x0444:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x04a4
            P5.Q r2 = new P5.Q
            de.ozerov.fully.FullyActivity r4 = r7.f3879b
            android.content.Context r4 = r4.getApplicationContext()
            r2.<init>()
            r2.f3870U = r4
            r2.f3871V = r0
            r2.f3872W = r1
            r2.f3873X = r3
            java.lang.String r3 = "ThreadLoadApkFile"
            r2.setName(r3)
            r2.start()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Loading and starting install "
            r2.<init>(r3)
            r2.append(r0)
            if (r1 <= 0) goto L_0x047a
            java.lang.String r0 = " (after "
            java.lang.String r3 = " seconds)."
            java.lang.String r0 = u.C1477r.c(r1, r0, r3)
            goto L_0x047c
        L_0x047a:
            java.lang.String r0 = "."
        L_0x047c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            de.ozerov.fully.FullyActivity r1 = r7.f3879b
            boolean r1 = de.ozerov.fully.C0794w0.Z(r1)
            if (r1 != 0) goto L_0x0499
            de.ozerov.fully.FullyActivity r1 = r7.f3879b
            boolean r1 = de.ozerov.fully.P.A(r1)
            if (r1 != 0) goto L_0x0499
            java.lang.String r1 = " User input on the device is required to confirm the installation."
            java.lang.String r0 = N.e.x(r0, r1)
        L_0x0499:
            java.lang.String r1 = " Watch log for results ..."
            java.lang.String r0 = N.e.x(r0, r1)
            java.util.ArrayList r1 = r7.f3894s
            r1.add(r0)
        L_0x04a4:
            return r13
        L_0x04a5:
            r13 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x04d0
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "killMyProcess"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04d0
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r1 = "Killing my process..."
            r0.add(r1)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            P5.f r1 = new P5.f
            r2 = 8
            r1.<init>(r2, r7)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
        L_0x04d0:
            return r13
        L_0x04d1:
            r13 = r5
            boolean r5 = r7.f3891p
            if (r5 == 0) goto L_0x05eb
            java.lang.String r5 = r7.f3888m
            java.lang.String r9 = "installUserCa"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x05eb
            de.ozerov.fully.FullyActivity r5 = r7.f3879b
            boolean r5 = de.ozerov.fully.C0794w0.Z(r5)
            java.util.ArrayList r9 = r7.f3895t
            java.lang.String r10 = "Provisioned device required for installing user certificate"
            if (r5 != 0) goto L_0x04f1
            r9.add(r10)
            goto L_0x05eb
        L_0x04f1:
            java.util.HashMap r5 = r7.f3884h
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x05e8
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x0503
            goto L_0x05e8
        L_0x0503:
            boolean r0 = de.ozerov.fully.P.I(r5)
            if (r0 != 0) goto L_0x0512
            java.lang.String r0 = r12.concat(r5)
            r9.add(r0)
            goto L_0x05eb
        L_0x0512:
            boolean r0 = r5.startsWith(r3)
            if (r0 == 0) goto L_0x0534
            java.io.File r0 = new java.io.File
            android.net.Uri r3 = android.net.Uri.parse(r5)
            java.lang.String r3 = r3.getPath()
            r0.<init>(r3)
            boolean r3 = r0.isFile()
            if (r3 != 0) goto L_0x057c
            java.lang.String r0 = r2.concat(r5)
            r9.add(r0)
            goto L_0x05eb
        L_0x0534:
            java.util.ArrayList r0 = de.ozerov.fully.C0808y2.f11115a     // Catch:{ Exception -> 0x053b }
            boolean r2 = r0.contains(r5)     // Catch:{ Exception -> 0x053b }
            goto L_0x053d
        L_0x053b:
            r2 = 0
        L_0x053d:
            if (r2 == 0) goto L_0x0544
            r9.add(r4)
            goto L_0x05eb
        L_0x0544:
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            java.io.File r0 = n2.a.c0(r0, r13)
            de.ozerov.fully.FullyActivity r2 = r7.f3879b
            de.ozerov.fully.x2 r2 = de.ozerov.fully.C0808y2.b(r2, r0, r5)
            int r3 = r2.f11070b
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == r4) goto L_0x0574
            java.lang.String r0 = "Failed to download file from "
            java.lang.String r1 = "due to "
            java.lang.StringBuilder r0 = Q0.g.s(r0, r5, r1)
            int r1 = r2.f11070b
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = r2.f11074g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.add(r0)
            goto L_0x05eb
        L_0x0574:
            java.io.File r3 = new java.io.File
            java.lang.String r2 = r2.f11071c
            r3.<init>(r0, r2)
            r0 = r3
        L_0x057c:
            de.ozerov.fully.FullyActivity r2 = r7.f3879b
            java.util.ArrayList r3 = de.ozerov.fully.I1.f10008a
            boolean r3 = de.ozerov.fully.C0794w0.Z(r2)
            if (r3 != 0) goto L_0x058b
            android.util.Log.w(r1, r10)
        L_0x0589:
            r5 = 0
            goto L_0x05d8
        L_0x058b:
            java.lang.Object r3 = r2.getSystemService(r14)
            android.app.admin.DevicePolicyManager r3 = (android.app.admin.DevicePolicyManager) r3
            android.content.ComponentName r2 = de.ozerov.fully.DeviceOwnerReceiver.a(r2)
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x05b9 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x05b9 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x05b9 }
            long r5 = r4.length()     // Catch:{ Exception -> 0x05b9 }
            int r0 = (int) r5     // Catch:{ Exception -> 0x05b9 }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x05b9 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x05c5 }
            r5.<init>(r4)     // Catch:{ all -> 0x05c5 }
            int r4 = r5.read(r0)     // Catch:{ all -> 0x05c3 }
            r6 = -1
            if (r4 == r6) goto L_0x05bb
            r5.close()     // Catch:{ IOException -> 0x05b4 }
        L_0x05b4:
            boolean r5 = r3.installCaCert(r2, r0)     // Catch:{ Exception -> 0x05b9 }
            goto L_0x05d8
        L_0x05b9:
            r0 = move-exception
            goto L_0x05cd
        L_0x05bb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x05c3 }
            java.lang.String r2 = "EOF reached while trying to read the whole file"
            r0.<init>(r2)     // Catch:{ all -> 0x05c3 }
            throw r0     // Catch:{ all -> 0x05c3 }
        L_0x05c3:
            r0 = move-exception
            goto L_0x05c7
        L_0x05c5:
            r0 = move-exception
            r5 = r13
        L_0x05c7:
            if (r5 == 0) goto L_0x05cc
            r5.close()     // Catch:{ IOException -> 0x05cc }
        L_0x05cc:
            throw r0     // Catch:{ Exception -> 0x05b9 }
        L_0x05cd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to get ca data due to "
            r2.<init>(r3)
            Q0.g.x(r0, r2, r1)
            goto L_0x0589
        L_0x05d8:
            if (r5 == 0) goto L_0x05e2
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r1 = "Installing user certificate"
            r0.add(r1)
            goto L_0x05eb
        L_0x05e2:
            java.lang.String r0 = "Failed to install user certificate, is it a valid CA file?"
            r9.add(r0)
            goto L_0x05eb
        L_0x05e8:
            r9.add(r0)
        L_0x05eb:
            return r13
        L_0x05ec:
            r13 = r5
            boolean r4 = r7.f3891p
            if (r4 == 0) goto L_0x06ba
            java.lang.String r4 = r7.f3888m
            java.lang.String r5 = "installSystemUpdate"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x06ba
            de.ozerov.fully.FullyActivity r4 = r7.f3879b
            boolean r4 = de.ozerov.fully.C0794w0.Z(r4)
            java.util.ArrayList r5 = r7.f3895t
            java.lang.String r6 = "Android 10+ and provisioned device required for system update"
            if (r4 == 0) goto L_0x06b7
            boolean r4 = n2.a.p0()
            if (r4 != 0) goto L_0x060f
            goto L_0x06b7
        L_0x060f:
            java.util.HashMap r4 = r7.f3884h
            java.lang.Object r4 = r4.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x06b3
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L_0x0621
            goto L_0x06b3
        L_0x0621:
            boolean r0 = de.ozerov.fully.P.I(r4)
            if (r0 != 0) goto L_0x0630
            java.lang.String r0 = r12.concat(r4)
            r5.add(r0)
            goto L_0x06ba
        L_0x0630:
            boolean r0 = r4.startsWith(r3)
            if (r0 == 0) goto L_0x06ad
            java.io.File r0 = new java.io.File
            android.net.Uri r3 = android.net.Uri.parse(r4)
            java.lang.String r3 = r3.getPath()
            r0.<init>(r3)
            boolean r3 = r0.isFile()
            if (r3 != 0) goto L_0x0651
            java.lang.String r0 = r2.concat(r4)
            r5.add(r0)
            goto L_0x06ba
        L_0x0651:
            de.ozerov.fully.FullyActivity r2 = r7.f3879b
            java.lang.String r3 = r0.getAbsolutePath()
            java.util.ArrayList r0 = de.ozerov.fully.I1.f10008a
            boolean r0 = de.ozerov.fully.C0794w0.Z(r2)
            if (r0 == 0) goto L_0x06a2
            boolean r0 = n2.a.p0()
            if (r0 != 0) goto L_0x0666
            goto L_0x06a2
        L_0x0666:
            java.lang.Object r0 = r2.getSystemService(r14)
            android.app.admin.DevicePolicyManager r0 = (android.app.admin.DevicePolicyManager) r0
            android.content.ComponentName r4 = de.ozerov.fully.DeviceOwnerReceiver.a(r2)
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0686 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0686 }
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch:{ Exception -> 0x0686 }
            java.util.concurrent.Executor r2 = r2.getMainExecutor()     // Catch:{ Exception -> 0x0686 }
            de.ozerov.fully.H1 r6 = new de.ozerov.fully.H1     // Catch:{ Exception -> 0x0686 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0686 }
            r0.installSystemUpdate(r4, r5, r2, r6)     // Catch:{ Exception -> 0x0686 }
            goto L_0x06a5
        L_0x0686:
            r0 = move-exception
            java.lang.String r2 = "System update failed for "
            java.lang.String r4 = " due to "
            java.lang.StringBuilder r2 = Q0.g.s(r2, r3, r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r1, r0)
            r2 = 1
            de.ozerov.fully.C0794w0.q0(r2, r1, r0)
            goto L_0x06a5
        L_0x06a2:
            android.util.Log.w(r1, r6)
        L_0x06a5:
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r1 = "Start installing update. Device will reboot or watch log for errors..."
            r0.add(r1)
            goto L_0x06ba
        L_0x06ad:
            java.lang.String r0 = "You can currenly only use file:// URLs. Please download file first"
            r5.add(r0)
            goto L_0x06ba
        L_0x06b3:
            r5.add(r0)
            goto L_0x06ba
        L_0x06b7:
            r5.add(r6)
        L_0x06ba:
            return r13
        L_0x06bb:
            r13 = r5
            r2 = 1
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x070a
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "getPermissions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x070a
            java.util.HashMap r0 = r7.f3884h
            java.lang.String r1 = "dialog"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x06e5
            java.util.HashMap r0 = r7.f3884h
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x06e5
            r8 = 1
            goto L_0x06e6
        L_0x06e5:
            r8 = 0
        L_0x06e6:
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            B.j0 r0 = r0.f9933V0
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0703
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            A.b r1 = new A.b
            r2 = 2
            r1.<init>(r7, r8, r2)
            r0.runOnUiThread(r1)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r1 = "Opened permission dialog on the device..."
            r0.add(r1)
            goto L_0x070a
        L_0x0703:
            java.util.ArrayList r0 = r7.f3895t
            java.lang.String r1 = "There are no runtime permissions missing"
            r0.add(r1)
        L_0x070a:
            return r13
        L_0x070b:
            r13 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x072f
            java.lang.String r0 = r7.f3888m
            java.lang.String r1 = "forceSleep"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x072f
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            P5.f r1 = new P5.f
            r2 = 5
            r1.<init>(r2, r7)
            r0.runOnUiThread(r1)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r1 = "Sleep forced"
            r0.add(r1)
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x072f }
        L_0x072f:
            return r13
        L_0x0730:
            r1 = r5
            java.util.ArrayList r2 = r7.f3895t
            java.lang.String r0 = "Not found tab #"
            java.lang.String r3 = "Focusing tab #"
            boolean r4 = r7.f3891p
            if (r4 == 0) goto L_0x07a0
            java.lang.String r4 = r7.f3888m
            java.lang.String r5 = "focusTab"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x07a0
            java.util.HashMap r4 = r7.f3884h
            java.lang.Object r4 = r4.get(r13)
            if (r4 == 0) goto L_0x07a0
            java.util.HashMap r4 = r7.f3884h     // Catch:{ Exception -> 0x0786 }
            java.lang.Object r4 = r4.get(r13)     // Catch:{ Exception -> 0x0786 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0786 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0786 }
            de.ozerov.fully.FullyActivity r5 = r7.f3879b     // Catch:{ Exception -> 0x0786 }
            de.ozerov.fully.i5 r5 = r5.f9917F0     // Catch:{ Exception -> 0x0786 }
            de.ozerov.fully.g5 r5 = r5.l(r4)     // Catch:{ Exception -> 0x0786 }
            if (r5 == 0) goto L_0x0788
            de.ozerov.fully.FullyActivity r0 = r7.f3879b     // Catch:{ Exception -> 0x0786 }
            A3.c r5 = new A3.c     // Catch:{ Exception -> 0x0786 }
            r6 = 3
            r5.<init>((int) r4, (int) r6, (java.lang.Object) r7)     // Catch:{ Exception -> 0x0786 }
            r0.runOnUiThread(r5)     // Catch:{ Exception -> 0x0786 }
            java.util.ArrayList r0 = r7.f3894s     // Catch:{ Exception -> 0x0786 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0786 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0786 }
            r5.append(r4)     // Catch:{ Exception -> 0x0786 }
            r5.append(r10)     // Catch:{ Exception -> 0x0786 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0786 }
            r0.add(r3)     // Catch:{ Exception -> 0x0786 }
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x07a0 }
            goto L_0x07a0
        L_0x0786:
            r0 = move-exception
            goto L_0x0798
        L_0x0788:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0786 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0786 }
            r3.append(r4)     // Catch:{ Exception -> 0x0786 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0786 }
            r2.add(r0)     // Catch:{ Exception -> 0x0786 }
            goto L_0x07a0
        L_0x0798:
            r0.printStackTrace()
            java.lang.String r0 = "Invalid tab index"
            r2.add(r0)
        L_0x07a0:
            return r1
        L_0x07a1:
            r1 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x07c2
            java.lang.String r0 = r7.f3888m
            java.lang.String r2 = "exitApp"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x07c2
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            P5.f r2 = new P5.f
            r3 = 4
            r2.<init>(r3, r7)
            r0.runOnUiThread(r2)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r2 = "App terminated"
            r0.add(r2)
        L_0x07c2:
            return r1
        L_0x07c3:
            r1 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x07e7
            java.lang.String r0 = r7.f3888m
            java.lang.String r2 = "enableLockedMode"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x07e7
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            P5.f r2 = new P5.f
            r3 = 3
            r2.<init>(r3, r7)
            r0.runOnUiThread(r2)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r2 = "Device locked for maintenance"
            r0.add(r2)
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x07e7 }
        L_0x07e7:
            return r1
        L_0x07e8:
            r1 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x0813
            java.lang.String r0 = r7.f3888m
            java.lang.String r2 = "enableHotspot"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0813
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            P5.i r2 = new P5.i
            r2.<init>(r7)
            boolean r0 = de.ozerov.fully.P.f(r0, r2)
            if (r0 == 0) goto L_0x080c
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r2 = "Hotspot enabled"
            r0.add(r2)
            goto L_0x0813
        L_0x080c:
            java.util.ArrayList r0 = r7.f3895t
            java.lang.String r2 = "Failed to start hotspot"
            r0.add(r2)
        L_0x0813:
            return r1
        L_0x0814:
            r1 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x0838
            java.lang.String r0 = r7.f3888m
            java.lang.String r2 = "disableLockedMode"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0838
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            P5.f r2 = new P5.f
            r3 = 2
            r2.<init>(r3, r7)
            r0.runOnUiThread(r2)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r2 = "Device unlocked from maintenance"
            r0.add(r2)
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x0838 }
        L_0x0838:
            return r1
        L_0x0839:
            r1 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x085f
            java.lang.String r0 = r7.f3888m
            java.lang.String r2 = "disableHotspot"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x085f
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            boolean r0 = de.ozerov.fully.P.d(r0)
            if (r0 == 0) goto L_0x0858
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r2 = "Hotspot disabled"
            r0.add(r2)
            goto L_0x085f
        L_0x0858:
            java.util.ArrayList r0 = r7.f3895t
            java.lang.String r2 = "Failed to disable hotspot"
            r0.add(r2)
        L_0x085f:
            return r1
        L_0x0860:
            r1 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x0881
            java.lang.String r0 = r7.f3888m
            java.lang.String r2 = "crashMe"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0881
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            P5.f r2 = new P5.f
            r3 = 0
            r2.<init>(r3, r7)
            r0.runOnUiThread(r2)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r2 = "Crashing..."
            r0.add(r2)
        L_0x0881:
            return r1
        L_0x0882:
            r1 = r5
            java.util.ArrayList r2 = r7.f3895t
            java.lang.String r0 = "Not found tab #"
            java.lang.String r3 = "Closing tab #"
            boolean r4 = r7.f3891p
            if (r4 == 0) goto L_0x08f2
            java.lang.String r4 = r7.f3888m
            java.lang.String r5 = "closeTab"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x08f2
            java.util.HashMap r4 = r7.f3884h
            java.lang.Object r4 = r4.get(r13)
            if (r4 == 0) goto L_0x08f2
            java.util.HashMap r4 = r7.f3884h     // Catch:{ Exception -> 0x08d8 }
            java.lang.Object r4 = r4.get(r13)     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x08d8 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x08d8 }
            de.ozerov.fully.FullyActivity r5 = r7.f3879b     // Catch:{ Exception -> 0x08d8 }
            de.ozerov.fully.i5 r5 = r5.f9917F0     // Catch:{ Exception -> 0x08d8 }
            de.ozerov.fully.g5 r5 = r5.l(r4)     // Catch:{ Exception -> 0x08d8 }
            if (r5 == 0) goto L_0x08da
            de.ozerov.fully.FullyActivity r0 = r7.f3879b     // Catch:{ Exception -> 0x08d8 }
            A3.c r5 = new A3.c     // Catch:{ Exception -> 0x08d8 }
            r6 = 2
            r5.<init>((int) r4, (int) r6, (java.lang.Object) r7)     // Catch:{ Exception -> 0x08d8 }
            r0.runOnUiThread(r5)     // Catch:{ Exception -> 0x08d8 }
            java.util.ArrayList r0 = r7.f3894s     // Catch:{ Exception -> 0x08d8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08d8 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x08d8 }
            r5.append(r4)     // Catch:{ Exception -> 0x08d8 }
            r5.append(r10)     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x08d8 }
            r0.add(r3)     // Catch:{ Exception -> 0x08d8 }
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x08f2 }
            goto L_0x08f2
        L_0x08d8:
            r0 = move-exception
            goto L_0x08ea
        L_0x08da:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08d8 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x08d8 }
            r3.append(r4)     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x08d8 }
            r2.add(r0)     // Catch:{ Exception -> 0x08d8 }
            goto L_0x08f2
        L_0x08ea:
            r0.printStackTrace()
            java.lang.String r0 = "Invalid tab index"
            r2.add(r0)
        L_0x08f2:
            return r1
        L_0x08f3:
            r1 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x091d
            java.lang.String r0 = r7.f3888m
            java.lang.String r2 = "clearWebstorage"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x091d
            android.webkit.WebStorage r0 = android.webkit.WebStorage.getInstance()     // Catch:{ Exception -> 0x090a }
            r0.deleteAllData()     // Catch:{ Exception -> 0x090a }
            goto L_0x090e
        L_0x090a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x090e:
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r2 = "Clearing Webstorage..."
            r0.add(r2)
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            de.ozerov.fully.P.Q(r0)
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x091d }
        L_0x091d:
            return r1
        L_0x091e:
            r1 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x0948
            java.lang.String r0 = r7.f3888m
            java.lang.String r2 = "clearCookies"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0948
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            A.d r2 = new A.d
            r3 = 29
            r2.<init>(r3, r7)
            r0.runOnUiThread(r2)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r2 = "Clearing cookies..."
            r0.add(r2)
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            de.ozerov.fully.P.Q(r0)
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x0948 }
        L_0x0948:
            return r1
        L_0x0949:
            r1 = r5
            boolean r0 = r7.f3891p
            if (r0 == 0) goto L_0x0973
            java.lang.String r0 = r7.f3888m
            java.lang.String r2 = "clearCache"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0973
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            A.d r2 = new A.d
            r3 = 28
            r2.<init>(r3, r7)
            r0.runOnUiThread(r2)
            java.util.ArrayList r0 = r7.f3894s
            java.lang.String r2 = "Clearing cache..."
            r0.add(r2)
            de.ozerov.fully.FullyActivity r0 = r7.f3879b
            de.ozerov.fully.P.Q(r0)
            java.lang.Thread.sleep(r16)     // Catch:{ Exception -> 0x0973 }
        L_0x0973:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0140c.a():P5.K");
    }

    public String d() {
        switch (this.f3898w) {
            case 5:
                if (!this.f3891p) {
                    return C0138a.e("Please login");
                }
                JSONObject j7 = P.j(this.f3879b);
                a.b(j7, this.f3879b.E());
                if (this.f3888m.equals("deviceInfo")) {
                    a.T0(j7, "deviceId", "deviceID");
                    a.T0(j7, "latitude", "locationLatitude");
                    a.T0(j7, "longitude", "locationLongitude");
                    a.T0(j7, "latitude", "locationLatitude");
                    a.T0(j7, "versionCode", "appVersionCode");
                    a.T0(j7, "version", "appVersionName");
                    a.T0(j7, "SDK", "androidSdk");
                    a.T0(j7, "model", "deviceModel");
                    a.T0(j7, "manufacturer", "deviceManufacturer");
                    a.T0(j7, "foreground", "foregroundApp");
                    a.T0(j7, "currentPageUrl", "currentPage");
                    a.T0(j7, "appStartTime", "lastAppStart");
                }
                try {
                    if (((c) this.f3880c.f9767W).n("environmentSensorsEnabled", false)) {
                        j7.put("sensorInfo", this.f3879b.f9937Z0.a());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (this.f3888m.equals("deviceInfo")) {
                    return j7.toString().replace("\\/", "/");
                }
                try {
                    return j7.toString(2).replace("\\/", "/");
                } catch (Exception unused) {
                    return "";
                }
            case 13:
                if (!this.f3891p) {
                    return C0138a.e("Please login");
                }
                if (!this.f3888m.equals("getInstallApkState")) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", C0752p.f10878c);
                    jSONObject.put("url", C0752p.f10877b);
                    return jSONObject.toString().replace("\\/", "/");
                } catch (Exception e8) {
                    return C0138a.e(e8.getMessage());
                }
            default:
                return super.d();
        }
    }

    public boolean u(String str) {
        String str2 = (String) this.f3884h.get(str);
        if (str2 == null) {
            return false;
        }
        if (str2.equalsIgnoreCase("1") || str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("on")) {
            return true;
        }
        if (!str2.equalsIgnoreCase("0") && !str2.equalsIgnoreCase("false")) {
            str2.equalsIgnoreCase("off");
        }
        return false;
    }
}
