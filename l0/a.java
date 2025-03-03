package L0;

import android.os.Handler;
import android.os.Looper;

public final class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2678a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2679b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Looper looper, int i) {
        super(looper);
        this.f2678a = i;
        this.f2679b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r3 >= r1) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r4 = r2[r3];
        r5 = ((java.util.ArrayList) r4.f36W).size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r6 >= r5) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r7 = (L0.b) ((java.util.ArrayList) r4.f36W).get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r7.f2683d != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r7.f2681b.onReceive(r11.f2686a, (android.content.Intent) r4.f35V);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 1
            if (r0 == r1) goto L_0x0009
            super.handleMessage(r11)
            goto L_0x0019
        L_0x0009:
            java.lang.Object r11 = r10.f2679b
            L0.c r11 = (L0.c) r11
        L_0x000d:
            java.util.HashMap r0 = r11.f2687b
            monitor-enter(r0)
            java.util.ArrayList r1 = r11.f2689d     // Catch:{ all -> 0x001a }
            int r1 = r1.size()     // Catch:{ all -> 0x001a }
            if (r1 > 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
        L_0x0019:
            return
        L_0x001a:
            r11 = move-exception
            goto L_0x0059
        L_0x001c:
            A1.d[] r2 = new A1.d[r1]     // Catch:{ all -> 0x001a }
            java.util.ArrayList r3 = r11.f2689d     // Catch:{ all -> 0x001a }
            r3.toArray(r2)     // Catch:{ all -> 0x001a }
            java.util.ArrayList r3 = r11.f2689d     // Catch:{ all -> 0x001a }
            r3.clear()     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r0 = 0
            r3 = 0
        L_0x002b:
            if (r3 >= r1) goto L_0x000d
            r4 = r2[r3]
            java.lang.Object r5 = r4.f36W
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r6 = 0
        L_0x0038:
            if (r6 >= r5) goto L_0x0056
            java.lang.Object r7 = r4.f36W
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r6)
            L0.b r7 = (L0.b) r7
            boolean r8 = r7.f2683d
            if (r8 != 0) goto L_0x0053
            android.content.BroadcastReceiver r7 = r7.f2681b
            android.content.Context r8 = r11.f2686a
            java.lang.Object r9 = r4.f35V
            android.content.Intent r9 = (android.content.Intent) r9
            r7.onReceive(r8, r9)
        L_0x0053:
            int r6 = r6 + 1
            goto L_0x0038
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.a.a(android.os.Message):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: c1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: c1.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[LOOP:0: B:11:0x0028->B:14:0x0034, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[LOOP:1: B:20:0x0046->B:23:0x0051, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079 A[LOOP:2: B:39:0x0079->B:42:0x0084, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0 A[LOOP:3: B:49:0x00a0->B:52:0x00ab, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            int r0 = r11.f2678a
            switch(r0) {
                case 0: goto L_0x00b4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.f2679b
            c1.e r0 = (c1.e) r0
            r0.getClass()
            int r1 = r12.what
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0088
            r2 = 2
            if (r1 == r2) goto L_0x005a
            r2 = 3
            if (r1 == r2) goto L_0x0054
            r2 = 4
            if (r1 == r2) goto L_0x0038
            java.util.concurrent.atomic.AtomicReference r1 = r0.f8774X
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r12 = r12.what
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r2.<init>(r12)
        L_0x0028:
            boolean r12 = r1.compareAndSet(r3, r2)
            if (r12 == 0) goto L_0x0030
            goto L_0x00ae
        L_0x0030:
            java.lang.Object r12 = r1.get()
            if (r12 == 0) goto L_0x0028
            goto L_0x00ae
        L_0x0038:
            java.lang.Object r12 = r12.obj
            android.os.Bundle r12 = (android.os.Bundle) r12
            android.media.MediaCodec r1 = r0.f8771U     // Catch:{ RuntimeException -> 0x0043 }
            r1.setParameters(r12)     // Catch:{ RuntimeException -> 0x0043 }
            goto L_0x00ae
        L_0x0043:
            r12 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r0.f8774X
        L_0x0046:
            boolean r0 = r1.compareAndSet(r3, r12)
            if (r0 == 0) goto L_0x004d
            goto L_0x00ae
        L_0x004d:
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0046
            goto L_0x00ae
        L_0x0054:
            K.b r12 = r0.f8775Y
            r12.e()
            goto L_0x00ae
        L_0x005a:
            java.lang.Object r12 = r12.obj
            r1 = r12
            c1.d r1 = (c1.d) r1
            int r5 = r1.f8765a
            android.media.MediaCodec$CryptoInfo r7 = r1.f8767c
            long r8 = r1.f8768d
            int r10 = r1.e
            java.lang.Object r12 = c1.e.f8770b0     // Catch:{ RuntimeException -> 0x0075 }
            monitor-enter(r12)     // Catch:{ RuntimeException -> 0x0075 }
            android.media.MediaCodec r4 = r0.f8771U     // Catch:{ all -> 0x0072 }
            r6 = 0
            r4.queueSecureInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ all -> 0x0072 }
            monitor-exit(r12)     // Catch:{ all -> 0x0072 }
            goto L_0x0086
        L_0x0072:
            r2 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0072 }
            throw r2     // Catch:{ RuntimeException -> 0x0075 }
        L_0x0075:
            r12 = move-exception
            r2 = r12
            java.util.concurrent.atomic.AtomicReference r4 = r0.f8774X
        L_0x0079:
            boolean r12 = r4.compareAndSet(r3, r2)
            if (r12 == 0) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            java.lang.Object r12 = r4.get()
            if (r12 == 0) goto L_0x0079
        L_0x0086:
            r3 = r1
            goto L_0x00ae
        L_0x0088:
            java.lang.Object r12 = r12.obj
            r1 = r12
            c1.d r1 = (c1.d) r1
            int r5 = r1.f8765a
            int r7 = r1.f8766b
            long r8 = r1.f8768d
            int r10 = r1.e
            android.media.MediaCodec r4 = r0.f8771U     // Catch:{ RuntimeException -> 0x009c }
            r6 = 0
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ RuntimeException -> 0x009c }
            goto L_0x00ad
        L_0x009c:
            r12 = move-exception
            r2 = r12
            java.util.concurrent.atomic.AtomicReference r0 = r0.f8774X
        L_0x00a0:
            boolean r12 = r0.compareAndSet(r3, r2)
            if (r12 == 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            java.lang.Object r12 = r0.get()
            if (r12 == 0) goto L_0x00a0
        L_0x00ad:
            goto L_0x0086
        L_0x00ae:
            if (r3 == 0) goto L_0x00b3
            c1.e.e(r3)
        L_0x00b3:
            return
        L_0x00b4:
            r11.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.a.handleMessage(android.os.Message):void");
    }
}
