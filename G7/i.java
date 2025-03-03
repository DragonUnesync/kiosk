package g7;

import P6.f;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class i implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f12035a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12036b;

    /* renamed from: c  reason: collision with root package name */
    public String f12037c;

    public i(ArrayList arrayList) {
        this.f12035a = arrayList;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        f.e(obj, "proxy");
        f.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (f.a(name, "supports") && f.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (!f.a(name, "unsupported") || !f.a(Void.TYPE, returnType)) {
            boolean a8 = f.a(name, "protocols");
            ArrayList arrayList = this.f12035a;
            if (a8 && objArr.length == 0) {
                return arrayList;
            }
            if ((f.a(name, "selectProtocol") || f.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    f.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            f.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!arrayList.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f12037c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f12037c = str2;
                    return str2;
                }
            }
            if ((!f.a(name, "protocolSelected") && !f.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            f.c(obj4, "null cannot be cast to non-null type kotlin.String");
            this.f12037c = (String) obj4;
            return null;
        }
        this.f12036b = true;
        return null;
    }
}
