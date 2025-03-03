package H4;

import B.C0002c;
import F4.b;
import T5.C0245f0;
import T5.O0;
import T5.W;
import T5.Y;
import Z5.C0406y;
import a6.C0427A;
import a6.J;
import f6.C0916f;
import f6.Z;
import f6.a0;
import java.util.concurrent.TimeUnit;
import x4.C1605a;

public final class f extends C0245f0 {

    /* renamed from: U  reason: collision with root package name */
    public final C0427A f2155U;

    /* renamed from: V  reason: collision with root package name */
    public final int f2156V;

    /* renamed from: W  reason: collision with root package name */
    public final C1605a f2157W;

    /* renamed from: X  reason: collision with root package name */
    public final b f2158X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f2159Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f2160Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public Z f2161a0;

    public f(C0427A a8, C1605a aVar, b bVar) {
        this.f2155U = a8;
        this.f2156V = 10000;
        this.f2157W = aVar;
        this.f2158X = bVar;
    }

    public final boolean c(Y y8) {
        if (this.f2160Z) {
            return false;
        }
        this.f2160Z = true;
        ((O0) y8.pipeline()).remove((W) this);
        Z z = this.f2161a0;
        if (z != null) {
            ((a0) z).cancel(false);
            this.f2161a0 = null;
        }
        return true;
    }

    public final void channelActive(Y y8) {
        d(y8);
        y8.fireChannelActive();
    }

    public final void channelInactive(Y y8) {
        if (c(y8)) {
            this.f2158X.accept(y8.channel(), new J("connection was closed during handshake"));
        }
        y8.fireChannelInactive();
    }

    public final void channelRead(Y y8, Object obj) {
        if (obj instanceof C0406y) {
            C0406y yVar = (C0406y) obj;
            if (c(y8)) {
                try {
                    this.f2155U.finishHandshake(y8.channel(), yVar);
                    this.f2157W.accept(y8.channel());
                } catch (Throwable th) {
                    this.f2158X.accept(y8.channel(), th);
                }
            }
            yVar.release();
            return;
        }
        y8.fireChannelRead(obj);
    }

    public final void d(Y y8) {
        if (!this.f2159Y) {
            this.f2159Y = true;
            int i = this.f2156V;
            if (i > 0) {
                this.f2161a0 = ((C0916f) y8.channel().eventLoop()).schedule((Runnable) new C0002c((Object) this, 9, (Object) y8), (long) i, TimeUnit.MILLISECONDS);
            }
            this.f2155U.handshake(y8.channel(), y8.voidPromise());
        }
    }

    public final void exceptionCaught(Y y8, Throwable th) {
        if (c(y8)) {
            this.f2158X.accept(y8.channel(), th);
        } else {
            y8.fireExceptionCaught(th);
        }
    }

    public final void handlerAdded(Y y8) {
        if (y8.channel().isActive()) {
            d(y8);
        }
    }

    public final boolean isSharable() {
        return false;
    }
}
