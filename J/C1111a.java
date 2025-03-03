package j;

import D7.b;
import android.graphics.drawable.Animatable;
import h2.C1065f;

/* renamed from: j.a  reason: case insensitive filesystem */
public final class C1111a extends b {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12763U;

    /* renamed from: V  reason: collision with root package name */
    public final Animatable f12764V;

    public /* synthetic */ C1111a(Animatable animatable, int i) {
        this.f12763U = i;
        this.f12764V = animatable;
    }

    public final void N() {
        switch (this.f12763U) {
            case 0:
                this.f12764V.start();
                return;
            default:
                ((C1065f) this.f12764V).start();
                return;
        }
    }

    public final void O() {
        switch (this.f12763U) {
            case 0:
                this.f12764V.stop();
                return;
            default:
                ((C1065f) this.f12764V).stop();
                return;
        }
    }
}
