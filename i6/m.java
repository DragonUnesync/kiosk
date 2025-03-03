package i6;

public abstract class m {
    public static boolean isEmpty(l lVar) {
        if (lVar.lvConsumerIndex() >= lVar.lvProducerIndex()) {
            return true;
        }
        return false;
    }

    public static int size(l lVar) {
        long lvProducerIndex;
        long lvConsumerIndex;
        long lvConsumerIndex2 = lVar.lvConsumerIndex();
        while (true) {
            lvProducerIndex = lVar.lvProducerIndex();
            lvConsumerIndex = lVar.lvConsumerIndex();
            if (lvConsumerIndex2 == lvConsumerIndex) {
                break;
            }
            lvConsumerIndex2 = lvConsumerIndex;
        }
        long j7 = lvProducerIndex - lvConsumerIndex;
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < 0) {
            return 0;
        }
        if (lVar.capacity() == -1 || j7 <= ((long) lVar.capacity())) {
            return (int) j7;
        }
        return lVar.capacity();
    }
}
