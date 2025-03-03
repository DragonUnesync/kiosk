package t3;

import D2.G;
import I0.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import g3.C0958a;
import g7.C0996d;
import java.util.WeakHashMap;
import t0.C1418f;
import v0.C1510H;
import w3.C1587a;

public final class b {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f15381A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f15382B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f15383C;

    /* renamed from: D  reason: collision with root package name */
    public final boolean f15384D = true;

    /* renamed from: E  reason: collision with root package name */
    public Bitmap f15385E;

    /* renamed from: F  reason: collision with root package name */
    public float f15386F;

    /* renamed from: G  reason: collision with root package name */
    public float f15387G;

    /* renamed from: H  reason: collision with root package name */
    public float f15388H;

    /* renamed from: I  reason: collision with root package name */
    public float f15389I;

    /* renamed from: J  reason: collision with root package name */
    public float f15390J;

    /* renamed from: K  reason: collision with root package name */
    public int f15391K;

    /* renamed from: L  reason: collision with root package name */
    public int[] f15392L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f15393M;

    /* renamed from: N  reason: collision with root package name */
    public final TextPaint f15394N;

    /* renamed from: O  reason: collision with root package name */
    public final TextPaint f15395O;

    /* renamed from: P  reason: collision with root package name */
    public LinearInterpolator f15396P;

    /* renamed from: Q  reason: collision with root package name */
    public LinearInterpolator f15397Q;

    /* renamed from: R  reason: collision with root package name */
    public float f15398R;

    /* renamed from: S  reason: collision with root package name */
    public float f15399S;

    /* renamed from: T  reason: collision with root package name */
    public float f15400T;

    /* renamed from: U  reason: collision with root package name */
    public ColorStateList f15401U;

    /* renamed from: V  reason: collision with root package name */
    public float f15402V;

    /* renamed from: W  reason: collision with root package name */
    public float f15403W;

    /* renamed from: X  reason: collision with root package name */
    public float f15404X;

    /* renamed from: Y  reason: collision with root package name */
    public StaticLayout f15405Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f15406Z;

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f15407a;

    /* renamed from: a0  reason: collision with root package name */
    public float f15408a0;

    /* renamed from: b  reason: collision with root package name */
    public float f15409b;

    /* renamed from: b0  reason: collision with root package name */
    public float f15410b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f15411c;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f15412c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f15413d;

    /* renamed from: d0  reason: collision with root package name */
    public final int f15414d0 = 1;
    public final RectF e;

    /* renamed from: e0  reason: collision with root package name */
    public final float f15415e0 = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f15416f = 16;

    /* renamed from: f0  reason: collision with root package name */
    public final int f15417f0 = g.f15443l;

    /* renamed from: g  reason: collision with root package name */
    public int f15418g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f15419h = 15.0f;
    public float i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f15420j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f15421k;

    /* renamed from: l  reason: collision with root package name */
    public float f15422l;

    /* renamed from: m  reason: collision with root package name */
    public float f15423m;

    /* renamed from: n  reason: collision with root package name */
    public float f15424n;

    /* renamed from: o  reason: collision with root package name */
    public float f15425o;

    /* renamed from: p  reason: collision with root package name */
    public float f15426p;

    /* renamed from: q  reason: collision with root package name */
    public float f15427q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f15428r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f15429s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f15430t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f15431u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f15432v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f15433w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f15434x;

    /* renamed from: y  reason: collision with root package name */
    public C1587a f15435y;
    public final TextUtils.TruncateAt z = TextUtils.TruncateAt.END;

    public b(TextInputLayout textInputLayout) {
        this.f15407a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f15394N = textPaint;
        this.f15395O = new TextPaint(textPaint);
        this.f15413d = new Rect();
        this.f15411c = new Rect();
        this.e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f8, int i8, int i9) {
        float f9 = 1.0f - f8;
        return Color.argb(Math.round((((float) Color.alpha(i9)) * f8) + (((float) Color.alpha(i8)) * f9)), Math.round((((float) Color.red(i9)) * f8) + (((float) Color.red(i8)) * f9)), Math.round((((float) Color.green(i9)) * f8) + (((float) Color.green(i8)) * f9)), Math.round((((float) Color.blue(i9)) * f8) + (((float) Color.blue(i8)) * f9)));
    }

    public static float f(float f8, float f9, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return C0958a.a(f8, f9, f10);
    }

    public final boolean b(CharSequence charSequence) {
        G g8;
        WeakHashMap weakHashMap = C1510H.f15874a;
        boolean z6 = true;
        if (this.f15407a.getLayoutDirection() != 1) {
            z6 = false;
        }
        if (!this.f15384D) {
            return z6;
        }
        if (z6) {
            g8 = C1418f.f15181d;
        } else {
            g8 = C1418f.f15180c;
        }
        return g8.h(charSequence, charSequence.length());
    }

    public final void c(float f8, boolean z6) {
        boolean z8;
        float f9;
        float f10;
        Typeface typeface;
        boolean z9;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.f15381A != null) {
            float width = (float) this.f15413d.width();
            float width2 = (float) this.f15411c.width();
            if (Math.abs(f8 - 1.0f) < 1.0E-5f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                f10 = this.i;
                f9 = this.f15402V;
                this.f15386F = 1.0f;
                typeface = this.f15428r;
            } else {
                float f11 = this.f15419h;
                float f12 = this.f15403W;
                Typeface typeface2 = this.f15431u;
                if (Math.abs(f8 - 0.0f) < 1.0E-5f) {
                    this.f15386F = 1.0f;
                } else {
                    this.f15386F = f(this.f15419h, this.i, f8, this.f15397Q) / this.f15419h;
                }
                float f13 = this.i / this.f15419h;
                float f14 = width2 * f13;
                if (z6 || f14 <= width) {
                    width = width2;
                } else {
                    width = Math.min(width / f13, width2);
                }
                f10 = f11;
                f9 = f12;
                typeface = typeface2;
            }
            TextPaint textPaint = this.f15394N;
            if (width > 0.0f) {
                if (this.f15387G != f10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f15404X != f9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f15434x != typeface) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                StaticLayout staticLayout2 = this.f15405Y;
                if (staticLayout2 == null || width == ((float) staticLayout2.getWidth())) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z10 || z11 || z13 || z12 || this.f15393M) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f15387G = f10;
                this.f15404X = f9;
                this.f15434x = typeface;
                this.f15393M = false;
                if (this.f15386F != 1.0f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                textPaint.setLinearText(z14);
            } else {
                z9 = false;
            }
            if (this.f15382B == null || z9) {
                textPaint.setTextSize(this.f15387G);
                textPaint.setTypeface(this.f15434x);
                textPaint.setLetterSpacing(this.f15404X);
                boolean b8 = b(this.f15381A);
                this.f15383C = b8;
                int i8 = this.f15414d0;
                if (i8 <= 1 || b8) {
                    i8 = 1;
                }
                if (i8 == 1) {
                    try {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } catch (f e8) {
                        Log.e("CollapsingTextHelper", e8.getCause().getMessage(), e8);
                        staticLayout = null;
                    }
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f15416f, b8 ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        if (this.f15383C) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.f15383C) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                g gVar = new g(this.f15381A, textPaint, (int) width);
                gVar.f15455k = this.z;
                gVar.f15454j = b8;
                gVar.e = alignment;
                gVar.i = false;
                gVar.f15451f = i8;
                gVar.f15452g = this.f15415e0;
                gVar.f15453h = this.f15417f0;
                staticLayout = gVar.a();
                staticLayout.getClass();
                this.f15405Y = staticLayout;
                this.f15382B = staticLayout.getText();
            }
        }
    }

    public final float d() {
        TextPaint textPaint = this.f15395O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f15428r);
        textPaint.setLetterSpacing(this.f15402V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f15392L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f15430t;
            if (typeface != null) {
                this.f15429s = C0996d.n(configuration, typeface);
            }
            Typeface typeface2 = this.f15433w;
            if (typeface2 != null) {
                this.f15432v = C0996d.n(configuration, typeface2);
            }
            Typeface typeface3 = this.f15429s;
            if (typeface3 == null) {
                typeface3 = this.f15430t;
            }
            this.f15428r = typeface3;
            Typeface typeface4 = this.f15432v;
            if (typeface4 == null) {
                typeface4 = this.f15433w;
            }
            this.f15431u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z6) {
        float f8;
        float f9;
        StaticLayout staticLayout;
        boolean z8 = z6;
        TextInputLayout textInputLayout = this.f15407a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z8) {
            c(1.0f, z8);
            CharSequence charSequence = this.f15382B;
            TextPaint textPaint = this.f15394N;
            if (!(charSequence == null || (staticLayout = this.f15405Y) == null)) {
                this.f15412c0 = TextUtils.ellipsize(charSequence, textPaint, (float) staticLayout.getWidth(), this.z);
            }
            CharSequence charSequence2 = this.f15412c0;
            if (charSequence2 != null) {
                this.f15406Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f15406Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f15418g, this.f15383C ? 1 : 0);
            int i8 = absoluteGravity & 112;
            Rect rect = this.f15413d;
            if (i8 == 48) {
                this.f15423m = (float) rect.top;
            } else if (i8 != 80) {
                this.f15423m = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                this.f15423m = textPaint.ascent() + ((float) rect.bottom);
            }
            int i9 = absoluteGravity & 8388615;
            if (i9 == 1) {
                this.f15425o = ((float) rect.centerX()) - (this.f15406Z / 2.0f);
            } else if (i9 != 5) {
                this.f15425o = (float) rect.left;
            } else {
                this.f15425o = ((float) rect.right) - this.f15406Z;
            }
            c(0.0f, z8);
            StaticLayout staticLayout2 = this.f15405Y;
            if (staticLayout2 != null) {
                f8 = (float) staticLayout2.getHeight();
            } else {
                f8 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f15405Y;
            if (staticLayout3 == null || this.f15414d0 <= 1) {
                CharSequence charSequence3 = this.f15382B;
                if (charSequence3 != null) {
                    f9 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f9 = 0.0f;
                }
            } else {
                f9 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.f15405Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f15416f, this.f15383C ? 1 : 0);
            int i10 = absoluteGravity2 & 112;
            Rect rect2 = this.f15411c;
            if (i10 == 48) {
                this.f15422l = (float) rect2.top;
            } else if (i10 != 80) {
                this.f15422l = ((float) rect2.centerY()) - (f8 / 2.0f);
            } else {
                this.f15422l = textPaint.descent() + (((float) rect2.bottom) - f8);
            }
            int i11 = absoluteGravity2 & 8388615;
            if (i11 == 1) {
                this.f15424n = ((float) rect2.centerX()) - (f9 / 2.0f);
            } else if (i11 != 5) {
                this.f15424n = (float) rect2.left;
            } else {
                this.f15424n = ((float) rect2.right) - f9;
            }
            Bitmap bitmap = this.f15385E;
            if (bitmap != null) {
                bitmap.recycle();
                this.f15385E = null;
            }
            l(this.f15409b);
            float f10 = this.f15409b;
            float f11 = f((float) rect2.left, (float) rect.left, f10, this.f15396P);
            RectF rectF = this.e;
            rectF.left = f11;
            rectF.top = f(this.f15422l, this.f15423m, f10, this.f15396P);
            rectF.right = f((float) rect2.right, (float) rect.right, f10, this.f15396P);
            rectF.bottom = f((float) rect2.bottom, (float) rect.bottom, f10, this.f15396P);
            this.f15426p = f(this.f15424n, this.f15425o, f10, this.f15396P);
            this.f15427q = f(this.f15422l, this.f15423m, f10, this.f15396P);
            l(f10);
            a aVar = C0958a.f12006b;
            this.f15408a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, aVar);
            WeakHashMap weakHashMap = C1510H.f15874a;
            textInputLayout.postInvalidateOnAnimation();
            this.f15410b0 = f(1.0f, 0.0f, f10, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f15421k;
            ColorStateList colorStateList2 = this.f15420j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, e(colorStateList2), e(this.f15421k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f12 = this.f15402V;
            float f13 = this.f15403W;
            if (f12 != f13) {
                textPaint.setLetterSpacing(f(f13, f12, f10, aVar));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.f15388H = C0958a.a(0.0f, this.f15398R, f10);
            this.f15389I = C0958a.a(0.0f, this.f15399S, f10);
            this.f15390J = C0958a.a(0.0f, this.f15400T, f10);
            int a8 = a(f10, 0, e(this.f15401U));
            this.f15391K = a8;
            textPaint.setShadowLayer(this.f15388H, this.f15389I, this.f15390J, a8);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f15421k != colorStateList || this.f15420j != colorStateList) {
            this.f15421k = colorStateList;
            this.f15420j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        C1587a aVar = this.f15435y;
        if (aVar != null) {
            aVar.f16196k = true;
        }
        if (this.f15430t == typeface) {
            return false;
        }
        this.f15430t = typeface;
        Typeface n4 = C0996d.n(this.f15407a.getContext().getResources().getConfiguration(), typeface);
        this.f15429s = n4;
        if (n4 == null) {
            n4 = this.f15430t;
        }
        this.f15428r = n4;
        return true;
    }

    public final void k(float f8) {
        if (f8 < 0.0f) {
            f8 = 0.0f;
        } else if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (f8 != this.f15409b) {
            this.f15409b = f8;
            Rect rect = this.f15411c;
            Rect rect2 = this.f15413d;
            float f9 = f((float) rect.left, (float) rect2.left, f8, this.f15396P);
            RectF rectF = this.e;
            rectF.left = f9;
            rectF.top = f(this.f15422l, this.f15423m, f8, this.f15396P);
            rectF.right = f((float) rect.right, (float) rect2.right, f8, this.f15396P);
            rectF.bottom = f((float) rect.bottom, (float) rect2.bottom, f8, this.f15396P);
            this.f15426p = f(this.f15424n, this.f15425o, f8, this.f15396P);
            this.f15427q = f(this.f15422l, this.f15423m, f8, this.f15396P);
            l(f8);
            a aVar = C0958a.f12006b;
            this.f15408a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f8, aVar);
            WeakHashMap weakHashMap = C1510H.f15874a;
            TextInputLayout textInputLayout = this.f15407a;
            textInputLayout.postInvalidateOnAnimation();
            this.f15410b0 = f(1.0f, 0.0f, f8, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f15421k;
            ColorStateList colorStateList2 = this.f15420j;
            TextPaint textPaint = this.f15394N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f8, e(colorStateList2), e(this.f15421k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f10 = this.f15402V;
            float f11 = this.f15403W;
            if (f10 != f11) {
                textPaint.setLetterSpacing(f(f11, f10, f8, aVar));
            } else {
                textPaint.setLetterSpacing(f10);
            }
            this.f15388H = C0958a.a(0.0f, this.f15398R, f8);
            this.f15389I = C0958a.a(0.0f, this.f15399S, f8);
            this.f15390J = C0958a.a(0.0f, this.f15400T, f8);
            int a8 = a(f8, 0, e(this.f15401U));
            this.f15391K = a8;
            textPaint.setShadowLayer(this.f15388H, this.f15389I, this.f15390J, a8);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f8) {
        c(f8, false);
        WeakHashMap weakHashMap = C1510H.f15874a;
        this.f15407a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z6;
        boolean j7 = j(typeface);
        if (this.f15433w != typeface) {
            this.f15433w = typeface;
            Typeface n4 = C0996d.n(this.f15407a.getContext().getResources().getConfiguration(), typeface);
            this.f15432v = n4;
            if (n4 == null) {
                n4 = this.f15433w;
            }
            this.f15431u = n4;
            z6 = true;
        } else {
            z6 = false;
        }
        if (j7 || z6) {
            h(false);
        }
    }
}
