package h2;

import android.graphics.drawable.Drawable;

/* renamed from: h2.c  reason: case insensitive filesystem */
public final class C1062c implements Drawable.Callback {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12543U = 1;

    /* renamed from: V  reason: collision with root package name */
    public Object f12544V;

    public /* synthetic */ C1062c() {
    }

    private final void a(Drawable drawable) {
    }

    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f12543U) {
            case 0:
                ((C1065f) this.f12544V).invalidateSelf();
                return;
            default:
                return;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        switch (this.f12543U) {
            case 0:
                ((C1065f) this.f12544V).scheduleSelf(runnable, j7);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f12544V;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j7);
                    return;
                }
                return;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f12543U) {
            case 0:
                ((C1065f) this.f12544V).unscheduleSelf(runnable);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f12544V;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public C1062c(C1065f fVar) {
        this.f12544V = fVar;
    }
}
