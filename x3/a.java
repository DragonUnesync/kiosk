package x3;

import android.graphics.drawable.Drawable;
import z3.g;

public final class a extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public g f16266a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16267b;

    public a(a aVar) {
        this.f16266a = (g) aVar.f16266a.f16469U.newDrawable();
        this.f16267b = aVar.f16267b;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return new b(new a(this));
    }
}
