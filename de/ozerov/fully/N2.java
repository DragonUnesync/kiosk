package de.ozerov.fully;

import android.os.Handler;

public class N2 extends E {

    /* renamed from: A1  reason: collision with root package name */
    public Handler f10162A1;

    public N2() {
        this.t1 = 2131558496;
        this.f9869u1 = 2131362376;
        this.f9870v1 = 370.0f;
    }

    public final void A() {
        Handler handler = this.f10162A1;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f10162A1 = null;
        }
        super.A();
    }

    public final void D() {
        super.D();
        Handler handler = this.f10162A1;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f10162A1 = null;
        }
        Handler handler2 = new Handler();
        this.f10162A1 = handler2;
        handler2.postDelayed(new M2(0, (Object) this), 20000);
    }

    public final void G() {
        Handler handler = this.f10162A1;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f10162A1 = null;
        }
        super.G();
    }

    public final void S() {
        super.S();
        Handler handler = this.f10162A1;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f10162A1 = null;
        }
    }
}
