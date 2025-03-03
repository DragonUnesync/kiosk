package S5;

import e6.C0847f;
import e6.C0851j;
import e6.C0852k;
import e6.r;
import f6.C0934y;
import g6.B;
import g6.C0984q;
import g6.Y;
import g6.n0;
import g6.p0;
import h6.C1082c;
import h6.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Locale;
import u.C1477r;

/* renamed from: S5.y  reason: case insensitive filesystem */
public abstract class C0206y {
    private static final C0934y BYTE_ARRAYS = new C0191q();
    static final C0187o DEFAULT_ALLOCATOR;
    private static final C0851j FIND_NON_ASCII = new r();
    private static final int MAX_BYTES_PER_CHAR_UTF8 = ((int) C0852k.encoder(C0852k.UTF_8).maxBytesPerChar());
    private static final int MAX_CHAR_BUFFER_SIZE;
    /* access modifiers changed from: private */
    public static final int THREAD_LOCAL_BUFFER_SIZE;
    private static final C1082c logger;

    static {
        String str;
        C0187o oVar;
        C1082c instance = d.getInstance((Class<?>) C0206y.class);
        logger = instance;
        if (Y.isAndroid()) {
            str = "unpooled";
        } else {
            str = "pooled";
        }
        String trim = p0.get("io.netty.allocator.type", str).toLowerCase(Locale.US).trim();
        if ("unpooled".equals(trim)) {
            oVar = L0.DEFAULT;
            instance.debug("-Dio.netty.allocator.type: {}", (Object) trim);
        } else if ("pooled".equals(trim)) {
            oVar = C0176i0.DEFAULT;
            instance.debug("-Dio.netty.allocator.type: {}", (Object) trim);
        } else {
            oVar = C0176i0.DEFAULT;
            instance.debug("-Dio.netty.allocator.type: pooled (unknown: {})", (Object) trim);
        }
        DEFAULT_ALLOCATOR = oVar;
        int i = p0.getInt("io.netty.threadLocalDirectBufferSize", 0);
        THREAD_LOCAL_BUFFER_SIZE = i;
        instance.debug("-Dio.netty.threadLocalDirectBufferSize: {}", (Object) Integer.valueOf(i));
        int i8 = p0.getInt("io.netty.maxThreadLocalCharBufferSize", 16384);
        MAX_CHAR_BUFFER_SIZE = i8;
        instance.debug("-Dio.netty.maxThreadLocalCharBufferSize: {}", (Object) Integer.valueOf(i8));
    }

    public static int compare(C0185n nVar, C0185n nVar2) {
        long j7;
        boolean z = false;
        if (nVar == nVar2) {
            return 0;
        }
        int readableBytes = nVar.readableBytes();
        int readableBytes2 = nVar2.readableBytes();
        int min = Math.min(readableBytes, readableBytes2);
        int i = min >>> 2;
        int i8 = min & 3;
        int readerIndex = nVar.readerIndex();
        int readerIndex2 = nVar2.readerIndex();
        if (i > 0) {
            if (nVar.order() == ByteOrder.BIG_ENDIAN) {
                z = true;
            }
            int i9 = i << 2;
            if (nVar.order() == nVar2.order()) {
                if (z) {
                    j7 = compareUintBigEndian(nVar, nVar2, readerIndex, readerIndex2, i9);
                } else {
                    j7 = compareUintLittleEndian(nVar, nVar2, readerIndex, readerIndex2, i9);
                }
            } else if (z) {
                j7 = compareUintBigEndianA(nVar, nVar2, readerIndex, readerIndex2, i9);
            } else {
                j7 = compareUintBigEndianB(nVar, nVar2, readerIndex, readerIndex2, i9);
            }
            if (j7 != 0) {
                return (int) Math.min(2147483647L, Math.max(-2147483648L, j7));
            }
            readerIndex += i9;
            readerIndex2 += i9;
        }
        int i10 = i8 + readerIndex;
        while (readerIndex < i10) {
            int unsignedByte = nVar.getUnsignedByte(readerIndex) - nVar2.getUnsignedByte(readerIndex2);
            if (unsignedByte != 0) {
                return unsignedByte;
            }
            readerIndex++;
            readerIndex2++;
        }
        return readableBytes - readableBytes2;
    }

    private static long compareUintBigEndian(C0185n nVar, C0185n nVar2, int i, int i8, int i9) {
        int i10 = i9 + i;
        while (i < i10) {
            long unsignedInt = nVar.getUnsignedInt(i) - nVar2.getUnsignedInt(i8);
            if (unsignedInt != 0) {
                return unsignedInt;
            }
            i += 4;
            i8 += 4;
        }
        return 0;
    }

    private static long compareUintBigEndianA(C0185n nVar, C0185n nVar2, int i, int i8, int i9) {
        int i10 = i9 + i;
        while (i < i10) {
            long unsignedInt = nVar.getUnsignedInt(i) - uintFromLE(nVar2.getUnsignedIntLE(i8));
            if (unsignedInt != 0) {
                return unsignedInt;
            }
            i += 4;
            i8 += 4;
        }
        return 0;
    }

    private static long compareUintBigEndianB(C0185n nVar, C0185n nVar2, int i, int i8, int i9) {
        int i10 = i9 + i;
        while (i < i10) {
            long uintFromLE = uintFromLE(nVar.getUnsignedIntLE(i)) - nVar2.getUnsignedInt(i8);
            if (uintFromLE != 0) {
                return uintFromLE;
            }
            i += 4;
            i8 += 4;
        }
        return 0;
    }

    private static long compareUintLittleEndian(C0185n nVar, C0185n nVar2, int i, int i8, int i9) {
        int i10 = i9 + i;
        while (i < i10) {
            long uintFromLE = uintFromLE(nVar.getUnsignedIntLE(i)) - uintFromLE(nVar2.getUnsignedIntLE(i8));
            if (uintFromLE != 0) {
                return uintFromLE;
            }
            i += 4;
            i8 += 4;
        }
        return 0;
    }

    public static void copy(C0847f fVar, C0185n nVar) {
        copy(fVar, 0, nVar, fVar.length());
    }

    public static String decodeString(C0185n nVar, int i, int i8, Charset charset) {
        int i9;
        byte[] bArr;
        if (i8 == 0) {
            return "";
        }
        if (nVar.hasArray()) {
            bArr = nVar.array();
            i9 = nVar.arrayOffset() + i;
        } else {
            bArr = threadLocalTempArray(i8);
            nVar.getBytes(i, bArr, 0, i8);
            i9 = 0;
        }
        if (C0852k.US_ASCII.equals(charset)) {
            return new String(bArr, 0, i9, i8);
        }
        return new String(bArr, i9, i8, charset);
    }

    public static C0185n ensureAccessible(C0185n nVar) {
        if (nVar.isAccessible()) {
            return nVar;
        }
        throw new r(nVar.refCnt());
    }

    public static boolean ensureWritableSuccess(int i) {
        if (i == 0 || i == 2) {
            return true;
        }
        return false;
    }

    public static boolean equals(C0185n nVar, int i, C0185n nVar2, int i8, int i9) {
        B.checkNotNull(nVar, "a");
        B.checkNotNull(nVar2, "b");
        B.checkPositiveOrZero(i, "aStartIndex");
        B.checkPositiveOrZero(i8, "bStartIndex");
        B.checkPositiveOrZero(i9, "length");
        if (nVar.writerIndex() - i9 < i || nVar2.writerIndex() - i9 < i8) {
            return false;
        }
        int i10 = i9 >>> 3;
        if (nVar.order() == nVar2.order()) {
            while (i10 > 0) {
                if (nVar.getLong(i) != nVar2.getLong(i8)) {
                    return false;
                }
                i += 8;
                i8 += 8;
                i10--;
            }
        } else {
            while (i10 > 0) {
                if (nVar.getLong(i) != swapLong(nVar2.getLong(i8))) {
                    return false;
                }
                i += 8;
                i8 += 8;
                i10--;
            }
        }
        for (int i11 = i9 & 7; i11 > 0; i11--) {
            if (nVar.getByte(i) != nVar2.getByte(i8)) {
                return false;
            }
            i++;
            i8++;
        }
        return true;
    }

    public static int firstIndexOf(C0159a aVar, int i, int i8, byte b8) {
        boolean z;
        long j7;
        int max = Math.max(i, 0);
        if (max < i8 && aVar.capacity() != 0) {
            int i9 = i8 - max;
            aVar.checkIndex(max, i9);
            if (!Y.isUnaligned()) {
                return linearFirstIndexOf(aVar, max, i8, b8);
            }
            int i10 = i9 & 7;
            if (i10 > 0) {
                int unrolledFirstIndexOf = unrolledFirstIndexOf(aVar, max, i10, b8);
                if (unrolledFirstIndexOf != -1) {
                    return unrolledFirstIndexOf;
                }
                max += i10;
                if (max == i8) {
                    return -1;
                }
            }
            int i11 = i9 >>> 3;
            ByteOrder nativeOrder = ByteOrder.nativeOrder();
            boolean z6 = true;
            if (nativeOrder == aVar.order()) {
                z = true;
            } else {
                z = false;
            }
            if (nativeOrder != ByteOrder.LITTLE_ENDIAN) {
                z6 = false;
            }
            long access$200 = C0196t.compilePattern(b8);
            for (int i12 = 0; i12 < i11; i12++) {
                if (z6) {
                    j7 = aVar._getLongLE(max);
                } else {
                    j7 = aVar._getLong(max);
                }
                int access$300 = C0196t.firstAnyPattern(j7, access$200, z);
                if (access$300 < 8) {
                    return max + access$300;
                }
                max += 8;
            }
        }
        return -1;
    }

    public static int hashCode(C0185n nVar) {
        int i;
        int readableBytes = nVar.readableBytes();
        int i8 = readableBytes >>> 2;
        int i9 = readableBytes & 3;
        int readerIndex = nVar.readerIndex();
        if (nVar.order() == ByteOrder.BIG_ENDIAN) {
            i = 1;
            while (i8 > 0) {
                i = (i * 31) + nVar.getInt(readerIndex);
                readerIndex += 4;
                i8--;
            }
        } else {
            int i10 = 1;
            while (i8 > 0) {
                i10 = (i * 31) + swapInt(nVar.getInt(readerIndex));
                readerIndex += 4;
                i8--;
            }
        }
        while (i9 > 0) {
            i = (i * 31) + nVar.getByte(readerIndex);
            i9--;
            readerIndex++;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public static String hexDump(C0185n nVar) {
        return hexDump(nVar, nVar.readerIndex(), nVar.readableBytes());
    }

    public static boolean isAccessible(C0185n nVar) {
        return nVar.isAccessible();
    }

    public static int lastIndexOf(C0159a aVar, int i, int i8, byte b8) {
        int capacity = aVar.capacity();
        int min = Math.min(i, capacity);
        if (min >= 0 && capacity != 0) {
            aVar.checkIndex(i8, min - i8);
            for (int i9 = min - 1; i9 >= i8; i9--) {
                if (aVar._getByte(i9) == b8) {
                    return i9;
                }
            }
        }
        return -1;
    }

    private static int linearFirstIndexOf(C0159a aVar, int i, int i8, byte b8) {
        while (i < i8) {
            if (aVar._getByte(i) == b8) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static C0185n readBytes(C0187o oVar, C0185n nVar, int i) {
        C0185n buffer = ((C0163c) oVar).buffer(i);
        try {
            nVar.readBytes(buffer);
            return buffer;
        } catch (Throwable th) {
            buffer.release();
            throw th;
        }
    }

    private static int safeArrayWriteUtf8(byte[] bArr, int i, CharSequence charSequence, int i8, int i9) {
        int i10 = i;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            char charAt = charSequence.charAt(i8);
            if (charAt < 128) {
                bArr[i10] = (byte) charAt;
                i10++;
            } else if (charAt < 2048) {
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((charAt >> 6) | 192);
                i10 += 2;
                bArr[i11] = (byte) ((charAt & '?') | 128);
            } else {
                char c8 = '?';
                if (!n0.isSurrogate(charAt)) {
                    bArr[i10] = (byte) ((charAt >> 12) | 224);
                    int i12 = i10 + 2;
                    bArr[i10 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    i10 += 3;
                    bArr[i12] = (byte) ((charAt & '?') | 128);
                } else if (!Character.isHighSurrogate(charAt)) {
                    bArr[i10] = 63;
                    i10++;
                } else {
                    i8++;
                    if (i8 == i9) {
                        bArr[i10] = 63;
                        i10++;
                        break;
                    }
                    char charAt2 = charSequence.charAt(i8);
                    if (!Character.isLowSurrogate(charAt2)) {
                        int i13 = i10 + 1;
                        bArr[i10] = 63;
                        i10 += 2;
                        if (!Character.isHighSurrogate(charAt2)) {
                            c8 = charAt2;
                        }
                        bArr[i13] = (byte) c8;
                    } else {
                        int codePoint = Character.toCodePoint(charAt, charAt2);
                        bArr[i10] = (byte) ((codePoint >> 18) | 240);
                        bArr[i10 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
                        int i14 = i10 + 3;
                        bArr[i10 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
                        i10 += 4;
                        bArr[i14] = (byte) ((codePoint & 63) | 128);
                    }
                }
            }
            i8++;
        }
        return i10 - i;
    }

    private static int safeDirectWriteUtf8(ByteBuffer byteBuffer, int i, CharSequence charSequence, int i8, int i9) {
        int i10 = i;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            char charAt = charSequence.charAt(i8);
            if (charAt < 128) {
                byteBuffer.put(i10, (byte) charAt);
                i10++;
            } else if (charAt < 2048) {
                int i11 = i10 + 1;
                byteBuffer.put(i10, (byte) ((charAt >> 6) | 192));
                i10 += 2;
                byteBuffer.put(i11, (byte) ((charAt & '?') | 128));
            } else {
                byte b8 = 63;
                if (!n0.isSurrogate(charAt)) {
                    byteBuffer.put(i10, (byte) ((charAt >> 12) | 224));
                    int i12 = i10 + 2;
                    byteBuffer.put(i10 + 1, (byte) ((63 & (charAt >> 6)) | 128));
                    i10 += 3;
                    byteBuffer.put(i12, (byte) ((charAt & '?') | 128));
                } else if (!Character.isHighSurrogate(charAt)) {
                    byteBuffer.put(i10, (byte) 63);
                    i10++;
                } else {
                    i8++;
                    if (i8 == i9) {
                        byteBuffer.put(i10, (byte) 63);
                        i10++;
                        break;
                    }
                    char charAt2 = charSequence.charAt(i8);
                    if (!Character.isLowSurrogate(charAt2)) {
                        int i13 = i10 + 1;
                        byteBuffer.put(i10, (byte) 63);
                        i10 += 2;
                        if (!Character.isHighSurrogate(charAt2)) {
                            b8 = (byte) charAt2;
                        }
                        byteBuffer.put(i13, b8);
                    } else {
                        int codePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put(i10, (byte) ((codePoint >> 18) | 240));
                        byteBuffer.put(i10 + 1, (byte) (((codePoint >> 12) & 63) | 128));
                        int i14 = i10 + 3;
                        byteBuffer.put(i10 + 2, (byte) (((codePoint >> 6) & 63) | 128));
                        i10 += 4;
                        byteBuffer.put(i14, (byte) ((codePoint & 63) | 128));
                    }
                }
            }
            i8++;
        }
        return i10 - i;
    }

    private static int safeWriteUtf8(C0159a aVar, int i, CharSequence charSequence, int i8, int i9) {
        int i10 = i;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            char charAt = charSequence.charAt(i8);
            if (charAt < 128) {
                aVar._setByte(i10, (byte) charAt);
                i10++;
            } else if (charAt < 2048) {
                int i11 = i10 + 1;
                aVar._setByte(i10, (byte) ((charAt >> 6) | 192));
                i10 += 2;
                aVar._setByte(i11, (byte) ((charAt & '?') | 128));
            } else {
                char c8 = '?';
                if (!n0.isSurrogate(charAt)) {
                    aVar._setByte(i10, (byte) ((charAt >> 12) | 224));
                    int i12 = i10 + 2;
                    aVar._setByte(i10 + 1, (byte) ((63 & (charAt >> 6)) | 128));
                    i10 += 3;
                    aVar._setByte(i12, (byte) ((charAt & '?') | 128));
                } else if (!Character.isHighSurrogate(charAt)) {
                    aVar._setByte(i10, 63);
                    i10++;
                } else {
                    i8++;
                    if (i8 == i9) {
                        aVar._setByte(i10, 63);
                        i10++;
                        break;
                    }
                    char charAt2 = charSequence.charAt(i8);
                    if (!Character.isLowSurrogate(charAt2)) {
                        int i13 = i10 + 1;
                        aVar._setByte(i10, 63);
                        i10 += 2;
                        if (!Character.isHighSurrogate(charAt2)) {
                            c8 = charAt2;
                        }
                        aVar._setByte(i13, c8);
                    } else {
                        int codePoint = Character.toCodePoint(charAt, charAt2);
                        aVar._setByte(i10, (byte) ((codePoint >> 18) | 240));
                        aVar._setByte(i10 + 1, (byte) (((codePoint >> 12) & 63) | 128));
                        int i14 = i10 + 3;
                        aVar._setByte(i10 + 2, (byte) (((codePoint >> 6) & 63) | 128));
                        i10 += 4;
                        aVar._setByte(i14, (byte) ((codePoint & 63) | 128));
                    }
                }
            }
            i8++;
        }
        return i10 - i;
    }

    public static C0185n setShortBE(C0185n nVar, int i, int i8) {
        if (nVar.order() == ByteOrder.BIG_ENDIAN) {
            return nVar.setShort(i, i8);
        }
        return nVar.setShort(i, swapShort((short) i8));
    }

    public static int swapInt(int i) {
        return Integer.reverseBytes(i);
    }

    public static long swapLong(long j7) {
        return Long.reverseBytes(j7);
    }

    public static int swapMedium(int i) {
        int i8 = ((i >>> 16) & 255) | ((i << 16) & 16711680) | (65280 & i);
        if ((8388608 & i8) != 0) {
            return i8 | -16777216;
        }
        return i8;
    }

    public static short swapShort(short s8) {
        return Short.reverseBytes(s8);
    }

    public static C0185n threadLocalDirectBuffer() {
        if (THREAD_LOCAL_BUFFER_SIZE <= 0) {
            return null;
        }
        if (Y.hasUnsafe()) {
            return C0204x.newInstance();
        }
        return C0200v.newInstance();
    }

    public static byte[] threadLocalTempArray(int i) {
        if (i <= 1024) {
            return (byte[]) BYTE_ARRAYS.get();
        }
        return Y.allocateUninitializedArray(i);
    }

    private static long uintFromLE(long j7) {
        return Long.reverseBytes(j7) >>> 32;
    }

    private static int unrolledFirstIndexOf(C0159a aVar, int i, int i8, byte b8) {
        if (aVar._getByte(i) == b8) {
            return i;
        }
        if (i8 == 1) {
            return -1;
        }
        int i9 = i + 1;
        if (aVar._getByte(i9) == b8) {
            return i9;
        }
        if (i8 == 2) {
            return -1;
        }
        int i10 = i + 2;
        if (aVar._getByte(i10) == b8) {
            return i10;
        }
        if (i8 == 3) {
            return -1;
        }
        int i11 = i + 3;
        if (aVar._getByte(i11) == b8) {
            return i11;
        }
        if (i8 == 4) {
            return -1;
        }
        int i12 = i + 4;
        if (aVar._getByte(i12) == b8) {
            return i12;
        }
        if (i8 == 5) {
            return -1;
        }
        int i13 = i + 5;
        if (aVar._getByte(i13) == b8) {
            return i13;
        }
        if (i8 == 6) {
            return -1;
        }
        int i14 = i + 6;
        if (aVar._getByte(i14) == b8) {
            return i14;
        }
        return -1;
    }

    private static int unsafeWriteUtf8(byte[] bArr, long j7, int i, CharSequence charSequence, int i8, int i9) {
        long j8;
        byte[] bArr2 = bArr;
        CharSequence charSequence2 = charSequence;
        int i10 = i9;
        long j9 = j7 + ((long) i);
        int i11 = i8;
        long j10 = j9;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            char charAt = charSequence2.charAt(i11);
            if (charAt < 128) {
                j8 = 1 + j10;
                Y.putByte((Object) bArr2, j10, (byte) charAt);
            } else {
                if (charAt < 2048) {
                    long j11 = 1 + j10;
                    Y.putByte((Object) bArr2, j10, (byte) ((charAt >> 6) | 192));
                    j10 += 2;
                    Y.putByte((Object) bArr2, j11, (byte) ((charAt & '?') | 128));
                } else {
                    char c8 = '?';
                    if (!n0.isSurrogate(charAt)) {
                        Y.putByte((Object) bArr2, j10, (byte) ((charAt >> 12) | 224));
                        long j12 = 2 + j10;
                        Y.putByte((Object) bArr2, 1 + j10, (byte) (((charAt >> 6) & 63) | 128));
                        j10 += 3;
                        Y.putByte((Object) bArr2, j12, (byte) ((charAt & '?') | 128));
                    } else if (!Character.isHighSurrogate(charAt)) {
                        j8 = 1 + j10;
                        Y.putByte((Object) bArr2, j10, (byte) 63);
                    } else {
                        i11++;
                        if (i11 == i10) {
                            Y.putByte((Object) bArr2, j10, (byte) 63);
                            j10 = 1 + j10;
                            break;
                        }
                        char charAt2 = charSequence2.charAt(i11);
                        if (!Character.isLowSurrogate(charAt2)) {
                            long j13 = 1 + j10;
                            Y.putByte((Object) bArr2, j10, (byte) 63);
                            j10 += 2;
                            if (!Character.isHighSurrogate(charAt2)) {
                                c8 = charAt2;
                            }
                            Y.putByte((Object) bArr2, j13, (byte) c8);
                        } else {
                            int codePoint = Character.toCodePoint(charAt, charAt2);
                            Y.putByte((Object) bArr2, j10, (byte) ((codePoint >> 18) | 240));
                            Y.putByte((Object) bArr2, 1 + j10, (byte) (((codePoint >> 12) & 63) | 128));
                            long j14 = 3 + j10;
                            Y.putByte((Object) bArr2, 2 + j10, (byte) (((codePoint >> 6) & 63) | 128));
                            j10 += 4;
                            Y.putByte((Object) bArr2, j14, (byte) ((codePoint & 63) | 128));
                        }
                    }
                }
                i11++;
            }
            j10 = j8;
            i11++;
        }
        return (int) (j10 - j9);
    }

    public static int utf8MaxBytes(int i) {
        return i * MAX_BYTES_PER_CHAR_UTF8;
    }

    public static int writeAscii(C0159a aVar, int i, CharSequence charSequence, int i8) {
        if (charSequence instanceof C0847f) {
            writeAsciiString(aVar, i, (C0847f) charSequence, 0, i8);
        } else {
            writeAsciiCharSequence(aVar, i, charSequence, i8);
        }
        return i8;
    }

    private static int writeAsciiCharSequence(C0159a aVar, int i, CharSequence charSequence, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            aVar._setByte(i, C0847f.c2b(charSequence.charAt(i9)));
            i9++;
            i++;
        }
        return i8;
    }

    public static void writeAsciiString(C0159a aVar, int i, C0847f fVar, int i8, int i9) {
        int arrayOffset = fVar.arrayOffset() + i8;
        int i10 = i9 - i8;
        if (Y.hasUnsafe()) {
            if (aVar.hasArray()) {
                Y.copyMemory(fVar.array(), arrayOffset, aVar.array(), aVar.arrayOffset() + i, (long) i10);
                return;
            } else if (aVar.hasMemoryAddress()) {
                Y.copyMemory(fVar.array(), arrayOffset, aVar.memoryAddress() + ((long) i), (long) i10);
                return;
            }
        }
        if (aVar.hasArray()) {
            System.arraycopy(fVar.array(), arrayOffset, aVar.array(), aVar.arrayOffset() + i, i10);
        } else {
            aVar.setBytes(i, fVar.array(), arrayOffset, i10);
        }
    }

    public static C0185n writeMediumBE(C0185n nVar, int i) {
        if (nVar.order() == ByteOrder.BIG_ENDIAN) {
            return nVar.writeMedium(i);
        }
        return nVar.writeMedium(swapMedium(i));
    }

    public static C0185n writeShortBE(C0185n nVar, int i) {
        if (nVar.order() == ByteOrder.BIG_ENDIAN) {
            return nVar.writeShort(i);
        }
        return nVar.writeShort(swapShort((short) i));
    }

    public static int writeUtf8(C0159a aVar, int i, int i8, CharSequence charSequence, int i9) {
        return writeUtf8(aVar, i, i8, charSequence, 0, i9);
    }

    public static void copy(C0847f fVar, int i, C0185n nVar, int i8, int i9) {
        if (!C0984q.isOutOfBounds(i, i9, fVar.length())) {
            ((C0185n) B.checkNotNull(nVar, "dst")).setBytes(i8, fVar.array(), fVar.arrayOffset() + i, i9);
            return;
        }
        StringBuilder e = C1477r.e("expected: 0 <= srcIdx(", i, ") <= srcIdx + length(", i9, ") <= srcLen(");
        e.append(fVar.length());
        e.append(')');
        throw new IndexOutOfBoundsException(e.toString());
    }

    public static String hexDump(C0185n nVar, int i, int i8) {
        return C0194s.hexDump(nVar, i, i8);
    }

    public static int utf8MaxBytes(CharSequence charSequence) {
        if (charSequence instanceof C0847f) {
            return charSequence.length();
        }
        return utf8MaxBytes(charSequence.length());
    }

    public static int writeUtf8(C0159a aVar, int i, int i8, CharSequence charSequence, int i9, int i10) {
        if (charSequence instanceof C0847f) {
            writeAsciiString(aVar, i, (C0847f) charSequence, i9, i10);
            return i10 - i9;
        }
        if (Y.hasUnsafe()) {
            if (aVar.hasArray()) {
                return unsafeWriteUtf8(aVar.array(), Y.byteArrayBaseOffset(), aVar.arrayOffset() + i, charSequence, i9, i10);
            }
            if (aVar.hasMemoryAddress()) {
                return unsafeWriteUtf8((byte[]) null, aVar.memoryAddress(), i, charSequence, i9, i10);
            }
        } else if (aVar.hasArray()) {
            return safeArrayWriteUtf8(aVar.array(), aVar.arrayOffset() + i, charSequence, i9, i10);
        } else {
            if (aVar.isDirect()) {
                ByteBuffer internalNioBuffer = aVar.internalNioBuffer(i, i8);
                return safeDirectWriteUtf8(internalNioBuffer, internalNioBuffer.position(), charSequence, i9, i10);
            }
        }
        return safeWriteUtf8(aVar, i, charSequence, i9, i10);
    }

    public static String hexDump(byte[] bArr, int i, int i8) {
        return C0194s.hexDump(bArr, i, i8);
    }

    public static boolean equals(C0185n nVar, C0185n nVar2) {
        if (nVar == nVar2) {
            return true;
        }
        int readableBytes = nVar.readableBytes();
        if (readableBytes != nVar2.readableBytes()) {
            return false;
        }
        return equals(nVar, nVar.readerIndex(), nVar2, nVar2.readerIndex(), readableBytes);
    }

    public static void copy(C0847f fVar, int i, C0185n nVar, int i8) {
        if (!C0984q.isOutOfBounds(i, i8, fVar.length())) {
            ((C0185n) B.checkNotNull(nVar, "dst")).writeBytes(fVar.array(), fVar.arrayOffset() + i, i8);
            return;
        }
        StringBuilder e = C1477r.e("expected: 0 <= srcIdx(", i, ") <= srcIdx + length(", i8, ") <= srcLen(");
        e.append(fVar.length());
        e.append(')');
        throw new IndexOutOfBoundsException(e.toString());
    }
}
