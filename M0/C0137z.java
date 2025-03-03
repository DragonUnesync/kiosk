package M0;

import H3.L;
import H3.O;
import K1.i;
import N.e;
import P0.z;
import android.net.Uri;
import com.bumptech.glide.c;
import j$.util.Objects;
import java.util.List;

/* renamed from: M0.z  reason: case insensitive filesystem */
public final class C0137z {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f3060a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3061b;

    /* renamed from: c  reason: collision with root package name */
    public final List f3062c;

    /* renamed from: d  reason: collision with root package name */
    public final O f3063d;
    public final long e;

    static {
        e.D(0, 1, 2, 3, 4);
        z.J(5);
        z.J(6);
        z.J(7);
    }

    public C0137z(Uri uri, String str, c cVar, List list, O o2, long j7) {
        this.f3060a = uri;
        this.f3061b = I.o(str);
        this.f3062c = list;
        this.f3063d = o2;
        L j8 = O.j();
        for (int i = 0; i < o2.size(); i++) {
            ((B) o2.get(i)).getClass();
            new i(6);
            j8.c(new Object());
        }
        j8.g();
        this.e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0137z)) {
            return false;
        }
        C0137z zVar = (C0137z) obj;
        if (!this.f3060a.equals(zVar.f3060a) || !Objects.equals(this.f3061b, zVar.f3061b) || !Objects.equals((Object) null, (Object) null) || !this.f3062c.equals(zVar.f3062c) || !this.f3063d.equals(zVar.f3063d) || !Long.valueOf(this.e).equals(Long.valueOf(zVar.e))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f3060a.hashCode() * 31;
        String str = this.f3061b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = this.f3062c.hashCode();
        return (int) ((((long) ((this.f3063d.hashCode() + ((hashCode2 + ((hashCode + i) * 29791)) * 961)) * 31)) * 31) + this.e);
    }
}
