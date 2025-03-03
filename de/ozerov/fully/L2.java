package de.ozerov.fully;

import L0.c;
import android.content.Intent;

public final /* synthetic */ class L2 implements C, D {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ PinInputActivity f10075U;

    public /* synthetic */ L2(PinInputActivity pinInputActivity) {
        this.f10075U = pinInputActivity;
    }

    public void c() {
        int i = PinInputActivity.f10261z0;
        PinInputActivity pinInputActivity = this.f10075U;
        pinInputActivity.getClass();
        try {
            Intent intent = new Intent("com.fullykiosk.singleapp.action.put_pin");
            intent.putExtra("resultCode", 0);
            c.a(pinInputActivity).c(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        pinInputActivity.f10262y0 = null;
        pinInputActivity.finish();
    }

    public void i(String str) {
        int i = PinInputActivity.f10261z0;
        PinInputActivity pinInputActivity = this.f10075U;
        pinInputActivity.getClass();
        try {
            Intent intent = new Intent("com.fullykiosk.singleapp.action.put_pin");
            intent.putExtra("resultCode", -1);
            intent.putExtra("pin", str);
            c.a(pinInputActivity).c(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        pinInputActivity.f10262y0 = null;
        pinInputActivity.finish();
    }
}
