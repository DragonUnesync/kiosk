package e6;

import g6.Y;
import g6.n0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class L extends WeakReference implements U {
    private static final AtomicIntegerFieldUpdater<L> droppedRecordsUpdater;
    private static final AtomicReferenceFieldUpdater<L, O> headUpdater;
    private final Set<L> allLeaks;
    private volatile int droppedRecords;
    private volatile O head;
    private final int trackedHash;

    static {
        Class<L> cls = L.class;
        headUpdater = AtomicReferenceFieldUpdater.newUpdater(cls, O.class, "head");
        droppedRecordsUpdater = AtomicIntegerFieldUpdater.newUpdater(cls, "droppedRecords");
    }

    public L(Object obj, ReferenceQueue<Object> referenceQueue, Set<L> set, Object obj2) {
        super(obj, referenceQueue);
        O o2;
        this.trackedHash = System.identityHashCode(obj);
        set.add(this);
        AtomicReferenceFieldUpdater<L, O> atomicReferenceFieldUpdater = headUpdater;
        if (obj2 == null) {
            o2 = new O(O.BOTTOM);
        } else {
            o2 = new O(O.BOTTOM, obj2);
        }
        atomicReferenceFieldUpdater.set(this, o2);
        this.allLeaks = set;
    }

    private String generateReport(O o2) {
        if (o2 == null) {
            return "";
        }
        int i = droppedRecordsUpdater.get(this);
        int i8 = 1;
        int access$300 = o2.pos + 1;
        StringBuilder sb = new StringBuilder(access$300 * 2048);
        String str = n0.NEWLINE;
        sb.append(str);
        sb.append("Recent access records: ");
        sb.append(str);
        HashSet hashSet = new HashSet(access$300);
        int i9 = 0;
        while (o2 != O.BOTTOM) {
            String o8 = o2.toString();
            if (!hashSet.add(o8)) {
                i9++;
            } else if (o2.next == O.BOTTOM) {
                sb.append("Created at:");
                sb.append(n0.NEWLINE);
                sb.append(o8);
            } else {
                sb.append('#');
                sb.append(i8);
                sb.append(':');
                sb.append(n0.NEWLINE);
                sb.append(o8);
                i8++;
            }
            o2 = o2.next;
        }
        if (i9 > 0) {
            sb.append(": ");
            sb.append(i9);
            sb.append(" leak records were discarded because they were duplicates");
            sb.append(n0.NEWLINE);
        }
        if (i > 0) {
            sb.append(": ");
            sb.append(i);
            sb.append(" leak records were discarded because the leak record count is targeted to ");
            sb.append(P.TARGET_RECORDS);
            sb.append(". Use system property io.netty.leakDetection.targetRecords to increase the limit.");
            sb.append(n0.NEWLINE);
        }
        sb.setLength(sb.length() - n0.NEWLINE.length());
        return sb.toString();
    }

    private static void reachabilityFence0(Object obj) {
        if (obj != null) {
            synchronized (obj) {
            }
        }
    }

    private void record0(Object obj) {
        O o2;
        O o8;
        if (P.TARGET_RECORDS > 0) {
            while (true) {
                AtomicReferenceFieldUpdater<L, O> atomicReferenceFieldUpdater = headUpdater;
                O o9 = atomicReferenceFieldUpdater.get(this);
                if (o9 != null) {
                    boolean z = true;
                    int access$300 = o9.pos + 1;
                    boolean z6 = false;
                    if (access$300 >= P.TARGET_RECORDS) {
                        if (Y.threadLocalRandom().nextInt(1 << Math.min(access$300 - P.TARGET_RECORDS, 30)) == 0) {
                            z = false;
                        }
                        if (z) {
                            o2 = o9.next;
                        } else {
                            o2 = o9;
                        }
                        z6 = z;
                    } else {
                        o2 = o9;
                    }
                    if (obj == null) {
                        o8 = new O(o2);
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, o9, o8)) {
                            if (z6) {
                                droppedRecordsUpdater.incrementAndGet(this);
                                return;
                            }
                            return;
                        } else if (atomicReferenceFieldUpdater.get(this) != o9) {
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public boolean close() {
        if (!this.allLeaks.remove(this)) {
            return false;
        }
        clear();
        headUpdater.set(this, (Object) null);
        return true;
    }

    public boolean dispose() {
        clear();
        return this.allLeaks.remove(this);
    }

    public String getReportAndClearRecords() {
        return generateReport(headUpdater.getAndSet(this, (Object) null));
    }

    public void record() {
        record0((Object) null);
    }

    public String toString() {
        return generateReport(headUpdater.get(this));
    }

    public void record(Object obj) {
        record0(obj);
    }

    public boolean close(Object obj) {
        try {
            return close();
        } finally {
            reachabilityFence0(obj);
        }
    }
}
