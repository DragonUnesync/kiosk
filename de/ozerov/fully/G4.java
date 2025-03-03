package de.ozerov.fully;

import T0.C0232y;
import android.media.MediaPlayer;

public final /* synthetic */ class G4 implements MediaPlayer.OnCompletionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K4 f9980a;

    public /* synthetic */ G4(K4 k42) {
        this.f9980a = k42;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C0716j jVar = this.f9980a.f10061k;
        if (jVar != null) {
            C0740n nVar = jVar.f10729a;
            if (nVar.f10833q) {
                K4 k42 = nVar.f10821c;
                if (k42.e == 1) {
                    k42.f10053a.seekTo((int) 0);
                } else {
                    C0232y yVar = k42.f10055c;
                    yVar.getClass();
                    yVar.k(0, yVar.v(), false);
                }
                k42.d();
            } else if (nVar.f10837u) {
                nVar.p();
            }
        }
    }
}
