package androidx.activity;

import h.C1022j;

public final class g extends androidx.activity.result.g {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C1022j f7282h;

    public g(C1022j jVar) {
        this.f7282h = jVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r9, G5.s r10, G5.u r11) {
        /*
            r8 = this;
            h.j r0 = r8.f7282h
            int r1 = r10.f1726a
            switch(r1) {
                case 2: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = 0
            goto L_0x0049
        L_0x0009:
            r1 = r11
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L_0x0017
            Y0.b r1 = new Y0.b
            D6.s r2 = D6.s.f1270U
            r1.<init>((java.lang.Object) r2)
            goto L_0x0049
        L_0x0017:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x001a:
            if (r4 >= r2) goto L_0x0027
            r5 = r1[r4]
            int r5 = j0.f.a(r0, r5)
            if (r5 != 0) goto L_0x0007
            int r4 = r4 + 1
            goto L_0x001a
        L_0x0027:
            int r2 = r1.length
            int r2 = D6.u.D(r2)
            r4 = 16
            if (r2 >= r4) goto L_0x0032
            r2 = 16
        L_0x0032:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r2)
            int r2 = r1.length
        L_0x0038:
            if (r3 >= r2) goto L_0x0044
            r5 = r1[r3]
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r4.put(r5, r6)
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0044:
            Y0.b r1 = new Y0.b
            r1.<init>((java.lang.Object) r4)
        L_0x0049:
            if (r1 == 0) goto L_0x005e
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            r10.<init>(r11)
            G.l r11 = new G.l
            r0 = 1
            r11.<init>((java.lang.Object) r8, (int) r9, (java.lang.Object) r1, (int) r0)
            r10.post(r11)
            return
        L_0x005e:
            int r10 = r10.f1726a
            switch(r10) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x007d;
                case 2: goto L_0x0067;
                default: goto L_0x0063;
            }
        L_0x0063:
            android.content.Intent r11 = (android.content.Intent) r11
            goto L_0x0191
        L_0x0067:
            java.lang.String[] r11 = (java.lang.String[]) r11
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r1 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
            r10.<init>(r1)
            java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r11 = r10.putExtra(r1, r11)
            java.lang.String r10 = "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)"
            P6.f.d(r11, r10)
            goto L_0x0191
        L_0x007d:
            androidx.activity.result.i r11 = (androidx.activity.result.i) r11
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r1 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
            r10.<init>(r1)
            android.content.Intent r1 = r11.f7342V
            if (r1 == 0) goto L_0x00ae
            java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            android.os.Bundle r3 = r1.getBundleExtra(r2)
            if (r3 == 0) goto L_0x00ae
            r10.putExtra(r2, r3)
            r1.removeExtra(r2)
            java.lang.String r2 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r3 = 0
            boolean r1 = r1.getBooleanExtra(r2, r3)
            if (r1 == 0) goto L_0x00ae
            android.content.IntentSender r1 = r11.f7341U
            androidx.activity.result.i r2 = new androidx.activity.result.i
            int r3 = r11.f7344X
            r4 = 0
            int r11 = r11.f7343W
            r2.<init>(r1, r4, r11, r3)
            r11 = r2
        L_0x00ae:
            java.lang.String r1 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
            r10.putExtra(r1, r11)
            java.lang.String r11 = "FragmentManager"
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r11, r1)
            if (r1 == 0) goto L_0x00cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CreateIntent created the following intent: "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r11, r1)
        L_0x00cd:
            r11 = r10
            goto L_0x0191
        L_0x00d0:
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class r1 = r11.f1734b
            if (r1 != 0) goto L_0x00da
            java.lang.Class<com.journeyapps.barcodescanner.CaptureActivity> r1 = com.journeyapps.barcodescanner.CaptureActivity.class
            r11.f1734b = r1
        L_0x00da:
            java.lang.Class r1 = r11.f1734b
            r10.<init>(r0, r1)
            java.lang.String r1 = "com.google.zxing.client.android.SCAN"
            r10.setAction(r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r10.addFlags(r1)
            r1 = 524288(0x80000, float:7.34684E-40)
            r10.addFlags(r1)
            java.util.HashMap r11 = r11.f1733a
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x00f8:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0118
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x0118:
            boolean r3 = r1 instanceof java.lang.Long
            if (r3 == 0) goto L_0x0122
            java.lang.Long r1 = (java.lang.Long) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x0122:
            boolean r3 = r1 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x012c
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x012c:
            boolean r3 = r1 instanceof java.lang.Double
            if (r3 == 0) goto L_0x0136
            java.lang.Double r1 = (java.lang.Double) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x0136:
            boolean r3 = r1 instanceof java.lang.Float
            if (r3 == 0) goto L_0x0140
            java.lang.Float r1 = (java.lang.Float) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x0140:
            boolean r3 = r1 instanceof android.os.Bundle
            if (r3 == 0) goto L_0x014a
            android.os.Bundle r1 = (android.os.Bundle) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x014a:
            boolean r3 = r1 instanceof int[]
            if (r3 == 0) goto L_0x0154
            int[] r1 = (int[]) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x0154:
            boolean r3 = r1 instanceof long[]
            if (r3 == 0) goto L_0x015e
            long[] r1 = (long[]) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x015e:
            boolean r3 = r1 instanceof boolean[]
            if (r3 == 0) goto L_0x0168
            boolean[] r1 = (boolean[]) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x0168:
            boolean r3 = r1 instanceof double[]
            if (r3 == 0) goto L_0x0172
            double[] r1 = (double[]) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x0172:
            boolean r3 = r1 instanceof float[]
            if (r3 == 0) goto L_0x017d
            float[] r1 = (float[]) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x017d:
            boolean r3 = r1 instanceof java.lang.String[]
            if (r3 == 0) goto L_0x0188
            java.lang.String[] r1 = (java.lang.String[]) r1
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x0188:
            java.lang.String r1 = r1.toString()
            r10.putExtra(r2, r1)
            goto L_0x00f8
        L_0x0191:
            android.os.Bundle r10 = r11.getExtras()
            if (r10 == 0) goto L_0x01a8
            android.os.Bundle r10 = r11.getExtras()
            java.lang.ClassLoader r10 = r10.getClassLoader()
            if (r10 != 0) goto L_0x01a8
            java.lang.ClassLoader r10 = r0.getClassLoader()
            r11.setExtrasClassLoader(r10)
        L_0x01a8:
            java.lang.String r10 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            boolean r1 = r11.hasExtra(r10)
            if (r1 == 0) goto L_0x01b9
            android.os.Bundle r1 = r11.getBundleExtra(r10)
            r11.removeExtra(r10)
            r7 = r1
            goto L_0x01bb
        L_0x01b9:
            r10 = 0
            r7 = r10
        L_0x01bb:
            java.lang.String r10 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
            java.lang.String r1 = r11.getAction()
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x01d6
            java.lang.String r10 = "androidx.activity.result.contract.extra.PERMISSIONS"
            java.lang.String[] r10 = r11.getStringArrayExtra(r10)
            if (r10 != 0) goto L_0x01d2
            r10 = 0
            java.lang.String[] r10 = new java.lang.String[r10]
        L_0x01d2:
            j0.f.j(r0, r10, r9)
            goto L_0x020f
        L_0x01d6:
            java.lang.String r10 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
            java.lang.String r1 = r11.getAction()
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x020c
            java.lang.String r10 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
            android.os.Parcelable r10 = r11.getParcelableExtra(r10)
            androidx.activity.result.i r10 = (androidx.activity.result.i) r10
            android.content.IntentSender r1 = r10.f7341U     // Catch:{ SendIntentException -> 0x01f8 }
            android.content.Intent r3 = r10.f7342V     // Catch:{ SendIntentException -> 0x01f8 }
            int r4 = r10.f7343W     // Catch:{ SendIntentException -> 0x01f8 }
            int r5 = r10.f7344X     // Catch:{ SendIntentException -> 0x01f8 }
            r6 = 0
            r2 = r9
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SendIntentException -> 0x01f8 }
            goto L_0x020f
        L_0x01f8:
            r10 = move-exception
            android.os.Handler r11 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r11.<init>(r0)
            G.l r0 = new G.l
            r1 = 2
            r0.<init>((java.lang.Object) r8, (int) r9, (java.lang.Object) r10, (int) r1)
            r11.post(r0)
            goto L_0x020f
        L_0x020c:
            r0.startActivityForResult(r11, r9, r7)
        L_0x020f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.g.b(int, G5.s, G5.u):void");
    }
}
