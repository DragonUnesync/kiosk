package Q5;

import androidx.recyclerview.widget.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class g implements e {

    /* renamed from: U  reason: collision with root package name */
    public int[] f4142U;

    /* renamed from: V  reason: collision with root package name */
    public ArrayList f4143V;

    public void a() {
        int[] iArr = this.f4142U;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f4143V = null;
    }

    public void b(int i, List list, List list2) {
        this.f4142U[0] = i;
        this.f4143V.addAll(list);
    }

    public void c(int i) {
        int[] iArr = this.f4142U;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i, 10) + 1)];
            this.f4142U = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f4142U = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f4142U;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void d(int i, int i8) {
        int[] iArr = this.f4142U;
        if (iArr != null && i < iArr.length) {
            int i9 = i + i8;
            c(i9);
            int[] iArr2 = this.f4142U;
            System.arraycopy(iArr2, i, iArr2, i9, (iArr2.length - i) - i8);
            Arrays.fill(this.f4142U, i, i9, -1);
            ArrayList arrayList = this.f4143V;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    p0 p0Var = (p0) this.f4143V.get(size);
                    int i10 = p0Var.f8487U;
                    if (i10 >= i) {
                        p0Var.f8487U = i10 + i8;
                    }
                }
            }
        }
    }

    public void e(int i, int i8) {
        int[] iArr = this.f4142U;
        if (iArr != null && i < iArr.length) {
            int i9 = i + i8;
            c(i9);
            int[] iArr2 = this.f4142U;
            System.arraycopy(iArr2, i9, iArr2, i, (iArr2.length - i) - i8);
            int[] iArr3 = this.f4142U;
            Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
            ArrayList arrayList = this.f4143V;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    p0 p0Var = (p0) this.f4143V.get(size);
                    int i10 = p0Var.f8487U;
                    if (i10 >= i) {
                        if (i10 < i9) {
                            this.f4143V.remove(size);
                        } else {
                            p0Var.f8487U = i10 - i8;
                        }
                    }
                }
            }
        }
    }
}
