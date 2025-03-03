package de.ozerov.fully;

import android.webkit.DownloadListener;

public final /* synthetic */ class a5 implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g5 f10555a;

    public /* synthetic */ a5(g5 g5Var) {
        this.f10555a = g5Var;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDownloadStart(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26) {
        /*
            r21 = this;
            r6 = r22
            r7 = r25
            java.lang.String r8 = "6"
            java.lang.String r9 = "5"
            java.lang.String r10 = "2"
            java.lang.String r12 = "4"
            java.lang.String r13 = "3"
            r16 = 0
            java.lang.String r5 = "1"
            java.lang.String r4 = "File not found "
            r3 = r21
            de.ozerov.fully.g5 r2 = r3.f10555a
            de.ozerov.fully.MyWebView r0 = r2.f10664g
            if (r0 != 0) goto L_0x001e
            goto L_0x02b2
        L_0x001e:
            r0.f10128h0 = r6
            java.lang.String r1 = r0.f10127g0
            r0.f10125e0 = r1
            r2.o(r1)
            r2.n()
            d4.k r1 = r2.f10677u
            java.lang.Boolean r0 = r1.C1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x003b
            de.ozerov.fully.MyWebView r0 = r2.f10664g
            r0.g()
        L_0x003b:
            java.lang.String r0 = "content://"
            boolean r0 = r6.startsWith(r0)
            de.ozerov.fully.V4 r11 = r2.f10667k
            java.lang.String r14 = "application/pdf"
            de.ozerov.fully.t4 r15 = r2.f10676t
            if (r0 == 0) goto L_0x007e
            if (r7 == 0) goto L_0x007e
            boolean r0 = r7.equals(r14)
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r1.i1()
            r0.getClass()
            int r17 = r0.hashCode()
            switch(r17) {
                case 49: goto L_0x0073;
                case 50: goto L_0x005f;
                case 51: goto L_0x006a;
                case 52: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            r0 = -1
            goto L_0x007b
        L_0x0061:
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0068
            goto L_0x005f
        L_0x0068:
            r0 = 2
            goto L_0x007b
        L_0x006a:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0071
            goto L_0x005f
        L_0x0071:
            r0 = 1
            goto L_0x007b
        L_0x0073:
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x007a
            goto L_0x005f
        L_0x007a:
            r0 = 0
        L_0x007b:
            switch(r0) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00ad;
                case 2: goto L_0x008a;
                default: goto L_0x007e;
            }
        L_0x007e:
            r20 = r1
            r18 = r8
            r17 = r9
            r27 = r10
            r10 = r2
            r9 = r4
            r8 = r5
            goto L_0x00d0
        L_0x008a:
            de.ozerov.fully.MyWebView r0 = r2.f10664g
            java.lang.String r17 = de.ozerov.fully.P.l(r15, r6)
            java.lang.String r18 = "text/html"
            java.lang.String r19 = "UTF-8"
            r20 = r1
            r1 = r22
            r27 = r10
            r10 = r2
            r2 = r17
            r3 = r18
            r17 = r9
            r9 = r4
            r4 = r19
            r18 = r8
            r8 = r5
            r5 = r22
            r0.loadDataWithBaseURL(r1, r2, r3, r4, r5)
            goto L_0x00d0
        L_0x00ad:
            r20 = r1
            r18 = r8
            r17 = r9
            r27 = r10
            r10 = r2
            r9 = r4
            r8 = r5
            r10.i(r6)
            r11.k(r6, r7)
            goto L_0x00d0
        L_0x00bf:
            r20 = r1
            r18 = r8
            r17 = r9
            r27 = r10
            r10 = r2
            r9 = r4
            r8 = r5
            r10.i(r6)
            r11.n(r6)
        L_0x00d0:
            java.lang.String r0 = "file://"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = ".pdf"
            boolean r0 = r6.endsWith(r0)
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = r20.i1()
            r0.getClass()
            int r1 = r0.hashCode()
            switch(r1) {
                case 49: goto L_0x0102;
                case 50: goto L_0x00ee;
                case 51: goto L_0x00f9;
                case 52: goto L_0x00f0;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            r0 = -1
            goto L_0x010a
        L_0x00f0:
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00f7
            goto L_0x00ee
        L_0x00f7:
            r0 = 2
            goto L_0x010a
        L_0x00f9:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0100
            goto L_0x00ee
        L_0x0100:
            r0 = 1
            goto L_0x010a
        L_0x0102:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0109
            goto L_0x00ee
        L_0x0109:
            r0 = 0
        L_0x010a:
            switch(r0) {
                case 0: goto L_0x0177;
                case 1: goto L_0x0122;
                case 2: goto L_0x010f;
                default: goto L_0x010d;
            }
        L_0x010d:
            goto L_0x02b2
        L_0x010f:
            de.ozerov.fully.MyWebView r0 = r10.f10664g
            java.lang.String r2 = de.ozerov.fully.P.l(r15, r6)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "UTF-8"
            r1 = r22
            r5 = r22
            r0.loadDataWithBaseURL(r1, r2, r3, r4, r5)
            goto L_0x02b2
        L_0x0122:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0165 }
            java.net.URI r1 = new java.net.URI     // Catch:{ Exception -> 0x0165 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0165 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0165 }
            r10.i(r6)     // Catch:{ Exception -> 0x0165 }
            boolean r1 = n2.a.p0()     // Catch:{ Exception -> 0x0165 }
            if (r1 != 0) goto L_0x0136
            goto L_0x013d
        L_0x0136:
            boolean r1 = android.os.Environment.isExternalStorageLegacy()     // Catch:{ Exception -> 0x0165 }
            r2 = 1
            r16 = r1 ^ 1
        L_0x013d:
            if (r16 != 0) goto L_0x014b
            boolean r1 = n2.a.w0(r15, r0)     // Catch:{ Exception -> 0x0165 }
            if (r1 == 0) goto L_0x0146
            goto L_0x014b
        L_0x0146:
            r11.k(r6, r14)     // Catch:{ Exception -> 0x0165 }
            goto L_0x02b2
        L_0x014b:
            android.net.Uri r1 = androidx.core.content.FileProvider.d(r15, r0)     // Catch:{ Exception -> 0x0165 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x0165 }
            if (r0 == 0) goto L_0x015c
            if (r1 == 0) goto L_0x015c
            r11.j(r1, r14)     // Catch:{ Exception -> 0x0165 }
            goto L_0x02b2
        L_0x015c:
            java.lang.String r0 = r9.concat(r6)     // Catch:{ Exception -> 0x0165 }
            n2.a.b1(r15, r0)     // Catch:{ Exception -> 0x0165 }
            goto L_0x02b2
        L_0x0165:
            java.lang.String r0 = "Bad file: URL "
            java.lang.String r0 = r0.concat(r6)
            java.lang.String r1 = "g5"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Bad file: URL provided"
            n2.a.b1(r15, r0)
            goto L_0x02b2
        L_0x0177:
            r10.i(r6)
            r11.n(r6)
            goto L_0x02b2
        L_0x017f:
            r2 = 1
            if (r7 == 0) goto L_0x0212
            boolean r0 = r7.equals(r14)
            if (r0 == 0) goto L_0x0212
            java.lang.String r0 = r20.M1()
            r0.getClass()
            int r1 = r0.hashCode()
            switch(r1) {
                case 49: goto L_0x01cb;
                case 50: goto L_0x01c0;
                case 51: goto L_0x01b7;
                case 52: goto L_0x01ae;
                case 53: goto L_0x01a3;
                case 54: goto L_0x0198;
                default: goto L_0x0196;
            }
        L_0x0196:
            r0 = -1
            goto L_0x01d3
        L_0x0198:
            r1 = r18
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a1
            goto L_0x0196
        L_0x01a1:
            r0 = 5
            goto L_0x01d3
        L_0x01a3:
            r2 = r17
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01ac
            goto L_0x0196
        L_0x01ac:
            r0 = 4
            goto L_0x01d3
        L_0x01ae:
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x01b5
            goto L_0x0196
        L_0x01b5:
            r0 = 3
            goto L_0x01d3
        L_0x01b7:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x01be
            goto L_0x0196
        L_0x01be:
            r0 = 2
            goto L_0x01d3
        L_0x01c0:
            r3 = r27
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01c9
            goto L_0x0196
        L_0x01c9:
            r0 = 1
            goto L_0x01d3
        L_0x01cb:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x01d2
            goto L_0x0196
        L_0x01d2:
            r0 = 0
        L_0x01d3:
            switch(r0) {
                case 0: goto L_0x0208;
                case 1: goto L_0x01eb;
                case 2: goto L_0x0208;
                case 3: goto L_0x01d8;
                case 4: goto L_0x0208;
                case 5: goto L_0x0208;
                default: goto L_0x01d6;
            }
        L_0x01d6:
            goto L_0x02b2
        L_0x01d8:
            de.ozerov.fully.MyWebView r0 = r10.f10664g
            java.lang.String r2 = de.ozerov.fully.P.l(r15, r6)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "UTF-8"
            r1 = r22
            r5 = r22
            r0.loadDataWithBaseURL(r1, r2, r3, r4, r5)
            goto L_0x02b2
        L_0x01eb:
            java.lang.String r0 = "https://docs.google.com/gview?embedded=true"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "url"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r6)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            r10.g(r0)
            goto L_0x02b2
        L_0x0208:
            r10.i(r6)
            de.ozerov.fully.MyWebView r0 = r10.f10664g
            r11.e(r0, r6, r7)
            goto L_0x02b2
        L_0x0212:
            r3 = r27
            r2 = r17
            r1 = r18
            if (r7 == 0) goto L_0x023c
            java.lang.String r0 = "video/"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x023c
            java.lang.Boolean r0 = r20.D1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x023c
            r10.i(r6)
            de.ozerov.fully.V4 r0 = r10.f10667k
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 1
            r1 = r22
            r0.m(r1, r2, r3, r4, r5)
            goto L_0x02b2
        L_0x023c:
            java.lang.String r0 = r20.L1()
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x02ac
            java.lang.String r0 = r20.L1()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0264
            java.lang.String r0 = r20.L1()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0264
            java.lang.String r0 = r20.L1()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0285
        L_0x0264:
            java.lang.String r0 = "blob:"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L_0x0285
            java.lang.String r0 = "data:"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L_0x0285
            java.lang.String r0 = "http:"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L_0x0285
            java.lang.String r0 = "https:"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L_0x0285
            goto L_0x02ac
        L_0x0285:
            java.lang.String r0 = r20.L1()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x02a3
            java.lang.String r0 = r20.L1()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x02a3
            java.lang.String r0 = r20.L1()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02b2
        L_0x02a3:
            r10.i(r6)
            de.ozerov.fully.MyWebView r0 = r10.f10664g
            r11.e(r0, r6, r7)
            goto L_0x02b2
        L_0x02ac:
            r10.i(r6)
            r11.k(r6, r7)
        L_0x02b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.a5.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }
}
