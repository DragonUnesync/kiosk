package c1;

import D.C0043f0;
import P0.z;
import R2.c;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import n1.C1239d;

/* renamed from: c1.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0610b implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8760a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1239d f8761b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f8762c;

    public /* synthetic */ C0610b(k kVar, C1239d dVar, int i) {
        this.f8760a = i;
        this.f8762c = kVar;
        this.f8761b = dVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j8) {
        switch (this.f8760a) {
            case 0:
                C1239d dVar = this.f8761b;
                ((C0043f0) this.f8762c).getClass();
                dVar.getClass();
                if (z.f3748a < 30) {
                    Handler handler = dVar.f13576U;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j7 >> 32), (int) j7));
                    return;
                }
                dVar.a(j7);
                return;
            default:
                C1239d dVar2 = this.f8761b;
                ((c) this.f8762c).getClass();
                dVar2.getClass();
                if (z.f3748a < 30) {
                    Handler handler2 = dVar2.f13576U;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j7 >> 32), (int) j7));
                    return;
                }
                dVar2.a(j7);
                return;
        }
    }
}
