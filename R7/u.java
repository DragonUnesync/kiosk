package r7;

import P6.e;
import P6.f;
import P6.h;
import P6.k;
import java.lang.reflect.Constructor;

public final class u {
    public static final /* synthetic */ h[] e;

    /* renamed from: a  reason: collision with root package name */
    public int f15074a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final t f15075b = new t(this, 0);

    /* renamed from: c  reason: collision with root package name */
    public String f15076c;

    /* renamed from: d  reason: collision with root package name */
    public final t f15077d = new t(this, 1);

    static {
        Class<u> cls = u.class;
        h hVar = new h("enabled", cls, "getEnabled()Ljava/lang/Boolean;");
        k.f3956a.getClass();
        e = new h[]{hVar, new h("length", cls, "getLength()Ljava/lang/Integer;")};
    }

    public final s a() {
        boolean z;
        int i;
        if (this.f15076c != null) {
            Class cls = Integer.TYPE;
            Constructor<s> constructor = s.class.getConstructor(new Class[]{Boolean.TYPE, String.class, cls, cls, e.class});
            t tVar = this.f15075b;
            h[] hVarArr = e;
            Boolean bool = (Boolean) tVar.c(hVarArr[0]);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            String str = this.f15076c;
            Integer num = (Integer) this.f15077d.c(hVarArr[1]);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            s newInstance = constructor.newInstance(new Object[]{valueOf, str, Integer.valueOf(i), Integer.valueOf(this.f15074a), null});
            f.d(newInstance, "newInstance(...)");
            return newInstance;
        }
        throw new IllegalStateException("text must be assigned.");
    }
}
