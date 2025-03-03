package f1;

import H3.C0103u;
import H3.n0;
import N.e;
import P0.z;
import c7.C0625e;
import j$.util.Objects;

/* renamed from: f1.b  reason: case insensitive filesystem */
public final class C0889b {

    /* renamed from: a  reason: collision with root package name */
    public final String f11502a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11503b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11504c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11505d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11506f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11507g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11508h;
    public final n0 i;

    /* renamed from: j  reason: collision with root package name */
    public final C0888a f11509j;

    public C0889b(C0625e eVar, n0 n0Var, C0888a aVar) {
        this.f11502a = (String) eVar.f8917d;
        this.f11503b = eVar.f8914a;
        this.f11504c = (String) eVar.e;
        this.f11505d = eVar.f8915b;
        this.f11506f = (String) eVar.f8919g;
        this.f11507g = (String) eVar.f8920h;
        this.e = eVar.f8916c;
        this.f11508h = (String) eVar.i;
        this.i = n0Var;
        this.f11509j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0889b.class != obj.getClass()) {
            return false;
        }
        C0889b bVar = (C0889b) obj;
        if (this.f11502a.equals(bVar.f11502a) && this.f11503b == bVar.f11503b && this.f11504c.equals(bVar.f11504c) && this.f11505d == bVar.f11505d && this.e == bVar.e) {
            n0 n0Var = this.i;
            n0Var.getClass();
            if (C0103u.h(n0Var, bVar.i) && this.f11509j.equals(bVar.f11509j)) {
                int i8 = z.f3748a;
                if (!Objects.equals(this.f11506f, bVar.f11506f) || !Objects.equals(this.f11507g, bVar.f11507g) || !Objects.equals(this.f11508h, bVar.f11508h)) {
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
        int hashCode = this.i.hashCode();
        int hashCode2 = (this.f11509j.hashCode() + ((hashCode + ((((e.u((e.u(217, 31, this.f11502a) + this.f11503b) * 31, 31, this.f11504c) + this.f11505d) * 31) + this.e) * 31)) * 31)) * 31;
        int i10 = 0;
        String str = this.f11506f;
        if (str == null) {
            i8 = 0;
        } else {
            i8 = str.hashCode();
        }
        int i11 = (hashCode2 + i8) * 31;
        String str2 = this.f11507g;
        if (str2 == null) {
            i9 = 0;
        } else {
            i9 = str2.hashCode();
        }
        int i12 = (i11 + i9) * 31;
        String str3 = this.f11508h;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }
}
