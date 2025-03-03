package l7;

import D6.h;
import N.e;
import Q0.g;
import com.bumptech.glide.d;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import m7.C1218a;
import m7.C1219b;
import org.altbeacon.bluetooth.Pdu;
import u.C1477r;

public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: U  reason: collision with root package name */
    public r f13215U;

    /* renamed from: V  reason: collision with root package name */
    public long f13216V;

    public final void A(long j7) {
        if (j7 == 0) {
            z(48);
            return;
        }
        long j8 = (j7 >>> 1) | j7;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        r v4 = v(i);
        int i8 = v4.f13241c;
        for (int i9 = (i8 + i) - 1; i9 >= i8; i9--) {
            v4.f13239a[i9] = C1218a.f13388a[(int) (15 & j7)];
            j7 >>>= 4;
        }
        v4.f13241c += i;
        this.f13216V += (long) i;
    }

    public final void B(int i) {
        r v4 = v(4);
        int i8 = v4.f13241c;
        byte[] bArr = v4.f13239a;
        bArr[i8] = (byte) ((i >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i & 255);
        v4.f13241c = i8 + 4;
        this.f13216V += 4;
    }

    public final void C(int i, int i8, String str) {
        char c8;
        char charAt;
        P6.f.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(g.m(i, "beginIndex < 0: ").toString());
        } else if (i8 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i).toString());
        } else if (i8 <= str.length()) {
            while (i < i8) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    r v4 = v(1);
                    int i9 = v4.f13241c - i;
                    int min = Math.min(i8, 8192 - i9);
                    int i10 = i + 1;
                    byte[] bArr = v4.f13239a;
                    bArr[i + i9] = (byte) charAt2;
                    while (true) {
                        i = i10;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i11 = v4.f13241c;
                            int i12 = (i9 + i) - i11;
                            v4.f13241c = i11 + i12;
                            this.f13216V += (long) i12;
                        } else {
                            i10 = i + 1;
                            bArr[i + i9] = (byte) charAt;
                        }
                    }
                    int i112 = v4.f13241c;
                    int i122 = (i9 + i) - i112;
                    v4.f13241c = i112 + i122;
                    this.f13216V += (long) i122;
                } else {
                    if (charAt2 < 2048) {
                        r v8 = v(2);
                        int i13 = v8.f13241c;
                        byte[] bArr2 = v8.f13239a;
                        bArr2[i13] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                        v8.f13241c = i13 + 2;
                        this.f13216V += 2;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        r v9 = v(3);
                        int i14 = v9.f13241c;
                        byte[] bArr3 = v9.f13239a;
                        bArr3[i14] = (byte) ((charAt2 >> 12) | 224);
                        bArr3[i14 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i14 + 2] = (byte) ((charAt2 & '?') | 128);
                        v9.f13241c = i14 + 3;
                        this.f13216V += 3;
                    } else {
                        int i15 = i + 1;
                        if (i15 < i8) {
                            c8 = str.charAt(i15);
                        } else {
                            c8 = 0;
                        }
                        if (charAt2 > 56319 || 56320 > c8 || c8 >= 57344) {
                            z(63);
                            i = i15;
                        } else {
                            int i16 = (((charAt2 & 1023) << 10) | (c8 & 1023)) + 0;
                            r v10 = v(4);
                            int i17 = v10.f13241c;
                            byte[] bArr4 = v10.f13239a;
                            bArr4[i17] = (byte) ((i16 >> 18) | 240);
                            bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                            bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                            bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                            v10.f13241c = i17 + 4;
                            this.f13216V += 4;
                            i += 2;
                        }
                    }
                    i++;
                }
            }
        } else {
            StringBuilder p3 = g.p(i8, "endIndex > string.length: ", " > ");
            p3.append(str.length());
            throw new IllegalArgumentException(p3.toString().toString());
        }
    }

    public final void D(String str) {
        P6.f.e(str, "string");
        C(0, str.length(), str);
    }

    public final void E(int i) {
        String str;
        int i8 = i;
        int i9 = 0;
        if (i8 < 128) {
            z(i);
        } else if (i8 < 2048) {
            r v4 = v(2);
            int i10 = v4.f13241c;
            byte[] bArr = v4.f13239a;
            bArr[i10] = (byte) ((i8 >> 6) | 192);
            bArr[1 + i10] = (byte) ((i8 & 63) | 128);
            v4.f13241c = i10 + 2;
            this.f13216V += 2;
        } else if (55296 <= i8 && i8 < 57344) {
            z(63);
        } else if (i8 < 65536) {
            r v8 = v(3);
            int i11 = v8.f13241c;
            byte[] bArr2 = v8.f13239a;
            bArr2[i11] = (byte) ((i8 >> 12) | 224);
            bArr2[1 + i11] = (byte) (((i8 >> 6) & 63) | 128);
            bArr2[2 + i11] = (byte) ((i8 & 63) | 128);
            v8.f13241c = i11 + 3;
            this.f13216V += 3;
        } else if (i8 <= 1114111) {
            r v9 = v(4);
            int i12 = v9.f13241c;
            byte[] bArr3 = v9.f13239a;
            bArr3[i12] = (byte) ((i8 >> 18) | 240);
            bArr3[1 + i12] = (byte) (((i8 >> 12) & 63) | 128);
            bArr3[2 + i12] = (byte) (((i8 >> 6) & 63) | 128);
            bArr3[3 + i12] = (byte) ((i8 & 63) | 128);
            v9.f13241c = i12 + 4;
            this.f13216V += 4;
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
            if (i8 != 0) {
                char[] cArr = C1219b.f13389a;
                char[] cArr2 = {cArr[(i8 >> 28) & 15], cArr[(i8 >> 24) & 15], cArr[(i8 >> 20) & 15], cArr[(i8 >> 16) & 15], cArr[(i8 >> 12) & 15], cArr[(i8 >> 8) & 15], cArr[(i8 >> 4) & 15], cArr[i8 & 15]};
                while (i9 < 8 && cArr2[i9] == '0') {
                    i9++;
                }
                if (i9 < 0) {
                    throw new IndexOutOfBoundsException(C1477r.c(i9, "startIndex: ", ", endIndex: 8, size: 8"));
                } else if (i9 <= 8) {
                    str = new String(cArr2, i9, 8 - i9);
                } else {
                    throw new IllegalArgumentException(C1477r.c(i9, "startIndex: ", " > endIndex: 8"));
                }
            } else {
                str = "0";
            }
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final y a() {
        return y.f13251d;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [l7.f, java.lang.Object] */
    public final Object clone() {
        ? obj = new Object();
        if (this.f13216V != 0) {
            r rVar = this.f13215U;
            P6.f.b(rVar);
            r c8 = rVar.c();
            obj.f13215U = c8;
            c8.f13244g = c8;
            c8.f13243f = c8;
            for (r rVar2 = rVar.f13243f; rVar2 != rVar; rVar2 = rVar2.f13243f) {
                r rVar3 = c8.f13244g;
                P6.f.b(rVar3);
                P6.f.b(rVar2);
                rVar3.b(rVar2.c());
            }
            obj.f13216V = this.f13216V;
        }
        return obj;
    }

    public final void close() {
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L_0x0009
        L_0x0006:
            r2 = 1
            goto L_0x0078
        L_0x0009:
            boolean r3 = r1 instanceof l7.f
            if (r3 != 0) goto L_0x0010
        L_0x000d:
            r2 = 0
            goto L_0x0078
        L_0x0010:
            long r5 = r0.f13216V
            l7.f r1 = (l7.f) r1
            long r7 = r1.f13216V
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            goto L_0x000d
        L_0x001b:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            goto L_0x0006
        L_0x0022:
            l7.r r3 = r0.f13215U
            P6.f.b(r3)
            l7.r r1 = r1.f13215U
            P6.f.b(r1)
            int r5 = r3.f13240b
            int r6 = r1.f13240b
            r9 = r7
        L_0x0031:
            long r11 = r0.f13216V
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0006
            int r11 = r3.f13241c
            int r11 = r11 - r5
            int r12 = r1.f13241c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x0043:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x005d
            int r15 = r5 + 1
            byte[] r2 = r3.f13239a
            byte r2 = r2[r5]
            int r5 = r6 + 1
            byte[] r4 = r1.f13239a
            byte r4 = r4[r6]
            if (r2 == r4) goto L_0x0056
            goto L_0x000d
        L_0x0056:
            r16 = 1
            long r13 = r13 + r16
            r6 = r5
            r5 = r15
            goto L_0x0043
        L_0x005d:
            int r2 = r3.f13241c
            if (r5 != r2) goto L_0x006a
            l7.r r2 = r3.f13243f
            P6.f.b(r2)
            int r3 = r2.f13240b
            r5 = r3
            r3 = r2
        L_0x006a:
            int r2 = r1.f13241c
            if (r6 != r2) goto L_0x0076
            l7.r r1 = r1.f13243f
            P6.f.b(r1)
            int r2 = r1.f13240b
            r6 = r2
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0031
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.f.equals(java.lang.Object):boolean");
    }

    public final long f(f fVar, long j7) {
        P6.f.e(fVar, "sink");
        if (j7 >= 0) {
            long j8 = this.f13216V;
            if (j8 == 0) {
                return -1;
            }
            if (j7 > j8) {
                j7 = j8;
            }
            fVar.h(this, j7);
            return j7;
        }
        throw new IllegalArgumentException(e.w("byteCount < 0: ", j7).toString());
    }

    public final void flush() {
    }

    public final void h(f fVar, long j7) {
        r rVar;
        r rVar2;
        int i;
        P6.f.e(fVar, "source");
        if (fVar != this) {
            d.c(fVar.f13216V, 0, j7);
            while (j7 > 0) {
                r rVar3 = fVar.f13215U;
                P6.f.b(rVar3);
                int i8 = rVar3.f13241c;
                r rVar4 = fVar.f13215U;
                P6.f.b(rVar4);
                int i9 = 0;
                if (j7 < ((long) (i8 - rVar4.f13240b))) {
                    r rVar5 = this.f13215U;
                    if (rVar5 != null) {
                        rVar = rVar5.f13244g;
                    } else {
                        rVar = null;
                    }
                    if (rVar != null && rVar.e) {
                        long j8 = ((long) rVar.f13241c) + j7;
                        if (rVar.f13242d) {
                            i = 0;
                        } else {
                            i = rVar.f13240b;
                        }
                        if (j8 - ((long) i) <= 8192) {
                            r rVar6 = fVar.f13215U;
                            P6.f.b(rVar6);
                            rVar6.d(rVar, (int) j7);
                            fVar.f13216V -= j7;
                            this.f13216V += j7;
                            return;
                        }
                    }
                    r rVar7 = fVar.f13215U;
                    P6.f.b(rVar7);
                    int i10 = (int) j7;
                    if (i10 <= 0 || i10 > rVar7.f13241c - rVar7.f13240b) {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                    if (i10 >= 1024) {
                        rVar2 = rVar7.c();
                    } else {
                        rVar2 = s.b();
                        int i11 = rVar7.f13240b;
                        h.D(rVar7.f13239a, 0, rVar2.f13239a, i11, i11 + i10);
                    }
                    rVar2.f13241c = rVar2.f13240b + i10;
                    rVar7.f13240b += i10;
                    r rVar8 = rVar7.f13244g;
                    P6.f.b(rVar8);
                    rVar8.b(rVar2);
                    fVar.f13215U = rVar2;
                }
                r rVar9 = fVar.f13215U;
                P6.f.b(rVar9);
                long j9 = (long) (rVar9.f13241c - rVar9.f13240b);
                fVar.f13215U = rVar9.a();
                r rVar10 = this.f13215U;
                if (rVar10 == null) {
                    this.f13215U = rVar9;
                    rVar9.f13244g = rVar9;
                    rVar9.f13243f = rVar9;
                } else {
                    r rVar11 = rVar10.f13244g;
                    P6.f.b(rVar11);
                    rVar11.b(rVar9);
                    r rVar12 = rVar9.f13244g;
                    if (rVar12 != rVar9) {
                        P6.f.b(rVar12);
                        if (rVar12.e) {
                            int i12 = rVar9.f13241c - rVar9.f13240b;
                            r rVar13 = rVar9.f13244g;
                            P6.f.b(rVar13);
                            int i13 = 8192 - rVar13.f13241c;
                            r rVar14 = rVar9.f13244g;
                            P6.f.b(rVar14);
                            if (!rVar14.f13242d) {
                                r rVar15 = rVar9.f13244g;
                                P6.f.b(rVar15);
                                i9 = rVar15.f13240b;
                            }
                            if (i12 <= i13 + i9) {
                                r rVar16 = rVar9.f13244g;
                                P6.f.b(rVar16);
                                rVar9.d(rVar16, i12);
                                rVar9.a();
                                s.a(rVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                fVar.f13216V -= j9;
                this.f13216V += j9;
                j7 -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final int hashCode() {
        r rVar = this.f13215U;
        if (rVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i8 = rVar.f13241c;
            for (int i9 = rVar.f13240b; i9 < i8; i9++) {
                i = (i * 31) + rVar.f13239a[i9];
            }
            rVar = rVar.f13243f;
            P6.f.b(rVar);
        } while (rVar != this.f13215U);
        return i;
    }

    public final /* bridge */ /* synthetic */ g i(String str) {
        D(str);
        return this;
    }

    public final boolean isOpen() {
        return true;
    }

    public final InputStream j() {
        return new e(this);
    }

    public final boolean k() {
        if (this.f13216V == 0) {
            return true;
        }
        return false;
    }

    public final byte l(long j7) {
        d.c(this.f13216V, j7, 1);
        r rVar = this.f13215U;
        if (rVar != null) {
            long j8 = this.f13216V;
            if (j8 - j7 < j7) {
                while (j8 > j7) {
                    rVar = rVar.f13244g;
                    P6.f.b(rVar);
                    j8 -= (long) (rVar.f13241c - rVar.f13240b);
                }
                return rVar.f13239a[(int) ((((long) rVar.f13240b) + j7) - j8)];
            }
            long j9 = 0;
            while (true) {
                int i = rVar.f13241c;
                int i8 = rVar.f13240b;
                long j10 = ((long) (i - i8)) + j9;
                if (j10 <= j7) {
                    rVar = rVar.f13243f;
                    P6.f.b(rVar);
                    j9 = j10;
                } else {
                    return rVar.f13239a[(int) ((((long) i8) + j7) - j9)];
                }
            }
        } else {
            P6.f.b((Object) null);
            throw null;
        }
    }

    public final int m(byte[] bArr, int i, int i8) {
        P6.f.e(bArr, "sink");
        d.c((long) bArr.length, (long) i, (long) i8);
        r rVar = this.f13215U;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(i8, rVar.f13241c - rVar.f13240b);
        int i9 = rVar.f13240b;
        h.D(rVar.f13239a, i, bArr, i9, i9 + min);
        int i10 = rVar.f13240b + min;
        rVar.f13240b = i10;
        this.f13216V -= (long) min;
        if (i10 == rVar.f13241c) {
            this.f13215U = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    public final byte n() {
        if (this.f13216V != 0) {
            r rVar = this.f13215U;
            P6.f.b(rVar);
            int i = rVar.f13240b;
            int i8 = rVar.f13241c;
            int i9 = i + 1;
            byte b8 = rVar.f13239a[i];
            this.f13216V--;
            if (i9 == i8) {
                this.f13215U = rVar.a();
                s.a(rVar);
            } else {
                rVar.f13240b = i9;
            }
            return b8;
        }
        throw new EOFException();
    }

    public final byte[] o(long j7) {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(e.w("byteCount: ", j7).toString());
        } else if (this.f13216V >= j7) {
            int i = (int) j7;
            byte[] bArr = new byte[i];
            int i8 = 0;
            while (i8 < i) {
                int m8 = m(bArr, i8, i - i8);
                if (m8 != -1) {
                    i8 += m8;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final i p(long j7) {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(e.w("byteCount: ", j7).toString());
        } else if (this.f13216V < j7) {
            throw new EOFException();
        } else if (j7 < 4096) {
            return new i(o(j7));
        } else {
            i u3 = u((int) j7);
            t(j7);
            return u3;
        }
    }

    public final int q() {
        if (this.f13216V >= 4) {
            r rVar = this.f13215U;
            P6.f.b(rVar);
            int i = rVar.f13240b;
            int i8 = rVar.f13241c;
            if (((long) (i8 - i)) < 4) {
                return ((n() & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24) | ((n() & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((n() & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (n() & Pdu.MANUFACTURER_DATA_PDU_TYPE);
            }
            byte[] bArr = rVar.f13239a;
            byte b8 = ((bArr[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24);
            int i9 = i + 3;
            int i10 = i + 4;
            byte b9 = b8 | ((bArr[i + 2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (bArr[i9] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
            this.f13216V -= 4;
            if (i10 == i8) {
                this.f13215U = rVar.a();
                s.a(rVar);
            } else {
                rVar.f13240b = i10;
            }
            return b9;
        }
        throw new EOFException();
    }

    public final short r() {
        if (this.f13216V >= 2) {
            r rVar = this.f13215U;
            P6.f.b(rVar);
            int i = rVar.f13240b;
            int i8 = rVar.f13241c;
            if (i8 - i < 2) {
                return (short) (((n() & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (n() & Pdu.MANUFACTURER_DATA_PDU_TYPE));
            }
            int i9 = i + 1;
            byte[] bArr = rVar.f13239a;
            int i10 = i + 2;
            byte b8 = (bArr[i9] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
            this.f13216V -= 2;
            if (i10 == i8) {
                this.f13215U = rVar.a();
                s.a(rVar);
            } else {
                rVar.f13240b = i10;
            }
            return (short) b8;
        }
        throw new EOFException();
    }

    public final int read(ByteBuffer byteBuffer) {
        P6.f.e(byteBuffer, "sink");
        r rVar = this.f13215U;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rVar.f13241c - rVar.f13240b);
        byteBuffer.put(rVar.f13239a, rVar.f13240b, min);
        int i = rVar.f13240b + min;
        rVar.f13240b = i;
        this.f13216V -= (long) min;
        if (i == rVar.f13241c) {
            this.f13215U = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    public final String s(long j7, Charset charset) {
        P6.f.e(charset, "charset");
        int i = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
        if (i < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(e.w("byteCount: ", j7).toString());
        } else if (this.f13216V < j7) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            r rVar = this.f13215U;
            P6.f.b(rVar);
            int i8 = rVar.f13240b;
            if (((long) i8) + j7 > ((long) rVar.f13241c)) {
                return new String(o(j7), charset);
            }
            int i9 = (int) j7;
            String str = new String(rVar.f13239a, i8, i9, charset);
            int i10 = rVar.f13240b + i9;
            rVar.f13240b = i10;
            this.f13216V -= j7;
            if (i10 == rVar.f13241c) {
                this.f13215U = rVar.a();
                s.a(rVar);
            }
            return str;
        }
    }

    public final void t(long j7) {
        while (j7 > 0) {
            r rVar = this.f13215U;
            if (rVar != null) {
                int min = (int) Math.min(j7, (long) (rVar.f13241c - rVar.f13240b));
                long j8 = (long) min;
                this.f13216V -= j8;
                j7 -= j8;
                int i = rVar.f13240b + min;
                rVar.f13240b = i;
                if (i == rVar.f13241c) {
                    this.f13215U = rVar.a();
                    s.a(rVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final String toString() {
        long j7 = this.f13216V;
        if (j7 <= 2147483647L) {
            return u((int) j7).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f13216V).toString());
    }

    public final i u(int i) {
        if (i == 0) {
            return i.f13217X;
        }
        d.c(this.f13216V, 0, (long) i);
        r rVar = this.f13215U;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            P6.f.b(rVar);
            int i11 = rVar.f13241c;
            int i12 = rVar.f13240b;
            if (i11 != i12) {
                i9 += i11 - i12;
                i10++;
                rVar = rVar.f13243f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[(i10 * 2)];
        r rVar2 = this.f13215U;
        int i13 = 0;
        while (i8 < i) {
            P6.f.b(rVar2);
            bArr[i13] = rVar2.f13239a;
            i8 += rVar2.f13241c - rVar2.f13240b;
            iArr[i13] = Math.min(i8, i);
            iArr[i13 + i10] = rVar2.f13240b;
            rVar2.f13242d = true;
            i13++;
            rVar2 = rVar2.f13243f;
        }
        return new t(bArr, iArr);
    }

    public final r v(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        r rVar = this.f13215U;
        if (rVar == null) {
            r b8 = s.b();
            this.f13215U = b8;
            b8.f13244g = b8;
            b8.f13243f = b8;
            return b8;
        }
        r rVar2 = rVar.f13244g;
        P6.f.b(rVar2);
        if (rVar2.f13241c + i <= 8192 && rVar2.e) {
            return rVar2;
        }
        r b9 = s.b();
        rVar2.b(b9);
        return b9;
    }

    public final void w(i iVar) {
        P6.f.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final int write(ByteBuffer byteBuffer) {
        P6.f.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            r v4 = v(1);
            int min = Math.min(i, 8192 - v4.f13241c);
            byteBuffer.get(v4.f13239a, v4.f13241c, min);
            i -= min;
            v4.f13241c += min;
        }
        this.f13216V += (long) remaining;
        return remaining;
    }

    public final void x(byte[] bArr, int i, int i8) {
        P6.f.e(bArr, "source");
        long j7 = (long) i8;
        d.c((long) bArr.length, (long) i, j7);
        int i9 = i8 + i;
        while (i < i9) {
            r v4 = v(1);
            int min = Math.min(i9 - i, 8192 - v4.f13241c);
            int i10 = i + min;
            h.D(bArr, v4.f13241c, v4.f13239a, i, i10);
            v4.f13241c += min;
            i = i10;
        }
        this.f13216V += j7;
    }

    public final void y(w wVar) {
        do {
        } while (wVar.f(this, 8192) != -1);
    }

    public final void z(int i) {
        r v4 = v(1);
        int i8 = v4.f13241c;
        v4.f13241c = i8 + 1;
        v4.f13239a[i8] = (byte) i;
        this.f13216V++;
    }
}
