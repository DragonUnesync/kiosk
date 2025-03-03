package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f11437a;

    /* renamed from: b  reason: collision with root package name */
    public int f11438b;

    /* renamed from: c  reason: collision with root package name */
    public float f11439c;

    /* renamed from: d  reason: collision with root package name */
    public float f11440d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f11460f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f11439c = obtainStyledAttributes.getFloat(index, this.f11439c);
            } else if (index == 0) {
                int i8 = obtainStyledAttributes.getInt(index, this.f11437a);
                this.f11437a = i8;
                this.f11437a = l.f11452d[i8];
            } else if (index == 4) {
                this.f11438b = obtainStyledAttributes.getInt(index, this.f11438b);
            } else if (index == 3) {
                this.f11440d = obtainStyledAttributes.getFloat(index, this.f11440d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
