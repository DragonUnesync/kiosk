package F2;

import A.f;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

public final class g {
    public static final int e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1523a;

    /* renamed from: b  reason: collision with root package name */
    public final ActivityManager f1524b;

    /* renamed from: c  reason: collision with root package name */
    public final f f1525c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1526d = ((float) e);

    static {
        int i;
        if (Build.VERSION.SDK_INT < 26) {
            i = 4;
        } else {
            i = 1;
        }
        e = i;
    }

    public g(Context context) {
        this.f1523a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f1524b = activityManager;
        this.f1525c = new f(16, (Object) context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.f1526d = 0.0f;
        }
    }
}
