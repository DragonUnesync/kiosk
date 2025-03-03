package f1;

import H3.C0103u;
import H3.i0;
import H3.n0;
import P0.z;
import android.net.Uri;
import j$.util.Objects;

/* renamed from: f1.C  reason: case insensitive filesystem */
public final class C0884C {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f11478a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f11479b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11480c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11481d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11482f;

    /* renamed from: g  reason: collision with root package name */
    public final Uri f11483g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11484h;
    public final String i;

    /* renamed from: j  reason: collision with root package name */
    public final String f11485j;

    /* renamed from: k  reason: collision with root package name */
    public final String f11486k;

    /* renamed from: l  reason: collision with root package name */
    public final String f11487l;

    public C0884C(C0883B b8) {
        this.f11478a = n0.a(b8.f11468a);
        this.f11479b = b8.f11469b.g();
        String str = b8.f11471d;
        int i8 = z.f3748a;
        this.f11480c = str;
        this.f11481d = b8.e;
        this.e = b8.f11472f;
        this.f11483g = b8.f11473g;
        this.f11484h = b8.f11474h;
        this.f11482f = b8.f11470c;
        this.i = b8.i;
        this.f11485j = b8.f11476k;
        this.f11486k = b8.f11477l;
        this.f11487l = b8.f11475j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0884C.class != obj.getClass()) {
            return false;
        }
        C0884C c8 = (C0884C) obj;
        if (this.f11482f == c8.f11482f) {
            n0 n0Var = this.f11478a;
            n0Var.getClass();
            if (C0103u.h(n0Var, c8.f11478a) && this.f11479b.equals(c8.f11479b)) {
                int i8 = z.f3748a;
                if (!Objects.equals(this.f11481d, c8.f11481d) || !Objects.equals(this.f11480c, c8.f11480c) || !Objects.equals(this.e, c8.e) || !Objects.equals(this.f11487l, c8.f11487l) || !Objects.equals(this.f11483g, c8.f11483g) || !Objects.equals(this.f11485j, c8.f11485j) || !Objects.equals(this.f11486k, c8.f11486k) || !Objects.equals(this.f11484h, c8.f11484h) || !Objects.equals(this.i, c8.i)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int hashCode = (this.f11479b.hashCode() + ((this.f11478a.hashCode() + 217) * 31)) * 31;
        int i16 = 0;
        String str = this.f11481d;
        if (str == null) {
            i8 = 0;
        } else {
            i8 = str.hashCode();
        }
        int i17 = (hashCode + i8) * 31;
        String str2 = this.f11480c;
        if (str2 == null) {
            i9 = 0;
        } else {
            i9 = str2.hashCode();
        }
        int i18 = (i17 + i9) * 31;
        String str3 = this.e;
        if (str3 == null) {
            i10 = 0;
        } else {
            i10 = str3.hashCode();
        }
        int i19 = (((i18 + i10) * 31) + this.f11482f) * 31;
        String str4 = this.f11487l;
        if (str4 == null) {
            i11 = 0;
        } else {
            i11 = str4.hashCode();
        }
        int i20 = (i19 + i11) * 31;
        Uri uri = this.f11483g;
        if (uri == null) {
            i12 = 0;
        } else {
            i12 = uri.hashCode();
        }
        int i21 = (i20 + i12) * 31;
        String str5 = this.f11485j;
        if (str5 == null) {
            i13 = 0;
        } else {
            i13 = str5.hashCode();
        }
        int i22 = (i21 + i13) * 31;
        String str6 = this.f11486k;
        if (str6 == null) {
            i14 = 0;
        } else {
            i14 = str6.hashCode();
        }
        int i23 = (i22 + i14) * 31;
        String str7 = this.f11484h;
        if (str7 == null) {
            i15 = 0;
        } else {
            i15 = str7.hashCode();
        }
        int i24 = (i23 + i15) * 31;
        String str8 = this.i;
        if (str8 != null) {
            i16 = str8.hashCode();
        }
        return i24 + i16;
    }
}
