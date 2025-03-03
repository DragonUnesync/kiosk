package X0;

import P0.z;
import j$.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f6236a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6237b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6238c;

    public f(String str, String str2, String str3) {
        this.f6236a = str;
        this.f6237b = str2;
        this.f6238c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        int i = z.f3748a;
        if (!Objects.equals(this.f6236a, fVar.f6236a) || !Objects.equals(this.f6237b, fVar.f6237b) || !Objects.equals(this.f6238c, fVar.f6238c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f6236a.hashCode() * 31;
        int i8 = 0;
        String str = this.f6237b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 31;
        String str2 = this.f6238c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }
}
