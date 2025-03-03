package B4;

import A4.b;
import G5.s;
import T5.C0265p0;
import T5.C0274u0;
import T5.P;
import T5.U;
import T5.Y;
import f6.C0909B;
import f6.C0916f;
import f6.Z;
import f6.a0;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import x4.d;

public final class a extends d implements C0265p0, Runnable, U {

    /* renamed from: V  reason: collision with root package name */
    public final long f453V;

    /* renamed from: W  reason: collision with root package name */
    public long f454W;

    /* renamed from: X  reason: collision with root package name */
    public long f455X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f456Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f457Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f458a0;

    /* renamed from: b0  reason: collision with root package name */
    public Z f459b0;

    public a(int i, long j7, long j8) {
        this.f453V = TimeUnit.SECONDS.toNanos((long) i) - TimeUnit.MILLISECONDS.toNanos(100);
        this.f454W = j7;
        this.f455X = j8;
    }

    public final void c(Y y8, b bVar) {
        Z z = this.f459b0;
        if (z != null) {
            ((a0) z).cancel(false);
            this.f459b0 = null;
        }
    }

    public final void channelRead(Y y8, Object obj) {
        this.f455X = System.nanoTime();
        if (obj instanceof U4.b) {
            this.f458a0 = true;
            return;
        }
        this.f458a0 = true;
        y8.fireChannelRead(obj);
    }

    public final void close(Y y8, C0274u0 u0Var) {
        y8.close(u0Var);
    }

    public final void connect(Y y8, SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        y8.connect(socketAddress, socketAddress2, u0Var);
    }

    public final void disconnect(Y y8, C0274u0 u0Var) {
        y8.disconnect(u0Var);
    }

    public final void flush(Y y8) {
        this.f454W = System.nanoTime();
        y8.flush();
    }

    public final void handlerAdded(Y y8) {
        this.f16289U = y8;
        long nanoTime = System.nanoTime() - Math.min(this.f455X, this.f454W);
        this.f459b0 = ((C0916f) y8.executor()).schedule((Runnable) this, this.f453V - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final void operationComplete(C0909B b8) {
        if (((P) b8).isSuccess()) {
            this.f457Z = true;
        }
    }

    public final void read(Y y8) {
        y8.read();
    }

    public final void run() {
        Y y8 = this.f16289U;
        if (y8 != null) {
            if (this.f456Y) {
                if (!this.f457Z) {
                    s.d(y8.channel(), "Timeout while writing PINGREQ");
                    return;
                } else if (!this.f458a0) {
                    s.d(y8.channel(), "Timeout while waiting for PINGRESP");
                    return;
                }
            }
            this.f457Z = false;
            this.f458a0 = false;
            long nanoTime = System.nanoTime();
            long j7 = this.f453V;
            long min = j7 - (nanoTime - Math.min(this.f455X, this.f454W));
            if (min > 1000) {
                this.f456Y = false;
                this.f459b0 = ((C0916f) this.f16289U.executor()).schedule((Runnable) this, min, TimeUnit.NANOSECONDS);
                return;
            }
            this.f456Y = true;
            this.f459b0 = ((C0916f) this.f16289U.executor()).schedule((Runnable) this, j7, TimeUnit.NANOSECONDS);
            this.f454W = nanoTime;
            this.f16289U.writeAndFlush(U4.a.f5434b).addListener(this);
        }
    }

    public final void write(Y y8, Object obj, C0274u0 u0Var) {
        y8.write(obj, u0Var);
    }
}
