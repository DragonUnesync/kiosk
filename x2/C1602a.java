package x2;

import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: x2.a  reason: case insensitive filesystem */
public final class C1602a {

    /* renamed from: a  reason: collision with root package name */
    public final String f16250a;

    /* renamed from: b  reason: collision with root package name */
    public final Class[] f16251b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f16252c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f16253d;

    public C1602a(Method method) {
        this.f16253d = method;
        this.f16250a = method.getName();
        this.f16251b = method.getParameterTypes();
        this.f16252c = method.getReturnType();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1602a)) {
            return false;
        }
        C1602a aVar = (C1602a) obj;
        if (!this.f16250a.equals(aVar.f16250a) || !this.f16252c.equals(aVar.f16252c) || !Arrays.equals(this.f16251b, aVar.f16251b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f16250a.hashCode() + 544;
        int hashCode2 = this.f16252c.hashCode() + (hashCode * 31) + hashCode;
        return (hashCode2 * 31) + Arrays.hashCode(this.f16251b) + hashCode2;
    }
}
