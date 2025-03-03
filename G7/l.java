package g7;

import C6.e;
import D.C0054l;
import D.C0056m;
import Q7.g;
import T0.C0232y;
import U0.h;
import U0.j;
import W6.d;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c5.C0618a;
import j0.f;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Logger;
import l5.b;
import l7.c;
import l7.m;
import l7.v;
import n2.a;
import o5.C1321a;
import o5.C1323c;
import t5.C1431c;
import u.C1446F;
import u.C1482w;
import u5.C1494a;

public abstract class l {
    public static void a() {
        a.m("Not in application's main thread", h());
    }

    public static boolean b(Context context) {
        if (!a.y0()) {
            return true;
        }
        if (a.q0() && Environment.isExternalStorageManager()) {
            return true;
        }
        if (!a.E0() || a.b0(context) < 33) {
            if (f.a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                return true;
            }
            return false;
        } else if (!a.F0() || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 34) {
            if (f.a(context, "android.permission.READ_MEDIA_IMAGES") == 0 || f.a(context, "android.permission.READ_MEDIA_VIDEO") == 0 || f.a(context, "android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            return false;
        } else if (f.a(context, "android.permission.READ_MEDIA_IMAGES") == 0 || f.a(context, "android.permission.READ_MEDIA_VIDEO") == 0 || f.a(context, "android.permission.READ_MEDIA_AUDIO") == 0 || f.a(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static final void c(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C0996d.a(th, th2);
        }
    }

    public static void d(String str, String str2) {
        Log.e(str, str2);
    }

    public static long e(double d8) {
        g.d("not a normal value", g(d8));
        int exponent = Math.getExponent(d8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d8) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    public static final boolean f(AssertionError assertionError) {
        boolean z;
        Logger logger = m.f13230a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z = d.c0(message, "getsockname failed");
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public static boolean g(double d8) {
        if (Math.getExponent(d8) <= 1023) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static e i(O6.a aVar) {
        P6.f.e(aVar, "initializer");
        return new e(aVar);
    }

    public static Throwable j(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return th;
        }
        RuntimeException runtimeException = (RuntimeException) th;
        if (runtimeException instanceof C1431c) {
            return k((C1431c) runtimeException);
        }
        if (!(runtimeException instanceof b)) {
            return runtimeException;
        }
        Throwable cause = runtimeException.getCause();
        if (cause instanceof C1431c) {
            return new com.bumptech.glide.g(runtimeException.getMessage(), k((C1431c) cause));
        }
        return runtimeException;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [o5.c, com.bumptech.glide.g] */
    /* JADX WARNING: type inference failed for: r0v4, types: [o5.c, com.bumptech.glide.g] */
    /* JADX WARNING: type inference failed for: r0v6, types: [o5.c, com.bumptech.glide.g] */
    /* JADX WARNING: type inference failed for: r0v8, types: [o5.c, com.bumptech.glide.g] */
    /* JADX WARNING: type inference failed for: r0v10, types: [o5.c, com.bumptech.glide.g] */
    public static C1323c k(C1431c cVar) {
        C1494a b8 = cVar.b();
        String message = cVar.getMessage();
        Throwable cause = cVar.getCause();
        int ordinal = b8.getType().ordinal();
        if (ordinal == 1) {
            return new C1321a(new Q4.a((P4.a) b8), message, cause);
        }
        if (ordinal == 8) {
            C0618a aVar = (C0618a) b8;
            return new com.bumptech.glide.g(message, cause);
        } else if (ordinal == 10) {
            return new com.bumptech.glide.g(message, cause);
        } else {
            if (ordinal == 13) {
                return new com.bumptech.glide.g(message, cause);
            }
            if (ordinal == 3) {
                return new com.bumptech.glide.g(message, cause);
            }
            if (ordinal == 4) {
                return new com.bumptech.glide.g(message, cause);
            }
            throw new IllegalStateException();
        }
    }

    public static String l(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return ", ".concat(str);
    }

    public static j m(Context context, C0232y yVar, boolean z, String str) {
        h hVar;
        MediaMetricsManager c8 = U0.g.c(context.getSystemService("media_metrics"));
        if (c8 == null) {
            hVar = null;
        } else {
            hVar = new h(context, c8.createPlaybackSession());
        }
        if (hVar == null) {
            P0.l.B("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new j(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            yVar.getClass();
            U0.d dVar = yVar.f4958m0;
            dVar.getClass();
            dVar.f5329Z.a(hVar);
        }
        return new j(hVar.f5349c.getSessionId(), str);
    }

    public static void n(Runnable runnable) {
        if (h()) {
            runnable.run();
        } else {
            a.m("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static final l7.b o(Socket socket) {
        Logger logger = m.f13230a;
        v vVar = new v(socket);
        OutputStream outputStream = socket.getOutputStream();
        P6.f.d(outputStream, "getOutputStream(...)");
        return new l7.b(vVar, new l7.b(outputStream, vVar));
    }

    public static final c p(Socket socket) {
        Logger logger = m.f13230a;
        v vVar = new v(socket);
        InputStream inputStream = socket.getInputStream();
        P6.f.d(inputStream, "getInputStream(...)");
        return new c(vVar, 0, new c(inputStream, 1, vVar));
    }

    public static void q(C0054l lVar, ArrayList arrayList) {
        if (lVar instanceof C0056m) {
            ((C0056m) lVar).getClass();
            throw null;
        } else if (lVar instanceof C1446F) {
            arrayList.add(((C1446F) lVar).f15494a);
        } else {
            arrayList.add(new C1482w(lVar));
        }
    }

    public static void r(String str, String str2) {
        Log.w(str, str2);
    }
}
