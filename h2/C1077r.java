package h2;

import B.C0003d;
import E.e;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import l0.C1169b;
import l0.C1170c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: h2.r  reason: case insensitive filesystem */
public final class C1077r extends C1068i {

    /* renamed from: d0  reason: collision with root package name */
    public static final PorterDuff.Mode f12604d0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: V  reason: collision with root package name */
    public C1075p f12605V;

    /* renamed from: W  reason: collision with root package name */
    public PorterDuffColorFilter f12606W;

    /* renamed from: X  reason: collision with root package name */
    public ColorFilter f12607X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f12608Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f12609Z = true;

    /* renamed from: a0  reason: collision with root package name */
    public final float[] f12610a0 = new float[9];

    /* renamed from: b0  reason: collision with root package name */
    public final Matrix f12611b0 = new Matrix();

    /* renamed from: c0  reason: collision with root package name */
    public final Rect f12612c0 = new Rect();

    /* JADX WARNING: type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, h2.p] */
    public C1077r() {
        ? constantState = new Drawable.ConstantState();
        constantState.f12595c = null;
        constantState.f12596d = f12604d0;
        constantState.f12594b = new C1074o();
        this.f12605V = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f12557U;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.draw(canvas2);
            return;
        }
        Rect rect = this.f12612c0;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f12607X;
            if (colorFilter == null) {
                colorFilter = this.f12606W;
            }
            Matrix matrix = this.f12611b0;
            canvas2.getMatrix(matrix);
            float[] fArr = this.f12610a0;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas2.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && e.q(this) == 1) {
                    canvas2.translate((float) rect.width(), 0.0f);
                    canvas2.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                C1075p pVar = this.f12605V;
                Bitmap bitmap = pVar.f12597f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == pVar.f12597f.getHeight())) {
                    pVar.f12597f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    pVar.f12601k = true;
                }
                if (!this.f12609Z) {
                    C1075p pVar2 = this.f12605V;
                    pVar2.f12597f.eraseColor(0);
                    Canvas canvas3 = new Canvas(pVar2.f12597f);
                    C1074o oVar = pVar2.f12594b;
                    oVar.a(oVar.f12585g, C1074o.f12579p, canvas3, min, min2);
                } else {
                    C1075p pVar3 = this.f12605V;
                    if (!(!pVar3.f12601k && pVar3.f12598g == pVar3.f12595c && pVar3.f12599h == pVar3.f12596d && pVar3.f12600j == pVar3.e && pVar3.i == pVar3.f12594b.getRootAlpha())) {
                        C1075p pVar4 = this.f12605V;
                        pVar4.f12597f.eraseColor(0);
                        Canvas canvas4 = new Canvas(pVar4.f12597f);
                        C1074o oVar2 = pVar4.f12594b;
                        oVar2.a(oVar2.f12585g, C1074o.f12579p, canvas4, min, min2);
                        C1075p pVar5 = this.f12605V;
                        pVar5.f12598g = pVar5.f12595c;
                        pVar5.f12599h = pVar5.f12596d;
                        pVar5.i = pVar5.f12594b.getRootAlpha();
                        pVar5.f12600j = pVar5.e;
                        pVar5.f12601k = false;
                    }
                }
                C1075p pVar6 = this.f12605V;
                if (pVar6.f12594b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (pVar6.f12602l == null) {
                        Paint paint2 = new Paint();
                        pVar6.f12602l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    pVar6.f12602l.setAlpha(pVar6.f12594b.getRootAlpha());
                    pVar6.f12602l.setColorFilter(colorFilter);
                    paint = pVar6.f12602l;
                }
                canvas2.drawBitmap(pVar6.f12597f, (Rect) null, rect, paint);
                canvas2.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f12605V.f12594b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f12605V.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f12607X;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f12557U != null && Build.VERSION.SDK_INT >= 24) {
            return new C1076q(this.f12557U.getConstantState());
        }
        this.f12605V.f12593a = getChangingConfigurations();
        return this.f12605V;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f12605V.f12594b.i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f12605V.f12594b.f12586h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f12605V.e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C1075p pVar = this.f12605V;
            if (pVar != null) {
                C1074o oVar = pVar.f12594b;
                if (oVar.f12591n == null) {
                    oVar.f12591n = Boolean.valueOf(oVar.f12585g.a());
                }
                if (oVar.f12591n.booleanValue() || ((colorStateList = this.f12605V.f12595c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, h2.p] */
    public final Drawable mutate() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f12608Y && super.mutate() == this) {
            C1075p pVar = this.f12605V;
            ? constantState = new Drawable.ConstantState();
            constantState.f12595c = null;
            constantState.f12596d = f12604d0;
            if (pVar != null) {
                constantState.f12593a = pVar.f12593a;
                C1074o oVar = new C1074o(pVar.f12594b);
                constantState.f12594b = oVar;
                if (pVar.f12594b.e != null) {
                    oVar.e = new Paint(pVar.f12594b.e);
                }
                if (pVar.f12594b.f12583d != null) {
                    constantState.f12594b.f12583d = new Paint(pVar.f12594b.f12583d);
                }
                constantState.f12595c = pVar.f12595c;
                constantState.f12596d = pVar.f12596d;
                constantState.e = pVar.e;
            }
            this.f12605V = constantState;
            this.f12608Y = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1075p pVar = this.f12605V;
        ColorStateList colorStateList = pVar.f12595c;
        if (colorStateList == null || (mode = pVar.f12596d) == null) {
            z = false;
        } else {
            this.f12606W = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C1074o oVar = pVar.f12594b;
        if (oVar.f12591n == null) {
            oVar.f12591n = Boolean.valueOf(oVar.f12585g.a());
        }
        if (oVar.f12591n.booleanValue()) {
            boolean b8 = pVar.f12594b.f12585g.b(iArr);
            pVar.f12601k |= b8;
            if (b8) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f12605V.f12594b.getRootAlpha() != i) {
            this.f12605V.f12594b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f12605V.e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f12607X = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            e.w(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C1075p pVar = this.f12605V;
        if (pVar.f12595c != colorStateList) {
            pVar.f12595c = colorStateList;
            this.f12606W = a(colorStateList, pVar.f12596d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C1075p pVar = this.f12605V;
        if (pVar.f12596d != mode) {
            pVar.f12596d = mode;
            this.f12606W = a(pVar.f12595c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z6) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.setVisible(z, z6);
        }
        return super.setVisible(z, z6);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r9v13, types: [h2.k, h2.n, java.lang.Object] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i8;
        C1074o oVar;
        int i9;
        int i10;
        Paint.Cap cap;
        int i11;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.inflate(resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        C1075p pVar = this.f12605V;
        pVar.f12594b = new C1074o();
        TypedArray g8 = C1169b.g(resources2, theme2, attributeSet2, C1060a.f12533a);
        C1075p pVar2 = this.f12605V;
        C1074o oVar2 = pVar2.f12594b;
        if (!C1169b.d(xmlPullParser2, "tintMode")) {
            i = -1;
        } else {
            i = g8.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = 3;
        if (i == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i != 5) {
            if (i != 9) {
                switch (i) {
                    case EnterpriseDeviceManager.KNOX_2_3:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4_1:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        pVar2.f12596d = mode;
        ColorStateList colorStateList = null;
        if (C1169b.d(xmlPullParser2, "tint")) {
            TypedValue typedValue = new TypedValue();
            g8.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i13 < 28 || i13 > 31) {
                Resources resources3 = g8.getResources();
                int resourceId = g8.getResourceId(1, 0);
                ThreadLocal threadLocal = C1170c.f13067a;
                try {
                    colorStateList = C1170c.a(resources3, resources3.getXml(resourceId), theme2);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            pVar2.f12595c = colorStateList2;
        }
        boolean z = pVar2.e;
        if (C1169b.d(xmlPullParser2, "autoMirrored")) {
            z = g8.getBoolean(5, z);
        }
        pVar2.e = z;
        float f8 = oVar2.f12587j;
        if (C1169b.d(xmlPullParser2, "viewportWidth")) {
            f8 = g8.getFloat(7, f8);
        }
        oVar2.f12587j = f8;
        float f9 = oVar2.f12588k;
        if (C1169b.d(xmlPullParser2, "viewportHeight")) {
            f9 = g8.getFloat(8, f9);
        }
        oVar2.f12588k = f9;
        if (oVar2.f12587j <= 0.0f) {
            throw new XmlPullParserException(g8.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f9 > 0.0f) {
            oVar2.f12586h = g8.getDimension(3, oVar2.f12586h);
            float dimension = g8.getDimension(2, oVar2.i);
            oVar2.i = dimension;
            if (oVar2.f12586h <= 0.0f) {
                throw new XmlPullParserException(g8.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = oVar2.getAlpha();
                if (C1169b.d(xmlPullParser2, "alpha")) {
                    alpha = g8.getFloat(4, alpha);
                }
                oVar2.setAlpha(alpha);
                String string = g8.getString(0);
                if (string != null) {
                    oVar2.f12590m = string;
                    oVar2.f12592o.put(string, oVar2);
                }
                g8.recycle();
                pVar.f12593a = getChangingConfigurations();
                pVar.f12601k = true;
                C1075p pVar3 = this.f12605V;
                C1074o oVar3 = pVar3.f12594b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(oVar3.f12585g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                for (int i14 = 1; eventType != i14 && (xmlPullParser.getDepth() >= depth || eventType != i12); i14 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C1071l lVar = (C1071l) arrayDeque.peek();
                        if (lVar != null) {
                            boolean equals = "path".equals(name);
                            Y.e eVar = oVar3.f12592o;
                            ArrayList arrayList = lVar.f12568b;
                            oVar = oVar3;
                            if (equals) {
                                ? nVar = new C1073n();
                                nVar.e = 0.0f;
                                nVar.f12560g = 1.0f;
                                nVar.f12561h = 1.0f;
                                nVar.i = 0.0f;
                                nVar.f12562j = 1.0f;
                                nVar.f12563k = 0.0f;
                                Paint.Cap cap2 = Paint.Cap.BUTT;
                                nVar.f12564l = cap2;
                                Paint.Join join = Paint.Join.MITER;
                                nVar.f12565m = join;
                                i8 = depth;
                                nVar.f12566n = 4.0f;
                                TypedArray g9 = C1169b.g(resources2, theme2, attributeSet2, C1060a.f12535c);
                                if (C1169b.d(xmlPullParser2, "pathData")) {
                                    Paint.Cap cap3 = cap2;
                                    String string2 = g9.getString(0);
                                    if (string2 != null) {
                                        nVar.f12577b = string2;
                                    }
                                    String string3 = g9.getString(2);
                                    if (string3 != null) {
                                        nVar.f12576a = C0003d.l(string3);
                                    }
                                    nVar.f12559f = C1169b.b(g9, xmlPullParser2, theme2, "fillColor", 1);
                                    float f10 = nVar.f12561h;
                                    if (C1169b.d(xmlPullParser2, "fillAlpha")) {
                                        f10 = g9.getFloat(12, f10);
                                    }
                                    nVar.f12561h = f10;
                                    if (!C1169b.d(xmlPullParser2, "strokeLineCap")) {
                                        i10 = -1;
                                    } else {
                                        i10 = g9.getInt(8, -1);
                                    }
                                    Paint.Cap cap4 = nVar.f12564l;
                                    if (i10 != 0) {
                                        cap = i10 != 1 ? i10 != 2 ? cap4 : Paint.Cap.SQUARE : Paint.Cap.ROUND;
                                    } else {
                                        cap = cap3;
                                    }
                                    nVar.f12564l = cap;
                                    if (!C1169b.d(xmlPullParser2, "strokeLineJoin")) {
                                        i11 = -1;
                                    } else {
                                        i11 = g9.getInt(9, -1);
                                    }
                                    Paint.Join join2 = nVar.f12565m;
                                    if (i11 != 0) {
                                        Paint.Join join3 = join2;
                                        if (i11 == 1) {
                                            join = Paint.Join.ROUND;
                                        } else if (i11 != 2) {
                                            join = join3;
                                        } else {
                                            join = Paint.Join.BEVEL;
                                        }
                                    }
                                    nVar.f12565m = join;
                                    float f11 = nVar.f12566n;
                                    if (C1169b.d(xmlPullParser2, "strokeMiterLimit")) {
                                        f11 = g9.getFloat(10, f11);
                                    }
                                    nVar.f12566n = f11;
                                    nVar.f12558d = C1169b.b(g9, xmlPullParser2, theme2, "strokeColor", 3);
                                    float f12 = nVar.f12560g;
                                    if (C1169b.d(xmlPullParser2, "strokeAlpha")) {
                                        f12 = g9.getFloat(11, f12);
                                    }
                                    nVar.f12560g = f12;
                                    float f13 = nVar.e;
                                    if (C1169b.d(xmlPullParser2, "strokeWidth")) {
                                        f13 = g9.getFloat(4, f13);
                                    }
                                    nVar.e = f13;
                                    float f14 = nVar.f12562j;
                                    if (C1169b.d(xmlPullParser2, "trimPathEnd")) {
                                        f14 = g9.getFloat(6, f14);
                                    }
                                    nVar.f12562j = f14;
                                    float f15 = nVar.f12563k;
                                    if (C1169b.d(xmlPullParser2, "trimPathOffset")) {
                                        f15 = g9.getFloat(7, f15);
                                    }
                                    nVar.f12563k = f15;
                                    float f16 = nVar.i;
                                    if (C1169b.d(xmlPullParser2, "trimPathStart")) {
                                        f16 = g9.getFloat(5, f16);
                                    }
                                    nVar.i = f16;
                                    int i15 = nVar.f12578c;
                                    if (C1169b.d(xmlPullParser2, "fillType")) {
                                        i15 = g9.getInt(13, i15);
                                    }
                                    nVar.f12578c = i15;
                                }
                                g9.recycle();
                                arrayList.add(nVar);
                                if (nVar.getPathName() != null) {
                                    eVar.put(nVar.getPathName(), nVar);
                                }
                                pVar3.f12593a = pVar3.f12593a;
                                z6 = false;
                            } else {
                                i8 = depth;
                                if ("clip-path".equals(name)) {
                                    C1073n nVar2 = new C1073n();
                                    if (C1169b.d(xmlPullParser2, "pathData")) {
                                        TypedArray g10 = C1169b.g(resources2, theme2, attributeSet2, C1060a.f12536d);
                                        String string4 = g10.getString(0);
                                        if (string4 != null) {
                                            nVar2.f12577b = string4;
                                        }
                                        String string5 = g10.getString(1);
                                        if (string5 != null) {
                                            nVar2.f12576a = C0003d.l(string5);
                                        }
                                        if (!C1169b.d(xmlPullParser2, "fillType")) {
                                            i9 = 0;
                                        } else {
                                            i9 = g10.getInt(2, 0);
                                        }
                                        nVar2.f12578c = i9;
                                        g10.recycle();
                                    }
                                    arrayList.add(nVar2);
                                    if (nVar2.getPathName() != null) {
                                        eVar.put(nVar2.getPathName(), nVar2);
                                    }
                                    pVar3.f12593a = pVar3.f12593a;
                                } else if ("group".equals(name)) {
                                    C1071l lVar2 = new C1071l();
                                    TypedArray g11 = C1169b.g(resources2, theme2, attributeSet2, C1060a.f12534b);
                                    float f17 = lVar2.f12569c;
                                    if (C1169b.d(xmlPullParser2, "rotation")) {
                                        f17 = g11.getFloat(5, f17);
                                    }
                                    lVar2.f12569c = f17;
                                    lVar2.f12570d = g11.getFloat(1, lVar2.f12570d);
                                    lVar2.e = g11.getFloat(2, lVar2.e);
                                    float f18 = lVar2.f12571f;
                                    if (C1169b.d(xmlPullParser2, "scaleX")) {
                                        f18 = g11.getFloat(3, f18);
                                    }
                                    lVar2.f12571f = f18;
                                    float f19 = lVar2.f12572g;
                                    if (C1169b.d(xmlPullParser2, "scaleY")) {
                                        f19 = g11.getFloat(4, f19);
                                    }
                                    lVar2.f12572g = f19;
                                    float f20 = lVar2.f12573h;
                                    if (C1169b.d(xmlPullParser2, "translateX")) {
                                        f20 = g11.getFloat(6, f20);
                                    }
                                    lVar2.f12573h = f20;
                                    float f21 = lVar2.i;
                                    if (C1169b.d(xmlPullParser2, "translateY")) {
                                        f21 = g11.getFloat(7, f21);
                                    }
                                    lVar2.i = f21;
                                    String string6 = g11.getString(0);
                                    if (string6 != null) {
                                        lVar2.f12575k = string6;
                                    }
                                    lVar2.c();
                                    g11.recycle();
                                    arrayList.add(lVar2);
                                    arrayDeque.push(lVar2);
                                    if (lVar2.getGroupName() != null) {
                                        eVar.put(lVar2.getGroupName(), lVar2);
                                    }
                                    pVar3.f12593a = pVar3.f12593a;
                                }
                            }
                        } else {
                            oVar = oVar3;
                            i8 = depth;
                        }
                        i12 = 3;
                    } else {
                        oVar = oVar3;
                        i8 = depth;
                        i12 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    oVar3 = oVar;
                    depth = i8;
                }
                if (!z6) {
                    this.f12606W = a(pVar.f12595c, pVar.f12596d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(g8.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(g8.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public C1077r(C1075p pVar) {
        this.f12605V = pVar;
        this.f12606W = a(pVar.f12595c, pVar.f12596d);
    }
}
