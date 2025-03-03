package org.acra.interaction;

import N7.a;
import P6.f;
import R.e;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import org.acra.plugins.HasConfigPlugin;
import r7.C1395d;
import r7.p;
import r7.s;

public class ToastInteraction extends HasConfigPlugin implements ReportInteraction {
    public ToastInteraction() {
        super(s.class);
    }

    private int getLengthInMs(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 3500;
        }
        return 2000;
    }

    /* access modifiers changed from: private */
    public static final void performInteraction$lambda$0(Looper looper) {
        looper.quitSafely();
    }

    public boolean performInteraction(Context context, C1395d dVar, File file) {
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(file, "reportFile");
        Looper.prepare();
        s sVar = (s) a.k(dVar, s.class);
        String str = sVar.f15070V;
        int i = sVar.f15071W;
        e.s(i, context, str);
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            return true;
        }
        new Handler(myLooper).postDelayed(new p(myLooper, 1), ((long) getLengthInMs(i)) + 100);
        Looper.loop();
        return true;
    }
}
