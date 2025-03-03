package c1;

import N.e;
import android.text.TextUtils;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f8872a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8873b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8874c;

    public r(String str, boolean z, boolean z6) {
        this.f8872a = str;
        this.f8873b = z;
        this.f8874c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != r.class) {
            return false;
        }
        r rVar = (r) obj;
        if (TextUtils.equals(this.f8872a, rVar.f8872a) && this.f8873b == rVar.f8873b && this.f8874c == rVar.f8874c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int u3 = e.u(31, 31, this.f8872a);
        int i8 = 1237;
        if (this.f8873b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i9 = (u3 + i) * 31;
        if (this.f8874c) {
            i8 = 1231;
        }
        return i9 + i8;
    }
}
