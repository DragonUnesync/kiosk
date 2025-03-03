package c1;

import P0.m;
import T0.A;
import Z1.c;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

public final class f extends MediaCodec.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8777a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f8778b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f8779c;

    /* renamed from: d  reason: collision with root package name */
    public final m f8780d;
    public final m e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f8781f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f8782g;

    /* renamed from: h  reason: collision with root package name */
    public MediaFormat f8783h;
    public MediaFormat i;

    /* renamed from: j  reason: collision with root package name */
    public MediaCodec.CodecException f8784j;

    /* renamed from: k  reason: collision with root package name */
    public MediaCodec.CryptoException f8785k;

    /* renamed from: l  reason: collision with root package name */
    public long f8786l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8787m;

    /* renamed from: n  reason: collision with root package name */
    public IllegalStateException f8788n;

    /* renamed from: o  reason: collision with root package name */
    public c f8789o;

    public f(HandlerThread handlerThread) {
        this.f8778b = handlerThread;
        this.f8780d = new m();
        this.e = new m();
        this.f8781f = new ArrayDeque();
        this.f8782g = new ArrayDeque();
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f8782g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        m mVar = this.f8780d;
        mVar.f3720b = mVar.f3719a;
        m mVar2 = this.e;
        mVar2.f3720b = mVar2.f3719a;
        this.f8781f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f8777a) {
            this.f8788n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f8777a) {
            this.f8785k = cryptoException;
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f8777a) {
            this.f8784j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i8) {
        A a8;
        synchronized (this.f8777a) {
            this.f8780d.a(i8);
            c cVar = this.f8789o;
            if (!(cVar == null || (a8 = ((q) cVar.f6955V).f8871z0) == null)) {
                a8.a();
            }
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i8, MediaCodec.BufferInfo bufferInfo) {
        A a8;
        synchronized (this.f8777a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f8782g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i8);
                this.f8781f.add(bufferInfo);
                c cVar = this.f8789o;
                if (!(cVar == null || (a8 = ((q) cVar.f6955V).f8871z0) == null)) {
                    a8.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f8777a) {
            this.e.a(-2);
            this.f8782g.add(mediaFormat);
            this.i = null;
        }
    }
}
