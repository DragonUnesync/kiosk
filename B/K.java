package B;

import D.Y;
import D.Z;
import E.e;
import E.f;
import F.h;
import I.a;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import android.os.Build;
import com.bumptech.glide.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import u.C1477r;

public abstract class K implements Y {

    /* renamed from: U  reason: collision with root package name */
    public B f168U;

    /* renamed from: V  reason: collision with root package name */
    public volatile int f169V;

    /* renamed from: W  reason: collision with root package name */
    public volatile int f170W;

    /* renamed from: X  reason: collision with root package name */
    public volatile int f171X = 1;

    /* renamed from: Y  reason: collision with root package name */
    public volatile boolean f172Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile boolean f173Z;

    /* renamed from: a0  reason: collision with root package name */
    public Executor f174a0;

    /* renamed from: b0  reason: collision with root package name */
    public j0 f175b0;

    /* renamed from: c0  reason: collision with root package name */
    public ImageWriter f176c0;

    /* renamed from: d0  reason: collision with root package name */
    public Rect f177d0 = new Rect();

    /* renamed from: e0  reason: collision with root package name */
    public Rect f178e0 = new Rect();

    /* renamed from: f0  reason: collision with root package name */
    public Matrix f179f0 = new Matrix();

    /* renamed from: g0  reason: collision with root package name */
    public Matrix f180g0 = new Matrix();

    /* renamed from: h0  reason: collision with root package name */
    public ByteBuffer f181h0;

    /* renamed from: i0  reason: collision with root package name */
    public ByteBuffer f182i0;

    /* renamed from: j0  reason: collision with root package name */
    public ByteBuffer f183j0;

    /* renamed from: k0  reason: collision with root package name */
    public ByteBuffer f184k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Object f185l0 = new Object();

    /* renamed from: m0  reason: collision with root package name */
    public boolean f186m0 = true;

    public abstract W a(Z z);

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0073  */
    public final L3.b b(B.W r15) {
        /*
            r14 = this;
            boolean r0 = r14.f172Y
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r0 = r14.f169V
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            java.lang.Object r2 = r14.f185l0
            monitor-enter(r2)
            java.util.concurrent.Executor r9 = r14.f174a0     // Catch:{ all -> 0x001b }
            B.B r10 = r14.f168U     // Catch:{ all -> 0x001b }
            boolean r3 = r14.f172Y     // Catch:{ all -> 0x001b }
            r11 = 1
            if (r3 == 0) goto L_0x001e
            int r3 = r14.f170W     // Catch:{ all -> 0x001b }
            if (r0 == r3) goto L_0x001e
            r12 = 1
            goto L_0x001f
        L_0x001b:
            r15 = move-exception
            goto L_0x00c8
        L_0x001e:
            r12 = 0
        L_0x001f:
            if (r12 == 0) goto L_0x0024
            r14.h(r15, r0)     // Catch:{ all -> 0x001b }
        L_0x0024:
            boolean r3 = r14.f172Y     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x002b
            r14.d(r15)     // Catch:{ all -> 0x001b }
        L_0x002b:
            B.j0 r3 = r14.f175b0     // Catch:{ all -> 0x001b }
            android.media.ImageWriter r4 = r14.f176c0     // Catch:{ all -> 0x001b }
            java.nio.ByteBuffer r5 = r14.f181h0     // Catch:{ all -> 0x001b }
            java.nio.ByteBuffer r6 = r14.f182i0     // Catch:{ all -> 0x001b }
            java.nio.ByteBuffer r7 = r14.f183j0     // Catch:{ all -> 0x001b }
            java.nio.ByteBuffer r8 = r14.f184k0     // Catch:{ all -> 0x001b }
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            if (r10 == 0) goto L_0x00b9
            if (r9 == 0) goto L_0x00b9
            boolean r2 = r14.f186m0
            if (r2 == 0) goto L_0x00b9
            if (r3 == 0) goto L_0x006b
            int r2 = r14.f171X
            r13 = 2
            if (r2 != r13) goto L_0x004e
            boolean r2 = r14.f173Z
            B.N r2 = androidx.camera.core.ImageProcessingUtil.c(r15, r3, r5, r0, r2)
            goto L_0x006c
        L_0x004e:
            int r2 = r14.f171X
            if (r2 != r11) goto L_0x006b
            boolean r2 = r14.f173Z
            if (r2 == 0) goto L_0x0059
            androidx.camera.core.ImageProcessingUtil.a(r15)
        L_0x0059:
            if (r4 == 0) goto L_0x006b
            if (r6 == 0) goto L_0x006b
            if (r7 == 0) goto L_0x006b
            if (r8 == 0) goto L_0x006b
            r2 = r15
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r0
            B.N r2 = androidx.camera.core.ImageProcessingUtil.f(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 != 0) goto L_0x006f
            r1 = 1
        L_0x006f:
            if (r1 == 0) goto L_0x0073
            r8 = r15
            goto L_0x0074
        L_0x0073:
            r8 = r2
        L_0x0074:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            java.lang.Object r3 = r14.f185l0
            monitor-enter(r3)
            if (r12 == 0) goto L_0x009b
            if (r1 != 0) goto L_0x009b
            int r1 = r15.c()     // Catch:{ all -> 0x0099 }
            int r4 = r15.b()     // Catch:{ all -> 0x0099 }
            int r5 = r8.c()     // Catch:{ all -> 0x0099 }
            int r6 = r8.b()     // Catch:{ all -> 0x0099 }
            r14.g(r1, r4, r5, r6)     // Catch:{ all -> 0x0099 }
            goto L_0x009b
        L_0x0099:
            r15 = move-exception
            goto L_0x00b7
        L_0x009b:
            r14.f170W = r0     // Catch:{ all -> 0x0099 }
            android.graphics.Rect r0 = r14.f178e0     // Catch:{ all -> 0x0099 }
            r2.set(r0)     // Catch:{ all -> 0x0099 }
            android.graphics.Matrix r0 = r14.f180g0     // Catch:{ all -> 0x0099 }
            r7.set(r0)     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)     // Catch:{ all -> 0x0099 }
            B.I r0 = new B.I
            r3 = r0
            r4 = r14
            r5 = r9
            r6 = r15
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            a0.m r15 = com.bumptech.glide.d.i(r0)
            goto L_0x00c7
        L_0x00b7:
            monitor-exit(r3)     // Catch:{ all -> 0x0099 }
            throw r15
        L_0x00b9:
            C6.b r15 = new C6.b
            java.lang.String r0 = "No analyzer or executor currently set."
            r15.<init>((java.lang.String) r0)
            G.k r0 = new G.k
            r1 = 1
            r0.<init>(r1, r15)
            r15 = r0
        L_0x00c7:
            return r15
        L_0x00c8:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: B.K.b(B.W):L3.b");
    }

    public abstract void c();

    public final void d(W w2) {
        if (this.f171X == 1) {
            if (this.f182i0 == null) {
                this.f182i0 = ByteBuffer.allocateDirect(w2.b() * w2.c());
            }
            this.f182i0.position(0);
            if (this.f183j0 == null) {
                this.f183j0 = ByteBuffer.allocateDirect((w2.b() * w2.c()) / 4);
            }
            this.f183j0.position(0);
            if (this.f184k0 == null) {
                this.f184k0 = ByteBuffer.allocateDirect((w2.b() * w2.c()) / 4);
            }
            this.f184k0.position(0);
        } else if (this.f171X == 2 && this.f181h0 == null) {
            this.f181h0 = ByteBuffer.allocateDirect(w2.b() * w2.c() * 4);
        }
    }

    public final void e(Z z) {
        try {
            W a8 = a(z);
            if (a8 != null) {
                f(a8);
            }
        } catch (IllegalStateException e) {
            h.m("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public abstract void f(W w2);

    public final void g(int i, int i8, int i9, int i10) {
        int i11 = this.f169V;
        Matrix matrix = new Matrix();
        if (i11 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i8);
            RectF rectF2 = f.f1294a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate((float) i11);
            RectF rectF3 = new RectF(0.0f, 0.0f, (float) i9, (float) i10);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f177d0);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f178e0 = rect;
        this.f180g0.setConcat(this.f179f0, matrix);
    }

    public final void h(W w2, int i) {
        boolean z;
        int i8;
        j0 j0Var = this.f175b0;
        if (j0Var != null) {
            j0Var.r();
            int c8 = w2.c();
            int b8 = w2.b();
            int t8 = this.f175b0.t();
            int D8 = this.f175b0.D();
            if (i == 90 || i == 270) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i8 = b8;
            } else {
                i8 = c8;
            }
            if (!z) {
                c8 = b8;
            }
            this.f175b0 = new j0((Z) e.i(i8, c8, t8, D8));
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 23 && this.f171X == 1) {
                ImageWriter imageWriter = this.f176c0;
                if (imageWriter != null) {
                    if (i9 >= 23) {
                        a.a(imageWriter);
                    } else {
                        throw new RuntimeException(C1477r.c(i9, "Unable to call close() on API ", ". Version 23 or higher required."));
                    }
                }
                this.f176c0 = c.s(this.f175b0.D(), this.f175b0.j());
            }
        }
    }

    public final void i(Executor executor, B b8) {
        synchronized (this.f185l0) {
            this.f168U = b8;
            this.f174a0 = executor;
        }
    }
}
