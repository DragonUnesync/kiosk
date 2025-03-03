package U5;

import g6.Y;
import g6.f0;
import java.lang.reflect.Field;
import java.nio.channels.Selector;
import java.security.PrivilegedAction;

public final class m implements PrivilegedAction {
    final /* synthetic */ p this$0;
    final /* synthetic */ t val$selectedKeySet;
    final /* synthetic */ Class val$selectorImplClass;
    final /* synthetic */ Selector val$unwrappedSelector;

    public m(p pVar, Class cls, Selector selector, t tVar) {
        this.this$0 = pVar;
        this.val$selectorImplClass = cls;
        this.val$unwrappedSelector = selector;
        this.val$selectedKeySet = tVar;
    }

    public Object run() {
        try {
            Field declaredField = this.val$selectorImplClass.getDeclaredField("selectedKeys");
            Field declaredField2 = this.val$selectorImplClass.getDeclaredField("publicSelectedKeys");
            if (Y.javaVersion() >= 9 && Y.hasUnsafe()) {
                long objectFieldOffset = Y.objectFieldOffset(declaredField);
                long objectFieldOffset2 = Y.objectFieldOffset(declaredField2);
                if (!(objectFieldOffset == -1 || objectFieldOffset2 == -1)) {
                    Y.putObject(this.val$unwrappedSelector, objectFieldOffset, this.val$selectedKeySet);
                    Y.putObject(this.val$unwrappedSelector, objectFieldOffset2, this.val$selectedKeySet);
                    return null;
                }
            }
            Throwable trySetAccessible = f0.trySetAccessible(declaredField, true);
            if (trySetAccessible != null) {
                return trySetAccessible;
            }
            Throwable trySetAccessible2 = f0.trySetAccessible(declaredField2, true);
            if (trySetAccessible2 != null) {
                return trySetAccessible2;
            }
            declaredField.set(this.val$unwrappedSelector, this.val$selectedKeySet);
            declaredField2.set(this.val$unwrappedSelector, this.val$selectedKeySet);
            return null;
        } catch (NoSuchFieldException e) {
            e = e;
            return e;
        } catch (IllegalAccessException e8) {
            e = e8;
            return e;
        }
    }
}
