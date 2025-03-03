package h2;

import D2.o;
import android.graphics.Paint;

/* renamed from: h2.k  reason: case insensitive filesystem */
public final class C1070k extends C1073n {

    /* renamed from: d  reason: collision with root package name */
    public o f12558d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public o f12559f;

    /* renamed from: g  reason: collision with root package name */
    public float f12560g;

    /* renamed from: h  reason: collision with root package name */
    public float f12561h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public float f12562j;

    /* renamed from: k  reason: collision with root package name */
    public float f12563k;

    /* renamed from: l  reason: collision with root package name */
    public Paint.Cap f12564l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Join f12565m;

    /* renamed from: n  reason: collision with root package name */
    public float f12566n;

    public final boolean a() {
        if (this.f12559f.k() || this.f12558d.k()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            D2.o r0 = r6.f12559f
            boolean r1 = r0.k()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.f1139X
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f1137V
            if (r1 == r4) goto L_0x001e
            r0.f1137V = r1
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            D2.o r1 = r6.f12558d
            boolean r4 = r1.k()
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r1.f1139X
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f1137V
            if (r7 == r4) goto L_0x003a
            r1.f1137V = r7
            r2 = 1
        L_0x003a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C1070k.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f12561h;
    }

    public int getFillColor() {
        return this.f12559f.f1137V;
    }

    public float getStrokeAlpha() {
        return this.f12560g;
    }

    public int getStrokeColor() {
        return this.f12558d.f1137V;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f12562j;
    }

    public float getTrimPathOffset() {
        return this.f12563k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f8) {
        this.f12561h = f8;
    }

    public void setFillColor(int i8) {
        this.f12559f.f1137V = i8;
    }

    public void setStrokeAlpha(float f8) {
        this.f12560g = f8;
    }

    public void setStrokeColor(int i8) {
        this.f12558d.f1137V = i8;
    }

    public void setStrokeWidth(float f8) {
        this.e = f8;
    }

    public void setTrimPathEnd(float f8) {
        this.f12562j = f8;
    }

    public void setTrimPathOffset(float f8) {
        this.f12563k = f8;
    }

    public void setTrimPathStart(float f8) {
        this.i = f8;
    }
}
