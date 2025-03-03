package D6;

import G5.s;
import P6.f;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class g extends AbstractList implements List {

    /* renamed from: X  reason: collision with root package name */
    public static final Object[] f1262X = new Object[0];

    /* renamed from: U  reason: collision with root package name */
    public int f1263U;

    /* renamed from: V  reason: collision with root package name */
    public Object[] f1264V = f1262X;

    /* renamed from: W  reason: collision with root package name */
    public int f1265W;

    public final void add(int i, Object obj) {
        int i8;
        int i9 = this.f1265W;
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i9);
        } else if (i == i9) {
            addLast(obj);
        } else if (i == 0) {
            addFirst(obj);
        } else {
            h();
            c(this.f1265W + 1);
            int g8 = g(this.f1263U + i);
            int i10 = this.f1265W;
            if (i < ((i10 + 1) >> 1)) {
                if (g8 == 0) {
                    Object[] objArr = this.f1264V;
                    f.e(objArr, "<this>");
                    g8 = objArr.length;
                }
                int i11 = g8 - 1;
                int i12 = this.f1263U;
                if (i12 == 0) {
                    Object[] objArr2 = this.f1264V;
                    f.e(objArr2, "<this>");
                    i8 = objArr2.length - 1;
                } else {
                    i8 = i12 - 1;
                }
                int i13 = this.f1263U;
                if (i11 >= i13) {
                    Object[] objArr3 = this.f1264V;
                    objArr3[i8] = objArr3[i13];
                    h.B(i13, i13 + 1, i11 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f1264V;
                    h.B(i13 - 1, i13, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f1264V;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    h.B(0, 1, i11 + 1, objArr5, objArr5);
                }
                this.f1264V[i11] = obj;
                this.f1263U = i8;
            } else {
                int g9 = g(this.f1263U + i10);
                if (g8 < g9) {
                    Object[] objArr6 = this.f1264V;
                    h.B(g8 + 1, g8, g9, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f1264V;
                    h.B(1, 0, g9, objArr7, objArr7);
                    Object[] objArr8 = this.f1264V;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    h.B(g8 + 1, g8, objArr8.length - 1, objArr8, objArr8);
                }
                this.f1264V[g8] = obj;
            }
            this.f1265W++;
        }
    }

    public final boolean addAll(int i, Collection collection) {
        f.e(collection, "elements");
        int i8 = this.f1265W;
        if (i < 0 || i > i8) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i8);
        } else if (collection.isEmpty()) {
            return false;
        } else {
            if (i == this.f1265W) {
                return addAll(collection);
            }
            h();
            c(collection.size() + this.f1265W);
            int g8 = g(this.f1263U + this.f1265W);
            int g9 = g(this.f1263U + i);
            int size = collection.size();
            if (i < ((this.f1265W + 1) >> 1)) {
                int i9 = this.f1263U;
                int i10 = i9 - size;
                if (g9 < i9) {
                    Object[] objArr = this.f1264V;
                    h.B(i10, i9, objArr.length, objArr, objArr);
                    if (size >= g9) {
                        Object[] objArr2 = this.f1264V;
                        h.B(objArr2.length - size, 0, g9, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f1264V;
                        h.B(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f1264V;
                        h.B(0, size, g9, objArr4, objArr4);
                    }
                } else if (i10 >= 0) {
                    Object[] objArr5 = this.f1264V;
                    h.B(i10, i9, g9, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f1264V;
                    i10 += objArr6.length;
                    int i11 = g9 - i9;
                    int length = objArr6.length - i10;
                    if (length >= i11) {
                        h.B(i10, i9, g9, objArr6, objArr6);
                    } else {
                        h.B(i10, i9, i9 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f1264V;
                        h.B(0, this.f1263U + length, g9, objArr7, objArr7);
                    }
                }
                this.f1263U = i10;
                b(e(g9 - size), collection);
            } else {
                int i12 = g9 + size;
                if (g9 < g8) {
                    int i13 = size + g8;
                    Object[] objArr8 = this.f1264V;
                    if (i13 <= objArr8.length) {
                        h.B(i12, g9, g8, objArr8, objArr8);
                    } else if (i12 >= objArr8.length) {
                        h.B(i12 - objArr8.length, g9, g8, objArr8, objArr8);
                    } else {
                        int length2 = g8 - (i13 - objArr8.length);
                        h.B(0, length2, g8, objArr8, objArr8);
                        Object[] objArr9 = this.f1264V;
                        h.B(i12, g9, length2, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.f1264V;
                    h.B(size, 0, g8, objArr10, objArr10);
                    Object[] objArr11 = this.f1264V;
                    if (i12 >= objArr11.length) {
                        h.B(i12 - objArr11.length, g9, objArr11.length, objArr11, objArr11);
                    } else {
                        h.B(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.f1264V;
                        h.B(i12, g9, objArr12.length - size, objArr12, objArr12);
                    }
                }
                b(g9, collection);
            }
            return true;
        }
    }

    public final void addFirst(Object obj) {
        h();
        c(this.f1265W + 1);
        int i = this.f1263U;
        if (i == 0) {
            Object[] objArr = this.f1264V;
            f.e(objArr, "<this>");
            i = objArr.length;
        }
        int i8 = i - 1;
        this.f1263U = i8;
        this.f1264V[i8] = obj;
        this.f1265W++;
    }

    public final void addLast(Object obj) {
        h();
        c(this.f1265W + 1);
        this.f1264V[g(this.f1263U + this.f1265W)] = obj;
        this.f1265W++;
    }

    public final void b(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1264V.length;
        while (i < length && it.hasNext()) {
            this.f1264V[i] = it.next();
            i++;
        }
        int i8 = this.f1263U;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f1264V[i9] = it.next();
        }
        this.f1265W = collection.size() + this.f1265W;
    }

    public final void c(int i) {
        if (i >= 0) {
            Object[] objArr = this.f1264V;
            if (i > objArr.length) {
                if (objArr == f1262X) {
                    if (i < 10) {
                        i = 10;
                    }
                    this.f1264V = new Object[i];
                    return;
                }
                int length = objArr.length;
                int i8 = length + (length >> 1);
                if (i8 - i < 0) {
                    i8 = i;
                }
                if (i8 - 2147483639 > 0) {
                    if (i > 2147483639) {
                        i8 = Integer.MAX_VALUE;
                    } else {
                        i8 = 2147483639;
                    }
                }
                Object[] objArr2 = new Object[i8];
                h.B(0, this.f1263U, objArr.length, objArr, objArr2);
                Object[] objArr3 = this.f1264V;
                int length2 = objArr3.length;
                int i9 = this.f1263U;
                h.B(length2 - i9, 0, i9, objArr3, objArr2);
                this.f1263U = 0;
                this.f1264V = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final void clear() {
        if (!isEmpty()) {
            h();
            f(this.f1263U, g(this.f1263U + this.f1265W));
        }
        this.f1263U = 0;
        this.f1265W = 0;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i) {
        Object[] objArr = this.f1264V;
        f.e(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int e(int i) {
        if (i < 0) {
            return i + this.f1264V.length;
        }
        return i;
    }

    public final void f(int i, int i8) {
        if (i < i8) {
            h.F(i, i8, this.f1264V);
            return;
        }
        Object[] objArr = this.f1264V;
        h.F(i, objArr.length, objArr);
        h.F(0, i8, this.f1264V);
    }

    public final int g(int i) {
        Object[] objArr = this.f1264V;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final Object get(int i) {
        int i8 = this.f1265W;
        if (i >= 0 && i < i8) {
            return this.f1264V[g(this.f1263U + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i8);
    }

    public final void h() {
        this.modCount++;
    }

    public final int indexOf(Object obj) {
        int i;
        int g8 = g(this.f1263U + this.f1265W);
        int i8 = this.f1263U;
        if (i8 < g8) {
            while (i8 < g8) {
                if (f.a(obj, this.f1264V[i8])) {
                    i = this.f1263U;
                } else {
                    i8++;
                }
            }
            return -1;
        } else if (i8 < g8) {
            return -1;
        } else {
            int length = this.f1264V.length;
            while (true) {
                if (i8 >= length) {
                    int i9 = 0;
                    while (i9 < g8) {
                        if (f.a(obj, this.f1264V[i9])) {
                            i8 = i9 + this.f1264V.length;
                            i = this.f1263U;
                        } else {
                            i9++;
                        }
                    }
                    return -1;
                } else if (f.a(obj, this.f1264V[i8])) {
                    i = this.f1263U;
                    break;
                } else {
                    i8++;
                }
            }
        }
        return i8 - i;
    }

    public final boolean isEmpty() {
        if (this.f1265W == 0) {
            return true;
        }
        return false;
    }

    public final int lastIndexOf(Object obj) {
        int i;
        int i8;
        int g8 = g(this.f1263U + this.f1265W);
        int i9 = this.f1263U;
        if (i9 < g8) {
            i = g8 - 1;
            if (i9 <= i) {
                while (!f.a(obj, this.f1264V[i])) {
                    if (i != i9) {
                        i--;
                    }
                }
                i8 = this.f1263U;
            }
            return -1;
        }
        if (i9 > g8) {
            int i10 = g8 - 1;
            while (true) {
                if (-1 >= i10) {
                    Object[] objArr = this.f1264V;
                    f.e(objArr, "<this>");
                    int length = objArr.length - 1;
                    int i11 = this.f1263U;
                    if (i11 <= length) {
                        while (!f.a(obj, this.f1264V[i])) {
                            if (i != i11) {
                                length = i - 1;
                            }
                        }
                        i8 = this.f1263U;
                    }
                } else if (f.a(obj, this.f1264V[i10])) {
                    i = i10 + this.f1264V.length;
                    i8 = this.f1263U;
                    break;
                } else {
                    i10--;
                }
            }
        }
        return -1;
        return i - i8;
    }

    public final Object remove(int i) {
        int i8 = this.f1265W;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i8);
        } else if (i == j.K(this)) {
            return removeLast();
        } else {
            if (i == 0) {
                return removeFirst();
            }
            h();
            int g8 = g(this.f1263U + i);
            Object[] objArr = this.f1264V;
            Object obj = objArr[g8];
            if (i < (this.f1265W >> 1)) {
                int i9 = this.f1263U;
                if (g8 >= i9) {
                    h.B(i9 + 1, i9, g8, objArr, objArr);
                } else {
                    h.B(1, 0, g8, objArr, objArr);
                    Object[] objArr2 = this.f1264V;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i10 = this.f1263U;
                    h.B(i10 + 1, i10, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f1264V;
                int i11 = this.f1263U;
                objArr3[i11] = null;
                this.f1263U = d(i11);
            } else {
                int g9 = g(j.K(this) + this.f1263U);
                if (g8 <= g9) {
                    Object[] objArr4 = this.f1264V;
                    h.B(g8, g8 + 1, g9 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f1264V;
                    h.B(g8, g8 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f1264V;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    h.B(0, 1, g9 + 1, objArr6, objArr6);
                }
                this.f1264V[g9] = null;
            }
            this.f1265W--;
            return obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r11) {
        /*
            r10 = this;
            java.lang.String r0 = "elements"
            P6.f.e(r11, r0)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008f
            java.lang.Object[] r0 = r10.f1264V
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x008f
        L_0x0013:
            int r0 = r10.f1263U
            int r2 = r10.f1265W
            int r0 = r0 + r2
            int r0 = r10.g(r0)
            int r2 = r10.f1263U
            r3 = 1
            if (r2 >= r0) goto L_0x0040
            r4 = r2
        L_0x0022:
            if (r2 >= r0) goto L_0x003a
            java.lang.Object[] r5 = r10.f1264V
            r5 = r5[r2]
            boolean r6 = r11.contains(r5)
            if (r6 != 0) goto L_0x0036
            java.lang.Object[] r6 = r10.f1264V
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x003a:
            java.lang.Object[] r11 = r10.f1264V
            D6.h.F(r4, r0, r11)
            goto L_0x0081
        L_0x0040:
            java.lang.Object[] r4 = r10.f1264V
            int r4 = r4.length
            r5 = r2
            r6 = 0
        L_0x0045:
            r7 = 0
            if (r2 >= r4) goto L_0x0060
            java.lang.Object[] r8 = r10.f1264V
            r9 = r8[r2]
            r8[r2] = r7
            boolean r7 = r11.contains(r9)
            if (r7 != 0) goto L_0x005c
            java.lang.Object[] r7 = r10.f1264V
            int r8 = r5 + 1
            r7[r5] = r9
            r5 = r8
            goto L_0x005d
        L_0x005c:
            r6 = 1
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0060:
            int r2 = r10.g(r5)
            r4 = r2
        L_0x0065:
            if (r1 >= r0) goto L_0x0080
            java.lang.Object[] r2 = r10.f1264V
            r5 = r2[r1]
            r2[r1] = r7
            boolean r2 = r11.contains(r5)
            if (r2 != 0) goto L_0x007c
            java.lang.Object[] r2 = r10.f1264V
            r2[r4] = r5
            int r4 = r10.d(r4)
            goto L_0x007d
        L_0x007c:
            r6 = 1
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r1 == 0) goto L_0x008f
            r10.h()
            int r11 = r10.f1263U
            int r4 = r4 - r11
            int r11 = r10.e(r4)
            r10.f1265W = r11
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.g.removeAll(java.util.Collection):boolean");
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            h();
            Object[] objArr = this.f1264V;
            int i = this.f1263U;
            Object obj = objArr[i];
            objArr[i] = null;
            this.f1263U = d(i);
            this.f1265W--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            h();
            int g8 = g(j.K(this) + this.f1263U);
            Object[] objArr = this.f1264V;
            Object obj = objArr[g8];
            objArr[g8] = null;
            this.f1265W--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void removeRange(int i, int i8) {
        s.c(i, i8, this.f1265W);
        int i9 = i8 - i;
        if (i9 != 0) {
            if (i9 == this.f1265W) {
                clear();
            } else if (i9 == 1) {
                remove(i);
            } else {
                h();
                if (i < this.f1265W - i8) {
                    int g8 = g((i - 1) + this.f1263U);
                    int g9 = g((i8 - 1) + this.f1263U);
                    while (i > 0) {
                        int i10 = g8 + 1;
                        int min = Math.min(i, Math.min(i10, g9 + 1));
                        Object[] objArr = this.f1264V;
                        int i11 = g9 - min;
                        int i12 = g8 - min;
                        h.B(i11 + 1, i12 + 1, i10, objArr, objArr);
                        g8 = e(i12);
                        g9 = e(i11);
                        i -= min;
                    }
                    int g10 = g(this.f1263U + i9);
                    f(this.f1263U, g10);
                    this.f1263U = g10;
                } else {
                    int g11 = g(this.f1263U + i8);
                    int g12 = g(this.f1263U + i);
                    int i13 = this.f1265W;
                    while (true) {
                        i13 -= i8;
                        if (i13 <= 0) {
                            break;
                        }
                        Object[] objArr2 = this.f1264V;
                        i8 = Math.min(i13, Math.min(objArr2.length - g11, objArr2.length - g12));
                        Object[] objArr3 = this.f1264V;
                        int i14 = g11 + i8;
                        h.B(g12, g11, i14, objArr3, objArr3);
                        g11 = g(i14);
                        g12 = g(g12 + i8);
                    }
                    int g13 = g(this.f1263U + this.f1265W);
                    f(e(g13 - i9), g13);
                }
                this.f1265W -= i9;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r11) {
        /*
            r10 = this;
            java.lang.String r0 = "elements"
            P6.f.e(r11, r0)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008f
            java.lang.Object[] r0 = r10.f1264V
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x008f
        L_0x0013:
            int r0 = r10.f1263U
            int r2 = r10.f1265W
            int r0 = r0 + r2
            int r0 = r10.g(r0)
            int r2 = r10.f1263U
            r3 = 1
            if (r2 >= r0) goto L_0x0040
            r4 = r2
        L_0x0022:
            if (r2 >= r0) goto L_0x003a
            java.lang.Object[] r5 = r10.f1264V
            r5 = r5[r2]
            boolean r6 = r11.contains(r5)
            if (r6 == 0) goto L_0x0036
            java.lang.Object[] r6 = r10.f1264V
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x003a:
            java.lang.Object[] r11 = r10.f1264V
            D6.h.F(r4, r0, r11)
            goto L_0x0081
        L_0x0040:
            java.lang.Object[] r4 = r10.f1264V
            int r4 = r4.length
            r5 = r2
            r6 = 0
        L_0x0045:
            r7 = 0
            if (r2 >= r4) goto L_0x0060
            java.lang.Object[] r8 = r10.f1264V
            r9 = r8[r2]
            r8[r2] = r7
            boolean r7 = r11.contains(r9)
            if (r7 == 0) goto L_0x005c
            java.lang.Object[] r7 = r10.f1264V
            int r8 = r5 + 1
            r7[r5] = r9
            r5 = r8
            goto L_0x005d
        L_0x005c:
            r6 = 1
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0060:
            int r2 = r10.g(r5)
            r4 = r2
        L_0x0065:
            if (r1 >= r0) goto L_0x0080
            java.lang.Object[] r2 = r10.f1264V
            r5 = r2[r1]
            r2[r1] = r7
            boolean r2 = r11.contains(r5)
            if (r2 == 0) goto L_0x007c
            java.lang.Object[] r2 = r10.f1264V
            r2[r4] = r5
            int r4 = r10.d(r4)
            goto L_0x007d
        L_0x007c:
            r6 = 1
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r1 == 0) goto L_0x008f
            r10.h()
            int r11 = r10.f1263U
            int r4 = r4 - r11
            int r11 = r10.e(r4)
            r10.f1265W = r11
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.g.retainAll(java.util.Collection):boolean");
    }

    public final Object set(int i, Object obj) {
        int i8 = this.f1265W;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i8);
        }
        int g8 = g(this.f1263U + i);
        Object[] objArr = this.f1264V;
        Object obj2 = objArr[g8];
        objArr[g8] = obj;
        return obj2;
    }

    public final int size() {
        return this.f1265W;
    }

    public final Object[] toArray() {
        return toArray(new Object[this.f1265W]);
    }

    public final Object[] toArray(Object[] objArr) {
        f.e(objArr, "array");
        int length = objArr.length;
        int i = this.f1265W;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            f.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int g8 = g(this.f1263U + this.f1265W);
        int i8 = this.f1263U;
        if (i8 < g8) {
            h.E(i8, g8, 2, this.f1264V, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1264V;
            h.B(0, this.f1263U, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f1264V;
            h.B(objArr3.length - this.f1263U, 0, g8, objArr3, objArr);
        }
        int i9 = this.f1265W;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        f.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        h();
        c(collection.size() + this.f1265W);
        b(g(this.f1263U + this.f1265W), collection);
        return true;
    }
}
