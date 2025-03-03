package h2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: h2.q  reason: case insensitive filesystem */
public final class C1076q extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f12603a;

    public C1076q(Drawable.ConstantState constantState) {
        this.f12603a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f12603a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f12603a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        C1077r rVar = new C1077r();
        rVar.f12557U = (VectorDrawable) this.f12603a.newDrawable();
        return rVar;
    }

    public final Drawable newDrawable(Resources resources) {
        C1077r rVar = new C1077r();
        rVar.f12557U = (VectorDrawable) this.f12603a.newDrawable(resources);
        return rVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1077r rVar = new C1077r();
        rVar.f12557U = (VectorDrawable) this.f12603a.newDrawable(resources, theme);
        return rVar;
    }
}
