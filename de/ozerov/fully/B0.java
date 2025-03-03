package de.ozerov.fully;

import android.content.DialogInterface;
import android.view.KeyEvent;

public final /* synthetic */ class B0 implements DialogInterface.OnKeyListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ D0 f9793U;

    public /* synthetic */ B0(D0 d02) {
        this.f9793U = d02;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        D0 d02 = this.f9793U;
        FullyActivity fullyActivity = d02.f9850f1;
        if ((fullyActivity == null || (fullyActivity.f9921J0.i() && d02.f9850f1.f9961z0.G().booleanValue())) && (i == 24 || i == 25)) {
            return true;
        }
        return false;
    }
}
