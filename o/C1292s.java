package o;

import T0.g0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* renamed from: o.s  reason: case insensitive filesystem */
public final class C1292s {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f14065b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C1292s f14066c;

    /* renamed from: a  reason: collision with root package name */
    public O0 f14067a;

    public static synchronized C1292s a() {
        C1292s sVar;
        synchronized (C1292s.class) {
            try {
                if (f14066c == null) {
                    d();
                }
                sVar = f14066c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return sVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h5;
        synchronized (C1292s.class) {
            h5 = O0.h(i, mode);
        }
        return h5;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [o.s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [u.O, java.lang.Object] */
    public static synchronized void d() {
        synchronized (C1292s.class) {
            if (f14066c == null) {
                ? obj = new Object();
                f14066c = obj;
                obj.f14067a = O0.d();
                O0 o02 = f14066c.f14067a;
                ? obj2 = new Object();
                obj2.f15529a = new int[]{2131230836, 2131230834, 2131230760};
                obj2.f15530b = new int[]{2131230784, 2131230819, 2131230791, 2131230786, 2131230787, 2131230790, 2131230789};
                obj2.f15531c = new int[]{2131230833, 2131230835, 2131230777, 2131230829, 2131230830, 2131230831, 2131230832};
                obj2.f15532d = new int[]{2131230809, 2131230775, 2131230808};
                obj2.e = new int[]{2131230827, 2131230837};
                obj2.f15533f = new int[]{2131230763, 2131230769, 2131230764, 2131230770};
                o02.m(obj2);
            }
        }
    }

    public static void e(Drawable drawable, g0 g0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = O0.f13864h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = g0Var.f4840d;
            if (z || g0Var.f4839c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z) {
                    colorStateList = (ColorStateList) g0Var.f4838b;
                } else {
                    colorStateList = null;
                }
                if (g0Var.f4839c) {
                    mode = (PorterDuff.Mode) g0Var.e;
                } else {
                    mode = O0.f13864h;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = O0.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f14067a.f(context, i);
    }
}
