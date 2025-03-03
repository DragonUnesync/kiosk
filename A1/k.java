package a1;

import H3.C0103u;
import H3.O;
import H3.n0;
import M0.C0126n;
import java.util.List;
import java.util.Map;

public final class k extends o {

    /* renamed from: d  reason: collision with root package name */
    public final int f7079d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7080f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7081g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7082h;
    public final boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7083j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7084k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7085l;

    /* renamed from: m  reason: collision with root package name */
    public final long f7086m;

    /* renamed from: n  reason: collision with root package name */
    public final long f7087n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f7088o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f7089p;

    /* renamed from: q  reason: collision with root package name */
    public final C0126n f7090q;

    /* renamed from: r  reason: collision with root package name */
    public final O f7091r;

    /* renamed from: s  reason: collision with root package name */
    public final O f7092s;

    /* renamed from: t  reason: collision with root package name */
    public final n0 f7093t;

    /* renamed from: u  reason: collision with root package name */
    public final long f7094u;

    /* renamed from: v  reason: collision with root package name */
    public final j f7095v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(int i8, String str, List list, long j7, boolean z, long j8, boolean z6, int i9, long j9, int i10, long j10, long j11, boolean z8, boolean z9, boolean z10, C0126n nVar, List list2, List list3, j jVar, Map map) {
        super(str, list, z8);
        long j12 = j7;
        String str2 = str;
        List list4 = list;
        this.f7079d = i8;
        this.f7082h = j8;
        this.f7081g = z;
        this.i = z6;
        this.f7083j = i9;
        this.f7084k = j9;
        this.f7085l = i10;
        this.f7086m = j10;
        this.f7087n = j11;
        this.f7088o = z9;
        this.f7089p = z10;
        this.f7090q = nVar;
        this.f7091r = O.m(list2);
        this.f7092s = O.m(list3);
        this.f7093t = n0.a(map);
        if (!list3.isEmpty()) {
            f fVar = (f) C0103u.l(list3);
            this.f7094u = fVar.f7068Y + fVar.f7066W;
        } else if (!list2.isEmpty()) {
            h hVar = (h) C0103u.l(list2);
            this.f7094u = hVar.f7068Y + hVar.f7066W;
        } else {
            this.f7094u = 0;
        }
        long j13 = -9223372036854775807L;
        if (j12 != -9223372036854775807L) {
            if (j12 >= 0) {
                j13 = Math.min(this.f7094u, j7);
            } else {
                j13 = Math.max(0, this.f7094u + j12);
            }
        }
        this.e = j13;
        this.f7080f = j12 >= 0;
        this.f7095v = jVar;
    }

    public final Object a(List list) {
        return this;
    }
}
