package h1;

import D.A;
import J1.b;
import P0.r;
import P0.z;
import R2.c;
import S0.f;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import l1.C1171a;
import l1.e;
import p1.F;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final e f12392a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12393b;

    /* renamed from: c  reason: collision with root package name */
    public final r f12394c = new r(32);

    /* renamed from: d  reason: collision with root package name */
    public b f12395d;
    public b e;

    /* renamed from: f  reason: collision with root package name */
    public b f12396f;

    /* renamed from: g  reason: collision with root package name */
    public long f12397g;

    public U(e eVar) {
        this.f12392a = eVar;
        int i = eVar.f13105b;
        this.f12393b = i;
        b bVar = new b(i, 0);
        this.f12395d = bVar;
        this.e = bVar;
        this.f12396f = bVar;
    }

    public static b d(b bVar, long j7, ByteBuffer byteBuffer, int i) {
        while (j7 >= bVar.f2348V) {
            bVar = (b) bVar.f2350X;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (bVar.f2348V - j7));
            C1171a aVar = (C1171a) bVar.f2349W;
            byteBuffer.put(aVar.f13095a, ((int) (j7 - bVar.f2347U)) + aVar.f13096b, min);
            i -= min;
            j7 += (long) min;
            if (j7 == bVar.f2348V) {
                bVar = (b) bVar.f2350X;
            }
        }
        return bVar;
    }

    public static b e(b bVar, long j7, byte[] bArr, int i) {
        while (j7 >= bVar.f2348V) {
            bVar = (b) bVar.f2350X;
        }
        int i8 = i;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (bVar.f2348V - j7));
            C1171a aVar = (C1171a) bVar.f2349W;
            System.arraycopy(aVar.f13095a, ((int) (j7 - bVar.f2347U)) + aVar.f13096b, bArr, i - i8, min);
            i8 -= min;
            j7 += (long) min;
            if (j7 == bVar.f2348V) {
                bVar = (b) bVar.f2350X;
            }
        }
        return bVar;
    }

    public static b f(b bVar, f fVar, A a8, r rVar) {
        boolean z;
        int i;
        if (fVar.d(O7.b.MAX_POW2)) {
            long j7 = a8.f739b;
            rVar.E(1);
            b e8 = e(bVar, j7, rVar.f3732a, 1);
            long j8 = j7 + 1;
            byte b8 = rVar.f3732a[0];
            if ((b8 & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            byte b9 = b8 & Byte.MAX_VALUE;
            S0.b bVar2 = fVar.f4385X;
            byte[] bArr = bVar2.f4376a;
            if (bArr == null) {
                bVar2.f4376a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            bVar = e(e8, j8, bVar2.f4376a, b9);
            long j9 = j8 + ((long) b9);
            if (z) {
                rVar.E(2);
                bVar = e(bVar, j9, rVar.f3732a, 2);
                j9 += 2;
                i = rVar.B();
            } else {
                i = 1;
            }
            int[] iArr = bVar2.f4379d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = bVar2.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i8 = i * 6;
                rVar.E(i8);
                bVar = e(bVar, j9, rVar.f3732a, i8);
                j9 += (long) i8;
                rVar.H(0);
                for (int i9 = 0; i9 < i; i9++) {
                    iArr[i9] = rVar.B();
                    iArr2[i9] = rVar.z();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = a8.f738a - ((int) (j9 - a8.f739b));
            }
            F f8 = (F) a8.f740c;
            int i10 = z.f3748a;
            byte[] bArr2 = f8.f14328b;
            byte[] bArr3 = bVar2.f4376a;
            bVar2.f4380f = i;
            bVar2.f4379d = iArr;
            bVar2.e = iArr2;
            bVar2.f4377b = bArr2;
            bVar2.f4376a = bArr3;
            int i11 = f8.f14327a;
            bVar2.f4378c = i11;
            int i12 = f8.f14329c;
            bVar2.f4381g = i12;
            int i13 = f8.f14330d;
            bVar2.f4382h = i13;
            MediaCodec.CryptoInfo cryptoInfo = bVar2.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i11;
            if (z.f3748a >= 24) {
                c cVar = bVar2.f4383j;
                cVar.getClass();
                ((MediaCodec.CryptoInfo.Pattern) cVar.f4337W).set(i12, i13);
                ((MediaCodec.CryptoInfo) cVar.f4336V).setPattern((MediaCodec.CryptoInfo.Pattern) cVar.f4337W);
            }
            long j10 = a8.f739b;
            int i14 = (int) (j9 - j10);
            a8.f739b = j10 + ((long) i14);
            a8.f738a -= i14;
        }
        if (fVar.d(268435456)) {
            rVar.E(4);
            b e9 = e(bVar, a8.f739b, rVar.f3732a, 4);
            int z6 = rVar.z();
            a8.f739b += 4;
            a8.f738a -= 4;
            fVar.u(z6);
            b d8 = d(e9, a8.f739b, fVar.f4386Y, z6);
            a8.f739b += (long) z6;
            int i15 = a8.f738a - z6;
            a8.f738a = i15;
            ByteBuffer byteBuffer = fVar.f4389b0;
            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                fVar.f4389b0 = ByteBuffer.allocate(i15);
            } else {
                fVar.f4389b0.clear();
            }
            return d(d8, a8.f739b, fVar.f4389b0, a8.f738a);
        }
        fVar.u(a8.f738a);
        return d(bVar, a8.f739b, fVar.f4386Y, a8.f738a);
    }

    public final void a(b bVar) {
        if (((C1171a) bVar.f2349W) != null) {
            e eVar = this.f12392a;
            synchronized (eVar) {
                b bVar2 = bVar;
                while (bVar2 != null) {
                    try {
                        C1171a[] aVarArr = eVar.f13108f;
                        int i = eVar.e;
                        eVar.e = i + 1;
                        C1171a aVar = (C1171a) bVar2.f2349W;
                        aVar.getClass();
                        aVarArr[i] = aVar;
                        eVar.f13107d--;
                        bVar2 = (b) bVar2.f2350X;
                        if (bVar2 == null || ((C1171a) bVar2.f2349W) == null) {
                            bVar2 = null;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                eVar.notifyAll();
            }
            bVar.f2349W = null;
            bVar.f2350X = null;
        }
    }

    public final void b(long j7) {
        if (j7 != -1) {
            while (true) {
                b bVar = this.f12395d;
                if (j7 >= bVar.f2348V) {
                    e eVar = this.f12392a;
                    C1171a aVar = (C1171a) bVar.f2349W;
                    synchronized (eVar) {
                        C1171a[] aVarArr = eVar.f13108f;
                        int i = eVar.e;
                        eVar.e = i + 1;
                        aVarArr[i] = aVar;
                        eVar.f13107d--;
                        eVar.notifyAll();
                    }
                    b bVar2 = this.f12395d;
                    bVar2.f2349W = null;
                    bVar2.f2350X = null;
                    this.f12395d = (b) bVar2.f2350X;
                } else if (this.e.f2347U < bVar.f2347U) {
                    this.e = bVar;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final int c(int i) {
        C1171a aVar;
        b bVar = this.f12396f;
        if (((C1171a) bVar.f2349W) == null) {
            e eVar = this.f12392a;
            synchronized (eVar) {
                try {
                    int i8 = eVar.f13107d + 1;
                    eVar.f13107d = i8;
                    int i9 = eVar.e;
                    if (i9 > 0) {
                        C1171a[] aVarArr = eVar.f13108f;
                        int i10 = i9 - 1;
                        eVar.e = i10;
                        aVar = aVarArr[i10];
                        aVar.getClass();
                        eVar.f13108f[eVar.e] = null;
                    } else {
                        C1171a aVar2 = new C1171a(0, new byte[eVar.f13105b]);
                        C1171a[] aVarArr2 = eVar.f13108f;
                        if (i8 > aVarArr2.length) {
                            eVar.f13108f = (C1171a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            b bVar2 = new b(this.f12393b, this.f12396f.f2348V);
            bVar.f2349W = aVar;
            bVar.f2350X = bVar2;
        }
        return Math.min(i, (int) (this.f12396f.f2348V - this.f12397g));
    }
}
