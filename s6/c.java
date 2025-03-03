package s6;

import B7.g;
import V7.a;
import g7.C0996d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q6.d;
import u6.C1497a;
import u6.C1498b;
import y6.C1636a;
import y6.C1638c;

public final class c extends AtomicInteger implements l6.c, a {

    /* renamed from: l0  reason: collision with root package name */
    public static final b[] f15129l0 = new b[0];

    /* renamed from: m0  reason: collision with root package name */
    public static final b[] f15130m0 = new b[0];

    /* renamed from: U  reason: collision with root package name */
    public final l6.c f15131U;

    /* renamed from: V  reason: collision with root package name */
    public final g f15132V;

    /* renamed from: W  reason: collision with root package name */
    public final boolean f15133W;

    /* renamed from: X  reason: collision with root package name */
    public final int f15134X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f15135Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile d f15136Z;

    /* renamed from: a0  reason: collision with root package name */
    public volatile boolean f15137a0;

    /* renamed from: b0  reason: collision with root package name */
    public final C1636a f15138b0 = new AtomicReference();

    /* renamed from: c0  reason: collision with root package name */
    public volatile boolean f15139c0;

    /* renamed from: d0  reason: collision with root package name */
    public final AtomicReference f15140d0;

    /* renamed from: e0  reason: collision with root package name */
    public final AtomicLong f15141e0;

    /* renamed from: f0  reason: collision with root package name */
    public a f15142f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f15143g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f15144h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f15145i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f15146j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f15147k0;

    /* JADX WARNING: type inference failed for: r0v0, types: [y6.a, java.util.concurrent.atomic.AtomicReference] */
    public c(l6.c cVar, g gVar, boolean z, int i, int i8) {
        AtomicReference atomicReference = new AtomicReference();
        this.f15140d0 = atomicReference;
        this.f15141e0 = new AtomicLong();
        this.f15131U = cVar;
        this.f15132V = gVar;
        this.f15133W = z;
        this.f15134X = i;
        this.f15135Y = i8;
        this.f15147k0 = Math.max(1, i >> 1);
        atomicReference.lazySet(f15129l0);
    }

    public final void a(Throwable th) {
        if (this.f15137a0) {
            C0996d.s(th);
        } else if (this.f15138b0.a(th)) {
            this.f15137a0 = true;
            if (!this.f15133W) {
                for (b bVar : (b[]) this.f15140d0.getAndSet(f15130m0)) {
                    bVar.getClass();
                    x6.c.a(bVar);
                }
            }
            g();
        } else {
            C0996d.s(th);
        }
    }

    public final void b() {
        if (!this.f15137a0) {
            this.f15137a0 = true;
            g();
        }
    }

    public final void c(long j7) {
        long j8;
        long j9;
        if (x6.c.d(j7)) {
            AtomicLong atomicLong = this.f15141e0;
            do {
                j8 = atomicLong.get();
                j9 = Long.MAX_VALUE;
                if (j8 == Long.MAX_VALUE) {
                    break;
                }
                long j10 = j8 + j7;
                if (j10 >= 0) {
                    j9 = j10;
                }
            } while (!atomicLong.compareAndSet(j8, j9));
            g();
        }
    }

    public final void cancel() {
        d dVar;
        b[] bVarArr;
        if (!this.f15139c0) {
            this.f15139c0 = true;
            this.f15142f0.cancel();
            AtomicReference atomicReference = this.f15140d0;
            b[] bVarArr2 = (b[]) atomicReference.get();
            b[] bVarArr3 = f15130m0;
            if (!(bVarArr2 == bVarArr3 || (bVarArr = (b[]) atomicReference.getAndSet(bVarArr3)) == bVarArr3)) {
                for (b bVar : bVarArr) {
                    bVar.getClass();
                    x6.c.a(bVar);
                }
                Throwable b8 = this.f15138b0.b();
                if (!(b8 == null || b8 == C1638c.f16399a)) {
                    C0996d.s(b8);
                }
            }
            if (getAndIncrement() == 0 && (dVar = this.f15136Z) != null) {
                dVar.clear();
            }
        }
    }

    public final boolean d() {
        if (this.f15139c0) {
            d dVar = this.f15136Z;
            if (dVar != null) {
                dVar.clear();
            }
            return true;
        } else if (this.f15133W || this.f15138b0.get() == null) {
            return false;
        } else {
            d dVar2 = this.f15136Z;
            if (dVar2 != null) {
                dVar2.clear();
            }
            Throwable b8 = this.f15138b0.b();
            if (b8 != C1638c.f16399a) {
                this.f15131U.a(b8);
            }
            return true;
        }
    }

    public final void e(a aVar) {
        if (this.f15142f0 != null) {
            aVar.cancel();
            C0996d.s(new IllegalStateException("Subscription already set!"));
            return;
        }
        this.f15142f0 = aVar;
        this.f15131U.e(this);
        if (!this.f15139c0) {
            int i = this.f15134X;
            if (i == Integer.MAX_VALUE) {
                aVar.c(Long.MAX_VALUE);
            } else {
                aVar.c((long) i);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: s6.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r10.f15137a0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            B7.g r0 = r10.f15132V     // Catch:{ all -> 0x010d }
            r0.getClass()     // Catch:{ all -> 0x010d }
            l6.b r11 = (l6.b) r11     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "The mapper returned a null Publisher"
            p6.C1345a.a(r11, r0)     // Catch:{ all -> 0x010d }
            boolean r0 = r11 instanceof java.util.concurrent.Callable
            r1 = 0
            if (r0 == 0) goto L_0x00d6
            java.util.concurrent.Callable r11 = (java.util.concurrent.Callable) r11     // Catch:{ all -> 0x00c9 }
            java.lang.Object r11 = r11.call()     // Catch:{ all -> 0x00c9 }
            r0 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r11 == 0) goto L_0x00af
            int r3 = r10.get()
            java.lang.String r4 = "Scalar queue full?!"
            if (r3 != 0) goto L_0x0091
            boolean r3 = r10.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x0091
            java.util.concurrent.atomic.AtomicLong r3 = r10.f15141e0
            long r5 = r3.get()
            q6.d r3 = r10.f15136Z
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0046
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x0073
        L_0x0046:
            l6.c r3 = r10.f15131U
            r3.f(r11)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicLong r11 = r10.f15141e0
            r11.decrementAndGet()
        L_0x0059:
            int r11 = r10.f15134X
            if (r11 == r2) goto L_0x0089
            boolean r11 = r10.f15139c0
            if (r11 != 0) goto L_0x0089
            int r11 = r10.f15146j0
            int r11 = r11 + r0
            r10.f15146j0 = r11
            int r0 = r10.f15147k0
            if (r11 != r0) goto L_0x0089
            r10.f15146j0 = r1
            V7.a r11 = r10.f15142f0
            long r0 = (long) r0
            r11.c(r0)
            goto L_0x0089
        L_0x0073:
            if (r3 != 0) goto L_0x0079
            q6.d r3 = r10.i()
        L_0x0079:
            boolean r11 = r3.offer(r11)
            if (r11 != 0) goto L_0x0089
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            r10.a(r11)
            goto L_0x0105
        L_0x0089:
            int r11 = r10.decrementAndGet()
            if (r11 != 0) goto L_0x00ab
            goto L_0x0105
        L_0x0091:
            q6.d r0 = r10.i()
            boolean r11 = r0.offer(r11)
            if (r11 != 0) goto L_0x00a4
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            r10.a(r11)
            goto L_0x0105
        L_0x00a4:
            int r11 = r10.getAndIncrement()
            if (r11 == 0) goto L_0x00ab
            goto L_0x0105
        L_0x00ab:
            r10.h()
            goto L_0x0105
        L_0x00af:
            int r11 = r10.f15134X
            if (r11 == r2) goto L_0x0105
            boolean r11 = r10.f15139c0
            if (r11 != 0) goto L_0x0105
            int r11 = r10.f15146j0
            int r11 = r11 + r0
            r10.f15146j0 = r11
            int r0 = r10.f15147k0
            if (r11 != r0) goto L_0x0105
            r10.f15146j0 = r1
            V7.a r11 = r10.f15142f0
            long r0 = (long) r0
            r11.c(r0)
            goto L_0x0105
        L_0x00c9:
            r11 = move-exception
            R.e.v(r11)
            y6.a r0 = r10.f15138b0
            r0.a(r11)
            r10.g()
            return
        L_0x00d6:
            s6.b r0 = new s6.b
            long r2 = r10.f15143g0
            r4 = 1
            long r4 = r4 + r2
            r10.f15143g0 = r4
            r0.<init>(r10, r2)
        L_0x00e2:
            java.util.concurrent.atomic.AtomicReference r2 = r10.f15140d0
            java.lang.Object r3 = r2.get()
            s6.b[] r3 = (s6.b[]) r3
            s6.b[] r4 = f15130m0
            if (r3 != r4) goto L_0x00f2
            x6.c.a(r0)
            goto L_0x0105
        L_0x00f2:
            int r4 = r3.length
            int r5 = r4 + 1
            s6.b[] r5 = new s6.b[r5]
            java.lang.System.arraycopy(r3, r1, r5, r1, r4)
            r5[r4] = r0
        L_0x00fc:
            boolean r4 = r2.compareAndSet(r3, r5)
            if (r4 == 0) goto L_0x0106
            r11.a(r0)
        L_0x0105:
            return
        L_0x0106:
            java.lang.Object r4 = r2.get()
            if (r4 == r3) goto L_0x00fc
            goto L_0x00e2
        L_0x010d:
            r11 = move-exception
            R.e.v(r11)
            V7.a r0 = r10.f15142f0
            r0.cancel()
            r10.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c.f(java.lang.Object):void");
    }

    public final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x017d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r24 = this;
            r1 = r24
            l6.c r2 = r1.f15131U
            r4 = 1
        L_0x0005:
            boolean r0 = r24.d()
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            q6.d r0 = r1.f15136Z
            java.util.concurrent.atomic.AtomicLong r5 = r1.f15141e0
            long r5 = r5.get()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x001f
            r10 = 1
            goto L_0x0020
        L_0x001f:
            r10 = 0
        L_0x0020:
            r12 = 1
            r14 = 0
            r16 = r14
            if (r0 == 0) goto L_0x0069
        L_0x0028:
            r7 = r14
            r18 = 0
        L_0x002b:
            int r19 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r19 == 0) goto L_0x0049
            java.lang.Object r9 = r0.poll()
            boolean r18 = r24.d()
            if (r18 == 0) goto L_0x003a
            return
        L_0x003a:
            if (r9 != 0) goto L_0x003f
            r18 = r9
            goto L_0x0049
        L_0x003f:
            r2.f(r9)
            long r16 = r16 + r12
            long r7 = r7 + r12
            long r5 = r5 - r12
            r18 = r9
            goto L_0x002b
        L_0x0049:
            int r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x005c
            if (r10 == 0) goto L_0x0055
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x005c
        L_0x0055:
            java.util.concurrent.atomic.AtomicLong r5 = r1.f15141e0
            long r6 = -r7
            long r5 = r5.addAndGet(r6)
        L_0x005c:
            int r7 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0069
            if (r18 != 0) goto L_0x0063
            goto L_0x0069
        L_0x0063:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0028
        L_0x0069:
            boolean r0 = r1.f15137a0
            q6.d r7 = r1.f15136Z
            java.util.concurrent.atomic.AtomicReference r8 = r1.f15140d0
            java.lang.Object r8 = r8.get()
            s6.b[] r8 = (s6.b[]) r8
            int r9 = r8.length
            if (r0 == 0) goto L_0x0096
            if (r7 == 0) goto L_0x0080
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0096
        L_0x0080:
            if (r9 != 0) goto L_0x0096
            y6.a r0 = r1.f15138b0
            java.lang.Throwable r0 = r0.b()
            y6.b r3 = y6.C1638c.f16399a
            if (r0 == r3) goto L_0x0095
            if (r0 != 0) goto L_0x0092
            r2.b()
            goto L_0x0095
        L_0x0092:
            r2.a(r0)
        L_0x0095:
            return
        L_0x0096:
            r18 = r4
            if (r9 == 0) goto L_0x019e
            long r3 = r1.f15144h0
            int r0 = r1.f15145i0
            if (r9 <= r0) goto L_0x00a8
            r7 = r8[r0]
            long r11 = r7.f15121U
            int r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x00c7
        L_0x00a8:
            if (r9 > r0) goto L_0x00ab
            r0 = 0
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            if (r7 >= r9) goto L_0x00bf
            r11 = r8[r0]
            long r11 = r11.f15121U
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x00b7
            goto L_0x00bf
        L_0x00b7:
            int r0 = r0 + 1
            if (r0 != r9) goto L_0x00bc
            r0 = 0
        L_0x00bc:
            int r7 = r7 + 1
            goto L_0x00ac
        L_0x00bf:
            r1.f15145i0 = r0
            r3 = r8[r0]
            long r3 = r3.f15121U
            r1.f15144h0 = r3
        L_0x00c7:
            r3 = r0
            r0 = 0
            r4 = 0
        L_0x00ca:
            if (r4 >= r9) goto L_0x018e
            boolean r7 = r24.d()
            if (r7 == 0) goto L_0x00d3
            return
        L_0x00d3:
            r7 = r8[r3]
            r11 = 0
        L_0x00d6:
            boolean r12 = r24.d()
            if (r12 == 0) goto L_0x00dd
            return
        L_0x00dd:
            q6.e r12 = r7.f15126Z
            if (r12 != 0) goto L_0x00e6
            r13 = r8
            r22 = r9
            goto L_0x0156
        L_0x00e6:
            r13 = r8
            r22 = r9
            r8 = r14
        L_0x00ea:
            int r23 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r23 == 0) goto L_0x012f
            java.lang.Object r11 = r12.poll()     // Catch:{ all -> 0x0106 }
            if (r11 != 0) goto L_0x00f5
            goto L_0x012f
        L_0x00f5:
            r2.f(r11)
            boolean r23 = r24.d()
            if (r23 == 0) goto L_0x00ff
            return
        L_0x00ff:
            r20 = 1
            long r5 = r5 - r20
            long r8 = r8 + r20
            goto L_0x00ea
        L_0x0106:
            r0 = move-exception
            r8 = r0
            R.e.v(r8)
            x6.c.a(r7)
            y6.a r0 = r1.f15138b0
            r0.a(r8)
            boolean r0 = r1.f15133W
            if (r0 != 0) goto L_0x011c
            V7.a r0 = r1.f15142f0
            r0.cancel()
        L_0x011c:
            boolean r0 = r24.d()
            if (r0 == 0) goto L_0x0123
            return
        L_0x0123:
            r1.j(r7)
            int r4 = r4 + 1
            r9 = r22
            r0 = 1
            r7 = 1
        L_0x012d:
            r11 = 1
            goto L_0x0188
        L_0x012f:
            int r12 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x0148
            if (r10 != 0) goto L_0x013d
            java.util.concurrent.atomic.AtomicLong r5 = r1.f15141e0
            long r14 = -r8
            long r5 = r5.addAndGet(r14)
            goto L_0x0142
        L_0x013d:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0142:
            r7.c(r8)
            r8 = 0
            goto L_0x0149
        L_0x0148:
            r8 = r14
        L_0x0149:
            int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0156
            if (r11 != 0) goto L_0x0150
            goto L_0x0156
        L_0x0150:
            r8 = r13
            r9 = r22
            r14 = 0
            goto L_0x00d6
        L_0x0156:
            boolean r8 = r7.f15125Y
            q6.e r9 = r7.f15126Z
            if (r8 == 0) goto L_0x0165
            if (r9 == 0) goto L_0x0168
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L_0x0165
            goto L_0x0168
        L_0x0165:
            r7 = 1
            goto L_0x0177
        L_0x0168:
            r1.j(r7)
            boolean r0 = r24.d()
            if (r0 == 0) goto L_0x0172
            return
        L_0x0172:
            r7 = 1
            long r16 = r16 + r7
            r0 = 1
        L_0x0177:
            r11 = 0
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0180
            r9 = r0
            r11 = 1
            goto L_0x0191
        L_0x0180:
            int r3 = r3 + 1
            r9 = r22
            if (r3 != r9) goto L_0x012d
            r3 = 0
            goto L_0x012d
        L_0x0188:
            int r4 = r4 + r11
            r8 = r13
            r14 = 0
            goto L_0x00ca
        L_0x018e:
            r13 = r8
            r11 = 1
            r9 = r0
        L_0x0191:
            r1.f15145i0 = r3
            r0 = r13[r3]
            long r3 = r0.f15121U
            r1.f15144h0 = r3
            r3 = r16
            r5 = 0
            goto L_0x01a3
        L_0x019e:
            r11 = 1
            r5 = r14
            r3 = r16
            r9 = 0
        L_0x01a3:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x01b0
            boolean r0 = r1.f15139c0
            if (r0 != 0) goto L_0x01b0
            V7.a r0 = r1.f15142f0
            r0.c(r3)
        L_0x01b0:
            if (r9 == 0) goto L_0x01b6
            r4 = r18
            goto L_0x0005
        L_0x01b6:
            r3 = r18
            int r0 = -r3
            int r4 = r1.addAndGet(r0)
            if (r4 != 0) goto L_0x0005
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c.h():void");
    }

    public final d i() {
        d dVar = this.f15136Z;
        if (dVar == null) {
            if (this.f15134X == Integer.MAX_VALUE) {
                dVar = new C1498b(this.f15135Y);
            } else {
                dVar = new C1497a(this.f15134X);
            }
            this.f15136Z = dVar;
        }
        return dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: s6.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: s6.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(s6.b r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.f15140d0
            java.lang.Object r1 = r0.get()
            s6.b[] r1 = (s6.b[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            r4 = 0
        L_0x000e:
            if (r4 >= r2) goto L_0x0018
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0018:
            r4 = -1
        L_0x0019:
            if (r4 >= 0) goto L_0x001c
            return
        L_0x001c:
            r5 = 1
            if (r2 != r5) goto L_0x0022
            s6.b[] r2 = f15129l0
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            s6.b[] r6 = new s6.b[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x0031:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0031
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c.j(s6.b):void");
    }
}
