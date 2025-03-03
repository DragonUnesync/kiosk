package androidx.activity;

import P6.f;
import android.window.BackEvent;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7272a = new Object();

    public final BackEvent a(float f8, float f9, float f10, int i) {
        return new BackEvent(f8, f9, f10, i);
    }

    public final float b(BackEvent backEvent) {
        f.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        f.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        f.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        f.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
