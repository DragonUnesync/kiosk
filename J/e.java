package j;

import D7.b;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import n0.C1232a;

public final class e extends f implements C1232a {

    /* renamed from: h0  reason: collision with root package name */
    public b f12803h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f12804i0;

    /* renamed from: j0  reason: collision with root package name */
    public b f12805j0;

    /* renamed from: k0  reason: collision with root package name */
    public b f12806k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f12807l0 = -1;

    /* renamed from: m0  reason: collision with root package name */
    public int f12808m0 = -1;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f12809n0;

    public e(b bVar, Resources resources) {
        this.f12815Y = 255;
        this.f12817a0 = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0276, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j.e e(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = r22.getName()
            java.lang.String r6 = "animated-selector"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0277
            j.e r5 = new j.e
            r6 = 0
            r5.<init>(r6, r6)
            int[] r7 = k.C1130b.f12898a
            android.content.res.TypedArray r7 = l0.C1169b.g(r1, r4, r3, r7)
            r8 = 1
            boolean r9 = r7.getBoolean(r8, r8)
            r5.setVisible(r9, r8)
            j.b r9 = r5.f12805j0
            int r10 = r9.f12778d
            int r11 = k.C1129a.b(r7)
            r10 = r10 | r11
            r9.f12778d = r10
            boolean r10 = r9.i
            r11 = 2
            boolean r10 = r7.getBoolean(r11, r10)
            r9.i = r10
            boolean r10 = r9.f12784l
            r12 = 3
            boolean r10 = r7.getBoolean(r12, r10)
            r9.f12784l = r10
            int r10 = r9.f12797y
            r13 = 4
            int r10 = r7.getInt(r13, r10)
            r9.f12797y = r10
            r10 = 5
            int r14 = r9.z
            int r10 = r7.getInt(r10, r14)
            r9.z = r10
            boolean r9 = r9.f12795w
            r10 = 0
            boolean r9 = r7.getBoolean(r10, r9)
            r5.setDither(r9)
            j.b r9 = r5.f12811U
            if (r1 == 0) goto L_0x007e
            r9.f12776b = r1
            android.util.DisplayMetrics r14 = r21.getDisplayMetrics()
            int r14 = r14.densityDpi
            if (r14 != 0) goto L_0x0073
            r14 = 160(0xa0, float:2.24E-43)
        L_0x0073:
            int r15 = r9.f12777c
            r9.f12777c = r14
            if (r15 == r14) goto L_0x0081
            r9.f12785m = r10
            r9.f12782j = r10
            goto L_0x0081
        L_0x007e:
            r9.getClass()
        L_0x0081:
            r7.recycle()
            int r7 = r22.getDepth()
            int r7 = r7 + r8
        L_0x0089:
            int r9 = r22.next()
            if (r9 == r8) goto L_0x026f
            int r14 = r22.getDepth()
            if (r14 >= r7) goto L_0x0097
            if (r9 == r12) goto L_0x026f
        L_0x0097:
            if (r9 == r11) goto L_0x009a
            goto L_0x0089
        L_0x009a:
            if (r14 <= r7) goto L_0x009d
            goto L_0x0089
        L_0x009d:
            java.lang.String r9 = r22.getName()
            java.lang.String r14 = "item"
            boolean r9 = r9.equals(r14)
            r14 = -1
            if (r9 == 0) goto L_0x016e
            int[] r9 = k.C1130b.f12899b
            android.content.res.TypedArray r9 = l0.C1169b.g(r1, r4, r3, r9)
            int r15 = r9.getResourceId(r10, r10)
            int r14 = r9.getResourceId(r8, r14)
            if (r14 <= 0) goto L_0x00c3
            o.O0 r6 = o.O0.d()
            android.graphics.drawable.Drawable r6 = r6.f(r0, r14)
            goto L_0x00c4
        L_0x00c3:
            r6 = 0
        L_0x00c4:
            r9.recycle()
            int r9 = r23.getAttributeCount()
            int[] r14 = new int[r9]
            r8 = 0
            r12 = 0
        L_0x00cf:
            if (r12 >= r9) goto L_0x00f3
            int r11 = r3.getAttributeNameResource(r12)
            if (r11 == 0) goto L_0x00ee
            r13 = 16842960(0x10100d0, float:2.369414E-38)
            if (r11 == r13) goto L_0x00ee
            r13 = 16843161(0x1010199, float:2.3694704E-38)
            if (r11 == r13) goto L_0x00ee
            int r13 = r8 + 1
            boolean r16 = r3.getAttributeBooleanValue(r12, r10)
            if (r16 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            int r11 = -r11
        L_0x00eb:
            r14[r8] = r11
            r8 = r13
        L_0x00ee:
            int r12 = r12 + 1
            r11 = 2
            r13 = 4
            goto L_0x00cf
        L_0x00f3:
            int[] r8 = android.util.StateSet.trimStateSet(r14, r8)
            java.lang.String r9 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L_0x0139
        L_0x00fb:
            int r6 = r22.next()
            r11 = 4
            if (r6 != r11) goto L_0x0103
            goto L_0x00fb
        L_0x0103:
            r11 = 2
            if (r6 != r11) goto L_0x0120
            java.lang.String r6 = r22.getName()
            java.lang.String r11 = "vector"
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x011b
            h2.r r6 = new h2.r
            r6.<init>()
            r6.inflate(r1, r2, r3, r4)
            goto L_0x0139
        L_0x011b:
            android.graphics.drawable.Drawable r6 = k.C1129a.a(r21, r22, r23, r24)
            goto L_0x0139
        L_0x0120:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0139:
            if (r6 == 0) goto L_0x0155
            j.b r9 = r5.f12805j0
            int r6 = r9.a(r6)
            int[][] r11 = r9.f12772H
            r11[r6] = r8
            Y.j r8 = r9.f12774J
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            r8.d(r6, r9)
        L_0x014e:
            r6 = 0
            r8 = 1
        L_0x0150:
            r11 = 2
            r12 = 3
            r13 = 4
            goto L_0x0089
        L_0x0155:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x016e:
            java.lang.String r6 = r22.getName()
            java.lang.String r8 = "transition"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0267
            int[] r6 = k.C1130b.f12900c
            android.content.res.TypedArray r6 = l0.C1169b.g(r1, r4, r3, r6)
            r8 = 2
            int r9 = r6.getResourceId(r8, r14)
            r8 = 1
            int r11 = r6.getResourceId(r8, r14)
            int r12 = r6.getResourceId(r10, r14)
            if (r12 <= 0) goto L_0x019a
            o.O0 r13 = o.O0.d()
            android.graphics.drawable.Drawable r12 = r13.f(r0, r12)
        L_0x0198:
            r13 = 3
            goto L_0x019c
        L_0x019a:
            r12 = 0
            goto L_0x0198
        L_0x019c:
            boolean r15 = r6.getBoolean(r13, r10)
            r6.recycle()
            java.lang.String r6 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r12 != 0) goto L_0x01e6
        L_0x01a7:
            int r12 = r22.next()
            r8 = 4
            if (r12 != r8) goto L_0x01b0
            r8 = 1
            goto L_0x01a7
        L_0x01b0:
            r8 = 2
            if (r12 != r8) goto L_0x01cd
            java.lang.String r12 = r22.getName()
            java.lang.String r8 = "animated-vector"
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x01c8
            h2.f r12 = new h2.f
            r12.<init>(r0)
            r12.inflate(r1, r2, r3, r4)
            goto L_0x01e6
        L_0x01c8:
            android.graphics.drawable.Drawable r12 = k.C1129a.a(r21, r22, r23, r24)
            goto L_0x01e6
        L_0x01cd:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01e6:
            if (r12 == 0) goto L_0x024e
            if (r9 == r14) goto L_0x0233
            if (r11 == r14) goto L_0x0233
            j.b r6 = r5.f12805j0
            int r8 = r6.a(r12)
            long r13 = (long) r9
            r9 = 32
            long r16 = r13 << r9
            long r11 = (long) r11
            long r9 = r16 | r11
            if (r15 == 0) goto L_0x0202
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0204
        L_0x0202:
            r16 = 0
        L_0x0204:
            Y.g r0 = r6.f12773I
            long r1 = (long) r8
            long r18 = r1 | r16
            java.lang.Long r8 = java.lang.Long.valueOf(r18)
            r0.a(r9, r8)
            if (r15 == 0) goto L_0x0228
            r0 = 32
            long r8 = r11 << r0
            long r8 = r8 | r13
            Y.g r0 = r6.f12773I
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 | r10
            long r1 = r1 | r16
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.a(r8, r1)
        L_0x0228:
            r0 = r20
            r1 = r21
            r2 = r22
            r6 = 0
            r8 = 1
            r10 = 0
            goto L_0x0150
        L_0x0233:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x024e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0267:
            r0 = r20
            r1 = r21
            r2 = r22
            goto L_0x014e
        L_0x026f:
            int[] r0 = r5.getState()
            r5.onStateChange(r0)
            return r5
        L_0x0277:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e.e(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):j.e");
    }

    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public final void d(b bVar) {
        this.f12811U = bVar;
        int i = this.f12817a0;
        if (i >= 0) {
            Drawable d8 = bVar.d(i);
            this.f12813W = d8;
            if (d8 != null) {
                b(d8);
            }
        }
        this.f12814X = null;
        this.f12803h0 = bVar;
        this.f12805j0 = bVar;
    }

    public final Drawable f() {
        if (!this.f12804i0) {
            super.mutate();
            b bVar = this.f12803h0;
            bVar.f12773I = bVar.f12773I.clone();
            bVar.f12774J = bVar.f12774J.clone();
            this.f12804i0 = true;
        }
        return this;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        b bVar = this.f12806k0;
        if (bVar != null) {
            bVar.O();
            this.f12806k0 = null;
            c(this.f12807l0);
            this.f12807l0 = -1;
            this.f12808m0 = -1;
        }
    }

    public final Drawable mutate() {
        if (!this.f12809n0) {
            f();
            b bVar = this.f12805j0;
            bVar.f12773I = bVar.f12773I.clone();
            bVar.f12774J = bVar.f12774J.clone();
            this.f12809n0 = true;
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        if (c(r1) != false) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStateChange(int[] r14) {
        /*
            r13 = this;
            j.b r0 = r13.f12805j0
            int r1 = r0.f(r14)
            if (r1 < 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            int[] r1 = android.util.StateSet.WILD_CARD
            int r1 = r0.f(r1)
        L_0x000f:
            int r0 = r13.f12817a0
            r2 = 0
            if (r1 == r0) goto L_0x00d4
            D7.b r3 = r13.f12806k0
            r4 = 1
            if (r3 == 0) goto L_0x0039
            int r0 = r13.f12807l0
            if (r1 != r0) goto L_0x001f
            goto L_0x00d3
        L_0x001f:
            int r0 = r13.f12808m0
            if (r1 != r0) goto L_0x0034
            boolean r0 = r3.d()
            if (r0 == 0) goto L_0x0034
            r3.L()
            int r0 = r13.f12808m0
            r13.f12807l0 = r0
            r13.f12808m0 = r1
            goto L_0x00d3
        L_0x0034:
            int r0 = r13.f12807l0
            r3.O()
        L_0x0039:
            r3 = 0
            r13.f12806k0 = r3
            r3 = -1
            r13.f12808m0 = r3
            r13.f12807l0 = r3
            j.b r3 = r13.f12805j0
            int r5 = r3.e(r0)
            int r6 = r3.e(r1)
            if (r6 == 0) goto L_0x00cd
            if (r5 != 0) goto L_0x0051
            goto L_0x00cd
        L_0x0051:
            long r7 = (long) r5
            r5 = 32
            long r7 = r7 << r5
            long r5 = (long) r6
            long r5 = r5 | r7
            Y.g r7 = r3.f12773I
            java.lang.Object r7 = r7.e(r5)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            int r8 = (int) r7
            if (r8 >= 0) goto L_0x0067
            goto L_0x00cd
        L_0x0067:
            Y.g r7 = r3.f12773I
            java.lang.Object r7 = r7.e(r5)
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            long r9 = r9 & r11
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0081
            r7 = 1
            goto L_0x0082
        L_0x0081:
            r7 = 0
        L_0x0082:
            r13.c(r8)
            android.graphics.drawable.Drawable r8 = r13.f12813W
            boolean r9 = r8 instanceof android.graphics.drawable.AnimationDrawable
            if (r9 == 0) goto L_0x00aa
            Y.g r3 = r3.f12773I
            java.lang.Object r3 = r3.e(r5)
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            long r5 = r5 & r9
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x00a2
            r2 = 1
        L_0x00a2:
            j.c r3 = new j.c
            android.graphics.drawable.AnimationDrawable r8 = (android.graphics.drawable.AnimationDrawable) r8
            r3.<init>(r8, r2, r7)
            goto L_0x00c3
        L_0x00aa:
            boolean r3 = r8 instanceof h2.C1065f
            if (r3 == 0) goto L_0x00b7
            j.a r3 = new j.a
            h2.f r8 = (h2.C1065f) r8
            r2 = 1
            r3.<init>(r8, r2)
            goto L_0x00c3
        L_0x00b7:
            boolean r3 = r8 instanceof android.graphics.drawable.Animatable
            if (r3 == 0) goto L_0x00cd
            j.a r3 = new j.a
            android.graphics.drawable.Animatable r8 = (android.graphics.drawable.Animatable) r8
            r2 = 0
            r3.<init>(r8, r2)
        L_0x00c3:
            r3.N()
            r13.f12806k0 = r3
            r13.f12808m0 = r0
            r13.f12807l0 = r1
            goto L_0x00d3
        L_0x00cd:
            boolean r0 = r13.c(r1)
            if (r0 == 0) goto L_0x00d4
        L_0x00d3:
            r2 = 1
        L_0x00d4:
            android.graphics.drawable.Drawable r0 = r13.f12813W
            if (r0 == 0) goto L_0x00dd
            boolean r14 = r0.setState(r14)
            r2 = r2 | r14
        L_0x00dd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e.onStateChange(int[]):boolean");
    }

    public final boolean setVisible(boolean z, boolean z6) {
        boolean visible = super.setVisible(z, z6);
        b bVar = this.f12806k0;
        if (bVar != null && (visible || z6)) {
            if (z) {
                bVar.N();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
