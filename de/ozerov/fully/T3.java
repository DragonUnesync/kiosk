package de.ozerov.fully;

import android.app.AlertDialog;
import android.os.Handler;
import android.view.View;

public final /* synthetic */ class T3 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10361U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ W3 f10362V;

    public /* synthetic */ T3(W3 w32, int i) {
        this.f10361U = i;
        this.f10362V = w32;
    }

    public final void run() {
        switch (this.f10361U) {
            case 0:
                W3 w32 = this.f10362V;
                if (w32.f10479d == -1) {
                    FullyActivity fullyActivity = w32.f10477b;
                    if (fullyActivity.w()) {
                        C0794w0.A0(fullyActivity, w32.f10478c.Z1().booleanValue(), true);
                        new Handler().postDelayed(new T3(w32, 1), 100);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                W3 w33 = this.f10362V;
                if (w33.f10477b.w()) {
                    w33.g();
                    return;
                }
                return;
            case 2:
                W3 w34 = this.f10362V;
                int i = w34.f10479d;
                if (i == -1 || (i & 4) == 0) {
                    FullyActivity fullyActivity2 = w34.f10477b;
                    if (fullyActivity2.w()) {
                        try {
                            AlertDialog create = new AlertDialog.Builder(fullyActivity2).setMessage("").create();
                            create.getWindow().addFlags(8);
                            create.show();
                            create.dismiss();
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.f10362V.f();
                return;
            case 4:
                this.f10362V.h();
                return;
            case 5:
                W3.a(this.f10362V.f10477b);
                return;
            case 6:
                W3 w35 = this.f10362V;
                w35.f10481g = false;
                w35.j();
                return;
            case 7:
                this.f10362V.g();
                return;
            default:
                View view = this.f10362V.f10482h;
                if (view != null) {
                    view.setSystemUiVisibility(5638);
                    return;
                }
                return;
        }
    }
}
