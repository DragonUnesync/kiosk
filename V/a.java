package V;

import K1.i;
import P6.f;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.OverScroller;
import de.ozerov.fully.C0721j4;
import de.ozerov.fully.C0727k4;
import de.ozerov.fully.C0751o4;
import de.ozerov.fully.H2;
import de.ozerov.fully.TouchImageView;

public final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f5470U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f5471V;

    public /* synthetic */ a(int i, Object obj) {
        this.f5470U = i;
        this.f5471V = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        float f8;
        switch (this.f5470U) {
            case 0:
                f.e(motionEvent, "e");
                motionEvent.getX();
                ((i) this.f5471V).getClass();
                motionEvent.getY();
                return true;
            case 2:
                TouchImageView touchImageView = (TouchImageView) this.f5471V;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = touchImageView.f10397w0;
                if (onDoubleTapListener != null) {
                    z = onDoubleTapListener.onDoubleTap(motionEvent);
                } else {
                    z = false;
                }
                TouchImageView touchImageView2 = (TouchImageView) this.f5471V;
                if (touchImageView2.f10376a0 != C0751o4.f10870U) {
                    return z;
                }
                float f9 = touchImageView2.f10373U;
                float f10 = touchImageView2.f10377b0;
                if (f9 == f10) {
                    f8 = touchImageView2.f10378c0;
                } else {
                    f8 = f10;
                }
                touchImageView.postOnAnimation(new C0721j4(touchImageView2, f8, motionEvent.getX(), motionEvent.getY(), false));
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.f5470U) {
            case 2:
                GestureDetector.OnDoubleTapListener onDoubleTapListener = ((TouchImageView) this.f5471V).f10397w0;
                if (onDoubleTapListener != null) {
                    return onDoubleTapListener.onDoubleTapEvent(motionEvent);
                }
                return false;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        switch (this.f5470U) {
            case 1:
                if (motionEvent == null || motionEvent2 == null) {
                    return false;
                }
                H2 h22 = (H2) this.f5471V;
                if (h22.f9994R0 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                int y8 = (int) (motionEvent2.getY() - motionEvent.getY());
                if (Math.abs((int) (motionEvent2.getX() - motionEvent.getX())) <= 150 || Math.abs(y8) >= 120 || Math.abs(f8) <= 120.0f) {
                    return false;
                }
                if (f8 > 0.0f) {
                    h22.P(h22.f9994R0.getIndex() - 1);
                } else {
                    h22.P(h22.f9994R0.getIndex() + 1);
                }
                return true;
            case 2:
                TouchImageView touchImageView = (TouchImageView) this.f5471V;
                C0727k4 k4Var = touchImageView.f10383h0;
                if (!(k4Var == null || k4Var.f10776U == null)) {
                    k4Var.f10779X.setState(C0751o4.f10870U);
                    ((OverScroller) k4Var.f10776U.f6955V).forceFinished(true);
                }
                C0727k4 k4Var2 = new C0727k4(touchImageView, (int) f8, (int) f9);
                touchImageView.f10383h0 = k4Var2;
                touchImageView.postOnAnimation(k4Var2);
                return super.onFling(motionEvent, motionEvent2, f8, f9);
            default:
                return super.onFling(motionEvent, motionEvent2, f8, f9);
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
        switch (this.f5470U) {
            case 2:
                ((TouchImageView) this.f5471V).performLongClick();
                return;
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.f5470U) {
            case 2:
                TouchImageView touchImageView = (TouchImageView) this.f5471V;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = touchImageView.f10397w0;
                if (onDoubleTapListener != null) {
                    return onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                }
                return touchImageView.performClick();
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }
}
