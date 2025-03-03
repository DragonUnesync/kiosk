package O0;

import P0.l;
import P0.z;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public final class b {

    /* renamed from: A  reason: collision with root package name */
    public static final String f3510A = Integer.toString(7, 36);

    /* renamed from: B  reason: collision with root package name */
    public static final String f3511B = Integer.toString(8, 36);

    /* renamed from: C  reason: collision with root package name */
    public static final String f3512C = Integer.toString(9, 36);

    /* renamed from: D  reason: collision with root package name */
    public static final String f3513D = Integer.toString(10, 36);

    /* renamed from: E  reason: collision with root package name */
    public static final String f3514E = Integer.toString(11, 36);

    /* renamed from: F  reason: collision with root package name */
    public static final String f3515F = Integer.toString(12, 36);

    /* renamed from: G  reason: collision with root package name */
    public static final String f3516G = Integer.toString(13, 36);

    /* renamed from: H  reason: collision with root package name */
    public static final String f3517H = Integer.toString(14, 36);

    /* renamed from: I  reason: collision with root package name */
    public static final String f3518I = Integer.toString(15, 36);

    /* renamed from: J  reason: collision with root package name */
    public static final String f3519J = Integer.toString(16, 36);

    /* renamed from: r  reason: collision with root package name */
    public static final String f3520r = Integer.toString(0, 36);

    /* renamed from: s  reason: collision with root package name */
    public static final String f3521s = Integer.toString(17, 36);

    /* renamed from: t  reason: collision with root package name */
    public static final String f3522t = Integer.toString(1, 36);

    /* renamed from: u  reason: collision with root package name */
    public static final String f3523u = Integer.toString(2, 36);

    /* renamed from: v  reason: collision with root package name */
    public static final String f3524v = Integer.toString(3, 36);

    /* renamed from: w  reason: collision with root package name */
    public static final String f3525w = Integer.toString(18, 36);

    /* renamed from: x  reason: collision with root package name */
    public static final String f3526x = Integer.toString(4, 36);

    /* renamed from: y  reason: collision with root package name */
    public static final String f3527y = Integer.toString(5, 36);
    public static final String z = Integer.toString(6, 36);

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f3528a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f3529b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f3530c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f3531d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3532f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3533g;

    /* renamed from: h  reason: collision with root package name */
    public final float f3534h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final float f3535j;

    /* renamed from: k  reason: collision with root package name */
    public final float f3536k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3537l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3538m;

    /* renamed from: n  reason: collision with root package name */
    public final int f3539n;

    /* renamed from: o  reason: collision with root package name */
    public final float f3540o;

    /* renamed from: p  reason: collision with root package name */
    public final int f3541p;

    /* renamed from: q  reason: collision with root package name */
    public final float f3542q;

    static {
        new b("", (Layout.Alignment) null, (Layout.Alignment) null, (Bitmap) null, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f);
        int i8 = z.f3748a;
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f8, int i8, int i9, float f9, int i10, int i11, float f10, float f11, float f12, boolean z6, int i12, int i13, float f13) {
        boolean z8;
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            bitmap.getClass();
        } else {
            if (bitmap2 == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            l.d(z8);
        }
        if (charSequence2 instanceof Spanned) {
            this.f3528a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f3528a = charSequence.toString();
        } else {
            this.f3528a = null;
        }
        this.f3529b = alignment;
        this.f3530c = alignment2;
        this.f3531d = bitmap2;
        this.e = f8;
        this.f3532f = i8;
        this.f3533g = i9;
        this.f3534h = f9;
        this.i = i10;
        this.f3535j = f11;
        this.f3536k = f12;
        this.f3537l = z6;
        this.f3538m = i12;
        this.f3539n = i11;
        this.f3540o = f10;
        this.f3541p = i13;
        this.f3542q = f13;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [O0.a, java.lang.Object] */
    public final a a() {
        ? obj = new Object();
        obj.f3495a = this.f3528a;
        obj.f3496b = this.f3531d;
        obj.f3497c = this.f3529b;
        obj.f3498d = this.f3530c;
        obj.e = this.e;
        obj.f3499f = this.f3532f;
        obj.f3500g = this.f3533g;
        obj.f3501h = this.f3534h;
        obj.i = this.i;
        obj.f3502j = this.f3539n;
        obj.f3503k = this.f3540o;
        obj.f3504l = this.f3535j;
        obj.f3505m = this.f3536k;
        obj.f3506n = this.f3537l;
        obj.f3507o = this.f3538m;
        obj.f3508p = this.f3541p;
        obj.f3509q = this.f3542q;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f3528a, bVar.f3528a) && this.f3529b == bVar.f3529b && this.f3530c == bVar.f3530c) {
            Bitmap bitmap = bVar.f3531d;
            Bitmap bitmap2 = this.f3531d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.e == bVar.e && this.f3532f == bVar.f3532f && this.f3533g == bVar.f3533g && this.f3534h == bVar.f3534h && this.i == bVar.i && this.f3535j == bVar.f3535j && this.f3536k == bVar.f3536k && this.f3537l == bVar.f3537l && this.f3538m == bVar.f3538m && this.f3539n == bVar.f3539n && this.f3540o == bVar.f3540o && this.f3541p == bVar.f3541p && this.f3542q == bVar.f3542q) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Float valueOf = Float.valueOf(this.e);
        Integer valueOf2 = Integer.valueOf(this.f3532f);
        Integer valueOf3 = Integer.valueOf(this.f3533g);
        Float valueOf4 = Float.valueOf(this.f3534h);
        Integer valueOf5 = Integer.valueOf(this.i);
        Float valueOf6 = Float.valueOf(this.f3535j);
        Float valueOf7 = Float.valueOf(this.f3536k);
        Boolean valueOf8 = Boolean.valueOf(this.f3537l);
        Integer valueOf9 = Integer.valueOf(this.f3538m);
        Integer valueOf10 = Integer.valueOf(this.f3539n);
        Float valueOf11 = Float.valueOf(this.f3540o);
        Integer valueOf12 = Integer.valueOf(this.f3541p);
        Float valueOf13 = Float.valueOf(this.f3542q);
        Float f8 = valueOf13;
        Integer num = valueOf12;
        return Arrays.hashCode(new Object[]{this.f3528a, this.f3529b, this.f3530c, this.f3531d, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, num, f8});
    }
}
