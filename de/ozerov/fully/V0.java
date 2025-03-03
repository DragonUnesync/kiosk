package de.ozerov.fully;

import android.view.ViewTreeObserver;

public final /* synthetic */ class V0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ W0 f10430U;

    public /* synthetic */ V0(W0 w02) {
        this.f10430U = w02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r11 = this;
            de.ozerov.fully.W0 r0 = r11.f10430U
            r0.getClass()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.View r2 = r0.f10465a
            r2.getWindowVisibleDisplayFrame(r1)
            android.view.View r3 = r0.f10466b
            int r4 = r3.getSystemUiVisibility()
            int r5 = r1.bottom
            int r1 = r1.top
            int r5 = r5 - r1
            r2.getHeight()
            r3.getHeight()
            boolean r1 = n2.a.p0()
            de.ozerov.fully.FullyActivity r2 = r0.f10469f
            if (r1 == 0) goto L_0x0036
            r1 = r4 & 1024(0x400, float:1.435E-42)
            if (r1 != 0) goto L_0x0043
            r1 = r4 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0043
            int r1 = de.ozerov.fully.C0794w0.Q(r2)
        L_0x0034:
            int r5 = r5 + r1
            goto L_0x0043
        L_0x0036:
            r1 = r4 & 1024(0x400, float:1.435E-42)
            if (r1 != 0) goto L_0x003e
            r1 = r4 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0043
        L_0x003e:
            int r1 = de.ozerov.fully.C0794w0.Q(r2)
            goto L_0x0034
        L_0x0043:
            android.view.View r1 = r0.f10465a
            android.view.View r1 = r1.getRootView()
            int r1 = r1.getHeight()
            de.ozerov.fully.FullyActivity r2 = r0.f10469f
            int r2 = de.ozerov.fully.C0794w0.N(r2)
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            boolean r3 = r3.f10981v0
            if (r3 == 0) goto L_0x005b
            goto L_0x0155
        L_0x005b:
            int r3 = r0.f10470g
            if (r2 == r3) goto L_0x0065
            int r3 = r0.f10468d
            if (r1 != r3) goto L_0x0065
            goto L_0x0155
        L_0x0065:
            int r3 = r0.f10467c
            r4 = -1
            if (r3 == r4) goto L_0x014f
            int r6 = r0.f10468d
            if (r6 != r4) goto L_0x0070
            goto L_0x014f
        L_0x0070:
            if (r5 != r3) goto L_0x0074
            if (r1 == r6) goto L_0x0155
        L_0x0074:
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            d4.k r3 = r3.f9961z0
            r3.getClass()
            java.lang.Object r3 = r3.f9767W     // Catch:{ Exception -> 0x008c }
            Z1.c r3 = (Z1.c) r3     // Catch:{ Exception -> 0x008c }
            java.lang.String r6 = "keyboardHeightRatio"
            java.lang.String r7 = "20"
            java.lang.String r3 = r3.r(r6, r7)     // Catch:{ Exception -> 0x008c }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x008c }
            goto L_0x008e
        L_0x008c:
            r3 = 20
        L_0x008e:
            int r3 = 100 - r3
            int r3 = r3 * r1
            int r3 = r3 / 100
            java.lang.String r6 = "adjustContentHeightUponKeyboard"
            r7 = 1
            r8 = 0
            if (r5 >= r3) goto L_0x00d4
            boolean r3 = de.ozerov.fully.C0794w0.f11032r
            if (r3 != 0) goto L_0x00bc
            de.ozerov.fully.C0794w0.f11032r = r7
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            L0.c r3 = L0.c.a(r3)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r9 = "com.fullykiosk.singleapp.event.keyboard_show"
            r4.<init>(r9)
            r3.c(r4)
            java.lang.String r3 = "showKeyboard"
            de.ozerov.fully.U0.e(r3, r8)
            de.ozerov.fully.FullyActivity r4 = r0.f10469f
            B3.q r4 = r4.f9935X0
            r4.b0(r3, r8)
        L_0x00bc:
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            d4.k r3 = r3.f9961z0
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            boolean r3 = r3.n(r6, r7)
            if (r3 == 0) goto L_0x0148
            android.view.ViewGroup$LayoutParams r3 = r0.e
            r3.height = r5
            android.view.View r3 = r0.f10465a
            r3.requestLayout()
            goto L_0x0148
        L_0x00d4:
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            d4.k r3 = r3.f9961z0
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            java.lang.String r9 = "forceShowKeyboard"
            r10 = 0
            boolean r3 = r3.n(r9, r10)
            if (r3 == 0) goto L_0x0108
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            java.lang.String r9 = ""
            boolean r3 = r3.y(r9)
            if (r3 == 0) goto L_0x0108
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            android.view.View r4 = r3.getCurrentFocus()
            if (r4 == 0) goto L_0x0148
            java.lang.String r6 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r6)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            android.os.IBinder r4 = r4.getWindowToken()
            r6 = 2
            r3.toggleSoftInputFromWindow(r4, r6, r10)
            goto L_0x0148
        L_0x0108:
            boolean r3 = de.ozerov.fully.C0794w0.f11032r
            if (r3 == 0) goto L_0x0131
            de.ozerov.fully.C0794w0.f11032r = r10
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            L0.c r3 = L0.c.a(r3)
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r10 = "com.fullykiosk.singleapp.event.keyboard_hide"
            r9.<init>(r10)
            r3.c(r9)
            java.lang.String r3 = "hideKeyboard"
            de.ozerov.fully.U0.e(r3, r8)
            de.ozerov.fully.FullyActivity r9 = r0.f10469f
            B3.q r9 = r9.f9935X0
            r9.b0(r3, r8)
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            de.ozerov.fully.W3 r3 = r3.f9922K0
            r3.g()
        L_0x0131:
            de.ozerov.fully.FullyActivity r3 = r0.f10469f
            d4.k r3 = r3.f9961z0
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            boolean r3 = r3.n(r6, r7)
            if (r3 == 0) goto L_0x0148
            android.view.ViewGroup$LayoutParams r3 = r0.e
            r3.height = r4
            android.view.View r3 = r0.f10465a
            r3.requestLayout()
        L_0x0148:
            r0.f10467c = r5
            r0.f10468d = r1
            r0.f10470g = r2
            goto L_0x0155
        L_0x014f:
            r0.f10467c = r5
            r0.f10468d = r1
            r0.f10470g = r2
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.V0.onGlobalLayout():void");
    }
}
