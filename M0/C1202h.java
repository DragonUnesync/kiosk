package m0;

import D7.b;
import G5.s;
import Y.i;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import r0.C1374h;

/* renamed from: m0.h  reason: case insensitive filesystem */
public final class C1202h extends b {

    /* renamed from: U  reason: collision with root package name */
    public static final Class f13330U;

    /* renamed from: V  reason: collision with root package name */
    public static final Constructor f13331V;

    /* renamed from: W  reason: collision with root package name */
    public static final Method f13332W;

    /* renamed from: X  reason: collision with root package name */
    public static final Method f13333X;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method2 = null;
            cls = null;
            method = null;
        }
        f13331V = constructor;
        f13330U = cls;
        f13332W = method;
        f13333X = method2;
    }

    public static boolean R(Object obj, ByteBuffer byteBuffer, int i, int i8, boolean z) {
        try {
            return ((Boolean) f13332W.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i8), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface S(Object obj) {
        try {
            Object newInstance = Array.newInstance(f13330U, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f13333X.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0060 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface f(android.content.Context r17, l0.e r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = f13331V     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            r2 = r0
            goto L_0x000b
        L_0x0009:
            r2 = r1
        L_0x000b:
            if (r2 != 0) goto L_0x000e
            return r1
        L_0x000e:
            r0 = r18
            l0.f[] r3 = r0.f13068a
            int r4 = r3.length
            r0 = 0
            r5 = 0
        L_0x0015:
            if (r5 >= r4) goto L_0x0076
            r6 = r3[r5]
            int r0 = r6.f13073f
            java.io.File r7 = G5.s.s(r17)
            if (r7 != 0) goto L_0x0025
            r8 = r19
        L_0x0023:
            r0 = r1
            goto L_0x005e
        L_0x0025:
            r8 = r19
            boolean r0 = G5.s.g(r7, r8, r0)     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0031
            r7.delete()
            goto L_0x0023
        L_0x0031:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005a }
            r9.<init>(r7)     // Catch:{ IOException -> 0x005a }
            java.nio.channels.FileChannel r0 = r9.getChannel()     // Catch:{ all -> 0x004e }
            java.nio.channels.FileChannel r10 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r0)     // Catch:{ all -> 0x004e }
            long r14 = r10.size()     // Catch:{ all -> 0x004e }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x004e }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x004e }
            r9.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005b
        L_0x004e:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0059
        L_0x0054:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch:{ IOException -> 0x005a }
        L_0x0059:
            throw r10     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r0 = r1
        L_0x005b:
            r7.delete()
        L_0x005e:
            if (r0 != 0) goto L_0x0061
            return r1
        L_0x0061:
            int r7 = r6.f13070b
            boolean r9 = r6.f13071c
            int r6 = r6.e
            boolean r0 = R(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L_0x006e
            return r1
        L_0x006e:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x0071:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0076:
            android.graphics.Typeface r0 = S(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C1202h.f(android.content.Context, l0.e, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public final Typeface g(Context context, C1374h[] hVarArr, int i) {
        Object obj;
        try {
            obj = f13331V.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        i iVar = new i((Object) null);
        for (C1374h hVar : hVarArr) {
            Uri uri = hVar.f14809a;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = s.u(context, uri);
                iVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!R(obj, byteBuffer, hVar.f14810b, hVar.f14811c, hVar.f14812d)) {
                return null;
            }
        }
        Typeface S8 = S(obj);
        if (S8 == null) {
            return null;
        }
        return Typeface.create(S8, i);
    }
}
