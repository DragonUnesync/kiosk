package f4;

import M3.h;
import M3.n;
import S3.b;

/* renamed from: f4.b  reason: case insensitive filesystem */
public final class C0901b {

    /* renamed from: a  reason: collision with root package name */
    public final b f11673a;

    /* renamed from: b  reason: collision with root package name */
    public final n f11674b;

    /* renamed from: c  reason: collision with root package name */
    public final n f11675c;

    /* renamed from: d  reason: collision with root package name */
    public final n f11676d;
    public final n e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11677f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11678g;

    /* renamed from: h  reason: collision with root package name */
    public final int f11679h;
    public final int i;

    public C0901b(b bVar, n nVar, n nVar2, n nVar3, n nVar4) {
        boolean z = false;
        boolean z6 = nVar == null || nVar2 == null;
        z = (nVar3 == null || nVar4 == null) ? true : z;
        if (!z6 || !z) {
            if (z6) {
                nVar = new n(0.0f, nVar3.f3165b);
                nVar2 = new n(0.0f, nVar4.f3165b);
            } else if (z) {
                int i8 = bVar.f4505U;
                nVar3 = new n((float) (i8 - 1), nVar.f3165b);
                nVar4 = new n((float) (i8 - 1), nVar2.f3165b);
            }
            this.f11673a = bVar;
            this.f11674b = nVar;
            this.f11675c = nVar2;
            this.f11676d = nVar3;
            this.e = nVar4;
            this.f11677f = (int) Math.min(nVar.f3164a, nVar2.f3164a);
            this.f11678g = (int) Math.max(nVar3.f3164a, nVar4.f3164a);
            this.f11679h = (int) Math.min(nVar.f3165b, nVar3.f3165b);
            this.i = (int) Math.max(nVar2.f3165b, nVar4.f3165b);
            return;
        }
        throw h.f3144W;
    }

    public C0901b(C0901b bVar) {
        this.f11673a = bVar.f11673a;
        this.f11674b = bVar.f11674b;
        this.f11675c = bVar.f11675c;
        this.f11676d = bVar.f11676d;
        this.e = bVar.e;
        this.f11677f = bVar.f11677f;
        this.f11678g = bVar.f11678g;
        this.f11679h = bVar.f11679h;
        this.i = bVar.i;
    }
}
