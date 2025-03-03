package v0;

import F.h;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k0.C1131a;
import m0.C1197c;

public abstract class b0 extends g0 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f15921h;
    public static Method i;

    /* renamed from: j  reason: collision with root package name */
    public static Class f15922j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f15923k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f15924l;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f15925c;

    /* renamed from: d  reason: collision with root package name */
    public C1197c[] f15926d;
    public C1197c e = null;

    /* renamed from: f  reason: collision with root package name */
    public j0 f15927f;

    /* renamed from: g  reason: collision with root package name */
    public C1197c f15928g;

    public b0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var);
        this.f15925c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private C1197c r(int i8, boolean z) {
        C1197c cVar = C1197c.e;
        for (int i9 = 1; i9 <= 256; i9 <<= 1) {
            if ((i8 & i9) != 0) {
                cVar = C1197c.a(cVar, s(i9, z));
            }
        }
        return cVar;
    }

    private C1197c t() {
        j0 j0Var = this.f15927f;
        if (j0Var != null) {
            return j0Var.f15952a.h();
        }
        return C1197c.e;
    }

    private C1197c u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f15921h) {
                v();
            }
            Method method = i;
            if (!(method == null || f15922j == null || f15923k == null)) {
                try {
                    Object invoke = method.invoke(view, (Object[]) null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f15923k.get(f15924l.get(invoke));
                    if (rect != null) {
                        return C1197c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e8) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f15922j = cls;
            f15923k = cls.getDeclaredField("mVisibleInsets");
            f15924l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f15923k.setAccessible(true);
            f15924l.setAccessible(true);
        } catch (ReflectiveOperationException e8) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
        }
        f15921h = true;
    }

    public void d(View view) {
        C1197c u3 = u(view);
        if (u3 == null) {
            u3 = C1197c.e;
        }
        w(u3);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f15928g, ((b0) obj).f15928g);
    }

    public C1197c f(int i8) {
        return r(i8, false);
    }

    public final C1197c j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.f15925c;
            this.e = C1197c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    public j0 l(int i8, int i9, int i10, int i11) {
        a0 a0Var;
        j0 g8 = j0.g((View) null, this.f15925c);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            a0Var = new C1527Z(g8);
        } else if (i12 >= 29) {
            a0Var = new C1526Y(g8);
        } else {
            a0Var = new C1525X(g8);
        }
        a0Var.g(j0.e(j(), i8, i9, i10, i11));
        a0Var.e(j0.e(h(), i8, i9, i10, i11));
        return a0Var.b();
    }

    public boolean n() {
        return this.f15925c.isRound();
    }

    public void o(C1197c[] cVarArr) {
        this.f15926d = cVarArr;
    }

    public void p(j0 j0Var) {
        this.f15927f = j0Var;
    }

    public C1197c s(int i8, boolean z) {
        int i9;
        C1535h hVar;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (i8 != 1) {
            C1197c cVar = null;
            if (i8 != 2) {
                C1197c cVar2 = C1197c.e;
                if (i8 == 8) {
                    C1197c[] cVarArr = this.f15926d;
                    if (cVarArr != null) {
                        cVar = cVarArr[h.r(8)];
                    }
                    if (cVar != null) {
                        return cVar;
                    }
                    C1197c j7 = j();
                    C1197c t8 = t();
                    int i14 = j7.f13319d;
                    if (i14 > t8.f13319d) {
                        return C1197c.b(0, 0, 0, i14);
                    }
                    C1197c cVar3 = this.f15928g;
                    if (cVar3 == null || cVar3.equals(cVar2) || (i9 = this.f15928g.f13319d) <= t8.f13319d) {
                        return cVar2;
                    }
                    return C1197c.b(0, 0, 0, i9);
                } else if (i8 == 16) {
                    return i();
                } else {
                    if (i8 == 32) {
                        return g();
                    }
                    if (i8 == 64) {
                        return k();
                    }
                    if (i8 != 128) {
                        return cVar2;
                    }
                    j0 j0Var = this.f15927f;
                    if (j0Var != null) {
                        hVar = j0Var.f15952a.e();
                    } else {
                        hVar = e();
                    }
                    if (hVar == null) {
                        return cVar2;
                    }
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 28) {
                        i10 = C1131a.g(hVar.f15950a);
                    } else {
                        i10 = 0;
                    }
                    if (i15 >= 28) {
                        i11 = C1131a.i(hVar.f15950a);
                    } else {
                        i11 = 0;
                    }
                    if (i15 >= 28) {
                        i12 = C1131a.h(hVar.f15950a);
                    } else {
                        i12 = 0;
                    }
                    if (i15 >= 28) {
                        i13 = C1131a.f(hVar.f15950a);
                    }
                    return C1197c.b(i10, i11, i12, i13);
                }
            } else if (z) {
                C1197c t9 = t();
                C1197c h5 = h();
                return C1197c.b(Math.max(t9.f13316a, h5.f13316a), 0, Math.max(t9.f13318c, h5.f13318c), Math.max(t9.f13319d, h5.f13319d));
            } else {
                C1197c j8 = j();
                j0 j0Var2 = this.f15927f;
                if (j0Var2 != null) {
                    cVar = j0Var2.f15952a.h();
                }
                int i16 = j8.f13319d;
                if (cVar != null) {
                    i16 = Math.min(i16, cVar.f13319d);
                }
                return C1197c.b(j8.f13316a, 0, j8.f13318c, i16);
            }
        } else if (z) {
            return C1197c.b(0, Math.max(t().f13317b, j().f13317b), 0, 0);
        } else {
            return C1197c.b(0, j().f13317b, 0, 0);
        }
    }

    public void w(C1197c cVar) {
        this.f15928g = cVar;
    }
}
