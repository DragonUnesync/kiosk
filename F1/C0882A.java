package f1;

import P0.l;
import android.net.Uri;

/* renamed from: f1.A  reason: case insensitive filesystem */
public final class C0882A {

    /* renamed from: a  reason: collision with root package name */
    public final long f11465a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11466b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f11467c;

    public C0882A(int i, long j7, Uri uri) {
        this.f11465a = j7;
        this.f11466b = i;
        this.f11467c = uri;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[Catch:{ Exception -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[Catch:{ Exception -> 0x0058 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static H3.i0 a(android.net.Uri r18, java.lang.String r19) {
        /*
            r0 = 1
            r1 = 4
            java.lang.String r2 = "initialCapacity"
            H3.C0103u.e(r1, r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = P0.z.f3748a
            java.lang.String r2 = ","
            r3 = -1
            r4 = r19
            java.lang.String[] r2 = r4.split(r2, r3)
            int r4 = r2.length
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0018:
            if (r6 >= r4) goto L_0x00d8
            r8 = r2[r6]
            java.lang.String r9 = ";"
            java.lang.String[] r9 = r8.split(r9, r3)
            int r10 = r9.length
            r11 = -1
            r14 = 0
            r15 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x002b:
            if (r14 >= r10) goto L_0x009b
            r12 = r9[r14]
            java.lang.String r3 = "="
            r13 = 2
            java.lang.String[] r3 = r12.split(r3, r13)     // Catch:{ Exception -> 0x0058 }
            r13 = r3[r5]     // Catch:{ Exception -> 0x0058 }
            r3 = r3[r0]     // Catch:{ Exception -> 0x0058 }
            int r5 = r13.hashCode()     // Catch:{ Exception -> 0x0058 }
            r0 = 113759(0x1bc5f, float:1.5941E-40)
            if (r5 == r0) goto L_0x0064
            r0 = 116079(0x1c56f, float:1.62661E-40)
            if (r5 == r0) goto L_0x005a
            r0 = 1524180539(0x5ad9263b, float:3.05610524E16)
            if (r5 == r0) goto L_0x004e
            goto L_0x006e
        L_0x004e:
            java.lang.String r0 = "rtptime"
            boolean r0 = r13.equals(r0)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x006e
            r0 = 2
            goto L_0x006f
        L_0x0058:
            r0 = move-exception
            goto L_0x0096
        L_0x005a:
            java.lang.String r0 = "url"
            boolean r0 = r13.equals(r0)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x006e
            r0 = 0
            goto L_0x006f
        L_0x0064:
            java.lang.String r0 = "seq"
            boolean r0 = r13.equals(r0)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x006e
            r0 = 1
            goto L_0x006f
        L_0x006e:
            r0 = -1
        L_0x006f:
            if (r0 == 0) goto L_0x008a
            r5 = 1
            if (r0 == r5) goto L_0x0085
            r5 = 2
            if (r0 != r5) goto L_0x007f
            long r16 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x0058 }
        L_0x007b:
            r0 = r18
        L_0x007d:
            r3 = 1
            goto L_0x0091
        L_0x007f:
            r0 = 0
            M0.J r0 = M0.J.b(r0, r13)     // Catch:{ Exception -> 0x0058 }
            throw r0     // Catch:{ Exception -> 0x0058 }
        L_0x0085:
            int r11 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0058 }
            goto L_0x007b
        L_0x008a:
            r0 = r18
            android.net.Uri r15 = b(r0, r3)     // Catch:{ Exception -> 0x0058 }
            goto L_0x007d
        L_0x0091:
            int r14 = r14 + r3
            r0 = 1
            r3 = -1
            r5 = 0
            goto L_0x002b
        L_0x0096:
            M0.J r0 = M0.J.b(r0, r12)
            throw r0
        L_0x009b:
            r0 = r18
            if (r15 == 0) goto L_0x00b4
            java.lang.String r3 = r15.getScheme()
            if (r3 == 0) goto L_0x00b4
            r3 = -1
            r12 = r16
            if (r11 != r3) goto L_0x00b6
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r0 = 0
            goto L_0x00d3
        L_0x00b6:
            f1.A r5 = new f1.A
            r5.<init>(r11, r12, r15)
            int r8 = r1.length
            r9 = 1
            int r10 = r7 + 1
            int r8 = H3.I.f(r8, r10)
            int r11 = r1.length
            if (r8 > r11) goto L_0x00c7
            goto L_0x00cb
        L_0x00c7:
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r8)
        L_0x00cb:
            r1[r7] = r5
            int r6 = r6 + r9
            r7 = r10
            r0 = 1
            r5 = 0
            goto L_0x0018
        L_0x00d3:
            M0.J r0 = M0.J.b(r0, r8)
            throw r0
        L_0x00d8:
            H3.i0 r0 = H3.O.i(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0882A.a(android.net.Uri, java.lang.String):H3.i0");
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        l.d(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        if (host.equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith("/")) {
            return l.z(uri2, str);
        }
        return l.z(uri2.concat("/"), str);
    }
}
