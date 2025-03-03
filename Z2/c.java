package z2;

import android.os.Build;
import android.os.StrictMode;
import com.bumptech.glide.j;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y.C1609a;

public final class c implements Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final File f16428U;

    /* renamed from: V  reason: collision with root package name */
    public final File f16429V;

    /* renamed from: W  reason: collision with root package name */
    public final File f16430W;

    /* renamed from: X  reason: collision with root package name */
    public final File f16431X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f16432Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f16433Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f16434a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f16435b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public BufferedWriter f16436c0;

    /* renamed from: d0  reason: collision with root package name */
    public final LinkedHashMap f16437d0 = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: e0  reason: collision with root package name */
    public int f16438e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f16439f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public final ThreadPoolExecutor f16440g0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Object());

    /* renamed from: h0  reason: collision with root package name */
    public final F.c f16441h0 = new F.c(1, this);

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public c(File file, long j7) {
        File file2 = file;
        this.f16428U = file2;
        this.f16432Y = 1;
        this.f16429V = new File(file2, "journal");
        this.f16430W = new File(file2, "journal.tmp");
        this.f16431X = new File(file2, "journal.bkp");
        this.f16434a0 = 1;
        this.f16433Z = j7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k(z2.c r9, com.bumptech.glide.j r10, boolean r11) {
        /*
            monitor-enter(r9)
            java.lang.Object r0 = r10.f9008V     // Catch:{ all -> 0x002d }
            z2.b r0 = (z2.b) r0     // Catch:{ all -> 0x002d }
            com.bumptech.glide.j r1 = r0.f16426f     // Catch:{ all -> 0x002d }
            if (r1 != r10) goto L_0x00f7
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.e     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0011:
            int r3 = r9.f16434a0     // Catch:{ all -> 0x002d }
            if (r2 >= r3) goto L_0x004d
            java.lang.Object r3 = r10.f9009W     // Catch:{ all -> 0x002d }
            boolean[] r3 = (boolean[]) r3     // Catch:{ all -> 0x002d }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0033
            java.io.File[] r3 = r0.f16425d     // Catch:{ all -> 0x002d }
            r3 = r3[r2]     // Catch:{ all -> 0x002d }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x0030
            r10.c()     // Catch:{ all -> 0x002d }
            monitor-exit(r9)
            goto L_0x00f6
        L_0x002d:
            r10 = move-exception
            goto L_0x00fd
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0033:
            r10.c()     // Catch:{ all -> 0x002d }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r11.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x002d }
            r11.append(r2)     // Catch:{ all -> 0x002d }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x002d }
            r10.<init>(r11)     // Catch:{ all -> 0x002d }
            throw r10     // Catch:{ all -> 0x002d }
        L_0x004d:
            int r10 = r9.f16434a0     // Catch:{ all -> 0x002d }
            if (r1 >= r10) goto L_0x007d
            java.io.File[] r10 = r0.f16425d     // Catch:{ all -> 0x002d }
            r10 = r10[r1]     // Catch:{ all -> 0x002d }
            if (r11 == 0) goto L_0x0077
            boolean r2 = r10.exists()     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x007a
            java.io.File[] r2 = r0.f16424c     // Catch:{ all -> 0x002d }
            r2 = r2[r1]     // Catch:{ all -> 0x002d }
            r10.renameTo(r2)     // Catch:{ all -> 0x002d }
            long[] r10 = r0.f16423b     // Catch:{ all -> 0x002d }
            r3 = r10[r1]     // Catch:{ all -> 0x002d }
            long r5 = r2.length()     // Catch:{ all -> 0x002d }
            long[] r10 = r0.f16423b     // Catch:{ all -> 0x002d }
            r10[r1] = r5     // Catch:{ all -> 0x002d }
            long r7 = r9.f16435b0     // Catch:{ all -> 0x002d }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f16435b0 = r7     // Catch:{ all -> 0x002d }
            goto L_0x007a
        L_0x0077:
            m(r10)     // Catch:{ all -> 0x002d }
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x007d:
            int r10 = r9.f16438e0     // Catch:{ all -> 0x002d }
            r1 = 1
            int r10 = r10 + r1
            r9.f16438e0 = r10     // Catch:{ all -> 0x002d }
            r10 = 0
            r0.f16426f = r10     // Catch:{ all -> 0x002d }
            boolean r10 = r0.e     // Catch:{ all -> 0x002d }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bc
            r0.e = r1     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            r10.append(r3)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r0.f16422a     // Catch:{ all -> 0x002d }
            r10.append(r1)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x002d }
            r10.append(r0)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            r10.append(r2)     // Catch:{ all -> 0x002d }
            if (r11 == 0) goto L_0x00db
            long r10 = r9.f16439f0     // Catch:{ all -> 0x002d }
            r0 = 1
            long r10 = r10 + r0
            r9.f16439f0 = r10     // Catch:{ all -> 0x002d }
            goto L_0x00db
        L_0x00bc:
            java.util.LinkedHashMap r10 = r9.f16437d0     // Catch:{ all -> 0x002d }
            java.lang.String r11 = r0.f16422a     // Catch:{ all -> 0x002d }
            r10.remove(r11)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            r10.append(r3)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            java.lang.String r11 = r0.f16422a     // Catch:{ all -> 0x002d }
            r10.append(r11)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            r10.append(r2)     // Catch:{ all -> 0x002d }
        L_0x00db:
            java.io.BufferedWriter r10 = r9.f16436c0     // Catch:{ all -> 0x002d }
            o(r10)     // Catch:{ all -> 0x002d }
            long r10 = r9.f16435b0     // Catch:{ all -> 0x002d }
            long r0 = r9.f16433Z     // Catch:{ all -> 0x002d }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ee
            boolean r10 = r9.q()     // Catch:{ all -> 0x002d }
            if (r10 == 0) goto L_0x00f5
        L_0x00ee:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f16440g0     // Catch:{ all -> 0x002d }
            F.c r11 = r9.f16441h0     // Catch:{ all -> 0x002d }
            r10.submit(r11)     // Catch:{ all -> 0x002d }
        L_0x00f5:
            monitor-exit(r9)
        L_0x00f6:
            return
        L_0x00f7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            r10.<init>()     // Catch:{ all -> 0x002d }
            throw r10     // Catch:{ all -> 0x002d }
        L_0x00fd:
            monitor-exit(r9)     // Catch:{ all -> 0x002d }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.k(z2.c, com.bumptech.glide.j, boolean):void");
    }

    public static void l(BufferedWriter bufferedWriter) {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void m(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void o(BufferedWriter bufferedWriter) {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static c r(File file, long j7) {
        if (j7 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    w(file2, file3, false);
                }
            }
            c cVar = new c(file, j7);
            if (cVar.f16429V.exists()) {
                try {
                    cVar.t();
                    cVar.s();
                    return cVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    cVar.close();
                    f.a(cVar.f16428U);
                }
            }
            file.mkdirs();
            c cVar2 = new c(file, j7);
            cVar2.v();
            return cVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void w(File file, File file2, boolean z) {
        if (z) {
            m(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized void close() {
        try {
            if (this.f16436c0 != null) {
                Iterator it = new ArrayList(this.f16437d0.values()).iterator();
                while (it.hasNext()) {
                    j jVar = ((b) it.next()).f16426f;
                    if (jVar != null) {
                        jVar.c();
                    }
                }
                x();
                l(this.f16436c0);
                this.f16436c0 = null;
            }
        } finally {
            while (true) {
            }
        }
    }

    public final j n(String str) {
        synchronized (this) {
            try {
                if (this.f16436c0 != null) {
                    b bVar = (b) this.f16437d0.get(str);
                    if (bVar == null) {
                        bVar = new b(this, str);
                        this.f16437d0.put(str, bVar);
                    } else if (bVar.f16426f != null) {
                        return null;
                    }
                    j jVar = new j(this, bVar);
                    bVar.f16426f = jVar;
                    this.f16436c0.append("DIRTY");
                    this.f16436c0.append(' ');
                    this.f16436c0.append(str);
                    this.f16436c0.append(10);
                    o(this.f16436c0);
                    return jVar;
                }
                throw new IllegalStateException("cache is closed");
            } finally {
            }
        }
    }

    public final synchronized C1609a p(String str) {
        if (this.f16436c0 != null) {
            b bVar = (b) this.f16437d0.get(str);
            if (bVar == null) {
                return null;
            }
            if (!bVar.e) {
                return null;
            }
            for (File exists : bVar.f16424c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.f16438e0++;
            this.f16436c0.append("READ");
            this.f16436c0.append(' ');
            this.f16436c0.append(str);
            this.f16436c0.append(10);
            if (q()) {
                this.f16440g0.submit(this.f16441h0);
            }
            return new C1609a((Object) bVar.f16424c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean q() {
        int i = this.f16438e0;
        if (i < 2000 || i < this.f16437d0.size()) {
            return false;
        }
        return true;
    }

    public final void s() {
        m(this.f16430W);
        Iterator it = this.f16437d0.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            j jVar = bVar.f16426f;
            int i = this.f16434a0;
            int i8 = 0;
            if (jVar == null) {
                while (i8 < i) {
                    this.f16435b0 += bVar.f16423b[i8];
                    i8++;
                }
            } else {
                bVar.f16426f = null;
                while (i8 < i) {
                    m(bVar.f16424c[i8]);
                    m(bVar.f16425d[i8]);
                    i8++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|(1:20)(1:21)|(3:22|23|36)) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r10.f16438e0 = r0 - r10.f16437d0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (r2.f16447Y == -1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r10.f16436c0 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r4, true), z2.f.f16448a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0063 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0063=Splitter:B:17:0x0063, B:27:0x008f=Splitter:B:27:0x008f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            z2.e r2 = new z2.e
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = r10.f16429V
            r3.<init>(r4)
            java.nio.charset.Charset r5 = z2.f.f16448a
            r2.<init>(r3, r5)
            java.lang.String r3 = r2.k()     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = r2.k()     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r2.k()     // Catch:{ all -> 0x0061 }
            java.lang.String r7 = r2.k()     // Catch:{ all -> 0x0061 }
            java.lang.String r8 = r2.k()     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = "libcore.io.DiskLruCache"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x008f
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r5)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x008f
            int r9 = r10.f16432Y     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0061 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x008f
            int r6 = r10.f16434a0     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0061 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x008f
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x008f
            r0 = 0
        L_0x0057:
            java.lang.String r1 = r2.k()     // Catch:{ EOFException -> 0x0063 }
            r10.u(r1)     // Catch:{ EOFException -> 0x0063 }
            int r0 = r0 + 1
            goto L_0x0057
        L_0x0061:
            r0 = move-exception
            goto L_0x00b8
        L_0x0063:
            java.util.LinkedHashMap r1 = r10.f16437d0     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            int r0 = r0 - r1
            r10.f16438e0 = r0     // Catch:{ all -> 0x0061 }
            int r0 = r2.f16447Y     // Catch:{ all -> 0x0061 }
            r1 = -1
            if (r0 != r1) goto L_0x0075
            r10.v()     // Catch:{ all -> 0x0061 }
            goto L_0x0089
        L_0x0075:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0061 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0061 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0061 }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0061 }
            java.nio.charset.Charset r4 = z2.f.f16448a     // Catch:{ all -> 0x0061 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0061 }
            r0.<init>(r1)     // Catch:{ all -> 0x0061 }
            r10.f16436c0 = r0     // Catch:{ all -> 0x0061 }
        L_0x0089:
            r2.close()     // Catch:{ RuntimeException -> 0x008d, Exception -> 0x008c }
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            throw r0
        L_0x008f:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r6.<init>(r1)     // Catch:{ all -> 0x0061 }
            r6.append(r3)     // Catch:{ all -> 0x0061 }
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            r6.append(r5)     // Catch:{ all -> 0x0061 }
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            r6.append(r7)     // Catch:{ all -> 0x0061 }
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            r6.append(r8)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "]"
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0061 }
            r4.<init>(r0)     // Catch:{ all -> 0x0061 }
            throw r4     // Catch:{ all -> 0x0061 }
        L_0x00b8:
            r2.close()     // Catch:{ RuntimeException -> 0x00bc, Exception -> 0x00bb }
        L_0x00bb:
            throw r0
        L_0x00bc:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.t():void");
    }

    public final void u(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            LinkedHashMap linkedHashMap = this.f16437d0;
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            b bVar = (b) linkedHashMap.get(str2);
            if (bVar == null) {
                bVar = new b(this, str2);
                linkedHashMap.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.e = true;
                bVar.f16426f = null;
                if (split.length == bVar.f16427g.f16434a0) {
                    int i8 = 0;
                    while (i8 < split.length) {
                        try {
                            bVar.f16423b[i8] = Long.parseLong(split[i8]);
                            i8++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f16426f = new j(this, bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void v() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.io.BufferedWriter r0 = r6.f16436c0     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0008
            l(r0)     // Catch:{ all -> 0x00bd }
        L_0x0008:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bd }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bd }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bd }
            java.io.File r3 = r6.f16430W     // Catch:{ all -> 0x00bd }
            r2.<init>(r3)     // Catch:{ all -> 0x00bd }
            java.nio.charset.Charset r3 = z2.f.f16448a     // Catch:{ all -> 0x00bd }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x00bd }
            r0.<init>(r1)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "1"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            int r1 = r6.f16432Y     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0086 }
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            int r1 = r6.f16434a0     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0086 }
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.util.LinkedHashMap r1 = r6.f16437d0     // Catch:{ all -> 0x0086 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0086 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0086 }
        L_0x005a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0086 }
            z2.b r2 = (z2.b) r2     // Catch:{ all -> 0x0086 }
            com.bumptech.glide.j r3 = r2.f16426f     // Catch:{ all -> 0x0086 }
            r4 = 10
            if (r3 == 0) goto L_0x0088
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r3.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "DIRTY "
            r3.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r2.f16422a     // Catch:{ all -> 0x0086 }
            r3.append(r2)     // Catch:{ all -> 0x0086 }
            r3.append(r4)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0086 }
            r0.write(r2)     // Catch:{ all -> 0x0086 }
            goto L_0x005a
        L_0x0086:
            r1 = move-exception
            goto L_0x00e3
        L_0x0088:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r3.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "CLEAN "
            r3.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = r2.f16422a     // Catch:{ all -> 0x0086 }
            r3.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r2.a()     // Catch:{ all -> 0x0086 }
            r3.append(r2)     // Catch:{ all -> 0x0086 }
            r3.append(r4)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0086 }
            r0.write(r2)     // Catch:{ all -> 0x0086 }
            goto L_0x005a
        L_0x00a9:
            l(r0)     // Catch:{ all -> 0x00bd }
            java.io.File r0 = r6.f16429V     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00bd }
            r1 = 1
            if (r0 == 0) goto L_0x00bf
            java.io.File r0 = r6.f16429V     // Catch:{ all -> 0x00bd }
            java.io.File r2 = r6.f16431X     // Catch:{ all -> 0x00bd }
            w(r0, r2, r1)     // Catch:{ all -> 0x00bd }
            goto L_0x00bf
        L_0x00bd:
            r0 = move-exception
            goto L_0x00e7
        L_0x00bf:
            java.io.File r0 = r6.f16430W     // Catch:{ all -> 0x00bd }
            java.io.File r2 = r6.f16429V     // Catch:{ all -> 0x00bd }
            r3 = 0
            w(r0, r2, r3)     // Catch:{ all -> 0x00bd }
            java.io.File r0 = r6.f16431X     // Catch:{ all -> 0x00bd }
            r0.delete()     // Catch:{ all -> 0x00bd }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bd }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bd }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bd }
            java.io.File r4 = r6.f16429V     // Catch:{ all -> 0x00bd }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00bd }
            java.nio.charset.Charset r1 = z2.f.f16448a     // Catch:{ all -> 0x00bd }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x00bd }
            r0.<init>(r2)     // Catch:{ all -> 0x00bd }
            r6.f16436c0 = r0     // Catch:{ all -> 0x00bd }
            monitor-exit(r6)
            return
        L_0x00e3:
            l(r0)     // Catch:{ all -> 0x00bd }
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00e7:
            monitor-exit(r6)     // Catch:{ all -> 0x00bd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.v():void");
    }

    public final void x() {
        while (this.f16435b0 > this.f16433Z) {
            String str = (String) ((Map.Entry) this.f16437d0.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f16436c0 != null) {
                        b bVar = (b) this.f16437d0.get(str);
                        if (bVar != null) {
                            if (bVar.f16426f == null) {
                                for (int i = 0; i < this.f16434a0; i++) {
                                    File file = bVar.f16424c[i];
                                    if (file.exists()) {
                                        if (!file.delete()) {
                                            throw new IOException("failed to delete " + file);
                                        }
                                    }
                                    long j7 = this.f16435b0;
                                    long[] jArr = bVar.f16423b;
                                    this.f16435b0 = j7 - jArr[i];
                                    jArr[i] = 0;
                                }
                                this.f16438e0++;
                                this.f16436c0.append("REMOVE");
                                this.f16436c0.append(' ');
                                this.f16436c0.append(str);
                                this.f16436c0.append(10);
                                this.f16437d0.remove(str);
                                if (q()) {
                                    this.f16440g0.submit(this.f16441h0);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("cache is closed");
                    }
                } finally {
                }
            }
        }
    }
}
