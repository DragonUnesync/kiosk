package Z5;

import Q0.g;
import g6.C0984q;

public final class S {
    private final Q[] values;
    private final int valuesMask;

    public S(Q... qArr) {
        Q[] qArr2 = new Q[C0984q.findNextPositivePowerOfTwo(qArr.length)];
        this.values = qArr2;
        this.valuesMask = qArr2.length - 1;
        int length = qArr.length;
        int i = 0;
        while (i < length) {
            Q q7 = qArr[i];
            int hashCode = hashCode(q7.key) & this.valuesMask;
            Q[] qArr3 = this.values;
            if (qArr3[hashCode] == null) {
                qArr3[hashCode] = q7;
                i++;
            } else {
                StringBuilder p3 = g.p(hashCode, "index ", " collision between values: [");
                p3.append(this.values[hashCode].key);
                p3.append(", ");
                p3.append(q7.key);
                p3.append(']');
                throw new IllegalArgumentException(p3.toString());
            }
        }
    }

    private static int hashCode(String str) {
        return str.hashCode() >>> 6;
    }
}
