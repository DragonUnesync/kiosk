package H6;

import android.os.Build;
import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Method f2202a;

    /* renamed from: b  reason: collision with root package name */
    public Method f2203b;

    /* renamed from: c  reason: collision with root package name */
    public Method f2204c;

    public /* synthetic */ b(Method method, Method method2, Method method3) {
        this.f2202a = method;
        this.f2203b = method2;
        this.f2204c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
