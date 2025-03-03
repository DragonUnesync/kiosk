package de.ozerov.fully;

import android.media.MediaPlayer;
import android.view.ViewGroup;
import android.widget.VideoView;
import n2.a;

public final /* synthetic */ class H4 implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K4 f10002a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f10003b;

    public /* synthetic */ H4(K4 k42, ViewGroup viewGroup) {
        this.f10002a = k42;
        this.f10003b = viewGroup;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        String str;
        K4 k42 = this.f10002a;
        VideoView videoView = k42.f10053a;
        videoView.getCurrentPosition();
        videoView.isPlaying();
        if (a.y0()) {
            mediaPlayer.setLooping(k42.f10058g);
        }
        if (k42.f10059h) {
            ViewGroup viewGroup = this.f10003b;
            C4 c42 = new C4(viewGroup.getContext());
            k42.f10054b = c42;
            c42.setMediaPlayer(k42.f10065o);
            k42.f10054b.setAnchorView(viewGroup);
            k42.f10054b.f(3000);
        }
        if (!k42.i && k42.f10062l != null && (str = k42.f10057f) != null && str.toLowerCase().endsWith(".mp3")) {
            k42.f10062l.c();
            k42.i = true;
        }
    }
}
