package l1;

import W1.e;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import m1.C1206a;

public final class l extends Handler implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final int f13137U;

    /* renamed from: V  reason: collision with root package name */
    public final m f13138V;

    /* renamed from: W  reason: collision with root package name */
    public final long f13139W;

    /* renamed from: X  reason: collision with root package name */
    public k f13140X;

    /* renamed from: Y  reason: collision with root package name */
    public IOException f13141Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f13142Z;

    /* renamed from: a0  reason: collision with root package name */
    public Thread f13143a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f13144b0;

    /* renamed from: c0  reason: collision with root package name */
    public volatile boolean f13145c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ p f13146d0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(p pVar, Looper looper, m mVar, k kVar, int i, long j7) {
        super(looper);
        this.f13146d0 = pVar;
        this.f13138V = mVar;
        this.f13140X = kVar;
        this.f13137U = i;
        this.f13139W = j7;
    }

    public final void a(boolean z) {
        this.f13145c0 = z;
        this.f13141Y = null;
        if (hasMessages(1)) {
            this.f13144b0 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f13144b0 = true;
                    this.f13138V.e();
                    Thread thread = this.f13143a0;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        if (z) {
            this.f13146d0.f13151V = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k kVar = this.f13140X;
            kVar.getClass();
            kVar.A(this.f13138V, elapsedRealtime, elapsedRealtime - this.f13139W, true);
            this.f13140X = null;
        }
    }

    public final void b() {
        SystemClock.elapsedRealtime();
        this.f13140X.getClass();
        this.f13141Y = null;
        p pVar = this.f13146d0;
        C1206a aVar = pVar.f13150U;
        l lVar = pVar.f13151V;
        lVar.getClass();
        aVar.execute(lVar);
    }

    public final void handleMessage(Message message) {
        boolean z;
        if (!this.f13145c0) {
            int i = message.what;
            if (i == 1) {
                b();
            } else if (i != 4) {
                this.f13146d0.f13151V = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = elapsedRealtime - this.f13139W;
                k kVar = this.f13140X;
                kVar.getClass();
                if (this.f13144b0) {
                    kVar.A(this.f13138V, elapsedRealtime, j7, false);
                    return;
                }
                int i8 = message.what;
                if (i8 == 2) {
                    try {
                        kVar.p(this.f13138V, elapsedRealtime, j7);
                    } catch (RuntimeException e) {
                        P0.l.p("LoadTask", "Unexpected exception handling load completed", e);
                        this.f13146d0.f13152W = new o(e);
                    }
                } else if (i8 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f13141Y = iOException;
                    int i9 = this.f13142Z + 1;
                    this.f13142Z = i9;
                    e k8 = kVar.k(this.f13138V, elapsedRealtime, j7, iOException, i9);
                    int i10 = k8.f6147a;
                    if (i10 == 3) {
                        this.f13146d0.f13152W = this.f13141Y;
                    } else if (i10 != 2) {
                        if (i10 == 1) {
                            this.f13142Z = 1;
                        }
                        long j8 = k8.f6148b;
                        if (j8 == -9223372036854775807L) {
                            j8 = (long) Math.min((this.f13142Z - 1) * 1000, 5000);
                        }
                        p pVar = this.f13146d0;
                        if (pVar.f13151V == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        P0.l.j(z);
                        pVar.f13151V = this;
                        if (j8 > 0) {
                            sendEmptyMessageDelayed(1, j8);
                        } else {
                            b();
                        }
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f13144b0;
                this.f13143a0 = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f13138V.getClass().getSimpleName()));
                this.f13138V.c();
                Trace.endSection();
            }
            synchronized (this) {
                this.f13143a0 = null;
                Thread.interrupted();
            }
            if (!this.f13145c0) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f13145c0) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e8) {
            if (!this.f13145c0) {
                P0.l.p("LoadTask", "Unexpected exception loading stream", e8);
                obtainMessage(3, new o(e8)).sendToTarget();
            }
        } catch (OutOfMemoryError e9) {
            if (!this.f13145c0) {
                P0.l.p("LoadTask", "OutOfMemory error loading stream", e9);
                obtainMessage(3, new o(e9)).sendToTarget();
            }
        } catch (Error e10) {
            if (!this.f13145c0) {
                P0.l.p("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(4, e10).sendToTarget();
            }
            throw e10;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
