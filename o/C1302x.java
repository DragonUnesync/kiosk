package o;

import B.C0003d;
import P0.q;
import Q0.t;
import T0.g0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* renamed from: o.x  reason: case insensitive filesystem */
public class C1302x extends ImageView {

    /* renamed from: U  reason: collision with root package name */
    public final t f14107U;

    /* renamed from: V  reason: collision with root package name */
    public final q f14108V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f14109W = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1302x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e1.a(context);
        d1.a(this, getContext());
        t tVar = new t((View) this);
        this.f14107U = tVar;
        tVar.g(attributeSet, i);
        q qVar = new q((ImageView) this);
        this.f14108V = qVar;
        qVar.m(attributeSet, i);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f14107U;
        if (tVar != null) {
            tVar.c();
        }
        q qVar = this.f14108V;
        if (qVar != null) {
            qVar.e();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14107U;
        if (tVar != null) {
            return tVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14107U;
        if (tVar != null) {
            return tVar.f();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        g0 g0Var;
        q qVar = this.f14108V;
        if (qVar == null || (g0Var = (g0) qVar.f3729d) == null) {
            return null;
        }
        return (ColorStateList) g0Var.f4838b;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        g0 g0Var;
        q qVar = this.f14108V;
        if (qVar == null || (g0Var = (g0) qVar.f3729d) == null) {
            return null;
        }
        return (PorterDuff.Mode) g0Var.e;
    }

    public final boolean hasOverlappingRendering() {
        if ((((ImageView) this.f14108V.f3728c).getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14107U;
        if (tVar != null) {
            tVar.h();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t tVar = this.f14107U;
        if (tVar != null) {
            tVar.i(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q qVar = this.f14108V;
        if (qVar != null) {
            qVar.e();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        q qVar = this.f14108V;
        if (!(qVar == null || drawable == null || this.f14109W)) {
            qVar.f3727b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (qVar != null) {
            qVar.e();
            if (!this.f14109W) {
                ImageView imageView = (ImageView) qVar.f3728c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(qVar.f3727b);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f14109W = true;
    }

    public void setImageResource(int i) {
        q qVar = this.f14108V;
        if (qVar != null) {
            ImageView imageView = (ImageView) qVar.f3728c;
            if (i != 0) {
                Drawable r8 = C0003d.r(imageView.getContext(), i);
                if (r8 != null) {
                    C1286o0.a(r8);
                }
                imageView.setImageDrawable(r8);
            } else {
                imageView.setImageDrawable((Drawable) null);
            }
            qVar.e();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q qVar = this.f14108V;
        if (qVar != null) {
            qVar.e();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14107U;
        if (tVar != null) {
            tVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14107U;
        if (tVar != null) {
            tVar.m(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q qVar = this.f14108V;
        if (qVar != null) {
            if (((g0) qVar.f3729d) == null) {
                qVar.f3729d = new g0(3);
            }
            g0 g0Var = (g0) qVar.f3729d;
            g0Var.f4838b = colorStateList;
            g0Var.f4840d = true;
            qVar.e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q qVar = this.f14108V;
        if (qVar != null) {
            if (((g0) qVar.f3729d) == null) {
                qVar.f3729d = new g0(3);
            }
            g0 g0Var = (g0) qVar.f3729d;
            g0Var.e = mode;
            g0Var.f4839c = true;
            qVar.e();
        }
    }
}
