package w3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import f3.C0899a;
import g7.C0996d;
import l0.C1169b;
import l0.l;

/* renamed from: w3.d  reason: case insensitive filesystem */
public final class C1590d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f16201a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16202b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16203c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16204d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final float f16205f;

    /* renamed from: g  reason: collision with root package name */
    public final float f16206g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f16207h;
    public final float i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f16208j;

    /* renamed from: k  reason: collision with root package name */
    public float f16209k;

    /* renamed from: l  reason: collision with root package name */
    public final int f16210l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16211m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f16212n;

    public C1590d(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, C0899a.f11671y);
        this.f16209k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f16208j = c.j(context, obtainStyledAttributes, 3);
        c.j(context, obtainStyledAttributes, 4);
        c.j(context, obtainStyledAttributes, 5);
        this.f16203c = obtainStyledAttributes.getInt(2, 0);
        this.f16204d = obtainStyledAttributes.getInt(1, 1);
        int i9 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f16210l = obtainStyledAttributes.getResourceId(i9, 0);
        this.f16202b = obtainStyledAttributes.getString(i9);
        obtainStyledAttributes.getBoolean(14, false);
        this.f16201a = c.j(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f16205f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f16206g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i8, C0899a.f11663q);
        this.f16207h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f16212n;
        int i8 = this.f16203c;
        if (typeface == null && (str = this.f16202b) != null) {
            this.f16212n = Typeface.create(str, i8);
        }
        if (this.f16212n == null) {
            int i9 = this.f16204d;
            if (i9 == 1) {
                this.f16212n = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                this.f16212n = Typeface.SERIF;
            } else if (i9 != 3) {
                this.f16212n = Typeface.DEFAULT;
            } else {
                this.f16212n = Typeface.MONOSPACE;
            }
            this.f16212n = Typeface.create(this.f16212n, i8);
        }
    }

    public final Typeface b(Context context) {
        Typeface typeface;
        if (this.f16211m) {
            return this.f16212n;
        }
        if (!context.isRestricted()) {
            try {
                int i8 = this.f16210l;
                ThreadLocal threadLocal = l.f13083a;
                if (context.isRestricted()) {
                    typeface = null;
                } else {
                    typeface = l.b(context, i8, new TypedValue(), 0, (C1169b) null, false, false);
                }
                this.f16212n = typeface;
                if (typeface != null) {
                    this.f16212n = Typeface.create(typeface, this.f16203c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e8) {
                Log.d("TextAppearance", "Error loading font " + this.f16202b, e8);
            }
        }
        a();
        this.f16211m = true;
        return this.f16212n;
    }

    public final void c(Context context, d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i8 = this.f16210l;
        if (i8 == 0) {
            this.f16211m = true;
        }
        if (this.f16211m) {
            dVar.n(this.f16212n, true);
            return;
        }
        try {
            C1588b bVar = new C1588b(this, dVar);
            ThreadLocal threadLocal = l.f13083a;
            if (context.isRestricted()) {
                bVar.a(-4);
                return;
            }
            l.b(context, i8, new TypedValue(), 0, bVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f16211m = true;
            dVar.m(1);
        } catch (Exception e8) {
            Log.d("TextAppearance", "Error loading font " + this.f16202b, e8);
            this.f16211m = true;
            dVar.m(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i8 = this.f16210l;
        if (i8 != 0) {
            ThreadLocal threadLocal = l.f13083a;
            if (!context.isRestricted()) {
                typeface = l.b(context, i8, new TypedValue(), 0, (C1169b) null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void e(Context context, TextPaint textPaint, d dVar) {
        int i8;
        int i9;
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f16208j;
        if (colorStateList != null) {
            i8 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i8 = -16777216;
        }
        textPaint.setColor(i8);
        ColorStateList colorStateList2 = this.f16201a;
        if (colorStateList2 != null) {
            i9 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i9 = 0;
        }
        textPaint.setShadowLayer(this.f16206g, this.e, this.f16205f, i9);
    }

    public final void f(Context context, TextPaint textPaint, d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f16212n);
        c(context, new C1589c(this, context, textPaint, dVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f8;
        Typeface n4 = C0996d.n(context.getResources().getConfiguration(), typeface);
        if (n4 != null) {
            typeface = n4;
        }
        textPaint.setTypeface(typeface);
        int i8 = (~typeface.getStyle()) & this.f16203c;
        if ((i8 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i8 & 2) != 0) {
            f8 = -0.25f;
        } else {
            f8 = 0.0f;
        }
        textPaint.setTextSkewX(f8);
        textPaint.setTextSize(this.f16209k);
        if (this.f16207h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
