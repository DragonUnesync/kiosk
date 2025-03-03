package n1;

import H3.i0;
import M0.C0121i;
import M0.C0129q;
import M0.f0;
import M0.h0;
import M0.r;
import P0.l;
import P0.m;
import P0.s;
import P0.v;
import P0.z;
import T0.C0220l;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import de.ozerov.fully.K2;
import de.ozerov.fully.M2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: n1.i  reason: case insensitive filesystem */
public final class C1244i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f13628a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final q f13629b = new q();

    /* renamed from: c  reason: collision with root package name */
    public r f13630c;

    /* renamed from: d  reason: collision with root package name */
    public long f13631d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f13632f;

    /* renamed from: g  reason: collision with root package name */
    public long f13633g;

    /* renamed from: h  reason: collision with root package name */
    public long f13634h = -9223372036854775807L;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13635j;

    /* renamed from: k  reason: collision with root package name */
    public long f13636k;

    /* renamed from: l  reason: collision with root package name */
    public y f13637l = y.f13711S;

    /* renamed from: m  reason: collision with root package name */
    public Executor f13638m = l.f13641o;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ l f13639n;

    public C1244i(l lVar, Context context) {
        this.f13639n = lVar;
        z.L(context);
    }

    public final void a(boolean z) {
        boolean z6;
        this.i = false;
        this.f13634h = -9223372036854775807L;
        l lVar = this.f13639n;
        if (lVar.f13653n == 1) {
            lVar.f13652m++;
            K2 k22 = lVar.f13646f;
            if (z) {
                r rVar = (r) k22.f10050V;
                u uVar = rVar.f13668b;
                uVar.f13693m = 0;
                uVar.f13696p = -1;
                uVar.f13694n = -1;
                rVar.f13672g = -9223372036854775807L;
                rVar.e = -9223372036854775807L;
                rVar.d(1);
                rVar.f13673h = -9223372036854775807L;
            }
            v vVar = (v) k22.f10051W;
            m mVar = vVar.f13702f;
            boolean z8 = false;
            mVar.f3719a = 0;
            mVar.f3720b = 0;
            vVar.f13705j = -9223372036854775807L;
            C3.r rVar2 = vVar.e;
            if (rVar2.h() > 0) {
                if (rVar2.h() > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                l.d(z6);
                while (rVar2.h() > 1) {
                    rVar2.e();
                }
                Object e8 = rVar2.e();
                e8.getClass();
                rVar2.a((Long) e8, 0);
            }
            h0 h0Var = vVar.f13703g;
            C3.r rVar3 = vVar.f13701d;
            if (h0Var != null) {
                rVar3.b();
            } else if (rVar3.h() > 0) {
                if (rVar3.h() > 0) {
                    z8 = true;
                }
                l.d(z8);
                while (rVar3.h() > 1) {
                    rVar3.e();
                }
                Object e9 = rVar3.e();
                e9.getClass();
                vVar.f13703g = (h0) e9;
            }
            v vVar2 = lVar.f13650k;
            l.k(vVar2);
            vVar2.c(new M2(10, (Object) lVar));
        }
        this.f13636k = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r8 >= r4) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(long r18, boolean r20, long r21, long r23, D2.o r25) {
        /*
            r17 = this;
            r1 = r17
            r0 = r25
            n1.l r2 = r1.f13639n
            r3 = 0
            P0.l.j(r3)
            long r4 = r1.f13632f
            long r4 = r18 - r4
            n1.r r6 = r2.f13643b     // Catch:{ l -> 0x006f }
            long r13 = r1.f13631d     // Catch:{ l -> 0x006f }
            n1.q r15 = r1.f13629b     // Catch:{ l -> 0x006f }
            r7 = r4
            r9 = r21
            r11 = r23
            r16 = r15
            r15 = r20
            int r6 = r6.a(r7, r9, r11, r13, r15, r16)     // Catch:{ l -> 0x006f }
            r7 = 4
            if (r6 != r7) goto L_0x0025
            return r3
        L_0x0025:
            long r6 = r1.f13633g
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x003c
            if (r20 != 0) goto L_0x003c
            java.lang.Object r2 = r0.f1139X
            n1.e r2 = (n1.C1240e) r2
            java.lang.Object r3 = r0.f1138W
            c1.k r3 = (c1.k) r3
            int r0 = r0.f1137V
            r2.E0(r3, r0)
            r0 = 1
            return r0
        L_0x003c:
            r4 = r21
            r6 = r23
            r1.f(r4, r6)
            boolean r0 = r1.f13635j
            if (r0 == 0) goto L_0x006a
            long r4 = r1.f13636k
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            int r0 = r2.f13652m
            if (r0 != 0) goto L_0x0062
            n1.v r0 = r2.f13644c
            long r8 = r0.f13705j
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0063
        L_0x0062:
            return r3
        L_0x0063:
            r17.e()
            r1.f13635j = r3
            r1.f13636k = r6
        L_0x006a:
            r0 = 0
            P0.l.k(r0)
            throw r0
        L_0x006f:
            r0 = move-exception
            n1.z r2 = new n1.z
            M0.r r3 = r1.f13630c
            P0.l.k(r3)
            r2.<init>(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C1244i.b(long, boolean, long, long, D2.o):boolean");
    }

    public final void c(r rVar) {
        boolean z;
        l lVar = this.f13639n;
        if (lVar.f13653n == 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        C0121i iVar = rVar.f3013B;
        if (iVar == null || !iVar.d()) {
            iVar = C0121i.f2956h;
        }
        if (iVar.f2959c == 7 && z.f3748a < 34) {
        }
        Looper myLooper = Looper.myLooper();
        l.k(myLooper);
        lVar.f13650k = lVar.f13647g.a(myLooper, (Handler.Callback) null);
        try {
            k kVar = lVar.f13645d;
            i0 i0Var = i0.f2073Y;
            kVar.a();
            Pair pair = lVar.f13651l;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                int i8 = ((s) pair.second).f3736a;
            }
            throw null;
        } catch (f0 e8) {
            throw new z(e8, rVar);
        }
    }

    public final void d(boolean z) {
        ((r) this.f13639n.f13646f.f10050V).c(z);
    }

    public final void e() {
        boolean z;
        if (this.f13630c != null) {
            new ArrayList(this.f13628a);
            r rVar = this.f13630c;
            rVar.getClass();
            l.k((Object) null);
            C0121i iVar = rVar.f3013B;
            if (iVar == null || !iVar.d()) {
                C0121i iVar2 = C0121i.f2956h;
            }
            int i8 = rVar.f3043u;
            boolean z6 = false;
            if (i8 > 0) {
                z = true;
            } else {
                z = false;
            }
            l.c("width must be positive, but is: " + i8, z);
            int i9 = rVar.f3044v;
            if (i9 > 0) {
                z6 = true;
            }
            l.c("height must be positive, but is: " + i9, z6);
            throw null;
        }
    }

    public final void f(long j7, long j8) {
        try {
            l.a(this.f13639n, j7, j8);
        } catch (C0220l e8) {
            r rVar = this.f13630c;
            if (rVar == null) {
                rVar = new r(new C0129q());
            }
            throw new z(e8, rVar);
        }
    }

    public final void g(int i8) {
        u uVar = ((r) this.f13639n.f13646f.f10050V).f13668b;
        if (uVar.f13690j != i8) {
            uVar.f13690j = i8;
            uVar.d(true);
        }
    }

    public final void h(Surface surface, s sVar) {
        l lVar = this.f13639n;
        Pair pair = lVar.f13651l;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((s) lVar.f13651l.second).equals(sVar)) {
            lVar.f13651l = Pair.create(surface, sVar);
            int i8 = sVar.f3736a;
        }
    }

    public final void i(float f8) {
        ((r) this.f13639n.f13646f.f10050V).h(f8);
    }

    public final void j(long j7, long j8, long j9, long j10) {
        if (this.e == j8) {
            int i8 = (this.f13632f > j9 ? 1 : (this.f13632f == j9 ? 0 : -1));
        }
        this.f13631d = j7;
        this.e = j8;
        this.f13632f = j9;
        this.f13633g = j10;
    }

    public final void k(List list) {
        ArrayList arrayList = this.f13628a;
        if (!arrayList.equals(list)) {
            arrayList.clear();
            arrayList.addAll(list);
            arrayList.addAll(this.f13639n.e);
            e();
        }
    }
}
