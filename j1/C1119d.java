package j1;

import B.B;
import D.s0;
import H3.O;
import H3.i0;
import K1.i;
import M0.I;
import M0.r;
import M1.e;
import P0.l;
import Q0.g;
import S0.f;
import T0.C0213e;
import T0.C0229v;
import T0.C0232y;
import Z1.c;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h1.C1031B;
import h1.Y;
import j$.util.Objects;
import java.io.IOException;

/* renamed from: j1.d  reason: case insensitive filesystem */
public final class C1119d extends C0213e implements Handler.Callback {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f12845A0;

    /* renamed from: B0  reason: collision with root package name */
    public r f12846B0;

    /* renamed from: C0  reason: collision with root package name */
    public long f12847C0;

    /* renamed from: D0  reason: collision with root package name */
    public long f12848D0;

    /* renamed from: E0  reason: collision with root package name */
    public IOException f12849E0;

    /* renamed from: l0  reason: collision with root package name */
    public final i f12850l0;

    /* renamed from: m0  reason: collision with root package name */
    public final f f12851m0;

    /* renamed from: n0  reason: collision with root package name */
    public C1116a f12852n0;

    /* renamed from: o0  reason: collision with root package name */
    public final c f12853o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f12854q0;

    /* renamed from: r0  reason: collision with root package name */
    public e f12855r0;

    /* renamed from: s0  reason: collision with root package name */
    public M1.i f12856s0;

    /* renamed from: t0  reason: collision with root package name */
    public M1.c f12857t0;

    /* renamed from: u0  reason: collision with root package name */
    public M1.c f12858u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f12859v0;

    /* renamed from: w0  reason: collision with root package name */
    public final Handler f12860w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C0229v f12861x0;

    /* renamed from: y0  reason: collision with root package name */
    public final R2.c f12862y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f12863z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1119d(C0229v vVar, Looper looper) {
        super(3);
        Handler handler;
        c cVar = C1118c.f12844R;
        this.f12861x0 = vVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.f12860w0 = handler;
        this.f12853o0 = cVar;
        this.f12850l0 = new i(7);
        this.f12851m0 = new f(1);
        this.f12862y0 = new R2.c(0, 5);
        this.f12848D0 = -9223372036854775807L;
        this.f12847C0 = -9223372036854775807L;
    }

    public final void B() {
        boolean z;
        if (Objects.equals(this.f12846B0.f3036n, "application/cea-608") || Objects.equals(this.f12846B0.f3036n, "application/x-mp4-cea-608") || Objects.equals(this.f12846B0.f3036n, "application/cea-708")) {
            z = true;
        } else {
            z = false;
        }
        l.i("Legacy decoding is disabled, can't handle " + this.f12846B0.f3036n + " samples (expected application/x-media3-cues).", z);
    }

    public final long C() {
        if (this.f12859v0 == -1) {
            return Long.MAX_VALUE;
        }
        this.f12857t0.getClass();
        if (this.f12859v0 >= this.f12857t0.s0()) {
            return Long.MAX_VALUE;
        }
        return this.f12857t0.s(this.f12859v0);
    }

    public final long D(long j7) {
        boolean z;
        if (j7 != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        return j7 - this.f4808e0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r3.equals("application/cea-608") == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r7 = this;
            r0 = 1
            r7.p0 = r0
            M0.r r1 = r7.f12846B0
            r1.getClass()
            Z1.c r2 = r7.f12853o0
            r2.getClass()
            java.lang.String r3 = r1.f3036n
            if (r3 == 0) goto L_0x004d
            int r4 = r1.f3019H
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L_0x0031;
                case 1566015601: goto L_0x0028;
                case 1566016562: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = -1
            goto L_0x003b
        L_0x001d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            r0 = 2
            goto L_0x003b
        L_0x0028:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x003b
            goto L_0x001b
        L_0x0031:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x001b
        L_0x003a:
            r0 = 0
        L_0x003b:
            switch(r0) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0047;
                case 2: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x004d
        L_0x003f:
            N1.g r0 = new N1.g
            java.util.List r1 = r1.f3039q
            r0.<init>(r4, r1)
            goto L_0x006e
        L_0x0047:
            N1.c r0 = new N1.c
            r0.<init>(r3, r4)
            goto L_0x006e
        L_0x004d:
            java.lang.Object r0 = r2.f6955V
            K1.i r0 = (K1.i) r0
            boolean r2 = r0.a(r1)
            if (r2 == 0) goto L_0x0076
            M1.l r0 = r0.j(r1)
            b1.b r1 = new b1.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>((M1.l) r0)
            r0 = r1
        L_0x006e:
            r7.f12855r0 = r0
            long r1 = r7.f4809f0
            r0.a(r1)
            return
        L_0x0076:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = u.C1477r.d(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C1119d.E():void");
    }

    public final void F(O0.c cVar) {
        O o2 = cVar.f3544a;
        C0229v vVar = this.f12861x0;
        vVar.f4905U.f4952g0.e(27, new B(20, o2));
        C0232y yVar = vVar.f4905U;
        yVar.f4933V0 = cVar;
        yVar.f4952g0.e(27, new B(17, cVar));
    }

    public final void G() {
        this.f12856s0 = null;
        this.f12859v0 = -1;
        M1.c cVar = this.f12857t0;
        if (cVar != null) {
            cVar.t();
            this.f12857t0 = null;
        }
        M1.c cVar2 = this.f12858u0;
        if (cVar2 != null) {
            cVar2.t();
            this.f12858u0 = null;
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            F((O0.c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String i() {
        return "TextRenderer";
    }

    public final boolean k() {
        return this.f12845A0;
    }

    public final boolean l() {
        if (this.f12846B0 == null) {
            return true;
        }
        if (this.f12849E0 == null) {
            try {
                Y y8 = this.f4806c0;
                y8.getClass();
                y8.a();
            } catch (IOException e) {
                this.f12849E0 = e;
            }
        }
        if (this.f12849E0 != null) {
            r rVar = this.f12846B0;
            rVar.getClass();
            if (Objects.equals(rVar.f3036n, "application/x-media3-cues")) {
                C1116a aVar = this.f12852n0;
                aVar.getClass();
                if (aVar.c(this.f12847C0) != Long.MIN_VALUE) {
                    return true;
                }
                return false;
            }
            if (!this.f12845A0) {
                if (this.f12863z0) {
                    M1.c cVar = this.f12857t0;
                    long j7 = this.f12847C0;
                    if (cVar == null || cVar.s(cVar.s0() - 1) <= j7) {
                        M1.c cVar2 = this.f12858u0;
                        long j8 = this.f12847C0;
                        if ((cVar2 == null || cVar2.s(cVar2.s0() - 1) <= j8) && this.f12856s0 != null) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void m() {
        this.f12846B0 = null;
        this.f12848D0 = -9223372036854775807L;
        i0 i0Var = i0.f2073Y;
        D(this.f12847C0);
        O0.c cVar = new O0.c(i0Var);
        Handler handler = this.f12860w0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.f12847C0 = -9223372036854775807L;
        if (this.f12855r0 != null) {
            G();
            e eVar = this.f12855r0;
            eVar.getClass();
            eVar.release();
            this.f12855r0 = null;
            this.f12854q0 = 0;
        }
    }

    public final void o(long j7, boolean z) {
        this.f12847C0 = j7;
        C1116a aVar = this.f12852n0;
        if (aVar != null) {
            aVar.clear();
        }
        i0 i0Var = i0.f2073Y;
        D(this.f12847C0);
        O0.c cVar = new O0.c(i0Var);
        Handler handler = this.f12860w0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.f12863z0 = false;
        this.f12845A0 = false;
        this.f12848D0 = -9223372036854775807L;
        r rVar = this.f12846B0;
        if (rVar != null && !Objects.equals(rVar.f3036n, "application/x-media3-cues")) {
            if (this.f12854q0 != 0) {
                G();
                e eVar = this.f12855r0;
                eVar.getClass();
                eVar.release();
                this.f12855r0 = null;
                this.f12854q0 = 0;
                E();
                return;
            }
            G();
            e eVar2 = this.f12855r0;
            eVar2.getClass();
            eVar2.flush();
            eVar2.a(this.f4809f0);
        }
    }

    public final void t(r[] rVarArr, long j7, long j8, C1031B b8) {
        C1116a aVar;
        r rVar = rVarArr[0];
        this.f12846B0 = rVar;
        if (!Objects.equals(rVar.f3036n, "application/x-media3-cues")) {
            B();
            if (this.f12855r0 != null) {
                this.f12854q0 = 1;
            } else {
                E();
            }
        } else {
            if (this.f12846B0.f3020I == 1) {
                aVar = new C1117b();
            } else {
                aVar = new s0(6);
            }
            this.f12852n0 = aVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023f A[LOOP:2: B:95:0x023f->B:123:0x02ad, LOOP_START, PHI: r15 
      PHI: (r15v1 R2.c) = (r15v0 R2.c), (r15v2 R2.c) binds: [B:94:0x023b, B:123:0x02ad] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:95:0x023f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(long r20, long r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            boolean r0 = r1.f4811h0
            r4 = 1
            if (r0 == 0) goto L_0x001d
            long r5 = r1.f12848D0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            r19.G()
            r1.f12845A0 = r4
        L_0x001d:
            boolean r0 = r1.f12845A0
            if (r0 == 0) goto L_0x0022
            return
        L_0x0022:
            M0.r r0 = r1.f12846B0
            r0.getClass()
            java.lang.String r0 = r0.f3036n
            java.lang.String r5 = "application/x-media3-cues"
            boolean r0 = j$.util.Objects.equals(r0, r5)
            android.os.Handler r5 = r1.f12860w0
            r6 = 0
            r7 = 4
            r8 = -4
            R2.c r9 = r1.f12862y0
            if (r0 == 0) goto L_0x0118
            j1.a r0 = r1.f12852n0
            r0.getClass()
            boolean r0 = r1.f12863z0
            if (r0 == 0) goto L_0x0043
            goto L_0x00cf
        L_0x0043:
            S0.f r0 = r1.f12851m0
            int r9 = r1.u(r9, r0, r6)
            if (r9 == r8) goto L_0x004d
            goto L_0x00cf
        L_0x004d:
            boolean r7 = r0.d(r7)
            if (r7 == 0) goto L_0x0057
            r1.f12863z0 = r4
            goto L_0x00cf
        L_0x0057:
            r0.v()
            java.nio.ByteBuffer r7 = r0.f4386Y
            r7.getClass()
            long r10 = r0.f4388a0
            byte[] r8 = r7.array()
            int r9 = r7.arrayOffset()
            int r7 = r7.limit()
            K1.i r12 = r1.f12850l0
            r12.getClass()
            android.os.Parcel r12 = android.os.Parcel.obtain()
            r12.unmarshall(r8, r9, r7)
            r12.setDataPosition(r6)
            java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
            java.lang.ClassLoader r7 = r7.getClassLoader()
            android.os.Bundle r7 = r12.readBundle(r7)
            r12.recycle()
            java.lang.String r8 = "c"
            java.util.ArrayList r8 = r7.getParcelableArrayList(r8)
            r8.getClass()
            M1.a r14 = new M1.a
            B7.g r9 = new B7.g
            r12 = 12
            r9.<init>((int) r12)
            H3.L r12 = H3.O.j()
        L_0x009f:
            int r13 = r8.size()
            if (r6 >= r13) goto L_0x00b8
            java.lang.Object r13 = r8.get(r6)
            android.os.Bundle r13 = (android.os.Bundle) r13
            r13.getClass()
            java.lang.Object r13 = r9.apply(r13)
            r12.a(r13)
            int r6 = r6 + 1
            goto L_0x009f
        L_0x00b8:
            H3.i0 r9 = r12.g()
            java.lang.String r6 = "d"
            long r12 = r7.getLong(r6)
            r8 = r14
            r8.<init>(r9, r10, r12)
            r0.r()
            j1.a r0 = r1.f12852n0
            boolean r6 = r0.b(r14, r2)
        L_0x00cf:
            j1.a r0 = r1.f12852n0
            long r7 = r1.f12847C0
            long r7 = r0.c(r7)
            r9 = -9223372036854775808
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00e5
            boolean r9 = r1.f12863z0
            if (r9 == 0) goto L_0x00e5
            if (r6 != 0) goto L_0x00e5
            r1.f12845A0 = r4
        L_0x00e5:
            if (r0 == 0) goto L_0x00ec
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00ec
            r6 = 1
        L_0x00ec:
            if (r6 == 0) goto L_0x0114
            j1.a r0 = r1.f12852n0
            H3.O r0 = r0.a(r2)
            j1.a r6 = r1.f12852n0
            long r6 = r6.d(r2)
            O0.c r8 = new O0.c
            r1.D(r6)
            r8.<init>(r0)
            if (r5 == 0) goto L_0x010c
            android.os.Message r0 = r5.obtainMessage(r4, r8)
            r0.sendToTarget()
            goto L_0x010f
        L_0x010c:
            r1.F(r8)
        L_0x010f:
            j1.a r0 = r1.f12852n0
            r0.e(r6)
        L_0x0114:
            r1.f12847C0 = r2
            goto L_0x02eb
        L_0x0118:
            r19.B()
            r1.f12847C0 = r2
            M1.c r0 = r1.f12858u0
            java.lang.String r10 = "TextRenderer"
            java.lang.String r11 = "Subtitle decoding failed. streamFormat="
            r12 = 0
            if (r0 != 0) goto L_0x017b
            M1.e r0 = r1.f12855r0
            r0.getClass()
            r0.b(r2)
            M1.e r0 = r1.f12855r0     // Catch:{ f -> 0x013c }
            r0.getClass()     // Catch:{ f -> 0x013c }
            java.lang.Object r0 = r0.c()     // Catch:{ f -> 0x013c }
            M1.c r0 = (M1.c) r0     // Catch:{ f -> 0x013c }
            r1.f12858u0 = r0     // Catch:{ f -> 0x013c }
            goto L_0x017b
        L_0x013c:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            M0.r r3 = r1.f12846B0
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            P0.l.p(r10, r2, r0)
            O0.c r0 = new O0.c
            H3.i0 r2 = H3.i0.f2073Y
            long r7 = r1.f12847C0
            r1.D(r7)
            r0.<init>(r2)
            if (r5 == 0) goto L_0x0164
            android.os.Message r0 = r5.obtainMessage(r4, r0)
            r0.sendToTarget()
            goto L_0x0167
        L_0x0164:
            r1.F(r0)
        L_0x0167:
            r19.G()
            M1.e r0 = r1.f12855r0
            r0.getClass()
            r0.release()
            r1.f12855r0 = r12
            r1.f12854q0 = r6
            r19.E()
            goto L_0x02eb
        L_0x017b:
            int r0 = r1.f4805b0
            r13 = 2
            if (r0 == r13) goto L_0x0182
            goto L_0x02eb
        L_0x0182:
            M1.c r0 = r1.f12857t0
            if (r0 == 0) goto L_0x019a
            long r14 = r19.C()
            r0 = 0
        L_0x018b:
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 > 0) goto L_0x019b
            int r0 = r1.f12859v0
            int r0 = r0 + r4
            r1.f12859v0 = r0
            long r14 = r19.C()
            r0 = 1
            goto L_0x018b
        L_0x019a:
            r0 = 0
        L_0x019b:
            M1.c r14 = r1.f12858u0
            if (r14 == 0) goto L_0x01ca
            boolean r15 = r14.d(r7)
            if (r15 == 0) goto L_0x01d2
            if (r0 != 0) goto L_0x01ca
            long r14 = r19.C()
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x01ca
            int r14 = r1.f12854q0
            if (r14 != r13) goto L_0x01cc
            r19.G()
            M1.e r14 = r1.f12855r0
            r14.getClass()
            r14.release()
            r1.f12855r0 = r12
            r1.f12854q0 = r6
            r19.E()
        L_0x01ca:
            r15 = r9
            goto L_0x01eb
        L_0x01cc:
            r19.G()
            r1.f12845A0 = r4
            goto L_0x01ca
        L_0x01d2:
            r15 = r9
            long r8 = r14.f4391W
            int r16 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r16 > 0) goto L_0x01eb
            M1.c r0 = r1.f12857t0
            if (r0 == 0) goto L_0x01e0
            r0.t()
        L_0x01e0:
            int r0 = r14.c(r2)
            r1.f12859v0 = r0
            r1.f12857t0 = r14
            r1.f12858u0 = r12
            r0 = 1
        L_0x01eb:
            if (r0 == 0) goto L_0x0239
            M1.c r0 = r1.f12857t0
            r0.getClass()
            M1.c r0 = r1.f12857t0
            int r0 = r0.c(r2)
            if (r0 == 0) goto L_0x021a
            M1.c r8 = r1.f12857t0
            int r8 = r8.s0()
            if (r8 != 0) goto L_0x0203
            goto L_0x021a
        L_0x0203:
            r8 = -1
            if (r0 != r8) goto L_0x0212
            M1.c r0 = r1.f12857t0
            int r8 = r0.s0()
            int r8 = r8 - r4
            long r8 = r0.s(r8)
            goto L_0x021e
        L_0x0212:
            M1.c r8 = r1.f12857t0
            int r0 = r0 - r4
            long r8 = r8.s(r0)
            goto L_0x021e
        L_0x021a:
            M1.c r0 = r1.f12857t0
            long r8 = r0.f4391W
        L_0x021e:
            r1.D(r8)
            O0.c r0 = new O0.c
            M1.c r8 = r1.f12857t0
            java.util.List r2 = r8.X(r2)
            r0.<init>(r2)
            if (r5 == 0) goto L_0x0236
            android.os.Message r0 = r5.obtainMessage(r4, r0)
            r0.sendToTarget()
            goto L_0x0239
        L_0x0236:
            r1.F(r0)
        L_0x0239:
            int r0 = r1.f12854q0
            if (r0 != r13) goto L_0x023f
            goto L_0x02eb
        L_0x023f:
            boolean r0 = r1.f12863z0     // Catch:{ f -> 0x0259 }
            if (r0 != 0) goto L_0x02eb
            M1.i r0 = r1.f12856s0     // Catch:{ f -> 0x0259 }
            if (r0 != 0) goto L_0x025b
            M1.e r0 = r1.f12855r0     // Catch:{ f -> 0x0259 }
            r0.getClass()     // Catch:{ f -> 0x0259 }
            java.lang.Object r0 = r0.d()     // Catch:{ f -> 0x0259 }
            M1.i r0 = (M1.i) r0     // Catch:{ f -> 0x0259 }
            if (r0 != 0) goto L_0x0256
            goto L_0x02eb
        L_0x0256:
            r1.f12856s0 = r0     // Catch:{ f -> 0x0259 }
            goto L_0x025b
        L_0x0259:
            r0 = move-exception
            goto L_0x02af
        L_0x025b:
            int r2 = r1.f12854q0     // Catch:{ f -> 0x0259 }
            if (r2 != r4) goto L_0x026f
            r0.f4018V = r7     // Catch:{ f -> 0x0259 }
            M1.e r2 = r1.f12855r0     // Catch:{ f -> 0x0259 }
            r2.getClass()     // Catch:{ f -> 0x0259 }
            r2.e(r0)     // Catch:{ f -> 0x0259 }
            r1.f12856s0 = r12     // Catch:{ f -> 0x0259 }
            r1.f12854q0 = r13     // Catch:{ f -> 0x0259 }
            goto L_0x02eb
        L_0x026f:
            r2 = r15
            int r3 = r1.u(r2, r0, r6)     // Catch:{ f -> 0x0259 }
            r8 = -4
            if (r3 != r8) goto L_0x02a9
            boolean r3 = r0.d(r7)     // Catch:{ f -> 0x0259 }
            if (r3 == 0) goto L_0x0282
            r1.f12863z0 = r4     // Catch:{ f -> 0x0259 }
            r1.p0 = r6     // Catch:{ f -> 0x0259 }
            goto L_0x029a
        L_0x0282:
            java.lang.Object r3 = r2.f4337W     // Catch:{ f -> 0x0259 }
            M0.r r3 = (M0.r) r3     // Catch:{ f -> 0x0259 }
            if (r3 != 0) goto L_0x0289
            goto L_0x02eb
        L_0x0289:
            long r14 = r3.f3041s     // Catch:{ f -> 0x0259 }
            r0.f3085d0 = r14     // Catch:{ f -> 0x0259 }
            r0.v()     // Catch:{ f -> 0x0259 }
            boolean r3 = r1.p0     // Catch:{ f -> 0x0259 }
            boolean r9 = r0.d(r4)     // Catch:{ f -> 0x0259 }
            r9 = r9 ^ r4
            r3 = r3 & r9
            r1.p0 = r3     // Catch:{ f -> 0x0259 }
        L_0x029a:
            boolean r3 = r1.p0     // Catch:{ f -> 0x0259 }
            if (r3 != 0) goto L_0x02ad
            M1.e r3 = r1.f12855r0     // Catch:{ f -> 0x0259 }
            r3.getClass()     // Catch:{ f -> 0x0259 }
            r3.e(r0)     // Catch:{ f -> 0x0259 }
            r1.f12856s0 = r12     // Catch:{ f -> 0x0259 }
            goto L_0x02ad
        L_0x02a9:
            r0 = -3
            if (r3 != r0) goto L_0x02ad
            goto L_0x02eb
        L_0x02ad:
            r15 = r2
            goto L_0x023f
        L_0x02af:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            M0.r r3 = r1.f12846B0
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            P0.l.p(r10, r2, r0)
            O0.c r0 = new O0.c
            H3.i0 r2 = H3.i0.f2073Y
            long r7 = r1.f12847C0
            r1.D(r7)
            r0.<init>(r2)
            if (r5 == 0) goto L_0x02d6
            android.os.Message r0 = r5.obtainMessage(r4, r0)
            r0.sendToTarget()
            goto L_0x02d9
        L_0x02d6:
            r1.F(r0)
        L_0x02d9:
            r19.G()
            M1.e r0 = r1.f12855r0
            r0.getClass()
            r0.release()
            r1.f12855r0 = r12
            r1.f12854q0 = r6
            r19.E()
        L_0x02eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C1119d.v(long, long):void");
    }

    public final int z(r rVar) {
        int i;
        if (!Objects.equals(rVar.f3036n, "application/x-media3-cues")) {
            c cVar = this.f12853o0;
            cVar.getClass();
            if (!((i) cVar.f6955V).a(rVar)) {
                String str = rVar.f3036n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    if (I.m(str)) {
                        return g.e(1, 0, 0, 0);
                    }
                    return g.e(0, 0, 0, 0);
                }
            }
        }
        if (rVar.f3023L == 0) {
            i = 4;
        } else {
            i = 2;
        }
        return g.e(i, 0, 0, 0);
    }
}
