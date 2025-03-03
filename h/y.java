package h;

import B.C0003d;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import m.C1184c;

public final class y extends ContentFrameLayout {

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ C1000A f12245f0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(C1000A a8, C1184c cVar) {
        super(cVar, (AttributeSet) null);
        this.f12245f0 = a8;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f12245f0.v(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x8 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (x8 < -5 || y8 < -5 || x8 > getWidth() + 5 || y8 > getHeight() + 5) {
                C1000A a8 = this.f12245f0;
                a8.t(a8.B(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C0003d.r(getContext(), i));
    }
}
