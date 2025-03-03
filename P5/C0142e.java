package P5;

import D.C0051j0;
import android.os.Environment;
import de.ozerov.fully.P;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: P5.e  reason: case insensitive filesystem */
public final class C0142e extends C0145h {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3903w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0142e(int i) {
        super(1);
        this.f3903w = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public P5.K a() {
        /*
            r9 = this;
            int r0 = r9.f3903w
            switch(r0) {
                case 0: goto L_0x0526;
                case 1: goto L_0x0459;
                case 2: goto L_0x03cd;
                case 3: goto L_0x032d;
                case 4: goto L_0x027b;
                case 5: goto L_0x0005;
                case 6: goto L_0x0105;
                case 7: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            P5.K r0 = super.a()
            return r0
        L_0x000a:
            boolean r0 = r9.f3891p
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r9.f3888m
            java.lang.String r1 = "uploadFile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0103
            java.util.HashMap r0 = r9.f3884h
            java.lang.String r1 = "filename"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r2 = r9.f3884h
            java.lang.String r3 = "dir"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap r3 = r9.f3882f
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.ArrayList r3 = r9.f3895t
            java.lang.String r4 = r9.f3878a
            if (r0 == 0) goto L_0x00fb
            if (r1 == 0) goto L_0x00fb
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x00fb
            if (r2 != 0) goto L_0x0046
            goto L_0x00fb
        L_0x0046:
            de.ozerov.fully.FullyActivity r5 = r9.f3879b
            boolean r5 = n2.a.h0(r5)
            if (r5 != 0) goto L_0x0065
            de.ozerov.fully.FullyActivity r5 = r9.f3879b
            java.io.File r6 = new java.io.File
            r6.<init>(r2, r0)
            boolean r5 = n2.a.w0(r5, r6)
            if (r5 == 0) goto L_0x0065
            java.lang.String r0 = "Missing runtime permissions to write file"
            android.util.Log.e(r4, r0)
            r3.add(r0)
            goto L_0x0103
        L_0x0065:
            boolean r5 = de.ozerov.fully.P.B()
            if (r5 != 0) goto L_0x0082
            de.ozerov.fully.FullyActivity r5 = r9.f3879b
            java.io.File r6 = new java.io.File
            r6.<init>(r2, r0)
            boolean r5 = n2.a.w0(r5, r6)
            if (r5 == 0) goto L_0x0082
            java.lang.String r0 = "External storage is not writable"
            android.util.Log.e(r4, r0)
            r3.add(r0)
            goto L_0x0103
        L_0x0082:
            java.io.File r5 = new java.io.File
            r5.<init>(r2, r0)
            boolean r2 = r5.exists()
            java.io.File r6 = new java.io.File
            r6.<init>(r1)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a9 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x00a9 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a9 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x00a9 }
            r5 = 65536(0x10000, float:9.18355E-41)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x00a9 }
        L_0x009e:
            int r7 = r1.read(r5)     // Catch:{ IOException -> 0x00a9 }
            if (r7 <= 0) goto L_0x00ab
            r8 = 0
            r6.write(r5, r8, r7)     // Catch:{ IOException -> 0x00a9 }
            goto L_0x009e
        L_0x00a9:
            r0 = move-exception
            goto L_0x00d2
        L_0x00ab:
            r1.close()     // Catch:{ IOException -> 0x00a9 }
            r6.close()     // Catch:{ IOException -> 0x00a9 }
            java.util.ArrayList r1 = r9.f3894s     // Catch:{ IOException -> 0x00a9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a9 }
            r5.<init>()     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r6 = "Successfully uploaded "
            r5.append(r6)     // Catch:{ IOException -> 0x00a9 }
            r5.append(r0)     // Catch:{ IOException -> 0x00a9 }
            if (r2 == 0) goto L_0x00c5
            java.lang.String r0 = " (overwriting old file)"
            goto L_0x00c7
        L_0x00c5:
            java.lang.String r0 = ""
        L_0x00c7:
            r5.append(r0)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x00a9 }
            r1.add(r0)     // Catch:{ IOException -> 0x00a9 }
            goto L_0x0103
        L_0x00d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to upload file due to "
            r1.<init>(r2)
            java.lang.String r5 = r0.getMessage()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.add(r0)
            goto L_0x0103
        L_0x00fb:
            java.lang.String r0 = "Missing parameters"
            android.util.Log.e(r4, r0)
            r3.add(r0)
        L_0x0103:
            r0 = 0
            return r0
        L_0x0105:
            boolean r0 = r9.f3891p
            r1 = 0
            if (r0 == 0) goto L_0x027a
            java.lang.String r0 = r9.f3888m
            java.lang.String r2 = "loadZipFile"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x027a
            java.util.HashMap r0 = r9.f3884h
            java.lang.String r2 = "url"
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x027a
            java.util.HashMap r0 = r9.f3884h
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r2 = r9.f3884h
            java.lang.String r3 = "timeFrame"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r9.f3878a
            r4 = 0
            if (r2 == 0) goto L_0x013f
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x013a }
            goto L_0x0140
        L_0x013a:
            java.lang.String r2 = "Failed to parse timeFrame"
            android.util.Log.e(r3, r2)
        L_0x013f:
            r2 = 0
        L_0x0140:
            double r5 = java.lang.Math.random()
            double r7 = (double) r2
            double r5 = r5 * r7
            int r2 = (int) r5
            java.util.HashMap r5 = r9.f3884h
            java.lang.String r6 = "dir"
            java.lang.Object r5 = r5.get(r6)
            if (r5 == 0) goto L_0x016e
            java.util.HashMap r5 = r9.f3884h
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x016e
            java.io.File r5 = new java.io.File
            java.util.HashMap r7 = r9.f3884h
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            goto L_0x019e
        L_0x016e:
            java.util.HashMap r5 = r9.f3884h
            java.lang.String r6 = "filename"
            java.lang.Object r5 = r5.get(r6)
            if (r5 == 0) goto L_0x0198
            java.util.HashMap r5 = r9.f3884h
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0198
            java.io.File r5 = new java.io.File
            java.util.HashMap r7 = r9.f3884h
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            java.io.File r5 = r5.getParentFile()
            goto L_0x019e
        L_0x0198:
            de.ozerov.fully.FullyActivity r5 = r9.f3879b
            java.io.File r5 = n2.a.c0(r5, r1)
        L_0x019e:
            java.util.ArrayList r6 = r9.f3895t
            if (r5 != 0) goto L_0x01a9
            java.lang.String r0 = "Can't find a any writable folder"
            r6.add(r0)
            goto L_0x027a
        L_0x01a9:
            boolean r7 = de.ozerov.fully.P.I(r0)
            if (r7 != 0) goto L_0x01ba
            java.lang.String r2 = "Invalid URL "
            java.lang.String r0 = r2.concat(r0)
            r6.add(r0)
            goto L_0x027a
        L_0x01ba:
            if (r2 != 0) goto L_0x01e5
            java.lang.String r7 = de.ozerov.fully.C0808y2.f(r0)
            java.lang.String r8 = "application/zip"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x01e5
            de.ozerov.fully.FullyActivity r7 = r9.f3879b
            android.net.Uri r8 = android.net.Uri.parse(r0)
            java.lang.String r7 = de.ozerov.fully.C0808y2.e(r7, r8)
            java.lang.String r8 = "zip"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x01e5
            java.lang.String r2 = "URL not found or not ZIP file "
            java.lang.String r0 = r2.concat(r0)
            r6.add(r0)
            goto L_0x027a
        L_0x01e5:
            de.ozerov.fully.FullyActivity r7 = r9.f3879b
            boolean r7 = n2.a.h0(r7)
            if (r7 != 0) goto L_0x0207
            boolean r7 = n2.a.u0()
            if (r7 == 0) goto L_0x0207
            de.ozerov.fully.FullyActivity r7 = r9.f3879b
            boolean r7 = n2.a.w0(r7, r5)
            if (r7 == 0) goto L_0x0207
            java.lang.String r0 = "Missing runtime permissions to write files"
            android.util.Log.e(r3, r0)
            java.lang.String r0 = "Missing runtime permissions to store ZIP file"
            r6.add(r0)
            goto L_0x027a
        L_0x0207:
            boolean r7 = de.ozerov.fully.P.B()
            if (r7 != 0) goto L_0x0224
            boolean r7 = n2.a.u0()
            if (r7 == 0) goto L_0x0224
            de.ozerov.fully.FullyActivity r7 = r9.f3879b
            boolean r7 = n2.a.w0(r7, r5)
            if (r7 == 0) goto L_0x0224
            java.lang.String r0 = "External storage is not writable"
            android.util.Log.e(r3, r0)
            r6.add(r0)
            goto L_0x027a
        L_0x0224:
            boolean r7 = r5.canWrite()
            if (r7 != 0) goto L_0x0233
            java.lang.String r0 = "Output folder is not writable"
            android.util.Log.e(r3, r0)
            r6.add(r0)
            goto L_0x027a
        L_0x0233:
            java.util.ArrayList r7 = de.ozerov.fully.C0808y2.f11115a     // Catch:{ Exception -> 0x023a }
            boolean r4 = r7.contains(r0)     // Catch:{ Exception -> 0x023a }
            goto L_0x023b
        L_0x023a:
        L_0x023b:
            if (r4 == 0) goto L_0x0246
            java.lang.String r0 = "Download already in progress for this URL"
            android.util.Log.e(r3, r0)
            r6.add(r0)
            goto L_0x027a
        L_0x0246:
            P5.S r3 = new P5.S
            de.ozerov.fully.FullyActivity r4 = r9.f3879b
            android.content.Context r4 = r4.getApplicationContext()
            r3.<init>(r4, r0, r5, r2)
            r3.start()
            java.util.ArrayList r3 = r9.f3894s
            java.lang.String r4 = "Loading and unzipping "
            java.lang.String r5 = " in the background"
            java.lang.StringBuilder r0 = Q0.g.s(r4, r0, r5)
            if (r2 <= 0) goto L_0x0269
            java.lang.String r4 = " (after "
            java.lang.String r5 = " seconds)"
            java.lang.String r2 = u.C1477r.c(r2, r4, r5)
            goto L_0x026b
        L_0x0269:
            java.lang.String r2 = ""
        L_0x026b:
            r0.append(r2)
            java.lang.String r2 = ". Watch log for results..."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.add(r0)
        L_0x027a:
            return r1
        L_0x027b:
            java.lang.String r0 = "attachment; filename=\""
            boolean r1 = r9.f3891p
            if (r1 == 0) goto L_0x032b
            java.lang.String r1 = r9.f3888m
            java.lang.String r2 = "downloadFile"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x032b
            java.util.HashMap r1 = r9.f3884h
            java.lang.String r2 = "filename"
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x032b
            de.ozerov.fully.FullyActivity r1 = r9.f3879b
            java.util.HashMap r3 = r9.f3884h
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = n2.a.F(r1, r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            de.ozerov.fully.FullyActivity r3 = r9.f3879b
            boolean r3 = n2.a.g0(r3)
            java.lang.String r4 = r9.f3878a
            java.util.ArrayList r5 = r9.f3895t
            if (r3 != 0) goto L_0x02c5
            de.ozerov.fully.FullyActivity r3 = r9.f3879b
            boolean r3 = n2.a.w0(r3, r2)
            if (r3 == 0) goto L_0x02c5
            java.lang.String r0 = "Missing runtime permissions to read file"
            android.util.Log.e(r4, r0)
            r5.add(r0)
            goto L_0x032b
        L_0x02c5:
            boolean r3 = de.ozerov.fully.P.C()
            if (r3 != 0) goto L_0x02dc
            de.ozerov.fully.FullyActivity r3 = r9.f3879b
            boolean r3 = n2.a.w0(r3, r2)
            if (r3 == 0) goto L_0x02dc
            java.lang.String r0 = "Storage is not readable"
            android.util.Log.e(r4, r0)
            r5.add(r0)
            goto L_0x032b
        L_0x02dc:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x02f3 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x02f3 }
            P5.J r2 = P5.J.OK     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r4 = P5.P.c(r1)     // Catch:{ Exception -> 0x02f3 }
            P5.K r2 = P5.P.g(r2, r4, r3)     // Catch:{ Exception -> 0x02f3 }
            P5.D r3 = r9.i     // Catch:{ Exception -> 0x02f3 }
            if (r3 == 0) goto L_0x02f5
            r3.c(r2)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x02f5
        L_0x02f3:
            r0 = move-exception
            goto L_0x0315
        L_0x02f5:
            java.lang.String r3 = "content-disposition"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02f3 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x02f3 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x02f3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x02f3 }
            r4.append(r0)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r0 = "\""
            r4.append(r0)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x02f3 }
            r2.k(r3, r0)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x032c
        L_0x0315:
            java.lang.String r2 = "Failed to download "
            java.lang.String r3 = " due to "
            java.lang.StringBuilder r1 = Q0.g.s(r2, r1, r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.add(r0)
        L_0x032b:
            r2 = 0
        L_0x032c:
            return r2
        L_0x032d:
            boolean r0 = r9.f3891p
            if (r0 == 0) goto L_0x03cb
            java.lang.String r0 = r9.f3888m
            java.lang.String r1 = "deleteFolder"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03cb
            java.util.HashMap r0 = r9.f3884h
            java.lang.String r1 = "foldername"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x03cb
            de.ozerov.fully.FullyActivity r0 = r9.f3879b
            java.util.HashMap r2 = r9.f3884h
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = n2.a.F(r0, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            de.ozerov.fully.FullyActivity r2 = r9.f3879b
            boolean r2 = n2.a.h0(r2)
            java.lang.String r3 = r9.f3878a
            java.util.ArrayList r4 = r9.f3895t
            if (r2 != 0) goto L_0x0375
            de.ozerov.fully.FullyActivity r2 = r9.f3879b
            boolean r2 = n2.a.w0(r2, r1)
            if (r2 == 0) goto L_0x0375
            java.lang.String r0 = "Missing runtime permissions to delete file"
            android.util.Log.e(r3, r0)
            r4.add(r0)
            goto L_0x03cb
        L_0x0375:
            boolean r2 = de.ozerov.fully.P.B()
            if (r2 != 0) goto L_0x038c
            de.ozerov.fully.FullyActivity r2 = r9.f3879b
            boolean r2 = n2.a.w0(r2, r1)
            if (r2 == 0) goto L_0x038c
            java.lang.String r0 = "Storage is not writable"
            android.util.Log.e(r3, r0)
            r4.add(r0)
            goto L_0x03cb
        L_0x038c:
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x03ba
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L_0x03ba
            java.lang.Thread r2 = new java.lang.Thread
            P5.f r3 = new P5.f
            r4 = 1
            r3.<init>(r4, r1)
            r2.<init>(r3)
            r2.start()
            java.util.ArrayList r1 = r9.f3894s
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Going to delete in background "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.add(r0)
            goto L_0x03cb
        L_0x03ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Not found or not folder "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.add(r0)
        L_0x03cb:
            r0 = 0
            return r0
        L_0x03cd:
            java.lang.String r0 = "Successfully deleted "
            boolean r1 = r9.f3891p
            if (r1 == 0) goto L_0x0457
            java.lang.String r1 = r9.f3888m
            java.lang.String r2 = "deleteFile"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0457
            java.util.HashMap r1 = r9.f3884h
            java.lang.String r2 = "filename"
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x0457
            de.ozerov.fully.FullyActivity r1 = r9.f3879b
            java.util.HashMap r3 = r9.f3884h
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = n2.a.F(r1, r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            de.ozerov.fully.FullyActivity r3 = r9.f3879b
            boolean r3 = n2.a.h0(r3)
            java.lang.String r4 = r9.f3878a
            java.util.ArrayList r5 = r9.f3895t
            if (r3 != 0) goto L_0x0417
            de.ozerov.fully.FullyActivity r3 = r9.f3879b
            boolean r3 = n2.a.w0(r3, r2)
            if (r3 == 0) goto L_0x0417
            java.lang.String r0 = "Missing runtime permissions to delete file"
            android.util.Log.e(r4, r0)
            r5.add(r0)
            goto L_0x0457
        L_0x0417:
            boolean r3 = de.ozerov.fully.P.B()
            if (r3 != 0) goto L_0x042e
            de.ozerov.fully.FullyActivity r3 = r9.f3879b
            boolean r3 = n2.a.w0(r3, r2)
            if (r3 == 0) goto L_0x042e
            java.lang.String r0 = "Storage is not writable"
            android.util.Log.e(r4, r0)
            r5.add(r0)
            goto L_0x0457
        L_0x042e:
            boolean r2 = r2.delete()     // Catch:{ Exception -> 0x0446 }
            if (r2 == 0) goto L_0x0457
            java.util.ArrayList r2 = r9.f3894s     // Catch:{ Exception -> 0x0446 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0446 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0446 }
            r3.append(r1)     // Catch:{ Exception -> 0x0446 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0446 }
            r2.add(r0)     // Catch:{ Exception -> 0x0446 }
            goto L_0x0457
        L_0x0446:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to delete "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.add(r0)
        L_0x0457:
            r0 = 0
            return r0
        L_0x0459:
            java.lang.String r0 = "Could not create folder "
            java.lang.String r1 = "Successfully created folder "
            java.lang.String r2 = "Folder already exists "
            boolean r3 = r9.f3891p
            if (r3 == 0) goto L_0x0524
            java.lang.String r3 = r9.f3888m
            java.lang.String r4 = "createFolder"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0524
            java.util.HashMap r3 = r9.f3884h
            java.lang.String r4 = "foldername"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap r4 = r9.f3884h
            java.lang.String r5 = "dir"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r9.f3878a
            java.util.ArrayList r6 = r9.f3895t
            if (r3 == 0) goto L_0x051c
            if (r4 != 0) goto L_0x048b
            goto L_0x051c
        L_0x048b:
            de.ozerov.fully.FullyActivity r7 = r9.f3879b
            boolean r7 = n2.a.h0(r7)
            if (r7 != 0) goto L_0x04aa
            de.ozerov.fully.FullyActivity r7 = r9.f3879b
            java.io.File r8 = new java.io.File
            r8.<init>(r4, r3)
            boolean r7 = n2.a.w0(r7, r8)
            if (r7 == 0) goto L_0x04aa
            java.lang.String r0 = "Missing runtime permissions to write file"
            android.util.Log.e(r5, r0)
            r6.add(r0)
            goto L_0x0524
        L_0x04aa:
            boolean r7 = de.ozerov.fully.P.B()
            if (r7 != 0) goto L_0x04c6
            de.ozerov.fully.FullyActivity r7 = r9.f3879b
            java.io.File r8 = new java.io.File
            r8.<init>(r4, r3)
            boolean r7 = n2.a.w0(r7, r8)
            if (r7 == 0) goto L_0x04c6
            java.lang.String r0 = "External storage is not writable"
            android.util.Log.e(r5, r0)
            r6.add(r0)
            goto L_0x0524
        L_0x04c6:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x04d9 }
            r7.<init>(r4, r3)     // Catch:{ Exception -> 0x04d9 }
            boolean r4 = r7.exists()     // Catch:{ Exception -> 0x04d9 }
            if (r4 == 0) goto L_0x04db
            java.lang.String r0 = r2.concat(r3)     // Catch:{ Exception -> 0x04d9 }
            r6.add(r0)     // Catch:{ Exception -> 0x04d9 }
            goto L_0x0524
        L_0x04d9:
            r0 = move-exception
            goto L_0x04f3
        L_0x04db:
            boolean r2 = r7.mkdirs()     // Catch:{ Exception -> 0x04d9 }
            if (r2 == 0) goto L_0x04eb
            java.util.ArrayList r0 = r9.f3894s     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r1 = r1.concat(r3)     // Catch:{ Exception -> 0x04d9 }
            r0.add(r1)     // Catch:{ Exception -> 0x04d9 }
            goto L_0x0524
        L_0x04eb:
            java.lang.String r0 = r0.concat(r3)     // Catch:{ Exception -> 0x04d9 }
            r6.add(r0)     // Catch:{ Exception -> 0x04d9 }
            goto L_0x0524
        L_0x04f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to create folder due to "
            r1.<init>(r2)
            java.lang.String r3 = r0.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r5, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.add(r0)
            goto L_0x0524
        L_0x051c:
            java.lang.String r0 = "Missing parameters"
            android.util.Log.e(r5, r0)
            r6.add(r0)
        L_0x0524:
            r0 = 0
            return r0
        L_0x0526:
            boolean r0 = r9.f3891p
            if (r0 == 0) goto L_0x062d
            java.lang.String r0 = r9.f3888m
            java.lang.String r1 = "copyFolder"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x053e
            java.lang.String r0 = r9.f3888m
            java.lang.String r1 = "copyFile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x062d
        L_0x053e:
            java.util.HashMap r0 = r9.f3884h
            java.lang.String r1 = "from"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x062d
            java.util.HashMap r0 = r9.f3884h
            java.lang.String r2 = "to"
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x062d
            de.ozerov.fully.FullyActivity r0 = r9.f3879b
            java.util.HashMap r3 = r9.f3884h
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = n2.a.F(r0, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            de.ozerov.fully.FullyActivity r0 = r9.f3879b
            java.util.HashMap r3 = r9.f3884h
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = n2.a.F(r0, r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            de.ozerov.fully.FullyActivity r0 = r9.f3879b
            boolean r0 = n2.a.h0(r0)
            java.lang.String r3 = r9.f3878a
            java.util.ArrayList r4 = r9.f3895t
            if (r0 != 0) goto L_0x0596
            de.ozerov.fully.FullyActivity r0 = r9.f3879b
            boolean r0 = n2.a.w0(r0, r2)
            if (r0 == 0) goto L_0x0596
            java.lang.String r0 = "Missing runtime permissions to write file"
            android.util.Log.e(r3, r0)
            r4.add(r0)
            goto L_0x062d
        L_0x0596:
            boolean r0 = de.ozerov.fully.P.B()
            if (r0 != 0) goto L_0x05ae
            de.ozerov.fully.FullyActivity r0 = r9.f3879b
            boolean r0 = n2.a.w0(r0, r2)
            if (r0 == 0) goto L_0x05ae
            java.lang.String r0 = "Storage is not writable"
            android.util.Log.e(r3, r0)
            r4.add(r0)
            goto L_0x062d
        L_0x05ae:
            boolean r0 = r1.exists()
            java.util.ArrayList r3 = r9.f3894s
            java.lang.String r5 = " Watch log for results."
            if (r0 == 0) goto L_0x05e5
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L_0x05e5
            java.lang.Thread r0 = new java.lang.Thread
            P5.d r4 = new P5.d
            r6 = 0
            r4.<init>(r9, r1, r2, r6)
            r0.<init>(r4)
            r0.start()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Going to copy folder in background "
            r0.<init>(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r3.add(r0)
            goto L_0x062d
        L_0x05e5:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0618
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x0618
            java.lang.Thread r0 = new java.lang.Thread
            P5.d r4 = new P5.d
            r6 = 1
            r4.<init>(r9, r1, r2, r6)
            r0.<init>(r4)
            r0.start()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Going to copy file in background "
            r0.<init>(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r3.add(r0)
            goto L_0x062d
        L_0x0618:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Not found "
            r0.<init>(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.add(r0)
        L_0x062d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0142e.a():P5.K");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.FileFilter, java.lang.Object] */
    public String d() {
        File file;
        File[] listFiles;
        switch (this.f3903w) {
            case 5:
                if (!this.f3891p) {
                    return C0138a.e("Please login");
                }
                if (this.f3884h.get("dir") != null && !((String) this.f3884h.get("dir")).isEmpty()) {
                    file = new File((String) this.f3884h.get("dir"));
                } else if (this.f3884h.get("filename") != null && !((String) this.f3884h.get("filename")).isEmpty()) {
                    file = new File((String) this.f3884h.get("filename")).getParentFile();
                } else if (a.g0(this.f3879b)) {
                    file = Environment.getExternalStorageDirectory();
                } else {
                    file = this.f3879b.getExternalFilesDir((String) null);
                }
                if (!a.g0(this.f3879b) && a.w0(this.f3879b, file)) {
                    return C0138a.e("Missing file read permissions on shared storage");
                }
                if (!P.C() && a.w0(this.f3879b, file)) {
                    return C0138a.e("Storage not readable");
                }
                ? obj = new Object();
                List<File> arrayList = new ArrayList<>();
                if (!(file == null || (listFiles = file.listFiles(obj)) == null)) {
                    arrayList = Arrays.asList(listFiles);
                }
                Collections.sort(arrayList, new C0051j0(2));
                JSONArray jSONArray = new JSONArray();
                for (File file2 : arrayList) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (!file2.isDirectory()) {
                            jSONObject.put("type", "file");
                            jSONObject.put("name", file2.getName());
                            jSONObject.put("size", file2.length());
                            jSONObject.put("lastModified", new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date(file2.lastModified())));
                        } else {
                            jSONObject.put("type", "dir");
                            jSONObject.put("name", file2.getName());
                            jSONObject.put("lastModified", new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date(file2.lastModified())));
                        }
                        jSONArray.put(jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                try {
                    return jSONArray.toString(2).replace("\\/", "/");
                } catch (Exception unused) {
                    return "";
                }
            default:
                return super.d();
        }
    }
}
