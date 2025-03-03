package a1;

import H3.P;
import M0.C0129q;
import M0.I;
import M0.r;
import P0.z;
import U0.c;
import Z0.l;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import h1.C1048n;
import h1.C1053t;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.k;
import l1.m;
import l1.p;
import l1.s;

public final class e implements k {

    /* renamed from: i0  reason: collision with root package name */
    public static final c f7042i0 = new c(10);

    /* renamed from: U  reason: collision with root package name */
    public final P f7043U;

    /* renamed from: V  reason: collision with root package name */
    public final r f7044V;

    /* renamed from: W  reason: collision with root package name */
    public final C1048n f7045W;

    /* renamed from: X  reason: collision with root package name */
    public final HashMap f7046X = new HashMap();

    /* renamed from: Y  reason: collision with root package name */
    public final CopyOnWriteArrayList f7047Y = new CopyOnWriteArrayList();

    /* renamed from: Z  reason: collision with root package name */
    public Y0.e f7048Z;

    /* renamed from: a0  reason: collision with root package name */
    public p f7049a0;

    /* renamed from: b0  reason: collision with root package name */
    public Handler f7050b0;

    /* renamed from: c0  reason: collision with root package name */
    public l f7051c0;

    /* renamed from: d0  reason: collision with root package name */
    public n f7052d0;

    /* renamed from: e0  reason: collision with root package name */
    public Uri f7053e0;

    /* renamed from: f0  reason: collision with root package name */
    public k f7054f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f7055g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f7056h0 = -9223372036854775807L;

    public e(P p3, C1048n nVar, r rVar) {
        this.f7043U = p3;
        this.f7044V = rVar;
        this.f7045W = nVar;
    }

    public final void A(m mVar, long j7, long j8, boolean z) {
        s sVar = (s) mVar;
        long j9 = sVar.f13153U;
        Uri uri = sVar.f13156X.f4324W;
        C1053t tVar = new C1053t(j8);
        this.f7045W.getClass();
        this.f7048Z.c(tVar, 4, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final k a(boolean z, Uri uri) {
        HashMap hashMap = this.f7046X;
        k kVar = ((C0413d) hashMap.get(uri)).f7033X;
        if (kVar != null && z) {
            if (!uri.equals(this.f7053e0)) {
                List list = this.f7052d0.e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (uri.equals(((m) list.get(i)).f7099a)) {
                        k kVar2 = this.f7054f0;
                        if (kVar2 == null || !kVar2.f7088o) {
                            this.f7053e0 = uri;
                            C0413d dVar = (C0413d) hashMap.get(uri);
                            k kVar3 = dVar.f7033X;
                            if (kVar3 == null || !kVar3.f7088o) {
                                dVar.e(b(uri));
                            } else {
                                this.f7054f0 = kVar3;
                                this.f7051c0.u(kVar3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            C0413d dVar2 = (C0413d) hashMap.get(uri);
            k kVar4 = dVar2.f7033X;
            if (!dVar2.f7040e0) {
                dVar2.f7040e0 = true;
                if (kVar4 != null && !kVar4.f7088o) {
                    dVar2.c(true);
                }
            }
        }
        return kVar;
    }

    public final Uri b(Uri uri) {
        g gVar;
        k kVar = this.f7054f0;
        if (kVar == null || !kVar.f7095v.e || (gVar = (g) kVar.f7093t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar.f7060b));
        int i = gVar.f7061c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i;
        C0413d dVar = (C0413d) this.f7046X.get(uri);
        if (dVar.f7033X == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000, z.c0(dVar.f7033X.f7094u));
        k kVar = dVar.f7033X;
        if (kVar.f7088o || (i = kVar.f7079d) == 2 || i == 1 || dVar.f7034Y + max > elapsedRealtime) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final W1.e k(l1.m r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            r6 = 0
            l1.s r5 = (l1.s) r5
            h1.t r7 = new h1.t
            long r0 = r5.f13153U
            R0.z r0 = r5.f13156X
            android.net.Uri r0 = r0.f4324W
            r7.<init>(r8)
            h1.n r8 = r4.f7045W
            r8.getClass()
            boolean r8 = r10 instanceof M0.J
            r9 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L_0x004c
            boolean r8 = r10 instanceof java.io.FileNotFoundException
            if (r8 != 0) goto L_0x004c
            boolean r8 = r10 instanceof R0.s
            if (r8 != 0) goto L_0x004c
            boolean r8 = r10 instanceof l1.o
            if (r8 != 0) goto L_0x004c
            int r8 = R0.i.f4264V
            r8 = r10
        L_0x002c:
            if (r8 == 0) goto L_0x0041
            boolean r2 = r8 instanceof R0.i
            if (r2 == 0) goto L_0x003c
            r2 = r8
            R0.i r2 = (R0.i) r2
            int r2 = r2.f4265U
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r2 != r3) goto L_0x003c
            goto L_0x004c
        L_0x003c:
            java.lang.Throwable r8 = r8.getCause()
            goto L_0x002c
        L_0x0041:
            int r11 = r11 - r9
            int r11 = r11 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r8 = java.lang.Math.min(r11, r8)
            long r2 = (long) r8
            goto L_0x004d
        L_0x004c:
            r2 = r0
        L_0x004d:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            Y0.e r8 = r4.f7048Z
            int r5 = r5.f13155W
            r8.f(r7, r5, r10, r9)
            if (r9 == 0) goto L_0x005f
            W1.e r5 = l1.p.f13149Z
            goto L_0x0064
        L_0x005f:
            W1.e r5 = new W1.e
            r5.<init>(r2, r6, r6)
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.e.k(l1.m, long, long, java.io.IOException, int):W1.e");
    }

    public final void p(m mVar, long j7, long j8) {
        n nVar;
        s sVar = (s) mVar;
        o oVar = (o) sVar.f13158Z;
        boolean z = oVar instanceof k;
        if (z) {
            String str = oVar.f7111a;
            n nVar2 = n.f7104l;
            Uri parse = Uri.parse(str);
            C0129q qVar = new C0129q();
            qVar.f2989a = "0";
            qVar.f2998l = I.o("application/x-mpegURL");
            nVar = new n("", Collections.emptyList(), Collections.singletonList(new m(parse, new r(qVar), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (r) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            nVar = (n) oVar;
        }
        this.f7052d0 = nVar;
        this.f7053e0 = ((m) nVar.e.get(0)).f7099a;
        this.f7047Y.add(new C0411b(this));
        List list = nVar.f7105d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.f7046X.put(uri, new C0413d(this, uri));
        }
        Uri uri2 = sVar.f13156X.f4324W;
        C1053t tVar = new C1053t(j8);
        C0413d dVar = (C0413d) this.f7046X.get(this.f7053e0);
        if (z) {
            dVar.f((k) oVar, tVar);
        } else {
            dVar.c(false);
        }
        this.f7045W.getClass();
        this.f7048Z.d(tVar, 4, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }
}
