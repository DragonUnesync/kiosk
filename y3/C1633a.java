package y3;

import android.graphics.Paint;
import android.graphics.Path;
import m0.C1195a;

/* renamed from: y3.a  reason: case insensitive filesystem */
public final class C1633a {
    public static final int[] i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f16383j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f16384k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f16385l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f16386a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f16387b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f16388c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16389d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16390f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f16391g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f16392h;

    public C1633a() {
        Paint paint = new Paint();
        this.f16392h = paint;
        Paint paint2 = new Paint();
        this.f16386a = paint2;
        this.f16389d = C1195a.d(-16777216, 68);
        this.e = C1195a.d(-16777216, 20);
        this.f16390f = C1195a.d(-16777216, 0);
        paint2.setColor(this.f16389d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f16387b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f16388c = new Paint(paint3);
    }
}
