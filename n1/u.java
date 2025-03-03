package n1;

import P0.l;
import P0.z;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final C1237b f13683a;

    /* renamed from: b  reason: collision with root package name */
    public final s f13684b;

    /* renamed from: c  reason: collision with root package name */
    public final t f13685c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13686d;
    public Surface e;

    /* renamed from: f  reason: collision with root package name */
    public float f13687f;

    /* renamed from: g  reason: collision with root package name */
    public float f13688g;

    /* renamed from: h  reason: collision with root package name */
    public float f13689h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public int f13690j;

    /* renamed from: k  reason: collision with root package name */
    public long f13691k;

    /* renamed from: l  reason: collision with root package name */
    public long f13692l;

    /* renamed from: m  reason: collision with root package name */
    public long f13693m;

    /* renamed from: n  reason: collision with root package name */
    public long f13694n;

    /* renamed from: o  reason: collision with root package name */
    public long f13695o;

    /* renamed from: p  reason: collision with root package name */
    public long f13696p;

    /* renamed from: q  reason: collision with root package name */
    public long f13697q;

    /* JADX WARNING: type inference failed for: r0v0, types: [n1.b, java.lang.Object] */
    public u(Context context) {
        s sVar;
        DisplayManager displayManager;
        ? obj = new Object();
        obj.f13572a = new C1236a();
        obj.f13573b = new C1236a();
        obj.f13575d = -9223372036854775807L;
        this.f13683a = obj;
        t tVar = null;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            sVar = null;
        } else {
            sVar = new s(this, displayManager);
        }
        this.f13684b = sVar;
        this.f13685c = sVar != null ? t.f13678Y : tVar;
        this.f13691k = -9223372036854775807L;
        this.f13692l = -9223372036854775807L;
        this.f13687f = -1.0f;
        this.i = 1.0f;
        this.f13690j = 0;
    }

    public static void a(u uVar, Display display) {
        uVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            uVar.f13691k = refreshRate;
            uVar.f13692l = (refreshRate * 80) / 100;
            return;
        }
        l.B("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        uVar.f13691k = -9223372036854775807L;
        uVar.f13692l = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        if (z.f3748a >= 30 && (surface = this.e) != null && this.f13690j != Integer.MIN_VALUE && this.f13689h != 0.0f) {
            this.f13689h = 0.0f;
            try {
                surface.setFrameRate(0.0f, 0);
            } catch (IllegalStateException e8) {
                l.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r9 = this;
            int r0 = P0.z.f3748a
            r1 = 30
            if (r0 < r1) goto L_0x008e
            android.view.Surface r0 = r9.e
            if (r0 != 0) goto L_0x000c
            goto L_0x008e
        L_0x000c:
            n1.b r0 = r9.f13683a
            n1.a r2 = r0.f13572a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x003a
            n1.a r2 = r0.f13572a
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0037
            n1.a r2 = r0.f13572a
            long r4 = r2.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            long r6 = r2.f13569f
            long r6 = r6 / r4
        L_0x002e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L_0x003c
        L_0x0037:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x003c
        L_0x003a:
            float r2 = r9.f13687f
        L_0x003c:
            float r4 = r9.f13688g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0043
            return
        L_0x0043:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0081
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0081
            n1.a r1 = r0.f13572a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0072
            n1.a r1 = r0.f13572a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0060
            n1.a r0 = r0.f13572a
            long r0 = r0.f13569f
            goto L_0x0065
        L_0x0060:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0065:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0072
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0074
        L_0x0072:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0074:
            float r1 = r9.f13688g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x008e
            goto L_0x0088
        L_0x0081:
            if (r5 == 0) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            int r0 = r0.e
            if (r0 < r1) goto L_0x008e
        L_0x0088:
            r9.f13688g = r2
            r0 = 0
            r9.d(r0)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.u.c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = P0.z.f3748a
            r1 = 30
            if (r0 < r1) goto L_0x0042
            android.view.Surface r0 = r4.e
            if (r0 == 0) goto L_0x0042
            int r1 = r4.f13690j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L_0x0011
            goto L_0x0042
        L_0x0011:
            boolean r1 = r4.f13686d
            r2 = 0
            if (r1 == 0) goto L_0x0023
            float r1 = r4.f13688g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0023
            float r3 = r4.i
            float r1 = r1 * r3
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r5 != 0) goto L_0x002d
            float r5 = r4.f13689h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002d
            return
        L_0x002d:
            r4.f13689h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0035
            r5 = 0
            goto L_0x0036
        L_0x0035:
            r5 = 1
        L_0x0036:
            r0.setFrameRate(r1, r5)     // Catch:{ IllegalStateException -> 0x003a }
            goto L_0x0042
        L_0x003a:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            P0.l.p(r0, r1, r5)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.u.d(boolean):void");
    }
}
