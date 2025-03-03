package l7;

import P6.f;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class k implements w {

    /* renamed from: U  reason: collision with root package name */
    public byte f13221U;

    /* renamed from: V  reason: collision with root package name */
    public final q f13222V;

    /* renamed from: W  reason: collision with root package name */
    public final Inflater f13223W;

    /* renamed from: X  reason: collision with root package name */
    public final l f13224X;

    /* renamed from: Y  reason: collision with root package name */
    public final CRC32 f13225Y = new CRC32();

    public k(w wVar) {
        f.e(wVar, "source");
        q qVar = new q(wVar);
        this.f13222V = qVar;
        Inflater inflater = new Inflater(true);
        this.f13223W = inflater;
        this.f13224X = new l(qVar, inflater);
    }

    public static void k(int i, int i8, String str) {
        if (i8 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i8), Integer.valueOf(i)}, 3)));
        }
    }

    public final y a() {
        return this.f13222V.f13236U.a();
    }

    public final void close() {
        this.f13224X.close();
    }

    public final long f(f fVar, long j7) {
        q qVar;
        boolean z;
        f fVar2;
        long j8;
        f fVar3 = fVar;
        f.e(fVar3, "sink");
        byte b8 = this.f13221U;
        CRC32 crc32 = this.f13225Y;
        q qVar2 = this.f13222V;
        if (b8 == 0) {
            qVar2.u(10);
            f fVar4 = qVar2.f13237V;
            byte l8 = fVar4.l(3);
            if (((l8 >> 1) & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                l(fVar4, 0, 10);
            }
            k(8075, qVar2.r(), "ID1ID2");
            qVar2.v(8);
            if (((l8 >> 2) & 1) == 1) {
                qVar2.u(2);
                if (z) {
                    l(fVar4, 0, 2);
                }
                short r8 = fVar4.r();
                long j9 = (long) (((short) (((r8 & 255) << 8) | ((r8 & 65280) >>> 8))) & 65535);
                qVar2.u(j9);
                if (z) {
                    l(fVar4, 0, j9);
                    j8 = j9;
                } else {
                    j8 = j9;
                }
                qVar2.v(j8);
            }
            if (((l8 >> 3) & 1) == 1) {
                q qVar3 = qVar2;
                fVar2 = fVar4;
                long l9 = qVar2.l((byte) 0, 0, Long.MAX_VALUE);
                if (l9 != -1) {
                    if (z) {
                        qVar = qVar3;
                        l(fVar2, 0, l9 + 1);
                    } else {
                        qVar = qVar3;
                    }
                    qVar.v(l9 + 1);
                } else {
                    throw new EOFException();
                }
            } else {
                qVar = qVar2;
                fVar2 = fVar4;
            }
            if (((l8 >> 4) & 1) == 1) {
                long l10 = qVar.l((byte) 0, 0, Long.MAX_VALUE);
                if (l10 != -1) {
                    if (z) {
                        l(fVar2, 0, l10 + 1);
                    }
                    qVar.v(l10 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (z) {
                qVar.u(2);
                short r9 = fVar2.r();
                k((short) (((r9 & 255) << 8) | ((r9 & 65280) >>> 8)), (short) ((int) crc32.getValue()), "FHCRC");
                crc32.reset();
            }
            this.f13221U = 1;
        } else {
            qVar = qVar2;
        }
        if (this.f13221U == 1) {
            long j10 = fVar3.f13216V;
            long f8 = this.f13224X.f(fVar3, 8192);
            if (f8 != -1) {
                l(fVar, j10, f8);
                return f8;
            }
            this.f13221U = 2;
        }
        if (this.f13221U != 2) {
            return -1;
        }
        k(qVar.q(), (int) crc32.getValue(), "CRC");
        k(qVar.q(), (int) this.f13223W.getBytesWritten(), "ISIZE");
        this.f13221U = 3;
        if (qVar.k()) {
            return -1;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    public final void l(f fVar, long j7, long j8) {
        r rVar = fVar.f13215U;
        f.b(rVar);
        while (true) {
            int i = rVar.f13241c;
            int i8 = rVar.f13240b;
            if (j7 < ((long) (i - i8))) {
                break;
            }
            j7 -= (long) (i - i8);
            rVar = rVar.f13243f;
            f.b(rVar);
        }
        while (j8 > 0) {
            int i9 = (int) (((long) rVar.f13240b) + j7);
            int min = (int) Math.min((long) (rVar.f13241c - i9), j8);
            this.f13225Y.update(rVar.f13239a, i9, min);
            j8 -= (long) min;
            rVar = rVar.f13243f;
            f.b(rVar);
            j7 = 0;
        }
    }
}
