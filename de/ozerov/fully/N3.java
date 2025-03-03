package de.ozerov.fully;

import android.media.MediaPlayer;
import n2.a;

public final /* synthetic */ class N3 implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Q3 f10163a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10164b;

    public /* synthetic */ N3(Q3 q32, boolean z) {
        this.f10163a = q32;
        this.f10164b = z;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i8) {
        Q3 q32 = this.f10163a;
        if (this.f10164b) {
            q32.b();
        } else {
            q32.getClass();
        }
        mediaPlayer.stop();
        mediaPlayer.reset();
        a.a1(1, q32.f10300f, "Failed loading sound: Wrong URL or unsupported format?");
        q32.f10298c = false;
        q32.f10299d = null;
        return true;
    }
}
