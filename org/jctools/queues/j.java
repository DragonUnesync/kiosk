package org.jctools.queues;

public final class j {
    public static boolean isEmpty(i iVar) {
        if (iVar.lvConsumerIndex() == iVar.lvProducerIndex()) {
            return true;
        }
        return false;
    }

    public static int size(i iVar) {
        long lvProducerIndex;
        long lvConsumerIndex;
        long lvConsumerIndex2 = iVar.lvConsumerIndex();
        while (true) {
            lvProducerIndex = iVar.lvProducerIndex();
            lvConsumerIndex = iVar.lvConsumerIndex();
            if (lvConsumerIndex2 == lvConsumerIndex) {
                break;
            }
            lvConsumerIndex2 = lvConsumerIndex;
        }
        long j7 = lvProducerIndex - lvConsumerIndex;
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j7;
    }
}
