package P0;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class x implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
