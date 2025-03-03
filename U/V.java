package u;

import F.h;
import j$.util.Objects;
import java.util.LinkedHashSet;

public final /* synthetic */ class V implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15559U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Y f15560V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Y f15561W;

    public /* synthetic */ V(Y y8, Y y9, int i) {
        this.f15559U = i;
        this.f15560V = y8;
        this.f15561W = y9;
    }

    public final void run() {
        switch (this.f15559U) {
            case 0:
                Y y8 = this.f15560V;
                Y y9 = this.f15561W;
                C1455O o2 = y8.f15569b;
                synchronized (o2.f15530b) {
                    ((LinkedHashSet) o2.f15531c).remove(y8);
                    ((LinkedHashSet) o2.f15532d).remove(y8);
                }
                y8.g(y9);
                if (y8.f15573g != null) {
                    Objects.requireNonNull(y8.f15572f);
                    y8.f15572f.c(y9);
                    return;
                }
                h.I("SyncCaptureSessionBase", "[" + y8 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                return;
            default:
                Y y10 = this.f15560V;
                Objects.requireNonNull(y10.f15572f);
                y10.f15572f.g(this.f15561W);
                return;
        }
    }
}
