package androidx.media3.exoplayer.rtsp;

import K1.i;
import M0.C;
import a1.C0410a;
import f1.s;
import h1.C1030A;
import h1.C1035a;
import javax.net.SocketFactory;

public final class RtspMediaSource$Factory implements C1030A {

    /* renamed from: a  reason: collision with root package name */
    public final SocketFactory f8204a = SocketFactory.getDefault();

    public final C1030A a(boolean z) {
        return this;
    }

    public final C1035a b(C c8) {
        c8.f2786b.getClass();
        return new s(c8, new C0410a(26), this.f8204a);
    }

    public final C1030A c(i iVar) {
        return this;
    }
}
