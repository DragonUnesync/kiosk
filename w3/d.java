package W3;

import D2.j;
import M0.C0123k;

public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final d[] f6183h;

    /* renamed from: a  reason: collision with root package name */
    public final int f6184a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6185b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6186c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6187d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final j f6188f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6189g;

    /* JADX WARNING: type inference failed for: r8v16, types: [D2.j, java.lang.Object] */
    static {
        d dVar = new d(1, 10, 10, 8, 8, new j(5, new C0123k(1, 3, 6)));
        d dVar2 = new d(2, 12, 12, 10, 10, new j(7, new C0123k(1, 5, 6)));
        d dVar3 = new d(3, 14, 14, 12, 12, new j(10, new C0123k(1, 8, 6)));
        d dVar4 = new d(4, 16, 16, 14, 14, new j(12, new C0123k(1, 12, 6)));
        d dVar5 = new d(5, 18, 18, 16, 16, new j(14, new C0123k(1, 18, 6)));
        d dVar6 = new d(6, 20, 20, 18, 18, new j(18, new C0123k(1, 22, 6)));
        d dVar7 = new d(7, 22, 22, 20, 20, new j(20, new C0123k(1, 30, 6)));
        d dVar8 = new d(8, 24, 24, 22, 22, new j(24, new C0123k(1, 36, 6)));
        d dVar9 = new d(9, 26, 26, 24, 24, new j(28, new C0123k(1, 44, 6)));
        d dVar10 = new d(10, 32, 32, 14, 14, new j(36, new C0123k(1, 62, 6)));
        d dVar11 = new d(11, 36, 36, 16, 16, new j(42, new C0123k(1, 86, 6)));
        d dVar12 = new d(12, 40, 40, 18, 18, new j(48, new C0123k(1, 114, 6)));
        d dVar13 = new d(13, 44, 44, 20, 20, new j(56, new C0123k(1, 144, 6)));
        d dVar14 = new d(14, 48, 48, 22, 22, new j(68, new C0123k(1, 174, 6)));
        d dVar15 = new d(15, 52, 52, 24, 24, new j(42, new C0123k(2, 102, 6)));
        d dVar16 = new d(16, 64, 64, 14, 14, new j(56, new C0123k(2, 140, 6)));
        d dVar17 = new d(17, 72, 72, 16, 16, new j(36, new C0123k(4, 92, 6)));
        d dVar18 = new d(18, 80, 80, 18, 18, new j(48, new C0123k(4, 114, 6)));
        d dVar19 = new d(19, 88, 88, 20, 20, new j(56, new C0123k(4, 144, 6)));
        d dVar20 = new d(20, 96, 96, 22, 22, new j(68, new C0123k(4, 174, 6)));
        d dVar21 = new d(21, 104, 104, 24, 24, new j(56, new C0123k(6, 136, 6)));
        d dVar22 = new d(22, 120, 120, 18, 18, new j(68, new C0123k(6, 175, 6)));
        d dVar23 = new d(23, 132, 132, 20, 20, new j(62, new C0123k(8, 163, 6)));
        C0123k kVar = new C0123k(8, 156, 6);
        C0123k kVar2 = new C0123k(2, 155, 6);
        ? obj = new Object();
        obj.f1093U = 62;
        obj.f1094V = new C0123k[]{kVar, kVar2};
        f6183h = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23, new d(24, 144, 144, 22, 22, obj), new d(25, 8, 18, 6, 16, new j(7, new C0123k(1, 5, 6))), new d(26, 8, 32, 6, 14, new j(11, new C0123k(1, 10, 6))), new d(27, 12, 26, 10, 24, new j(14, new C0123k(1, 16, 6))), new d(28, 12, 36, 10, 16, new j(18, new C0123k(1, 22, 6))), new d(29, 16, 36, 14, 16, new j(24, new C0123k(1, 32, 6))), new d(30, 16, 48, 14, 22, new j(28, new C0123k(1, 49, 6)))};
    }

    public d(int i, int i8, int i9, int i10, int i11, j jVar) {
        this.f6184a = i;
        this.f6185b = i8;
        this.f6186c = i9;
        this.f6187d = i10;
        this.e = i11;
        this.f6188f = jVar;
        int i12 = 0;
        for (C0123k kVar : (C0123k[]) jVar.f1094V) {
            i12 += (kVar.f2965c + jVar.f1093U) * kVar.f2964b;
        }
        this.f6189g = i12;
    }

    public final String toString() {
        return String.valueOf(this.f6184a);
    }
}
