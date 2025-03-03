package de.ozerov.fully;

public final /* synthetic */ class L0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10070U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ U0 f10071V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ String f10072W;

    public /* synthetic */ L0(U0 u02, String str, int i) {
        this.f10070U = i;
        this.f10071V = u02;
        this.f10072W = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d6, code lost:
        if (r9.equals("4") == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012d, code lost:
        if (r9.equals("3") == false) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            r0 = 2
            java.lang.String r1 = "4"
            r2 = 1
            java.lang.String r3 = "3"
            java.lang.String r4 = "1"
            r5 = -1
            r6 = 0
            java.lang.String r7 = r14.f10072W
            de.ozerov.fully.U0 r8 = r14.f10071V
            int r9 = r14.f10070U
            switch(r9) {
                case 0: goto L_0x01cf;
                case 1: goto L_0x01b2;
                case 2: goto L_0x01a3;
                case 3: goto L_0x019b;
                case 4: goto L_0x018c;
                case 5: goto L_0x0182;
                case 6: goto L_0x0173;
                case 7: goto L_0x00a6;
                case 8: goto L_0x009b;
                case 9: goto L_0x001a;
                default: goto L_0x0013;
            }
        L_0x0013:
            de.ozerov.fully.MyWebView r0 = r8.f10416c
            r1 = 0
            r0.evaluateJavascript(r7, r1)
            return
        L_0x001a:
            de.ozerov.fully.MyWebView r0 = r8.f10416c
            r0.getClass()
            java.lang.String r1 = "MyWebView"
            java.lang.String r2 = "pdf"
            java.lang.String r3 = "PDF Created as "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
            r4.<init>()     // Catch:{ Exception -> 0x008f }
            android.content.Context r5 = r0.getContext()     // Catch:{ Exception -> 0x008f }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ Exception -> 0x008f }
            r6 = 2131951646(0x7f13001e, float:1.9539712E38)
            java.lang.String r5 = r5.getString(r6)     // Catch:{ Exception -> 0x008f }
            r4.append(r5)     // Catch:{ Exception -> 0x008f }
            java.lang.String r5 = " Document"
            r4.append(r5)     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x008f }
            android.print.PrintAttributes$Builder r5 = new android.print.PrintAttributes$Builder     // Catch:{ Exception -> 0x008f }
            r5.<init>()     // Catch:{ Exception -> 0x008f }
            android.print.PrintAttributes$MediaSize r6 = android.print.PrintAttributes.MediaSize.ISO_A4     // Catch:{ Exception -> 0x008f }
            android.print.PrintAttributes$Builder r5 = r5.setMediaSize(r6)     // Catch:{ Exception -> 0x008f }
            android.print.PrintAttributes$Resolution r6 = new android.print.PrintAttributes$Resolution     // Catch:{ Exception -> 0x008f }
            r8 = 600(0x258, float:8.41E-43)
            r6.<init>(r2, r2, r8, r8)     // Catch:{ Exception -> 0x008f }
            android.print.PrintAttributes$Builder r2 = r5.setResolution(r6)     // Catch:{ Exception -> 0x008f }
            android.print.PrintAttributes$Margins r5 = android.print.PrintAttributes.Margins.NO_MARGINS     // Catch:{ Exception -> 0x008f }
            android.print.PrintAttributes$Builder r2 = r2.setMinMargins(r5)     // Catch:{ Exception -> 0x008f }
            android.print.PrintAttributes r10 = r2.build()     // Catch:{ Exception -> 0x008f }
            a1.a r2 = new a1.a     // Catch:{ Exception -> 0x008f }
            r5 = 7
            r2.<init>((int) r5)     // Catch:{ Exception -> 0x008f }
            android.print.PrintDocumentAdapter r8 = r0.createPrintDocumentAdapter(r4)     // Catch:{ Exception -> 0x008f }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x008f }
            r0.<init>(r7)     // Catch:{ Exception -> 0x008f }
            b.b r12 = new b.b     // Catch:{ Exception -> 0x008f }
            r12.<init>(r2, r8, r0)     // Catch:{ Exception -> 0x008f }
            r13 = 0
            r9 = 0
            r11 = 0
            r8.onLayout(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
            r0.<init>(r3)     // Catch:{ Exception -> 0x008f }
            r0.append(r7)     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x008f }
            android.util.Log.i(r1, r0)     // Catch:{ Exception -> 0x008f }
            goto L_0x009a
        L_0x008f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "PDF Creation failed due to "
            r2.<init>(r3)
            Q0.g.x(r0, r2, r1)
        L_0x009a:
            return
        L_0x009b:
            de.ozerov.fully.FullyActivity r0 = r8.f10414a
            de.ozerov.fully.V4 r0 = r0.f9928Q0
            r0.getClass()
            de.ozerov.fully.V4.c(r7)
            return
        L_0x00a6:
            r8.getClass()
            java.lang.String r9 = "http:"
            boolean r9 = r7.startsWith(r9)
            java.lang.String r10 = "application/pdf"
            d4.k r11 = r8.f10415b
            de.ozerov.fully.FullyActivity r12 = r8.f10414a
            de.ozerov.fully.MyWebView r8 = r8.f10416c
            if (r9 != 0) goto L_0x0105
            java.lang.String r9 = "https:"
            boolean r9 = r7.startsWith(r9)
            if (r9 == 0) goto L_0x00c2
            goto L_0x0105
        L_0x00c2:
            java.lang.String r9 = r11.i1()
            r9.getClass()
            int r11 = r9.hashCode()
            switch(r11) {
                case 49: goto L_0x00e2;
                case 50: goto L_0x00d0;
                case 51: goto L_0x00d9;
                case 52: goto L_0x00d2;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            r0 = -1
            goto L_0x00ea
        L_0x00d2:
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00ea
            goto L_0x00d0
        L_0x00d9:
            boolean r0 = r9.equals(r3)
            if (r0 != 0) goto L_0x00e0
            goto L_0x00d0
        L_0x00e0:
            r0 = 1
            goto L_0x00ea
        L_0x00e2:
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto L_0x00e9
            goto L_0x00d0
        L_0x00e9:
            r0 = 0
        L_0x00ea:
            switch(r0) {
                case 0: goto L_0x00fe;
                case 1: goto L_0x00f7;
                case 2: goto L_0x00ef;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x0172
        L_0x00ef:
            r8.b()
            r8.loadUrl(r7)
            goto L_0x0172
        L_0x00f7:
            de.ozerov.fully.V4 r0 = r12.f9928Q0
            r0.k(r7, r10)
            goto L_0x0172
        L_0x00fe:
            de.ozerov.fully.V4 r0 = r12.f9928Q0
            r0.n(r7)
            goto L_0x0172
        L_0x0105:
            java.lang.String r9 = r11.M1()
            r9.getClass()
            int r11 = r9.hashCode()
            switch(r11) {
                case 49: goto L_0x013b;
                case 50: goto L_0x0130;
                case 51: goto L_0x0129;
                case 52: goto L_0x0120;
                case 53: goto L_0x0115;
                default: goto L_0x0113;
            }
        L_0x0113:
            r0 = -1
            goto L_0x0143
        L_0x0115:
            java.lang.String r0 = "5"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x011e
            goto L_0x0113
        L_0x011e:
            r0 = 4
            goto L_0x0143
        L_0x0120:
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L_0x0127
            goto L_0x0113
        L_0x0127:
            r0 = 3
            goto L_0x0143
        L_0x0129:
            boolean r1 = r9.equals(r3)
            if (r1 != 0) goto L_0x0143
            goto L_0x0113
        L_0x0130:
            java.lang.String r0 = "2"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0139
            goto L_0x0113
        L_0x0139:
            r0 = 1
            goto L_0x0143
        L_0x013b:
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto L_0x0142
            goto L_0x0113
        L_0x0142:
            r0 = 0
        L_0x0143:
            switch(r0) {
                case 0: goto L_0x016d;
                case 1: goto L_0x014e;
                case 2: goto L_0x016d;
                case 3: goto L_0x0147;
                case 4: goto L_0x016d;
                default: goto L_0x0146;
            }
        L_0x0146:
            goto L_0x0172
        L_0x0147:
            r8.b()
            r8.loadUrl(r7)
            goto L_0x0172
        L_0x014e:
            r8.b()
            java.lang.String r0 = "https://docs.google.com/gview?embedded=true"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "url"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r7)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            r8.loadUrl(r0)
            goto L_0x0172
        L_0x016d:
            de.ozerov.fully.V4 r0 = r12.f9928Q0
            r0.e(r8, r7, r10)
        L_0x0172:
            return
        L_0x0173:
            de.ozerov.fully.FullyActivity r0 = r8.f10414a
            java.lang.String r0 = n2.a.F(r0, r7)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            n2.a.x(r1)
            return
        L_0x0182:
            de.ozerov.fully.FullyActivity r0 = r8.f10414a
            android.support.v4.media.session.b r0 = r0.k()
            r0.J(r7)
            return
        L_0x018c:
            de.ozerov.fully.FullyActivity r0 = r8.f10414a
            de.ozerov.fully.k0 r0 = new de.ozerov.fully.k0
            r0.<init>()
            r0.f10766b = r7
            java.lang.Void[] r1 = new java.lang.Void[r6]
            r0.execute(r1)
            return
        L_0x019b:
            de.ozerov.fully.FullyActivity r0 = r8.f10414a
            Z1.a r0 = r0.f9942e1
            r0.e(r7)
            return
        L_0x01a3:
            de.ozerov.fully.FullyActivity r0 = r8.f10414a
            java.lang.String r0 = n2.a.F(r0, r7)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            n2.a.C(r1)
            return
        L_0x01b2:
            de.ozerov.fully.FullyActivity r0 = r8.f10414a
            java.lang.String r0 = n2.a.F(r0, r7)
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x01c1 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01c1 }
            r1.mkdirs()     // Catch:{ Exception -> 0x01c1 }
            goto L_0x01ce
        L_0x01c1:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to create folder due to "
            r1.<init>(r2)
            java.lang.String r2 = "JsInterface"
            Q0.g.z(r0, r1, r2)
        L_0x01ce:
            return
        L_0x01cf:
            de.ozerov.fully.FullyActivity r0 = r8.f10414a
            Z1.a r0 = r0.f9942e1
            r0.e(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.L0.run():void");
    }
}
