package O2;

import T2.b;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

public final class e extends b {

    /* renamed from: X  reason: collision with root package name */
    public final Handler f3621X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f3622Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f3623Z;

    /* renamed from: a0  reason: collision with root package name */
    public Bitmap f3624a0;

    public e(Handler handler, int i, long j7) {
        this.f3621X = handler;
        this.f3622Y = i;
        this.f3623Z = j7;
    }

    public final void g(Drawable drawable) {
        this.f3624a0 = null;
    }

    public final void i(Object obj) {
        this.f3624a0 = (Bitmap) obj;
        Handler handler = this.f3621X;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f3623Z);
    }
}
