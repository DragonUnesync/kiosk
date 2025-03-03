package V0;

import B.q0;
import G5.m;
import android.media.AudioRouting;

public final /* synthetic */ class u implements AudioRouting.OnRoutingChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0 f5605a;

    public /* synthetic */ u(q0 q0Var) {
        this.f5605a = q0Var;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        q0 q0Var = this.f5605a;
        if (((u) q0Var.f302X) != null && audioRouting.getRoutedDevice() != null) {
            ((m) q0Var.f301W).o(audioRouting.getRoutedDevice());
        }
    }
}
