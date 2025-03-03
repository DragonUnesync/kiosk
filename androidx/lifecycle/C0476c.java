package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
public final class C0476c {

    /* renamed from: c  reason: collision with root package name */
    public static final C0476c f8140c = new C0476c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8141a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8142b = new HashMap();

    public static void b(HashMap hashMap, C0475b bVar, C0485l lVar, Class cls) {
        C0485l lVar2 = (C0485l) hashMap.get(bVar);
        if (lVar2 != null && lVar != lVar2) {
            Method method = bVar.f8139b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lVar2 + ", new value " + lVar);
        } else if (lVar2 == null) {
            hashMap.put(bVar, lVar);
        }
    }

    public final C0474a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f8141a;
        if (superclass != null) {
            C0474a aVar = (C0474a) hashMap2.get(superclass);
            if (aVar == null) {
                aVar = a(superclass, (Method[]) null);
            }
            hashMap.putAll(aVar.f8137b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            C0474a aVar2 = (C0474a) hashMap2.get(cls2);
            if (aVar2 == null) {
                aVar2 = a(cls2, (Method[]) null);
            }
            for (Map.Entry entry : aVar2.f8137b.entrySet()) {
                b(hashMap, (C0475b) entry.getKey(), (C0485l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            B b8 = (B) method.getAnnotation(B.class);
            if (b8 != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (r.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0485l value = b8.value();
                if (parameterTypes.length > 1) {
                    if (!C0485l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0485l.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0475b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0474a aVar3 = new C0474a(hashMap);
        hashMap2.put(cls, aVar3);
        this.f8142b.put(cls, Boolean.valueOf(z));
        return aVar3;
    }
}
