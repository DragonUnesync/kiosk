package de.ozerov.fully;

import L0.c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import d4.k;

public class WifiSelectorActivity extends C0780t4 {

    /* renamed from: y0  reason: collision with root package name */
    public m5 f10489y0;

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
        m5 m5Var = new m5();
        this.f10489y0 = m5Var;
        m5Var.f9863m1 = new k5(this);
        m5Var.f9862l1 = new k5(this);
        m5Var.T(l(), "WifiSelectorDialog");
        c.a(this).c(new Intent("com.fullykiosk.singleapp.event.wifi_dialog_show"));
    }

    public final void onDestroy() {
        m5 m5Var = this.f10489y0;
        if (m5Var != null) {
            m5Var.S();
            this.f10489y0 = null;
        }
        c.a(this).c(new Intent("com.fullykiosk.singleapp.event.wifi_dialog_hide"));
        super.onDestroy();
    }
}
