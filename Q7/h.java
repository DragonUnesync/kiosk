package Q7;

import java.util.ArrayList;

public final class h extends IllegalArgumentException {

    /* renamed from: U  reason: collision with root package name */
    public static final String f4222U = g.class.getName();

    public final synchronized Throwable fillInStackTrace() {
        try {
            super.fillInStackTrace();
            StackTraceElement[] stackTrace = getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!stackTraceElement.getClassName().equals(f4222U)) {
                    arrayList.add(stackTraceElement);
                }
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        } finally {
            while (true) {
            }
        }
        return this;
    }
}
