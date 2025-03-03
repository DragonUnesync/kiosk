package z3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import s3.C1404a;

public class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public k f16454a;

    /* renamed from: b  reason: collision with root package name */
    public C1404a f16455b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f16456c = null;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f16457d = null;
    public ColorStateList e = null;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f16458f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public Rect f16459g = null;

    /* renamed from: h  reason: collision with root package name */
    public final float f16460h = 1.0f;
    public float i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f16461j;

    /* renamed from: k  reason: collision with root package name */
    public int f16462k = 255;

    /* renamed from: l  reason: collision with root package name */
    public float f16463l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f16464m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public int f16465n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f16466o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Paint.Style f16467p = Paint.Style.FILL_AND_STROKE;

    public f(k kVar) {
        this.f16454a = kVar;
        this.f16455b = null;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f16473Y = true;
        return gVar;
    }

    public f(f fVar) {
        this.f16454a = fVar.f16454a;
        this.f16455b = fVar.f16455b;
        this.f16461j = fVar.f16461j;
        this.f16456c = fVar.f16456c;
        this.f16457d = fVar.f16457d;
        this.f16458f = fVar.f16458f;
        this.e = fVar.e;
        this.f16462k = fVar.f16462k;
        this.f16460h = fVar.f16460h;
        this.f16466o = fVar.f16466o;
        this.i = fVar.i;
        this.f16463l = fVar.f16463l;
        this.f16464m = fVar.f16464m;
        this.f16465n = fVar.f16465n;
        this.f16467p = fVar.f16467p;
        if (fVar.f16459g != null) {
            this.f16459g = new Rect(fVar.f16459g);
        }
    }
}
