package androidx.activity;

import androidx.lifecycle.C0489p;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements C0489p {

    /* renamed from: V  reason: collision with root package name */
    public static int f7263V;

    /* renamed from: W  reason: collision with root package name */
    public static Field f7264W;

    /* renamed from: X  reason: collision with root package name */
    public static Field f7265X;

    /* renamed from: Y  reason: collision with root package name */
    public static Field f7266Y;

    /* renamed from: U  reason: collision with root package name */
    public k f7267U;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.lifecycle.r r3, androidx.lifecycle.C0485l r4) {
        /*
            r2 = this;
            androidx.lifecycle.l r3 = androidx.lifecycle.C0485l.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f7263V
            r4 = 1
            if (r3 != 0) goto L_0x0034
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            r0 = 2
            f7263V = r0     // Catch:{ NoSuchFieldException -> 0x0033 }
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0033 }
            f7265X = r0     // Catch:{ NoSuchFieldException -> 0x0033 }
            r0.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0033 }
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0033 }
            f7266Y = r0     // Catch:{ NoSuchFieldException -> 0x0033 }
            r0.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0033 }
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0033 }
            f7264W = r3     // Catch:{ NoSuchFieldException -> 0x0033 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0033 }
            f7263V = r4     // Catch:{ NoSuchFieldException -> 0x0033 }
            goto L_0x0034
        L_0x0033:
        L_0x0034:
            int r3 = f7263V
            if (r3 != r4) goto L_0x0075
            androidx.activity.k r3 = r2.f7267U
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f7264W     // Catch:{ IllegalAccessException -> 0x0075 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x0075 }
            if (r4 != 0) goto L_0x004b
            return
        L_0x004b:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f7265X     // Catch:{ IllegalAccessException -> 0x0071, ClassCastException -> 0x006f }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x0071, ClassCastException -> 0x006f }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x0071, ClassCastException -> 0x006f }
            if (r0 != 0) goto L_0x005a
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r3 = move-exception
            goto L_0x0073
        L_0x005a:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0062
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            return
        L_0x0062:
            java.lang.reflect.Field r0 = f7266Y     // Catch:{ IllegalAccessException -> 0x006d }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            r3.isActive()
            goto L_0x0075
        L_0x006d:
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            return
        L_0x006f:
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            return
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            return
        L_0x0073:
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            throw r3
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.c(androidx.lifecycle.r, androidx.lifecycle.l):void");
    }
}
