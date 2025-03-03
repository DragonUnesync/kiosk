package R7;

import Q7.g;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.OutputStream;

public final class a extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f4348d0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public final c f4349U;

    /* renamed from: V  reason: collision with root package name */
    public int f4350V;

    /* renamed from: W  reason: collision with root package name */
    public long f4351W;

    /* renamed from: X  reason: collision with root package name */
    public long f4352X = 0;

    /* renamed from: Y  reason: collision with root package name */
    public int f4353Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f4354Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f4355a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4356b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4357c0;

    public a(c cVar, int i) {
        super(cVar);
        boolean z = true;
        this.f4356b0 = true;
        this.f4357c0 = 0;
        g.v(i < 0 ? false : z);
        this.f4349U = cVar;
        this.f4350V = i;
        this.f4353Y = i;
        this.f4354Z = -1;
        this.f4351W = System.nanoTime();
    }

    public final void close() {
        if (this.f4356b0) {
            super.close();
        }
    }

    public final void mark(int i) {
        super.mark(i);
        this.f4354Z = this.f4350V - this.f4353Y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e A[SYNTHETIC, Splitter:B:21:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.f4350V
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            boolean r2 = r9.f4355a0
            r3 = -1
            if (r2 != 0) goto L_0x0075
            if (r0 == 0) goto L_0x0014
            int r2 = r9.f4353Y
            if (r2 > 0) goto L_0x0014
            goto L_0x0075
        L_0x0014:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            boolean r2 = r2.isInterrupted()
            if (r2 == 0) goto L_0x0021
            r9.f4355a0 = r1
            return r3
        L_0x0021:
            if (r0 == 0) goto L_0x0028
            int r0 = r9.f4353Y
            if (r12 <= r0) goto L_0x0028
            r12 = r0
        L_0x0028:
            long r0 = r9.f4352X
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0031
            goto L_0x003e
        L_0x0031:
            long r0 = java.lang.System.nanoTime()
            long r6 = r9.f4351W
            long r0 = r0 - r6
            long r6 = r9.f4352X
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x006d
        L_0x003e:
            int r0 = super.read(r10, r11, r12)     // Catch:{ SocketTimeoutException -> 0x0050 }
            if (r0 != r3) goto L_0x0045
            goto L_0x004f
        L_0x0045:
            int r1 = r9.f4353Y     // Catch:{ SocketTimeoutException -> 0x0050 }
            int r1 = r1 - r0
            r9.f4353Y = r1     // Catch:{ SocketTimeoutException -> 0x0050 }
            int r1 = r9.f4357c0     // Catch:{ SocketTimeoutException -> 0x0050 }
            int r1 = r1 + r0
            r9.f4357c0 = r1     // Catch:{ SocketTimeoutException -> 0x0050 }
        L_0x004f:
            return r0
        L_0x0050:
            r0 = move-exception
            long r1 = r9.f4352X
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0058
            goto L_0x0065
        L_0x0058:
            long r1 = java.lang.System.nanoTime()
            long r6 = r9.f4351W
            long r1 = r1 - r6
            long r6 = r9.f4352X
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x006c
        L_0x0065:
            long r1 = r9.f4352X
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006c
            goto L_0x0028
        L_0x006c:
            throw r0
        L_0x006d:
            java.net.SocketTimeoutException r10 = new java.net.SocketTimeoutException
            java.lang.String r11 = "Read timeout"
            r10.<init>(r11)
            throw r10
        L_0x0075:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R7.a.read(byte[], int, int):int");
    }

    public final void reset() {
        super.reset();
        int i = this.f4350V;
        int i8 = this.f4354Z;
        this.f4353Y = i - i8;
        this.f4357c0 = i8;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
