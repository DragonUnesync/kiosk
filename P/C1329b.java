package p;

import B.C0014o;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g7.l;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k0.C1131a;

/* renamed from: p.b  reason: case insensitive filesystem */
public final class C1329b extends l {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14315a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f14316b = Executors.newFixedThreadPool(4, new C0014o(2));

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f14317c;

    public static Handler s(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1131a.a(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
