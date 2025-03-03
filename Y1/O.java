package Y1;

import O0.b;
import P0.z;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import g7.C0996d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class O extends FrameLayout implements H {

    /* renamed from: U  reason: collision with root package name */
    public final C0370c f6371U;

    /* renamed from: V  reason: collision with root package name */
    public final M f6372V;

    /* renamed from: W  reason: collision with root package name */
    public List f6373W = Collections.emptyList();

    /* renamed from: a0  reason: collision with root package name */
    public C0371d f6374a0 = C0371d.f6385g;

    /* renamed from: b0  reason: collision with root package name */
    public float f6375b0 = 0.0533f;

    /* renamed from: c0  reason: collision with root package name */
    public float f6376c0 = 0.08f;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, android.webkit.WebView, Y1.M] */
    public O(Context context) {
        super(context, (AttributeSet) null);
        C0370c cVar = new C0370c(context);
        this.f6371U = cVar;
        ? webView = new WebView(context, (AttributeSet) null);
        this.f6372V = webView;
        webView.setBackgroundColor(0);
        addView(cVar);
        addView(webView);
    }

    public final void a(List list, C0371d dVar, float f8, float f9) {
        this.f6374a0 = dVar;
        this.f6375b0 = f8;
        this.f6376c0 = f9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            b bVar = (b) list.get(i);
            if (bVar.f3531d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f6373W.isEmpty() || !arrayList2.isEmpty()) {
            this.f6373W = arrayList2;
            c();
        }
        this.f6371U.a(arrayList, dVar, f8, f9);
        invalidate();
    }

    public final String b(int i, float f8) {
        float x8 = C0996d.x(i, f8, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (x8 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(x8 / getContext().getResources().getDisplayMetrics().density)};
        int i8 = z.f3748a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0204, code lost:
        if (r8 != false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0207, code lost:
        r26 = "left";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x020a, code lost:
        if (r8 != false) goto L_0x0207;
     */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0638  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0258  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r45 = this;
            r0 = r45
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            Y1.d r6 = r0.f6374a0
            int r6 = r6.f6386a
            java.lang.String r6 = com.bumptech.glide.d.u(r6)
            float r7 = r0.f6375b0
            r8 = 0
            java.lang.String r7 = r0.b(r8, r7)
            r9 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r10 = java.lang.Float.valueOf(r9)
            Y1.d r11 = r0.f6374a0
            int r12 = r11.f6389d
            java.lang.String r13 = "unset"
            int r11 = r11.e
            if (r12 == r4) goto L_0x0060
            if (r12 == r3) goto L_0x0051
            if (r12 == r2) goto L_0x0042
            if (r12 == r1) goto L_0x0033
            r11 = r13
            goto L_0x0072
        L_0x0033:
            java.lang.String r11 = com.bumptech.glide.d.u(r11)
            int r12 = P0.z.f3748a
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r12 = "-0.05em -0.05em 0.15em "
            java.lang.String r11 = r12.concat(r11)
            goto L_0x0072
        L_0x0042:
            java.lang.String r11 = com.bumptech.glide.d.u(r11)
            int r12 = P0.z.f3748a
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r12 = "0.06em 0.08em 0.15em "
            java.lang.String r11 = r12.concat(r11)
            goto L_0x0072
        L_0x0051:
            java.lang.String r11 = com.bumptech.glide.d.u(r11)
            int r12 = P0.z.f3748a
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r12 = "0.1em 0.12em 0.15em "
            java.lang.String r11 = r12.concat(r11)
            goto L_0x0072
        L_0x0060:
            java.lang.String r11 = com.bumptech.glide.d.u(r11)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r8] = r11
            int r11 = P0.z.f3748a
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r14 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            java.lang.String r11 = java.lang.String.format(r11, r14, r12)
        L_0x0072:
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r8] = r6
            r12[r4] = r7
            r12[r3] = r10
            r12[r2] = r11
            int r6 = P0.z.f3748a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r6 = java.lang.String.format(r6, r7, r12)
            r5.append(r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            Y1.d r7 = r0.f6374a0
            int r7 = r7.f6387b
            java.lang.String r7 = com.bumptech.glide.d.u(r7)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "background-color:"
            r10.<init>(r11)
            r10.append(r7)
            java.lang.String r7 = ";"
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            java.lang.String r12 = ".default_bg,.default_bg *"
            r6.put(r12, r10)
            r10 = 0
        L_0x00af:
            java.util.List r12 = r0.f6373W
            int r12 = r12.size()
            if (r10 >= r12) goto L_0x06f9
            java.util.List r12 = r0.f6373W
            java.lang.Object r12 = r12.get(r10)
            O0.b r12 = (O0.b) r12
            float r14 = r12.f3534h
            r15 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r16 = 1120403456(0x42c80000, float:100.0)
            int r17 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x00cd
            float r14 = r14 * r16
            goto L_0x00cf
        L_0x00cd:
            r14 = 1112014848(0x42480000, float:50.0)
        L_0x00cf:
            r17 = -50
            r18 = -100
            int r1 = r12.i
            if (r1 == r4) goto L_0x00de
            if (r1 == r3) goto L_0x00db
            r1 = 0
            goto L_0x00e0
        L_0x00db:
            r1 = -100
            goto L_0x00e0
        L_0x00de:
            r1 = -50
        L_0x00e0:
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            java.lang.String r2 = "%.2f%%"
            int r9 = r12.f3541p
            float r3 = r12.e
            int r21 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r21 == 0) goto L_0x015e
            int r15 = r12.f3532f
            if (r15 == r4) goto L_0x0125
            float r3 = r3 * r16
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r15 = new java.lang.Object[r4]
            r15[r8] = r3
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = java.lang.String.format(r3, r2, r15)
            int r15 = r12.f3533g
            if (r9 != r4) goto L_0x0117
            if (r15 == r4) goto L_0x0110
            r8 = 2
            if (r15 == r8) goto L_0x010d
            r15 = 0
            goto L_0x0113
        L_0x010d:
            r15 = -100
            goto L_0x0113
        L_0x0110:
            r8 = 2
            r15 = -50
        L_0x0113:
            int r15 = -r15
            r18 = r15
            goto L_0x0123
        L_0x0117:
            r8 = 2
            if (r15 == r4) goto L_0x0121
            if (r15 == r8) goto L_0x011f
            r17 = 0
            goto L_0x0121
        L_0x011f:
            r17 = -100
        L_0x0121:
            r18 = r17
        L_0x0123:
            r8 = 0
            goto L_0x0175
        L_0x0125:
            java.lang.String r8 = "%.2fem"
            int r15 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r15 < 0) goto L_0x0144
            r15 = 1067030938(0x3f99999a, float:1.2)
            float r3 = r3 * r15
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r15 = new java.lang.Object[r4]
            r22 = 0
            r15[r22] = r3
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = java.lang.String.format(r3, r8, r15)
            r8 = 0
        L_0x0141:
            r18 = 0
            goto L_0x0175
        L_0x0144:
            r22 = 0
            float r3 = -r3
            float r3 = r3 - r19
            r15 = 1067030938(0x3f99999a, float:1.2)
            float r3 = r3 * r15
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r15 = new java.lang.Object[r4]
            r15[r22] = r3
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = java.lang.String.format(r3, r8, r15)
            r8 = 1
            goto L_0x0141
        L_0x015e:
            r22 = 0
            float r3 = r0.f6376c0
            float r19 = r19 - r3
            float r19 = r19 * r16
            java.lang.Float r3 = java.lang.Float.valueOf(r19)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r22] = r3
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = java.lang.String.format(r3, r2, r8)
            goto L_0x0123
        L_0x0175:
            float r15 = r12.f3535j
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 == 0) goto L_0x0193
            float r15 = r15 * r16
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            r17 = r1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r19 = 0
            r1[r19] = r15
            java.util.Locale r15 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r15, r2, r1)
            goto L_0x0197
        L_0x0193:
            r17 = r1
            java.lang.String r1 = "fit-content"
        L_0x0197:
            java.lang.String r2 = "start"
            java.lang.String r15 = "end"
            java.lang.String r19 = "center"
            android.text.Layout$Alignment r4 = r12.f3529b
            if (r4 != 0) goto L_0x01aa
            r23 = r2
            r24 = r15
            r4 = r19
            r2 = 2
        L_0x01a8:
            r15 = 1
            goto L_0x01c9
        L_0x01aa:
            int[] r23 = Y1.N.f6370a
            int r4 = r4.ordinal()
            r4 = r23[r4]
            r23 = r2
            r2 = 1
            if (r4 == r2) goto L_0x01c3
            r2 = 2
            if (r4 == r2) goto L_0x01bf
            r24 = r15
            r4 = r19
            goto L_0x01a8
        L_0x01bf:
            r4 = r15
            r24 = r4
            goto L_0x01a8
        L_0x01c3:
            r2 = 2
            r24 = r15
            r4 = r23
            goto L_0x01a8
        L_0x01c9:
            if (r9 == r15) goto L_0x01d3
            if (r9 == r2) goto L_0x01d0
            java.lang.String r2 = "horizontal-tb"
            goto L_0x01d5
        L_0x01d0:
            java.lang.String r2 = "vertical-lr"
            goto L_0x01d5
        L_0x01d3:
            java.lang.String r2 = "vertical-rl"
        L_0x01d5:
            int r15 = r12.f3539n
            r25 = r5
            float r5 = r12.f3540o
            java.lang.String r5 = r0.b(r15, r5)
            boolean r15 = r12.f3537l
            if (r15 == 0) goto L_0x01e6
            int r15 = r12.f3538m
            goto L_0x01ea
        L_0x01e6:
            Y1.d r15 = r0.f6374a0
            int r15 = r15.f6388c
        L_0x01ea:
            java.lang.String r15 = com.bumptech.glide.d.u(r15)
            java.lang.String r26 = "right"
            java.lang.String r27 = "top"
            java.lang.String r28 = "left"
            r0 = 1
            if (r9 == r0) goto L_0x020a
            r0 = 2
            if (r9 == r0) goto L_0x0204
            if (r8 == 0) goto L_0x01fe
            java.lang.String r27 = "bottom"
        L_0x01fe:
            r26 = r27
            r27 = r28
        L_0x0202:
            r0 = 2
            goto L_0x020d
        L_0x0204:
            if (r8 == 0) goto L_0x0207
            goto L_0x0202
        L_0x0207:
            r26 = r28
            goto L_0x0202
        L_0x020a:
            if (r8 == 0) goto L_0x0202
            goto L_0x0207
        L_0x020d:
            if (r9 == r0) goto L_0x0216
            r0 = 1
            if (r9 != r0) goto L_0x0213
            goto L_0x0216
        L_0x0213:
            java.lang.String r0 = "width"
            goto L_0x021e
        L_0x0216:
            java.lang.String r0 = "height"
            r44 = r18
            r18 = r17
            r17 = r44
        L_0x021e:
            android.content.Context r8 = r45.getContext()
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            java.util.regex.Pattern r28 = Y1.F.f6332a
            r28 = r15
            java.lang.String r15 = "</span>"
            r29 = r15
            java.lang.String r15 = ";'>"
            r30 = r5
            java.lang.String r5 = ""
            r31 = r2
            java.lang.CharSequence r2 = r12.f3528a
            if (r2 != 0) goto L_0x0258
            G3.e r2 = new G3.e
            r8 = 0
            r2.<init>(r5, r8)
            r35 = r0
            r34 = r1
            r37 = r3
            r33 = r4
            r32 = r5
        L_0x0250:
            r40 = r7
            r41 = r11
            r43 = r15
            goto L_0x05ee
        L_0x0258:
            r32 = r5
            boolean r5 = r2 instanceof android.text.Spanned
            if (r5 != 0) goto L_0x0272
            G3.e r5 = new G3.e
            java.lang.String r2 = Y1.F.a(r2)
            r8 = 0
            r5.<init>(r2, r8)
            r35 = r0
            r34 = r1
            r37 = r3
            r33 = r4
            r2 = r5
            goto L_0x0250
        L_0x0272:
            r5 = 0
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r33 = r4
            int r4 = r2.length()
            r34 = r1
            java.lang.Class<android.text.style.BackgroundColorSpan> r1 = android.text.style.BackgroundColorSpan.class
            r35 = r0
            r0 = 0
            java.lang.Object[] r1 = r2.getSpans(r0, r4, r1)
            android.text.style.BackgroundColorSpan[] r1 = (android.text.style.BackgroundColorSpan[]) r1
            int r0 = r1.length
            r4 = 0
        L_0x028f:
            if (r4 >= r0) goto L_0x02a5
            r36 = r1[r4]
            int r36 = r36.getBackgroundColor()
            r37 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r36)
            r5.add(r0)
            r0 = 1
            int r4 = r4 + r0
            r0 = r37
            goto L_0x028f
        L_0x02a5:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r5.iterator()
        L_0x02ae:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0302
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.String r5 = "bg_"
            java.lang.String r5 = Q0.g.m(r4, r5)
            r36 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r37 = r3
            java.lang.String r3 = "."
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r3 = ",."
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = " *"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = com.bumptech.glide.d.u(r4)
            int r4 = P0.z.f3748a
            java.util.Locale r4 = java.util.Locale.US
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            r4.append(r3)
            r4.append(r7)
            java.lang.String r3 = r4.toString()
            r0.put(r1, r3)
            r1 = r36
            r3 = r37
            goto L_0x02ae
        L_0x0302:
            r37 = r3
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            int r1 = r2.length()
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            java.lang.Object[] r1 = r2.getSpans(r4, r1, r3)
            int r3 = r1.length
            r4 = 0
        L_0x0316:
            if (r4 >= r3) goto L_0x0569
            r5 = r1[r4]
            r36 = r1
            boolean r1 = r5 instanceof android.text.style.StrikethroughSpan
            r38 = 0
            if (r1 == 0) goto L_0x0334
            java.lang.String r39 = "<span style='text-decoration:line-through;'>"
            r40 = r7
            r42 = r8
            r41 = r11
            r43 = r15
            r44 = r39
            r39 = r3
            r3 = r44
            goto L_0x04a8
        L_0x0334:
            r39 = r3
            boolean r3 = r5 instanceof android.text.style.ForegroundColorSpan
            if (r3 == 0) goto L_0x0359
            r3 = r5
            android.text.style.ForegroundColorSpan r3 = (android.text.style.ForegroundColorSpan) r3
            int r3 = r3.getForegroundColor()
            java.lang.String r3 = com.bumptech.glide.d.u(r3)
            int r40 = P0.z.f3748a
            java.util.Locale r40 = java.util.Locale.US
            r40 = r7
            java.lang.String r7 = "<span style='color:"
            java.lang.String r3 = N.e.y(r7, r3, r15)
            r42 = r8
            r41 = r11
        L_0x0355:
            r43 = r15
            goto L_0x04a8
        L_0x0359:
            r40 = r7
            boolean r3 = r5 instanceof android.text.style.BackgroundColorSpan
            if (r3 == 0) goto L_0x0377
            r3 = r5
            android.text.style.BackgroundColorSpan r3 = (android.text.style.BackgroundColorSpan) r3
            int r3 = r3.getBackgroundColor()
            int r7 = P0.z.f3748a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r7 = "<span class='bg_"
            r41 = r11
            java.lang.String r11 = "'>"
            java.lang.String r3 = u.C1477r.c(r3, r7, r11)
        L_0x0374:
            r42 = r8
            goto L_0x0355
        L_0x0377:
            r41 = r11
            boolean r3 = r5 instanceof O0.e
            if (r3 == 0) goto L_0x0380
            java.lang.String r3 = "<span style='text-combine-upright:all;'>"
            goto L_0x0374
        L_0x0380:
            boolean r3 = r5 instanceof android.text.style.AbsoluteSizeSpan
            if (r3 == 0) goto L_0x03ae
            r3 = r5
            android.text.style.AbsoluteSizeSpan r3 = (android.text.style.AbsoluteSizeSpan) r3
            boolean r7 = r3.getDip()
            if (r7 == 0) goto L_0x0393
            int r3 = r3.getSize()
            float r3 = (float) r3
            goto L_0x0399
        L_0x0393:
            int r3 = r3.getSize()
            float r3 = (float) r3
            float r3 = r3 / r8
        L_0x0399:
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r7 = 1
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r7 = 0
            r11[r7] = r3
            int r3 = P0.z.f3748a
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r7 = "<span style='font-size:%.2fpx;'>"
            java.lang.String r3 = java.lang.String.format(r3, r7, r11)
            goto L_0x0374
        L_0x03ae:
            boolean r3 = r5 instanceof android.text.style.RelativeSizeSpan
            if (r3 == 0) goto L_0x03d0
            r3 = r5
            android.text.style.RelativeSizeSpan r3 = (android.text.style.RelativeSizeSpan) r3
            float r3 = r3.getSizeChange()
            float r3 = r3 * r16
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r7 = 1
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r7 = 0
            r11[r7] = r3
            int r3 = P0.z.f3748a
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r7 = "<span style='font-size:%.2f%%;'>"
            java.lang.String r3 = java.lang.String.format(r3, r7, r11)
            goto L_0x0374
        L_0x03d0:
            boolean r3 = r5 instanceof android.text.style.TypefaceSpan
            if (r3 == 0) goto L_0x03ed
            r3 = r5
            android.text.style.TypefaceSpan r3 = (android.text.style.TypefaceSpan) r3
            java.lang.String r3 = r3.getFamily()
            if (r3 == 0) goto L_0x03ea
            int r7 = P0.z.f3748a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r7 = "<span style='font-family:\""
            java.lang.String r11 = "\";'>"
            java.lang.String r3 = N.e.y(r7, r3, r11)
            goto L_0x0374
        L_0x03ea:
            r3 = r38
            goto L_0x0374
        L_0x03ed:
            boolean r3 = r5 instanceof android.text.style.StyleSpan
            if (r3 == 0) goto L_0x0415
            r3 = r5
            android.text.style.StyleSpan r3 = (android.text.style.StyleSpan) r3
            int r3 = r3.getStyle()
            r7 = 1
            if (r3 == r7) goto L_0x0411
            r7 = 2
            if (r3 == r7) goto L_0x040d
            r7 = 3
            if (r3 == r7) goto L_0x0409
        L_0x0401:
            r42 = r8
            r43 = r15
            r3 = r38
            goto L_0x04a8
        L_0x0409:
            java.lang.String r3 = "<b><i>"
            goto L_0x0374
        L_0x040d:
            java.lang.String r3 = "<i>"
            goto L_0x0374
        L_0x0411:
            java.lang.String r3 = "<b>"
            goto L_0x0374
        L_0x0415:
            boolean r3 = r5 instanceof O0.g
            if (r3 == 0) goto L_0x0434
            r3 = r5
            O0.g r3 = (O0.g) r3
            int r3 = r3.f3552b
            r7 = -1
            if (r3 == r7) goto L_0x0430
            r7 = 1
            if (r3 == r7) goto L_0x042c
            r7 = 2
            if (r3 == r7) goto L_0x0428
            goto L_0x0401
        L_0x0428:
            java.lang.String r3 = "<ruby style='ruby-position:under;'>"
            goto L_0x0374
        L_0x042c:
            java.lang.String r3 = "<ruby style='ruby-position:over;'>"
            goto L_0x0374
        L_0x0430:
            java.lang.String r3 = "<ruby style='ruby-position:unset;'>"
            goto L_0x0374
        L_0x0434:
            boolean r3 = r5 instanceof android.text.style.UnderlineSpan
            if (r3 == 0) goto L_0x043c
            java.lang.String r3 = "<u>"
            goto L_0x0374
        L_0x043c:
            boolean r3 = r5 instanceof O0.h
            if (r3 == 0) goto L_0x0401
            r3 = r5
            O0.h r3 = (O0.h) r3
            int r7 = r3.f3555a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r42 = r8
            int r8 = r3.f3556b
            r43 = r15
            r15 = 1
            if (r8 == r15) goto L_0x045d
            r15 = 2
            if (r8 == r15) goto L_0x0457
            goto L_0x0463
        L_0x0457:
            java.lang.String r8 = "open "
            r11.append(r8)
            goto L_0x0463
        L_0x045d:
            r15 = 2
            java.lang.String r8 = "filled "
            r11.append(r8)
        L_0x0463:
            if (r7 == 0) goto L_0x0483
            r8 = 1
            if (r7 == r8) goto L_0x047d
            if (r7 == r15) goto L_0x0477
            r8 = 3
            if (r7 == r8) goto L_0x0471
            r11.append(r13)
            goto L_0x0488
        L_0x0471:
            java.lang.String r7 = "sesame"
            r11.append(r7)
            goto L_0x0488
        L_0x0477:
            java.lang.String r7 = "dot"
            r11.append(r7)
            goto L_0x0488
        L_0x047d:
            java.lang.String r7 = "circle"
            r11.append(r7)
            goto L_0x0488
        L_0x0483:
            java.lang.String r7 = "none"
            r11.append(r7)
        L_0x0488:
            java.lang.String r7 = r11.toString()
            int r3 = r3.f3557c
            r8 = 2
            if (r3 == r8) goto L_0x0494
            java.lang.String r3 = "over right"
            goto L_0x0496
        L_0x0494:
            java.lang.String r3 = "under left"
        L_0x0496:
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r8 = 0
            r11[r8] = r7
            r7 = 1
            r11[r7] = r3
            int r3 = P0.z.f3748a
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r7 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r3 = java.lang.String.format(r3, r7, r11)
        L_0x04a8:
            if (r1 != 0) goto L_0x051b
            boolean r1 = r5 instanceof android.text.style.ForegroundColorSpan
            if (r1 != 0) goto L_0x051b
            boolean r1 = r5 instanceof android.text.style.BackgroundColorSpan
            if (r1 != 0) goto L_0x051b
            boolean r1 = r5 instanceof O0.e
            if (r1 != 0) goto L_0x051b
            boolean r1 = r5 instanceof android.text.style.AbsoluteSizeSpan
            if (r1 != 0) goto L_0x051b
            boolean r1 = r5 instanceof android.text.style.RelativeSizeSpan
            if (r1 != 0) goto L_0x051b
            boolean r1 = r5 instanceof O0.h
            if (r1 == 0) goto L_0x04c3
            goto L_0x051b
        L_0x04c3:
            boolean r1 = r5 instanceof android.text.style.TypefaceSpan
            if (r1 == 0) goto L_0x04d5
            r1 = r5
            android.text.style.TypefaceSpan r1 = (android.text.style.TypefaceSpan) r1
            java.lang.String r1 = r1.getFamily()
            if (r1 == 0) goto L_0x04d2
            r38 = r29
        L_0x04d2:
            r1 = r38
            goto L_0x051d
        L_0x04d5:
            boolean r1 = r5 instanceof android.text.style.StyleSpan
            if (r1 == 0) goto L_0x04f3
            r1 = r5
            android.text.style.StyleSpan r1 = (android.text.style.StyleSpan) r1
            int r1 = r1.getStyle()
            r7 = 1
            if (r1 == r7) goto L_0x04f0
            r7 = 2
            if (r1 == r7) goto L_0x04ed
            r7 = 3
            if (r1 == r7) goto L_0x04ea
            goto L_0x04d2
        L_0x04ea:
            java.lang.String r38 = "</i></b>"
            goto L_0x04d2
        L_0x04ed:
            java.lang.String r38 = "</i>"
            goto L_0x04d2
        L_0x04f0:
            java.lang.String r38 = "</b>"
            goto L_0x04d2
        L_0x04f3:
            boolean r1 = r5 instanceof O0.g
            if (r1 == 0) goto L_0x0514
            r1 = r5
            O0.g r1 = (O0.g) r1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "<rt>"
            r7.<init>(r8)
            java.lang.String r1 = r1.f3551a
            java.lang.String r1 = Y1.F.a(r1)
            r7.append(r1)
            java.lang.String r1 = "</rt></ruby>"
            r7.append(r1)
            java.lang.String r38 = r7.toString()
            goto L_0x04d2
        L_0x0514:
            boolean r1 = r5 instanceof android.text.style.UnderlineSpan
            if (r1 == 0) goto L_0x04d2
            java.lang.String r38 = "</u>"
            goto L_0x04d2
        L_0x051b:
            r1 = r29
        L_0x051d:
            int r7 = r2.getSpanStart(r5)
            int r5 = r2.getSpanEnd(r5)
            if (r3 == 0) goto L_0x0559
            r1.getClass()
            Y1.D r8 = new Y1.D
            r8.<init>(r3, r7, r1, r5)
            java.lang.Object r1 = r0.get(r7)
            Y1.E r1 = (Y1.E) r1
            if (r1 != 0) goto L_0x053f
            Y1.E r1 = new Y1.E
            r1.<init>()
            r0.put(r7, r1)
        L_0x053f:
            java.util.ArrayList r1 = r1.f6330a
            r1.add(r8)
            java.lang.Object r1 = r0.get(r5)
            Y1.E r1 = (Y1.E) r1
            if (r1 != 0) goto L_0x0554
            Y1.E r1 = new Y1.E
            r1.<init>()
            r0.put(r5, r1)
        L_0x0554:
            java.util.ArrayList r1 = r1.f6331b
            r1.add(r8)
        L_0x0559:
            r1 = 1
            int r4 = r4 + r1
            r1 = r36
            r3 = r39
            r7 = r40
            r11 = r41
            r8 = r42
            r15 = r43
            goto L_0x0316
        L_0x0569:
            r40 = r7
            r41 = r11
            r43 = r15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r2.length()
            r1.<init>(r3)
            r3 = 0
            r4 = 0
        L_0x057a:
            int r5 = r0.size()
            if (r3 >= r5) goto L_0x05d5
            int r5 = r0.keyAt(r3)
            java.lang.CharSequence r4 = r2.subSequence(r4, r5)
            java.lang.String r4 = Y1.F.a(r4)
            r1.append(r4)
            java.lang.Object r4 = r0.get(r5)
            Y1.E r4 = (Y1.E) r4
            java.util.ArrayList r7 = r4.f6331b
            D.j0 r8 = Y1.D.f6325f
            java.util.Collections.sort(r7, r8)
            java.util.ArrayList r7 = r4.f6331b
            java.util.Iterator r7 = r7.iterator()
        L_0x05a2:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x05b4
            java.lang.Object r8 = r7.next()
            Y1.D r8 = (Y1.D) r8
            java.lang.String r8 = r8.f6329d
            r1.append(r8)
            goto L_0x05a2
        L_0x05b4:
            java.util.ArrayList r4 = r4.f6330a
            D.j0 r7 = Y1.D.e
            java.util.Collections.sort(r4, r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x05bf:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x05d1
            java.lang.Object r7 = r4.next()
            Y1.D r7 = (Y1.D) r7
            java.lang.String r7 = r7.f6328c
            r1.append(r7)
            goto L_0x05bf
        L_0x05d1:
            r7 = 1
            int r3 = r3 + r7
            r4 = r5
            goto L_0x057a
        L_0x05d5:
            int r0 = r2.length()
            java.lang.CharSequence r0 = r2.subSequence(r4, r0)
            java.lang.String r0 = Y1.F.a(r0)
            r1.append(r0)
            G3.e r2 = new G3.e
            java.lang.String r0 = r1.toString()
            r1 = 0
            r2.<init>(r0, r1)
        L_0x05ee:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x05f6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0622
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r6.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r6.put(r1, r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x061d
            java.lang.Object r1 = r6.get(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x061b
            goto L_0x061d
        L_0x061b:
            r1 = 0
            goto L_0x061e
        L_0x061d:
            r1 = 1
        L_0x061e:
            P0.l.j(r1)
            goto L_0x05f6
        L_0x0622:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Float r1 = java.lang.Float.valueOf(r14)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            float r5 = r12.f3542q
            int r7 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x065a
            r7 = 2
            r8 = 1
            if (r9 == r7) goto L_0x0642
            if (r9 != r8) goto L_0x063f
            goto L_0x0642
        L_0x063f:
            java.lang.String r9 = "skewX"
            goto L_0x0644
        L_0x0642:
            java.lang.String r9 = "skewY"
        L_0x0644:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r7 = 0
            r11[r7] = r9
            r11[r8] = r5
            int r5 = P0.z.f3748a
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r7 = "%s(%.2fdeg)"
            java.lang.String r5 = java.lang.String.format(r5, r7, r11)
            goto L_0x065c
        L_0x065a:
            r5 = r32
        L_0x065c:
            r7 = 14
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r0
            r0 = 1
            r7[r0] = r27
            r0 = 2
            r7[r0] = r1
            r0 = 3
            r7[r0] = r26
            r1 = 4
            r7[r1] = r37
            r8 = 5
            r7[r8] = r35
            r8 = 6
            r7[r8] = r34
            r8 = 7
            r7[r8] = r33
            r8 = 8
            r7[r8] = r31
            r8 = 9
            r7[r8] = r30
            r8 = 10
            r7[r8] = r28
            r8 = 11
            r7[r8] = r3
            r3 = 12
            r7[r3] = r4
            r3 = 13
            r7[r3] = r5
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r3 = java.lang.String.format(r3, r4, r7)
            r4 = r25
            r4.append(r3)
            java.lang.String r3 = "<span class='default_bg'>"
            r4.append(r3)
            java.lang.String r2 = r2.f1639U
            android.text.Layout$Alignment r3 = r12.f3530c
            if (r3 == 0) goto L_0x06de
            int[] r5 = Y1.N.f6370a
            int r3 = r3.ordinal()
            r3 = r5[r3]
            r5 = 1
            if (r3 == r5) goto L_0x06bc
            r5 = 2
            if (r3 == r5) goto L_0x06b9
            r3 = r19
            goto L_0x06bf
        L_0x06b9:
            r3 = r24
            goto L_0x06bf
        L_0x06bc:
            r5 = 2
            r3 = r23
        L_0x06bf:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "<span style='display:inline-block; text-align:"
            r7.<init>(r8)
            r7.append(r3)
            r3 = r43
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r4.append(r3)
            r4.append(r2)
            r2 = r29
            r4.append(r2)
            goto L_0x06e2
        L_0x06de:
            r5 = 2
            r4.append(r2)
        L_0x06e2:
            java.lang.String r2 = "</span></div>"
            r4.append(r2)
            r2 = 1
            int r10 = r10 + r2
            r2 = 3
            r3 = 2
            r8 = 0
            r9 = 1067030938(0x3f99999a, float:1.2)
            r0 = r45
            r5 = r4
            r7 = r40
            r11 = r41
            r4 = 1
            goto L_0x00af
        L_0x06f9:
            r4 = r5
            java.lang.String r0 = "</div></body></html>"
            r4.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<html><head><style>"
            r0.<init>(r1)
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x070e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0731
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r3 = "{"
            r0.append(r3)
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            goto L_0x070e
        L_0x0731:
            java.lang.String r1 = "</style></head>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r4.insert(r1, r0)
            java.lang.String r0 = r4.toString()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r1)
            r1 = 1
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "base64"
            r3 = r45
            Y1.M r4 = r3.f6372V
            r4.loadData(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.O.c():void");
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        if (z && !this.f6373W.isEmpty()) {
            c();
        }
    }
}
