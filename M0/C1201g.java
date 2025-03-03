package m0;

import D7.b;
import G5.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l0.e;
import l0.f;

/* renamed from: m0.g  reason: case insensitive filesystem */
public class C1201g extends b {

    /* renamed from: U  reason: collision with root package name */
    public static Class f13325U;

    /* renamed from: V  reason: collision with root package name */
    public static Constructor f13326V;

    /* renamed from: W  reason: collision with root package name */
    public static Method f13327W;

    /* renamed from: X  reason: collision with root package name */
    public static Method f13328X;

    /* renamed from: Y  reason: collision with root package name */
    public static boolean f13329Y;

    public static boolean R(Object obj, String str, int i, boolean z) {
        S();
        try {
            return ((Boolean) f13327W.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void S() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f13329Y) {
            f13329Y = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f13326V = constructor;
            f13325U = cls;
            f13327W = method;
            f13328X = method2;
        }
    }

    public Typeface f(Context context, e eVar, Resources resources, int i) {
        S();
        try {
            Object newInstance = f13326V.newInstance((Object[]) null);
            f[] fVarArr = eVar.f13068a;
            int length = fVarArr.length;
            int i8 = 0;
            while (i8 < length) {
                f fVar = fVarArr[i8];
                File s8 = s.s(context);
                if (s8 == null) {
                    return null;
                }
                try {
                    if (!s.g(s8, resources, fVar.f13073f)) {
                        s8.delete();
                        return null;
                    } else if (!R(newInstance, s8.getPath(), fVar.f13070b, fVar.f13071c)) {
                        return null;
                    } else {
                        s8.delete();
                        i8++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    s8.delete();
                }
            }
            S();
            try {
                Object newInstance2 = Array.newInstance(f13325U, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f13328X.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface g(android.content.Context r4, r0.C1374h[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            r0.h r5 = r3.m(r5, r6)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f14809a     // Catch:{ IOException -> 0x0082 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r2)     // Catch:{ IOException -> 0x0082 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0082 }
        L_0x001d:
            return r2
        L_0x001e:
            java.lang.String r6 = "/proc/self/fd/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r6 = r5.getFd()     // Catch:{ ErrnoException -> 0x0046 }
            r0.append(r6)     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = r0.toString()     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x0046 }
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x0046 }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x0046 }
            if (r0 == 0) goto L_0x0047
            java.io.File r0 = new java.io.File     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            goto L_0x0048
        L_0x0046:
        L_0x0047:
            r0 = r2
        L_0x0048:
            if (r0 == 0) goto L_0x005b
            boolean r6 = r0.canRead()     // Catch:{ all -> 0x0059 }
            if (r6 != 0) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x0059 }
            r5.close()     // Catch:{ IOException -> 0x0082 }
            return r4
        L_0x0059:
            r4 = move-exception
            goto L_0x0079
        L_0x005b:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0059 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ all -> 0x0059 }
            r6.<init>(r0)     // Catch:{ all -> 0x0059 }
            android.graphics.Typeface r4 = r3.i(r4, r6)     // Catch:{ all -> 0x006f }
            r6.close()     // Catch:{ all -> 0x0059 }
            r5.close()     // Catch:{ IOException -> 0x0082 }
            return r4
        L_0x006f:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0074 }
            goto L_0x0078
        L_0x0074:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0059 }
        L_0x0078:
            throw r4     // Catch:{ all -> 0x0059 }
        L_0x0079:
            r5.close()     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0082 }
        L_0x0081:
            throw r4     // Catch:{ IOException -> 0x0082 }
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C1201g.g(android.content.Context, r0.h[], int):android.graphics.Typeface");
    }
}
