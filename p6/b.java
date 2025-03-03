package P6;

import U6.a;
import java.io.Serializable;

public abstract class b implements a, Serializable {

    /* renamed from: U  reason: collision with root package name */
    public transient a f3943U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f3944V;

    /* renamed from: W  reason: collision with root package name */
    public final Class f3945W;

    /* renamed from: X  reason: collision with root package name */
    public final String f3946X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f3947Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f3948Z;

    public b(Object obj, Class cls, String str, String str2, boolean z) {
        this.f3944V = obj;
        this.f3945W = cls;
        this.f3946X = str;
        this.f3947Y = str2;
        this.f3948Z = z;
    }

    public abstract a b();

    public final c c() {
        Class cls = this.f3945W;
        if (this.f3948Z) {
            k.f3956a.getClass();
            return new i(cls);
        }
        k.f3956a.getClass();
        return new d(cls);
    }
}
