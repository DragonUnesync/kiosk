package r2;

import android.support.v4.media.session.b;
import u2.c;
import u2.t;
import u2.u;
import v2.e;
import y2.C1627b;
import y2.C1628c;

/* renamed from: r2.c  reason: case insensitive filesystem */
public final class C1384c extends o {

    /* renamed from: V  reason: collision with root package name */
    public final u f14868V;

    /* renamed from: W  reason: collision with root package name */
    public final int f14869W;

    /* renamed from: X  reason: collision with root package name */
    public final u f14870X;

    /* renamed from: Y  reason: collision with root package name */
    public C1381E f14871Y;

    /* renamed from: Z  reason: collision with root package name */
    public final t f14872Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C1383b f14873a0;

    /* renamed from: b0  reason: collision with root package name */
    public C1388g f14874b0;

    /* renamed from: c0  reason: collision with root package name */
    public final C1382a f14875c0;

    /* JADX WARNING: type inference failed for: r1v3, types: [r2.a, r2.x] */
    public C1384c(u uVar, int i, u uVar2, e eVar, t tVar) {
        C1381E e;
        if (uVar == null) {
            throw new NullPointerException("thisClass == null");
        } else if (eVar != null) {
            this.f14868V = uVar;
            this.f14869W = i;
            this.f14870X = uVar2;
            if (((C1628c) eVar).f16371V.length == 0) {
                e = null;
            } else {
                e = new C1381E(eVar);
            }
            this.f14871Y = e;
            this.f14872Z = tVar;
            this.f14873a0 = new C1383b(uVar);
            this.f14874b0 = null;
            this.f14875c0 = new x(4, -1);
        } else {
            throw new NullPointerException("interfaces == null");
        }
    }

    public final void a(C1387f fVar) {
        z zVar = fVar.f14887f;
        zVar.p(this.f14868V);
        C1383b bVar = this.f14873a0;
        if (!bVar.p()) {
            fVar.f14891k.k(bVar);
            c o2 = bVar.o();
            if (o2 != null) {
                this.f14874b0 = (C1388g) fVar.f14892l.l(new C1388g(o2));
            }
        }
        u uVar = this.f14870X;
        if (uVar != null) {
            zVar.p(uVar);
        }
        C1381E e = this.f14871Y;
        if (e != null) {
            this.f14871Y = (C1381E) fVar.f14884b.l(e);
        }
        t tVar = this.f14872Z;
        if (tVar != null) {
            fVar.e.o(tVar);
        }
        this.f14875c0.getClass();
    }

    public final q b() {
        return q.TYPE_CLASS_DEF_ITEM;
    }

    public final int c() {
        return 32;
    }

    public final void d(C1387f fVar, C1627b bVar) {
        int i;
        int i8;
        int i9;
        int i10;
        String str;
        C1387f fVar2 = fVar;
        C1627b bVar2 = bVar;
        boolean d8 = bVar.d();
        z zVar = fVar2.f14887f;
        u uVar = this.f14868V;
        int m8 = zVar.m(uVar);
        int i11 = -1;
        u uVar2 = this.f14870X;
        if (uVar2 == null) {
            i = -1;
        } else {
            i = zVar.m(uVar2);
        }
        C1381E e = this.f14871Y;
        if (e == null) {
            i8 = 0;
        } else {
            i8 = e.f();
        }
        this.f14875c0.getClass();
        t tVar = this.f14872Z;
        if (tVar != null) {
            i11 = fVar2.e.l(tVar);
        }
        C1383b bVar3 = this.f14873a0;
        if (bVar3.p()) {
            i9 = 0;
        } else {
            i9 = bVar3.f();
        }
        C1388g gVar = this.f14874b0;
        if (gVar == null) {
            i10 = 0;
        } else {
            i10 = gVar.f();
        }
        int i12 = this.f14869W;
        if (d8) {
            bVar2.b(0, f() + ' ' + uVar.f15772U.a());
            bVar2.b(4, "  class_idx:           ".concat(b.Q(m8)));
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(R.e.l(i12, 30257, 1));
            bVar2.b(4, sb.toString());
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(b.Q(i));
            sb2.append(" // ");
            String str2 = "<none>";
            if (uVar2 == null) {
                str = str2;
            } else {
                str = uVar2.f15772U.a();
            }
            sb2.append(str);
            bVar2.b(4, sb2.toString());
            bVar2.b(4, "  interfaces_off:      ".concat(b.Q(i8)));
            if (i8 != 0) {
                e eVar = this.f14871Y.f14857Y;
                int length = ((C1628c) eVar).f16371V.length;
                int i13 = 0;
                while (i13 < length) {
                    bVar2.b(0, "    " + eVar.b(i13).a());
                    i13++;
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(b.Q(i11));
            sb3.append(" // ");
            if (tVar != null) {
                str2 = tVar.a();
            }
            sb3.append(str2);
            bVar2.b(4, sb3.toString());
            bVar2.b(4, "  annotations_off:     ".concat(b.Q(0)));
            bVar2.b(4, "  class_data_off:      ".concat(b.Q(i9)));
            bVar2.b(4, "  static_values_off:   ".concat(b.Q(i10)));
        }
        bVar2.j(m8);
        bVar2.j(i12);
        bVar2.j(i);
        bVar2.j(i8);
        bVar2.j(i11);
        bVar2.j(0);
        bVar2.j(i9);
        bVar2.j(i10);
    }
}
