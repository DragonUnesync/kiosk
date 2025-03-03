package o;

import android.view.MotionEvent;
import android.view.View;

public final class F0 implements View.OnTouchListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ G0 f13811U;

    public F0(G0 g02) {
        this.f13811U = g02;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1306z zVar;
        int action = motionEvent.getAction();
        int x8 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        G0 g02 = this.f13811U;
        if (action == 0 && (zVar = g02.f13841t0) != null && zVar.isShowing() && x8 >= 0 && x8 < g02.f13841t0.getWidth() && y8 >= 0 && y8 < g02.f13841t0.getHeight()) {
            g02.p0.postDelayed(g02.f13834l0, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            g02.p0.removeCallbacks(g02.f13834l0);
            return false;
        }
    }
}
