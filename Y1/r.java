package Y1;

import E2.a;
import H2.x;
import H3.C0103u;
import H3.I;
import H3.O;
import H3.i0;
import M0.C0114b;
import M0.C0115c;
import M0.D;
import M0.L;
import M0.Q;
import M0.V;
import M0.W;
import M0.d0;
import M0.e0;
import P0.l;
import P0.z;
import T0.C0232y;
import T0.X;
import U.p;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.C1141j;
import org.altbeacon.beacon.service.RangedBeacon;

public final class r extends FrameLayout {

    /* renamed from: u1  reason: collision with root package name */
    public static final float[] f6459u1 = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};

    /* renamed from: A0  reason: collision with root package name */
    public final TextView f6460A0;

    /* renamed from: B0  reason: collision with root package name */
    public final I f6461B0;

    /* renamed from: C0  reason: collision with root package name */
    public final StringBuilder f6462C0;

    /* renamed from: D0  reason: collision with root package name */
    public final Formatter f6463D0;

    /* renamed from: E0  reason: collision with root package name */
    public final V f6464E0;

    /* renamed from: F0  reason: collision with root package name */
    public final W f6465F0;

    /* renamed from: G0  reason: collision with root package name */
    public final p f6466G0;

    /* renamed from: H0  reason: collision with root package name */
    public final Drawable f6467H0;

    /* renamed from: I0  reason: collision with root package name */
    public final Drawable f6468I0;

    /* renamed from: J0  reason: collision with root package name */
    public final Drawable f6469J0;

    /* renamed from: K0  reason: collision with root package name */
    public final Drawable f6470K0;

    /* renamed from: L0  reason: collision with root package name */
    public final Drawable f6471L0;

    /* renamed from: M0  reason: collision with root package name */
    public final String f6472M0;

    /* renamed from: N0  reason: collision with root package name */
    public final String f6473N0;

    /* renamed from: O0  reason: collision with root package name */
    public final String f6474O0;

    /* renamed from: P0  reason: collision with root package name */
    public final Drawable f6475P0;

    /* renamed from: Q0  reason: collision with root package name */
    public final Drawable f6476Q0;

    /* renamed from: R0  reason: collision with root package name */
    public final float f6477R0;

    /* renamed from: S0  reason: collision with root package name */
    public final float f6478S0;

    /* renamed from: T0  reason: collision with root package name */
    public final String f6479T0;

    /* renamed from: U  reason: collision with root package name */
    public final w f6480U;

    /* renamed from: U0  reason: collision with root package name */
    public final String f6481U0;

    /* renamed from: V  reason: collision with root package name */
    public final Resources f6482V;

    /* renamed from: V0  reason: collision with root package name */
    public final Drawable f6483V0;

    /* renamed from: W  reason: collision with root package name */
    public final C0374g f6484W;

    /* renamed from: W0  reason: collision with root package name */
    public final Drawable f6485W0;

    /* renamed from: X0  reason: collision with root package name */
    public final String f6486X0;

    /* renamed from: Y0  reason: collision with root package name */
    public final String f6487Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public final Drawable f6488Z0;

    /* renamed from: a0  reason: collision with root package name */
    public final CopyOnWriteArrayList f6489a0;

    /* renamed from: a1  reason: collision with root package name */
    public final Drawable f6490a1;

    /* renamed from: b0  reason: collision with root package name */
    public final RecyclerView f6491b0;

    /* renamed from: b1  reason: collision with root package name */
    public final String f6492b1;

    /* renamed from: c0  reason: collision with root package name */
    public final C0380m f6493c0;

    /* renamed from: c1  reason: collision with root package name */
    public final String f6494c1;

    /* renamed from: d0  reason: collision with root package name */
    public final C0377j f6495d0;

    /* renamed from: d1  reason: collision with root package name */
    public Q f6496d1;

    /* renamed from: e0  reason: collision with root package name */
    public final C0373f f6497e0;

    /* renamed from: e1  reason: collision with root package name */
    public C0375h f6498e1;

    /* renamed from: f0  reason: collision with root package name */
    public final C0373f f6499f0;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f6500f1;

    /* renamed from: g0  reason: collision with root package name */
    public final x f6501g0;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f6502g1;

    /* renamed from: h0  reason: collision with root package name */
    public final PopupWindow f6503h0;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f6504h1;

    /* renamed from: i0  reason: collision with root package name */
    public final int f6505i0;

    /* renamed from: i1  reason: collision with root package name */
    public boolean f6506i1 = true;

    /* renamed from: j0  reason: collision with root package name */
    public final ImageView f6507j0;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f6508j1;

    /* renamed from: k0  reason: collision with root package name */
    public final ImageView f6509k0;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f6510k1;

    /* renamed from: l0  reason: collision with root package name */
    public final ImageView f6511l0;

    /* renamed from: l1  reason: collision with root package name */
    public int f6512l1 = 5000;

    /* renamed from: m0  reason: collision with root package name */
    public final View f6513m0;

    /* renamed from: m1  reason: collision with root package name */
    public int f6514m1 = 200;

    /* renamed from: n0  reason: collision with root package name */
    public final View f6515n0;

    /* renamed from: n1  reason: collision with root package name */
    public int f6516n1 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public final TextView f6517o0;

    /* renamed from: o1  reason: collision with root package name */
    public long[] f6518o1;
    public final TextView p0;

    /* renamed from: p1  reason: collision with root package name */
    public boolean[] f6519p1;

    /* renamed from: q0  reason: collision with root package name */
    public final ImageView f6520q0;

    /* renamed from: q1  reason: collision with root package name */
    public final long[] f6521q1;

    /* renamed from: r0  reason: collision with root package name */
    public final ImageView f6522r0;

    /* renamed from: r1  reason: collision with root package name */
    public final boolean[] f6523r1;

    /* renamed from: s0  reason: collision with root package name */
    public final ImageView f6524s0;
    public long s1;

    /* renamed from: t0  reason: collision with root package name */
    public final ImageView f6525t0;
    public boolean t1;

    /* renamed from: u0  reason: collision with root package name */
    public final ImageView f6526u0;

    /* renamed from: v0  reason: collision with root package name */
    public final ImageView f6527v0;

    /* renamed from: w0  reason: collision with root package name */
    public final View f6528w0;

    /* renamed from: x0  reason: collision with root package name */
    public final View f6529x0;

    /* renamed from: y0  reason: collision with root package name */
    public final View f6530y0;

    /* renamed from: z0  reason: collision with root package name */
    public final TextView f6531z0;

    static {
        D.a("media3.ui");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(android.content.Context r52, android.util.AttributeSet r53) {
        /*
            r51 = this;
            r1 = r51
            r0 = r52
            r2 = r53
            r10 = 0
            r11 = 0
            r1.<init>(r0, r10, r11)
            r12 = 1
            r1.f6506i1 = r12
            r4 = 5000(0x1388, float:7.006E-42)
            r1.f6512l1 = r4
            r1.f6516n1 = r11
            r4 = 200(0xc8, float:2.8E-43)
            r1.f6514m1 = r4
            r4 = 8
            r5 = 2131558478(0x7f0d004e, float:1.8742273E38)
            r6 = 2131230930(0x7f0800d2, float:1.8077927E38)
            r7 = 2131230929(0x7f0800d1, float:1.8077925E38)
            r8 = 2131230926(0x7f0800ce, float:1.8077919E38)
            r13 = 2131230939(0x7f0800db, float:1.8077945E38)
            r14 = 2131230931(0x7f0800d3, float:1.8077929E38)
            r15 = 2131230940(0x7f0800dc, float:1.8077947E38)
            r10 = 2131230925(0x7f0800cd, float:1.8077917E38)
            r3 = 2131230924(0x7f0800cc, float:1.8077915E38)
            if (r2 == 0) goto L_0x0159
            android.content.res.Resources$Theme r12 = r52.getTheme()
            int[] r9 = Y1.C.f6323c
            android.content.res.TypedArray r9 = r12.obtainStyledAttributes(r2, r9, r11, r11)
            r12 = 6
            int r5 = r9.getResourceId(r12, r5)     // Catch:{ all -> 0x0154 }
            r12 = 12
            int r6 = r9.getResourceId(r12, r6)     // Catch:{ all -> 0x0154 }
            r12 = 11
            int r7 = r9.getResourceId(r12, r7)     // Catch:{ all -> 0x0154 }
            r12 = 10
            int r8 = r9.getResourceId(r12, r8)     // Catch:{ all -> 0x0154 }
            r12 = 7
            int r13 = r9.getResourceId(r12, r13)     // Catch:{ all -> 0x0154 }
            r12 = 15
            int r14 = r9.getResourceId(r12, r14)     // Catch:{ all -> 0x0154 }
            r12 = 20
            int r15 = r9.getResourceId(r12, r15)     // Catch:{ all -> 0x0154 }
            r12 = 9
            int r10 = r9.getResourceId(r12, r10)     // Catch:{ all -> 0x0154 }
            int r3 = r9.getResourceId(r4, r3)     // Catch:{ all -> 0x0154 }
            r12 = 17
            r4 = 2131230933(0x7f0800d5, float:1.8077933E38)
            int r4 = r9.getResourceId(r12, r4)     // Catch:{ all -> 0x0154 }
            r12 = 18
            r11 = 2131230934(0x7f0800d6, float:1.8077935E38)
            int r12 = r9.getResourceId(r12, r11)     // Catch:{ all -> 0x0154 }
            r11 = 16
            r18 = r3
            r3 = 2131230932(0x7f0800d4, float:1.807793E38)
            int r3 = r9.getResourceId(r11, r3)     // Catch:{ all -> 0x0154 }
            r11 = 35
            r19 = r3
            r3 = 2131230938(0x7f0800da, float:1.8077943E38)
            int r3 = r9.getResourceId(r11, r3)     // Catch:{ all -> 0x0154 }
            r11 = 34
            r20 = r3
            r3 = 2131230937(0x7f0800d9, float:1.807794E38)
            int r3 = r9.getResourceId(r11, r3)     // Catch:{ all -> 0x0154 }
            r11 = 37
            r21 = r3
            r3 = 2131230943(0x7f0800df, float:1.8077953E38)
            int r3 = r9.getResourceId(r11, r3)     // Catch:{ all -> 0x0154 }
            r11 = 36
            r22 = r3
            r3 = 2131230942(0x7f0800de, float:1.807795E38)
            int r3 = r9.getResourceId(r11, r3)     // Catch:{ all -> 0x0154 }
            r11 = 41
            r23 = r3
            r3 = 2131230944(0x7f0800e0, float:1.8077955E38)
            int r3 = r9.getResourceId(r11, r3)     // Catch:{ all -> 0x0154 }
            int r11 = r1.f6512l1     // Catch:{ all -> 0x0154 }
            r24 = r3
            r3 = 32
            int r3 = r9.getInt(r3, r11)     // Catch:{ all -> 0x0154 }
            r1.f6512l1 = r3     // Catch:{ all -> 0x0154 }
            int r3 = r1.f6516n1     // Catch:{ all -> 0x0154 }
            r11 = 19
            int r3 = r9.getInt(r11, r3)     // Catch:{ all -> 0x0154 }
            r1.f6516n1 = r3     // Catch:{ all -> 0x0154 }
            r3 = 29
            r11 = 1
            boolean r3 = r9.getBoolean(r3, r11)     // Catch:{ all -> 0x0154 }
            r25 = r3
            r3 = 26
            boolean r3 = r9.getBoolean(r3, r11)     // Catch:{ all -> 0x0154 }
            r26 = r3
            r3 = 28
            boolean r3 = r9.getBoolean(r3, r11)     // Catch:{ all -> 0x0154 }
            r27 = r3
            r3 = 27
            boolean r3 = r9.getBoolean(r3, r11)     // Catch:{ all -> 0x0154 }
            r11 = 30
            r28 = r3
            r3 = 0
            boolean r11 = r9.getBoolean(r11, r3)     // Catch:{ all -> 0x0154 }
            r29 = r4
            r4 = 31
            boolean r4 = r9.getBoolean(r4, r3)     // Catch:{ all -> 0x0154 }
            r30 = r4
            r4 = 33
            boolean r4 = r9.getBoolean(r4, r3)     // Catch:{ all -> 0x0154 }
            int r3 = r1.f6514m1     // Catch:{ all -> 0x0154 }
            r31 = r4
            r4 = 38
            int r3 = r9.getInt(r4, r3)     // Catch:{ all -> 0x0154 }
            r1.setTimeBarMinUpdateInterval(r3)     // Catch:{ all -> 0x0154 }
            r3 = 1
            r4 = 2
            boolean r32 = r9.getBoolean(r4, r3)     // Catch:{ all -> 0x0154 }
            r9.recycle()
            r35 = r12
            r41 = r13
            r3 = r14
            r42 = r15
            r9 = r18
            r36 = r19
            r37 = r20
            r38 = r21
            r39 = r22
            r40 = r23
            r34 = r24
            r19 = r26
            r18 = r27
            r33 = r28
            r15 = r29
            r12 = r31
            r43 = r32
            r13 = r6
            r14 = r7
            r7 = r10
            r6 = r25
            r10 = r30
            goto L_0x01aa
        L_0x0154:
            r0 = move-exception
            r9.recycle()
            throw r0
        L_0x0159:
            r3 = 2131230944(0x7f0800e0, float:1.8077955E38)
            r4 = 2131230933(0x7f0800d5, float:1.8077933E38)
            r9 = 2131230924(0x7f0800cc, float:1.8077915E38)
            r11 = 2131230934(0x7f0800d6, float:1.8077935E38)
            r12 = 2131230932(0x7f0800d4, float:1.807793E38)
            r18 = 2131230938(0x7f0800da, float:1.8077943E38)
            r19 = 2131230937(0x7f0800d9, float:1.807794E38)
            r20 = 2131230943(0x7f0800df, float:1.8077953E38)
            r21 = 2131230942(0x7f0800de, float:1.807795E38)
            r3 = 2131230931(0x7f0800d3, float:1.8077929E38)
            r6 = 1
            r7 = 2131230925(0x7f0800cd, float:1.8077917E38)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2131230930(0x7f0800d2, float:1.8077927E38)
            r14 = 2131230929(0x7f0800d1, float:1.8077925E38)
            r15 = 2131230933(0x7f0800d5, float:1.8077933E38)
            r18 = 1
            r19 = 1
            r33 = 1
            r34 = 2131230944(0x7f0800e0, float:1.8077955E38)
            r35 = 2131230934(0x7f0800d6, float:1.8077935E38)
            r36 = 2131230932(0x7f0800d4, float:1.807793E38)
            r37 = 2131230938(0x7f0800da, float:1.8077943E38)
            r38 = 2131230937(0x7f0800d9, float:1.807794E38)
            r39 = 2131230943(0x7f0800df, float:1.8077953E38)
            r40 = 2131230942(0x7f0800de, float:1.807795E38)
            r41 = 2131230939(0x7f0800db, float:1.8077945E38)
            r42 = 2131230940(0x7f0800dc, float:1.8077947E38)
            r43 = 1
        L_0x01aa:
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r52)
            r4.inflate(r5, r1)
            r4 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r4)
            Y1.g r5 = new Y1.g
            r5.<init>(r1)
            r1.f6484W = r5
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r1.f6489a0 = r4
            M0.V r4 = new M0.V
            r4.<init>()
            r1.f6464E0 = r4
            M0.W r4 = new M0.W
            r4.<init>()
            r1.f6465F0 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r1.f6462C0 = r4
            r20 = r6
            java.util.Formatter r6 = new java.util.Formatter
            r21 = r7
            java.util.Locale r7 = java.util.Locale.getDefault()
            r6.<init>(r4, r7)
            r1.f6463D0 = r6
            r4 = 0
            long[] r6 = new long[r4]
            r1.f6518o1 = r6
            boolean[] r6 = new boolean[r4]
            r1.f6519p1 = r6
            long[] r6 = new long[r4]
            r1.f6521q1 = r6
            boolean[] r6 = new boolean[r4]
            r1.f6523r1 = r6
            U.p r4 = new U.p
            r6 = 4
            r4.<init>((int) r6, (java.lang.Object) r1)
            r1.f6466G0 = r4
            r4 = 2131362040(0x7f0a00f8, float:1.834385E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.f6531z0 = r4
            r4 = 2131362060(0x7f0a010c, float:1.834389E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.f6460A0 = r4
            r4 = 2131362072(0x7f0a0118, float:1.8343914E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1.f6525t0 = r4
            if (r4 == 0) goto L_0x0227
            r4.setOnClickListener(r5)
        L_0x0227:
            r4 = 2131362046(0x7f0a00fe, float:1.8343862E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1.f6526u0 = r4
            C3.a r6 = new C3.a
            r7 = 3
            r6.<init>(r7, r1)
            if (r4 != 0) goto L_0x023b
            goto L_0x0243
        L_0x023b:
            r7 = 8
            r4.setVisibility(r7)
            r4.setOnClickListener(r6)
        L_0x0243:
            r4 = 2131362051(0x7f0a0103, float:1.8343872E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1.f6527v0 = r4
            C3.a r6 = new C3.a
            r7 = 3
            r6.<init>(r7, r1)
            if (r4 != 0) goto L_0x0257
            goto L_0x025f
        L_0x0257:
            r7 = 8
            r4.setVisibility(r7)
            r4.setOnClickListener(r6)
        L_0x025f:
            r4 = 2131362067(0x7f0a0113, float:1.8343904E38)
            android.view.View r4 = r1.findViewById(r4)
            r1.f6528w0 = r4
            if (r4 == 0) goto L_0x026d
            r4.setOnClickListener(r5)
        L_0x026d:
            r4 = 2131362059(0x7f0a010b, float:1.8343888E38)
            android.view.View r4 = r1.findViewById(r4)
            r1.f6529x0 = r4
            if (r4 == 0) goto L_0x027b
            r4.setOnClickListener(r5)
        L_0x027b:
            r4 = 2131362030(0x7f0a00ee, float:1.834383E38)
            android.view.View r4 = r1.findViewById(r4)
            r1.f6530y0 = r4
            if (r4 == 0) goto L_0x0289
            r4.setOnClickListener(r5)
        L_0x0289:
            r4 = 2131362062(0x7f0a010e, float:1.8343894E38)
            android.view.View r6 = r1.findViewById(r4)
            Y1.I r6 = (Y1.I) r6
            r7 = 2131362063(0x7f0a010f, float:1.8343896E38)
            android.view.View r7 = r1.findViewById(r7)
            if (r6 == 0) goto L_0x029e
            r1.f6461B0 = r6
            goto L_0x02c5
        L_0x029e:
            if (r7 == 0) goto L_0x02c2
            Y1.e r6 = new Y1.e
            r6.<init>(r0, r2)
            r6.setId(r4)
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            r6.setLayoutParams(r2)
            android.view.ViewParent r2 = r7.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r4 = r2.indexOfChild(r7)
            r2.removeView(r7)
            r2.addView(r6, r4)
            r1.f6461B0 = r6
            goto L_0x02c5
        L_0x02c2:
            r2 = 0
            r1.f6461B0 = r2
        L_0x02c5:
            Y1.I r2 = r1.f6461B0
            if (r2 == 0) goto L_0x02d0
            Y1.e r2 = (Y1.C0372e) r2
            java.util.concurrent.CopyOnWriteArraySet r2 = r2.f6425u0
            r2.add(r5)
        L_0x02d0:
            android.content.res.Resources r7 = r52.getResources()
            r1.f6482V = r7
            r2 = 2131362058(0x7f0a010a, float:1.8343886E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f6511l0 = r2
            if (r2 == 0) goto L_0x02e6
            r2.setOnClickListener(r5)
        L_0x02e6:
            r2 = 2131362061(0x7f0a010d, float:1.8343892E38)
            android.view.View r2 = r1.findViewById(r2)
            r6 = r2
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1.f6507j0 = r6
            if (r6 == 0) goto L_0x0302
            android.content.res.Resources$Theme r2 = r52.getTheme()
            android.graphics.drawable.Drawable r2 = r7.getDrawable(r3, r2)
            r6.setImageDrawable(r2)
            r6.setOnClickListener(r5)
        L_0x0302:
            r2 = 2131362052(0x7f0a0104, float:1.8343874E38)
            android.view.View r2 = r1.findViewById(r2)
            r4 = r2
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1.f6509k0 = r4
            if (r4 == 0) goto L_0x031e
            android.content.res.Resources$Theme r2 = r52.getTheme()
            android.graphics.drawable.Drawable r2 = r7.getDrawable(r8, r2)
            r4.setImageDrawable(r2)
            r4.setOnClickListener(r5)
        L_0x031e:
            java.lang.ThreadLocal r2 = l0.l.f13083a
            boolean r2 = r52.isRestricted()
            if (r2 == 0) goto L_0x0337
            r46 = r4
            r0 = r5
            r48 = r6
            r50 = r7
            r44 = r18
            r45 = r19
            r47 = r20
            r49 = r21
            r2 = 0
            goto L_0x0365
        L_0x0337:
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            r16 = 0
            r22 = 0
            r3 = 2131296256(0x7f090000, float:1.8210424E38)
            r23 = 0
            r24 = 0
            r2 = r52
            r44 = r18
            r46 = r4
            r45 = r19
            r4 = r8
            r8 = r5
            r5 = r23
            r48 = r6
            r47 = r20
            r6 = r24
            r50 = r7
            r49 = r21
            r7 = r16
            r0 = r8
            r8 = r22
            android.graphics.Typeface r2 = l0.l.b(r2, r3, r4, r5, r6, r7, r8)
        L_0x0365:
            r3 = 2131362065(0x7f0a0111, float:1.83439E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 2131362066(0x7f0a0112, float:1.8343902E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r3 == 0) goto L_0x038e
            android.content.res.Resources$Theme r4 = r52.getTheme()
            r5 = r42
            r6 = r50
            android.graphics.drawable.Drawable r4 = r6.getDrawable(r5, r4)
            r3.setImageDrawable(r4)
            r1.f6515n0 = r3
            r3 = 0
            r1.p0 = r3
            goto L_0x039f
        L_0x038e:
            r6 = r50
            r3 = 0
            if (r4 == 0) goto L_0x039b
            r4.setTypeface(r2)
            r1.p0 = r4
            r1.f6515n0 = r4
            goto L_0x039f
        L_0x039b:
            r1.p0 = r3
            r1.f6515n0 = r3
        L_0x039f:
            android.view.View r3 = r1.f6515n0
            if (r3 == 0) goto L_0x03a6
            r3.setOnClickListener(r0)
        L_0x03a6:
            r3 = 2131362044(0x7f0a00fc, float:1.8343857E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 2131362045(0x7f0a00fd, float:1.834386E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r3 == 0) goto L_0x03cd
            android.content.res.Resources$Theme r2 = r52.getTheme()
            r4 = r41
            android.graphics.drawable.Drawable r2 = r6.getDrawable(r4, r2)
            r3.setImageDrawable(r2)
            r1.f6513m0 = r3
            r3 = 0
            r1.f6517o0 = r3
            goto L_0x03dc
        L_0x03cd:
            r3 = 0
            if (r4 == 0) goto L_0x03d8
            r4.setTypeface(r2)
            r1.f6517o0 = r4
            r1.f6513m0 = r4
            goto L_0x03dc
        L_0x03d8:
            r1.f6517o0 = r3
            r1.f6513m0 = r3
        L_0x03dc:
            android.view.View r2 = r1.f6513m0
            if (r2 == 0) goto L_0x03e3
            r2.setOnClickListener(r0)
        L_0x03e3:
            r2 = 2131362064(0x7f0a0110, float:1.8343898E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f6520q0 = r2
            if (r2 == 0) goto L_0x03f3
            r2.setOnClickListener(r0)
        L_0x03f3:
            r3 = 2131362069(0x7f0a0115, float:1.8343908E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.f6522r0 = r3
            if (r3 == 0) goto L_0x0403
            r3.setOnClickListener(r0)
        L_0x0403:
            r4 = 2131427338(0x7f0b000a, float:1.847629E38)
            int r4 = r6.getInteger(r4)
            float r4 = (float) r4
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            r1.f6477R0 = r4
            r4 = 2131427337(0x7f0b0009, float:1.8476287E38)
            int r4 = r6.getInteger(r4)
            float r4 = (float) r4
            float r4 = r4 / r5
            r1.f6478S0 = r4
            r4 = 2131362077(0x7f0a011d, float:1.8343924E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1.f6524s0 = r4
            if (r4 == 0) goto L_0x0439
            android.content.res.Resources$Theme r5 = r52.getTheme()
            r7 = r34
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r7, r5)
            r4.setImageDrawable(r5)
            r5 = 0
            r1.j(r4, r5)
        L_0x0439:
            Y1.w r5 = new Y1.w
            r5.<init>(r1)
            r1.f6480U = r5
            r7 = r43
            r5.f6543C = r7
            r7 = 2131951732(0x7f130074, float:1.9539887E38)
            java.lang.String r7 = r6.getString(r7)
            android.content.res.Resources$Theme r8 = r52.getTheme()
            r53 = r2
            r2 = 2131230941(0x7f0800dd, float:1.8077949E38)
            android.graphics.drawable.Drawable r2 = r6.getDrawable(r2, r8)
            r8 = 2131951765(0x7f130095, float:1.9539954E38)
            java.lang.String r8 = r6.getString(r8)
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            android.content.res.Resources$Theme r8 = r52.getTheme()
            r16 = r4
            r4 = 2131230921(0x7f0800c9, float:1.8077908E38)
            android.graphics.drawable.Drawable r4 = r6.getDrawable(r4, r8)
            r8 = 2
            android.graphics.drawable.Drawable[] r8 = new android.graphics.drawable.Drawable[r8]
            r17 = 0
            r8[r17] = r2
            r2 = 1
            r8[r2] = r4
            Y1.m r2 = new Y1.m
            r2.<init>(r1, r7, r8)
            r1.f6493c0 = r2
            r4 = 2131165349(0x7f0700a5, float:1.7944913E38)
            int r4 = r6.getDimensionPixelSize(r4)
            r1.f6505i0 = r4
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r52)
            r7 = 2131558480(0x7f0d0050, float:1.8742277E38)
            r8 = 0
            android.view.View r4 = r4.inflate(r7, r8)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r1.f6491b0 = r4
            r4.setAdapter(r2)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r51.getContext()
            r7 = 1
            r2.<init>(r7)
            r4.setLayoutManager(r2)
            android.widget.PopupWindow r2 = new android.widget.PopupWindow
            r8 = -2
            r2.<init>(r4, r8, r8, r7)
            r1.f6503h0 = r2
            int r4 = P0.z.f3748a
            r8 = 23
            if (r4 >= r8) goto L_0x04c0
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r8 = 0
            r4.<init>(r8)
            r2.setBackgroundDrawable(r4)
        L_0x04c0:
            r2.setOnDismissListener(r0)
            r1.t1 = r7
            H2.x r0 = new H2.x
            android.content.res.Resources r2 = r51.getResources()
            r0.<init>(r2)
            r1.f6501g0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            r2 = r39
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r2, r0)
            r1.f6483V0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            r2 = r40
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r2, r0)
            r1.f6485W0 = r0
            r0 = 2131951721(0x7f130069, float:1.9539865E38)
            java.lang.String r0 = r6.getString(r0)
            r1.f6486X0 = r0
            r0 = 2131951720(0x7f130068, float:1.9539862E38)
            java.lang.String r0 = r6.getString(r0)
            r1.f6487Y0 = r0
            Y1.f r0 = new Y1.f
            r2 = 1
            r0.<init>(r1, r2)
            r1.f6497e0 = r0
            Y1.f r0 = new Y1.f
            r2 = 0
            r0.<init>(r1, r2)
            r1.f6499f0 = r0
            Y1.j r0 = new Y1.j
            r4 = 2130903049(0x7f030009, float:1.7412905E38)
            java.lang.String[] r4 = r6.getStringArray(r4)
            float[] r7 = f6459u1
            r0.<init>(r1, r4, r7)
            r1.f6495d0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r13, r0)
            r1.f6467H0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r14, r0)
            r1.f6468I0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            r4 = r49
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r4, r0)
            r1.f6488Z0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r9, r0)
            r1.f6490a1 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r15, r0)
            r1.f6469J0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            r4 = r35
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r4, r0)
            r1.f6470K0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            r4 = r36
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r4, r0)
            r1.f6471L0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            r4 = r37
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r4, r0)
            r1.f6475P0 = r0
            android.content.res.Resources$Theme r0 = r52.getTheme()
            r4 = r38
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r4, r0)
            r1.f6476Q0 = r0
            r0 = 2131951725(0x7f13006d, float:1.9539873E38)
            java.lang.String r0 = r6.getString(r0)
            r1.f6492b1 = r0
            r0 = 2131951724(0x7f13006c, float:1.953987E38)
            java.lang.String r0 = r6.getString(r0)
            r1.f6494c1 = r0
            r0 = 2131951735(0x7f130077, float:1.9539893E38)
            java.lang.String r0 = r6.getString(r0)
            r1.f6472M0 = r0
            r0 = 2131951736(0x7f130078, float:1.9539895E38)
            java.lang.String r0 = r6.getString(r0)
            r1.f6473N0 = r0
            r0 = 2131951734(0x7f130076, float:1.953989E38)
            java.lang.String r0 = r6.getString(r0)
            r1.f6474O0 = r0
            r0 = 2131951742(0x7f13007e, float:1.9539907E38)
            java.lang.String r0 = r6.getString(r0)
            r1.f6479T0 = r0
            r0 = 2131951741(0x7f13007d, float:1.9539905E38)
            java.lang.String r0 = r6.getString(r0)
            r1.f6481U0 = r0
            r0 = 2131362032(0x7f0a00f0, float:1.8343833E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4 = 1
            r5.h(r0, r4)
            android.view.View r0 = r1.f6513m0
            r4 = r45
            r5.h(r0, r4)
            android.view.View r0 = r1.f6515n0
            r4 = r47
            r5.h(r0, r4)
            r0 = r44
            r4 = r48
            r5.h(r4, r0)
            r0 = r33
            r4 = r46
            r5.h(r4, r0)
            r5.h(r3, r11)
            android.widget.ImageView r0 = r1.f6525t0
            r5.h(r0, r10)
            r4 = r16
            r5.h(r4, r12)
            int r0 = r1.f6516n1
            r2 = r53
            if (r0 == 0) goto L_0x05fb
            r11 = 1
            goto L_0x05fc
        L_0x05fb:
            r11 = 0
        L_0x05fc:
            r5.h(r2, r11)
            U.f r0 = new U.f
            r2 = 1
            r0.<init>(r2, r1)
            r1.addOnLayoutChangeListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.r.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r9 = ((T0.C0232y) r9).z();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(M0.Q r9, M0.W r10) {
        /*
            E2.a r9 = (E2.a) r9
            r0 = 17
            boolean r0 = r9.e(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            T0.y r9 = (T0.C0232y) r9
            M0.X r9 = r9.z()
            int r0 = r9.o()
            r2 = 1
            if (r0 <= r2) goto L_0x0037
            r3 = 100
            if (r0 <= r3) goto L_0x001e
            goto L_0x0037
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 >= r0) goto L_0x0036
            r4 = 0
            M0.W r4 = r9.m(r3, r10, r4)
            long r4 = r4.f2880m
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0033
            return r1
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x0036:
            return r2
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.r.b(M0.Q, M0.W):boolean");
    }

    /* access modifiers changed from: private */
    public void setPlaybackSpeed(float f8) {
        Q q7 = this.f6496d1;
        if (q7 != null && ((a) q7).e(13)) {
            C0232y yVar = (C0232y) this.f6496d1;
            yVar.Y();
            L l8 = new L(f8, yVar.f4945b1.f4761o.f2847b);
            yVar.Y();
            if (!yVar.f4945b1.f4761o.equals(l8)) {
                X f9 = yVar.f4945b1.f(l8);
                yVar.f4914C0++;
                yVar.f4951f0.f4646c0.a(4, l8).b();
                yVar.W(f9, 0, false, 5, -9223372036854775807L, -1, false);
            }
        }
    }

    public final boolean c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Q q7 = this.f6496d1;
        if (q7 == null || (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode != 90) {
                if (keyCode == 89) {
                    a aVar = (a) q7;
                    if (aVar.e(11)) {
                        C0232y yVar = (C0232y) aVar;
                        yVar.Y();
                        aVar.m(11, -yVar.p0);
                    }
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode == 79 || keyCode == 85) {
                        if (z.Y(q7, this.f6506i1)) {
                            z.G(q7);
                        } else {
                            a aVar2 = (a) q7;
                            if (aVar2.e(1)) {
                                ((C0232y) aVar2).P(false);
                            }
                        }
                    } else if (keyCode == 87) {
                        a aVar3 = (a) q7;
                        if (aVar3.e(9)) {
                            aVar3.l();
                        }
                    } else if (keyCode == 88) {
                        a aVar4 = (a) q7;
                        if (aVar4.e(7)) {
                            aVar4.n();
                        }
                    } else if (keyCode == 126) {
                        z.G(q7);
                    } else if (keyCode == 127) {
                        int i = z.f3748a;
                        a aVar5 = (a) q7;
                        if (aVar5.e(1)) {
                            ((C0232y) aVar5).P(false);
                        }
                    }
                }
            } else if (((C0232y) q7).D() != 4) {
                a aVar6 = (a) q7;
                if (aVar6.e(12)) {
                    C0232y yVar2 = (C0232y) aVar6;
                    yVar2.Y();
                    aVar6.m(12, yVar2.f4961q0);
                }
            }
        }
        return true;
    }

    public final void d(F f8, View view) {
        this.f6491b0.setAdapter(f8);
        q();
        this.t1 = false;
        PopupWindow popupWindow = this.f6503h0;
        popupWindow.dismiss();
        this.t1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f6505i0;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (c(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final i0 e(e0 e0Var, int i) {
        C0103u.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        O o2 = e0Var.f2941a;
        int i8 = 0;
        for (int i9 = 0; i9 < o2.size(); i9++) {
            d0 d0Var = (d0) o2.get(i9);
            if (d0Var.f2935b.f2887c == i) {
                for (int i10 = 0; i10 < d0Var.f2934a; i10++) {
                    if (d0Var.b(i10)) {
                        M0.r rVar = d0Var.f2935b.f2888d[i10];
                        if ((rVar.e & 2) == 0) {
                            C0382o oVar = new C0382o(e0Var, i9, i10, this.f6501g0.c(rVar));
                            int i11 = i8 + 1;
                            int f8 = I.f(objArr.length, i11);
                            if (f8 > objArr.length) {
                                objArr = Arrays.copyOf(objArr, f8);
                            }
                            objArr[i8] = oVar;
                            i8 = i11;
                        }
                    }
                }
            }
        }
        return O.i(i8, objArr);
    }

    public final void f() {
        w wVar = this.f6480U;
        int i = wVar.z;
        if (i != 3 && i != 2) {
            wVar.f();
            if (!wVar.f6543C) {
                wVar.i(2);
            } else if (wVar.z == 1) {
                wVar.f6554m.start();
            } else {
                wVar.f6555n.start();
            }
        }
    }

    public final boolean g() {
        w wVar = this.f6480U;
        if (wVar.z != 0 || !wVar.f6544a.h()) {
            return false;
        }
        return true;
    }

    public Q getPlayer() {
        return this.f6496d1;
    }

    public int getRepeatToggleModes() {
        return this.f6516n1;
    }

    public boolean getShowShuffleButton() {
        return this.f6480U.b(this.f6522r0);
    }

    public boolean getShowSubtitleButton() {
        return this.f6480U.b(this.f6525t0);
    }

    public int getShowTimeoutMs() {
        return this.f6512l1;
    }

    public boolean getShowVrButton() {
        return this.f6480U.b(this.f6524s0);
    }

    public final boolean h() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void i() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void j(View view, boolean z) {
        float f8;
        if (view != null) {
            view.setEnabled(z);
            if (z) {
                f8 = this.f6477R0;
            } else {
                f8 = this.f6478S0;
            }
            view.setAlpha(f8);
        }
    }

    public final void k(boolean z) {
        if (this.f6500f1 != z) {
            this.f6500f1 = z;
            String str = this.f6494c1;
            Drawable drawable = this.f6490a1;
            String str2 = this.f6492b1;
            Drawable drawable2 = this.f6488Z0;
            ImageView imageView = this.f6526u0;
            if (imageView != null) {
                if (z) {
                    imageView.setImageDrawable(drawable2);
                    imageView.setContentDescription(str2);
                } else {
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(str);
                }
            }
            ImageView imageView2 = this.f6527v0;
            if (imageView2 != null) {
                if (z) {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setContentDescription(str2);
                } else {
                    imageView2.setImageDrawable(drawable);
                    imageView2.setContentDescription(str);
                }
            }
            C0375h hVar = this.f6498e1;
            if (hVar != null) {
                ((z) hVar).f6570W.getClass();
            }
        }
    }

    public final void l() {
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        long j7;
        long j8;
        if (h() && this.f6502g1) {
            Q q7 = this.f6496d1;
            if (q7 != null) {
                if (!this.f6504h1 || !b(q7, this.f6465F0)) {
                    z9 = ((a) q7).e(5);
                } else {
                    z9 = ((a) q7).e(10);
                }
                a aVar = (a) q7;
                z8 = aVar.e(7);
                z6 = aVar.e(11);
                z = aVar.e(12);
                z10 = aVar.e(9);
            } else {
                z10 = false;
                z9 = false;
                z8 = false;
                z6 = false;
                z = false;
            }
            Resources resources = this.f6482V;
            View view = this.f6515n0;
            if (z6) {
                Q q8 = this.f6496d1;
                if (q8 != null) {
                    C0232y yVar = (C0232y) q8;
                    yVar.Y();
                    j8 = yVar.p0;
                } else {
                    j8 = RangedBeacon.DEFAULT_MAX_TRACKING_AGE;
                }
                int i = (int) (j8 / 1000);
                TextView textView = this.p0;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(2131820545, i, new Object[]{Integer.valueOf(i)}));
                }
            }
            View view2 = this.f6513m0;
            if (z) {
                Q q9 = this.f6496d1;
                if (q9 != null) {
                    C0232y yVar2 = (C0232y) q9;
                    yVar2.Y();
                    j7 = yVar2.f4961q0;
                } else {
                    j7 = 15000;
                }
                int i8 = (int) (j7 / 1000);
                TextView textView2 = this.f6517o0;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i8));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(2131820544, i8, new Object[]{Integer.valueOf(i8)}));
                }
            }
            j(this.f6507j0, z8);
            j(view, z6);
            j(view2, z);
            j(this.f6509k0, z10);
            I i9 = this.f6461B0;
            if (i9 != null) {
                ((C0372e) i9).setEnabled(z9);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (((T0.C0232y) r4.f6496d1).z().p() == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r4 = this;
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x005f
            boolean r0 = r4.f6502g1
            if (r0 != 0) goto L_0x000b
            goto L_0x005f
        L_0x000b:
            android.widget.ImageView r0 = r4.f6511l0
            if (r0 == 0) goto L_0x005f
            M0.Q r1 = r4.f6496d1
            boolean r2 = r4.f6506i1
            boolean r1 = P0.z.Y(r1, r2)
            if (r1 == 0) goto L_0x001c
            android.graphics.drawable.Drawable r2 = r4.f6467H0
            goto L_0x001e
        L_0x001c:
            android.graphics.drawable.Drawable r2 = r4.f6468I0
        L_0x001e:
            if (r1 == 0) goto L_0x0024
            r1 = 2131951731(0x7f130073, float:1.9539885E38)
            goto L_0x0027
        L_0x0024:
            r1 = 2131951730(0x7f130072, float:1.9539883E38)
        L_0x0027:
            r0.setImageDrawable(r2)
            android.content.res.Resources r2 = r4.f6482V
            java.lang.String r1 = r2.getString(r1)
            r0.setContentDescription(r1)
            M0.Q r1 = r4.f6496d1
            if (r1 == 0) goto L_0x005b
            E2.a r1 = (E2.a) r1
            r2 = 1
            boolean r1 = r1.e(r2)
            if (r1 == 0) goto L_0x005b
            M0.Q r1 = r4.f6496d1
            r3 = 17
            E2.a r1 = (E2.a) r1
            boolean r1 = r1.e(r3)
            if (r1 == 0) goto L_0x005c
            M0.Q r1 = r4.f6496d1
            T0.y r1 = (T0.C0232y) r1
            M0.X r1 = r1.z()
            boolean r1 = r1.p()
            if (r1 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            r4.j(r0, r2)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.r.m():void");
    }

    public final void n() {
        C0377j jVar;
        Q q7 = this.f6496d1;
        if (q7 != null) {
            C0232y yVar = (C0232y) q7;
            yVar.Y();
            float f8 = yVar.f4945b1.f4761o.f2846a;
            boolean z = false;
            float f9 = Float.MAX_VALUE;
            int i = 0;
            int i8 = 0;
            while (true) {
                jVar = this.f6495d0;
                float[] fArr = jVar.f6439b;
                if (i >= fArr.length) {
                    break;
                }
                float abs = Math.abs(f8 - fArr[i]);
                if (abs < f9) {
                    i8 = i;
                    f9 = abs;
                }
                i++;
            }
            jVar.f6440c = i8;
            String str = jVar.f6438a[i8];
            C0380m mVar = this.f6493c0;
            mVar.f6447b[0] = str;
            if (mVar.a(1) || mVar.a(0)) {
                z = true;
            }
            j(this.f6528w0, z);
        }
    }

    public final void o() {
        long j7;
        int i;
        long j8;
        long j9;
        if (h() && this.f6502g1) {
            Q q7 = this.f6496d1;
            long j10 = 0;
            if (q7 == null || !((a) q7).e(16)) {
                j7 = 0;
            } else {
                long j11 = this.s1;
                C0232y yVar = (C0232y) q7;
                yVar.Y();
                long s8 = yVar.s(yVar.f4945b1) + j11;
                long j12 = this.s1;
                yVar.Y();
                if (yVar.f4945b1.f4749a.p()) {
                    j9 = yVar.f4949d1;
                } else {
                    X x8 = yVar.f4945b1;
                    if (x8.f4757k.f12280d != x8.f4750b.f12280d) {
                        j9 = z.c0(x8.f4749a.m(yVar.v(), (W) yVar.f1328V, 0).f2880m);
                    } else {
                        long j13 = x8.f4763q;
                        if (yVar.f4945b1.f4757k.b()) {
                            X x9 = yVar.f4945b1;
                            x9.f4749a.g(x9.f4757k.f12277a, yVar.f4954i0).d(yVar.f4945b1.f4757k.f12278b);
                        } else {
                            j10 = j13;
                        }
                        X x10 = yVar.f4945b1;
                        M0.X x11 = x10.f4749a;
                        Object obj = x10.f4757k.f12277a;
                        V v4 = yVar.f4954i0;
                        x11.g(obj, v4);
                        j9 = z.c0(j10 + v4.e);
                    }
                }
                j7 = j9 + j12;
                j10 = s8;
            }
            TextView textView = this.f6460A0;
            if (textView != null && !this.f6510k1) {
                textView.setText(z.C(this.f6462C0, this.f6463D0, j10));
            }
            I i8 = this.f6461B0;
            if (i8 != null) {
                ((C0372e) i8).setPosition(j10);
                ((C0372e) this.f6461B0).setBufferedPosition(j7);
            }
            removeCallbacks(this.f6466G0);
            if (q7 == null) {
                i = 1;
            } else {
                i = ((C0232y) q7).D();
            }
            long j14 = 1000;
            if (q7 != null) {
                C0232y yVar2 = (C0232y) ((a) q7);
                if (yVar2.D() == 3 && yVar2.C()) {
                    yVar2.Y();
                    if (yVar2.f4945b1.f4760n == 0) {
                        I i9 = this.f6461B0;
                        if (i9 != null) {
                            j8 = ((C0372e) i9).getPreferredUpdateDelay();
                        } else {
                            j8 = 1000;
                        }
                        long min = Math.min(j8, 1000 - (j10 % 1000));
                        C0232y yVar3 = (C0232y) q7;
                        yVar3.Y();
                        float f8 = yVar3.f4945b1.f4761o.f2846a;
                        if (f8 > 0.0f) {
                            j14 = (long) (((float) min) / f8);
                        }
                        postDelayed(this.f6466G0, z.j(j14, (long) this.f6514m1, 1000));
                        return;
                    }
                }
            }
            if (i != 4 && i != 1) {
                postDelayed(this.f6466G0, 1000);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w wVar = this.f6480U;
        wVar.f6544a.addOnLayoutChangeListener(wVar.f6565x);
        this.f6502g1 = true;
        if (g()) {
            wVar.g();
        }
        i();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w wVar = this.f6480U;
        wVar.f6544a.removeOnLayoutChangeListener(wVar.f6565x);
        this.f6502g1 = false;
        removeCallbacks(this.f6466G0);
        wVar.f();
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        View view = this.f6480U.f6545b;
        if (view != null) {
            view.layout(0, 0, i9 - i, i10 - i8);
        }
    }

    public final void p() {
        ImageView imageView;
        if (h() && this.f6502g1 && (imageView = this.f6520q0) != null) {
            if (this.f6516n1 == 0) {
                j(imageView, false);
                return;
            }
            Q q7 = this.f6496d1;
            String str = this.f6472M0;
            Drawable drawable = this.f6469J0;
            if (q7 == null || !((a) q7).e(15)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            C0232y yVar = (C0232y) q7;
            yVar.Y();
            int i = yVar.f4912A0;
            if (i == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i == 1) {
                imageView.setImageDrawable(this.f6470K0);
                imageView.setContentDescription(this.f6473N0);
            } else if (i == 2) {
                imageView.setImageDrawable(this.f6471L0);
                imageView.setContentDescription(this.f6474O0);
            }
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f6491b0;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.f6505i0;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f6503h0;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (h() && this.f6502g1 && (imageView = this.f6522r0) != null) {
            Q q7 = this.f6496d1;
            if (!this.f6480U.b(imageView)) {
                j(imageView, false);
                return;
            }
            String str = this.f6481U0;
            Drawable drawable = this.f6476Q0;
            if (q7 == null || !((a) q7).e(14)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            C0232y yVar = (C0232y) q7;
            yVar.Y();
            if (yVar.f4913B0) {
                drawable = this.f6475P0;
            }
            imageView.setImageDrawable(drawable);
            yVar.Y();
            if (yVar.f4913B0) {
                str = this.f6479T0;
            }
            imageView.setContentDescription(str);
        }
    }

    public final void s() {
        boolean z;
        M0.X x8;
        int i;
        long j7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z6;
        int i12;
        Q q7 = this.f6496d1;
        if (q7 != null) {
            boolean z8 = this.f6504h1;
            boolean z9 = false;
            boolean z10 = true;
            W w2 = this.f6465F0;
            if (!z8 || !b(q7, w2)) {
                z = false;
            } else {
                z = true;
            }
            this.f6508j1 = z;
            this.s1 = 0;
            a aVar = (a) q7;
            if (aVar.e(17)) {
                x8 = ((C0232y) q7).z();
            } else {
                x8 = M0.X.f2884a;
            }
            long j8 = -9223372036854775807L;
            if (!x8.p()) {
                int v4 = ((C0232y) q7).v();
                boolean z11 = this.f6508j1;
                if (z11) {
                    i8 = 0;
                } else {
                    i8 = v4;
                }
                if (z11) {
                    i9 = x8.o() - 1;
                } else {
                    i9 = v4;
                }
                long j9 = 0;
                i = 0;
                while (true) {
                    if (i8 > i9) {
                        break;
                    }
                    if (i8 == v4) {
                        this.s1 = z.c0(j9);
                    }
                    x8.n(i8, w2);
                    if (w2.f2880m == j8) {
                        l.j(this.f6508j1 ^ z10);
                        break;
                    }
                    int i13 = w2.f2881n;
                    boolean z12 = z9;
                    while (i13 <= w2.f2882o) {
                        V v8 = this.f6464E0;
                        x8.f(i13, v8, z12);
                        C0115c cVar = v8.f2867g;
                        cVar.getClass();
                        for (int i14 = z12; i14 < cVar.f2916a; i14++) {
                            v8.d(i14);
                            long j10 = v8.e;
                            if (j10 >= 0) {
                                long[] jArr = this.f6518o1;
                                i11 = v4;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        i12 = 1;
                                    } else {
                                        i12 = jArr.length * 2;
                                    }
                                    this.f6518o1 = Arrays.copyOf(jArr, i12);
                                    this.f6519p1 = Arrays.copyOf(this.f6519p1, i12);
                                }
                                this.f6518o1[i] = z.c0(j10 + j9);
                                boolean[] zArr = this.f6519p1;
                                C0114b a8 = v8.f2867g.a(i14);
                                int i15 = a8.f2893a;
                                if (i15 == -1) {
                                    i10 = i9;
                                } else {
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= i15) {
                                            i10 = i9;
                                            z10 = true;
                                            z6 = false;
                                            break;
                                        }
                                        i10 = i9;
                                        int i17 = a8.e[i16];
                                        if (i17 == 0) {
                                            break;
                                        }
                                        C0114b bVar = a8;
                                        z10 = true;
                                        if (i17 == 1) {
                                            break;
                                        }
                                        i16++;
                                        i9 = i10;
                                        a8 = bVar;
                                    }
                                    zArr[i] = !z6;
                                    i++;
                                }
                                z10 = true;
                                z6 = true;
                                zArr[i] = !z6;
                                i++;
                            } else {
                                i11 = v4;
                                i10 = i9;
                            }
                            v4 = i11;
                            i9 = i10;
                        }
                        int i18 = v4;
                        int i19 = i9;
                        i13++;
                        z12 = false;
                    }
                    j9 += w2.f2880m;
                    i8++;
                    v4 = v4;
                    i9 = i9;
                    z9 = false;
                    j8 = -9223372036854775807L;
                }
                j7 = j9;
            } else {
                if (aVar.e(16)) {
                    long b8 = aVar.b();
                    if (b8 != -9223372036854775807L) {
                        j7 = z.O(b8);
                        i = 0;
                    }
                }
                j7 = 0;
                i = 0;
            }
            long c02 = z.c0(j7);
            TextView textView = this.f6531z0;
            if (textView != null) {
                textView.setText(z.C(this.f6462C0, this.f6463D0, c02));
            }
            I i20 = this.f6461B0;
            if (i20 != null) {
                C0372e eVar = (C0372e) i20;
                eVar.setDuration(c02);
                long[] jArr2 = this.f6521q1;
                int length = jArr2.length;
                int i21 = i + length;
                long[] jArr3 = this.f6518o1;
                if (i21 > jArr3.length) {
                    this.f6518o1 = Arrays.copyOf(jArr3, i21);
                    this.f6519p1 = Arrays.copyOf(this.f6519p1, i21);
                }
                System.arraycopy(jArr2, 0, this.f6518o1, i, length);
                System.arraycopy(this.f6523r1, 0, this.f6519p1, i, length);
                long[] jArr4 = this.f6518o1;
                boolean[] zArr2 = this.f6519p1;
                if (i21 != 0 && (jArr4 == null || zArr2 == null)) {
                    z10 = false;
                }
                l.d(z10);
                eVar.f6400J0 = i21;
                eVar.f6401K0 = jArr4;
                eVar.f6402L0 = zArr2;
                eVar.e();
            }
            o();
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f6480U.f6543C = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(C0375h hVar) {
        boolean z;
        this.f6498e1 = hVar;
        boolean z6 = true;
        if (hVar != null) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.f6526u0;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (hVar == null) {
            z6 = false;
        }
        ImageView imageView2 = this.f6527v0;
        if (imageView2 != null) {
            if (z6) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
    }

    public void setPlayer(Q q7) {
        boolean z;
        boolean z6 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        if (q7 == null || ((C0232y) q7).f4959n0 == Looper.getMainLooper()) {
            z6 = true;
        }
        l.d(z6);
        Q q8 = this.f6496d1;
        if (q8 != q7) {
            C0374g gVar = this.f6484W;
            if (q8 != null) {
                ((C0232y) q8).L(gVar);
            }
            this.f6496d1 = q7;
            if (q7 != null) {
                gVar.getClass();
                ((C0232y) q7).f4952g0.a(gVar);
            }
            i();
        }
    }

    public void setProgressUpdateListener(C0378k kVar) {
    }

    public void setRepeatToggleModes(int i) {
        this.f6516n1 = i;
        Q q7 = this.f6496d1;
        boolean z = false;
        if (q7 != null && ((a) q7).e(15)) {
            C0232y yVar = (C0232y) this.f6496d1;
            yVar.Y();
            int i8 = yVar.f4912A0;
            if (i == 0 && i8 != 0) {
                ((C0232y) this.f6496d1).Q(0);
            } else if (i == 1 && i8 == 2) {
                ((C0232y) this.f6496d1).Q(1);
            } else if (i == 2 && i8 == 1) {
                ((C0232y) this.f6496d1).Q(2);
            }
        }
        if (i != 0) {
            z = true;
        }
        this.f6480U.h(this.f6520q0, z);
        p();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f6480U.h(this.f6513m0, z);
        l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.f6504h1 = z;
        s();
    }

    public void setShowNextButton(boolean z) {
        this.f6480U.h(this.f6509k0, z);
        l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.f6506i1 = z;
        m();
    }

    public void setShowPreviousButton(boolean z) {
        this.f6480U.h(this.f6507j0, z);
        l();
    }

    public void setShowRewindButton(boolean z) {
        this.f6480U.h(this.f6515n0, z);
        l();
    }

    public void setShowShuffleButton(boolean z) {
        this.f6480U.h(this.f6522r0, z);
        r();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f6480U.h(this.f6525t0, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f6512l1 = i;
        if (g()) {
            this.f6480U.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f6480U.h(this.f6524s0, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f6514m1 = z.i(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z;
        ImageView imageView = this.f6524s0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            j(imageView, z);
        }
    }

    public final void t() {
        boolean z;
        C0373f fVar = this.f6497e0;
        fVar.getClass();
        fVar.f6431a = Collections.emptyList();
        C0373f fVar2 = this.f6499f0;
        fVar2.getClass();
        fVar2.f6431a = Collections.emptyList();
        Q q7 = this.f6496d1;
        boolean z6 = false;
        ImageView imageView = this.f6525t0;
        if (q7 != null && ((a) q7).e(30) && ((a) this.f6496d1).e(29)) {
            e0 A8 = ((C0232y) this.f6496d1).A();
            i0 e = e(A8, 1);
            fVar2.f6431a = e;
            r rVar = fVar2.f6434d;
            Q q8 = rVar.f6496d1;
            q8.getClass();
            C1141j F8 = ((C0232y) q8).F();
            boolean isEmpty = e.isEmpty();
            C0380m mVar = rVar.f6493c0;
            if (!isEmpty) {
                if (fVar2.a(F8)) {
                    int i = 0;
                    while (true) {
                        if (i >= e.f2075X) {
                            break;
                        }
                        C0382o oVar = (C0382o) e.get(i);
                        if (oVar.f6452a.e[oVar.f6453b]) {
                            mVar.f6447b[1] = oVar.f6454c;
                            break;
                        }
                        i++;
                    }
                } else {
                    mVar.f6447b[1] = rVar.getResources().getString(2131951763);
                }
            } else {
                mVar.f6447b[1] = rVar.getResources().getString(2131951764);
            }
            if (this.f6480U.b(imageView)) {
                fVar.b(e(A8, 3));
            } else {
                fVar.b(i0.f2073Y);
            }
        }
        if (fVar.getItemCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        j(imageView, z);
        C0380m mVar2 = this.f6493c0;
        if (mVar2.a(1) || mVar2.a(0)) {
            z6 = true;
        }
        j(this.f6528w0, z6);
    }
}
