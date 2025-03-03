package K2;

import B2.e;
import E2.g;
import H3.P;
import W2.f;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import u.C1477r;

public final class m implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f2617a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2618b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(l lVar, g gVar) {
        boolean z;
        byte[] bArr;
        try {
            int I8 = lVar.I();
            if ((I8 & 65496) == 65496 || I8 == 19789 || I8 == 18761) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + I8);
                }
                return -1;
            }
            int g8 = g(lVar);
            if (g8 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) gVar.d(byte[].class, g8);
            int h5 = h(lVar, bArr, g8);
            gVar.h(bArr);
            return h5;
        } catch (k unused) {
            return -1;
        } catch (Throwable th) {
            gVar.h(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser$ImageType f(K2.l r8) {
        /*
            int r0 = r8.I()     // Catch:{ k -> 0x0102 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG     // Catch:{ k -> 0x0102 }
            return r8
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r8.q()     // Catch:{ k -> 0x0102 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF     // Catch:{ k -> 0x0102 }
            return r8
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r8.q()     // Catch:{ k -> 0x0102 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r8.skip(r0)     // Catch:{ k -> 0x0102 }
            short r8 = r8.q()     // Catch:{ k -> 0x0039 }
            r0 = 3
            if (r8 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A     // Catch:{ k -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ k -> 0x0039 }
        L_0x0038:
            return r8
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ k -> 0x0102 }
            return r8
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            r2 = 4
            if (r0 == r1) goto L_0x00a1
            int r1 = r8.I()     // Catch:{ k -> 0x0102 }
            int r1 = r1 << 16
            int r4 = r8.I()     // Catch:{ k -> 0x0102 }
            r1 = r1 | r4
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            if (r1 == r4) goto L_0x0056
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ k -> 0x0102 }
            goto L_0x00a0
        L_0x0056:
            int r1 = r8.I()     // Catch:{ k -> 0x0102 }
            int r1 = r1 << 16
            int r4 = r8.I()     // Catch:{ k -> 0x0102 }
            r1 = r1 | r4
            r4 = 1635150195(0x61766973, float:2.8409359E20)
            if (r1 != r4) goto L_0x0069
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF     // Catch:{ k -> 0x0102 }
            goto L_0x00a0
        L_0x0069:
            r5 = 1
            r6 = 0
            r7 = 1635150182(0x61766966, float:2.8409336E20)
            if (r1 != r7) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            r8.skip(r2)     // Catch:{ k -> 0x0102 }
            int r0 = r0 + -16
            int r2 = r0 % 4
            if (r2 != 0) goto L_0x0099
        L_0x007c:
            r2 = 5
            if (r6 >= r2) goto L_0x0099
            if (r0 <= 0) goto L_0x0099
            int r2 = r8.I()     // Catch:{ k -> 0x0102 }
            int r2 = r2 << 16
            int r3 = r8.I()     // Catch:{ k -> 0x0102 }
            r2 = r2 | r3
            if (r2 != r4) goto L_0x0091
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF     // Catch:{ k -> 0x0102 }
            goto L_0x00a0
        L_0x0091:
            if (r2 != r7) goto L_0x0094
            r1 = 1
        L_0x0094:
            int r6 = r6 + 1
            int r0 = r0 + -4
            goto L_0x007c
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.AVIF     // Catch:{ k -> 0x0102 }
            goto L_0x00a0
        L_0x009e:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ k -> 0x0102 }
        L_0x00a0:
            return r8
        L_0x00a1:
            r8.skip(r2)     // Catch:{ k -> 0x0102 }
            int r0 = r8.I()     // Catch:{ k -> 0x0102 }
            int r0 = r0 << 16
            int r1 = r8.I()     // Catch:{ k -> 0x0102 }
            r0 = r0 | r1
            r1 = 1464156752(0x57454250, float:2.16888601E14)
            if (r0 == r1) goto L_0x00b7
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ k -> 0x0102 }
            return r8
        L_0x00b7:
            int r0 = r8.I()     // Catch:{ k -> 0x0102 }
            int r0 = r0 << 16
            int r1 = r8.I()     // Catch:{ k -> 0x0102 }
            r0 = r0 | r1
            r1 = r0 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r4) goto L_0x00cc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ k -> 0x0102 }
            return r8
        L_0x00cc:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 88
            if (r0 != r1) goto L_0x00ea
            r8.skip(r2)     // Catch:{ k -> 0x0102 }
            short r8 = r8.q()     // Catch:{ k -> 0x0102 }
            r0 = r8 & 2
            if (r0 == 0) goto L_0x00e0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP     // Catch:{ k -> 0x0102 }
            return r8
        L_0x00e0:
            r8 = r8 & 16
            if (r8 == 0) goto L_0x00e7
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch:{ k -> 0x0102 }
            return r8
        L_0x00e7:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ k -> 0x0102 }
            return r8
        L_0x00ea:
            r1 = 76
            if (r0 != r1) goto L_0x00ff
            r8.skip(r2)     // Catch:{ k -> 0x0102 }
            short r8 = r8.q()     // Catch:{ k -> 0x0102 }
            r8 = r8 & 8
            if (r8 == 0) goto L_0x00fc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch:{ k -> 0x0102 }
            goto L_0x00fe
        L_0x00fc:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ k -> 0x0102 }
        L_0x00fe:
            return r8
        L_0x00ff:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ k -> 0x0102 }
            return r8
        L_0x0102:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.m.f(K2.l):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public static int g(l lVar) {
        short q7;
        int I8;
        long j7;
        long skip;
        do {
            short q8 = lVar.q();
            if (q8 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + q8);
                }
                return -1;
            }
            q7 = lVar.q();
            if (q7 == 218) {
                return -1;
            }
            if (q7 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            I8 = lVar.I() - 2;
            if (q7 == 225) {
                return I8;
            }
            j7 = (long) I8;
            skip = lVar.skip(j7);
        } while (skip == j7);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder e = C1477r.e("Unable to skip enough data, type: ", q7, ", wanted to skip: ", I8, ", but actually skipped: ");
            e.append(skip);
            Log.d("DfltImageHeaderParser", e.toString());
        }
        return -1;
    }

    public static int h(l lVar, byte[] bArr, int i) {
        boolean z;
        ByteOrder byteOrder;
        int i8;
        int i9;
        byte[] bArr2 = bArr;
        int i10 = i;
        int U8 = lVar.U(i10, bArr2);
        if (U8 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + U8);
            }
            return -1;
        }
        short s8 = 1;
        int i11 = 0;
        byte[] bArr3 = f2617a;
        if (bArr2 == null || i10 <= bArr3.length) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i12 = 0;
            while (true) {
                if (i12 >= bArr3.length) {
                    break;
                } else if (bArr2[i12] != bArr3[i12]) {
                    z = false;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (z) {
            j jVar = new j(i10, bArr2);
            short d8 = jVar.d(6);
            if (d8 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (d8 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + d8);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            ByteBuffer byteBuffer = jVar.f2616V;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                i8 = byteBuffer.getInt(10);
            } else {
                i8 = -1;
            }
            short d9 = jVar.d(i8 + 6);
            while (i11 < d9) {
                int i13 = (i11 * 12) + i8 + 8;
                short d10 = jVar.d(i13);
                if (d10 == 274) {
                    short d11 = jVar.d(i13 + 2);
                    if (d11 >= s8 && d11 <= 12) {
                        int i14 = i13 + 4;
                        if (byteBuffer.remaining() - i14 >= 4) {
                            i9 = byteBuffer.getInt(i14);
                        } else {
                            i9 = -1;
                        }
                        if (i9 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder e = C1477r.e("Got tagIndex=", i11, " tagType=", d10, " formatCode=");
                                e.append(d11);
                                e.append(" componentCount=");
                                e.append(i9);
                                Log.d("DfltImageHeaderParser", e.toString());
                            }
                            int i15 = i9 + f2618b[d11];
                            if (i15 <= 4) {
                                int i16 = i13 + 8;
                                if (i16 < 0 || i16 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i16 + " tagType=" + d10);
                                    }
                                } else if (i15 >= 0 && i15 + i16 <= byteBuffer.remaining()) {
                                    return jVar.d(i16);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + d10);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + d11);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + d11);
                    }
                }
                i11++;
                s8 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        f.c(byteBuffer, "Argument must not be null");
        return f(new j(0, byteBuffer));
    }

    public final int b(ByteBuffer byteBuffer, g gVar) {
        j jVar = new j(0, byteBuffer);
        f.c(gVar, "Argument must not be null");
        return e(jVar, gVar);
    }

    public final int c(InputStream inputStream, g gVar) {
        P p3 = new P((Object) inputStream);
        f.c(gVar, "Argument must not be null");
        return e(p3, gVar);
    }

    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return f(new P((Object) inputStream));
    }
}
