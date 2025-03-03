package de.ozerov.fully;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import x2.C1604c;

public final class F0 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0794w0 f9887a;

    public F0(C0794w0 w0Var) {
        this.f9887a = w0Var;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        C0794w0 w0Var = this.f9887a;
        if (name.equals("onTetheringStarted")) {
            w0Var.t0();
            return null;
        } else if (!name.equals("onTetheringFailed")) {
            Map map = C1604c.f16257h;
            try {
                obj.getClass().getMethod(C1604c.c(method), method.getParameterTypes()).invoke(obj, objArr);
                return null;
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        } else {
            w0Var.s0();
            return null;
        }
    }
}
