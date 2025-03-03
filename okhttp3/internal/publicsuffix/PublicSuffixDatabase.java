package okhttp3.internal.publicsuffix;

import D6.i;
import D6.r;
import F.h;
import P6.f;
import W6.d;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import u.C1477r;

public final class PublicSuffixDatabase {
    public static final byte[] e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final List f14279f = h.w("*");

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f14280g = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f14281a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f14282b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f14283c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f14284d;

    public static List c(String str) {
        List<Object> o02 = d.o0(str, new char[]{'.'});
        if (!f.a(i.Q(o02), "")) {
            return o02;
        }
        int size = o02.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size >= 0) {
            r rVar = r.f1269U;
            if (size == 0) {
                return rVar;
            }
            if (size >= o02.size()) {
                return i.U(o02);
            }
            if (size != 1) {
                ArrayList arrayList = new ArrayList(size);
                int i = 0;
                for (Object add : o02) {
                    arrayList.add(add);
                    i++;
                    if (i == size) {
                        break;
                    }
                }
                int size2 = arrayList.size();
                if (size2 == 0) {
                    return rVar;
                }
                if (size2 != 1) {
                    return arrayList;
                }
                return h.w(arrayList.get(0));
            } else if (!o02.isEmpty()) {
                return h.w(o02.get(0));
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        } else {
            throw new IllegalArgumentException(C1477r.c(size, "Requested element count ", " is less than zero.").toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r3 != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = java.net.IDN.toUnicode(r13)
            java.lang.String r3 = "unicodeDomain"
            P6.f.d(r2, r3)
            java.util.List r2 = c(r2)
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.f14281a
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.f14281a
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L_0x004f
            r3 = 0
        L_0x0020:
            r12.b()     // Catch:{ InterruptedIOException -> 0x0040, IOException -> 0x002f }
            if (r3 == 0) goto L_0x005c
        L_0x0025:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x005c
        L_0x002d:
            r13 = move-exception
            goto L_0x0045
        L_0x002f:
            r4 = move-exception
            g7.n r5 = g7.n.f12045a     // Catch:{ all -> 0x002d }
            g7.n r5 = g7.n.f12045a     // Catch:{ all -> 0x002d }
            java.lang.String r6 = "Failed to read public suffix list"
            r5.getClass()     // Catch:{ all -> 0x002d }
            r5 = 5
            g7.n.i(r5, r6, r4)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x005c
            goto L_0x0025
        L_0x0040:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x002d }
            r3 = 1
            goto L_0x0020
        L_0x0045:
            if (r3 == 0) goto L_0x004e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004e:
            throw r13
        L_0x004f:
            java.util.concurrent.CountDownLatch r3 = r12.f14282b     // Catch:{ InterruptedException -> 0x0055 }
            r3.await()     // Catch:{ InterruptedException -> 0x0055 }
            goto L_0x005c
        L_0x0055:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L_0x005c:
            byte[] r3 = r12.f14283c
            if (r3 == 0) goto L_0x01a7
            int r3 = r2.size()
            byte[][] r4 = new byte[r3][]
            r5 = 0
        L_0x0067:
            if (r5 >= r3) goto L_0x0083
            java.lang.Object r6 = r2.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            P6.f.d(r7, r8)
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "this as java.lang.String).getBytes(charset)"
            P6.f.d(r6, r7)
            r4[r5] = r6
            int r5 = r5 + r1
            goto L_0x0067
        L_0x0083:
            r5 = 0
        L_0x0084:
            r6 = 0
            java.lang.String r7 = "publicSuffixListBytes"
            if (r5 >= r3) goto L_0x009a
            byte[] r8 = r12.f14283c
            if (r8 == 0) goto L_0x0096
            java.lang.String r8 = h1.C1048n.i(r8, r4, r5)
            if (r8 == 0) goto L_0x0094
            goto L_0x009b
        L_0x0094:
            int r5 = r5 + r1
            goto L_0x0084
        L_0x0096:
            P6.f.i(r7)
            throw r6
        L_0x009a:
            r8 = r6
        L_0x009b:
            if (r3 <= r1) goto L_0x00bd
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r1
            r10 = 0
        L_0x00a6:
            if (r10 >= r9) goto L_0x00bd
            byte[] r11 = e
            r5[r10] = r11
            byte[] r11 = r12.f14283c
            if (r11 == 0) goto L_0x00b9
            java.lang.String r11 = h1.C1048n.i(r11, r5, r10)
            if (r11 == 0) goto L_0x00b7
            goto L_0x00be
        L_0x00b7:
            int r10 = r10 + r1
            goto L_0x00a6
        L_0x00b9:
            P6.f.i(r7)
            throw r6
        L_0x00bd:
            r11 = r6
        L_0x00be:
            if (r11 == 0) goto L_0x00d7
            int r3 = r3 - r1
            r5 = 0
        L_0x00c2:
            if (r5 >= r3) goto L_0x00d7
            byte[] r7 = r12.f14284d
            if (r7 == 0) goto L_0x00d1
            java.lang.String r7 = h1.C1048n.i(r7, r4, r5)
            if (r7 == 0) goto L_0x00cf
            goto L_0x00d8
        L_0x00cf:
            int r5 = r5 + r1
            goto L_0x00c2
        L_0x00d1:
            java.lang.String r13 = "publicSuffixExceptionListBytes"
            P6.f.i(r13)
            throw r6
        L_0x00d7:
            r7 = r6
        L_0x00d8:
            r3 = 46
            if (r7 == 0) goto L_0x00eb
            java.lang.String r4 = "!"
            java.lang.String r4 = r4.concat(r7)
            char[] r5 = new char[r1]
            r5[r0] = r3
            java.util.List r3 = W6.d.o0(r4, r5)
            goto L_0x0117
        L_0x00eb:
            if (r8 != 0) goto L_0x00f2
            if (r11 != 0) goto L_0x00f2
            java.util.List r3 = f14279f
            goto L_0x0117
        L_0x00f2:
            D6.r r4 = D6.r.f1269U
            if (r8 == 0) goto L_0x00ff
            char[] r5 = new char[r1]
            r5[r0] = r3
            java.util.List r5 = W6.d.o0(r8, r5)
            goto L_0x0100
        L_0x00ff:
            r5 = r4
        L_0x0100:
            if (r11 == 0) goto L_0x010a
            char[] r4 = new char[r1]
            r4[r0] = r3
            java.util.List r4 = W6.d.o0(r11, r4)
        L_0x010a:
            int r3 = r5.size()
            int r7 = r4.size()
            if (r3 <= r7) goto L_0x0116
            r3 = r5
            goto L_0x0117
        L_0x0116:
            r3 = r4
        L_0x0117:
            int r4 = r2.size()
            int r5 = r3.size()
            r7 = 33
            if (r4 != r5) goto L_0x0130
            java.lang.Object r4 = r3.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r0)
            if (r4 == r7) goto L_0x0130
            return r6
        L_0x0130:
            java.lang.Object r4 = r3.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r0)
            if (r4 != r7) goto L_0x0146
            int r2 = r2.size()
            int r3 = r3.size()
        L_0x0144:
            int r2 = r2 - r3
            goto L_0x0150
        L_0x0146:
            int r2 = r2.size()
            int r3 = r3.size()
            int r3 = r3 + r1
            goto L_0x0144
        L_0x0150:
            java.util.List r13 = c(r13)
            D6.p r3 = new D6.p
            r3.<init>(r0, r13)
            if (r2 < 0) goto L_0x0195
            if (r2 != 0) goto L_0x015e
            goto L_0x0164
        L_0x015e:
            V6.b r13 = new V6.b
            r13.<init>(r3, r2)
            r3 = r13
        L_0x0164:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = ""
            r13.append(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x0172:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0188
            java.lang.Object r4 = r3.next()
            int r0 = r0 + r1
            if (r0 <= r1) goto L_0x0184
            java.lang.String r5 = "."
            r13.append(r5)
        L_0x0184:
            android.support.v4.media.session.b.a(r13, r4, r6)
            goto L_0x0172
        L_0x0188:
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "toString(...)"
            P6.f.d(r13, r0)
            return r13
        L_0x0195:
            java.lang.String r13 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r13 = u.C1477r.c(r2, r13, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L_0x01a7:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        g7.l.c(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x0010
            java.util.concurrent.CountDownLatch r0 = r5.f14282b
            r0.countDown()
            return
        L_0x0010:
            l7.k r1 = new l7.k     // Catch:{ all -> 0x0053 }
            java.util.logging.Logger r2 = l7.m.f13230a     // Catch:{ all -> 0x0053 }
            l7.c r2 = new l7.c     // Catch:{ all -> 0x0053 }
            l7.y r3 = new l7.y     // Catch:{ all -> 0x0053 }
            r3.<init>()     // Catch:{ all -> 0x0053 }
            r4 = 1
            r2.<init>(r0, r4, r3)     // Catch:{ all -> 0x0053 }
            r1.<init>(r2)     // Catch:{ all -> 0x0053 }
            l7.q r0 = new l7.q     // Catch:{ all -> 0x0053 }
            r0.<init>(r1)     // Catch:{ all -> 0x0053 }
            int r1 = r0.p()     // Catch:{ all -> 0x0058 }
            long r1 = (long) r1     // Catch:{ all -> 0x0058 }
            r0.u(r1)     // Catch:{ all -> 0x0058 }
            l7.f r3 = r0.f13237V     // Catch:{ all -> 0x0058 }
            byte[] r1 = r3.o(r1)     // Catch:{ all -> 0x0058 }
            int r2 = r0.p()     // Catch:{ all -> 0x0058 }
            long r2 = (long) r2     // Catch:{ all -> 0x0058 }
            r0.u(r2)     // Catch:{ all -> 0x0058 }
            l7.f r4 = r0.f13237V     // Catch:{ all -> 0x0058 }
            byte[] r2 = r4.o(r2)     // Catch:{ all -> 0x0058 }
            r3 = 0
            g7.l.c(r0, r3)     // Catch:{ all -> 0x0053 }
            monitor-enter(r5)     // Catch:{ all -> 0x0053 }
            r5.f14283c = r1     // Catch:{ all -> 0x0055 }
            r5.f14284d = r2     // Catch:{ all -> 0x0055 }
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            java.util.concurrent.CountDownLatch r0 = r5.f14282b
            r0.countDown()
            return
        L_0x0053:
            r0 = move-exception
            goto L_0x005f
        L_0x0055:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r2 = move-exception
            g7.l.c(r0, r1)     // Catch:{ all -> 0x0053 }
            throw r2     // Catch:{ all -> 0x0053 }
        L_0x005f:
            java.util.concurrent.CountDownLatch r1 = r5.f14282b
            r1.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }
}
