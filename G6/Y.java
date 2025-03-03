package g6;

import Q0.g;
import h6.C1082c;
import h6.d;
import i6.s;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.attribute.FileAttribute;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j6.l;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.C1162a;
import org.altbeacon.bluetooth.Pdu;

public abstract class Y {
    private static final int ADDRESS_SIZE = addressSize0();
    private static final String[] ALLOWED_LINUX_OS_CLASSIFIERS;
    public static final boolean BIG_ENDIAN_NATIVE_ORDER;
    private static final int BIT_MODE = bitMode0();
    private static final long BYTE_ARRAY_BASE_OFFSET = byteArrayBaseOffset0();
    private static final boolean CAN_ENABLE_TCP_NODELAY_BY_DEFAULT = (!isAndroid());
    private static final C0966a CLEANER;
    private static final boolean DIRECT_BUFFER_PREFERRED;
    private static final AtomicLong DIRECT_MEMORY_COUNTER;
    private static final long DIRECT_MEMORY_LIMIT;
    private static final boolean IS_IVKVM_DOT_NET = isIkvmDotNet0();
    private static final boolean IS_J9_JVM = isJ9Jvm0();
    private static final boolean IS_OSX = isOsx0();
    private static final boolean IS_WINDOWS = isWindows0();
    private static final Set<String> LINUX_OS_CLASSIFIERS;
    private static final long MAX_DIRECT_MEMORY;
    private static final Pattern MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN = Pattern.compile("\\s*-XX:MaxDirectMemorySize\\s*=\\s*([0-9]+)\\s*([kKmMgG]?)\\s*$");
    private static final boolean MAYBE_SUPER_USER = maybeSuperUser0();
    private static final C0966a NOOP;
    private static final String NORMALIZED_ARCH = normalizeArch(p0.get("os.arch", ""));
    private static final String NORMALIZED_OS = normalizeOs(p0.get("os.name", ""));
    private static final String[] OS_RELEASE_FILES = {"/etc/os-release", "/usr/lib/os-release"};
    private static final K RANDOM_PROVIDER;
    private static final File TMPDIR = tmpdir0();
    private static final int UNINITIALIZED_ARRAY_ALLOCATION_THRESHOLD;
    private static final Throwable UNSAFE_UNAVAILABILITY_CAUSE = unsafeUnavailabilityCause0();
    private static final boolean USE_DIRECT_BUFFER_NO_CLEANER;
    /* access modifiers changed from: private */
    public static final C1082c logger;

    static {
        boolean z;
        C0966a aVar;
        C0966a aVar2;
        C1082c instance = d.getInstance((Class<?>) Y.class);
        logger = instance;
        long estimateMaxDirectMemory = estimateMaxDirectMemory();
        MAX_DIRECT_MEMORY = estimateMaxDirectMemory;
        String[] strArr = {"fedora", "suse", "arch"};
        ALLOWED_LINUX_OS_CLASSIFIERS = strArr;
        boolean z6 = false;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        BIG_ENDIAN_NATIVE_ORDER = z;
        D d8 = new D();
        NOOP = d8;
        if (javaVersion() >= 7) {
            RANDOM_PROVIDER = new E();
        } else {
            RANDOM_PROVIDER = new F();
        }
        long j7 = p0.getLong("io.netty.maxDirectMemory", -1);
        int i = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
        if (i == 0 || !hasUnsafe() || !X.hasDirectBufferNoCleanerConstructor()) {
            USE_DIRECT_BUFFER_NO_CLEANER = false;
            DIRECT_MEMORY_COUNTER = null;
        } else {
            USE_DIRECT_BUFFER_NO_CLEANER = true;
            if (i < 0) {
                if (estimateMaxDirectMemory <= 0) {
                    DIRECT_MEMORY_COUNTER = null;
                } else {
                    DIRECT_MEMORY_COUNTER = new AtomicLong();
                }
                j7 = estimateMaxDirectMemory;
            } else {
                DIRECT_MEMORY_COUNTER = new AtomicLong();
            }
        }
        instance.debug("-Dio.netty.maxDirectMemory: {} bytes", (Object) Long.valueOf(j7));
        if (j7 >= 1) {
            estimateMaxDirectMemory = j7;
        }
        DIRECT_MEMORY_LIMIT = estimateMaxDirectMemory;
        int i8 = p0.getInt("io.netty.uninitializedArrayAllocationThreshold", 1024);
        if (javaVersion() < 9 || !X.hasAllocateArrayMethod()) {
            i8 = -1;
        }
        UNINITIALIZED_ARRAY_ALLOCATION_THRESHOLD = i8;
        instance.debug("-Dio.netty.uninitializedArrayAllocationThreshold: {}", (Object) Integer.valueOf(i8));
        if (isAndroid()) {
            CLEANER = d8;
        } else if (javaVersion() >= 9) {
            if (C0974g.isSupported()) {
                aVar2 = new C0974g();
            } else {
                aVar2 = d8;
            }
            CLEANER = aVar2;
        } else {
            if (C0971d.isSupported()) {
                aVar = new C0971d();
            } else {
                aVar = d8;
            }
            CLEANER = aVar;
        }
        C0966a aVar3 = CLEANER;
        if (aVar3 != d8 && !p0.getBoolean("io.netty.noPreferDirect", false)) {
            z6 = true;
        }
        DIRECT_BUFFER_PREFERRED = z6;
        if (instance.isDebugEnabled()) {
            instance.debug("-Dio.netty.noPreferDirect: {}", (Object) Boolean.valueOf(true ^ z6));
        }
        if (aVar3 == d8 && !X.isExplicitNoUnsafe()) {
            instance.info("Your platform does not provide complete low-level API for accessing direct buffers reliably. Unless explicitly requested, heap buffer will always be preferred to avoid potential system instability.");
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!addPropertyOsClassifiers(unmodifiableSet, linkedHashSet)) {
            addFilesystemOsClassifiers(unmodifiableSet, linkedHashSet);
        }
        LINUX_OS_CLASSIFIERS = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* access modifiers changed from: private */
    public static void addClassifier(Set<String> set, Set<String> set2, String... strArr) {
        for (String str : strArr) {
            if (set.contains(str)) {
                set2.add(str);
            }
        }
    }

    public static void addFilesystemOsClassifiers(Set<String> set, Set<String> set2) {
        String[] strArr = OS_RELEASE_FILES;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            if (!((Boolean) AccessController.doPrivileged(new G(new File(str), set, set2, str))).booleanValue()) {
                i++;
            } else {
                return;
            }
        }
    }

    public static boolean addPropertyOsClassifiers(Set<String> set, Set<String> set2) {
        String str = p0.get("io.netty.osClassifiers");
        if (str == null) {
            return false;
        }
        if (str.isEmpty()) {
            return true;
        }
        String[] split = str.split(",");
        if (split.length == 0) {
            throw new IllegalArgumentException("io.netty.osClassifiers property is not empty, but contains no classifiers: ".concat(str));
        } else if (split.length <= 2) {
            for (String str2 : split) {
                addClassifier(set, set2, str2);
            }
            return true;
        } else {
            throw new IllegalArgumentException("io.netty.osClassifiers property contains more than 2 classifiers: ".concat(str));
        }
    }

    private static int addressSize0() {
        if (!hasUnsafe()) {
            return -1;
        }
        return X.addressSize();
    }

    public static long align(long j7, int i) {
        return C1162a.align(j7, i);
    }

    public static ByteBuffer alignDirectBuffer(ByteBuffer byteBuffer, int i) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Cannot get aligned slice of non-direct byte buffer.");
        } else if (X.hasAlignSliceMethod()) {
            return X.alignSlice(byteBuffer, i);
        } else {
            if (hasUnsafe()) {
                long directBufferAddress = directBufferAddress(byteBuffer);
                byteBuffer.position((int) (align(directBufferAddress, i) - directBufferAddress));
                return byteBuffer.slice();
            }
            throw new UnsupportedOperationException("Cannot align direct buffer. Needs either Unsafe or ByteBuffer.alignSlice method available.");
        }
    }

    public static ByteBuffer allocateDirectNoCleaner(int i) {
        incrementMemoryCounter(i);
        try {
            return X.allocateDirectNoCleaner(i);
        } catch (Throwable th) {
            decrementMemoryCounter(i);
            throwException(th);
            return null;
        }
    }

    public static byte[] allocateUninitializedArray(int i) {
        int i8 = UNINITIALIZED_ARRAY_ALLOCATION_THRESHOLD;
        if (i8 < 0 || i8 > i) {
            return new byte[i];
        }
        return X.allocateUninitializedArray(i);
    }

    private static int bitMode0() {
        int i = p0.getInt("io.netty.bitMode", 0);
        if (i > 0) {
            logger.debug("-Dio.netty.bitMode: {}", (Object) Integer.valueOf(i));
            return i;
        }
        int i8 = p0.getInt("sun.arch.data.model", 0);
        if (i8 > 0) {
            logger.debug("-Dio.netty.bitMode: {} (sun.arch.data.model)", (Object) Integer.valueOf(i8));
            return i8;
        }
        int i9 = p0.getInt("com.ibm.vm.bitmode", 0);
        if (i9 > 0) {
            logger.debug("-Dio.netty.bitMode: {} (com.ibm.vm.bitmode)", (Object) Integer.valueOf(i9));
            return i9;
        }
        String str = p0.get("os.arch", "");
        Locale locale = Locale.US;
        String trim = str.toLowerCase(locale).trim();
        if ("amd64".equals(trim) || "x86_64".equals(trim)) {
            i9 = 64;
        } else if ("i386".equals(trim) || "i486".equals(trim) || "i586".equals(trim) || "i686".equals(trim)) {
            i9 = 32;
        }
        if (i9 > 0) {
            logger.debug("-Dio.netty.bitMode: {} (os.arch: {})", Integer.valueOf(i9), trim);
        }
        Matcher matcher = Pattern.compile("([1-9][0-9]+)-?bit").matcher(p0.get("java.vm.name", "").toLowerCase(locale));
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 64;
    }

    public static long byteArrayBaseOffset() {
        return BYTE_ARRAY_BASE_OFFSET;
    }

    private static long byteArrayBaseOffset0() {
        if (!hasUnsafe()) {
            return -1;
        }
        return X.byteArrayBaseOffset();
    }

    public static boolean canEnableTcpNoDelayByDefault() {
        return CAN_ENABLE_TCP_NODELAY_BY_DEFAULT;
    }

    public static void copyMemory(long j7, long j8, long j9) {
        X.copyMemory(j7, j8, j9);
    }

    public static File createTempFile(String str, String str2, File file) {
        File file2;
        if (javaVersion() < 7) {
            if (file == null) {
                file2 = File.createTempFile(str, str2);
            } else {
                file2 = File.createTempFile(str, str2, file);
            }
            if (!file2.setReadable(false, false)) {
                throw new IOException("Failed to set permissions on temporary file " + file2);
            } else if (file2.setReadable(true, true)) {
                return file2;
            } else {
                throw new IOException("Failed to set permissions on temporary file " + file2);
            }
        } else if (file == null) {
            return Files.createTempFile(str, str2, new FileAttribute[0]).toFile();
        } else {
            return Files.createTempFile(FileRetargetClass.toPath(file), str, str2, new FileAttribute[0]).toFile();
        }
    }

    private static void decrementMemoryCounter(int i) {
        AtomicLong atomicLong = DIRECT_MEMORY_COUNTER;
        if (atomicLong != null) {
            atomicLong.addAndGet((long) (-i));
        }
    }

    public static long directBufferAddress(ByteBuffer byteBuffer) {
        return X.directBufferAddress(byteBuffer);
    }

    public static boolean directBufferPreferred() {
        return DIRECT_BUFFER_PREFERRED;
    }

    public static boolean equals(byte[] bArr, int i, byte[] bArr2, int i8, int i9) {
        if (!hasUnsafe() || !X.unalignedAccess()) {
            return equalsSafe(bArr, i, bArr2, i8, i9);
        }
        return X.equals(bArr, i, bArr2, i8, i9);
    }

    private static boolean equalsSafe(byte[] bArr, int i, byte[] bArr2, int i8, int i9) {
        int i10 = i9 + i;
        while (i < i10) {
            if (bArr[i] != bArr2[i8]) {
                return false;
            }
            i++;
            i8++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        if (r0 != 'm') goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long estimateMaxDirectMemory() {
        /*
            r0 = 1
            r1 = 0
            r3 = 0
            java.lang.ClassLoader r4 = getSystemClassLoader()     // Catch:{ all -> 0x003d }
            java.lang.String r5 = "java.vm.name"
            java.lang.String r6 = ""
            java.lang.String r5 = g6.p0.get(r5, r6)     // Catch:{ all -> 0x003b }
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ all -> 0x003b }
            java.lang.String r6 = "ibm j9"
            boolean r6 = r5.startsWith(r6)     // Catch:{ all -> 0x003b }
            if (r6 != 0) goto L_0x003f
            java.lang.String r6 = "eclipse openj9"
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x003b }
            if (r5 != 0) goto L_0x003f
            java.lang.String r5 = "sun.misc.VM"
            java.lang.Class r5 = java.lang.Class.forName(r5, r0, r4)     // Catch:{ all -> 0x003b }
            java.lang.String r6 = "maxDirectMemory"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r3)     // Catch:{ all -> 0x003b }
            java.lang.Object r5 = r5.invoke(r3, r3)     // Catch:{ all -> 0x003b }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x003b }
            long r5 = r5.longValue()     // Catch:{ all -> 0x003b }
            goto L_0x0040
        L_0x003b:
            goto L_0x003f
        L_0x003d:
            r4 = r3
        L_0x003f:
            r5 = r1
        L_0x0040:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0045
            return r5
        L_0x0045:
            java.lang.String r7 = "java.lang.management.ManagementFactory"
            java.lang.Class r7 = java.lang.Class.forName(r7, r0, r4)     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = "java.lang.management.RuntimeMXBean"
            java.lang.Class r4 = java.lang.Class.forName(r8, r0, r4)     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = "getRuntimeMXBean"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r3)     // Catch:{ all -> 0x00bb }
            java.lang.Object r7 = r7.invoke(r3, r3)     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = "getInputArguments"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r8, r3)     // Catch:{ all -> 0x00bb }
            java.lang.Object r3 = r4.invoke(r7, r3)     // Catch:{ all -> 0x00bb }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x00bb }
            int r4 = r3.size()     // Catch:{ all -> 0x00bb }
            int r4 = r4 - r0
        L_0x006c:
            if (r4 < 0) goto L_0x00bc
            java.util.regex.Pattern r7 = MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN     // Catch:{ all -> 0x00bb }
            java.lang.Object r8 = r3.get(r4)     // Catch:{ all -> 0x00bb }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x00bb }
            java.util.regex.Matcher r7 = r7.matcher(r8)     // Catch:{ all -> 0x00bb }
            boolean r8 = r7.matches()     // Catch:{ all -> 0x00bb }
            if (r8 != 0) goto L_0x0083
            int r4 = r4 + -1
            goto L_0x006c
        L_0x0083:
            java.lang.String r0 = r7.group(r0)     // Catch:{ all -> 0x00bb }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x00bb }
            r0 = 2
            java.lang.String r0 = r7.group(r0)     // Catch:{ all -> 0x00bb }
            r3 = 0
            char r0 = r0.charAt(r3)     // Catch:{ all -> 0x00bb }
            r3 = 71
            if (r0 == r3) goto L_0x00b7
            r3 = 75
            if (r0 == r3) goto L_0x00b4
            r3 = 77
            if (r0 == r3) goto L_0x00ae
            r3 = 103(0x67, float:1.44E-43)
            if (r0 == r3) goto L_0x00b7
            r3 = 107(0x6b, float:1.5E-43)
            if (r0 == r3) goto L_0x00b4
            r3 = 109(0x6d, float:1.53E-43)
            if (r0 == r3) goto L_0x00ae
            goto L_0x00bc
        L_0x00ae:
            r3 = 1048576(0x100000, double:5.180654E-318)
        L_0x00b1:
            long r5 = r5 * r3
            goto L_0x00bc
        L_0x00b4:
            r3 = 1024(0x400, double:5.06E-321)
            goto L_0x00b1
        L_0x00b7:
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x00b1
        L_0x00bb:
        L_0x00bc:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00d4
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r5 = r0.maxMemory()
            h6.c r0 = logger
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "maxDirectMemory: {} bytes (maybe)"
            r0.debug((java.lang.String) r2, (java.lang.Object) r1)
            goto L_0x00df
        L_0x00d4:
            h6.c r0 = logger
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "maxDirectMemory: {} bytes"
            r0.debug((java.lang.String) r2, (java.lang.Object) r1)
        L_0x00df:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.Y.estimateMaxDirectMemory():long");
    }

    public static void freeDirectBuffer(ByteBuffer byteBuffer) {
        CLEANER.freeDirectBuffer(byteBuffer);
    }

    public static void freeDirectNoCleaner(ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        X.freeMemory(X.directBufferAddress(byteBuffer));
        decrementMemoryCounter(capacity);
    }

    public static byte getByte(long j7) {
        return X.getByte(j7);
    }

    public static ClassLoader getClassLoader(Class<?> cls) {
        return X.getClassLoader(cls);
    }

    public static int getInt(Object obj, long j7) {
        return X.getInt(obj, j7);
    }

    private static int getIntSafe(byte[] bArr, int i) {
        byte b8;
        int i8;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            b8 = (bArr[i] << 24) | ((bArr[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[i + 2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
            i8 = bArr[i + 3] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        } else {
            b8 = (bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | ((bArr[i + 2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16);
            i8 = bArr[i + 3] << 24;
        }
        return i8 | b8;
    }

    public static long getLong(long j7) {
        return X.getLong(j7);
    }

    private static long getLongSafe(byte[] bArr, int i) {
        long j7;
        long j8;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            long j9 = (((long) bArr[i + 1]) & 255) << 48;
            j7 = ((((long) bArr[i + 6]) & 255) << 8) | j9 | (((long) bArr[i]) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16);
            j8 = ((long) bArr[i + 7]) & 255;
        } else {
            j7 = ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            j8 = ((long) bArr[i + 7]) << 56;
        }
        return j8 | j7;
    }

    public static Object getObject(Object obj, long j7) {
        return X.getObject(obj, j7);
    }

    public static short getShort(long j7) {
        return X.getShort(j7);
    }

    private static short getShortSafe(byte[] bArr, int i) {
        int i8;
        int i9;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            i8 = bArr[i] << 8;
            i9 = bArr[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        } else {
            i8 = bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            i9 = bArr[i + 1] << 8;
        }
        return (short) (i9 | i8);
    }

    public static ClassLoader getSystemClassLoader() {
        return X.getSystemClassLoader();
    }

    public static Throwable getUnsafeUnavailabilityCause() {
        return UNSAFE_UNAVAILABILITY_CAUSE;
    }

    public static boolean hasAlignDirectByteBuffer() {
        if (hasUnsafe() || X.hasAlignSliceMethod()) {
            return true;
        }
        return false;
    }

    public static boolean hasDirectBufferNoCleanerConstructor() {
        return X.hasDirectBufferNoCleanerConstructor();
    }

    public static boolean hasUnsafe() {
        if (UNSAFE_UNAVAILABILITY_CAUSE == null) {
            return true;
        }
        return false;
    }

    public static int hashCodeAscii(byte[] bArr, int i, int i8) {
        if (!hasUnsafe() || !X.unalignedAccess()) {
            return hashCodeAsciiSafe(bArr, i, i8);
        }
        return X.hashCodeAscii(bArr, i, i8);
    }

    private static int hashCodeAsciiCompute(CharSequence charSequence, int i, int i8) {
        int hashCodeAsciiSanitizeInt;
        int hashCodeAsciiSanitizeInt2;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            hashCodeAsciiSanitizeInt = (hashCodeAsciiSanitizeInt(charSequence, i + 4) * 461845907) + (i8 * -862048943);
            hashCodeAsciiSanitizeInt2 = hashCodeAsciiSanitizeInt(charSequence, i);
        } else {
            hashCodeAsciiSanitizeInt = (hashCodeAsciiSanitizeInt(charSequence, i) * 461845907) + (i8 * -862048943);
            hashCodeAsciiSanitizeInt2 = hashCodeAsciiSanitizeInt(charSequence, i + 4);
        }
        return hashCodeAsciiSanitizeInt + hashCodeAsciiSanitizeInt2;
    }

    public static int hashCodeAsciiSafe(byte[] bArr, int i, int i8) {
        int i9 = i8 & 7;
        int i10 = i + i9;
        int i11 = -1028477387;
        for (int i12 = (i - 8) + i8; i12 >= i10; i12 -= 8) {
            i11 = X.hashCodeAsciiCompute(getLongSafe(bArr, i12), i11);
        }
        switch (i9) {
            case 1:
                return X.hashCodeAsciiSanitize(bArr[i]) + (i11 * -862048943);
            case 2:
                return X.hashCodeAsciiSanitize(getShortSafe(bArr, i)) + (i11 * -862048943);
            case 3:
                return X.hashCodeAsciiSanitize(getShortSafe(bArr, i + 1)) + ((X.hashCodeAsciiSanitize(bArr[i]) + (i11 * -862048943)) * 461845907);
            case 4:
                return X.hashCodeAsciiSanitize(getIntSafe(bArr, i)) + (i11 * -862048943);
            case 5:
                return X.hashCodeAsciiSanitize(getIntSafe(bArr, i + 1)) + ((X.hashCodeAsciiSanitize(bArr[i]) + (i11 * -862048943)) * 461845907);
            case 6:
                return X.hashCodeAsciiSanitize(getIntSafe(bArr, i + 2)) + ((X.hashCodeAsciiSanitize(getShortSafe(bArr, i)) + (i11 * -862048943)) * 461845907);
            case 7:
                int hashCodeAsciiSanitize = X.hashCodeAsciiSanitize(bArr[i]);
                return X.hashCodeAsciiSanitize(getIntSafe(bArr, i + 3)) + ((X.hashCodeAsciiSanitize(getShortSafe(bArr, i + 1)) + ((hashCodeAsciiSanitize + (i11 * -862048943)) * 461845907)) * -862048943);
            default:
                return i11;
        }
    }

    private static int hashCodeAsciiSanitizeByte(char c8) {
        return c8 & 31;
    }

    private static int hashCodeAsciiSanitizeInt(CharSequence charSequence, int i) {
        char charAt;
        int charAt2;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            charAt = (charSequence.charAt(i + 3) & 31) | ((charSequence.charAt(i + 2) & 31) << 8) | ((charSequence.charAt(i + 1) & 31) << 16);
            charAt2 = (charSequence.charAt(i) & 31) << 24;
        } else {
            charAt = ((charSequence.charAt(i + 3) & 31) << 24) | ((charSequence.charAt(i + 2) & 31) << 16) | ((charSequence.charAt(i + 1) & 31) << 8);
            charAt2 = charSequence.charAt(i) & 31;
        }
        return charAt2 | charAt;
    }

    private static int hashCodeAsciiSanitizeShort(CharSequence charSequence, int i) {
        int charAt;
        int charAt2;
        if (BIG_ENDIAN_NATIVE_ORDER) {
            charAt = charSequence.charAt(i + 1) & 31;
            charAt2 = (charSequence.charAt(i) & 31) << 8;
        } else {
            charAt = (charSequence.charAt(i + 1) & 31) << 8;
            charAt2 = charSequence.charAt(i) & 31;
        }
        return charAt2 | charAt;
    }

    private static void incrementMemoryCounter(int i) {
        AtomicLong atomicLong = DIRECT_MEMORY_COUNTER;
        if (atomicLong != null) {
            long j7 = (long) i;
            long addAndGet = atomicLong.addAndGet(j7);
            long j8 = DIRECT_MEMORY_LIMIT;
            if (addAndGet > j8) {
                atomicLong.addAndGet((long) (-i));
                StringBuilder p3 = g.p(i, "failed to allocate ", " byte(s) of direct memory (used: ");
                p3.append(addAndGet - j7);
                p3.append(", max: ");
                p3.append(j8);
                p3.append(')');
                throw new C(p3.toString());
            }
        }
    }

    public static boolean isAndroid() {
        return X.isAndroid();
    }

    public static boolean isIkvmDotNet() {
        return IS_IVKVM_DOT_NET;
    }

    private static boolean isIkvmDotNet0() {
        return p0.get("java.vm.name", "").toUpperCase(Locale.US).equals("IKVM.NET");
    }

    public static boolean isJ9Jvm() {
        return IS_J9_JVM;
    }

    private static boolean isJ9Jvm0() {
        String lowerCase = p0.get("java.vm.name", "").toLowerCase();
        if (lowerCase.startsWith("ibm j9") || lowerCase.startsWith("eclipse openj9")) {
            return true;
        }
        return false;
    }

    public static boolean isOsx() {
        return IS_OSX;
    }

    private static boolean isOsx0() {
        boolean equals = "osx".equals(NORMALIZED_OS);
        if (equals) {
            logger.debug("Platform: MacOS");
        }
        return equals;
    }

    public static boolean isUnaligned() {
        return X.isUnaligned();
    }

    public static boolean isWindows() {
        return IS_WINDOWS;
    }

    private static boolean isWindows0() {
        boolean equals = "windows".equals(NORMALIZED_OS);
        if (equals) {
            logger.debug("Platform: Windows");
        }
        return equals;
    }

    public static boolean isZero(byte[] bArr, int i, int i8) {
        if (!hasUnsafe() || !X.unalignedAccess()) {
            return isZeroSafe(bArr, i, i8);
        }
        return X.isZero(bArr, i, i8);
    }

    private static boolean isZeroSafe(byte[] bArr, int i, int i8) {
        int i9 = i8 + i;
        while (i < i9) {
            if (bArr[i] != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int javaVersion() {
        return X.javaVersion();
    }

    public static long maxDirectMemory() {
        return DIRECT_MEMORY_LIMIT;
    }

    private static boolean maybeSuperUser0() {
        String str = p0.get("user.name");
        if (isWindows()) {
            return "Administrator".equals(str);
        }
        if ("root".equals(str) || "toor".equals(str)) {
            return true;
        }
        return false;
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap() {
        return new ConcurrentHashMap();
    }

    public static <T> Queue<T> newFixedMpscQueue(int i) {
        if (hasUnsafe()) {
            return new s(i);
        }
        return new l(i);
    }

    public static C0982o newLongCounter() {
        if (javaVersion() >= 8) {
            return new C0981n();
        }
        return new H((D) null);
    }

    public static <T> Queue<T> newMpscQueue() {
        return J.newMpscQueue();
    }

    private static String normalize(String str) {
        return str.toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
    }

    private static String normalizeArch(String str) {
        String normalize = normalize(str);
        if (normalize.matches("^(x8664|amd64|ia32e|em64t|x64)$")) {
            return "x86_64";
        }
        if (normalize.matches("^(x8632|x86|i[3-6]86|ia32|x32)$")) {
            return "x86_32";
        }
        if (normalize.matches("^(ia64|itanium64)$")) {
            return "itanium_64";
        }
        if (normalize.matches("^(sparc|sparc32)$")) {
            return "sparc_32";
        }
        if (normalize.matches("^(sparcv9|sparc64)$")) {
            return "sparc_64";
        }
        if (normalize.matches("^(arm|arm32)$")) {
            return "arm_32";
        }
        if ("aarch64".equals(normalize)) {
            return "aarch_64";
        }
        if (normalize.matches("^(ppc|ppc32)$")) {
            return "ppc_32";
        }
        if ("ppc64".equals(normalize)) {
            return "ppc_64";
        }
        if ("ppc64le".equals(normalize)) {
            return "ppcle_64";
        }
        if ("s390".equals(normalize)) {
            return "s390_32";
        }
        if ("s390x".equals(normalize)) {
            return "s390_64";
        }
        if ("loongarch64".equals(normalize)) {
            return "loongarch_64";
        }
        return "unknown";
    }

    private static String normalizeOs(String str) {
        String normalize = normalize(str);
        if (normalize.startsWith("aix")) {
            return "aix";
        }
        if (normalize.startsWith("hpux")) {
            return "hpux";
        }
        if (normalize.startsWith("os400") && (normalize.length() <= 5 || !Character.isDigit(normalize.charAt(5)))) {
            return "os400";
        }
        if (normalize.startsWith("linux")) {
            return "linux";
        }
        String str2 = "osx";
        if (!normalize.startsWith("macosx") && !normalize.startsWith(str2) && !normalize.startsWith("darwin")) {
            if (normalize.startsWith("freebsd")) {
                return "freebsd";
            }
            if (normalize.startsWith("openbsd")) {
                return "openbsd";
            }
            if (normalize.startsWith("netbsd")) {
                return "netbsd";
            }
            str2 = "sunos";
            if (!normalize.startsWith("solaris") && !normalize.startsWith(str2)) {
                if (normalize.startsWith("windows")) {
                    return "windows";
                }
                return "unknown";
            }
        }
        return str2;
    }

    /* access modifiers changed from: private */
    public static String normalizeOsReleaseVariableValue(String str) {
        return str.trim().replaceAll("[\"']", "");
    }

    public static String normalizedArch() {
        return NORMALIZED_ARCH;
    }

    public static Set<String> normalizedLinuxClassifiers() {
        return LINUX_OS_CLASSIFIERS;
    }

    public static String normalizedOs() {
        return NORMALIZED_OS;
    }

    public static long objectFieldOffset(Field field) {
        return X.objectFieldOffset(field);
    }

    public static void putByte(long j7, byte b8) {
        X.putByte(j7, b8);
    }

    public static void putInt(long j7, int i) {
        X.putInt(j7, i);
    }

    public static void putLong(long j7, long j8) {
        X.putLong(j7, j8);
    }

    public static void putObject(Object obj, long j7, Object obj2) {
        X.putObject(obj, j7, obj2);
    }

    public static void putShort(long j7, short s8) {
        X.putShort(j7, s8);
    }

    public static ByteBuffer reallocateDirectNoCleaner(ByteBuffer byteBuffer, int i) {
        int capacity = i - byteBuffer.capacity();
        incrementMemoryCounter(capacity);
        try {
            return X.reallocateDirectNoCleaner(byteBuffer, i);
        } catch (Throwable th) {
            decrementMemoryCounter(capacity);
            throwException(th);
            return null;
        }
    }

    public static void safeConstructPutInt(Object obj, long j7, int i) {
        X.safeConstructPutInt(obj, j7, i);
    }

    public static void setMemory(byte[] bArr, int i, long j7, byte b8) {
        X.setMemory(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), j7, b8);
    }

    public static Random threadLocalRandom() {
        return RANDOM_PROVIDER.current();
    }

    public static void throwException(Throwable th) {
        if (hasUnsafe()) {
            X.throwException(th);
        } else {
            throwException0(th);
        }
    }

    private static <E extends Throwable> void throwException0(Throwable th) {
        throw th;
    }

    public static File tmpdir() {
        return TMPDIR;
    }

    private static File tmpdir0() {
        File file;
        try {
            File directory = toDirectory(p0.get("io.netty.tmpdir"));
            if (directory != null) {
                logger.debug("-Dio.netty.tmpdir: {}", (Object) directory);
                return directory;
            }
            File directory2 = toDirectory(p0.get("java.io.tmpdir"));
            if (directory2 != null) {
                logger.debug("-Dio.netty.tmpdir: {} (java.io.tmpdir)", (Object) directory2);
                return directory2;
            }
            if (isWindows()) {
                File directory3 = toDirectory(System.getenv("TEMP"));
                if (directory3 != null) {
                    logger.debug("-Dio.netty.tmpdir: {} (%TEMP%)", (Object) directory3);
                    return directory3;
                }
                String str = System.getenv("USERPROFILE");
                if (str != null) {
                    File directory4 = toDirectory(str.concat("\\AppData\\Local\\Temp"));
                    if (directory4 != null) {
                        logger.debug("-Dio.netty.tmpdir: {} (%USERPROFILE%\\AppData\\Local\\Temp)", (Object) directory4);
                        return directory4;
                    }
                    File directory5 = toDirectory(str.concat("\\Local Settings\\Temp"));
                    if (directory5 != null) {
                        logger.debug("-Dio.netty.tmpdir: {} (%USERPROFILE%\\Local Settings\\Temp)", (Object) directory5);
                        return directory5;
                    }
                }
            } else {
                File directory6 = toDirectory(System.getenv("TMPDIR"));
                if (directory6 != null) {
                    logger.debug("-Dio.netty.tmpdir: {} ($TMPDIR)", (Object) directory6);
                    return directory6;
                }
            }
            if (isWindows()) {
                file = new File("C:\\Windows\\Temp");
            } else {
                file = new File("/tmp");
            }
            logger.warn("Failed to get the temporary directory; falling back to: {}", (Object) file);
            return file;
        } catch (Throwable unused) {
        }
    }

    private static File toDirectory(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        file.mkdirs();
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.getAbsoluteFile();
        } catch (Exception unused) {
            return file;
        }
    }

    private static Throwable unsafeUnavailabilityCause0() {
        String str;
        if (isAndroid()) {
            logger.debug("sun.misc.Unsafe: unavailable (Android)");
            return new UnsupportedOperationException("sun.misc.Unsafe: unavailable (Android)");
        } else if (isIkvmDotNet()) {
            logger.debug("sun.misc.Unsafe: unavailable (IKVM.NET)");
            return new UnsupportedOperationException("sun.misc.Unsafe: unavailable (IKVM.NET)");
        } else {
            Throwable unsafeUnavailabilityCause = X.getUnsafeUnavailabilityCause();
            if (unsafeUnavailabilityCause != null) {
                return unsafeUnavailabilityCause;
            }
            try {
                boolean hasUnsafe = X.hasUnsafe();
                C1082c cVar = logger;
                if (hasUnsafe) {
                    str = "available";
                } else {
                    str = "unavailable";
                }
                cVar.debug("sun.misc.Unsafe: {}", (Object) str);
                if (hasUnsafe) {
                    return null;
                }
                return X.getUnsafeUnavailabilityCause();
            } catch (Throwable th) {
                logger.trace("Could not determine if Unsafe is available", th);
                return new UnsupportedOperationException("Could not determine if Unsafe is available", th);
            }
        }
    }

    public static boolean useDirectBufferNoCleaner() {
        return USE_DIRECT_BUFFER_NO_CLEANER;
    }

    public static void copyMemory(byte[] bArr, int i, long j7, long j8) {
        X.copyMemory(bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), (Object) null, j7, j8);
    }

    public static byte getByte(byte[] bArr, int i) {
        return X.getByte(bArr, i);
    }

    public static int getInt(long j7) {
        return X.getInt(j7);
    }

    public static long getLong(byte[] bArr, int i) {
        return X.getLong(bArr, i);
    }

    public static short getShort(byte[] bArr, int i) {
        return X.getShort(bArr, i);
    }

    public static <T> Queue<T> newMpscQueue(int i) {
        return J.newMpscQueue(i);
    }

    public static void putByte(byte[] bArr, int i, byte b8) {
        X.putByte(bArr, i, b8);
    }

    public static void putInt(byte[] bArr, int i, int i8) {
        X.putInt(bArr, i, i8);
    }

    public static void putLong(byte[] bArr, int i, long j7) {
        X.putLong(bArr, i, j7);
    }

    public static void putShort(byte[] bArr, int i, short s8) {
        X.putShort(bArr, i, s8);
    }

    public static void setMemory(long j7, long j8, byte b8) {
        X.setMemory(j7, j8, b8);
    }

    public static void copyMemory(byte[] bArr, int i, byte[] bArr2, int i8, long j7) {
        long j8 = BYTE_ARRAY_BASE_OFFSET;
        X.copyMemory(bArr, j8 + ((long) i), bArr2, j8 + ((long) i8), j7);
    }

    public static int getInt(byte[] bArr, int i) {
        return X.getInt(bArr, i);
    }

    public static <T> Queue<T> newMpscQueue(int i, int i8) {
        return J.newChunkedMpscQueue(i, i8);
    }

    public static void putByte(Object obj, long j7, byte b8) {
        X.putByte(obj, j7, b8);
    }

    public static void copyMemory(long j7, byte[] bArr, int i, long j8) {
        X.copyMemory((Object) null, j7, bArr, BYTE_ARRAY_BASE_OFFSET + ((long) i), j8);
    }

    public static int hashCodeAscii(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        int i8 = length & 7;
        int i9 = -1028477387;
        if (length >= 32) {
            for (int i10 = length - 8; i10 >= i8; i10 -= 8) {
                i9 = hashCodeAsciiCompute(charSequence, i10, i9);
            }
        } else if (length >= 8) {
            i9 = hashCodeAsciiCompute(charSequence, length - 8, -1028477387);
            if (length >= 16) {
                i9 = hashCodeAsciiCompute(charSequence, length - 16, i9);
                if (length >= 24) {
                    i9 = hashCodeAsciiCompute(charSequence, length - 24, i9);
                }
            }
        }
        if (i8 == 0) {
            return i9;
        }
        boolean z = true;
        int i11 = -862048943;
        if (((i8 != 2) & (i8 != 4)) && (i8 != 6)) {
            i9 = (i9 * -862048943) + hashCodeAsciiSanitizeByte(charSequence.charAt(0));
            i = 1;
        } else {
            i = 0;
        }
        if (((i8 != 1) & (i8 != 4)) && (i8 != 5)) {
            i9 = (i9 * (i == 0 ? -862048943 : 461845907)) + X.hashCodeAsciiSanitize(hashCodeAsciiSanitizeShort(charSequence, i));
            i += 2;
        }
        if (i8 < 4) {
            return i9;
        }
        boolean z6 = i == 0;
        if (i != 3) {
            z = false;
        }
        if (!z6 && !z) {
            i11 = 461845907;
        }
        return (i9 * i11) + hashCodeAsciiSanitizeInt(charSequence, i);
    }
}
