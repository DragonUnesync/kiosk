package Y1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

public final class G {

    /* renamed from: A  reason: collision with root package name */
    public int f6333A;

    /* renamed from: B  reason: collision with root package name */
    public int f6334B;

    /* renamed from: C  reason: collision with root package name */
    public int f6335C;

    /* renamed from: D  reason: collision with root package name */
    public int f6336D;

    /* renamed from: E  reason: collision with root package name */
    public StaticLayout f6337E;

    /* renamed from: F  reason: collision with root package name */
    public StaticLayout f6338F;

    /* renamed from: G  reason: collision with root package name */
    public int f6339G;

    /* renamed from: H  reason: collision with root package name */
    public int f6340H;

    /* renamed from: I  reason: collision with root package name */
    public int f6341I;

    /* renamed from: J  reason: collision with root package name */
    public Rect f6342J;

    /* renamed from: a  reason: collision with root package name */
    public final float f6343a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6344b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6345c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6346d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final TextPaint f6347f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f6348g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f6349h;
    public CharSequence i;

    /* renamed from: j  reason: collision with root package name */
    public Layout.Alignment f6350j;

    /* renamed from: k  reason: collision with root package name */
    public Bitmap f6351k;

    /* renamed from: l  reason: collision with root package name */
    public float f6352l;

    /* renamed from: m  reason: collision with root package name */
    public int f6353m;

    /* renamed from: n  reason: collision with root package name */
    public int f6354n;

    /* renamed from: o  reason: collision with root package name */
    public float f6355o;

    /* renamed from: p  reason: collision with root package name */
    public int f6356p;

    /* renamed from: q  reason: collision with root package name */
    public float f6357q;

    /* renamed from: r  reason: collision with root package name */
    public float f6358r;

    /* renamed from: s  reason: collision with root package name */
    public int f6359s;

    /* renamed from: t  reason: collision with root package name */
    public int f6360t;

    /* renamed from: u  reason: collision with root package name */
    public int f6361u;

    /* renamed from: v  reason: collision with root package name */
    public int f6362v;

    /* renamed from: w  reason: collision with root package name */
    public int f6363w;

    /* renamed from: x  reason: collision with root package name */
    public float f6364x;

    /* renamed from: y  reason: collision with root package name */
    public float f6365y;
    public float z;

    public G(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6346d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f6343a = round;
        this.f6344b = round;
        this.f6345c = round;
        TextPaint textPaint = new TextPaint();
        this.f6347f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f6348g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f6349h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z6) {
        int i8;
        if (z6) {
            StaticLayout staticLayout = this.f6337E;
            StaticLayout staticLayout2 = this.f6338F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate((float) this.f6339G, (float) this.f6340H);
                if (Color.alpha(this.f6361u) > 0) {
                    Paint paint = this.f6348g;
                    paint.setColor(this.f6361u);
                    canvas.drawRect((float) (-this.f6341I), 0.0f, (float) (staticLayout.getWidth() + this.f6341I), (float) staticLayout.getHeight(), paint);
                }
                int i9 = this.f6363w;
                TextPaint textPaint = this.f6347f;
                boolean z8 = true;
                if (i9 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.f6343a);
                    textPaint.setColor(this.f6362v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f8 = this.f6344b;
                    if (i9 == 2) {
                        float f9 = this.f6345c;
                        textPaint.setShadowLayer(f8, f9, f9, this.f6362v);
                    } else if (i9 == 3 || i9 == 4) {
                        if (i9 != 3) {
                            z8 = false;
                        }
                        int i10 = -1;
                        if (z8) {
                            i8 = -1;
                        } else {
                            i8 = this.f6362v;
                        }
                        if (z8) {
                            i10 = this.f6362v;
                        }
                        float f10 = f8 / 2.0f;
                        textPaint.setColor(this.f6359s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f11 = -f10;
                        textPaint.setShadowLayer(f8, f11, f11, i8);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f8, f10, f10, i10);
                    }
                }
                textPaint.setColor(this.f6359s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.f6342J.getClass();
        this.f6351k.getClass();
        canvas.drawBitmap(this.f6351k, (Rect) null, this.f6342J, this.f6349h);
    }
}
