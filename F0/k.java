package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public final class k {

    /* renamed from: m  reason: collision with root package name */
    public static final SparseIntArray f11441m;

    /* renamed from: a  reason: collision with root package name */
    public float f11442a;

    /* renamed from: b  reason: collision with root package name */
    public float f11443b;

    /* renamed from: c  reason: collision with root package name */
    public float f11444c;

    /* renamed from: d  reason: collision with root package name */
    public float f11445d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public float f11446f;

    /* renamed from: g  reason: collision with root package name */
    public float f11447g;

    /* renamed from: h  reason: collision with root package name */
    public float f11448h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public float f11449j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11450k;

    /* renamed from: l  reason: collision with root package name */
    public float f11451l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11441m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f11462h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            switch (f11441m.get(index)) {
                case 1:
                    this.f11442a = obtainStyledAttributes.getFloat(index, this.f11442a);
                    break;
                case 2:
                    this.f11443b = obtainStyledAttributes.getFloat(index, this.f11443b);
                    break;
                case 3:
                    this.f11444c = obtainStyledAttributes.getFloat(index, this.f11444c);
                    break;
                case 4:
                    this.f11445d = obtainStyledAttributes.getFloat(index, this.f11445d);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.f11446f = obtainStyledAttributes.getDimension(index, this.f11446f);
                    break;
                case 7:
                    this.f11447g = obtainStyledAttributes.getDimension(index, this.f11447g);
                    break;
                case 8:
                    this.f11448h = obtainStyledAttributes.getDimension(index, this.f11448h);
                    break;
                case 9:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 10:
                    this.f11449j = obtainStyledAttributes.getDimension(index, this.f11449j);
                    break;
                case 11:
                    this.f11450k = true;
                    this.f11451l = obtainStyledAttributes.getDimension(index, this.f11451l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
