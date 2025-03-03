package B;

import a0.j;
import android.graphics.Matrix;
import android.graphics.Rect;

public final /* synthetic */ class J implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ K f161U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ W f162V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Matrix f163W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ W f164X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Rect f165Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B f166Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ j f167a0;

    public /* synthetic */ J(K k8, W w2, Matrix matrix, W w4, Rect rect, B b8, j jVar) {
        this.f161U = k8;
        this.f162V = w2;
        this.f163W = matrix;
        this.f164X = w4;
        this.f165Y = rect;
        this.f166Z = b8;
        this.f167a0 = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cd, code lost:
        r8 = r0;
        android.util.Log.w("p", "Failed to get bitmap from imageProxy due to " + r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        android.util.Log.e("p", "Out of memory in motion detector");
        n2.a.a1(0, r3.f3440a, "Out of memory for motion detection. Stopping it...");
        r3.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f7, code lost:
        android.util.Log.w("p", "Something failed in motion detection due to " + r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0210, code lost:
        r3.f3451n.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0215, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        android.util.Log.e("p", "Failed broadcasting darkness intent");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:40:0x00b9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            r2 = 0
            r0 = 1
            B.K r3 = r1.f161U
            B.W r4 = r1.f162V
            android.graphics.Matrix r10 = r1.f163W
            B.W r11 = r1.f164X
            android.graphics.Rect r12 = r1.f165Y
            B.B r13 = r1.f166Z
            a0.j r14 = r1.f167a0
            boolean r5 = r3.f186m0
            if (r5 == 0) goto L_0x021d
            B.U r5 = r4.e()
            D.H0 r6 = r5.a()
            B.U r4 = r4.e()
            long r7 = r4.b()
            boolean r4 = r3.f172Y
            if (r4 == 0) goto L_0x002c
            r9 = 0
            goto L_0x002f
        L_0x002c:
            int r3 = r3.f169V
            r9 = r3
        L_0x002f:
            B.g r3 = new B.g
            r5 = r3
            r5.<init>(r6, r7, r9, r10)
            B.k0 r4 = new B.k0
            r5 = 0
            r4.<init>(r11, r5, r3)
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x005b
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r12)
            int r6 = r4.f278Z
            int r7 = r4.f279a0
            boolean r6 = r3.intersect(r2, r2, r6, r7)
            if (r6 != 0) goto L_0x0053
            r3.setEmpty()
        L_0x0053:
            java.lang.Object r3 = r4.f276X
            monitor-enter(r3)
            monitor-exit(r3)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0058:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x005b:
            java.lang.Object r3 = r13.f141V
            N5.l r3 = (N5.l) r3
            N5.p r3 = r3.f3423a
            r3.getClass()
            java.lang.String r6 = "p"
            java.lang.String r7 = "Failed to get bitmap from imageProxy due to "
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r3.f3453p
            r12 = 1000(0x3e8, float:1.401E-42)
            int r13 = r3.f3443d
            int r12 = r12 / r13
            long r12 = (long) r12
            long r10 = r10 + r12
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0216
            java.util.concurrent.atomic.AtomicBoolean r10 = r3.f3451n
            boolean r10 = r10.get()
            if (r10 == 0) goto L_0x0083
            goto L_0x0216
        L_0x0083:
            java.util.concurrent.atomic.AtomicBoolean r10 = r3.f3451n
            boolean r10 = r10.compareAndSet(r2, r0)
            if (r10 != 0) goto L_0x008d
            goto L_0x0216
        L_0x008d:
            long r10 = de.ozerov.fully.O1.f10199t
            boolean r12 = r3.i
            r15 = 0
            if (r12 == 0) goto L_0x00a3
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 == 0) goto L_0x00a3
            long r10 = r8 - r10
            r12 = 300(0x12c, double:1.48E-321)
            int r17 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r17 >= 0) goto L_0x00a3
            r10 = 1
            goto L_0x00a4
        L_0x00a3:
            r10 = 0
        L_0x00a4:
            boolean r11 = r3.f3447j
            if (r11 == 0) goto L_0x00b9
            long r11 = r3.f3455r
            int r13 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x00b9
            long r11 = r3.f3455r
            long r11 = r8 - r11
            r17 = 3000(0xbb8, double:1.482E-320)
            int r13 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b9
            r10 = 1
        L_0x00b9:
            android.graphics.Bitmap r7 = Q7.g.o(r4)     // Catch:{ Exception -> 0x01cc, OutOfMemoryError -> 0x01e7 }
            android.graphics.Bitmap r11 = r3.f3433D     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r11 == 0) goto L_0x00cb
            r11.recycle()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            goto L_0x00cb
        L_0x00c5:
            r0 = move-exception
            goto L_0x0210
        L_0x00c8:
            r0 = move-exception
            goto L_0x01f7
        L_0x00cb:
            r3.f3433D = r7     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            B.U r7 = r4.f277Y     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            int r7 = r7.c()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r3.f3434E = r7     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r3.f3453p = r8     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            N5.c r7 = r3.f3436G     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            B.W r8 = r4.f138V     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            A.f[] r8 = r8.d()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r8 = r8[r2]     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            java.nio.ByteBuffer r8 = r8.L()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            int r9 = r4.f278Z     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            int r11 = r4.f279a0     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r7.m(r8, r9, r11)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            boolean r7 = r3.f3448k     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r7 == 0) goto L_0x0178
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            long r11 = r3.f3456s     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            long r7 = r7 - r11
            int r9 = r3.f3444f     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            long r11 = (long) r9     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x0104
            long r7 = r3.f3456s     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            int r9 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x0178
        L_0x0104:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r3.f3456s = r7     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            android.graphics.Bitmap r7 = r3.f3433D     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            int r8 = r3.f3434E     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            java.util.ArrayList r7 = N5.p.c(r7, r8)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r8 = 0
        L_0x0117:
            boolean r9 = r7.hasNext()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r9 == 0) goto L_0x0136
            java.lang.Object r9 = r7.next()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            android.media.FaceDetector$Face r9 = (android.media.FaceDetector.Face) r9     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r9.confidence()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            float r9 = r9.confidence()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            int r11 = r3.f3445g     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            float r11 = (float) r11     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r12 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 / r12
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x0117
            int r8 = r8 + r0
            goto L_0x0117
        L_0x0136:
            int r7 = r3.f3435F     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r8 == r7) goto L_0x0168
            r3.f3435F = r8     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            boolean r7 = r3.f3446h     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r7 == 0) goto L_0x014a
            A3.c r7 = new A3.c     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r7.<init>((int) r8, (int) r0, (java.lang.Object) r3)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            android.widget.TextView r0 = r3.z     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r0.post(r7)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
        L_0x014a:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0163, OutOfMemoryError -> 0x01e7 }
            r0.<init>()     // Catch:{ Exception -> 0x0163, OutOfMemoryError -> 0x01e7 }
            java.lang.String r7 = "com.fullykiosk.singleapp.action.faces_detected"
            r0.setAction(r7)     // Catch:{ Exception -> 0x0163, OutOfMemoryError -> 0x01e7 }
            java.lang.String r7 = "number"
            r0.putExtra(r7, r8)     // Catch:{ Exception -> 0x0163, OutOfMemoryError -> 0x01e7 }
            android.app.Service r7 = r3.f3440a     // Catch:{ Exception -> 0x0163, OutOfMemoryError -> 0x01e7 }
            L0.c r7 = L0.c.a(r7)     // Catch:{ Exception -> 0x0163, OutOfMemoryError -> 0x01e7 }
            r7.c(r0)     // Catch:{ Exception -> 0x0163, OutOfMemoryError -> 0x01e7 }
            goto L_0x0168
        L_0x0163:
            java.lang.String r0 = "Failed broadcasting faces intent"
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
        L_0x0168:
            boolean r0 = r3.f3449l     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r0 == 0) goto L_0x0178
            if (r8 <= 0) goto L_0x0178
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f3452o     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r0.set(r2)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            java.lang.String r0 = "faces"
            r3.b(r0)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
        L_0x0178:
            int r0 = r3.e     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r0 <= 0) goto L_0x01aa
            N5.c r7 = r3.f3436G     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            boolean r0 = r7.c(r0)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r0 == 0) goto L_0x01aa
            if (r10 != 0) goto L_0x01aa
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f3452o     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            int r0 = r0.incrementAndGet()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r7 = 10
            if (r0 != r7) goto L_0x01c8
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x01a4, OutOfMemoryError -> 0x01e7 }
            r0.<init>()     // Catch:{ Exception -> 0x01a4, OutOfMemoryError -> 0x01e7 }
            java.lang.String r7 = "com.fullykiosk.singleapp.action.darkness_detected"
            r0.setAction(r7)     // Catch:{ Exception -> 0x01a4, OutOfMemoryError -> 0x01e7 }
            android.app.Service r7 = r3.f3440a     // Catch:{ Exception -> 0x01a4, OutOfMemoryError -> 0x01e7 }
            L0.c r7 = L0.c.a(r7)     // Catch:{ Exception -> 0x01a4, OutOfMemoryError -> 0x01e7 }
            r7.c(r0)     // Catch:{ Exception -> 0x01a4, OutOfMemoryError -> 0x01e7 }
            goto L_0x01c8
        L_0x01a4:
            java.lang.String r0 = "Failed broadcasting darkness intent"
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            goto L_0x01c8
        L_0x01aa:
            boolean r0 = r3.f3448k     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r0 == 0) goto L_0x01b2
            boolean r0 = r3.f3449l     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r0 != 0) goto L_0x01c8
        L_0x01b2:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f3452o     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r0.set(r2)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            N5.c r0 = r3.f3436G     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            int r7 = r3.f3442c     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            boolean r0 = r0.d(r7)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            if (r0 == 0) goto L_0x01c8
            if (r10 != 0) goto L_0x01c8
            java.lang.String r0 = "visual"
            r3.b(r0)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
        L_0x01c8:
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            goto L_0x01e1
        L_0x01cc:
            r0 = move-exception
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            java.lang.String r7 = r8.getMessage()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            r0.append(r7)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
            android.util.Log.w(r6, r0)     // Catch:{ Exception -> 0x00c8, OutOfMemoryError -> 0x01e7 }
        L_0x01e1:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f3451n
            r0.set(r2)
            goto L_0x0216
        L_0x01e7:
            java.lang.String r0 = "Out of memory in motion detector"
            android.util.Log.e(r6, r0)     // Catch:{ all -> 0x00c5 }
            android.app.Service r0 = r3.f3440a     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Out of memory for motion detection. Stopping it..."
            n2.a.a1(r2, r0, r6)     // Catch:{ all -> 0x00c5 }
            r3.f()     // Catch:{ all -> 0x00c5 }
            goto L_0x01e1
        L_0x01f7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r7.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "Something failed in motion detection due to "
            r7.append(r8)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00c5 }
            r7.append(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00c5 }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x01e1
        L_0x0210:
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f3451n
            r3.set(r2)
            throw r0
        L_0x0216:
            r4.close()
            r14.a(r5)
            goto L_0x0227
        L_0x021d:
            C6.b r0 = new C6.b
            java.lang.String r2 = "ImageAnalysis is detached"
            r0.<init>((java.lang.String) r2)
            r14.b(r0)
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.J.run():void");
    }
}
