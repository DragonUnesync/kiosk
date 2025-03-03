package m1;

import Q0.g;
import java.io.IOException;

/* renamed from: m1.b  reason: case insensitive filesystem */
public abstract class C1207b {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13343a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f13344b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f13345c;

    /* renamed from: d  reason: collision with root package name */
    public static long f13346d;

    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cb, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2 = android.os.SystemClock.elapsedRealtime();
        r5 = (r2 - r13) + r11;
        r0 = r4[0];
        r8 = r4[1] & org.altbeacon.bluetooth.Pdu.MANUFACTURER_DATA_PDU_TYPE;
        r9 = e(24, r4);
        r11 = e(32, r4);
        r13 = e(40, r4);
        b((byte) ((r0 >> 6) & 3), (byte) (r0 & 7), r8, r13);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fd, code lost:
        r5 = (r5 + (((r13 - r5) + (r11 - r9)) / 2)) - r2;
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0102, code lost:
        return r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a() {
        /*
            java.net.DatagramSocket r1 = new java.net.DatagramSocket
            r1.<init>()
            java.lang.Object r2 = f13344b     // Catch:{ all -> 0x0103 }
            monitor-enter(r2)     // Catch:{ all -> 0x0103 }
            monitor-exit(r2)     // Catch:{ all -> 0x0129 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.setSoTimeout(r0)     // Catch:{ all -> 0x0103 }
            c()     // Catch:{ all -> 0x0103 }
            java.lang.String r0 = "time.android.com"
            java.net.InetAddress[] r2 = java.net.InetAddress.getAllByName(r0)     // Catch:{ all -> 0x0103 }
            int r3 = r2.length     // Catch:{ all -> 0x0103 }
            r4 = 0
            r0 = 0
            r5 = r0
            r6 = 0
            r7 = 0
        L_0x001d:
            if (r6 >= r3) goto L_0x0124
            r0 = r2[r6]     // Catch:{ all -> 0x0103 }
            r8 = 48
            byte[] r9 = new byte[r8]     // Catch:{ all -> 0x0103 }
            java.net.DatagramPacket r10 = new java.net.DatagramPacket     // Catch:{ all -> 0x0103 }
            r11 = 123(0x7b, float:1.72E-43)
            r10.<init>(r9, r8, r0, r11)     // Catch:{ all -> 0x0103 }
            r0 = 27
            r9[r4] = r0     // Catch:{ all -> 0x0103 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0103 }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0103 }
            r15 = 0
            r0 = 40
            int r18 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r18 != 0) goto L_0x0049
            java.util.Arrays.fill(r9, r0, r8, r4)     // Catch:{ all -> 0x0103 }
            r24 = r5
            r22 = r9
            r9 = r2
            goto L_0x00bc
        L_0x0049:
            r15 = 1000(0x3e8, double:4.94E-321)
            long r18 = r11 / r15
            java.lang.Long.signum(r18)
            long r20 = r18 * r15
            long r20 = r11 - r20
            r22 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            r24 = r5
            long r4 = r18 + r22
            r18 = r1
            r17 = 24
            long r0 = r4 >> r17
            int r1 = (int) r0
            byte r0 = (byte) r1
            r1 = 40
            r9[r1] = r0     // Catch:{ all -> 0x0120 }
            r0 = 16
            r22 = r9
            long r8 = r4 >> r0
            int r9 = (int) r8     // Catch:{ all -> 0x0120 }
            byte r8 = (byte) r9     // Catch:{ all -> 0x0120 }
            r9 = 41
            r22[r9] = r8     // Catch:{ all -> 0x0120 }
            r8 = 8
            r9 = r2
            long r1 = r4 >> r8
            int r2 = (int) r1     // Catch:{ all -> 0x0120 }
            byte r1 = (byte) r2     // Catch:{ all -> 0x0120 }
            r2 = 42
            r22[r2] = r1     // Catch:{ all -> 0x0120 }
            int r1 = (int) r4     // Catch:{ all -> 0x0120 }
            byte r1 = (byte) r1     // Catch:{ all -> 0x0120 }
            r2 = 43
            r22[r2] = r1     // Catch:{ all -> 0x0120 }
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            long r20 = r20 * r1
            long r20 = r20 / r15
            r1 = 24
            long r4 = r20 >> r1
            int r1 = (int) r4     // Catch:{ all -> 0x0120 }
            byte r1 = (byte) r1     // Catch:{ all -> 0x0120 }
            r2 = 44
            r22[r2] = r1     // Catch:{ all -> 0x0120 }
            long r0 = r20 >> r0
            int r1 = (int) r0     // Catch:{ all -> 0x0120 }
            byte r0 = (byte) r1     // Catch:{ all -> 0x0120 }
            r1 = 45
            r22[r1] = r0     // Catch:{ all -> 0x0120 }
            long r0 = r20 >> r8
            int r1 = (int) r0     // Catch:{ all -> 0x0120 }
            byte r0 = (byte) r1     // Catch:{ all -> 0x0120 }
            r1 = 46
            r22[r1] = r0     // Catch:{ all -> 0x0120 }
            double r0 = java.lang.Math.random()     // Catch:{ all -> 0x0120 }
            r4 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 * r4
            int r0 = (int) r0     // Catch:{ all -> 0x0120 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x0120 }
            r1 = 47
            r22[r1] = r0     // Catch:{ all -> 0x0120 }
            r1 = r18
        L_0x00bc:
            r1.send(r10)     // Catch:{ all -> 0x0103 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ all -> 0x0103 }
            r4 = r22
            r2 = 48
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0103 }
            r1.receive(r0)     // Catch:{ SocketTimeoutException -> 0x0106 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0103 }
            long r5 = r2 - r13
            long r5 = r5 + r11
            r8 = 0
            byte r0 = r4[r8]     // Catch:{ all -> 0x0103 }
            int r7 = r0 >> 6
            r7 = r7 & 3
            byte r7 = (byte) r7     // Catch:{ all -> 0x0103 }
            r0 = r0 & 7
            byte r0 = (byte) r0     // Catch:{ all -> 0x0103 }
            r8 = 1
            byte r8 = r4[r8]     // Catch:{ all -> 0x0103 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 24
            long r9 = e(r9, r4)     // Catch:{ all -> 0x0103 }
            r11 = 32
            long r11 = e(r11, r4)     // Catch:{ all -> 0x0103 }
            r13 = 40
            long r13 = e(r13, r4)     // Catch:{ all -> 0x0103 }
            b(r7, r0, r8, r13)     // Catch:{ all -> 0x0103 }
            long r11 = r11 - r9
            long r13 = r13 - r5
            long r13 = r13 + r11
            r7 = 2
            long r13 = r13 / r7
            long r5 = r5 + r13
            long r5 = r5 - r2
            r1.close()
            return r5
        L_0x0103:
            r0 = move-exception
        L_0x0104:
            r2 = r0
            goto L_0x012c
        L_0x0106:
            r0 = move-exception
            r8 = 0
            r2 = r0
            if (r24 != 0) goto L_0x010d
            r5 = r2
            goto L_0x0113
        L_0x010d:
            r4 = r24
            r4.addSuppressed(r2)     // Catch:{ all -> 0x0103 }
            r5 = r4
        L_0x0113:
            int r0 = r7 + 1
            r2 = 10
            if (r7 >= r2) goto L_0x0125
            int r6 = r6 + 1
            r7 = r0
            r2 = r9
            r4 = 0
            goto L_0x001d
        L_0x0120:
            r0 = move-exception
            r1 = r18
            goto L_0x0104
        L_0x0124:
            r4 = r5
        L_0x0125:
            r5.getClass()     // Catch:{ all -> 0x0103 }
            throw r5     // Catch:{ all -> 0x0103 }
        L_0x0129:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0129 }
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x012c:
            r1.close()     // Catch:{ all -> 0x0130 }
            goto L_0x0135
        L_0x0130:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)
        L_0x0135:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C1207b.a():long");
    }

    public static void b(byte b8, byte b9, int i, long j7) {
        if (b8 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b9 != 4 && b9 != 5) {
            throw new IOException(g.m(b9, "SNTP: Untrusted mode: "));
        } else if (i == 0 || i > 15) {
            throw new IOException(g.m(i, "SNTP: Untrusted stratum: "));
        } else if (j7 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void c() {
        synchronized (f13344b) {
        }
    }

    public static long d(int i, byte[] bArr) {
        byte b8 = bArr[i];
        byte b9 = bArr[i + 1];
        byte b10 = bArr[i + 2];
        byte b11 = bArr[i + 3];
        byte b12 = b8 & true;
        int i8 = b8;
        if (b12 == true) {
            i8 = (b8 & Byte.MAX_VALUE) + 128;
        }
        byte b13 = b9 & true;
        int i9 = b9;
        if (b13 == true) {
            i9 = (b9 & Byte.MAX_VALUE) + 128;
        }
        byte b14 = b10 & true;
        int i10 = b10;
        if (b14 == true) {
            i10 = (b10 & Byte.MAX_VALUE) + 128;
        }
        byte b15 = b11 & true;
        int i11 = b11;
        if (b15 == true) {
            i11 = (b11 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i8) << 24) + (((long) i9) << 16) + (((long) i10) << 8) + ((long) i11);
    }

    public static long e(int i, byte[] bArr) {
        long d8 = d(i, bArr);
        long d9 = d(i + 4, bArr);
        if (d8 == 0 && d9 == 0) {
            return 0;
        }
        return ((d9 * 1000) / 4294967296L) + ((d8 - 2208988800L) * 1000);
    }
}
