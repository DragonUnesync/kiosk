package S7;

import java.nio.charset.Charset;

public final class g implements Cloneable {

    /* renamed from: U  reason: collision with root package name */
    public l f4547U;

    /* renamed from: V  reason: collision with root package name */
    public Charset f4548V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f4549W;

    /* renamed from: X  reason: collision with root package name */
    public int f4550X;

    /* renamed from: Y  reason: collision with root package name */
    public int f4551Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f4552Z;

    /* renamed from: a */
    public final g clone() {
        try {
            g gVar = (g) super.clone();
            String name = this.f4548V.name();
            gVar.getClass();
            gVar.f4548V = Charset.forName(name);
            gVar.f4547U = l.valueOf(this.f4547U.name());
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
