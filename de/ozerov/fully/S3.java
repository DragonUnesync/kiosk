package de.ozerov.fully;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public final class S3 extends FrameLayout {

    /* renamed from: U  reason: collision with root package name */
    public final FullyActivity f10328U;

    /* renamed from: V  reason: collision with root package name */
    public final GestureDetector f10329V;

    /* renamed from: W  reason: collision with root package name */
    public final GestureDetector f10330W;

    public S3(FullyActivity fullyActivity) {
        super(fullyActivity);
        this.f10328U = fullyActivity;
        this.f10329V = new GestureDetector(fullyActivity, new R3(this, 0));
        this.f10330W = new GestureDetector(fullyActivity, new R3(this, 1));
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10329V.onTouchEvent(motionEvent) && !this.f10330W.onTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }
}
