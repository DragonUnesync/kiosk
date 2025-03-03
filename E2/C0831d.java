package e2;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: e2.d  reason: case insensitive filesystem */
public final class C0831d {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f11169a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f11170b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f11171c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f11172d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public float f11173f;

    /* renamed from: g  reason: collision with root package name */
    public float f11174g;

    /* renamed from: h  reason: collision with root package name */
    public float f11175h;
    public int[] i;

    /* renamed from: j  reason: collision with root package name */
    public int f11176j;

    /* renamed from: k  reason: collision with root package name */
    public float f11177k;

    /* renamed from: l  reason: collision with root package name */
    public float f11178l;

    /* renamed from: m  reason: collision with root package name */
    public float f11179m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11180n;

    /* renamed from: o  reason: collision with root package name */
    public Path f11181o;

    /* renamed from: p  reason: collision with root package name */
    public float f11182p;

    /* renamed from: q  reason: collision with root package name */
    public float f11183q;

    /* renamed from: r  reason: collision with root package name */
    public int f11184r;

    /* renamed from: s  reason: collision with root package name */
    public int f11185s;

    /* renamed from: t  reason: collision with root package name */
    public int f11186t;

    /* renamed from: u  reason: collision with root package name */
    public int f11187u;

    public C0831d() {
        Paint paint = new Paint();
        this.f11170b = paint;
        Paint paint2 = new Paint();
        this.f11171c = paint2;
        Paint paint3 = new Paint();
        this.f11172d = paint3;
        this.e = 0.0f;
        this.f11173f = 0.0f;
        this.f11174g = 0.0f;
        this.f11175h = 5.0f;
        this.f11182p = 1.0f;
        this.f11186t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i8) {
        this.f11176j = i8;
        this.f11187u = this.i[i8];
    }
}
