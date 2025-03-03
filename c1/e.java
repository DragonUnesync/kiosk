package c1;

import K.b;
import L0.a;
import P0.z;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import b6.C0579s;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class e implements l {

    /* renamed from: a0  reason: collision with root package name */
    public static final ArrayDeque f8769a0 = new ArrayDeque();

    /* renamed from: b0  reason: collision with root package name */
    public static final Object f8770b0 = new Object();

    /* renamed from: U  reason: collision with root package name */
    public final MediaCodec f8771U;

    /* renamed from: V  reason: collision with root package name */
    public final HandlerThread f8772V;

    /* renamed from: W  reason: collision with root package name */
    public a f8773W;

    /* renamed from: X  reason: collision with root package name */
    public final AtomicReference f8774X = new AtomicReference();

    /* renamed from: Y  reason: collision with root package name */
    public final b f8775Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f8776Z;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, K.b] */
    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ? obj = new Object();
        this.f8771U = mediaCodec;
        this.f8772V = handlerThread;
        this.f8775Y = obj;
    }

    public static d b() {
        ArrayDeque arrayDeque = f8769a0;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    d dVar = new d();
                    return dVar;
                }
                d dVar2 = (d) arrayDeque.removeFirst();
                return dVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(d dVar) {
        ArrayDeque arrayDeque = f8769a0;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.f8774X.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void c(int i, int i8, int i9, long j7) {
        a();
        d b8 = b();
        b8.f8765a = i;
        b8.f8766b = i8;
        b8.f8768d = j7;
        b8.e = i9;
        a aVar = this.f8773W;
        int i10 = z.f3748a;
        aVar.obtainMessage(1, b8).sendToTarget();
    }

    public final void d(int i, S0.b bVar, long j7, int i8) {
        a();
        d b8 = b();
        b8.f8765a = i;
        b8.f8766b = 0;
        b8.f8768d = j7;
        b8.e = i8;
        int i9 = bVar.f4380f;
        MediaCodec.CryptoInfo cryptoInfo = b8.f8767c;
        cryptoInfo.numSubSamples = i9;
        int[] iArr = bVar.f4379d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = bVar.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = bVar.f4377b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = bVar.f4376a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = bVar.f4378c;
        if (z.f3748a >= 24) {
            C0579s.n();
            cryptoInfo.setPattern(C0579s.d(bVar.f4381g, bVar.f4382h));
        }
        this.f8773W.obtainMessage(2, b8).sendToTarget();
    }

    public final void flush() {
        if (this.f8776Z) {
            try {
                a aVar = this.f8773W;
                aVar.getClass();
                aVar.removeCallbacksAndMessages((Object) null);
                b bVar = this.f8775Y;
                synchronized (bVar) {
                    bVar.f2535a = false;
                }
                a aVar2 = this.f8773W;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                bVar.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void g(Bundle bundle) {
        a();
        a aVar = this.f8773W;
        int i = z.f3748a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    public final void shutdown() {
        if (this.f8776Z) {
            flush();
            this.f8772V.quit();
        }
        this.f8776Z = false;
    }

    public final void start() {
        if (!this.f8776Z) {
            HandlerThread handlerThread = this.f8772V;
            handlerThread.start();
            this.f8773W = new a(this, handlerThread.getLooper(), 1);
            this.f8776Z = true;
        }
    }
}
