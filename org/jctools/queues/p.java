package org.jctools.queues;

public interface p {
    public static final int UNBOUNDED_CAPACITY = -1;

    int capacity();

    void clear();

    int drain(l lVar);

    int drain(l lVar, int i);

    void drain(l lVar, o oVar, m mVar);

    int fill(n nVar);

    int fill(n nVar, int i);

    void fill(n nVar, o oVar, m mVar);

    boolean isEmpty();

    boolean offer(Object obj);

    Object peek();

    Object poll();

    boolean relaxedOffer(Object obj);

    Object relaxedPeek();

    Object relaxedPoll();

    int size();
}
