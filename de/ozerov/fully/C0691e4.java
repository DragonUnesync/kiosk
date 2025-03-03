package de.ozerov.fully;

/* renamed from: de.ozerov.fully.e4  reason: case insensitive filesystem */
public final /* synthetic */ class C0691e4 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10614U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0703g4 f10615V;

    public /* synthetic */ C0691e4(C0703g4 g4Var, int i) {
        this.f10614U = i;
        this.f10615V = g4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 1
            int r1 = r5.f10614U
            switch(r1) {
                case 0: goto L_0x0137;
                case 1: goto L_0x00f3;
                case 2: goto L_0x0052;
                default: goto L_0x0006;
            }
        L_0x0006:
            de.ozerov.fully.g4 r1 = r5.f10615V
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            java.util.ArrayList r2 = de.ozerov.fully.C0664a1.c(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0012:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0051
            java.lang.Object r3 = r2.next()
            de.ozerov.fully.a1 r3 = (de.ozerov.fully.C0664a1) r3
            int r4 = r3.f10547f
            if (r4 == r0) goto L_0x0023
            goto L_0x0012
        L_0x0023:
            java.lang.String r3 = r3.f10543a
            if (r3 == 0) goto L_0x0012
            android.content.ComponentName r3 = android.content.ComponentName.unflattenFromString(r3)
            if (r3 == 0) goto L_0x0012
            de.ozerov.fully.FullyActivity r4 = r1.f10649a
            boolean r4 = de.ozerov.fully.C0794w0.Z(r4)
            if (r4 == 0) goto L_0x0045
            boolean r4 = n2.a.C0()
            if (r4 == 0) goto L_0x0045
            de.ozerov.fully.FullyActivity r4 = r1.f10649a
            java.lang.String r3 = r3.getPackageName()
            de.ozerov.fully.I1.c(r4, r3)
            goto L_0x0012
        L_0x0045:
            boolean r4 = de.ozerov.fully.P.f10240j
            if (r4 == 0) goto L_0x0012
            java.lang.String r3 = r3.getPackageName()
            de.ozerov.fully.P.b(r3)
            goto L_0x0012
        L_0x0051:
            return
        L_0x0052:
            de.ozerov.fully.g4 r1 = r5.f10615V
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            boolean r2 = r2.w()
            if (r2 == 0) goto L_0x00f2
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            java.lang.String r3 = "preferences"
            boolean r2 = r2.y(r3)
            if (r2 != 0) goto L_0x00f2
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            java.lang.String r3 = "playlistItemSelector"
            boolean r2 = r2.y(r3)
            if (r2 != 0) goto L_0x00f2
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            java.lang.String r3 = "launcherItemSelector"
            boolean r2 = r2.y(r3)
            if (r2 != 0) goto L_0x00f2
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            java.lang.String r3 = "scheduleItemSelector"
            boolean r2 = r2.y(r3)
            if (r2 != 0) goto L_0x00f2
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            de.ozerov.fully.N1 r2 = r2.f9916E0
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x00f2
            boolean r2 = de.ozerov.fully.C0794w0.f11032r
            if (r2 == 0) goto L_0x009e
            d4.k r2 = r1.f10650b
            java.lang.Boolean r2 = r2.W()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x00f2
        L_0x009e:
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            boolean r2 = de.ozerov.fully.C0794w0.d0(r2)
            if (r2 == 0) goto L_0x00b2
            d4.k r2 = r1.f10650b
            java.lang.Boolean r2 = r2.V()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x00f2
        L_0x00b2:
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            boolean r2 = r2.f10980u0
            if (r2 != 0) goto L_0x00c7
            d4.k r2 = r1.f10650b
            r3 = 0
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r4 = "inUseWhileAnotherAppInForeground"
            boolean r2 = r2.n(r4, r3)
            if (r2 != 0) goto L_0x00f2
        L_0x00c7:
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            de.ozerov.fully.i5 r2 = r2.f9917F0
            boolean r2 = r2.m()
            if (r2 == 0) goto L_0x00df
            d4.k r2 = r1.f10650b
            java.lang.String r3 = "keepOnWhileFullscreen"
            java.lang.Object r2 = r2.f9767W
            Z1.c r2 = (Z1.c) r2
            boolean r2 = r2.n(r3, r0)
            if (r2 != 0) goto L_0x00f2
        L_0x00df:
            de.ozerov.fully.FullyActivity r2 = r1.f10649a
            de.ozerov.fully.V4 r2 = r2.f9928Q0
            de.ozerov.fully.n r2 = r2.f10445c
            if (r2 == 0) goto L_0x00ed
            boolean r2 = r2.l()
            if (r2 != 0) goto L_0x00f2
        L_0x00ed:
            de.ozerov.fully.FullyActivity r1 = r1.f10649a
            r1.moveTaskToBack(r0)
        L_0x00f2:
            return
        L_0x00f3:
            de.ozerov.fully.g4 r0 = r5.f10615V
            de.ozerov.fully.FullyActivity r1 = r0.f10649a
            boolean r1 = r1.w()
            if (r1 == 0) goto L_0x0136
            de.ozerov.fully.FullyActivity r1 = r0.f10649a
            boolean r1 = r1.f10980u0
            if (r1 != 0) goto L_0x0136
            de.ozerov.fully.FullyActivity r1 = r0.f10649a     // Catch:{ Exception -> 0x012f }
            d4.k r2 = r0.f10650b     // Catch:{ Exception -> 0x012f }
            java.lang.String r2 = r2.e2()     // Catch:{ Exception -> 0x012f }
            android.content.Intent r2 = n2.a.P0(r2)     // Catch:{ Exception -> 0x012f }
            java.lang.String r1 = de.ozerov.fully.C0794w0.K(r1, r2)     // Catch:{ Exception -> 0x012f }
            de.ozerov.fully.FullyActivity r2 = r0.f10649a
            boolean r2 = de.ozerov.fully.C0794w0.Z(r2)
            if (r2 == 0) goto L_0x0127
            boolean r2 = n2.a.C0()
            if (r2 == 0) goto L_0x0127
            de.ozerov.fully.FullyActivity r0 = r0.f10649a
            de.ozerov.fully.I1.c(r0, r1)
            goto L_0x0136
        L_0x0127:
            boolean r0 = de.ozerov.fully.P.f10240j
            if (r0 == 0) goto L_0x0136
            de.ozerov.fully.P.b(r1)
            goto L_0x0136
        L_0x012f:
            java.lang.String r0 = "g4"
            java.lang.String r1 = "Failed parsing single app intent URL"
            android.util.Log.e(r0, r1)
        L_0x0136:
            return
        L_0x0137:
            de.ozerov.fully.g4 r0 = r5.f10615V
            de.ozerov.fully.FullyActivity r1 = r0.f10649a
            java.lang.String r1 = de.ozerov.fully.C0794w0.r(r1)
            d4.k r2 = r0.f10650b
            java.lang.Boolean r2 = r2.T1()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0170
            d4.k r2 = r0.f10650b
            java.lang.String r2 = r2.U1()
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0170
            d4.k r2 = r0.f10650b     // Catch:{ Exception -> 0x016c }
            java.lang.String r2 = r2.U1()     // Catch:{ Exception -> 0x016c }
            android.content.Intent r2 = n2.a.P0(r2)     // Catch:{ Exception -> 0x016c }
            android.content.ComponentName r2 = r2.getComponent()     // Catch:{ Exception -> 0x016c }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x016c }
            goto L_0x0171
        L_0x016c:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0170:
            r2 = 0
        L_0x0171:
            de.ozerov.fully.FullyActivity r3 = r0.f10649a
            boolean r3 = r3.w()
            if (r3 == 0) goto L_0x01c0
            de.ozerov.fully.FullyActivity r3 = r0.f10649a
            boolean r3 = r3.f10980u0
            if (r3 != 0) goto L_0x01c0
            if (r1 == 0) goto L_0x018d
            de.ozerov.fully.FullyActivity r3 = r0.f10649a
            java.lang.String r3 = r3.getPackageName()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x01c0
        L_0x018d:
            if (r1 == 0) goto L_0x0195
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01c0
        L_0x0195:
            boolean r1 = de.ozerov.fully.C0794w0.f11032r
            if (r1 == 0) goto L_0x01a5
            d4.k r1 = r0.f10650b
            java.lang.Boolean r1 = r1.W()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01c0
        L_0x01a5:
            de.ozerov.fully.FullyActivity r1 = r0.f10649a
            boolean r1 = de.ozerov.fully.C0794w0.d0(r1)
            if (r1 == 0) goto L_0x01b9
            d4.k r1 = r0.f10650b
            java.lang.Boolean r1 = r1.V()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01c0
        L_0x01b9:
            de.ozerov.fully.FullyActivity r0 = r0.f10649a
            U.d r0 = r0.f9919H0
            r0.b()
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0691e4.run():void");
    }
}
