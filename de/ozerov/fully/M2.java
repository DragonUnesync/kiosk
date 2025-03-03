package de.ozerov.fully;

import P4.a;
import y4.b;

public final /* synthetic */ class M2 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10094U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f10095V;

    public /* synthetic */ M2(int i, Object obj) {
        this.f10094U = i;
        this.f10095V = obj;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10095V
            u.I r0 = (u.C1449I) r0
            java.lang.Object r1 = r0.f15498a
            monitor-enter(r1)
            java.util.ArrayList r2 = r0.f15499b     // Catch:{ all -> 0x0011 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            goto L_0x001e
        L_0x0011:
            r0 = move-exception
            goto L_0x0026
        L_0x0013:
            java.util.ArrayList r2 = r0.f15499b     // Catch:{ all -> 0x001f }
            r0.h(r2)     // Catch:{ all -> 0x001f }
            java.util.ArrayList r0 = r0.f15499b     // Catch:{ all -> 0x0011 }
            r0.clear()     // Catch:{ all -> 0x0011 }
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
        L_0x001e:
            return
        L_0x001f:
            r2 = move-exception
            java.util.ArrayList r0 = r0.f15499b     // Catch:{ all -> 0x0011 }
            r0.clear()     // Catch:{ all -> 0x0011 }
            throw r2     // Catch:{ all -> 0x0011 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.M2.a():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v12, types: [int] */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 6
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = r11.f10094U
            switch(r4) {
                case 0: goto L_0x028c;
                case 1: goto L_0x027b;
                case 2: goto L_0x0273;
                case 3: goto L_0x0269;
                case 4: goto L_0x0254;
                case 5: goto L_0x0164;
                case 6: goto L_0x0150;
                case 7: goto L_0x013b;
                case 8: goto L_0x0133;
                case 9: goto L_0x012b;
                case 10: goto L_0x0121;
                case 11: goto L_0x00f0;
                case 12: goto L_0x00de;
                case 13: goto L_0x0082;
                case 14: goto L_0x007a;
                case 15: goto L_0x003b;
                case 16: goto L_0x0037;
                case 17: goto L_0x001b;
                case 18: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r11.f10095V
            y4.b r0 = (y4.b) r0
            r0.getClass()
            throw r3
        L_0x0011:
            java.lang.Object r0 = r11.f10095V
            v.q r0 = (v.q) r0
            u.o r0 = r0.f15865b
            r0.onCameraAccessPrioritiesChanged()
            return
        L_0x001b:
            java.lang.Object r0 = r11.f10095V
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0023:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            u.Y r1 = (u.Y) r1
            r1.getClass()
            r1.c(r1)
            goto L_0x0023
        L_0x0036:
            return
        L_0x0037:
            r11.a()
            return
        L_0x003b:
            java.lang.Object r4 = r11.f10095V
            P5.M r4 = (P5.M) r4
            boolean r5 = r4.f3848V
            if (r5 != 0) goto L_0x0079
            java.lang.Object r5 = r4.f3850X
            u.s r5 = (u.C1478s) r5
            u.t r5 = r5.f15683f
            int r5 = r5.f15685B0
            r6 = 7
            if (r5 == r6) goto L_0x0058
            java.lang.Object r5 = r4.f3850X
            u.s r5 = (u.C1478s) r5
            u.t r5 = r5.f15683f
            int r5 = r5.f15685B0
            if (r5 != r0) goto L_0x0059
        L_0x0058:
            r1 = 1
        L_0x0059:
            n2.a.m(r3, r1)
            java.lang.Object r0 = r4.f3850X
            u.s r0 = (u.C1478s) r0
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r4.f3850X
            u.s r0 = (u.C1478s) r0
            u.t r0 = r0.f15683f
            r0.J(r2)
            goto L_0x0079
        L_0x0070:
            java.lang.Object r0 = r4.f3850X
            u.s r0 = (u.C1478s) r0
            u.t r0 = r0.f15683f
            r0.K(r2)
        L_0x0079:
            return
        L_0x007a:
            java.lang.Object r0 = r11.f10095V
            android.hardware.camera2.CameraDevice r0 = (android.hardware.camera2.CameraDevice) r0
            r0.close()
            return
        L_0x0082:
            java.lang.Object r4 = r11.f10095V
            u.t r4 = (u.C1479t) r4
            r4.f15706o0 = r1
            r4.f15705n0 = r1
            int r5 = r4.f15685B0
            java.lang.String r5 = u.C1477r.i(r5)
            java.lang.String r6 = "OpenCameraConfigAndClose is done, state: "
            java.lang.String r5 = r6.concat(r5)
            r4.u(r5, r3)
            int r5 = r4.f15685B0
            int r5 = u.C1477r.h(r5)
            if (r5 == r2) goto L_0x00d1
            r2 = 4
            if (r5 == r2) goto L_0x00d1
            if (r5 == r0) goto L_0x00b6
            int r0 = r4.f15685B0
            java.lang.String r0 = u.C1477r.i(r0)
            java.lang.String r1 = "OpenCameraConfigAndClose finished while in state: "
            java.lang.String r0 = r1.concat(r0)
            r4.u(r0, r3)
            goto L_0x00dd
        L_0x00b6:
            int r0 = r4.f15696e0
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = u.C1479t.w(r0)
            java.lang.String r1 = "OpenCameraConfigAndClose in error: "
            java.lang.String r0 = r1.concat(r0)
            r4.u(r0, r3)
            u.s r0 = r4.f15693b0
            r0.b()
            goto L_0x00dd
        L_0x00cd:
            r4.K(r1)
            goto L_0x00dd
        L_0x00d1:
            java.util.LinkedHashMap r0 = r4.f15698g0
            boolean r0 = r0.isEmpty()
            n2.a.m(r3, r0)
            r4.v()
        L_0x00dd:
            return
        L_0x00de:
            android.os.Looper.prepare()
            java.lang.Object r0 = r11.f10095V
            p7.c r0 = (p7.c) r0
            de.ozerov.fully.MyApplication r0 = r0.f14679a
            java.lang.String r1 = "Warning: Acra may behave differently with a debugger attached"
            R.e.s(r2, r0, r1)
            android.os.Looper.loop()
            return
        L_0x00f0:
            java.lang.Object r0 = r11.f10095V
            o1.k r0 = (o1.k) r0
            android.view.Surface r1 = r0.f14195e0
            if (r1 == 0) goto L_0x0110
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.f14188U
            java.util.Iterator r2 = r2.iterator()
        L_0x00fe:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0110
            java.lang.Object r4 = r2.next()
            T0.v r4 = (T0.C0229v) r4
            T0.y r4 = r4.f4905U
            r4.S(r3)
            goto L_0x00fe
        L_0x0110:
            android.graphics.SurfaceTexture r2 = r0.f14194d0
            if (r2 == 0) goto L_0x0117
            r2.release()
        L_0x0117:
            if (r1 == 0) goto L_0x011c
            r1.release()
        L_0x011c:
            r0.f14194d0 = r3
            r0.f14195e0 = r3
            return
        L_0x0121:
            java.lang.Object r0 = r11.f10095V
            n1.l r0 = (n1.l) r0
            int r1 = r0.f13652m
            int r1 = r1 - r2
            r0.f13652m = r1
            return
        L_0x012b:
            java.lang.Object r0 = r11.f10095V
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            r0.z0()
            return
        L_0x0133:
            java.lang.Object r0 = r11.f10095V
            android.os.HandlerThread r0 = (android.os.HandlerThread) r0
            r0.quit()
            return
        L_0x013b:
            android.graphics.Rect r0 = new android.graphics.Rect
            java.lang.Object r2 = r11.f10095V
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            r0.<init>(r1, r1, r3, r4)
            r2.requestRectangleOnScreen(r0, r1)
            return
        L_0x0150:
            java.lang.Object r0 = r11.f10095V
            de.ozerov.fully.g5 r0 = (de.ozerov.fully.g5) r0
            de.ozerov.fully.MyWebView r1 = r0.f10664g
            if (r1 == 0) goto L_0x0163
            de.ozerov.fully.t4 r1 = r0.f10676t
            boolean r1 = r1.f10981v0
            if (r1 != 0) goto L_0x0163
            de.ozerov.fully.MyWebView r0 = r0.f10664g
            r0.onResume()
        L_0x0163:
            return
        L_0x0164:
            java.lang.Object r0 = r11.f10095V
            de.ozerov.fully.V4 r0 = (de.ozerov.fully.V4) r0
            r0.getClass()
            java.lang.String r4 = ""
            java.lang.String r5 = "V4"
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x0195 }
            d4.k r7 = r0.f10444b     // Catch:{ Exception -> 0x0195 }
            java.lang.String r7 = r7.t()     // Catch:{ Exception -> 0x0195 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0195 }
            java.io.InputStream r6 = r6.openStream()     // Catch:{ Exception -> 0x0195 }
            d4.k r7 = r0.f10444b     // Catch:{ Exception -> 0x0195 }
            java.lang.String r8 = "clientCaPassword"
            java.lang.Object r7 = r7.f9767W     // Catch:{ Exception -> 0x0195 }
            Z1.c r7 = (Z1.c) r7     // Catch:{ Exception -> 0x0195 }
            java.lang.String r7 = r7.r(r8, r4)     // Catch:{ Exception -> 0x0195 }
            boolean r4 = r7.equals(r4)     // Catch:{ Exception -> 0x0195 }
            if (r4 != 0) goto L_0x0198
            char[] r3 = r7.toCharArray()     // Catch:{ Exception -> 0x0195 }
            goto L_0x0198
        L_0x0195:
            r1 = move-exception
            goto L_0x0219
        L_0x0198:
            java.lang.String r4 = "PKCS12"
            java.security.KeyStore r4 = java.security.KeyStore.getInstance(r4)     // Catch:{ Exception -> 0x0195 }
            r4.load(r6, r3)     // Catch:{ Exception -> 0x0195 }
            java.util.Enumeration r7 = r4.aliases()     // Catch:{ Exception -> 0x0195 }
        L_0x01a5:
            boolean r8 = r7.hasMoreElements()     // Catch:{ Exception -> 0x0195 }
            if (r8 == 0) goto L_0x01f7
            java.lang.Object r8 = r7.nextElement()     // Catch:{ Exception -> 0x0195 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0195 }
            java.security.Key r9 = r4.getKey(r8, r3)     // Catch:{ Exception -> 0x0195 }
            boolean r10 = r9 instanceof java.security.PrivateKey     // Catch:{ Exception -> 0x0195 }
            if (r10 == 0) goto L_0x01a5
            java.security.cert.Certificate[] r3 = r4.getCertificateChain(r8)     // Catch:{ Exception -> 0x0195 }
            int r4 = r3.length     // Catch:{ Exception -> 0x0195 }
            java.security.cert.X509Certificate[] r4 = new java.security.cert.X509Certificate[r4]     // Catch:{ Exception -> 0x0195 }
            r0.f10461u = r4     // Catch:{ Exception -> 0x0195 }
        L_0x01c2:
            java.security.cert.X509Certificate[] r4 = r0.f10461u     // Catch:{ Exception -> 0x0195 }
            int r4 = r4.length     // Catch:{ Exception -> 0x0195 }
            if (r1 >= r4) goto L_0x01d1
            java.security.cert.X509Certificate[] r4 = r0.f10461u     // Catch:{ Exception -> 0x0195 }
            r7 = r3[r1]     // Catch:{ Exception -> 0x0195 }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ Exception -> 0x0195 }
            r4[r1] = r7     // Catch:{ Exception -> 0x0195 }
            int r1 = r1 + r2
            goto L_0x01c2
        L_0x01d1:
            java.security.PrivateKey r9 = (java.security.PrivateKey) r9     // Catch:{ Exception -> 0x0195 }
            r0.f10462v = r9     // Catch:{ Exception -> 0x0195 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0195 }
            r1.<init>()     // Catch:{ Exception -> 0x0195 }
            java.lang.String r2 = "Client CA "
            r1.append(r2)     // Catch:{ Exception -> 0x0195 }
            r1.append(r8)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r2 = " loaded from "
            r1.append(r2)     // Catch:{ Exception -> 0x0195 }
            d4.k r2 = r0.f10444b     // Catch:{ Exception -> 0x0195 }
            java.lang.String r2 = r2.t()     // Catch:{ Exception -> 0x0195 }
            r1.append(r2)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0195 }
            android.util.Log.i(r5, r1)     // Catch:{ Exception -> 0x0195 }
        L_0x01f7:
            r6.close()     // Catch:{ Exception -> 0x0195 }
            java.security.PrivateKey r1 = r0.f10462v     // Catch:{ Exception -> 0x0195 }
            if (r1 != 0) goto L_0x0253
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0195 }
            r1.<init>()     // Catch:{ Exception -> 0x0195 }
            java.lang.String r2 = "Could not load any client CA from "
            r1.append(r2)     // Catch:{ Exception -> 0x0195 }
            d4.k r2 = r0.f10444b     // Catch:{ Exception -> 0x0195 }
            java.lang.String r2 = r2.t()     // Catch:{ Exception -> 0x0195 }
            r1.append(r2)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0195 }
            android.util.Log.e(r5, r1)     // Catch:{ Exception -> 0x0195 }
            goto L_0x0253
        L_0x0219:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Client CA load error for "
            r2.<init>(r3)
            d4.k r3 = r0.f10444b
            java.lang.String r3 = r3.t()
            r2.append(r3)
            java.lang.String r3 = " due to "
            r2.append(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r5, r2)
            de.ozerov.fully.t4 r0 = r0.f10443a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Client CA failed: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            n2.a.b1(r0, r1)
        L_0x0253:
            return
        L_0x0254:
            java.lang.Object r0 = r11.f10095V
            de.ozerov.fully.L3 r0 = (de.ozerov.fully.L3) r0
            r0.getClass()
            java.lang.String r1 = "L3"
            java.lang.String r2 = "Restarting... "
            android.util.Log.w(r1, r2)
            r0.b()
            r0.a()
            return
        L_0x0269:
            java.lang.Object r0 = r11.f10095V
            de.ozerov.fully.E3 r0 = (de.ozerov.fully.E3) r0
            de.ozerov.fully.FullyActivity r0 = r0.f9881a
            de.ozerov.fully.C0794w0.J0(r0, r1)
            return
        L_0x0273:
            java.lang.Object r0 = r11.f10095V
            de.ozerov.fully.r3 r0 = (de.ozerov.fully.C0767r3) r0
            r0.i()
            return
        L_0x027b:
            java.lang.Object r0 = r11.f10095V
            Z1.c r0 = (Z1.c) r0
            monitor-enter(r0)
            java.lang.Object r1 = r0.f6955V     // Catch:{ all -> 0x0289 }
            de.ozerov.fully.r3 r1 = (de.ozerov.fully.C0767r3) r1     // Catch:{ all -> 0x0289 }
            r1.b()     // Catch:{ all -> 0x0289 }
            monitor-exit(r0)
            return
        L_0x0289:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0289 }
            throw r1
        L_0x028c:
            java.lang.Object r0 = r11.f10095V
            de.ozerov.fully.N2 r0 = (de.ozerov.fully.N2) r0
            de.ozerov.fully.C r1 = r0.f9863m1
            if (r1 == 0) goto L_0x0297
            r1.c()
        L_0x0297:
            r0.S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.M2.run():void");
    }

    public /* synthetic */ M2(b bVar, a aVar) {
        this.f10094U = 19;
        this.f10095V = bVar;
    }
}
