package q3;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: q3.a  reason: case insensitive filesystem */
public final class C1363a implements View.OnTouchListener {

    /* renamed from: U  reason: collision with root package name */
    public final Dialog f14754U;

    /* renamed from: V  reason: collision with root package name */
    public final int f14755V;

    /* renamed from: W  reason: collision with root package name */
    public final int f14756W;

    /* renamed from: X  reason: collision with root package name */
    public final int f14757X;

    public C1363a(Dialog dialog, Rect rect) {
        this.f14754U = dialog;
        this.f14755V = rect.left;
        this.f14756W = rect.top;
        this.f14757X = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f14755V;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f14756W;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f14757X;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f14754U.onTouchEvent(obtain);
    }
}
