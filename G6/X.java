package g6;

import h6.C1082c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

public abstract class X {
    private static final long ADDRESS_FIELD_OFFSET;
    private static final Method ALIGN_SLICE;
    private static final Method ALLOCATE_ARRAY_METHOD;
    private static final long BYTE_ARRAY_BASE_OFFSET;
    private static final Constructor<?> DIRECT_BUFFER_CONSTRUCTOR;
    private static final Throwable EXPLICIT_NO_UNSAFE_CAUSE;
    private static final Object INTERNAL_UNSAFE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    private static final boolean IS_ANDROID = isAndroid0();
    private static final boolean IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE = explicitTryReflectionSetAccessible0();
    private static final int JAVA_VERSION = javaVersion0();
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final boolean RUNNING_IN_NATIVE_IMAGE = p0.contains("org.graalvm.nativeimage.imagecode");
    private static final boolean STORE_FENCE_AVAILABLE;
    private static final boolean UNALIGNED;
    static final Unsafe UNSAFE;
    private static final Throwable UNSAFE_UNAVAILABILITY_CAUSE;
    private static final C1082c logger;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0276  */
    static {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.Class<g6.X> r3 = g6.X.class
            h6.c r3 = h6.d.getInstance((java.lang.Class<?>) r3)
            logger = r3
            java.lang.Throwable r4 = explicitNoUnsafeCause0()
            EXPLICIT_NO_UNSAFE_CAUSE = r4
            int r5 = javaVersion0()
            JAVA_VERSION = r5
            boolean r5 = isAndroid0()
            IS_ANDROID = r5
            java.lang.String r5 = "org.graalvm.nativeimage.imagecode"
            boolean r5 = g6.p0.contains(r5)
            RUNNING_IN_NATIVE_IMAGE = r5
            boolean r5 = explicitTryReflectionSetAccessible0()
            IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE = r5
            r5 = 1
            java.lang.Class<byte[]> r7 = byte[].class
            r8 = 0
            if (r4 == 0) goto L_0x0038
            r9 = r8
            r10 = r9
            r12 = r10
            r11 = 0
            goto L_0x0113
        L_0x0038:
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocateDirect(r2)
            g6.N r10 = new g6.N
            r10.<init>()
            java.lang.Object r10 = java.security.AccessController.doPrivileged(r10)
            boolean r11 = r10 instanceof java.lang.Throwable
            if (r11 == 0) goto L_0x0063
            r4 = r10
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r10 = r3.isTraceEnabled()
            if (r10 == 0) goto L_0x0058
            java.lang.String r10 = "sun.misc.Unsafe.theUnsafe: unavailable"
            r3.debug((java.lang.String) r10, (java.lang.Throwable) r4)
            goto L_0x0061
        L_0x0058:
            java.lang.String r10 = "sun.misc.Unsafe.theUnsafe: unavailable: {}"
            java.lang.String r11 = r4.getMessage()
            r3.debug((java.lang.String) r10, (java.lang.Object) r11)
        L_0x0061:
            r10 = r8
            goto L_0x006a
        L_0x0063:
            sun.misc.Unsafe r10 = (sun.misc.Unsafe) r10
            java.lang.String r11 = "sun.misc.Unsafe.theUnsafe: available"
            r3.debug(r11)
        L_0x006a:
            if (r10 == 0) goto L_0x0096
            g6.O r11 = new g6.O
            r11.<init>(r10)
            java.lang.Object r11 = java.security.AccessController.doPrivileged(r11)
            if (r11 != 0) goto L_0x007d
            java.lang.String r11 = "sun.misc.Unsafe.copyMemory: available"
            r3.debug(r11)
            goto L_0x0096
        L_0x007d:
            r4 = r11
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r10 = r3.isTraceEnabled()
            if (r10 == 0) goto L_0x008c
            java.lang.String r10 = "sun.misc.Unsafe.copyMemory: unavailable"
            r3.debug((java.lang.String) r10, (java.lang.Throwable) r4)
            goto L_0x0095
        L_0x008c:
            java.lang.String r10 = "sun.misc.Unsafe.copyMemory: unavailable: {}"
            java.lang.String r11 = r4.getMessage()
            r3.debug((java.lang.String) r10, (java.lang.Object) r11)
        L_0x0095:
            r10 = r8
        L_0x0096:
            if (r10 == 0) goto L_0x00c3
            g6.P r11 = new g6.P
            r11.<init>(r10)
            java.lang.Object r11 = java.security.AccessController.doPrivileged(r11)
            if (r11 != 0) goto L_0x00aa
            java.lang.String r11 = "sun.misc.Unsafe.storeFence: available"
            r3.debug(r11)
            r11 = 1
            goto L_0x00c4
        L_0x00aa:
            boolean r12 = r3.isTraceEnabled()
            if (r12 == 0) goto L_0x00b8
            java.lang.String r12 = "sun.misc.Unsafe.storeFence: unavailable"
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            r3.debug((java.lang.String) r12, (java.lang.Throwable) r11)
            goto L_0x00c3
        L_0x00b8:
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.String r11 = r11.getMessage()
            java.lang.String r12 = "sun.misc.Unsafe.storeFence: unavailable: {}"
            r3.debug((java.lang.String) r12, (java.lang.Object) r11)
        L_0x00c3:
            r11 = 0
        L_0x00c4:
            if (r10 == 0) goto L_0x00f6
            g6.Q r12 = new g6.Q
            r12.<init>(r10, r9)
            java.lang.Object r12 = java.security.AccessController.doPrivileged(r12)
            boolean r13 = r12 instanceof java.lang.reflect.Field
            if (r13 == 0) goto L_0x00db
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            java.lang.String r13 = "java.nio.Buffer.address: available"
            r3.debug(r13)
            goto L_0x00f7
        L_0x00db:
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            boolean r4 = r3.isTraceEnabled()
            if (r4 == 0) goto L_0x00e9
            java.lang.String r4 = "java.nio.Buffer.address: unavailable"
            r3.debug((java.lang.String) r4, (java.lang.Throwable) r12)
            goto L_0x00f2
        L_0x00e9:
            java.lang.String r4 = "java.nio.Buffer.address: unavailable: {}"
            java.lang.String r10 = r12.getMessage()
            r3.debug((java.lang.String) r4, (java.lang.Object) r10)
        L_0x00f2:
            r10 = r8
            r4 = r12
            r12 = r10
            goto L_0x00f7
        L_0x00f6:
            r12 = r8
        L_0x00f7:
            if (r10 == 0) goto L_0x0113
            int r13 = r10.arrayIndexScale(r7)
            long r13 = (long) r13
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 == 0) goto L_0x0113
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            java.lang.String r10 = "unsafe.arrayIndexScale is {} (expected: 1). Not using unsafe."
            r3.debug((java.lang.String) r10, (java.lang.Object) r4)
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r10 = "Unexpected unsafe.arrayIndexScale"
            r4.<init>(r10)
            r10 = r8
        L_0x0113:
            UNSAFE_UNAVAILABILITY_CAUSE = r4
            UNSAFE = r10
            r4 = 9
            r13 = -1
            if (r10 != 0) goto L_0x0134
            ADDRESS_FIELD_OFFSET = r13
            BYTE_ARRAY_BASE_OFFSET = r13
            LONG_ARRAY_BASE_OFFSET = r13
            LONG_ARRAY_INDEX_SCALE = r13
            INT_ARRAY_BASE_OFFSET = r13
            INT_ARRAY_INDEX_SCALE = r13
            UNALIGNED = r1
            DIRECT_BUFFER_CONSTRUCTOR = r8
            ALLOCATE_ARRAY_METHOD = r8
            STORE_FENCE_AVAILABLE = r1
            r0 = r8
            goto L_0x028b
        L_0x0134:
            g6.S r15 = new g6.S     // Catch:{ all -> 0x0167 }
            r15.<init>(r9)     // Catch:{ all -> 0x0167 }
            java.lang.Object r9 = java.security.AccessController.doPrivileged(r15)     // Catch:{ all -> 0x0167 }
            boolean r15 = r9 instanceof java.lang.reflect.Constructor     // Catch:{ all -> 0x0167 }
            if (r15 == 0) goto L_0x016b
            long r5 = r10.allocateMemory(r5)     // Catch:{ all -> 0x0167 }
            r10 = r9
            java.lang.reflect.Constructor r10 = (java.lang.reflect.Constructor) r10     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0164, all -> 0x0161 }
            java.lang.Long r15 = java.lang.Long.valueOf(r5)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0164, all -> 0x0161 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0164, all -> 0x0161 }
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0164, all -> 0x0161 }
            r8[r1] = r15     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0164, all -> 0x0161 }
            r8[r2] = r16     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0164, all -> 0x0161 }
            r10.newInstance(r8)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0164, all -> 0x0161 }
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0164, all -> 0x0161 }
            java.lang.String r8 = "direct buffer constructor: available"
            r3.debug(r8)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0164, all -> 0x0161 }
            goto L_0x0186
        L_0x0161:
            r0 = move-exception
            goto L_0x02b5
        L_0x0164:
        L_0x0165:
            r9 = 0
            goto L_0x0186
        L_0x0167:
            r0 = move-exception
            r5 = r13
            goto L_0x02b5
        L_0x016b:
            boolean r5 = r3.isTraceEnabled()     // Catch:{ all -> 0x0167 }
            if (r5 == 0) goto L_0x0179
            java.lang.String r5 = "direct buffer constructor: unavailable"
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x0167 }
            r3.debug((java.lang.String) r5, (java.lang.Throwable) r9)     // Catch:{ all -> 0x0167 }
            goto L_0x0184
        L_0x0179:
            java.lang.String r5 = "direct buffer constructor: unavailable: {}"
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x0167 }
            java.lang.String r6 = r9.getMessage()     // Catch:{ all -> 0x0167 }
            r3.debug((java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0167 }
        L_0x0184:
            r5 = r13
            goto L_0x0165
        L_0x0186:
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x018f
            sun.misc.Unsafe r3 = UNSAFE
            r3.freeMemory(r5)
        L_0x018f:
            DIRECT_BUFFER_CONSTRUCTOR = r9
            long r5 = objectFieldOffset(r12)
            ADDRESS_FIELD_OFFSET = r5
            sun.misc.Unsafe r3 = UNSAFE
            int r5 = r3.arrayBaseOffset(r7)
            long r5 = (long) r5
            BYTE_ARRAY_BASE_OFFSET = r5
            java.lang.Class<int[]> r5 = int[].class
            int r6 = r3.arrayBaseOffset(r5)
            long r6 = (long) r6
            INT_ARRAY_BASE_OFFSET = r6
            int r5 = r3.arrayIndexScale(r5)
            long r5 = (long) r5
            INT_ARRAY_INDEX_SCALE = r5
            java.lang.Class<long[]> r5 = long[].class
            int r6 = r3.arrayBaseOffset(r5)
            long r6 = (long) r6
            LONG_ARRAY_BASE_OFFSET = r6
            int r3 = r3.arrayIndexScale(r5)
            long r5 = (long) r3
            LONG_ARRAY_INDEX_SCALE = r5
            g6.T r3 = new g6.T
            r3.<init>()
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r3)
            boolean r5 = r3 instanceof java.lang.Boolean
            if (r5 == 0) goto L_0x01db
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r5 = r3.booleanValue()
            h6.c r6 = logger
            java.lang.String r7 = "java.nio.Bits.unaligned: available, {}"
            r6.debug((java.lang.String) r7, (java.lang.Object) r3)
            goto L_0x020a
        L_0x01db:
            java.lang.String r5 = "os.arch"
            java.lang.String r6 = ""
            java.lang.String r5 = g6.p0.get(r5, r6)
            java.lang.String r6 = "^(i[3-6]86|x86(_64)?|x64|amd64)$"
            boolean r5 = r5.matches(r6)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            h6.c r6 = logger
            boolean r7 = r6.isTraceEnabled()
            if (r7 == 0) goto L_0x01fd
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            java.lang.String r8 = "java.nio.Bits.unaligned: unavailable, {}"
            r6.debug(r8, r7, r3)
            goto L_0x020a
        L_0x01fd:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            java.lang.String r3 = r3.getMessage()
            java.lang.String r8 = "java.nio.Bits.unaligned: unavailable, {}, {}"
            r6.debug(r8, r7, r3)
        L_0x020a:
            UNALIGNED = r5
            int r3 = javaVersion()
            if (r3 < r4) goto L_0x027e
            g6.U r3 = new g6.U
            r3.<init>()
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r3)
            boolean r5 = r3 instanceof java.lang.Throwable
            if (r5 != 0) goto L_0x0254
            g6.V r5 = new g6.V
            r5.<init>(r3)
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)
            boolean r6 = r5 instanceof java.lang.reflect.Method
            if (r6 == 0) goto L_0x0250
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch:{ IllegalAccessException -> 0x0248, InvocationTargetException -> 0x0246 }
            r7 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalAccessException -> 0x0248, InvocationTargetException -> 0x0246 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x0248, InvocationTargetException -> 0x0246 }
            java.lang.Class r8 = java.lang.Byte.TYPE     // Catch:{ IllegalAccessException -> 0x0248, InvocationTargetException -> 0x0246 }
            r0[r1] = r8     // Catch:{ IllegalAccessException -> 0x0248, InvocationTargetException -> 0x0246 }
            r0[r2] = r7     // Catch:{ IllegalAccessException -> 0x0248, InvocationTargetException -> 0x0246 }
            java.lang.Object r0 = r6.invoke(r3, r0)     // Catch:{ IllegalAccessException -> 0x0248, InvocationTargetException -> 0x0246 }
            byte[] r0 = (byte[]) r0     // Catch:{ IllegalAccessException -> 0x0248, InvocationTargetException -> 0x0246 }
            r0 = r3
            r3 = r5
            goto L_0x0256
        L_0x0246:
            r0 = move-exception
            goto L_0x0249
        L_0x0248:
            r0 = move-exception
        L_0x0249:
            r6 = 0
            r17 = r3
            r3 = r0
            r0 = r17
            goto L_0x0256
        L_0x0250:
            r0 = r3
            r3 = r5
        L_0x0252:
            r6 = 0
            goto L_0x0256
        L_0x0254:
            r0 = 0
            goto L_0x0252
        L_0x0256:
            boolean r1 = r3 instanceof java.lang.Throwable
            if (r1 == 0) goto L_0x0276
            h6.c r1 = logger
            boolean r2 = r1.isTraceEnabled()
            if (r2 == 0) goto L_0x026a
            java.lang.String r2 = "jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable"
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.debug((java.lang.String) r2, (java.lang.Throwable) r3)
            goto L_0x0287
        L_0x026a:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r2 = r3.getMessage()
            java.lang.String r3 = "jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable: {}"
            r1.debug((java.lang.String) r3, (java.lang.Object) r2)
            goto L_0x0287
        L_0x0276:
            h6.c r1 = logger
            java.lang.String r2 = "jdk.internal.misc.Unsafe.allocateUninitializedArray(int): available"
            r1.debug(r2)
            goto L_0x0287
        L_0x027e:
            h6.c r0 = logger
            java.lang.String r1 = "jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable prior to Java9"
            r0.debug(r1)
            r0 = 0
            r6 = 0
        L_0x0287:
            ALLOCATE_ARRAY_METHOD = r6
            STORE_FENCE_AVAILABLE = r11
        L_0x028b:
            int r1 = javaVersion()
            if (r1 <= r4) goto L_0x029f
            g6.W r1 = new g6.W
            r1.<init>()
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            ALIGN_SLICE = r1
            goto L_0x02a2
        L_0x029f:
            r1 = 0
            ALIGN_SLICE = r1
        L_0x02a2:
            INTERNAL_UNSAFE = r0
            h6.c r0 = logger
            java.lang.reflect.Constructor<?> r1 = DIRECT_BUFFER_CONSTRUCTOR
            if (r1 == 0) goto L_0x02ad
            java.lang.String r1 = "available"
            goto L_0x02af
        L_0x02ad:
            java.lang.String r1 = "unavailable"
        L_0x02af:
            java.lang.String r2 = "java.nio.DirectByteBuffer.<init>(long, {int,long}): {}"
            r0.debug((java.lang.String) r2, (java.lang.Object) r1)
            return
        L_0x02b5:
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x02be
            sun.misc.Unsafe r1 = UNSAFE
            r1.freeMemory(r5)
        L_0x02be:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.X.<clinit>():void");
    }

    public static int addressSize() {
        return UNSAFE.addressSize();
    }

    public static ByteBuffer alignSlice(ByteBuffer byteBuffer, int i) {
        try {
            return (ByteBuffer) ALIGN_SLICE.invoke(byteBuffer, new Object[]{Integer.valueOf(i)});
        } catch (IllegalAccessException e) {
            throw new Error(e);
        } catch (InvocationTargetException e8) {
            throw new Error(e8);
        }
    }

    public static ByteBuffer allocateDirectNoCleaner(int i) {
        return newDirectBuffer(UNSAFE.allocateMemory((long) Math.max(1, i)), i);
    }

    public static byte[] allocateUninitializedArray(int i) {
        try {
            return (byte[]) ALLOCATE_ARRAY_METHOD.invoke(INTERNAL_UNSAFE, new Object[]{Byte.TYPE, Integer.valueOf(i)});
        } catch (IllegalAccessException e) {
            throw new Error(e);
        } catch (InvocationTargetException e8) {
            throw new Error(e8);
        }
    }

    public static long byteArrayBaseOffset() {
        return BYTE_ARRAY_BASE_OFFSET;
    }

    public static void copyMemory(long j7, long j8, long j9) {
        if (javaVersion() <= 8) {
            copyMemoryWithSafePointPolling(j7, j8, j9);
        } else {
            UNSAFE.copyMemory(j7, j8, j9);
        }
    }

    private static void copyMemoryWithSafePointPolling(long j7, long j8, long j9) {
        while (j9 > 0) {
            long min = Math.min(j9, 1048576);
            UNSAFE.copyMemory(j7, j8, min);
            j9 -= min;
            j7 += min;
            j8 += min;
        }
    }

    public static long directBufferAddress(ByteBuffer byteBuffer) {
        return getLong((Object) byteBuffer, ADDRESS_FIELD_OFFSET);
    }

    public static boolean equals(byte[] bArr, int i, byte[] bArr2, int i8, int i9) {
        byte[] bArr3 = bArr;
        int i10 = i;
        byte[] bArr4 = bArr2;
        int i11 = i9;
        int i12 = i11 & 7;
        long j7 = BYTE_ARRAY_BASE_OFFSET + ((long) i10);
        long j8 = (long) (i8 - i10);
        if (i11 >= 8) {
            long j9 = ((long) i12) + j7;
            long j10 = (j7 - 8) + ((long) i11);
            while (j10 >= j9) {
                Unsafe unsafe = UNSAFE;
                long j11 = j9;
                if (unsafe.getLong(bArr3, j10) != unsafe.getLong(bArr4, j10 + j8)) {
                    return false;
                }
                j10 -= 8;
                j9 = j11;
            }
        }
        if (i12 >= 4) {
            i12 -= 4;
            long j12 = ((long) i12) + j7;
            Unsafe unsafe2 = UNSAFE;
            if (unsafe2.getInt(bArr3, j12) != unsafe2.getInt(bArr4, j12 + j8)) {
                return false;
            }
        }
        long j13 = j8 + j7;
        if (i12 >= 2) {
            Unsafe unsafe3 = UNSAFE;
            if (unsafe3.getChar(bArr3, j7) == unsafe3.getChar(bArr4, j13) && (i12 == 2 || unsafe3.getByte(bArr3, j7 + 2) == unsafe3.getByte(bArr4, j13 + 2))) {
                return true;
            }
            return false;
        }
        if (i12 != 0) {
            Unsafe unsafe4 = UNSAFE;
            if (unsafe4.getByte(bArr3, j7) == unsafe4.getByte(bArr4, j13)) {
                return true;
            }
            return false;
        }
        return true;
    }

    private static Throwable explicitNoUnsafeCause0() {
        boolean z = p0.getBoolean("io.netty.noUnsafe", false);
        C1082c cVar = logger;
        cVar.debug("-Dio.netty.noUnsafe: {}", (Object) Boolean.valueOf(z));
        if (z) {
            cVar.debug("sun.misc.Unsafe: unavailable (io.netty.noUnsafe)");
            return new UnsupportedOperationException("sun.misc.Unsafe: unavailable (io.netty.noUnsafe)");
        }
        String str = "io.netty.tryUnsafe";
        if (!p0.contains(str)) {
            str = "org.jboss.netty.tryUnsafe";
        }
        if (p0.getBoolean(str, true)) {
            return null;
        }
        String str2 = "sun.misc.Unsafe: unavailable (" + str + ")";
        cVar.debug(str2);
        return new UnsupportedOperationException(str2);
    }

    private static boolean explicitTryReflectionSetAccessible0() {
        boolean z;
        if (javaVersion() < 9 || RUNNING_IN_NATIVE_IMAGE) {
            z = true;
        } else {
            z = false;
        }
        return p0.getBoolean("io.netty.tryReflectionSetAccessible", z);
    }

    public static void freeMemory(long j7) {
        UNSAFE.freeMemory(j7);
    }

    public static byte getByte(long j7) {
        return UNSAFE.getByte(j7);
    }

    public static ClassLoader getClassLoader(Class<?> cls) {
        if (System.getSecurityManager() == null) {
            return cls.getClassLoader();
        }
        return (ClassLoader) AccessController.doPrivileged(new L(cls));
    }

    public static int getInt(Object obj, long j7) {
        return UNSAFE.getInt(obj, j7);
    }

    private static long getLong(Object obj, long j7) {
        return UNSAFE.getLong(obj, j7);
    }

    public static Object getObject(Object obj, long j7) {
        return UNSAFE.getObject(obj, j7);
    }

    public static short getShort(long j7) {
        return UNSAFE.getShort(j7);
    }

    public static ClassLoader getSystemClassLoader() {
        if (System.getSecurityManager() == null) {
            return ClassLoader.getSystemClassLoader();
        }
        return (ClassLoader) AccessController.doPrivileged(new M());
    }

    public static Throwable getUnsafeUnavailabilityCause() {
        return UNSAFE_UNAVAILABILITY_CAUSE;
    }

    public static boolean hasAlignSliceMethod() {
        if (ALIGN_SLICE != null) {
            return true;
        }
        return false;
    }

    public static boolean hasAllocateArrayMethod() {
        if (ALLOCATE_ARRAY_METHOD != null) {
            return true;
        }
        return false;
    }

    public static boolean hasDirectBufferNoCleanerConstructor() {
        if (DIRECT_BUFFER_CONSTRUCTOR != null) {
            return true;
        }
        return false;
    }

    public static boolean hasUnsafe() {
        if (UNSAFE != null) {
            return true;
        }
        return false;
    }

    public static int hashCodeAscii(byte[] bArr, int i, int i8) {
        boolean z;
        boolean z6;
        boolean z8;
        int i9;
        boolean z9;
        boolean z10;
        long j7 = BYTE_ARRAY_BASE_OFFSET + ((long) i);
        int i10 = i8 & 7;
        long j8 = ((long) i10) + j7;
        int i11 = -1028477387;
        for (long j9 = (j7 - 8) + ((long) i8); j9 >= j8; j9 -= 8) {
            i11 = hashCodeAsciiCompute(UNSAFE.getLong(bArr, j9), i11);
        }
        if (i10 == 0) {
            return i11;
        }
        boolean z11 = false;
        if (i10 != 2) {
            z = true;
        } else {
            z = false;
        }
        if (i10 != 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z12 = z & z6;
        if (i10 != 6) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z13 = z12 & z8;
        int i12 = 461845907;
        if (z13) {
            i11 = (i11 * -862048943) + hashCodeAsciiSanitize(UNSAFE.getByte(bArr, j7));
            j7++;
            i9 = 461845907;
        } else {
            i9 = -862048943;
        }
        if (i10 != 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i10 != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z14 = z9 & z10;
        if (i10 != 5) {
            z11 = true;
        }
        if (z11 && z14) {
            i11 = (i11 * i9) + hashCodeAsciiSanitize(UNSAFE.getShort(bArr, j7));
            if (i9 != -862048943) {
                i12 = -862048943;
            }
            j7 += 2;
            i9 = i12;
        }
        if (i10 < 4) {
            return i11;
        }
        return hashCodeAsciiSanitize(UNSAFE.getInt(bArr, j7)) + (i11 * i9);
    }

    public static int hashCodeAsciiCompute(long j7, int i) {
        return (hashCodeAsciiSanitize((int) j7) * 461845907) + (i * -862048943) + ((int) ((j7 & 2242545357458243584L) >>> 32));
    }

    public static int hashCodeAsciiSanitize(int i) {
        return i & 522133279;
    }

    public static boolean isAndroid() {
        return IS_ANDROID;
    }

    private static boolean isAndroid0() {
        boolean equals = "Dalvik".equals(p0.get("java.vm.name"));
        if (equals) {
            logger.debug("Platform: Android");
        }
        return equals;
    }

    public static boolean isExplicitNoUnsafe() {
        if (EXPLICIT_NO_UNSAFE_CAUSE != null) {
            return true;
        }
        return false;
    }

    public static boolean isExplicitTryReflectionSetAccessible() {
        return IS_EXPLICIT_TRY_REFLECTION_SET_ACCESSIBLE;
    }

    public static boolean isUnaligned() {
        return UNALIGNED;
    }

    public static boolean isZero(byte[] bArr, int i, int i8) {
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i8;
        if (i10 <= 0) {
            return true;
        }
        long j7 = BYTE_ARRAY_BASE_OFFSET + ((long) i9);
        int i11 = i10 & 7;
        long j8 = ((long) i11) + j7;
        for (long j9 = (j7 - 8) + ((long) i10); j9 >= j8; j9 -= 8) {
            if (UNSAFE.getLong(bArr2, j9) != 0) {
                return false;
            }
        }
        if (i11 >= 4) {
            i11 -= 4;
            if (UNSAFE.getInt(bArr2, ((long) i11) + j7) != 0) {
                return false;
            }
        }
        if (i11 >= 2) {
            if (UNSAFE.getChar(bArr2, j7) == 0 && (i11 == 2 || bArr2[i9 + 2] == 0)) {
                return true;
            }
            return false;
        } else if (bArr2[i9] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int javaVersion() {
        return JAVA_VERSION;
    }

    private static int javaVersion0() {
        int i;
        if (isAndroid0()) {
            i = 6;
        } else {
            i = majorVersionFromJavaSpecificationVersion();
        }
        logger.debug("Java version: {}", (Object) Integer.valueOf(i));
        return i;
    }

    public static int majorVersion(String str) {
        String[] split = str.split("\\.");
        int[] iArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            iArr[i] = Integer.parseInt(split[i]);
        }
        int i8 = iArr[0];
        if (i8 == 1) {
            return iArr[1];
        }
        return i8;
    }

    public static int majorVersionFromJavaSpecificationVersion() {
        return majorVersion(p0.get("java.specification.version", "1.6"));
    }

    public static ByteBuffer newDirectBuffer(long j7, int i) {
        B.checkPositiveOrZero(i, "capacity");
        try {
            return (ByteBuffer) DIRECT_BUFFER_CONSTRUCTOR.newInstance(new Object[]{Long.valueOf(j7), Integer.valueOf(i)});
        } catch (Throwable th) {
            if (th instanceof Error) {
                throw th;
            }
            throw new Error(th);
        }
    }

    public static long objectFieldOffset(Field field) {
        return UNSAFE.objectFieldOffset(field);
    }

    public static void putByte(long j7, byte b8) {
        UNSAFE.putByte(j7, b8);
    }

    public static void putInt(long j7, int i) {
        UNSAFE.putInt(j7, i);
    }

    public static void putLong(long j7, long j8) {
        UNSAFE.putLong(j7, j8);
    }

    public static void putObject(Object obj, long j7, Object obj2) {
        UNSAFE.putObject(obj, j7, obj2);
    }

    public static void putShort(long j7, short s8) {
        UNSAFE.putShort(j7, s8);
    }

    public static ByteBuffer reallocateDirectNoCleaner(ByteBuffer byteBuffer, int i) {
        return newDirectBuffer(UNSAFE.reallocateMemory(directBufferAddress(byteBuffer), (long) i), i);
    }

    public static void safeConstructPutInt(Object obj, long j7, int i) {
        if (STORE_FENCE_AVAILABLE) {
            Unsafe unsafe = UNSAFE;
            unsafe.putInt(obj, j7, i);
            unsafe.storeFence();
            return;
        }
        UNSAFE.putIntVolatile(obj, j7, i);
    }

    public static void setMemory(long j7, long j8, byte b8) {
        UNSAFE.setMemory(j7, j8, b8);
    }

    public static void throwException(Throwable th) {
        UNSAFE.throwException((Throwable) B.checkNotNull(th, "cause"));
    }

    public static boolean unalignedAccess() {
        return UNALIGNED;
    }

    /* access modifiers changed from: private */
    public static boolean unsafeStaticFieldOffsetSupported() {
        return !RUNNING_IN_NATIVE_IMAGE;
    }

    public static byte getByte(byte[] bArr, int i) {
        return UNSAFE.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i));
    }

    public static int getInt(long j7) {
        return UNSAFE.getInt(j7);
    }

    public static long getLong(long j7) {
        return UNSAFE.getLong(j7);
    }

    public static short getShort(byte[] bArr, int i) {
        return UNSAFE.getShort(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i));
    }

    public static int hashCodeAsciiSanitize(short s8) {
        return s8 & 7967;
    }

    public static void putByte(byte[] bArr, int i, byte b8) {
        UNSAFE.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), b8);
    }

    public static void putInt(byte[] bArr, int i, int i8) {
        UNSAFE.putInt(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), i8);
    }

    public static void putLong(byte[] bArr, int i, long j7) {
        UNSAFE.putLong(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), j7);
    }

    public static void putShort(byte[] bArr, int i, short s8) {
        UNSAFE.putShort(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), s8);
    }

    public static void setMemory(Object obj, long j7, long j8, byte b8) {
        UNSAFE.setMemory(obj, j7, j8, b8);
    }

    private static void copyMemoryWithSafePointPolling(Object obj, long j7, Object obj2, long j8, long j9) {
        long j10 = j7;
        long j11 = j8;
        long j12 = j9;
        while (j12 > 0) {
            long min = Math.min(j12, 1048576);
            UNSAFE.copyMemory(obj, j10, obj2, j11, min);
            j12 -= min;
            j10 += min;
            j11 += min;
        }
    }

    public static int getInt(byte[] bArr, int i) {
        return UNSAFE.getInt(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i));
    }

    public static long getLong(byte[] bArr, int i) {
        return UNSAFE.getLong(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i));
    }

    public static int hashCodeAsciiSanitize(byte b8) {
        return b8 & 31;
    }

    public static void putByte(Object obj, long j7, byte b8) {
        UNSAFE.putByte(obj, j7, b8);
    }

    public static void copyMemory(Object obj, long j7, Object obj2, long j8, long j9) {
        if (javaVersion() <= 8) {
            copyMemoryWithSafePointPolling(obj, j7, obj2, j8, j9);
        } else {
            UNSAFE.copyMemory(obj, j7, obj2, j8, j9);
        }
    }
}
