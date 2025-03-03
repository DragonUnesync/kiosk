package de.ozerov.fully;

import android.graphics.PointF;
import android.view.View;

/* renamed from: de.ozerov.fully.m4  reason: case insensitive filesystem */
public final class C0739m4 implements View.OnTouchListener {

    /* renamed from: U  reason: collision with root package name */
    public final PointF f10804U = new PointF();

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ TouchImageView f10805V;

    public C0739m4(TouchImageView touchImageView) {
        this.f10805V = touchImageView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r2 != 6) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            de.ozerov.fully.TouchImageView r0 = r9.f10805V
            android.view.ScaleGestureDetector r1 = r0.f10395u0
            r1.onTouchEvent(r11)
            android.view.GestureDetector r1 = r0.f10396v0
            r1.onTouchEvent(r11)
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r11.getX()
            float r3 = r11.getY()
            r1.<init>(r2, r3)
            de.ozerov.fully.o4 r2 = r0.f10376a0
            de.ozerov.fully.o4 r3 = de.ozerov.fully.C0751o4.f10870U
            de.ozerov.fully.o4 r4 = de.ozerov.fully.C0751o4.f10871V
            r5 = 1
            if (r2 == r3) goto L_0x0028
            if (r2 == r4) goto L_0x0028
            de.ozerov.fully.o4 r6 = de.ozerov.fully.C0751o4.f10873X
            if (r2 != r6) goto L_0x0090
        L_0x0028:
            int r2 = r11.getAction()
            android.graphics.PointF r6 = r9.f10804U
            if (r2 == 0) goto L_0x0074
            if (r2 == r5) goto L_0x0070
            r7 = 2
            if (r2 == r7) goto L_0x0039
            r1 = 6
            if (r2 == r1) goto L_0x0070
            goto L_0x0090
        L_0x0039:
            de.ozerov.fully.o4 r2 = r0.f10376a0
            if (r2 != r4) goto L_0x0090
            float r2 = r1.x
            float r3 = r6.x
            float r2 = r2 - r3
            float r3 = r1.y
            float r4 = r6.y
            float r3 = r3 - r4
            int r4 = r0.f10388m0
            float r4 = (float) r4
            float r7 = r0.getImageWidth()
            r8 = 0
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0054
            r2 = 0
        L_0x0054:
            int r4 = r0.f10389n0
            float r4 = (float) r4
            float r7 = r0.getImageHeight()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0060
            r3 = 0
        L_0x0060:
            android.graphics.Matrix r4 = r0.f10374V
            r4.postTranslate(r2, r3)
            r0.g()
            float r2 = r1.x
            float r1 = r1.y
            r6.set(r2, r1)
            goto L_0x0090
        L_0x0070:
            r0.setState(r3)
            goto L_0x0090
        L_0x0074:
            r6.set(r1)
            de.ozerov.fully.k4 r1 = r0.f10383h0
            if (r1 == 0) goto L_0x008d
            Z1.c r2 = r1.f10776U
            if (r2 == 0) goto L_0x008d
            de.ozerov.fully.TouchImageView r2 = r1.f10779X
            r2.setState(r3)
            Z1.c r1 = r1.f10776U
            java.lang.Object r1 = r1.f6955V
            android.widget.OverScroller r1 = (android.widget.OverScroller) r1
            r1.forceFinished(r5)
        L_0x008d:
            r0.setState(r4)
        L_0x0090:
            android.graphics.Matrix r1 = r0.f10374V
            r0.setImageMatrix(r1)
            android.view.View$OnTouchListener r0 = r0.f10398x0
            if (r0 == 0) goto L_0x009c
            r0.onTouch(r10, r11)
        L_0x009c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0739m4.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
