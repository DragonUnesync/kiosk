package g6;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;

/* renamed from: g6.s  reason: case insensitive filesystem */
public final class C0985s implements PrivilegedAction {
    final /* synthetic */ byte[] val$classBinary;
    final /* synthetic */ Class val$helper;
    final /* synthetic */ ClassLoader val$loader;

    public C0985s(ClassLoader classLoader, Class cls, byte[] bArr) {
        this.val$loader = classLoader;
        this.val$helper = cls;
        this.val$classBinary = bArr;
    }

    public Class<?> run() {
        Class<ClassLoader> cls = ClassLoader.class;
        try {
            Class cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("defineClass", new Class[]{String.class, byte[].class, cls2, cls2});
            declaredMethod.setAccessible(true);
            return (Class) declaredMethod.invoke(this.val$loader, new Object[]{this.val$helper.getName(), this.val$classBinary, 0, Integer.valueOf(this.val$classBinary.length)});
        } catch (Exception e) {
            throw new IllegalStateException("Define class failed!", e);
        }
    }
}
