package g6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public abstract class x0 {
    public static void addSuppressed(Throwable th, Throwable th2) {
        if (haveSuppressed()) {
            th.addSuppressed(th2);
        }
    }

    public static void addSuppressedAndClear(Throwable th, List<Throwable> list) {
        addSuppressed(th, list);
        list.clear();
    }

    public static Throwable[] getSuppressed(Throwable th) {
        if (!haveSuppressed()) {
            return C0978k.EMPTY_THROWABLES;
        }
        return th.getSuppressed();
    }

    public static boolean haveSuppressed() {
        if (Y.javaVersion() >= 7) {
            return true;
        }
        return false;
    }

    public static String stackTraceToString(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        try {
            return new String(byteArrayOutputStream.toByteArray());
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static <T extends Throwable> T unknownStackTrace(T t8, Class<?> cls, String str) {
        t8.setStackTrace(new StackTraceElement[]{new StackTraceElement(cls.getName(), str, (String) null, -1)});
        return t8;
    }

    public static void addSuppressed(Throwable th, List<Throwable> list) {
        for (Throwable addSuppressed : list) {
            addSuppressed(th, addSuppressed);
        }
    }
}
