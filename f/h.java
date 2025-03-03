package F;

import E.e;
import G5.s;
import I.a;
import P6.f;
import Q0.g;
import W6.d;
import Y6.m;
import Z6.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import f2.C0898a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import k1.r;
import l1.i;
import o.C1280l0;
import o.C1306z;

public abstract class h {

    /* renamed from: U  reason: collision with root package name */
    public static volatile e f1406U = null;

    /* renamed from: V  reason: collision with root package name */
    public static int f1407V = 3;

    /* renamed from: W  reason: collision with root package name */
    public static long f1408W;

    /* renamed from: X  reason: collision with root package name */
    public static Method f1409X;

    /* renamed from: Y  reason: collision with root package name */
    public static Method f1410Y;

    /* renamed from: Z  reason: collision with root package name */
    public static Method f1411Z;

    /* renamed from: a0  reason: collision with root package name */
    public static boolean f1412a0;

    /* renamed from: b0  reason: collision with root package name */
    public static Field f1413b0;

    /* renamed from: c0  reason: collision with root package name */
    public static boolean f1414c0;

    public static void B(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0898a.b(i, H(str));
            return;
        }
        String H8 = H(str);
        try {
            if (f1410Y == null) {
                f1410Y = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f1410Y.invoke((Object) null, new Object[]{Long.valueOf(f1408W), H8, Integer.valueOf(i)});
        } catch (Exception e) {
            p(e, "traceCounter");
        }
    }

    public static void C(C1306z zVar, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.u(zVar, z);
            return;
        }
        if (!f1414c0) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f1413b0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            f1414c0 = true;
        }
        Field field = f1413b0;
        if (field != null) {
            try {
                field.set(zVar, Boolean.valueOf(z));
            } catch (IllegalAccessException e8) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e8);
            }
        }
    }

    public static void D(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.v(popupWindow, i);
            return;
        }
        if (!f1412a0) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f1411Z = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f1412a0 = true;
        }
        Method method = f1411Z;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    public static String E(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 'A' || charAt > 'Z') {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c8 = charArray[i];
                    if (c8 >= 'A' && c8 <= 'Z') {
                        charArray[i] = (char) (c8 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    public static String F(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 'a' || charAt > 'z') {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c8 = charArray[i];
                    if (c8 >= 'a' && c8 <= 'z') {
                        charArray[i] = (char) (c8 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    public static String G(String str) {
        if (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) {
            return str;
        }
        return str.substring(0, 23);
    }

    public static String H(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static void I(String str, String str2) {
        String G8 = G(str);
        if (u(5, G8)) {
            Log.w(G8, str2);
        }
    }

    public static void J(String str, String str2, Throwable th) {
        String G8 = G(str);
        if (u(5, G8)) {
            Log.w(G8, str2, th);
        }
    }

    public static void f(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    public static void g(String str, String str2) {
        String str3;
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == 9 || (' ' <= charAt && charAt < 127)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                if (b.p(str2)) {
                    str3 = "";
                } else {
                    str3 = ": ".concat(str);
                }
                sb.append(str3);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static i h(r rVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (rVar.d(i8, elapsedRealtime)) {
                i++;
            }
        }
        return new i(1, 0, length, i);
    }

    public static Drawable i(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23) {
            z = true;
        } else {
            z = false;
        }
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = e.z(drawable).mutate();
            if (mode == null) {
                return mutate;
            }
            mutate.setTintMode(mode);
            return mutate;
        } else if (!z) {
            return drawable;
        } else {
            drawable.mutate();
            return drawable;
        }
    }

    public static void j(String str, String str2) {
        String G8 = G(str);
        if (u(3, G8)) {
            Log.d(G8, str2);
        }
    }

    public static boolean k(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static void l(String str, String str2) {
        String G8 = G(str);
        if (u(6, G8)) {
            Log.e(G8, str2);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        String G8 = G(str);
        if (u(6, G8)) {
            Log.e(G8, str2, th);
        }
    }

    public static boolean n(String str, String str2) {
        char c8;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            char charAt2 = str2.charAt(i);
            if (charAt != charAt2 && ((c8 = (char) ((charAt | ' ') - 'a')) >= 26 || c8 != ((char) ((charAt2 | ' ') - 'a')))) {
                return false;
            }
        }
        return true;
    }

    public static ColorStateList o(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !C1280l0.m(drawable)) {
            return null;
        }
        return C1280l0.d(drawable).getColorStateList();
    }

    public static void p(Exception exc, String str) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static int q(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static int r(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(g.m(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean s(String str) {
        return u(3, G(str));
    }

    public static boolean t() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0898a.a();
        }
        Class<Trace> cls = Trace.class;
        try {
            if (f1409X == null) {
                f1408W = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f1409X = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f1409X.invoke((Object) null, new Object[]{Long.valueOf(f1408W)})).booleanValue();
        } catch (Exception e) {
            p(e, "isTagEnabled");
            return false;
        }
    }

    public static boolean u(int i, String str) {
        if (f1407V <= i || Log.isLoggable(str, i)) {
            return true;
        }
        return false;
    }

    public static List w(Object obj) {
        List singletonList = Collections.singletonList(obj);
        f.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static m x(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            int i8 = 0;
            while (i8 < length) {
                String str = strArr2[i8];
                if (str != null) {
                    strArr2[i8] = d.s0(str).toString();
                    i8++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            int r8 = s.r(0, strArr2.length - 1, 2);
            if (r8 >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    f(str2);
                    g(str3, str2);
                    if (i == r8) {
                        break;
                    }
                    i += 2;
                }
            }
            return new m(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    public void A() {
    }

    public void c() {
    }

    public void v() {
    }

    public abstract View y(int i);

    public abstract boolean z();
}
