package p1;

import B1.a;
import B1.b;
import M0.H;
import M0.J;
import N1.f;
import P0.l;
import P0.r;
import P0.z;
import Q0.g;
import V0.j;
import android.util.Base64;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.K2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k2.C1160q;
import org.altbeacon.bluetooth.Pdu;

/* renamed from: p1.b  reason: case insensitive filesystem */
public abstract class C1332b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f14340a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f14341b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f14342c = {1, 2, 3, 6};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f14343d = {48000, 44100, 32000};
    public static final int[] e = {24000, 22050, 16000};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f14344f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f14345g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f14346h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f14347j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f14348k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f14349l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f14350m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f14351n = {5, 8, 10, 12};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f14352o = {6, 9, 12, 15};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f14353p = {2, 4, 6, 8};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f14354q = {9, 11, 13, 16};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f14355r = {5, 8, 10, 12};

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f14356s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f14357t = {44100, 48000, 32000};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f14358u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f14359v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f14360w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f14361x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f14362y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i8, int i9, int i10) {
        return new byte[]{(byte) (((i8 << 3) & 248) | ((i9 >> 1) & 7)), (byte) (((i9 << 7) & 128) | ((i10 << 3) & 120))};
    }

    public static ArrayList b(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) (((bArr[11] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (bArr[10] & Pdu.MANUFACTURER_DATA_PDU_TYPE))) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r12 == r1.f14427f) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        if ((r18.v() * 1000) == r1) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r6 == r1) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(P0.r r18, p1.t r19, int r20, M0.C0132u r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = 10
            r3 = 1
            int r4 = r0.f3733b
            long r5 = r18.x()
            r7 = 16
            long r7 = r5 >>> r7
            r9 = r20
            long r9 = (long) r9
            r11 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x001a
            return r11
        L_0x001a:
            r9 = 1
            long r7 = r7 & r9
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0023
            r7 = 1
            goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            r8 = 12
            long r12 = r5 >> r8
            r14 = 15
            long r12 = r12 & r14
            int r13 = (int) r12
            r12 = 8
            long r16 = r5 >> r12
            long r11 = r16 & r14
            int r12 = (int) r11
            r11 = 4
            long r16 = r5 >> r11
            long r14 = r16 & r14
            int r11 = (int) r14
            long r14 = r5 >> r3
            r16 = 7
            long r14 = r14 & r16
            int r15 = (int) r14
            long r5 = r5 & r9
            int r14 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r6 = 7
            if (r11 > r6) goto L_0x0051
            int r6 = r1.f14428g
            int r6 = r6 - r3
            if (r11 != r6) goto L_0x00c0
            goto L_0x0058
        L_0x0051:
            if (r11 > r2) goto L_0x00c0
            int r6 = r1.f14428g
            r9 = 2
            if (r6 != r9) goto L_0x00c0
        L_0x0058:
            if (r15 != 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            int r6 = r1.i
            if (r15 != r6) goto L_0x00c0
        L_0x005f:
            if (r5 != 0) goto L_0x00c0
            long r5 = r18.C()     // Catch:{ NumberFormatException -> 0x00c0 }
            if (r7 == 0) goto L_0x006a
        L_0x0067:
            r7 = r21
            goto L_0x0070
        L_0x006a:
            int r7 = r1.f14424b
            long r9 = (long) r7
            long r5 = r5 * r9
            goto L_0x0067
        L_0x0070:
            r7.f3050a = r5
            int r5 = u(r13, r0)
            r6 = -1
            if (r5 == r6) goto L_0x00c0
            int r6 = r1.f14424b
            if (r5 > r6) goto L_0x00c0
            if (r12 != 0) goto L_0x0080
            goto L_0x00a4
        L_0x0080:
            r5 = 11
            if (r12 > r5) goto L_0x0089
            int r1 = r1.f14427f
            if (r12 != r1) goto L_0x00c0
            goto L_0x00a4
        L_0x0089:
            int r1 = r1.e
            if (r12 != r8) goto L_0x0096
            int r2 = r18.v()
            int r2 = r2 * 1000
            if (r2 != r1) goto L_0x00c0
            goto L_0x00a4
        L_0x0096:
            r5 = 14
            if (r12 > r5) goto L_0x00c0
            int r6 = r18.B()
            if (r12 != r5) goto L_0x00a2
            int r6 = r6 * 10
        L_0x00a2:
            if (r6 != r1) goto L_0x00c0
        L_0x00a4:
            int r1 = r18.v()
            int r2 = r0.f3733b
            byte[] r0 = r0.f3732a
            int r2 = r2 - r3
            int r5 = P0.z.f3748a
            r5 = 0
        L_0x00b0:
            if (r4 >= r2) goto L_0x00bd
            byte r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            int[] r6 = P0.z.f3761p
            r5 = r6[r5]
            int r4 = r4 + r3
            goto L_0x00b0
        L_0x00bd:
            if (r1 != r5) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r3 = 0
        L_0x00c1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C1332b.c(P0.r, p1.t, int, M0.u):boolean");
    }

    public static void d(String str, boolean z) {
        if (!z) {
            throw J.a((RuntimeException) null, str);
        }
    }

    public static void e(long j7, r rVar, G[] gArr) {
        int i8;
        int i9;
        boolean z;
        while (true) {
            boolean z6 = true;
            if (rVar.a() > 1) {
                int i10 = 0;
                while (true) {
                    if (rVar.a() != 0) {
                        int v4 = rVar.v();
                        i10 += v4;
                        if (v4 != 255) {
                            i8 = i10;
                            break;
                        }
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                int i11 = 0;
                while (true) {
                    if (rVar.a() != 0) {
                        int v8 = rVar.v();
                        i11 += v8;
                        if (v8 != 255) {
                            break;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                int i12 = rVar.f3733b + i11;
                if (i11 == -1 || i11 > rVar.a()) {
                    l.B("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i12 = rVar.f3734c;
                } else if (i8 == 4 && i11 >= 8) {
                    int v9 = rVar.v();
                    int B8 = rVar.B();
                    if (B8 == 49) {
                        i9 = rVar.i();
                    } else {
                        i9 = 0;
                    }
                    int v10 = rVar.v();
                    if (B8 == 47) {
                        rVar.I(1);
                    }
                    if (v9 == 181 && ((B8 == 49 || B8 == 47) && v10 == 3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (B8 == 49) {
                        if (i9 != 1195456820) {
                            z6 = false;
                        }
                        z &= z6;
                    }
                    if (z) {
                        f(j7, rVar, gArr);
                    }
                }
                rVar.H(i12);
            } else {
                return;
            }
        }
    }

    public static void f(long j7, r rVar, G[] gArr) {
        boolean z;
        r rVar2 = rVar;
        G[] gArr2 = gArr;
        int v4 = rVar.v();
        if ((v4 & 64) != 0) {
            rVar2.I(1);
            int i8 = (v4 & 31) * 3;
            int i9 = rVar2.f3733b;
            for (G g8 : gArr2) {
                rVar2.H(i9);
                g8.a(i8, rVar2);
                if (j7 != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                l.j(z);
                g8.e(j7, 1, i8, 0, (F) null);
            }
        }
    }

    public static int g(int i8, int i9) {
        int i10 = i9 / 2;
        if (i8 < 0 || i8 >= 3 || i9 < 0 || i10 >= 19) {
            return -1;
        }
        int i11 = f14343d[i8];
        if (i11 == 44100) {
            return ((i9 % 2) + f14346h[i10]) * 2;
        }
        int i12 = f14345g[i10];
        if (i11 == 32000) {
            return i12 * 6;
        }
        return i12 * 4;
    }

    public static void h(int i8, r rVar) {
        rVar.E(7);
        byte[] bArr = rVar.f3732a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i8 >> 16) & 255);
        bArr[5] = (byte) ((i8 >> 8) & 255);
        bArr[6] = (byte) (i8 & 255);
    }

    public static int i(int i8) {
        boolean z;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i8 & -2097152) == -2097152) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0 || (i11 = (i8 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i8 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f14357t[i12];
        if (i9 == 2) {
            i15 /= 2;
        } else if (i9 == 0) {
            i15 /= 4;
        }
        int i16 = (i8 >>> 9) & 1;
        if (i10 == 3) {
            if (i9 == 3) {
                i14 = f14358u[i11 - 1];
            } else {
                i14 = f14359v[i11 - 1];
            }
            return (((i14 * 12) / i15) + i16) * 4;
        }
        if (i9 != 3) {
            i13 = f14362y[i11 - 1];
        } else if (i10 == 2) {
            i13 = f14360w[i11 - 1];
        } else {
            i13 = f14361x[i11 - 1];
        }
        int i17 = 144;
        if (i9 == 3) {
            return ((i13 * 144) / i15) + i16;
        }
        if (i10 == 1) {
            i17 = 72;
        }
        return ((i17 * i13) / i15) + i16;
    }

    public static f j(byte[] bArr) {
        byte b8 = bArr[0];
        if (b8 == Byte.MAX_VALUE || b8 == 100 || b8 == 64 || b8 == 113) {
            return new f(bArr.length, bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b9 = copyOf[0];
        if (b9 == -2 || b9 == -1 || b9 == 37 || b9 == -14 || b9 == -24) {
            for (int i8 = 0; i8 < copyOf.length - 1; i8 += 2) {
                byte b10 = copyOf[i8];
                int i9 = i8 + 1;
                copyOf[i8] = copyOf[i9];
                copyOf[i9] = b10;
            }
        }
        f fVar = new f(copyOf.length, copyOf);
        if (copyOf[0] == 31) {
            f fVar2 = new f(copyOf.length, copyOf);
            while (fVar2.b() >= 16) {
                fVar2.u(2);
                int i10 = fVar2.i(14) & 16383;
                int min = Math.min(8 - fVar.f3346d, 14);
                int i11 = fVar.f3346d;
                int i12 = (8 - i11) - min;
                byte[] bArr2 = fVar.f3344b;
                int i13 = fVar.f3345c;
                byte b11 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr2[i13]);
                bArr2[i13] = b11;
                int i14 = 14 - min;
                bArr2[i13] = (byte) (b11 | ((i10 >>> i14) << i12));
                int i15 = i13 + 1;
                while (i14 > 8) {
                    fVar.f3344b[i15] = (byte) (i10 >>> (i14 - 8));
                    i14 -= 8;
                    i15++;
                }
                int i16 = 8 - i14;
                byte[] bArr3 = fVar.f3344b;
                byte b12 = (byte) (bArr3[i15] & ((1 << i16) - 1));
                bArr3[i15] = b12;
                bArr3[i15] = (byte) (((i10 & ((1 << i14) - 1)) << i16) | b12);
                fVar.u(14);
                fVar.a();
            }
        }
        fVar.p(copyOf.length, copyOf);
        return fVar;
    }

    public static long k(byte b8, byte b9) {
        byte b10;
        int i8;
        byte b11 = b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        byte b12 = b8 & 3;
        if (b12 != 0) {
            b10 = 2;
            if (!(b12 == 1 || b12 == 2)) {
                b10 = b9 & 63;
            }
        } else {
            b10 = 1;
        }
        int i9 = b11 >> 3;
        int i10 = i9 & 3;
        if (i9 >= 16) {
            i8 = 2500 << i10;
        } else if (i9 >= 12) {
            i8 = 10000 << (i9 & 1);
        } else if (i10 == 3) {
            i8 = 60000;
        } else {
            i8 = 10000 << i10;
        }
        return ((long) b10) * ((long) i8);
    }

    public static int l(f fVar) {
        int i8 = fVar.i(4);
        if (i8 == 15) {
            if (fVar.b() >= 24) {
                return fVar.i(24);
            }
            throw J.a((RuntimeException) null, "AAC header insufficient data");
        } else if (i8 < 13) {
            return f14340a[i8];
        } else {
            throw J.a((RuntimeException) null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static int m(int i8) {
        int i9 = 0;
        while (i8 > 0) {
            i9++;
            i8 >>>= 1;
        }
        return i9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p1.C1333c n(N1.f r21) {
        /*
            r0 = r21
            int r1 = r21.g()
            r2 = 40
            r0.u(r2)
            r2 = 5
            int r3 = r0.i(r2)
            r5 = 1
            r6 = 10
            if (r3 <= r6) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            r0.r(r1)
            int[] r1 = f14344f
            int[] r7 = f14343d
            r8 = 2
            r9 = -1
            r10 = 8
            r12 = 3
            if (r3 == 0) goto L_0x0236
            r3 = 16
            r0.u(r3)
            int r13 = r0.i(r8)
            if (r13 == 0) goto L_0x003a
            if (r13 == r5) goto L_0x0038
            if (r13 == r8) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            r9 = 2
            goto L_0x003b
        L_0x0038:
            r9 = 1
            goto L_0x003b
        L_0x003a:
            r9 = 0
        L_0x003b:
            r0.u(r12)
            r13 = 11
            int r13 = r0.i(r13)
            int r13 = r13 + r5
            int r13 = r13 * 2
            int r14 = r0.i(r8)
            if (r14 != r12) goto L_0x0058
            int[] r7 = e
            int r15 = r0.i(r8)
            r7 = r7[r15]
            r4 = 6
            r15 = 3
            goto L_0x0064
        L_0x0058:
            int r15 = r0.i(r8)
            int[] r16 = f14342c
            r16 = r16[r15]
            r7 = r7[r14]
            r4 = r16
        L_0x0064:
            int r11 = r4 * 256
            int r18 = r13 * r7
            int r19 = r4 * 32
            int r18 = r18 / r19
            int r8 = r0.i(r12)
            boolean r20 = r21.h()
            r1 = r1[r8]
            int r1 = r1 + r20
            r0.u(r6)
            boolean r6 = r21.h()
            if (r6 == 0) goto L_0x0084
            r0.u(r10)
        L_0x0084:
            if (r8 != 0) goto L_0x0092
            r0.u(r2)
            boolean r6 = r21.h()
            if (r6 == 0) goto L_0x0092
            r0.u(r10)
        L_0x0092:
            if (r9 != r5) goto L_0x009d
            boolean r6 = r21.h()
            if (r6 == 0) goto L_0x009d
            r0.u(r3)
        L_0x009d:
            boolean r3 = r21.h()
            r6 = 4
            if (r3 == 0) goto L_0x01c4
            r3 = 2
            if (r8 <= r3) goto L_0x00aa
            r0.u(r3)
        L_0x00aa:
            r19 = r8 & 1
            if (r19 == 0) goto L_0x00b5
            if (r8 <= r3) goto L_0x00b5
            r3 = 6
            r0.u(r3)
            goto L_0x00b6
        L_0x00b5:
            r3 = 6
        L_0x00b6:
            r17 = r8 & 4
            if (r17 == 0) goto L_0x00bd
            r0.u(r3)
        L_0x00bd:
            if (r20 == 0) goto L_0x00c8
            boolean r3 = r21.h()
            if (r3 == 0) goto L_0x00c8
            r0.u(r2)
        L_0x00c8:
            if (r9 != 0) goto L_0x01c4
            boolean r3 = r21.h()
            if (r3 == 0) goto L_0x00d5
            r3 = 6
            r0.u(r3)
            goto L_0x00d6
        L_0x00d5:
            r3 = 6
        L_0x00d6:
            if (r8 != 0) goto L_0x00e1
            boolean r17 = r21.h()
            if (r17 == 0) goto L_0x00e1
            r0.u(r3)
        L_0x00e1:
            boolean r17 = r21.h()
            if (r17 == 0) goto L_0x00ea
            r0.u(r3)
        L_0x00ea:
            r3 = 2
            int r10 = r0.i(r3)
            if (r10 != r5) goto L_0x00f7
            r0.u(r2)
        L_0x00f4:
            r5 = 2
            goto L_0x0191
        L_0x00f7:
            if (r10 != r3) goto L_0x00ff
            r3 = 12
            r0.u(r3)
            goto L_0x00f4
        L_0x00ff:
            if (r10 != r12) goto L_0x00f4
            int r3 = r0.i(r2)
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0165
            r0.u(r2)
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0117
            r0.u(r6)
        L_0x0117:
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0120
            r0.u(r6)
        L_0x0120:
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0129
            r0.u(r6)
        L_0x0129:
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0132
            r0.u(r6)
        L_0x0132:
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x013b
            r0.u(r6)
        L_0x013b:
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0144
            r0.u(r6)
        L_0x0144:
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x014d
            r0.u(r6)
        L_0x014d:
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0165
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x015c
            r0.u(r6)
        L_0x015c:
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0165
            r0.u(r6)
        L_0x0165:
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0185
            r0.u(r2)
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0185
            r10 = 7
            r0.u(r10)
            boolean r10 = r21.h()
            if (r10 == 0) goto L_0x0185
            r10 = 8
            r0.u(r10)
        L_0x0183:
            r5 = 2
            goto L_0x0188
        L_0x0185:
            r10 = 8
            goto L_0x0183
        L_0x0188:
            int r3 = r3 + r5
            int r3 = r3 * 8
            r0.u(r3)
            r21.c()
        L_0x0191:
            if (r8 >= r5) goto L_0x01a9
            boolean r3 = r21.h()
            r5 = 14
            if (r3 == 0) goto L_0x019e
            r0.u(r5)
        L_0x019e:
            if (r8 != 0) goto L_0x01a9
            boolean r3 = r21.h()
            if (r3 == 0) goto L_0x01a9
            r0.u(r5)
        L_0x01a9:
            boolean r3 = r21.h()
            if (r3 == 0) goto L_0x01c4
            if (r15 != 0) goto L_0x01b5
            r0.u(r2)
            goto L_0x01c4
        L_0x01b5:
            r3 = 0
        L_0x01b6:
            if (r3 >= r4) goto L_0x01c4
            boolean r5 = r21.h()
            if (r5 == 0) goto L_0x01c1
            r0.u(r2)
        L_0x01c1:
            int r3 = r3 + 1
            goto L_0x01b6
        L_0x01c4:
            boolean r3 = r21.h()
            if (r3 == 0) goto L_0x01f7
            r0.u(r2)
            r2 = 2
            if (r8 != r2) goto L_0x01d3
            r0.u(r6)
        L_0x01d3:
            r3 = 6
            if (r8 < r3) goto L_0x01d9
            r0.u(r2)
        L_0x01d9:
            boolean r2 = r21.h()
            if (r2 == 0) goto L_0x01e5
            r2 = 8
            r0.u(r2)
            goto L_0x01e7
        L_0x01e5:
            r2 = 8
        L_0x01e7:
            if (r8 != 0) goto L_0x01f2
            boolean r3 = r21.h()
            if (r3 == 0) goto L_0x01f2
            r0.u(r2)
        L_0x01f2:
            if (r14 >= r12) goto L_0x01f7
            r21.t()
        L_0x01f7:
            if (r9 != 0) goto L_0x01fe
            if (r15 == r12) goto L_0x01fe
            r21.t()
        L_0x01fe:
            r2 = 2
            if (r9 != r2) goto L_0x020b
            if (r15 == r12) goto L_0x0209
            boolean r2 = r21.h()
            if (r2 == 0) goto L_0x020b
        L_0x0209:
            r2 = 6
            goto L_0x020d
        L_0x020b:
            r2 = 6
            goto L_0x0210
        L_0x020d:
            r0.u(r2)
        L_0x0210:
            boolean r3 = r21.h()
            if (r3 == 0) goto L_0x0228
            int r2 = r0.i(r2)
            r3 = 1
            if (r2 != r3) goto L_0x0228
            r2 = 8
            int r0 = r0.i(r2)
            if (r0 != r3) goto L_0x0228
            java.lang.String r0 = "audio/eac3-joc"
            goto L_0x022a
        L_0x0228:
            java.lang.String r0 = "audio/eac3"
        L_0x022a:
            r15 = r0
            r16 = r1
            r17 = r7
            r19 = r11
            r20 = r18
            r18 = r13
            goto L_0x0292
        L_0x0236:
            r2 = 32
            r0.u(r2)
            r2 = 2
            int r3 = r0.i(r2)
            if (r3 != r12) goto L_0x0245
            r2 = 0
        L_0x0243:
            r4 = 6
            goto L_0x0248
        L_0x0245:
            java.lang.String r2 = "audio/ac3"
            goto L_0x0243
        L_0x0248:
            int r4 = r0.i(r4)
            int[] r5 = f14345g
            int r6 = r4 / 2
            r5 = r5[r6]
            int r5 = r5 * 1000
            int r13 = g(r3, r4)
            r4 = 8
            r0.u(r4)
            int r4 = r0.i(r12)
            r6 = r4 & 1
            if (r6 == 0) goto L_0x026d
            r6 = 1
            if (r4 == r6) goto L_0x026d
            r6 = 2
            r0.u(r6)
            goto L_0x026e
        L_0x026d:
            r6 = 2
        L_0x026e:
            r8 = r4 & 4
            if (r8 == 0) goto L_0x0275
            r0.u(r6)
        L_0x0275:
            if (r4 != r6) goto L_0x027a
            r0.u(r6)
        L_0x027a:
            if (r3 >= r12) goto L_0x027e
            r9 = r7[r3]
        L_0x027e:
            boolean r0 = r21.h()
            r1 = r1[r4]
            int r1 = r1 + r0
            r11 = 1536(0x600, float:2.152E-42)
            r16 = r1
            r15 = r2
            r20 = r5
            r17 = r9
            r18 = r13
            r19 = 1536(0x600, float:2.152E-42)
        L_0x0292:
            p1.c r0 = new p1.c
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C1332b.n(N1.f):p1.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        if (r9 != 11) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        if (r9 != 11) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0091, code lost:
        if (r9 != 8) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static F2.h o(N1.f r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = 4
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L_0x0032
        L_0x0029:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L_0x0029
        L_0x0032:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L_0x0047
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L_0x0047
            r9.u(r1)
        L_0x0047:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L_0x0057
            r5 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x005a
        L_0x0057:
            r5 = 44100(0xac44, float:6.1797E-41)
        L_0x005a:
            int r9 = r9.i(r3)
            int[] r8 = i
            if (r5 != r6) goto L_0x0069
            r6 = 13
            if (r9 != r6) goto L_0x0069
            r9 = r8[r9]
            goto L_0x0097
        L_0x0069:
            if (r5 != r7) goto L_0x0096
            r6 = 14
            if (r9 >= r6) goto L_0x0096
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L_0x008f
            r7 = 11
            if (r2 == r1) goto L_0x008a
            if (r2 == r4) goto L_0x008f
            if (r2 == r3) goto L_0x0081
            goto L_0x0094
        L_0x0081:
            if (r9 == r4) goto L_0x0087
            if (r9 == r8) goto L_0x0087
            if (r9 != r7) goto L_0x0094
        L_0x0087:
            int r9 = r6 + 1
            goto L_0x0097
        L_0x008a:
            if (r9 == r8) goto L_0x0087
            if (r9 != r7) goto L_0x0094
            goto L_0x0087
        L_0x008f:
            if (r9 == r4) goto L_0x0087
            if (r9 != r8) goto L_0x0094
            goto L_0x0087
        L_0x0094:
            r9 = r6
            goto L_0x0097
        L_0x0096:
            r9 = 0
        L_0x0097:
            F2.h r1 = new F2.h
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C1332b.o(N1.f):F2.h");
    }

    public static C1331a p(f fVar, boolean z) {
        int i8 = fVar.i(5);
        if (i8 == 31) {
            i8 = fVar.i(6) + 32;
        }
        int l8 = l(fVar);
        int i9 = fVar.i(4);
        String m8 = g.m(i8, "mp4a.40.");
        if (i8 == 5 || i8 == 29) {
            l8 = l(fVar);
            int i10 = fVar.i(5);
            if (i10 == 31) {
                i10 = fVar.i(6) + 32;
            }
            i8 = i10;
            if (i8 == 22) {
                i9 = fVar.i(4);
            }
        }
        if (z) {
            if (!(i8 == 1 || i8 == 2 || i8 == 3 || i8 == 4 || i8 == 6 || i8 == 7 || i8 == 17)) {
                switch (i8) {
                    case EnterpriseDeviceManager.KNOX_2_6:
                    case EnterpriseDeviceManager.KNOX_2_7:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw J.c("Unsupported audio object type: " + i8);
                }
            }
            if (fVar.h()) {
                l.B("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (fVar.h()) {
                fVar.u(14);
            }
            boolean h5 = fVar.h();
            if (i9 != 0) {
                if (i8 == 6 || i8 == 20) {
                    fVar.u(3);
                }
                if (h5) {
                    if (i8 == 22) {
                        fVar.u(16);
                    }
                    if (i8 == 17 || i8 == 19 || i8 == 20 || i8 == 23) {
                        fVar.u(3);
                    }
                    fVar.u(1);
                }
                switch (i8) {
                    case EnterpriseDeviceManager.KNOX_2_5:
                    case EnterpriseDeviceManager.KNOX_2_6:
                    case EnterpriseDeviceManager.KNOX_2_7:
                    case 21:
                    case 22:
                    case 23:
                        int i11 = fVar.i(2);
                        if (i11 == 2 || i11 == 3) {
                            throw J.c("Unsupported epConfig: " + i11);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i12 = f14341b[i9];
        if (i12 != -1) {
            return new C1331a(l8, i12, m8);
        }
        throw J.a((RuntimeException) null, (String) null);
    }

    public static void q(f fVar, j jVar) {
        int i8 = fVar.i(5);
        fVar.u(2);
        if (fVar.h()) {
            fVar.u(5);
        }
        if (i8 >= 7 && i8 <= 10) {
            fVar.t();
        }
        if (fVar.h()) {
            int i9 = fVar.i(3);
            if (jVar.f5530b == -1 && i8 >= 0 && i8 <= 15 && (i9 == 0 || i9 == 1)) {
                jVar.f5530b = i8;
            }
            if (fVar.h()) {
                x(fVar);
            }
        }
    }

    public static void r(f fVar, j jVar) {
        fVar.u(2);
        boolean h5 = fVar.h();
        int i8 = fVar.i(8);
        for (int i9 = 0; i9 < i8; i9++) {
            fVar.u(2);
            if (fVar.h()) {
                fVar.u(5);
            }
            if (h5) {
                fVar.u(24);
            } else {
                if (fVar.h()) {
                    if (!fVar.h()) {
                        fVar.u(4);
                    }
                    jVar.f5531c = fVar.i(6) + 1;
                }
                fVar.u(4);
            }
        }
        if (fVar.h()) {
            fVar.u(3);
            if (fVar.h()) {
                x(fVar);
            }
        }
    }

    public static int s(f fVar, int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 3 && fVar.h(); i9++) {
            i8++;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 += 1 << iArr[i11];
        }
        return fVar.i(iArr[i8]) + i10;
    }

    public static H t(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            String str = (String) list.get(i8);
            int i9 = z.f3748a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                l.B("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(a.k(new r(Base64.decode(split[1], 0))));
                } catch (RuntimeException e8) {
                    l.C("VorbisUtil", "Failed to parse vorbis picture", e8);
                }
            } else {
                arrayList.add(new b(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new H((List) arrayList);
    }

    public static int u(int i8, r rVar) {
        switch (i8) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i8 - 2);
            case 6:
                return rVar.v() + 1;
            case 7:
                return rVar.B() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case EnterpriseDeviceManager.KNOX_2_3:
            case EnterpriseDeviceManager.KNOX_2_4:
                return 256 << (i8 - 8);
            default:
                return -1;
        }
    }

    public static K2 v(r rVar) {
        rVar.I(1);
        int y8 = rVar.y();
        long j7 = ((long) rVar.f3733b) + ((long) y8);
        int i8 = y8 / 18;
        long[] jArr = new long[i8];
        long[] jArr2 = new long[i8];
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            long p3 = rVar.p();
            if (p3 == -1) {
                jArr = Arrays.copyOf(jArr, i9);
                jArr2 = Arrays.copyOf(jArr2, i9);
                break;
            }
            jArr[i9] = p3;
            jArr2[i9] = rVar.p();
            rVar.I(2);
            i9++;
        }
        rVar.I((int) (j7 - ((long) rVar.f3733b)));
        return new K2((Object) jArr, 20, (Object) jArr2);
    }

    public static C1160q w(r rVar, boolean z, boolean z6) {
        if (z) {
            y(3, rVar, false);
        }
        rVar.t((int) rVar.m(), StandardCharsets.UTF_8);
        long m8 = rVar.m();
        String[] strArr = new String[((int) m8)];
        for (int i8 = 0; ((long) i8) < m8; i8++) {
            strArr[i8] = rVar.t((int) rVar.m(), StandardCharsets.UTF_8);
        }
        if (!z6 || (rVar.v() & 1) != 0) {
            return new C1160q(13, (Object) strArr);
        }
        throw J.a((RuntimeException) null, "framing bit expected to be set");
    }

    public static void x(f fVar) {
        int i8 = fVar.i(6);
        if (i8 < 2 || i8 > 42) {
            throw J.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", new Object[]{Integer.valueOf(i8)}));
        }
        fVar.u(i8 * 8);
    }

    public static boolean y(int i8, r rVar, boolean z) {
        if (rVar.a() < 7) {
            if (z) {
                return false;
            }
            throw J.a((RuntimeException) null, "too short header: " + rVar.a());
        } else if (rVar.v() != i8) {
            if (z) {
                return false;
            }
            throw J.a((RuntimeException) null, "expected header type " + Integer.toHexString(i8));
        } else if (rVar.v() == 118 && rVar.v() == 111 && rVar.v() == 114 && rVar.v() == 98 && rVar.v() == 105 && rVar.v() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw J.a((RuntimeException) null, "expected characters 'vorbis'");
        }
    }
}
