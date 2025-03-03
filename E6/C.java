package e6;

import i6.o;
import i6.q;
import java.util.ArrayDeque;
import java.util.Queue;

public final class C implements q {
    private final Queue<Object> deque = new ArrayDeque();
    private final int maxCapacity;

    public C(int i) {
        this.maxCapacity = i;
    }

    public synchronized void clear() {
        this.deque.clear();
    }

    public int drain(o oVar, int i) {
        int i8 = 0;
        while (i8 < i) {
            Object poll = poll();
            if (poll == null) {
                break;
            }
            ((G) oVar).accept(poll);
            i8++;
        }
        return i8;
    }

    public synchronized boolean offer(Object obj) {
        if (this.deque.size() == this.maxCapacity) {
            return false;
        }
        return this.deque.offer(obj);
    }

    public synchronized Object poll() {
        return this.deque.poll();
    }

    public boolean relaxedOffer(Object obj) {
        return offer(obj);
    }

    public Object relaxedPoll() {
        return poll();
    }
}
