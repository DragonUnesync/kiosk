package f1;

import android.os.Handler;
import android.os.HandlerThread;
import de.ozerov.fully.M2;
import j$.util.Objects;
import java.io.Closeable;
import java.io.OutputStream;

public final class v implements Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final OutputStream f11621U;

    /* renamed from: V  reason: collision with root package name */
    public final HandlerThread f11622V;

    /* renamed from: W  reason: collision with root package name */
    public final Handler f11623W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ w f11624X;

    public v(w wVar, OutputStream outputStream) {
        this.f11624X = wVar;
        this.f11621U = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f11622V = handlerThread;
        handlerThread.start();
        this.f11623W = new Handler(handlerThread.getLooper());
    }

    public final void close() {
        Handler handler = this.f11623W;
        HandlerThread handlerThread = this.f11622V;
        Objects.requireNonNull(handlerThread);
        handler.post(new M2(8, (Object) handlerThread));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
