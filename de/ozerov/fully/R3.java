package de.ozerov.fully;

import android.graphics.Point;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.altbeacon.beacon.service.RangedBeacon;

public final class R3 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10319U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ S3 f10320V;

    public /* synthetic */ R3(S3 s32, int i) {
        this.f10319U = i;
        this.f10320V = s32;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f10319U) {
            case 0:
                Display defaultDisplay = this.f10320V.f10328U.getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                if (((double) motionEvent.getX()) >= ((double) point.x) * 0.2d) {
                    return super.onDoubleTap(motionEvent);
                }
                int i = TouchableFrameLayout.f10402i0;
                TouchableFrameLayout.f10399f0 = System.currentTimeMillis();
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        switch (this.f10319U) {
            case 1:
                if (motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                int x8 = (int) (motionEvent2.getX() - motionEvent.getX());
                if (Math.abs((int) (motionEvent2.getY() - motionEvent.getY())) <= 50 || Math.abs(x8) >= 300 || f9 <= 1000.0f) {
                    return false;
                }
                Y3 y32 = this.f10320V.f10328U.f9953p1;
                y32.getClass();
                FullyActivity fullyActivity = y32.f10514a;
                if (System.currentTimeMillis() - y32.f10519g > RangedBeacon.DEFAULT_MAX_TRACKING_AGE) {
                    y32.e = 1;
                    y32.f10519g = System.currentTimeMillis();
                    fullyActivity.f9949l1.f9970f = false;
                } else {
                    y32.e++;
                }
                if (y32.e == 5) {
                    fullyActivity.f9949l1.c();
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f8, f9);
        }
    }
}
