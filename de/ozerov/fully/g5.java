package de.ozerov.fully;

import P5.M;
import Z1.c;
import android.content.Context;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import d4.k;
import java.util.HashMap;
import n2.a;

public final class g5 {

    /* renamed from: x  reason: collision with root package name */
    public static int f10658x;

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f10659a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f10660b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f10661c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f10662d;
    public final SwipeRefreshLayout e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f10663f;

    /* renamed from: g  reason: collision with root package name */
    public MyWebView f10664g;

    /* renamed from: h  reason: collision with root package name */
    public C0737m2 f10665h;
    public C0778t2 i;

    /* renamed from: j  reason: collision with root package name */
    public final i5 f10666j;

    /* renamed from: k  reason: collision with root package name */
    public final V4 f10667k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10668l = false;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f10669m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10670n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10671o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10672p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10673q = true;

    /* renamed from: r  reason: collision with root package name */
    public String f10674r;

    /* renamed from: s  reason: collision with root package name */
    public String f10675s;

    /* renamed from: t  reason: collision with root package name */
    public final C0780t4 f10676t;

    /* renamed from: u  reason: collision with root package name */
    public final k f10677u;

    /* renamed from: v  reason: collision with root package name */
    public final Handler f10678v = new Handler();

    /* renamed from: w  reason: collision with root package name */
    public int f10679w = -1;

    /* JADX WARNING: type inference failed for: r13v18, types: [de.ozerov.fully.q2, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0 A[SYNTHETIC, Splitter:B:33:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0131 A[SYNTHETIC, Splitter:B:46:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g5(de.ozerov.fully.C0780t4 r10, de.ozerov.fully.i5 r11, de.ozerov.fully.V4 r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = "top"
            java.lang.String r1 = "left"
            java.lang.String r2 = "g5"
            r9.<init>()
            r3 = 0
            r9.f10668l = r3
            r9.f10669m = r3
            r9.f10670n = r3
            r4 = 1
            r9.f10671o = r4
            r9.f10672p = r4
            r9.f10673q = r4
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            r9.f10678v = r5
            r5 = -1
            r9.f10679w = r5
            r9.f10676t = r10
            d4.k r5 = new d4.k
            r5.<init>((android.content.Context) r10, (int) r4)
            r9.f10677u = r5
            r9.f10666j = r11
            r9.f10667k = r12
            r9.f10668l = r13
            r9.f10669m = r14
            boolean r12 = r11.f10720o     // Catch:{ Exception -> 0x004b }
            android.widget.FrameLayout r13 = r11.e
            if (r12 == 0) goto L_0x004e
            if (r14 == 0) goto L_0x003b
            goto L_0x004e
        L_0x003b:
            android.view.LayoutInflater r12 = r10.getLayoutInflater()     // Catch:{ Exception -> 0x004b }
            r6 = 2131558601(0x7f0d00c9, float:1.8742522E38)
            android.view.View r12 = r12.inflate(r6, r13, r3)     // Catch:{ Exception -> 0x004b }
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12     // Catch:{ Exception -> 0x004b }
            r9.f10659a = r12     // Catch:{ Exception -> 0x004b }
            goto L_0x005d
        L_0x004b:
            r10 = move-exception
            goto L_0x0265
        L_0x004e:
            android.view.LayoutInflater r12 = r10.getLayoutInflater()     // Catch:{ Exception -> 0x004b }
            r6 = 2131558602(0x7f0d00ca, float:1.8742524E38)
            android.view.View r12 = r12.inflate(r6, r13, r3)     // Catch:{ Exception -> 0x004b }
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12     // Catch:{ Exception -> 0x004b }
            r9.f10659a = r12     // Catch:{ Exception -> 0x004b }
        L_0x005d:
            java.lang.Object r12 = r5.f9767W
            Z1.c r12 = (Z1.c) r12
            java.lang.String r13 = "webPopupOptions"
            java.lang.String r5 = ""
            java.lang.String r12 = r12.r(r13, r5)
            java.lang.String r13 = " "
            java.lang.String r12 = r12.replace(r13, r5)
            java.lang.String r13 = ","
            java.lang.String r5 = "="
            java.util.HashMap r12 = n2.a.d1(r12, r13, r5)
            if (r14 == 0) goto L_0x016f
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x016f
            android.view.ViewGroup r13 = r9.f10659a
            r14 = 2131362634(0x7f0a034a, float:1.8345054E38)
            android.view.View r13 = r13.findViewById(r14)
            android.view.ViewGroup r14 = r9.f10659a
            r5 = 2131362387(0x7f0a0253, float:1.8344553E38)
            android.view.View r14 = r14.findViewById(r5)
            java.lang.String r5 = "width"
            boolean r6 = r12.containsKey(r5)
            if (r6 == 0) goto L_0x00d7
            android.view.ViewGroup$LayoutParams r6 = r13.getLayoutParams()     // Catch:{ Exception -> 0x00bf }
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6     // Catch:{ Exception -> 0x00bf }
            java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00bf }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x00bf }
            r6.width = r5     // Catch:{ Exception -> 0x00bf }
            boolean r5 = r12.containsKey(r1)     // Catch:{ Exception -> 0x00bf }
            if (r5 == 0) goto L_0x00c2
            java.lang.Object r1 = r12.get(r1)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00bf }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x00bf }
            r6.leftMargin = r1     // Catch:{ Exception -> 0x00bf }
            r1 = 0
            goto L_0x00c3
        L_0x00bf:
            r1 = move-exception
            r5 = 0
            goto L_0x00cb
        L_0x00c2:
            r1 = 1
        L_0x00c3:
            r13.setLayoutParams(r6)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00d8
        L_0x00c7:
            r5 = move-exception
            r8 = r5
            r5 = r1
            r1 = r8
        L_0x00cb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to set popup width due to "
            r6.<init>(r7)
            Q0.g.z(r1, r6, r2)
            r1 = r5
            goto L_0x00d8
        L_0x00d7:
            r1 = 0
        L_0x00d8:
            java.lang.String r5 = "height"
            boolean r6 = r12.containsKey(r5)
            if (r6 == 0) goto L_0x0117
            android.view.ViewGroup$LayoutParams r6 = r13.getLayoutParams()     // Catch:{ Exception -> 0x0105 }
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6     // Catch:{ Exception -> 0x0105 }
            java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0105 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0105 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0105 }
            r6.height = r5     // Catch:{ Exception -> 0x0105 }
            boolean r5 = r12.containsKey(r0)     // Catch:{ Exception -> 0x0105 }
            if (r5 == 0) goto L_0x0107
            java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0105 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0105 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0105 }
            r6.topMargin = r0     // Catch:{ Exception -> 0x0105 }
            goto L_0x0109
        L_0x0105:
            r0 = move-exception
            goto L_0x010d
        L_0x0107:
            r1 = r1 | 16
        L_0x0109:
            r13.setLayoutParams(r6)     // Catch:{ Exception -> 0x0105 }
            goto L_0x0117
        L_0x010d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to set popup height due to "
            r5.<init>(r6)
            Q0.g.z(r0, r5, r2)
        L_0x0117:
            if (r1 == 0) goto L_0x0124
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.gravity = r1
            r13.setLayoutParams(r0)
        L_0x0124:
            android.view.ViewGroup r0 = r9.f10659a
            r0.setClickable(r4)
            java.lang.String r0 = "background"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x014d
            android.view.ViewGroup r1 = r9.f10659a     // Catch:{ Exception -> 0x0141 }
            java.lang.Object r12 = r12.get(r0)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0141 }
            int r12 = android.graphics.Color.parseColor(r12)     // Catch:{ Exception -> 0x0141 }
            r1.setBackgroundColor(r12)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0155
        L_0x0141:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to set background color due to "
            r0.<init>(r1)
            Q0.g.z(r12, r0, r2)
            goto L_0x0155
        L_0x014d:
            android.view.ViewGroup r12 = r9.f10659a
            r0 = -1056964609(0xffffffffc0ffffff, float:-7.9999995)
            r12.setBackgroundColor(r0)
        L_0x0155:
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13.setBackgroundColor(r12)
            r12 = 1092616192(0x41200000, float:10.0)
            int r12 = n2.a.p(r12, r10)
            float r12 = (float) r12
            r13.setElevation(r12)
            r14.setVisibility(r3)
            de.ozerov.fully.b5 r12 = new de.ozerov.fully.b5
            r12.<init>(r9, r11)
            r14.setOnClickListener(r12)
        L_0x016f:
            android.view.ViewGroup r12 = r9.f10659a
            r13 = 2131362400(0x7f0a0260, float:1.834458E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
            r9.f10660b = r12
            android.view.ViewGroup r12 = r9.f10659a
            r13 = 2131362642(0x7f0a0352, float:1.834507E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r9.f10663f = r12
            android.view.ViewGroup r12 = r9.f10659a
            r13 = 2131362531(0x7f0a02e3, float:1.8344845E38)
            android.view.View r12 = r12.findViewById(r13)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r12 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r12
            r9.e = r12
            if (r12 == 0) goto L_0x01a5
            r13 = 2131099714(0x7f060042, float:1.781179E38)
            r14 = 2131099695(0x7f06002f, float:1.781175E38)
            int[] r13 = new int[]{r13, r14}
            r12.setColorSchemeResources(r13)
        L_0x01a5:
            android.view.ViewGroup r12 = r9.f10659a
            r13 = 2131361872(0x7f0a0050, float:1.8343509E38)
            android.view.View r12 = r12.findViewById(r13)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r9.f10662d = r12
            d4.k r13 = r9.f10677u
            java.lang.Object r14 = r13.f9768X
            android.content.Context r14 = (android.content.Context) r14
            android.content.res.Resources r14 = r14.getResources()
            r0 = 2131099696(0x7f060030, float:1.7811752E38)
            int r14 = r14.getColor(r0)
            java.lang.Object r13 = r13.f9767W
            Z1.c r13 = (Z1.c) r13
            java.lang.String r0 = "addressBarBgColor"
            int r13 = r13.q(r0, r14)
            r12.setBackgroundColor(r13)
            android.view.ViewGroup r12 = r9.f10659a
            r13 = 2131361873(0x7f0a0051, float:1.834351E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.EditText r12 = (android.widget.EditText) r12
            r9.f10661c = r12
            de.ozerov.fully.e3 r13 = new de.ozerov.fully.e3
            r13.<init>(r9, r10, r4)
            r12.setOnEditorActionListener(r13)
            de.ozerov.fully.c5 r13 = new de.ozerov.fully.c5
            r13.<init>(r9, r10, r3)
            r12.setOnFocusChangeListener(r13)
            android.view.ViewGroup r12 = r9.f10659a
            r13 = 2131362640(0x7f0a0350, float:1.8345066E38)
            android.view.View r12 = r12.findViewById(r13)
            de.ozerov.fully.MyWebView r12 = (de.ozerov.fully.MyWebView) r12
            r9.f10664g = r12
            r12.setUniversalActivity(r10)
            de.ozerov.fully.MyWebView r12 = r9.f10664g
            r12.setWebTab(r9)
            d4.k r12 = r9.f10677u
            java.lang.Boolean r12 = r12.C1()
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0216
            de.ozerov.fully.MyWebView r12 = r9.f10664g
            r13 = 8
            r12.setVisibility(r13)
            goto L_0x021b
        L_0x0216:
            de.ozerov.fully.MyWebView r12 = r9.f10664g
            r12.setVisibility(r3)
        L_0x021b:
            de.ozerov.fully.MyWebView r12 = r9.f10664g
            de.ozerov.fully.c5 r13 = new de.ozerov.fully.c5
            r13.<init>(r9, r10, r4)
            r12.setOnFocusChangeListener(r13)
            r9.b()
            d4.k r12 = r9.f10677u
            java.lang.Boolean r12 = r12.B2()
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0240
            boolean r12 = r10 instanceof de.ozerov.fully.FullyActivity
            if (r12 == 0) goto L_0x0240
            de.ozerov.fully.MyWebView r12 = r9.f10664g
            r13 = r10
            de.ozerov.fully.FullyActivity r13 = (de.ozerov.fully.FullyActivity) r13
            r12.c(r13)
        L_0x0240:
            boolean r12 = r10 instanceof de.ozerov.fully.FullyActivity
            if (r12 == 0) goto L_0x0257
            de.ozerov.fully.MyWebView r12 = r9.f10664g
            de.ozerov.fully.FullyActivity r10 = (de.ozerov.fully.FullyActivity) r10
            r12.getClass()
            de.ozerov.fully.q2 r13 = new de.ozerov.fully.q2
            r13.<init>()
            r13.f10897a = r10
            java.lang.String r10 = "FullyLicense"
            r12.addJavascriptInterface(r13, r10)
        L_0x0257:
            de.ozerov.fully.Y2 r10 = r11.f10727v
            if (r10 == 0) goto L_0x0264
            java.lang.String r11 = r11.f10728w
            if (r11 == 0) goto L_0x0264
            de.ozerov.fully.MyWebView r12 = r9.f10664g
            r12.addJavascriptInterface(r10, r11)
        L_0x0264:
            return
        L_0x0265:
            java.lang.String r11 = "Unable to inflate WebTab, missing Webview?"
            android.util.Log.e(r2, r11)
            r10.printStackTrace()
            r10 = 0
            r9.f10659a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.g5.<init>(de.ozerov.fully.t4, de.ozerov.fully.i5, de.ozerov.fully.V4, boolean, boolean):void");
    }

    public static int a(g5 g5Var, MotionEvent motionEvent, MotionEvent motionEvent2, float f8) {
        g5Var.getClass();
        if (motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
            return 0;
        }
        int y8 = (int) (motionEvent2.getY() - motionEvent.getY());
        if (Math.abs((int) (motionEvent2.getX() - motionEvent.getX())) <= 100 || Math.abs(y8) >= 100 || Math.abs(f8) <= 120.0f) {
            return 0;
        }
        if (f8 > 0.0f) {
            return -1;
        }
        return 1;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, android.view.View$OnCreateContextMenuListener] */
    /* JADX WARNING: type inference failed for: r12v8, types: [android.view.View$OnLongClickListener, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v10, types: [de.ozerov.fully.Z2, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(33:117|(1:119)|121|(3:122|123|(1:125)(1:128))|130|131|132|135|(1:137)|138|139|140|143|(3:145|(1:147)(1:148)|149)|150|151|152|153|154|157|158|(1:160)|163|(2:164|165)|168|(2:169|170)|173|(2:175|(1:177)(1:178))|179|180|(1:(1:184)(2:185|186))|187|191) */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x040e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x040f, code lost:
        Q0.g.x(r6, new java.lang.StringBuilder("Failed to setup cache settings due to "), "g5");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00db, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e0, code lost:
        r8 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x040a */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x033c A[Catch:{ Exception -> 0x0344 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0346 A[Catch:{ Exception -> 0x0344 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x036c A[Catch:{ Exception -> 0x0376 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0378 A[Catch:{ Exception -> 0x0376 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x041f A[Catch:{ Error -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04a7 A[Catch:{ Exception -> 0x04b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04a8 A[Catch:{ Exception -> 0x04b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e0 A[ExcHandler: Error (e java.lang.Error), Splitter:B:20:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r13 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.String r3 = "g5"
            de.ozerov.fully.MyWebView r4 = r13.f10664g
            if (r4 != 0) goto L_0x000a
            return
        L_0x000a:
            android.webkit.WebSettings r4 = r4.getSettings()
            d4.k r5 = r13.f10677u
            java.lang.Object r6 = r5.f9767W
            Z1.c r6 = (Z1.c) r6
            java.lang.String r7 = "touchInteraction"
            boolean r6 = r6.n(r7, r2)
            r13.f10673q = r6
            java.lang.String r6 = "webviewDragging"
            java.lang.Object r7 = r5.f9767W
            Z1.c r7 = (Z1.c) r7
            boolean r6 = r7.n(r6, r2)
            r13.f10671o = r6
            java.lang.String r6 = "webviewScrolling"
            boolean r8 = r7.n(r6, r2)
            r13.f10672p = r8
            de.ozerov.fully.t2 r8 = r13.i
            de.ozerov.fully.t4 r9 = r13.f10676t
            if (r8 != 0) goto L_0x003d
            de.ozerov.fully.t2 r8 = new de.ozerov.fully.t2
            r8.<init>(r9, r13)
            r13.i = r8
        L_0x003d:
            de.ozerov.fully.MyWebView r8 = r13.f10664g
            de.ozerov.fully.t2 r10 = r13.i
            r8.setWebViewClient(r10)
            java.lang.String r8 = "enablePostIntercept"
            boolean r8 = r7.n(r8, r1)
            java.lang.String r10 = "fullyPostInterception"
            if (r8 == 0) goto L_0x006b
            de.ozerov.fully.t2 r8 = r13.i
            de.ozerov.fully.MyWebView r11 = r13.f10664g
            r8.getClass()
            de.ozerov.fully.Z2 r12 = new de.ozerov.fully.Z2
            r12.<init>()
            r12.f10531a = r8
            r11.addJavascriptInterface(r12, r10)
            r8.f10965a = r2
            d4.k r8 = new d4.k
            android.content.Context r10 = r11.getContext()
            r8.<init>((android.content.Context) r10, (int) r2)
            goto L_0x0074
        L_0x006b:
            de.ozerov.fully.t2 r8 = r13.i
            de.ozerov.fully.MyWebView r11 = r13.f10664g
            r8.f10965a = r1
            r11.removeJavascriptInterface(r10)
        L_0x0074:
            java.lang.String r8 = "enableFullscreenVideos"
            boolean r8 = r7.n(r8, r2)
            if (r8 == 0) goto L_0x0089
            de.ozerov.fully.n2 r8 = new de.ozerov.fully.n2
            r8.<init>(r9, r13)
            r13.f10665h = r8
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setWebChromeClient(r8)
            goto L_0x0095
        L_0x0089:
            de.ozerov.fully.m2 r8 = new de.ozerov.fully.m2
            r8.<init>(r9, r13)
            r13.f10665h = r8
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setWebChromeClient(r8)
        L_0x0095:
            boolean r8 = n2.a.p0()     // Catch:{ Exception -> 0x00a8, Error -> 0x00a6 }
            if (r8 == 0) goto L_0x00be
            de.ozerov.fully.MyWebView r8 = r13.f10664g     // Catch:{ Exception -> 0x00a8, Error -> 0x00a6 }
            de.ozerov.fully.u2 r10 = new de.ozerov.fully.u2     // Catch:{ Exception -> 0x00a8, Error -> 0x00a6 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x00a8, Error -> 0x00a6 }
            r8.setWebViewRenderProcessClient(r10)     // Catch:{ Exception -> 0x00a8, Error -> 0x00a6 }
            goto L_0x00be
        L_0x00a6:
            r8 = move-exception
            goto L_0x00a9
        L_0x00a8:
            r8 = move-exception
        L_0x00a9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to set webview render process client due to "
            r10.<init>(r11)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            android.util.Log.w(r3, r8)
        L_0x00be:
            int r8 = n2.a.b0(r9)     // Catch:{ Exception -> 0x00e2, Error -> 0x00e0 }
            r10 = 33
            if (r8 >= r10) goto L_0x00f8
            java.lang.String r8 = "FORCE_DARK"
            boolean r8 = G5.s.t(r8)     // Catch:{ Exception -> 0x00e2, Error -> 0x00e0 }
            if (r8 == 0) goto L_0x00f8
            java.lang.String r8 = "webviewDarkModeV2"
            java.lang.String r10 = "1"
            java.lang.String r8 = r7.r(r8, r10)     // Catch:{ Exception -> 0x00db, Error -> 0x00e0 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x00db, Error -> 0x00e0 }
            goto L_0x00dc
        L_0x00db:
            r8 = 1
        L_0x00dc:
            j2.C1121b.a(r4, r8)     // Catch:{ Exception -> 0x00e2, Error -> 0x00e0 }
            goto L_0x00f8
        L_0x00e0:
            r8 = move-exception
            goto L_0x00e3
        L_0x00e2:
            r8 = move-exception
        L_0x00e3:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to set dark mode due to "
            r10.<init>(r11)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            android.util.Log.w(r3, r8)
        L_0x00f8:
            r4.setJavaScriptEnabled(r2)     // Catch:{ Exception -> 0x011c }
            r4.setAllowUniversalAccessFromFileURLs(r2)     // Catch:{ Exception -> 0x011c }
            r4.setAllowFileAccessFromFileURLs(r2)     // Catch:{ Exception -> 0x011c }
            r4.setAllowContentAccess(r2)     // Catch:{ Exception -> 0x011c }
            r4.setAllowFileAccess(r2)     // Catch:{ Exception -> 0x011c }
            java.lang.String r8 = "webviewMixedContent"
            java.lang.String r10 = "2"
            java.lang.String r8 = r7.r(r8, r10)     // Catch:{ Exception -> 0x0114 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0115
        L_0x0114:
            r8 = 2
        L_0x0115:
            r4.setMixedContentMode(r8)     // Catch:{ Exception -> 0x011c }
            r4.setMediaPlaybackRequiresUserGesture(r1)     // Catch:{ Exception -> 0x011c }
            goto L_0x0127
        L_0x011c:
            r8 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to set Webview settings due to "
            r10.<init>(r11)
            Q0.g.x(r8, r10, r3)
        L_0x0127:
            r8 = -1
            r4.setDomStorageEnabled(r2)     // Catch:{ Exception -> 0x0132 }
            r4.setDatabaseEnabled(r2)     // Catch:{ Exception -> 0x0132 }
            r4.setCacheMode(r8)     // Catch:{ Exception -> 0x0132 }
            goto L_0x013d
        L_0x0132:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Failed to set Webview storage settings due to "
            r11.<init>(r12)
            Q0.g.x(r10, r11, r3)
        L_0x013d:
            boolean r10 = r13.f10673q
            if (r10 != 0) goto L_0x014c
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setFocusable(r1)
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setFocusableInTouchMode(r1)
            goto L_0x0183
        L_0x014c:
            java.lang.String r10 = "softKeyboard"
            boolean r10 = r7.n(r10, r2)
            if (r10 != 0) goto L_0x016c
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setFocusable(r1)
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setFocusableInTouchMode(r2)
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            android.view.ViewParent r10 = r10.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r11 = 393216(0x60000, float:5.51013E-40)
            r10.setDescendantFocusability(r11)
            goto L_0x0183
        L_0x016c:
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setFocusable(r2)
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setFocusableInTouchMode(r2)
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            android.view.ViewParent r10 = r10.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r11 = 131072(0x20000, float:1.83671E-40)
            r10.setDescendantFocusability(r11)
        L_0x0183:
            java.lang.String r10 = "webviewOverscroll"
            boolean r10 = r7.n(r10, r2)
            if (r10 == 0) goto L_0x0191
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setOverScrollMode(r2)
            goto L_0x0196
        L_0x0191:
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setOverScrollMode(r0)
        L_0x0196:
            java.lang.String r10 = "webviewLongTap"
            boolean r10 = r7.n(r10, r2)
            r11 = 0
            if (r10 != 0) goto L_0x01aa
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            de.ozerov.fully.d5 r12 = new de.ozerov.fully.d5
            r12.<init>()
            r10.setOnLongClickListener(r12)
            goto L_0x01af
        L_0x01aa:
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setOnLongClickListener(r11)
        L_0x01af:
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setLongClickable(r2)
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            de.ozerov.fully.X4 r12 = new de.ozerov.fully.X4
            r12.<init>()
            r10.setOnCreateContextMenuListener(r12)
            boolean r10 = r13.f10671o
            if (r10 == 0) goto L_0x01d2
            boolean r10 = r13.f10672p
            if (r10 != 0) goto L_0x01c7
            goto L_0x01d2
        L_0x01c7:
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setVerticalScrollBarEnabled(r2)
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setHorizontalScrollBarEnabled(r2)
            goto L_0x01dc
        L_0x01d2:
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setVerticalScrollBarEnabled(r1)
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            r10.setHorizontalScrollBarEnabled(r1)
        L_0x01dc:
            de.ozerov.fully.MyWebView r10 = r13.f10664g
            boolean r6 = r7.n(r6, r2)
            r10.setScrollingEnabled(r6)
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            boolean r10 = r13.f10673q
            r6.setMousePointerEnabled(r10)
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            de.ozerov.fully.Y4 r10 = new de.ozerov.fully.Y4
            r10.<init>(r13)
            r6.setOnGenericMotionListener(r10)
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            C3.k r10 = new C3.k
            r12 = 6
            r10.<init>(r12, r13)
            r6.setOnTouchListener(r10)
            java.lang.Boolean r6 = r5.C1()
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0210
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            r6.setVisibility(r1)
        L_0x0210:
            android.view.ViewGroup r6 = r13.f10662d
            java.lang.Object r10 = r5.f9768X
            android.content.Context r10 = (android.content.Context) r10
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131099696(0x7f060030, float:1.7811752E38)
            int r10 = r10.getColor(r12)
            java.lang.String r12 = "addressBarBgColor"
            int r10 = r7.q(r12, r10)
            r6.setBackgroundColor(r10)
            de.ozerov.fully.i5 r6 = r13.f10666j
            boolean r6 = r6.f10715j
            if (r6 == 0) goto L_0x025c
            boolean r6 = r13.f10672p
            if (r6 == 0) goto L_0x024e
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            android.view.GestureDetector r10 = new android.view.GestureDetector
            de.ozerov.fully.f5 r12 = new de.ozerov.fully.f5
            r12.<init>(r13, r1)
            r10.<init>(r9, r12)
            r6.setGestureDetectorScroll(r10)
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            de.ozerov.fully.Z4 r10 = new de.ozerov.fully.Z4
            r10.<init>(r13)
            r6.setOnScrollChangedCallback(r10)
            goto L_0x0258
        L_0x024e:
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            r6.setGestureDetectorScroll(r11)
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            r6.setOnScrollChangedCallback(r11)
        L_0x0258:
            r13.l(r1)
            goto L_0x0269
        L_0x025c:
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            r6.setGestureDetectorScroll(r11)
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            r6.setOnScrollChangedCallback(r11)
            r13.f(r1)
        L_0x0269:
            java.lang.String r6 = "swipeNavigation"
            boolean r6 = r7.n(r6, r1)
            if (r6 == 0) goto L_0x0281
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            android.view.GestureDetector r10 = new android.view.GestureDetector
            de.ozerov.fully.f5 r12 = new de.ozerov.fully.f5
            r12.<init>(r13, r2)
            r10.<init>(r9, r12)
            r6.setGestureDetectorSwipe(r10)
            goto L_0x029e
        L_0x0281:
            java.lang.String r6 = "swipeTabs"
            boolean r6 = r7.n(r6, r1)
            if (r6 == 0) goto L_0x0299
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            android.view.GestureDetector r10 = new android.view.GestureDetector
            de.ozerov.fully.f5 r12 = new de.ozerov.fully.f5
            r12.<init>(r13, r0)
            r10.<init>(r9, r12)
            r6.setGestureDetectorSwipe(r10)
            goto L_0x029e
        L_0x0299:
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            r6.setGestureDetectorSwipe(r11)
        L_0x029e:
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            boolean r10 = de.ozerov.fully.C0794w0.e0(r9)
            r6.setNetworkAvailable(r10)
            r4.setSupportMultipleWindows(r2)
            java.lang.String r6 = "enablePopups"
            boolean r6 = r7.n(r6, r1)
            r4.setJavaScriptCanOpenWindowsAutomatically(r6)
            java.lang.String r6 = r5.v2()
            java.lang.String r10 = "0"
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x02cd
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            java.lang.String r6 = r6.f10133m0
            if (r6 == 0) goto L_0x02cd
            r4.setUserAgentString(r11)
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            r6.f10133m0 = r11
            goto L_0x030c
        L_0x02cd:
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            java.lang.String r6 = r6.f10133m0
            if (r6 == 0) goto L_0x02ed
            java.lang.String r12 = r5.v2()
            boolean r6 = r6.equals(r12)
            if (r6 != 0) goto L_0x02ed
            java.lang.String r6 = r5.v2()
            r4.setUserAgentString(r6)
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            java.lang.String r10 = r5.v2()
            r6.f10133m0 = r10
            goto L_0x030c
        L_0x02ed:
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            java.lang.String r6 = r6.f10133m0
            if (r6 != 0) goto L_0x030c
            java.lang.String r6 = r5.v2()
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x030c
            java.lang.String r6 = r5.v2()
            r4.setUserAgentString(r6)
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            java.lang.String r10 = r5.v2()
            r6.f10133m0 = r10
        L_0x030c:
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            java.lang.String r10 = r4.getUserAgentString()
            r6.f10134n0 = r10
            java.lang.String r6 = "geoLocationAccess"
            boolean r6 = r7.n(r6, r1)
            if (r6 == 0) goto L_0x032b
            r4.setGeolocationEnabled(r2)
            java.io.File r6 = r9.getFilesDir()
            java.lang.String r6 = r6.getPath()
            r4.setGeolocationDatabasePath(r6)
            goto L_0x032e
        L_0x032b:
            r4.setGeolocationEnabled(r1)
        L_0x032e:
            java.lang.Boolean r6 = r5.B2()     // Catch:{ Exception -> 0x0344 }
            boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x0344 }
            if (r6 == 0) goto L_0x0346
            boolean r6 = r9 instanceof de.ozerov.fully.FullyActivity     // Catch:{ Exception -> 0x0344 }
            if (r6 == 0) goto L_0x0346
            de.ozerov.fully.MyWebView r6 = r13.f10664g     // Catch:{ Exception -> 0x0344 }
            de.ozerov.fully.FullyActivity r9 = (de.ozerov.fully.FullyActivity) r9     // Catch:{ Exception -> 0x0344 }
            r6.c(r9)     // Catch:{ Exception -> 0x0344 }
            goto L_0x0364
        L_0x0344:
            r6 = move-exception
            goto L_0x035a
        L_0x0346:
            de.ozerov.fully.MyWebView r6 = r13.f10664g     // Catch:{ Exception -> 0x0344 }
            r6.hashCode()     // Catch:{ Exception -> 0x0344 }
            java.lang.String r9 = "fully"
            r6.removeJavascriptInterface(r9)     // Catch:{ Exception -> 0x0344 }
            de.ozerov.fully.U0 r9 = r6.f10118U     // Catch:{ Exception -> 0x0344 }
            if (r9 == 0) goto L_0x0364
            de.ozerov.fully.U0.a(r9)     // Catch:{ Exception -> 0x0344 }
            r6.f10118U = r11     // Catch:{ Exception -> 0x0344 }
            goto L_0x0364
        L_0x035a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to setup JS interface due to "
            r9.<init>(r10)
            Q0.g.x(r6, r9, r3)
        L_0x0364:
            java.lang.String r6 = "enableZoom"
            boolean r6 = r7.n(r6, r2)     // Catch:{ Exception -> 0x0376 }
            if (r6 == 0) goto L_0x0378
            r4.setSupportZoom(r2)     // Catch:{ Exception -> 0x0376 }
            r4.setBuiltInZoomControls(r2)     // Catch:{ Exception -> 0x0376 }
            r4.setDisplayZoomControls(r1)     // Catch:{ Exception -> 0x0376 }
            goto L_0x038c
        L_0x0376:
            r6 = move-exception
            goto L_0x0382
        L_0x0378:
            r4.setSupportZoom(r1)     // Catch:{ Exception -> 0x0376 }
            r4.setBuiltInZoomControls(r1)     // Catch:{ Exception -> 0x0376 }
            r4.setDisplayZoomControls(r1)     // Catch:{ Exception -> 0x0376 }
            goto L_0x038c
        L_0x0382:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to setup zoom settings due to "
            r9.<init>(r10)
            Q0.g.x(r6, r9, r3)
        L_0x038c:
            java.lang.String r6 = "useWideViewport"
            boolean r6 = r7.n(r6, r2)     // Catch:{ Exception -> 0x039f }
            r4.setUseWideViewPort(r6)     // Catch:{ Exception -> 0x039f }
            java.lang.String r6 = "loadOverview"
            boolean r6 = r7.n(r6, r1)     // Catch:{ Exception -> 0x039f }
            r4.setLoadWithOverviewMode(r6)     // Catch:{ Exception -> 0x039f }
            goto L_0x03aa
        L_0x039f:
            r6 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to setup viewport settings due to "
            r9.<init>(r10)
            Q0.g.x(r6, r9, r3)
        L_0x03aa:
            java.lang.String r6 = "desktopMode"
            boolean r6 = r7.n(r6, r1)
            if (r6 == 0) goto L_0x03d3
            java.lang.String r6 = r4.getUserAgentString()
            java.lang.String r9 = "Mobile"
            java.lang.String r10 = "eliboM"
            java.lang.String r6 = r6.replace(r9, r10)
            java.lang.String r9 = "Android"
            java.lang.String r10 = "diordnA"
            java.lang.String r6 = r6.replace(r9, r10)
            r4.setUserAgentString(r6)
            de.ozerov.fully.MyWebView r9 = r13.f10664g
            r9.f10133m0 = r6
            r4.setUseWideViewPort(r2)
            r4.setLoadWithOverviewMode(r2)
        L_0x03d3:
            java.lang.String r6 = "formAutoComplete"
            boolean r6 = r7.n(r6, r2)     // Catch:{ Exception -> 0x03dd }
            r4.setSaveFormData(r6)     // Catch:{ Exception -> 0x03dd }
            goto L_0x03e8
        L_0x03dd:
            r6 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to setup saveformdata settings due to "
            r9.<init>(r10)
            Q0.g.x(r6, r9, r3)
        L_0x03e8:
            boolean r6 = n2.a.A0()
            if (r6 == 0) goto L_0x03fe
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            java.lang.String r9 = "formAutoFill"
            boolean r9 = r7.n(r9, r1)
            if (r9 == 0) goto L_0x03fa
            r9 = 1
            goto L_0x03fb
        L_0x03fa:
            r9 = 2
        L_0x03fb:
            r6.setImportantForAutofill(r9)
        L_0x03fe:
            java.lang.String r6 = "cacheMode"
            java.lang.String r9 = "-1"
            java.lang.String r6 = r7.r(r6, r9)     // Catch:{ Exception -> 0x040a }
            int r8 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x040a }
        L_0x040a:
            r4.setCacheMode(r8)     // Catch:{ Exception -> 0x040e }
            goto L_0x0419
        L_0x040e:
            r6 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to setup cache settings due to "
            r8.<init>(r9)
            Q0.g.x(r6, r8, r3)
        L_0x0419:
            boolean r6 = n2.a.A0()     // Catch:{ Error -> 0x0429 }
            if (r6 == 0) goto L_0x043f
            java.lang.String r6 = "safeBrowsing"
            boolean r6 = r7.n(r6, r1)     // Catch:{ Error -> 0x0429 }
            r4.setSafeBrowsingEnabled(r6)     // Catch:{ Error -> 0x0429 }
            goto L_0x043f
        L_0x0429:
            r6 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to setup safe browsing settings due to "
            r8.<init>(r9)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.e(r3, r6)
        L_0x043f:
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            de.ozerov.fully.a5 r8 = new de.ozerov.fully.a5
            r8.<init>(r13)
            r6.setDownloadListener(r8)
            de.ozerov.fully.MyWebView r6 = r13.f10664g     // Catch:{ Exception -> 0x0453 }
            int r8 = r5.Y()     // Catch:{ Exception -> 0x0453 }
            r6.setInitialScale(r8)     // Catch:{ Exception -> 0x0453 }
            goto L_0x045e
        L_0x0453:
            r6 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to setup scale settings due to "
            r8.<init>(r9)
            Q0.g.x(r6, r8, r3)
        L_0x045e:
            java.lang.String r6 = "fontSize"
            java.lang.String r8 = "100"
            java.lang.String r6 = r7.r(r6, r8)     // Catch:{ Exception -> 0x046b }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x046b }
            goto L_0x046c
        L_0x046b:
            r6 = 0
        L_0x046c:
            r4.setTextZoom(r6)
            android.webkit.CookieManager r4 = android.webkit.CookieManager.getInstance()
            de.ozerov.fully.MyWebView r6 = r13.f10664g
            java.lang.String r8 = "thirdPartyCookies"
            boolean r8 = r7.n(r8, r2)
            r4.setAcceptThirdPartyCookies(r6, r8)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r13.e
            if (r4 == 0) goto L_0x0499
            java.lang.String r6 = "enablePullToRefresh"
            boolean r6 = r7.n(r6, r1)
            if (r6 == 0) goto L_0x0496
            de.ozerov.fully.Z4 r1 = new de.ozerov.fully.Z4
            r1.<init>(r13)
            r4.setOnRefreshListener(r1)
            r4.setEnabled(r2)
            goto L_0x0499
        L_0x0496:
            r4.setEnabled(r1)
        L_0x0499:
            java.lang.String r1 = r5.T()     // Catch:{ Exception -> 0x04b4 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x04b4 }
            if (r1 == 0) goto L_0x04ae
            if (r1 == r2) goto L_0x04ae
            if (r1 != r0) goto L_0x04a8
            goto L_0x04ae
        L_0x04a8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x04b4 }
            r0.<init>()     // Catch:{ Exception -> 0x04b4 }
            throw r0     // Catch:{ Exception -> 0x04b4 }
        L_0x04ae:
            de.ozerov.fully.MyWebView r0 = r13.f10664g     // Catch:{ Exception -> 0x04b4 }
            r0.setLayerType(r1, r11)     // Catch:{ Exception -> 0x04b4 }
            goto L_0x04b9
        L_0x04b4:
            java.lang.String r0 = "Error in acceleration mode value"
            android.util.Log.e(r3, r0)
        L_0x04b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.g5.b():void");
    }

    public final void c() {
        MyWebView myWebView = this.f10664g;
        if (myWebView != null && myWebView.canGoBack()) {
            if (this.f10677u.C1().booleanValue()) {
                MyWebView myWebView2 = this.f10664g;
                if (!myWebView2.f10137r0 && !myWebView2.f10139t0 && !myWebView2.f10140u0) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(myWebView2.getContext(), 17432579);
                    loadAnimation.setAnimationListener(myWebView2.p0);
                    myWebView2.startAnimation(loadAnimation);
                    myWebView2.f10141v0 = true;
                }
            }
            this.f10664g.f10117B0 = 2;
            this.f10678v.removeCallbacksAndMessages((Object) null);
            this.f10678v.postDelayed(new e5(this, 0), 100);
        }
    }

    public final void d() {
        MyWebView myWebView = this.f10664g;
        if (myWebView != null && myWebView.canGoForward()) {
            if (this.f10677u.C1().booleanValue()) {
                this.f10664g.h();
            }
            this.f10664g.f10117B0 = 2;
            this.f10678v.removeCallbacksAndMessages((Object) null);
            this.f10678v.postDelayed(new e5(this, 1), 100);
        }
    }

    public final String e() {
        MyWebView myWebView = this.f10664g;
        if (myWebView == null) {
            return null;
        }
        return myWebView.f10125e0;
    }

    public final void f(boolean z) {
        this.f10679w = a.p(40.0f, this.f10676t);
        ViewGroup viewGroup = this.f10662d;
        if (z) {
            viewGroup.getHeight();
            if (viewGroup.getHeight() == this.f10679w) {
                C0708h3 h3Var = new C0708h3((View) viewGroup, this.f10679w, 0);
                h3Var.setDuration(250);
                h3Var.setFillAfter(true);
                h3Var.setAnimationListener(new C0749o2(2, this));
                viewGroup.startAnimation(h3Var);
                return;
            }
            return;
        }
        viewGroup.getLayoutParams().height = 0;
        viewGroup.setVisibility(8);
        viewGroup.setDescendantFocusability(393216);
    }

    public final void g(String str) {
        boolean z;
        if (this.f10664g == null || str == null) {
            Log.e("g5", "Loading uninitialized Webview or null URL");
            return;
        }
        if (this.f10675s == null) {
            this.f10675s = str;
        }
        if (!str.startsWith(this.f10677u.N())) {
            this.f10674r = str;
        }
        this.f10664g.f10126f0 = str;
        if (a.y0() && str.startsWith("file://")) {
            C0780t4 t4Var = this.f10676t;
            if (a.G0(t4Var, str) && !a.g0(t4Var)) {
                a.a1(1, t4Var, "Missing permission to read shared storage for file: URL");
            }
        }
        int i8 = f10658x;
        if (i8 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f10658x = i8 + 1;
        }
        Handler handler = this.f10678v;
        handler.removeCallbacksAndMessages((Object) null);
        handler.post(new M(1, this, str, z));
    }

    public final void h() {
        String str = this.f10674r;
        if (str != null && !str.equals(e())) {
            g(this.f10674r);
        } else if (e() == null) {
        } else {
            if (((c) this.f10677u.f9767W).n("resendFormData", false)) {
                this.f10664g.reload();
            } else {
                g(e());
            }
        }
    }

    public final void i(String str) {
        MyWebView myWebView = this.f10664g;
        if (myWebView != null) {
            if ((myWebView.getUrl() == null || this.f10664g.getUrl().equals("about:blank") || this.f10664g.getUrl().equals(str)) && this.f10668l) {
                i5 i5Var = this.f10666j;
                g5 g5Var = i5Var.f10711d;
                if (g5Var != null) {
                    i5Var.e(g5Var);
                    return;
                }
                return;
            }
            U0 u02 = this.f10664g.f10118U;
            if (u02 != null && u02.e != null) {
                u02.f10417d = new HashMap(u02.e);
            }
        }
    }

    public final void j() {
        int i8 = this.f10666j.f10725t;
        if (i8 == -1) {
            k kVar = this.f10677u;
            i8 = ((c) kVar.f9767W).q("defaultWebviewBackgroundColor", ((Context) kVar.f9768X).getResources().getColor(2131099718));
        }
        MyWebView myWebView = this.f10664g;
        if (myWebView != null) {
            myWebView.setBackgroundColor(i8);
        }
        this.f10663f.setBackgroundColor(i8);
    }

    public final void k() {
        String e8 = e();
        if (e8 != null) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                intent.putExtra("android.intent.extra.TEXT", e8);
                this.f10676t.startActivity(Intent.createChooser(intent, "Share via"));
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public final void l(boolean z) {
        if (this.f10679w != -1) {
            ViewGroup viewGroup = this.f10662d;
            viewGroup.setVisibility(0);
            viewGroup.setDescendantFocusability(262144);
            if (!z) {
                viewGroup.getLayoutParams().height = this.f10679w;
            } else if (viewGroup.getHeight() == 0) {
                C0708h3 h3Var = new C0708h3((View) viewGroup, 0, this.f10679w);
                h3Var.setDuration(250);
                h3Var.setFillAfter(true);
                viewGroup.startAnimation(h3Var);
            }
        }
    }

    public final void m() {
        if (this.f10666j.i) {
            ProgressBar progressBar = this.f10660b;
            if (progressBar.getVisibility() == 8) {
                progressBar.setProgress(0);
            }
            progressBar.setVisibility(0);
            Drawable progressDrawable = progressBar.getProgressDrawable();
            k kVar = this.f10677u;
            progressDrawable.setColorFilter(new LightingColorFilter(-16777216, ((c) kVar.f9767W).q("progressBarColor", ((Context) kVar.f9768X).getResources().getColor(2131099695))));
            if (a.z0()) {
                progressBar.setProgress(10, true);
            } else {
                progressBar.setProgress(10);
            }
        }
    }

    public final void n() {
        if (this.f10666j.i) {
            this.f10660b.setVisibility(8);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.e;
        if (swipeRefreshLayout != null && swipeRefreshLayout.f8573W) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    public final void o(String str) {
        if (str != null) {
            EditText editText = this.f10661c;
            if (!editText.hasFocus()) {
                if (str.equals("file:///launcher")) {
                    editText.setText("fully://launcher", TextView.BufferType.EDITABLE);
                } else {
                    editText.setText(a.n0(str), TextView.BufferType.EDITABLE);
                }
                if (this.f10666j.f10715j) {
                    l(true);
                }
            }
        }
    }

    public final void p(String str) {
        MyWebView myWebView;
        if (str != null && !str.startsWith("data:") && (myWebView = this.f10664g) != null) {
            String f8 = this.f10667k.f(str, myWebView.f10125e0);
            if (f8 == null) {
                g(this.f10664g.f10125e0);
            } else if (!f8.equals(str)) {
                g(f8);
            } else {
                this.f10664g.f10125e0 = str;
                o(str);
            }
        }
    }
}
