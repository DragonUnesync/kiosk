package j;

import C0.e;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import h2.C1062c;

public abstract class f extends Drawable implements Drawable.Callback {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f12810g0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public b f12811U;

    /* renamed from: V  reason: collision with root package name */
    public Rect f12812V;

    /* renamed from: W  reason: collision with root package name */
    public Drawable f12813W;

    /* renamed from: X  reason: collision with root package name */
    public Drawable f12814X;

    /* renamed from: Y  reason: collision with root package name */
    public int f12815Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f12816Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f12817a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f12818b0;

    /* renamed from: c0  reason: collision with root package name */
    public e f12819c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f12820d0;

    /* renamed from: e0  reason: collision with root package name */
    public long f12821e0;

    /* renamed from: f0  reason: collision with root package name */
    public C1062c f12822f0;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f12816Z = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f12813W
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f12820d0
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f12815Y
            r3.setAlpha(r9)
            r13.f12820d0 = r6
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            j.b r9 = r13.f12811U
            int r9 = r9.f12797y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f12815Y
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f12820d0 = r6
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f12814X
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f12821e0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f12814X = r0
            r13.f12821e0 = r6
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            j.b r4 = r13.f12811U
            int r4 = r4.z
            int r3 = r3 / r4
            int r4 = r13.f12815Y
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f12821e0 = r6
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            C0.e r14 = r13.f12819c0
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f12811U;
        if (theme != null) {
            bVar.c();
            int i = bVar.f12781h;
            Drawable[] drawableArr = bVar.f12780g;
            for (int i8 = 0; i8 < i; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i8].applyTheme(theme);
                    bVar.e |= drawableArr[i8].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f12776b = resources;
                int i9 = resources.getDisplayMetrics().densityDpi;
                if (i9 == 0) {
                    i9 = 160;
                }
                int i10 = bVar.f12777c;
                bVar.f12777c = i9;
                if (i10 != i9) {
                    bVar.f12785m = false;
                    bVar.f12782j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f12822f0 == null) {
            this.f12822f0 = new C1062c();
        }
        C1062c cVar = this.f12822f0;
        cVar.f12544V = drawable.getCallback();
        drawable.setCallback(cVar);
        try {
            if (this.f12811U.f12797y <= 0 && this.f12816Z) {
                drawable.setAlpha(this.f12815Y);
            }
            b bVar = this.f12811U;
            if (bVar.f12767C) {
                drawable.setColorFilter(bVar.f12766B);
            } else {
                if (bVar.f12770F) {
                    drawable.setTintList(bVar.f12768D);
                }
                b bVar2 = this.f12811U;
                if (bVar2.f12771G) {
                    drawable.setTintMode(bVar2.f12769E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f12811U.f12795w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                E.e.v(drawable, E.e.q(this));
            }
            drawable.setAutoMirrored(this.f12811U.f12765A);
            Rect rect = this.f12812V;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            C1062c cVar2 = this.f12822f0;
            cVar2.f12544V = null;
            drawable.setCallback((Drawable.Callback) cVar2.f12544V);
        } catch (Throwable th) {
            C1062c cVar3 = this.f12822f0;
            cVar3.f12544V = null;
            drawable.setCallback((Drawable.Callback) cVar3.f12544V);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.f12817a0
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            j.b r0 = r9.f12811U
            int r0 = r0.z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f12814X
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f12813W
            if (r0 == 0) goto L_0x0029
            r9.f12814X = r0
            j.b r0 = r9.f12811U
            int r0 = r0.z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f12821e0 = r0
            goto L_0x0035
        L_0x0029:
            r9.f12814X = r4
            r9.f12821e0 = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f12813W
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            j.b r0 = r9.f12811U
            int r1 = r0.f12781h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f12813W = r0
            r9.f12817a0 = r10
            if (r0 == 0) goto L_0x005a
            j.b r10 = r9.f12811U
            int r10 = r10.f12797y
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f12820d0 = r2
        L_0x0051:
            r9.b(r0)
            goto L_0x005a
        L_0x0055:
            r9.f12813W = r4
            r10 = -1
            r9.f12817a0 = r10
        L_0x005a:
            long r0 = r9.f12820d0
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f12821e0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x007e
        L_0x0067:
            C0.e r0 = r9.f12819c0
            if (r0 != 0) goto L_0x0078
            C0.e r0 = new C0.e
            r1 = r9
            j.e r1 = (j.e) r1
            r2 = 20
            r0.<init>(r2, r1)
            r9.f12819c0 = r0
            goto L_0x007b
        L_0x0078:
            r9.unscheduleSelf(r0)
        L_0x007b:
            r9.a(r10)
        L_0x007e:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.c(int):boolean");
    }

    public final boolean canApplyTheme() {
        return this.f12811U.canApplyTheme();
    }

    public abstract void d(b bVar);

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f12813W;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f12814X;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final int getAlpha() {
        return this.f12815Y;
    }

    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f12811U.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        boolean z;
        b bVar = this.f12811U;
        if (!bVar.f12793u) {
            bVar.c();
            bVar.f12793u = true;
            int i = bVar.f12781h;
            Drawable[] drawableArr = bVar.f12780g;
            int i8 = 0;
            while (true) {
                if (i8 >= i) {
                    bVar.f12794v = true;
                    z = true;
                    break;
                } else if (drawableArr[i8].getConstantState() == null) {
                    bVar.f12794v = false;
                    z = false;
                    break;
                } else {
                    i8++;
                }
            }
        } else {
            z = bVar.f12794v;
        }
        if (!z) {
            return null;
        }
        this.f12811U.f12778d = getChangingConfigurations();
        return this.f12811U;
    }

    public final Drawable getCurrent() {
        return this.f12813W;
    }

    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f12812V;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public final int getIntrinsicHeight() {
        b bVar = this.f12811U;
        if (bVar.f12784l) {
            if (!bVar.f12785m) {
                bVar.b();
            }
            return bVar.f12787o;
        }
        Drawable drawable = this.f12813W;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        b bVar = this.f12811U;
        if (bVar.f12784l) {
            if (!bVar.f12785m) {
                bVar.b();
            }
            return bVar.f12786n;
        }
        Drawable drawable = this.f12813W;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public final int getMinimumHeight() {
        b bVar = this.f12811U;
        if (bVar.f12784l) {
            if (!bVar.f12785m) {
                bVar.b();
            }
            return bVar.f12789q;
        }
        Drawable drawable = this.f12813W;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public final int getMinimumWidth() {
        b bVar = this.f12811U;
        if (bVar.f12784l) {
            if (!bVar.f12785m) {
                bVar.b();
            }
            return bVar.f12788p;
        }
        Drawable drawable = this.f12813W;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public final int getOpacity() {
        Drawable drawable = this.f12813W;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        b bVar = this.f12811U;
        if (bVar.f12790r) {
            return bVar.f12791s;
        }
        bVar.c();
        int i8 = bVar.f12781h;
        Drawable[] drawableArr = bVar.f12780g;
        if (i8 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i9 = 1; i9 < i8; i9++) {
            i = Drawable.resolveOpacity(i, drawableArr[i9].getOpacity());
        }
        bVar.f12791s = i;
        bVar.f12790r = true;
        return i;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable = this.f12813W;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public final boolean getPadding(Rect rect) {
        b bVar = this.f12811U;
        boolean z = false;
        Rect rect2 = null;
        if (!bVar.i) {
            Rect rect3 = bVar.f12783k;
            if (rect3 != null || bVar.f12782j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i = bVar.f12781h;
                Drawable[] drawableArr = bVar.f12780g;
                for (int i8 = 0; i8 < i; i8++) {
                    if (drawableArr[i8].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i9 = rect4.left;
                        if (i9 > rect2.left) {
                            rect2.left = i9;
                        }
                        int i10 = rect4.top;
                        if (i10 > rect2.top) {
                            rect2.top = i10;
                        }
                        int i11 = rect4.right;
                        if (i11 > rect2.right) {
                            rect2.right = i11;
                        }
                        int i12 = rect4.bottom;
                        if (i12 > rect2.bottom) {
                            rect2.bottom = i12;
                        }
                    }
                }
                bVar.f12782j = true;
                bVar.f12783k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.f12813W;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (this.f12811U.f12765A && E.e.q(this) == 1) {
            int i13 = rect.left;
            rect.left = rect.right;
            rect.right = i13;
        }
        return z;
    }

    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f12811U;
        if (bVar != null) {
            bVar.f12790r = false;
            bVar.f12792t = false;
        }
        if (drawable == this.f12813W && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final boolean isAutoMirrored() {
        return this.f12811U.f12765A;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f12814X;
        boolean z6 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f12814X = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f12813W;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f12816Z) {
                this.f12813W.setAlpha(this.f12815Y);
            }
        }
        if (this.f12821e0 != 0) {
            this.f12821e0 = 0;
            z = true;
        }
        if (this.f12820d0 != 0) {
            this.f12820d0 = 0;
        } else {
            z6 = z;
        }
        if (z6) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f12818b0 && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.f12805j0, eVar, (Resources) null);
            bVar.f12773I = bVar.f12773I.clone();
            bVar.f12774J = bVar.f12774J.clone();
            d(bVar);
            this.f12818b0 = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12814X;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f12813W;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean z;
        b bVar = this.f12811U;
        int i8 = this.f12817a0;
        int i9 = bVar.f12781h;
        Drawable[] drawableArr = bVar.f12780g;
        boolean z6 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = E.e.v(drawable, i);
                } else {
                    z = false;
                }
                if (i10 == i8) {
                    z6 = z;
                }
            }
        }
        bVar.f12796x = i;
        return z6;
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f12814X;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f12813W;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        if (drawable == this.f12813W && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j7);
        }
    }

    public final void setAlpha(int i) {
        if (!this.f12816Z || this.f12815Y != i) {
            this.f12816Z = true;
            this.f12815Y = i;
            Drawable drawable = this.f12813W;
            if (drawable == null) {
                return;
            }
            if (this.f12820d0 == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    public final void setAutoMirrored(boolean z) {
        b bVar = this.f12811U;
        if (bVar.f12765A != z) {
            bVar.f12765A = z;
            Drawable drawable = this.f12813W;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f12811U;
        bVar.f12767C = true;
        if (bVar.f12766B != colorFilter) {
            bVar.f12766B = colorFilter;
            Drawable drawable = this.f12813W;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public final void setDither(boolean z) {
        b bVar = this.f12811U;
        if (bVar.f12795w != z) {
            bVar.f12795w = z;
            Drawable drawable = this.f12813W;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public final void setHotspot(float f8, float f9) {
        Drawable drawable = this.f12813W;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
    }

    public final void setHotspotBounds(int i, int i8, int i9, int i10) {
        Rect rect = this.f12812V;
        if (rect == null) {
            this.f12812V = new Rect(i, i8, i9, i10);
        } else {
            rect.set(i, i8, i9, i10);
        }
        Drawable drawable = this.f12813W;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i8, i9, i10);
        }
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f12811U;
        bVar.f12770F = true;
        if (bVar.f12768D != colorStateList) {
            bVar.f12768D = colorStateList;
            this.f12813W.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f12811U;
        bVar.f12771G = true;
        if (bVar.f12769E != mode) {
            bVar.f12769E = mode;
            this.f12813W.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z6) {
        boolean visible = super.setVisible(z, z6);
        Drawable drawable = this.f12814X;
        if (drawable != null) {
            drawable.setVisible(z, z6);
        }
        Drawable drawable2 = this.f12813W;
        if (drawable2 != null) {
            drawable2.setVisible(z, z6);
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f12813W && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
