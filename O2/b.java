package O2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import h2.C1065f;

public final class b extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3608a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3609b;

    public /* synthetic */ b(int i, Object obj) {
        this.f3608a = i;
        this.f3609b = obj;
    }

    public boolean canApplyTheme() {
        switch (this.f3608a) {
            case 1:
                return ((Drawable.ConstantState) this.f3609b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    public final int getChangingConfigurations() {
        switch (this.f3608a) {
            case 0:
                return 0;
            default:
                return ((Drawable.ConstantState) this.f3609b).getChangingConfigurations();
        }
    }

    public final Drawable newDrawable() {
        switch (this.f3608a) {
            case 0:
                return new c(this);
            default:
                C1065f fVar = new C1065f((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f3609b).newDrawable();
                fVar.f12557U = newDrawable;
                newDrawable.setCallback(fVar.f12554Z);
                return fVar;
        }
    }

    public final Drawable newDrawable(Resources resources) {
        switch (this.f3608a) {
            case 0:
                return new c(this);
            default:
                C1065f fVar = new C1065f((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f3609b).newDrawable(resources);
                fVar.f12557U = newDrawable;
                newDrawable.setCallback(fVar.f12554Z);
                return fVar;
        }
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f3608a) {
            case 1:
                C1065f fVar = new C1065f((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f3609b).newDrawable(resources, theme);
                fVar.f12557U = newDrawable;
                newDrawable.setCallback(fVar.f12554Z);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
