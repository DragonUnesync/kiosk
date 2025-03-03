package W0;

import B2.c;
import K1.i;
import M0.J;
import M0.r;
import P0.l;
import P0.z;
import T7.C;
import android.net.Uri;
import h1.C1053t;
import j$.util.Objects;
import java.io.IOException;
import l1.k;
import l1.m;
import l1.q;
import l1.s;
import m1.C1207b;

public final class d implements k, q {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6037U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ g f6038V;

    public /* synthetic */ d(g gVar, int i) {
        this.f6037U = i;
        this.f6038V = gVar;
    }

    public void A(m mVar, long j7, long j8, boolean z) {
        switch (this.f6037U) {
            case 2:
                this.f6038V.v((s) mVar, j7, j8);
                return;
            default:
                this.f6038V.v((s) mVar, j7, j8);
                return;
        }
    }

    public void a() {
        g gVar = this.f6038V;
        gVar.f6048A.a();
        c cVar = gVar.f6050C;
        if (cVar != null) {
            throw cVar;
        }
    }

    public void b() {
        long j7;
        g gVar = this.f6038V;
        synchronized (C1207b.f13344b) {
            try {
                if (C1207b.f13345c) {
                    j7 = C1207b.f13346d;
                } else {
                    j7 = -9223372036854775807L;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        gVar.f6059L = j7;
        gVar.x(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public W1.e k(l1.m r6, long r7, long r9, java.io.IOException r11, int r12) {
        /*
            r5 = this;
            r7 = 0
            r8 = 1
            W0.g r0 = r5.f6038V
            int r1 = r5.f6037U
            switch(r1) {
                case 2: goto L_0x002b;
                default: goto L_0x0009;
            }
        L_0x0009:
            l1.s r6 = (l1.s) r6
            r0.getClass()
            h1.t r7 = new h1.t
            long r1 = r6.f13153U
            R0.z r12 = r6.f13156X
            android.net.Uri r12 = r12.f4324W
            r7.<init>(r9)
            int r6 = r6.f13155W
            Y0.e r9 = r0.f6072q
            r9.f(r7, r6, r11, r8)
            h1.n r6 = r0.f6068m
            r6.getClass()
            r0.w(r11)
            W1.e r6 = l1.p.f13148Y
            return r6
        L_0x002b:
            l1.s r6 = (l1.s) r6
            r0.getClass()
            h1.t r1 = new h1.t
            long r2 = r6.f13153U
            R0.z r2 = r6.f13156X
            android.net.Uri r2 = r2.f4324W
            r1.<init>(r9)
            h1.n r9 = r0.f6068m
            r9.getClass()
            boolean r9 = r11 instanceof M0.J
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L_0x0078
            boolean r9 = r11 instanceof java.io.FileNotFoundException
            if (r9 != 0) goto L_0x0078
            boolean r9 = r11 instanceof R0.s
            if (r9 != 0) goto L_0x0078
            boolean r9 = r11 instanceof l1.o
            if (r9 != 0) goto L_0x0078
            int r9 = R0.i.f4264V
            r9 = r11
        L_0x0058:
            if (r9 == 0) goto L_0x006d
            boolean r10 = r9 instanceof R0.i
            if (r10 == 0) goto L_0x0068
            r10 = r9
            R0.i r10 = (R0.i) r10
            int r10 = r10.f4265U
            r4 = 2008(0x7d8, float:2.814E-42)
            if (r10 != r4) goto L_0x0068
            goto L_0x0078
        L_0x0068:
            java.lang.Throwable r9 = r9.getCause()
            goto L_0x0058
        L_0x006d:
            int r12 = r12 - r8
            int r12 = r12 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r12, r9)
            long r9 = (long) r9
            goto L_0x0079
        L_0x0078:
            r9 = r2
        L_0x0079:
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0080
            W1.e r7 = l1.p.f13149Z
            goto L_0x0086
        L_0x0080:
            W1.e r12 = new W1.e
            r12.<init>(r9, r7, r7)
            r7 = r12
        L_0x0086:
            boolean r9 = r7.a()
            r8 = r8 ^ r9
            Y0.e r9 = r0.f6072q
            int r6 = r6.f13155W
            r9.f(r1, r6, r11, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.d.k(l1.m, long, long, java.io.IOException, int):W1.e");
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [l1.r, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v36, types: [java.io.IOException, B2.c] */
    public void p(m mVar, long j7, long j8) {
        int i;
        long j9 = j7;
        long j10 = j8;
        switch (this.f6037U) {
            case 2:
                s sVar = (s) mVar;
                g gVar = this.f6038V;
                gVar.getClass();
                long j11 = sVar.f13153U;
                Uri uri = sVar.f13156X.f4324W;
                C1053t tVar = new C1053t(j10);
                gVar.f6068m.getClass();
                gVar.f6072q.d(tVar, sVar.f13155W, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                X0.c cVar = (X0.c) sVar.f13158Z;
                X0.c cVar2 = gVar.f6055H;
                if (cVar2 == null) {
                    i = 0;
                } else {
                    i = cVar2.f6224m.size();
                }
                long j12 = cVar.b(0).f6244b;
                int i8 = 0;
                while (i8 < i && gVar.f6055H.b(i8).f6244b < j12) {
                    i8++;
                }
                if (cVar.f6217d) {
                    if (i - i8 > cVar.f6224m.size()) {
                        l.B("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j13 = gVar.f6061N;
                        if (j13 == -9223372036854775807L || cVar.f6220h * 1000 > j13) {
                            gVar.f6060M = 0;
                        } else {
                            l.B("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f6220h + ", " + gVar.f6061N);
                        }
                    }
                    int i9 = gVar.f6060M;
                    gVar.f6060M = i9 + 1;
                    if (i9 < gVar.f6068m.r(sVar.f13155W)) {
                        gVar.f6051D.postDelayed(gVar.f6077v, (long) Math.min((gVar.f6060M - 1) * 1000, 5000));
                        return;
                    }
                    gVar.f6050C = new IOException();
                    return;
                }
                gVar.f6055H = cVar;
                gVar.f6056I &= cVar.f6217d;
                gVar.f6057J = j9 - j10;
                gVar.f6058K = j9;
                gVar.f6062O += i8;
                synchronized (gVar.f6075t) {
                    try {
                        if (sVar.f13154V.f4277a == gVar.f6053F) {
                            Uri uri2 = gVar.f6055H.f6222k;
                            if (uri2 == null) {
                                uri2 = sVar.f13156X.f4324W;
                            }
                            gVar.f6053F = uri2;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                X0.c cVar3 = gVar.f6055H;
                if (!cVar3.f6217d || gVar.f6059L != -9223372036854775807L) {
                    gVar.x(true);
                    return;
                }
                C c8 = cVar3.i;
                if (c8 != null) {
                    String str = c8.f5077b;
                    int i10 = z.f3748a;
                    if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                        try {
                            gVar.f6059L = z.R(c8.f5078c) - gVar.f6058K;
                            gVar.x(true);
                            return;
                        } catch (J e) {
                            gVar.w(e);
                            return;
                        }
                    } else if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        s sVar2 = new s(gVar.z, Uri.parse(c8.f5078c), 5, new Object());
                        gVar.f6072q.g(new C1053t(sVar2.f13153U, sVar2.f13154V, gVar.f6048A.f(sVar2, new d(gVar, 4), 1)), sVar2.f13155W, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                        return;
                    } else if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                        s sVar3 = new s(gVar.z, Uri.parse(c8.f5078c), 5, new i(19));
                        gVar.f6072q.g(new C1053t(sVar3.f13153U, sVar3.f13154V, gVar.f6048A.f(sVar3, new d(gVar, 4), 1)), sVar3.f13155W, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                        return;
                    } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        gVar.u();
                        return;
                    } else {
                        gVar.w(new IOException("Unsupported UTC timing scheme"));
                        return;
                    }
                } else {
                    gVar.u();
                    return;
                }
            default:
                s sVar4 = (s) mVar;
                g gVar2 = this.f6038V;
                gVar2.getClass();
                long j14 = sVar4.f13153U;
                Uri uri3 = sVar4.f13156X.f4324W;
                C1053t tVar2 = new C1053t(j10);
                gVar2.f6068m.getClass();
                gVar2.f6072q.d(tVar2, sVar4.f13155W, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                gVar2.f6059L = ((Long) sVar4.f13158Z).longValue() - j9;
                gVar2.x(true);
                return;
        }
    }
}
