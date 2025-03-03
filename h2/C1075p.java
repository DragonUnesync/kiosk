package h2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: h2.p  reason: case insensitive filesystem */
public final class C1075p extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f12593a;

    /* renamed from: b  reason: collision with root package name */
    public C1074o f12594b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f12595c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f12596d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f12597f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f12598g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f12599h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12600j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12601k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f12602l;

    public int getChangingConfigurations() {
        return this.f12593a;
    }

    public final Drawable newDrawable() {
        return new C1077r(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new C1077r(this);
    }
}
