package l7;

import N.e;
import P6.f;
import com.bumptech.glide.d;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import m7.C1218a;

public final class q implements h {

    /* renamed from: U  reason: collision with root package name */
    public final w f13236U;

    /* renamed from: V  reason: collision with root package name */
    public final f f13237V = new Object();

    /* renamed from: W  reason: collision with root package name */
    public boolean f13238W;

    /* JADX WARNING: type inference failed for: r2v1, types: [l7.f, java.lang.Object] */
    public q(w wVar) {
        f.e(wVar, "source");
        this.f13236U = wVar;
    }

    public final y a() {
        return this.f13236U.a();
    }

    public final void close() {
        if (!this.f13238W) {
            this.f13238W = true;
            this.f13236U.close();
            f fVar = this.f13237V;
            fVar.t(fVar.f13216V);
        }
    }

    public final long f(f fVar, long j7) {
        f.e(fVar, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(e.w("byteCount < 0: ", j7).toString());
        } else if (!this.f13238W) {
            f fVar2 = this.f13237V;
            if (fVar2.f13216V == 0 && this.f13236U.f(fVar2, 8192) == -1) {
                return -1;
            }
            return fVar2.f(fVar, Math.min(j7, fVar2.f13216V));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final boolean isOpen() {
        return !this.f13238W;
    }

    public final InputStream j() {
        return new p(this);
    }

    public final boolean k() {
        if (!this.f13238W) {
            f fVar = this.f13237V;
            if (!fVar.k() || this.f13236U.f(fVar, 8192) != -1) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0136, code lost:
        throw new java.lang.IllegalArgumentException(("size=" + r8.f13216V + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l(byte r22, long r23, long r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r25
            boolean r4 = r0.f13238W
            if (r4 != 0) goto L_0x014c
            r4 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x013b
        L_0x0010:
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x0137
            l7.f r8 = r0.f13237V
            r8.getClass()
            r9 = 0
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x010b
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 > 0) goto L_0x010b
            long r11 = r8.f13216V
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x002b
            r13 = r11
            goto L_0x002c
        L_0x002b:
            r13 = r2
        L_0x002c:
            int r17 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r17 != 0) goto L_0x0038
        L_0x0030:
            r19 = r4
        L_0x0032:
            r2 = -1
            r15 = -1
            goto L_0x00e5
        L_0x0038:
            l7.r r9 = r8.f13215U
            if (r9 != 0) goto L_0x003d
            goto L_0x0030
        L_0x003d:
            long r17 = r11 - r4
            int r10 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0096
        L_0x0043:
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0054
            l7.r r9 = r9.f13244g
            P6.f.b(r9)
            int r10 = r9.f13241c
            int r15 = r9.f13240b
            int r10 = r10 - r15
            long r6 = (long) r10
            long r11 = r11 - r6
            goto L_0x0043
        L_0x0054:
            r6 = r4
        L_0x0055:
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x0030
            int r10 = r9.f13241c
            long r2 = (long) r10
            int r10 = r9.f13240b
            r19 = r4
            long r4 = (long) r10
            long r4 = r4 + r13
            long r4 = r4 - r11
            long r2 = java.lang.Math.min(r2, r4)
            int r3 = (int) r2
            int r2 = r9.f13240b
            long r4 = (long) r2
            long r4 = r4 + r6
            long r4 = r4 - r11
            int r2 = (int) r4
        L_0x006e:
            if (r2 >= r3) goto L_0x0083
            byte[] r4 = r9.f13239a
            byte r4 = r4[r2]
            if (r4 != r1) goto L_0x0080
            int r3 = r9.f13240b
            int r2 = r2 - r3
            long r2 = (long) r2
            long r2 = r2 + r11
        L_0x007b:
            r15 = r2
            r2 = -1
            goto L_0x00e5
        L_0x0080:
            int r2 = r2 + 1
            goto L_0x006e
        L_0x0083:
            int r2 = r9.f13241c
            int r3 = r9.f13240b
            int r2 = r2 - r3
            long r2 = (long) r2
            long r6 = r11 + r2
            l7.r r9 = r9.f13243f
            P6.f.b(r9)
            r2 = r25
            r11 = r6
            r4 = r19
            goto L_0x0055
        L_0x0096:
            r19 = r4
            r2 = r9
            r9 = 0
        L_0x009b:
            int r3 = r2.f13241c
            int r4 = r2.f13240b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r9
            int r5 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r5 > 0) goto L_0x00ad
            l7.r r2 = r2.f13243f
            P6.f.b(r2)
            r9 = r3
            goto L_0x009b
        L_0x00ad:
            r3 = r19
        L_0x00af:
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0032
            int r5 = r2.f13241c
            long r5 = (long) r5
            int r7 = r2.f13240b
            long r11 = (long) r7
            long r11 = r11 + r13
            long r11 = r11 - r9
            long r5 = java.lang.Math.min(r5, r11)
            int r6 = (int) r5
            int r5 = r2.f13240b
            long r11 = (long) r5
            long r11 = r11 + r3
            long r11 = r11 - r9
            int r3 = (int) r11
        L_0x00c6:
            if (r3 >= r6) goto L_0x00d7
            byte[] r4 = r2.f13239a
            byte r4 = r4[r3]
            if (r4 != r1) goto L_0x00d4
            int r2 = r2.f13240b
            int r3 = r3 - r2
            long r2 = (long) r3
            long r2 = r2 + r9
            goto L_0x007b
        L_0x00d4:
            int r3 = r3 + 1
            goto L_0x00c6
        L_0x00d7:
            int r3 = r2.f13241c
            int r4 = r2.f13240b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r9
            l7.r r2 = r2.f13243f
            P6.f.b(r2)
            r9 = r3
            goto L_0x00af
        L_0x00e5:
            int r4 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00eb
            r6 = r15
            goto L_0x013a
        L_0x00eb:
            long r4 = r8.f13216V
            r6 = r25
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0109
            l7.w r9 = r0.f13236U
            r10 = 8192(0x2000, double:4.0474E-320)
            long r8 = r9.f(r8, r10)
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0100
            goto L_0x0109
        L_0x0100:
            r9 = r19
            long r4 = java.lang.Math.max(r9, r4)
            r2 = r6
            goto L_0x0010
        L_0x0109:
            r6 = r2
            goto L_0x013a
        L_0x010b:
            r6 = r2
            r9 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "size="
            r1.<init>(r2)
            long r2 = r8.f13216V
            r1.append(r2)
            java.lang.String r2 = " fromIndex="
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = " toIndex="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0137:
            r2 = -1
            goto L_0x0109
        L_0x013a:
            return r6
        L_0x013b:
            r6 = r2
            java.lang.String r1 = "fromIndex=0 toIndex="
            java.lang.String r1 = N.e.w(r1, r6)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x014c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.q.l(byte, long, long):long");
    }

    public final byte m() {
        u(1);
        return this.f13237V.n();
    }

    public final i n(long j7) {
        u(j7);
        return this.f13237V.p(j7);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [l7.f, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        if (r12 == 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cd, code lost:
        r3 = m7.C1219b.f13389a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new java.lang.String(new char[]{r3[(r11 >> 4) & 15], r3[r11 & 15]})));
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long o() {
        /*
            r24 = this;
            r0 = r24
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r3 = 70
            r4 = 65
            r5 = 102(0x66, float:1.43E-43)
            r6 = 97
            r7 = 57
            r8 = 48
            r9 = 1
            r10 = 1
            r0.u(r10)
            r11 = 0
        L_0x0017:
            int r12 = r11 + 1
            long r13 = (long) r12
            boolean r13 = r0.t(r13)
            l7.f r14 = r0.f13237V
            if (r13 == 0) goto L_0x0055
            long r9 = (long) r11
            byte r9 = r14.l(r9)
            if (r9 < r8) goto L_0x002b
            if (r9 <= r7) goto L_0x0034
        L_0x002b:
            if (r9 < r6) goto L_0x002f
            if (r9 <= r5) goto L_0x0034
        L_0x002f:
            if (r9 < r4) goto L_0x0037
            if (r9 <= r3) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            r11 = r12
            r9 = 1
            goto L_0x0017
        L_0x0037:
            if (r11 == 0) goto L_0x003a
            goto L_0x0055
        L_0x003a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r3 = 16
            R.e.a(r3)
            R.e.a(r3)
            java.lang.String r3 = java.lang.Integer.toString(r9, r3)
            java.lang.String r4 = "toString(this, checkRadix(radix))"
            P6.f.d(r3, r4)
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x0055:
            long r9 = r14.f13216V
            r11 = 0
            int r16 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r16 == 0) goto L_0x011e
            r9 = r11
            r16 = 0
            r17 = 0
        L_0x0062:
            l7.r r13 = r14.f13215U
            P6.f.b(r13)
            int r15 = r13.f13240b
            int r1 = r13.f13241c
            r19 = r16
        L_0x006d:
            if (r15 >= r1) goto L_0x00f4
            byte[] r11 = r13.f13239a
            byte r11 = r11[r15]
            if (r11 < r8) goto L_0x007a
            if (r11 > r7) goto L_0x007a
            int r12 = r11 + -48
            goto L_0x0087
        L_0x007a:
            if (r11 < r6) goto L_0x0081
            if (r11 > r5) goto L_0x0081
            int r12 = r11 + -87
            goto L_0x0087
        L_0x0081:
            if (r11 < r4) goto L_0x00bf
            if (r11 > r3) goto L_0x00bf
            int r12 = r11 + -55
        L_0x0087:
            r22 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r22 = r9 & r22
            r20 = 0
            int r16 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r16 != 0) goto L_0x00a0
            r16 = 4
            long r9 = r9 << r16
            long r11 = (long) r12
            long r9 = r9 | r11
            r11 = 1
            int r15 = r15 + r11
            r12 = r19
            int r19 = r12 + 1
            r11 = r20
            goto L_0x006d
        L_0x00a0:
            l7.f r1 = new l7.f
            r1.<init>()
            r1.A(r9)
            r1.z(r11)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            long r3 = r1.f13216V
            java.nio.charset.Charset r5 = W6.a.f6191a
            java.lang.String r1 = r1.s(r3, r5)
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x00bf:
            r12 = r19
            r20 = 0
            if (r12 == 0) goto L_0x00cd
            r11 = 0
            r16 = 1
            r17 = 1
        L_0x00ca:
            r18 = 4
            goto L_0x00fc
        L_0x00cd:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            char[] r3 = m7.C1219b.f13389a
            r18 = 4
            int r4 = r11 >> 4
            r4 = r4 & 15
            char r4 = r3[r4]
            r5 = r11 & 15
            char r3 = r3[r5]
            r5 = 2
            char[] r5 = new char[r5]
            r11 = 0
            r5[r11] = r4
            r16 = 1
            r5[r16] = r3
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x00f4:
            r20 = r11
            r12 = r19
            r11 = 0
            r16 = 1
            goto L_0x00ca
        L_0x00fc:
            if (r15 != r1) goto L_0x0108
            l7.r r1 = r13.a()
            r14.f13215U = r1
            l7.s.a(r13)
            goto L_0x010a
        L_0x0108:
            r13.f13240b = r15
        L_0x010a:
            if (r17 != 0) goto L_0x0117
            l7.r r1 = r14.f13215U
            if (r1 != 0) goto L_0x0111
            goto L_0x0117
        L_0x0111:
            r16 = r12
            r11 = r20
            goto L_0x0062
        L_0x0117:
            long r1 = r14.f13216V
            long r3 = (long) r12
            long r1 = r1 - r3
            r14.f13216V = r1
            return r9
        L_0x011e:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.q.o():long");
    }

    public final int p() {
        u(4);
        return this.f13237V.q();
    }

    public final int q() {
        u(4);
        int q7 = this.f13237V.q();
        return ((q7 & 255) << 24) | ((-16777216 & q7) >>> 24) | ((16711680 & q7) >>> 8) | ((65280 & q7) << 8);
    }

    public final short r() {
        u(2);
        return this.f13237V.r();
    }

    public final int read(ByteBuffer byteBuffer) {
        f.e(byteBuffer, "sink");
        f fVar = this.f13237V;
        if (fVar.f13216V == 0 && this.f13236U.f(fVar, 8192) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [l7.f, java.lang.Object] */
    public final String s(long j7) {
        long j8;
        long j9 = j7;
        if (j9 >= 0) {
            if (j9 == Long.MAX_VALUE) {
                j8 = Long.MAX_VALUE;
            } else {
                j8 = j9 + 1;
            }
            long l8 = l((byte) 10, 0, j8);
            f fVar = this.f13237V;
            if (l8 != -1) {
                return C1218a.a(fVar, l8);
            }
            if (j8 < Long.MAX_VALUE && t(j8) && fVar.l(j8 - 1) == 13 && t(1 + j8) && fVar.l(j8) == 10) {
                return C1218a.a(fVar, j8);
            }
            ? obj = new Object();
            long min = Math.min((long) 32, fVar.f13216V);
            long j10 = 0;
            fVar.getClass();
            f.e(obj, "out");
            d.c(fVar.f13216V, 0, min);
            if (min != 0) {
                obj.f13216V += min;
                r rVar = fVar.f13215U;
                while (true) {
                    f.b(rVar);
                    long j11 = (long) (rVar.f13241c - rVar.f13240b);
                    if (j10 < j11) {
                        break;
                    }
                    j10 -= j11;
                    rVar = rVar.f13243f;
                }
                while (min > 0) {
                    f.b(rVar);
                    r c8 = rVar.c();
                    int i = c8.f13240b + ((int) j10);
                    c8.f13240b = i;
                    c8.f13241c = Math.min(i + ((int) min), c8.f13241c);
                    r rVar2 = obj.f13215U;
                    if (rVar2 == null) {
                        c8.f13244g = c8;
                        c8.f13243f = c8;
                        obj.f13215U = c8;
                    } else {
                        r rVar3 = rVar2.f13244g;
                        f.b(rVar3);
                        rVar3.b(c8);
                    }
                    min -= (long) (c8.f13241c - c8.f13240b);
                    rVar = rVar.f13243f;
                    j10 = 0;
                }
            }
            throw new EOFException("\\n not found: limit=" + Math.min(fVar.f13216V, j9) + " content=" + obj.p(obj.f13216V).b() + 8230);
        }
        throw new IllegalArgumentException(e.w("limit < 0: ", j9).toString());
    }

    public final boolean t(long j7) {
        f fVar;
        if (j7 < 0) {
            throw new IllegalArgumentException(e.w("byteCount < 0: ", j7).toString());
        } else if (!this.f13238W) {
            do {
                fVar = this.f13237V;
                if (fVar.f13216V >= j7) {
                    return true;
                }
            } while (this.f13236U.f(fVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final String toString() {
        return "buffer(" + this.f13236U + ')';
    }

    public final void u(long j7) {
        if (!t(j7)) {
            throw new EOFException();
        }
    }

    public final void v(long j7) {
        if (!this.f13238W) {
            while (j7 > 0) {
                f fVar = this.f13237V;
                if (fVar.f13216V == 0 && this.f13236U.f(fVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j7, fVar.f13216V);
                fVar.t(min);
                j7 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
}
