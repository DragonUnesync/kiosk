package i6;

import Q0.g;
import e6.G;

public abstract class r {
    public static <E> int drain(q qVar, o oVar, int i) {
        if (oVar == null) {
            throw new IllegalArgumentException("c is null");
        } else if (i >= 0) {
            int i8 = 0;
            if (i == 0) {
                return 0;
            }
            while (i8 < i) {
                Object relaxedPoll = qVar.relaxedPoll();
                if (relaxedPoll == null) {
                    break;
                }
                ((G) oVar).accept(relaxedPoll);
                i8++;
            }
            return i8;
        } else {
            throw new IllegalArgumentException(g.m(i, "limit is negative: "));
        }
    }
}
