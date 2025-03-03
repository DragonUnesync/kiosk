package f7;

import P6.f;
import h1.C1048n;
import l7.i;

/* renamed from: f7.b  reason: case insensitive filesystem */
public final class C0939b {

    /* renamed from: d  reason: collision with root package name */
    public static final i f11696d = C1048n.m(":");
    public static final i e = C1048n.m(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final i f11697f = C1048n.m(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final i f11698g = C1048n.m(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final i f11699h = C1048n.m(":scheme");
    public static final i i = C1048n.m(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final i f11700a;

    /* renamed from: b  reason: collision with root package name */
    public final i f11701b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11702c;

    static {
        i iVar = i.f13217X;
    }

    public C0939b(i iVar, i iVar2) {
        f.e(iVar, "name");
        f.e(iVar2, "value");
        this.f11700a = iVar;
        this.f11701b = iVar2;
        this.f11702c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0939b)) {
            return false;
        }
        C0939b bVar = (C0939b) obj;
        if (f.a(this.f11700a, bVar.f11700a) && f.a(this.f11701b, bVar.f11701b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11701b.hashCode() + (this.f11700a.hashCode() * 31);
    }

    public final String toString() {
        return this.f11700a.h() + ": " + this.f11701b.h();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0939b(String str, String str2) {
        this(C1048n.m(str), C1048n.m(str2));
        f.e(str, "name");
        f.e(str2, "value");
        i iVar = i.f13217X;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0939b(i iVar, String str) {
        this(iVar, C1048n.m(str));
        f.e(iVar, "name");
        f.e(str, "value");
        i iVar2 = i.f13217X;
    }
}
