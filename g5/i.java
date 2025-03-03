package G5;

import D2.G;
import Q3.f;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import de.ozerov.fully.r;
import org.altbeacon.beacon.BeaconManager;

public final class i {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f1696n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f1697a;

    /* renamed from: b  reason: collision with root package name */
    public final DecoratedBarcodeView f1698b;

    /* renamed from: c  reason: collision with root package name */
    public int f1699c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1700d = false;
    public boolean e = true;

    /* renamed from: f  reason: collision with root package name */
    public String f1701f = "";

    /* renamed from: g  reason: collision with root package name */
    public boolean f1702g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f1703h;
    public final G i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f1704j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1705k = false;

    /* renamed from: l  reason: collision with root package name */
    public final A.f f1706l = new A.f(24, (Object) this);

    /* renamed from: m  reason: collision with root package name */
    public boolean f1707m;

    /* JADX WARNING: type inference failed for: r5v5, types: [D2.G, java.lang.Object] */
    public i(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        e eVar = new e(1, this);
        this.f1707m = false;
        this.f1697a = activity;
        this.f1698b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f1677g0.add(eVar);
        this.f1704j = new Handler();
        this.f1703h = new f(activity, new g(this, 0));
        ? obj = new Object();
        obj.f1051U = true;
        activity.setVolumeControlStream(3);
        obj.f1052V = activity.getApplicationContext();
        this.i = obj;
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.f1698b;
        H5.f fVar = decoratedBarcodeView.getBarcodeView().f1668U;
        if (fVar == null || fVar.f2181g) {
            this.f1697a.finish();
        } else {
            this.f1705k = true;
        }
        decoratedBarcodeView.f9522U.g();
        this.f1703h.b();
    }

    public final void b(String str) {
        Activity activity = this.f1697a;
        if (!activity.isFinishing() && !this.f1702g && !this.f1705k) {
            if (str.isEmpty()) {
                str = activity.getString(2131951974);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(activity.getString(2131951971));
            builder.setMessage(str);
            builder.setPositiveButton(2131951973, new r(2, this));
            builder.setOnCancelListener(new h(0, this));
            builder.show();
        }
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.Object, M3.g] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r4 = 1
            android.app.Activity r5 = r0.f1697a
            android.view.Window r6 = r5.getWindow()
            r7 = 128(0x80, float:1.794E-43)
            r6.addFlags(r7)
            r6 = -1
            if (r2 == 0) goto L_0x001d
            java.lang.String r7 = "SAVED_ORIENTATION_LOCK"
            int r2 = r2.getInt(r7, r6)
            r0.f1699c = r2
        L_0x001d:
            if (r1 == 0) goto L_0x01ed
            java.lang.String r2 = "SCAN_ORIENTATION_LOCKED"
            boolean r2 = r1.getBooleanExtra(r2, r4)
            if (r2 == 0) goto L_0x0061
            int r2 = r0.f1699c
            if (r2 != r6) goto L_0x005c
            android.view.WindowManager r2 = r5.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            int r2 = r2.getRotation()
            android.content.res.Resources r7 = r5.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 != r8) goto L_0x004e
            if (r2 == 0) goto L_0x004c
            if (r2 != r4) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r2 = 8
            goto L_0x005a
        L_0x004c:
            r2 = 0
            goto L_0x005a
        L_0x004e:
            if (r7 != r4) goto L_0x004c
            if (r2 == 0) goto L_0x0059
            r7 = 3
            if (r2 != r7) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r2 = 9
            goto L_0x005a
        L_0x0059:
            r2 = 1
        L_0x005a:
            r0.f1699c = r2
        L_0x005c:
            int r2 = r0.f1699c
            r5.setRequestedOrientation(r2)
        L_0x0061:
            java.lang.String r2 = "com.google.zxing.client.android.SCAN"
            java.lang.String r5 = r17.getAction()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01a2
            com.journeyapps.barcodescanner.DecoratedBarcodeView r2 = r0.f1698b
            r2.getClass()
            java.util.regex.Pattern r5 = Q3.d.f4109a
            java.lang.String r5 = "SCAN_FORMATS"
            java.lang.String r5 = r1.getStringExtra(r5)
            r7 = 0
            if (r5 == 0) goto L_0x0088
            java.util.regex.Pattern r8 = Q3.d.f4109a
            java.lang.String[] r5 = r8.split(r5)
            java.util.List r5 = java.util.Arrays.asList(r5)
            goto L_0x0089
        L_0x0088:
            r5 = r7
        L_0x0089:
            java.lang.String r8 = "SCAN_MODE"
            java.lang.String r8 = r1.getStringExtra(r8)
            if (r5 == 0) goto L_0x00b0
            java.lang.Class<M3.a> r9 = M3.a.class
            java.util.EnumSet r9 = java.util.EnumSet.noneOf(r9)
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IllegalArgumentException -> 0x00af }
        L_0x009b:
            boolean r10 = r5.hasNext()     // Catch:{ IllegalArgumentException -> 0x00af }
            if (r10 == 0) goto L_0x00bd
            java.lang.Object r10 = r5.next()     // Catch:{ IllegalArgumentException -> 0x00af }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IllegalArgumentException -> 0x00af }
            M3.a r10 = M3.a.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00af }
            r9.add(r10)     // Catch:{ IllegalArgumentException -> 0x00af }
            goto L_0x009b
        L_0x00af:
        L_0x00b0:
            if (r8 == 0) goto L_0x00bc
            java.util.HashMap r5 = Q3.d.f4110b
            java.lang.Object r5 = r5.get(r8)
            r9 = r5
            java.util.Set r9 = (java.util.Set) r9
            goto L_0x00bd
        L_0x00bc:
            r9 = r7
        L_0x00bd:
            int r5 = Q3.e.f4111a
            android.os.Bundle r5 = r17.getExtras()
            if (r5 == 0) goto L_0x0141
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x00cd
            goto L_0x0141
        L_0x00cd:
            java.util.EnumMap r7 = new java.util.EnumMap
            java.lang.Class<M3.c> r8 = M3.c.class
            r7.<init>(r8)
            M3.c[] r8 = M3.c.values()
            int r10 = r8.length
            r11 = 0
        L_0x00da:
            java.lang.String r12 = "e"
            if (r11 >= r10) goto L_0x0130
            r13 = r8[r11]
            M3.c r14 = M3.c.f3128Y
            if (r13 == r14) goto L_0x012e
            M3.c r14 = M3.c.f3133d0
            if (r13 == r14) goto L_0x012e
            M3.c r14 = M3.c.f3126W
            if (r13 != r14) goto L_0x00ed
            goto L_0x012e
        L_0x00ed:
            java.lang.String r14 = r13.name()
            boolean r15 = r5.containsKey(r14)
            if (r15 == 0) goto L_0x012e
            java.lang.Class r15 = r13.f3136U
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x0107
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r7.put(r13, r3)
            goto L_0x012e
        L_0x0107:
            java.lang.Object r3 = r5.get(r14)
            boolean r14 = r15.isInstance(r3)
            if (r14 == 0) goto L_0x0115
            r7.put(r13, r3)
            goto L_0x012e
        L_0x0115:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Ignoring hint "
            r14.<init>(r15)
            r14.append(r13)
            java.lang.String r13 = " because it is not assignable from "
            r14.append(r13)
            r14.append(r3)
            java.lang.String r3 = r14.toString()
            android.util.Log.w(r12, r3)
        L_0x012e:
            int r11 = r11 + r4
            goto L_0x00da
        L_0x0130:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Hints from the Intent: "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r12, r3)
        L_0x0141:
            H5.i r3 = new H5.i
            r3.<init>()
            java.lang.String r5 = "SCAN_CAMERA_ID"
            boolean r8 = r1.hasExtra(r5)
            if (r8 == 0) goto L_0x0156
            int r5 = r1.getIntExtra(r5, r6)
            if (r5 < 0) goto L_0x0156
            r3.f2200a = r5
        L_0x0156:
            java.lang.String r5 = "TORCH_ENABLED"
            boolean r6 = r1.hasExtra(r5)
            if (r6 == 0) goto L_0x016a
            r6 = 0
            boolean r5 = r1.getBooleanExtra(r5, r6)
            if (r5 == 0) goto L_0x016a
            com.journeyapps.barcodescanner.BarcodeView r5 = r2.f9522U
            r5.setTorch(r4)
        L_0x016a:
            java.lang.String r5 = "PROMPT_MESSAGE"
            java.lang.String r5 = r1.getStringExtra(r5)
            if (r5 == 0) goto L_0x0175
            r2.setStatusText(r5)
        L_0x0175:
            java.lang.String r5 = "SCAN_TYPE"
            r6 = 0
            int r5 = r1.getIntExtra(r5, r6)
            java.lang.String r6 = "CHARACTER_SET"
            java.lang.String r6 = r1.getStringExtra(r6)
            M3.g r8 = new M3.g
            r8.<init>()
            r8.d(r7)
            com.journeyapps.barcodescanner.BarcodeView r8 = r2.f9522U
            r8.setCameraSettings(r3)
            com.journeyapps.barcodescanner.BarcodeView r2 = r2.f9522U
            P0.q r3 = new P0.q
            r8 = 0
            r3.<init>((char) r8, (int) r4)
            r3.f3728c = r9
            r3.f3729d = r7
            r3.e = r6
            r3.f3727b = r5
            r2.setDecoderFactory(r3)
        L_0x01a2:
            java.lang.String r2 = "BEEP_ENABLED"
            boolean r2 = r1.getBooleanExtra(r2, r4)
            if (r2 != 0) goto L_0x01af
            D2.G r2 = r0.i
            r3 = 0
            r2.f1051U = r3
        L_0x01af:
            java.lang.String r2 = "SHOW_MISSING_CAMERA_PERMISSION_DIALOG"
            boolean r3 = r1.hasExtra(r2)
            if (r3 == 0) goto L_0x01ca
            boolean r2 = r1.getBooleanExtra(r2, r4)
            java.lang.String r3 = "MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"
            java.lang.String r3 = r1.getStringExtra(r3)
            r0.e = r2
            if (r3 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c6:
            java.lang.String r3 = ""
        L_0x01c8:
            r0.f1701f = r3
        L_0x01ca:
            java.lang.String r2 = "TIMEOUT"
            boolean r3 = r1.hasExtra(r2)
            if (r3 == 0) goto L_0x01e2
            android.os.Handler r3 = r0.f1704j
            G5.g r5 = new G5.g
            r5.<init>(r0, r4)
            r6 = 0
            long r6 = r1.getLongExtra(r2, r6)
            r3.postDelayed(r5, r6)
        L_0x01e2:
            java.lang.String r2 = "BARCODE_IMAGE_ENABLED"
            r3 = 0
            boolean r1 = r1.getBooleanExtra(r2, r3)
            if (r1 == 0) goto L_0x01ed
            r0.f1700d = r4
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.i.c(android.content.Intent, android.os.Bundle):void");
    }

    public final void d() {
        int i8 = Build.VERSION.SDK_INT;
        DecoratedBarcodeView decoratedBarcodeView = this.f1698b;
        if (i8 >= 23) {
            Activity activity = this.f1697a;
            if (j0.f.a(activity, "android.permission.CAMERA") == 0) {
                decoratedBarcodeView.f9522U.c();
            } else if (!this.f1707m) {
                j0.f.j(activity, new String[]{"android.permission.CAMERA"}, 250);
                this.f1707m = true;
            }
        } else {
            decoratedBarcodeView.f9522U.c();
        }
        f fVar = this.f1703h;
        if (!fVar.f4112U) {
            ((Activity) fVar.f4114W).registerReceiver((N5.f) fVar.f4115X, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            fVar.f4112U = true;
        }
        ((Handler) fVar.f4116Y).removeCallbacksAndMessages((Object) null);
        if (fVar.f4113V) {
            ((Handler) fVar.f4116Y).postDelayed((g) fVar.f4117Z, BeaconManager.DEFAULT_BACKGROUND_BETWEEN_SCAN_PERIOD);
        }
    }
}
