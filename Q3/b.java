package Q3;

import android.media.MediaPlayer;

public final /* synthetic */ class b implements MediaPlayer.OnCompletionListener {
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }
}
