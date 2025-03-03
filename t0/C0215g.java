package T0;

import M0.r;
import N.e;
import P0.l;
import android.text.TextUtils;

/* renamed from: T0.g  reason: case insensitive filesystem */
public final class C0215g {

    /* renamed from: a  reason: collision with root package name */
    public final String f4833a;

    /* renamed from: b  reason: collision with root package name */
    public final r f4834b;

    /* renamed from: c  reason: collision with root package name */
    public final r f4835c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4836d;
    public final int e;

    public C0215g(String str, r rVar, r rVar2, int i, int i8) {
        boolean z;
        if (i == 0 || i8 == 0) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        if (!TextUtils.isEmpty(str)) {
            this.f4833a = str;
            rVar.getClass();
            this.f4834b = rVar;
            rVar2.getClass();
            this.f4835c = rVar2;
            this.f4836d = i;
            this.e = i8;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0215g.class != obj.getClass()) {
            return false;
        }
        C0215g gVar = (C0215g) obj;
        if (this.f4836d != gVar.f4836d || this.e != gVar.e || !this.f4833a.equals(gVar.f4833a) || !this.f4834b.equals(gVar.f4834b) || !this.f4835c.equals(gVar.f4835c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int u3 = e.u((((527 + this.f4836d) * 31) + this.e) * 31, 31, this.f4833a);
        return this.f4835c.hashCode() + ((this.f4834b.hashCode() + u3) * 31);
    }
}
