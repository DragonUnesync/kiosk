package R0;

import A1.d;
import H3.n0;
import P0.l;
import P0.z;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class p extends C0158c {

    /* renamed from: Y  reason: collision with root package name */
    public final int f4297Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f4298Z;

    /* renamed from: a0  reason: collision with root package name */
    public final d f4299a0;

    /* renamed from: b0  reason: collision with root package name */
    public final d f4300b0 = new d(29);

    /* renamed from: c0  reason: collision with root package name */
    public l f4301c0;

    /* renamed from: d0  reason: collision with root package name */
    public HttpURLConnection f4302d0;

    /* renamed from: e0  reason: collision with root package name */
    public InputStream f4303e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f4304f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f4305g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f4306h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f4307i0;

    public p(int i, int i8, d dVar) {
        super(true);
        this.f4297Y = i;
        this.f4298Z = i8;
        this.f4299a0 = dVar;
    }

    public final void close() {
        try {
            InputStream inputStream = this.f4303e0;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f4303e0 = null;
            l();
            if (this.f4304f0) {
                this.f4304f0 = false;
                e();
            }
            this.f4302d0 = null;
            this.f4301c0 = null;
        } catch (IOException e) {
            int i = z.f3748a;
            throw new t(2000, 3, e);
        } catch (Throwable th) {
            this.f4303e0 = null;
            l();
            if (this.f4304f0) {
                this.f4304f0 = false;
                e();
            }
            this.f4302d0 = null;
            this.f4301c0 = null;
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154 A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long f(R0.l r23) {
        /*
            r22 = this;
            r12 = r22
            r0 = r23
            r12.f4301c0 = r0
            r13 = 0
            r12.f4307i0 = r13
            r12.f4306h0 = r13
            r22.g()
            r15 = 1
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x01f5 }
            android.net.Uri r1 = r0.f4277a     // Catch:{ IOException -> 0x01f5 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x01f5 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x01f5 }
            int r1 = r0.f4283h     // Catch:{ IOException -> 0x01f5 }
            r1 = r1 & r15
            if (r1 != r15) goto L_0x0022
            r9 = 1
            goto L_0x0024
        L_0x0022:
            r1 = 0
            r9 = 0
        L_0x0024:
            java.util.Map r11 = r0.f4280d     // Catch:{ IOException -> 0x01f5 }
            int r3 = r0.f4278b     // Catch:{ IOException -> 0x01f5 }
            byte[] r4 = r0.f4279c     // Catch:{ IOException -> 0x01f5 }
            long r5 = r0.e     // Catch:{ IOException -> 0x01f5 }
            long r7 = r0.f4281f     // Catch:{ IOException -> 0x01f5 }
            r10 = 1
            r1 = r22
            java.net.HttpURLConnection r1 = r1.q(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ IOException -> 0x01f5 }
            r12.f4302d0 = r1     // Catch:{ IOException -> 0x01f5 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x01f5 }
            r12.f4305g0 = r2     // Catch:{ IOException -> 0x01f5 }
            r1.getResponseMessage()     // Catch:{ IOException -> 0x01f5 }
            int r2 = r12.f4305g0
            java.lang.String r3 = "Content-Range"
            r4 = 200(0xc8, float:2.8E-43)
            r5 = -1
            long r7 = r0.e
            long r9 = r0.f4281f
            if (r2 < r4) goto L_0x0052
            r11 = 299(0x12b, float:4.19E-43)
            if (r2 <= r11) goto L_0x0056
        L_0x0052:
            r20 = r1
            goto L_0x0189
        L_0x0056:
            r1.getContentType()
            int r2 = r12.f4305g0
            if (r2 != r4) goto L_0x0062
            int r2 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r7 = r13
        L_0x0063:
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r2 = r1.getHeaderField(r2)
            java.lang.String r4 = "gzip"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0144
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x007d
            r12.f4306h0 = r9
            r20 = r1
            r16 = r7
            goto L_0x014a
        L_0x007d:
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r1.getHeaderField(r4)
            java.lang.String r3 = r1.getHeaderField(r3)
            java.util.regex.Pattern r9 = R0.w.f4314a
            java.lang.String r9 = "Inconsistent headers ["
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r11 = "]"
            java.lang.String r5 = "HttpUtil"
            if (r10 != 0) goto L_0x00b0
            long r16 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x009c }
            r18 = r16
            goto L_0x00b2
        L_0x009c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "Unexpected Content-Length ["
            r6.<init>(r10)
            r6.append(r4)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            P0.l.o(r5, r6)
        L_0x00b0:
            r18 = -1
        L_0x00b2:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x012f
            java.util.regex.Pattern r6 = R0.w.f4314a
            java.util.regex.Matcher r6 = r6.matcher(r3)
            boolean r10 = r6.matches()
            if (r10 == 0) goto L_0x012f
            r10 = 2
            java.lang.String r10 = r6.group(r10)     // Catch:{ NumberFormatException -> 0x0114 }
            r10.getClass()     // Catch:{ NumberFormatException -> 0x0114 }
            long r16 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x0114 }
            java.lang.String r6 = r6.group(r15)     // Catch:{ NumberFormatException -> 0x0114 }
            r6.getClass()     // Catch:{ NumberFormatException -> 0x0114 }
            long r20 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0114 }
            long r16 = r16 - r20
            r20 = 1
            r6 = r1
            long r0 = r16 + r20
            r20 = r6
            r16 = r7
            r6 = r18
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ef
            r18 = r0
            goto L_0x0111
        L_0x00ef:
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0135
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x011a }
            r8.<init>(r9)     // Catch:{ NumberFormatException -> 0x011a }
            r8.append(r4)     // Catch:{ NumberFormatException -> 0x011a }
            java.lang.String r4 = "] ["
            r8.append(r4)     // Catch:{ NumberFormatException -> 0x011a }
            r8.append(r3)     // Catch:{ NumberFormatException -> 0x011a }
            r8.append(r11)     // Catch:{ NumberFormatException -> 0x011a }
            java.lang.String r4 = r8.toString()     // Catch:{ NumberFormatException -> 0x011a }
            P0.l.B(r5, r4)     // Catch:{ NumberFormatException -> 0x011a }
            long r18 = java.lang.Math.max(r6, r0)     // Catch:{ NumberFormatException -> 0x011a }
        L_0x0111:
            r0 = -1
            goto L_0x0138
        L_0x0114:
            r20 = r1
            r16 = r7
            r6 = r18
        L_0x011a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.<init>(r1)
            r0.append(r3)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            P0.l.o(r5, r0)
            goto L_0x0135
        L_0x012f:
            r20 = r1
            r16 = r7
            r6 = r18
        L_0x0135:
            r18 = r6
            goto L_0x0111
        L_0x0138:
            int r3 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x013f
            long r5 = r18 - r16
            goto L_0x0141
        L_0x013f:
            r5 = -1
        L_0x0141:
            r12.f4306h0 = r5
            goto L_0x014a
        L_0x0144:
            r20 = r1
            r16 = r7
            r12.f4306h0 = r9
        L_0x014a:
            r1 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r20.getInputStream()     // Catch:{ IOException -> 0x015e }
            r12.f4303e0 = r0     // Catch:{ IOException -> 0x015e }
            if (r2 == 0) goto L_0x0160
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x015e }
            java.io.InputStream r2 = r12.f4303e0     // Catch:{ IOException -> 0x015e }
            r0.<init>(r2)     // Catch:{ IOException -> 0x015e }
            r12.f4303e0 = r0     // Catch:{ IOException -> 0x015e }
            goto L_0x0160
        L_0x015e:
            r0 = move-exception
            goto L_0x0180
        L_0x0160:
            r12.f4304f0 = r15
            r22.h(r23)
            r7 = r16
            r12.t(r7)     // Catch:{ IOException -> 0x016d }
            long r0 = r12.f4306h0
            return r0
        L_0x016d:
            r0 = move-exception
            r2 = r0
            r22.l()
            boolean r0 = r2 instanceof R0.t
            if (r0 == 0) goto L_0x017a
            r0 = r2
            R0.t r0 = (R0.t) r0
            throw r0
        L_0x017a:
            R0.t r0 = new R0.t
            r0.<init>((int) r1, (int) r15, (java.io.IOException) r2)
            throw r0
        L_0x0180:
            r22.l()
            R0.t r2 = new R0.t
            r2.<init>((int) r1, (int) r15, (java.io.IOException) r0)
            throw r2
        L_0x0189:
            java.util.Map r0 = r20.getHeaderFields()
            int r1 = r12.f4305g0
            r2 = 416(0x1a0, float:5.83E-43)
            if (r1 != r2) goto L_0x01cc
            r1 = r20
            java.lang.String r3 = r1.getHeaderField(r3)
            java.util.regex.Pattern r4 = R0.w.f4314a
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x01a4
        L_0x01a1:
            r3 = -1
            goto L_0x01bb
        L_0x01a4:
            java.util.regex.Pattern r4 = R0.w.f4315b
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.matches()
            if (r4 == 0) goto L_0x01a1
            java.lang.String r3 = r3.group(r15)
            r3.getClass()
            long r3 = java.lang.Long.parseLong(r3)
        L_0x01bb:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x01ce
            r12.f4304f0 = r15
            r22.h(r23)
            r0 = -1
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01cb
            r13 = r9
        L_0x01cb:
            return r13
        L_0x01cc:
            r1 = r20
        L_0x01ce:
            java.io.InputStream r1 = r1.getErrorStream()
            if (r1 == 0) goto L_0x01d8
            I3.b.b(r1)     // Catch:{ IOException -> 0x01db }
            goto L_0x01dd
        L_0x01d8:
            int r1 = P0.z.f3748a     // Catch:{ IOException -> 0x01db }
            goto L_0x01dd
        L_0x01db:
            int r1 = P0.z.f3748a
        L_0x01dd:
            r22.l()
            int r1 = r12.f4305g0
            if (r1 != r2) goto L_0x01ec
            R0.i r1 = new R0.i
            r2 = 2008(0x7d8, float:2.814E-42)
            r1.<init>(r2)
            goto L_0x01ed
        L_0x01ec:
            r1 = 0
        L_0x01ed:
            R0.v r2 = new R0.v
            int r3 = r12.f4305g0
            r2.<init>(r3, r1, r0)
            throw r2
        L_0x01f5:
            r0 = move-exception
            r22.l()
            R0.t r0 = R0.t.b(r15, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.p.f(R0.l):long");
    }

    public final Map j() {
        HttpURLConnection httpURLConnection = this.f4302d0;
        if (httpURLConnection == null) {
            return n0.f2094a0;
        }
        return new o(httpURLConnection.getHeaderFields());
    }

    public final void l() {
        HttpURLConnection httpURLConnection = this.f4302d0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                l.p("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final Uri p() {
        HttpURLConnection httpURLConnection = this.f4302d0;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        l lVar = this.f4301c0;
        if (lVar != null) {
            return lVar.f4277a;
        }
        return null;
    }

    public final HttpURLConnection q(URL url, int i, byte[] bArr, long j7, long j8, boolean z, boolean z6, Map map) {
        String str;
        String str2;
        boolean z8;
        String str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f4297Y);
        httpURLConnection.setReadTimeout(this.f4298Z);
        HashMap hashMap = new HashMap();
        d dVar = this.f4299a0;
        if (dVar != null) {
            hashMap.putAll(dVar.C());
        }
        hashMap.putAll(this.f4300b0.C());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = w.f4314a;
        if (j7 == 0 && j8 == -1) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j7);
            sb.append("-");
            if (j8 != -1) {
                sb.append((j7 + j8) - 1);
            }
            str = sb.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("Range", str);
        }
        if (z) {
            str2 = "gzip";
        } else {
            str2 = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str2);
        httpURLConnection.setInstanceFollowRedirects(z6);
        if (bArr != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        httpURLConnection.setDoOutput(z8);
        int i8 = l.i;
        if (i == 1) {
            str3 = "GET";
        } else if (i == 2) {
            str3 = "POST";
        } else if (i == 3) {
            str3 = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        httpURLConnection.setRequestMethod(str3);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void t(long j7) {
        if (j7 != 0) {
            byte[] bArr = new byte[4096];
            while (j7 > 0) {
                int min = (int) Math.min(j7, (long) 4096);
                InputStream inputStream = this.f4303e0;
                int i = z.f3748a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new t(2000, 1, (IOException) new InterruptedIOException());
                } else if (read != -1) {
                    j7 -= (long) read;
                    b(read);
                } else {
                    throw new t();
                }
            }
        }
    }

    public final int x(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j7 = this.f4306h0;
            if (j7 != -1) {
                long j8 = j7 - this.f4307i0;
                if (j8 != 0) {
                    i8 = (int) Math.min((long) i8, j8);
                }
                return -1;
            }
            InputStream inputStream = this.f4303e0;
            int i9 = z.f3748a;
            int read = inputStream.read(bArr, i, i8);
            if (read == -1) {
                return -1;
            }
            this.f4307i0 += (long) read;
            b(read);
            return read;
        } catch (IOException e) {
            int i10 = z.f3748a;
            throw t.b(2, e);
        }
    }
}
