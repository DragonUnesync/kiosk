package e6;

import java.security.PrivilegedAction;

/* renamed from: e6.u  reason: case insensitive filesystem */
public final class C0861u implements PrivilegedAction {
    private C0861u() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095 A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ad A[SYNTHETIC, Splitter:B:41:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7 A[SYNTHETIC, Splitter:B:47:0x00b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer run() {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "Failed to get SOMAXCONN from sysctl and file {}. Default: {}"
            boolean r2 = g6.Y.isWindows()
            if (r2 == 0) goto L_0x000c
            r2 = 200(0xc8, float:2.8E-43)
            goto L_0x000e
        L_0x000c:
            r2 = 128(0x80, float:1.794E-43)
        L_0x000e:
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/proc/sys/net/core/somaxconn"
            r3.<init>(r4)
            r4 = 0
            boolean r5 = r3.exists()     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            if (r5 == 0) goto L_0x0055
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            java.lang.String r4 = r5.readLine()     // Catch:{ Exception -> 0x004a }
            int r2 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x004a }
            h6.c r4 = e6.C0862v.logger     // Catch:{ Exception -> 0x004a }
            boolean r4 = r4.isDebugEnabled()     // Catch:{ Exception -> 0x004a }
            if (r4 == 0) goto L_0x004c
            h6.c r4 = e6.C0862v.logger     // Catch:{ Exception -> 0x004a }
            java.lang.String r6 = "{}: {}"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x004a }
            r4.debug(r6, r3, r7)     // Catch:{ Exception -> 0x004a }
            goto L_0x004c
        L_0x0046:
            r0 = move-exception
            r4 = r5
            goto L_0x00b5
        L_0x004a:
            r4 = move-exception
            goto L_0x008b
        L_0x004c:
            r4 = r5
            goto L_0x0085
        L_0x004e:
            r0 = move-exception
            goto L_0x00b5
        L_0x0050:
            r5 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
            goto L_0x008b
        L_0x0055:
            java.lang.String r5 = "io.netty.net.somaxconn.trySysctl"
            boolean r5 = g6.p0.getBoolean(r5, r0)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            if (r5 == 0) goto L_0x0077
            java.lang.String r5 = "kern.ipc.somaxconn"
            java.lang.Integer r5 = e6.C0862v.sysctlGetInt(r5)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            if (r5 != 0) goto L_0x0072
            java.lang.String r5 = "kern.ipc.soacceptqueue"
            java.lang.Integer r5 = e6.C0862v.sysctlGetInt(r5)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            if (r5 == 0) goto L_0x0078
            int r2 = r5.intValue()     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            goto L_0x0078
        L_0x0072:
            int r2 = r5.intValue()     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            goto L_0x0078
        L_0x0077:
            r5 = r4
        L_0x0078:
            if (r5 != 0) goto L_0x0085
            h6.c r5 = e6.C0862v.logger     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            r5.debug(r1, r3, r6)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
        L_0x0085:
            if (r4 == 0) goto L_0x00b0
            r4.close()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00b0
        L_0x008b:
            h6.c r6 = e6.C0862v.logger     // Catch:{ all -> 0x0046 }
            boolean r6 = r6.isDebugEnabled()     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x00ab
            h6.c r6 = e6.C0862v.logger     // Catch:{ all -> 0x0046 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0046 }
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0046 }
            r8[r0] = r3     // Catch:{ all -> 0x0046 }
            r0 = 1
            r8[r0] = r7     // Catch:{ all -> 0x0046 }
            r0 = 2
            r8[r0] = r4     // Catch:{ all -> 0x0046 }
            r6.debug((java.lang.String) r1, (java.lang.Object[]) r8)     // Catch:{ all -> 0x0046 }
        L_0x00ab:
            if (r5 == 0) goto L_0x00b0
            r5.close()     // Catch:{ Exception -> 0x00b0 }
        L_0x00b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x00b5:
            if (r4 == 0) goto L_0x00ba
            r4.close()     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.C0861u.run():java.lang.Integer");
    }
}
