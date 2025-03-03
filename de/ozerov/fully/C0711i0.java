package de.ozerov.fully;

import C3.k;
import G5.h;
import android.os.AsyncTask;
import androidx.fragment.app.C0470v;
import n2.a;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.i0  reason: case insensitive filesystem */
public final class C0711i0 extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10700a;

    /* renamed from: b  reason: collision with root package name */
    public volatile F f10701b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0470v f10702c;

    public /* synthetic */ C0711i0(int i, C0470v vVar) {
        this.f10700a = i;
        this.f10702c = vVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: de.ozerov.fully.O2[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: de.ozerov.fully.O2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0266, code lost:
        android.util.Log.e("j0", "Load FEK data failed due to " + r14.getMessage());
        r0 = r5.f10731P0;
        n2.a.a1(1, r0, "Failed to load config file due to " + r14.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f7, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f9, code lost:
        r14 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x025e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f7 A[Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }, ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:76:0x01e0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.String r0 = "file:"
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "http:"
            r3 = 0
            r4 = 0
            androidx.fragment.app.v r5 = r13.f10702c
            r6 = 1
            int r7 = r13.f10700a
            switch(r7) {
                case 0: goto L_0x01da;
                case 1: goto L_0x011d;
                default: goto L_0x0010;
            }
        L_0x0010:
            de.ozerov.fully.O2[] r14 = (de.ozerov.fully.O2[]) r14
            int r0 = r14.length
            if (r0 != r6) goto L_0x011c
            r4 = r14[r3]
            java.lang.String r14 = r4.f10215a
            boolean r14 = r14.startsWith(r2)
            r0 = -1
            if (r14 != 0) goto L_0x004c
            java.lang.String r14 = r4.f10215a
            java.lang.String r2 = "https"
            boolean r14 = r14.startsWith(r2)
            if (r14 == 0) goto L_0x002b
            goto L_0x004c
        L_0x002b:
            java.lang.String r14 = r4.f10215a
            java.lang.String r1 = "rtsp:"
            boolean r14 = r14.startsWith(r1)
            if (r14 != 0) goto L_0x0046
            java.lang.String r14 = r4.f10215a
            java.lang.String r1 = "rtmp:"
            boolean r14 = r14.startsWith(r1)
            if (r14 == 0) goto L_0x0040
            goto L_0x0046
        L_0x0040:
            r4.f10216b = r0
            r4.f10223k = r3
            goto L_0x011c
        L_0x0046:
            r4.f10216b = r6
            r4.f10223k = r6
            goto L_0x011c
        L_0x004c:
            java.lang.String r7 = r4.f10215a
            r9 = 0
            r10 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            de.ozerov.fully.x2 r14 = de.ozerov.fully.C0808y2.a(r7, r8, r9, r10, r11, r12)
            int r2 = r14.f11070b
            r7 = 200(0xc8, float:2.8E-43)
            de.ozerov.fully.V2 r5 = (de.ozerov.fully.V2) r5
            if (r2 != r7) goto L_0x00b9
            java.lang.String r0 = r14.e
            java.lang.String r2 = "video/"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = r14.e
            java.lang.String r2 = "image/"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x0074
            goto L_0x00b4
        L_0x0074:
            java.net.URL r0 = r14.f11069a
            java.lang.String r0 = r0.getHost()
            java.lang.String r2 = "dropbox"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = r14.e
            java.lang.String r2 = "application/json"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x0092
            r4.f10216b = r6
            r4.f10223k = r6
            goto L_0x011c
        L_0x0092:
            java.lang.String r0 = r14.e
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x00af
            de.ozerov.fully.FullyActivity r0 = r5.f9850f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "URL returns strange content type "
            r1.<init>(r2)
            java.lang.String r14 = r14.e
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            n2.a.b1(r0, r14)
        L_0x00af:
            r4.f10216b = r3
            r4.f10223k = r6
            goto L_0x011c
        L_0x00b4:
            r4.f10216b = r6
            r4.f10223k = r6
            goto L_0x011c
        L_0x00b9:
            r1 = 404(0x194, float:5.66E-43)
            if (r2 != r1) goto L_0x00c2
            r4.f10216b = r0
            r4.f10223k = r3
            goto L_0x011c
        L_0x00c2:
            java.lang.String r1 = r4.f10215a
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = ".png"
            boolean r1 = r1.endsWith(r2)
            r2 = 17
            java.lang.String r3 = " when testing the URL"
            java.lang.String r7 = "Error "
            if (r1 != 0) goto L_0x0108
            java.lang.String r1 = r4.f10215a
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r8 = ".jpg"
            boolean r1 = r1.endsWith(r8)
            if (r1 != 0) goto L_0x0108
            java.lang.String r1 = r4.f10215a
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r8 = ".mp4"
            boolean r1 = r1.endsWith(r8)
            if (r1 == 0) goto L_0x00f3
            goto L_0x0108
        L_0x00f3:
            r4.f10216b = r0
            r4.f10223k = r6
            de.ozerov.fully.FullyActivity r0 = r5.f9850f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            int r14 = r14.f11070b
            java.lang.String r14 = N.e.z(r1, r14, r3)
            n2.a.c1(r0, r14, r6, r2)
            goto L_0x011c
        L_0x0108:
            r4.f10216b = r6
            r4.f10223k = r6
            de.ozerov.fully.FullyActivity r0 = r5.f9850f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            int r14 = r14.f11070b
            java.lang.String r14 = N.e.z(r1, r14, r3)
            n2.a.c1(r0, r14, r6, r2)
        L_0x011c:
            return r4
        L_0x011d:
            de.ozerov.fully.a1[] r14 = (de.ozerov.fully.C0664a1[]) r14
            int r7 = r14.length
            if (r7 != r6) goto L_0x01d9
            r14 = r14[r3]
            de.ozerov.fully.j1 r5 = (de.ozerov.fully.C0718j1) r5
            de.ozerov.fully.FullyActivity r5 = r5.f9850f1
            java.lang.String r7 = r14.f10544b
            if (r7 != 0) goto L_0x0134
            java.lang.String r0 = "UNKNOWN URL"
            r14.f10545c = r0
            r14.f10547f = r3
            goto L_0x01d8
        L_0x0134:
            boolean r2 = r7.startsWith(r2)
            if (r2 != 0) goto L_0x016d
            java.lang.String r2 = r14.f10544b
            java.lang.String r7 = "https:"
            boolean r2 = r2.startsWith(r7)
            if (r2 != 0) goto L_0x016d
            java.lang.String r2 = r14.f10544b
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x014d
            goto L_0x016d
        L_0x014d:
            java.lang.String r0 = r14.f10544b
            java.lang.String r1 = "intent:"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = r14.f10544b
            java.lang.String r1 = "javascript:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0162
            goto L_0x0169
        L_0x0162:
            java.lang.String r0 = "UNKNOWN URL TYPE"
            r14.f10545c = r0
            r14.f10547f = r3
            goto L_0x01d8
        L_0x0169:
            de.ozerov.fully.C0664a1.b(r14, r5)
            goto L_0x01d8
        L_0x016d:
            java.lang.String r0 = r14.f10544b
            java.lang.String r0 = de.ozerov.fully.C0808y2.f(r0)
            boolean r2 = r0.isEmpty()
            java.lang.String r7 = "ERROR"
            if (r2 == 0) goto L_0x0180
            r14.f10547f = r3
            r14.f10545c = r7
            goto L_0x01d8
        L_0x0180:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ce
            java.lang.String r0 = r14.f10544b
            java.lang.String r0 = n2.a.m0(r0)
            S7.h r0 = de.ozerov.fully.C0794w0.o0(r0)
            if (r0 != 0) goto L_0x0197
            r14.f10547f = r3
            r14.f10545c = r7
            goto L_0x01d8
        L_0x0197:
            r14.f10547f = r6
            java.lang.String r1 = "title"
            U7.d r1 = r0.M(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x01af
            java.lang.Object r1 = r1.get(r3)
            S7.k r1 = (S7.k) r1
            java.lang.String r4 = r1.O()
        L_0x01af:
            java.lang.String r1 = "NO TITLE FOUND"
            java.lang.Object r1 = j$.util.Objects.requireNonNullElse(r4, r1)
            java.lang.String r1 = (java.lang.String) r1
            r14.f10545c = r1
            java.util.ArrayList r0 = de.ozerov.fully.C0794w0.w(r0)
            R2.c r0 = de.ozerov.fully.C0794w0.o(r5, r0)
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r0 = r0.f4336V
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = n2.a.n0(r0)
            r14.f10546d = r0
            goto L_0x01d8
        L_0x01ce:
            r14.f10547f = r6
            java.lang.String r0 = r14.f10544b
            java.lang.String r0 = de.ozerov.fully.C0808y2.c(r0)
            r14.f10545c = r0
        L_0x01d8:
            r4 = r14
        L_0x01d9:
            return r4
        L_0x01da:
            java.lang.Void[] r14 = (java.lang.Void[]) r14
            java.lang.String r14 = "fek://"
            de.ozerov.fully.j0 r5 = (de.ozerov.fully.C0717j0) r5
            java.lang.String r1 = r5.f10741Z0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            boolean r1 = r1.startsWith(r14)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            if (r1 == 0) goto L_0x01fb
            java.lang.String r1 = r5.f10741Z0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.lang.String r2 = "https://"
            java.lang.String r14 = r1.replace(r14, r2)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            r5.f10741Z0 = r14     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            goto L_0x01fb
        L_0x01f7:
            r14 = move-exception
            goto L_0x0266
        L_0x01f9:
            r14 = move-exception
            goto L_0x0266
        L_0x01fb:
            java.lang.String r14 = r5.f10741Z0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            boolean r14 = r14.startsWith(r0)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            if (r14 == 0) goto L_0x0229
            de.ozerov.fully.FullyActivity r14 = r5.f10731P0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            boolean r14 = n2.a.g0(r14)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            if (r14 != 0) goto L_0x0229
            de.ozerov.fully.FullyActivity r14 = r5.f10731P0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.lang.String r0 = r5.f10741Z0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            boolean r14 = n2.a.G0(r14, r0)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            if (r14 == 0) goto L_0x0229
            boolean r14 = n2.a.y0()     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            if (r14 == 0) goto L_0x0229
            de.ozerov.fully.FullyActivity r14 = r5.f10731P0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            r14.requestPermissions(r0, 1022)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            goto L_0x0294
        L_0x0229:
            java.lang.String r14 = r5.f10741Z0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.lang.String r14 = r14.toLowerCase()     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.lang.String r0 = "content:"
            boolean r14 = r14.startsWith(r0)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            if (r14 == 0) goto L_0x0248
            de.ozerov.fully.FullyActivity r14 = r5.f10731P0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            android.content.ContentResolver r14 = r14.getContentResolver()     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.lang.String r0 = r5.f10741Z0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.io.InputStream r14 = r14.openInputStream(r0)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            goto L_0x0253
        L_0x0248:
            java.net.URL r14 = new java.net.URL     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.lang.String r0 = r5.f10741Z0     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            r14.<init>(r0)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.io.InputStream r14 = r14.openStream()     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
        L_0x0253:
            byte[] r14 = E7.f.a(r14)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            if (r14 == 0) goto L_0x0294
            java.lang.String r4 = n2.a.v(r14)     // Catch:{ Exception -> 0x025e, OutOfMemoryError -> 0x01f7 }
            goto L_0x0294
        L_0x025e:
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            java.lang.String r0 = "wrong file format or failed decryption"
            r14.<init>(r0)     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
            throw r14     // Catch:{ Exception -> 0x01f9, OutOfMemoryError -> 0x01f7 }
        L_0x0266:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Load FEK data failed due to "
            r0.<init>(r1)
            java.lang.String r1 = r14.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "j0"
            android.util.Log.e(r1, r0)
            de.ozerov.fully.FullyActivity r0 = r5.f10731P0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to load config file due to "
            r1.<init>(r2)
            java.lang.String r14 = r14.getMessage()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            n2.a.a1(r6, r0, r14)
        L_0x0294:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0711i0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final void onPostExecute(Object obj) {
        switch (this.f10700a) {
            case 0:
                String str = (String) obj;
                if (this.f10701b != null && ((C0717j0) this.f10702c).f10731P0.w()) {
                    if (str != null) {
                        C0717j0 j0Var = (C0717j0) this.f10702c;
                        j0Var.getClass();
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            j0Var.f10740Y0 = jSONObject;
                            if (Integer.parseInt(jSONObject.getString("minVersionCode")) > 101362) {
                                throw new IllegalStateException("App version is too old");
                            } else if (!j0Var.f10740Y0.getBoolean("kioskMode") || j0Var.f10740Y0.getString("kioskPin").isEmpty()) {
                                throw new IllegalStateException("Kiosk mode is not enabled in the config");
                            } else {
                                j0Var.f10734S0.setText(j0Var.f10740Y0.getString("examName"));
                                if (!j0Var.f10740Y0.has("examDescription") || j0Var.f10740Y0.getString("examDescription").isEmpty()) {
                                    j0Var.f10735T0.setVisibility(8);
                                } else {
                                    j0Var.f10735T0.setText(j0Var.f10740Y0.getString("examDescription"));
                                    j0Var.f10735T0.setVisibility(0);
                                }
                                j0Var.f10736U0.setVisibility(0);
                                j0Var.f10737V0.setVisibility(8);
                                if (a.Q(j0Var.f10740Y0, "refuseExamStartIfOverlayDetected", true)) {
                                    j0Var.f10739X0.setOnTouchListener(new k(2, j0Var));
                                }
                            }
                        } catch (Exception e) {
                            j0Var.f10736U0.setVisibility(8);
                            j0Var.f10737V0.setVisibility(0);
                            FullyActivity fullyActivity = j0Var.f10731P0;
                            a.a1(1, fullyActivity, "Failed to parse config file due to " + e.getMessage());
                        }
                    }
                    if (this.f10701b.isShowing()) {
                        this.f10701b.dismiss();
                        this.f10701b = null;
                    }
                    ((C0717j0) this.f10702c).f10741Z0 = null;
                    return;
                }
                return;
            case 1:
                C0664a1 a1Var = (C0664a1) obj;
                if (this.f10701b != null && ((C0718j1) this.f10702c).f9850f1.w()) {
                    ((C0718j1) this.f10702c).f10743m1.add(a1Var);
                    ((C0718j1) this.f10702c).f10744n1.notifyDataSetChanged();
                    C0718j1 j1Var = (C0718j1) this.f10702c;
                    C0664a1.d(j1Var.f9850f1, j1Var.f10743m1);
                    ((C0718j1) this.f10702c).f10745o1.getRecyclerView().scrollToPosition(((C0718j1) this.f10702c).f10743m1.size() - 1);
                    if (this.f10701b.isShowing()) {
                        this.f10701b.dismiss();
                        this.f10701b = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                O2 o2 = (O2) obj;
                if (this.f10701b != null && ((V2) this.f10702c).f9850f1.w()) {
                    ((V2) this.f10702c).V(o2);
                    if (this.f10701b.isShowing()) {
                        this.f10701b.dismiss();
                        this.f10701b = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onPreExecute() {
        switch (this.f10700a) {
            case 0:
                this.f10701b = new F(((C0717j0) this.f10702c).f10731P0, "Open config file...");
                this.f10701b.show();
                this.f10701b.setOnCancelListener(new h(2, this));
                return;
            case 1:
                this.f10701b = new F(((C0718j1) this.f10702c).f9850f1, "Checking URL...");
                this.f10701b.show();
                this.f10701b.setOnCancelListener(new h(5, this));
                return;
            default:
                this.f10701b = new F(((V2) this.f10702c).f9850f1, "Checking URL...");
                this.f10701b.show();
                this.f10701b.setOnCancelListener(new h(8, this));
                return;
        }
    }
}
