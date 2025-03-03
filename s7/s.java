package S7;

import R7.h;
import j$.util.Objects;

public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f4586c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final u f4587a;

    /* renamed from: b  reason: collision with root package name */
    public final u f4588b;

    public s(u uVar, u uVar2) {
        this.f4587a = uVar;
        this.f4588b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.f4587a.equals(sVar.f4587a)) {
            return false;
        }
        return this.f4588b.equals(sVar.f4588b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f4587a, this.f4588b});
    }

    public final String toString() {
        StringBuilder b8 = h.b();
        b8.append(this.f4587a);
        b8.append('=');
        b8.append(this.f4588b);
        return h.h(b8);
    }
}
