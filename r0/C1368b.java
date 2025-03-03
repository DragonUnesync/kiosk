package r0;

import j$.util.Objects;
import java.util.List;

/* renamed from: r0.b  reason: case insensitive filesystem */
public final class C1368b {

    /* renamed from: a  reason: collision with root package name */
    public String f14789a;

    /* renamed from: b  reason: collision with root package name */
    public String f14790b;

    /* renamed from: c  reason: collision with root package name */
    public List f14791c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1368b)) {
            return false;
        }
        C1368b bVar = (C1368b) obj;
        if (!Objects.equals(this.f14789a, bVar.f14789a) || !Objects.equals(this.f14790b, bVar.f14790b) || !Objects.equals(this.f14791c, bVar.f14791c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f14789a, this.f14790b, this.f14791c});
    }
}
