package h2;

import Y.e;
import Y.i;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: h2.o  reason: case insensitive filesystem */
public final class C1074o {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f12579p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f12580a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f12581b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f12582c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f12583d;
    public Paint e;

    /* renamed from: f  reason: collision with root package name */
    public PathMeasure f12584f;

    /* renamed from: g  reason: collision with root package name */
    public final C1071l f12585g;

    /* renamed from: h  reason: collision with root package name */
    public float f12586h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public float f12587j;

    /* renamed from: k  reason: collision with root package name */
    public float f12588k;

    /* renamed from: l  reason: collision with root package name */
    public int f12589l;

    /* renamed from: m  reason: collision with root package name */
    public String f12590m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f12591n;

    /* renamed from: o  reason: collision with root package name */
    public final e f12592o;

    /* JADX WARNING: type inference failed for: r1v0, types: [Y.e, Y.i] */
    public C1074o() {
        this.f12582c = new Matrix();
        this.f12586h = 0.0f;
        this.i = 0.0f;
        this.f12587j = 0.0f;
        this.f12588k = 0.0f;
        this.f12589l = 255;
        this.f12590m = null;
        this.f12591n = null;
        this.f12592o = new i((Object) null);
        this.f12585g = new C1071l();
        this.f12580a = new Path();
        this.f12581b = new Path();
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e6, code lost:
        if (r0.f12562j != 1.0f) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(h2.C1071l r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r21
            r9 = 1
            android.graphics.Matrix r0 = r7.f12567a
            r1 = r20
            r0.set(r1)
            android.graphics.Matrix r0 = r7.f12574j
            android.graphics.Matrix r10 = r7.f12567a
            r10.preConcat(r0)
            r21.save()
            r11 = 0
            r12 = 0
        L_0x001a:
            java.util.ArrayList r0 = r7.f12568b
            int r1 = r0.size()
            if (r12 >= r1) goto L_0x0220
            java.lang.Object r0 = r0.get(r12)
            h2.m r0 = (h2.C1072m) r0
            boolean r1 = r0 instanceof h2.C1071l
            if (r1 == 0) goto L_0x0042
            r1 = r0
            h2.l r1 = (h2.C1071l) r1
            r0 = r18
            r2 = r10
            r3 = r21
            r4 = r22
            r5 = r23
            r0.a(r1, r2, r3, r4, r5)
        L_0x003b:
            r1 = r22
            r17 = r10
        L_0x003f:
            r0 = 1
            goto L_0x0219
        L_0x0042:
            boolean r1 = r0 instanceof h2.C1073n
            if (r1 == 0) goto L_0x003b
            h2.n r0 = (h2.C1073n) r0
            r1 = r22
            float r2 = (float) r1
            float r3 = r6.f12587j
            float r2 = r2 / r3
            r3 = r23
            float r4 = (float) r3
            float r5 = r6.f12588k
            float r4 = r4 / r5
            float r5 = java.lang.Math.min(r2, r4)
            android.graphics.Matrix r13 = r6.f12582c
            r13.set(r10)
            r13.postScale(r2, r4)
            r14 = 4
            float[] r14 = new float[r14]
            r14 = {0, 1065353216, 1065353216, 0} // fill-array
            r10.mapVectors(r14)
            r15 = r14[r11]
            r20 = r5
            double r4 = (double) r15
            r15 = r14[r9]
            double r2 = (double) r15
            double r2 = java.lang.Math.hypot(r4, r2)
            float r2 = (float) r2
            r3 = 2
            r4 = r14[r3]
            double r4 = (double) r4
            r15 = 3
            r3 = r14[r15]
            r17 = r10
            double r9 = (double) r3
            double r3 = java.lang.Math.hypot(r4, r9)
            float r3 = (float) r3
            r4 = r14[r11]
            r5 = 1
            r9 = r14[r5]
            r5 = 2
            r5 = r14[r5]
            r10 = r14[r15]
            float r4 = r4 * r10
            float r9 = r9 * r5
            float r4 = r4 - r9
            float r2 = java.lang.Math.max(r2, r3)
            r16 = 0
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            float r3 = java.lang.Math.abs(r4)
            float r2 = r3 / r2
            goto L_0x00a6
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x00ab
            goto L_0x003f
        L_0x00ab:
            r0.getClass()
            android.graphics.Path r3 = r6.f12580a
            r3.reset()
            m0.e[] r4 = r0.f12576a
            if (r4 == 0) goto L_0x00ba
            B.C0003d.A(r4, r3)
        L_0x00ba:
            android.graphics.Path r4 = r6.f12581b
            r4.reset()
            boolean r5 = r0 instanceof h2.C1069j
            if (r5 == 0) goto L_0x00d7
            int r0 = r0.f12578c
            if (r0 != 0) goto L_0x00ca
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x00cc
        L_0x00ca:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x00cc:
            r4.setFillType(r0)
            r4.addPath(r3, r13)
            r8.clipPath(r4)
            goto L_0x003f
        L_0x00d7:
            h2.k r0 = (h2.C1070k) r0
            float r5 = r0.i
            r9 = 0
            int r10 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r10 != 0) goto L_0x00e9
            float r9 = r0.f12562j
            r10 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x012b
            goto L_0x00eb
        L_0x00e9:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00eb:
            float r9 = r0.f12563k
            float r5 = r5 + r9
            float r5 = r5 % r10
            float r14 = r0.f12562j
            float r14 = r14 + r9
            float r14 = r14 % r10
            android.graphics.PathMeasure r9 = r6.f12584f
            if (r9 != 0) goto L_0x00fe
            android.graphics.PathMeasure r9 = new android.graphics.PathMeasure
            r9.<init>()
            r6.f12584f = r9
        L_0x00fe:
            android.graphics.PathMeasure r9 = r6.f12584f
            r9.setPath(r3, r11)
            android.graphics.PathMeasure r9 = r6.f12584f
            float r9 = r9.getLength()
            float r5 = r5 * r9
            float r14 = r14 * r9
            r3.reset()
            int r10 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0121
            android.graphics.PathMeasure r10 = r6.f12584f
            r15 = 1
            r10.getSegment(r5, r9, r3, r15)
            android.graphics.PathMeasure r5 = r6.f12584f
            r9 = 0
            r5.getSegment(r9, r14, r3, r15)
            goto L_0x0128
        L_0x0121:
            r9 = 0
            r15 = 1
            android.graphics.PathMeasure r10 = r6.f12584f
            r10.getSegment(r5, r14, r3, r15)
        L_0x0128:
            r3.rLineTo(r9, r9)
        L_0x012b:
            r4.addPath(r3, r13)
            D2.o r3 = r0.f12559f
            java.lang.Object r5 = r3.f1138W
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r5 == 0) goto L_0x0137
            goto L_0x013b
        L_0x0137:
            int r5 = r3.f1137V
            if (r5 == 0) goto L_0x013d
        L_0x013b:
            r5 = 1
            goto L_0x013e
        L_0x013d:
            r5 = 0
        L_0x013e:
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = 0
            r14 = 255(0xff, float:3.57E-43)
            r15 = 1132396544(0x437f0000, float:255.0)
            if (r5 == 0) goto L_0x01a0
            android.graphics.Paint r5 = r6.e
            if (r5 != 0) goto L_0x0159
            android.graphics.Paint r5 = new android.graphics.Paint
            r11 = 1
            r5.<init>(r11)
            r6.e = r5
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
            r5.setStyle(r11)
        L_0x0159:
            android.graphics.Paint r5 = r6.e
            java.lang.Object r11 = r3.f1138W
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L_0x0173
            r11.setLocalMatrix(r13)
            r5.setShader(r11)
            float r3 = r0.f12561h
            float r3 = r3 * r15
            int r3 = java.lang.Math.round(r3)
            r5.setAlpha(r3)
            goto L_0x018e
        L_0x0173:
            r5.setShader(r10)
            r5.setAlpha(r14)
            int r3 = r3.f1137V
            float r11 = r0.f12561h
            android.graphics.PorterDuff$Mode r16 = h2.C1077r.f12604d0
            int r14 = android.graphics.Color.alpha(r3)
            r3 = r3 & r9
            float r14 = (float) r14
            float r14 = r14 * r11
            int r11 = (int) r14
            int r11 = r11 << 24
            r3 = r3 | r11
            r5.setColor(r3)
        L_0x018e:
            r5.setColorFilter(r10)
            int r3 = r0.f12578c
            if (r3 != 0) goto L_0x0198
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.WINDING
            goto L_0x019a
        L_0x0198:
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.EVEN_ODD
        L_0x019a:
            r4.setFillType(r3)
            r8.drawPath(r4, r5)
        L_0x01a0:
            D2.o r3 = r0.f12558d
            java.lang.Object r5 = r3.f1138W
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r5 == 0) goto L_0x01a9
            goto L_0x01ad
        L_0x01a9:
            int r5 = r3.f1137V
            if (r5 == 0) goto L_0x003f
        L_0x01ad:
            android.graphics.Paint r5 = r6.f12583d
            if (r5 != 0) goto L_0x01be
            android.graphics.Paint r5 = new android.graphics.Paint
            r11 = 1
            r5.<init>(r11)
            r6.f12583d = r5
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r11)
        L_0x01be:
            android.graphics.Paint r5 = r6.f12583d
            android.graphics.Paint$Join r11 = r0.f12565m
            if (r11 == 0) goto L_0x01c7
            r5.setStrokeJoin(r11)
        L_0x01c7:
            android.graphics.Paint$Cap r11 = r0.f12564l
            if (r11 == 0) goto L_0x01ce
            r5.setStrokeCap(r11)
        L_0x01ce:
            float r11 = r0.f12566n
            r5.setStrokeMiter(r11)
            java.lang.Object r11 = r3.f1138W
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L_0x01eb
            r11.setLocalMatrix(r13)
            r5.setShader(r11)
            float r3 = r0.f12560g
            float r3 = r3 * r15
            int r3 = java.lang.Math.round(r3)
            r5.setAlpha(r3)
            goto L_0x0208
        L_0x01eb:
            r5.setShader(r10)
            r11 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r11)
            int r3 = r3.f1137V
            float r11 = r0.f12560g
            android.graphics.PorterDuff$Mode r13 = h2.C1077r.f12604d0
            int r13 = android.graphics.Color.alpha(r3)
            r3 = r3 & r9
            float r9 = (float) r13
            float r9 = r9 * r11
            int r9 = (int) r9
            int r9 = r9 << 24
            r3 = r3 | r9
            r5.setColor(r3)
        L_0x0208:
            r5.setColorFilter(r10)
            float r2 = r2 * r20
            float r0 = r0.e
            float r0 = r0 * r2
            r5.setStrokeWidth(r0)
            r8.drawPath(r4, r5)
            goto L_0x003f
        L_0x0219:
            int r12 = r12 + r0
            r10 = r17
            r9 = 1
            r11 = 0
            goto L_0x001a
        L_0x0220:
            r21.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C1074o.a(h2.l, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.f12589l;
    }

    public void setAlpha(float f8) {
        setRootAlpha((int) (f8 * 255.0f));
    }

    public void setRootAlpha(int i8) {
        this.f12589l = i8;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [Y.e, Y.i] */
    public C1074o(C1074o oVar) {
        this.f12582c = new Matrix();
        this.f12586h = 0.0f;
        this.i = 0.0f;
        this.f12587j = 0.0f;
        this.f12588k = 0.0f;
        this.f12589l = 255;
        this.f12590m = null;
        this.f12591n = null;
        ? iVar = new i((Object) null);
        this.f12592o = iVar;
        this.f12585g = new C1071l(oVar.f12585g, iVar);
        this.f12580a = new Path(oVar.f12580a);
        this.f12581b = new Path(oVar.f12581b);
        this.f12586h = oVar.f12586h;
        this.i = oVar.i;
        this.f12587j = oVar.f12587j;
        this.f12588k = oVar.f12588k;
        this.f12589l = oVar.f12589l;
        this.f12590m = oVar.f12590m;
        String str = oVar.f12590m;
        if (str != null) {
            iVar.put(str, this);
        }
        this.f12591n = oVar.f12591n;
    }
}
