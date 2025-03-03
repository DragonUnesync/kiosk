package G5;

import android.graphics.Rect;
import u.C1477r;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final q f1737a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1738b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1739c;

    /* renamed from: d  reason: collision with root package name */
    public Rect f1740d;
    public boolean e;

    public w(byte[] bArr, int i, int i8, int i9, int i10) {
        this.f1737a = new q(bArr, i, i8);
        this.f1739c = i10;
        this.f1738b = i9;
        if (i * i8 > bArr.length) {
            StringBuilder e8 = C1477r.e("Image data does not match the resolution. ", i, "x", i8, " > ");
            e8.append(bArr.length);
            throw new IllegalArgumentException(e8.toString());
        }
    }
}
