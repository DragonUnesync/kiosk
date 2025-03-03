package m0;

import G5.s;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import l0.e;
import l0.f;
import r0.C1374h;

/* renamed from: m0.i  reason: case insensitive filesystem */
public class C1203i extends C1201g {

    /* renamed from: Z  reason: collision with root package name */
    public final Class f13334Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Constructor f13335a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Method f13336b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Method f13337c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Method f13338d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Method f13339e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Method f13340f0;

    public C1203i() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor((Class[]) null);
            method4 = Z(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3});
            method2 = cls2.getMethod("freeze", (Class[]) null);
            method = cls2.getMethod("abortCreation", (Class[]) null);
            Class<?> cls4 = cls2;
            method5 = a0(cls2);
            cls = cls4;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f13334Z = cls;
        this.f13335a0 = constructor;
        this.f13336b0 = method4;
        this.f13337c0 = method3;
        this.f13338d0 = method2;
        this.f13339e0 = method;
        this.f13340f0 = method5;
    }

    public static Method Z(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public final void T(Object obj) {
        try {
            this.f13339e0.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean U(Context context, Object obj, String str, int i, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f13336b0.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface V(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f13334Z, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f13340f0.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean W(Object obj) {
        try {
            return ((Boolean) this.f13338d0.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean X() {
        Method method = this.f13336b0;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object Y() {
        try {
            return this.f13335a0.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method a0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final Typeface f(Context context, e eVar, Resources resources, int i) {
        if (!X()) {
            return super.f(context, eVar, resources, i);
        }
        Object Y7 = Y();
        if (Y7 == null) {
            return null;
        }
        for (f fVar : eVar.f13068a) {
            String str = fVar.f13069a;
            FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(fVar.f13072d);
            if (!U(context, Y7, str, fVar.e, fVar.f13070b, fVar.f13071c ? 1 : 0, fromFontVariationSettings)) {
                T(Y7);
                return null;
            }
        }
        if (!W(Y7)) {
            return null;
        }
        return V(Y7);
    }

    public final Typeface g(Context context, C1374h[] hVarArr, int i) {
        Typeface V8;
        boolean z;
        ParcelFileDescriptor openFileDescriptor;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!X()) {
            C1374h m8 = m(hVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(m8.f14809a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m8.f14811c).setItalic(m8.f14812d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (C1374h hVar : hVarArr) {
                if (hVar.e == 0) {
                    Uri uri = hVar.f14809a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, s.u(context, uri));
                    }
                }
            }
            Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
            Object Y7 = Y();
            if (Y7 == null) {
                return null;
            }
            boolean z6 = false;
            for (C1374h hVar2 : hVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f14809a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.f13337c0.invoke(Y7, new Object[]{byteBuffer, Integer.valueOf(hVar2.f14810b), null, Integer.valueOf(hVar2.f14811c), Integer.valueOf(hVar2.f14812d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        T(Y7);
                        return null;
                    }
                    z6 = true;
                }
            }
            if (!z6) {
                T(Y7);
                return null;
            } else if (W(Y7) && (V8 = V(Y7)) != null) {
                return Typeface.create(V8, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    public final Typeface j(Context context, Resources resources, int i, String str, int i8) {
        if (!X()) {
            return super.j(context, resources, i, str, i8);
        }
        Object Y7 = Y();
        if (Y7 == null) {
            return null;
        }
        if (!U(context, Y7, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            T(Y7);
            return null;
        } else if (!W(Y7)) {
            return null;
        } else {
            return V(Y7);
        }
    }
}
