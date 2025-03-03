package Y1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Y1.c  reason: case insensitive filesystem */
public final class C0370c extends View implements H {

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f6380U = new ArrayList();

    /* renamed from: V  reason: collision with root package name */
    public List f6381V = Collections.emptyList();

    /* renamed from: W  reason: collision with root package name */
    public float f6382W = 0.0533f;

    /* renamed from: a0  reason: collision with root package name */
    public C0371d f6383a0 = C0371d.f6385g;

    /* renamed from: b0  reason: collision with root package name */
    public float f6384b0 = 0.08f;

    public C0370c(Context context) {
        super(context, (AttributeSet) null);
    }

    public final void a(List list, C0371d dVar, float f8, float f9) {
        this.f6381V = list;
        this.f6383a0 = dVar;
        this.f6382W = f8;
        this.f6384b0 = f9;
        while (true) {
            ArrayList arrayList = this.f6380U;
            if (arrayList.size() < list.size()) {
                arrayList.add(new G(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r40) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            java.util.List r4 = r0.f6381V
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x000d
            return
        L_0x000d:
            int r5 = r39.getHeight()
            int r6 = r39.getPaddingLeft()
            int r7 = r39.getPaddingTop()
            int r8 = r39.getWidth()
            int r9 = r39.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r39.getPaddingBottom()
            int r9 = r5 - r9
            if (r9 <= r7) goto L_0x0506
            if (r8 > r6) goto L_0x002e
            goto L_0x0506
        L_0x002e:
            int r10 = r9 - r7
            float r11 = r0.f6382W
            r12 = 0
            float r11 = g7.C0996d.x(r12, r11, r5, r10)
            r13 = 0
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 > 0) goto L_0x003d
            return
        L_0x003d:
            int r14 = r4.size()
            r15 = 0
        L_0x0042:
            if (r15 >= r14) goto L_0x0506
            java.lang.Object r16 = r4.get(r15)
            r13 = r16
            O0.b r13 = (O0.b) r13
            int r3 = r13.f3541p
            r18 = 1065353216(0x3f800000, float:1.0)
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r12) goto L_0x008b
            O0.a r3 = r13.a()
            r3.f3501h = r2
            r3.i = r12
            r12 = 0
            r3.f3497c = r12
            int r12 = r13.f3532f
            float r2 = r13.e
            if (r12 != 0) goto L_0x0070
            float r2 = r18 - r2
            r3.e = r2
            r2 = 0
            r3.f3499f = r2
            goto L_0x0078
        L_0x0070:
            float r2 = -r2
            float r2 = r2 - r18
            r3.e = r2
            r2 = 1
            r3.f3499f = r2
        L_0x0078:
            int r2 = r13.f3533g
            if (r2 == 0) goto L_0x0084
            r12 = 2
            if (r2 == r12) goto L_0x0080
            goto L_0x0087
        L_0x0080:
            r2 = 0
            r3.f3500g = r2
            goto L_0x0087
        L_0x0084:
            r12 = 2
            r3.f3500g = r12
        L_0x0087:
            O0.b r13 = r3.a()
        L_0x008b:
            int r2 = r13.f3539n
            float r3 = r13.f3540o
            float r2 = g7.C0996d.x(r2, r3, r5, r10)
            java.util.ArrayList r3 = r0.f6380U
            java.lang.Object r3 = r3.get(r15)
            Y1.G r3 = (Y1.G) r3
            Y1.d r12 = r0.f6383a0
            r20 = r4
            float r4 = r0.f6384b0
            r3.getClass()
            android.graphics.Bitmap r0 = r13.f3531d
            r21 = r5
            r22 = r10
            if (r0 != 0) goto L_0x00ae
            r5 = 1
            goto L_0x00af
        L_0x00ae:
            r5 = 0
        L_0x00af:
            java.lang.CharSequence r10 = r13.f3528a
            if (r5 == 0) goto L_0x00dc
            boolean r23 = android.text.TextUtils.isEmpty(r10)
            if (r23 == 0) goto L_0x00ce
            r0 = r1
            r37 = r6
            r36 = r7
            r35 = r8
            r34 = r9
            r33 = r11
            r23 = r14
            r24 = r15
        L_0x00c8:
            r1 = 1
            r4 = 2
            r7 = 0
            r11 = 0
            goto L_0x04eb
        L_0x00ce:
            r23 = r14
            boolean r14 = r13.f3537l
            if (r14 == 0) goto L_0x00d7
            int r14 = r13.f3538m
            goto L_0x00d9
        L_0x00d7:
            int r14 = r12.f6388c
        L_0x00d9:
            r24 = r15
            goto L_0x00e1
        L_0x00dc:
            r23 = r14
            r14 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x00d9
        L_0x00e1:
            java.lang.CharSequence r15 = r3.i
            android.text.TextPaint r1 = r3.f6347f
            r33 = r5
            float r5 = r13.f3536k
            r34 = r9
            float r9 = r13.f3535j
            r35 = r8
            int r8 = r13.i
            r36 = r7
            float r7 = r13.f3534h
            r37 = r6
            int r6 = r13.f3533g
            r25 = r4
            int r4 = r13.f3532f
            r26 = r2
            float r2 = r13.e
            android.text.Layout$Alignment r13 = r13.f3529b
            if (r15 == r10) goto L_0x0117
            if (r15 == 0) goto L_0x010e
            boolean r15 = r15.equals(r10)
            if (r15 == 0) goto L_0x010e
            goto L_0x0117
        L_0x010e:
            r15 = r1
            r27 = r4
            r1 = r33
            r4 = r40
            goto L_0x01e9
        L_0x0117:
            android.text.Layout$Alignment r15 = r3.f6350j
            int r27 = P0.z.f3748a
            boolean r15 = j$.util.Objects.equals(r15, r13)
            if (r15 == 0) goto L_0x010e
            android.graphics.Bitmap r15 = r3.f6351k
            if (r15 != r0) goto L_0x010e
            float r15 = r3.f6352l
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L_0x010e
            int r15 = r3.f6353m
            if (r15 != r4) goto L_0x010e
            int r15 = r3.f6354n
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r27 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x01e6
            float r4 = r3.f6355o
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x01e6
            int r4 = r3.f6356p
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            boolean r4 = r4.equals(r15)
            if (r4 == 0) goto L_0x01e6
            float r4 = r3.f6357q
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x01e6
            float r4 = r3.f6358r
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x01e6
            int r4 = r3.f6359s
            int r15 = r12.f6386a
            if (r4 != r15) goto L_0x01e6
            int r4 = r3.f6360t
            int r15 = r12.f6387b
            if (r4 != r15) goto L_0x01e6
            int r4 = r3.f6361u
            if (r4 != r14) goto L_0x01e6
            int r4 = r3.f6363w
            int r15 = r12.f6389d
            if (r4 != r15) goto L_0x01e6
            int r4 = r3.f6362v
            int r15 = r12.e
            if (r4 != r15) goto L_0x01e6
            android.graphics.Typeface r4 = r1.getTypeface()
            android.graphics.Typeface r15 = r12.f6390f
            boolean r4 = j$.util.Objects.equals(r4, r15)
            if (r4 == 0) goto L_0x01e6
            float r4 = r3.f6364x
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x01e6
            float r4 = r3.f6365y
            int r4 = (r4 > r26 ? 1 : (r4 == r26 ? 0 : -1))
            if (r4 != 0) goto L_0x01e6
            float r4 = r3.z
            int r4 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r4 != 0) goto L_0x01e6
            int r4 = r3.f6333A
            r15 = r37
            if (r4 != r15) goto L_0x01e0
            int r4 = r3.f6334B
            r28 = r1
            r1 = r36
            if (r4 != r1) goto L_0x01db
            int r4 = r3.f6335C
            r36 = r1
            r1 = r35
            if (r4 != r1) goto L_0x01d6
            int r4 = r3.f6336D
            r35 = r1
            r1 = r34
            if (r4 != r1) goto L_0x01cb
            r4 = r40
            r34 = r1
            r37 = r15
            r1 = r33
            r3.a(r4, r1)
            r0 = r4
            r33 = r11
            goto L_0x00c8
        L_0x01cb:
            r4 = r40
            r34 = r1
        L_0x01cf:
            r37 = r15
            r15 = r28
        L_0x01d3:
            r1 = r33
            goto L_0x01e9
        L_0x01d6:
            r4 = r40
            r35 = r1
            goto L_0x01cf
        L_0x01db:
            r4 = r40
            r36 = r1
            goto L_0x01cf
        L_0x01e0:
            r4 = r40
            r37 = r15
        L_0x01e4:
            r15 = r1
            goto L_0x01d3
        L_0x01e6:
            r4 = r40
            goto L_0x01e4
        L_0x01e9:
            r3.i = r10
            r3.f6350j = r13
            r3.f6351k = r0
            r3.f6352l = r2
            r0 = r27
            r3.f6353m = r0
            r3.f6354n = r6
            r3.f6355o = r7
            r3.f6356p = r8
            r3.f6357q = r9
            r3.f6358r = r5
            int r0 = r12.f6386a
            r3.f6359s = r0
            int r0 = r12.f6387b
            r3.f6360t = r0
            r3.f6361u = r14
            int r0 = r12.f6389d
            r3.f6363w = r0
            int r0 = r12.e
            r3.f6362v = r0
            android.graphics.Typeface r0 = r12.f6390f
            r15.setTypeface(r0)
            r3.f6364x = r11
            r0 = r26
            r3.f6365y = r0
            r0 = r25
            r3.z = r0
            r0 = r37
            r3.f6333A = r0
            r2 = r36
            r3.f6334B = r2
            r8 = r35
            r3.f6335C = r8
            r5 = r34
            r3.f6336D = r5
            if (r1 == 0) goto L_0x045e
            java.lang.CharSequence r6 = r3.i
            r6.getClass()
            java.lang.CharSequence r6 = r3.i
            boolean r7 = r6 instanceof android.text.SpannableStringBuilder
            if (r7 == 0) goto L_0x0240
            android.text.SpannableStringBuilder r6 = (android.text.SpannableStringBuilder) r6
            goto L_0x0247
        L_0x0240:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r7 = r3.i
            r6.<init>(r7)
        L_0x0247:
            int r7 = r3.f6335C
            int r9 = r3.f6333A
            int r7 = r7 - r9
            int r9 = r3.f6336D
            int r10 = r3.f6334B
            int r9 = r9 - r10
            float r10 = r3.f6364x
            r15.setTextSize(r10)
            float r10 = r3.f6364x
            r12 = 1040187392(0x3e000000, float:0.125)
            float r10 = r10 * r12
            r12 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r12
            int r10 = (int) r10
            r12 = 2
            int r13 = r10 * 2
            int r12 = r7 - r13
            float r14 = r3.f6357q
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r25 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r25 == 0) goto L_0x0272
            float r12 = (float) r12
            float r12 = r12 * r14
            int r12 = (int) r12
        L_0x0272:
            java.lang.String r14 = "SubtitlePainter"
            if (r12 > 0) goto L_0x028b
            java.lang.String r6 = "Skipped drawing subtitle cue (insufficient space)"
            P0.l.B(r14, r6)
            r37 = r0
            r38 = r1
            r36 = r2
            r34 = r5
            r35 = r8
            r33 = r11
        L_0x0287:
            r7 = 0
            r11 = 0
            goto L_0x0457
        L_0x028b:
            r37 = r0
            float r0 = r3.f6365y
            r36 = r2
            r17 = 0
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ae
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r2 = r3.f6365y
            int r2 = (int) r2
            r0.<init>(r2)
            int r2 = r6.length()
            r34 = r5
            r35 = r8
            r5 = 0
            r8 = 16711680(0xff0000, float:2.3418052E-38)
            r6.setSpan(r0, r5, r2, r8)
            goto L_0x02b3
        L_0x02ae:
            r34 = r5
            r35 = r8
            r5 = 0
        L_0x02b3:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r6)
            int r2 = r3.f6363w
            r8 = 1
            if (r2 != r8) goto L_0x02d9
            int r2 = r0.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r8 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r2 = r0.getSpans(r5, r2, r8)
            android.text.style.ForegroundColorSpan[] r2 = (android.text.style.ForegroundColorSpan[]) r2
            int r5 = r2.length
            r8 = 0
        L_0x02cb:
            if (r8 >= r5) goto L_0x02d9
            r26 = r5
            r5 = r2[r8]
            r0.removeSpan(r5)
            r5 = 1
            int r8 = r8 + r5
            r5 = r26
            goto L_0x02cb
        L_0x02d9:
            int r2 = r3.f6360t
            int r2 = android.graphics.Color.alpha(r2)
            if (r2 <= 0) goto L_0x0311
            int r2 = r3.f6363w
            if (r2 == 0) goto L_0x02e8
            r5 = 2
            if (r2 != r5) goto L_0x02ee
        L_0x02e8:
            r33 = r11
            r8 = 0
            r11 = 16711680(0xff0000, float:2.3418052E-38)
            goto L_0x0302
        L_0x02ee:
            android.text.style.BackgroundColorSpan r2 = new android.text.style.BackgroundColorSpan
            int r5 = r3.f6360t
            r2.<init>(r5)
            int r5 = r0.length()
            r33 = r11
            r8 = 0
            r11 = 16711680(0xff0000, float:2.3418052E-38)
            r0.setSpan(r2, r8, r5, r11)
            goto L_0x0313
        L_0x0302:
            android.text.style.BackgroundColorSpan r2 = new android.text.style.BackgroundColorSpan
            int r5 = r3.f6360t
            r2.<init>(r5)
            int r5 = r6.length()
            r6.setSpan(r2, r8, r5, r11)
            goto L_0x0313
        L_0x0311:
            r33 = r11
        L_0x0313:
            android.text.Layout$Alignment r2 = r3.f6350j
            if (r2 != 0) goto L_0x0319
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x0319:
            android.text.StaticLayout r5 = new android.text.StaticLayout
            float r8 = r3.e
            r32 = 1
            float r11 = r3.f6346d
            r25 = r5
            r26 = r6
            r27 = r15
            r28 = r12
            r29 = r2
            r30 = r11
            r31 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r3.f6337E = r5
            int r5 = r5.getHeight()
            android.text.StaticLayout r8 = r3.f6337E
            int r8 = r8.getLineCount()
            r38 = r1
            r1 = 0
            r11 = 0
        L_0x0342:
            if (r11 >= r8) goto L_0x0361
            r25 = r8
            android.text.StaticLayout r8 = r3.f6337E
            float r8 = r8.getLineWidth(r11)
            r26 = r5
            double r4 = (double) r8
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r1 = java.lang.Math.max(r4, r1)
            r4 = 1
            int r11 = r11 + r4
            r4 = r40
            r8 = r25
            r5 = r26
            goto L_0x0342
        L_0x0361:
            r26 = r5
            float r4 = r3.f6357q
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x036f
            if (r1 >= r12) goto L_0x036f
            goto L_0x0370
        L_0x036f:
            r12 = r1
        L_0x0370:
            int r12 = r12 + r13
            float r1 = r3.f6355o
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x039d
            float r4 = (float) r7
            float r4 = r4 * r1
            int r1 = java.lang.Math.round(r4)
            int r4 = r3.f6333A
            int r1 = r1 + r4
            int r5 = r3.f6356p
            r7 = 1
            if (r5 == r7) goto L_0x038c
            r8 = 2
            if (r5 == r8) goto L_0x038a
            goto L_0x0391
        L_0x038a:
            int r1 = r1 - r12
            goto L_0x0391
        L_0x038c:
            r8 = 2
            int r1 = r1 * 2
            int r1 = r1 - r12
            int r1 = r1 / r8
        L_0x0391:
            int r1 = java.lang.Math.max(r1, r4)
            int r12 = r12 + r1
            int r4 = r3.f6335C
            int r4 = java.lang.Math.min(r12, r4)
            goto L_0x03a5
        L_0x039d:
            r8 = 2
            int r7 = r7 - r12
            int r7 = r7 / r8
            int r1 = r3.f6333A
            int r1 = r1 + r7
            int r4 = r1 + r12
        L_0x03a5:
            int r4 = r4 - r1
            if (r4 > 0) goto L_0x03af
            java.lang.String r0 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            P0.l.B(r14, r0)
            goto L_0x0287
        L_0x03af:
            float r5 = r3.f6352l
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0416
            int r7 = r3.f6353m
            if (r7 != 0) goto L_0x03d9
            float r7 = (float) r9
            float r7 = r7 * r5
            int r5 = java.lang.Math.round(r7)
            int r7 = r3.f6334B
            int r5 = r5 + r7
            int r7 = r3.f6354n
            r8 = 2
            if (r7 != r8) goto L_0x03ce
            int r5 = r5 - r26
            goto L_0x03d6
        L_0x03ce:
            r9 = 1
            if (r7 != r9) goto L_0x03d6
            int r5 = r5 * 2
            int r5 = r5 - r26
            int r5 = r5 / r8
        L_0x03d6:
            r7 = 0
            r11 = 0
            goto L_0x0407
        L_0x03d9:
            android.text.StaticLayout r5 = r3.f6337E
            r7 = 0
            int r5 = r5.getLineBottom(r7)
            android.text.StaticLayout r8 = r3.f6337E
            int r8 = r8.getLineTop(r7)
            int r5 = r5 - r8
            float r8 = r3.f6352l
            r11 = 0
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x03f9
            float r5 = (float) r5
            float r8 = r8 * r5
            int r5 = java.lang.Math.round(r8)
            int r8 = r3.f6334B
            int r5 = r5 + r8
            goto L_0x0407
        L_0x03f9:
            float r8 = r8 + r18
            float r5 = (float) r5
            float r8 = r8 * r5
            int r5 = java.lang.Math.round(r8)
            int r8 = r3.f6336D
            int r5 = r5 + r8
            int r5 = r5 - r26
        L_0x0407:
            int r8 = r5 + r26
            int r9 = r3.f6336D
            if (r8 <= r9) goto L_0x0410
            int r5 = r9 - r26
            goto L_0x0423
        L_0x0410:
            int r8 = r3.f6334B
            if (r5 >= r8) goto L_0x0423
            r5 = r8
            goto L_0x0423
        L_0x0416:
            r7 = 0
            r11 = 0
            int r5 = r3.f6336D
            int r5 = r5 - r26
            float r8 = (float) r9
            float r9 = r3.z
            float r8 = r8 * r9
            int r8 = (int) r8
            int r5 = r5 - r8
        L_0x0423:
            android.text.StaticLayout r8 = new android.text.StaticLayout
            float r9 = r3.e
            r32 = 1
            float r12 = r3.f6346d
            r25 = r8
            r26 = r6
            r27 = r15
            r28 = r4
            r29 = r2
            r30 = r12
            r31 = r9
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r3.f6337E = r8
            android.text.StaticLayout r6 = new android.text.StaticLayout
            float r8 = r3.e
            float r9 = r3.f6346d
            r25 = r6
            r26 = r0
            r30 = r9
            r31 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r3.f6338F = r6
            r3.f6339G = r1
            r3.f6340H = r5
            r3.f6341I = r10
        L_0x0457:
            r0 = r40
            r1 = r38
            r4 = 2
            goto L_0x04e7
        L_0x045e:
            r37 = r0
            r38 = r1
            r36 = r2
            r34 = r5
            r35 = r8
            r33 = r11
            r7 = 0
            r11 = 0
            android.graphics.Bitmap r0 = r3.f6351k
            r0.getClass()
            android.graphics.Bitmap r0 = r3.f6351k
            int r1 = r3.f6335C
            int r2 = r3.f6333A
            int r1 = r1 - r2
            int r4 = r3.f6336D
            int r5 = r3.f6334B
            int r4 = r4 - r5
            float r2 = (float) r2
            float r1 = (float) r1
            float r6 = r3.f6355o
            float r6 = r6 * r1
            float r6 = r6 + r2
            float r2 = (float) r5
            float r4 = (float) r4
            float r5 = r3.f6352l
            float r5 = r5 * r4
            float r5 = r5 + r2
            float r2 = r3.f6357q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r3.f6358r
            r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x04a3
            float r4 = r4 * r2
            int r0 = java.lang.Math.round(r4)
            goto L_0x04b5
        L_0x04a3:
            float r2 = (float) r1
            int r4 = r0.getHeight()
            float r4 = (float) r4
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            float r4 = r4 * r2
            int r0 = java.lang.Math.round(r4)
        L_0x04b5:
            int r2 = r3.f6356p
            r4 = 2
            if (r2 != r4) goto L_0x04bd
            float r2 = (float) r1
        L_0x04bb:
            float r6 = r6 - r2
            goto L_0x04c4
        L_0x04bd:
            r8 = 1
            if (r2 != r8) goto L_0x04c4
            int r2 = r1 / 2
            float r2 = (float) r2
            goto L_0x04bb
        L_0x04c4:
            int r2 = java.lang.Math.round(r6)
            int r6 = r3.f6354n
            if (r6 != r4) goto L_0x04cf
            float r6 = (float) r0
        L_0x04cd:
            float r5 = r5 - r6
            goto L_0x04d6
        L_0x04cf:
            r8 = 1
            if (r6 != r8) goto L_0x04d6
            int r6 = r0 / 2
            float r6 = (float) r6
            goto L_0x04cd
        L_0x04d6:
            int r5 = java.lang.Math.round(r5)
            android.graphics.Rect r6 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r5
            r6.<init>(r2, r5, r1, r0)
            r3.f6342J = r6
            r0 = r40
            r1 = r38
        L_0x04e7:
            r3.a(r0, r1)
            r1 = 1
        L_0x04eb:
            int r15 = r24 + 1
            r1 = r0
            r4 = r20
            r5 = r21
            r10 = r22
            r14 = r23
            r11 = r33
            r9 = r34
            r8 = r35
            r7 = r36
            r6 = r37
            r12 = 0
            r13 = 0
            r0 = r39
            goto L_0x0042
        L_0x0506:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.C0370c.dispatchDraw(android.graphics.Canvas):void");
    }
}
