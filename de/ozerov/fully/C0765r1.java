package de.ozerov.fully;

import android.content.Context;
import android.os.AsyncTask;
import d4.k;
import java.lang.ref.WeakReference;

/* renamed from: de.ozerov.fully.r1  reason: case insensitive filesystem */
public abstract class C0765r1 extends AsyncTask {

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f10910c;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference f10911a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10912b = false;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077 A[Catch:{ Exception -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082 A[Catch:{ Exception -> 0x007f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long a() {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r0 = ""
            java.lang.String r2 = "application/zip"
            java.lang.String r3 = "loadContentZipFileLastUrl"
            java.lang.String r4 = "contentZipFileLastModified"
            java.lang.String r5 = "LoadContentZipFileTask"
            java.lang.String r6 = "File download failed for "
            java.lang.String r7 = "File download and unzip completed for "
            java.lang.String r8 = "Downloading "
            java.lang.String r9 = "URL not found or not ZIP file "
            java.lang.String r10 = "Failed getting Last-Modified for url "
            java.lang.String r11 = "Invalid URL "
            java.lang.ref.WeakReference r15 = r1.f10911a     // Catch:{ Exception -> 0x007f }
            java.lang.Object r15 = r15.get()     // Catch:{ Exception -> 0x007f }
            android.content.Context r15 = (android.content.Context) r15     // Catch:{ Exception -> 0x007f }
            if (r15 == 0) goto L_0x01ab
            d4.k r14 = new d4.k     // Catch:{ Exception -> 0x007f }
            r12 = 1
            r14.<init>((android.content.Context) r15, (int) r12)     // Catch:{ Exception -> 0x007f }
            java.lang.Object r12 = r14.f9767W     // Catch:{ Exception -> 0x007f }
            Z1.c r12 = (Z1.c) r12     // Catch:{ Exception -> 0x007f }
            java.lang.String r13 = "loadContentZipFileUrl"
            java.lang.String r13 = r12.r(r13, r0)     // Catch:{ Exception -> 0x007f }
            r18 = r6
            java.lang.String r6 = "$hostname"
            boolean r6 = r13.contains(r6)     // Catch:{ Exception -> 0x007f }
            r13 = 1
            if (r6 == 0) goto L_0x004a
            java.lang.String r6 = de.ozerov.fully.C0794w0.z(r13)     // Catch:{ Exception -> 0x007f }
            de.ozerov.fully.C0794w0.f11024j = r6     // Catch:{ Exception -> 0x007f }
            r6 = 0
            java.lang.String r19 = de.ozerov.fully.C0794w0.z(r6)     // Catch:{ Exception -> 0x007f }
            de.ozerov.fully.C0794w0.f11025k = r19     // Catch:{ Exception -> 0x007f }
        L_0x004a:
            java.lang.String r6 = r14.h1()     // Catch:{ Exception -> 0x007f }
            r12.getClass()     // Catch:{ Exception -> 0x007f }
            java.lang.Object r13 = r12.f6955V     // Catch:{ Exception -> 0x0062 }
            android.content.SharedPreferences r13 = (android.content.SharedPreferences) r13     // Catch:{ Exception -> 0x0062 }
            r25 = r7
            r26 = r8
            r7 = -1
            long r19 = r13.getLong(r4, r7)     // Catch:{ Exception -> 0x0066 }
            r7 = r19
            goto L_0x0068
        L_0x0062:
            r25 = r7
            r26 = r8
        L_0x0066:
            r7 = -1
        L_0x0068:
            java.lang.String r0 = r12.r(r3, r0)     // Catch:{ Exception -> 0x007f }
            r12 = 0
            java.io.File r12 = n2.a.c0(r15, r12)     // Catch:{ Exception -> 0x007f }
            boolean r13 = de.ozerov.fully.P.I(r6)     // Catch:{ Exception -> 0x007f }
            if (r13 != 0) goto L_0x0082
            java.lang.String r0 = r11.concat(r6)     // Catch:{ Exception -> 0x007f }
            android.util.Log.w(r5, r0)     // Catch:{ Exception -> 0x007f }
            goto L_0x00a5
        L_0x007f:
            r0 = move-exception
            goto L_0x01b3
        L_0x0082:
            boolean r11 = n2.a.w0(r15, r12)     // Catch:{ Exception -> 0x007f }
            if (r11 == 0) goto L_0x0094
            boolean r11 = n2.a.h0(r15)     // Catch:{ Exception -> 0x007f }
            if (r11 != 0) goto L_0x0094
            java.lang.String r0 = "Missing runtime permissions to write files"
            android.util.Log.e(r5, r0)     // Catch:{ Exception -> 0x007f }
            goto L_0x00a5
        L_0x0094:
            boolean r11 = n2.a.w0(r15, r12)     // Catch:{ Exception -> 0x007f }
            if (r11 == 0) goto L_0x00a9
            boolean r11 = de.ozerov.fully.P.B()     // Catch:{ Exception -> 0x007f }
            if (r11 != 0) goto L_0x00a9
            java.lang.String r0 = "External storage is not writable"
            android.util.Log.e(r5, r0)     // Catch:{ Exception -> 0x007f }
        L_0x00a5:
            r3 = -1
            goto L_0x0176
        L_0x00a9:
            r23 = 0
            r24 = 0
            r21 = 0
            r22 = 0
            r20 = 0
            r19 = r6
            de.ozerov.fully.x2 r11 = de.ozerov.fully.C0808y2.a(r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x007f }
            int r13 = r11.f11070b     // Catch:{ Exception -> 0x007f }
            r19 = r3
            r3 = 200(0xc8, float:2.8E-43)
            if (r13 == r3) goto L_0x00c7
            r13 = r4
            r3 = -1
        L_0x00c4:
            r16 = -1
            goto L_0x00cb
        L_0x00c7:
            r13 = r4
            long r3 = r11.i     // Catch:{ Exception -> 0x007f }
            goto L_0x00c4
        L_0x00cb:
            int r11 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x00dc
            java.lang.String r0 = r10.concat(r6)     // Catch:{ Exception -> 0x007f }
            android.util.Log.w(r5, r0)     // Catch:{ Exception -> 0x007f }
            r2 = 1
            de.ozerov.fully.C0794w0.q0(r2, r5, r0)     // Catch:{ Exception -> 0x007f }
            goto L_0x0176
        L_0x00dc:
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x007f }
            if (r0 == 0) goto L_0x00e8
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00e8
            goto L_0x0176
        L_0x00e8:
            java.lang.String r0 = de.ozerov.fully.C0808y2.f(r6)     // Catch:{ Exception -> 0x007f }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x007f }
            if (r0 != 0) goto L_0x010e
            android.net.Uri r0 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = de.ozerov.fully.C0808y2.e(r15, r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r7 = "zip"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x007f }
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = r9.concat(r6)     // Catch:{ Exception -> 0x007f }
            android.util.Log.w(r5, r0)     // Catch:{ Exception -> 0x007f }
            r2 = 1
            de.ozerov.fully.C0794w0.q0(r2, r5, r0)     // Catch:{ Exception -> 0x007f }
            goto L_0x00a5
        L_0x010e:
            boolean r0 = r1.f10912b     // Catch:{ Exception -> 0x007f }
            if (r0 == 0) goto L_0x011b
            r0 = r26
            java.lang.String r0 = r0.concat(r6)     // Catch:{ Exception -> 0x007f }
            n2.a.b1(r15, r0)     // Catch:{ Exception -> 0x007f }
        L_0x011b:
            de.ozerov.fully.x2 r0 = de.ozerov.fully.C0808y2.b(r15, r12, r6)     // Catch:{ Exception -> 0x007f }
            int r7 = r0.f11070b     // Catch:{ Exception -> 0x007f }
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 != r8) goto L_0x017b
            java.lang.String r7 = r0.e     // Catch:{ Exception -> 0x007f }
            boolean r2 = r7.equals(r2)     // Catch:{ Exception -> 0x007f }
            if (r2 != 0) goto L_0x013b
            java.lang.String r2 = r0.f11071c     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x007f }
            java.lang.String r7 = ".zip"
            boolean r2 = r2.endsWith(r7)     // Catch:{ Exception -> 0x007f }
            if (r2 == 0) goto L_0x017b
        L_0x013b:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = r0.f11071c     // Catch:{ Exception -> 0x007f }
            r2.<init>(r12, r0)     // Catch:{ Exception -> 0x007f }
            n2.a.i1(r2, r12)     // Catch:{ Exception -> 0x0167 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0167 }
            r7 = r25
            r0.<init>(r7)     // Catch:{ Exception -> 0x0167 }
            r0.append(r6)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r7 = " to "
            r0.append(r7)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r7 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0167 }
            r0.append(r7)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0167 }
            android.util.Log.i(r5, r0)     // Catch:{ Exception -> 0x0167 }
            r7 = 0
            de.ozerov.fully.C0794w0.q0(r7, r5, r0)     // Catch:{ Exception -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x007f }
        L_0x016b:
            r2.delete()     // Catch:{ Exception -> 0x007f }
            r14.U2(r13, r3)     // Catch:{ Exception -> 0x007f }
            r2 = r19
            r14.V2(r2, r6)     // Catch:{ Exception -> 0x007f }
        L_0x0176:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x007f }
            return r0
        L_0x017b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007f }
            r3 = r18
            r2.<init>(r3)     // Catch:{ Exception -> 0x007f }
            r2.append(r6)     // Catch:{ Exception -> 0x007f }
            java.lang.String r3 = " as "
            r2.append(r3)     // Catch:{ Exception -> 0x007f }
            int r3 = r0.f11070b     // Catch:{ Exception -> 0x007f }
            r2.append(r3)     // Catch:{ Exception -> 0x007f }
            java.lang.String r3 = " "
            r2.append(r3)     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = r0.f11074g     // Catch:{ Exception -> 0x007f }
            r2.append(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x007f }
            android.util.Log.e(r5, r0)     // Catch:{ Exception -> 0x007f }
            r2 = 2
            de.ozerov.fully.C0794w0.q0(r2, r5, r0)     // Catch:{ Exception -> 0x007f }
            r2 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x007f }
            return r0
        L_0x01ab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = "LoadContentZipFileTask lost context"
            r0.<init>(r2)     // Catch:{ Exception -> 0x007f }
            throw r0     // Catch:{ Exception -> 0x007f }
        L_0x01b3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "File download task failed due to "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r5, r0)
            r2 = 2
            de.ozerov.fully.C0794w0.q0(r2, r5, r0)
            r2 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0765r1.a():java.lang.Long");
    }

    public void b(Long l8) {
        Context context;
        if (!(l8.longValue() == -1 || (context = (Context) this.f10911a.get()) == null)) {
            new k(context, 1);
        }
        f10910c = false;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return a();
    }

    public final void onPreExecute() {
        f10910c = true;
    }
}
