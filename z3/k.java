package z3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import f3.C0899a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public c f16501a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public c f16502b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public c f16503c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public c f16504d = new Object();
    public c e = new C1646a(0.0f);

    /* renamed from: f  reason: collision with root package name */
    public c f16505f = new C1646a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    public c f16506g = new C1646a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public c f16507h = new C1646a(0.0f);
    public e i = new e(0);

    /* renamed from: j  reason: collision with root package name */
    public e f16508j = new e(0);

    /* renamed from: k  reason: collision with root package name */
    public e f16509k = new e(0);

    /* renamed from: l  reason: collision with root package name */
    public e f16510l = new e(0);

    public static j a(Context context, int i8, int i9, C1646a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i8);
        if (i9 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i9);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C0899a.f11668v);
        try {
            int i10 = obtainStyledAttributes.getInt(0, 0);
            int i11 = obtainStyledAttributes.getInt(3, i10);
            int i12 = obtainStyledAttributes.getInt(4, i10);
            int i13 = obtainStyledAttributes.getInt(2, i10);
            int i14 = obtainStyledAttributes.getInt(1, i10);
            c c8 = c(obtainStyledAttributes, 5, aVar);
            c c9 = c(obtainStyledAttributes, 8, c8);
            c c10 = c(obtainStyledAttributes, 9, c8);
            c c11 = c(obtainStyledAttributes, 7, c8);
            c c12 = c(obtainStyledAttributes, 6, c8);
            j jVar = new j();
            c e8 = d.e(i11);
            jVar.f16491a = e8;
            j.b(e8);
            jVar.e = c9;
            c e9 = d.e(i12);
            jVar.f16492b = e9;
            j.b(e9);
            jVar.f16495f = c10;
            c e10 = d.e(i13);
            jVar.f16493c = e10;
            j.b(e10);
            jVar.f16496g = c11;
            c e11 = d.e(i14);
            jVar.f16494d = e11;
            j.b(e11);
            jVar.f16497h = c12;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i8, int i9) {
        C1646a aVar = new C1646a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0899a.f11662p, i8, i9);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i8, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i8);
        if (peekValue == null) {
            return cVar;
        }
        int i9 = peekValue.type;
        if (i9 == 5) {
            return new C1646a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i9 == 6) {
            return new h(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z;
        boolean z6;
        boolean z8;
        Class<e> cls = e.class;
        if (!this.f16510l.getClass().equals(cls) || !this.f16508j.getClass().equals(cls) || !this.i.getClass().equals(cls) || !this.f16509k.getClass().equals(cls)) {
            z = false;
        } else {
            z = true;
        }
        float a8 = this.e.a(rectF);
        if (this.f16505f.a(rectF) == a8 && this.f16507h.a(rectF) == a8 && this.f16506g.a(rectF) == a8) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!(this.f16502b instanceof i) || !(this.f16501a instanceof i) || !(this.f16503c instanceof i) || !(this.f16504d instanceof i)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!z || !z6 || !z8) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, z3.j] */
    public final j e() {
        ? obj = new Object();
        obj.f16491a = this.f16501a;
        obj.f16492b = this.f16502b;
        obj.f16493c = this.f16503c;
        obj.f16494d = this.f16504d;
        obj.e = this.e;
        obj.f16495f = this.f16505f;
        obj.f16496g = this.f16506g;
        obj.f16497h = this.f16507h;
        obj.i = this.i;
        obj.f16498j = this.f16508j;
        obj.f16499k = this.f16509k;
        obj.f16500l = this.f16510l;
        return obj;
    }
}
