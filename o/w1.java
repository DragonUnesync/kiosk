package o;

import android.os.Build;
import java.lang.reflect.Method;

public abstract class w1 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14104a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f14105b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f14106c;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        f14106c = z;
    }
}
