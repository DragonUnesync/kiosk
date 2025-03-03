package O7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class c {
    public static final boolean SUPPORTS_GET_AND_SET;
    public static final Unsafe UNSAFE;

    static {
        Unsafe unsafe;
        boolean z = true;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get((Object) null);
        } catch (Exception unused) {
            try {
                Constructor<Unsafe> declaredConstructor = Unsafe.class.getDeclaredConstructor((Class[]) null);
                declaredConstructor.setAccessible(true);
                unsafe = declaredConstructor.newInstance((Object[]) null);
            } catch (Exception e) {
                SUPPORTS_GET_AND_SET = false;
                throw new RuntimeException(e);
            }
        }
        Class<Unsafe> cls = Unsafe.class;
        try {
            Class<Object> cls2 = Object.class;
            cls.getMethod("getAndSetObject", new Class[]{cls2, Long.TYPE, cls2});
        } catch (Exception unused2) {
            z = false;
        }
        UNSAFE = unsafe;
        SUPPORTS_GET_AND_SET = z;
    }

    public static long fieldOffset(Class cls, String str) {
        try {
            return UNSAFE.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
