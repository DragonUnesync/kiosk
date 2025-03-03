package m0;

import D7.b;
import F.h;
import N5.c;
import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: m0.f  reason: case insensitive filesystem */
public abstract class C1200f {

    /* renamed from: a  reason: collision with root package name */
    public static final b f13323a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f13324b = new c(16);

    static {
        Trace.beginSection(h.H("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f13323a = new b();
        } else if (i >= 28) {
            f13323a = new C1203i();
        } else if (i >= 26) {
            f13323a = new C1203i();
        } else {
            if (i >= 24) {
                Method method = C1202h.f13332W;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f13323a = new b();
                }
            }
            f13323a = new b();
        }
        Trace.endSection();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r9.equals(r12) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r16, l0.d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, l0.C1169b r23, boolean r24) {
        /*
            r0 = r16
            r1 = r17
            r7 = r22
            r2 = r23
            r3 = 7
            r4 = 11
            r8 = 2
            r5 = 0
            r6 = 1
            boolean r9 = r1 instanceof l0.g
            r10 = -3
            if (r9 == 0) goto L_0x01e0
            l0.g r1 = (l0.g) r1
            java.lang.String r9 = r1.e
            if (r9 == 0) goto L_0x0033
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto L_0x0020
            goto L_0x0033
        L_0x0020:
            android.graphics.Typeface r9 = android.graphics.Typeface.create(r9, r5)
            android.graphics.Typeface r12 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r5)
            if (r9 == 0) goto L_0x0033
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r9 = 0
        L_0x0034:
            if (r9 == 0) goto L_0x004a
            if (r2 == 0) goto L_0x0049
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            a1.c r1 = new a1.c
            r1.<init>((java.lang.Object) r2, (int) r4, (java.lang.Object) r9)
            r0.post(r1)
        L_0x0049:
            return r9
        L_0x004a:
            if (r24 == 0) goto L_0x0054
            int r4 = r1.f13077d
            if (r4 != 0) goto L_0x0052
        L_0x0050:
            r4 = 1
            goto L_0x0057
        L_0x0052:
            r4 = 0
            goto L_0x0057
        L_0x0054:
            if (r2 != 0) goto L_0x0052
            goto L_0x0050
        L_0x0057:
            r9 = -1
            if (r24 == 0) goto L_0x005d
            int r12 = r1.f13076c
            goto L_0x005e
        L_0x005d:
            r12 = -1
        L_0x005e:
            android.os.Handler r13 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r13.<init>(r14)
            k2.q r14 = new k2.q
            r15 = 4
            r14.<init>((int) r15)
            r14.f13026V = r2
            r0.d r2 = r1.f13075b
            if (r2 == 0) goto L_0x0093
            r0.d r1 = r1.f13074a
            java.lang.Object[] r15 = new java.lang.Object[r8]
            r15[r5] = r1
            r15[r6] = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            r2 = 0
        L_0x0081:
            if (r2 >= r8) goto L_0x008d
            r11 = r15[r2]
            j$.util.Objects.requireNonNull(r11)
            r1.add(r11)
            int r2 = r2 + r6
            goto L_0x0081
        L_0x008d:
            java.util.List r1 = j$.util.DesugarCollections.unmodifiableList(r1)
        L_0x0091:
            r11 = r1
            goto L_0x00ab
        L_0x0093:
            r0.d r1 = r1.f13074a
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            r2 = r2[r5]
            j$.util.Objects.requireNonNull(r2)
            r1.add(r2)
            java.util.List r1 = j$.util.DesugarCollections.unmodifiableList(r1)
            goto L_0x0091
        L_0x00ab:
            de.ozerov.fully.K2 r15 = new de.ozerov.fully.K2
            F.g r1 = new F.g
            r1.<init>(r13)
            r2 = 22
            r15.<init>((java.lang.Object) r14, (int) r2, (java.lang.Object) r1)
            if (r4 == 0) goto L_0x0166
            int r2 = r11.size()
            if (r2 > r6) goto L_0x015e
            java.lang.Object r2 = r11.get(r5)
            r4 = r2
            r0.d r4 = (r0.C1370d) r4
            N5.c r2 = r0.C1373g.f14805a
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r4
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r2 = r2[r5]
            j$.util.Objects.requireNonNull(r2)
            r11.add(r2)
            java.util.List r2 = j$.util.DesugarCollections.unmodifiableList(r11)
            java.lang.String r2 = r0.C1373g.a(r7, r2)
            N5.c r11 = r0.C1373g.f14805a
            java.lang.Object r11 = r11.h(r2)
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11
            if (r11 == 0) goto L_0x00f5
            G.h r0 = new G.h
            r0.<init>(r14, r3, r11)
            r1.execute(r0)
            goto L_0x01db
        L_0x00f5:
            if (r12 != r9) goto L_0x0117
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            r1 = r1[r5]
            j$.util.Objects.requireNonNull(r1)
            r3.add(r1)
            java.util.List r1 = j$.util.DesugarCollections.unmodifiableList(r3)
            r0.f r0 = r0.C1373g.b(r2, r0, r1, r7)
            r15.P(r0)
            android.graphics.Typeface r11 = r0.f14803a
            goto L_0x01db
        L_0x0117:
            r0.e r9 = new r0.e
            r6 = 0
            r1 = r9
            r3 = r16
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.C1373g.f14806b     // Catch:{ InterruptedException -> 0x014b }
            java.util.concurrent.Future r0 = r0.submit(r9)     // Catch:{ InterruptedException -> 0x014b }
            long r1 = (long) r12
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x013a, InterruptedException -> 0x0138, TimeoutException -> 0x013c }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ ExecutionException -> 0x013a, InterruptedException -> 0x0138, TimeoutException -> 0x013c }
            r0.f r0 = (r0.C1372f) r0     // Catch:{ InterruptedException -> 0x014b }
            r15.P(r0)     // Catch:{ InterruptedException -> 0x014b }
            android.graphics.Typeface r11 = r0.f14803a     // Catch:{ InterruptedException -> 0x014b }
            goto L_0x01db
        L_0x0138:
            r0 = move-exception
            goto L_0x0144
        L_0x013a:
            r0 = move-exception
            goto L_0x0145
        L_0x013c:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x014b }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x014b }
            throw r0     // Catch:{ InterruptedException -> 0x014b }
        L_0x0144:
            throw r0     // Catch:{ InterruptedException -> 0x014b }
        L_0x0145:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x014b }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x014b }
            throw r1     // Catch:{ InterruptedException -> 0x014b }
        L_0x014b:
            androidx.emoji2.text.h r0 = new androidx.emoji2.text.h
            java.lang.Object r1 = r15.f10050V
            k2.q r1 = (k2.C1160q) r1
            r0.<init>((int) r10, (int) r8, (java.lang.Object) r1)
            java.lang.Object r1 = r15.f10051W
            F.g r1 = (F.g) r1
            r1.execute(r0)
        L_0x015b:
            r11 = 0
            goto L_0x01db
        L_0x015e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fallbacks with blocking fetches are not supported for performance reasons"
            r0.<init>(r1)
            throw r0
        L_0x0166:
            java.lang.String r9 = r0.C1373g.a(r7, r11)
            N5.c r2 = r0.C1373g.f14805a
            java.lang.Object r2 = r2.h(r9)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 == 0) goto L_0x017e
            G.h r0 = new G.h
            r0.<init>(r14, r3, r2)
            r1.execute(r0)
            r11 = r2
            goto L_0x01db
        L_0x017e:
            M.d r1 = new M.d
            r1.<init>(r6, r15)
            java.lang.Object r3 = r0.C1373g.f14807c
            monitor-enter(r3)
            Y.i r2 = r0.C1373g.f14808d     // Catch:{ all -> 0x0195 }
            java.lang.Object r4 = r2.get(r9)     // Catch:{ all -> 0x0195 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0195 }
            if (r4 == 0) goto L_0x0197
            r4.add(r1)     // Catch:{ all -> 0x0195 }
            monitor-exit(r3)     // Catch:{ all -> 0x0195 }
            goto L_0x015b
        L_0x0195:
            r0 = move-exception
            goto L_0x01de
        L_0x0197:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0195 }
            r4.<init>()     // Catch:{ all -> 0x0195 }
            r4.add(r1)     // Catch:{ all -> 0x0195 }
            r2.put(r9, r4)     // Catch:{ all -> 0x0195 }
            monitor-exit(r3)     // Catch:{ all -> 0x0195 }
            r0.e r10 = new r0.e
            r6 = 1
            r1 = r10
            r2 = r9
            r3 = r16
            r4 = r11
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.C1373g.f14806b
            M.d r1 = new M.d
            r1.<init>(r8, r9)
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L_0x01c7
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            goto L_0x01cc
        L_0x01c7:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
        L_0x01cc:
            h.b r3 = new h.b
            r3.<init>()
            r3.f12160V = r10
            r3.f12161W = r1
            r3.f12162X = r2
            r0.execute(r3)
            goto L_0x015b
        L_0x01db:
            r5 = r18
            goto L_0x0203
        L_0x01de:
            monitor-exit(r3)     // Catch:{ all -> 0x0195 }
            throw r0
        L_0x01e0:
            D7.b r3 = f13323a
            l0.e r1 = (l0.e) r1
            r5 = r18
            android.graphics.Typeface r11 = r3.f(r0, r1, r5, r7)
            if (r2 == 0) goto L_0x0203
            if (r11 == 0) goto L_0x0200
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            a1.c r1 = new a1.c
            r1.<init>((java.lang.Object) r2, (int) r4, (java.lang.Object) r11)
            r0.post(r1)
            goto L_0x0203
        L_0x0200:
            r2.a(r10)
        L_0x0203:
            if (r11 == 0) goto L_0x020e
            N5.c r0 = f13324b
            java.lang.String r1 = b(r18, r19, r20, r21, r22)
            r0.l(r1, r11)
        L_0x020e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C1200f.a(android.content.Context, l0.d, android.content.res.Resources, int, java.lang.String, int, int, l0.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i8, int i9) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i8 + '-' + i + '-' + i9;
    }
}
