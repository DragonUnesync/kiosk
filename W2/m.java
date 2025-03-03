package W2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f6173a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f6174b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    public static volatile Handler f6175c;

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = l.f6172a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return 4;
        }
        return 8;
    }

    public static ArrayList e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f6175c == null) {
            synchronized (m.class) {
                try {
                    if (f6175c == null) {
                        f6175c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6175c;
    }

    public static int g(int i, int i8) {
        return (i8 * 31) + i;
    }

    public static int h(int i, Object obj) {
        int i8;
        if (obj == null) {
            i8 = 0;
        } else {
            i8 = obj.hashCode();
        }
        return g(i8, i);
    }

    public static boolean i(int i, int i8) {
        if ((i > 0 || i == Integer.MIN_VALUE) && (i8 > 0 || i8 == Integer.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    public static void j(Runnable runnable) {
        f().post(runnable);
    }
}
