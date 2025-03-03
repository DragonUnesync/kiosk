package B7;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f469U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f470V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f471W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f472X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f473Y;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f469U = i;
        this.f470V = obj;
        this.f471W = obj2;
        this.f472X = obj3;
        this.f473Y = obj4;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [a0.m, B.t0] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015e A[Catch:{ Exception -> 0x0173 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0160 A[Catch:{ Exception -> 0x0173 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025d A[SYNTHETIC, Splitter:B:95:0x025d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            r2 = 26
            r4 = 1
            r5 = 0
            int r0 = r1.f469U
            switch(r0) {
                case 0: goto L_0x03ef;
                case 1: goto L_0x03cd;
                case 2: goto L_0x03ab;
                case 3: goto L_0x0375;
                case 4: goto L_0x02fc;
                case 5: goto L_0x0107;
                case 6: goto L_0x00ae;
                case 7: goto L_0x0073;
                case 8: goto L_0x005b;
                case 9: goto L_0x0043;
                case 10: goto L_0x002b;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r1.f470V
            J4.c r0 = (J4.c) r0
            r0.a()
            java.util.concurrent.CompletableFuture r2 = java.util.concurrent.CompletableFuture.completedFuture((java.lang.Object) null)
            z4.c r3 = new z4.c
            java.lang.Object r4 = r1.f472X
            z4.b r4 = (z4.b) r4
            java.lang.Object r5 = r1.f473Y
            T5.Z0 r5 = (T5.Z0) r5
            java.lang.Object r6 = r1.f471W
            m4.b r6 = (m4.C1214b) r6
            r3.<init>(r0, r6, r4, r5)
            r2.whenComplete(r3)
            return
        L_0x002b:
            java.lang.Object r0 = r1.f470V
            u.f r0 = (u.C1465f) r0
            java.lang.Object r0 = r0.f15614b
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r0
            java.lang.Object r2 = r1.f471W
            android.hardware.camera2.CameraCaptureSession r2 = (android.hardware.camera2.CameraCaptureSession) r2
            java.lang.Object r3 = r1.f472X
            android.hardware.camera2.CaptureRequest r3 = (android.hardware.camera2.CaptureRequest) r3
            java.lang.Object r4 = r1.f473Y
            android.hardware.camera2.CaptureFailure r4 = (android.hardware.camera2.CaptureFailure) r4
            r0.onCaptureFailed(r2, r3, r4)
            return
        L_0x0043:
            java.lang.Object r0 = r1.f470V
            u.f r0 = (u.C1465f) r0
            java.lang.Object r0 = r0.f15614b
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r0
            java.lang.Object r2 = r1.f471W
            android.hardware.camera2.CameraCaptureSession r2 = (android.hardware.camera2.CameraCaptureSession) r2
            java.lang.Object r3 = r1.f472X
            android.hardware.camera2.CaptureRequest r3 = (android.hardware.camera2.CaptureRequest) r3
            java.lang.Object r4 = r1.f473Y
            android.hardware.camera2.CaptureResult r4 = (android.hardware.camera2.CaptureResult) r4
            r0.onCaptureProgressed(r2, r3, r4)
            return
        L_0x005b:
            java.lang.Object r0 = r1.f470V
            u.f r0 = (u.C1465f) r0
            java.lang.Object r0 = r0.f15614b
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r0
            java.lang.Object r2 = r1.f471W
            android.hardware.camera2.CameraCaptureSession r2 = (android.hardware.camera2.CameraCaptureSession) r2
            java.lang.Object r3 = r1.f472X
            android.hardware.camera2.CaptureRequest r3 = (android.hardware.camera2.CaptureRequest) r3
            java.lang.Object r4 = r1.f473Y
            android.hardware.camera2.TotalCaptureResult r4 = (android.hardware.camera2.TotalCaptureResult) r4
            r0.onCaptureCompleted(r2, r3, r4)
            return
        L_0x0073:
            java.lang.Object r0 = r1.f470V
            r2 = r0
            org.acra.collector.Collector r2 = (org.acra.collector.Collector) r2
            java.lang.Object r0 = r1.f471W
            s7.b r0 = (s7.C1409b) r0
            java.lang.Object r3 = r1.f472X
            p7.b r3 = (p7.C1347b) r3
            java.lang.Object r4 = r1.f473Y
            s7.a r4 = (s7.C1408a) r4
            org.acra.ErrorReporter r5 = n7.C1247a.f13789a     // Catch:{ c -> 0x0090, all -> 0x008e }
            android.app.Application r5 = r0.f15156a     // Catch:{ c -> 0x0090, all -> 0x008e }
            r7.d r0 = r0.f15157b     // Catch:{ c -> 0x0090, all -> 0x008e }
            r2.collect(r5, r0, r3, r4)     // Catch:{ c -> 0x0090, all -> 0x008e }
            goto L_0x00ad
        L_0x008e:
            r0 = move-exception
            goto L_0x0092
        L_0x0090:
            r0 = move-exception
            goto L_0x00a6
        L_0x0092:
            org.acra.ErrorReporter r3 = n7.C1247a.f13789a
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Error in collector "
            java.lang.String r2 = r3.concat(r2)
            n2.a.n1(r2, r0)
            goto L_0x00ad
        L_0x00a6:
            org.acra.ErrorReporter r2 = n7.C1247a.f13789a
            java.lang.String r2 = ""
            n2.a.n1(r2, r0)
        L_0x00ad:
            return
        L_0x00ae:
            java.lang.Object r0 = r1.f472X
            de.ozerov.fully.o0 r0 = (de.ozerov.fully.C0747o0) r0
            java.lang.Object r2 = r1.f470V
            de.ozerov.fully.G2 r2 = (de.ozerov.fully.G2) r2
            de.ozerov.fully.FullyActivity r3 = r2.f9966a
            boolean r4 = r3.w()
            if (r4 == 0) goto L_0x0106
            b3.a r4 = r3.f9921J0
            boolean r4 = r4.i()
            if (r4 == 0) goto L_0x0106
            android.os.Handler r4 = r2.f9978o
            if (r4 == 0) goto L_0x00cf
            r4.removeCallbacksAndMessages(r5)
            r2.f9978o = r5
        L_0x00cf:
            C7.d r2 = r3.f9948k1
            java.lang.Object r4 = r1.f471W
            java.lang.String r4 = (java.lang.String) r4
            r2.z(r4)
            U.d r2 = r3.f9919H0     // Catch:{ Exception -> 0x00de }
            r2.e(r4, r0)     // Catch:{ Exception -> 0x00de }
            goto L_0x0106
        L_0x00de:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can't start "
            r2.<init>(r3)
            java.lang.Object r3 = r1.f473Y
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.String r3 = n2.a.o0(r3)
            r2.append(r3)
            java.lang.String r3 = " due to "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "OtherAppManager"
            android.util.Log.w(r2, r0)
        L_0x0106:
            return
        L_0x0107:
            java.lang.Object r0 = r1.f470V
            r2 = r0
            de.ozerov.fully.H r2 = (de.ozerov.fully.H) r2
            java.lang.Object r0 = r1.f471W
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r1.f472X
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.f473Y
            java.lang.String r7 = (java.lang.String) r7
            r2.getClass()
            java.lang.String r8 = "Bluetooth opened and connected"
            boolean r9 = n2.a.r0()
            java.lang.String r10 = "H"
            java.lang.String r11 = "Missing Bluetooth Connect permission for this operation"
            if (r9 == 0) goto L_0x0134
            de.ozerov.fully.FullyActivity r9 = r2.f9981a
            int r9 = r9.checkSelfPermission("android.permission.BLUETOOTH_CONNECT")
            if (r9 == 0) goto L_0x0134
            android.util.Log.w(r10, r11)
            goto L_0x02f5
        L_0x0134:
            android.bluetooth.BluetoothDevice r9 = r2.f9983c
            if (r9 == 0) goto L_0x013f
            android.bluetooth.BluetoothSocket r9 = r2.f9982b
            if (r9 == 0) goto L_0x013f
            r2.b()
        L_0x013f:
            r2.f9983c = r5
            r2.f9984d = r5
            android.bluetooth.BluetoothAdapter r9 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0173 }
            if (r9 != 0) goto L_0x0150
            java.lang.String r9 = "No bluetooth adapter available"
            android.util.Log.w(r10, r9)     // Catch:{ Exception -> 0x0173 }
        L_0x014e:
            r9 = r5
            goto L_0x015c
        L_0x0150:
            boolean r12 = r9.isEnabled()     // Catch:{ Exception -> 0x0173 }
            if (r12 != 0) goto L_0x015c
            java.lang.String r9 = "Bluetooth adapter not enabled"
            android.util.Log.w(r10, r9)     // Catch:{ Exception -> 0x0173 }
            goto L_0x014e
        L_0x015c:
            if (r9 != 0) goto L_0x0160
            goto L_0x0255
        L_0x0160:
            boolean r12 = n2.a.r0()     // Catch:{ Exception -> 0x0173 }
            if (r12 == 0) goto L_0x0176
            de.ozerov.fully.FullyActivity r12 = r2.f9981a     // Catch:{ Exception -> 0x0173 }
            int r12 = r12.checkSelfPermission("android.permission.BLUETOOTH_CONNECT")     // Catch:{ Exception -> 0x0173 }
            if (r12 == 0) goto L_0x0176
            android.util.Log.w(r10, r11)     // Catch:{ Exception -> 0x0173 }
            goto L_0x0255
        L_0x0173:
            r0 = move-exception
            goto L_0x0252
        L_0x0176:
            java.util.Set r9 = r9.getBondedDevices()     // Catch:{ Exception -> 0x0173 }
            int r11 = r9.size()     // Catch:{ Exception -> 0x0173 }
            if (r11 <= 0) goto L_0x024c
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0173 }
        L_0x0184:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0173 }
            if (r11 == 0) goto L_0x024c
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x0173 }
            android.bluetooth.BluetoothDevice r11 = (android.bluetooth.BluetoothDevice) r11     // Catch:{ Exception -> 0x0173 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0173 }
            r12.<init>()     // Catch:{ Exception -> 0x0173 }
            java.lang.String r13 = "Found paired device "
            r12.append(r13)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r13 = r11.getName()     // Catch:{ Exception -> 0x0173 }
            r12.append(r13)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r13 = " "
            r12.append(r13)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r13 = r11.getAddress()     // Catch:{ Exception -> 0x0173 }
            r12.append(r13)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0173 }
            android.util.Log.i(r10, r12)     // Catch:{ Exception -> 0x0173 }
            if (r7 == 0) goto L_0x01c0
            java.lang.String r12 = r11.getName()     // Catch:{ Exception -> 0x0173 }
            boolean r12 = r12.equals(r7)     // Catch:{ Exception -> 0x0173 }
            if (r12 == 0) goto L_0x0209
        L_0x01c0:
            if (r0 == 0) goto L_0x01cc
            java.lang.String r12 = r11.getAddress()     // Catch:{ Exception -> 0x0173 }
            boolean r12 = r12.equals(r0)     // Catch:{ Exception -> 0x0173 }
            if (r12 == 0) goto L_0x0209
        L_0x01cc:
            if (r6 == 0) goto L_0x020c
            android.os.ParcelUuid[] r12 = r11.getUuids()     // Catch:{ Exception -> 0x0173 }
            if (r12 == 0) goto L_0x020c
            android.os.ParcelUuid[] r12 = r11.getUuids()     // Catch:{ Exception -> 0x0173 }
            int r13 = r12.length     // Catch:{ Exception -> 0x0173 }
            r14 = 0
        L_0x01da:
            if (r14 >= r13) goto L_0x0209
            r15 = r12[r14]     // Catch:{ Exception -> 0x0173 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0173 }
            java.lang.String r3 = "Found UUID "
            r5.<init>(r3)     // Catch:{ Exception -> 0x0173 }
            java.util.UUID r3 = r15.getUuid()     // Catch:{ Exception -> 0x0173 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0173 }
            r5.append(r3)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0173 }
            android.util.Log.i(r10, r3)     // Catch:{ Exception -> 0x0173 }
            java.util.UUID r3 = r15.getUuid()     // Catch:{ Exception -> 0x0173 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0173 }
            boolean r3 = r3.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x0173 }
            if (r3 == 0) goto L_0x0206
            goto L_0x020c
        L_0x0206:
            int r14 = r14 + r4
            r5 = 0
            goto L_0x01da
        L_0x0209:
            r5 = 0
            goto L_0x0184
        L_0x020c:
            r2.f9983c = r11     // Catch:{ Exception -> 0x0173 }
            if (r6 == 0) goto L_0x0217
            java.util.UUID r0 = java.util.UUID.fromString(r6)     // Catch:{ Exception -> 0x0173 }
            r2.f9984d = r0     // Catch:{ Exception -> 0x0173 }
            goto L_0x0235
        L_0x0217:
            android.os.ParcelUuid[] r0 = r11.getUuids()     // Catch:{ Exception -> 0x0173 }
            if (r0 == 0) goto L_0x0232
            android.os.ParcelUuid[] r0 = r11.getUuids()     // Catch:{ Exception -> 0x0173 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0173 }
            if (r0 <= 0) goto L_0x0232
            android.os.ParcelUuid[] r0 = r11.getUuids()     // Catch:{ Exception -> 0x0173 }
            r3 = 0
            r0 = r0[r3]     // Catch:{ Exception -> 0x0173 }
            java.util.UUID r0 = r0.getUuid()     // Catch:{ Exception -> 0x0173 }
            r2.f9984d = r0     // Catch:{ Exception -> 0x0173 }
            goto L_0x0235
        L_0x0232:
            r3 = 0
            r2.f9984d = r3     // Catch:{ Exception -> 0x0173 }
        L_0x0235:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0173 }
            r0.<init>()     // Catch:{ Exception -> 0x0173 }
            java.lang.String r3 = "Target Bluetooth device found, UUID="
            r0.append(r3)     // Catch:{ Exception -> 0x0173 }
            java.util.UUID r3 = r2.f9984d     // Catch:{ Exception -> 0x0173 }
            r0.append(r3)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0173 }
            android.util.Log.i(r10, r0)     // Catch:{ Exception -> 0x0173 }
            goto L_0x0255
        L_0x024c:
            java.lang.String r0 = "Target bluetooth device not found"
            android.util.Log.i(r10, r0)
            goto L_0x0255
        L_0x0252:
            r0.printStackTrace()
        L_0x0255:
            android.bluetooth.BluetoothDevice r0 = r2.f9983c
            if (r0 == 0) goto L_0x02f0
            java.util.UUID r0 = r2.f9984d
            if (r0 == 0) goto L_0x02f0
            android.bluetooth.BluetoothDevice r0 = r2.f9983c     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            java.util.UUID r3 = r2.f9984d     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            android.bluetooth.BluetoothSocket r0 = r0.createRfcommSocketToServiceRecord(r3)     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            r2.f9982b = r0     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            android.bluetooth.BluetoothSocket r0 = r2.f9982b     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            r0.connect()     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            android.bluetooth.BluetoothSocket r0 = r2.f9982b     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            r2.e = r0     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            android.bluetooth.BluetoothSocket r0 = r2.f9982b     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            r2.f9985f = r0     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            r2.a()     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            android.util.Log.i(r10, r8)     // Catch:{ IOException -> 0x0285, Exception -> 0x0283 }
            goto L_0x02d7
        L_0x0283:
            r0 = move-exception
            goto L_0x0287
        L_0x0285:
            r0 = move-exception
            goto L_0x028b
        L_0x0287:
            r0.printStackTrace()
            goto L_0x02f5
        L_0x028b:
            java.lang.String r0 = r0.getMessage()
            android.util.Log.w(r10, r0)
            java.lang.String r0 = "Trying BT connect fallback..."
            android.util.Log.w(r10, r0)     // Catch:{ Exception -> 0x02eb }
            android.bluetooth.BluetoothDevice r0 = r2.f9983c     // Catch:{ Exception -> 0x02eb }
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x02eb }
            java.lang.String r3 = "createRfcommSocket"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x02eb }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x02eb }
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x02eb }
            java.lang.reflect.Method r0 = r0.getMethod(r3, r5)     // Catch:{ Exception -> 0x02eb }
            android.bluetooth.BluetoothDevice r3 = r2.f9983c     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x02eb }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x02eb }
            r4[r7] = r5     // Catch:{ Exception -> 0x02eb }
            java.lang.Object r0 = r0.invoke(r3, r4)     // Catch:{ Exception -> 0x02eb }
            android.bluetooth.BluetoothSocket r0 = (android.bluetooth.BluetoothSocket) r0     // Catch:{ Exception -> 0x02eb }
            r2.f9982b = r0     // Catch:{ Exception -> 0x02eb }
            android.bluetooth.BluetoothSocket r0 = r2.f9982b     // Catch:{ Exception -> 0x02eb }
            r0.connect()     // Catch:{ Exception -> 0x02eb }
            android.bluetooth.BluetoothSocket r0 = r2.f9982b     // Catch:{ Exception -> 0x02eb }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ Exception -> 0x02eb }
            r2.e = r0     // Catch:{ Exception -> 0x02eb }
            android.bluetooth.BluetoothSocket r0 = r2.f9982b     // Catch:{ Exception -> 0x02eb }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x02eb }
            r2.f9985f = r0     // Catch:{ Exception -> 0x02eb }
            r2.a()     // Catch:{ Exception -> 0x02eb }
            android.util.Log.i(r10, r8)     // Catch:{ Exception -> 0x02eb }
        L_0x02d7:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r3 = "$device"
            java.lang.String r2 = r2.d()
            r0.put(r3, r2)
            java.lang.String r2 = "onBtConnectSuccess"
            de.ozerov.fully.U0.e(r2, r0)
            goto L_0x02fb
        L_0x02eb:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x02f5
        L_0x02f0:
            java.lang.String r0 = "Bluetooth device not opened as device or UUID not found"
            android.util.Log.w(r10, r0)
        L_0x02f5:
            java.lang.String r0 = "onBtConnectFailure"
            r2 = 0
            de.ozerov.fully.U0.e(r0, r2)
        L_0x02fb:
            return
        L_0x02fc:
            java.lang.Object r0 = r1.f470V
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            java.lang.Object r3 = r1.f471W
            H3.P r3 = (H3.P) r3
            java.lang.Object r5 = r1.f472X
            android.os.Handler r5 = (android.os.Handler) r5
            java.lang.Object r6 = r1.f473Y
            V0.j r6 = (V0.j) r6
            r0.flush()     // Catch:{ all -> 0x0343 }
            r0.release()     // Catch:{ all -> 0x0343 }
            if (r3 == 0) goto L_0x032a
            android.os.Looper r0 = r5.getLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x032a
            B.c r0 = new B.c
            r0.<init>((java.lang.Object) r3, (int) r2, (java.lang.Object) r6)
            r5.post(r0)
        L_0x032a:
            java.lang.Object r7 = V0.y.f5611j0
            monitor-enter(r7)
            int r0 = V0.y.f5613l0     // Catch:{ all -> 0x033d }
            int r0 = r0 - r4
            V0.y.f5613l0 = r0     // Catch:{ all -> 0x033d }
            if (r0 != 0) goto L_0x033f
            java.util.concurrent.ScheduledExecutorService r0 = V0.y.f5612k0     // Catch:{ all -> 0x033d }
            r0.shutdown()     // Catch:{ all -> 0x033d }
            r2 = 0
            V0.y.f5612k0 = r2     // Catch:{ all -> 0x033d }
            goto L_0x033f
        L_0x033d:
            r0 = move-exception
            goto L_0x0341
        L_0x033f:
            monitor-exit(r7)     // Catch:{ all -> 0x033d }
            return
        L_0x0341:
            monitor-exit(r7)     // Catch:{ all -> 0x033d }
            throw r0
        L_0x0343:
            r0 = move-exception
            if (r3 == 0) goto L_0x035c
            android.os.Looper r7 = r5.getLooper()
            java.lang.Thread r7 = r7.getThread()
            boolean r7 = r7.isAlive()
            if (r7 == 0) goto L_0x035c
            B.c r7 = new B.c
            r7.<init>((java.lang.Object) r3, (int) r2, (java.lang.Object) r6)
            r5.post(r7)
        L_0x035c:
            java.lang.Object r2 = V0.y.f5611j0
            monitor-enter(r2)
            int r3 = V0.y.f5613l0     // Catch:{ all -> 0x036f }
            int r3 = r3 - r4
            V0.y.f5613l0 = r3     // Catch:{ all -> 0x036f }
            if (r3 != 0) goto L_0x0371
            java.util.concurrent.ScheduledExecutorService r3 = V0.y.f5612k0     // Catch:{ all -> 0x036f }
            r3.shutdown()     // Catch:{ all -> 0x036f }
            r3 = 0
            V0.y.f5612k0 = r3     // Catch:{ all -> 0x036f }
            goto L_0x0371
        L_0x036f:
            r0 = move-exception
            goto L_0x0373
        L_0x0371:
            monitor-exit(r2)     // Catch:{ all -> 0x036f }
            throw r0
        L_0x0373:
            monitor-exit(r2)     // Catch:{ all -> 0x036f }
            throw r0
        L_0x0375:
            java.lang.Object r0 = r1.f470V
            U.t r0 = (U.t) r0
            r0.getClass()
            java.lang.String r2 = "TextureViewImpl"
            java.lang.String r3 = "Safe to release surface."
            F.h.j(r2, r3)
            D.O r2 = r0.f5313l
            if (r2 == 0) goto L_0x038e
            r2.a()
            r2 = 0
            r0.f5313l = r2
            goto L_0x038f
        L_0x038e:
            r2 = 0
        L_0x038f:
            java.lang.Object r3 = r1.f471W
            android.view.Surface r3 = (android.view.Surface) r3
            r3.release()
            a0.m r3 = r0.f5309g
            java.lang.Object r4 = r1.f472X
            a0.m r4 = (a0.m) r4
            if (r3 != r4) goto L_0x03a0
            r0.f5309g = r2
        L_0x03a0:
            B.t0 r3 = r0.f5310h
            java.lang.Object r4 = r1.f473Y
            B.t0 r4 = (B.t0) r4
            if (r3 != r4) goto L_0x03aa
            r0.f5310h = r2
        L_0x03aa:
            return
        L_0x03ab:
            java.lang.Object r0 = r1.f471W
            B.x r0 = (B.C0022x) r0
            java.lang.Object r2 = r1.f472X
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r1.f473Y
            a0.j r3 = (a0.j) r3
            java.lang.Object r4 = r1.f470V
            N.f r4 = (N.f) r4
            r4.getClass()
            N.c r4 = r4.f3212U     // Catch:{ RuntimeException -> 0x03c8 }
            r4.e(r0, r2)     // Catch:{ RuntimeException -> 0x03c8 }
            r2 = 0
            r3.a(r2)     // Catch:{ RuntimeException -> 0x03c8 }
            goto L_0x03cc
        L_0x03c8:
            r0 = move-exception
            r3.b(r0)
        L_0x03cc:
            return
        L_0x03cd:
            java.lang.Object r0 = r1.f471W
            B.x r0 = (B.C0022x) r0
            java.lang.Object r2 = r1.f472X
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r1.f473Y
            a0.j r3 = (a0.j) r3
            java.lang.Object r4 = r1.f470V
            M.c r4 = (M.c) r4
            r4.getClass()
            M.e r4 = r4.f2719U     // Catch:{ RuntimeException -> 0x03ea }
            r4.e(r0, r2)     // Catch:{ RuntimeException -> 0x03ea }
            r2 = 0
            r3.a(r2)     // Catch:{ RuntimeException -> 0x03ea }
            goto L_0x03ee
        L_0x03ea:
            r0 = move-exception
            r3.b(r0)
        L_0x03ee:
            return
        L_0x03ef:
            int r0 = org.acra.sender.JobSenderService.f14299U
            B.q0 r0 = new B.q0
            java.lang.Object r2 = r1.f470V
            org.acra.sender.JobSenderService r2 = (org.acra.sender.JobSenderService) r2
            java.lang.Object r3 = r1.f471W
            r7.d r3 = (r7.C1395d) r3
            r0.<init>((android.content.Context) r2, (r7.C1395d) r3)
            android.os.Bundle r3 = new android.os.Bundle
            java.lang.Object r4 = r1.f472X
            android.os.PersistableBundle r4 = (android.os.PersistableBundle) r4
            r3.<init>(r4)
            r4 = 0
            r0.C(r4, r3)
            java.lang.Object r0 = r1.f473Y
            android.app.job.JobParameters r0 = (android.app.job.JobParameters) r0
            r2.jobFinished(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B7.e.run():void");
    }
}
