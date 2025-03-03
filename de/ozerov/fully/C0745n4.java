package de.ozerov.fully;

import android.view.ScaleGestureDetector;

/* renamed from: de.ozerov.fully.n4  reason: case insensitive filesystem */
public final class C0745n4 extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TouchImageView f10853a;

    public C0745n4(TouchImageView touchImageView) {
        this.f10853a = touchImageView;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        int i = TouchImageView.f10372y0;
        this.f10853a.j((double) scaleGestureDetector.getScaleFactor(), focusX, focusY, true);
        this.f10853a.getClass();
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f10853a.setState(C0751o4.f10872W);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScaleEnd(android.view.ScaleGestureDetector r8) {
        /*
            r7 = this;
            super.onScaleEnd(r8)
            de.ozerov.fully.o4 r8 = de.ozerov.fully.C0751o4.f10870U
            de.ozerov.fully.TouchImageView r6 = r7.f10853a
            r6.setState(r8)
            float r8 = r6.f10373U
            float r0 = r6.f10378c0
            r1 = 1
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0015
        L_0x0013:
            r2 = r0
            goto L_0x001e
        L_0x0015:
            float r0 = r6.f10377b0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001c
            goto L_0x0013
        L_0x001c:
            r1 = 0
            r2 = r8
        L_0x001e:
            if (r1 == 0) goto L_0x0035
            de.ozerov.fully.j4 r8 = new de.ozerov.fully.j4
            int r0 = r6.f10388m0
            int r0 = r0 / 2
            float r3 = (float) r0
            int r0 = r6.f10389n0
            int r0 = r0 / 2
            float r4 = (float) r0
            r5 = 1
            r0 = r8
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.postOnAnimation(r8)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0745n4.onScaleEnd(android.view.ScaleGestureDetector):void");
    }
}
