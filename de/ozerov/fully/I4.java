package de.ozerov.fully;

import android.media.MediaPlayer;

public final /* synthetic */ class I4 implements MediaPlayer.OnInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K4 f10014a;

    public /* synthetic */ I4(K4 k42) {
        this.f10014a = k42;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i8) {
        C4 c42;
        K4 k42 = this.f10014a;
        if (k42.i || ((i != 3 && i != 805) || k42.f10062l == null)) {
            return false;
        }
        if (k42.f10059h && (c42 = k42.f10054b) != null) {
            c42.f(2000);
        }
        k42.f10062l.c();
        k42.i = true;
        return true;
    }
}
