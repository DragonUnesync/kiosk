package h2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import n3.C1245a;
import n3.c;

/* renamed from: h2.b  reason: case insensitive filesystem */
public final class C1061b extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1245a f12542a;

    public C1061b(C1245a aVar) {
        this.f12542a = aVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f12542a.f13759b.f13775l0;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public final void onAnimationStart(Drawable drawable) {
        c cVar = this.f12542a.f13759b;
        ColorStateList colorStateList = cVar.f13775l0;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.p0, colorStateList.getDefaultColor()));
        }
    }
}
