package v0;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import m0.C1197c;

/* renamed from: v0.X  reason: case insensitive filesystem */
public final class C1525X extends a0 {
    public static Field e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f15909f;

    /* renamed from: g  reason: collision with root package name */
    public static Constructor f15910g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f15911h;

    /* renamed from: c  reason: collision with root package name */
    public WindowInsets f15912c;

    /* renamed from: d  reason: collision with root package name */
    public C1197c f15913d;

    public C1525X() {
        this.f15912c = i();
    }

    private static WindowInsets i() {
        Class<WindowInsets> cls = WindowInsets.class;
        if (!f15909f) {
            try {
                e = cls.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
            }
            f15909f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
            }
        }
        if (!f15911h) {
            try {
                f15910g = cls.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f15911h = true;
        }
        Constructor constructor = f15910g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    public j0 b() {
        a();
        j0 g8 = j0.g((View) null, this.f15912c);
        C1197c[] cVarArr = this.f15917b;
        g0 g0Var = g8.f15952a;
        g0Var.o(cVarArr);
        g0Var.q(this.f15913d);
        return g8;
    }

    public void e(C1197c cVar) {
        this.f15913d = cVar;
    }

    public void g(C1197c cVar) {
        WindowInsets windowInsets = this.f15912c;
        if (windowInsets != null) {
            this.f15912c = windowInsets.replaceSystemWindowInsets(cVar.f13316a, cVar.f13317b, cVar.f13318c, cVar.f13319d);
        }
    }

    public C1525X(j0 j0Var) {
        super(j0Var);
        this.f15912c = j0Var.f();
    }
}
