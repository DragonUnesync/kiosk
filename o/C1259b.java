package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: o.b  reason: case insensitive filesystem */
public final class C1259b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f13918a;

    public C1259b(ActionBarContainer actionBarContainer) {
        this.f13918a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f13918a;
        if (actionBarContainer.f7393d0) {
            Drawable drawable = actionBarContainer.f7392c0;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f7390a0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f7391b0;
        if (drawable3 != null && actionBarContainer.f7394e0) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f13918a;
        if (!actionBarContainer.f7393d0) {
            Drawable drawable = actionBarContainer.f7390a0;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.f7392c0 != null) {
            actionBarContainer.f7390a0.getOutline(outline);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
