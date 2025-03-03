package P5;

import A1.d;
import j$.nio.channels.DesugarChannels;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import u.C1477r;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final d f3813a;

    /* renamed from: b  reason: collision with root package name */
    public final OutputStream f3814b;

    /* renamed from: c  reason: collision with root package name */
    public final BufferedInputStream f3815c;

    /* renamed from: d  reason: collision with root package name */
    public int f3816d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public String f3817f;

    /* renamed from: g  reason: collision with root package name */
    public int f3818g;

    /* renamed from: h  reason: collision with root package name */
    public HashMap f3819h;
    public HashMap i;

    /* renamed from: j  reason: collision with root package name */
    public D f3820j;

    /* renamed from: k  reason: collision with root package name */
    public volatile String f3821k;

    /* renamed from: l  reason: collision with root package name */
    public final String f3822l;

    /* renamed from: m  reason: collision with root package name */
    public final String f3823m;

    /* renamed from: n  reason: collision with root package name */
    public String f3824n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ P f3825o;

    public G(P p3, d dVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        String str2;
        this.f3825o = p3;
        this.f3813a = dVar;
        this.f3815c = new BufferedInputStream(inputStream, 8192);
        this.f3814b = outputStream;
        if (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) {
            str = "127.0.0.1";
        } else {
            str = inetAddress.getHostAddress().toString();
        }
        this.f3822l = str;
        if (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) {
            str2 = "localhost";
        } else {
            str2 = inetAddress.toString();
        }
        this.f3823m = str2;
        this.i = new HashMap();
    }

    public static int e(int i8, byte[] bArr) {
        int i9;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= i8) {
                return 0;
            }
            byte b8 = bArr[i10];
            if (b8 == 13 && bArr[i11] == 10 && (i9 = i10 + 3) < i8 && bArr[i10 + 2] == 13 && bArr[i9] == 10) {
                return i10 + 4;
            }
            if (b8 == 10 && bArr[i11] == 10) {
                return i10 + 2;
            }
            i10 = i11;
        }
    }

    public static int[] f(ByteBuffer byteBuffer, byte[] bArr) {
        int i8;
        int[] iArr = new int[0];
        if (byteBuffer.remaining() < bArr.length) {
            return iArr;
        }
        int length = bArr.length + 4096;
        byte[] bArr2 = new byte[length];
        if (byteBuffer.remaining() < length) {
            i8 = byteBuffer.remaining();
        } else {
            i8 = length;
        }
        byteBuffer.get(bArr2, 0, i8);
        int length2 = i8 - bArr.length;
        int i9 = 0;
        do {
            int i10 = 0;
            while (i10 < length2) {
                int i11 = 0;
                while (i11 < bArr.length && bArr2[i10 + i11] == bArr[i11]) {
                    if (i11 == bArr.length - 1) {
                        int[] iArr2 = new int[(iArr.length + 1)];
                        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                        iArr2[iArr.length] = i9 + i10;
                        iArr = iArr2;
                    }
                    i11++;
                }
                i10++;
            }
            i9 += length2;
            System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
            length2 = length - bArr.length;
            if (byteBuffer.remaining() < length2) {
                length2 = byteBuffer.remaining();
            }
            byteBuffer.get(bArr2, bArr.length, length2);
        } while (length2 > 0);
        return iArr;
    }

    public final void a(BufferedReader bufferedReader, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        String str;
        try {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                boolean hasMoreTokens = stringTokenizer.hasMoreTokens();
                J j7 = J.BAD_REQUEST;
                if (hasMoreTokens) {
                    hashMap.put("method", stringTokenizer.nextToken());
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken = stringTokenizer.nextToken();
                        int indexOf = nextToken.indexOf(63);
                        if (indexOf >= 0) {
                            c(nextToken.substring(indexOf + 1), hashMap2);
                            str = P.b(nextToken.substring(0, indexOf));
                        } else {
                            c((String) null, hashMap2);
                            str = P.b(nextToken);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            this.f3824n = stringTokenizer.nextToken();
                        } else {
                            this.f3824n = "HTTP/1.1";
                            P.f3856p.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                        }
                        String readLine2 = bufferedReader.readLine();
                        while (readLine2 != null && !readLine2.trim().isEmpty()) {
                            int indexOf2 = readLine2.indexOf(58);
                            if (indexOf2 >= 0) {
                                hashMap3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                            }
                            readLine2 = bufferedReader.readLine();
                        }
                        hashMap.put("uri", str);
                        return;
                    }
                    throw new L(j7, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                throw new L(j7, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
        } catch (IOException e8) {
            throw new L("SERVER INTERNAL ERROR: IOException: " + e8.getMessage(), e8);
        }
    }

    public final void b(B b8, ByteBuffer byteBuffer, HashMap hashMap, HashMap hashMap2) {
        int i8;
        String str;
        Matcher matcher;
        ByteBuffer byteBuffer2 = byteBuffer;
        HashMap hashMap3 = hashMap;
        HashMap hashMap4 = hashMap2;
        String str2 = b8.f3803d;
        J j7 = J.INTERNAL_ERROR;
        try {
            int[] f8 = f(byteBuffer2, str2.getBytes());
            int length = f8.length;
            J j8 = J.BAD_REQUEST;
            if (length >= 2) {
                int i9 = 1024;
                byte[] bArr = new byte[1024];
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i11 < f8.length - 1) {
                    byteBuffer2.position(f8[i11]);
                    if (byteBuffer.remaining() < i9) {
                        i8 = byteBuffer.remaining();
                    } else {
                        i8 = 1024;
                    }
                    byteBuffer2.get(bArr, i10, i8);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i10, i8), Charset.forName(b8.a())), i8);
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || !readLine.contains(str2)) {
                        throw new L(j8, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                    }
                    String readLine2 = bufferedReader.readLine();
                    String str3 = null;
                    String str4 = null;
                    int i13 = i12;
                    int i14 = 2;
                    String str5 = null;
                    while (readLine2 != null && readLine2.trim().length() > 0) {
                        Matcher matcher2 = P.f3853m.matcher(readLine2);
                        if (matcher2.matches()) {
                            str = str2;
                            Matcher matcher3 = P.f3855o.matcher(matcher2.group(2));
                            while (matcher3.find()) {
                                String str6 = str5;
                                String group = matcher3.group(1);
                                if ("name".equalsIgnoreCase(group)) {
                                    str3 = matcher3.group(2);
                                } else if ("filename".equalsIgnoreCase(group)) {
                                    str5 = matcher3.group(2);
                                    if (str5.isEmpty()) {
                                        matcher = matcher3;
                                    } else if (i13 > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str3);
                                        matcher = matcher3;
                                        sb.append(String.valueOf(i13));
                                        i13++;
                                        str3 = sb.toString();
                                    } else {
                                        matcher = matcher3;
                                        i13++;
                                    }
                                    matcher3 = matcher;
                                }
                                matcher = matcher3;
                                str5 = str6;
                                matcher3 = matcher;
                            }
                            String str7 = str5;
                        } else {
                            str = str2;
                        }
                        Matcher matcher4 = P.f3854n.matcher(readLine2);
                        if (matcher4.matches()) {
                            str4 = matcher4.group(2).trim();
                        }
                        readLine2 = bufferedReader.readLine();
                        i14++;
                        B b9 = b8;
                        str2 = str;
                    }
                    String str8 = str2;
                    int i15 = 0;
                    while (true) {
                        int i16 = i14 - 1;
                        if (i14 <= 0) {
                            break;
                        }
                        while (bArr[i15] != 10) {
                            i15++;
                        }
                        i15++;
                        i14 = i16;
                    }
                    if (i15 < i8 - 4) {
                        int i17 = f8[i11] + i15;
                        i11++;
                        int i18 = f8[i11] - 4;
                        byteBuffer2.position(i17);
                        List list = (List) hashMap3.get(str3);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap3.put(str3, list);
                        }
                        if (str4 == null) {
                            byte[] bArr2 = new byte[(i18 - i17)];
                            byteBuffer2.get(bArr2);
                            list.add(new String(bArr2, b8.a()));
                        } else {
                            try {
                                String i19 = i(byteBuffer2, i17, i18 - i17);
                                if (!hashMap4.containsKey(str3)) {
                                    hashMap4.put(str3, i19);
                                } else {
                                    int i20 = 2;
                                    while (true) {
                                        if (!hashMap4.containsKey(str3 + i20)) {
                                            break;
                                        }
                                        i20++;
                                    }
                                    hashMap4.put(str3 + i20, i19);
                                }
                                list.add(str5);
                            } catch (L e8) {
                                e = e8;
                                throw e;
                            } catch (Exception e9) {
                                e = e9;
                                throw new L(j7, e.toString());
                            }
                        }
                        B b10 = b8;
                        i12 = i13;
                        str2 = str8;
                        i9 = 1024;
                        i10 = 0;
                    } else {
                        throw new L(j7, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                }
                return;
            }
            throw new L(j8, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
        } catch (L e10) {
            e = e10;
            throw e;
        } catch (Exception e11) {
            e = e11;
            throw new L(j7, e.toString());
        }
    }

    public final void c(String str, HashMap hashMap) {
        String str2;
        String str3;
        if (str == null) {
            this.f3821k = "";
            return;
        }
        this.f3821k = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf >= 0) {
                str3 = P.b(nextToken.substring(0, indexOf)).trim();
                str2 = P.b(nextToken.substring(indexOf + 1));
            } else {
                str3 = P.b(nextToken).trim();
                str2 = "";
            }
            List list = (List) hashMap.get(str3);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(str3, list);
            }
            list.add(str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        P5.P.h(r0.a(), "text/plain", r0.getMessage()).o(r6);
        P5.P.i(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040, SSLException -> 0x016a, IOException -> 0x015e, L -> 0x0040, all -> 0x003d }, ExcHandler: L (r0v5 'e' P5.L A[CUSTOM_DECLARE, Catch:{  }]), PHI: r8 
      PHI: (r8v4 P5.K) = (r8v0 P5.K), (r8v0 P5.K), (r8v0 P5.K), (r8v0 P5.K), (r8v0 P5.K), (r8v5 P5.K), (r8v0 P5.K), (r8v0 P5.K) binds: [B:1:0x0011, B:2:?, B:4:0x001a, B:5:?, B:6:0x001d, B:60:0x0128, B:38:0x0095, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r14 = this;
            P5.J r0 = P5.J.INTERNAL_ERROR
            java.lang.String r1 = "method"
            java.lang.String r2 = "text/plain"
            P5.P r3 = r14.f3825o
            java.lang.String r4 = "NanoHttpd Shutdown"
            A1.d r5 = r14.f3813a
            java.io.OutputStream r6 = r14.f3814b
            r7 = 8192(0x2000, float:1.14794E-41)
            r8 = 0
            byte[] r9 = new byte[r7]     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r10 = 0
            r14.f3816d = r10     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r14.e = r10     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.io.BufferedInputStream r11 = r14.f3815c
            r11.mark(r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            int r7 = r11.read(r9, r10, r7)     // Catch:{ SSLException -> 0x016a, IOException -> 0x015e, L -> 0x0040 }
            r12 = -1
            if (r7 == r12) goto L_0x0152
        L_0x0024:
            if (r7 <= 0) goto L_0x004f
            int r12 = r14.e     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            int r12 = r12 + r7
            r14.e = r12     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            int r7 = e(r12, r9)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r14.f3816d = r7     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            if (r7 <= 0) goto L_0x0034
            goto L_0x004f
        L_0x0034:
            int r7 = r14.e     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            int r12 = 8192 - r7
            int r7 = r11.read(r9, r7, r12)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            goto L_0x0024
        L_0x003d:
            r0 = move-exception
            goto L_0x01c3
        L_0x0040:
            r0 = move-exception
            goto L_0x016c
        L_0x0043:
            r1 = move-exception
            goto L_0x017f
        L_0x0046:
            r1 = move-exception
            goto L_0x019f
        L_0x0049:
            r0 = move-exception
            goto L_0x01c1
        L_0x004c:
            r0 = move-exception
            goto L_0x01c2
        L_0x004f:
            int r7 = r14.f3816d     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            int r12 = r14.e     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            if (r7 >= r12) goto L_0x005e
            r11.reset()     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            int r7 = r14.f3816d     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            long r12 = (long) r7     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r11.skip(r12)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
        L_0x005e:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r7.<init>()     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r14.f3819h = r7     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.util.HashMap r7 = r14.i     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            if (r7 != 0) goto L_0x0071
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r7.<init>()     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r14.i = r7     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            goto L_0x0074
        L_0x0071:
            r7.clear()     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
        L_0x0074:
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.io.ByteArrayInputStream r12 = new java.io.ByteArrayInputStream     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            int r13 = r14.e     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r12.<init>(r9, r10, r13)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r11.<init>(r12)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r7.<init>(r11)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r9.<init>()     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.util.HashMap r11 = r14.f3819h     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.util.HashMap r12 = r14.i     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r14.a(r7, r9, r11, r12)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r7 = r14.f3822l
            if (r7 == 0) goto L_0x00a3
            java.util.HashMap r11 = r14.i     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r12 = "remote-addr"
            r11.put(r12, r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.util.HashMap r11 = r14.i     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r12 = "http-client-ip"
            r11.put(r12, r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
        L_0x00a3:
            java.lang.Object r7 = r9.get(r1)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            int r7 = N.e.s(r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r14.f3818g = r7     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            if (r7 == 0) goto L_0x012e
            java.lang.String r1 = "uri"
            java.lang.Object r1 = r9.get(r1)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r14.f3817f = r1     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            P5.D r1 = new P5.D     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.util.HashMap r7 = r14.i     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r1.<init>(r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r14.f3820j = r1     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.util.HashMap r1 = r14.i     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r7 = "connection"
            java.lang.Object r1 = r1.get(r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r7 = "HTTP/1.1"
            java.lang.String r9 = r14.f3824n     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            boolean r7 = r7.equals(r9)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r9 = 1
            if (r7 == 0) goto L_0x00e5
            if (r1 == 0) goto L_0x00e3
            java.lang.String r7 = "(?i).*close.*"
            boolean r1 = r1.matches(r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            if (r1 != 0) goto L_0x00e5
        L_0x00e3:
            r1 = 1
            goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            P5.K r8 = r3.l(r14)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.util.HashMap r3 = r14.i     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r7 = "accept-encoding"
            java.lang.Object r3 = r3.get(r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            P5.D r7 = r14.f3820j     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r7.c(r8)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            int r7 = r14.f3818g     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r8.t(r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            boolean r7 = P5.P.r(r8)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            if (r7 == 0) goto L_0x010f
            if (r3 == 0) goto L_0x010f
            java.lang.String r7 = "gzip"
            boolean r3 = r3.contains(r7)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            if (r3 == 0) goto L_0x010f
            r10 = 1
        L_0x010f:
            r8.r(r10)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r8.s(r1)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r8.o(r6)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            if (r1 == 0) goto L_0x0128
            boolean r1 = r8.m()     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            if (r1 != 0) goto L_0x0128
        L_0x0120:
            P5.P.i(r8)
            r5.l()
            goto L_0x01c0
        L_0x0128:
            java.net.SocketException r1 = new java.net.SocketException     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r1.<init>(r4)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            throw r1     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
        L_0x012e:
            P5.L r3 = new P5.L     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            P5.J r4 = P5.J.BAD_REQUEST     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r7.<init>()     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r10 = "BAD REQUEST: Syntax error. HTTP verb "
            r7.append(r10)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.Object r1 = r9.get(r1)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r7.append(r1)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r1 = " unhandled."
            r7.append(r1)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.lang.String r1 = r7.toString()     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r3.<init>((P5.J) r4, (java.lang.String) r1)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            throw r3     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
        L_0x0152:
            P5.P.i(r11)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            P5.P.i(r6)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.net.SocketException r1 = new java.net.SocketException     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r1.<init>(r4)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            throw r1     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
        L_0x015e:
            P5.P.i(r11)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            P5.P.i(r6)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            java.net.SocketException r1 = new java.net.SocketException     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            r1.<init>(r4)     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
            throw r1     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
        L_0x016a:
            r1 = move-exception
            throw r1     // Catch:{ SocketException -> 0x004c, SocketTimeoutException -> 0x0049, SSLException -> 0x0046, IOException -> 0x0043, L -> 0x0040 }
        L_0x016c:
            P5.J r1 = r0.a()     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x003d }
            P5.K r0 = P5.P.h(r1, r2, r0)     // Catch:{ all -> 0x003d }
            r0.o(r6)     // Catch:{ all -> 0x003d }
            P5.P.i(r6)     // Catch:{ all -> 0x003d }
            goto L_0x0120
        L_0x017f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r4 = "SERVER INTERNAL ERROR: IOException: "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x003d }
            r3.append(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x003d }
            P5.K r0 = P5.P.h(r0, r2, r1)     // Catch:{ all -> 0x003d }
            r0.o(r6)     // Catch:{ all -> 0x003d }
            P5.P.i(r6)     // Catch:{ all -> 0x003d }
            goto L_0x0120
        L_0x019f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r4 = "SSL PROTOCOL FAILURE: "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x003d }
            r3.append(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x003d }
            P5.K r0 = P5.P.h(r0, r2, r1)     // Catch:{ all -> 0x003d }
            r0.o(r6)     // Catch:{ all -> 0x003d }
            P5.P.i(r6)     // Catch:{ all -> 0x003d }
            goto L_0x0120
        L_0x01c0:
            return
        L_0x01c1:
            throw r0     // Catch:{ all -> 0x003d }
        L_0x01c2:
            throw r0     // Catch:{ all -> 0x003d }
        L_0x01c3:
            P5.P.i(r8)
            r5.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.G.d():void");
    }

    public final HashMap g() {
        HashMap hashMap = new HashMap();
        for (String str : this.f3819h.keySet()) {
            hashMap.put(str, (String) ((List) this.f3819h.get(str)).get(0));
        }
        return hashMap;
    }

    public final void h(HashMap hashMap) {
        long j7;
        DataOutput dataOutput;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteBuffer byteBuffer;
        HashMap hashMap2 = hashMap;
        RandomAccessFile randomAccessFile = null;
        try {
            if (this.i.containsKey("content-length")) {
                j7 = Long.parseLong((String) this.i.get("content-length"));
            } else {
                int i8 = this.f3816d;
                int i9 = this.e;
                if (i8 < i9) {
                    j7 = (long) (i9 - i8);
                } else {
                    j7 = 0;
                }
            }
            if (j7 < 1024) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutput = new DataOutputStream(byteArrayOutputStream);
            } else {
                d dVar = this.f3813a;
                F f8 = new F((File) dVar.f35V);
                ((ArrayList) dVar.f36W).add(f8);
                DataOutput randomAccessFile2 = new RandomAccessFile(f8.f3811a.getAbsolutePath(), "rw");
                byteArrayOutputStream = null;
                randomAccessFile = randomAccessFile2;
                dataOutput = randomAccessFile2;
            }
            byte[] bArr = new byte[512];
            while (this.e >= 0 && j7 > 0) {
                int read = this.f3815c.read(bArr, 0, (int) Math.min(j7, 512));
                this.e = read;
                j7 -= (long) read;
                if (read > 0) {
                    dataOutput.write(bArr, 0, read);
                }
            }
            if (byteArrayOutputStream != null) {
                byteBuffer = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            } else {
                byteBuffer = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).map(FileChannel.MapMode.READ_ONLY, 0, randomAccessFile.length());
                randomAccessFile.seek(0);
            }
            if (C1477r.a(3, this.f3818g)) {
                B b8 = new B((String) this.i.get("content-type"));
                String str = b8.f3801b;
                if (!"multipart/form-data".equalsIgnoreCase(str)) {
                    byte[] bArr2 = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr2);
                    String trim = new String(bArr2, b8.a()).trim();
                    if ("application/x-www-form-urlencoded".equalsIgnoreCase(str)) {
                        c(trim, this.f3819h);
                    } else if (trim.length() != 0) {
                        hashMap2.put("postData", trim);
                    }
                } else if (b8.f3803d != null) {
                    b(b8, byteBuffer, this.f3819h, hashMap2);
                } else {
                    throw new L(J.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                }
            } else if (C1477r.a(2, this.f3818g)) {
                hashMap2.put("content", i(byteBuffer, 0, byteBuffer.limit()));
            }
            P.i(randomAccessFile);
        } catch (Exception e8) {
            throw new Error(e8);
        } catch (Throwable th) {
            P.i(randomAccessFile);
            throw th;
        }
    }

    public final String i(ByteBuffer byteBuffer, int i8, int i9) {
        if (i9 <= 0) {
            return "";
        }
        FileOutputStream fileOutputStream = null;
        try {
            d dVar = this.f3813a;
            F f8 = new F((File) dVar.f35V);
            ((ArrayList) dVar.f36W).add(f8);
            File file = f8.f3811a;
            ByteBuffer duplicate = byteBuffer.duplicate();
            FileOutputStream fileOutputStream2 = new FileOutputStream(file.getAbsolutePath());
            try {
                FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream2.getChannel());
                duplicate.position(i8).limit(i8 + i9);
                convertMaybeLegacyFileChannelFromLibrary.write(duplicate.slice());
                String absolutePath = file.getAbsolutePath();
                P.i(fileOutputStream2);
                return absolutePath;
            } catch (Exception e8) {
                e = e8;
                fileOutputStream = fileOutputStream2;
                try {
                    throw new Error(e);
                } catch (Throwable th) {
                    th = th;
                    P.i(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                P.i(fileOutputStream);
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            throw new Error(e);
        }
    }
}
