package T5;

import S5.C0206y;
import g6.C0978k;
import g6.C0983p;
import g6.Y;
import g6.p0;
import h6.C1082c;
import h6.d;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.altbeacon.bluetooth.Pdu;

public final class D0 implements C0241d0 {
    private static final byte[] MACHINE_ID;
    private static final int PROCESS_ID;
    private static final C1082c logger = d.getInstance((Class<?>) D0.class);
    private static final AtomicInteger nextSequence = new AtomicInteger();
    private final byte[] data;
    private final int hashCode;
    private transient String longValue;
    private transient String shortValue;

    static {
        int i;
        String str = p0.get("io.netty.processId");
        int i8 = -1;
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i < 0) {
                logger.warn("-Dio.netty.processId: {} (malformed)", (Object) str);
            } else {
                C1082c cVar = logger;
                if (cVar.isDebugEnabled()) {
                    cVar.debug("-Dio.netty.processId: {} (user-set)", (Object) Integer.valueOf(i));
                }
                i8 = i;
            }
        }
        if (i8 < 0) {
            i8 = defaultProcessId();
            C1082c cVar2 = logger;
            if (cVar2.isDebugEnabled()) {
                cVar2.debug("-Dio.netty.processId: {} (auto-detected)", (Object) Integer.valueOf(i8));
            }
        }
        PROCESS_ID = i8;
        String str2 = p0.get("io.netty.machineId");
        byte[] bArr = null;
        if (str2 != null) {
            try {
                bArr = C0983p.parseMAC(str2);
            } catch (Exception e) {
                logger.warn("-Dio.netty.machineId: {} (malformed)", str2, e);
            }
            if (bArr != null) {
                logger.debug("-Dio.netty.machineId: {} (user-set)", (Object) str2);
            }
        }
        if (bArr == null) {
            bArr = C0983p.defaultMachineId();
            C1082c cVar3 = logger;
            if (cVar3.isDebugEnabled()) {
                cVar3.debug("-Dio.netty.machineId: {} (auto-detected)", (Object) C0983p.formatAddress(bArr));
            }
        }
        MACHINE_ID = bArr;
    }

    private D0() {
        byte[] bArr = MACHINE_ID;
        byte[] bArr2 = new byte[(bArr.length + 20)];
        this.data = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        writeInt(writeLong(writeInt(writeInt(bArr.length, PROCESS_ID), nextSequence.getAndIncrement()), Long.reverse(System.nanoTime()) ^ System.currentTimeMillis()), Y.threadLocalRandom().nextInt());
        this.hashCode = Arrays.hashCode(bArr2);
    }

    private int appendHexDumpField(StringBuilder sb, int i, int i8) {
        sb.append(C0206y.hexDump(this.data, i, i8));
        sb.append('-');
        return i + i8;
    }

    public static int defaultProcessId() {
        ClassLoader classLoader = Y.getClassLoader(D0.class);
        int processHandlePid = processHandlePid(classLoader);
        if (processHandlePid != -1) {
            return processHandlePid;
        }
        return jmxPid(classLoader);
    }

    public static int jmxPid(ClassLoader classLoader) {
        String str;
        int i;
        try {
            Class<?> cls = Class.forName("java.lang.management.ManagementFactory", true, classLoader);
            Class<?> cls2 = Class.forName("java.lang.management.RuntimeMXBean", true, classLoader);
            Class<?>[] clsArr = C0978k.EMPTY_CLASSES;
            Method method = cls.getMethod("getRuntimeMXBean", clsArr);
            Object[] objArr = C0978k.EMPTY_OBJECTS;
            str = (String) cls2.getMethod("getName", clsArr).invoke(method.invoke((Object) null, objArr), objArr);
        } catch (Throwable th) {
            logger.debug("Could not invoke Process.myPid(); not Android?", th);
            str = "";
        }
        int indexOf = str.indexOf(64);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i >= 0) {
            return i;
        }
        int nextInt = Y.threadLocalRandom().nextInt();
        logger.warn("Failed to find the current process ID from '{}'; using a random value: {}", str, Integer.valueOf(nextInt));
        return nextInt;
    }

    public static D0 newInstance() {
        return new D0();
    }

    private String newLongValue() {
        StringBuilder sb = new StringBuilder((this.data.length * 2) + 5);
        appendHexDumpField(sb, appendHexDumpField(sb, appendHexDumpField(sb, appendHexDumpField(sb, appendHexDumpField(sb, 0, MACHINE_ID.length), 4), 4), 8), 4);
        return sb.substring(0, sb.length() - 1);
    }

    public static int processHandlePid(ClassLoader classLoader) {
        if (Y.javaVersion() >= 9) {
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle", true, classLoader);
                Long l8 = (Long) cls.getMethod("pid", (Class[]) null).invoke(cls.getMethod("current", (Class[]) null).invoke((Object) null, (Object[]) null), (Object[]) null);
                if (l8.longValue() <= 2147483647L && l8.longValue() >= -2147483648L) {
                    return l8.intValue();
                }
                throw new IllegalStateException("Current process ID exceeds int range: " + l8);
            } catch (Exception e) {
                logger.debug("Could not invoke ProcessHandle.current().pid();", (Throwable) e);
            }
        }
        return -1;
    }

    private int writeInt(int i, int i8) {
        byte[] bArr = this.data;
        bArr[i] = (byte) (i8 >>> 24);
        bArr[i + 1] = (byte) (i8 >>> 16);
        int i9 = i + 3;
        bArr[i + 2] = (byte) (i8 >>> 8);
        int i10 = i + 4;
        bArr[i9] = (byte) i8;
        return i10;
    }

    private int writeLong(int i, long j7) {
        byte[] bArr = this.data;
        bArr[i] = (byte) ((int) (j7 >>> 56));
        bArr[i + 1] = (byte) ((int) (j7 >>> 48));
        bArr[i + 2] = (byte) ((int) (j7 >>> 40));
        bArr[i + 3] = (byte) ((int) (j7 >>> 32));
        bArr[i + 4] = (byte) ((int) (j7 >>> 24));
        bArr[i + 5] = (byte) ((int) (j7 >>> 16));
        int i8 = i + 7;
        bArr[i + 6] = (byte) ((int) (j7 >>> 8));
        int i9 = i + 8;
        bArr[i8] = (byte) ((int) j7);
        return i9;
    }

    public String asLongText() {
        String str = this.longValue;
        if (str != null) {
            return str;
        }
        String newLongValue = newLongValue();
        this.longValue = newLongValue;
        return newLongValue;
    }

    public String asShortText() {
        String str = this.shortValue;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.data;
        String hexDump = C0206y.hexDump(bArr, bArr.length - 4, 4);
        this.shortValue = hexDump;
        return hexDump;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        if (this.hashCode != d02.hashCode || !Arrays.equals(this.data, d02.data)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        return asShortText();
    }

    public int compareTo(C0241d0 d0Var) {
        if (this == d0Var) {
            return 0;
        }
        if (!(d0Var instanceof D0)) {
            return asLongText().compareTo(((D0) d0Var).asLongText());
        }
        byte[] bArr = ((D0) d0Var).data;
        int length = this.data.length;
        int length2 = bArr.length;
        int min = Math.min(length, length2);
        for (int i = 0; i < min; i++) {
            byte b8 = this.data[i];
            byte b9 = bArr[i];
            if (b8 != b9) {
                return (b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE) - (b9 & Pdu.MANUFACTURER_DATA_PDU_TYPE);
            }
        }
        return length - length2;
    }
}
