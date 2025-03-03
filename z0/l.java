package Z0;

import H3.O;
import H3.P;
import M0.C;
import M0.C0136y;
import M0.C0137z;
import M0.D;
import M0.r;
import P0.z;
import R0.A;
import R0.g;
import U0.j;
import Y0.h;
import a1.C0413d;
import a1.e;
import a1.f;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import h1.C1031B;
import h1.C1035a;
import h1.C1048n;
import h1.C1053t;
import h1.C1059z;
import java.io.IOException;
import java.util.HashMap;
import l1.n;
import l1.p;
import l1.s;

public final class l extends C1035a {

    /* renamed from: h  reason: collision with root package name */
    public final c f6855h;
    public final P i;

    /* renamed from: j  reason: collision with root package name */
    public final C1048n f6856j;

    /* renamed from: k  reason: collision with root package name */
    public final h f6857k;

    /* renamed from: l  reason: collision with root package name */
    public final C1048n f6858l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6859m;

    /* renamed from: n  reason: collision with root package name */
    public final int f6860n;

    /* renamed from: o  reason: collision with root package name */
    public final e f6861o;

    /* renamed from: p  reason: collision with root package name */
    public final long f6862p;

    /* renamed from: q  reason: collision with root package name */
    public C0136y f6863q;

    /* renamed from: r  reason: collision with root package name */
    public A f6864r;

    /* renamed from: s  reason: collision with root package name */
    public C f6865s;

    static {
        D.a("media3.exoplayer.hls");
    }

    public l(C c8, P p3, c cVar, C1048n nVar, h hVar, C1048n nVar2, e eVar, long j7, boolean z, int i8) {
        this.f6865s = c8;
        this.f6863q = c8.f2787c;
        this.i = p3;
        this.f6855h = cVar;
        this.f6856j = nVar;
        this.f6857k = hVar;
        this.f6858l = nVar2;
        this.f6861o = eVar;
        this.f6862p = j7;
        this.f6859m = z;
        this.f6860n = i8;
    }

    public static f t(O o2, long j7) {
        f fVar = null;
        for (int i8 = 0; i8 < o2.size(); i8++) {
            f fVar2 = (f) o2.get(i8);
            int i9 = (fVar2.f7068Y > j7 ? 1 : (fVar2.f7068Y == j7 ? 0 : -1));
            if (i9 <= 0 && fVar2.f7057f0) {
                fVar = fVar2;
            } else if (i9 > 0) {
                break;
            }
        }
        return fVar;
    }

    public final C1059z b(C1031B b8, l1.e eVar, long j7) {
        Y0.e a8 = a(b8);
        Y0.e eVar2 = new Y0.e(this.f12433d.f6317c, 0, b8);
        A a9 = this.f6864r;
        j jVar = this.f12435g;
        P0.l.k(jVar);
        return new k(this.f6855h, this.f6861o, this.i, a9, this.f6857k, eVar2, this.f6858l, a8, eVar, this.f6856j, this.f6859m, this.f6860n, jVar);
    }

    public final synchronized C h() {
        return this.f6865s;
    }

    public final void j() {
        e eVar = this.f6861o;
        p pVar = eVar.f7049a0;
        if (pVar != null) {
            pVar.a();
        }
        Uri uri = eVar.f7053e0;
        if (uri != null) {
            C0413d dVar = (C0413d) eVar.f7046X.get(uri);
            dVar.f7031V.a();
            IOException iOException = dVar.f7039d0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final void l(A a8) {
        boolean z;
        this.f6864r = a8;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j jVar = this.f12435g;
        P0.l.k(jVar);
        h hVar = this.f6857k;
        hVar.c(myLooper, jVar);
        hVar.i();
        Y0.e a9 = a((C1031B) null);
        C0137z zVar = h().f2786b;
        zVar.getClass();
        e eVar = this.f6861o;
        eVar.getClass();
        eVar.f7050b0 = z.m((Handler.Callback) null);
        eVar.f7048Z = a9;
        eVar.f7051c0 = this;
        s sVar = new s(((g) eVar.f7043U.f2027U).g(), zVar.f3060a, 4, eVar.f7044V.x());
        if (eVar.f7049a0 == null) {
            z = true;
        } else {
            z = false;
        }
        P0.l.j(z);
        p pVar = new p("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        eVar.f7049a0 = pVar;
        C1048n nVar = eVar.f7045W;
        int i8 = sVar.f13155W;
        a9.g(new C1053t(sVar.f13153U, sVar.f13154V, pVar.f(sVar, eVar, nVar.r(i8))), i8, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void n(C1059z zVar) {
        k kVar = (k) zVar;
        kVar.f6834V.f7047Y.remove(kVar);
        for (q qVar : kVar.f6852n0) {
            if (qVar.f6926x0) {
                for (p pVar : qVar.p0) {
                    pVar.j();
                    P p3 = pVar.f12413h;
                    if (p3 != null) {
                        p3.D0(pVar.e);
                        pVar.f12413h = null;
                        pVar.f12412g = null;
                    }
                }
            }
            i iVar = qVar.f6901X;
            C0413d dVar = (C0413d) iVar.f6794g.f7046X.get(iVar.e[iVar.f6803q.k()]);
            if (dVar != null) {
                dVar.f7040e0 = false;
            }
            iVar.f6800n = null;
            qVar.f6907d0.e(qVar);
            qVar.f6915l0.removeCallbacksAndMessages((Object) null);
            qVar.f6881B0 = true;
            qVar.f6916m0.clear();
        }
        kVar.f6849k0 = null;
    }

    public final void p() {
        e eVar = this.f6861o;
        eVar.f7053e0 = null;
        eVar.f7054f0 = null;
        eVar.f7052d0 = null;
        eVar.f7056h0 = -9223372036854775807L;
        eVar.f7049a0.e((n) null);
        eVar.f7049a0 = null;
        HashMap hashMap = eVar.f7046X;
        for (C0413d dVar : hashMap.values()) {
            dVar.f7031V.e((n) null);
        }
        eVar.f7050b0.removeCallbacksAndMessages((Object) null);
        eVar.f7050b0 = null;
        hashMap.clear();
        this.f6857k.release();
    }

    public final synchronized void s(C c8) {
        this.f6865s = c8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(a1.k r40) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            boolean r2 = r1.f7089p
            long r5 = r1.f7082h
            if (r2 == 0) goto L_0x0010
            long r7 = P0.z.c0(r5)
            r12 = r7
            goto L_0x0015
        L_0x0010:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0015:
            r2 = 1
            r7 = 2
            int r8 = r1.f7079d
            if (r8 == r7) goto L_0x0024
            if (r8 != r2) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0025
        L_0x0024:
            r10 = r12
        L_0x0025:
            K1.i r14 = new K1.i
            a1.e r9 = r0.f6861o
            a1.n r15 = r9.f7052d0
            r15.getClass()
            r15 = 25
            r14.<init>(r15)
            boolean r15 = r9.f7055g0
            r17 = r8
            long r7 = r1.f7094u
            r18 = 0
            H3.O r2 = r1.f7091r
            boolean r3 = r1.f7081g
            r28 = r12
            long r12 = r1.e
            if (r15 == 0) goto L_0x0187
            r4 = r14
            long r14 = r9.f7056h0
            long r24 = r5 - r14
            boolean r9 = r1.f7088o
            if (r9 == 0) goto L_0x0053
            long r14 = r24 + r7
            r30 = r4
            goto L_0x005a
        L_0x0053:
            r30 = r4
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x005a:
            boolean r4 = r1.f7089p
            if (r4 == 0) goto L_0x006f
            r31 = r14
            long r14 = r0.f6862p
            long r14 = P0.z.y(r14)
            long r14 = P0.z.O(r14)
            long r5 = r5 + r7
            long r14 = r14 - r5
            r35 = r14
            goto L_0x0073
        L_0x006f:
            r31 = r14
            r35 = r18
        L_0x0073:
            M0.y r4 = r0.f6863q
            long r4 = r4.f3056a
            a1.j r6 = r1.f7095v
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r21 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r21 == 0) goto L_0x0089
            long r4 = P0.z.O(r4)
        L_0x0086:
            r33 = r4
            goto L_0x00b1
        L_0x0089:
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0090
            long r4 = r7 - r12
            goto L_0x00ae
        L_0x0090:
            long r4 = r6.f7078d
            int r21 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r21 == 0) goto L_0x00a1
            r21 = r4
            long r4 = r1.f7087n
            int r23 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r23 == 0) goto L_0x00a1
            r4 = r21
            goto L_0x00ae
        L_0x00a1:
            long r4 = r6.f7077c
            int r23 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r23 == 0) goto L_0x00a8
            goto L_0x00ae
        L_0x00a8:
            r4 = 3
            long r14 = r1.f7086m
            long r4 = r4 * r14
        L_0x00ae:
            long r4 = r4 + r35
            goto L_0x0086
        L_0x00b1:
            long r7 = r7 + r35
            r37 = r7
            long r4 = P0.z.j(r33, r35, r37)
            M0.C r14 = r39.h()
            M0.y r14 = r14.f2787c
            float r15 = r14.f3059d
            r23 = 0
            r26 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r15 = (r15 > r26 ? 1 : (r15 == r26 ? 0 : -1))
            if (r15 != 0) goto L_0x00e3
            float r14 = r14.e
            int r14 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r14 != 0) goto L_0x00e3
            long r14 = r6.f7077c
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r26 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r26 != 0) goto L_0x00e3
            long r14 = r6.f7078d
            int r6 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r6 != 0) goto L_0x00e3
            r6 = 1
            goto L_0x00e4
        L_0x00e3:
            r6 = 0
        L_0x00e4:
            M0.x r14 = new M0.x
            r14.<init>()
            long r4 = P0.z.c0(r4)
            r14.f3052a = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x00f6
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00fa
        L_0x00f6:
            M0.y r5 = r0.f6863q
            float r5 = r5.f3059d
        L_0x00fa:
            r14.f3055d = r5
            if (r6 == 0) goto L_0x00ff
            goto L_0x0103
        L_0x00ff:
            M0.y r4 = r0.f6863q
            float r4 = r4.e
        L_0x0103:
            r14.e = r4
            M0.y r4 = new M0.y
            r4.<init>(r14)
            r0.f6863q = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0116
            goto L_0x011e
        L_0x0116:
            long r4 = r4.f3056a
            long r4 = P0.z.O(r4)
            long r12 = r7 - r4
        L_0x011e:
            if (r3 == 0) goto L_0x0125
            r2 = r12
        L_0x0121:
            r5 = r17
        L_0x0123:
            r4 = 2
            goto L_0x0158
        L_0x0125:
            H3.O r3 = r1.f7092s
            a1.f r3 = t(r3, r12)
            if (r3 == 0) goto L_0x0130
            long r2 = r3.f7068Y
            goto L_0x0121
        L_0x0130:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x013b
            r5 = r17
            r2 = r18
            goto L_0x0123
        L_0x013b:
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r4 = 1
            int r3 = P0.z.c(r2, r3, r4)
            java.lang.Object r2 = r2.get(r3)
            a1.h r2 = (a1.h) r2
            H3.O r3 = r2.f7063g0
            a1.f r3 = t(r3, r12)
            if (r3 == 0) goto L_0x0155
            long r2 = r3.f7068Y
            goto L_0x0121
        L_0x0155:
            long r2 = r2.f7068Y
            goto L_0x0121
        L_0x0158:
            if (r5 != r4) goto L_0x0160
            boolean r4 = r1.f7080f
            if (r4 == 0) goto L_0x0160
            r4 = 1
            goto L_0x0161
        L_0x0160:
            r4 = 0
        L_0x0161:
            h1.c0 r5 = new h1.c0
            r6 = 1
            r23 = r9 ^ 1
            M0.C r26 = r39.h()
            M0.y r6 = r0.f6863q
            r27 = r6
            long r6 = r1.f7094u
            r16 = r6
            r22 = 1
            r9 = r5
            r12 = r28
            r6 = r30
            r14 = r31
            r18 = r24
            r20 = r2
            r24 = r4
            r25 = r6
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27)
            goto L_0x01d5
        L_0x0187:
            r6 = r14
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x01b6
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x0198
            goto L_0x01b6
        L_0x0198:
            if (r3 != 0) goto L_0x01b3
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x019f
            goto L_0x01b3
        L_0x019f:
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r4 = 1
            int r3 = P0.z.c(r2, r3, r4)
            java.lang.Object r2 = r2.get(r3)
            a1.h r2 = (a1.h) r2
            long r2 = r2.f7068Y
            r20 = r2
            goto L_0x01b8
        L_0x01b3:
            r20 = r12
            goto L_0x01b8
        L_0x01b6:
            r20 = r18
        L_0x01b8:
            h1.c0 r5 = new h1.c0
            r9 = r5
            M0.C r26 = r39.h()
            r22 = 1
            r27 = 0
            long r1 = r1.f7094u
            r14 = r1
            r16 = r1
            r18 = 0
            r23 = 0
            r24 = 1
            r12 = r28
            r25 = r6
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27)
        L_0x01d5:
            r0.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.l.u(a1.k):void");
    }
}
