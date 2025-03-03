package G4;

import G5.s;
import T5.K;
import T5.P;
import T5.U;
import T5.Y;
import f6.C0909B;
import f6.C0916f;
import f6.Z;
import f6.a0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import x4.d;
import x5.C1607b;

public abstract class a extends d implements Runnable, U {

    /* renamed from: V  reason: collision with root package name */
    public Z f1657V;

    public final void d() {
        Z z = this.f1657V;
        if (z != null) {
            ((a0) z).cancel(false);
            this.f1657V = null;
        }
    }

    public abstract long g();

    public abstract C1607b h();

    public abstract String i();

    public void j(Y y8) {
        K channel = y8.channel();
        long g8 = g();
        if (g8 > 0) {
            this.f1657V = ((C0916f) channel.eventLoop()).schedule((Runnable) this, g8, TimeUnit.MILLISECONDS);
        }
    }

    public final void operationComplete(C0909B b8) {
        P p3 = (P) b8;
        if (this.f16289U != null) {
            Throwable cause = p3.cause();
            if (cause == null) {
                j(this.f16289U);
            } else if (!(cause instanceof IOException)) {
                exceptionCaught(this.f16289U, cause);
            }
        }
    }

    public final void run() {
        Y y8 = this.f16289U;
        if (y8 != null) {
            K channel = y8.channel();
            if (channel.isActive()) {
                s.l(channel, h(), i());
            } else {
                s.d(channel, i());
            }
        }
    }
}
