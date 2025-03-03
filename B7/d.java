package B7;

import C6.c;
import N7.a;
import P6.f;
import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.b;
import android.util.Log;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.data.StringFormat;
import org.acra.sender.HttpSender$Method;
import r7.C1395d;
import r7.C1399h;
import u7.C1500b;
import u7.C1501c;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final C1395d f465a;

    /* renamed from: b  reason: collision with root package name */
    public final C1399h f466b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f467c;

    /* renamed from: d  reason: collision with root package name */
    public final HttpSender$Method f468d;
    public final StringFormat e;

    public d(C1395d dVar, HttpSender$Method httpSender$Method, StringFormat stringFormat, String str) {
        f.e(dVar, "config");
        this.f465a = dVar;
        C1399h hVar = (C1399h) a.k(dVar, C1399h.class);
        this.f466b = hVar;
        Uri parse = Uri.parse(str == null ? hVar.f15009V : str);
        f.d(parse, "parse(...)");
        this.f467c = parse;
        this.f468d = httpSender$Method == null ? hVar.f15012Y : httpSender$Method;
        this.e = stringFormat == null ? dVar.f14975r0 : stringFormat;
    }

    public static void b(C1395d dVar, Context context, HttpSender$Method httpSender$Method, String str, String str2, String str3, int i, int i8, Map map, String str4, URL url, ArrayList arrayList) {
        Context context2 = context;
        String str5 = str4;
        URL url2 = url;
        C1395d dVar2 = dVar;
        f.e(dVar, "configuration");
        f.e(context2, "context");
        f.e(httpSender$Method, "method");
        f.e(str, "contentType");
        f.e(str5, "content");
        f.e(url2, "url");
        int i9 = c.f464a[httpSender$Method.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                c(dVar, context, httpSender$Method, str, str2, str3, i, i8, map, str4, url);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    f.e(uri, "attachment");
                    try {
                        String n4 = b.n(context2, uri);
                        new C1500b(dVar, context, str2, str3, i, i8, map).d(new URL(url2 + "-" + n4), uri);
                    } catch (FileNotFoundException e8) {
                        ErrorReporter errorReporter = C1247a.f13789a;
                        Log.w("Not sending attachment", e8);
                    }
                }
                return;
            }
            throw new C6.b(0);
        } else if (arrayList.isEmpty()) {
            c(dVar, context, httpSender$Method, str, str2, str3, i, i8, map, str4, url);
        } else {
            new C1501c(dVar, context, str, str2, str3, i, i8, map).d(url2, new c(str5, arrayList));
        }
    }

    public static void c(C1395d dVar, Context context, HttpSender$Method httpSender$Method, String str, String str2, String str3, int i, int i8, Map map, String str4, URL url) {
        String str5 = str4;
        URL url2 = url;
        f.e(dVar, "configuration");
        f.e(context, "context");
        f.e(httpSender$Method, "method");
        String str6 = str;
        f.e(str6, "contentType");
        f.e(str5, "content");
        f.e(url2, "url");
        new C1500b(dVar, context, httpSender$Method, str6, str2, str3, i, i8, map).d(url2, str5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039 A[SYNTHETIC, Splitter:B:13:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076 A[Catch:{ Exception -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r19, s7.C1408a r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r1 = r18
            r3 = r19
            java.lang.String r0 = "context"
            P6.f.e(r3, r0)
            org.acra.sender.HttpSender$Method r14 = r1.f468d
            org.acra.data.StringFormat r2 = r1.e
            r7.d r15 = r1.f465a
            r7.h r10 = r1.f466b
            P6.f.e(r3, r0)
            android.net.Uri r0 = r1.f467c     // Catch:{ Exception -> 0x0031 }
            java.lang.String r11 = r0.toString()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "toString(...)"
            P6.f.d(r11, r0)     // Catch:{ Exception -> 0x0031 }
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r10.f15010W     // Catch:{ Exception -> 0x0031 }
            r4 = 0
            if (r0 == 0) goto L_0x0034
            int r0 = r0.length()     // Catch:{ Exception -> 0x0031 }
            if (r0 != 0) goto L_0x002d
            goto L_0x0034
        L_0x002d:
            java.lang.String r0 = r10.f15010W     // Catch:{ Exception -> 0x0031 }
            r12 = r0
            goto L_0x0035
        L_0x0031:
            r0 = move-exception
            goto L_0x00b8
        L_0x0034:
            r12 = r4
        L_0x0035:
            java.lang.String r0 = r10.f15011X
            if (r0 == 0) goto L_0x0042
            int r5 = r0.length()     // Catch:{ Exception -> 0x0031 }
            if (r5 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r13 = r0
            goto L_0x0043
        L_0x0042:
            r13 = r4
        L_0x0043:
            java.lang.Class r5 = r15.f14973o0     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "clazz"
            P6.f.e(r5, r0)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = "Failed to create instance of class "
            java.lang.Object r4 = r5.newInstance()     // Catch:{ InstantiationException -> 0x0063, IllegalAccessException -> 0x0051 }
            goto L_0x0074
        L_0x0051:
            r0 = move-exception
            r7 = r0
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a     // Catch:{ Exception -> 0x0031 }
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r5.getName()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r6.concat(r0)     // Catch:{ Exception -> 0x0031 }
            n2.a.B(r0, r7)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0074
        L_0x0063:
            r0 = move-exception
            r7 = r0
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a     // Catch:{ Exception -> 0x0031 }
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r5.getName()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r6.concat(r0)     // Catch:{ Exception -> 0x0031 }
            n2.a.B(r0, r7)     // Catch:{ Exception -> 0x0031 }
        L_0x0074:
            if (r4 != 0) goto L_0x007b
            o7.a r4 = new o7.a     // Catch:{ Exception -> 0x0031 }
            r4.<init>()     // Catch:{ Exception -> 0x0031 }
        L_0x007b:
            o7.a r4 = (o7.C1327a) r4     // Catch:{ Exception -> 0x0031 }
            java.util.ArrayList r0 = o7.C1327a.a(r3, r15)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "format"
            P6.f.e(r2, r4)     // Catch:{ Exception -> 0x0031 }
            java.util.List r6 = r15.f14958Z     // Catch:{ Exception -> 0x0031 }
            java.lang.String r8 = "\n"
            java.lang.String r7 = "&"
            r9 = 1
            r4 = r2
            r5 = r20
            java.lang.String r16 = r4.toFormattedString(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0031 }
            r4 = r20
            java.net.URL r17 = r14.createURL(r11, r4)     // Catch:{ Exception -> 0x0031 }
            r7.d r4 = r1.f465a     // Catch:{ Exception -> 0x0031 }
            org.acra.sender.HttpSender$Method r5 = r1.f468d     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = r2.getMatchingHttpContentType()     // Catch:{ Exception -> 0x0031 }
            int r8 = r10.f15013Z     // Catch:{ Exception -> 0x0031 }
            int r9 = r10.f15014a0     // Catch:{ Exception -> 0x0031 }
            java.util.Map r10 = r10.f15023j0     // Catch:{ Exception -> 0x0031 }
            r2 = r4
            r3 = r19
            r4 = r5
            r5 = r6
            r6 = r12
            r7 = r13
            r11 = r16
            r12 = r17
            r13 = r0
            b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0031 }
            return
        L_0x00b8:
            B7.i r2 = new B7.i
            org.acra.data.StringFormat r3 = r15.f14975r0
            java.lang.String r4 = r14.name()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Error while sending "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " report via Http "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B7.d.a(android.content.Context, s7.a, android.os.Bundle):void");
    }
}
