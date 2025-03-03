package de.ozerov.fully;

import E7.f;
import N.e;
import Q0.g;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import j$.net.URLEncoder;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import n2.a;
import org.altbeacon.beacon.service.RangedBeacon;
import u.C1477r;

/* renamed from: de.ozerov.fully.y2  reason: case insensitive filesystem */
public abstract class C0808y2 {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f11115a = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:146:0x037c A[SYNTHETIC, Splitter:B:146:0x037c] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0384 A[Catch:{ IOException -> 0x0380 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03b6 A[SYNTHETIC, Splitter:B:159:0x03b6] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03be A[Catch:{ IOException -> 0x03ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03cc A[SYNTHETIC, Splitter:B:170:0x03cc] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03d4 A[Catch:{ IOException -> 0x03d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03d9  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:156:0x0390=Splitter:B:156:0x0390, B:143:0x034a=Splitter:B:143:0x034a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static de.ozerov.fully.C0802x2 a(java.lang.String r23, java.io.File r24, int r25, java.net.CookieManager r26, boolean r27, java.lang.String r28) {
        /*
            r1 = r23
            r3 = r24
            r2 = r25
            r4 = r26
            r7 = r28
            java.lang.String r5 = "charset="
            java.lang.String r6 = "Cookie"
            java.util.ArrayList r8 = f11115a
            java.lang.String r9 = "Basic "
            de.ozerov.fully.x2 r10 = new de.ozerov.fully.x2
            r10.<init>()
            boolean r12 = r8.contains(r1)     // Catch:{ Exception -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r12 = 0
        L_0x001e:
            java.lang.String r13 = " resultCode: "
            java.lang.String r14 = "y2"
            java.lang.String r15 = "downloadFile failed for "
            if (r12 == 0) goto L_0x003f
            r2 = 503(0x1f7, float:7.05E-43)
            r10.f11070b = r2
            java.lang.String r2 = "URL already in download process"
            r10.f11074g = r2
            java.lang.StringBuilder r1 = Q0.g.s(r15, r1, r13)
            int r2 = r10.f11070b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            g7.l.d(r14, r1)
            return r10
        L_0x003f:
            r16 = 0
            r8.add(r1)     // Catch:{ SocketTimeoutException -> 0x006b, Exception -> 0x0064, all -> 0x005d }
            java.net.URL r12 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x006b, Exception -> 0x0064, all -> 0x005d }
            r12.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x006b, Exception -> 0x0064, all -> 0x005d }
            java.lang.String r11 = r12.getProtocol()     // Catch:{ SocketTimeoutException -> 0x006b, Exception -> 0x0064, all -> 0x005d }
            java.lang.String r2 = "https"
            boolean r2 = r11.equals(r2)     // Catch:{ SocketTimeoutException -> 0x006b, Exception -> 0x0064, all -> 0x005d }
            if (r2 == 0) goto L_0x0072
            java.net.URLConnection r2 = r12.openConnection()     // Catch:{ SocketTimeoutException -> 0x006b, Exception -> 0x0064, all -> 0x005d }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ SocketTimeoutException -> 0x006b, Exception -> 0x0064, all -> 0x005d }
        L_0x005b:
            r11 = r2
            goto L_0x0079
        L_0x005d:
            r0 = move-exception
            r2 = r0
            r3 = r16
            r11 = r3
            goto L_0x03ca
        L_0x0064:
            r0 = move-exception
            r2 = r0
            r3 = r16
            r11 = r3
            goto L_0x034a
        L_0x006b:
            r0 = move-exception
            r2 = r0
            r3 = r16
            r11 = r3
            goto L_0x0390
        L_0x0072:
            java.net.URLConnection r2 = r12.openConnection()     // Catch:{ SocketTimeoutException -> 0x006b, Exception -> 0x0064, all -> 0x005d }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ SocketTimeoutException -> 0x006b, Exception -> 0x0064, all -> 0x005d }
            goto L_0x005b
        L_0x0079:
            boolean r2 = r11 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r2 == 0) goto L_0x009d
            if (r27 == 0) goto L_0x009d
            java.lang.String r2 = "Trust all hosts and CA for download connection"
            android.util.Log.i(r14, r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2 = r11
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            n(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            goto L_0x009d
        L_0x008b:
            r0 = move-exception
            r2 = r0
            r3 = r16
            goto L_0x03ca
        L_0x0091:
            r0 = move-exception
            r2 = r0
            r3 = r16
            goto L_0x034a
        L_0x0097:
            r0 = move-exception
            r2 = r0
            r3 = r16
            goto L_0x0390
        L_0x009d:
            r2 = 8000(0x1f40, float:1.121E-41)
            r11.setConnectTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2 = 32000(0x7d00, float:4.4842E-41)
            r11.setReadTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2 = 0
            r11.setInstanceFollowRedirects(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r3 != 0) goto L_0x00b2
            java.lang.String r2 = "HEAD"
            r11.setRequestMethod(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
        L_0x00b2:
            java.lang.String r2 = r12.getUserInfo()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r2 == 0) goto L_0x00df
            java.lang.String r2 = r12.getUserInfo()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = n2.a.j1(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            byte[] r2 = r2.getBytes(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r3 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = "Authorization"
            r17 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r5.<init>(r9)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r5.append(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r11.setRequestProperty(r3, r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            goto L_0x00e1
        L_0x00df:
            r17 = r5
        L_0x00e1:
            if (r4 == 0) goto L_0x0111
            java.net.URI r2 = r12.toURI()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.util.Map r3 = r11.getRequestProperties()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.util.Map r2 = r4.get(r2, r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.Object r3 = r2.get(r6)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r2.get(r6)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r5 = 0
            java.lang.Object r3 = r3.get(r5)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r11.setRequestProperty(r6, r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.util.List r2 = (java.util.List) r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
        L_0x0111:
            if (r7 == 0) goto L_0x0118
            java.lang.String r2 = "User-Agent"
            r11.setRequestProperty(r2, r7)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
        L_0x0118:
            java.lang.String r2 = "Connection"
            java.lang.String r3 = "close"
            r11.setRequestProperty(r2, r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r11.connect()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            int r2 = r11.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r10.f11070b = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r3 = 307(0x133, float:4.3E-43)
            r5 = 200(0xc8, float:2.8E-43)
            if (r2 == r5) goto L_0x015e
            r6 = 301(0x12d, float:4.22E-43)
            if (r2 == r6) goto L_0x015e
            r6 = 302(0x12e, float:4.23E-43)
            if (r2 == r6) goto L_0x015e
            r6 = 303(0x12f, float:4.25E-43)
            if (r2 == r6) goto L_0x015e
            if (r2 == r3) goto L_0x015e
            java.lang.String r2 = "Unexpected response code"
            r10.f11074g = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.<init>(r15)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r1)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r13)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            int r3 = r10.f11070b     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            g7.l.d(r14, r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r11.disconnect()
            r8.remove(r1)
            return r10
        L_0x015e:
            if (r4 != 0) goto L_0x0167
            java.net.CookieManager r2 = new java.net.CookieManager     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r6 = r2
            goto L_0x0168
        L_0x0167:
            r6 = r4
        L_0x0168:
            java.net.URI r2 = r12.toURI()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.util.Map r4 = r11.getHeaderFields()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r6.put(r2, r4)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            int r2 = r11.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r4 = 1
            java.lang.String r9 = "downloadFile "
            if (r2 == r3) goto L_0x02f6
            switch(r2) {
                case 301: goto L_0x02f6;
                case 302: goto L_0x02f6;
                case 303: goto L_0x02f6;
                default: goto L_0x017f;
            }
        L_0x017f:
            int r2 = r11.getContentLength()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            long r2 = (long) r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r10.f11075h = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = r11.getContentType()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r2 == 0) goto L_0x01a0
            java.lang.String r2 = r11.getContentType()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = ";"
            java.lang.String[] r2 = r2.split(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r3 = 0
            r2 = r2[r3]     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = r2.trim()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r10.e = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            goto L_0x01a4
        L_0x01a0:
            java.lang.String r2 = ""
            r10.e = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
        L_0x01a4:
            java.lang.String r2 = r11.getContentEncoding()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r10.f11073f = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            long r2 = r11.getLastModified()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r10.i = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = r10.f11073f     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r2 != 0) goto L_0x01d3
            java.lang.String r2 = r11.getContentType()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r2 == 0) goto L_0x01d3
            java.lang.String r2 = r11.getContentType()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r3 = r17
            java.lang.String[] r2 = r2.split(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            int r2 = r2.length     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r2 <= r4) goto L_0x01d3
            java.lang.String r2 = r11.getContentType()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String[] r2 = r2.split(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2 = r2[r4]     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r10.f11073f = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
        L_0x01d3:
            java.lang.String r2 = "Content-Disposition"
            java.lang.String r2 = r11.getHeaderField(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r2 == 0) goto L_0x01e2
            java.lang.String r2 = de.ozerov.fully.P.J(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r10.f11071c = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            goto L_0x01e8
        L_0x01e2:
            java.lang.String r2 = c(r23)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r10.f11071c = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
        L_0x01e8:
            java.lang.String r2 = r10.f11071c     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            if (r2 != 0) goto L_0x01f0
            java.lang.String r2 = "download.dat"
            r10.f11071c = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
        L_0x01f0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.<init>(r9)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r1)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = " filename: "
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = r10.f11071c     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = " size: "
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            long r3 = r10.f11075h     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r13)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            int r3 = r10.f11070b     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = " mimetype: "
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = r10.e     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = " encoding: "
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = r10.f11073f     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = " lastModified: "
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            long r3 = r10.i     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            android.util.Log.i(r14, r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r3 = r24
            if (r3 == 0) goto L_0x02d6
            java.io.File r2 = new java.io.File     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r4 = r10.f11071c     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.<init>(r3, r4)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r4.<init>()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = r24.getPath()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r4.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = java.io.File.separator     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r4.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = r10.f11071c     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r4.append(r3)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r3 = r4.toString()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r10.f11072d = r3     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.io.InputStream r3 = r11.getInputStream()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x02d2, Exception -> 0x02ce }
            r6 = 0
            r4.<init>(r2, r6)     // Catch:{ SocketTimeoutException -> 0x02d2, Exception -> 0x02ce }
            r6 = 16384(0x4000, float:2.2959E-41)
            byte[] r6 = new byte[r6]     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            r17 = 0
        L_0x0270:
            int r7 = r3.read(r6)     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            r9 = -1
            if (r7 == r9) goto L_0x02c7
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            boolean r9 = r9.isInterrupted()     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            if (r9 == 0) goto L_0x02b1
            r3.close()     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            r4.close()     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            r2.delete()     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            r2 = 206(0xce, float:2.89E-43)
            r10.f11070b = r2     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            java.lang.String r2 = "Download Interrupted"
            r10.f11074g = r2     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            r4.close()     // Catch:{ IOException -> 0x0298 }
            r3.close()     // Catch:{ IOException -> 0x0298 }
        L_0x0298:
            r11.disconnect()
            r8.remove(r1)
            return r10
        L_0x029f:
            r0 = move-exception
            r2 = r0
            r16 = r4
            goto L_0x03ca
        L_0x02a5:
            r0 = move-exception
            r2 = r0
            r16 = r4
            goto L_0x034a
        L_0x02ab:
            r0 = move-exception
            r2 = r0
            r16 = r4
            goto L_0x0390
        L_0x02b1:
            long r12 = (long) r7
            long r17 = r17 + r12
            r9 = 0
            r4.write(r6, r9, r7)     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            long r12 = r10.f11075h     // Catch:{ SocketTimeoutException -> 0x02ab, Exception -> 0x02a5, all -> 0x029f }
            r19 = 0
            int r7 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r7 <= 0) goto L_0x0270
            r21 = 100
            long r21 = r21 * r17
            long r21 = r21 / r12
            goto L_0x0270
        L_0x02c7:
            r16 = r4
            goto L_0x02d8
        L_0x02ca:
            r0 = move-exception
            r2 = r0
            goto L_0x03ca
        L_0x02ce:
            r0 = move-exception
            r2 = r0
            goto L_0x034a
        L_0x02d2:
            r0 = move-exception
            r2 = r0
            goto L_0x0390
        L_0x02d6:
            r3 = r16
        L_0x02d8:
            java.net.URL r2 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x02d2, Exception -> 0x02ce }
            r2.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x02d2, Exception -> 0x02ce }
            r10.f11069a = r2     // Catch:{ SocketTimeoutException -> 0x02d2, Exception -> 0x02ce }
            r10.f11070b = r5     // Catch:{ SocketTimeoutException -> 0x02d2, Exception -> 0x02ce }
            java.lang.String r2 = "OK"
            r10.f11074g = r2     // Catch:{ SocketTimeoutException -> 0x02d2, Exception -> 0x02ce }
            if (r16 == 0) goto L_0x02ea
            r16.close()     // Catch:{ IOException -> 0x02ef }
        L_0x02ea:
            if (r3 == 0) goto L_0x02ef
            r3.close()     // Catch:{ IOException -> 0x02ef }
        L_0x02ef:
            r11.disconnect()
            r8.remove(r1)
            return r10
        L_0x02f6:
            r3 = r24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.<init>(r9)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r1)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r13)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            int r5 = r10.f11070b     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2.append(r5)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            android.util.Log.i(r14, r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = "Location"
            java.lang.String r2 = r11.getHeaderField(r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.net.URL r5 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r5.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.net.URL r9 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r9.<init>(r5, r2)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r2 = 3
            r5 = r25
            if (r5 <= r2) goto L_0x0333
            r2 = 500(0x1f4, float:7.0E-43)
            r10.f11070b = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            java.lang.String r2 = "To many forwards"
            r10.f11074g = r2     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r11.disconnect()
            r8.remove(r1)
            return r10
        L_0x0333:
            java.lang.String r2 = r9.toExternalForm()     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            int r4 = r4 + r5
            r3 = r24
            r5 = r6
            r6 = r27
            r7 = r28
            de.ozerov.fully.x2 r2 = a(r2, r3, r4, r5, r6, r7)     // Catch:{ SocketTimeoutException -> 0x0097, Exception -> 0x0091, all -> 0x008b }
            r11.disconnect()
            r8.remove(r1)
            return r2
        L_0x034a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ca }
            r4.<init>()     // Catch:{ all -> 0x02ca }
            java.lang.String r5 = "Error when downloading "
            r4.append(r5)     // Catch:{ all -> 0x02ca }
            r4.append(r1)     // Catch:{ all -> 0x02ca }
            java.lang.String r5 = " "
            r4.append(r5)     // Catch:{ all -> 0x02ca }
            java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x02ca }
            r4.append(r5)     // Catch:{ all -> 0x02ca }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02ca }
            g7.l.d(r14, r4)     // Catch:{ all -> 0x02ca }
            r4 = 500(0x1f4, float:7.0E-43)
            r10.f11070b = r4     // Catch:{ all -> 0x02ca }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x02ca }
            r4 = 100
            java.lang.String r2 = n2.a.a(r4, r2)     // Catch:{ all -> 0x02ca }
            r10.f11074g = r2     // Catch:{ all -> 0x02ca }
            if (r16 == 0) goto L_0x0382
            r16.close()     // Catch:{ IOException -> 0x0380 }
            goto L_0x0382
        L_0x0380:
            goto L_0x0387
        L_0x0382:
            if (r3 == 0) goto L_0x0387
            r3.close()     // Catch:{ IOException -> 0x0380 }
        L_0x0387:
            if (r11 == 0) goto L_0x038c
            r11.disconnect()
        L_0x038c:
            r8.remove(r1)
            return r10
        L_0x0390:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ca }
            r4.<init>()     // Catch:{ all -> 0x02ca }
            java.lang.String r5 = "Timeout when downloading "
            r4.append(r5)     // Catch:{ all -> 0x02ca }
            r4.append(r1)     // Catch:{ all -> 0x02ca }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02ca }
            g7.l.d(r14, r4)     // Catch:{ all -> 0x02ca }
            r4 = 408(0x198, float:5.72E-43)
            r10.f11070b = r4     // Catch:{ all -> 0x02ca }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x02ca }
            r4 = 100
            java.lang.String r2 = n2.a.a(r4, r2)     // Catch:{ all -> 0x02ca }
            r10.f11074g = r2     // Catch:{ all -> 0x02ca }
            if (r16 == 0) goto L_0x03bc
            r16.close()     // Catch:{ IOException -> 0x03ba }
            goto L_0x03bc
        L_0x03ba:
            goto L_0x03c1
        L_0x03bc:
            if (r3 == 0) goto L_0x03c1
            r3.close()     // Catch:{ IOException -> 0x03ba }
        L_0x03c1:
            if (r11 == 0) goto L_0x03c6
            r11.disconnect()
        L_0x03c6:
            r8.remove(r1)
            return r10
        L_0x03ca:
            if (r16 == 0) goto L_0x03d2
            r16.close()     // Catch:{ IOException -> 0x03d0 }
            goto L_0x03d2
        L_0x03d0:
            goto L_0x03d7
        L_0x03d2:
            if (r3 == 0) goto L_0x03d7
            r3.close()     // Catch:{ IOException -> 0x03d0 }
        L_0x03d7:
            if (r11 == 0) goto L_0x03dc
            r11.disconnect()
        L_0x03dc:
            r8.remove(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0808y2.a(java.lang.String, java.io.File, int, java.net.CookieManager, boolean, java.lang.String):de.ozerov.fully.x2");
    }

    public static C0802x2 b(Context context, File file, String str) {
        int i = 3;
        while (true) {
            C0802x2 a8 = a(str, file, 0, (CookieManager) null, false, (String) null);
            if (Thread.currentThread().isInterrupted()) {
                return a8;
            }
            int i8 = a8.f11070b;
            if ((i8 != 500 && i8 != 408) || i - 1 <= 0) {
                return a8;
            }
            StringBuilder s8 = g.s("Going to retry the file download as failed for ", str, " with code ");
            s8.append(a8.f11070b);
            s8.append(" ");
            s8.append(a8.f11074g);
            String sb = s8.toString();
            Log.e("y2", sb);
            a.a1(1, context, sb);
            try {
                Thread.sleep(RangedBeacon.DEFAULT_MAX_TRACKING_AGE);
            } catch (InterruptedException unused) {
                return a8;
            }
        }
    }

    public static String c(String str) {
        try {
            String file = new URL(str).getFile();
            return file.substring(file.lastIndexOf(47) + 1).split("\\?")[0].split("#")[0];
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] d(String str, String str2) {
        String x8 = e.x(e.x(e.y("HTTP/1.1 ", str, "\r\n"), "Content-Type: text/html; charset=iso-8859-1\r\n"), "\r\n");
        return (x8 + str2 + "\r\n").getBytes();
    }

    public static String e(Context context, Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals("content")) {
            return MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
        }
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
    }

    public static String f(String str) {
        C0802x2 a8 = a(str, (File) null, 0, (CookieManager) null, false, (String) null);
        if (a8.f11070b != 200) {
            return "";
        }
        return a8.e;
    }

    public static String g(String str) {
        URI uri = new URI(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (scheme == null || host == null) {
            throw new URISyntaxException(str, C1477r.d("Missing parts in the URL ", str));
        }
        return scheme + "://" + host;
    }

    public static String h(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        return sb.toString();
    }

    public static byte[] i(URL url, int i) {
        if (i <= 0) {
            return null;
        }
        try {
            URLConnection openConnection = url.openConnection();
            openConnection.setConnectTimeout(5000);
            openConnection.setReadTimeout(15000);
            openConnection.connect();
            return f.a(openConnection.getInputStream());
        } catch (IOException e) {
            StringBuilder p3 = g.p(i, "getRawData failed for the attempt #", " due to ");
            p3.append(e.getMessage());
            Log.e("y2", p3.toString());
            return i(url, i - 1);
        }
    }

    public static String j(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(8000);
            httpURLConnection.setReadTimeout(12000);
            if (url.getHost().equals("test.fully-kiosk.com")) {
                httpURLConnection.setRequestProperty("X-Test-Token", "123456");
            }
            httpURLConnection.connect();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            e = e;
            Log.w("y2", "Error getting content from URL due to " + e.getMessage());
            return null;
        } catch (Error e8) {
            e = e8;
            Log.w("y2", "Error getting content from URL due to " + e.getMessage());
            return null;
        }
    }

    public static String k(String str) {
        URI uri = new URI(str);
        if (uri.getHost() == null || uri.getScheme() == null) {
            throw new URISyntaxException(str, "No scheme/host identified in URL ".concat(str));
        }
        String str2 = uri.getScheme() + "://" + uri.getHost();
        if (uri.getPath() == null) {
            return str2;
        }
        String[] split = uri.getPath().split("/");
        if (split.length <= 1) {
            return str2;
        }
        StringBuilder r8 = g.r(str2);
        r8.append(split[0]);
        r8.append("/");
        r8.append(split[1]);
        return r8.toString();
    }

    public static String l(String str, HashMap hashMap, int i, int i8, int i9) {
        try {
            return m(str, (String) null, h(hashMap).getBytes(StandardCharsets.UTF_8), i, i8, i9);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: android.os.Handler} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v0, types: [android.os.Handler] */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.os.Handler] */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: type inference failed for: r10v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r1 = r0;
        r11 = null;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        r13 = r11;
        r11 = null;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f9, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r10.removeCallbacksAndMessages((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0134, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0138, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013d, code lost:
        r8.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0141, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r10.removeCallbacksAndMessages((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0180, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0185, code lost:
        r8.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0189, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[ExcHandler: all (r0v21 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:19:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f9 A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0130 A[SYNTHETIC, Splitter:B:64:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0138 A[Catch:{ Exception -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013d A[Catch:{ Exception -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0178 A[SYNTHETIC, Splitter:B:84:0x0178] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0180 A[Catch:{ Exception -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0185 A[Catch:{ Exception -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x014f A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m(java.lang.String r16, java.lang.String r17, byte[] r18, int r19, int r20, int r21) {
        /*
            r1 = r16
            r2 = r17
            r3 = r20
            java.lang.String r4 = " "
            java.lang.String r5 = "y2"
            r6 = r21
        L_0x000c:
            java.lang.String r0 = "POST Request Failed with response "
            r7 = 0
            java.net.URL r8 = new java.net.URL     // Catch:{ Exception -> 0x00f3, Error -> 0x00ea, all -> 0x00e4 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x00f3, Error -> 0x00ea, all -> 0x00e4 }
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ Exception -> 0x00f3, Error -> 0x00ea, all -> 0x00e4 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x00f3, Error -> 0x00ea, all -> 0x00e4 }
            r9 = r19
            r8.setConnectTimeout(r9)     // Catch:{ Exception -> 0x0044, Error -> 0x003c, all -> 0x0036 }
            r8.setReadTimeout(r3)     // Catch:{ Exception -> 0x0044, Error -> 0x003c, all -> 0x0036 }
            java.lang.String r10 = "POST"
            r8.setRequestMethod(r10)     // Catch:{ Exception -> 0x0044, Error -> 0x003c, all -> 0x0036 }
            r10 = 1
            r8.setDoInput(r10)     // Catch:{ Exception -> 0x0044, Error -> 0x003c, all -> 0x0036 }
            r8.setDoOutput(r10)     // Catch:{ Exception -> 0x0044, Error -> 0x003c, all -> 0x0036 }
            if (r2 == 0) goto L_0x0046
            java.lang.String r10 = "Content-Type"
            r8.setRequestProperty(r10, r2)     // Catch:{ Exception -> 0x0044, Error -> 0x003c, all -> 0x0036 }
            goto L_0x0046
        L_0x0036:
            r0 = move-exception
            r1 = r0
            r10 = r7
        L_0x0039:
            r11 = r10
            goto L_0x0176
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            r12 = r18
            r10 = r7
        L_0x0040:
            r11 = r10
        L_0x0041:
            r13 = r11
            goto L_0x00f5
        L_0x0044:
            r0 = move-exception
            goto L_0x003d
        L_0x0046:
            android.os.Handler r10 = new android.os.Handler     // Catch:{ Exception -> 0x0044, Error -> 0x003c, all -> 0x0036 }
            android.os.Looper r11 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0044, Error -> 0x003c, all -> 0x0036 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x0044, Error -> 0x003c, all -> 0x0036 }
            U.p r11 = new U.p     // Catch:{ Exception -> 0x00e2, Error -> 0x00de, all -> 0x009f }
            r11.<init>((java.lang.String) r1, (java.net.HttpURLConnection) r8)     // Catch:{ Exception -> 0x00e2, Error -> 0x00de, all -> 0x009f }
            long r12 = (long) r3     // Catch:{ Exception -> 0x00e2, Error -> 0x00de, all -> 0x009f }
            r10.postDelayed(r11, r12)     // Catch:{ Exception -> 0x00e2, Error -> 0x00de, all -> 0x009f }
            java.io.OutputStream r11 = r8.getOutputStream()     // Catch:{ Exception -> 0x00e2, Error -> 0x00de, all -> 0x009f }
            r12 = r18
            r11.write(r12)     // Catch:{ Exception -> 0x00dc, Error -> 0x00d9 }
            r11.flush()     // Catch:{ Exception -> 0x00dc, Error -> 0x00d9 }
            r11.close()     // Catch:{ Exception -> 0x00dc, Error -> 0x00d9 }
            int r11 = r8.getResponseCode()     // Catch:{ Exception -> 0x00ad, Error -> 0x00aa, all -> 0x009f }
            r13 = 200(0xc8, float:2.8E-43)
            if (r11 != r13) goto L_0x00af
            java.lang.String r11 = ""
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            java.io.InputStreamReader r13 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            java.io.InputStream r14 = r8.getInputStream()     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            r13.<init>(r14)     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            r0.<init>(r13)     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
        L_0x007f:
            java.lang.String r13 = r0.readLine()     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            if (r13 == 0) goto L_0x00c7
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            boolean r14 = r14.isInterrupted()     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            if (r14 != 0) goto L_0x00c7
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            r14.<init>()     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            r14.append(r11)     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            r14.append(r13)     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            java.lang.String r11 = r14.toString()     // Catch:{ Exception -> 0x00a8, Error -> 0x00a4, all -> 0x009f }
            goto L_0x007f
        L_0x009f:
            r0 = move-exception
            r1 = r0
            r11 = r7
            goto L_0x0176
        L_0x00a4:
            r0 = move-exception
        L_0x00a5:
            r13 = r11
            r11 = r7
            goto L_0x00f5
        L_0x00a8:
            r0 = move-exception
            goto L_0x00a5
        L_0x00aa:
            r0 = move-exception
        L_0x00ab:
            r11 = r7
            goto L_0x0041
        L_0x00ad:
            r0 = move-exception
            goto L_0x00ab
        L_0x00af:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ad, Error -> 0x00aa, all -> 0x009f }
            r13.<init>(r0)     // Catch:{ Exception -> 0x00ad, Error -> 0x00aa, all -> 0x009f }
            r13.append(r11)     // Catch:{ Exception -> 0x00ad, Error -> 0x00aa, all -> 0x009f }
            java.lang.String r0 = " for "
            r13.append(r0)     // Catch:{ Exception -> 0x00ad, Error -> 0x00aa, all -> 0x009f }
            r13.append(r1)     // Catch:{ Exception -> 0x00ad, Error -> 0x00aa, all -> 0x009f }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x00ad, Error -> 0x00aa, all -> 0x009f }
            android.util.Log.w(r5, r0)     // Catch:{ Exception -> 0x00ad, Error -> 0x00aa, all -> 0x009f }
            r11 = r7
        L_0x00c7:
            r10.removeCallbacksAndMessages(r7)     // Catch:{ Exception -> 0x00cf }
            r8.disconnect()     // Catch:{ Exception -> 0x00cf }
            goto L_0x0145
        L_0x00cf:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0145
        L_0x00d5:
            r0 = move-exception
            r1 = r0
            goto L_0x0176
        L_0x00d9:
            r0 = move-exception
        L_0x00da:
            r13 = r7
            goto L_0x00f5
        L_0x00dc:
            r0 = move-exception
            goto L_0x00da
        L_0x00de:
            r0 = move-exception
        L_0x00df:
            r12 = r18
            goto L_0x00ab
        L_0x00e2:
            r0 = move-exception
            goto L_0x00df
        L_0x00e4:
            r0 = move-exception
            r1 = r0
            r8 = r7
            r10 = r8
            goto L_0x0039
        L_0x00ea:
            r0 = move-exception
        L_0x00eb:
            r12 = r18
            r9 = r19
            r8 = r7
            r10 = r8
            goto L_0x0040
        L_0x00f3:
            r0 = move-exception
            goto L_0x00eb
        L_0x00f5:
            boolean r14 = r0 instanceof java.io.InterruptedIOException     // Catch:{ all -> 0x00d5 }
            if (r14 == 0) goto L_0x0100
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d5 }
            r14.interrupt()     // Catch:{ all -> 0x00d5 }
        L_0x0100:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r14.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r15 = "POST Request Failed for "
            r14.append(r15)     // Catch:{ all -> 0x00d5 }
            r14.append(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r15 = " due to "
            r14.append(r15)     // Catch:{ all -> 0x00d5 }
            java.lang.Class r15 = r0.getClass()     // Catch:{ all -> 0x00d5 }
            java.lang.String r15 = r15.getSimpleName()     // Catch:{ all -> 0x00d5 }
            r14.append(r15)     // Catch:{ all -> 0x00d5 }
            r14.append(r4)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00d5 }
            r14.append(r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x00d5 }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x00d5 }
            if (r10 == 0) goto L_0x0136
            r10.removeCallbacksAndMessages(r7)     // Catch:{ Exception -> 0x0134 }
            goto L_0x0136
        L_0x0134:
            r0 = move-exception
            goto L_0x0141
        L_0x0136:
            if (r11 == 0) goto L_0x013b
            r11.close()     // Catch:{ Exception -> 0x0134 }
        L_0x013b:
            if (r8 == 0) goto L_0x0144
            r8.disconnect()     // Catch:{ Exception -> 0x0134 }
            goto L_0x0144
        L_0x0141:
            r0.printStackTrace()
        L_0x0144:
            r11 = r13
        L_0x0145:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 == 0) goto L_0x0150
            return r11
        L_0x0150:
            if (r11 == 0) goto L_0x0153
            return r11
        L_0x0153:
            int r6 = r6 + -1
            if (r6 > 0) goto L_0x0158
            return r11
        L_0x0158:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Going to retry failed POST Request for "
            r0.<init>(r7)
            r0.append(r1)
            r0.append(r4)
            r0.append(r6)
            java.lang.String r7 = " more times"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r5, r0)
            goto L_0x000c
        L_0x0176:
            if (r10 == 0) goto L_0x017e
            r10.removeCallbacksAndMessages(r7)     // Catch:{ Exception -> 0x017c }
            goto L_0x017e
        L_0x017c:
            r0 = move-exception
            goto L_0x0189
        L_0x017e:
            if (r11 == 0) goto L_0x0183
            r11.close()     // Catch:{ Exception -> 0x017c }
        L_0x0183:
            if (r8 == 0) goto L_0x018c
            r8.disconnect()     // Catch:{ Exception -> 0x017c }
            goto L_0x018c
        L_0x0189:
            r0.printStackTrace()
        L_0x018c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0808y2.m(java.lang.String, java.lang.String, byte[], int, int, int):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.X509TrustManager[]} */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, javax.net.ssl.HostnameVerifier] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void n(javax.net.ssl.HttpsURLConnection r4) {
        /*
            de.ozerov.fully.v2 r0 = new de.ozerov.fully.v2     // Catch:{ Exception -> 0x002a }
            r0.<init>()     // Catch:{ Exception -> 0x002a }
            r4.setHostnameVerifier(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch:{ Exception -> 0x002a }
            de.ozerov.fully.w2 r1 = new de.ozerov.fully.w2     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r2 = 1
            javax.net.ssl.X509TrustManager[] r2 = new javax.net.ssl.X509TrustManager[r2]     // Catch:{ Exception -> 0x002a }
            r3 = 0
            r2[r3] = r1     // Catch:{ Exception -> 0x002a }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r3 = 0
            r0.init(r3, r2, r1)     // Catch:{ Exception -> 0x002a }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ Exception -> 0x002a }
            r4.setSSLSocketFactory(r0)     // Catch:{ Exception -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r4 = move-exception
            r4.printStackTrace()
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0808y2.n(javax.net.ssl.HttpsURLConnection):void");
    }
}
