package c1;

import D.C0043f0;
import G3.i;
import android.os.HandlerThread;

/* renamed from: c1.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0611c implements i {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f8763U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f8764V;

    public /* synthetic */ C0611c(int i, int i8) {
        this.f8763U = i8;
        this.f8764V = i;
    }

    public final Object get() {
        switch (this.f8763U) {
            case 0:
                return new HandlerThread(C0043f0.e(this.f8764V, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C0043f0.e(this.f8764V, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
