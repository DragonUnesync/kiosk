package g2;

import android.os.Build;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11999a;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        f11999a = z;
    }
}
