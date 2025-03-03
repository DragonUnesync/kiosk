package e6;

import T5.F;
import g6.n0;

public class O extends Throwable {
    /* access modifiers changed from: private */
    public static final O BOTTOM = new N();
    private final String hintString;
    /* access modifiers changed from: private */
    public final O next;
    /* access modifiers changed from: private */
    public final int pos;

    public String toString() {
        StringBuilder sb = new StringBuilder(2048);
        if (this.hintString != null) {
            sb.append("\tHint: ");
            sb.append(this.hintString);
            sb.append(n0.NEWLINE);
        }
        StackTraceElement[] stackTrace = getStackTrace();
        for (int i = 3; i < stackTrace.length; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            String[] strArr = (String[]) P.excludedMethods.get();
            int i8 = 0;
            while (true) {
                if (i8 < strArr.length) {
                    if (strArr[i8].equals(stackTraceElement.getClassName()) && strArr[i8 + 1].equals(stackTraceElement.getMethodName())) {
                        break;
                    }
                    i8 += 2;
                } else {
                    sb.append(9);
                    sb.append(stackTraceElement.toString());
                    sb.append(n0.NEWLINE);
                    break;
                }
            }
        }
        return sb.toString();
    }

    public O(O o2, Object obj) {
        this.hintString = obj instanceof T ? ((F) ((T) obj)).toHintString() : obj.toString();
        this.next = o2;
        this.pos = o2.pos + 1;
    }

    public O(O o2) {
        this.hintString = null;
        this.next = o2;
        this.pos = o2.pos + 1;
    }

    private O() {
        this.hintString = null;
        this.next = null;
        this.pos = -1;
    }
}
