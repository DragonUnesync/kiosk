package N5;

import android.content.Context;
import android.os.Handler;
import java.util.TimerTask;

public final class e extends TimerTask {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3374U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f3375V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f3376W;

    public /* synthetic */ e(Object obj, int i, Object obj2) {
        this.f3374U = i;
        this.f3376W = obj;
        this.f3375V = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r0 = (de.ozerov.fully.J0) r6.f3376W;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.f3374U
            switch(r0) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0075;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.f3375V
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = de.ozerov.fully.C0794w0.a0(r0)
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r6.f3376W
            de.ozerov.fully.J0 r0 = (de.ozerov.fully.J0) r0
            java.lang.Boolean r0 = r0.f10018c
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r6.f3376W
            de.ozerov.fully.J0 r0 = (de.ozerov.fully.J0) r0
            java.lang.Boolean r0 = r0.f10018c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0038
            java.lang.Object r0 = r6.f3376W
            de.ozerov.fully.J0 r0 = (de.ozerov.fully.J0) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.f10018c = r1
            java.lang.Object r0 = r6.f3376W
            de.ozerov.fully.J0 r0 = (de.ozerov.fully.J0) r0
            de.ozerov.fully.B3 r1 = r0.f10019d
            if (r1 == 0) goto L_0x0038
            de.ozerov.fully.FullyActivity r0 = r0.f10016a
            r0.runOnUiThread(r1)
        L_0x0038:
            java.lang.Object r0 = r6.f3376W
            de.ozerov.fully.J0 r0 = (de.ozerov.fully.J0) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.f10018c = r1
            goto L_0x0074
        L_0x0041:
            java.lang.Object r0 = r6.f3375V
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = de.ozerov.fully.C0794w0.a0(r0)
            if (r0 != 0) goto L_0x0074
            java.lang.Object r0 = r6.f3376W
            de.ozerov.fully.J0 r0 = (de.ozerov.fully.J0) r0
            java.lang.Boolean r0 = r0.f10018c
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r6.f3376W
            de.ozerov.fully.J0 r0 = (de.ozerov.fully.J0) r0
            java.lang.Boolean r0 = r0.f10018c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r6.f3376W
            de.ozerov.fully.J0 r0 = (de.ozerov.fully.J0) r0
            de.ozerov.fully.B3 r1 = r0.e
            if (r1 == 0) goto L_0x006c
            de.ozerov.fully.FullyActivity r0 = r0.f10016a
            r0.runOnUiThread(r1)
        L_0x006c:
            java.lang.Object r0 = r6.f3376W
            de.ozerov.fully.J0 r0 = (de.ozerov.fully.J0) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.f10018c = r1
        L_0x0074:
            return
        L_0x0075:
            Z1.f r0 = new Z1.f
            java.lang.Object r1 = r6.f3376W
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2
            r0.<init>(r1, r2)
            java.lang.Object r1 = r6.f3375V
            android.os.Handler r1 = (android.os.Handler) r1
            r1.post(r0)
            return
        L_0x0087:
            java.lang.String r0 = "j"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00bf }
            java.lang.Object r3 = r6.f3376W     // Catch:{ Exception -> 0x00bf }
            N5.j r3 = (N5.j) r3     // Catch:{ Exception -> 0x00bf }
            boolean r3 = r3.f3396F     // Catch:{ Exception -> 0x00bf }
            if (r3 != 0) goto L_0x009e
            java.lang.Object r1 = r6.f3376W     // Catch:{ Exception -> 0x00bf }
            N5.j r1 = (N5.j) r1     // Catch:{ Exception -> 0x00bf }
            r2 = 0
            r1.f(r2)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00c4
        L_0x009e:
            java.lang.Object r3 = r6.f3376W     // Catch:{ Exception -> 0x00bf }
            N5.j r3 = (N5.j) r3     // Catch:{ Exception -> 0x00bf }
            long r3 = r3.f3412p     // Catch:{ Exception -> 0x00bf }
            long r1 = r1 - r3
            r3 = 10000(0x2710, double:4.9407E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c4
            java.lang.String r1 = "Last frame > 10 sec ago, trying to restart the cam..."
            android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00bf }
            java.lang.Object r1 = r6.f3375V     // Catch:{ Exception -> 0x00bf }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ Exception -> 0x00bf }
            A.d r2 = new A.d     // Catch:{ Exception -> 0x00bf }
            r3 = 24
            r2.<init>(r3, r6)     // Catch:{ Exception -> 0x00bf }
            r1.post(r2)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00c4
        L_0x00bf:
            java.lang.String r1 = "Camera watchdog fails"
            android.util.Log.e(r0, r1)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.e.run():void");
    }

    public e(Context context, Handler handler) {
        this.f3374U = 1;
        this.f3375V = handler;
        this.f3376W = context;
    }
}
