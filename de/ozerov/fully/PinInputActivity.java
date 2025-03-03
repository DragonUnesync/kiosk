package de.ozerov.fully;

import L0.c;
import Q.h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import d4.k;

public class PinInputActivity extends C0780t4 {

    /* renamed from: z0  reason: collision with root package name */
    public static final /* synthetic */ int f10261z0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public N2 f10262y0;

    public final void onCreate(Bundle bundle) {
        getTaskId();
        super.onCreate(bundle);
        k kVar = new k((Context) this, 1);
        if (kVar.S().booleanValue()) {
            C0794w0.O0(this);
        }
        if (kVar.Z().booleanValue()) {
            getWindow().addFlags(128);
        }
        String stringExtra = getIntent().getStringExtra("pinDialogHead");
        N2 n22 = new N2();
        this.f10262y0 = n22;
        n22.Q();
        N2 n23 = this.f10262y0;
        n23.f9873z1 = false;
        n23.f9863m1 = new L2(this);
        n23.f9862l1 = new L2(this);
        if (stringExtra == null) {
            stringExtra = getString(2131951684);
        }
        n23.f9865o1 = stringExtra;
        if (!h.f4003X) {
            this.f10262y0.f9866p1 = getString(2131951675, new Object[]{kVar.d0()});
        }
        this.f10262y0.T(l(), "PINdialog");
        c.a(this).c(new Intent("com.fullykiosk.singleapp.event.pin_dialog_show"));
    }

    public final void onDestroy() {
        N2 n22 = this.f10262y0;
        if (n22 != null) {
            n22.S();
            this.f10262y0 = null;
        }
        c.a(this).c(new Intent("com.fullykiosk.singleapp.event.pin_dialog_hide"));
        super.onDestroy();
    }
}
