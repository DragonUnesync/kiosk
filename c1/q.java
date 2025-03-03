package c1;

import H3.P;
import M0.r;
import N0.d;
import O7.b;
import P0.l;
import P0.z;
import R2.c;
import S0.a;
import S0.e;
import S0.f;
import T0.A;
import T0.C0213e;
import T0.C0214f;
import T0.C0215g;
import T0.C0220l;
import V0.C;
import Y0.i;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import h1.Y;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import u.C1455O;

public abstract class q extends C0213e {

    /* renamed from: v1  reason: collision with root package name */
    public static final byte[] f8812v1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0  reason: collision with root package name */
    public MediaCrypto f8813A0;

    /* renamed from: B0  reason: collision with root package name */
    public final long f8814B0;

    /* renamed from: C0  reason: collision with root package name */
    public float f8815C0;

    /* renamed from: D0  reason: collision with root package name */
    public float f8816D0;

    /* renamed from: E0  reason: collision with root package name */
    public k f8817E0;

    /* renamed from: F0  reason: collision with root package name */
    public r f8818F0;

    /* renamed from: G0  reason: collision with root package name */
    public MediaFormat f8819G0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f8820H0;

    /* renamed from: I0  reason: collision with root package name */
    public float f8821I0;

    /* renamed from: J0  reason: collision with root package name */
    public ArrayDeque f8822J0;

    /* renamed from: K0  reason: collision with root package name */
    public o f8823K0;

    /* renamed from: L0  reason: collision with root package name */
    public n f8824L0;

    /* renamed from: M0  reason: collision with root package name */
    public int f8825M0;

    /* renamed from: N0  reason: collision with root package name */
    public boolean f8826N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f8827O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f8828P0;

    /* renamed from: Q0  reason: collision with root package name */
    public boolean f8829Q0;

    /* renamed from: R0  reason: collision with root package name */
    public boolean f8830R0;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f8831S0;

    /* renamed from: T0  reason: collision with root package name */
    public long f8832T0;

    /* renamed from: U0  reason: collision with root package name */
    public long f8833U0;

    /* renamed from: V0  reason: collision with root package name */
    public int f8834V0;

    /* renamed from: W0  reason: collision with root package name */
    public int f8835W0;

    /* renamed from: X0  reason: collision with root package name */
    public ByteBuffer f8836X0;

    /* renamed from: Y0  reason: collision with root package name */
    public boolean f8837Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f8838Z0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f8839a1;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f8840b1;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f8841c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f8842d1;

    /* renamed from: e1  reason: collision with root package name */
    public int f8843e1;

    /* renamed from: f1  reason: collision with root package name */
    public int f8844f1;

    /* renamed from: g1  reason: collision with root package name */
    public int f8845g1;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f8846h1;

    /* renamed from: i1  reason: collision with root package name */
    public boolean f8847i1;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f8848j1;

    /* renamed from: k1  reason: collision with root package name */
    public long f8849k1;

    /* renamed from: l0  reason: collision with root package name */
    public final j f8850l0;

    /* renamed from: l1  reason: collision with root package name */
    public long f8851l1;

    /* renamed from: m0  reason: collision with root package name */
    public final i f8852m0;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f8853m1;

    /* renamed from: n0  reason: collision with root package name */
    public final float f8854n0;

    /* renamed from: n1  reason: collision with root package name */
    public boolean f8855n1;

    /* renamed from: o0  reason: collision with root package name */
    public final f f8856o0 = new f(0);

    /* renamed from: o1  reason: collision with root package name */
    public boolean f8857o1;
    public final f p0 = new f(0);

    /* renamed from: p1  reason: collision with root package name */
    public boolean f8858p1;

    /* renamed from: q0  reason: collision with root package name */
    public final f f8859q0 = new f(2);

    /* renamed from: q1  reason: collision with root package name */
    public C0220l f8860q1;

    /* renamed from: r0  reason: collision with root package name */
    public final g f8861r0;

    /* renamed from: r1  reason: collision with root package name */
    public C0214f f8862r1;

    /* renamed from: s0  reason: collision with root package name */
    public final MediaCodec.BufferInfo f8863s0;
    public p s1;

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayDeque f8864t0;
    public long t1;

    /* renamed from: u0  reason: collision with root package name */
    public final C f8865u0;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f8866u1;

    /* renamed from: v0  reason: collision with root package name */
    public r f8867v0;

    /* renamed from: w0  reason: collision with root package name */
    public r f8868w0;

    /* renamed from: x0  reason: collision with root package name */
    public P f8869x0;

    /* renamed from: y0  reason: collision with root package name */
    public P f8870y0;

    /* renamed from: z0  reason: collision with root package name */
    public A f8871z0;

    /* JADX WARNING: type inference failed for: r4v4, types: [S0.f, c1.g] */
    /* JADX WARNING: type inference failed for: r4v6, types: [V0.C, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9, types: [T0.f, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(int i, j jVar, float f8) {
        super(i);
        i iVar = i.f8795V;
        this.f8850l0 = jVar;
        this.f8852m0 = iVar;
        this.f8854n0 = f8;
        ? fVar = new f(2);
        fVar.f8792f0 = 32;
        this.f8861r0 = fVar;
        this.f8863s0 = new MediaCodec.BufferInfo();
        this.f8815C0 = 1.0f;
        this.f8816D0 = 1.0f;
        this.f8814B0 = -9223372036854775807L;
        this.f8864t0 = new ArrayDeque();
        this.s1 = p.e;
        fVar.u(0);
        fVar.f4386Y.order(ByteOrder.nativeOrder());
        ? obj = new Object();
        obj.f5486a = d.f3237a;
        obj.f5488c = 0;
        obj.f5487b = 2;
        this.f8865u0 = obj;
        this.f8821I0 = -1.0f;
        this.f8825M0 = 0;
        this.f8843e1 = 0;
        this.f8834V0 = -1;
        this.f8835W0 = -1;
        this.f8833U0 = -9223372036854775807L;
        this.f8849k1 = -9223372036854775807L;
        this.f8851l1 = -9223372036854775807L;
        this.t1 = -9223372036854775807L;
        this.f8832T0 = -9223372036854775807L;
        this.f8844f1 = 0;
        this.f8845g1 = 0;
        this.f8862r1 = new Object();
    }

    public final int A() {
        return 8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0327, code lost:
        r15.f8840b1 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0323 A[LOOP:0: B:24:0x0096->B:120:0x0323, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0321 A[EDGE_INSN: B:136:0x0321->B:119:0x0321 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B(long r27, long r29) {
        /*
            r26 = this;
            r15 = r26
            boolean r0 = r15.f8855n1
            r14 = 1
            r0 = r0 ^ r14
            P0.l.j(r0)
            c1.g r13 = r15.f8861r0
            boolean r0 = r13.x()
            r12 = 0
            if (r0 == 0) goto L_0x0056
            java.nio.ByteBuffer r6 = r13.f4386Y
            int r7 = r15.f8835W0
            int r9 = r13.f8791e0
            long r3 = r13.f4388a0
            long r0 = r15.f4809f0
            long r10 = r13.f8790d0
            boolean r17 = r15.S(r0, r10)
            r10 = 4
            boolean r16 = r13.d(r10)
            M0.r r11 = r15.f8868w0
            r11.getClass()
            r5 = 0
            r8 = 0
            r0 = r26
            r1 = r27
            r18 = r3
            r3 = r29
            r20 = r11
            r10 = r18
            r12 = r17
            r22 = r13
            r13 = r16
            r14 = r20
            boolean r0 = r0.g0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            if (r0 == 0) goto L_0x0054
            r0 = r22
            long r1 = r0.f8790d0
            r15.b0(r1)
            r0.r()
        L_0x0052:
            r1 = 0
            goto L_0x0058
        L_0x0054:
            r1 = 0
            return r1
        L_0x0056:
            r0 = r13
            goto L_0x0052
        L_0x0058:
            boolean r2 = r15.f8853m1
            if (r2 == 0) goto L_0x0060
            r2 = 1
            r15.f8855n1 = r2
            return r1
        L_0x0060:
            r2 = 1
            boolean r3 = r15.f8840b1
            S0.f r4 = r15.f8859q0
            if (r3 == 0) goto L_0x0070
            boolean r3 = r0.w(r4)
            P0.l.j(r3)
            r15.f8840b1 = r1
        L_0x0070:
            boolean r3 = r15.f8841c1
            if (r3 == 0) goto L_0x0088
            boolean r3 = r0.x()
            if (r3 == 0) goto L_0x007b
            return r2
        L_0x007b:
            r26.E()
            r15.f8841c1 = r1
            r26.T()
            boolean r3 = r15.f8839a1
            if (r3 != 0) goto L_0x0088
            return r1
        L_0x0088:
            boolean r3 = r15.f8853m1
            r3 = r3 ^ r2
            P0.l.j(r3)
            R2.c r3 = r15.f4800W
            r3.I()
            r4.r()
        L_0x0096:
            r4.r()
            int r5 = r15.u(r3, r4, r1)
            r6 = -5
            if (r5 == r6) goto L_0x032a
            r6 = -4
            if (r5 == r6) goto L_0x00ba
            r3 = -3
            if (r5 != r3) goto L_0x00b4
            boolean r3 = r26.j()
            if (r3 == 0) goto L_0x00b0
            long r3 = r15.f8849k1
            r15.f8851l1 = r3
        L_0x00b0:
            r1 = 1
            r7 = 0
            goto L_0x032f
        L_0x00b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00ba:
            r5 = 4
            boolean r6 = r4.d(r5)
            if (r6 == 0) goto L_0x00c8
            r15.f8853m1 = r2
            long r3 = r15.f8849k1
            r15.f8851l1 = r3
            goto L_0x00b0
        L_0x00c8:
            long r6 = r15.f8849k1
            long r8 = r4.f4388a0
            long r6 = java.lang.Math.max(r6, r8)
            r15.f8849k1 = r6
            boolean r6 = r26.j()
            if (r6 != 0) goto L_0x00e2
            S0.f r6 = r15.p0
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r6 = r6.d(r7)
            if (r6 == 0) goto L_0x00e6
        L_0x00e2:
            long r6 = r15.f8849k1
            r15.f8851l1 = r6
        L_0x00e6:
            boolean r6 = r15.f8857o1
            r7 = 8
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            java.lang.String r10 = "audio/opus"
            if (r6 == 0) goto L_0x0139
            M0.r r6 = r15.f8867v0
            r6.getClass()
            r15.f8868w0 = r6
            java.lang.String r6 = r6.f3036n
            boolean r6 = j$.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x0132
            M0.r r6 = r15.f8868w0
            java.util.List r6 = r6.f3039q
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0132
            M0.r r6 = r15.f8868w0
            java.util.List r6 = r6.f3039q
            java.lang.Object r6 = r6.get(r1)
            byte[] r6 = (byte[]) r6
            r11 = 11
            byte r11 = r6[r11]
            r11 = r11 & r8
            int r11 = r11 << r7
            r12 = 10
            byte r6 = r6[r12]
            r6 = r6 & r8
            r6 = r6 | r11
            M0.r r11 = r15.f8868w0
            r11.getClass()
            M0.q r11 = r11.a()
            r11.f2982E = r6
            M0.r r6 = new M0.r
            r6.<init>(r11)
            r15.f8868w0 = r6
        L_0x0132:
            M0.r r6 = r15.f8868w0
            r15.Z(r6, r9)
            r15.f8857o1 = r1
        L_0x0139:
            r4.v()
            M0.r r6 = r15.f8868w0
            if (r6 == 0) goto L_0x0303
            java.lang.String r6 = r6.f3036n
            boolean r6 = j$.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x0303
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r6 = r4.d(r6)
            if (r6 == 0) goto L_0x0157
            M0.r r6 = r15.f8868w0
            r4.f4384W = r6
            r15.Q(r4)
        L_0x0157:
            long r10 = r15.f4809f0
            long r12 = r4.f4388a0
            long r10 = r10 - r12
            r12 = 80000(0x13880, double:3.95253E-319)
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x0303
            M0.r r6 = r15.f8868w0
            r6.getClass()
            V0.C r10 = r15.f8865u0
            r10.getClass()
            java.nio.ByteBuffer r11 = r4.f4386Y
            r11.getClass()
            java.nio.ByteBuffer r11 = r4.f4386Y
            int r11 = r11.limit()
            java.nio.ByteBuffer r12 = r4.f4386Y
            int r12 = r12.position()
            int r11 = r11 - r12
            if (r11 != 0) goto L_0x0183
            goto L_0x0303
        L_0x0183:
            int r11 = r10.f5487b
            r12 = 2
            if (r11 != r12) goto L_0x019e
            java.util.List r6 = r6.f3039q
            int r11 = r6.size()
            if (r11 == r2) goto L_0x0197
            int r11 = r6.size()
            r13 = 3
            if (r11 != r13) goto L_0x019e
        L_0x0197:
            java.lang.Object r6 = r6.get(r1)
            r9 = r6
            byte[] r9 = (byte[]) r9
        L_0x019e:
            java.nio.ByteBuffer r6 = r4.f4386Y
            int r11 = r6.position()
            int r13 = r6.limit()
            int r14 = r13 - r11
            int r5 = r14 + 255
            int r5 = r5 / r8
            int r16 = r5 + 27
            int r16 = r16 + r14
            int r8 = r10.f5487b
            if (r8 != r12) goto L_0x01c4
            if (r9 == 0) goto L_0x01bb
            int r8 = r9.length
            int r8 = r8 + 28
            goto L_0x01bd
        L_0x01bb:
            r8 = 47
        L_0x01bd:
            int r17 = r8 + 44
            int r16 = r17 + r16
            r2 = r16
            goto L_0x01c7
        L_0x01c4:
            r2 = r16
            r8 = 0
        L_0x01c7:
            java.nio.ByteBuffer r1 = r10.f5486a
            int r1 = r1.capacity()
            if (r1 >= r2) goto L_0x01dc
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r10.f5486a = r1
            goto L_0x01e1
        L_0x01dc:
            java.nio.ByteBuffer r1 = r10.f5486a
            r1.clear()
        L_0x01e1:
            java.nio.ByteBuffer r1 = r10.f5486a
            int r2 = r10.f5487b
            if (r2 != r12) goto L_0x023e
            if (r9 == 0) goto L_0x0230
            r21 = 0
            r23 = 0
            r24 = 1
            r25 = 1
            r20 = r1
            V0.C.a(r20, r21, r23, r24, r25)
            int r2 = r9.length
            r17 = r13
            long r12 = (long) r2
            r2 = 8
            long r18 = r12 >> r2
            r20 = 0
            int r2 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x0206
            r2 = 1
            goto L_0x0207
        L_0x0206:
            r2 = 0
        L_0x0207:
            java.lang.String r7 = "out of range: %s"
            Q7.g.e(r2, r7, r12)
            int r2 = (int) r12
            byte r2 = (byte) r2
            r1.put(r2)
            r1.put(r9)
            byte[] r2 = r1.array()
            int r7 = r1.arrayOffset()
            int r12 = r9.length
            int r12 = r12 + 28
            r13 = 0
            int r2 = P0.z.l(r7, r12, r13, r2)
            r7 = 22
            r1.putInt(r7, r2)
            int r2 = r9.length
            int r2 = r2 + 28
            r1.position(r2)
            goto L_0x0237
        L_0x0230:
            r17 = r13
            byte[] r2 = V0.C.f5485d
            r1.put(r2)
        L_0x0237:
            byte[] r2 = V0.C.e
            r1.put(r2)
        L_0x023c:
            r2 = 0
            goto L_0x0241
        L_0x023e:
            r17 = r13
            goto L_0x023c
        L_0x0241:
            byte r7 = r6.get(r2)
            int r2 = r6.limit()
            r9 = 1
            if (r2 <= r9) goto L_0x0251
            byte r12 = r6.get(r9)
            goto L_0x0252
        L_0x0251:
            r12 = 0
        L_0x0252:
            long r12 = p1.C1332b.k(r7, r12)
            r18 = 48000(0xbb80, double:2.3715E-319)
            long r12 = r12 * r18
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r12 / r18
            int r2 = (int) r12
            int r7 = r10.f5488c
            int r7 = r7 + r2
            r10.f5488c = r7
            long r12 = (long) r7
            int r2 = r10.f5487b
            r25 = 0
            r20 = r1
            r21 = r12
            r23 = r2
            r24 = r5
            V0.C.a(r20, r21, r23, r24, r25)
            r12 = 0
        L_0x0277:
            if (r12 >= r5) goto L_0x028d
            r2 = 255(0xff, float:3.57E-43)
            if (r14 < r2) goto L_0x0285
            r7 = -1
            r1.put(r7)
            int r7 = r14 + -255
            r14 = r7
            goto L_0x028a
        L_0x0285:
            byte r7 = (byte) r14
            r1.put(r7)
            r14 = 0
        L_0x028a:
            int r12 = r12 + 1
            goto L_0x0277
        L_0x028d:
            r2 = r17
        L_0x028f:
            if (r11 >= r2) goto L_0x029b
            byte r5 = r6.get(r11)
            r1.put(r5)
            int r11 = r11 + 1
            goto L_0x028f
        L_0x029b:
            int r2 = r6.limit()
            r6.position(r2)
            r1.flip()
            int r2 = r10.f5487b
            r5 = 2
            if (r2 != r5) goto L_0x02c9
            byte[] r2 = r1.array()
            int r5 = r1.arrayOffset()
            int r5 = r5 + r8
            int r5 = r5 + 44
            int r6 = r1.limit()
            int r7 = r1.position()
            int r6 = r6 - r7
            r7 = 0
            int r2 = P0.z.l(r5, r6, r7, r2)
            int r8 = r8 + 66
            r1.putInt(r8, r2)
            goto L_0x02e4
        L_0x02c9:
            r7 = 0
            byte[] r2 = r1.array()
            int r5 = r1.arrayOffset()
            int r6 = r1.limit()
            int r8 = r1.position()
            int r6 = r6 - r8
            int r2 = P0.z.l(r5, r6, r7, r2)
            r5 = 22
            r1.putInt(r5, r2)
        L_0x02e4:
            int r2 = r10.f5487b
            r5 = 1
            int r2 = r2 + r5
            r10.f5487b = r2
            r10.f5486a = r1
            r4.r()
            java.nio.ByteBuffer r1 = r10.f5486a
            int r1 = r1.remaining()
            r4.u(r1)
            java.nio.ByteBuffer r1 = r4.f4386Y
            java.nio.ByteBuffer r2 = r10.f5486a
            r1.put(r2)
            r4.v()
            goto L_0x0304
        L_0x0303:
            r7 = 0
        L_0x0304:
            boolean r1 = r0.x()
            if (r1 != 0) goto L_0x030b
            goto L_0x031b
        L_0x030b:
            long r1 = r15.f4809f0
            long r5 = r0.f8790d0
            boolean r5 = r15.S(r1, r5)
            long r8 = r4.f4388a0
            boolean r1 = r15.S(r1, r8)
            if (r5 != r1) goto L_0x0321
        L_0x031b:
            boolean r1 = r0.w(r4)
            if (r1 != 0) goto L_0x0323
        L_0x0321:
            r1 = 1
            goto L_0x0327
        L_0x0323:
            r1 = 0
            r2 = 1
            goto L_0x0096
        L_0x0327:
            r15.f8840b1 = r1
            goto L_0x032f
        L_0x032a:
            r1 = 1
            r7 = 0
            r15.Y(r3)
        L_0x032f:
            boolean r2 = r0.x()
            if (r2 == 0) goto L_0x0338
            r0.v()
        L_0x0338:
            boolean r0 = r0.x()
            if (r0 != 0) goto L_0x0349
            boolean r0 = r15.f8853m1
            if (r0 != 0) goto L_0x0349
            boolean r0 = r15.f8841c1
            if (r0 == 0) goto L_0x0347
            goto L_0x0349
        L_0x0347:
            r14 = 0
            goto L_0x034a
        L_0x0349:
            r14 = 1
        L_0x034a:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.q.B(long, long):boolean");
    }

    public abstract C0215g C(n nVar, r rVar, r rVar2);

    public m D(IllegalStateException illegalStateException, n nVar) {
        return new m(illegalStateException, nVar);
    }

    public final void E() {
        this.f8841c1 = false;
        this.f8861r0.r();
        this.f8859q0.r();
        this.f8840b1 = false;
        this.f8839a1 = false;
        C c8 = this.f8865u0;
        c8.getClass();
        c8.f5486a = d.f3237a;
        c8.f5488c = 0;
        c8.f5487b = 2;
    }

    public final boolean F() {
        if (this.f8846h1) {
            this.f8844f1 = 1;
            if (this.f8827O0) {
                this.f8845g1 = 3;
                return false;
            }
            this.f8845g1 = 2;
        } else {
            t0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean G(long r22, long r24) {
        /*
            r21 = this;
            r15 = r21
            c1.k r5 = r15.f8817E0
            r5.getClass()
            int r0 = r15.f8835W0
            r14 = 0
            r13 = 1
            if (r0 < 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            android.media.MediaCodec$BufferInfo r12 = r15.f8863s0
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r15.f8828P0
            if (r0 == 0) goto L_0x002c
            boolean r0 = r15.f8847i1
            if (r0 == 0) goto L_0x002c
            int r0 = r5.h(r12)     // Catch:{ IllegalStateException -> 0x0021 }
            goto L_0x0030
        L_0x0021:
            r21.f0()
            boolean r0 = r15.f8855n1
            if (r0 == 0) goto L_0x002b
            r21.i0()
        L_0x002b:
            return r14
        L_0x002c:
            int r0 = r5.h(r12)
        L_0x0030:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 >= 0) goto L_0x008d
            r3 = -2
            if (r0 != r3) goto L_0x0063
            r15.f8848j1 = r13
            c1.k r0 = r15.f8817E0
            r0.getClass()
            android.media.MediaFormat r0 = r0.p()
            int r1 = r15.f8825M0
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x005e
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x005e
            r15.f8830R0 = r13
            goto L_0x0062
        L_0x005e:
            r15.f8819G0 = r0
            r15.f8820H0 = r13
        L_0x0062:
            return r13
        L_0x0063:
            boolean r0 = r15.f8831S0
            if (r0 == 0) goto L_0x0073
            boolean r0 = r15.f8853m1
            if (r0 != 0) goto L_0x0070
            int r0 = r15.f8844f1
            r3 = 2
            if (r0 != r3) goto L_0x0073
        L_0x0070:
            r21.f0()
        L_0x0073:
            long r3 = r15.f8832T0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            r0 = 100
            long r3 = r3 + r0
            P0.t r0 = r15.f4804a0
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x008c
            r21.f0()
        L_0x008c:
            return r14
        L_0x008d:
            boolean r3 = r15.f8830R0
            if (r3 == 0) goto L_0x0097
            r15.f8830R0 = r14
            r5.k(r0)
            return r13
        L_0x0097:
            int r3 = r12.size
            if (r3 != 0) goto L_0x00a5
            int r3 = r12.flags
            r3 = r3 & 4
            if (r3 == 0) goto L_0x00a5
            r21.f0()
            return r14
        L_0x00a5:
            r15.f8835W0 = r0
            java.nio.ByteBuffer r0 = r5.v(r0)
            r15.f8836X0 = r0
            if (r0 == 0) goto L_0x00be
            int r3 = r12.offset
            r0.position(r3)
            java.nio.ByteBuffer r0 = r15.f8836X0
            int r3 = r12.offset
            int r4 = r12.size
            int r3 = r3 + r4
            r0.limit(r3)
        L_0x00be:
            long r3 = r12.presentationTimeUs
            long r6 = r15.f4809f0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c8
            r0 = 1
            goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            r15.f8837Y0 = r0
            long r6 = r15.f8851l1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00d7
            r0 = 1
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            r15.f8838Z0 = r0
            r15.u0(r3)
        L_0x00dd:
            boolean r0 = r15.f8828P0
            if (r0 == 0) goto L_0x0129
            boolean r0 = r15.f8847i1
            if (r0 == 0) goto L_0x0129
            java.nio.ByteBuffer r6 = r15.f8836X0     // Catch:{ IllegalStateException -> 0x011b }
            int r7 = r15.f8835W0     // Catch:{ IllegalStateException -> 0x011b }
            int r8 = r12.flags     // Catch:{ IllegalStateException -> 0x011b }
            long r10 = r12.presentationTimeUs     // Catch:{ IllegalStateException -> 0x011b }
            boolean r9 = r15.f8837Y0     // Catch:{ IllegalStateException -> 0x011b }
            boolean r3 = r15.f8838Z0     // Catch:{ IllegalStateException -> 0x011b }
            M0.r r4 = r15.f8868w0     // Catch:{ IllegalStateException -> 0x011b }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x011b }
            r16 = 1
            r0 = r21
            r1 = r22
            r17 = r3
            r18 = r4
            r3 = r24
            r19 = r9
            r9 = r16
            r20 = r12
            r12 = r19
            r16 = 1
            r13 = r17
            r17 = 0
            r14 = r18
            boolean r0 = r0.g0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0119 }
            r15 = r20
            goto L_0x0155
        L_0x0119:
            goto L_0x011e
        L_0x011b:
            r17 = 0
            goto L_0x0119
        L_0x011e:
            r21.f0()
            boolean r0 = r15.f8855n1
            if (r0 == 0) goto L_0x0128
            r21.i0()
        L_0x0128:
            return r17
        L_0x0129:
            r20 = r12
            r16 = 1
            r17 = 0
            java.nio.ByteBuffer r6 = r15.f8836X0
            int r7 = r15.f8835W0
            r14 = r20
            int r8 = r14.flags
            long r10 = r14.presentationTimeUs
            boolean r12 = r15.f8837Y0
            boolean r13 = r15.f8838Z0
            M0.r r9 = r15.f8868w0
            r9.getClass()
            r18 = 1
            r0 = r21
            r1 = r22
            r3 = r24
            r19 = r9
            r9 = r18
            r15 = r14
            r14 = r19
            boolean r0 = r0.g0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x0155:
            if (r0 == 0) goto L_0x018a
            long r0 = r15.presentationTimeUs
            r2 = r21
            r3 = r15
            r2.b0(r0)
            int r0 = r3.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0167
            r14 = 1
            goto L_0x0168
        L_0x0167:
            r14 = 0
        L_0x0168:
            if (r14 != 0) goto L_0x017d
            boolean r0 = r2.f8847i1
            if (r0 == 0) goto L_0x017d
            boolean r0 = r2.f8838Z0
            if (r0 == 0) goto L_0x017d
            P0.t r0 = r2.f4804a0
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            r2.f8832T0 = r0
        L_0x017d:
            r0 = -1
            r2.f8835W0 = r0
            r0 = 0
            r2.f8836X0 = r0
            if (r14 != 0) goto L_0x0186
            return r16
        L_0x0186:
            r21.f0()
            goto L_0x018c
        L_0x018a:
            r2 = r21
        L_0x018c:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.q.G(long, long):boolean");
    }

    public final boolean H() {
        k kVar = this.f8817E0;
        if (kVar == null || this.f8844f1 == 2 || this.f8853m1) {
            return false;
        }
        int i = this.f8834V0;
        f fVar = this.p0;
        if (i < 0) {
            int B8 = kVar.B();
            this.f8834V0 = B8;
            if (B8 < 0) {
                return false;
            }
            fVar.f4386Y = kVar.r(B8);
            fVar.r();
        }
        if (this.f8844f1 == 1) {
            if (!this.f8831S0) {
                this.f8847i1 = true;
                kVar.c(this.f8834V0, 0, 4, 0);
                this.f8834V0 = -1;
                fVar.f4386Y = null;
            }
            this.f8844f1 = 2;
            return false;
        } else if (this.f8829Q0) {
            this.f8829Q0 = false;
            ByteBuffer byteBuffer = fVar.f4386Y;
            byteBuffer.getClass();
            byteBuffer.put(f8812v1);
            kVar.c(this.f8834V0, 38, 0, 0);
            this.f8834V0 = -1;
            fVar.f4386Y = null;
            this.f8846h1 = true;
            return true;
        } else {
            if (this.f8843e1 == 1) {
                int i8 = 0;
                while (true) {
                    r rVar = this.f8818F0;
                    rVar.getClass();
                    if (i8 >= rVar.f3039q.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = fVar.f4386Y;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.f8818F0.f3039q.get(i8));
                    i8++;
                }
                this.f8843e1 = 2;
            }
            ByteBuffer byteBuffer3 = fVar.f4386Y;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            c cVar = this.f4800W;
            cVar.I();
            try {
                int u3 = u(cVar, fVar, 0);
                if (u3 == -3) {
                    if (j()) {
                        this.f8851l1 = this.f8849k1;
                    }
                    return false;
                } else if (u3 == -5) {
                    if (this.f8843e1 == 2) {
                        fVar.r();
                        this.f8843e1 = 1;
                    }
                    Y(cVar);
                    return true;
                } else if (fVar.d(4)) {
                    this.f8851l1 = this.f8849k1;
                    if (this.f8843e1 == 2) {
                        fVar.r();
                        this.f8843e1 = 1;
                    }
                    this.f8853m1 = true;
                    if (!this.f8846h1) {
                        f0();
                        return false;
                    }
                    if (!this.f8831S0) {
                        this.f8847i1 = true;
                        kVar.c(this.f8834V0, 0, 4, 0);
                        this.f8834V0 = -1;
                        fVar.f4386Y = null;
                    }
                    return false;
                } else if (!this.f8846h1 && !fVar.d(1)) {
                    fVar.r();
                    if (this.f8843e1 == 2) {
                        this.f8843e1 = 1;
                    }
                    return true;
                } else if (p0(fVar)) {
                    fVar.r();
                    this.f8862r1.f4821d++;
                    return true;
                } else {
                    boolean d8 = fVar.d(b.MAX_POW2);
                    if (d8) {
                        S0.b bVar = fVar.f4385X;
                        if (position == 0) {
                            bVar.getClass();
                        } else {
                            if (bVar.f4379d == null) {
                                int[] iArr = new int[1];
                                bVar.f4379d = iArr;
                                bVar.i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = bVar.f4379d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    long j7 = fVar.f4388a0;
                    if (this.f8857o1) {
                        ArrayDeque arrayDeque = this.f8864t0;
                        if (!arrayDeque.isEmpty()) {
                            C3.r rVar2 = ((p) arrayDeque.peekLast()).f8811d;
                            r rVar3 = this.f8867v0;
                            rVar3.getClass();
                            rVar2.a(rVar3, j7);
                        } else {
                            C3.r rVar4 = this.s1.f8811d;
                            r rVar5 = this.f8867v0;
                            rVar5.getClass();
                            rVar4.a(rVar5, j7);
                        }
                        this.f8857o1 = false;
                    }
                    this.f8849k1 = Math.max(this.f8849k1, j7);
                    if (j() || fVar.d(536870912)) {
                        this.f8851l1 = this.f8849k1;
                    }
                    fVar.v();
                    if (fVar.d(268435456)) {
                        Q(fVar);
                    }
                    d0(fVar);
                    int L8 = L(fVar);
                    if (d8) {
                        kVar.d(this.f8834V0, fVar.f4385X, j7, L8);
                    } else {
                        int i9 = this.f8834V0;
                        ByteBuffer byteBuffer4 = fVar.f4386Y;
                        byteBuffer4.getClass();
                        kVar.c(i9, byteBuffer4.limit(), L8, j7);
                    }
                    this.f8834V0 = -1;
                    fVar.f4386Y = null;
                    this.f8846h1 = true;
                    this.f8843e1 = 0;
                    this.f8862r1.f4820c++;
                    return true;
                }
            } catch (e e) {
                V(e);
                h0(0);
                I();
                return true;
            }
        }
    }

    public final void I() {
        try {
            k kVar = this.f8817E0;
            l.k(kVar);
            kVar.flush();
        } finally {
            k0();
        }
    }

    public final boolean J() {
        boolean z;
        if (this.f8817E0 == null) {
            return false;
        }
        int i = this.f8845g1;
        if (i == 3 || ((this.f8826N0 && !this.f8848j1) || (this.f8827O0 && this.f8847i1))) {
            i0();
            return true;
        }
        if (i == 2) {
            int i8 = z.f3748a;
            if (i8 >= 23) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
            if (i8 >= 23) {
                try {
                    t0();
                } catch (C0220l e) {
                    l.C("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    i0();
                    return true;
                }
            }
        }
        I();
        return false;
    }

    public final List K(boolean z) {
        r rVar = this.f8867v0;
        rVar.getClass();
        i iVar = this.f8852m0;
        ArrayList O8 = O(iVar, rVar, z);
        if (O8.isEmpty() && z) {
            O8 = O(iVar, rVar, false);
            if (!O8.isEmpty()) {
                l.B("MediaCodecRenderer", "Drm session requires secure decoder for " + rVar.f3036n + ", but no secure decoder available. Trying to proceed with " + O8 + ".");
            }
        }
        return O8;
    }

    public int L(f fVar) {
        return 0;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f8, r[] rVarArr);

    public abstract ArrayList O(i iVar, r rVar, boolean z);

    public abstract C1455O P(n nVar, r rVar, MediaCrypto mediaCrypto, float f8);

    public abstract void Q(f fVar);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(c1.n r13, android.media.MediaCrypto r14) {
        /*
            r12 = this;
            java.lang.String r0 = "createCodec:"
            M0.r r1 = r12.f8867v0
            r1.getClass()
            java.lang.String r7 = r13.f8797a
            int r2 = P0.z.f3748a
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 23
            if (r2 >= r4) goto L_0x0014
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001f
        L_0x0014:
            float r5 = r12.f8816D0
            M0.r[] r6 = r12.f4807d0
            r6.getClass()
            float r5 = r12.N(r5, r6)
        L_0x001f:
            float r6 = r12.f8854n0
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r3 = r5
        L_0x0027:
            r12.e0(r1)
            P0.t r5 = r12.f4804a0
            r5.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            u.O r14 = r12.P(r13, r1, r14, r3)
            r8 = 31
            if (r2 < r8) goto L_0x005e
            U0.j r8 = r12.f4803Z
            r8.getClass()
            U0.i r8 = r8.f5373b
            r8.getClass()
            android.media.metrics.LogSessionId r8 = r8.f5371a
            android.media.metrics.LogSessionId r9 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x005e
            java.lang.Object r9 = r14.f15530b
            android.media.MediaFormat r9 = (android.media.MediaFormat) r9
            java.lang.String r10 = "log-session-id"
            java.lang.String r8 = r8.getStringId()
            r9.setString(r10, r8)
        L_0x005e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r8.<init>(r0)     // Catch:{ all -> 0x01e1 }
            r8.append(r7)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x01e1 }
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x01e1 }
            c1.j r0 = r12.f8850l0     // Catch:{ all -> 0x01e1 }
            c1.k r14 = r0.t(r14)     // Catch:{ all -> 0x01e1 }
            r12.f8817E0 = r14     // Catch:{ all -> 0x01e1 }
            Z1.c r0 = new Z1.c     // Catch:{ all -> 0x01e1 }
            r8 = 5
            r0.<init>((int) r8, (java.lang.Object) r12)     // Catch:{ all -> 0x01e1 }
            r14.u(r0)     // Catch:{ all -> 0x01e1 }
            android.os.Trace.endSection()
            P0.t r14 = r12.f4804a0
            r14.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            boolean r14 = r13.d(r1)
            if (r14 != 0) goto L_0x00b6
            java.lang.String r14 = M0.r.d(r1)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r10 = "Format exceeds selected codec's capabilities ["
            r0.<init>(r10)
            r0.append(r14)
            java.lang.String r14 = ", "
            r0.append(r14)
            r0.append(r7)
            java.lang.String r14 = "]"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = "MediaCodecRenderer"
            P0.l.B(r0, r14)
        L_0x00b6:
            r12.f8824L0 = r13
            r12.f8821I0 = r3
            r12.f8818F0 = r1
            r14 = 2
            r0 = 25
            r1 = 0
            r3 = 1
            if (r2 > r0) goto L_0x00ef
            java.lang.String r10 = "OMX.Exynos.avc.dec.secure"
            boolean r10 = r10.equals(r7)
            if (r10 == 0) goto L_0x00ef
            java.lang.String r10 = P0.z.f3751d
            java.lang.String r11 = "SM-T585"
            boolean r11 = r10.startsWith(r11)
            if (r11 != 0) goto L_0x00ed
            java.lang.String r11 = "SM-A510"
            boolean r11 = r10.startsWith(r11)
            if (r11 != 0) goto L_0x00ed
            java.lang.String r11 = "SM-A520"
            boolean r11 = r10.startsWith(r11)
            if (r11 != 0) goto L_0x00ed
            java.lang.String r11 = "SM-J700"
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x00ef
        L_0x00ed:
            r10 = 2
            goto L_0x0128
        L_0x00ef:
            r10 = 24
            if (r2 >= r10) goto L_0x0127
            java.lang.String r10 = "OMX.Nvidia.h264.decode"
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L_0x0103
            java.lang.String r10 = "OMX.Nvidia.h264.decode.secure"
            boolean r10 = r10.equals(r7)
            if (r10 == 0) goto L_0x0127
        L_0x0103:
            java.lang.String r10 = P0.z.f3749b
            java.lang.String r11 = "flounder"
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x0125
            java.lang.String r11 = "flounder_lte"
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x0125
            java.lang.String r11 = "grouper"
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x0125
            java.lang.String r11 = "tilapia"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0127
        L_0x0125:
            r10 = 1
            goto L_0x0128
        L_0x0127:
            r10 = 0
        L_0x0128:
            r12.f8825M0 = r10
            r10 = 29
            if (r2 != r10) goto L_0x0138
            java.lang.String r11 = "c2.android.aac.decoder"
            boolean r11 = r11.equals(r7)
            if (r11 == 0) goto L_0x0138
            r11 = 1
            goto L_0x0139
        L_0x0138:
            r11 = 0
        L_0x0139:
            r12.f8826N0 = r11
            if (r2 > r4) goto L_0x0147
            java.lang.String r4 = "OMX.google.vorbis.decoder"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0147
            r4 = 1
            goto L_0x0148
        L_0x0147:
            r4 = 0
        L_0x0148:
            r12.f8827O0 = r4
            r4 = 21
            if (r2 != r4) goto L_0x0158
            java.lang.String r4 = "OMX.google.aac.decoder"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0158
            r4 = 1
            goto L_0x0159
        L_0x0158:
            r4 = 0
        L_0x0159:
            r12.f8828P0 = r4
            java.lang.String r4 = r13.f8797a
            if (r2 > r0) goto L_0x0167
            java.lang.String r0 = "OMX.rk.video_decoder.avc"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01b8
        L_0x0167:
            if (r2 > r10) goto L_0x0199
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = "OMX.bcm.vdec.avc.tunnel"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01b8
        L_0x0199:
            java.lang.String r0 = "Amazon"
            java.lang.String r2 = P0.z.f3750c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = "AFTS"
            java.lang.String r2 = P0.z.f3751d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b2
            boolean r13 = r13.f8801f
            if (r13 == 0) goto L_0x01b2
            goto L_0x01b8
        L_0x01b2:
            boolean r13 = r12.M()
            if (r13 == 0) goto L_0x01b9
        L_0x01b8:
            r1 = 1
        L_0x01b9:
            r12.f8831S0 = r1
            c1.k r13 = r12.f8817E0
            r13.getClass()
            int r13 = r12.f4805b0
            if (r13 != r14) goto L_0x01d2
            P0.t r13 = r12.f4804a0
            r13.getClass()
            long r13 = android.os.SystemClock.elapsedRealtime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 + r0
            r12.f8833U0 = r13
        L_0x01d2:
            T0.f r13 = r12.f8862r1
            int r14 = r13.f4818a
            int r14 = r14 + r3
            r13.f4818a = r14
            long r5 = r8 - r5
            r2 = r12
            r3 = r8
            r2.W(r3, r5, r7)
            return
        L_0x01e1:
            r13 = move-exception
            android.os.Trace.endSection()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.q.R(c1.n, android.media.MediaCrypto):void");
    }

    public final boolean S(long j7, long j8) {
        r rVar;
        if (j8 >= j7 || ((rVar = this.f8868w0) != null && Objects.equals(rVar.f3036n, "audio/opus") && j7 - j8 <= 80000)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        if (r7 != 4) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        if (r1.y0() != null) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T() {
        /*
            r8 = this;
            c1.k r0 = r8.f8817E0
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r8.f8839a1
            if (r0 != 0) goto L_0x00ea
            M0.r r0 = r8.f8867v0
            if (r0 != 0) goto L_0x000e
            goto L_0x00ea
        L_0x000e:
            H3.P r1 = r8.f8870y0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r8.q0(r0)
            if (r1 == 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.String r4 = r0.f3036n
            if (r1 == 0) goto L_0x004e
            r8.E()
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r4)
            c1.g r1 = r8.f8861r0
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0044
            r1.getClass()
            r1.f8792f0 = r3
            goto L_0x004b
        L_0x0044:
            r1.getClass()
            r0 = 32
            r1.f8792f0 = r0
        L_0x004b:
            r8.f8839a1 = r3
            return
        L_0x004e:
            H3.P r1 = r8.f8870y0
            r8.m0(r1)
            H3.P r1 = r8.f8869x0
            r5 = 4
            if (r1 == 0) goto L_0x00ac
            android.media.MediaCrypto r1 = r8.f8813A0
            if (r1 != 0) goto L_0x005e
            r1 = 1
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            P0.l.j(r1)
            H3.P r1 = r8.f8869x0
            S0.a r6 = r1.x0()
            boolean r7 = Y0.i.f6320a
            if (r7 == 0) goto L_0x0089
            boolean r7 = r6 instanceof Y0.i
            if (r7 == 0) goto L_0x0089
            int r7 = r1.A0()
            if (r7 == r3) goto L_0x0079
            if (r7 == r5) goto L_0x0089
            goto L_0x00d4
        L_0x0079:
            Y0.c r0 = r1.y0()
            r0.getClass()
            M0.r r1 = r8.f8867v0
            int r3 = r0.f6313U
            T0.l r0 = r8.f(r0, r1, r2, r3)
            throw r0
        L_0x0089:
            if (r6 != 0) goto L_0x0092
            Y0.c r1 = r1.y0()
            if (r1 == 0) goto L_0x00d4
            goto L_0x00ac
        L_0x0092:
            boolean r1 = r6 instanceof Y0.i
            if (r1 == 0) goto L_0x00ac
            Y0.i r6 = (Y0.i) r6
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x00a2 }
            r6 = 0
            r7 = 0
            r1.<init>(r6, r7)     // Catch:{ MediaCryptoException -> 0x00a2 }
            r8.f8813A0 = r1     // Catch:{ MediaCryptoException -> 0x00a2 }
            goto L_0x00ac
        L_0x00a2:
            r0 = move-exception
            M0.r r1 = r8.f8867v0
            r3 = 6006(0x1776, float:8.416E-42)
            T0.l r0 = r8.f(r0, r1, r2, r3)
            throw r0
        L_0x00ac:
            H3.P r1 = r8.f8869x0     // Catch:{ o -> 0x00c0 }
            if (r1 == 0) goto L_0x00ce
            int r1 = r1.A0()     // Catch:{ o -> 0x00c0 }
            r6 = 3
            if (r1 == r6) goto L_0x00c2
            H3.P r1 = r8.f8869x0     // Catch:{ o -> 0x00c0 }
            int r1 = r1.A0()     // Catch:{ o -> 0x00c0 }
            if (r1 != r5) goto L_0x00ce
            goto L_0x00c2
        L_0x00c0:
            r1 = move-exception
            goto L_0x00e3
        L_0x00c2:
            H3.P r1 = r8.f8869x0     // Catch:{ o -> 0x00c0 }
            P0.l.k(r4)     // Catch:{ o -> 0x00c0 }
            boolean r1 = r1.E0(r4)     // Catch:{ o -> 0x00c0 }
            if (r1 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r3 = 0
        L_0x00cf:
            android.media.MediaCrypto r1 = r8.f8813A0     // Catch:{ o -> 0x00c0 }
            r8.U(r1, r3)     // Catch:{ o -> 0x00c0 }
        L_0x00d4:
            android.media.MediaCrypto r0 = r8.f8813A0
            if (r0 == 0) goto L_0x00e2
            c1.k r1 = r8.f8817E0
            if (r1 != 0) goto L_0x00e2
            r0.release()
            r0 = 0
            r8.f8813A0 = r0
        L_0x00e2:
            return
        L_0x00e3:
            r3 = 4001(0xfa1, float:5.607E-42)
            T0.l r0 = r8.f(r1, r0, r2, r3)
            throw r0
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.q.T():void");
    }

    public final void U(MediaCrypto mediaCrypto, boolean z) {
        String str;
        r rVar = this.f8867v0;
        rVar.getClass();
        if (this.f8822J0 == null) {
            try {
                List K4 = K(z);
                this.f8822J0 = new ArrayDeque();
                if (!K4.isEmpty()) {
                    this.f8822J0.add((n) K4.get(0));
                }
                this.f8823K0 = null;
            } catch (s e) {
                throw new o(rVar, e, z, -49998);
            }
        }
        if (!this.f8822J0.isEmpty()) {
            ArrayDeque arrayDeque = this.f8822J0;
            arrayDeque.getClass();
            while (this.f8817E0 == null) {
                n nVar = (n) arrayDeque.peekFirst();
                nVar.getClass();
                if (o0(nVar)) {
                    try {
                        R(nVar, mediaCrypto);
                    } catch (Exception e8) {
                        l.C("MediaCodecRenderer", "Failed to initialize decoder: " + nVar, e8);
                        arrayDeque.removeFirst();
                        String str2 = "Decoder init failed: " + nVar.f8797a + ", " + rVar;
                        if (e8 instanceof MediaCodec.CodecException) {
                            str = ((MediaCodec.CodecException) e8).getDiagnosticInfo();
                        } else {
                            str = null;
                        }
                        o oVar = new o(str2, e8, rVar.f3036n, z, nVar, str);
                        V(oVar);
                        o oVar2 = this.f8823K0;
                        if (oVar2 == null) {
                            this.f8823K0 = oVar;
                        } else {
                            this.f8823K0 = new o(oVar2.getMessage(), oVar2.getCause(), oVar2.f8804U, oVar2.f8805V, oVar2.f8806W, oVar2.f8807X);
                        }
                        if (arrayDeque.isEmpty()) {
                            throw this.f8823K0;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f8822J0 = null;
            return;
        }
        throw new o(rVar, (s) null, z, -49999);
    }

    public abstract void V(Exception exc);

    public abstract void W(long j7, long j8, String str);

    public abstract void X(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        if (r4.E0(r3) != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011d, code lost:
        if (F() == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0151, code lost:
        if (F() == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0163, code lost:
        if (F() == false) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x019a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T0.C0215g Y(R2.c r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f8857o1 = r0
            java.lang.Object r1 = r14.f4337W
            M0.r r1 = (M0.r) r1
            r1.getClass()
            r2 = 0
            java.lang.String r3 = r1.f3036n
            if (r3 == 0) goto L_0x01b6
            java.lang.String r4 = "video/av01"
            boolean r3 = r3.equals(r4)
            r4 = 0
            if (r3 == 0) goto L_0x002d
            java.util.List r3 = r1.f3039q
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002d
            M0.q r1 = r1.a()
            r1.f3002p = r4
            M0.r r3 = new M0.r
            r3.<init>(r1)
            r8 = r3
            goto L_0x002e
        L_0x002d:
            r8 = r1
        L_0x002e:
            java.lang.Object r14 = r14.f4336V
            H3.P r14 = (H3.P) r14
            H3.P r1 = r13.f8870y0
            if (r1 != r14) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            if (r14 == 0) goto L_0x003c
            r14.t0(r4)
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.D0(r4)
        L_0x0041:
            r13.f8870y0 = r14
            r13.f8867v0 = r8
            boolean r14 = r13.f8839a1
            if (r14 == 0) goto L_0x004c
            r13.f8841c1 = r0
            return r4
        L_0x004c:
            c1.k r14 = r13.f8817E0
            if (r14 != 0) goto L_0x0056
            r13.f8822J0 = r4
            r13.T()
            return r4
        L_0x0056:
            c1.n r1 = r13.f8824L0
            r1.getClass()
            M0.r r7 = r13.f8818F0
            r7.getClass()
            H3.P r3 = r13.f8869x0
            H3.P r4 = r13.f8870y0
            r5 = 3
            r6 = 23
            r9 = 2
            if (r3 != r4) goto L_0x006c
            goto L_0x00e7
        L_0x006c:
            if (r4 == 0) goto L_0x019b
            if (r3 != 0) goto L_0x0072
            goto L_0x019b
        L_0x0072:
            S0.a r10 = r4.x0()
            if (r10 != 0) goto L_0x007a
            goto L_0x019b
        L_0x007a:
            S0.a r11 = r3.x0()
            if (r11 == 0) goto L_0x019b
            java.lang.Class r12 = r10.getClass()
            java.lang.Class r11 = r11.getClass()
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x0090
            goto L_0x019b
        L_0x0090:
            boolean r10 = r10 instanceof Y0.i
            if (r10 != 0) goto L_0x0095
            goto L_0x00e7
        L_0x0095:
            java.util.UUID r10 = r4.z0()
            java.util.UUID r11 = r3.z0()
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00a5
            goto L_0x019b
        L_0x00a5:
            int r10 = P0.z.f3748a
            if (r10 >= r6) goto L_0x00ab
            goto L_0x019b
        L_0x00ab:
            java.util.UUID r10 = M0.C0119g.e
            java.util.UUID r3 = r3.z0()
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x019b
            java.util.UUID r3 = r4.z0()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x00c3
            goto L_0x019b
        L_0x00c3:
            boolean r3 = r1.f8801f
            if (r3 != 0) goto L_0x00e7
            int r3 = r4.A0()
            if (r3 == r9) goto L_0x019b
            int r3 = r4.A0()
            if (r3 == r5) goto L_0x00da
            int r3 = r4.A0()
            r10 = 4
            if (r3 != r10) goto L_0x00e7
        L_0x00da:
            java.lang.String r3 = r8.f3036n
            r3.getClass()
            boolean r3 = r4.E0(r3)
            if (r3 == 0) goto L_0x00e7
            goto L_0x019b
        L_0x00e7:
            H3.P r3 = r13.f8870y0
            H3.P r4 = r13.f8869x0
            if (r3 == r4) goto L_0x00ef
            r3 = 1
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            if (r3 == 0) goto L_0x00f9
            int r4 = P0.z.f3748a
            if (r4 < r6) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r4 = 0
            goto L_0x00fa
        L_0x00f9:
            r4 = 1
        L_0x00fa:
            P0.l.j(r4)
            T0.g r4 = r13.C(r1, r7, r8)
            int r6 = r4.f4836d
            if (r6 == 0) goto L_0x0176
            r10 = 16
            if (r6 == r0) goto L_0x0154
            if (r6 == r9) goto L_0x0128
            if (r6 != r5) goto L_0x0122
            boolean r0 = r13.s0(r8)
            if (r0 != 0) goto L_0x0115
            goto L_0x0186
        L_0x0115:
            r13.f8818F0 = r8
            if (r3 == 0) goto L_0x0185
            boolean r0 = r13.F()
            if (r0 != 0) goto L_0x0185
        L_0x011f:
            r10 = 2
            goto L_0x0186
        L_0x0122:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L_0x0128:
            boolean r11 = r13.s0(r8)
            if (r11 != 0) goto L_0x012f
            goto L_0x0186
        L_0x012f:
            r13.f8842d1 = r0
            r13.f8843e1 = r0
            int r10 = r13.f8825M0
            if (r10 == r9) goto L_0x0147
            if (r10 != r0) goto L_0x0146
            int r10 = r8.f3043u
            int r11 = r7.f3043u
            if (r10 != r11) goto L_0x0146
            int r10 = r8.f3044v
            int r11 = r7.f3044v
            if (r10 != r11) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r0 = 0
        L_0x0147:
            r13.f8829Q0 = r0
            r13.f8818F0 = r8
            if (r3 == 0) goto L_0x0185
            boolean r0 = r13.F()
            if (r0 != 0) goto L_0x0185
            goto L_0x011f
        L_0x0154:
            boolean r11 = r13.s0(r8)
            if (r11 != 0) goto L_0x015b
            goto L_0x0186
        L_0x015b:
            r13.f8818F0 = r8
            if (r3 == 0) goto L_0x0166
            boolean r0 = r13.F()
            if (r0 != 0) goto L_0x0185
            goto L_0x011f
        L_0x0166:
            boolean r3 = r13.f8846h1
            if (r3 == 0) goto L_0x0185
            r13.f8844f1 = r0
            boolean r3 = r13.f8827O0
            if (r3 == 0) goto L_0x0173
            r13.f8845g1 = r5
            goto L_0x011f
        L_0x0173:
            r13.f8845g1 = r0
            goto L_0x0185
        L_0x0176:
            boolean r3 = r13.f8846h1
            if (r3 == 0) goto L_0x017f
            r13.f8844f1 = r0
            r13.f8845g1 = r5
            goto L_0x0185
        L_0x017f:
            r13.i0()
            r13.T()
        L_0x0185:
            r10 = 0
        L_0x0186:
            if (r6 == 0) goto L_0x019a
            c1.k r0 = r13.f8817E0
            if (r0 != r14) goto L_0x0190
            int r14 = r13.f8845g1
            if (r14 != r5) goto L_0x019a
        L_0x0190:
            T0.g r14 = new T0.g
            java.lang.String r6 = r1.f8797a
            r9 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return r14
        L_0x019a:
            return r4
        L_0x019b:
            boolean r14 = r13.f8846h1
            if (r14 == 0) goto L_0x01a4
            r13.f8844f1 = r0
            r13.f8845g1 = r5
            goto L_0x01aa
        L_0x01a4:
            r13.i0()
            r13.T()
        L_0x01aa:
            T0.g r14 = new T0.g
            r10 = 128(0x80, float:1.794E-43)
            java.lang.String r6 = r1.f8797a
            r9 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return r14
        L_0x01b6:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample MIME type is null."
            r14.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            T0.l r14 = r13.f(r14, r1, r2, r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.q.Y(R2.c):T0.g");
    }

    public abstract void Z(r rVar, MediaFormat mediaFormat);

    public void a0() {
    }

    public void b0(long j7) {
        this.t1 = j7;
        while (true) {
            ArrayDeque arrayDeque = this.f8864t0;
            if (!arrayDeque.isEmpty() && j7 >= ((p) arrayDeque.peek()).f8808a) {
                p pVar = (p) arrayDeque.poll();
                pVar.getClass();
                n0(pVar);
                c0();
            } else {
                return;
            }
        }
    }

    public abstract void c0();

    public void d0(f fVar) {
    }

    public void e0(r rVar) {
    }

    public final void f0() {
        int i = this.f8845g1;
        if (i == 1) {
            I();
        } else if (i == 2) {
            I();
            t0();
        } else if (i != 3) {
            this.f8855n1 = true;
            j0();
        } else {
            i0();
            T();
        }
    }

    public abstract boolean g0(long j7, long j8, k kVar, ByteBuffer byteBuffer, int i, int i8, int i9, long j9, boolean z, boolean z6, r rVar);

    public final boolean h0(int i) {
        c cVar = this.f4800W;
        cVar.I();
        f fVar = this.f8856o0;
        fVar.r();
        int u3 = u(cVar, fVar, i | 4);
        if (u3 == -5) {
            Y(cVar);
            return true;
        } else if (u3 != -4 || !fVar.d(4)) {
            return false;
        } else {
            this.f8853m1 = true;
            f0();
            return false;
        }
    }

    public final void i0() {
        try {
            k kVar = this.f8817E0;
            if (kVar != null) {
                kVar.release();
                this.f8862r1.f4819b++;
                n nVar = this.f8824L0;
                nVar.getClass();
                X(nVar.f8797a);
            }
            this.f8817E0 = null;
            try {
                MediaCrypto mediaCrypto = this.f8813A0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f8813A0 = null;
                m0((P) null);
                l0();
            }
        } catch (Throwable th) {
            this.f8817E0 = null;
            MediaCrypto mediaCrypto2 = this.f8813A0;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.f8813A0 = null;
            m0((P) null);
            l0();
        }
    }

    public void j0() {
    }

    public void k0() {
        this.f8834V0 = -1;
        this.p0.f4386Y = null;
        this.f8835W0 = -1;
        this.f8836X0 = null;
        this.f8833U0 = -9223372036854775807L;
        this.f8847i1 = false;
        this.f8832T0 = -9223372036854775807L;
        this.f8846h1 = false;
        this.f8829Q0 = false;
        this.f8830R0 = false;
        this.f8837Y0 = false;
        this.f8838Z0 = false;
        this.f8849k1 = -9223372036854775807L;
        this.f8851l1 = -9223372036854775807L;
        this.t1 = -9223372036854775807L;
        this.f8844f1 = 0;
        this.f8845g1 = 0;
        this.f8843e1 = this.f8842d1 ? 1 : 0;
    }

    public boolean l() {
        boolean z;
        boolean z6;
        if (this.f8867v0 == null) {
            return false;
        }
        if (j()) {
            z = this.f4811h0;
        } else {
            Y y8 = this.f4806c0;
            y8.getClass();
            z = y8.g();
        }
        if (!z) {
            if (this.f8835W0 >= 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                if (this.f8833U0 == -9223372036854775807L) {
                    return false;
                }
                this.f4804a0.getClass();
                if (SystemClock.elapsedRealtime() < this.f8833U0) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final void l0() {
        k0();
        this.f8860q1 = null;
        this.f8822J0 = null;
        this.f8824L0 = null;
        this.f8818F0 = null;
        this.f8819G0 = null;
        this.f8820H0 = false;
        this.f8848j1 = false;
        this.f8821I0 = -1.0f;
        this.f8825M0 = 0;
        this.f8826N0 = false;
        this.f8827O0 = false;
        this.f8828P0 = false;
        this.f8831S0 = false;
        this.f8842d1 = false;
        this.f8843e1 = 0;
    }

    public void m() {
        this.f8867v0 = null;
        n0(p.e);
        this.f8864t0.clear();
        J();
    }

    public final void m0(P p3) {
        P p8 = this.f8869x0;
        if (p8 != p3) {
            if (p3 != null) {
                p3.t0((Y0.e) null);
            }
            if (p8 != null) {
                p8.D0((Y0.e) null);
            }
        }
        this.f8869x0 = p3;
    }

    public final void n0(p pVar) {
        this.s1 = pVar;
        if (pVar.f8810c != -9223372036854775807L) {
            this.f8866u1 = true;
            a0();
        }
    }

    public void o(long j7, boolean z) {
        this.f8853m1 = false;
        this.f8855n1 = false;
        this.f8858p1 = false;
        if (this.f8839a1) {
            this.f8861r0.r();
            this.f8859q0.r();
            this.f8840b1 = false;
            C c8 = this.f8865u0;
            c8.getClass();
            c8.f5486a = d.f3237a;
            c8.f5488c = 0;
            c8.f5487b = 2;
        } else if (J()) {
            T();
        }
        if (this.s1.f8811d.h() > 0) {
            this.f8857o1 = true;
        }
        this.s1.f8811d.b();
        this.f8864t0.clear();
    }

    public boolean o0(n nVar) {
        return true;
    }

    public boolean p0(f fVar) {
        return false;
    }

    public boolean q0(r rVar) {
        return false;
    }

    public abstract int r0(i iVar, r rVar);

    public final boolean s0(r rVar) {
        if (!(z.f3748a < 23 || this.f8817E0 == null || this.f8845g1 == 3 || this.f4805b0 == 0)) {
            float f8 = this.f8816D0;
            rVar.getClass();
            r[] rVarArr = this.f4807d0;
            rVarArr.getClass();
            float N2 = N(f8, rVarArr);
            float f9 = this.f8821I0;
            if (f9 == N2) {
                return true;
            }
            if (N2 == -1.0f) {
                if (this.f8846h1) {
                    this.f8844f1 = 1;
                    this.f8845g1 = 3;
                    return false;
                }
                i0();
                T();
                return false;
            } else if (f9 == -1.0f && N2 <= this.f8854n0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", N2);
                k kVar = this.f8817E0;
                kVar.getClass();
                kVar.g(bundle);
                this.f8821I0 = N2;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r7 >= r5) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(M0.r[] r14, long r15, long r17, h1.C1031B r19) {
        /*
            r13 = this;
            r0 = r13
            c1.p r1 = r0.s1
            long r1 = r1.f8810c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0020
            c1.p r1 = new c1.p
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r13.n0(r1)
            goto L_0x0063
        L_0x0020:
            java.util.ArrayDeque r1 = r0.f8864t0
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0055
            long r5 = r0.f8849k1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0038
            long r7 = r0.t1
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0055
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0055
        L_0x0038:
            c1.p r1 = new c1.p
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r15
            r10 = r17
            r5.<init>(r6, r8, r10)
            r13.n0(r1)
            c1.p r1 = r0.s1
            long r1 = r1.f8810c
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0063
            r13.c0()
            goto L_0x0063
        L_0x0055:
            c1.p r2 = new c1.p
            long r7 = r0.f8849k1
            r6 = r2
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r1.add(r2)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.q.t(M0.r[], long, long, h1.B):void");
    }

    public final void t0() {
        P p3 = this.f8870y0;
        p3.getClass();
        a x02 = p3.x0();
        if (x02 instanceof i) {
            try {
                MediaCrypto mediaCrypto = this.f8813A0;
                mediaCrypto.getClass();
                ((i) x02).getClass();
                mediaCrypto.setMediaDrmSession((byte[]) null);
            } catch (MediaCryptoException e) {
                throw f(e, this.f8867v0, false, 6006);
            }
        }
        m0(this.f8870y0);
        this.f8844f1 = 0;
        this.f8845g1 = 0;
    }

    public final void u0(long j7) {
        r rVar = (r) this.s1.f8811d.f(j7);
        if (rVar == null && this.f8866u1 && this.f8819G0 != null) {
            rVar = (r) this.s1.f8811d.e();
        }
        if (rVar != null) {
            this.f8868w0 = rVar;
        } else if (!this.f8820H0 || this.f8868w0 == null) {
            return;
        }
        r rVar2 = this.f8868w0;
        rVar2.getClass();
        Z(rVar2, this.f8819G0);
        this.f8820H0 = false;
        this.f8866u1 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078 A[Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }, LOOP:1: B:30:0x0053->B:40:0x0078, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0099 A[Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }, LOOP:2: B:41:0x0079->B:51:0x0099, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0079 A[EDGE_INSN: B:83:0x0079->B:87:0x0079 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x009a A[EDGE_INSN: B:85:0x009a->B:52:0x009a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(long r12, long r14) {
        /*
            r11 = this;
            boolean r0 = r11.f8858p1
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11.f8858p1 = r1
            r11.f0()
        L_0x000a:
            T0.l r0 = r11.f8860q1
            if (r0 != 0) goto L_0x010f
            r0 = 1
            boolean r2 = r11.f8855n1     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x001d
            r11.j0()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            return
        L_0x0017:
            r12 = move-exception
            goto L_0x00b9
        L_0x001a:
            r12 = move-exception
            goto L_0x0100
        L_0x001d:
            M0.r r2 = r11.f8867v0     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0029
            r2 = 2
            boolean r2 = r11.h0(r2)     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0029
            return
        L_0x0029:
            r11.T()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            boolean r2 = r11.f8839a1     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x0041
            java.lang.String r2 = "bypassRender"
            android.os.Trace.beginSection(r2)     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
        L_0x0035:
            boolean r2 = r11.B(r12, r14)     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x003c
            goto L_0x0035
        L_0x003c:
            android.os.Trace.endSection()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            goto L_0x00b4
        L_0x0041:
            c1.k r2 = r11.f8817E0     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x009e
            P0.t r2 = r11.f4804a0     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            java.lang.String r4 = "drainAndFeed"
            android.os.Trace.beginSection(r4)     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
        L_0x0053:
            boolean r4 = r11.G(r12, r14)     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0079
            long r7 = r11.f8814B0     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0075
            P0.t r4 = r11.f4804a0     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            r4.getClass()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            long r9 = r9 - r2
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r4 = 0
            goto L_0x0076
        L_0x0075:
            r4 = 1
        L_0x0076:
            if (r4 == 0) goto L_0x0079
            goto L_0x0053
        L_0x0079:
            boolean r12 = r11.H()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            if (r12 == 0) goto L_0x009a
            long r12 = r11.f8814B0     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0096
            P0.t r14 = r11.f4804a0     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            r14.getClass()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            long r14 = r14 - r2
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r12 = 0
            goto L_0x0097
        L_0x0096:
            r12 = 1
        L_0x0097:
            if (r12 == 0) goto L_0x009a
            goto L_0x0079
        L_0x009a:
            android.os.Trace.endSection()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            goto L_0x00b4
        L_0x009e:
            T0.f r14 = r11.f8862r1     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            int r15 = r14.f4821d     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            h1.Y r2 = r11.f4806c0     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            long r3 = r11.f4808e0     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            long r12 = r12 - r3
            int r12 = r2.o(r12)     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            int r15 = r15 + r12
            r14.f4821d = r15     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            r11.h0(r0)     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
        L_0x00b4:
            T0.f r12 = r11.f8862r1     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            monitor-enter(r12)     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            monitor-exit(r12)     // Catch:{ CryptoException -> 0x001a, IllegalStateException -> 0x0017 }
            return
        L_0x00b9:
            boolean r13 = r12 instanceof android.media.MediaCodec.CodecException
            if (r13 == 0) goto L_0x00be
            goto L_0x00d3
        L_0x00be:
            java.lang.StackTraceElement[] r14 = r12.getStackTrace()
            int r15 = r14.length
            if (r15 <= 0) goto L_0x00ff
            r14 = r14[r1]
            java.lang.String r14 = r14.getClassName()
            java.lang.String r15 = "android.media.MediaCodec"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00ff
        L_0x00d3:
            r11.V(r12)
            if (r13 == 0) goto L_0x00e2
            r13 = r12
            android.media.MediaCodec$CodecException r13 = (android.media.MediaCodec.CodecException) r13
            boolean r13 = r13.isRecoverable()
            if (r13 == 0) goto L_0x00e2
            r1 = 1
        L_0x00e2:
            if (r1 == 0) goto L_0x00e7
            r11.i0()
        L_0x00e7:
            c1.n r13 = r11.f8824L0
            c1.m r12 = r11.D(r12, r13)
            int r13 = r12.f8796U
            r14 = 1101(0x44d, float:1.543E-42)
            if (r13 != r14) goto L_0x00f6
            r13 = 4006(0xfa6, float:5.614E-42)
            goto L_0x00f8
        L_0x00f6:
            r13 = 4003(0xfa3, float:5.61E-42)
        L_0x00f8:
            M0.r r14 = r11.f8867v0
            T0.l r12 = r11.f(r12, r14, r1, r13)
            throw r12
        L_0x00ff:
            throw r12
        L_0x0100:
            M0.r r13 = r11.f8867v0
            int r14 = r12.getErrorCode()
            int r14 = P0.z.v(r14)
            T0.l r12 = r11.f(r12, r13, r1, r14)
            throw r12
        L_0x010f:
            r12 = 0
            r11.f8860q1 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.q.v(long, long):void");
    }

    public void y(float f8, float f9) {
        this.f8815C0 = f8;
        this.f8816D0 = f9;
        s0(this.f8818F0);
    }

    public final int z(r rVar) {
        try {
            return r0(this.f8852m0, rVar);
        } catch (s e) {
            throw f(e, rVar, false, 4002);
        }
    }
}
