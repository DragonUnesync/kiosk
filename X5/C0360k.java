package X5;

import N.e;
import f6.C0934y;
import g6.B;
import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: X5.k  reason: case insensitive filesystem */
public final class C0360k extends AbstractList implements RandomAccess {
    private static final C0934y CODEC_OUTPUT_LISTS_POOL = new C0357h();
    /* access modifiers changed from: private */
    public static final C0358i NOOP_RECYCLER = new C0356g();
    private Object[] array;
    private boolean insertSinceRecycled;
    private final C0358i recycler;
    private int size;

    public /* synthetic */ C0360k(C0358i iVar, int i, C0356g gVar) {
        this(iVar, i);
    }

    private void checkIndex(int i) {
        if (i >= this.size) {
            StringBuilder sb = new StringBuilder("expected: index < (");
            sb.append(this.size);
            sb.append("),but actual is (");
            throw new IndexOutOfBoundsException(e.z(sb, this.size, ")"));
        }
    }

    private void expandArray() {
        Object[] objArr = this.array;
        int length = objArr.length << 1;
        if (length >= 0) {
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.array = objArr2;
            return;
        }
        throw new OutOfMemoryError();
    }

    private void insert(int i, Object obj) {
        this.array[i] = obj;
        this.insertSinceRecycled = true;
    }

    public static C0360k newInstance() {
        return ((C0359j) CODEC_OUTPUT_LISTS_POOL.get()).getOrCreate();
    }

    public boolean add(Object obj) {
        B.checkNotNull(obj, "element");
        try {
            insert(this.size, obj);
        } catch (IndexOutOfBoundsException unused) {
            expandArray();
            insert(this.size, obj);
        }
        this.size++;
        return true;
    }

    public void clear() {
        this.size = 0;
    }

    public Object get(int i) {
        checkIndex(i);
        return this.array[i];
    }

    public Object getUnsafe(int i) {
        return this.array[i];
    }

    public boolean insertSinceRecycled() {
        return this.insertSinceRecycled;
    }

    public void recycle() {
        for (int i = 0; i < this.size; i++) {
            this.array[i] = null;
        }
        this.size = 0;
        this.insertSinceRecycled = false;
        this.recycler.recycle(this);
    }

    public Object remove(int i) {
        checkIndex(i);
        Object[] objArr = this.array;
        Object obj = objArr[i];
        int i8 = (this.size - i) - 1;
        if (i8 > 0) {
            System.arraycopy(objArr, i + 1, objArr, i, i8);
        }
        Object[] objArr2 = this.array;
        int i9 = this.size - 1;
        this.size = i9;
        objArr2[i9] = null;
        return obj;
    }

    public Object set(int i, Object obj) {
        B.checkNotNull(obj, "element");
        checkIndex(i);
        Object obj2 = this.array[i];
        insert(i, obj);
        return obj2;
    }

    public int size() {
        return this.size;
    }

    private C0360k(C0358i iVar, int i) {
        this.recycler = iVar;
        this.array = new Object[i];
    }

    public void add(int i, Object obj) {
        B.checkNotNull(obj, "element");
        checkIndex(i);
        if (this.size == this.array.length) {
            expandArray();
        }
        int i8 = this.size;
        if (i != i8) {
            Object[] objArr = this.array;
            System.arraycopy(objArr, i, objArr, i + 1, i8 - i);
        }
        insert(i, obj);
        this.size++;
    }
}
