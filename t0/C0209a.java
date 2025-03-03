package T0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.bumptech.glide.manager.q;

/* renamed from: T0.a  reason: case insensitive filesystem */
public final class C0209a extends BroadcastReceiver implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final C0229v f4767U;

    /* renamed from: V  reason: collision with root package name */
    public final Handler f4768V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ q f4769W;

    public C0209a(q qVar, Handler handler, C0229v vVar) {
        this.f4769W = qVar;
        this.f4768V = handler;
        this.f4767U = vVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f4768V.post(this);
        }
    }

    public final void run() {
        if (this.f4769W.f9080V) {
            this.f4767U.f4905U.V(-1, 3, false);
        }
    }
}
