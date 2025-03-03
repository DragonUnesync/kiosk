package D7;

import O6.l;
import P6.f;
import P6.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class e {
    public static final j e = new j("\\r?\\n");

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f1275a;

    /* renamed from: b  reason: collision with root package name */
    public int f1276b;

    /* renamed from: c  reason: collision with root package name */
    public int f1277c;

    /* renamed from: d  reason: collision with root package name */
    public l f1278d;

    public e(InputStream inputStream) {
        f.e(inputStream, "inputStream");
        this.f1275a = inputStream;
        this.f1276b = -1;
        this.f1277c = -1;
        this.f1278d = null;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        g7.l.c(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r13 = this;
            int r0 = r13.f1277c
            r1 = 0
            java.io.InputStream r2 = r13.f1275a
            r3 = 8192(0x2000, float:1.14794E-41)
            r4 = -1
            if (r0 != r4) goto L_0x0025
            java.nio.charset.Charset r0 = W6.a.f6191a
            java.io.InputStreamReader r5 = new java.io.InputStreamReader
            r5.<init>(r2, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r5, r3)
            java.lang.String r2 = B.C0003d.F(r0)     // Catch:{ all -> 0x001e }
            g7.l.c(r0, r1)
            goto L_0x0068
        L_0x001e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2 = move-exception
            g7.l.c(r0, r1)
            throw r2
        L_0x0025:
            long r5 = java.lang.System.currentTimeMillis()
            int r0 = r13.f1277c
            long r7 = (long) r0
            long r5 = r5 + r7
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0058 }
            r0.<init>()     // Catch:{ all -> 0x0058 }
            byte[] r7 = new byte[r3]     // Catch:{ all -> 0x0058 }
        L_0x0034:
            r8 = 0
            r9 = 0
        L_0x0036:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0058 }
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x0052
            if (r9 >= r3) goto L_0x0052
            int r10 = r2.available()     // Catch:{ all -> 0x0058 }
            int r11 = 8192 - r9
            int r10 = java.lang.Math.min(r10, r11)     // Catch:{ all -> 0x0058 }
            int r10 = r2.read(r7, r9, r10)     // Catch:{ all -> 0x0058 }
            if (r10 == r4) goto L_0x0052
            int r9 = r9 + r10
            goto L_0x0036
        L_0x0052:
            if (r9 == r4) goto L_0x005b
            r0.write(r7, r8, r9)     // Catch:{ all -> 0x0058 }
            goto L_0x0034
        L_0x0058:
            r0 = move-exception
            goto L_0x00c7
        L_0x005b:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0058 }
            g7.l.c(r2, r1)
            java.lang.String r1 = "use(...)"
            P6.f.d(r0, r1)
            r2 = r0
        L_0x0068:
            O6.l r0 = r13.f1278d
            P6.j r1 = e
            if (r0 == 0) goto L_0x00ac
            java.util.List r1 = r1.a(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x007b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r1.next()
            java.lang.Object r5 = r0.a(r3)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x007b
            r2.add(r3)
            goto L_0x007b
        L_0x0095:
            int r0 = r13.f1276b
            if (r0 != r4) goto L_0x009b
        L_0x0099:
            r3 = r2
            goto L_0x00a0
        L_0x009b:
            java.util.List r2 = D6.i.S(r0, r2)
            goto L_0x0099
        L_0x00a0:
            r6 = 0
            r7 = 0
            java.lang.String r4 = "\n"
            r5 = 0
            r8 = 62
            java.lang.String r2 = D6.i.P(r3, r4, r5, r6, r7, r8)
            goto L_0x00c6
        L_0x00ac:
            int r0 = r13.f1276b
            if (r0 != r4) goto L_0x00b1
            goto L_0x00c6
        L_0x00b1:
            java.util.List r0 = r1.a(r2)
            int r1 = r13.f1276b
            java.util.List r2 = D6.i.S(r1, r0)
            r5 = 0
            r6 = 0
            java.lang.String r3 = "\n"
            r4 = 0
            r7 = 62
            java.lang.String r2 = D6.i.P(r2, r3, r4, r5, r6, r7)
        L_0x00c6:
            return r2
        L_0x00c7:
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r1 = move-exception
            g7.l.c(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D7.e.a():java.lang.String");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(File file) {
        this((InputStream) new FileInputStream(file));
        f.e(file, "file");
    }
}
