package O2;

import W2.f;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

public final class c extends Drawable implements f, Animatable {

    /* renamed from: U  reason: collision with root package name */
    public final b f3610U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f3611V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f3612W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f3613X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f3614Y = true;

    /* renamed from: Z  reason: collision with root package name */
    public int f3615Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f3616a0 = -1;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f3617b0;

    /* renamed from: c0  reason: collision with root package name */
    public Paint f3618c0;

    /* renamed from: d0  reason: collision with root package name */
    public Rect f3619d0;

    public c(b bVar) {
        f.c(bVar, "Argument must not be null");
        this.f3610U = bVar;
    }

    public final void a() {
        f.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f3613X);
        g gVar = (g) this.f3610U.f3609b;
        if (gVar.f3625a.f68l.f48c == 1) {
            invalidateSelf();
        } else if (!this.f3611V) {
            this.f3611V = true;
            if (!gVar.f3632j) {
                ArrayList arrayList = gVar.f3627c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !gVar.f3629f) {
                        gVar.f3629f = true;
                        gVar.f3632j = false;
                        gVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f3613X) {
            if (this.f3617b0) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f3619d0 == null) {
                    this.f3619d0 = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f3619d0);
                this.f3617b0 = false;
            }
            g gVar = (g) this.f3610U.f3609b;
            e eVar = gVar.i;
            if (eVar != null) {
                bitmap = eVar.f3624a0;
            } else {
                bitmap = gVar.f3634l;
            }
            if (this.f3619d0 == null) {
                this.f3619d0 = new Rect();
            }
            Rect rect = this.f3619d0;
            if (this.f3618c0 == null) {
                this.f3618c0 = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f3618c0);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f3610U;
    }

    public final int getIntrinsicHeight() {
        return ((g) this.f3610U.f3609b).f3638p;
    }

    public final int getIntrinsicWidth() {
        return ((g) this.f3610U.f3609b).f3637o;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f3611V;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3617b0 = true;
    }

    public final void setAlpha(int i) {
        if (this.f3618c0 == null) {
            this.f3618c0 = new Paint(2);
        }
        this.f3618c0.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f3618c0 == null) {
            this.f3618c0 = new Paint(2);
        }
        this.f3618c0.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z6) {
        f.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f3613X);
        this.f3614Y = z;
        if (!z) {
            this.f3611V = false;
            g gVar = (g) this.f3610U.f3609b;
            ArrayList arrayList = gVar.f3627c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gVar.f3629f = false;
            }
        } else if (this.f3612W) {
            a();
        }
        return super.setVisible(z, z6);
    }

    public final void start() {
        this.f3612W = true;
        this.f3615Z = 0;
        if (this.f3614Y) {
            a();
        }
    }

    public final void stop() {
        this.f3612W = false;
        this.f3611V = false;
        g gVar = (g) this.f3610U.f3609b;
        ArrayList arrayList = gVar.f3627c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gVar.f3629f = false;
        }
    }
}
