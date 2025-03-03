package c1;

import B.q0;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;

public final class h implements LoudnessCodecController.OnLoudnessCodecUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0 f8793a;

    public h(q0 q0Var) {
        this.f8793a = q0Var;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((i) this.f8793a.f301W).getClass();
        return bundle;
    }
}
