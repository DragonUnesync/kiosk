package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import b0.C0519a;

/* renamed from: f0.i  reason: case insensitive filesystem */
public final class C0881i {
    public static final SparseIntArray e;

    /* renamed from: a  reason: collision with root package name */
    public int f11433a;

    /* renamed from: b  reason: collision with root package name */
    public int f11434b;

    /* renamed from: c  reason: collision with root package name */
    public float f11435c;

    /* renamed from: d  reason: collision with root package name */
    public float f11436d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (e.get(index)) {
                case 1:
                    this.f11436d = obtainStyledAttributes.getFloat(index, this.f11436d);
                    break;
                case 2:
                    this.f11434b = obtainStyledAttributes.getInt(index, this.f11434b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        String str = C0519a.f8607a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f11433a = l.f(obtainStyledAttributes, index, this.f11433a);
                    break;
                case 6:
                    this.f11435c = obtainStyledAttributes.getFloat(index, this.f11435c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
