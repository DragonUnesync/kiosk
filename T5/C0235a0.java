package T5;

import java.security.PrivilegedExceptionAction;

/* renamed from: T5.a0  reason: case insensitive filesystem */
public final class C0235a0 implements PrivilegedExceptionAction {
    final /* synthetic */ Class val$handlerType;
    final /* synthetic */ String val$methodName;
    final /* synthetic */ Class[] val$paramTypes;

    public C0235a0(Class cls, String str, Class[] clsArr) {
        this.val$handlerType = cls;
        this.val$methodName = str;
        this.val$paramTypes = clsArr;
    }

    public Boolean run() {
        try {
            return Boolean.valueOf(this.val$handlerType.getMethod(this.val$methodName, this.val$paramTypes).isAnnotationPresent(C0237b0.class));
        } catch (NoSuchMethodException e) {
            if (C0239c0.logger.isDebugEnabled()) {
                C0239c0.logger.debug("Class {} missing method {}, assume we can not skip execution", this.val$handlerType, this.val$methodName, e);
            }
            return Boolean.FALSE;
        }
    }
}
