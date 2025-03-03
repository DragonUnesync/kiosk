package k1;

import G3.f;

/* renamed from: k1.e  reason: case insensitive filesystem */
public final /* synthetic */ class C1136e implements f {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ p f12929U;

    public /* synthetic */ C1136e(p pVar) {
        this.f12929U = pVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r6.equals("audio/ac4") == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0095, code lost:
        if (r4.f13004h.d(r4.i, r9) != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = -1
            r3 = 1
            k1.p r4 = r8.f12929U
            M0.r r9 = (M0.r) r9
            java.lang.Object r5 = r4.f13000c
            monitor-enter(r5)
            k1.j r6 = r4.f13003g     // Catch:{ all -> 0x0069 }
            boolean r6 = r6.f12967w     // Catch:{ all -> 0x0069 }
            if (r6 == 0) goto L_0x0097
            boolean r6 = r4.f13002f     // Catch:{ all -> 0x0069 }
            if (r6 != 0) goto L_0x0097
            int r6 = r9.f3014C     // Catch:{ all -> 0x0069 }
            if (r6 == r2) goto L_0x0097
            if (r6 <= r1) goto L_0x0097
            java.lang.String r6 = r9.f3036n     // Catch:{ all -> 0x0069 }
            if (r6 != 0) goto L_0x0021
        L_0x001f:
            r1 = 0
            goto L_0x0058
        L_0x0021:
            int r7 = r6.hashCode()
            switch(r7) {
                case -2123537834: goto L_0x0049;
                case 187078296: goto L_0x003e;
                case 187078297: goto L_0x0035;
                case 1504578661: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            r1 = -1
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0033
            goto L_0x0028
        L_0x0033:
            r1 = 3
            goto L_0x0053
        L_0x0035:
            java.lang.String r7 = "audio/ac4"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0053
            goto L_0x0028
        L_0x003e:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0047
            goto L_0x0028
        L_0x0047:
            r1 = 1
            goto L_0x0053
        L_0x0049:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0052
            goto L_0x0028
        L_0x0052:
            r1 = 0
        L_0x0053:
            switch(r1) {
                case 0: goto L_0x0057;
                case 1: goto L_0x0057;
                case 2: goto L_0x0057;
                case 3: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x001f
        L_0x0057:
            r1 = 1
        L_0x0058:
            r2 = 32
            if (r1 == 0) goto L_0x006b
            int r1 = P0.z.f3748a     // Catch:{ all -> 0x0069 }
            if (r1 < r2) goto L_0x0097
            com.bumptech.glide.j r1 = r4.f13004h     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0097
            boolean r1 = r1.f9007U     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0097
            goto L_0x006b
        L_0x0069:
            r9 = move-exception
            goto L_0x009a
        L_0x006b:
            int r1 = P0.z.f3748a     // Catch:{ all -> 0x0069 }
            if (r1 < r2) goto L_0x0098
            com.bumptech.glide.j r1 = r4.f13004h     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0098
            boolean r2 = r1.f9007U     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x0098
            java.lang.Object r1 = r1.f9008V     // Catch:{ all -> 0x0069 }
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch:{ all -> 0x0069 }
            boolean r1 = r1.isAvailable()     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0098
            com.bumptech.glide.j r1 = r4.f13004h     // Catch:{ all -> 0x0069 }
            java.lang.Object r1 = r1.f9008V     // Catch:{ all -> 0x0069 }
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch:{ all -> 0x0069 }
            boolean r1 = r1.isEnabled()     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0098
            com.bumptech.glide.j r1 = r4.f13004h     // Catch:{ all -> 0x0069 }
            M0.e r2 = r4.i     // Catch:{ all -> 0x0069 }
            boolean r9 = r1.d(r2, r9)     // Catch:{ all -> 0x0069 }
            if (r9 == 0) goto L_0x0098
        L_0x0097:
            r0 = 1
        L_0x0098:
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            return r0
        L_0x009a:
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1136e.apply(java.lang.Object):boolean");
    }
}
