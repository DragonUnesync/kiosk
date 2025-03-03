package androidx.lifecycle;

import F.h;
import P6.f;
import W6.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f8161a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f8162b = new HashMap();

    public static void a(Constructor constructor, q qVar) {
        try {
            f.d(constructor.newInstance(new Object[]{qVar}), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z;
        boolean z6;
        boolean z8;
        String str;
        int i = 1;
        HashMap hashMap = f8161a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (packageR != null) {
                    str = packageR.getName();
                } else {
                    str = "";
                }
                f.d(str, "fullPackage");
                if (str.length() != 0) {
                    f.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(str.length() + 1);
                    f.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                f.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = l.Y(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = f8162b;
            if (constructor != null) {
                hashMap2.put(cls, h.w(constructor));
            } else {
                C0476c cVar = C0476c.f8140c;
                HashMap hashMap3 = cVar.f8142b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((B) declaredMethods[i8].getAnnotation(B.class)) != null) {
                                cVar.a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i8++;
                            }
                        }
                    } catch (NoClassDefFoundError e8) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    Class<q> cls2 = q.class;
                    if (superclass == null || !cls2.isAssignableFrom(superclass)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z6) {
                        f.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            f.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    f.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            Class cls3 = interfaces[i9];
                            if (cls3 == null || !cls2.isAssignableFrom(cls3)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (z8) {
                                f.d(cls3, "intrface");
                                if (b(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls3);
                                f.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i9++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
