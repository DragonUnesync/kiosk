package Q3;

import android.media.MediaPlayer;
import android.util.Log;

public final /* synthetic */ class c implements MediaPlayer.OnErrorListener {
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i8) {
        Log.w("G", "Failed to beep " + i + ", " + i8);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }
}
