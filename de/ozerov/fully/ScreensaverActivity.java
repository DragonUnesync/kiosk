package de.ozerov.fully;

import B3.n;
import B3.q;
import L0.c;
import N5.f;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;
import d4.k;

public class ScreensaverActivity extends C0780t4 {

    /* renamed from: A0  reason: collision with root package name */
    public final f f10343A0 = new f(9, this);

    /* renamed from: y0  reason: collision with root package name */
    public k f10344y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f10345z0 = false;

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.toString();
        keyEvent.toString();
        if (isFinishing()) {
            return true;
        }
        finish();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10344y0 = new k((Context) this, 1);
        Intent intent = getIntent();
        if (!(intent == null || intent.getExtras() == null)) {
            this.f10345z0 = intent.getBooleanExtra("isKioskLocked", false);
        }
        setContentView(2131558432);
        C0794w0.O0(this);
        getWindow().addFlags(128);
        C0794w0.A0(this, false, false);
        q.s0(this, true, true);
        if (!y("screensaver")) {
            A(2131362441, new C0779t3(), "screensaver");
        }
        System.currentTimeMillis();
        c.a(this).b(this.f10343A0, new IntentFilter("com.fullykiosk.singleapp.action.stop_screensaver"));
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new C0672b3(1, this));
        if (C0813z1.f11119p1) {
            n f8 = n.f(findViewById(16908290), "Fully is using local files on shared storage. This needs your urgent attention!", -2);
            TextView textView = (TextView) f8.i.findViewById(2131362492);
            textView.setCompoundDrawablesWithIntrinsicBounds(2131231013, 0, 0, 0);
            textView.setCompoundDrawablePadding(getResources().getDimensionPixelOffset(2131166031));
            f8.h();
        }
    }

    public final void onDestroy() {
        c.a(this).d(this.f10343A0);
        getWindow().clearFlags(128);
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        isFinishing();
        if (this.f10345z0 && !isFinishing() && getTaskId() != -1) {
            try {
                ((ActivityManager) getApplicationContext().getSystemService("activity")).moveTaskToFront(getTaskId(), 2);
                Log.w("ScreensaverActivity", "Push screensaver to the front");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void onUserInteraction() {
        super.onUserInteraction();
        if (!isFinishing()) {
            finish();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (!z && this.f10345z0 && this.f10344y0.E().booleanValue()) {
            W3.a(this);
        }
    }
}
