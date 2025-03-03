package a1;

import D2.j;
import H3.C0103u;
import H3.O;
import M0.J;
import M0.r;
import P0.z;
import R0.g;
import R0.h;
import R0.v;
import W1.e;
import android.net.Uri;
import android.os.SystemClock;
import h1.C1048n;
import h1.C1053t;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import l1.k;
import l1.m;
import l1.p;
import l1.s;

/* renamed from: a1.d  reason: case insensitive filesystem */
public final class C0413d implements k {

    /* renamed from: U  reason: collision with root package name */
    public final Uri f7030U;

    /* renamed from: V  reason: collision with root package name */
    public final p f7031V = new p("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: W  reason: collision with root package name */
    public final h f7032W;

    /* renamed from: X  reason: collision with root package name */
    public k f7033X;

    /* renamed from: Y  reason: collision with root package name */
    public long f7034Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f7035Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f7036a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f7037b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f7038c0;

    /* renamed from: d0  reason: collision with root package name */
    public IOException f7039d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7040e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ e f7041f0;

    public C0413d(e eVar, Uri uri) {
        this.f7041f0 = eVar;
        this.f7030U = uri;
        this.f7032W = ((g) eVar.f7043U.f2027U).g();
    }

    public static boolean a(C0413d dVar, long j7) {
        dVar.f7037b0 = SystemClock.elapsedRealtime() + j7;
        e eVar = dVar.f7041f0;
        if (!dVar.f7030U.equals(eVar.f7053e0)) {
            return false;
        }
        List list = eVar.f7052d0.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C0413d dVar2 = (C0413d) eVar.f7046X.get(((m) list.get(i)).f7099a);
            dVar2.getClass();
            if (elapsedRealtime > dVar2.f7037b0) {
                Uri uri = dVar2.f7030U;
                eVar.f7053e0 = uri;
                dVar2.e(eVar.b(uri));
                return false;
            }
        }
        return true;
    }

    public final void A(m mVar, long j7, long j8, boolean z) {
        s sVar = (s) mVar;
        long j9 = sVar.f13153U;
        Uri uri = sVar.f13156X.f4324W;
        C1053t tVar = new C1053t(j8);
        e eVar = this.f7041f0;
        eVar.f7045W.getClass();
        eVar.f7048Z.c(tVar, 4, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri b() {
        String str;
        k kVar = this.f7033X;
        Uri uri = this.f7030U;
        if (kVar != null) {
            j jVar = kVar.f7095v;
            if (jVar.f7075a != -9223372036854775807L || jVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                k kVar2 = this.f7033X;
                if (kVar2.f7095v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(kVar2.f7084k + ((long) kVar2.f7091r.size())));
                    k kVar3 = this.f7033X;
                    if (kVar3.f7087n != -9223372036854775807L) {
                        O o2 = kVar3.f7092s;
                        int size = o2.size();
                        if (!o2.isEmpty() && ((f) C0103u.l(o2)).f7058g0) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                j jVar2 = this.f7033X.f7095v;
                if (jVar2.f7075a != -9223372036854775807L) {
                    if (jVar2.f7076b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    buildUpon.appendQueryParameter("_HLS_skip", str);
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        Uri uri;
        if (z) {
            uri = b();
        } else {
            uri = this.f7030U;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        e eVar = this.f7041f0;
        s sVar = new s(this.f7032W, uri, 4, eVar.f7044V.i(eVar.f7052d0, this.f7033X));
        C1048n nVar = eVar.f7045W;
        int i = sVar.f13155W;
        eVar.f7048Z.g(new C1053t(sVar.f13153U, sVar.f13154V, this.f7031V.f(sVar, this, nVar.r(i))), i, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.f7037b0 = 0;
        if (!this.f7038c0) {
            p pVar = this.f7031V;
            if (!pVar.d() && !pVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = this.f7036a0;
                if (elapsedRealtime < j7) {
                    this.f7038c0 = true;
                    this.f7041f0.f7050b0.postDelayed(new C0412c((Object) this, 0, (Object) uri), j7 - elapsedRealtime);
                    return;
                }
                d(uri);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(a1.k r47, h1.C1053t r48) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            a1.k r2 = r0.f7033X
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.f7034Y = r3
            a1.e r5 = r0.f7041f0
            r5.getClass()
            if (r2 == 0) goto L_0x00a6
            long r10 = r1.f7084k
            long r12 = r2.f7084k
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x001d
            goto L_0x00a9
        L_0x001d:
            boolean r10 = r2.f7088o
            H3.O r11 = r2.f7092s
            H3.O r12 = r2.f7091r
            boolean r13 = r1.f7088o
            if (r14 >= 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            H3.O r14 = r1.f7091r
            int r14 = r14.size()
            int r15 = r12.size()
            int r14 = r14 - r15
            if (r14 == 0) goto L_0x0039
            if (r14 <= 0) goto L_0x004c
            goto L_0x00a9
        L_0x0039:
            H3.O r14 = r1.f7092s
            int r14 = r14.size()
            int r15 = r11.size()
            if (r14 > r15) goto L_0x00a9
            if (r14 != r15) goto L_0x004c
            if (r13 == 0) goto L_0x004c
            if (r10 != 0) goto L_0x004c
            goto L_0x00a9
        L_0x004c:
            if (r13 == 0) goto L_0x00a4
            if (r10 == 0) goto L_0x0051
            goto L_0x00a4
        L_0x0051:
            a1.k r10 = new a1.k
            r15 = r10
            r34 = 1
            boolean r13 = r2.f7089p
            r35 = r13
            int r13 = r2.f7079d
            r16 = r13
            java.lang.String r13 = r2.f7111a
            r17 = r13
            java.util.List r13 = r2.f7112b
            r18 = r13
            long r13 = r2.e
            r19 = r13
            boolean r13 = r2.f7081g
            r21 = r13
            long r13 = r2.f7082h
            r22 = r13
            boolean r13 = r2.i
            r24 = r13
            int r13 = r2.f7083j
            r25 = r13
            long r13 = r2.f7084k
            r26 = r13
            int r13 = r2.f7085l
            r28 = r13
            long r13 = r2.f7086m
            r29 = r13
            long r13 = r2.f7087n
            r31 = r13
            boolean r13 = r2.f7113c
            r33 = r13
            M0.n r13 = r2.f7090q
            r36 = r13
            a1.j r13 = r2.f7095v
            r39 = r13
            H3.n0 r13 = r2.f7093t
            r40 = r13
            r37 = r12
            r38 = r11
            r15.<init>(r16, r17, r18, r19, r21, r22, r24, r25, r26, r28, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40)
        L_0x00a1:
            r8 = 0
            goto L_0x017d
        L_0x00a4:
            r10 = r2
            goto L_0x00a1
        L_0x00a6:
            r47.getClass()
        L_0x00a9:
            boolean r10 = r1.f7089p
            long r11 = r1.f7084k
            if (r10 == 0) goto L_0x00b4
            long r13 = r1.f7082h
        L_0x00b1:
            r27 = r13
            goto L_0x00f1
        L_0x00b4:
            a1.k r10 = r5.f7054f0
            if (r10 == 0) goto L_0x00bb
            long r13 = r10.f7082h
            goto L_0x00bd
        L_0x00bb:
            r13 = 0
        L_0x00bd:
            if (r2 != 0) goto L_0x00c0
            goto L_0x00b1
        L_0x00c0:
            H3.O r10 = r2.f7091r
            int r15 = r10.size()
            long r8 = r2.f7084k
            long r6 = r11 - r8
            int r7 = (int) r6
            int r6 = r10.size()
            if (r7 >= r6) goto L_0x00da
            java.lang.Object r6 = r10.get(r7)
            a1.h r6 = (a1.h) r6
            r20 = r13
            goto L_0x00dd
        L_0x00da:
            r20 = r13
            r6 = 0
        L_0x00dd:
            long r13 = r2.f7082h
            if (r6 == 0) goto L_0x00e5
            long r6 = r6.f7068Y
        L_0x00e3:
            long r13 = r13 + r6
            goto L_0x00b1
        L_0x00e5:
            long r6 = (long) r15
            long r8 = r11 - r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x00ef
            long r6 = r2.f7094u
            goto L_0x00e3
        L_0x00ef:
            r27 = r20
        L_0x00f1:
            boolean r6 = r1.i
            H3.O r7 = r1.f7091r
            if (r6 == 0) goto L_0x00fd
            int r6 = r1.f7083j
        L_0x00f9:
            r30 = r6
            r8 = 0
            goto L_0x0132
        L_0x00fd:
            a1.k r6 = r5.f7054f0
            if (r6 == 0) goto L_0x0104
            int r6 = r6.f7083j
            goto L_0x0105
        L_0x0104:
            r6 = 0
        L_0x0105:
            if (r2 != 0) goto L_0x0108
            goto L_0x00f9
        L_0x0108:
            long r8 = r2.f7084k
            long r11 = r11 - r8
            int r8 = (int) r11
            H3.O r9 = r2.f7091r
            int r10 = r9.size()
            if (r8 >= r10) goto L_0x011b
            java.lang.Object r8 = r9.get(r8)
            a1.h r8 = (a1.h) r8
            goto L_0x011c
        L_0x011b:
            r8 = 0
        L_0x011c:
            if (r8 == 0) goto L_0x0130
            int r6 = r2.f7083j
            int r8 = r8.f7067X
            int r6 = r6 + r8
            r8 = 0
            java.lang.Object r9 = r7.get(r8)
            a1.h r9 = (a1.h) r9
            int r9 = r9.f7067X
            int r6 = r6 - r9
        L_0x012d:
            r30 = r6
            goto L_0x0132
        L_0x0130:
            r8 = 0
            goto L_0x012d
        L_0x0132:
            a1.k r10 = new a1.k
            r20 = r10
            boolean r6 = r1.f7088o
            r39 = r6
            boolean r6 = r1.f7089p
            r40 = r6
            int r6 = r1.f7079d
            r21 = r6
            java.lang.String r6 = r1.f7111a
            r22 = r6
            java.util.List r6 = r1.f7112b
            r23 = r6
            long r11 = r1.e
            r24 = r11
            boolean r6 = r1.f7081g
            r26 = r6
            r29 = 1
            long r11 = r1.f7084k
            r31 = r11
            int r6 = r1.f7085l
            r33 = r6
            long r11 = r1.f7086m
            r34 = r11
            long r11 = r1.f7087n
            r36 = r11
            boolean r6 = r1.f7113c
            r38 = r6
            M0.n r6 = r1.f7090q
            r41 = r6
            H3.O r6 = r1.f7092s
            r43 = r6
            a1.j r6 = r1.f7095v
            r44 = r6
            H3.n0 r6 = r1.f7093t
            r45 = r6
            r42 = r7
            r20.<init>(r21, r22, r23, r24, r26, r27, r29, r30, r31, r33, r34, r36, r38, r39, r40, r41, r42, r43, r44, r45)
        L_0x017d:
            r0.f7033X = r10
            java.util.concurrent.CopyOnWriteArrayList r6 = r5.f7047Y
            r7 = 1
            android.net.Uri r9 = r0.f7030U
            boolean r11 = r10.f7088o
            if (r10 == r2) goto L_0x01bc
            r12 = 0
            r0.f7039d0 = r12
            r0.f7035Z = r3
            android.net.Uri r1 = r5.f7053e0
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x01a8
            a1.k r1 = r5.f7054f0
            if (r1 != 0) goto L_0x01a1
            r1 = r11 ^ 1
            r5.f7055g0 = r1
            long r7 = r10.f7082h
            r5.f7056h0 = r7
        L_0x01a1:
            r5.f7054f0 = r10
            Z0.l r1 = r5.f7051c0
            r1.u(r10)
        L_0x01a8:
            java.util.Iterator r1 = r6.iterator()
        L_0x01ac:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0210
            java.lang.Object r6 = r1.next()
            a1.s r6 = (a1.s) r6
            r6.a()
            goto L_0x01ac
        L_0x01bc:
            r12 = 0
            if (r11 != 0) goto L_0x0210
            H3.O r10 = r1.f7091r
            int r10 = r10.size()
            long r10 = (long) r10
            long r13 = r1.f7084k
            long r13 = r13 + r10
            a1.k r1 = r0.f7033X
            long r10 = r1.f7084k
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01d8
            B2.c r1 = new B2.c
            r1.<init>()
            r8 = 1
            goto L_0x01f3
        L_0x01d8:
            long r10 = r0.f7035Z
            long r10 = r3 - r10
            double r10 = (double) r10
            long r13 = r1.f7086m
            long r13 = P0.z.c0(r13)
            double r13 = (double) r13
            r18 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r13 = r13 * r18
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f2
            B2.c r1 = new B2.c
            r1.<init>()
            goto L_0x01f3
        L_0x01f2:
            r1 = r12
        L_0x01f3:
            if (r1 == 0) goto L_0x0210
            r0.f7039d0 = r1
            D2.j r10 = new D2.j
            r10.<init>((int) r7, (java.lang.Object) r1)
            java.util.Iterator r1 = r6.iterator()
        L_0x0200:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0210
            java.lang.Object r6 = r1.next()
            a1.s r6 = (a1.s) r6
            r6.c(r9, r10, r8)
            goto L_0x0200
        L_0x0210:
            a1.k r1 = r0.f7033X
            a1.j r6 = r1.f7095v
            boolean r6 = r6.e
            if (r6 != 0) goto L_0x0223
            long r6 = r1.f7086m
            if (r1 == r2) goto L_0x021d
            goto L_0x0220
        L_0x021d:
            r1 = 2
            long r6 = r6 / r1
        L_0x0220:
            r16 = r6
            goto L_0x0225
        L_0x0223:
            r16 = 0
        L_0x0225:
            long r1 = P0.z.c0(r16)
            long r1 = r1 + r3
            r3 = r48
            long r3 = r3.f12514a
            long r1 = r1 - r3
            r0.f7036a0 = r1
            a1.k r1 = r0.f7033X
            boolean r1 = r1.f7088o
            if (r1 != 0) goto L_0x024a
            android.net.Uri r1 = r5.f7053e0
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0243
            boolean r1 = r0.f7040e0
            if (r1 == 0) goto L_0x024a
        L_0x0243:
            android.net.Uri r1 = r46.b()
            r0.e(r1)
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0413d.f(a1.k, h1.t):void");
    }

    public final e k(m mVar, long j7, long j8, IOException iOException, int i) {
        boolean z;
        int i8;
        s sVar = (s) mVar;
        long j9 = sVar.f13153U;
        Uri uri = sVar.f13156X.f4324W;
        C1053t tVar = new C1053t(j8);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z6 = iOException instanceof p;
        e eVar = p.f13148Y;
        e eVar2 = this.f7041f0;
        int i9 = sVar.f13155W;
        if (z || z6) {
            if (iOException instanceof v) {
                i8 = ((v) iOException).f4313X;
            } else {
                i8 = Integer.MAX_VALUE;
            }
            if (z6 || i8 == 400 || i8 == 503) {
                this.f7036a0 = SystemClock.elapsedRealtime();
                c(false);
                Y0.e eVar3 = eVar2.f7048Z;
                int i10 = z.f3748a;
                eVar3.f(tVar, i9, iOException, true);
                return eVar;
            }
        }
        j jVar = new j(i, (Object) iOException);
        Iterator it = eVar2.f7047Y.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= !((s) it.next()).c(this.f7030U, jVar, false);
        }
        C1048n nVar = eVar2.f7045W;
        if (z8) {
            nVar.getClass();
            long s8 = C1048n.s(jVar);
            if (s8 != -9223372036854775807L) {
                eVar = new e(s8, 0, false);
            } else {
                eVar = p.f13149Z;
            }
        }
        boolean a8 = eVar.a();
        eVar2.f7048Z.f(tVar, i9, iOException, true ^ a8);
        if (!a8) {
            nVar.getClass();
        }
        return eVar;
    }

    public final void p(m mVar, long j7, long j8) {
        s sVar = (s) mVar;
        o oVar = (o) sVar.f13158Z;
        Uri uri = sVar.f13156X.f4324W;
        C1053t tVar = new C1053t(j8);
        if (oVar instanceof k) {
            f((k) oVar, tVar);
            this.f7041f0.f7048Z.d(tVar, 4, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        } else {
            J b8 = J.b((Exception) null, "Loaded playlist has unexpected type.");
            this.f7039d0 = b8;
            this.f7041f0.f7048Z.f(tVar, 4, b8, true);
        }
        this.f7041f0.f7045W.getClass();
    }
}
