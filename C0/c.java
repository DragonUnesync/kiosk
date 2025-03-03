package C0;

import android.graphics.Rect;
import java.util.Comparator;
import w0.C1576e;
import z3.e;

public final class c implements Comparator {

    /* renamed from: U  reason: collision with root package name */
    public final Rect f503U = new Rect();

    /* renamed from: V  reason: collision with root package name */
    public final Rect f504V = new Rect();

    /* renamed from: W  reason: collision with root package name */
    public final boolean f505W;

    /* renamed from: X  reason: collision with root package name */
    public final e f506X;

    public c(boolean z, e eVar) {
        this.f505W = z;
        this.f506X = eVar;
    }

    public final int compare(Object obj, Object obj2) {
        this.f506X.getClass();
        Rect rect = this.f503U;
        ((C1576e) obj).f(rect);
        Rect rect2 = this.f504V;
        ((C1576e) obj2).f(rect2);
        int i = rect.top;
        int i8 = rect2.top;
        if (i < i8) {
            return -1;
        }
        if (i > i8) {
            return 1;
        }
        int i9 = rect.left;
        int i10 = rect2.left;
        boolean z = this.f505W;
        if (i9 < i10) {
            if (z) {
                return 1;
            }
            return -1;
        } else if (i9 <= i10) {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
            int i13 = rect.right;
            int i14 = rect2.right;
            if (i13 < i14) {
                if (z) {
                    return 1;
                }
                return -1;
            } else if (i13 <= i14) {
                return 0;
            } else {
                if (z) {
                    return -1;
                }
                return 1;
            }
        } else if (z) {
            return -1;
        } else {
            return 1;
        }
    }
}
