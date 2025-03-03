package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bumptech.glide.c;
import n.C1226b;

/* renamed from: o.j  reason: case insensitive filesystem */
public final class C1275j extends C1302x implements C1279l {

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ C1277k f13974a0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1275j(C1277k kVar, Context context) {
        super(context, (AttributeSet) null, 2130968607);
        this.f13974a0 = kVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        c.w(this, getContentDescription());
        setOnTouchListener(new C1226b(this, this));
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f13974a0.l();
        return true;
    }

    public final boolean setFrame(int i, int i8, int i9, int i10) {
        boolean frame = super.setFrame(i, i8, i9, i10);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
