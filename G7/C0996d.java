package g7;

import B.C0003d;
import B.q0;
import I6.b;
import K6.a;
import N.e;
import P6.f;
import S7.h;
import S7.p;
import S7.q;
import T7.C0287b;
import T7.i1;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.activity.v;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import l0.l;
import l7.d;
import n6.c;
import p6.C1345a;
import u.C1477r;
import v.r;
import y6.C1638c;

/* renamed from: g7.d  reason: case insensitive filesystem */
public abstract class C0996d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f12028a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f12029b;

    public static void a(Throwable th, Throwable th2) {
        f.e(th, "<this>");
        f.e(th2, "exception");
        if (th != th2) {
            Integer num = a.f2664a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = J6.a.f2519a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        }
    }

    public static d b() {
        d dVar = d.f13211l;
        f.b(dVar);
        d dVar2 = dVar.f13212f;
        if (dVar2 == null) {
            long nanoTime = System.nanoTime();
            d.i.await(d.f13209j, TimeUnit.MILLISECONDS);
            d dVar3 = d.f13211l;
            f.b(dVar3);
            if (dVar3.f13212f != null || System.nanoTime() - nanoTime < d.f13210k) {
                return null;
            }
            return d.f13211l;
        }
        long nanoTime2 = dVar2.f13213g - System.nanoTime();
        if (nanoTime2 > 0) {
            d.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        d dVar4 = d.f13211l;
        f.b(dVar4);
        dVar4.f13212f = dVar2.f13212f;
        dVar2.f13212f = null;
        return dVar2;
    }

    public static l6.f c(Callable callable) {
        try {
            Object call = callable.call();
            C1345a.a(call, "Scheduler Callable result can't be null");
            return (l6.f) call;
        } catch (Throwable th) {
            throw C1638c.a(th);
        }
    }

    public static void d(int i, int i8) {
        if (i >= 0 && i <= i8) {
            return;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C1477r.c(i, "Cursor index must not be smaller than 0, but was ", "."));
        }
        throw new IndexOutOfBoundsException(e.v("Cursor index must not be greater than the size (", i8, "), but was ", i, "."));
    }

    public static String e(r rVar, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) rVar.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) rVar.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }

    public static void f(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(C1477r.c(i, "Immutable list must not contain a null element, found at index ", "."));
        }
    }

    public static final b g(Enum[] enumArr) {
        f.e(enumArr, "entries");
        return new b(enumArr);
    }

    public static Drawable h(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f12028a) {
                return m(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f12028a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return context2.getDrawable(i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = l.f13083a;
        return resources.getDrawable(i, theme);
    }

    public static String i(Uri uri) {
        String str;
        f.e(uri, "uri");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        if (fileExtensionFromUrl != null) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
            f.d(lowerCase, "toLowerCase(...)");
            str = singleton.getMimeTypeFromExtension(lowerCase);
            if (str == null && "json".equals(fileExtensionFromUrl)) {
                str = "application/json";
            }
        } else {
            str = null;
        }
        if (str == null) {
            return "application/octet-stream";
        }
        return str;
    }

    public static void j(int i, int i8) {
        if (i >= 0 && i < i8) {
            return;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C1477r.c(i, "Index must not be smaller than 0, but was ", "."));
        }
        throw new IndexOutOfBoundsException(e.v("Index must not be greater than or equal to the size (", i8, "), but was ", i, "."));
    }

    public static void k(int i, int i8, int i9) {
        if (i >= 0 && i <= i8 && i8 <= i9) {
            return;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C1477r.c(i, "Start index must not be smaller than 0, but was ", "."));
        } else if (i > i8) {
            throw new IndexOutOfBoundsException(e.v("Start index must not be greater than the end index, but ", i, " > ", i8, "."));
        } else {
            throw new IndexOutOfBoundsException(e.v("End index must not be greater than or equal to the size (", i9, "), but was ", i8, "."));
        }
    }

    public static boolean l() {
        return C0997e.f12030d;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m.c, android.content.ContextWrapper] */
    public static Drawable m(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            ? contextWrapper = new ContextWrapper(context);
            contextWrapper.f13259b = theme;
            contextWrapper.a(theme.getResources().getConfiguration());
            context = contextWrapper;
        }
        return C0003d.r(context, i);
    }

    public static Typeface n(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, n2.a.o(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static void o(String str, String str2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(str2.concat(" must be at least one character long."));
        }
    }

    public static void p(Object obj, Class cls, String str) {
        r(obj, str);
        q(obj, cls, str);
    }

    public static void q(Object obj, Class cls, String str) {
        if (!cls.isInstance(obj)) {
            StringBuilder B8 = e.B(str, " must not be implemented by the user, but was implemented by ");
            B8.append(obj.getClass().getTypeName());
            B8.append(".");
            throw new IllegalArgumentException(B8.toString());
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null."));
        }
    }

    public static void s(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof n6.d) && !(th instanceof c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof n6.b)) {
            th = new IllegalStateException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static q0 t(p pVar) {
        h hVar;
        p B8 = pVar.B();
        if (B8 instanceof h) {
            hVar = (h) B8;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            return hVar.f4554e0;
        }
        return new q0((i1) new C0287b());
    }

    public static void u(float[] fArr, float f8) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f8, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void v(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static void w(O0.a aVar) {
        aVar.f3503k = -3.4028235E38f;
        aVar.f3502j = RecyclerView.UNDEFINED_DURATION;
        CharSequence charSequence = aVar.f3495a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f3495a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f3495a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float x(int i, float f8, int i8, int i9) {
        float f9;
        if (f8 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f9 = (float) i9;
        } else if (i == 1) {
            f9 = (float) i8;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f8;
        }
        return f8 * f9;
    }

    public static final void y(View view, v vVar) {
        f.e(view, "<this>");
        view.setTag(2131362624, vVar);
    }

    public static Stream z(p pVar, Class cls) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new q(pVar, cls), 273), false);
    }
}
