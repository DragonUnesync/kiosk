package de.ozerov.fully;

import Z1.c;
import android.widget.SeekBar;
import android.widget.TextView;

/* renamed from: de.ozerov.fully.y4  reason: case insensitive filesystem */
public final class C0810y4 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4 f11118a;

    public C0810y4(C4 c42) {
        this.f11118a = c42;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C4 c42 = this.f11118a;
        A4 a42 = c42.f9812U;
        if (a42 != null && z) {
            int duration = (int) ((((long) ((K4) ((c) a42).f6955V).f10053a.getDuration()) * ((long) i)) / 1000);
            ((K4) ((c) c42.f9812U).f6955V).f10053a.seekTo(duration);
            TextView textView = c42.f9818d0;
            if (textView != null) {
                textView.setText(c42.g(duration));
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        C4 c42 = this.f11118a;
        c42.f(3600000);
        c42.f9820f0 = true;
        c42.f9829o0.removeMessages(2);
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C4 c42 = this.f11118a;
        c42.f9820f0 = false;
        c42.e();
        c42.h();
        c42.f(3000);
        c42.f9829o0.sendEmptyMessage(2);
    }
}
