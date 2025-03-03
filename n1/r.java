package n1;

import P0.l;
import P0.t;
import P0.z;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import org.altbeacon.beacon.service.RangedBeacon;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final C1240e f13667a;

    /* renamed from: b  reason: collision with root package name */
    public final u f13668b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13669c;

    /* renamed from: d  reason: collision with root package name */
    public int f13670d = 0;
    public long e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    public long f13671f;

    /* renamed from: g  reason: collision with root package name */
    public long f13672g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f13673h = -9223372036854775807L;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public float f13674j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public t f13675k = t.f3738a;

    public r(Context context, C1240e eVar) {
        this.f13667a = eVar;
        this.f13668b = new u(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (r10 != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        if (r6 > 100000) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011a, code lost:
        if (r3 >= r31) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0245 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(long r25, long r27, long r29, long r31, boolean r33, n1.q r34) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r3 = r27
            r5 = r34
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f13665a = r6
            r5.f13666b = r6
            long r8 = r0.e
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0019
            r0.e = r3
        L_0x0019:
            long r8 = r0.f13672g
            r10 = -1
            r14 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            r13 = 1
            int r18 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r18 == 0) goto L_0x00b6
            n1.u r8 = r0.f13668b
            long r6 = r8.f13694n
            int r9 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0033
            r8.f13696p = r6
            long r6 = r8.f13695o
            r8.f13697q = r6
        L_0x0033:
            long r6 = r8.f13693m
            r20 = 1
            long r6 = r6 + r20
            r8.f13693m = r6
            long r6 = r1 * r14
            n1.b r9 = r8.f13683a
            n1.a r10 = r9.f13572a
            r10.b(r6)
            n1.a r10 = r9.f13572a
            boolean r10 = r10.a()
            if (r10 == 0) goto L_0x004f
            r9.f13574c = r12
            goto L_0x008a
        L_0x004f:
            long r10 = r9.f13575d
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r22 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r22 == 0) goto L_0x008a
            boolean r10 = r9.f13574c
            if (r10 == 0) goto L_0x0077
            n1.a r10 = r9.f13573b
            long r14 = r10.f13568d
            r16 = 0
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x006a
            r10 = 0
            goto L_0x0075
        L_0x006a:
            long r14 = r14 - r20
            r20 = 15
            long r14 = r14 % r20
            int r11 = (int) r14
            boolean[] r10 = r10.f13570g
            boolean r10 = r10[r11]
        L_0x0075:
            if (r10 == 0) goto L_0x0083
        L_0x0077:
            n1.a r10 = r9.f13573b
            r10.c()
            n1.a r10 = r9.f13573b
            long r14 = r9.f13575d
            r10.b(r14)
        L_0x0083:
            r9.f13574c = r13
            n1.a r10 = r9.f13573b
            r10.b(r6)
        L_0x008a:
            boolean r10 = r9.f13574c
            if (r10 == 0) goto L_0x00a0
            n1.a r10 = r9.f13573b
            boolean r10 = r10.a()
            if (r10 == 0) goto L_0x00a0
            n1.a r10 = r9.f13572a
            n1.a r11 = r9.f13573b
            r9.f13572a = r11
            r9.f13573b = r10
            r9.f13574c = r12
        L_0x00a0:
            r9.f13575d = r6
            n1.a r6 = r9.f13572a
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x00ac
            r6 = 0
            goto L_0x00af
        L_0x00ac:
            int r6 = r9.e
            int r6 = r6 + r13
        L_0x00af:
            r9.e = r6
            r8.c()
            r0.f13672g = r1
        L_0x00b6:
            long r1 = r1 - r3
            double r1 = (double) r1
            float r6 = r0.f13674j
            double r6 = (double) r6
            double r1 = r1 / r6
            long r1 = (long) r1
            boolean r6 = r0.f13669c
            if (r6 == 0) goto L_0x00d1
            P0.t r6 = r0.f13675k
            r6.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = P0.z.O(r6)
            long r6 = r6 - r29
            long r1 = r1 - r6
        L_0x00d1:
            r5.f13665a = r1
            long r6 = r0.f13673h
            r8 = -30000(0xffffffffffff8ad0, double:NaN)
            r10 = 3
            r11 = 2
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r20 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r20 == 0) goto L_0x00e8
            boolean r6 = r0.i
            if (r6 != 0) goto L_0x00e8
        L_0x00e6:
            r1 = 0
            goto L_0x0120
        L_0x00e8:
            int r6 = r0.f13670d
            if (r6 == 0) goto L_0x011e
            if (r6 == r13) goto L_0x011c
            if (r6 == r11) goto L_0x0118
            if (r6 != r10) goto L_0x0112
            P0.t r6 = r0.f13675k
            r6.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = P0.z.O(r6)
            long r14 = r0.f13671f
            long r6 = r6 - r14
            boolean r14 = r0.f13669c
            if (r14 == 0) goto L_0x00e6
            int r14 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r14 >= 0) goto L_0x00e6
            r1 = 100000(0x186a0, double:4.94066E-319)
            int r14 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r14 <= 0) goto L_0x00e6
            goto L_0x011c
        L_0x0112:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0118:
            int r1 = (r3 > r31 ? 1 : (r3 == r31 ? 0 : -1))
            if (r1 < 0) goto L_0x00e6
        L_0x011c:
            r1 = 1
            goto L_0x0120
        L_0x011e:
            boolean r1 = r0.f13669c
        L_0x0120:
            if (r1 == 0) goto L_0x0123
            return r12
        L_0x0123:
            boolean r1 = r0.f13669c
            if (r1 == 0) goto L_0x012d
            long r6 = r0.e
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0130
        L_0x012d:
            r1 = 5
            goto L_0x0266
        L_0x0130:
            P0.t r1 = r0.f13675k
            r1.getClass()
            long r6 = java.lang.System.nanoTime()
            n1.u r1 = r0.f13668b
            long r14 = r5.f13665a
            java.lang.Long.signum(r14)
            r20 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r20
            long r14 = r14 + r6
            long r10 = r1.f13696p
            r20 = -1
            int r23 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r23 == 0) goto L_0x019f
            n1.b r10 = r1.f13683a
            n1.a r10 = r10.f13572a
            boolean r10 = r10.a()
            if (r10 == 0) goto L_0x019f
            n1.b r10 = r1.f13683a
            n1.a r11 = r10.f13572a
            boolean r11 = r11.a()
            if (r11 == 0) goto L_0x0172
            n1.a r10 = r10.f13572a
            long r8 = r10.e
            r16 = 0
            int r11 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x016e
            r10 = 0
            goto L_0x0177
        L_0x016e:
            long r10 = r10.f13569f
            long r10 = r10 / r8
            goto L_0x0177
        L_0x0172:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0177:
            long r8 = r1.f13697q
            long r12 = r1.f13693m
            long r2 = r1.f13696p
            long r12 = r12 - r2
            long r12 = r12 * r10
            float r2 = (float) r12
            float r3 = r1.i
            float r2 = r2 / r3
            long r2 = (long) r2
            long r8 = r8 + r2
            long r2 = r14 - r8
            long r2 = java.lang.Math.abs(r2)
            r10 = 20000000(0x1312d00, double:9.881313E-317)
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x0195
            r14 = r8
            goto L_0x019f
        L_0x0195:
            r2 = 0
            r1.f13693m = r2
            r2 = -1
            r1.f13696p = r2
            r1.f13694n = r2
        L_0x019f:
            long r2 = r1.f13693m
            r1.f13694n = r2
            r1.f13695o = r14
            n1.t r2 = r1.f13685c
            if (r2 == 0) goto L_0x01db
            long r3 = r1.f13691k
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x01b5
            goto L_0x01db
        L_0x01b5:
            long r2 = r2.f13679U
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x01bc
            goto L_0x01db
        L_0x01bc:
            long r8 = r1.f13691k
            long r10 = r14 - r2
            long r10 = r10 / r8
            long r10 = r10 * r8
            long r10 = r10 + r2
            int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x01cb
            long r2 = r10 - r8
            goto L_0x01ce
        L_0x01cb:
            long r8 = r8 + r10
            r2 = r10
            r10 = r8
        L_0x01ce:
            long r8 = r10 - r14
            long r14 = r14 - r2
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x01d6
            goto L_0x01d7
        L_0x01d6:
            r10 = r2
        L_0x01d7:
            long r1 = r1.f13692l
            long r14 = r10 - r1
        L_0x01db:
            r5.f13666b = r14
            long r14 = r14 - r6
            r1 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r1
            r5.f13665a = r14
            long r1 = r0.f13673h
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x01f4
            boolean r1 = r0.i
            if (r1 != 0) goto L_0x01f4
            r1 = 1
            goto L_0x01f5
        L_0x01f4:
            r1 = 0
        L_0x01f5:
            n1.e r2 = r0.f13667a
            r3 = -500000(0xfffffffffff85ee0, double:NaN)
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x020f
            if (r33 != 0) goto L_0x020f
            h1.Y r3 = r2.f4806c0
            r3.getClass()
            long r6 = r2.f4808e0
            long r6 = r27 - r6
            int r3 = r3.o(r6)
            if (r3 != 0) goto L_0x0211
        L_0x020f:
            r7 = 0
            goto L_0x0242
        L_0x0211:
            if (r1 == 0) goto L_0x0222
            T0.f r4 = r2.f8862r1
            int r6 = r4.f4821d
            int r6 = r6 + r3
            r4.f4821d = r6
            int r3 = r4.f4822f
            int r6 = r2.f13599S1
            int r3 = r3 + r6
            r4.f4822f = r3
            goto L_0x022f
        L_0x0222:
            T0.f r4 = r2.f8862r1
            int r6 = r4.f4825j
            r7 = 1
            int r6 = r6 + r7
            r4.f4825j = r6
            int r4 = r2.f13599S1
            r2.F0(r3, r4)
        L_0x022f:
            boolean r3 = r2.J()
            if (r3 == 0) goto L_0x0238
            r2.T()
        L_0x0238:
            n1.i r2 = r2.f13587G1
            r7 = 0
            if (r2 == 0) goto L_0x0240
            r2.a(r7)
        L_0x0240:
            r2 = 1
            goto L_0x0243
        L_0x0242:
            r2 = 0
        L_0x0243:
            if (r2 == 0) goto L_0x0247
            r1 = 4
            return r1
        L_0x0247:
            long r2 = r5.f13665a
            r4 = -30000(0xffffffffffff8ad0, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0253
            if (r33 != 0) goto L_0x0253
            r12 = 1
            goto L_0x0254
        L_0x0253:
            r12 = 0
        L_0x0254:
            if (r12 == 0) goto L_0x025c
            if (r1 == 0) goto L_0x025a
            r10 = 3
            goto L_0x025b
        L_0x025a:
            r10 = 2
        L_0x025b:
            return r10
        L_0x025c:
            r4 = 50000(0xc350, double:2.47033E-319)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0265
            r1 = 5
            return r1
        L_0x0265:
            r1 = 1
        L_0x0266:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.r.a(long, long, long, long, boolean, n1.q):int");
    }

    public final boolean b(boolean z) {
        if (z && this.f13670d == 3) {
            this.f13673h = -9223372036854775807L;
            return true;
        } else if (this.f13673h == -9223372036854775807L) {
            return false;
        } else {
            this.f13675k.getClass();
            if (SystemClock.elapsedRealtime() < this.f13673h) {
                return true;
            }
            this.f13673h = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z) {
        this.i = z;
        this.f13675k.getClass();
        this.f13673h = SystemClock.elapsedRealtime() + RangedBeacon.DEFAULT_MAX_TRACKING_AGE;
    }

    public final void d(int i8) {
        this.f13670d = Math.min(this.f13670d, i8);
    }

    public final void e() {
        this.f13669c = true;
        this.f13675k.getClass();
        this.f13671f = z.O(SystemClock.elapsedRealtime());
        u uVar = this.f13668b;
        uVar.f13686d = true;
        uVar.f13693m = 0;
        uVar.f13696p = -1;
        uVar.f13694n = -1;
        s sVar = uVar.f13684b;
        if (sVar != null) {
            t tVar = uVar.f13685c;
            tVar.getClass();
            tVar.f13680V.sendEmptyMessage(2);
            Handler m8 = z.m((Handler.Callback) null);
            DisplayManager displayManager = sVar.f13676a;
            displayManager.registerDisplayListener(sVar, m8);
            u.a(sVar.f13677b, displayManager.getDisplay(0));
        }
        uVar.d(false);
    }

    public final void f() {
        this.f13669c = false;
        this.f13673h = -9223372036854775807L;
        u uVar = this.f13668b;
        uVar.f13686d = false;
        s sVar = uVar.f13684b;
        if (sVar != null) {
            sVar.f13676a.unregisterDisplayListener(sVar);
            t tVar = uVar.f13685c;
            tVar.getClass();
            tVar.f13680V.sendEmptyMessage(3);
        }
        uVar.b();
    }

    public final void g(float f8) {
        u uVar = this.f13668b;
        uVar.f13687f = f8;
        C1237b bVar = uVar.f13683a;
        bVar.f13572a.c();
        bVar.f13573b.c();
        bVar.f13574c = false;
        bVar.f13575d = -9223372036854775807L;
        bVar.e = 0;
        uVar.c();
    }

    public final void h(float f8) {
        boolean z;
        if (f8 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        if (f8 != this.f13674j) {
            this.f13674j = f8;
            u uVar = this.f13668b;
            uVar.i = f8;
            uVar.f13693m = 0;
            uVar.f13696p = -1;
            uVar.f13694n = -1;
            uVar.d(false);
        }
    }
}
