package g6;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;

public final class r implements PrivilegedAction {
    final /* synthetic */ boolean val$absolute;
    final /* synthetic */ Class val$helper;
    final /* synthetic */ String val$name;

    public r(Class cls, String str, boolean z) {
        this.val$helper = cls;
        this.val$name = str;
        this.val$absolute = z;
    }

    public Object run() {
        try {
            Method method = this.val$helper.getMethod("loadLibrary", new Class[]{String.class, Boolean.TYPE});
            method.setAccessible(true);
            return method.invoke((Object) null, new Object[]{this.val$name, Boolean.valueOf(this.val$absolute)});
        } catch (Exception e) {
            return e;
        }
    }
}
