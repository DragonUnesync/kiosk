package D;

import B.q0;
import G.i;
import P0.l;
import P0.z;
import S0.b;
import U.p;
import Z1.c;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import c1.C0610b;
import c1.f;
import c1.k;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import n1.C1239d;

/* renamed from: D.f0  reason: case insensitive filesystem */
public final class C0043f0 implements C0049i0, k {

    /* renamed from: U  reason: collision with root package name */
    public boolean f893U;

    /* renamed from: V  reason: collision with root package name */
    public int f894V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f895W;

    /* renamed from: X  reason: collision with root package name */
    public final Object f896X;

    /* renamed from: Y  reason: collision with root package name */
    public final Object f897Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f898Z;

    public C0043f0(p0 p0Var) {
        this.f895W = new Object();
        this.f894V = 0;
        this.f893U = false;
        this.f897Y = new HashMap();
        this.f898Z = new CopyOnWriteArraySet();
        this.f896X = new AtomicReference(p0Var);
    }

    public static void b(C0043f0 f0Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        boolean z;
        q0 q0Var;
        LoudnessCodecController loudnessCodecController;
        f fVar = (f) f0Var.f896X;
        if (fVar.f8779c == null) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        HandlerThread handlerThread = fVar.f8778b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) f0Var.f895W;
        mediaCodec.setCallback(fVar, handler);
        fVar.f8779c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((c1.l) f0Var.f897Y).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (z.f3748a >= 35 && (q0Var = (q0) f0Var.f898Z) != null && ((loudnessCodecController = (LoudnessCodecController) q0Var.f302X) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            l.j(((HashSet) q0Var.f300V).add(mediaCodec));
        }
        f0Var.f894V = 1;
    }

    public static String e(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public void A(int i, long j7) {
        ((MediaCodec) this.f895W).releaseOutputBuffer(i, j7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A[Catch:{ all -> 0x0032 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[Catch:{ all -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int B() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f897Y
            c1.l r0 = (c1.l) r0
            r0.a()
            java.lang.Object r0 = r9.f896X
            c1.f r0 = (c1.f) r0
            java.lang.Object r1 = r0.f8777a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f8788n     // Catch:{ all -> 0x0032 }
            r3 = 0
            if (r2 != 0) goto L_0x005c
            android.media.MediaCodec$CodecException r2 = r0.f8784j     // Catch:{ all -> 0x0032 }
            if (r2 != 0) goto L_0x0059
            android.media.MediaCodec$CryptoException r2 = r0.f8785k     // Catch:{ all -> 0x0032 }
            if (r2 != 0) goto L_0x0056
            long r2 = r0.f8786l     // Catch:{ all -> 0x0032 }
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x002c
            boolean r2 = r0.f8787m     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r2 = 0
            goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            r3 = -1
            if (r2 == 0) goto L_0x0034
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x004f
        L_0x0032:
            r0 = move-exception
            goto L_0x005f
        L_0x0034:
            P0.m r0 = r0.f8780d     // Catch:{ all -> 0x0032 }
            int r2 = r0.f3719a     // Catch:{ all -> 0x0032 }
            int r4 = r0.f3720b     // Catch:{ all -> 0x0032 }
            if (r2 != r4) goto L_0x003d
            r6 = 1
        L_0x003d:
            if (r6 == 0) goto L_0x0040
            goto L_0x004e
        L_0x0040:
            if (r2 == r4) goto L_0x0050
            java.lang.Object r3 = r0.f3722d     // Catch:{ all -> 0x0032 }
            int[] r3 = (int[]) r3     // Catch:{ all -> 0x0032 }
            r3 = r3[r2]     // Catch:{ all -> 0x0032 }
            int r2 = r2 + r7
            int r4 = r0.f3721c     // Catch:{ all -> 0x0032 }
            r2 = r2 & r4
            r0.f3719a = r2     // Catch:{ all -> 0x0032 }
        L_0x004e:
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
        L_0x004f:
            return r3
        L_0x0050:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch:{ all -> 0x0032 }
            r0.<init>()     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0056:
            r0.f8785k = r3     // Catch:{ all -> 0x0032 }
            throw r2     // Catch:{ all -> 0x0032 }
        L_0x0059:
            r0.f8784j = r3     // Catch:{ all -> 0x0032 }
            throw r2     // Catch:{ all -> 0x0032 }
        L_0x005c:
            r0.f8788n = r3     // Catch:{ all -> 0x0032 }
            throw r2     // Catch:{ all -> 0x0032 }
        L_0x005f:
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0043f0.B():int");
    }

    public void a(Executor executor, C0047h0 h0Var) {
        E0 e02;
        synchronized (this.f895W) {
            E0 e03 = (E0) ((HashMap) this.f897Y).remove(h0Var);
            if (e03 != null) {
                e03.f766W.set(false);
                ((CopyOnWriteArraySet) this.f898Z).remove(e03);
            }
            e02 = new E0((AtomicReference) this.f896X, executor, h0Var);
            ((HashMap) this.f897Y).put(h0Var, e02);
            ((CopyOnWriteArraySet) this.f898Z).add(e02);
        }
        e02.a(0);
    }

    public void c(int i, int i8, int i9, long j7) {
        ((c1.l) this.f897Y).c(i, i8, i9, j7);
    }

    public void d(int i, b bVar, long j7, int i8) {
        ((c1.l) this.f897Y).d(i, bVar, j7, i8);
    }

    public G.k f() {
        Object obj = ((AtomicReference) this.f896X).get();
        if (!(obj instanceof C0046h)) {
            return i.c(obj);
        }
        ((C0046h) obj).getClass();
        return new G.k(1, (Object) null);
    }

    public void flush() {
        ((c1.l) this.f897Y).flush();
        ((MediaCodec) this.f895W).flush();
        f fVar = (f) this.f896X;
        synchronized (fVar.f8777a) {
            fVar.f8786l++;
            Handler handler = fVar.f8779c;
            int i = z.f3748a;
            handler.post(new p(14, (Object) fVar));
        }
        ((MediaCodec) this.f895W).start();
    }

    public void g(Bundle bundle) {
        ((c1.l) this.f897Y).g(bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A[Catch:{ all -> 0x0032 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[Catch:{ all -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f897Y
            c1.l r0 = (c1.l) r0
            r0.a()
            java.lang.Object r0 = r10.f896X
            c1.f r0 = (c1.f) r0
            java.lang.Object r1 = r0.f8777a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f8788n     // Catch:{ all -> 0x0032 }
            r3 = 0
            if (r2 != 0) goto L_0x0086
            android.media.MediaCodec$CodecException r2 = r0.f8784j     // Catch:{ all -> 0x0032 }
            if (r2 != 0) goto L_0x0083
            android.media.MediaCodec$CryptoException r2 = r0.f8785k     // Catch:{ all -> 0x0032 }
            if (r2 != 0) goto L_0x0080
            long r2 = r0.f8786l     // Catch:{ all -> 0x0032 }
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x002c
            boolean r2 = r0.f8787m     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r2 = 0
            goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            r3 = -1
            if (r2 == 0) goto L_0x0034
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0079
        L_0x0032:
            r11 = move-exception
            goto L_0x0089
        L_0x0034:
            P0.m r2 = r0.e     // Catch:{ all -> 0x0032 }
            int r4 = r2.f3719a     // Catch:{ all -> 0x0032 }
            int r5 = r2.f3720b     // Catch:{ all -> 0x0032 }
            if (r4 != r5) goto L_0x003d
            r6 = 1
        L_0x003d:
            if (r6 == 0) goto L_0x0041
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0079
        L_0x0041:
            if (r4 == r5) goto L_0x007a
            java.lang.Object r3 = r2.f3722d     // Catch:{ all -> 0x0032 }
            int[] r3 = (int[]) r3     // Catch:{ all -> 0x0032 }
            r3 = r3[r4]     // Catch:{ all -> 0x0032 }
            int r4 = r4 + r7
            int r5 = r2.f3721c     // Catch:{ all -> 0x0032 }
            r4 = r4 & r5
            r2.f3719a = r4     // Catch:{ all -> 0x0032 }
            if (r3 < 0) goto L_0x006b
            android.media.MediaFormat r2 = r0.f8783h     // Catch:{ all -> 0x0032 }
            P0.l.k(r2)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r0 = r0.f8781f     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x0032 }
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch:{ all -> 0x0032 }
            int r5 = r0.offset     // Catch:{ all -> 0x0032 }
            int r6 = r0.size     // Catch:{ all -> 0x0032 }
            long r7 = r0.presentationTimeUs     // Catch:{ all -> 0x0032 }
            int r9 = r0.flags     // Catch:{ all -> 0x0032 }
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch:{ all -> 0x0032 }
            goto L_0x0078
        L_0x006b:
            r11 = -2
            if (r3 != r11) goto L_0x0078
            java.util.ArrayDeque r11 = r0.f8782g     // Catch:{ all -> 0x0032 }
            java.lang.Object r11 = r11.remove()     // Catch:{ all -> 0x0032 }
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch:{ all -> 0x0032 }
            r0.f8783h = r11     // Catch:{ all -> 0x0032 }
        L_0x0078:
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
        L_0x0079:
            return r3
        L_0x007a:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException     // Catch:{ all -> 0x0032 }
            r11.<init>()     // Catch:{ all -> 0x0032 }
            throw r11     // Catch:{ all -> 0x0032 }
        L_0x0080:
            r0.f8785k = r3     // Catch:{ all -> 0x0032 }
            throw r2     // Catch:{ all -> 0x0032 }
        L_0x0083:
            r0.f8784j = r3     // Catch:{ all -> 0x0032 }
            throw r2     // Catch:{ all -> 0x0032 }
        L_0x0086:
            r0.f8788n = r3     // Catch:{ all -> 0x0032 }
            throw r2     // Catch:{ all -> 0x0032 }
        L_0x0089:
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0043f0.h(android.media.MediaCodec$BufferInfo):int");
    }

    public void i(C0047h0 h0Var) {
        synchronized (this.f895W) {
            E0 e02 = (E0) ((HashMap) this.f897Y).remove(h0Var);
            if (e02 != null) {
                e02.f766W.set(false);
                ((CopyOnWriteArraySet) this.f898Z).remove(e02);
            }
        }
    }

    public void k(int i) {
        ((MediaCodec) this.f895W).releaseOutputBuffer(i, false);
    }

    public void l(C1239d dVar, Handler handler) {
        ((MediaCodec) this.f895W).setOnFrameRenderedListener(new C0610b(this, dVar, 0), handler);
    }

    public void n(int i) {
        ((MediaCodec) this.f895W).setVideoScalingMode(i);
    }

    public MediaFormat p() {
        MediaFormat mediaFormat;
        f fVar = (f) this.f896X;
        synchronized (fVar.f8777a) {
            try {
                mediaFormat = fVar.f8783h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void q() {
        ((MediaCodec) this.f895W).detachOutputSurface();
    }

    public ByteBuffer r(int i) {
        return ((MediaCodec) this.f895W).getInputBuffer(i);
    }

    public void release() {
        q0 q0Var;
        q0 q0Var2;
        q0 q0Var3;
        q0 q0Var4;
        try {
            if (this.f894V == 1) {
                ((c1.l) this.f897Y).shutdown();
                f fVar = (f) this.f896X;
                synchronized (fVar.f8777a) {
                    fVar.f8787m = true;
                    fVar.f8778b.quit();
                    fVar.a();
                }
            }
            this.f894V = 2;
            if (!this.f893U) {
                try {
                    int i = z.f3748a;
                    if (i >= 30 && i < 33) {
                        ((MediaCodec) this.f895W).stop();
                    }
                    if (i >= 35 && (q0Var4 = (q0) this.f898Z) != null) {
                        q0Var4.B((MediaCodec) this.f895W);
                    }
                    ((MediaCodec) this.f895W).release();
                    this.f893U = true;
                } catch (Throwable th) {
                    if (z.f3748a >= 35 && (q0Var3 = (q0) this.f898Z) != null) {
                        q0Var3.B((MediaCodec) this.f895W);
                    }
                    ((MediaCodec) this.f895W).release();
                    this.f893U = true;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (!this.f893U) {
                try {
                    int i8 = z.f3748a;
                    if (i8 >= 30 && i8 < 33) {
                        ((MediaCodec) this.f895W).stop();
                    }
                    if (i8 >= 35 && (q0Var2 = (q0) this.f898Z) != null) {
                        q0Var2.B((MediaCodec) this.f895W);
                    }
                    ((MediaCodec) this.f895W).release();
                    this.f893U = true;
                } catch (Throwable th3) {
                    if (z.f3748a >= 35 && (q0Var = (q0) this.f898Z) != null) {
                        q0Var.B((MediaCodec) this.f895W);
                    }
                    ((MediaCodec) this.f895W).release();
                    this.f893U = true;
                    throw th3;
                }
            }
            throw th2;
        }
    }

    public void s(Surface surface) {
        ((MediaCodec) this.f895W).setOutputSurface(surface);
    }

    public boolean u(c cVar) {
        f fVar = (f) this.f896X;
        synchronized (fVar.f8777a) {
            fVar.f8789o = cVar;
        }
        return true;
    }

    public ByteBuffer v(int i) {
        return ((MediaCodec) this.f895W).getOutputBuffer(i);
    }

    public C0043f0(MediaCodec mediaCodec, HandlerThread handlerThread, c1.l lVar, q0 q0Var) {
        this.f895W = mediaCodec;
        this.f896X = new f(handlerThread);
        this.f897Y = lVar;
        this.f898Z = q0Var;
        this.f894V = 0;
    }
}
