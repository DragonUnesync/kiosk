package n1;

import P0.l;
import P0.z;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

public final class t implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public static final t f13678Y = new t();

    /* renamed from: U  reason: collision with root package name */
    public volatile long f13679U = -9223372036854775807L;

    /* renamed from: V  reason: collision with root package name */
    public final Handler f13680V;

    /* renamed from: W  reason: collision with root package name */
    public Choreographer f13681W;

    /* renamed from: X  reason: collision with root package name */
    public int f13682X;

    public t() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = z.f3748a;
        Handler handler = new Handler(looper, this);
        this.f13680V = handler;
        handler.sendEmptyMessage(1);
    }

    public final void doFrame(long j7) {
        this.f13679U = j7;
        Choreographer choreographer = this.f13681W;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f13681W = Choreographer.getInstance();
            } catch (RuntimeException e) {
                l.C("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        } else if (i == 2) {
            Choreographer choreographer = this.f13681W;
            if (choreographer != null) {
                int i8 = this.f13682X + 1;
                this.f13682X = i8;
                if (i8 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Choreographer choreographer2 = this.f13681W;
            if (choreographer2 != null) {
                int i9 = this.f13682X - 1;
                this.f13682X = i9;
                if (i9 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f13679U = -9223372036854775807L;
                }
            }
            return true;
        }
    }
}
