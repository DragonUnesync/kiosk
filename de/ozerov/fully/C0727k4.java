package de.ozerov.fully;

import Z1.c;
import android.content.Context;
import android.widget.OverScroller;

/* renamed from: de.ozerov.fully.k4  reason: case insensitive filesystem */
public final class C0727k4 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public c f10776U;

    /* renamed from: V  reason: collision with root package name */
    public int f10777V;

    /* renamed from: W  reason: collision with root package name */
    public int f10778W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ TouchImageView f10779X;

    public C0727k4(TouchImageView touchImageView, int i, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        this.f10779X = touchImageView;
        touchImageView.setState(C0751o4.f10873X);
        Context context = touchImageView.f10382g0;
        c cVar = new c(15);
        cVar.f6955V = new OverScroller(context);
        this.f10776U = cVar;
        touchImageView.f10374V.getValues(touchImageView.f10381f0);
        float[] fArr = touchImageView.f10381f0;
        int i13 = (int) fArr[2];
        int i14 = (int) fArr[5];
        float b8 = touchImageView.getImageWidth();
        int i15 = touchImageView.f10388m0;
        if (b8 > ((float) i15)) {
            i10 = i15 - ((int) touchImageView.getImageWidth());
            i9 = 0;
        } else {
            i10 = i13;
            i9 = i10;
        }
        float a8 = touchImageView.getImageHeight();
        int i16 = touchImageView.f10389n0;
        if (a8 > ((float) i16)) {
            i12 = i16 - ((int) touchImageView.getImageHeight());
            i11 = 0;
        } else {
            i12 = i14;
            i11 = i12;
        }
        ((OverScroller) this.f10776U.f6955V).fling(i13, i14, i, i8, i10, i9, i12, i11);
        this.f10777V = i13;
        this.f10778W = i14;
    }

    public final void run() {
        int i = TouchImageView.f10372y0;
        TouchImageView touchImageView = this.f10779X;
        touchImageView.getClass();
        if (((OverScroller) this.f10776U.f6955V).isFinished()) {
            this.f10776U = null;
            return;
        }
        OverScroller overScroller = (OverScroller) this.f10776U.f6955V;
        overScroller.computeScrollOffset();
        if (overScroller.computeScrollOffset()) {
            int currX = ((OverScroller) this.f10776U.f6955V).getCurrX();
            int currY = ((OverScroller) this.f10776U.f6955V).getCurrY();
            int i8 = currX - this.f10777V;
            int i9 = currY - this.f10778W;
            this.f10777V = currX;
            this.f10778W = currY;
            touchImageView.f10374V.postTranslate((float) i8, (float) i9);
            touchImageView.g();
            touchImageView.setImageMatrix(touchImageView.f10374V);
            touchImageView.postOnAnimation(this);
        }
    }
}
