package V0;

import G5.m;
import H3.P;
import M0.C0117e;
import P0.z;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: V0.e  reason: case insensitive filesystem */
public final class C0340e extends AudioDeviceCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f5516a;

    public C0340e(m mVar) {
        this.f5516a = mVar;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        m mVar = this.f5516a;
        mVar.l(C0339d.b((Context) mVar.f1713c, (C0117e) mVar.f1718j, (P) mVar.i));
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (z.k(audioDeviceInfoArr, (P) this.f5516a.i)) {
            this.f5516a.i = null;
        }
        m mVar = this.f5516a;
        mVar.l(C0339d.b((Context) mVar.f1713c, (C0117e) mVar.f1718j, (P) mVar.i));
    }
}
