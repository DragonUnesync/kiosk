package X0;

import P0.z;
import j$.util.Objects;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f6247a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6248b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6249c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6250d;
    public final String e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f6247a = str;
        this.f6248b = str2;
        this.f6249c = str3;
        this.f6250d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = iVar.f6247a;
        int i = z.f3748a;
        if (!Objects.equals(this.f6247a, str) || !Objects.equals(this.f6248b, iVar.f6248b) || !Objects.equals(this.f6249c, iVar.f6249c) || !Objects.equals(this.f6250d, iVar.f6250d) || !Objects.equals(this.e, iVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f6247a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i12 = (527 + i) * 31;
        String str2 = this.f6248b;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i13 = (i12 + i8) * 31;
        String str3 = this.f6249c;
        if (str3 != null) {
            i9 = str3.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (i13 + i9) * 31;
        String str4 = this.f6250d;
        if (str4 != null) {
            i10 = str4.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return i15 + i11;
    }
}
