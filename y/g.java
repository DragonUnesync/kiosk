package Y;

import D6.h;
import P6.f;
import Z.a;
import java.util.Arrays;

public final class g implements Cloneable {

    /* renamed from: U  reason: collision with root package name */
    public /* synthetic */ boolean f6300U;

    /* renamed from: V  reason: collision with root package name */
    public /* synthetic */ long[] f6301V;

    /* renamed from: W  reason: collision with root package name */
    public /* synthetic */ Object[] f6302W;

    /* renamed from: X  reason: collision with root package name */
    public /* synthetic */ int f6303X;

    public g() {
        int i;
        int i8 = 4;
        while (true) {
            i = 80;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (80 <= i9) {
                i = i9;
                break;
            }
            i8++;
        }
        int i10 = i / 8;
        this.f6301V = new long[i10];
        this.f6302W = new Object[i10];
    }

    public final void a(long j7, Long l8) {
        int i = this.f6303X;
        if (i == 0 || j7 > this.f6301V[i - 1]) {
            if (this.f6300U) {
                long[] jArr = this.f6301V;
                if (i >= jArr.length) {
                    Object[] objArr = this.f6302W;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i; i9++) {
                        Object obj = objArr[i9];
                        if (obj != h.f6304a) {
                            if (i9 != i8) {
                                jArr[i8] = jArr[i9];
                                objArr[i8] = obj;
                                objArr[i9] = null;
                            }
                            i8++;
                        }
                    }
                    this.f6300U = false;
                    this.f6303X = i8;
                }
            }
            int i10 = this.f6303X;
            if (i10 >= this.f6301V.length) {
                int i11 = (i10 + 1) * 8;
                int i12 = 4;
                while (true) {
                    if (i12 >= 32) {
                        break;
                    }
                    int i13 = (1 << i12) - 12;
                    if (i11 <= i13) {
                        i11 = i13;
                        break;
                    }
                    i12++;
                }
                int i14 = i11 / 8;
                long[] copyOf = Arrays.copyOf(this.f6301V, i14);
                f.d(copyOf, "copyOf(this, newSize)");
                this.f6301V = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f6302W, i14);
                f.d(copyOf2, "copyOf(this, newSize)");
                this.f6302W = copyOf2;
            }
            this.f6301V[i10] = j7;
            this.f6302W[i10] = l8;
            this.f6303X = i10 + 1;
            return;
        }
        g(l8, j7);
    }

    public final void b() {
        int i = this.f6303X;
        Object[] objArr = this.f6302W;
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = null;
        }
        this.f6303X = 0;
        this.f6300U = false;
    }

    /* renamed from: c */
    public final g clone() {
        Object clone = super.clone();
        f.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) clone;
        gVar.f6301V = (long[]) this.f6301V.clone();
        gVar.f6302W = (Object[]) this.f6302W.clone();
        return gVar;
    }

    public final Object d(long j7) {
        Object obj;
        int b8 = a.b(this.f6301V, this.f6303X, j7);
        if (b8 < 0 || (obj = this.f6302W[b8]) == h.f6304a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j7) {
        Object obj;
        int b8 = a.b(this.f6301V, this.f6303X, j7);
        if (b8 < 0 || (obj = this.f6302W[b8]) == h.f6304a) {
            return -1L;
        }
        return obj;
    }

    public final long f(int i) {
        int i8;
        if (i < 0 || i >= (i8 = this.f6303X)) {
            throw new IllegalArgumentException(Q0.g.m(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f6300U) {
            long[] jArr = this.f6301V;
            Object[] objArr = this.f6302W;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != h.f6304a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f6300U = false;
            this.f6303X = i9;
        }
        return this.f6301V[i];
    }

    public final void g(Object obj, long j7) {
        int b8 = a.b(this.f6301V, this.f6303X, j7);
        if (b8 >= 0) {
            this.f6302W[b8] = obj;
            return;
        }
        int i = ~b8;
        int i8 = this.f6303X;
        Object obj2 = h.f6304a;
        if (i < i8) {
            Object[] objArr = this.f6302W;
            if (objArr[i] == obj2) {
                this.f6301V[i] = j7;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f6300U) {
            long[] jArr = this.f6301V;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f6302W;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj3 = objArr2[i10];
                    if (obj3 != obj2) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr2[i9] = obj3;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f6300U = false;
                this.f6303X = i9;
                i = ~a.b(this.f6301V, i9, j7);
            }
        }
        int i11 = this.f6303X;
        if (i11 >= this.f6301V.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] copyOf = Arrays.copyOf(this.f6301V, i15);
            f.d(copyOf, "copyOf(this, newSize)");
            this.f6301V = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6302W, i15);
            f.d(copyOf2, "copyOf(this, newSize)");
            this.f6302W = copyOf2;
        }
        int i16 = this.f6303X - i;
        if (i16 != 0) {
            long[] jArr2 = this.f6301V;
            int i17 = i + 1;
            f.e(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i17, i16);
            Object[] objArr3 = this.f6302W;
            h.B(i17, i, this.f6303X, objArr3, objArr3);
        }
        this.f6301V[i] = j7;
        this.f6302W[i] = obj;
        this.f6303X++;
    }

    public final int h() {
        if (this.f6300U) {
            int i = this.f6303X;
            long[] jArr = this.f6301V;
            Object[] objArr = this.f6302W;
            int i8 = 0;
            for (int i9 = 0; i9 < i; i9++) {
                Object obj = objArr[i9];
                if (obj != h.f6304a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f6300U = false;
            this.f6303X = i8;
        }
        return this.f6303X;
    }

    public final Object i(int i) {
        int i8;
        if (i < 0 || i >= (i8 = this.f6303X)) {
            throw new IllegalArgumentException(Q0.g.m(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f6300U) {
            long[] jArr = this.f6301V;
            Object[] objArr = this.f6302W;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != h.f6304a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f6300U = false;
            this.f6303X = i9;
        }
        return this.f6302W[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6303X * 28);
        sb.append('{');
        int i = this.f6303X;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(f(i8));
            sb.append('=');
            Object i9 = i(i8);
            if (i9 != sb) {
                sb.append(i9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
