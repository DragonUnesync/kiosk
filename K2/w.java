package K2;

import E2.g;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class w extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: U  reason: collision with root package name */
    public volatile byte[] f2647U;

    /* renamed from: V  reason: collision with root package name */
    public int f2648V;

    /* renamed from: W  reason: collision with root package name */
    public int f2649W;

    /* renamed from: X  reason: collision with root package name */
    public int f2650X = -1;

    /* renamed from: Y  reason: collision with root package name */
    public int f2651Y;

    /* renamed from: Z  reason: collision with root package name */
    public final g f2652Z;

    public w(InputStream inputStream, g gVar) {
        super(inputStream);
        this.f2652Z = gVar;
        this.f2647U = (byte[]) gVar.d(byte[].class, 65536);
    }

    public static void m() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f2647U == null || inputStream == null) {
            m();
            throw null;
        }
        return (this.f2648V - this.f2651Y) + inputStream.available();
    }

    public final void close() {
        if (this.f2647U != null) {
            this.f2652Z.h(this.f2647U);
            this.f2647U = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int k(InputStream inputStream, byte[] bArr) {
        int i;
        int i8 = this.f2650X;
        if (i8 == -1 || this.f2651Y - i8 >= (i = this.f2649W)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f2650X = -1;
                this.f2651Y = 0;
                this.f2648V = read;
            }
            return read;
        }
        if (i8 == 0 && i > bArr.length && this.f2648V == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f2652Z.d(byte[].class, i);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f2647U = bArr2;
            this.f2652Z.h(bArr);
            bArr = bArr2;
        } else if (i8 > 0) {
            System.arraycopy(bArr, i8, bArr, 0, bArr.length - i8);
        }
        int i9 = this.f2651Y - this.f2650X;
        this.f2651Y = i9;
        this.f2650X = 0;
        this.f2648V = 0;
        int read2 = inputStream.read(bArr, i9, bArr.length - i9);
        int i10 = this.f2651Y;
        if (read2 > 0) {
            i10 += read2;
        }
        this.f2648V = i10;
        return read2;
    }

    public final synchronized void l() {
        if (this.f2647U != null) {
            this.f2652Z.h(this.f2647U);
            this.f2647U = null;
        }
    }

    public final synchronized void mark(int i) {
        this.f2649W = Math.max(this.f2649W, i);
        this.f2650X = this.f2651Y;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x001b=Splitter:B:12:0x001b, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f2647U     // Catch:{ all -> 0x0019 }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0019 }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.f2651Y     // Catch:{ all -> 0x0019 }
            int r4 = r6.f2648V     // Catch:{ all -> 0x0019 }
            r5 = -1
            if (r3 < r4) goto L_0x001b
            int r1 = r6.k(r1, r0)     // Catch:{ all -> 0x0019 }
            if (r1 != r5) goto L_0x001b
            monitor-exit(r6)
            return r5
        L_0x0019:
            r0 = move-exception
            goto L_0x003f
        L_0x001b:
            byte[] r1 = r6.f2647U     // Catch:{ all -> 0x0019 }
            if (r0 == r1) goto L_0x0028
            byte[] r0 = r6.f2647U     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0024
            goto L_0x0028
        L_0x0024:
            m()     // Catch:{ all -> 0x0019 }
            throw r2     // Catch:{ all -> 0x0019 }
        L_0x0028:
            int r1 = r6.f2648V     // Catch:{ all -> 0x0019 }
            int r2 = r6.f2651Y     // Catch:{ all -> 0x0019 }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r2 + 1
            r6.f2651Y = r1     // Catch:{ all -> 0x0019 }
            byte r0 = r0[r2]     // Catch:{ all -> 0x0019 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            m()     // Catch:{ all -> 0x0019 }
            throw r2     // Catch:{ all -> 0x0019 }
        L_0x003f:
            monitor-exit(r6)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.w.read():int");
    }

    public final synchronized void reset() {
        if (this.f2647U != null) {
            int i = this.f2650X;
            if (-1 != i) {
                this.f2651Y = i;
            } else {
                throw new IOException("Mark has been invalidated, pos: " + this.f2651Y + " markLimit: " + this.f2649W);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j7) {
        if (j7 < 1) {
            return 0;
        }
        byte[] bArr = this.f2647U;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f2648V;
                int i8 = this.f2651Y;
                if (((long) (i - i8)) >= j7) {
                    this.f2651Y = (int) (((long) i8) + j7);
                    return j7;
                }
                long j8 = ((long) i) - ((long) i8);
                this.f2651Y = i;
                if (this.f2650X == -1 || j7 > ((long) this.f2649W)) {
                    long skip = inputStream.skip(j7 - j8);
                    if (skip > 0) {
                        this.f2650X = -1;
                    }
                    return j8 + skip;
                } else if (k(inputStream, bArr) == -1) {
                    return j8;
                } else {
                    int i9 = this.f2648V;
                    int i10 = this.f2651Y;
                    if (((long) (i9 - i10)) >= j7 - j8) {
                        this.f2651Y = (int) ((((long) i10) + j7) - j8);
                        return j7;
                    }
                    long j9 = (j8 + ((long) i9)) - ((long) i10);
                    this.f2651Y = i9;
                    return j9;
                }
            } else {
                m();
                throw null;
            }
        } else {
            m();
            throw null;
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0054, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f2647U     // Catch:{ all -> 0x002e }
            r1 = 0
            if (r0 == 0) goto L_0x0086
            if (r9 != 0) goto L_0x000b
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0082
            int r3 = r6.f2651Y     // Catch:{ all -> 0x002e }
            int r4 = r6.f2648V     // Catch:{ all -> 0x002e }
            if (r3 >= r4) goto L_0x0032
            int r4 = r4 - r3
            if (r4 < r9) goto L_0x0019
            r4 = r9
        L_0x0019:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)     // Catch:{ all -> 0x002e }
            int r3 = r6.f2651Y     // Catch:{ all -> 0x002e }
            int r3 = r3 + r4
            r6.f2651Y = r3     // Catch:{ all -> 0x002e }
            if (r4 == r9) goto L_0x0030
            int r3 = r2.available()     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L_0x0033
        L_0x002e:
            r7 = move-exception
            goto L_0x008a
        L_0x0030:
            monitor-exit(r6)
            return r4
        L_0x0032:
            r3 = r9
        L_0x0033:
            int r4 = r6.f2650X     // Catch:{ all -> 0x002e }
            r5 = -1
            if (r4 != r5) goto L_0x0048
            int r4 = r0.length     // Catch:{ all -> 0x002e }
            if (r3 < r4) goto L_0x0048
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x002e }
            if (r4 != r5) goto L_0x0072
            if (r3 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r5 = r9 - r3
        L_0x0046:
            monitor-exit(r6)
            return r5
        L_0x0048:
            int r4 = r6.k(r2, r0)     // Catch:{ all -> 0x002e }
            if (r4 != r5) goto L_0x0055
            if (r3 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r5 = r9 - r3
        L_0x0053:
            monitor-exit(r6)
            return r5
        L_0x0055:
            byte[] r4 = r6.f2647U     // Catch:{ all -> 0x002e }
            if (r0 == r4) goto L_0x0062
            byte[] r0 = r6.f2647U     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            m()     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0062:
            int r4 = r6.f2648V     // Catch:{ all -> 0x002e }
            int r5 = r6.f2651Y     // Catch:{ all -> 0x002e }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x006a
            r4 = r3
        L_0x006a:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x002e }
            int r5 = r6.f2651Y     // Catch:{ all -> 0x002e }
            int r5 = r5 + r4
            r6.f2651Y = r5     // Catch:{ all -> 0x002e }
        L_0x0072:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0077
            monitor-exit(r6)
            return r9
        L_0x0077:
            int r5 = r2.available()     // Catch:{ all -> 0x002e }
            if (r5 != 0) goto L_0x0080
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0080:
            int r8 = r8 + r4
            goto L_0x0033
        L_0x0082:
            m()     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0086:
            m()     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x008a:
            monitor-exit(r6)     // Catch:{ all -> 0x002e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.w.read(byte[], int, int):int");
    }
}
