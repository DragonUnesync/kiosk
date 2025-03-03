package h;

import android.view.Window;
import n.m;
import n.x;
import o.C1274i0;
import v0.C1542o;

public final class q implements C1542o, C1274i0, x {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12232U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1000A f12233V;

    public /* synthetic */ q(C1000A a8, int i) {
        this.f12232U = i;
        this.f12233V = a8;
    }

    public void a(m mVar, boolean z) {
        boolean z6;
        int i;
        z zVar;
        switch (this.f12232U) {
            case 2:
                this.f12233V.r(mVar);
                return;
            default:
                m k8 = mVar.k();
                int i8 = 0;
                if (k8 != mVar) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    mVar = k8;
                }
                C1000A a8 = this.f12233V;
                z[] zVarArr = a8.f12055F0;
                if (zVarArr != null) {
                    i = zVarArr.length;
                } else {
                    i = 0;
                }
                while (true) {
                    if (i8 >= i) {
                        zVar = null;
                    } else {
                        zVar = zVarArr[i8];
                        if (zVar == null || zVar.f12252h != mVar) {
                            i8++;
                        }
                    }
                }
                if (zVar == null) {
                    return;
                }
                if (z6) {
                    a8.p(zVar.f12246a, zVar, k8);
                    a8.t(zVar, true);
                    return;
                }
                a8.t(zVar, z);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010c, code lost:
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v0.j0 i(android.view.View r20, v0.j0 r21) {
        /*
            r19 = this;
            r1 = r20
            r2 = r21
            r0 = 2
            r3 = 1
            int r5 = r21.d()
            r6 = r19
            h.A r7 = r6.f12233V
            r7.getClass()
            int r8 = r21.d()
            androidx.appcompat.widget.ActionBarContextView r9 = r7.p0
            r10 = 29
            if (r9 == 0) goto L_0x017c
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r9 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x017c
            androidx.appcompat.widget.ActionBarContextView r9 = r7.p0
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            androidx.appcompat.widget.ActionBarContextView r12 = r7.p0
            boolean r12 = r12.isShown()
            if (r12 == 0) goto L_0x0163
            android.graphics.Rect r12 = r7.f12072W0
            if (r12 != 0) goto L_0x0045
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r7.f12072W0 = r12
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r7.f12073X0 = r12
        L_0x0045:
            android.graphics.Rect r12 = r7.f12072W0
            android.graphics.Rect r13 = r7.f12073X0
            int r14 = r21.b()
            int r15 = r21.d()
            int r11 = r21.c()
            int r4 = r21.a()
            r12.set(r14, r15, r11, r4)
            android.view.ViewGroup r4 = r7.f12093u0
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r10) goto L_0x0068
            boolean r0 = o.w1.f14104a
            o.v1.a(r4, r12, r13)
            goto L_0x00aa
        L_0x0068:
            boolean r11 = o.w1.f14104a
            java.lang.String r14 = "ViewUtils"
            if (r11 != 0) goto L_0x0095
            o.w1.f14104a = r3
            java.lang.Class<android.view.View> r11 = android.view.View.class
            java.lang.String r15 = "computeFitSystemWindows"
            java.lang.Class[] r10 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0090 }
            java.lang.Class<android.graphics.Rect> r18 = android.graphics.Rect.class
            r17 = 0
            r10[r17] = r18     // Catch:{ NoSuchMethodException -> 0x0090 }
            r10[r3] = r18     // Catch:{ NoSuchMethodException -> 0x0090 }
            java.lang.reflect.Method r10 = r11.getDeclaredMethod(r15, r10)     // Catch:{ NoSuchMethodException -> 0x0090 }
            o.w1.f14105b = r10     // Catch:{ NoSuchMethodException -> 0x0090 }
            boolean r10 = r10.isAccessible()     // Catch:{ NoSuchMethodException -> 0x0090 }
            if (r10 != 0) goto L_0x0095
            java.lang.reflect.Method r10 = o.w1.f14105b     // Catch:{ NoSuchMethodException -> 0x0090 }
            r10.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x0090 }
            goto L_0x0095
        L_0x0090:
            java.lang.String r10 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r14, r10)
        L_0x0095:
            java.lang.reflect.Method r10 = o.w1.f14105b
            if (r10 == 0) goto L_0x00aa
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00a4 }
            r11 = 0
            r0[r11] = r12     // Catch:{ Exception -> 0x00a4 }
            r0[r3] = r13     // Catch:{ Exception -> 0x00a4 }
            r10.invoke(r4, r0)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00aa
        L_0x00a4:
            r0 = move-exception
            java.lang.String r4 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r14, r4, r0)
        L_0x00aa:
            int r0 = r12.top
            int r4 = r12.left
            int r10 = r12.right
            android.view.ViewGroup r11 = r7.f12093u0
            v0.j0 r11 = v0.C1510H.h(r11)
            if (r11 != 0) goto L_0x00ba
            r12 = 0
            goto L_0x00be
        L_0x00ba:
            int r12 = r11.b()
        L_0x00be:
            if (r11 != 0) goto L_0x00c2
            r11 = 0
            goto L_0x00c6
        L_0x00c2:
            int r11 = r11.c()
        L_0x00c6:
            int r13 = r9.topMargin
            if (r13 != r0) goto L_0x00d5
            int r13 = r9.leftMargin
            if (r13 != r4) goto L_0x00d5
            int r13 = r9.rightMargin
            if (r13 == r10) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r4 = 0
            goto L_0x00dc
        L_0x00d5:
            r9.topMargin = r0
            r9.leftMargin = r4
            r9.rightMargin = r10
            r4 = 1
        L_0x00dc:
            android.content.Context r10 = r7.f12078e0
            if (r0 <= 0) goto L_0x0106
            android.view.View r0 = r7.f12095w0
            if (r0 != 0) goto L_0x0106
            android.view.View r0 = new android.view.View
            r0.<init>(r10)
            r7.f12095w0 = r0
            r13 = 8
            r0.setVisibility(r13)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r14 = r9.topMargin
            r15 = 51
            r3 = -1
            r0.<init>(r3, r14, r15)
            r0.leftMargin = r12
            r0.rightMargin = r11
            android.view.ViewGroup r11 = r7.f12093u0
            android.view.View r12 = r7.f12095w0
            r11.addView(r12, r3, r0)
            goto L_0x012b
        L_0x0106:
            r13 = 8
            android.view.View r0 = r7.f12095w0
            if (r0 == 0) goto L_0x012b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r3 = r0.height
            int r14 = r9.topMargin
            if (r3 != r14) goto L_0x0120
            int r3 = r0.leftMargin
            if (r3 != r12) goto L_0x0120
            int r3 = r0.rightMargin
            if (r3 == r11) goto L_0x012b
        L_0x0120:
            r0.height = r14
            r0.leftMargin = r12
            r0.rightMargin = r11
            android.view.View r3 = r7.f12095w0
            r3.setLayoutParams(r0)
        L_0x012b:
            android.view.View r0 = r7.f12095w0
            if (r0 == 0) goto L_0x0131
            r3 = 1
            goto L_0x0132
        L_0x0131:
            r3 = 0
        L_0x0132:
            if (r3 == 0) goto L_0x0156
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0156
            android.view.View r0 = r7.f12095w0
            int r11 = r0.getWindowSystemUiVisibility()
            r11 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x014c
            r11 = 2131099654(0x7f060006, float:1.7811667E38)
            int r10 = j0.f.b(r10, r11)
            goto L_0x0153
        L_0x014c:
            r11 = 2131099653(0x7f060005, float:1.7811665E38)
            int r10 = j0.f.b(r10, r11)
        L_0x0153:
            r0.setBackgroundColor(r10)
        L_0x0156:
            boolean r0 = r7.f12051B0
            if (r0 != 0) goto L_0x015d
            if (r3 == 0) goto L_0x015d
            r8 = 0
        L_0x015d:
            r17 = r3
            r16 = r4
            r3 = 0
            goto L_0x0174
        L_0x0163:
            r13 = 8
            int r0 = r9.topMargin
            r3 = 0
            if (r0 == 0) goto L_0x0171
            r9.topMargin = r3
            r16 = 1
        L_0x016e:
            r17 = 0
            goto L_0x0174
        L_0x0171:
            r16 = 0
            goto L_0x016e
        L_0x0174:
            if (r16 == 0) goto L_0x0181
            androidx.appcompat.widget.ActionBarContextView r0 = r7.p0
            r0.setLayoutParams(r9)
            goto L_0x0181
        L_0x017c:
            r3 = 0
            r13 = 8
            r17 = 0
        L_0x0181:
            android.view.View r0 = r7.f12095w0
            if (r0 == 0) goto L_0x018e
            if (r17 == 0) goto L_0x0189
            r4 = 0
            goto L_0x018b
        L_0x0189:
            r4 = 8
        L_0x018b:
            r0.setVisibility(r4)
        L_0x018e:
            if (r5 == r8) goto L_0x01c3
            int r0 = r21.b()
            int r3 = r21.c()
            int r4 = r21.a()
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r5 < r7) goto L_0x01a8
            v0.Z r5 = new v0.Z
            r5.<init>(r2)
            goto L_0x01b7
        L_0x01a8:
            r7 = 29
            if (r5 < r7) goto L_0x01b2
            v0.Y r5 = new v0.Y
            r5.<init>(r2)
            goto L_0x01b7
        L_0x01b2:
            v0.X r5 = new v0.X
            r5.<init>(r2)
        L_0x01b7:
            m0.c r0 = m0.C1197c.b(r0, r8, r3, r4)
            r5.g(r0)
            v0.j0 r0 = r5.b()
            goto L_0x01c4
        L_0x01c3:
            r0 = r2
        L_0x01c4:
            java.util.WeakHashMap r2 = v0.C1510H.f15874a
            android.view.WindowInsets r2 = r0.f()
            if (r2 == 0) goto L_0x01da
            android.view.WindowInsets r3 = v0.C1551x.b(r1, r2)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x01da
            v0.j0 r0 = v0.j0.g(r1, r3)
        L_0x01da:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.q.i(android.view.View, v0.j0):v0.j0");
    }

    public boolean n(m mVar) {
        Window.Callback callback;
        switch (this.f12232U) {
            case 2:
                Window.Callback callback2 = this.f12233V.f12079f0.getCallback();
                if (callback2 == null) {
                    return true;
                }
                callback2.onMenuOpened(108, mVar);
                return true;
            default:
                if (mVar != mVar.k()) {
                    return true;
                }
                C1000A a8 = this.f12233V;
                if (!a8.f12098z0 || (callback = a8.f12079f0.getCallback()) == null || a8.f12060K0) {
                    return true;
                }
                callback.onMenuOpened(108, mVar);
                return true;
        }
    }
}
