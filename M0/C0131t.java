package M0;

import P0.z;
import j$.util.Objects;

/* renamed from: M0.t  reason: case insensitive filesystem */
public final class C0131t {

    /* renamed from: a  reason: collision with root package name */
    public final String f3048a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3049b;

    static {
        z.J(0);
        z.J(1);
    }

    public C0131t(String str, String str2) {
        this.f3048a = z.P(str);
        this.f3049b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0131t.class != obj.getClass()) {
            return false;
        }
        C0131t tVar = (C0131t) obj;
        if (!Objects.equals(this.f3048a, tVar.f3048a) || !Objects.equals(this.f3049b, tVar.f3049b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f3049b.hashCode() * 31;
        String str = this.f3048a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
