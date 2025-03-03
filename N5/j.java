package N5;

import A.d;
import Q0.g;
import R2.c;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.input.InputManager;
import android.media.FaceDetector;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import d4.k;
import de.ozerov.fully.C0767r3;
import de.ozerov.fully.C0794w0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n2.a;

public final class j {

    /* renamed from: I  reason: collision with root package name */
    public static final /* synthetic */ int f3390I = 0;

    /* renamed from: A  reason: collision with root package name */
    public int f3391A;

    /* renamed from: B  reason: collision with root package name */
    public final c f3392B = new c();

    /* renamed from: C  reason: collision with root package name */
    public final c f3393C;

    /* renamed from: D  reason: collision with root package name */
    public volatile int f3394D = -1;

    /* renamed from: E  reason: collision with root package name */
    public Timer f3395E;

    /* renamed from: F  reason: collision with root package name */
    public volatile boolean f3396F = false;

    /* renamed from: G  reason: collision with root package name */
    public final f f3397G = new f(0, this);

    /* renamed from: H  reason: collision with root package name */
    public final h f3398H = new h(this);

    /* renamed from: a  reason: collision with root package name */
    public final Service f3399a;

    /* renamed from: b  reason: collision with root package name */
    public final k f3400b;

    /* renamed from: c  reason: collision with root package name */
    public int f3401c;

    /* renamed from: d  reason: collision with root package name */
    public int f3402d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f3403f;

    /* renamed from: g  reason: collision with root package name */
    public int f3404g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3405h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3406j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3407k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3408l;

    /* renamed from: m  reason: collision with root package name */
    public volatile int f3409m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicBoolean f3410n = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    public final AtomicInteger f3411o = new AtomicInteger(0);

    /* renamed from: p  reason: collision with root package name */
    public volatile long f3412p = 0;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f3413q = 0;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f3414r = 0;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f3415s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f3416t;

    /* renamed from: u  reason: collision with root package name */
    public Camera f3417u = null;

    /* renamed from: v  reason: collision with root package name */
    public Camera.Size f3418v = null;

    /* renamed from: w  reason: collision with root package name */
    public a f3419w = null;

    /* renamed from: x  reason: collision with root package name */
    public Camera.Size f3420x;

    /* renamed from: y  reason: collision with root package name */
    public byte[] f3421y;
    public int z;

    public j(Service service, k kVar) {
        this.f3399a = service;
        this.f3400b = kVar;
        this.f3393C = new c((Context) service, 27);
    }

    public static void a(j jVar, String str) {
        if (jVar.f3413q == 0 || System.currentTimeMillis() >= jVar.f3413q + 1000) {
            jVar.f3413q = System.currentTimeMillis();
            try {
                Intent intent = new Intent();
                intent.setAction("com.fullykiosk.singleapp.action.motion_detected");
                intent.putExtra("type", str);
                L0.c.a(jVar.f3399a).c(intent);
            } catch (Exception unused) {
                Log.e("j", "Failed broadcasting motion intent");
            }
        }
    }

    public static ArrayList b(byte[] bArr, int i8, int i9, int i10, int i11) {
        System.currentTimeMillis();
        Rect rect = new Rect(0, 0, i8, i9);
        YuvImage yuvImage = new YuvImage(bArr, i10, i8, i9, (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap Y7 = a.Y(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options), i11);
        FaceDetector.Face[] faceArr = new FaceDetector.Face[3];
        int findFaces = new FaceDetector(Y7.getWidth(), Y7.getHeight(), 3).findFaces(Y7, faceArr);
        System.currentTimeMillis();
        Y7.recycle();
        return new ArrayList(Arrays.asList(faceArr).subList(0, findFaces));
    }

    public final void c() {
        int i8;
        int i9;
        k kVar = this.f3400b;
        this.f3401c = kVar.v1();
        int u12 = kVar.u1();
        this.f3402d = u12;
        if (u12 == 0) {
            this.f3402d = 1;
        }
        Z1.c cVar = (Z1.c) kVar.f9767W;
        if (cVar.n("screenOffInDarkness", false)) {
            i8 = kVar.x();
        } else {
            i8 = 0;
        }
        this.e = i8;
        this.i = cVar.n("ignoreMotionWhenMoving", false);
        this.f3406j = cVar.n("ignoreMotionWhenScreensaverOnOff", false);
        this.f3407k = cVar.n("detectFaces", false);
        this.f3405h = kVar.Y1().booleanValue();
        this.f3408l = cVar.n("detectMotionOnlyWithFaces", false);
        try {
            i9 = Integer.parseInt(cVar.r("detectFacesInterval", "500"));
        } catch (Exception unused) {
            i9 = 500;
        }
        this.f3403f = i9;
        this.f3404g = kVar.z();
        this.f3411o.set(0);
    }

    public final void d() {
        int i8;
        boolean z6;
        if (this.f3417u != null) {
            Service service = this.f3399a;
            int i9 = this.f3416t;
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i9, cameraInfo);
            int N2 = C0794w0.N(service);
            if (cameraInfo.facing == 1) {
                i8 = (360 - ((cameraInfo.orientation + N2) % 360)) % 360;
            } else {
                i8 = ((cameraInfo.orientation - N2) + 360) % 360;
            }
            this.f3417u.setDisplayOrientation(i8);
            Service service2 = this.f3399a;
            int i10 = this.f3416t;
            int N8 = C0794w0.N(service2);
            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
            Camera.getCameraInfo(i10, cameraInfo2);
            if ((cameraInfo2.orientation + N8) % 180 != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.f3391A = i8;
            if (z6) {
                this.f3391A = i8 + 180;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            if (this.f3400b.Y1().booleanValue()) {
                if (z6) {
                    Camera.Size size = this.f3418v;
                    layoutParams.width = size.height;
                    layoutParams.height = size.width;
                } else {
                    Camera.Size size2 = this.f3418v;
                    layoutParams.width = size2.width;
                    layoutParams.height = size2.height;
                }
                if (a.r0()) {
                    layoutParams.alpha = ((InputManager) this.f3399a.getSystemService("input")).getMaximumObscuringOpacityForTouch();
                } else {
                    layoutParams.alpha = 1.0f;
                }
            } else {
                layoutParams.width = 8;
                layoutParams.height = 16;
                layoutParams.alpha = 0.0f;
            }
            if (!a.B0() || a.b0(this.f3399a) < 26) {
                layoutParams.type = 2006;
            } else {
                layoutParams.type = 2038;
            }
            layoutParams.format = 0;
            layoutParams.gravity = 8388693;
            layoutParams.flags = 21495864;
            if (a.C0()) {
                if (((Z1.c) this.f3400b.f9767W).n("renderInCutoutArea", true)) {
                    layoutParams.layoutInDisplayCutoutMode = 3;
                } else {
                    layoutParams.layoutInDisplayCutoutMode = 0;
                }
            }
            if (this.f3419w == null) {
                this.f3419w = new a(this.f3399a, this.f3417u, new d(23, this));
                try {
                    ((WindowManager) this.f3399a.getSystemService("window")).addView(this.f3419w, layoutParams);
                } catch (Exception e8) {
                    g.x(e8, new StringBuilder("Adding cam preview failed due to "), "j");
                    this.f3419w = null;
                    throw e8;
                }
            } else {
                ((WindowManager) this.f3399a.getSystemService("window")).updateViewLayout(this.f3419w, layoutParams);
            }
            if (!this.f3400b.Y1().booleanValue() || !((Z1.c) this.f3400b.f9767W).n("detectFaces", false)) {
                this.f3393C.i0();
                return;
            }
            c cVar = this.f3393C;
            synchronized (cVar) {
                try {
                    if (((C0767r3) cVar.f4337W) == null) {
                        View inflate = ((LayoutInflater) ((Service) cVar.f4336V).getSystemService("layout_inflater")).inflate(2131558484, (ViewGroup) null);
                        C0767r3 r3Var = new C0767r3((Service) cVar.f4336V);
                        cVar.f4337W = r3Var;
                        r3Var.h(inflate);
                        C0767r3 r3Var2 = (C0767r3) cVar.f4337W;
                        r3Var2.f10920j = 8388693;
                        r3Var2.f10916d = true;
                        r3Var2.e = true;
                        r3Var2.f10921k = true;
                        r3Var2.f10918g = -2;
                        r3Var2.f10919h = -2;
                        r3Var2.f10926p = "faceNumber";
                    }
                    ((C0767r3) cVar.f4337W).j();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Can't make setCamPreview while camera isn't set up");
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [android.hardware.Camera$ErrorCallback, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:52|53|54|55|56|57|58|(4:61|(2:64|88)(1:87)|85|59)|86|65|(4:67|(1:69)|70|92)(2:71|94)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f3 */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0108 A[Catch:{ Exception -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012c A[Catch:{ Exception -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0191 A[Catch:{ Exception -> 0x019f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r11 = this;
            r0 = 0
            boolean r1 = n2.a.y0()
            r2 = 1
            if (r1 == 0) goto L_0x0043
            android.app.Service r1 = r11.f3399a
            int r1 = r1.checkSelfPermission("android.permission.CAMERA")
            if (r1 != 0) goto L_0x0018
            android.app.Service r1 = r11.f3399a
            boolean r1 = android.provider.Settings.canDrawOverlays(r1)
            if (r1 != 0) goto L_0x0043
        L_0x0018:
            d4.k r0 = r11.f3400b
            java.lang.String r0 = r0.y()
            java.lang.String r1 = "android.permission.CAMERA"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002d
            android.app.Service r0 = r11.f3399a
            java.lang.String r1 = "Camera permission denied permanently, can't use the cam"
            n2.a.a1(r2, r0, r1)
        L_0x002d:
            d4.k r0 = r11.f3400b
            java.lang.String r0 = r0.y()
            java.lang.String r1 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0042
            android.app.Service r0 = r11.f3399a
            java.lang.String r1 = "Overlay permission denied permanently, can't use the cam"
            n2.a.a1(r2, r0, r1)
        L_0x0042:
            return
        L_0x0043:
            int r1 = r11.f3409m
            if (r1 == 0) goto L_0x0048
            return
        L_0x0048:
            r11.f3409m = r2
            monitor-enter(r11)
            java.util.Timer r1 = r11.f3395E     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0056
            r11.g()     // Catch:{ all -> 0x0053 }
            goto L_0x0056
        L_0x0053:
            r0 = move-exception
            goto L_0x01a8
        L_0x0056:
            java.util.Timer r1 = new java.util.Timer     // Catch:{ all -> 0x0053 }
            r1.<init>()     // Catch:{ all -> 0x0053 }
            r11.f3395E = r1     // Catch:{ all -> 0x0053 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x0053 }
            r1.<init>()     // Catch:{ all -> 0x0053 }
            N5.e r4 = new N5.e     // Catch:{ all -> 0x0053 }
            r4.<init>(r11, r0, r1)     // Catch:{ all -> 0x0053 }
            java.util.Timer r3 = r11.f3395E     // Catch:{ Exception -> 0x0071 }
            r5 = 10000(0x2710, double:4.9407E-320)
            r7 = 10000(0x2710, double:4.9407E-320)
            r3.schedule(r4, r5, r7)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0075
        L_0x0071:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0053 }
        L_0x0075:
            monitor-exit(r11)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r3 = "com.fullykiosk.singleapp.event.screensaver_start"
            r1.addAction(r3)
            java.lang.String r3 = "com.fullykiosk.singleapp.event.screensaver_stop"
            r1.addAction(r3)
            android.app.Service r3 = r11.f3399a
            L0.c r3 = L0.c.a(r3)
            N5.f r4 = r11.f3397G
            r3.b(r4, r1)
            d4.k r1 = r11.f3400b
            java.lang.String r3 = r1.q1()     // Catch:{ Exception -> 0x00c1 }
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x00c1 }
            if (r3 != 0) goto L_0x00a5
            java.lang.String r1 = r1.q1()     // Catch:{ Exception -> 0x00c1 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x00c9
        L_0x00a5:
            int r1 = android.hardware.Camera.getNumberOfCameras()     // Catch:{ Exception -> 0x00c1 }
            if (r1 <= r2) goto L_0x00c8
            r1 = 0
        L_0x00ac:
            int r3 = android.hardware.Camera.getNumberOfCameras()     // Catch:{ Exception -> 0x00c1 }
            if (r1 >= r3) goto L_0x00c8
            android.hardware.Camera$CameraInfo r3 = new android.hardware.Camera$CameraInfo     // Catch:{ Exception -> 0x00c1 }
            r3.<init>()     // Catch:{ Exception -> 0x00c1 }
            android.hardware.Camera.getCameraInfo(r1, r3)     // Catch:{ Exception -> 0x00c1 }
            int r3 = r3.facing     // Catch:{ Exception -> 0x00c1 }
            if (r3 != r2) goto L_0x00bf
            goto L_0x00c9
        L_0x00bf:
            int r1 = r1 + r2
            goto L_0x00ac
        L_0x00c1:
            java.lang.String r1 = "j"
            java.lang.String r2 = "Failed to find the camera ID"
            android.util.Log.e(r1, r2)
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            r11.f3416t = r1
            r2 = -1
            if (r1 != r2) goto L_0x00cf
            return
        L_0x00cf:
            android.hardware.Camera r1 = android.hardware.Camera.open(r1)     // Catch:{ Exception -> 0x01a3 }
            r11.f3417u = r1     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r1 = "Failed to setup camera"
            java.lang.String r2 = "j"
            d4.k r3 = r11.f3400b     // Catch:{ Exception -> 0x019f }
            r3.getClass()     // Catch:{ Exception -> 0x019f }
            r4 = 101376(0x18c00, float:1.42058E-40)
            java.lang.Object r3 = r3.f9767W     // Catch:{ Exception -> 0x00f3 }
            Z1.c r3 = (Z1.c) r3     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r5 = "motionDetectionResolution"
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r3 = r3.r(r5, r6)     // Catch:{ Exception -> 0x00f3 }
            int r4 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x00f3 }
        L_0x00f3:
            android.hardware.Camera r3 = r11.f3417u     // Catch:{ Exception -> 0x019f }
            android.hardware.Camera$Parameters r3 = r3.getParameters()     // Catch:{ Exception -> 0x019f }
            java.util.List r5 = r3.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x019f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x019f }
            r6 = 0
        L_0x0102:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x019f }
            if (r7 == 0) goto L_0x0128
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x019f }
            android.hardware.Camera$Size r7 = (android.hardware.Camera.Size) r7     // Catch:{ Exception -> 0x019f }
            int r8 = r7.width     // Catch:{ Exception -> 0x019f }
            int r9 = r7.height     // Catch:{ Exception -> 0x019f }
            int r8 = r8 * r9
            int r9 = r8 - r4
            int r9 = java.lang.Math.abs(r9)     // Catch:{ Exception -> 0x019f }
            int r10 = r6 - r4
            int r10 = java.lang.Math.abs(r10)     // Catch:{ Exception -> 0x019f }
            if (r9 < r10) goto L_0x0124
            if (r6 != 0) goto L_0x0102
        L_0x0124:
            r11.f3418v = r7     // Catch:{ Exception -> 0x019f }
            r6 = r8
            goto L_0x0102
        L_0x0128:
            android.hardware.Camera$Size r4 = r11.f3418v     // Catch:{ Exception -> 0x019f }
            if (r4 == 0) goto L_0x0191
            int r5 = r4.width     // Catch:{ Exception -> 0x019f }
            int r4 = r4.height     // Catch:{ Exception -> 0x019f }
            r3.setPreviewSize(r5, r4)     // Catch:{ Exception -> 0x019f }
            android.hardware.Camera r4 = r11.f3417u     // Catch:{ Exception -> 0x019f }
            r4.setParameters(r3)     // Catch:{ Exception -> 0x019f }
            d4.k r4 = r11.f3400b     // Catch:{ Exception -> 0x019f }
            java.lang.Boolean r4 = r4.K()     // Catch:{ Exception -> 0x019f }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x019f }
            if (r4 == 0) goto L_0x016a
            android.app.Service r4 = r11.f3399a     // Catch:{ Exception -> 0x019f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019f }
            r5.<init>()     // Catch:{ Exception -> 0x019f }
            java.lang.String r6 = "Camera set to "
            r5.append(r6)     // Catch:{ Exception -> 0x019f }
            android.hardware.Camera$Size r6 = r11.f3418v     // Catch:{ Exception -> 0x019f }
            int r6 = r6.width     // Catch:{ Exception -> 0x019f }
            r5.append(r6)     // Catch:{ Exception -> 0x019f }
            java.lang.String r6 = "x"
            r5.append(r6)     // Catch:{ Exception -> 0x019f }
            android.hardware.Camera$Size r6 = r11.f3418v     // Catch:{ Exception -> 0x019f }
            int r6 = r6.height     // Catch:{ Exception -> 0x019f }
            r5.append(r6)     // Catch:{ Exception -> 0x019f }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x019f }
            n2.a.a1(r0, r4, r5)     // Catch:{ Exception -> 0x019f }
        L_0x016a:
            android.hardware.Camera$Size r0 = r3.getPreviewSize()     // Catch:{ Exception -> 0x019f }
            r11.f3420x = r0     // Catch:{ Exception -> 0x019f }
            int r0 = r3.getPreviewFormat()     // Catch:{ Exception -> 0x019f }
            r11.z = r0     // Catch:{ Exception -> 0x019f }
            r11.d()     // Catch:{ Exception -> 0x019f }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x019f }
            r11.f3412p = r3     // Catch:{ Exception -> 0x019f }
            android.hardware.Camera r0 = r11.f3417u     // Catch:{ Exception -> 0x019f }
            N5.h r3 = r11.f3398H     // Catch:{ Exception -> 0x019f }
            r0.setPreviewCallback(r3)     // Catch:{ Exception -> 0x019f }
            android.hardware.Camera r0 = r11.f3417u     // Catch:{ Exception -> 0x019f }
            N5.d r3 = new N5.d     // Catch:{ Exception -> 0x019f }
            r3.<init>()     // Catch:{ Exception -> 0x019f }
            r0.setErrorCallback(r3)     // Catch:{ Exception -> 0x019f }
            goto L_0x01a7
        L_0x0191:
            java.lang.String r3 = "No suitable camera resolution found"
            android.util.Log.e(r2, r3)     // Catch:{ Exception -> 0x019f }
            android.app.Service r3 = r11.f3399a     // Catch:{ Exception -> 0x019f }
            n2.a.a1(r0, r3, r1)     // Catch:{ Exception -> 0x019f }
            r11.f(r0)     // Catch:{ Exception -> 0x019f }
            goto L_0x01a7
        L_0x019f:
            android.util.Log.e(r2, r1)
            goto L_0x01a7
        L_0x01a3:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01a7:
            return
        L_0x01a8:
            monitor-exit(r11)     // Catch:{ all -> 0x0053 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.j.e():void");
    }

    public final void f(boolean z6) {
        if (this.f3409m != 3) {
            this.f3409m = 3;
            g();
            c cVar = this.f3393C;
            synchronized (cVar) {
                C0767r3 r3Var = (C0767r3) cVar.f4337W;
                if (r3Var != null) {
                    r3Var.b();
                }
            }
            L0.c.a(this.f3399a).d(this.f3397G);
            new g(this, z6).execute(new Void[0]);
        }
    }

    public final synchronized void g() {
        Timer timer = this.f3395E;
        if (timer != null) {
            timer.cancel();
            this.f3395E.purge();
            this.f3395E = null;
        }
    }
}
