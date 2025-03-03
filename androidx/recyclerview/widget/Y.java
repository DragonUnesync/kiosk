package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f8352a;

    /* renamed from: b  reason: collision with root package name */
    public int f8353b;

    /* renamed from: c  reason: collision with root package name */
    public Set f8354c;

    public final X a(int i) {
        SparseArray sparseArray = this.f8352a;
        X x8 = (X) sparseArray.get(i);
        if (x8 != null) {
            return x8;
        }
        X x9 = new X();
        sparseArray.put(i, x9);
        return x9;
    }
}
