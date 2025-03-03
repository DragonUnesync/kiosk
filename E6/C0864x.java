package e6;

import g6.Y;
import h6.C1082c;
import h6.d;
import j$.util.DesugarCollections;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

/* renamed from: e6.x  reason: case insensitive filesystem */
public abstract class C0864x {
    private static final C1082c logger = d.getInstance((Class<?>) C0864x.class);

    public static Inet4Address createLocalhost4() {
        try {
            return (Inet4Address) InetAddress.getByAddress("localhost", new byte[]{Byte.MAX_VALUE, 0, 0, 1});
        } catch (Exception e) {
            Y.throwException(e);
            return null;
        }
    }

    public static Inet6Address createLocalhost6() {
        try {
            return (Inet6Address) InetAddress.getByAddress("localhost", new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
        } catch (Exception e) {
            Y.throwException(e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.net.InetAddress, java.net.Inet6Address, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        r5 = r4.nextElement();
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d6, code lost:
        if (r5 != null) goto L_0x00d9;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.net.Inet4Address, code=java.net.InetAddress, for r8v0, types: [java.lang.Object, java.net.Inet4Address] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.net.Inet6Address, code=java.net.InetAddress, for r9v0, types: [java.net.InetAddress, java.net.Inet6Address, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e6.C0863w determineLoopback(java.util.Collection<java.net.NetworkInterface> r7, java.net.InetAddress r8, java.net.InetAddress r9) {
        /*
            java.lang.String r0 = "Failed to find the loopback interface"
            java.lang.String r1 = "Using hard-coded IPv4 localhost address: {}"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x000d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r7.next()
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3
            java.util.Enumeration r4 = g6.m0.addressesFromNetworkInterface(r3)
            boolean r4 = r4.hasMoreElements()
            if (r4 == 0) goto L_0x000d
            r2.add(r3)
            goto L_0x000d
        L_0x0027:
            java.util.Iterator r7 = r2.iterator()
        L_0x002b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x004e
            java.lang.Object r3 = r7.next()
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3
            java.util.Enumeration r4 = g6.m0.addressesFromNetworkInterface(r3)
        L_0x003b:
            boolean r5 = r4.hasMoreElements()
            if (r5 == 0) goto L_0x002b
            java.lang.Object r5 = r4.nextElement()
            java.net.InetAddress r5 = (java.net.InetAddress) r5
            boolean r6 = r5.isLoopbackAddress()
            if (r6 == 0) goto L_0x003b
            goto L_0x0050
        L_0x004e:
            r3 = 0
            r5 = r3
        L_0x0050:
            if (r3 != 0) goto L_0x008d
            java.util.Iterator r7 = r2.iterator()     // Catch:{ SocketException -> 0x007e }
        L_0x0056:
            boolean r2 = r7.hasNext()     // Catch:{ SocketException -> 0x007e }
            if (r2 == 0) goto L_0x0080
            java.lang.Object r2 = r7.next()     // Catch:{ SocketException -> 0x007e }
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch:{ SocketException -> 0x007e }
            boolean r4 = r2.isLoopback()     // Catch:{ SocketException -> 0x007e }
            if (r4 == 0) goto L_0x0056
            java.util.Enumeration r4 = g6.m0.addressesFromNetworkInterface(r2)     // Catch:{ SocketException -> 0x007e }
            boolean r6 = r4.hasMoreElements()     // Catch:{ SocketException -> 0x007e }
            if (r6 == 0) goto L_0x0056
            java.lang.Object r7 = r4.nextElement()     // Catch:{ SocketException -> 0x007b }
            java.net.InetAddress r7 = (java.net.InetAddress) r7     // Catch:{ SocketException -> 0x007b }
            r5 = r7
            r3 = r2
            goto L_0x0080
        L_0x007b:
            r7 = move-exception
            r3 = r2
            goto L_0x0088
        L_0x007e:
            r7 = move-exception
            goto L_0x0088
        L_0x0080:
            if (r3 != 0) goto L_0x008d
            h6.c r7 = logger     // Catch:{ SocketException -> 0x007e }
            r7.warn((java.lang.String) r0)     // Catch:{ SocketException -> 0x007e }
            goto L_0x008d
        L_0x0088:
            h6.c r2 = logger
            r2.warn((java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x008d:
            if (r3 == 0) goto L_0x00af
            h6.c r7 = logger
            java.lang.String r8 = r3.getName()
            java.lang.String r9 = r3.getDisplayName()
            java.lang.String r0 = r5.getHostAddress()
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            r8 = 1
            r1[r8] = r9
            r8 = 2
            r1[r8] = r0
            java.lang.String r8 = "Loopback interface: {} ({}, {})"
            r7.debug((java.lang.String) r8, (java.lang.Object[]) r1)
            goto L_0x00d9
        L_0x00af:
            if (r5 != 0) goto L_0x00d9
            java.net.NetworkInterface r7 = java.net.NetworkInterface.getByInetAddress(r9)     // Catch:{ Exception -> 0x00c1, all -> 0x00bf }
            if (r7 == 0) goto L_0x00c3
            h6.c r7 = logger     // Catch:{ Exception -> 0x00c1, all -> 0x00bf }
            java.lang.String r0 = "Using hard-coded IPv6 localhost address: {}"
            r7.debug((java.lang.String) r0, (java.lang.Object) r9)     // Catch:{ Exception -> 0x00c1, all -> 0x00bf }
            goto L_0x00c4
        L_0x00bf:
            r7 = move-exception
            goto L_0x00ce
        L_0x00c1:
            goto L_0x00d6
        L_0x00c3:
            r9 = r5
        L_0x00c4:
            if (r9 != 0) goto L_0x00cc
        L_0x00c6:
            h6.c r7 = logger
            r7.debug((java.lang.String) r1, (java.lang.Object) r8)
            goto L_0x00da
        L_0x00cc:
            r8 = r9
            goto L_0x00da
        L_0x00ce:
            if (r5 != 0) goto L_0x00d5
            h6.c r9 = logger
            r9.debug((java.lang.String) r1, (java.lang.Object) r8)
        L_0x00d5:
            throw r7
        L_0x00d6:
            if (r5 != 0) goto L_0x00d9
            goto L_0x00c6
        L_0x00d9:
            r8 = r5
        L_0x00da:
            e6.w r7 = new e6.w
            r7.<init>(r3, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.C0864x.determineLoopback(java.util.Collection, java.net.Inet4Address, java.net.Inet6Address):e6.w");
    }

    public static Collection<NetworkInterface> networkInterfaces() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    arrayList.add(networkInterfaces.nextElement());
                }
            }
        } catch (SocketException e) {
            logger.warn("Failed to retrieve the list of available network interfaces", (Throwable) e);
        } catch (NullPointerException e8) {
            if (!Y.isAndroid()) {
                throw e8;
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
