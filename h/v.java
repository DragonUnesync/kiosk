package h;

import V0.C0337b;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.o;
import j$.util.Objects;

public abstract class v {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, C1000A a8) {
        Objects.requireNonNull(a8);
        o oVar = new o(1, a8);
        C0337b.g(obj).registerOnBackInvokedCallback(1000000, oVar);
        return oVar;
    }

    public static void c(Object obj, Object obj2) {
        C0337b.g(obj).unregisterOnBackInvokedCallback(C0337b.d(obj2));
    }
}
