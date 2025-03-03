package de.ozerov.fully;

public final /* synthetic */ class Q implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10280U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ CloudService f10281V;

    public /* synthetic */ Q(CloudService cloudService, int i) {
        this.f10280U = i;
        this.f10281V = cloudService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0210, code lost:
        r12 = r18.getHostAddress();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0215, code lost:
        r12 = "unknown address";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0257, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019e, code lost:
        r17 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e7, code lost:
        r18 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01eb, code lost:
        r18 = r1;
        r17 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f0, code lost:
        android.util.Log.e("y2", "Out of memory catched " + r0.getMessage());
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0257 A[Catch:{ Exception -> 0x025b }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d A[Catch:{ Exception -> 0x01a1, OutOfMemoryError -> 0x019d }, ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:71:0x018a] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e2 A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:85:0x01af] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            r2 = 1
            int r0 = r1.f10280U
            switch(r0) {
                case 0: goto L_0x0322;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r3 = "https://remoting2.fully-kiosk.com"
            java.lang.String r4 = "remotingServerHost"
            de.ozerov.fully.CloudService r5 = r1.f10281V
            java.lang.String r6 = "devid"
            java.lang.String r7 = "56"
            java.lang.String r8 = "appid"
            java.lang.String r9 = "CloudService"
            boolean r0 = r5.f9844d0
            if (r0 != 0) goto L_0x001c
            goto L_0x0321
        L_0x001c:
            java.lang.String r10 = de.ozerov.fully.P.i(r5)
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x007d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r12.<init>()     // Catch:{ Exception -> 0x007d }
            d4.k r13 = r5.f9836V     // Catch:{ Exception -> 0x007d }
            java.lang.Object r13 = r13.f9767W     // Catch:{ Exception -> 0x007d }
            Z1.c r13 = (Z1.c) r13     // Catch:{ Exception -> 0x007d }
            java.lang.String r13 = r13.r(r4, r3)     // Catch:{ Exception -> 0x007d }
            r12.append(r13)     // Catch:{ Exception -> 0x007d }
            java.lang.String r13 = "/api/pull2.php"
            r12.append(r13)     // Catch:{ Exception -> 0x007d }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x007d }
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ Exception -> 0x007d }
            android.net.Uri$Builder r12 = r12.buildUpon()     // Catch:{ Exception -> 0x007d }
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r8, r7)     // Catch:{ Exception -> 0x007d }
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r6, r10)     // Catch:{ Exception -> 0x007d }
            java.lang.String r13 = "pass"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r14.<init>()     // Catch:{ Exception -> 0x007d }
            d4.k r15 = r5.f9836V     // Catch:{ Exception -> 0x007d }
            java.lang.String r15 = r15.K1()     // Catch:{ Exception -> 0x007d }
            r14.append(r15)     // Catch:{ Exception -> 0x007d }
            r14.append(r10)     // Catch:{ Exception -> 0x007d }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x007d }
            java.lang.String r14 = n2.a.j0(r14)     // Catch:{ Exception -> 0x007d }
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r13, r14)     // Catch:{ Exception -> 0x007d }
            android.net.Uri r12 = r12.build()     // Catch:{ Exception -> 0x007d }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x007d }
            r0.<init>(r12)     // Catch:{ Exception -> 0x007d }
            byte[] r0 = de.ozerov.fully.C0808y2.i(r0, r2)     // Catch:{ Exception -> 0x007d }
            r12 = r0
            goto L_0x0089
        L_0x007d:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Error building pull URL: "
            r12.<init>(r13)
            Q0.g.x(r0, r12, r9)
            r12 = 0
        L_0x0089:
            if (r12 == 0) goto L_0x011e
            java.lang.String r14 = new java.lang.String     // Catch:{ Exception -> 0x0110 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ Exception -> 0x0110 }
            r14.<init>(r12, r0)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r0 = "\r\n"
            java.lang.String[] r15 = r14.split(r0)     // Catch:{ Exception -> 0x010b }
            int r0 = r15.length     // Catch:{ Exception -> 0x0101 }
            r11 = 0
            r17 = 0
            r18 = 0
        L_0x009e:
            if (r11 >= r0) goto L_0x00f8
            r13 = r15[r11]     // Catch:{ Exception -> 0x00ce }
            java.lang.String r2 = "Fully-Remote-Record-ID:"
            boolean r2 = r13.startsWith(r2)     // Catch:{ Exception -> 0x00ce }
            r19 = r0
            java.lang.String r0 = ":"
            if (r2 == 0) goto L_0x00d4
            java.lang.String[] r2 = r13.split(r0)     // Catch:{ Exception -> 0x00ce }
            r20 = r14
            int r14 = r2.length     // Catch:{ Exception -> 0x00c8 }
            r21 = r15
            r15 = 2
            if (r14 != r15) goto L_0x00d8
            r14 = 1
            r2 = r2[r14]     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r17 = r2.trim()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00d8
        L_0x00c2:
            r0 = move-exception
            r14 = r20
            r15 = r21
            goto L_0x0113
        L_0x00c8:
            r0 = move-exception
            r21 = r15
            r14 = r20
            goto L_0x0113
        L_0x00ce:
            r0 = move-exception
            r20 = r14
            r21 = r15
            goto L_0x0113
        L_0x00d4:
            r20 = r14
            r21 = r15
        L_0x00d8:
            java.lang.String r2 = "Fully-Remote-Password:"
            boolean r2 = r13.startsWith(r2)     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00ef
            java.lang.String[] r0 = r13.split(r0)     // Catch:{ Exception -> 0x00c2 }
            int r2 = r0.length     // Catch:{ Exception -> 0x00c2 }
            r13 = 2
            if (r2 != r13) goto L_0x00ef
            r2 = 1
            r0 = r0[r2]     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r18 = r0.trim()     // Catch:{ Exception -> 0x00c2 }
        L_0x00ef:
            r2 = 1
            int r11 = r11 + r2
            r0 = r19
            r14 = r20
            r15 = r21
            goto L_0x009e
        L_0x00f8:
            r20 = r14
            r21 = r15
        L_0x00fc:
            r2 = r17
            r0 = r18
            goto L_0x0122
        L_0x0101:
            r0 = move-exception
            r20 = r14
            r21 = r15
        L_0x0106:
            r17 = 0
            r18 = 0
            goto L_0x0113
        L_0x010b:
            r0 = move-exception
            r20 = r14
        L_0x010e:
            r15 = 0
            goto L_0x0106
        L_0x0110:
            r0 = move-exception
            r14 = 0
            goto L_0x010e
        L_0x0113:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r11 = "Error parsing pull response: "
            r2.<init>(r11)
            Q0.g.x(r0, r2, r9)
            goto L_0x00fc
        L_0x011e:
            r0 = 0
            r2 = 0
            r14 = 0
            r15 = 0
        L_0x0122:
            if (r14 == 0) goto L_0x02f7
            if (r15 == 0) goto L_0x02f7
            if (r2 == 0) goto L_0x02f7
            if (r0 == 0) goto L_0x02f7
            java.lang.String r11 = r14.trim()
            java.lang.String r13 = ""
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x02f7
            java.lang.String r11 = r14.trim()
            java.lang.String r13 = "Not found"
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x0144
            goto L_0x02f7
        L_0x0144:
            long r13 = java.lang.System.currentTimeMillis()
            r5.f9838X = r13
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            d4.k r13 = r5.f9836V
            java.lang.String r13 = r13.K1()
            r11.append(r13)
            r11.append(r10)
            java.lang.String r13 = "Fully Pull Salt"
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = n2.a.j0(r11)
            boolean r0 = r0.equals(r11)
            java.lang.String r11 = "500 Server Error"
            if (r0 != 0) goto L_0x0181
            java.lang.String r0 = "Wrong password in request"
            android.util.Log.e(r9, r0)
            java.lang.String r0 = "400 Bad Request"
            java.lang.String r12 = "Wrong Remote Admin Password"
            byte[] r0 = de.ozerov.fully.C0808y2.d(r0, r12)
            r17 = r15
            goto L_0x025d
        L_0x0181:
            java.util.ArrayList r0 = de.ozerov.fully.C0808y2.f11115a
            java.lang.String r13 = "y2"
            java.net.Socket r14 = new java.net.Socket
            r14.<init>()
            boolean r0 = P5.P.f3858r     // Catch:{ Exception -> 0x01a1, OutOfMemoryError -> 0x019d }
            if (r0 == 0) goto L_0x01a7
            javax.net.ssl.SSLContext r0 = P5.P.d(r5)     // Catch:{ Exception -> 0x01a1, OutOfMemoryError -> 0x019d }
            if (r0 == 0) goto L_0x01a7
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x01a1, OutOfMemoryError -> 0x019d }
            java.net.Socket r14 = r0.createSocket()     // Catch:{ Exception -> 0x01a1, OutOfMemoryError -> 0x019d }
            goto L_0x01a7
        L_0x019d:
            r0 = move-exception
            r17 = r15
            goto L_0x01f0
        L_0x01a1:
            r0 = move-exception
            r17 = r15
            r18 = 0
            goto L_0x0207
        L_0x01a7:
            java.net.InetAddress r1 = java.net.InetAddress.getLoopbackAddress()     // Catch:{ Exception -> 0x01a1, OutOfMemoryError -> 0x019d }
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x019d }
            r17 = r15
            int r15 = P5.P.f3859s     // Catch:{ Exception -> 0x01e6, OutOfMemoryError -> 0x01e2 }
            r0.<init>(r1, r15)     // Catch:{ Exception -> 0x01e6, OutOfMemoryError -> 0x01e2 }
            r15 = 2500(0x9c4, float:3.503E-42)
            r14.connect(r0, r15)     // Catch:{ Exception -> 0x01e6, OutOfMemoryError -> 0x01e2 }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r14.setSoTimeout(r0)     // Catch:{ Exception -> 0x01e6, OutOfMemoryError -> 0x01e2 }
            java.io.OutputStream r0 = r14.getOutputStream()     // Catch:{ Exception -> 0x01e6, OutOfMemoryError -> 0x01e2 }
            java.io.BufferedInputStream r15 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x01e6, OutOfMemoryError -> 0x01e2 }
            r18 = r1
            java.io.InputStream r1 = r14.getInputStream()     // Catch:{ Exception -> 0x01e4, OutOfMemoryError -> 0x01e2 }
            r15.<init>(r1)     // Catch:{ Exception -> 0x01e4, OutOfMemoryError -> 0x01e2 }
            r0.write(r12)     // Catch:{ Exception -> 0x01e4, OutOfMemoryError -> 0x01e2 }
            r0.flush()     // Catch:{ Exception -> 0x01e4, OutOfMemoryError -> 0x01e2 }
            byte[] r0 = E7.f.a(r15)     // Catch:{ Exception -> 0x01e4, OutOfMemoryError -> 0x01e2 }
            boolean r1 = r14.isConnected()     // Catch:{ Exception -> 0x01e4, OutOfMemoryError -> 0x01e2 }
            if (r1 == 0) goto L_0x025d
            r14.close()     // Catch:{ Exception -> 0x01e4, OutOfMemoryError -> 0x01e2 }
            goto L_0x025d
        L_0x01e2:
            r0 = move-exception
            goto L_0x01f0
        L_0x01e4:
            r0 = move-exception
            goto L_0x0207
        L_0x01e6:
            r0 = move-exception
            r18 = r1
            goto L_0x0207
        L_0x01ea:
            r0 = move-exception
            r18 = r1
            r17 = r15
            goto L_0x0207
        L_0x01f0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r12 = "Out of memory catched "
            r1.<init>(r12)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r13, r0)
            r0 = 0
            goto L_0x025d
        L_0x0207:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r12 = "Connection to localhost at "
            r1.<init>(r12)
            if (r18 == 0) goto L_0x0215
            java.lang.String r12 = r18.getHostAddress()
            goto L_0x0217
        L_0x0215:
            java.lang.String r12 = "unknown address"
        L_0x0217:
            r1.append(r12)
            java.lang.String r12 = " port "
            r1.append(r12)
            int r12 = P5.P.f3859s
            r1.append(r12)
            java.lang.String r12 = " failed due to "
            r1.append(r12)
            java.lang.String r12 = r0.getMessage()
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r12 = " Remote Admin service running: "
            java.lang.StringBuilder r1 = N.e.B(r1, r12)
            java.lang.Class<de.ozerov.fully.remoteadmin.RemoteAdminService> r12 = de.ozerov.fully.remoteadmin.RemoteAdminService.class
            boolean r12 = de.ozerov.fully.C0794w0.i0(r5, r12)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            byte[] r12 = de.ozerov.fully.C0808y2.d(r11, r1)
            android.util.Log.e(r13, r1)
            r0.printStackTrace()
            boolean r0 = r14.isConnected()     // Catch:{ Exception -> 0x025b }
            if (r0 == 0) goto L_0x025c
            r14.close()     // Catch:{ Exception -> 0x025b }
            goto L_0x025c
        L_0x025b:
        L_0x025c:
            r0 = r12
        L_0x025d:
            if (r0 != 0) goto L_0x0267
            java.lang.String r0 = "No data found"
            byte[] r0 = de.ozerov.fully.C0808y2.d(r11, r0)
        L_0x0265:
            r13 = r0
            goto L_0x0273
        L_0x0267:
            int r1 = r0.length
            r12 = 33554432(0x2000000, float:9.403955E-38)
            if (r1 <= r12) goto L_0x0265
            java.lang.String r0 = "Downloading more than 8 MB using Fully Cloud is not supported"
            byte[] r0 = de.ozerov.fully.C0808y2.d(r11, r0)
            goto L_0x0265
        L_0x0273:
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x02c2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02c2 }
            r1.<init>()     // Catch:{ Exception -> 0x02c2 }
            d4.k r11 = r5.f9836V     // Catch:{ Exception -> 0x02c2 }
            java.lang.Object r11 = r11.f9767W     // Catch:{ Exception -> 0x02c2 }
            Z1.c r11 = (Z1.c) r11     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r3 = r11.r(r4, r3)     // Catch:{ Exception -> 0x02c2 }
            r1.append(r3)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r3 = "/api/push2.php"
            r1.append(r3)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02c2 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x02c2 }
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ Exception -> 0x02c2 }
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r8, r7)     // Catch:{ Exception -> 0x02c2 }
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r6, r10)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r3 = "hash"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r2)     // Catch:{ Exception -> 0x02c2 }
            android.net.Uri r1 = r1.build()     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02c2 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r11 = r0.toString()     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r12 = "application/octet-stream"
            r15 = 40000(0x9c40, float:5.6052E-41)
            r16 = 3
            r14 = 5000(0x1388, float:7.006E-42)
            de.ozerov.fully.C0808y2.m(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x02c2 }
            goto L_0x02cd
        L_0x02c2:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Push failed: "
            r1.<init>(r2)
            Q0.g.x(r0, r1, r9)
        L_0x02cd:
            java.lang.String r0 = "[?&]mass=([0-9]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r1 = 0
            r1 = r17[r1]
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x02f1
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f1
            r5.e()
            goto L_0x0321
        L_0x02f1:
            r0 = 0
            r5.c(r0)
            goto L_0x0321
        L_0x02f7:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.f9838X
            long r0 = r0 - r2
            r2 = 90000(0x15f90, double:4.4466E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0309
            r5.e()
            goto L_0x0321
        L_0x0309:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.f9838X
            long r0 = r0 - r2
            r2 = 30000(0x7530, double:1.4822E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x031c
            r0 = 5000(0x1388, double:2.4703E-320)
            r5.c(r0)
            goto L_0x0321
        L_0x031c:
            r0 = 1000(0x3e8, double:4.94E-321)
            r5.c(r0)
        L_0x0321:
            return
        L_0x0322:
            de.ozerov.fully.CloudService r0 = r1.f10281V
            de.ozerov.fully.d4 r2 = r0.f9845e0
            java.util.concurrent.BlockingQueue r3 = r2.getQueue()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x033f
            int r3 = r2.getActiveCount()
            if (r3 != 0) goto L_0x033f
            de.ozerov.fully.Q r3 = new de.ozerov.fully.Q
            r4 = 1
            r3.<init>(r0, r4)
            r2.execute(r3)
        L_0x033f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.Q.run():void");
    }
}
