package B3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaDrmResetException;
import android.media.PlaybackParams;

public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ AudioDeviceInfo g(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* synthetic */ AudioTrack.Builder h() {
        return new AudioTrack.Builder();
    }

    public static /* synthetic */ PlaybackParams i() {
        return new PlaybackParams();
    }

    public static /* bridge */ /* synthetic */ boolean w(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
