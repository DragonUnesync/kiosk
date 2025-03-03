package Y1;

import android.view.MotionEvent;
import android.webkit.WebView;

public final class M extends WebView {
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
