package S5;

import g6.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class U implements V {
    private static final Iterator<T> EMPTY_METRICS = Collections.emptyList().iterator();
    private final S arena;
    private final int freeMaxThreshold;
    private final int freeMinThreshold;
    private T head;
    private final int maxCapacity;
    private final int maxUsage;
    private final int minUsage;
    private final U nextList;
    private U prevList;

    public U(S s8, U u3, int i, int i8, int i9) {
        int i10;
        this.arena = s8;
        this.nextList = u3;
        this.minUsage = i;
        this.maxUsage = i8;
        this.maxCapacity = calculateMaxCapacity(i, i9);
        int i11 = 0;
        if (i8 == 100) {
            i10 = 0;
        } else {
            i10 = (int) ((((100.0d - ((double) i8)) + 0.99999999d) * ((double) i9)) / 100.0d);
        }
        this.freeMinThreshold = i10;
        if (i != 100) {
            i11 = (int) ((((100.0d - ((double) i)) + 0.99999999d) * ((double) i9)) / 100.0d);
        }
        this.freeMaxThreshold = i11;
    }

    private static int calculateMaxCapacity(int i, int i8) {
        int minUsage0 = minUsage0(i);
        if (minUsage0 == 100) {
            return 0;
        }
        return (int) (((100 - ((long) minUsage0)) * ((long) i8)) / 100);
    }

    private static int minUsage0(int i) {
        return Math.max(1, i);
    }

    private boolean move(T t8) {
        if (t8.freeBytes > this.freeMaxThreshold) {
            return move0(t8);
        }
        add0(t8);
        return true;
    }

    private boolean move0(T t8) {
        U u3 = this.prevList;
        if (u3 == null) {
            return false;
        }
        return u3.move(t8);
    }

    private void remove(T t8) {
        if (t8 == this.head) {
            T t9 = t8.next;
            this.head = t9;
            if (t9 != null) {
                t9.prev = null;
                return;
            }
            return;
        }
        T t10 = t8.next;
        T t11 = t8.prev;
        t11.next = t10;
        if (t10 != null) {
            t10.prev = t11;
        }
    }

    public void add(T t8) {
        if (t8.freeBytes <= this.freeMinThreshold) {
            this.nextList.add(t8);
        } else {
            add0(t8);
        }
    }

    public void add0(T t8) {
        t8.parent = this;
        T t9 = this.head;
        if (t9 == null) {
            this.head = t8;
            t8.prev = null;
            t8.next = null;
            return;
        }
        t8.prev = null;
        t8.next = t9;
        t9.prev = t8;
        this.head = t8;
    }

    public boolean allocate(C0170f0 f0Var, int i, int i8, C0168e0 e0Var) {
        if (this.arena.sizeIdx2size(i8) > this.maxCapacity) {
            return false;
        }
        T t8 = this.head;
        while (t8 != null) {
            if (!t8.allocate(f0Var, i, i8, e0Var)) {
                t8 = t8.next;
            } else if (t8.freeBytes > this.freeMinThreshold) {
                return true;
            } else {
                remove(t8);
                this.nextList.add(t8);
                return true;
            }
        }
        return false;
    }

    public void destroy(S s8) {
        for (T t8 = this.head; t8 != null; t8 = t8.next) {
            s8.destroyChunk(t8);
        }
        this.head = null;
    }

    public boolean free(T t8, long j7, int i, ByteBuffer byteBuffer) {
        t8.free(j7, i, byteBuffer);
        if (t8.freeBytes <= this.freeMaxThreshold) {
            return true;
        }
        remove(t8);
        return move0(t8);
    }

    public Iterator<T> iterator() {
        Iterator<T> it;
        this.arena.lock();
        try {
            if (this.head == null) {
                it = EMPTY_METRICS;
            } else {
                ArrayList arrayList = new ArrayList();
                T t8 = this.head;
                do {
                    arrayList.add(t8);
                    t8 = t8.next;
                } while (t8 != null);
                it = arrayList.iterator();
            }
            return it;
        } finally {
            this.arena.unlock();
        }
    }

    public void prevList(U u3) {
        this.prevList = u3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.arena.lock();
        try {
            T t8 = this.head;
            if (t8 == null) {
                return "none";
            }
            while (true) {
                sb.append(t8);
                t8 = t8.next;
                if (t8 == null) {
                    this.arena.unlock();
                    return sb.toString();
                }
                sb.append(n0.NEWLINE);
            }
        } finally {
            this.arena.unlock();
        }
    }
}
