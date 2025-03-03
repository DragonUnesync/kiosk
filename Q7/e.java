package Q7;

import Q0.g;
import R7.a;
import R7.b;
import T7.P;
import j$.util.Map;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.altbeacon.bluetooth.Pdu;

public final class e extends c {

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f4210o = Pattern.compile("(\\w+)/\\w*\\+?xml.*");

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f4211f;

    /* renamed from: g  reason: collision with root package name */
    public a f4212g;

    /* renamed from: h  reason: collision with root package name */
    public HttpURLConnection f4213h;
    public String i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4214j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4215k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4216l = false;

    /* renamed from: m  reason: collision with root package name */
    public final int f4217m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final d f4218n;

    public e(HttpURLConnection httpURLConnection, d dVar, e eVar) {
        int i8;
        int i9;
        int i10;
        HttpURLConnection httpURLConnection2 = httpURLConnection;
        e eVar2 = eVar;
        byte b8 = 240;
        byte b9 = 224;
        int i11 = 3;
        char c8 = 2;
        char c9 = 0;
        this.f4213h = httpURLConnection2;
        this.f4218n = dVar;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            if (requestMethod.equals("GET")) {
                i8 = 1;
            } else if (requestMethod.equals("POST")) {
                i8 = 2;
            } else if (requestMethod.equals("PUT")) {
                i8 = 3;
            } else if (requestMethod.equals("DELETE")) {
                i8 = 4;
            } else if (requestMethod.equals("PATCH")) {
                i8 = 5;
            } else if (requestMethod.equals("HEAD")) {
                i8 = 6;
            } else if (requestMethod.equals("OPTIONS")) {
                i8 = 7;
            } else if (requestMethod.equals("TRACE")) {
                i8 = 8;
            } else {
                throw new IllegalArgumentException("No enum constant org.jsoup.Connection.Method.".concat(requestMethod));
            }
            this.f4198b = i8;
            this.f4197a = httpURLConnection.getURL();
            httpURLConnection.getResponseCode();
            httpURLConnection.getResponseMessage();
            this.f4214j = httpURLConnection.getContentType();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i12 = 0;
            while (true) {
                String headerFieldKey = httpURLConnection2.getHeaderFieldKey(i12);
                String headerField = httpURLConnection2.getHeaderField(i12);
                if (headerFieldKey == null && headerField == null) {
                    break;
                }
                i12++;
                if (!(headerFieldKey == null || headerField == null)) {
                    ((List) Map.-EL.computeIfAbsent(linkedHashMap, headerFieldKey, b.f4358a)).add(headerField);
                }
                b8 = 240;
                b9 = 224;
                c9 = 0;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    for (String str2 : (List) entry.getValue()) {
                        if (str2 != null) {
                            byte[] bytes = str2.getBytes(f.f4219c);
                            if (bytes.length >= i11 && (bytes[c9] & Pdu.MANUFACTURER_DATA_PDU_TYPE) == 239 && (bytes[1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) == 187 && (bytes[c8] & Pdu.MANUFACTURER_DATA_PDU_TYPE) == 191) {
                                i9 = 3;
                            } else {
                                i9 = 0;
                            }
                            int length = bytes.length;
                            boolean z = false;
                            while (true) {
                                if (i9 >= length) {
                                    break;
                                }
                                byte b10 = bytes[i9];
                                if ((b10 & 128) == 0) {
                                    i11 = 3;
                                    c8 = 2;
                                } else {
                                    byte b11 = 192;
                                    if ((b10 & 224) != 192) {
                                        if ((b10 & 240) != b9) {
                                            c8 = 2;
                                            if ((b10 & 248) != b8) {
                                                i11 = 3;
                                                break;
                                            } else {
                                                i11 = 3;
                                                i10 = i9 + 3;
                                            }
                                        } else {
                                            c8 = 2;
                                            i10 = i9 + 2;
                                            i11 = 3;
                                        }
                                    } else {
                                        i10 = i9 + 1;
                                        i11 = 3;
                                        c8 = 2;
                                    }
                                    if (i10 >= bytes.length) {
                                        break;
                                    }
                                    while (i9 < i10) {
                                        i9++;
                                        if ((bytes[i9] & b11) != 128) {
                                            break;
                                        }
                                        b11 = 192;
                                    }
                                    z = true;
                                }
                                i9++;
                                b8 = 240;
                                b9 = 224;
                            }
                            z = false;
                            if (z) {
                                str2 = new String(bytes, b.f4194b);
                            }
                        }
                        a(str, str2);
                        b8 = 240;
                        b9 = 224;
                        c9 = 0;
                    }
                }
            }
            d dVar2 = this.f4218n;
            URL url = this.f4197a;
            java.util.Map map = a.f4192a;
            try {
                dVar2.f4208m.put(url.toURI(), linkedHashMap);
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    List<String> list = (List) entry2.getValue();
                    if (((String) entry2.getKey()).equalsIgnoreCase("Set-Cookie")) {
                        for (String str3 : list) {
                            if (str3 != null) {
                                P p3 = new P(str3);
                                String d8 = p3.d("=");
                                p3.g("=");
                                String trim = d8.trim();
                                String trim2 = p3.d(";").trim();
                                g.C(trim, "name");
                                g.E(trim2, "value");
                                this.f4200d.put(trim, trim2);
                            }
                        }
                    }
                }
                if (eVar2 != null) {
                    for (Map.Entry entry3 : eVar2.f4200d.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        g.C(str4, "name");
                        if (!this.f4200d.containsKey(str4)) {
                            String str5 = (String) entry3.getKey();
                            String str6 = (String) entry3.getValue();
                            g.C(str5, "name");
                            g.E(str6, "value");
                            this.f4200d.put(str5, str6);
                        }
                    }
                    eVar.g();
                    int i13 = eVar2.f4217m + 1;
                    this.f4217m = i13;
                    if (i13 >= 20) {
                        URL e = eVar.e();
                        throw new IOException("Too many redirects occurred trying to load URL " + e);
                    }
                }
            } catch (URISyntaxException e8) {
                URISyntaxException uRISyntaxException = e8;
                MalformedURLException malformedURLException = new MalformedURLException(uRISyntaxException.getMessage());
                malformedURLException.initCause(uRISyntaxException);
                throw malformedURLException;
            }
        } else {
            throw new NullPointerException("Name is null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: Q7.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0274 A[Catch:{ IOException -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b1 A[Catch:{ IOException -> 0x02c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03aa A[Catch:{ IOException -> 0x02c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03ad A[Catch:{ IOException -> 0x02c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0197 A[LOOP:1: B:73:0x0191->B:75:0x0197, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Q7.e f(Q7.d r16, Q7.e r17) {
        /*
            r1 = r16
            r2 = 0
            r0 = 1
            monitor-enter(r16)
            boolean r3 = r1.f4209n     // Catch:{ all -> 0x0404 }
            java.lang.String r4 = "Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads."
            if (r3 != 0) goto L_0x0406
            r1.f4209n = r0     // Catch:{ all -> 0x0404 }
            monitor-exit(r16)     // Catch:{ all -> 0x0404 }
            java.net.URL r3 = r16.e()
            java.lang.String r4 = "URL must be specified to connect"
            if (r3 == 0) goto L_0x03fe
            java.lang.String r3 = r3.getProtocol()
            java.lang.String r4 = "http"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.net.MalformedURLException r0 = new java.net.MalformedURLException
            java.lang.String r1 = "Only http & https protocols supported"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            int r3 = r1.f4198b
            boolean r3 = N.e.t(r3)
            if (r3 != 0) goto L_0x005f
            int r4 = r1.f4198b
            switch(r4) {
                case 1: goto L_0x0058;
                case 2: goto L_0x0055;
                case 3: goto L_0x0052;
                case 4: goto L_0x004f;
                case 5: goto L_0x004c;
                case 6: goto L_0x0049;
                case 7: goto L_0x0046;
                case 8: goto L_0x0043;
                default: goto L_0x0040;
            }
        L_0x0040:
            java.lang.String r4 = "null"
            goto L_0x005a
        L_0x0043:
            java.lang.String r4 = "TRACE"
            goto L_0x005a
        L_0x0046:
            java.lang.String r4 = "OPTIONS"
            goto L_0x005a
        L_0x0049:
            java.lang.String r4 = "HEAD"
            goto L_0x005a
        L_0x004c:
            java.lang.String r4 = "PATCH"
            goto L_0x005a
        L_0x004f:
            java.lang.String r4 = "DELETE"
            goto L_0x005a
        L_0x0052:
            java.lang.String r4 = "PUT"
            goto L_0x005a
        L_0x0055:
            java.lang.String r4 = "POST"
            goto L_0x005a
        L_0x0058:
            java.lang.String r4 = "GET"
        L_0x005a:
            java.lang.String r5 = "Cannot set a request body for HTTP method "
            r5.concat(r4)
        L_0x005f:
            java.util.ArrayList r4 = r1.i
            int r4 = r4.size()
            r5 = 0
            if (r4 <= 0) goto L_0x009e
            if (r3 == 0) goto L_0x006b
            goto L_0x009e
        L_0x006b:
            A1.d r3 = new A1.d
            java.net.URL r4 = r16.e()
            r3.<init>((java.net.URL) r4)
            java.util.ArrayList r4 = r1.i
            java.util.Iterator r6 = r4.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L_0x0099
            java.net.URL r3 = r3.j()
            java.lang.String r6 = "url"
            Q7.g.E(r3, r6)
            A1.d r6 = new A1.d
            r6.<init>((java.net.URL) r3)
            java.net.URL r3 = r6.j()
            r1.f4197a = r3
            r4.clear()
            goto L_0x0135
        L_0x0099:
            java.lang.ClassCastException r0 = Q0.g.k(r6)
            throw r0
        L_0x009e:
            if (r3 == 0) goto L_0x0135
            java.lang.String r3 = "Content-Type"
            java.util.List r3 = r1.b(r3)
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x00b3
            java.lang.String r4 = ", "
            java.lang.String r3 = R7.h.g(r3, r4)
            goto L_0x00b4
        L_0x00b3:
            r3 = r2
        L_0x00b4:
            if (r3 == 0) goto L_0x0104
            java.lang.String r4 = "multipart/form-data"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L_0x0135
            java.lang.String r4 = "boundary"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0135
            java.util.regex.Pattern r3 = Q7.b.f4193a
            java.lang.StringBuilder r3 = R7.h.b()
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            r6 = 0
        L_0x00d2:
            r7 = 32
            if (r6 >= r7) goto L_0x00e4
            char[] r7 = Q7.b.f4196d
            int r8 = r7.length
            int r8 = r4.nextInt(r8)
            char r7 = r7[r8]
            r3.append(r7)
            int r6 = r6 + r0
            goto L_0x00d2
        L_0x00e4:
            java.lang.String r3 = R7.h.h(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "multipart/form-data; boundary="
            r4.<init>(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "name"
            java.lang.String r7 = "Content-Type"
            Q7.g.C(r7, r6)
            r16.d()
            r1.a(r7, r4)
            goto L_0x0136
        L_0x0104:
            java.nio.charset.Charset r3 = Q7.f.f4219c
            java.util.ArrayList r3 = r1.i
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x0130
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "application/x-www-form-urlencoded; charset="
            r3.<init>(r4)
            java.lang.String r4 = r1.f4207l
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "name"
            java.lang.String r6 = "Content-Type"
            Q7.g.C(r6, r4)
            r16.d()
            r1.a(r6, r3)
            goto L_0x0135
        L_0x0130:
            java.lang.ClassCastException r0 = Q0.g.k(r3)
            throw r0
        L_0x0135:
            r3 = r2
        L_0x0136:
            long r6 = java.lang.System.nanoTime()
            java.net.URL r4 = r16.e()
            java.net.URLConnection r4 = r4.openConnection()
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4
            int r8 = r1.f4198b
            switch(r8) {
                case 1: goto L_0x015f;
                case 2: goto L_0x015c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0156;
                case 5: goto L_0x0153;
                case 6: goto L_0x0150;
                case 7: goto L_0x014d;
                case 8: goto L_0x014a;
                default: goto L_0x0149;
            }
        L_0x0149:
            throw r2
        L_0x014a:
            java.lang.String r8 = "TRACE"
            goto L_0x0161
        L_0x014d:
            java.lang.String r8 = "OPTIONS"
            goto L_0x0161
        L_0x0150:
            java.lang.String r8 = "HEAD"
            goto L_0x0161
        L_0x0153:
            java.lang.String r8 = "PATCH"
            goto L_0x0161
        L_0x0156:
            java.lang.String r8 = "DELETE"
            goto L_0x0161
        L_0x0159:
            java.lang.String r8 = "PUT"
            goto L_0x0161
        L_0x015c:
            java.lang.String r8 = "POST"
            goto L_0x0161
        L_0x015f:
            java.lang.String r8 = "GET"
        L_0x0161:
            r4.setRequestMethod(r8)
            r4.setInstanceFollowRedirects(r5)
            int r8 = r1.f4202f
            r4.setConnectTimeout(r8)
            int r8 = r1.f4202f
            int r8 = r8 / 2
            r4.setReadTimeout(r8)
            int r8 = Q7.d.f4201o
            int r8 = r1.f4198b
            boolean r8 = N.e.t(r8)
            if (r8 == 0) goto L_0x0180
            r4.setDoOutput(r0)
        L_0x0180:
            java.util.Map r8 = Q7.a.f4192a
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashMap r9 = r1.f4200d
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0191:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01c1
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.Object r12 = r10.getKey()
            java.lang.String r12 = (java.lang.String) r12
            r11.append(r12)
            java.lang.String r12 = "="
            r11.append(r12)
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r8.add(r10)
            goto L_0x0191
        L_0x01c1:
            java.net.CookieManager r9 = r1.f4208m
            java.net.URL r10 = r1.f4197a
            java.net.URI r10 = r10.toURI()     // Catch:{ URISyntaxException -> 0x03ef }
            java.util.Map r11 = Q7.a.f4192a
            java.util.Map r9 = r9.get(r10, r11)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            r10 = r2
        L_0x01d8:
            boolean r11 = r9.hasNext()
            java.lang.String r12 = "Cookie2"
            java.lang.String r13 = "Cookie"
            if (r11 == 0) goto L_0x0217
            java.lang.Object r11 = r9.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r14 = r11.getValue()
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x01d8
            int r15 = r14.size()
            if (r15 != 0) goto L_0x01f7
            goto L_0x01d8
        L_0x01f7:
            java.lang.Object r11 = r11.getKey()
            java.lang.String r11 = (java.lang.String) r11
            boolean r13 = r13.equals(r11)
            if (r13 == 0) goto L_0x0206
            r11 = r10
            r10 = r8
            goto L_0x0212
        L_0x0206:
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x01d8
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r11 = r10
        L_0x0212:
            r10.addAll(r14)
            r10 = r11
            goto L_0x01d8
        L_0x0217:
            int r9 = r8.size()
            java.lang.String r11 = "; "
            if (r9 <= 0) goto L_0x0226
            java.lang.String r8 = R7.h.g(r8, r11)
            r4.addRequestProperty(r13, r8)
        L_0x0226:
            if (r10 == 0) goto L_0x0235
            int r8 = r10.size()
            if (r8 <= 0) goto L_0x0235
            java.lang.String r8 = R7.h.g(r10, r11)
            r4.addRequestProperty(r12, r8)
        L_0x0235:
            java.util.LinkedHashMap r8 = r1.f4199c
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x023f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x026b
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getValue()
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0255:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x023f
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r9.getKey()
            java.lang.String r12 = (java.lang.String) r12
            r4.addRequestProperty(r12, r11)
            goto L_0x0255
        L_0x026b:
            r4.connect()     // Catch:{ IOException -> 0x0282 }
            boolean r8 = r4.getDoOutput()     // Catch:{ IOException -> 0x0282 }
            if (r8 == 0) goto L_0x0290
            java.io.OutputStream r8 = r4.getOutputStream()     // Catch:{ IOException -> 0x0282 }
            h(r1, r8, r3)     // Catch:{ IOException -> 0x0285 }
            r8.close()     // Catch:{ IOException -> 0x0282 }
            goto L_0x0290
        L_0x027f:
            r0 = move-exception
            goto L_0x03ea
        L_0x0282:
            r0 = move-exception
            goto L_0x03e4
        L_0x0285:
            r0 = move-exception
            r3 = r0
            r4.disconnect()     // Catch:{ all -> 0x028b }
            throw r3     // Catch:{ all -> 0x028b }
        L_0x028b:
            r0 = move-exception
            r8.close()     // Catch:{ IOException -> 0x0282 }
            throw r0     // Catch:{ IOException -> 0x0282 }
        L_0x0290:
            int r3 = r4.getResponseCode()     // Catch:{ IOException -> 0x0282 }
            Q7.e r8 = new Q7.e     // Catch:{ IOException -> 0x0282 }
            r9 = r17
            r8.<init>(r4, r1, r9)     // Catch:{ IOException -> 0x0282 }
            java.lang.String r9 = "Location"
            java.lang.String r10 = "name"
            Q7.g.C(r9, r10)     // Catch:{ IOException -> 0x02c5 }
            java.util.List r9 = r8.b(r9)     // Catch:{ IOException -> 0x02c5 }
            boolean r9 = r9.isEmpty()     // Catch:{ IOException -> 0x02c5 }
            r10 = 6
            if (r9 != 0) goto L_0x0310
            boolean r9 = r1.f4204h     // Catch:{ IOException -> 0x02c5 }
            if (r9 == 0) goto L_0x0310
            r4 = 307(0x133, float:4.3E-43)
            if (r3 == r4) goto L_0x02c9
            java.lang.String r3 = "method"
            Q0.g.t(r0, r3)     // Catch:{ IOException -> 0x02c5 }
            r1.f4198b = r0     // Catch:{ IOException -> 0x02c5 }
            java.util.ArrayList r0 = r1.i     // Catch:{ IOException -> 0x02c5 }
            r0.clear()     // Catch:{ IOException -> 0x02c5 }
            r16.d()     // Catch:{ IOException -> 0x02c5 }
            goto L_0x02c9
        L_0x02c5:
            r0 = move-exception
            r2 = r8
            goto L_0x03e4
        L_0x02c9:
            java.lang.String r0 = "Location"
            java.util.List r0 = r8.b(r0)     // Catch:{ IOException -> 0x02c5 }
            int r3 = r0.size()     // Catch:{ IOException -> 0x02c5 }
            if (r3 <= 0) goto L_0x02db
            java.lang.String r2 = ", "
            java.lang.String r2 = R7.h.g(r0, r2)     // Catch:{ IOException -> 0x02c5 }
        L_0x02db:
            Q7.g.D(r2)     // Catch:{ IOException -> 0x02c5 }
            java.lang.String r0 = "http:/"
            boolean r0 = r2.startsWith(r0)     // Catch:{ IOException -> 0x02c5 }
            if (r0 == 0) goto L_0x02f2
            char r0 = r2.charAt(r10)     // Catch:{ IOException -> 0x02c5 }
            r3 = 47
            if (r0 == r3) goto L_0x02f2
            java.lang.String r2 = r2.substring(r10)     // Catch:{ IOException -> 0x02c5 }
        L_0x02f2:
            java.net.URL r0 = r16.e()     // Catch:{ IOException -> 0x02c5 }
            java.net.URL r0 = R7.h.i(r0, r2)     // Catch:{ IOException -> 0x02c5 }
            A1.d r2 = new A1.d     // Catch:{ IOException -> 0x02c5 }
            r2.<init>((java.net.URL) r0)     // Catch:{ IOException -> 0x02c5 }
            java.net.URL r0 = r2.j()     // Catch:{ IOException -> 0x02c5 }
            r1.f4197a = r0     // Catch:{ IOException -> 0x02c5 }
            r1.f4209n = r5     // Catch:{ IOException -> 0x02c5 }
            Q7.e r0 = f(r1, r8)     // Catch:{ IOException -> 0x02c5 }
            r1.f4209n = r5
            int r1 = Q7.d.f4201o
            return r0
        L_0x0310:
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 < r2) goto L_0x03d6
            r2 = 400(0x190, float:5.6E-43)
            if (r3 >= r2) goto L_0x03d6
            java.lang.String r2 = r8.f4214j     // Catch:{ IOException -> 0x02c5 }
            if (r2 == 0) goto L_0x033f
            java.lang.String r3 = "text/"
            boolean r3 = r2.startsWith(r3)     // Catch:{ IOException -> 0x02c5 }
            if (r3 != 0) goto L_0x033f
            java.util.regex.Pattern r3 = f4210o     // Catch:{ IOException -> 0x02c5 }
            java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch:{ IOException -> 0x02c5 }
            boolean r3 = r3.matches()     // Catch:{ IOException -> 0x02c5 }
            if (r3 == 0) goto L_0x0331
            goto L_0x033f
        L_0x0331:
            P7.b r0 = new P7.b     // Catch:{ IOException -> 0x02c5 }
            java.net.URL r3 = r16.e()     // Catch:{ IOException -> 0x02c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x02c5 }
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x02c5 }
            throw r0     // Catch:{ IOException -> 0x02c5 }
        L_0x033f:
            if (r2 == 0) goto L_0x035f
            java.util.regex.Pattern r3 = f4210o     // Catch:{ IOException -> 0x02c5 }
            java.util.regex.Matcher r2 = r3.matcher(r2)     // Catch:{ IOException -> 0x02c5 }
            boolean r2 = r2.matches()     // Catch:{ IOException -> 0x02c5 }
            if (r2 == 0) goto L_0x035f
            boolean r2 = r1.f4206k     // Catch:{ IOException -> 0x02c5 }
            if (r2 != 0) goto L_0x035f
            B.q0 r2 = new B.q0     // Catch:{ IOException -> 0x02c5 }
            T7.j1 r3 = new T7.j1     // Catch:{ IOException -> 0x02c5 }
            r3.<init>()     // Catch:{ IOException -> 0x02c5 }
            r2.<init>((T7.i1) r3)     // Catch:{ IOException -> 0x02c5 }
            r1.f4205j = r2     // Catch:{ IOException -> 0x02c5 }
            r1.f4206k = r0     // Catch:{ IOException -> 0x02c5 }
        L_0x035f:
            java.lang.String r2 = r8.f4214j     // Catch:{ IOException -> 0x02c5 }
            java.lang.String r2 = Q7.b.b(r2)     // Catch:{ IOException -> 0x02c5 }
            r8.i = r2     // Catch:{ IOException -> 0x02c5 }
            int r2 = r4.getContentLength()     // Catch:{ IOException -> 0x02c5 }
            if (r2 == 0) goto L_0x03c9
            int r2 = r1.f4198b     // Catch:{ IOException -> 0x02c5 }
            if (r2 == r10) goto L_0x03c9
            java.io.InputStream r2 = r4.getErrorStream()     // Catch:{ IOException -> 0x02c5 }
            if (r2 == 0) goto L_0x037c
            java.io.InputStream r2 = r4.getErrorStream()     // Catch:{ IOException -> 0x02c5 }
            goto L_0x0380
        L_0x037c:
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ IOException -> 0x02c5 }
        L_0x0380:
            java.lang.String r3 = "gzip"
            boolean r3 = r8.c(r3)     // Catch:{ IOException -> 0x02c5 }
            if (r3 == 0) goto L_0x038f
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x02c5 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x02c5 }
        L_0x038d:
            r2 = r3
            goto L_0x03a2
        L_0x038f:
            java.lang.String r3 = "deflate"
            boolean r3 = r8.c(r3)     // Catch:{ IOException -> 0x02c5 }
            if (r3 == 0) goto L_0x03a2
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream     // Catch:{ IOException -> 0x02c5 }
            java.util.zip.Inflater r4 = new java.util.zip.Inflater     // Catch:{ IOException -> 0x02c5 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x02c5 }
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x02c5 }
            goto L_0x038d
        L_0x03a2:
            int r3 = r1.f4203g     // Catch:{ IOException -> 0x02c5 }
            int r4 = R7.a.f4348d0     // Catch:{ IOException -> 0x02c5 }
            boolean r4 = r2 instanceof R7.a     // Catch:{ IOException -> 0x02c5 }
            if (r4 == 0) goto L_0x03ad
            R7.a r2 = (R7.a) r2     // Catch:{ IOException -> 0x02c5 }
            goto L_0x03b8
        L_0x03ad:
            R7.a r4 = new R7.a     // Catch:{ IOException -> 0x02c5 }
            R7.c r9 = new R7.c     // Catch:{ IOException -> 0x02c5 }
            r9.<init>(r2)     // Catch:{ IOException -> 0x02c5 }
            r4.<init>(r9, r3)     // Catch:{ IOException -> 0x02c5 }
            r2 = r4
        L_0x03b8:
            int r3 = r1.f4202f     // Catch:{ IOException -> 0x02c5 }
            long r3 = (long) r3     // Catch:{ IOException -> 0x02c5 }
            r2.f4351W = r6     // Catch:{ IOException -> 0x02c5 }
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r6
            r2.f4352X = r3     // Catch:{ IOException -> 0x02c5 }
            r8.f4212g = r2     // Catch:{ IOException -> 0x02c5 }
            int r2 = Q7.d.f4201o     // Catch:{ IOException -> 0x02c5 }
            goto L_0x03cf
        L_0x03c9:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)     // Catch:{ IOException -> 0x02c5 }
            r8.f4211f = r2     // Catch:{ IOException -> 0x02c5 }
        L_0x03cf:
            r1.f4209n = r5
            int r1 = Q7.d.f4201o
            r8.f4215k = r0
            return r8
        L_0x03d6:
            B2.c r0 = new B2.c     // Catch:{ IOException -> 0x02c5 }
            java.net.URL r2 = r16.e()     // Catch:{ IOException -> 0x02c5 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x02c5 }
            r0.<init>(r3, r2)     // Catch:{ IOException -> 0x02c5 }
            throw r0     // Catch:{ IOException -> 0x02c5 }
        L_0x03e4:
            if (r2 == 0) goto L_0x03e9
            r2.g()     // Catch:{ all -> 0x027f }
        L_0x03e9:
            throw r0     // Catch:{ all -> 0x027f }
        L_0x03ea:
            r1.f4209n = r5
            int r1 = Q7.d.f4201o
            throw r0
        L_0x03ef:
            r0 = move-exception
            r1 = r0
            java.net.MalformedURLException r0 = new java.net.MalformedURLException
            java.lang.String r2 = r1.getMessage()
            r0.<init>(r2)
            r0.initCause(r1)
            throw r0
        L_0x03fe:
            Q7.h r0 = new Q7.h
            r0.<init>(r4)
            throw r0
        L_0x0404:
            r0 = move-exception
            goto L_0x040c
        L_0x0406:
            Q7.h r0 = new Q7.h     // Catch:{ all -> 0x0404 }
            r0.<init>(r4)     // Catch:{ all -> 0x0404 }
            throw r0     // Catch:{ all -> 0x0404 }
        L_0x040c:
            monitor-exit(r16)     // Catch:{ all -> 0x0404 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.e.f(Q7.d, Q7.e):Q7.e");
    }

    public static void h(d dVar, OutputStream outputStream, String str) {
        ArrayList arrayList = dVar.i;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(dVar.f4207l)));
        if (str != null) {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else if (it.next() == null) {
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("\r\n");
                bufferedWriter.write("Content-Disposition: form-data; name=\"");
                throw null;
            } else {
                throw new ClassCastException();
            }
        } else {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw g.k(it2);
            }
        }
        bufferedWriter.close();
    }

    public final void g() {
        a aVar = this.f4212g;
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f4212g = null;
                throw th;
            }
            this.f4212g = null;
        }
        HttpURLConnection httpURLConnection = this.f4213h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f4213h = null;
        }
    }
}
