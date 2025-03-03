package h2;

import C3.m;
import E.e;
import O2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: h2.f  reason: case insensitive filesystem */
public final class C1065f extends C1068i implements Animatable {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f12549a0 = 0;

    /* renamed from: V  reason: collision with root package name */
    public final C1063d f12550V;

    /* renamed from: W  reason: collision with root package name */
    public final Context f12551W;

    /* renamed from: X  reason: collision with root package name */
    public m f12552X = null;

    /* renamed from: Y  reason: collision with root package name */
    public ArrayList f12553Y = null;

    /* renamed from: Z  reason: collision with root package name */
    public final C1062c f12554Z = new C1062c(this);

    /* JADX WARNING: type inference failed for: r2v1, types: [h2.d, android.graphics.drawable.Drawable$ConstantState] */
    public C1065f(Context context) {
        this.f12551W = context;
        this.f12550V = new Drawable.ConstantState();
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1063d dVar = this.f12550V;
        dVar.f12545a.draw(canvas);
        if (dVar.f12546b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f12550V.f12545a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f12550V.getClass();
        return changingConfigurations;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f12550V.f12545a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f12557U == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new b(1, this.f12557U.getConstantState());
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f12550V.f12545a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f12550V.f12545a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f12550V.f12545a.getOpacity();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: android.content.Context} */
    /* JADX WARNING: type inference failed for: r11v9, types: [Y.e, Y.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074 A[Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x007d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.content.res.Resources.Theme r27) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r27
            android.graphics.drawable.Drawable r0 = r1.f12557U
            if (r0 == 0) goto L_0x0012
            r5 = r25
            r0.inflate(r2, r5, r3, r4)
            return
        L_0x0012:
            r5 = r25
            int r0 = r25.getEventType()
            int r6 = r25.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001e:
            h2.d r8 = r1.f12550V
            if (r0 == r7) goto L_0x0188
            int r9 = r25.getDepth()
            if (r9 >= r6) goto L_0x002b
            r9 = 3
            if (r0 == r9) goto L_0x0188
        L_0x002b:
            r9 = 2
            if (r0 != r9) goto L_0x0182
            java.lang.String r0 = r25.getName()
            java.lang.String r10 = "animated-vector"
            boolean r10 = r10.equals(r0)
            r12 = 24
            r13 = 0
            if (r10 == 0) goto L_0x00b2
            int[] r0 = h2.C1060a.e
            android.content.res.TypedArray r10 = l0.C1169b.g(r2, r4, r3, r0)
            int r0 = r10.getResourceId(r13, r13)
            if (r0 == 0) goto L_0x00ad
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r12) goto L_0x005b
            h2.r r9 = new h2.r
            r9.<init>()
            java.lang.ThreadLocal r12 = l0.l.f13083a
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0, r4)
            r9.f12557U = r0
            goto L_0x0091
        L_0x005b:
            android.graphics.PorterDuff$Mode r12 = h2.C1077r.f12604d0
            java.lang.String r12 = "parser error"
            java.lang.String r14 = "VectorDrawableCompat"
            android.content.res.XmlResourceParser r0 = r2.getXml(r0)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }
            android.util.AttributeSet r15 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }
        L_0x0069:
            int r11 = r0.next()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }
            if (r11 == r9) goto L_0x0072
            if (r11 == r7) goto L_0x0072
            goto L_0x0069
        L_0x0072:
            if (r11 != r9) goto L_0x007d
            h2.r r9 = new h2.r     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }
            r9.inflate(r2, r0, r15, r4)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }
            goto L_0x0091
        L_0x007d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }
            java.lang.String r9 = "No start tag found"
            r0.<init>(r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            goto L_0x0089
        L_0x0087:
            r0 = move-exception
            goto L_0x008d
        L_0x0089:
            android.util.Log.e(r14, r12, r0)
            goto L_0x0090
        L_0x008d:
            android.util.Log.e(r14, r12, r0)
        L_0x0090:
            r9 = 0
        L_0x0091:
            if (r9 == 0) goto L_0x00a5
            r9.f12609Z = r13
            h2.c r0 = r1.f12554Z
            r9.setCallback(r0)
            h2.r r0 = r8.f12545a
            if (r0 == 0) goto L_0x00a2
            r11 = 0
            r0.setCallback(r11)
        L_0x00a2:
            r8.f12545a = r9
            goto L_0x00ad
        L_0x00a5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Failed to load drawable"
            r0.<init>(r2)
            throw r0
        L_0x00ad:
            r10.recycle()
            goto L_0x0182
        L_0x00b2:
            java.lang.String r9 = "target"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0182
            int[] r0 = h2.C1060a.f12537f
            android.content.res.TypedArray r0 = r2.obtainAttributes(r3, r0)
            java.lang.String r9 = r0.getString(r13)
            int r10 = r0.getResourceId(r7, r13)
            if (r10 == 0) goto L_0x017f
            android.content.Context r11 = r1.f12551W
            if (r11 == 0) goto L_0x0174
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r12) goto L_0x00d7
            android.animation.Animator r10 = android.animation.AnimatorInflater.loadAnimator(r11, r10)
            goto L_0x00fa
        L_0x00d7:
            android.content.res.Resources r12 = r11.getResources()
            android.content.res.Resources$Theme r18 = r11.getTheme()
            java.lang.String r13 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r14 = r12.getAnimation(r10)     // Catch:{ XmlPullParserException -> 0x0152, IOException -> 0x0134, all -> 0x0130 }
            android.util.AttributeSet r20 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x012d, IOException -> 0x012a, all -> 0x0127 }
            r21 = 0
            r22 = 0
            r16 = r11
            r17 = r12
            r19 = r14
            android.animation.Animator r10 = h2.C1060a.a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ XmlPullParserException -> 0x012d, IOException -> 0x012a, all -> 0x0127 }
            r14.close()
        L_0x00fa:
            h2.r r11 = r8.f12545a
            h2.p r11 = r11.f12605V
            h2.o r11 = r11.f12594b
            Y.e r11 = r11.f12592o
            java.lang.Object r11 = r11.get(r9)
            r10.setTarget(r11)
            java.util.ArrayList r11 = r8.f12547c
            if (r11 != 0) goto L_0x011c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r8.f12547c = r11
            Y.e r11 = new Y.e
            r12 = 0
            r11.<init>(r12)
            r8.f12548d = r11
        L_0x011c:
            java.util.ArrayList r11 = r8.f12547c
            r11.add(r10)
            Y.e r8 = r8.f12548d
            r8.put(r10, r9)
            goto L_0x017f
        L_0x0127:
            r0 = move-exception
            r11 = r14
            goto L_0x016e
        L_0x012a:
            r0 = move-exception
            r11 = r14
            goto L_0x0137
        L_0x012d:
            r0 = move-exception
            r11 = r14
            goto L_0x0155
        L_0x0130:
            r0 = move-exception
            r12 = 0
            r11 = r12
            goto L_0x016e
        L_0x0134:
            r0 = move-exception
            r12 = 0
            r11 = r12
        L_0x0137:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0150 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r3.<init>(r13)     // Catch:{ all -> 0x0150 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x0150 }
            r3.append(r4)     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0150 }
            r2.<init>(r3)     // Catch:{ all -> 0x0150 }
            r2.initCause(r0)     // Catch:{ all -> 0x0150 }
            throw r2     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            goto L_0x016e
        L_0x0152:
            r0 = move-exception
            r12 = 0
            r11 = r12
        L_0x0155:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0150 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r3.<init>(r13)     // Catch:{ all -> 0x0150 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x0150 }
            r3.append(r4)     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0150 }
            r2.<init>(r3)     // Catch:{ all -> 0x0150 }
            r2.initCause(r0)     // Catch:{ all -> 0x0150 }
            throw r2     // Catch:{ all -> 0x0150 }
        L_0x016e:
            if (r11 == 0) goto L_0x0173
            r11.close()
        L_0x0173:
            throw r0
        L_0x0174:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x017f:
            r0.recycle()
        L_0x0182:
            int r0 = r25.next()
            goto L_0x001e
        L_0x0188:
            android.animation.AnimatorSet r0 = r8.f12546b
            if (r0 != 0) goto L_0x0193
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r8.f12546b = r0
        L_0x0193:
            android.animation.AnimatorSet r0 = r8.f12546b
            java.util.ArrayList r2 = r8.f12547c
            r0.playTogether(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C1065f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f12550V.f12545a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f12550V.f12546b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f12550V.f12545a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f12550V.f12545a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f12550V.f12545a.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f12550V.f12545a.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f12550V.f12545a.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f12550V.f12545a.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f12550V.f12545a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            e.w(drawable, i);
        } else {
            this.f12550V.f12545a.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f12550V.f12545a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f12550V.f12545a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z6) {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            return drawable.setVisible(z, z6);
        }
        this.f12550V.f12545a.setVisible(z, z6);
        return super.setVisible(z, z6);
    }

    public final void start() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1063d dVar = this.f12550V;
        if (!dVar.f12546b.isStarted()) {
            dVar.f12546b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f12557U;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f12550V.f12546b.end();
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
