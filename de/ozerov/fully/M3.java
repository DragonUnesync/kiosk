package de.ozerov.fully;

import android.media.MediaPlayer;

public final /* synthetic */ class M3 implements MediaPlayer.OnCompletionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Q3 f10096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10097b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f10098c;

    public /* synthetic */ M3(Q3 q32, boolean z, boolean z6) {
        this.f10096a = q32;
        this.f10097b = z;
        this.f10098c = z6;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        Q3 q32 = this.f10096a;
        boolean z = this.f10097b;
        boolean z6 = this.f10098c;
        q32.getClass();
        if (z) {
            mediaPlayer.start();
            return;
        }
        if (z6) {
            q32.b();
        }
        mediaPlayer.stop();
        mediaPlayer.reset();
        q32.f10298c = false;
        q32.f10299d = null;
    }
}
