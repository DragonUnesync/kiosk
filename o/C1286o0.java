package o;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.lang.reflect.InvocationTargetException;
import n0.C1233b;
import n0.C1234c;

/* renamed from: o.o0  reason: case insensitive filesystem */
public abstract class C1286o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f14020a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f14021b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f14022c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = f14020a;
        int[] iArr2 = f14021b;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
        } else if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state2 = drawable.getState();
            if (state2 == null || state2.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state2);
        }
    }

    public static Rect b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets a8 = C1284n0.a(drawable);
            return new Rect(a8.left, a8.top, a8.right, a8.bottom);
        }
        if (drawable instanceof C1233b) {
            drawable = ((C1234c) ((C1233b) drawable)).f13560Z;
        }
        if (i >= 29) {
            boolean z = C1282m0.f14007a;
        } else if (C1282m0.f14007a) {
            try {
                Object invoke = C1282m0.f14008b.invoke(drawable, (Object[]) null);
                if (invoke != null) {
                    return new Rect(C1282m0.f14009c.getInt(invoke), C1282m0.f14010d.getInt(invoke), C1282m0.e.getInt(invoke), C1282m0.f14011f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f14022c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case EnterpriseDeviceManager.KNOX_2_3:
                return PorterDuff.Mode.MULTIPLY;
            case EnterpriseDeviceManager.KNOX_2_4:
                return PorterDuff.Mode.SCREEN;
            case EnterpriseDeviceManager.KNOX_2_4_1:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
