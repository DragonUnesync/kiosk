package K2;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public final class v {
    public static final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f2640f;

    /* renamed from: g  reason: collision with root package name */
    public static final File f2641g = new File("/proc/self/fd");

    /* renamed from: h  reason: collision with root package name */
    public static volatile v f2642h;

    /* renamed from: a  reason: collision with root package name */
    public final int f2643a = 20000;

    /* renamed from: b  reason: collision with root package name */
    public int f2644b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2645c = true;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f2646d = new AtomicBoolean(false);

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z6 = false;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        e = z;
        if (i >= 28) {
            z6 = true;
        }
        f2640f = z6;
    }

    public static v a() {
        if (f2642h == null) {
            synchronized (v.class) {
                try {
                    if (f2642h == null) {
                        f2642h = new v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2642h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            for (String startsWith : Arrays.asList(new String[]{"GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013"})) {
                if (Build.MODEL.startsWith(startsWith)) {
                    return 500;
                }
            }
        }
        return this.f2643a;
    }

    public final boolean c(int i, int i8, boolean z, boolean z6) {
        boolean z8;
        boolean z9;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!f2640f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (e && !this.f2646d.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z6) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else if (i < 0 || i8 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        } else {
            synchronized (this) {
                try {
                    int i9 = this.f2644b + 1;
                    this.f2644b = i9;
                    if (i9 >= 50) {
                        this.f2644b = 0;
                        int length = f2641g.list().length;
                        long b8 = (long) b();
                        if (((long) length) < b8) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.f2645c = z9;
                        if (!z9 && Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b8);
                        }
                    }
                    z8 = this.f2645c;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z8) {
                return true;
            }
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
            }
            return false;
        }
    }
}
