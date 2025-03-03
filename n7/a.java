package N7;

import B2.e;
import D6.v;
import H3.n0;
import K2.w;
import P0.z;
import P6.f;
import Q0.g;
import R0.k;
import R0.l;
import X0.b;
import X0.m;
import Y6.s;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k0.C1131a;
import k2.C1149f;
import l1.j;
import n2.i;
import n7.C1247a;
import o.C1260b0;
import org.acra.ErrorReporter;
import q0.C1355b;
import r7.C1392a;
import r7.C1395d;
import t0.C1415c;
import u2.d;
import u2.t;
import u2.u;
import y0.C1622h;

public abstract class a {
    public static Map A(EnumMap enumMap, j jVar) {
        return new v(enumMap, jVar);
    }

    public static ActionMode.Callback B(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof C1622h) || callback == null) {
            return callback;
        }
        return new C1622h(callback, textView);
    }

    public static int a(View view) {
        f.e(view, "<this>");
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(g.m(visibility, "Unknown visibility "));
    }

    public static l b(m mVar, String str, X0.j jVar, int i) {
        k kVar = new k();
        kVar.f4271a = P0.l.z(str, jVar.f6253c);
        kVar.f4274d = jVar.f6251a;
        kVar.e = jVar.f6252b;
        String a8 = mVar.a();
        if (a8 == null) {
            a8 = P0.l.z(((b) mVar.f6259V.get(0)).f6210a, jVar.f6253c).toString();
        }
        kVar.f4275f = a8;
        kVar.f4276g = i;
        kVar.f4273c = n0.f2094a0;
        P0.l.l(kVar.f4271a, "The uri must be set.");
        return new l(kVar.f4271a, kVar.f4272b, (byte[]) null, kVar.f4273c, kVar.f4274d, kVar.e, kVar.f4275f, kVar.f4276g);
    }

    public static Object c(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void d(Serializable serializable) {
        Log.e("RootBeer", m() + String.valueOf(serializable));
        Log.e("QLog", m() + String.valueOf(serializable));
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static InvocationHandler f() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = C1149f.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", (Class[]) null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke((Object) null, (Object[]) null).getClass().getClassLoader();
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException(e8);
            } catch (IllegalAccessException e9) {
                throw new RuntimeException(e9);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", (Class[]) null).invoke((Object) null, (Object[]) null);
    }

    public static final C1392a g(C1395d dVar, Class cls) {
        f.e(dVar, "<this>");
        f.e(cls, "c");
        ErrorReporter errorReporter = C1247a.f13789a;
        for (C1392a aVar : dVar.f14978u0) {
            ErrorReporter errorReporter2 = C1247a.f13789a;
            if (cls.isAssignableFrom(aVar.getClass())) {
                return aVar;
            }
        }
        return null;
    }

    public static s h(String str) {
        if (str.equals("http/1.0")) {
            return s.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return s.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return s.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return s.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return s.SPDY_3;
        }
        if (str.equals("quic")) {
            return s.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static u2.v i(Object obj) {
        if (obj == null) {
            return u2.k.f15755U;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return d.f15748W;
            }
            return d.f15747V;
        } else if (obj instanceof Byte) {
            return new u2.l(((Byte) obj).byteValue());
        } else {
            if (obj instanceof Character) {
                return new u2.l(((Character) obj).charValue());
            }
            if (obj instanceof Double) {
                return new u2.m(Double.doubleToLongBits(((Double) obj).doubleValue()));
            }
            if (obj instanceof Float) {
                return new u2.l(Float.floatToIntBits(((Float) obj).floatValue()));
            }
            if (obj instanceof Integer) {
                return u2.j.i(((Integer) obj).intValue());
            }
            if (obj instanceof Long) {
                return new u2.m(((Long) obj).longValue());
            }
            if (obj instanceof Short) {
                return new u2.l(((Short) obj).shortValue());
            }
            if (obj instanceof String) {
                return new t((String) obj);
            }
            if (obj instanceof Class) {
                return new u(i.a((Class) obj).f13754b);
            }
            if (obj instanceof i) {
                return new u(((i) obj).f13754b);
            }
            throw new UnsupportedOperationException("Not a constant: " + obj);
        }
    }

    public static int j(ArrayList arrayList, InputStream inputStream, E2.g gVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            try {
                int c8 = ((e) arrayList.get(i)).c(inputStream, gVar);
                if (c8 != -1) {
                    return c8;
                }
                i++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static final C1392a k(C1395d dVar, Class cls) {
        f.e(dVar, "<this>");
        C1392a g8 = g(dVar, cls);
        if (g8 != null) {
            return g8;
        }
        throw new IllegalArgumentException(cls.getName().concat(" is no registered configuration"));
    }

    public static C1415c l(C1260b0 b0Var) {
        int i;
        int i8;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            return new C1415c(C1131a.k(b0Var));
        }
        TextPaint textPaint = new TextPaint(b0Var.getPaint());
        boolean z = false;
        if (i9 >= 23) {
            i8 = 1;
            i = 1;
        } else {
            i8 = 0;
            i = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i9 >= 23) {
            i8 = I.a.d(b0Var);
            i = I.a.h(b0Var);
        }
        if (b0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i9 < 28 || (b0Var.getInputType() & 15) != 3) {
            if (b0Var.getLayoutDirection() == 1) {
                z = true;
            }
            switch (b0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(C1131a.c(C1355b.b(b0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C1415c(textPaint, textDirectionHeuristic, i8, i);
    }

    public static String m() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        String substring = className.substring(className.lastIndexOf(46) + 1);
        return substring + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser$ImageType n(ArrayList arrayList, InputStream inputStream, E2.g gVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            try {
                ImageHeaderParser$ImageType d8 = ((e) arrayList.get(i)).d(inputStream);
                inputStream.reset();
                if (d8 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return d8;
                }
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser$ImageType o(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            try {
                ImageHeaderParser$ImageType a8 = ((e) arrayList.get(i)).a(byteBuffer);
                AtomicReference atomicReference = W2.b.f6155a;
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(0);
                if (a8 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a8;
                }
                i++;
            } catch (Throwable th) {
                AtomicReference atomicReference2 = W2.b.f6155a;
                ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(0);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static void p(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e) {
                w(cls, e);
                throw null;
            } catch (IllegalAccessException e8) {
                w(cls, e8);
                throw null;
            } catch (NoSuchMethodException e9) {
                w(cls, e9);
                throw null;
            } catch (InvocationTargetException e10) {
                w(cls, e10);
                throw null;
            }
        } catch (ClassNotFoundException e11) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e11);
        }
    }

    public static void s(TextView textView, int i) {
        int i8;
        n2.a.k(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C1131a.m(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i8 = fontMetricsInt.top;
        } else {
            i8 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void t(TextView textView, int i) {
        int i8;
        n2.a.k(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i8 = fontMetricsInt.bottom;
        } else {
            i8 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i8);
        }
    }

    public static void u(TextView textView, int i) {
        n2.a.k(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    public static void v(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void w(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static long x(long j7, long j8, long j9, int i) {
        int i8 = z.f3748a;
        return j7 + z.W(j8 - j9, 1000000, (long) i, RoundingMode.DOWN);
    }

    public static ActionMode.Callback y(ActionMode.Callback callback) {
        if (!(callback instanceof C1622h) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((C1622h) callback).f16359a;
    }

    public static void z(String str) {
        Log.v("RootBeer", m() + String.valueOf(str));
    }

    public void q(boolean z) {
    }

    public void r(boolean z) {
    }
}
