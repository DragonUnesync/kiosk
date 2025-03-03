package D7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import n2.a;
import n7.C1247a;

public final /* synthetic */ class f implements InvocationHandler {
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String str;
        if (C1247a.b()) {
            str = "in SenderService process";
        } else {
            str = "before ACRA#init (if you did call #init, check if your configuration is valid)";
        }
        String name = method.getName();
        a.m1("ErrorReporter#" + name + " called " + str + ". THIS CALL WILL BE IGNORED!");
        return null;
    }
}
