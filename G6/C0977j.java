package g6;

import f6.a0;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: g6.j  reason: case insensitive filesystem */
public final class C0977j extends AbstractQueue implements Z {
    private static final C0967a0[] EMPTY_ARRAY = new C0967a0[0];
    private final Comparator<C0967a0> comparator;
    /* access modifiers changed from: private */
    public C0967a0[] queue;
    /* access modifiers changed from: private */
    public int size;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Comparator<g6.a0>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0977j(java.util.Comparator<g6.C0967a0> r2, int r3) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "comparator"
            java.lang.Object r2 = g6.B.checkNotNull(r2, r0)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r1.comparator = r2
            if (r3 == 0) goto L_0x0012
            g6.a0[] r2 = new g6.C0967a0[r3]
            goto L_0x0014
        L_0x0012:
            g6.a0[] r2 = EMPTY_ARRAY
        L_0x0014:
            g6.a0[] r2 = (g6.C0967a0[]) r2
            r1.queue = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C0977j.<init>(java.util.Comparator, int):void");
    }

    private void bubbleDown(int i, C0967a0 a0Var) {
        int i8 = this.size >>> 1;
        while (i < i8) {
            int i9 = i << 1;
            int i10 = i9 + 1;
            C0967a0[] a0VarArr = this.queue;
            C0967a0 a0Var2 = a0VarArr[i10];
            int i11 = i9 + 2;
            if (i11 >= this.size || this.comparator.compare(a0Var2, a0VarArr[i11]) <= 0) {
                i11 = i10;
            } else {
                a0Var2 = this.queue[i11];
            }
            if (this.comparator.compare(a0Var, a0Var2) <= 0) {
                break;
            }
            this.queue[i] = a0Var2;
            ((a0) a0Var2).priorityQueueIndex(this, i);
            i = i11;
        }
        this.queue[i] = a0Var;
        ((a0) a0Var).priorityQueueIndex(this, i);
    }

    private void bubbleUp(int i, C0967a0 a0Var) {
        while (i > 0) {
            int i8 = (i - 1) >>> 1;
            C0967a0 a0Var2 = this.queue[i8];
            if (this.comparator.compare(a0Var, a0Var2) >= 0) {
                break;
            }
            this.queue[i] = a0Var2;
            ((a0) a0Var2).priorityQueueIndex(this, i);
            i = i8;
        }
        this.queue[i] = a0Var;
        ((a0) a0Var).priorityQueueIndex(this, i);
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            C0967a0 a0Var = this.queue[i];
            if (a0Var != null) {
                ((a0) a0Var).priorityQueueIndex(this, -1);
                this.queue[i] = null;
            }
        }
        this.size = 0;
    }

    public void clearIgnoringIndexes() {
        this.size = 0;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof C0967a0)) {
            return false;
        }
        a0 a0Var = (a0) ((C0967a0) obj);
        return contains(a0Var, a0Var.priorityQueueIndex(this));
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public Iterator<C0967a0> iterator() {
        return new C0976i(this);
    }

    public boolean remove(Object obj) {
        try {
            return removeTyped((C0967a0) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int size() {
        return this.size;
    }

    public Object[] toArray() {
        return Arrays.copyOf(this.queue, this.size);
    }

    public boolean offer(C0967a0 a0Var) {
        a0 a0Var2 = (a0) a0Var;
        if (a0Var2.priorityQueueIndex(this) == -1) {
            int i = this.size;
            C0967a0[] a0VarArr = this.queue;
            if (i >= a0VarArr.length) {
                this.queue = (C0967a0[]) Arrays.copyOf(a0VarArr, a0VarArr.length + (a0VarArr.length < 64 ? a0VarArr.length + 2 : a0VarArr.length >>> 1));
            }
            int i8 = this.size;
            this.size = i8 + 1;
            bubbleUp(i8, a0Var2);
            return true;
        }
        throw new IllegalArgumentException("e.priorityQueueIndex(): " + a0Var2.priorityQueueIndex(this) + " (expected: -1) + e: " + a0Var2);
    }

    public C0967a0 peek() {
        if (this.size == 0) {
            return null;
        }
        return this.queue[0];
    }

    public C0967a0 poll() {
        if (this.size == 0) {
            return null;
        }
        a0 a0Var = (a0) this.queue[0];
        a0Var.priorityQueueIndex(this, -1);
        C0967a0[] a0VarArr = this.queue;
        int i = this.size - 1;
        this.size = i;
        C0967a0 a0Var2 = a0VarArr[i];
        a0VarArr[i] = null;
        if (i != 0) {
            bubbleDown(0, a0Var2);
        }
        return a0Var;
    }

    public boolean removeTyped(C0967a0 a0Var) {
        a0 a0Var2 = (a0) a0Var;
        int priorityQueueIndex = a0Var2.priorityQueueIndex(this);
        if (!contains(a0Var2, priorityQueueIndex)) {
            return false;
        }
        a0Var2.priorityQueueIndex(this, -1);
        int i = this.size - 1;
        this.size = i;
        if (i == 0 || i == priorityQueueIndex) {
            this.queue[priorityQueueIndex] = null;
            return true;
        }
        C0967a0[] a0VarArr = this.queue;
        C0967a0 a0Var3 = a0VarArr[i];
        a0VarArr[priorityQueueIndex] = a0Var3;
        a0VarArr[i] = null;
        if (this.comparator.compare(a0Var2, a0Var3) < 0) {
            bubbleDown(priorityQueueIndex, a0Var3);
        } else {
            bubbleUp(priorityQueueIndex, a0Var3);
        }
        return true;
    }

    public <X> X[] toArray(X[] xArr) {
        int length = xArr.length;
        int i = this.size;
        if (length < i) {
            return Arrays.copyOf(this.queue, i, xArr.getClass());
        }
        System.arraycopy(this.queue, 0, xArr, 0, i);
        int length2 = xArr.length;
        int i8 = this.size;
        if (length2 > i8) {
            xArr[i8] = null;
        }
        return xArr;
    }

    private boolean contains(C0967a0 a0Var, int i) {
        return i >= 0 && i < this.size && a0Var.equals(this.queue[i]);
    }
}
