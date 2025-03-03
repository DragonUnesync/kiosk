package androidx.fragment.app;

import C6.b;
import N.e;
import Y.i;
import java.lang.reflect.InvocationTargetException;

public final class F {

    /* renamed from: b  reason: collision with root package name */
    public static final i f7843b = new i((Object) null);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L f7844a;

    public F(L l8) {
        this.f7844a = l8;
    }

    public static Class b(String str, ClassLoader classLoader) {
        i iVar = f7843b;
        i iVar2 = (i) iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new i((Object) null);
            iVar.put(classLoader, iVar2);
        }
        Class cls = (Class) iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(String str, ClassLoader classLoader) {
        try {
            return b(str, classLoader);
        } catch (ClassNotFoundException e) {
            throw new b(e.y("Unable to instantiate fragment ", str, ": make sure class name exists"), (Throwable) e);
        } catch (ClassCastException e8) {
            throw new b(e.y("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), (Throwable) e8);
        }
    }

    public final C0470v a(String str) {
        try {
            return (C0470v) c(str, this.f7844a.f7893w.f8093e0.getClassLoader()).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (InstantiationException e) {
            throw new b(e.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e);
        } catch (IllegalAccessException e8) {
            throw new b(e.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e8);
        } catch (NoSuchMethodException e9) {
            throw new b(e.y("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), (Throwable) e9);
        } catch (InvocationTargetException e10) {
            throw new b(e.y("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), (Throwable) e10);
        }
    }
}
