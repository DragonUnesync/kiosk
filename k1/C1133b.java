package k1;

import H3.C0103u;
import H3.L;
import H3.O;
import M0.Y;
import M0.r;
import P0.l;
import P0.t;
import P0.z;
import android.os.SystemClock;
import i1.j;
import java.util.ArrayList;
import java.util.List;
import l1.d;
import l1.h;

/* renamed from: k1.b  reason: case insensitive filesystem */
public final class C1133b extends C1134c {

    /* renamed from: g  reason: collision with root package name */
    public final d f12906g;

    /* renamed from: h  reason: collision with root package name */
    public final long f12907h;
    public final long i;

    /* renamed from: j  reason: collision with root package name */
    public final long f12908j;

    /* renamed from: k  reason: collision with root package name */
    public final int f12909k;

    /* renamed from: l  reason: collision with root package name */
    public final int f12910l;

    /* renamed from: m  reason: collision with root package name */
    public final float f12911m;

    /* renamed from: n  reason: collision with root package name */
    public final float f12912n;

    /* renamed from: o  reason: collision with root package name */
    public final O f12913o;

    /* renamed from: p  reason: collision with root package name */
    public final t f12914p;

    /* renamed from: q  reason: collision with root package name */
    public float f12915q;

    /* renamed from: r  reason: collision with root package name */
    public int f12916r;

    /* renamed from: s  reason: collision with root package name */
    public int f12917s;

    /* renamed from: t  reason: collision with root package name */
    public long f12918t;

    /* renamed from: u  reason: collision with root package name */
    public j f12919u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1133b(Y y8, int[] iArr, d dVar, long j7, long j8, long j9, O o2) {
        super(y8, iArr);
        t tVar = t.f3738a;
        if (j9 < j7) {
            l.B("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j9 = j7;
        }
        this.f12906g = dVar;
        this.f12907h = j7 * 1000;
        this.i = j8 * 1000;
        this.f12908j = j9 * 1000;
        this.f12909k = 1279;
        this.f12910l = 719;
        this.f12911m = 0.7f;
        this.f12912n = 0.75f;
        this.f12913o = O.m(o2);
        this.f12914p = tVar;
        this.f12915q = 1.0f;
        this.f12917s = 0;
        this.f12918t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j7 = 0;
        for (long j8 : jArr) {
            j7 += j8;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            L l8 = (L) arrayList.get(i8);
            if (l8 != null) {
                l8.a(new C1132a(j7, jArr[i8]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        j jVar = (j) C0103u.l(list);
        long j7 = jVar.f12665a0;
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = jVar.f12666b0;
        if (j8 != -9223372036854775807L) {
            return j8 - j7;
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r14, long r16, long r18, java.util.List r20, i1.k[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            P0.t r2 = r0.f12914p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f12916r
            int r5 = r1.length
            if (r4 >= r5) goto L_0x0027
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L_0x0027
            int r4 = r0.f12916r
            r1 = r1[r4]
            long r4 = r1.b()
            long r6 = r1.d()
        L_0x0025:
            long r4 = r4 - r6
            goto L_0x0043
        L_0x0027:
            int r4 = r1.length
            r5 = 0
        L_0x0029:
            if (r5 >= r4) goto L_0x003f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L_0x003c
            long r4 = r6.b()
            long r6 = r6.d()
            goto L_0x0025
        L_0x003c:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x003f:
            long r4 = x(r20)
        L_0x0043:
            int r1 = r0.f12917s
            if (r1 != 0) goto L_0x0051
            r1 = 1
            r0.f12917s = r1
            int r1 = r13.w(r2)
            r0.f12916r = r1
            return
        L_0x0051:
            int r6 = r0.f12916r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L_0x005c
            r7 = -1
            goto L_0x0068
        L_0x005c:
            java.lang.Object r7 = H3.C0103u.l(r20)
            i1.j r7 = (i1.j) r7
            M0.r r7 = r7.f12662X
            int r7 = r13.a(r7)
        L_0x0068:
            if (r7 == r8) goto L_0x0073
            java.lang.Object r1 = H3.C0103u.l(r20)
            i1.j r1 = (i1.j) r1
            int r1 = r1.f12663Y
            r6 = r7
        L_0x0073:
            int r7 = r13.w(r2)
            if (r7 == r6) goto L_0x00b8
            boolean r2 = r13.d(r6, r2)
            if (r2 != 0) goto L_0x00b8
            M0.r[] r2 = r0.f12923d
            r3 = r2[r6]
            r2 = r2[r7]
            long r8 = r0.f12907h
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0091
            goto L_0x00a4
        L_0x0091:
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0098
            long r4 = r18 - r4
            goto L_0x009a
        L_0x0098:
            r4 = r18
        L_0x009a:
            float r4 = (float) r4
            float r5 = r0.f12912n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r8 = java.lang.Math.min(r4, r8)
        L_0x00a4:
            int r2 = r2.f3032j
            int r3 = r3.f3032j
            if (r2 <= r3) goto L_0x00af
            int r4 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00af
            goto L_0x00b7
        L_0x00af:
            if (r2 >= r3) goto L_0x00b8
            long r2 = r0.i
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00b8
        L_0x00b7:
            r7 = r6
        L_0x00b8:
            if (r7 != r6) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r1 = 3
        L_0x00bc:
            r0.f12917s = r1
            r0.f12916r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1133b.b(long, long, long, java.util.List, i1.k[]):void");
    }

    public final void f() {
        this.f12918t = -9223372036854775807L;
        this.f12919u = null;
    }

    public final int h(long j7, List list) {
        j jVar;
        int i8;
        int i9;
        this.f12914p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = this.f12918t;
        if (j8 != -9223372036854775807L && elapsedRealtime - j8 < 1000 && (list.isEmpty() || ((j) C0103u.l(list)).equals(this.f12919u))) {
            return list.size();
        }
        this.f12918t = elapsedRealtime;
        if (list.isEmpty()) {
            jVar = null;
        } else {
            jVar = (j) C0103u.l(list);
        }
        this.f12919u = jVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long B8 = z.B(((j) list.get(size - 1)).f12665a0 - j7, this.f12915q);
        long j9 = this.f12908j;
        if (B8 < j9) {
            return size;
        }
        x(list);
        r rVar = this.f12923d[w(elapsedRealtime)];
        for (int i10 = 0; i10 < size; i10++) {
            j jVar2 = (j) list.get(i10);
            r rVar2 = jVar2.f12662X;
            if (z.B(jVar2.f12665a0 - j7, this.f12915q) >= j9 && rVar2.f3032j < rVar.f3032j && (i8 = rVar2.f3044v) != -1 && i8 <= this.f12910l && (i9 = rVar2.f3043u) != -1 && i9 <= this.f12909k && i8 < rVar.f3044v) {
                return i10;
            }
        }
        return size;
    }

    public final void j() {
        this.f12919u = null;
    }

    public final int n() {
        return this.f12917s;
    }

    public final int o() {
        return this.f12916r;
    }

    public final void q(float f8) {
        this.f12915q = f8;
    }

    public final Object r() {
        return null;
    }

    public final int w(long j7) {
        long j8;
        h hVar = (h) this.f12906g;
        synchronized (hVar) {
            j8 = hVar.f13129k;
        }
        this.f12906g.getClass();
        long j9 = (long) (((float) ((long) (((float) j8) * this.f12911m))) / this.f12915q);
        if (!this.f12913o.isEmpty()) {
            int i8 = 1;
            while (i8 < this.f12913o.size() - 1 && ((C1132a) this.f12913o.get(i8)).f12904a < j9) {
                i8++;
            }
            C1132a aVar = (C1132a) this.f12913o.get(i8 - 1);
            C1132a aVar2 = (C1132a) this.f12913o.get(i8);
            long j10 = aVar.f12904a;
            float f8 = ((float) (j9 - j10)) / ((float) (aVar2.f12904a - j10));
            long j11 = aVar.f12905b;
            j9 = j11 + ((long) (f8 * ((float) (aVar2.f12905b - j11))));
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f12921b; i10++) {
            if (j7 == Long.MIN_VALUE || !d(i10, j7)) {
                if (((long) e(i10).f3032j) <= j9) {
                    return i10;
                }
                i9 = i10;
            }
        }
        return i9;
    }
}
