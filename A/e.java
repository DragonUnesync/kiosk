package A;

import D.C0036c;
import D.C0041e0;
import D.J;
import F.i;
import L0.c;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import d4.k;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.I2;
import n2.a;
import u.C1467h;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f12c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13d;
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f14f;

    /* renamed from: g  reason: collision with root package name */
    public Object f15g;

    public e(FullyActivity fullyActivity) {
        this.f10a = false;
        this.f11b = false;
        I2 i22 = new I2(this, 0);
        this.e = i22;
        I2 i23 = new I2(this, 1);
        this.f14f = i23;
        I2 i24 = new I2(this, 2);
        this.f15g = i24;
        this.f12c = fullyActivity;
        this.f13d = new k((Context) fullyActivity, 1);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.fullykiosk.singleapp.event.headphones_plug");
        intentFilter.addAction("com.fullykiosk.singleapp.event.headphones_unplug");
        c.a(fullyActivity).b(i22, intentFilter);
        c.a(fullyActivity).b(i23, new IntentFilter("com.fullykiosk.singleapp.event.alarm_sound_start"));
        c.a(fullyActivity).b(i24, new IntentFilter("com.fullykiosk.singleapp.event.alarm_sound_stop"));
    }

    public void a(h hVar) {
        synchronized (this.e) {
            C0041e0 e0Var = ((h) this.f14f).f22b;
            J j7 = J.f796U;
            for (C0036c cVar : e0Var.J()) {
                hVar.f22b.d(cVar, j7, e0Var.b0(cVar));
            }
        }
    }

    public void b() {
        k kVar = (k) this.f13d;
        if (((Z1.c) kVar.f9767W).n("phoneSpeaker", false)) {
            FullyActivity fullyActivity = (FullyActivity) this.f12c;
            if (!((AudioManager) fullyActivity.getSystemService("audio")).isWiredHeadsetOn() && (!this.f11b || !((Z1.c) kVar.f9767W).n("playAlarmSoundMainSpeaker", true))) {
                if (!this.f10a) {
                    AudioManager audioManager = (AudioManager) fullyActivity.getSystemService("audio");
                    audioManager.setMode(3);
                    if (a.r0()) {
                        C0794w0.y0(fullyActivity, 1);
                    } else {
                        audioManager.setSpeakerphoneOn(false);
                    }
                    this.f10a = true;
                    return;
                }
                return;
            }
        }
        c();
    }

    public void c() {
        if (this.f10a) {
            FullyActivity fullyActivity = (FullyActivity) this.f12c;
            AudioManager audioManager = (AudioManager) fullyActivity.getSystemService("audio");
            audioManager.setMode(0);
            if (a.r0()) {
                C0794w0.y0(fullyActivity, 2);
            } else {
                audioManager.setSpeakerphoneOn(true);
            }
            this.f10a = false;
        }
    }

    public e(C1467h hVar, i iVar) {
        this.f10a = false;
        this.f11b = false;
        this.e = new Object();
        this.f14f = new h(4);
        this.f12c = hVar;
        this.f13d = iVar;
    }
}
