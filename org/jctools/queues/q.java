package org.jctools.queues;

public final class q {
    private q() {
    }

    public static <E> int drain(p pVar, l lVar, int i) {
        int i8 = 0;
        while (i8 < i && pVar.relaxedPoll() != null) {
            lVar.a();
            i8++;
        }
        return i8;
    }

    public static <E> int drain(p pVar, l lVar) {
        int i = 0;
        while (pVar.relaxedPoll() != null) {
            i++;
            lVar.a();
        }
        return i;
    }

    public static <E> void drain(p pVar, l lVar, o oVar, m mVar) {
        while (mVar.a()) {
            if (pVar.relaxedPoll() == null) {
                oVar.a();
            } else {
                lVar.a();
            }
        }
    }
}
