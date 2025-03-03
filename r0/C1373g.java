package r0;

import D2.C0073b;
import N5.c;
import Y.i;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: r0.g  reason: case insensitive filesystem */
public abstract class C1373g {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14805a = new c(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f14806b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f14807c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final i f14808d = new i((Object) null);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C0073b(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14806b = threadPoolExecutor;
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((C1370d) list.get(i8)).e);
            sb.append("-");
            sb.append(i);
            if (i8 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0082, code lost:
        throw r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0054 A[Catch:{ all -> 0x00b4, all -> 0x007e, all -> 0x001d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005d A[SYNTHETIC, Splitter:B:37:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static r0.C1372f b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = F.h.H(r1)
            android.os.Trace.beginSection(r1)
            N5.c r1 = f14805a
            java.lang.Object r2 = r1.h(r8)     // Catch:{ all -> 0x001d }
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0020
            r0.f r8 = new r0.f     // Catch:{ all -> 0x001d }
            r8.<init>((android.graphics.Typeface) r2)     // Catch:{ all -> 0x001d }
            android.os.Trace.endSection()
            return r8
        L_0x001d:
            r8 = move-exception
            goto L_0x00c3
        L_0x0020:
            V1.f r10 = r0.C1369c.a(r9, r10)     // Catch:{ NameNotFoundException -> 0x00b9 }
            int r2 = r10.f5768b     // Catch:{ all -> 0x001d }
            r3 = 0
            java.util.List r10 = r10.f5767a
            r4 = -3
            if (r2 == 0) goto L_0x0032
            if (r2 == r0) goto L_0x0030
        L_0x002e:
            r2 = -3
            goto L_0x0052
        L_0x0030:
            r2 = -2
            goto L_0x0052
        L_0x0032:
            java.lang.Object r2 = r10.get(r3)     // Catch:{ all -> 0x001d }
            r0.h[] r2 = (r0.C1374h[]) r2     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0051
            int r5 = r2.length     // Catch:{ all -> 0x001d }
            if (r5 != 0) goto L_0x003e
            goto L_0x0051
        L_0x003e:
            int r5 = r2.length     // Catch:{ all -> 0x001d }
            r6 = 0
        L_0x0040:
            if (r6 >= r5) goto L_0x004f
            r7 = r2[r6]     // Catch:{ all -> 0x001d }
            int r7 = r7.e     // Catch:{ all -> 0x001d }
            if (r7 == 0) goto L_0x004d
            if (r7 >= 0) goto L_0x004b
            goto L_0x002e
        L_0x004b:
            r2 = r7
            goto L_0x0052
        L_0x004d:
            int r6 = r6 + r0
            goto L_0x0040
        L_0x004f:
            r2 = 0
            goto L_0x0052
        L_0x0051:
            r2 = 1
        L_0x0052:
            if (r2 == 0) goto L_0x005d
            r0.f r8 = new r0.f     // Catch:{ all -> 0x001d }
            r8.<init>((int) r2)     // Catch:{ all -> 0x001d }
            android.os.Trace.endSection()
            return r8
        L_0x005d:
            int r2 = r10.size()     // Catch:{ all -> 0x001d }
            if (r2 <= r0) goto L_0x0083
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x001d }
            r2 = 29
            if (r0 < r2) goto L_0x0083
            D7.b r0 = m0.C1200f.f13323a     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r0 = F.h.H(r0)     // Catch:{ all -> 0x001d }
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x001d }
            D7.b r0 = m0.C1200f.f13323a     // Catch:{ all -> 0x007e }
            android.graphics.Typeface r9 = r0.h(r9, r10, r11)     // Catch:{ all -> 0x007e }
            android.os.Trace.endSection()     // Catch:{ all -> 0x001d }
            goto L_0x009d
        L_0x007e:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x001d }
            throw r8     // Catch:{ all -> 0x001d }
        L_0x0083:
            java.lang.Object r10 = r10.get(r3)     // Catch:{ all -> 0x001d }
            r0.h[] r10 = (r0.C1374h[]) r10     // Catch:{ all -> 0x001d }
            D7.b r0 = m0.C1200f.f13323a     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r0 = F.h.H(r0)     // Catch:{ all -> 0x001d }
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x001d }
            D7.b r0 = m0.C1200f.f13323a     // Catch:{ all -> 0x00b4 }
            android.graphics.Typeface r9 = r0.g(r9, r10, r11)     // Catch:{ all -> 0x00b4 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x001d }
        L_0x009d:
            if (r9 == 0) goto L_0x00ab
            r1.l(r8, r9)     // Catch:{ all -> 0x001d }
            r0.f r8 = new r0.f     // Catch:{ all -> 0x001d }
            r8.<init>((android.graphics.Typeface) r9)     // Catch:{ all -> 0x001d }
            android.os.Trace.endSection()
            return r8
        L_0x00ab:
            r0.f r8 = new r0.f     // Catch:{ all -> 0x001d }
            r8.<init>((int) r4)     // Catch:{ all -> 0x001d }
            android.os.Trace.endSection()
            return r8
        L_0x00b4:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x001d }
            throw r8     // Catch:{ all -> 0x001d }
        L_0x00b9:
            r0.f r8 = new r0.f     // Catch:{ all -> 0x001d }
            r9 = -1
            r8.<init>((int) r9)     // Catch:{ all -> 0x001d }
            android.os.Trace.endSection()
            return r8
        L_0x00c3:
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C1373g.b(java.lang.String, android.content.Context, java.util.List, int):r0.f");
    }
}
