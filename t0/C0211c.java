package T0;

import A3.c;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: T0.c  reason: case insensitive filesystem */
public final class C0211c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f4781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0212d f4782b;

    public C0211c(C0212d dVar, Handler handler) {
        this.f4782b = dVar;
        this.f4781a = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f4781a.post(new c(i, 4, (Object) this));
    }
}
