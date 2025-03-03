package de.ozerov.fully;

import android.media.MediaPlayer;
import n2.a;

public final /* synthetic */ class O3 implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10224a;

    public /* synthetic */ O3(boolean z) {
        this.f10224a = z;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (a.y0()) {
            mediaPlayer.setLooping(this.f10224a);
        }
        mediaPlayer.start();
    }
}
