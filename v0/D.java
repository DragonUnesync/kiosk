package V0;

import N0.b;
import N0.c;
import N0.e;
import P0.l;
import P0.z;
import java.nio.ByteBuffer;
import org.altbeacon.bluetooth.Pdu;

public final class D extends e {
    public final float i = 0.2f;

    /* renamed from: j  reason: collision with root package name */
    public final short f5489j = 1024;

    /* renamed from: k  reason: collision with root package name */
    public final int f5490k = 10;

    /* renamed from: l  reason: collision with root package name */
    public final long f5491l = 100000;

    /* renamed from: m  reason: collision with root package name */
    public final long f5492m = 2000000;

    /* renamed from: n  reason: collision with root package name */
    public int f5493n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5494o;

    /* renamed from: p  reason: collision with root package name */
    public int f5495p;

    /* renamed from: q  reason: collision with root package name */
    public long f5496q;

    /* renamed from: r  reason: collision with root package name */
    public int f5497r = 0;

    /* renamed from: s  reason: collision with root package name */
    public byte[] f5498s;

    /* renamed from: t  reason: collision with root package name */
    public int f5499t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f5500u = 0;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f5501v;

    public D() {
        byte[] bArr = z.f3752f;
        this.f5498s = bArr;
        this.f5501v = bArr;
    }

    public final void e(ByteBuffer byteBuffer) {
        int position;
        boolean z;
        int limit;
        boolean z6;
        boolean z8;
        while (byteBuffer.hasRemaining() && !this.f3242g.hasRemaining()) {
            int i8 = this.f5495p;
            short s8 = this.f5489j;
            boolean z9 = true;
            if (i8 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.f5498s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE)) > s8) {
                        int i9 = this.f5493n;
                        position = ((limit3 / i9) * i9) + i9;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f5495p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else if (i8 == 1) {
                if (this.f5499t < this.f5498s.length) {
                    z = true;
                } else {
                    z = false;
                }
                l.j(z);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE)) > s8) {
                        int i10 = this.f5493n;
                        limit = (position2 / i10) * i10;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i11 = this.f5499t;
                int i12 = this.f5500u;
                int i13 = i11 + i12;
                byte[] bArr = this.f5498s;
                if (i13 < bArr.length) {
                    i11 = bArr.length;
                } else {
                    i13 = i12 - (bArr.length - i11);
                }
                int i14 = i11 - i13;
                if (limit < limit4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int min = Math.min(position3, i14);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f5498s, i13, min);
                int i15 = this.f5500u + min;
                this.f5500u = i15;
                if (i15 <= this.f5498s.length) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                l.j(z8);
                if (!z6 || position3 >= i14) {
                    z9 = false;
                }
                m(z9);
                if (z9) {
                    this.f5495p = 0;
                    this.f5497r = 0;
                }
                byteBuffer.limit(limit4);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final b g(b bVar) {
        if (bVar.f3235c != 2) {
            throw new c(bVar);
        } else if (bVar.f3233a == -1) {
            return b.e;
        } else {
            return bVar;
        }
    }

    public final void h() {
        if (isActive()) {
            b bVar = this.f3238b;
            int i8 = bVar.f3234b * 2;
            this.f5493n = i8;
            int i9 = ((((int) ((this.f5491l * ((long) bVar.f3233a)) / 1000000)) / 2) / i8) * i8 * 2;
            if (this.f5498s.length != i9) {
                this.f5498s = new byte[i9];
                this.f5501v = new byte[i9];
            }
        }
        this.f5495p = 0;
        this.f5496q = 0;
        this.f5497r = 0;
        this.f5499t = 0;
        this.f5500u = 0;
    }

    public final void i() {
        if (this.f5500u > 0) {
            m(true);
            this.f5497r = 0;
        }
    }

    public final boolean isActive() {
        if (!super.isActive() || !this.f5494o) {
            return false;
        }
        return true;
    }

    public final void j() {
        this.f5494o = false;
        byte[] bArr = z.f3752f;
        this.f5498s = bArr;
        this.f5501v = bArr;
    }

    public final int l(int i8) {
        boolean z;
        int length = ((((int) ((this.f5492m * ((long) this.f3238b.f3233a)) / 1000000)) - this.f5497r) * this.f5493n) - (this.f5498s.length / 2);
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        int i9 = this.f5493n;
        return (((int) Math.min((((float) i8) * this.i) + 0.5f, (float) length)) / i9) * i9;
    }

    public final void m(boolean z) {
        int i8;
        int i9;
        boolean z6;
        boolean z8;
        int i10 = this.f5500u;
        byte[] bArr = this.f5498s;
        if (i10 == bArr.length || z) {
            boolean z9 = false;
            if (this.f5497r == 0) {
                if (z) {
                    n(i10, 3);
                    i8 = i10;
                } else {
                    if (i10 >= bArr.length / 2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    l.j(z8);
                    i8 = this.f5498s.length / 2;
                    n(i8, 0);
                }
                i9 = i8;
            } else if (z) {
                int length = i10 - (bArr.length / 2);
                int length2 = (bArr.length / 2) + length;
                int l8 = l(length) + (this.f5498s.length / 2);
                n(l8, 2);
                int i11 = length2;
                i9 = l8;
                i8 = i11;
            } else {
                i8 = i10 - (bArr.length / 2);
                i9 = l(i8);
                n(i9, 1);
            }
            if (i8 % this.f5493n == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            l.i("bytesConsumed is not aligned to frame size: %s" + i8, z6);
            if (i10 >= i9) {
                z9 = true;
            }
            l.j(z9);
            this.f5500u -= i8;
            int i12 = this.f5499t + i8;
            this.f5499t = i12;
            this.f5499t = i12 % this.f5498s.length;
            int i13 = this.f5497r;
            int i14 = this.f5493n;
            this.f5497r = (i9 / i14) + i13;
            this.f5496q += (long) ((i8 - i9) / i14);
        }
    }

    public final void n(int i8, int i9) {
        boolean z;
        boolean z6;
        boolean z8;
        if (i8 != 0) {
            boolean z9 = true;
            if (this.f5500u >= i8) {
                z = true;
            } else {
                z = false;
            }
            l.d(z);
            if (i9 == 2) {
                int i10 = this.f5499t;
                int i11 = this.f5500u;
                int i12 = i10 + i11;
                byte[] bArr = this.f5498s;
                if (i12 <= bArr.length) {
                    System.arraycopy(bArr, i12 - i8, this.f5501v, 0, i8);
                } else {
                    int length = i11 - (bArr.length - i10);
                    if (length >= i8) {
                        System.arraycopy(bArr, length - i8, this.f5501v, 0, i8);
                    } else {
                        int i13 = i8 - length;
                        System.arraycopy(bArr, bArr.length - i13, this.f5501v, 0, i13);
                        System.arraycopy(this.f5498s, 0, this.f5501v, i13, length);
                    }
                }
            } else {
                int i14 = this.f5499t;
                int i15 = i14 + i8;
                byte[] bArr2 = this.f5498s;
                if (i15 <= bArr2.length) {
                    System.arraycopy(bArr2, i14, this.f5501v, 0, i8);
                } else {
                    int length2 = bArr2.length - i14;
                    System.arraycopy(bArr2, i14, this.f5501v, 0, length2);
                    System.arraycopy(this.f5498s, 0, this.f5501v, length2, i8 - length2);
                }
            }
            if (i8 % this.f5493n == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            l.c("sizeToOutput is not aligned to frame size: " + i8, z6);
            if (this.f5499t < this.f5498s.length) {
                z8 = true;
            } else {
                z8 = false;
            }
            l.j(z8);
            byte[] bArr3 = this.f5501v;
            if (i8 % this.f5493n != 0) {
                z9 = false;
            }
            l.c("byteOutput size is not aligned to frame size " + i8, z9);
            if (i9 != 3) {
                for (int i16 = 0; i16 < i8; i16 += 2) {
                    int i17 = i16 + 1;
                    byte b8 = (bArr3[i17] << 8) | (bArr3[i16] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
                    int i18 = this.f5490k;
                    if (i9 == 0) {
                        i18 = ((((i16 * 1000) / (i8 - 1)) * (i18 - 100)) / 1000) + 100;
                    } else if (i9 == 2) {
                        i18 += (((i16 * 1000) * (100 - i18)) / (i8 - 1)) / 1000;
                    }
                    int i19 = (b8 * i18) / 100;
                    if (i19 >= 32767) {
                        bArr3[i16] = -1;
                        bArr3[i17] = Byte.MAX_VALUE;
                    } else if (i19 <= -32768) {
                        bArr3[i16] = 0;
                        bArr3[i17] = Byte.MIN_VALUE;
                    } else {
                        bArr3[i16] = (byte) (i19 & 255);
                        bArr3[i17] = (byte) (i19 >> 8);
                    }
                }
            }
            k(i8).put(bArr3, 0, i8).flip();
        }
    }
}
