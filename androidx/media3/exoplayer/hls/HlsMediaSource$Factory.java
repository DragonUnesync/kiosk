package androidx.media3.exoplayer.hls;

import H3.P;
import K1.i;
import M0.C;
import R0.g;
import Y0.b;
import Y0.h;
import Z0.c;
import Z0.l;
import a1.C0410a;
import a1.e;
import a1.r;
import h1.C1030A;
import h1.C1035a;
import h1.C1048n;
import java.util.List;

public final class HlsMediaSource$Factory implements C1030A {

    /* renamed from: a  reason: collision with root package name */
    public final P f8193a;

    /* renamed from: b  reason: collision with root package name */
    public c f8194b;

    /* renamed from: c  reason: collision with root package name */
    public i f8195c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8196d = true;
    public final C0410a e = new C0410a(0);

    /* renamed from: f  reason: collision with root package name */
    public final U0.c f8197f = e.f7042i0;

    /* renamed from: g  reason: collision with root package name */
    public final C1048n f8198g = new C1048n(0);

    /* renamed from: h  reason: collision with root package name */
    public final b f8199h = new b(0);
    public final C1048n i = new C1048n(4);

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8200j = true;

    /* renamed from: k  reason: collision with root package name */
    public final int f8201k = 1;

    /* renamed from: l  reason: collision with root package name */
    public final long f8202l = -9223372036854775807L;

    public HlsMediaSource$Factory(g gVar) {
        this.f8193a = new P((Object) gVar);
    }

    public final C1030A a(boolean z) {
        this.f8196d = z;
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [Z0.c, java.lang.Object] */
    public final C1035a b(C c8) {
        c8.f2786b.getClass();
        if (this.f8194b == null) {
            ? obj = new Object();
            obj.f6777a = new i(9);
            this.f8194b = obj;
        }
        i iVar = this.f8195c;
        if (iVar != null) {
            this.f8194b.f6777a = iVar;
        }
        c cVar = this.f8194b;
        cVar.f6778b = this.f8196d;
        r rVar = this.e;
        List list = c8.f2786b.f3062c;
        if (!list.isEmpty()) {
            rVar = new R2.c(rVar, 14, list);
        }
        h b8 = this.f8199h.b(c8);
        C1048n nVar = this.i;
        this.f8197f.getClass();
        P p3 = this.f8193a;
        return new l(c8, p3, cVar, this.f8198g, b8, nVar, new e(p3, nVar, rVar), this.f8202l, this.f8200j, this.f8201k);
    }

    public final C1030A c(i iVar) {
        this.f8195c = iVar;
        return this;
    }
}
