package org.altbeacon.beacon.distance;

public class DistanceConfigFetcher {
    private static final String TAG = "DistanceConfigFetcher";
    protected Exception mException;
    protected String mResponse;
    private int mResponseCode = -1;
    private String mUrlString;
    private String mUserAgentString;

    public DistanceConfigFetcher(String str, String str2) {
        this.mUrlString = str;
        this.mUserAgentString = str2;
    }

    public Exception getException() {
        return this.mException;
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public String getResponseString() {
        return this.mResponse;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9 A[EDGE_INSN: B:49:0x00b9->B:37:0x00b9 ?: BREAK  
    EDGE_INSN: B:50:0x00b9->B:37:0x00b9 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x000e A[LOOP:0: B:1:0x000e->B:48:0x000e, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void request() {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            r12.mResponse = r1
            java.lang.String r2 = r12.mUrlString
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            r6 = r1
            r5 = 0
        L_0x000e:
            java.lang.String r7 = "DistanceConfigFetcher"
            if (r5 == 0) goto L_0x002a
            java.lang.String r2 = r12.mUrlString
            java.lang.String r8 = "Location"
            java.lang.String r9 = r6.getHeaderField(r8)
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r4] = r2
            r10[r0] = r9
            java.lang.String r2 = "Following redirect from %s to %s"
            org.altbeacon.beacon.logging.LogManager.d(r7, r2, r10)
            java.lang.String r2 = r6.getHeaderField(r8)
        L_0x002a:
            int r5 = r5 + r0
            r8 = -1
            r12.mResponseCode = r8
            java.net.URL r8 = new java.net.URL     // Catch:{ Exception -> 0x0034 }
            r8.<init>(r2)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0043
        L_0x0034:
            r8 = move-exception
            java.lang.String r9 = r12.mUrlString
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r4] = r9
            java.lang.String r9 = "Can't construct URL from: %s"
            org.altbeacon.beacon.logging.LogManager.e(r7, r9, r10)
            r12.mException = r8
            r8 = r1
        L_0x0043:
            if (r8 != 0) goto L_0x004e
            java.lang.String r8 = "URL is null.  Cannot make request"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            org.altbeacon.beacon.logging.LogManager.d(r7, r8, r9)
            goto L_0x00a7
        L_0x004e:
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ SecurityException -> 0x0084, FileNotFoundException -> 0x007f, IOException -> 0x007a }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ SecurityException -> 0x0084, FileNotFoundException -> 0x007f, IOException -> 0x007a }
            java.lang.String r6 = "User-Agent"
            java.lang.String r9 = r12.mUserAgentString     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            r8.addRequestProperty(r6, r9)     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            int r6 = r8.getResponseCode()     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            r12.mResponseCode = r6     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            java.lang.String r6 = "response code is %s"
            int r9 = r8.getResponseCode()     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            r10[r4] = r9     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            org.altbeacon.beacon.logging.LogManager.d(r7, r6, r10)     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
        L_0x0072:
            r6 = r8
            goto L_0x00a7
        L_0x0074:
            r6 = move-exception
            goto L_0x0089
        L_0x0076:
            r6 = move-exception
            goto L_0x0093
        L_0x0078:
            r6 = move-exception
            goto L_0x009d
        L_0x007a:
            r8 = move-exception
            r11 = r8
            r8 = r6
            r6 = r11
            goto L_0x0089
        L_0x007f:
            r8 = move-exception
            r11 = r8
            r8 = r6
            r6 = r11
            goto L_0x0093
        L_0x0084:
            r8 = move-exception
            r11 = r8
            r8 = r6
            r6 = r11
            goto L_0x009d
        L_0x0089:
            java.lang.String r9 = "Can't reach server"
            java.lang.Object[] r10 = new java.lang.Object[r4]
            org.altbeacon.beacon.logging.LogManager.w(r6, r7, r9, r10)
            r12.mException = r6
            goto L_0x0072
        L_0x0093:
            java.lang.String r9 = "No data exists at \"+urlString"
            java.lang.Object[] r10 = new java.lang.Object[r4]
            org.altbeacon.beacon.logging.LogManager.w(r6, r7, r9, r10)
            r12.mException = r6
            goto L_0x0072
        L_0x009d:
            java.lang.String r9 = "Can't reach sever.  Have you added android.permission.INTERNET to your manifest?"
            java.lang.Object[] r10 = new java.lang.Object[r4]
            org.altbeacon.beacon.logging.LogManager.w(r6, r7, r9, r10)
            r12.mException = r6
            goto L_0x0072
        L_0x00a7:
            r8 = 10
            if (r5 >= r8) goto L_0x00b9
            int r8 = r12.mResponseCode
            r9 = 302(0x12e, float:4.23E-43)
            if (r8 == r9) goto L_0x000e
            r9 = 301(0x12d, float:4.22E-43)
            if (r8 == r9) goto L_0x000e
            r9 = 303(0x12f, float:4.25E-43)
            if (r8 == r9) goto L_0x000e
        L_0x00b9:
            java.lang.Exception r0 = r12.mException
            if (r0 != 0) goto L_0x00ea
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d5 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d5 }
            java.io.InputStream r2 = r6.getInputStream()     // Catch:{ Exception -> 0x00d5 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00d5 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d5 }
        L_0x00cb:
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x00d7
            r3.append(r1)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00cb
        L_0x00d5:
            r0 = move-exception
            goto L_0x00e1
        L_0x00d7:
            r0.close()     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00d5 }
            r12.mResponse = r0     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00ea
        L_0x00e1:
            r12.mException = r0
            java.lang.String r1 = "error reading beacon data"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            org.altbeacon.beacon.logging.LogManager.w(r0, r7, r1, r2)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.distance.DistanceConfigFetcher.request():void");
    }
}
