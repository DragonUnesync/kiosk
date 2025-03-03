package f2;

import android.os.Trace;

/* renamed from: f2.a  reason: case insensitive filesystem */
public abstract class C0898a {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static void b(int i, String str) {
        Trace.setCounter(str, (long) i);
    }
}
