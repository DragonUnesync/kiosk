package c7;

import Q5.a;
import Z6.b;
import d7.C0659d;
import java.net.Socket;
import l7.d;

public final class g extends d {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ h f8922m;

    public g(h hVar) {
        this.f8922m = hVar;
    }

    public final void j() {
        Socket socket;
        h hVar = this.f8922m;
        if (!hVar.f8935g0) {
            hVar.f8935g0 = true;
            a aVar = hVar.f8936h0;
            if (aVar != null) {
                ((C0659d) aVar.f4125d).cancel();
            }
            j jVar = hVar.f8937i0;
            if (jVar != null && (socket = jVar.f8940c) != null) {
                b.d(socket);
            }
        }
    }
}
