package Y;

import D6.h;
import P6.f;
import Z.a;
import java.util.Arrays;

public final class j implements Cloneable {

    /* renamed from: U  reason: collision with root package name */
    public /* synthetic */ int[] f6309U;

    /* renamed from: V  reason: collision with root package name */
    public /* synthetic */ Object[] f6310V;

    /* renamed from: W  reason: collision with root package name */
    public /* synthetic */ int f6311W;

    public j() {
        int i;
        int i8 = 4;
        while (true) {
            i = 40;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (40 <= i9) {
                i = i9;
                break;
            }
            i8++;
        }
        int i10 = i / 4;
        this.f6309U = new int[i10];
        this.f6310V = new Object[i10];
    }

    public final void a(int i, Object obj) {
        int i8 = this.f6311W;
        if (i8 == 0 || i > this.f6309U[i8 - 1]) {
            if (i8 >= this.f6309U.length) {
                int i9 = (i8 + 1) * 4;
                int i10 = 4;
                while (true) {
                    if (i10 >= 32) {
                        break;
                    }
                    int i11 = (1 << i10) - 12;
                    if (i9 <= i11) {
                        i9 = i11;
                        break;
                    }
                    i10++;
                }
                int i12 = i9 / 4;
                int[] copyOf = Arrays.copyOf(this.f6309U, i12);
                f.d(copyOf, "copyOf(this, newSize)");
                this.f6309U = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f6310V, i12);
                f.d(copyOf2, "copyOf(this, newSize)");
                this.f6310V = copyOf2;
            }
            this.f6309U[i8] = i;
            this.f6310V[i8] = obj;
            this.f6311W = i8 + 1;
            return;
        }
        d(i, obj);
    }

    /* renamed from: b */
    public final j clone() {
        Object clone = super.clone();
        f.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j jVar = (j) clone;
        jVar.f6309U = (int[]) this.f6309U.clone();
        jVar.f6310V = (Object[]) this.f6310V.clone();
        return jVar;
    }

    public final Object c(int i) {
        Object obj;
        int a8 = a.a(this.f6311W, i, this.f6309U);
        if (a8 < 0 || (obj = this.f6310V[a8]) == h.f6305b) {
            return null;
        }
        return obj;
    }

    public final void d(int i, Object obj) {
        int a8 = a.a(this.f6311W, i, this.f6309U);
        if (a8 >= 0) {
            this.f6310V[a8] = obj;
            return;
        }
        int i8 = ~a8;
        int i9 = this.f6311W;
        if (i8 < i9) {
            Object[] objArr = this.f6310V;
            if (objArr[i8] == h.f6305b) {
                this.f6309U[i8] = i;
                objArr[i8] = obj;
                return;
            }
        }
        if (i9 >= this.f6309U.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] copyOf = Arrays.copyOf(this.f6309U, i13);
            f.d(copyOf, "copyOf(this, newSize)");
            this.f6309U = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6310V, i13);
            f.d(copyOf2, "copyOf(this, newSize)");
            this.f6310V = copyOf2;
        }
        int i14 = this.f6311W;
        if (i14 - i8 != 0) {
            int[] iArr = this.f6309U;
            int i15 = i8 + 1;
            h.C(i15, i8, iArr, iArr, i14);
            Object[] objArr2 = this.f6310V;
            h.B(i15, i8, this.f6311W, objArr2, objArr2);
        }
        this.f6309U[i8] = i;
        this.f6310V[i8] = obj;
        this.f6311W++;
    }

    public final String toString() {
        int i = this.f6311W;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i8 = this.f6311W;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(this.f6309U[i9]);
            sb.append('=');
            Object obj = this.f6310V[i9];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f.d(sb2, "buffer.toString()");
        return sb2;
    }
}
