package P5;

import android.content.Context;
import de.ozerov.fully.C0752p;

public final class Q extends Thread {

    /* renamed from: U  reason: collision with root package name */
    public Context f3870U;

    /* renamed from: V  reason: collision with root package name */
    public String f3871V;

    /* renamed from: W  reason: collision with root package name */
    public int f3872W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f3873X;

    public final void run() {
        try {
            Thread.sleep(((long) this.f3872W) * 1000);
        } catch (Exception unused) {
        }
        C0752p.b(this.f3870U, this.f3871V, this.f3873X, false);
    }
}
