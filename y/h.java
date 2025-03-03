package Y;

import P6.f;
import Z.a;
import java.util.ConcurrentModificationException;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f6304a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f6305b = new Object();

    public static final void a(f fVar, int i) {
        f.e(fVar, "<this>");
        fVar.f6297U = new int[i];
        fVar.f6298V = new Object[i];
    }

    public static final int b(f fVar, Object obj, int i) {
        f.e(fVar, "<this>");
        int i8 = fVar.f6299W;
        if (i8 == 0) {
            return -1;
        }
        try {
            int a8 = a.a(fVar.f6299W, i, fVar.f6297U);
            if (a8 < 0 || f.a(obj, fVar.f6298V[a8])) {
                return a8;
            }
            int i9 = a8 + 1;
            while (i9 < i8 && fVar.f6297U[i9] == i) {
                if (f.a(obj, fVar.f6298V[i9])) {
                    return i9;
                }
                i9++;
            }
            int i10 = a8 - 1;
            while (i10 >= 0 && fVar.f6297U[i10] == i) {
                if (f.a(obj, fVar.f6298V[i10])) {
                    return i10;
                }
                i10--;
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
