package de.ozerov.fully;

import android.media.MediaPlayer;
import android.net.Uri;

public final /* synthetic */ class F4 implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K4 f9895a;

    public /* synthetic */ F4(K4 k42) {
        this.f9895a = k42;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i8) {
        K4 k42 = this.f9895a;
        k42.f10053a.setVideoURI((Uri) null);
        C0716j jVar = k42.f10060j;
        if (jVar == null) {
            return false;
        }
        jVar.a();
        return true;
    }
}
