package U;

import c1.f;
import java.net.HttpURLConnection;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f5296U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f5297V;

    public /* synthetic */ p(int i, Object obj) {
        this.f5296U = i;
        this.f5297V = obj;
    }

    private final void a() {
        f fVar = (f) this.f5297V;
        synchronized (fVar.f8777a) {
            try {
                if (!fVar.f8787m) {
                    long j7 = fVar.f8786l - 1;
                    fVar.f8786l = j7;
                    int i = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
                    if (i <= 0) {
                        if (i < 0) {
                            fVar.b(new IllegalStateException());
                        } else {
                            fVar.a();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r1 = m0.C1200f.f13323a.g(r5, r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        android.os.Trace.endSection();
        r2 = G5.s.u(r0.f7808U, r4.f14809a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0210, code lost:
        if (r2 == null) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0212, code lost:
        if (r1 == null) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
        r3 = new B3.q(r1, G5.s.x(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        android.os.Trace.endSection();
        r1 = r0.f7811X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x022a, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r2 = r0.f7815b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022d, code lost:
        if (r2 == null) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x022f, code lost:
        r2.C(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0233, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0235, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r2 = q0.C1361h.f14708a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0242, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x024a, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x024b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x024d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x024e, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0251, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r2 = q0.C1361h.f14708a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0257, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x026e, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r5 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0271, code lost:
        monitor-enter(r0.f7811X);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r3 = r0.f7815b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0274, code lost:
        if (r3 != null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0276, code lost:
        r3.B(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x027a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x027d, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0282, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r4 = r0.d();
        r5 = r4.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d3, code lost:
        if (r5 != 2) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d5, code lost:
        r6 = r0.f7811X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d7, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01dd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e0, code lost:
        if (r5 != 0) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r5 = q0.C1361h.f14708a;
        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r3 = r0.f7810W;
        r5 = r0.f7808U;
        r3.getClass();
        r2 = new r0.C1374h[]{r4};
        r3 = m0.C1200f.f13323a;
        android.os.Trace.beginSection(F.h.H("TypefaceCompat.createFromFontInfo"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r11.f5296U
            switch(r3) {
                case 0: goto L_0x02f7;
                case 1: goto L_0x02dd;
                case 2: goto L_0x02c3;
                case 3: goto L_0x02bb;
                case 4: goto L_0x02b3;
                case 5: goto L_0x02ab;
                case 6: goto L_0x02a3;
                case 7: goto L_0x029b;
                case 8: goto L_0x028d;
                case 9: goto L_0x0285;
                case 10: goto L_0x01b8;
                case 11: goto L_0x01a8;
                case 12: goto L_0x0192;
                case 13: goto L_0x016c;
                case 14: goto L_0x0168;
                case 15: goto L_0x0160;
                case 16: goto L_0x014e;
                case 17: goto L_0x00d4;
                case 18: goto L_0x00c4;
                case 19: goto L_0x00b8;
                case 20: goto L_0x00aa;
                case 21: goto L_0x0095;
                case 22: goto L_0x0083;
                case 23: goto L_0x0068;
                case 24: goto L_0x004b;
                case 25: goto L_0x0043;
                case 26: goto L_0x0037;
                case 27: goto L_0x0023;
                case 28: goto L_0x0016;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.J2 r0 = (de.ozerov.fully.J2) r0
            de.ozerov.fully.K2 r0 = r0.f10025b
            java.lang.Object r0 = r0.f10050V
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            de.ozerov.fully.P.e(r0)
            return
        L_0x0016:
            java.lang.Object r0 = r11.f5297V
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r0.disconnect()     // Catch:{ Exception -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.t2 r0 = (de.ozerov.fully.C0778t2) r0
            de.ozerov.fully.t4 r0 = r0.f10966b
            boolean r1 = r0.w()
            if (r1 == 0) goto L_0x0036
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            de.ozerov.fully.c r0 = r0.f9951n1
            r0.a()
        L_0x0036:
            return
        L_0x0037:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.q2 r0 = (de.ozerov.fully.C0761q2) r0
            de.ozerov.fully.FullyActivity r0 = r0.f10897a
            de.ozerov.fully.E3 r0 = r0.f9952o1
            r0.a()
            return
        L_0x0043:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.MyWebView r0 = (de.ozerov.fully.MyWebView) r0
            r0.d()
            return
        L_0x004b:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.o2 r0 = (de.ozerov.fully.C0749o2) r0
            java.lang.Object r1 = r0.f10864b
            de.ozerov.fully.MyWebView r1 = (de.ozerov.fully.MyWebView) r1
            r3 = 8
            r1.setVisibility(r3)
            java.lang.Object r1 = r0.f10864b
            de.ozerov.fully.MyWebView r1 = (de.ozerov.fully.MyWebView) r1
            int r1 = r1.f10117B0
            if (r1 != r2) goto L_0x0067
            java.lang.Object r0 = r0.f10864b
            de.ozerov.fully.MyWebView r0 = (de.ozerov.fully.MyWebView) r0
            r0.f()
        L_0x0067:
            return
        L_0x0068:
            java.lang.Object r0 = r11.f5297V
            R2.c r0 = (R2.c) r0
            java.lang.Object r1 = r0.f4336V
            de.ozerov.fully.FullyActivity r1 = (de.ozerov.fully.FullyActivity) r1
            de.ozerov.fully.W3 r2 = r1.f9922K0
            r2.g()
            b3.a r1 = r1.f9921J0
            boolean r1 = r1.f8654b
            if (r1 != 0) goto L_0x0082
            java.lang.Object r0 = r0.f4337W
            de.ozerov.fully.N1 r0 = (de.ozerov.fully.N1) r0
            r0.c()
        L_0x0082:
            return
        L_0x0083:
            java.lang.Object r0 = r11.f5297V
            Q.h r0 = (Q.h) r0
            java.lang.Object r3 = r0.f4005V
            de.ozerov.fully.FullyActivity r3 = (de.ozerov.fully.FullyActivity) r3
            boolean r3 = r3.w()
            if (r3 == 0) goto L_0x0094
            r0.i(r2, r1)
        L_0x0094:
            return
        L_0x0095:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.T0 r0 = (de.ozerov.fully.T0) r0
            de.ozerov.fully.U0 r0 = r0.f10357W
            de.ozerov.fully.FullyActivity r1 = r0.f10414a
            de.ozerov.fully.E3 r1 = r1.f9952o1
            r1.b()
            de.ozerov.fully.FullyActivity r0 = r0.f10414a
            de.ozerov.fully.c r0 = r0.f9951n1
            r0.getClass()
            return
        L_0x00aa:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.C0 r0 = (de.ozerov.fully.C0) r0
            java.lang.Object r0 = r0.f9805b
            de.ozerov.fully.D0 r0 = (de.ozerov.fully.D0) r0
            h.j r0 = r0.f9851g1
            de.ozerov.fully.W3.a(r0)
            return
        L_0x00b8:
            java.lang.Object r0 = r11.f5297V
            P5.O r0 = (P5.O) r0
            java.lang.Object r0 = r0.f3852V
            de.ozerov.fully.S r0 = (de.ozerov.fully.S) r0
            r0.e(r1, r1)
            return
        L_0x00c4:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.O r0 = (de.ozerov.fully.O) r0
            de.ozerov.fully.FullyActivity r0 = r0.f10171a
            boolean r1 = r0.w()
            if (r1 == 0) goto L_0x00d3
            de.ozerov.fully.Z0.b(r0)
        L_0x00d3:
            return
        L_0x00d4:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.H r0 = (de.ozerov.fully.H) r0
            r0.getClass()
            java.lang.String r3 = "H"
        L_0x00dd:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            boolean r4 = r4.isInterrupted()
            if (r4 != 0) goto L_0x014d
            boolean r4 = r0.i
            if (r4 != 0) goto L_0x014d
            java.io.InputStream r4 = r0.f9985f     // Catch:{ Exception -> 0x0145 }
            int r4 = r4.available()     // Catch:{ Exception -> 0x0145 }
            if (r4 <= 0) goto L_0x00dd
            byte[] r5 = new byte[r4]     // Catch:{ Exception -> 0x0145 }
            java.io.InputStream r6 = r0.f9985f     // Catch:{ Exception -> 0x0145 }
            r6.read(r5)     // Catch:{ Exception -> 0x0145 }
            r6 = 0
        L_0x00fb:
            if (r6 >= r4) goto L_0x00dd
            byte r7 = r5[r6]     // Catch:{ Exception -> 0x0145 }
            r8 = 10
            if (r7 != r8) goto L_0x0139
            int r7 = r0.f9987h     // Catch:{ Exception -> 0x0145 }
            byte[] r8 = new byte[r7]     // Catch:{ Exception -> 0x0145 }
            byte[] r9 = r0.f9986g     // Catch:{ Exception -> 0x0145 }
            java.lang.System.arraycopy(r9, r1, r8, r1, r7)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x0145 }
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x0145 }
            r7.<init>(r8, r9)     // Catch:{ Exception -> 0x0145 }
            r0.f9987h = r1     // Catch:{ Exception -> 0x0145 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0145 }
            r8.<init>()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r9 = "Received data string: "
            r8.append(r9)     // Catch:{ Exception -> 0x0145 }
            r8.append(r7)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0145 }
            android.util.Log.i(r3, r8)     // Catch:{ Exception -> 0x0145 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x0145 }
            r8.<init>()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r9 = "$data"
            r8.put(r9, r7)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r7 = "onBtDataRead"
            de.ozerov.fully.U0.e(r7, r8)     // Catch:{ Exception -> 0x0145 }
            goto L_0x0143
        L_0x0139:
            byte[] r8 = r0.f9986g     // Catch:{ Exception -> 0x0145 }
            int r9 = r0.f9987h     // Catch:{ Exception -> 0x0145 }
            int r10 = r9 + 1
            r0.f9987h = r10     // Catch:{ Exception -> 0x0145 }
            r8[r9] = r7     // Catch:{ Exception -> 0x0145 }
        L_0x0143:
            int r6 = r6 + r2
            goto L_0x00fb
        L_0x0145:
            r0.i = r2
            java.lang.String r4 = "Data listener stopped on IOException"
            android.util.Log.w(r3, r4)
            goto L_0x00dd
        L_0x014d:
            return
        L_0x014e:
            java.lang.Object r0 = r11.f5297V
            de.ozerov.fully.G r0 = (de.ozerov.fully.G) r0
            u.O r0 = r0.f9963a
            java.lang.Object r0 = r0.f15530b
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            de.ozerov.fully.c r0 = r0.f9946i1
            java.lang.String r1 = "beacon"
            r0.g(r1)
            return
        L_0x0160:
            java.lang.Object r0 = r11.f5297V
            com.google.android.material.timepicker.e r0 = (com.google.android.material.timepicker.e) r0
            r0.f()
            return
        L_0x0168:
            r11.a()
            return
        L_0x016c:
            java.lang.Object r0 = r11.f5297V
            androidx.lifecycle.E r0 = (androidx.lifecycle.E) r0
            java.lang.String r1 = "this$0"
            P6.f.e(r0, r1)
            int r1 = r0.f8109V
            androidx.lifecycle.t r3 = r0.f8113Z
            if (r1 != 0) goto L_0x0182
            r0.f8110W = r2
            androidx.lifecycle.l r1 = androidx.lifecycle.C0485l.ON_PAUSE
            r3.d(r1)
        L_0x0182:
            int r1 = r0.f8108U
            if (r1 != 0) goto L_0x0191
            boolean r1 = r0.f8110W
            if (r1 == 0) goto L_0x0191
            androidx.lifecycle.l r1 = androidx.lifecycle.C0485l.ON_STOP
            r3.d(r1)
            r0.f8111X = r2
        L_0x0191:
            return
        L_0x0192:
            java.lang.Object r0 = r11.f5297V
            androidx.fragment.app.L r0 = (androidx.fragment.app.L) r0
            java.util.ArrayList r0 = r0.f7884n
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x01a3
            return
        L_0x01a3:
            java.lang.ClassCastException r0 = Q0.g.k(r0)
            throw r0
        L_0x01a8:
            java.lang.Object r1 = r11.f5297V
            androidx.fragment.app.v r1 = (androidx.fragment.app.C0470v) r1
            androidx.fragment.app.T r2 = r1.f8054J0
            android.os.Bundle r3 = r1.f8062X
            com.bumptech.glide.manager.q r2 = r2.f7939Y
            r2.i(r3)
            r1.f8062X = r0
            return
        L_0x01b8:
            java.lang.Object r0 = r11.f5297V
            androidx.emoji2.text.p r0 = (androidx.emoji2.text.p) r0
            java.lang.String r3 = "fetchFonts result is not OK. ("
            java.lang.Object r4 = r0.f7811X
            monitor-enter(r4)
            B.d r5 = r0.f7815b0     // Catch:{ all -> 0x01c8 }
            if (r5 != 0) goto L_0x01cb
            monitor-exit(r4)     // Catch:{ all -> 0x01c8 }
            goto L_0x0280
        L_0x01c8:
            r0 = move-exception
            goto L_0x0283
        L_0x01cb:
            monitor-exit(r4)     // Catch:{ all -> 0x01c8 }
            r0.h r4 = r0.d()     // Catch:{ all -> 0x01dd }
            int r5 = r4.e     // Catch:{ all -> 0x01dd }
            r6 = 2
            if (r5 != r6) goto L_0x01e0
            java.lang.Object r6 = r0.f7811X     // Catch:{ all -> 0x01dd }
            monitor-enter(r6)     // Catch:{ all -> 0x01dd }
            monitor-exit(r6)     // Catch:{ all -> 0x01da }
            goto L_0x01e0
        L_0x01da:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01da }
            throw r1     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            r1 = move-exception
            goto L_0x026f
        L_0x01e0:
            if (r5 != 0) goto L_0x0258
            java.lang.String r3 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r5 = q0.C1361h.f14708a     // Catch:{ all -> 0x024b }
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x024b }
            a1.a r3 = r0.f7810W     // Catch:{ all -> 0x024b }
            android.content.Context r5 = r0.f7808U     // Catch:{ all -> 0x024b }
            r3.getClass()     // Catch:{ all -> 0x024b }
            r0.h[] r2 = new r0.C1374h[r2]     // Catch:{ all -> 0x024b }
            r2[r1] = r4     // Catch:{ all -> 0x024b }
            D7.b r3 = m0.C1200f.f13323a     // Catch:{ all -> 0x024b }
            java.lang.String r3 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r3 = F.h.H(r3)     // Catch:{ all -> 0x024b }
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x024b }
            D7.b r3 = m0.C1200f.f13323a     // Catch:{ all -> 0x024d }
            android.graphics.Typeface r1 = r3.g(r5, r2, r1)     // Catch:{ all -> 0x024d }
            android.os.Trace.endSection()     // Catch:{ all -> 0x024b }
            android.content.Context r2 = r0.f7808U     // Catch:{ all -> 0x024b }
            android.net.Uri r3 = r4.f14809a     // Catch:{ all -> 0x024b }
            java.nio.MappedByteBuffer r2 = G5.s.u(r2, r3)     // Catch:{ all -> 0x024b }
            if (r2 == 0) goto L_0x0243
            if (r1 == 0) goto L_0x0243
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x023c }
            B3.q r3 = new B3.q     // Catch:{ all -> 0x023c }
            D0.b r2 = G5.s.x(r2)     // Catch:{ all -> 0x023c }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x023c }
            android.os.Trace.endSection()     // Catch:{ all -> 0x024b }
            android.os.Trace.endSection()     // Catch:{ all -> 0x01dd }
            java.lang.Object r1 = r0.f7811X     // Catch:{ all -> 0x01dd }
            monitor-enter(r1)     // Catch:{ all -> 0x01dd }
            B.d r2 = r0.f7815b0     // Catch:{ all -> 0x0233 }
            if (r2 == 0) goto L_0x0235
            r2.C(r3)     // Catch:{ all -> 0x0233 }
            goto L_0x0235
        L_0x0233:
            r2 = move-exception
            goto L_0x023a
        L_0x0235:
            monitor-exit(r1)     // Catch:{ all -> 0x0233 }
            r0.b()     // Catch:{ all -> 0x01dd }
            goto L_0x0280
        L_0x023a:
            monitor-exit(r1)     // Catch:{ all -> 0x0233 }
            throw r2     // Catch:{ all -> 0x01dd }
        L_0x023c:
            r1 = move-exception
            int r2 = q0.C1361h.f14708a     // Catch:{ all -> 0x024b }
            android.os.Trace.endSection()     // Catch:{ all -> 0x024b }
            throw r1     // Catch:{ all -> 0x024b }
        L_0x0243:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x024b }
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch:{ all -> 0x024b }
            throw r1     // Catch:{ all -> 0x024b }
        L_0x024b:
            r1 = move-exception
            goto L_0x0252
        L_0x024d:
            r1 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x024b }
            throw r1     // Catch:{ all -> 0x024b }
        L_0x0252:
            int r2 = q0.C1361h.f14708a     // Catch:{ all -> 0x01dd }
            android.os.Trace.endSection()     // Catch:{ all -> 0x01dd }
            throw r1     // Catch:{ all -> 0x01dd }
        L_0x0258:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x01dd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
            r2.<init>(r3)     // Catch:{ all -> 0x01dd }
            r2.append(r5)     // Catch:{ all -> 0x01dd }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x01dd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01dd }
            r1.<init>(r2)     // Catch:{ all -> 0x01dd }
            throw r1     // Catch:{ all -> 0x01dd }
        L_0x026f:
            java.lang.Object r2 = r0.f7811X
            monitor-enter(r2)
            B.d r3 = r0.f7815b0     // Catch:{ all -> 0x027a }
            if (r3 == 0) goto L_0x027c
            r3.B(r1)     // Catch:{ all -> 0x027a }
            goto L_0x027c
        L_0x027a:
            r0 = move-exception
            goto L_0x0281
        L_0x027c:
            monitor-exit(r2)     // Catch:{ all -> 0x027a }
            r0.b()
        L_0x0280:
            return
        L_0x0281:
            monitor-exit(r2)     // Catch:{ all -> 0x027a }
            throw r0
        L_0x0283:
            monitor-exit(r4)     // Catch:{ all -> 0x01c8 }
            throw r0
        L_0x0285:
            java.lang.Object r0 = r11.f5297V
            androidx.activity.l r0 = (androidx.activity.l) r0
            androidx.activity.l.b(r0)
            return
        L_0x028d:
            java.lang.Object r1 = r11.f5297V
            androidx.activity.j r1 = (androidx.activity.j) r1
            java.lang.Runnable r2 = r1.f7285V
            if (r2 == 0) goto L_0x029a
            r2.run()
            r1.f7285V = r0
        L_0x029a:
            return
        L_0x029b:
            java.lang.Object r0 = r11.f5297V
            h.j r0 = (h.C1022j) r0
            r0.invalidateOptionsMenu()
            return
        L_0x02a3:
            java.lang.Object r0 = r11.f5297V
            H3.P r0 = (H3.P) r0
            r0.C0()
            return
        L_0x02ab:
            java.lang.Object r0 = r11.f5297V
            androidx.media3.ui.PlayerView r0 = (androidx.media3.ui.PlayerView) r0
            r0.invalidate()
            return
        L_0x02b3:
            java.lang.Object r0 = r11.f5297V
            Y1.r r0 = (Y1.r) r0
            r0.o()
            return
        L_0x02bb:
            java.lang.Object r0 = r11.f5297V
            Y1.e r0 = (Y1.C0372e) r0
            r0.d(r1)
            return
        L_0x02c3:
            java.lang.Object r0 = r11.f5297V
            V0.y r0 = (V0.y) r0
            long r3 = r0.f5654h0
            r5 = 300000(0x493e0, double:1.482197E-318)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x02dc
            H3.P r1 = r0.f5664r
            java.lang.Object r1 = r1.f2027U
            V0.B r1 = (V0.B) r1
            r1.f5480I1 = r2
            r1 = 0
            r0.f5654h0 = r1
        L_0x02dc:
            return
        L_0x02dd:
            java.lang.Object r0 = r11.f5297V
            U0.d r0 = (U0.d) r0
            U0.a r1 = r0.G()
            U0.b r2 = new U0.b
            r3 = 23
            r2.<init>(r3)
            r3 = 1028(0x404, float:1.44E-42)
            r0.L(r1, r3, r2)
            P0.k r0 = r0.f5329Z
            r0.d()
            return
        L_0x02f7:
            java.lang.Object r0 = r11.f5297V
            D.O r0 = (D.O) r0
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U.p.run():void");
    }

    public /* synthetic */ p(String str, HttpURLConnection httpURLConnection) {
        this.f5296U = 28;
        this.f5297V = httpURLConnection;
    }
}
